package su.catlean.mixins.accessors;

import net.minecraft.class_243;
import net.minecraft.class_2743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2743.class})
public interface ClientboundSetEntityMotionPacketAccessor {
   @Mutable
   @Accessor("field_61887")
   void setMovement(class_243 var1);
}
