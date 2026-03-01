package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

public final class StackCollectEvent extends Event {
   @NotNull
   public static final StackCollectEvent INSTANCE = new StackCollectEvent();
   @NotNull
   private static class_1799 itemStack;

   private StackCollectEvent() {
   }

   @NotNull
   public final class_1799 getItemStack() {
      return itemStack;
   }

   public final void setItemStack(@NotNull class_1799 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      itemStack = var1;
   }

   static {
      class_1799 var10000 = class_1802.field_8831.method_7854();
      Intrinsics.checkNotNullExpressionValue(var10000, "getDefaultInstance(...)");
      itemStack = var10000;
   }
}
