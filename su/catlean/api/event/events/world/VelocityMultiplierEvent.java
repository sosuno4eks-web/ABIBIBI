package su.catlean.api.event.events.world;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2248;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class VelocityMultiplierEvent extends Event {
   @NotNull
   public static final VelocityMultiplierEvent INSTANCE = new VelocityMultiplierEvent();
   private static class_2248 block;

   private VelocityMultiplierEvent() {
   }

   @NotNull
   public final class_2248 getBlock() {
      class_2248 var10000 = block;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("block");
         return null;
      }
   }

   public final boolean call(@NotNull class_2248 block) {
      Intrinsics.checkNotNullParameter(block, "block");
      this.setCancelled(false);
      VelocityMultiplierEvent.block = block;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
