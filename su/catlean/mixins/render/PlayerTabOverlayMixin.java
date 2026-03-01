package su.catlean.mixins.render;

import net.minecraft.class_355;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import su.catlean.api.event.events.network.PlayerListSizeEvent;

@Mixin({class_355.class})
public class PlayerTabOverlayMixin {
   @ModifyArgs(
      method = {"method_48213"},
      at = @At(
   value = "INVOKE",
   target = "Ljava/util/stream/Stream;limit(J)Ljava/util/stream/Stream;"
)
   )
   private void collectPlayerEntriesHook(Args args) {
      if (PlayerListSizeEvent.INSTANCE.call()) {
         args.set(0, 1000L);
      }

   }
}
