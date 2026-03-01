package su.catlean.mixins.client;

import net.minecraft.class_10529;
import net.minecraft.class_11659;
import net.minecraft.class_11971;
import net.minecraft.class_4587;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.SignTextRenderEvent;

@Mixin({class_10529.class})
public class AbstractSignRendererMixin {
   @Inject(
      method = {"method_65828"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public final void renderTextHook(class_11971 renderState, class_4587 matrices, class_11659 queue, boolean front, CallbackInfo ci) {
      if (SignTextRenderEvent.INSTANCE.call(renderState.field_62673)) {
         ci.cancel();
      }

   }
}
