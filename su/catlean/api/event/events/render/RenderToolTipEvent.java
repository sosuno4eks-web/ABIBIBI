package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;

public final class RenderToolTipEvent extends Event {
   @NotNull
   public static final RenderToolTipEvent INSTANCE = new RenderToolTipEvent();
   @Nullable
   private static class_1799 stack;
   @Nullable
   private static class_332 context;
   private static int mouseX;
   private static int mouseY;

   private RenderToolTipEvent() {
   }

   @Nullable
   public final class_1799 getStack() {
      return stack;
   }

   public final void setStack(@Nullable class_1799 <set-?>) {
      stack = var1;
   }

   @Nullable
   public final class_332 getContext() {
      return context;
   }

   public final void setContext(@Nullable class_332 <set-?>) {
      context = var1;
   }

   public final int getMouseX() {
      return mouseX;
   }

   public final void setMouseX(int <set-?>) {
      mouseX = var1;
   }

   public final int getMouseY() {
      return mouseY;
   }

   public final void setMouseY(int <set-?>) {
      mouseY = var1;
   }

   public final void call(@NotNull class_1799 stack, @NotNull class_332 context, int mouseX, int mouseY) {
      Intrinsics.checkNotNullParameter(stack, "stack");
      Intrinsics.checkNotNullParameter(context, "context");
      RenderToolTipEvent.stack = stack;
      RenderToolTipEvent.context = context;
      RenderToolTipEvent.mouseX = mouseX;
      RenderToolTipEvent.mouseY = mouseY;
      this.call();
   }
}
