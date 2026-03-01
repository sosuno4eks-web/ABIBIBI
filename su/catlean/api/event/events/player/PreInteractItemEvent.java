package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class PreInteractItemEvent extends Event {
   @NotNull
   public static final PreInteractItemEvent INSTANCE = new PreInteractItemEvent();
   @NotNull
   private static class_1268 hand;

   private PreInteractItemEvent() {
   }

   @NotNull
   public final class_1268 getHand() {
      return hand;
   }

   public final void setHand(@NotNull class_1268 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      hand = var1;
   }

   public final boolean call(@NotNull class_1268 hand) {
      Intrinsics.checkNotNullParameter(hand, "hand");
      PreInteractItemEvent.hand = hand;
      this.setCancelled(false);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }

   static {
      hand = class_1268.field_5808;
   }
}
