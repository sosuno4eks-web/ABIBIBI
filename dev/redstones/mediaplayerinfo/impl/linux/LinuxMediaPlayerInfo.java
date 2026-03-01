package dev.redstones.mediaplayerinfo.impl.linux;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.linux.dbus.Player;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.freedesktop.dbus.connections.impl.DBusConnection;
import org.freedesktop.dbus.connections.impl.DBusConnectionBuilder;
import org.freedesktop.dbus.interfaces.DBus;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.interfaces.Properties;
import org.jetbrains.annotations.NotNull;

public final class LinuxMediaPlayerInfo implements MediaPlayerInfo {
   @NotNull
   public static final LinuxMediaPlayerInfo INSTANCE = new LinuxMediaPlayerInfo();
   private static final DBusConnection conn = DBusConnectionBuilder.forSessionBus().build();
   private static final DBus dbus;

   private LinuxMediaPlayerInfo() {
   }

   @NotNull
   public List<IMediaSession> getMediaSessions() {
      String[] var10000 = dbus.ListNames();
      Intrinsics.checkNotNullExpressionValue(var10000, "ListNames(...)");
      Object[] $this$filter$iv = (Object[])var10000;
      int $i$f$filter = false;
      Object[] $this$filterTo$iv$iv = $this$filter$iv;
      Collection destination$iv$iv = (Collection)(new ArrayList());
      int $i$f$filterTo = false;
      int var6 = 0;

      for(int var7 = $this$filter$iv.length; var6 < var7; ++var6) {
         Object element$iv$iv = $this$filterTo$iv$iv[var6];
         String it = (String)element$iv$iv;
         int var10 = false;
         Intrinsics.checkNotNull(it);
         if (StringsKt.startsWith$default(it, "org.mpris.MediaPlayer2.", false, 2, (Object)null)) {
            destination$iv$iv.add(element$iv$iv);
         }
      }

      Iterable $this$filter$iv = (Iterable)((List)destination$iv$iv);
      $i$f$filter = false;
      destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)));
      $i$f$filterTo = false;
      Iterator var13 = $this$filter$iv.iterator();

      Object element$iv$iv;
      boolean var17;
      while(var13.hasNext()) {
         element$iv$iv = var13.next();
         String it = (String)element$iv$iv;
         var17 = false;
         DBusInterface var10002 = conn.getRemoteObject(it, "/org/mpris/MediaPlayer2", Player.class);
         Intrinsics.checkNotNullExpressionValue(var10002, "getRemoteObject(...)");
         Player var18 = (Player)var10002;
         Intrinsics.checkNotNull(it);
         destination$iv$iv.add(new LinuxMediaSession(var18, StringsKt.removePrefix(it, (CharSequence)"org.mpris.MediaPlayer2.")));
      }

      $this$filter$iv = (Iterable)((List)destination$iv$iv);
      $i$f$filter = false;
      destination$iv$iv = (Collection)(new ArrayList());
      $i$f$filterTo = false;
      var13 = $this$filter$iv.iterator();

      while(var13.hasNext()) {
         element$iv$iv = var13.next();
         LinuxMediaSession it = (LinuxMediaSession)element$iv$iv;
         var17 = false;
         if (!Intrinsics.areEqual((Object)INSTANCE.getProperty$MediaPlayerInfo(it.getOwner(), "PlaybackStatus"), (Object)"Stopped")) {
            destination$iv$iv.add(element$iv$iv);
         }
      }

      return (List)destination$iv$iv;
   }

   public final <T> T getProperty$MediaPlayerInfo(@NotNull String owner, @NotNull String property) {
      Intrinsics.checkNotNullParameter(owner, "owner");
      Intrinsics.checkNotNullParameter(property, "property");
      Properties properties = (Properties)conn.getRemoteObject("org.mpris.MediaPlayer2." + owner, "/org/mpris/MediaPlayer2", Properties.class);
      return properties.Get("org.mpris.MediaPlayer2.Player", property);
   }

   static {
      dbus = (DBus)conn.getRemoteObject("org.freedesktop.DBus", "/", DBus.class);
   }
}
