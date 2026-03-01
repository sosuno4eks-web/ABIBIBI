package su.catlean.api.event.events.world;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class FireWorkVelocityEvent extends Event {
   @NotNull
   public static final FireWorkVelocityEvent INSTANCE = new FireWorkVelocityEvent();
   @Nullable
   private static class_243 velocity;

   private FireWorkVelocityEvent() {
   }

   @Nullable
   public final class_243 getVelocity() {
      return velocity;
   }

   public final void setVelocity(@Nullable class_243 <set-?>) {
      velocity = var1;
   }

   public final boolean call(@NotNull class_243 vec) {
      Intrinsics.checkNotNullParameter(vec, "vec");
      velocity = vec;
      this.setCancelled(false);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
