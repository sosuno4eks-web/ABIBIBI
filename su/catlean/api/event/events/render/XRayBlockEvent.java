package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class XRayBlockEvent extends Event {
   @NotNull
   private class_2248 block;

   public XRayBlockEvent() {
      class_2248 var10001 = class_2246.field_10566;
      Intrinsics.checkNotNullExpressionValue(var10001, "DIRT");
      this.block = var10001;
   }

   @NotNull
   public final class_2248 getBlock() {
      return this.block;
   }

   public final void setBlock(@NotNull class_2248 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.block = var1;
   }

   public final boolean call(@NotNull class_2248 block) {
      Intrinsics.checkNotNullParameter(block, "block");
      this.setCancelled(false);
      this.block = block;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
