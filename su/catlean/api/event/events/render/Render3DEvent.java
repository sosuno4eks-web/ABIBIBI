package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class Render3DEvent extends Event {
   @NotNull
   public static final Render3DEvent INSTANCE = new Render3DEvent();
   private static class_4587 stack;
   private static Matrix4f projection;

   private Render3DEvent() {
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

   @NotNull
   public final Matrix4f getProjection() {
      Matrix4f var10000 = projection;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("projection");
         return null;
      }
   }

   public final boolean call(@NotNull class_4587 stack, @NotNull Matrix4f projection) {
      Intrinsics.checkNotNullParameter(stack, "stack");
      Intrinsics.checkNotNullParameter(projection, "projection");
      this.setCancelled(false);
      Render3DEvent.stack = stack;
      Render3DEvent.projection = projection;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
