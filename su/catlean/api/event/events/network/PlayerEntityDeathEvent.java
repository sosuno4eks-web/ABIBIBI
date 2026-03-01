package su.catlean.api.event.events.network;

import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;

public final class PlayerEntityDeathEvent extends Event {
   @NotNull
   public static final PlayerEntityDeathEvent INSTANCE = new PlayerEntityDeathEvent();
   @Nullable
   private static class_1657 player;
   private static int totemsPopped;

   private PlayerEntityDeathEvent() {
   }

   @Nullable
   public final class_1657 getPlayer() {
      return player;
   }

   public final void setPlayer(@Nullable class_1657 <set-?>) {
      player = var1;
   }

   public final int getTotemsPopped() {
      return totemsPopped;
   }

   public final void setTotemsPopped(int <set-?>) {
      totemsPopped = var1;
   }
}
