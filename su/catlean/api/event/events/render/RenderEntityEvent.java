package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class RenderEntityEvent extends Event {
   @NotNull
   public static final RenderEntityEvent INSTANCE = new RenderEntityEvent();
   @Nullable
   private static class_1297 state;

   private RenderEntityEvent() {
   }

   @Nullable
   public final class_1297 getState() {
      return state;
   }

   public final void setState(@Nullable class_1297 <set-?>) {
      state = var1;
   }

   public final boolean call(@NotNull class_1297 state) {
      Intrinsics.checkNotNullParameter(state, "state");
      RenderEntityEvent.state = state;
      this.setCancelled(false);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
