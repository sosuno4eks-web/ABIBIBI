package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;

public final class PreSyncEvent extends SyncEvent {
   @NotNull
   public static final PreSyncEvent INSTANCE = new PreSyncEvent();

   private PreSyncEvent() {
   }
}
