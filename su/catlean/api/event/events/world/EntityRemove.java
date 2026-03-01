package su.catlean.api.event.events.world;

import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class EntityRemove extends Event {
   @NotNull
   public static final EntityRemove INSTANCE = new EntityRemove();
   @Nullable
   private static class_1297 entity;

   private EntityRemove() {
   }

   @Nullable
   public final class_1297 getEntity() {
      return entity;
   }

   public final boolean call(@Nullable class_1297 entity) {
      this.setCancelled(false);
      EntityRemove.entity = entity;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
