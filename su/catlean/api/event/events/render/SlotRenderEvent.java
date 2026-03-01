package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1735;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

public final class SlotRenderEvent extends Event {
   @NotNull
   public static final SlotRenderEvent INSTANCE = new SlotRenderEvent();
   public static class_332 context;
   public static class_1735 slot;

   private SlotRenderEvent() {
   }

   @NotNull
   public final class_332 getContext() {
      class_332 var10000 = context;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("context");
         return null;
      }
   }

   public final void setContext(@NotNull class_332 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      context = var1;
   }

   @NotNull
   public final class_1735 getSlot() {
      class_1735 var10000 = slot;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("slot");
         return null;
      }
   }

   public final void setSlot(@NotNull class_1735 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      slot = var1;
   }
}
