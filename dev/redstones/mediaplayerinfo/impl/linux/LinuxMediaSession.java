package dev.redstones.mediaplayerinfo.impl.linux;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.impl.linux.dbus.Player;
import java.net.URL;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.freedesktop.dbus.DBusMap;
import org.jetbrains.annotations.NotNull;

public final class LinuxMediaSession implements IMediaSession {
   @NotNull
   private final Player dbus;
   @NotNull
   private final String owner;
   @NotNull
   private final MediaInfo media;

   public LinuxMediaSession(@NotNull Player dbus, @NotNull String owner) {
      Intrinsics.checkNotNullParameter(dbus, "dbus");
      Intrinsics.checkNotNullParameter(owner, "owner");
      super();
      this.dbus = dbus;
      this.owner = owner;
      this.media = this.generateMediaInfo();
   }

   @NotNull
   public String getOwner() {
      return this.owner;
   }

   @NotNull
   public MediaInfo getMedia() {
      return this.media;
   }

   public void play() {
      this.dbus.Play();
   }

   public void pause() {
      this.dbus.Pause();
   }

   public void playPause() {
      this.dbus.PlayPause();
   }

   public void stop() {
      this.dbus.Stop();
   }

   public void next() {
      this.dbus.Next();
   }

   public void previous() {
      this.dbus.Previous();
   }

   private final MediaInfo generateMediaInfo() {
      DBusMap metadata = (DBusMap)LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(this.getOwner(), "Metadata");
      boolean playing = Intrinsics.areEqual((Object)LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(this.getOwner(), "PlaybackStatus"), (Object)"Playing");
      long position = (long)((Number)LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(this.getOwner(), "Position")).doubleValue() / (long)1000000;
      Object var10000 = metadata.get("mpris:length");
      Intrinsics.checkNotNull(var10000);
      long duration = Long.parseLong(var10000.toString()) / (long)1000000;
      var10000 = metadata.get("xesam:title");
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.String");
      String title = (String)var10000;
      Object $this$generateMediaInfo_u24lambda_u240 = metadata.get("xesam:artist");
      int var11 = false;
      String var13;
      if ($this$generateMediaInfo_u24lambda_u240 instanceof String) {
         var13 = (String)$this$generateMediaInfo_u24lambda_u240;
      } else {
         Intrinsics.checkNotNull($this$generateMediaInfo_u24lambda_u240, "null cannot be cast to non-null type kotlin.collections.List<*>");
         var13 = CollectionsKt.joinToString$default((Iterable)((List)$this$generateMediaInfo_u24lambda_u240), (CharSequence)", ", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null);
      }

      String artist = var13;
      Object artworkUrl = metadata.get("mpris:artUrl");
      byte[] artwork = artworkUrl instanceof String ? TextStreamsKt.readBytes(new URL((String)artworkUrl)) : new byte[0];
      return new MediaInfo(title, artist, artwork, position, duration, playing);
   }
}
