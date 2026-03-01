package su.catlean.mixins.client;

import net.minecraft.class_839;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.RenderSpawnerEntityEvent;

@Mixin({class_839.class})
public class SpawnerRendererMixin {
   @Inject(
      method = {"method_3589(Lnet/minecraft/class_11973;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_12075;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void renderHook(CallbackInfo ci) {
      if (RenderSpawnerEntityEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }
}
