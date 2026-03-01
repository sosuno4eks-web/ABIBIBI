package su.catlean.mixins.accessors;

import net.minecraft.class_2824;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2824.class})
public interface ServerboundInteractPacketAccessor {
   @Mutable
   @Accessor("field_12870")
   void setEntityId(int var1);
}
