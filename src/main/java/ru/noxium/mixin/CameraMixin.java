package ru.noxium.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.client.render.Camera;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.noxium.Noxium;
import ru.noxium.event.EventManager;
import ru.noxium.event.player.EventRotation;

@Environment(EnvType.CLIENT)
@Mixin({Camera.class})
public abstract class CameraMixin {
   @Unique
   private EventRotation noxium$rotationEvent;
   @Unique
   private float noxium$originalYaw;
   @Unique
   private float noxium$originalPitch;

   @Shadow
   protected abstract void setRotation(float var1, float var2);

   @Inject(
      method = {"update"},
      at = {@At("HEAD")}
   )
   private void onUpdateHead(World area, Entity focusedEntity, boolean thirdPerson, boolean inverseView, float tickProgress, CallbackInfo ci) {
      if (focusedEntity != null) {
         this.noxium$originalYaw = focusedEntity.getYaw(tickProgress);
         this.noxium$originalPitch = focusedEntity.getPitch(tickProgress);
         this.noxium$rotationEvent = new EventRotation(this.noxium$originalYaw, this.noxium$originalPitch, tickProgress);
         EventManager.call(this.noxium$rotationEvent);
      } else {
         this.noxium$rotationEvent = null;
      }
   }

   @Redirect(
      method = {"update"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/Camera;setRotation(FF)V"
      )
   )
   private void redirectSetRotation(Camera instance, float yaw, float pitch) {
      if (this.noxium$rotationEvent == null
         || this.noxium$rotationEvent.getYaw() == this.noxium$originalYaw && this.noxium$rotationEvent.getPitch() == this.noxium$originalPitch) {
         this.setRotation(yaw, pitch);
      } else {
         this.setRotation(this.noxium$rotationEvent.getYaw(), this.noxium$rotationEvent.getPitch());
      }
   }

   @Inject(
      method = {"update"},
      at = {@At("RETURN")}
   )
   private void onUpdateReturn(CallbackInfo ci) {
      this.noxium$rotationEvent = null;
   }
}
