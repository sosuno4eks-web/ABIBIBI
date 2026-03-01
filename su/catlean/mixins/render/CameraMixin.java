package su.catlean.mixins.render;

import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import su.catlean.api.event.events.player.FreecamStateEvent;
import su.catlean.api.event.events.render.CameraOffsetEvent;
import su.catlean.api.event.events.render.SetupTerrainEvent;

@Mixin({class_4184.class})
public abstract class CameraMixin {
   @Shadow
   private boolean field_18719;

   @Shadow
   protected abstract float method_19318(float var1);

   @ModifyArgs(
      method = {"method_19321(Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;ZZF)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_4184;method_19324(FFF)V",
   ordinal = 0
)
   )
   private void modifyCameraDistance(Args args) {
      if (CameraOffsetEvent.INSTANCE.call()) {
         args.set(0, -this.method_19318(CameraOffsetEvent.INSTANCE.getOffset()));
      }

   }

   @Inject(
      method = {"method_19318"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onClipToSpace(float f, CallbackInfoReturnable<Float> cir) {
      if (CameraOffsetEvent.INSTANCE.call()) {
         cir.setReturnValue(CameraOffsetEvent.INSTANCE.getOffset());
      }

   }

   @Inject(
      method = {"method_19321(Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;ZZF)V"},
      at = {@At("RETURN")}
   )
   private void updateHook(class_1937 area, class_1297 focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta, CallbackInfo ci) {
      if (SetupTerrainEvent.INSTANCE.call()) {
         this.field_18719 = true;
      }

   }

   @ModifyArgs(
      method = {"method_19321(Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;ZZF)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_4184;method_19325(FF)V"
)
   )
   private void setRotationHook(Args args) {
      if (FreecamStateEvent.INSTANCE.call()) {
         args.setAll(new Object[]{FreecamStateEvent.INSTANCE.getYaw(), FreecamStateEvent.INSTANCE.getPitch()});
      }

   }

   @ModifyArgs(
      method = {"method_19321(Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;ZZF)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_4184;method_19327(DDD)V"
)
   )
   private void setPosHook(Args args) {
      if (FreecamStateEvent.INSTANCE.call()) {
         args.setAll(new Object[]{FreecamStateEvent.INSTANCE.getX(), FreecamStateEvent.INSTANCE.getY(), FreecamStateEvent.INSTANCE.getZ()});
      }

   }
}
