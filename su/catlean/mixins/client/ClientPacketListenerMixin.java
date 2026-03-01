package su.catlean.mixins.client;

import net.minecraft.class_2708;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.network.SendMessageEvent;
import su.catlean.api.event.events.player.FlagEvent;
import su.catlean.api.event.events.world.WorldUpdateEvent;

@Mixin({class_634.class})
public class ClientPacketListenerMixin {
   @Inject(
      method = {"method_11157"},
      cancellable = true,
      at = {@At("RETURN")}
   )
   private void onPlayerPositionLookHook(class_2708 packet, CallbackInfo ci) {
      if ((new FlagEvent()).call(packet)) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_45729"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sendChatMessageHook(String message, CallbackInfo ci) {
      if (SendMessageEvent.INSTANCE.call(message)) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_11136"},
      at = {@At("TAIL")}
   )
   private void onBlockUpdateHook(CallbackInfo ci) {
      (new WorldUpdateEvent()).call();
   }

   @Inject(
      method = {"method_11100"},
      at = {@At("TAIL")}
   )
   private void onChunkDeltaUpdateHook(CallbackInfo ci) {
      (new WorldUpdateEvent()).call();
   }
}
