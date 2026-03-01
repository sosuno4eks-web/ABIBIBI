package dev.redstones.mediaplayerinfo.impl.linux.dbus;

import java.util.Map;
import org.freedesktop.dbus.TypeRef;
import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.annotations.DBusProperties;
import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.annotations.DBusProperty.Access;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.types.Variant;

@DBusInterfaceName("org.mpris.MediaPlayer2.Player")
@DBusProperties({@DBusProperty(
   name = "Metadata",
   type = Player.PropertyMetadataType.class,
   access = Access.READ
), @DBusProperty(
   name = "PlaybackStatus",
   type = String.class,
   access = Access.READ
), @DBusProperty(
   name = "LoopStatus",
   type = String.class,
   access = Access.READ_WRITE
), @DBusProperty(
   name = "Volume",
   type = double.class,
   access = Access.READ_WRITE
), @DBusProperty(
   name = "Shuffle",
   type = double.class,
   access = Access.READ_WRITE
), @DBusProperty(
   name = "Position",
   type = Integer.class,
   access = Access.READ
), @DBusProperty(
   name = "Rate",
   type = double.class,
   access = Access.READ_WRITE
), @DBusProperty(
   name = "MinimumRate",
   type = double.class,
   access = Access.READ_WRITE
), @DBusProperty(
   name = "MaximumRate",
   type = double.class,
   access = Access.READ_WRITE
), @DBusProperty(
   name = "CanControl",
   type = boolean.class,
   access = Access.READ
), @DBusProperty(
   name = "CanPlay",
   type = boolean.class,
   access = Access.READ
), @DBusProperty(
   name = "CanPause",
   type = boolean.class,
   access = Access.READ
), @DBusProperty(
   name = "CanSeek",
   type = boolean.class,
   access = Access.READ
)})
public interface Player extends DBusInterface {
   void Play();

   void Pause();

   void PlayPause();

   void Stop();

   void Next();

   void Previous();

   public interface PropertyMetadataType extends TypeRef<Map<String, ? extends Variant<?>>> {
   }
}
