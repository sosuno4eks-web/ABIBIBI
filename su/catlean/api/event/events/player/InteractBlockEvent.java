package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class InteractBlockEvent extends Event {
   @NotNull
   public static final InteractBlockEvent INSTANCE = new InteractBlockEvent();
   public static class_1268 hand;
   public static class_3965 hitResult;

   private InteractBlockEvent() {
   }

   @NotNull
   public final class_1268 getHand() {
      class_1268 var10000 = hand;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("hand");
         return null;
      }
   }

   public final void setHand(@NotNull class_1268 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      hand = var1;
   }

   @NotNull
   public final class_3965 getHitResult() {
      class_3965 var10000 = hitResult;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("hitResult");
         return null;
      }
   }

   public final void setHitResult(@NotNull class_3965 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      hitResult = var1;
   }

   public final boolean call(@NotNull class_1268 hand, @NotNull class_3965 hitResult) {
      Intrinsics.checkNotNullParameter(hand, "hand");
      Intrinsics.checkNotNullParameter(hitResult, "hitResult");
      this.setHand(hand);
      this.setHitResult(hitResult);
      this.setCancelled(false);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
