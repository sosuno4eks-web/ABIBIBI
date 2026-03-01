package su.catlean.mixins.render;

import net.minecraft.class_10017;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_4587;
import net.minecraft.class_4604;
import net.minecraft.class_898;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.render.RenderEntityEvent;
import su.catlean.api.event.events.render.RenderFireOnEntityEvent;

@Mixin({class_898.class})
public class EntityRenderDispatcherMixin {
   @Inject(
      method = {"method_72976"},
      at = {@At("HEAD")}
   )
   private <S extends class_10017> void onRenderHead(S renderState, class_12075 cameraRenderState, double d, double e, double f, class_4587 matrixStack, class_11659 orderedRenderCommandQueue, CallbackInfo ci) {
      if (RenderFireOnEntityEvent.INSTANCE.call()) {
         renderState.field_53335 = false;
      }

   }

   @Inject(
      method = {"method_3950"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public <E extends class_1297, S extends class_10017> void onRenderEntity(E entity, class_4604 frustum, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
      if (RenderEntityEvent.INSTANCE.call(entity)) {
         cir.setReturnValue(false);
      }

   }
}
