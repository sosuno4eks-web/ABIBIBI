package su.catlean.mixins.world;

import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4050;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import su.catlean.api.event.events.player.BoxContractEvent;
import su.catlean.api.event.events.player.EntityPushEvent;
import su.catlean.api.event.events.player.FixVelocityEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.interfaces.IEntity;

@Mixin({class_1297.class})
public abstract class EntityMixin implements IEntity {
   @Shadow
   private class_243 field_22467;

   @Shadow
   public abstract class_238 method_5829();

   public class_243 catLean$getPosition() {
      return this.field_22467;
   }

   @Inject(
      method = {"method_18376"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void setPoseHook(CallbackInfoReturnable<class_4050> cir) {
      if (this == class_310.method_1551().field_1724 && SetPoseEvent.INSTANCE.call()) {
         cir.cancel();
         cir.setReturnValue(SetPoseEvent.INSTANCE.getPose());
      }

   }

   @Inject(
      method = {"method_5724"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void updateVelocityHook(float speed, class_243 movementInput, CallbackInfo ci) {
      if (this == class_310.method_1551().field_1724 && FixVelocityEvent.INSTANCE.call(movementInput, speed, class_310.method_1551().field_1724.method_36454())) {
         ci.cancel();
         class_310.method_1551().field_1724.method_18799(class_310.method_1551().field_1724.method_18798().method_1019(FixVelocityEvent.INSTANCE.getVelocity()));
      }

   }

   @ModifyArgs(
      method = {"method_5697"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1297;method_5762(DDD)V"
)
   )
   public void pushAwayFromHook(Args args) {
      if ((class_1297)this == class_310.method_1551().field_1724 && EntityPushEvent.INSTANCE.call()) {
         args.set(0, 0.0D);
         args.set(1, 0.0D);
         args.set(2, 0.0D);
      }

   }

   @Inject(
      method = {"method_5829"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getBoundingBoxHook(CallbackInfoReturnable<class_238> cir) {
      if ((class_1297)this == class_310.method_1551().field_1724 && BoxContractEvent.INSTANCE.call()) {
         cir.setReturnValue(BoxContractEvent.INSTANCE.getValue());
         cir.cancel();
      }

   }
}
