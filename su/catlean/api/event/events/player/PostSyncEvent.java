package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;

public final class PostSyncEvent extends SyncEvent {
   @NotNull
   public static final PostSyncEvent INSTANCE = new PostSyncEvent();

   private PostSyncEvent() {
   }
}
