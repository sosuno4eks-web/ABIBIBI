package su.catlean.api.event.events.world;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3610;
import net.minecraft.class_3611;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class WaterPushEvent extends Event {
   @NotNull
   public static final WaterPushEvent INSTANCE = new WaterPushEvent();
   private static class_2338 pos;
   private static class_3610 state;
   private static class_3611 fluid;
   public static class_243 vec;

   private WaterPushEvent() {
   }

   @NotNull
   public final class_2338 getPos() {
      class_2338 var10000 = pos;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("pos");
         return null;
      }
   }

   @NotNull
   public final class_3610 getState() {
      class_3610 var10000 = state;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("state");
         return null;
      }
   }

   @NotNull
   public final class_3611 getFluid() {
      class_3611 var10000 = fluid;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("fluid");
         return null;
      }
   }

   @NotNull
   public final class_243 getVec() {
      class_243 var10000 = vec;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("vec");
         return null;
      }
   }

   public final void setVec(@NotNull class_243 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      vec = var1;
   }

   public final boolean call(@NotNull class_2338 pos, @NotNull class_3611 fluid, @NotNull class_3610 state, @NotNull class_243 vec) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      Intrinsics.checkNotNullParameter(fluid, "fluid");
      Intrinsics.checkNotNullParameter(state, "state");
      Intrinsics.checkNotNullParameter(vec, "vec");
      this.setCancelled(false);
      WaterPushEvent.pos = pos;
      this.setVec(vec);
      WaterPushEvent.fluid = fluid;
      WaterPushEvent.state = state;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
