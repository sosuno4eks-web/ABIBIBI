package su.catlean.mixins.client;

import net.minecraft.class_2560;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.player.CobWebEvent;

@Mixin({class_2560.class})
public class WebBlockMixin {
   @Inject(
      method = {"method_9548"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onEntityCollisionHook(CallbackInfo ci) {
      if (CobWebEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }
}
