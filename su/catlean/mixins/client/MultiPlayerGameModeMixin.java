package su.catlean.mixins.client;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_3965;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.player.AttackBlockEvent;
import su.catlean.api.event.events.player.BreakBlockEvent;
import su.catlean.api.event.events.player.ClickSlotEvent;
import su.catlean.api.event.events.player.InteractBlockEvent;
import su.catlean.api.event.events.player.PickUpBlockEvent;
import su.catlean.api.event.events.player.PostInteractItemEvent;
import su.catlean.api.event.events.player.PreInteractItemEvent;
import su.catlean.api.event.events.player.StopUsingItemEvent;
import su.catlean.api.event.events.world.UpdateBlockBreakingProgressEvent;

@Mixin({class_636.class})
public class MultiPlayerGameModeMixin {
   @Inject(
      method = {"method_2902"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void updateBlockBreakingProgress(class_2338 pos, class_2350 direction, CallbackInfoReturnable<Boolean> cir) {
      if (UpdateBlockBreakingProgressEvent.INSTANCE.call()) {
         cir.setReturnValue(false);
      }

   }

   @Inject(
      method = {"method_2910"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void attackBlockHook(class_2338 pos, class_2350 direction, CallbackInfoReturnable<Boolean> cir) {
      if (AttackBlockEvent.INSTANCE.call(direction, pos)) {
         cir.setReturnValue(false);
      }

   }

   @Inject(
      method = {"method_2899"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void breakBlockHook(class_2338 pos, CallbackInfoReturnable<Boolean> cir) {
      if (BreakBlockEvent.INSTANCE.call(pos)) {
         cir.setReturnValue(false);
      }

   }

   @Inject(
      method = {"method_2906"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void clickSlotHook(int syncId, int slotId, int button, class_1713 actionType, class_1657 player, CallbackInfo ci) {
      if (ClickSlotEvent.INSTANCE.call(actionType, slotId, button, syncId)) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_2897"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void stopUsingItemHook(class_1657 player, CallbackInfo ci) {
      if (StopUsingItemEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_2896"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void interactBlockHook(class_746 player, class_1268 hand, class_3965 hitResult, CallbackInfoReturnable<class_1269> cir) {
      if (InteractBlockEvent.INSTANCE.call(hand, hitResult)) {
         cir.setReturnValue(class_1269.field_5811);
      }

   }

   @Inject(
      method = {"method_2919"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preInteractItemHook(class_1657 player, class_1268 hand, CallbackInfoReturnable<class_1269> cir) {
      if (PreInteractItemEvent.INSTANCE.call(hand)) {
         cir.setReturnValue(class_1269.field_5811);
         cir.cancel();
      }

   }

   @Inject(
      method = {"method_2919"},
      at = {@At("RETURN")}
   )
   private void postInteractItemHook(class_1657 player, class_1268 hand, CallbackInfoReturnable<class_1269> cir) {
      PostInteractItemEvent.INSTANCE.call();
   }

   @Inject(
      method = {"method_65193"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void pickItemFromBlockHook(class_2338 pos, boolean includeData, CallbackInfo ci) {
      if (PickUpBlockEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }
}
