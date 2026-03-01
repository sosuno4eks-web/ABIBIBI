package su.catlean.mixins.accessors;

import net.minecraft.class_2663;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2663.class})
public interface ClientboundEntityEventPacketAccessor {
   @Accessor("field_12175")
   int getEntityId();
}
