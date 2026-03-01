package su.catlean.mixins.render;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import net.minecraft.class_11658;
import net.minecraft.class_4184;
import net.minecraft.class_4604;
import net.minecraft.class_761;
import net.minecraft.class_9779;
import net.minecraft.class_9909;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.FrustrumEvent;
import su.catlean.api.event.events.render.SetupTerrainEvent;
import su.catlean.api.event.events.render.WeatherRenderEvent;
import su.catlean.api.event.events.world.ApplyFogEvent;

@Mixin({class_761.class})
public class LevelRendererMixin {
   @ModifyArg(
      method = {"method_22710"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_761;method_74752(Lnet/minecraft/class_4184;Lnet/minecraft/class_4604;Z)V"
),
      index = 2
   )
   private boolean renderHook(boolean spectator) {
      return SetupTerrainEvent.INSTANCE.call() || spectator;
   }

   @Inject(
      method = {"method_72917"},
      at = {@At("HEAD")}
   )
   private void frustrumHook(class_4184 camera, class_4604 frustum, class_9779 tickCounter, class_11658 renderStates, CallbackInfo ci) {
      FrustrumEvent.INSTANCE.setFrustrum(frustum);
      FrustrumEvent.INSTANCE.call();
   }

   @ModifyVariable(
      method = {"method_22710(Lnet/minecraft/class_9922;Lnet/minecraft/class_9779;ZLnet/minecraft/class_4184;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;Z)V"},
      at = @At("HEAD"),
      argsOnly = true,
      index = 9
   )
   private Vector4f getFogColorHook(Vector4f value) {
      return ApplyFogEvent.INSTANCE.call() ? ApplyFogEvent.INSTANCE.getColorVec() : value;
   }

   @Inject(
      method = {"method_62203(Lnet/minecraft/class_9909;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderWeatherHook(class_9909 frameGraphBuilder, GpuBufferSlice gpuBufferSlice, CallbackInfo ci) {
      if (WeatherRenderEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }
}
