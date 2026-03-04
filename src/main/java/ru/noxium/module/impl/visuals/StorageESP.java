package ru.noxium.module.impl.visuals;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.entity.TrappedChestBlockEntity;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderSetup;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import ru.noxium.event.EventInit;
import ru.noxium.event.render.EventRender3D;
import ru.noxium.module.api.Category;
import ru.noxium.module.api.IModule;
import ru.noxium.module.api.Module;
import ru.noxium.module.api.setting.Setting;
import ru.noxium.module.api.setting.impl.BooleanSetting;
import ru.noxium.module.api.setting.impl.SliderSetting;
import ru.noxium.util.color.ColorUtil;
import ru.noxium.util.render.world.WorldRenderUtil;

/**
 * Storage ESP - Highlights all storage containers through walls
 * Optimized for Minecraft 1.21.11
 */
@IModule(
    name = "Storage ESP",
    description = "Highlights chests, shulkers, barrels, and ender chests",
    category = Category.Visuals,
    bind = -1
)
@Environment(EnvType.CLIENT)
public class StorageESP extends Module {
    
    // Settings
    public BooleanSetting shulkers = new BooleanSetting("Shulkers", true);
    public BooleanSetting chests = new BooleanSetting("Chests", true);
    public BooleanSetting enderChests = new BooleanSetting("Ender Chests", true);
    public BooleanSetting barrels = new BooleanSetting("Barrels", true);
    public SliderSetting range = new SliderSetting("Range", 128.0F, 16.0F, 256.0F, 16.0F, false);
    
    // Render pipelines with NO_DEPTH_TEST for through-wall rendering
    private static final RenderPipeline BOX_FILL_PIPELINE = RenderPipelines.register(
        RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
            .withLocation(Identifier.of("minecraft", "rendertype_lequal_depth_test"))
            .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
            .withCull(false)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withBlend(BlendFunction.LIGHTNING)
            .build()
    );
    
    private static final RenderPipeline BOX_LINE_PIPELINE = RenderPipelines.register(
        RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
            .withLocation(Identifier.of("minecraft", "rendertype_lines"))
            .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.DEBUG_LINES)
            .withCull(false)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withBlend(BlendFunction.LIGHTNING)
            .build()
    );
    
    private static final RenderLayer BOX_FILL_LAYER = RenderLayer.of(
        "noxium_storage_esp_fill",
        RenderSetup.builder(BOX_FILL_PIPELINE)
            .expectedBufferSize(1024)
            .translucent()
            .build()
    );
    
    private static final RenderLayer BOX_LINE_LAYER = RenderLayer.of(
        "noxium_storage_esp_line",
        RenderSetup.builder(BOX_LINE_PIPELINE)
            .expectedBufferSize(1024)
            .translucent()
            .build()
    );
    
    // Colors for different storage types
    private static final int COLOR_SHULKER = 0xFF00FF;   // Purple
    private static final int COLOR_CHEST = 0xFFFF00;     // Yellow
    private static final int COLOR_ENDER = 0x00FFFF;     // Cyan
    private static final int COLOR_BARREL = 0xFFA500;    // Orange
    
    public StorageESP() {
        this.addSettings(new Setting[]{shulkers, chests, enderChests, barrels, range});
    }
    
    @EventInit
    public void render(EventRender3D event) {
        if (mc.world == null || mc.player == null) {
            return;
        }
        
        BufferAllocator allocator = new BufferAllocator(262144);
        VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate(allocator);
        
        try {
            Vec3d cameraPos = mc.gameRenderer.getCamera().getCameraPos();
            float maxRange = range.get();
            float maxRangeSq = maxRange * maxRange;
            
            // Calculate chunk range based on max range
            int chunkRange = (int) Math.ceil(maxRange / 16.0);
            int playerChunkX = mc.player.getChunkPos().x;
            int playerChunkZ = mc.player.getChunkPos().z;
            
            // Iterate through chunks in range
            for (int chunkX = playerChunkX - chunkRange; chunkX <= playerChunkX + chunkRange; chunkX++) {
                for (int chunkZ = playerChunkZ - chunkRange; chunkZ <= playerChunkZ + chunkRange; chunkZ++) {
                    net.minecraft.world.chunk.WorldChunk chunk = mc.world.getChunk(chunkX, chunkZ);
                    if (chunk == null) {
                        continue;
                    }
                    
                    // Iterate through block entities in this chunk
                    for (BlockEntity blockEntity : chunk.getBlockEntities().values()) {
                        if (blockEntity == null) {
                            continue;
                        }
                        
                        BlockPos pos = blockEntity.getPos();
                        
                        // Distance check for performance
                        double distSq = cameraPos.squaredDistanceTo(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5);
                        if (distSq > maxRangeSq) {
                            continue;
                        }
                        
                        // Check block entity type and render
                        Integer color = getColorForBlockEntity(blockEntity);
                        if (color != null) {
                            renderStorageBox(event.getMatrixStack(), immediate, pos, cameraPos, color);
                        }
                    }
                }
            }
            
            immediate.draw();
        } finally {
            allocator.close();
        }
    }
    
    /**
     * Get the color for a block entity based on its type
     * Returns null if the block entity should not be rendered
     */
    private Integer getColorForBlockEntity(BlockEntity blockEntity) {
        if (shulkers.get() && blockEntity instanceof ShulkerBoxBlockEntity) {
            return COLOR_SHULKER;
        } else if (chests.get() && (blockEntity instanceof ChestBlockEntity || blockEntity instanceof TrappedChestBlockEntity)) {
            return COLOR_CHEST;
        } else if (enderChests.get() && blockEntity instanceof EnderChestBlockEntity) {
            return COLOR_ENDER;
        } else if (barrels.get() && blockEntity instanceof BarrelBlockEntity) {
            return COLOR_BARREL;
        }
        return null;
    }
    
    /**
     * Render a 3D box around a storage block
     */
    private void renderStorageBox(MatrixStack matrices, VertexConsumerProvider.Immediate immediate, 
                                   BlockPos pos, Vec3d cameraPos, int baseColor) {
        // Calculate box coordinates relative to camera
        double minX = pos.getX() - cameraPos.x;
        double minY = pos.getY() - cameraPos.y;
        double minZ = pos.getZ() - cameraPos.z;
        double maxX = minX + 1.0;
        double maxY = minY + 1.0;
        double maxZ = minZ + 1.0;
        
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        
        // Create color array with the base color
        int fillColor = ColorUtil.reAlphaInt(baseColor, 51);  // 0.2f alpha = 51/255
        int lineColor = ColorUtil.reAlphaInt(baseColor, 204); // 0.8f alpha = 204/255
        
        int[] fillColors = new int[]{fillColor, fillColor, fillColor, fillColor};
        int[] lineColors = new int[]{lineColor, lineColor, lineColor, lineColor};
        
        // Draw semi-transparent fill
        VertexConsumer fillBuffer = immediate.getBuffer(BOX_FILL_LAYER);
        WorldRenderUtil.drawBoxFill(fillBuffer, matrix, minX, minY, minZ, maxX, maxY, maxZ, fillColors, 51);
        
        // Draw bright outline
        VertexConsumer lineBuffer = immediate.getBuffer(BOX_LINE_LAYER);
        WorldRenderUtil.drawBoxOutline(lineBuffer, matrix, minX, minY, minZ, maxX, maxY, maxZ, lineColors, 204, 0.15, 0.08);
    }
}
