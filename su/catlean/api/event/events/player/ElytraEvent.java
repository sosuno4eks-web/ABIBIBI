package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

public class ElytraEvent extends Event {
   @NotNull
   private class_243 vec;

   public ElytraEvent() {
      class_243 var10001 = class_243.field_1353;
      Intrinsics.checkNotNullExpressionValue(var10001, "ZERO");
      this.vec = var10001;
   }

   @NotNull
   public final class_243 getVec() {
      return this.vec;
   }

   public final void setVec(@NotNull class_243 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.vec = var1;
   }
}
