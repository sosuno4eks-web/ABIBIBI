package dev.redstones.mediaplayerinfo.impl;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

public final class DummyMediaPlayerInfo implements MediaPlayerInfo {
   @NotNull
   public static final DummyMediaPlayerInfo INSTANCE = new DummyMediaPlayerInfo();

   private DummyMediaPlayerInfo() {
   }

   @NotNull
   public List<IMediaSession> getMediaSessions() {
      return CollectionsKt.emptyList();
   }
}
