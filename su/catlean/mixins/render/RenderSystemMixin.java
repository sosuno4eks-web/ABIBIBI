package su.catlean.mixins.render;

import com.mojang.blaze3d.systems.RenderSystem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.FlipFrameEvent;

@Mixin(
   value = {RenderSystem.class},
   remap = false
)
public abstract class RenderSystemMixin {
   @Inject(
      method = {"flipFrame"},
      at = {@At("TAIL")}
   )
   private static void flipFrameHook(CallbackInfo ci) {
      FlipFrameEvent.INSTANCE.call();
   }
}
