package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class AttackBlockEvent extends Event {
   @NotNull
   public static final AttackBlockEvent INSTANCE = new AttackBlockEvent();
   @NotNull
   private static class_2350 direction;
   @NotNull
   private static class_2338 pos;

   private AttackBlockEvent() {
   }

   @NotNull
   public final class_2350 getDirection() {
      return direction;
   }

   public final void setDirection(@NotNull class_2350 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      direction = var1;
   }

   @NotNull
   public final class_2338 getPos() {
      return pos;
   }

   public final void setPos(@NotNull class_2338 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      pos = var1;
   }

   public final boolean call(@NotNull class_2350 direction, @NotNull class_2338 pos) {
      Intrinsics.checkNotNullParameter(direction, "direction");
      Intrinsics.checkNotNullParameter(pos, "pos");
      this.setCancelled(false);
      AttackBlockEvent.pos = pos;
      AttackBlockEvent.direction = direction;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }

   static {
      direction = class_2350.field_11036;
      class_2338 var10000 = class_2338.field_10980;
      Intrinsics.checkNotNullExpressionValue(var10000, "ZERO");
      pos = var10000;
   }
}
