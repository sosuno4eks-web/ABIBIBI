package su.catlean.mixins.render;

import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_4587;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.RenderNameTagEvent;

@Mixin({class_1007.class})
public class AvatarRendererMixin {
   @Inject(
      method = {"method_4213(Lnet/minecraft/class_10055;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_12075;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderLabelIfPresent(class_10055 playerEntityRenderState, class_4587 matrixStack, class_11659 orderedRenderCommandQueue, class_12075 cameraRenderState, CallbackInfo ci) {
      if (RenderNameTagEvent.INSTANCE.call(playerEntityRenderState)) {
         ci.cancel();
      }

   }
}
