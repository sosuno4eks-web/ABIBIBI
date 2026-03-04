package ru.noxium.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.noxium.Noxium;
import ru.noxium.module.impl.visuals.AntiInvisible;

/**
 * Mixin to handle Anti-Invisible functionality
 * Makes invisible entities visible
 */
@Environment(EnvType.CLIENT)
@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererMixin {

    /**
     * Modify the render state to override invisibility
     * This is called when the entity's render state is being updated
     */
    @Inject(
        method = "updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V",
        at = @At("RETURN")
    )
    private void onUpdateRenderState(LivingEntity entity, LivingEntityRenderState state, float tickDelta, CallbackInfo ci) {
        if (Noxium.get != null && Noxium.get.manager != null) {
            AntiInvisible antiInvisible = Noxium.get.manager.get(AntiInvisible.class);
            
            if (antiInvisible != null && antiInvisible.enable && entity.isInvisible()) {
                // Check if "Players Only" filter is enabled
                if (AntiInvisible.playersOnly.get()) {
                    // Only affect player entities
                    if (entity instanceof net.minecraft.entity.player.PlayerEntity) {
                        // Override the invisible flag to make entity visible
                        state.invisible = false;
                    }
                } else {
                    // Affect all living entities
                    state.invisible = false;
                }
            }
        }
    }
}
