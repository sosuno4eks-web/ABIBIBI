package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class JumpEvent extends Event {
   @NotNull
   public static final JumpEvent INSTANCE = new JumpEvent();
   private static float yaw;
   private static float y;
   private static float xz;

   private JumpEvent() {
   }

   public final float getYaw() {
      return yaw;
   }

   public final void setYaw(float <set-?>) {
      yaw = var1;
   }

   public final float getY() {
      return y;
   }

   public final void setY(float <set-?>) {
      y = var1;
   }

   public final float getXz() {
      return xz;
   }

   public final void setXz(float <set-?>) {
      xz = var1;
   }

   public final boolean call(float yaw, float y, float xz) {
      this.setCancelled(false);
      JumpEvent.yaw = yaw;
      JumpEvent.y = y;
      JumpEvent.xz = xz;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
