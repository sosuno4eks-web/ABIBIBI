package su.catlean.mixins.render;

import net.minecraft.class_10090;
import net.minecraft.class_11659;
import net.minecraft.class_330;
import net.minecraft.class_4587;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.MapRenderEvent;

@Mixin({class_330.class})
public class MapRendererMixin {
   @Inject(
      method = {"method_1773"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void drawHook(class_10090 state, class_4587 matrices, class_11659 queue, boolean bl, int light, CallbackInfo ci) {
      if (bl && MapRenderEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }
}
