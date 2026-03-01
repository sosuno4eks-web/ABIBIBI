package su.catlean.mixins.world;

import net.minecraft.class_1309;
import net.minecraft.class_1313;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.FallFlyingEvent;
import su.catlean.api.event.events.player.HealthEvent;
import su.catlean.api.event.events.player.JumpEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.SprintEvent;
import su.catlean.api.event.events.render.SwingDurationEvent;

@Mixin({class_1309.class})
public abstract class EntityLivingMixin {
   @Shadow
   protected abstract float method_6106();

   @Inject(
      method = {"method_6091"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void travelHook(class_243 movementInput, CallbackInfo ci) {
      if ((class_1309)this == class_310.method_1551().field_1724) {
         if (PreElytraEvent.INSTANCE.call(class_310.method_1551().field_1724.method_18798())) {
            class_310.method_1551().field_1724.method_5784(class_1313.field_6308, PreElytraEvent.INSTANCE.getVec());
            ci.cancel();
         }

      }
   }

   @Inject(
      method = {"method_6091"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void travelPostHook(class_243 movementInput, CallbackInfo ci) {
      if ((class_1309)this == class_310.method_1551().field_1724) {
         if (AfterElytraEvent.INSTANCE.call(class_310.method_1551().field_1724.method_18798())) {
            class_310.method_1551().field_1724.method_5784(class_1313.field_6308, AfterElytraEvent.INSTANCE.getVec());
            ci.cancel();
         }

      }
   }

   @Inject(
      method = {"method_6128"},
      at = {@At("TAIL")},
      cancellable = true
   )
   public void isGlidingHook(CallbackInfoReturnable<Boolean> cir) {
      if ((class_1309)this == class_310.method_1551().field_1724) {
         if (FallFlyingEvent.INSTANCE.call((Boolean)cir.getReturnValue())) {
            cir.setReturnValue(FallFlyingEvent.INSTANCE.getValue());
         }

      }
   }

   @Inject(
      method = {"method_6043"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void jumpHook(CallbackInfo info) {
      if ((class_1309)this == class_310.method_1551().field_1724) {
         class_1309 pl = (class_1309)this;
         if (JumpEvent.INSTANCE.call(pl.method_36454(), this.method_6106(), 0.2F)) {
            info.cancel();
            if (JumpEvent.INSTANCE.getY() > 1.0E-5F) {
               class_243 vec3d = pl.method_18798();
               pl.method_18800(vec3d.field_1352, Math.max((double)JumpEvent.INSTANCE.getY(), vec3d.field_1351), vec3d.field_1350);
               if (pl.method_5624()) {
                  float g = JumpEvent.INSTANCE.getYaw() * 0.017453292F;
                  pl.method_45319(new class_243(-Math.sin((double)g) * (double)JumpEvent.INSTANCE.getXz(), 0.0D, Math.cos((double)g) * (double)JumpEvent.INSTANCE.getXz()));
               }

               pl.field_64356 = true;
            }
         }

      }
   }

   @ModifyVariable(
      method = {"method_5728"},
      at = @At("HEAD"),
      ordinal = 0,
      argsOnly = true
   )
   private boolean setSprintingHook(boolean sprinting) {
      SprintEvent.INSTANCE.setSprinting(sprinting);
      SprintEvent.INSTANCE.call();
      return SprintEvent.INSTANCE.getSprinting();
   }

   @Inject(
      method = {"method_6033"},
      at = {@At("HEAD")}
   )
   private void setHealth(float health, CallbackInfo ci) {
      if (this == class_310.method_1551().field_1724) {
         HealthEvent.INSTANCE.call(health);
      }

   }

   @Inject(
      method = {"method_6028"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getArmSwingAnimationEnd(CallbackInfoReturnable<Integer> info) {
      if (SwingDurationEvent.INSTANCE.call()) {
         info.setReturnValue(SwingDurationEvent.INSTANCE.getValue());
      }

   }
}
