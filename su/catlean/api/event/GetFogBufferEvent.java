package su.catlean.api.event;

import org.jetbrains.annotations.NotNull;

public final class GetFogBufferEvent extends Event {
   @NotNull
   public static final GetFogBufferEvent INSTANCE = new GetFogBufferEvent();

   private GetFogBufferEvent() {
   }
}
