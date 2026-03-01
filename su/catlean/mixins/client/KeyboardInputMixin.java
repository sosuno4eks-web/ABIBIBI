package su.catlean.mixins.client;

import net.minecraft.class_743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.player.KeyboardInputEvent;

@Mixin({class_743.class})
public class KeyboardInputMixin {
   @Inject(
      method = {"method_3129"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/class_743;field_55868:Lnet/minecraft/class_241;",
   ordinal = 0,
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void tickHook(CallbackInfo ci) {
      if (KeyboardInputEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }
}
