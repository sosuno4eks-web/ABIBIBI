package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_10017;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class RenderNameTagEvent extends Event {
   @NotNull
   public static final RenderNameTagEvent INSTANCE = new RenderNameTagEvent();
   public static class_10017 state;

   private RenderNameTagEvent() {
   }

   @NotNull
   public final class_10017 getState() {
      class_10017 var10000 = state;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("state");
         return null;
      }
   }

   public final void setState(@NotNull class_10017 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      state = var1;
   }

   public final boolean call(@NotNull class_10017 state) {
      Intrinsics.checkNotNullParameter(state, "state");
      this.setState(state);
      this.setCancelled(false);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
