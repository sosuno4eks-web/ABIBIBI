package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class FinishUsingItemEvent extends Event {
   @NotNull
   public static final FinishUsingItemEvent INSTANCE = new FinishUsingItemEvent();
   @Nullable
   private static class_1799 item;

   private FinishUsingItemEvent() {
   }

   @Nullable
   public final class_1799 getItem() {
      return item;
   }

   public final void setItem(@Nullable class_1799 <set-?>) {
      item = var1;
   }

   public final boolean call(@NotNull class_1799 item) {
      Intrinsics.checkNotNullParameter(item, "item");
      this.setCancelled(false);
      FinishUsingItemEvent.item = item;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
