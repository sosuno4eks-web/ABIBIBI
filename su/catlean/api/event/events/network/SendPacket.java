package su.catlean.api.event.events.network;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2596;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

public final class SendPacket extends Event {
   @NotNull
   private final class_2596<?> packet;

   public SendPacket(@NotNull class_2596<?> packet) {
      Intrinsics.checkNotNullParameter(packet, "packet");
      super();
      this.packet = packet;
   }

   @NotNull
   public final class_2596<?> getPacket() {
      return this.packet;
   }
}
