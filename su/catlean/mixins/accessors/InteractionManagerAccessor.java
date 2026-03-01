package su.catlean.mixins.accessors;

import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_636.class})
public interface InteractionManagerAccessor {
   @Invoker("method_2911")
   void syncSlot();

   @Accessor("field_3715")
   float getCurBlockDamageMP();

   @Accessor("field_3715")
   void setCurBlockDamageMP(float var1);

   @Accessor("field_3721")
   void setCarriedIndex(int var1);
}
