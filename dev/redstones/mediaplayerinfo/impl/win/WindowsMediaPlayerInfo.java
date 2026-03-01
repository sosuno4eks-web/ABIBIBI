package dev.redstones.mediaplayerinfo.impl.win;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class WindowsMediaPlayerInfo implements MediaPlayerInfo {
   @NotNull
   public static final WindowsMediaPlayerInfo INSTANCE = new WindowsMediaPlayerInfo();

   private WindowsMediaPlayerInfo() {
   }

   @NotNull
   public native List<IMediaSession> getMediaSessions();

   static {
      File dllFile = Files.createTempDirectory("mediaplayerinfo-").resolve("MediaPlayerInfo.dll").toFile();
      Intrinsics.checkNotNull(dllFile);
      InputStream var10001 = INSTANCE.getClass().getResourceAsStream("/mediaplayerinfo/natives/win/MediaPlayerInfo.dll");
      Intrinsics.checkNotNull(var10001);
      byte[] var1 = var10001.readAllBytes();
      Intrinsics.checkNotNullExpressionValue(var1, "readAllBytes(...)");
      FilesKt.writeBytes(dllFile, var1);
      System.load(dllFile.getCanonicalPath());
   }
}
