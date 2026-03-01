package dev.redstones.mediaplayerinfo;

import org.jetbrains.annotations.NotNull;

public interface IMediaSession {
   @NotNull
   String getOwner();

   @NotNull
   MediaInfo getMedia();

   void play();

   void pause();

   void playPause();

   void stop();

   void next();

   void previous();
}
