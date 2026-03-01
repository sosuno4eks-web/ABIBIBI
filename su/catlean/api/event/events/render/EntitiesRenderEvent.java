package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class EntitiesRenderEvent extends Event {
   @NotNull
   public static final EntitiesRenderEvent INSTANCE = new EntitiesRenderEvent();
   private static class_4587 stack;

   private EntitiesRenderEvent() {
   }

   @NotNull
   public final class_4587 getStack() {
      class_4587 var10000 = stack;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("stack");
         return null;
      }
   }

   public final boolean call(@NotNull class_4587 stack) {
      Intrinsics.checkNotNullParameter(stack, "stack");
      this.setCancelled(false);
      EntitiesRenderEvent.stack = stack;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
