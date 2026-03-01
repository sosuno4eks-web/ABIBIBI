package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class ShowFloatingItemEvent extends Event {
   @NotNull
   public static final ShowFloatingItemEvent INSTANCE = new ShowFloatingItemEvent();
   public static class_1799 item;

   private ShowFloatingItemEvent() {
   }

   @NotNull
   public final class_1799 getItem() {
      class_1799 var10000 = item;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("item");
         return null;
      }
   }

   public final void setItem(@NotNull class_1799 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      item = var1;
   }

   public final boolean call(@NotNull class_1799 item) {
      Intrinsics.checkNotNullParameter(item, "item");
      this.setCancelled(false);
      this.setItem(item);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
