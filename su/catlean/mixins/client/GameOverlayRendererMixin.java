package su.catlean.mixins.client;

import net.minecraft.class_1058;
import net.minecraft.class_11659;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4603;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.RenderFireOverlayEvent;
import su.catlean.api.event.events.render.RenderFloatingItemEvent;
import su.catlean.api.event.events.render.RenderInWallOverlayEvent;
import su.catlean.api.event.events.render.RenderUnderwaterOverlayEvent;

@Mixin({class_4603.class})
public class GameOverlayRendererMixin {
   @Inject(
      method = {"method_23070"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void renderFireOverlayHook(class_4587 matrices, class_4597 vertexConsumers, class_1058 sprite, CallbackInfo ci) {
      if (RenderFireOverlayEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_70939"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderFloatingItemHook(class_4587 matrices, float tickProgress, class_11659 queue, CallbackInfo ci) {
      if (RenderFloatingItemEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_23069"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void renderUnderwaterOverlayHook(class_310 client, class_4587 matrices, class_4597 vertexConsumers, CallbackInfo ci) {
      if (RenderUnderwaterOverlayEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_23068"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void renderInWallOverlayHook(class_1058 sprite, class_4587 matrices, class_4597 vertexConsumers, CallbackInfo ci) {
      if (RenderInWallOverlayEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }
}
