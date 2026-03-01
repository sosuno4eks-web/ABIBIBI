package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2708;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class FlagEvent extends Event {
   @Nullable
   private class_2708 pos;

   @Nullable
   public final class_2708 getPos() {
      return this.pos;
   }

   public final void setPos(@Nullable class_2708 <set-?>) {
      this.pos = var1;
   }

   public final boolean call(@NotNull class_2708 pos) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      this.setCancelled(false);
      this.pos = pos;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
