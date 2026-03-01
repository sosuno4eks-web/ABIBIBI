package su.catlean.api.event.events.client;

import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class ScreenEvent extends Event {
   @NotNull
   public static final ScreenEvent INSTANCE = new ScreenEvent();
   @Nullable
   private static class_437 screen;

   private ScreenEvent() {
   }

   @Nullable
   public final class_437 getScreen() {
      return screen;
   }

   public final void setScreen(@Nullable class_437 <set-?>) {
      screen = var1;
   }

   public final boolean call(@Nullable class_437 screen) {
      this.setCancelled(false);
      ScreenEvent.screen = screen;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
