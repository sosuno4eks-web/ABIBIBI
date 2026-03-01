package dev.redstones.mediaplayerinfo.impl.win;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class WindowsMediaSession implements IMediaSession {
   @NotNull
   private final MediaInfo media;
   @NotNull
   private final String owner;
   private final int index;

   public WindowsMediaSession(@NotNull MediaInfo media, @NotNull String owner, int index) {
      Intrinsics.checkNotNullParameter(media, "media");
      Intrinsics.checkNotNullParameter(owner, "owner");
      super();
      this.media = media;
      this.owner = owner;
      this.index = index;
   }

   @NotNull
   public MediaInfo getMedia() {
      return this.media;
   }

   @NotNull
   public String getOwner() {
      return this.owner;
   }

   public native void play();

   public native void pause();

   public native void playPause();

   public native void stop();

   public native void next();

   public native void previous();
}
