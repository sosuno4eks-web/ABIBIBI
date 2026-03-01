package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class CalcBlockBreakingDeltaEvent extends Event {
   @NotNull
   public static final CalcBlockBreakingDeltaEvent INSTANCE = new CalcBlockBreakingDeltaEvent();
   public static class_2338 blockPos;
   public static class_2680 state;
   private static float delta;

   private CalcBlockBreakingDeltaEvent() {
   }

   @NotNull
   public final class_2338 getBlockPos() {
      class_2338 var10000 = blockPos;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("blockPos");
         return null;
      }
   }

   public final void setBlockPos(@NotNull class_2338 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      blockPos = var1;
   }

   @NotNull
   public final class_2680 getState() {
      class_2680 var10000 = state;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("state");
         return null;
      }
   }

   public final void setState(@NotNull class_2680 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      state = var1;
   }

   public final float getDelta() {
      return delta;
   }

   public final void setDelta(float <set-?>) {
      delta = var1;
   }

   public final boolean call(@NotNull class_2338 pos, @NotNull class_2680 state) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      Intrinsics.checkNotNullParameter(state, "state");
      this.setCancelled(false);
      this.setBlockPos(pos);
      INSTANCE.setState(state);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
