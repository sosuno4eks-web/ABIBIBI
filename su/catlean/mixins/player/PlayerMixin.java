package su.catlean.mixins.player;

import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.player.EventPlayerTravel;
import su.catlean.api.event.events.player.EventPostPlayerTravel;
import su.catlean.api.event.events.player.PostAttackEvent;
import su.catlean.api.event.events.player.ReachStateEvent;
import su.catlean.api.event.events.player.ShouldDismountEvent;

@Mixin({class_1657.class})
public class PlayerMixin {
   @Inject(
      method = {"method_55754"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getBlockInteractionRangeHook(CallbackInfoReturnable<Double> cir) {
      if (ReachStateEvent.INSTANCE.call()) {
         cir.setReturnValue((double)ReachStateEvent.INSTANCE.getBlockRange());
      }

   }

   @Inject(
      method = {"method_55755"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getEntityInteractionRangeHook(CallbackInfoReturnable<Double> cir) {
      if (ReachStateEvent.INSTANCE.call()) {
         cir.setReturnValue((double)ReachStateEvent.INSTANCE.getEntityRange());
      }

   }

   @Inject(
      method = {"method_7324"},
      at = {@At("RETURN")}
   )
   public void attackAHook(CallbackInfo callbackInfo) {
      PostAttackEvent.INSTANCE.call();
   }

   @Inject(
      method = {"method_6091"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onTravelhookPre(class_243 movementInput, CallbackInfo ci) {
      if (class_310.method_1551().field_1724 != null && class_310.method_1551().field_1687 != null && EventPlayerTravel.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_6091"},
      at = {@At("RETURN")}
   )
   private void onTravelhookPost(class_243 movementInput, CallbackInfo ci) {
      EventPostPlayerTravel.INSTANCE.call();
   }

   @Inject(
      method = {"method_21824"},
      at = {@At("HEAD")},
      cancellable = true
   )
   protected void shouldDismountHook(CallbackInfoReturnable<Boolean> cir) {
      if (ShouldDismountEvent.INSTANCE.call()) {
         cir.setReturnValue(false);
      }

   }
}
