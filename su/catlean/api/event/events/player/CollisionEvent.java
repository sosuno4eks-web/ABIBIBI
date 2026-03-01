package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class CollisionEvent extends Event {
   @NotNull
   private class_2680 state;
   @NotNull
   private class_2338 pos;

   public CollisionEvent() {
      class_2680 var10001 = class_2246.field_10124.method_9564();
      Intrinsics.checkNotNullExpressionValue(var10001, "defaultBlockState(...)");
      this.state = var10001;
      class_2338 var1 = class_2338.field_10980;
      Intrinsics.checkNotNullExpressionValue(var1, "ZERO");
      this.pos = var1;
   }

   @NotNull
   public final class_2680 getState() {
      return this.state;
   }

   public final void setState(@NotNull class_2680 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.state = var1;
   }

   @NotNull
   public final class_2338 getPos() {
      return this.pos;
   }

   public final void setPos(@NotNull class_2338 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.pos = var1;
   }

   public final boolean call(@NotNull class_2680 state, @NotNull class_2338 pos) {
      Intrinsics.checkNotNullParameter(state, "state");
      Intrinsics.checkNotNullParameter(pos, "pos");
      this.setCancelled(false);
      this.pos = pos;
      this.state = state;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
