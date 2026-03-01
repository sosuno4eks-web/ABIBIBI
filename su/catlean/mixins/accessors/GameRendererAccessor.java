package su.catlean.mixins.accessors;

import net.minecraft.class_11286;
import net.minecraft.class_11658;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_757.class})
public interface GameRendererAccessor {
   @Invoker("method_3172")
   void iRenderHand(float var1, boolean var2, Matrix4f var3);

   @Invoker("method_3196")
   float iGetFov(class_4184 var1, float var2, boolean var3);

   @Invoker("method_3198")
   void itiltViewWhenHurt(class_4587 var1, float var2);

   @Invoker("method_3186")
   void ibobView(class_4587 var1, float var2);

   @Accessor("field_60105")
   class_11286 getLevelProjectionMatrixBuffer();

   @Accessor("field_61732")
   class_11658 getLevelRenderState();
}
