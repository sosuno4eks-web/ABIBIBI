package su.catlean.mixins.render;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import net.minecraft.class_1309;
import net.minecraft.class_3695;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.render.DarknessEffectEvent;
import su.catlean.api.event.events.render.LightMapUpdateEvent;

@Mixin({class_765.class})
public class LightTextureMixin {
   @Final
   @Shadow
   private GpuTexture field_57927;

   @Inject(
      method = {"method_42596"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getDarknessHook(class_1309 entity, float factor, float tickProgress, CallbackInfoReturnable<Float> cir) {
      if (DarknessEffectEvent.INSTANCE.call()) {
         cir.setReturnValue(0.0F);
      }

   }

   @Inject(
      method = {"method_3313"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_3695;method_15396(Ljava/lang/String;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void updateHook(float tickProgress, CallbackInfo ci, @Local class_3695 profiler) {
      if (LightMapUpdateEvent.INSTANCE.call()) {
         RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.field_57927, -1);
         profiler.method_15407();
         ci.cancel();
      }

   }
}
