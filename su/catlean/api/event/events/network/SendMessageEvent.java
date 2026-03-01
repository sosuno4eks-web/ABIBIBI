package su.catlean.api.event.events.network;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class SendMessageEvent extends Event {
   @NotNull
   public static final SendMessageEvent INSTANCE = new SendMessageEvent();
   @NotNull
   private static String message = "";

   private SendMessageEvent() {
   }

   @NotNull
   public final String getMessage() {
      return message;
   }

   public final void setMessage(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      message = var1;
   }

   public final boolean call(@NotNull String message) {
      Intrinsics.checkNotNullParameter(message, "message");
      SendMessageEvent.message = message;
      this.setCancelled(false);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
