package su.catlean.mixins.accessors;

import net.minecraft.class_241;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_744.class})
public interface ClientInputAccessor {
   @Accessor("field_55868")
   void setMoveVector(class_241 var1);
}
