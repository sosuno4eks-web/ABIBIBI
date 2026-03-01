package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class EntityAlphaEvent extends Event {
   @NotNull
   public static final EntityAlphaEvent INSTANCE = new EntityAlphaEvent();
   @NotNull
   private static class_243 pos;
   private static float alpha;

   private EntityAlphaEvent() {
   }

   @NotNull
   public final class_243 getPos() {
      return pos;
   }

   public final void setPos(@NotNull class_243 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      pos = var1;
   }

   public final float getAlpha() {
      return alpha;
   }

   public final void setAlpha(float <set-?>) {
      alpha = var1;
   }

   public final boolean call(@NotNull class_243 pos) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      EntityAlphaEvent.pos = pos;
      alpha = 1.0F;
      this.setCancelled(false);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }

   static {
      class_243 var10000 = class_243.field_1353;
      Intrinsics.checkNotNullExpressionValue(var10000, "ZERO");
      pos = var10000;
      alpha = 1.0F;
   }
}
