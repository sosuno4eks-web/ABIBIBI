package su.catlean.mixins.accessors;

import net.minecraft.class_10860;
import net.minecraft.class_10866;
import net.minecraft.class_10867;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_10866.class})
public interface RenderPassAccessor {
   @Accessor("field_57868")
   void setPipeline(class_10867 var1);

   @Accessor("field_57877")
   class_10860 getEncoder();
}
