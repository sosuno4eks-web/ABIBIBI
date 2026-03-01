package su.catlean.mixins.accessors;

import net.minecraft.class_10860;
import net.minecraft.class_10865;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_10860.class})
public interface GlCommandEncoderAccessor {
   @Accessor("field_57844")
   class_10865 getBackendCatlean();
}
