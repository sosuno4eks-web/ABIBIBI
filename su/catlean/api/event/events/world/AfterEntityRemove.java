package su.catlean.api.event.events.world;

import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class AfterEntityRemove extends Event {
   @NotNull
   public static final AfterEntityRemove INSTANCE = new AfterEntityRemove();
   @Nullable
   private static class_1297 entity;

   private AfterEntityRemove() {
   }

   @Nullable
   public final class_1297 getEntity() {
      return entity;
   }

   public final boolean call(@Nullable class_1297 entity) {
      this.setCancelled(false);
      AfterEntityRemove.entity = entity;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
