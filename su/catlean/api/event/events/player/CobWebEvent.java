package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class CobWebEvent extends Event {
   @NotNull
   public static final CobWebEvent INSTANCE = new CobWebEvent();
   @NotNull
   private static class_2338 pos;

   private CobWebEvent() {
   }

   @NotNull
   public final class_2338 getPos() {
      return pos;
   }

   public final void setPos(@NotNull class_2338 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      pos = var1;
   }

   public final boolean call(@NotNull class_2338 pos) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      this.setCancelled(false);
      CobWebEvent.pos = pos;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }

   static {
      class_2338 var10000 = class_2338.field_10980;
      Intrinsics.checkNotNullExpressionValue(var10000, "ZERO");
      pos = var10000;
   }
}
