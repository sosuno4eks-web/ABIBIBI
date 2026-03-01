package su.catlean.mixins.player;

import net.minecraft.class_1661;
import net.minecraft.class_1799;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.player.InsertStackEvent;
import su.catlean.api.event.events.player.UpdateSelectedSlotEvent;

@Mixin({class_1661.class})
public class InventoryMixin {
   @Inject(
      method = {"method_7394(Lnet/minecraft/class_1799;)Z"},
      at = {@At("HEAD")}
   )
   private void insertStackHook(class_1799 stack, CallbackInfoReturnable<Boolean> cir) {
      InsertStackEvent.INSTANCE.setStack(stack);
      InsertStackEvent.INSTANCE.call();
   }

   @Inject(
      method = {"method_61496"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void setSelectedSlotHook(int slot, CallbackInfo ci) {
      UpdateSelectedSlotEvent.INSTANCE.setSlot(slot);
      if (UpdateSelectedSlotEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }
}
