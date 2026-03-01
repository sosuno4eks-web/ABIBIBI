package su.catlean.mixins.client;

import com.mojang.authlib.GameProfile;
import net.minecraft.class_1313;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.network.SlowDownEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PostPlayerUpdateEvent;
import su.catlean.api.event.events.player.PostSyncEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.player.PushOutOfBlocksEvent;
import su.catlean.api.event.events.player.ShouldStopSprintingEvent;
import su.catlean.api.event.events.player.UsingItemEvent;

@Mixin(
   value = {class_746.class},
   priority = 800
)
public abstract class LocalPlayerMixin extends class_742 {
   public LocalPlayerMixin(class_638 world, GameProfile profile) {
      super(world, profile);
   }

   @Inject(
      method = {"method_5773"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void tickHook(CallbackInfo info) {
      if (PlayerUpdateEvent.INSTANCE.call()) {
         info.cancel();
      }

   }

   @Inject(
      method = {"method_5773"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_742;method_5773()V",
   shift = Shift.AFTER
)}
   )
   public void postTickHook(CallbackInfo info) {
      PostPlayerUpdateEvent.INSTANCE.call();
   }

   @Inject(
      method = {"method_3136"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sendMovementPacketsHook(CallbackInfo info) {
      if (PreSyncEvent.INSTANCE.call()) {
         info.cancel();
      }

   }

   @Inject(
      method = {"method_3136"},
      at = {@At("RETURN")}
   )
   private void sendMovementPacketsPostHook(CallbackInfo info) {
      PostSyncEvent.INSTANCE.call();
   }

   @Inject(
      method = {"method_5784"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_742;method_5784(Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V"
)},
      cancellable = true
   )
   public void onMoveHook(class_1313 movementType, @NotNull class_243 movement, CallbackInfo ci) {
      if (MoveEvent.INSTANCE.call(movement.field_1352, movement.field_1351, movement.field_1350)) {
         double cacheX = this.method_23317();
         double cacheZ = this.method_23321();
         super.method_5784(movementType, new class_243(MoveEvent.INSTANCE.getX(), MoveEvent.INSTANCE.getY(), MoveEvent.INSTANCE.getZ()));
         this.field_5994 += class_3532.method_61344((float)(this.method_23317() - cacheX), (float)(this.method_23321() - cacheZ)) * 0.6F;
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_20303"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void shouldSlowDownHook(CallbackInfoReturnable<Boolean> cir) {
      if (SlowDownEvent.INSTANCE.call()) {
         cir.setReturnValue(false);
      }

   }

   @Inject(
      method = {"method_6115"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void isUsingItemHook(CallbackInfoReturnable<Boolean> cir) {
      if (UsingItemEvent.INSTANCE.call()) {
         cir.setReturnValue(true);
      }

   }

   @Inject(
      method = {"method_30673"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPushOutOfBlocksHook(double x, double d, CallbackInfo info) {
      if (PushOutOfBlocksEvent.INSTANCE.call()) {
         info.cancel();
      }

   }

   @Inject(
      method = {"method_65949"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void shouldStopSprintingHook(CallbackInfoReturnable<Boolean> cir) {
      if (ShouldStopSprintingEvent.INSTANCE.call()) {
         cir.setReturnValue(false);
      }

   }
}
