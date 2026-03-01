package su.catlean.mixins.render;

import java.nio.file.Path;
import java.util.List;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.FilesDraggedEvent;
import su.catlean.api.event.events.render.RenderGuiBackgroundEvent;
import su.catlean.api.event.events.render.ScreenMouseCoordsEvent;

@Mixin({class_437.class})
public class ScreenMixin {
   @Inject(
      method = {"method_52752"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderInGameBackground(class_332 context, CallbackInfo ci) {
      if (RenderGuiBackgroundEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_25394"},
      at = {@At("HEAD")}
   )
   public void renderHook(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
      ScreenMouseCoordsEvent.INSTANCE.call(mouseX, mouseY);
   }

   @Inject(
      method = {"method_29638"},
      at = {@At("HEAD")}
   )
   public void filesDragged(List<Path> paths, CallbackInfo ci) {
      FilesDraggedEvent.INSTANCE.call(paths);
   }
}
