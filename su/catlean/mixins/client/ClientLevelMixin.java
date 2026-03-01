package su.catlean.mixins.client;

import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_1297.class_5529;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.world.AfterEntityRemove;
import su.catlean.api.event.events.world.AfterEntitySpawn;
import su.catlean.api.event.events.world.EntityRemove;
import su.catlean.api.event.events.world.EntitySpawn;
import su.catlean.mixins.accessors.ClientLevelAccessor;

@Mixin({class_638.class})
public class ClientLevelMixin {
   @Unique
   private final class_310 mc = class_310.method_1551();

   @Inject(
      method = {"method_53875"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void addEntityHook(class_1297 entity, CallbackInfo ci) {
      if (EntitySpawn.INSTANCE.call(entity)) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_53875"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void addEntityHookPost(class_1297 entity, CallbackInfo ci) {
      if (AfterEntitySpawn.INSTANCE.call(entity)) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_2945"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void removeEntityHook(int entityId, class_5529 removalReason, CallbackInfo ci) {
      if (this.mc.field_1687 != null && this.mc.field_1724 != null && EntityRemove.INSTANCE.call((class_1297)((ClientLevelAccessor)this.mc.field_1687).iGetEntityLookup().method_31866().method_31804(entityId))) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_2945"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void removeEntityHookPost(int entityId, class_5529 removalReason, CallbackInfo ci) {
      if (this.mc.field_1687 != null && this.mc.field_1724 != null && AfterEntityRemove.INSTANCE.call((class_1297)((ClientLevelAccessor)this.mc.field_1687).iGetEntityLookup().method_31866().method_31804(entityId))) {
         ci.cancel();
      }

   }
}
