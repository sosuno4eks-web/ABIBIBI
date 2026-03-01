package su.catlean.mixins.render;

import net.minecraft.class_10014;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_4587;
import net.minecraft.class_892;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.render.CrystalRenderEvent;
import su.catlean.api.event.events.render.CrystalYOffsetEvent;
import su.catlean.api.event.events.render.SetCrystalScaleEvent;

@Mixin({class_892.class})
public class EndCrystalRendererMixin {
   @Inject(
      method = {"method_3908(Lnet/minecraft/class_10014;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_12075;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderHook(class_10014 endCrystalEntityRenderState, class_4587 matrixStack, class_11659 orderedRenderCommandQueue, class_12075 cameraRenderState, CallbackInfo ci) {
      if (CrystalRenderEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_3908(Lnet/minecraft/class_10014;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_12075;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_4587;method_22905(FFF)V"
)}
   )
   private void scaleHook(class_10014 endCrystalEntityRenderState, class_4587 matrixStack, class_11659 orderedRenderCommandQueue, class_12075 cameraRenderState, CallbackInfo ci) {
      if (SetCrystalScaleEvent.INSTANCE.call(endCrystalEntityRenderState.field_53328)) {
         float scale = SetCrystalScaleEvent.INSTANCE.getScale();
         matrixStack.method_22905(scale, scale, scale);
      }

   }

   @Inject(
      method = {"method_23155"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void getYOffsetHook(float age, CallbackInfoReturnable<Float> cir) {
      if (CrystalYOffsetEvent.INSTANCE.call(age)) {
         cir.setReturnValue(CrystalYOffsetEvent.INSTANCE.getOffset());
      }

   }
}
