package su.catlean.api.event.events.world;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class AfterEntitySpawn extends Event {
   @NotNull
   public static final AfterEntitySpawn INSTANCE = new AfterEntitySpawn();
   private static class_1297 entity;

   private AfterEntitySpawn() {
   }

   @NotNull
   public final class_1297 getEntity() {
      class_1297 var10000 = entity;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("entity");
         return null;
      }
   }

   public final boolean call(@NotNull class_1297 entity) {
      Intrinsics.checkNotNullParameter(entity, "entity");
      this.setCancelled(false);
      AfterEntitySpawn.entity = entity;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
