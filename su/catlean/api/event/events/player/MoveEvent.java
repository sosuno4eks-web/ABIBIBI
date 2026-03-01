package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class MoveEvent extends Event {
   @NotNull
   public static final MoveEvent INSTANCE = new MoveEvent();
   private static double x;
   private static double y;
   private static double z;

   private MoveEvent() {
   }

   public final double getX() {
      return x;
   }

   public final void setX(double <set-?>) {
      x = var1;
   }

   public final double getY() {
      return y;
   }

   public final void setY(double <set-?>) {
      y = var1;
   }

   public final double getZ() {
      return z;
   }

   public final void setZ(double <set-?>) {
      z = var1;
   }

   public final boolean call(double x, double y, double z) {
      this.setCancelled(false);
      MoveEvent.x = x;
      MoveEvent.y = y;
      MoveEvent.z = z;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
