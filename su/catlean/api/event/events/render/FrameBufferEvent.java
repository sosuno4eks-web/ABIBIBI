package su.catlean.api.event.events.render;

import net.minecraft.class_276;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;

public final class FrameBufferEvent extends Event {
   @NotNull
   public static final FrameBufferEvent INSTANCE = new FrameBufferEvent();
   @Nullable
   private static class_276 frameBuffer;

   private FrameBufferEvent() {
   }

   @Nullable
   public final class_276 getFrameBuffer() {
      return frameBuffer;
   }

   public final void setFrameBuffer(@Nullable class_276 <set-?>) {
      frameBuffer = var1;
   }
}
