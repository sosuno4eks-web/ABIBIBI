package ru.noxium.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.noxium.Noxium;
import ru.noxium.module.impl.player.NoPush;

@Environment(EnvType.CLIENT)
@Mixin({ Entity.class })
public abstract class EntityMixin {
   // HitBox feature removed

   @Inject(method = { "pushAwayFrom" }, at = { @At("HEAD") }, cancellable = true)
   private void onPushAwayFrom(Entity entity, CallbackInfo ci) {
      Entity self = (Entity) (Object) this;
      if (self instanceof ClientPlayerEntity) {
         if (Noxium.get != null && Noxium.get.manager != null) {
            NoPush noPush = (NoPush) Noxium.get.manager.getModule(NoPush.class);
            if (noPush != null && noPush.enable) {
               if (entity instanceof PlayerEntity && noPush.players.get()) {
                  ci.cancel();
               } else if (entity instanceof LivingEntity && !(entity instanceof PlayerEntity) && noPush.mobs.get()) {
                  ci.cancel();
               }
            }
         }
      }
   }
}
