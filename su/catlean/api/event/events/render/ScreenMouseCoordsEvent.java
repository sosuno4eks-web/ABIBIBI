package su.catlean.api.event.events.render;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class ScreenMouseCoordsEvent extends Event {
   @NotNull
   public static final ScreenMouseCoordsEvent INSTANCE = new ScreenMouseCoordsEvent();
   private static int x;
   private static int y;

   private ScreenMouseCoordsEvent() {
   }

   public final int getX() {
      return x;
   }

   public final void setX(int <set-?>) {
      x = var1;
   }

   public final int getY() {
      return y;
   }

   public final void setY(int <set-?>) {
      y = var1;
   }

   public final boolean call(int x, int y) {
      this.setCancelled(false);
      Gofra.INSTANCE.drain(this);
      ScreenMouseCoordsEvent.x = x;
      ScreenMouseCoordsEvent.y = y;
      return this.getCancelled();
   }
}
