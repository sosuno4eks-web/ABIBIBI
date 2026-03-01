package su.catlean.mixins.render;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.player.UpdateCrosshairTarget;
import su.catlean.api.event.events.render.BasicProjectionMatrixEvent;
import su.catlean.api.event.events.render.HurtTiltEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.render.RenderHandEvent;
import su.catlean.api.event.events.render.RenderScreenEvent;
import su.catlean.api.event.events.render.ShowFloatingItemEvent;

@Mixin({class_757.class})
public abstract class GameRendererMixin {
   @Shadow
   public abstract float method_32796();

   @Inject(
      method = {"method_3188"},
      at = {@At(
   value = "INVOKE",
   target = "Lcom/mojang/blaze3d/systems/CommandEncoder;clearDepthTexture(Lcom/mojang/blaze3d/textures/GpuTexture;D)V",
   shift = Shift.BEFORE
)}
   )
   void render3dHook(class_9779 renderTickCounter, CallbackInfo ci, @Local(ordinal = 0) Matrix4f projection) {
      class_4184 camera = class_310.method_1551().field_1773.method_19418();
      class_4587 matrixStack = new class_4587();
      RenderSystem.getModelViewStack().pushMatrix().mul(matrixStack.method_23760().method_23761());
      matrixStack.method_22907(class_7833.field_40714.rotationDegrees(camera.method_19329()));
      matrixStack.method_22907(class_7833.field_40716.rotationDegrees(camera.method_19330() + 180.0F));
      Render3DEvent.INSTANCE.call(matrixStack, projection);
      RenderSystem.getModelViewStack().popMatrix();
   }

   @Inject(
      method = {"method_3190"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_76762(FLnet/minecraft/class_1297;)Lnet/minecraft/class_239;"
)},
      cancellable = true
   )
   private void onUpdateTargetedEntity(float tickDelta, CallbackInfo info) {
      if (UpdateCrosshairTarget.INSTANCE.call()) {
         info.cancel();
      }

   }

   @Inject(
      method = {"method_3192"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_332;method_74036(Lnet/minecraft/class_1041;)V"
)}
   )
   private void render2dHook(class_9779 tickCounter, boolean tick, CallbackInfo ci, @Local(ordinal = 0) class_332 dc) {
      if (class_310.method_1551().field_1724 != null && class_310.method_1551().field_1687 != null) {
         RenderScreenEvent.INSTANCE.call(dc);
      }

   }

   @Inject(
      method = {"method_3172"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderHand(float tickProgress, boolean sleeping, Matrix4f positionMatrix, CallbackInfo ci) {
      if (RenderHandEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_3189"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void showFloatingItemHook(class_1799 floatingItem, CallbackInfo info) {
      if (ShowFloatingItemEvent.INSTANCE.call(floatingItem)) {
         info.cancel();
      }

   }

   @Inject(
      method = {"method_3198"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void tiltViewWhenHurtHook(class_4587 matrices, float tickDelta, CallbackInfo ci) {
      if (HurtTiltEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_22973"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getBasicProjectionMatrixHook(float fovDegrees, CallbackInfoReturnable<Matrix4f> cir) {
      BasicProjectionMatrixEvent.INSTANCE.setFov(fovDegrees);
      if (BasicProjectionMatrixEvent.INSTANCE.call()) {
         Matrix4f matrix4f = new Matrix4f();
         float zoom = BasicProjectionMatrixEvent.INSTANCE.getZoom();
         float zoomX = BasicProjectionMatrixEvent.INSTANCE.getZoomX();
         float zoomY = BasicProjectionMatrixEvent.INSTANCE.getZoomY();
         float fov = BasicProjectionMatrixEvent.INSTANCE.getFov();
         if (zoom != 1.0F) {
            matrix4f.translate(zoomX, -zoomY, 0.0F);
            matrix4f.scale(zoom, zoom, 1.0F);
         }

         cir.setReturnValue(matrix4f.perspective(fov * 0.017453292F, BasicProjectionMatrixEvent.INSTANCE.getRatio(), 0.05F, this.method_32796()));
         cir.cancel();
      }

   }
}
