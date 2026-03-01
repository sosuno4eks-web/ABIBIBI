package su.catlean.mixins.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import java.util.concurrent.atomic.AtomicReference;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import net.minecraft.class_2598;
import net.minecraft.class_310;
import net.minecraft.class_8042;
import net.minecraft.class_8762;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.network.AddHandlersEvent;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;

@Mixin({class_2535.class})
public class ConnectionMixin {
   @Inject(
      method = {"method_10770(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void channelRead0(ChannelHandlerContext channelHandlerContext, class_2596<?> packet, CallbackInfo info) {
      if (class_310.method_1551().field_1724 != null && packet != null) {
         if (packet instanceof class_8042) {
            class_8042 packs = (class_8042)packet;
            packs.method_48324().forEach((p) -> {
               if ((new ReceivePacket(p)).call()) {
                  info.cancel();
               }

            });
         } else if ((new ReceivePacket(packet)).call()) {
            info.cancel();
         }

      }
   }

   @Inject(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onSendPacketPre(class_2596<?> packet, CallbackInfo info) {
      if (class_310.method_1551().field_1724 != null) {
         if ((new SendPacket(packet)).call()) {
            info.cancel();
         }

      }
   }

   @Inject(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void onSendPacketPost(class_2596<?> packet, CallbackInfo info) {
      if (class_310.method_1551().field_1724 != null) {
         if ((new AfterSendPacket(packet)).call()) {
            info.cancel();
         }

      }
   }

   @Inject(
      method = {"method_48311"},
      at = {@At("RETURN")}
   )
   private static void addHandlersHook(ChannelPipeline pipeline, class_2598 side, boolean local, class_8762 packetSizeLogger, CallbackInfo ci) {
      AddHandlersEvent.INSTANCE.call(new AtomicReference(pipeline), side, local);
   }
}
