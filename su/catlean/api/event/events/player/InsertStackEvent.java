package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

public final class InsertStackEvent extends Event {
   @NotNull
   public static final InsertStackEvent INSTANCE = new InsertStackEvent();
   @NotNull
   private static class_1799 stack;

   private InsertStackEvent() {
   }

   @NotNull
   public final class_1799 getStack() {
      return stack;
   }

   public final void setStack(@NotNull class_1799 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      stack = var1;
   }

   static {
      class_1799 var10000 = class_1799.field_8037;
      Intrinsics.checkNotNullExpressionValue(var10000, "EMPTY");
      stack = var10000;
   }
}
