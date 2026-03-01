package su.catlean.mixins.client;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_542;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.client.CloseEvent;
import su.catlean.api.event.events.client.InitEvent;
import su.catlean.api.event.events.client.PostTickEvent;
import su.catlean.api.event.events.client.ScreenEvent;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.network.DisconnectEvent;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.api.event.events.player.AttackEvent;
import su.catlean.api.event.events.player.ItemUseEvent;

@Mixin({class_310.class})
public class MinecraftMixin {
   @Inject(
      method = {"<init>"},
      at = {@At("TAIL")}
   )
   void postWindowInit(class_542 args, CallbackInfo ci) {
      InitEvent.INSTANCE.call();
   }

   @Inject(
      method = {"method_1507"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void setScreenHook(class_437 screen, CallbackInfo ci) {
      if (ScreenEvent.INSTANCE.call(screen)) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_1574"},
      at = {@At("HEAD")}
   )
   void preTickHook(CallbackInfo ci) {
      TickEvent.INSTANCE.call();
   }

   @Inject(
      method = {"method_1574"},
      at = {@At("RETURN")}
   )
   void postTickHook(CallbackInfo ci) {
      PostTickEvent.INSTANCE.call();
   }

   @Inject(
      method = {"method_1536"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void doAttackHook(CallbackInfoReturnable<Boolean> cir) {
      if (AttackEvent.INSTANCE.call()) {
         cir.setReturnValue(false);
      }

   }

   @Inject(
      method = {"close"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void closeHook(CallbackInfo ci) {
      if (CloseEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_1588"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void isAmbientOcclusionEnabledHook(CallbackInfoReturnable<Boolean> cir) {
      if (GofraState.INSTANCE.getXray()) {
         cir.setReturnValue(false);
      }

   }

   @Inject(
      method = {"method_18096(Lnet/minecraft/class_437;ZZ)V"},
      at = {@At("HEAD")}
   )
   public void disconnect(class_437 screen, boolean bl, boolean bl2, CallbackInfo ci) {
      DisconnectEvent.INSTANCE.call();
   }

   @Inject(
      method = {"method_1523"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_310;method_5383()V",
   shift = Shift.AFTER
)}
   )
   private void render(boolean tick, CallbackInfo ci, @Local int n) {
      PostTasksProcessEvent.INSTANCE.call();
   }

   @Inject(
      method = {"method_1583"},
      at = {@At("HEAD")}
   )
   private void doItemUse(CallbackInfo callbackInfo) {
      ItemUseEvent.INSTANCE.call();
   }
}
