package su.catlean;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;

public interface h5 {
   void m(char var1, @NotNull PreSyncEvent var2, long var3);

   void i(long var1, @NotNull PreElytraEvent var3);

   void p(@NotNull AfterElytraEvent var1, long var2);

   void T(@NotNull MoveEvent var1, long var2);

   void y(long var1, @NotNull AfterSendPacket var3);

   void D(long var1, @NotNull ReceivePacket var3);

   void n(int var1, @NotNull PlayerUpdateEvent var2, char var3, int var4);

   void l(long var1);

   void y(long var1);

   void B(long var1, @NotNull FireWorkVelocityEvent var3);

   void o(@NotNull SetPoseEvent var1);

   void n(@NotNull ReceivePacket var1, long var2);
}
