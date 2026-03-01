package su.catlean.api.event.events.world;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class BlockStateEvent extends Event {
   @NotNull
   public static final BlockStateEvent INSTANCE = new BlockStateEvent();
   private static class_2338 pos;
   @Nullable
   private static class_2680 prevState;
   @Nullable
   private static class_2680 state;

   private BlockStateEvent() {
   }

   @NotNull
   public final class_2338 getPos() {
      class_2338 var10000 = pos;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("pos");
         return null;
      }
   }

   @Nullable
   public final class_2680 getPrevState() {
      return prevState;
   }

   public final void setPrevState(@Nullable class_2680 <set-?>) {
      prevState = var1;
   }

   @Nullable
   public final class_2680 getState() {
      return state;
   }

   public final boolean call(@NotNull class_2338 pos, @Nullable class_2680 prevState, @Nullable class_2680 state) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      this.setCancelled(false);
      BlockStateEvent.pos = pos;
      BlockStateEvent.state = state;
      BlockStateEvent.prevState = prevState;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
