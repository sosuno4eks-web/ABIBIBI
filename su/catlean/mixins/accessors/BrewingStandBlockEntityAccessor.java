package su.catlean.mixins.accessors;

import net.minecraft.class_2589;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2589.class})
public interface BrewingStandBlockEntityAccessor {
   @Accessor("field_11878")
   int getBrewTime();
}
