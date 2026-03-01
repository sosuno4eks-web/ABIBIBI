package su.catlean.mixins.client;

import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.network.ClearClickMapEvent;

@Mixin({class_1703.class})
public class ItemStackHashMixin {
   @Inject(
      method = {"method_7593"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void onSlotClickHook(int slotIndex, int button, class_1713 actionType, class_1657 player, CallbackInfo ci) {
      if (ClearClickMapEvent.INSTANCE.call() && ci != null) {
         ci.cancel();
      }

   }
}
