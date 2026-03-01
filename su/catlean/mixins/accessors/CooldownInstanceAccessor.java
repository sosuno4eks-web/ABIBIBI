package su.catlean.mixins.accessors;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.gen.Accessor;

@Pseudo
@Mixin(
   targets = {"net/minecraft/class_1796$class_1797"}
)
public interface CooldownInstanceAccessor {
   @Accessor("comp_3084")
   int getEndTime();
}
