package su.catlean.mixins.render;

import net.minecraft.class_10017;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_4587;
import net.minecraft.class_4604;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.render.RenderNameTagEvent;
import su.catlean.api.event.events.render.ShouldRenderEntityEvent;

@Mixin({class_897.class})
public abstract class EntityRendererMixin<T extends class_1297, S extends class_10017> {
   @Inject(
      method = {"method_3926"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderLabelIfPresent(S state, class_4587 matrices, class_11659 queue, class_12075 cameraRenderState, CallbackInfo ci) {
      if (RenderNameTagEvent.INSTANCE.call(state)) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_3933"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void shouldRender(T entity, class_4604 frustum, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
      if (GofraState.INSTANCE.getShouldRender() && ShouldRenderEntityEvent.INSTANCE.call(entity)) {
         cir.setReturnValue(false);
      }

   }
}
