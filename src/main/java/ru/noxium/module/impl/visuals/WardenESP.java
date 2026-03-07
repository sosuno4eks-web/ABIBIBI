package ru.noxium.module.impl.visuals;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderSetup;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.WardenEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
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

@IModule(name = "Warden ESP", description = "Highlights Wardens with distinct visuals", category = Category.Visuals, bind = -1)
@Environment(EnvType.CLIENT)
public class WardenESP extends Module {
    
    // Settings
    public static BooleanSetting showBox = new BooleanSetting("Show Box", true);
    public static SliderSetting maxDistance = new SliderSetting("Max Distance", 64.0f, 16.0f, 256.0f, 1.0f, false);
    
    // Warden-specific color (Bright Purple)
    private static final int WARDEN_COLOR = 0xFFA020F0; // Purple
    private static final int WARDEN_ANGRY_COLOR = 0xFFFF0000; // Red when angry
    
    // Render pipelines
    private static final RenderPipeline BOX_FILL_PIPELINE = RenderPipelines.register(
        RenderPipeline.builder(new Snippet[] { RenderPipelines.POSITION_COLOR_SNIPPET })
            .withLocation(Identifier.of("minecraft", "rendertype_lequal_depth_test"))
            .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
            .withCull(false)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withBlend(BlendFunction.LIGHTNING)
            .build());
    
    private static final RenderPipeline BOX_LINE_PIPELINE = RenderPipelines.register(
        RenderPipeline.builder(new Snippet[] { RenderPipelines.POSITION_COLOR_SNIPPET })
            .withLocation(Identifier.of("minecraft", "rendertype_lines"))
            .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.DEBUG_LINES)
            .withCull(false)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withBlend(BlendFunction.LIGHTNING)
            .build());
    
    private static final RenderLayer BOX_FILL_LAYER = RenderLayer.of(
        "noxium_warden_esp_box_fill",
        RenderSetup.builder(BOX_FILL_PIPELINE)
            .expectedBufferSize(1024)
            .translucent()
            .build());
    
    private static final RenderLayer BOX_LINE_LAYER = RenderLayer.of(
        "noxium_warden_esp_box_line",
        RenderSetup.builder(BOX_LINE_PIPELINE)
            .expectedBufferSize(1024)
            .translucent()
            .build());

    public WardenESP() {
        this.addSettings(new Setting[] { showBox, maxDistance });
    }

    @EventInit
    public void render(EventRender3D event) {
        if (mc.world == null || mc.player == null) {
            return;
        }

        BufferAllocator allocator = new BufferAllocator(262144);
        Immediate immediate = VertexConsumerProvider.immediate(allocator);

        try {
            // Find all Wardens in the world
            for (Entity entity : mc.world.getEntities()) {
                if (entity instanceof WardenEntity warden) {
                    double distance = mc.player.distanceTo(warden);
                    
                    // Check distance limit
                    if (distance <= maxDistance.get()) {
                        if (showBox.get()) {
                            renderWardenBox(event.getMatrixStack(), immediate, warden, event.getTickDelta());
                        }
                    }
                }
            }

            immediate.draw();
        } finally {
            allocator.close();
        }
    }





    private void renderWardenBox(MatrixStack matrices, Immediate immediate, WardenEntity warden, float partialTicks) {
        Vec3d cameraPos = mc.gameRenderer.getCamera().getCameraPos();
        
        // Interpolated position
        double x = warden.lastRenderX + (warden.getX() - warden.lastRenderX) * partialTicks;
        double y = warden.lastRenderY + (warden.getY() - warden.lastRenderY) * partialTicks;
        double z = warden.lastRenderZ + (warden.getZ() - warden.lastRenderZ) * partialTicks;
        
        Box boundingBox = warden.getBoundingBox();
        double padding = 0.1;
        
        double minX = boundingBox.minX - warden.getX() + x - padding - cameraPos.x;
        double minY = boundingBox.minY - warden.getY() + y - padding - cameraPos.y;
        double minZ = boundingBox.minZ - warden.getZ() + z - padding - cameraPos.z;
        double maxX = boundingBox.maxX - warden.getX() + x + padding - cameraPos.x;
        double maxY = boundingBox.maxY - warden.getY() + y + padding - cameraPos.y;
        double maxZ = boundingBox.maxZ - warden.getZ() + z + padding - cameraPos.z;
        
        // Determine color based on Warden's state
        int baseColor = getWardenColor(warden);
        
        // Create gradient colors for the box
        int color1 = ColorUtil.multDark(baseColor, 0.8F);
        int color2 = ColorUtil.multDark(baseColor, 1.0F);
        int color3 = ColorUtil.multDark(baseColor, 0.8F);
        int color4 = ColorUtil.multDark(baseColor, 1.0F);
        
        int[] gradientColors = new int[] {
            ColorUtil.gradient(color1, color2, 0, 7),
            ColorUtil.gradient(color2, color3, 90, 7),
            ColorUtil.gradient(color3, color4, 180, 7),
            ColorUtil.gradient(color4, color1, 270, 7)
        };
        
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        
        // Draw filled box
        VertexConsumer fillBuffer = immediate.getBuffer(BOX_FILL_LAYER);
        WorldRenderUtil.drawBoxFill(fillBuffer, matrix, minX, minY, minZ, maxX, maxY, maxZ, gradientColors, 100);
        
        // Draw outline with thicker lines
        VertexConsumer lineBuffer = immediate.getBuffer(BOX_LINE_LAYER);
        WorldRenderUtil.drawBoxOutline(lineBuffer, matrix, minX, minY, minZ, maxX, maxY, maxZ, gradientColors, 255, 0.2, 0.1);
    }

    private int getWardenColor(WardenEntity warden) {
        // Check if Warden has a target (is angry)
        if (warden.getTarget() != null) {
            return WARDEN_ANGRY_COLOR; // Red when targeting
        }
        return WARDEN_COLOR; // Default purple
    }


}
