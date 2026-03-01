package su.catlean.mixins.render;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_758;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import su.catlean.api.event.GetFogBufferEvent;
import su.catlean.api.event.events.world.ApplyFogEvent;

@Mixin({class_758.class})
public abstract class FogRendererMixin {
   @ModifyVariable(
      method = {"method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private Vector4f applyFogHook(Vector4f original) {
      return original.w != 0.0F && ApplyFogEvent.INSTANCE.call() ? ApplyFogEvent.INSTANCE.getColorVec() : original;
   }

   @ModifyVariable(
      method = {"method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"},
      at = @At("HEAD"),
      argsOnly = true,
      index = 4
   )
   private float modifyEnvironmentalStart(float value) {
      return ApplyFogEvent.INSTANCE.call() ? ApplyFogEvent.INSTANCE.getEStart() : value;
   }

   @ModifyVariable(
      method = {"method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"},
      at = @At("HEAD"),
      argsOnly = true,
      index = 5
   )
   private float envEndHook(float value) {
      return ApplyFogEvent.INSTANCE.call() ? ApplyFogEvent.INSTANCE.getEEnd() : value;
   }

   @ModifyVariable(
      method = {"method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"},
      at = @At("HEAD"),
      argsOnly = true,
      index = 6
   )
   private float renderStartHook(float value) {
      return ApplyFogEvent.INSTANCE.call() ? ApplyFogEvent.INSTANCE.getRStart() : value;
   }

   @ModifyVariable(
      method = {"method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"},
      at = @At("HEAD"),
      argsOnly = true,
      index = 7
   )
   private float renderEndHook(float value) {
      return ApplyFogEvent.INSTANCE.call() ? ApplyFogEvent.INSTANCE.getREnd() : value;
   }

   @ModifyExpressionValue(
      method = {"method_71109"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/class_758;field_54018:Z"
)}
   )
   private boolean getFogBufferHook(boolean value) {
      return GetFogBufferEvent.INSTANCE.call() ? false : value;
   }
}
