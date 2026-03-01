package dev.redstones.mediaplayerinfo;

import java.util.List;
import org.jetbrains.annotations.NotNull;

public interface MediaPlayerInfo {
   @NotNull
   MediaPlayerInfo.Instance Instance = MediaPlayerInfo.Instance.$$INSTANCE;

   @NotNull
   List<IMediaSession> getMediaSessions();

   public static final class Instance implements MediaPlayerInfo {
      // $FF: synthetic field
      static final MediaPlayerInfo.Instance $$INSTANCE = new MediaPlayerInfo.Instance();
      // $FF: synthetic field
      private final MediaPlayerInfo $$delegate_0 = MediaPlayerInfoKt.getSystemMediaPlayerInfo();

      private Instance() {
      }

      @NotNull
      public List<IMediaSession> getMediaSessions() {
         return this.$$delegate_0.getMediaSessions();
      }
   }
}
