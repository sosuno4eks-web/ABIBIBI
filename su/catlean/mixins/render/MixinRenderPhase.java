package su.catlean.mixins.render;

import net.minecraft.class_12246;
import net.minecraft.class_276;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.render.FrameBufferEvent;

@Mixin({class_12246.class})
public class MixinRenderPhase {
   @Inject(
      method = {"method_75921()Lnet/minecraft/class_276;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getHook(CallbackInfoReturnable<class_276> cir) {
      if (GofraState.INSTANCE.getModifyBuffer() && FrameBufferEvent.INSTANCE.call()) {
         cir.setReturnValue(FrameBufferEvent.INSTANCE.getFrameBuffer());
         cir.cancel();
      }

   }
}
