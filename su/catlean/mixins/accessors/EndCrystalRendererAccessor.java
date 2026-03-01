package su.catlean.mixins.accessors;

import net.minecraft.class_892;
import net.minecraft.class_9946;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_892.class})
public interface EndCrystalRendererAccessor {
   @Accessor("field_53187")
   class_9946 getModel();
}
