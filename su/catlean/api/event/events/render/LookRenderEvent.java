package su.catlean.api.event.events.render;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class LookRenderEvent extends Event {
   @NotNull
   public static final LookRenderEvent INSTANCE = new LookRenderEvent();
   private static float yaw;
   private static float pitch;
   private static float bodyYaw;

   private LookRenderEvent() {
   }

   public final float getYaw() {
      return yaw;
   }

   public final void setYaw(float <set-?>) {
      yaw = var1;
   }

   public final float getPitch() {
      return pitch;
   }

   public final void setPitch(float <set-?>) {
      pitch = var1;
   }

   public final float getBodyYaw() {
      return bodyYaw;
   }

   public final void setBodyYaw(float <set-?>) {
      bodyYaw = var1;
   }

   public final boolean call(float yaw, float pitch, float bodyYaw) {
      this.setCancelled(false);
      LookRenderEvent.yaw = yaw;
      LookRenderEvent.pitch = pitch;
      LookRenderEvent.bodyYaw = bodyYaw;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
