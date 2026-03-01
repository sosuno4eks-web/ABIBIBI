package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class RenderScreenEvent extends Event {
   @NotNull
   public static final RenderScreenEvent INSTANCE = new RenderScreenEvent();
   private static class_332 context;

   private RenderScreenEvent() {
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

   public final boolean call(@NotNull class_332 context) {
      Intrinsics.checkNotNullParameter(context, "context");
      this.setCancelled(false);
      RenderScreenEvent.context = context;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
