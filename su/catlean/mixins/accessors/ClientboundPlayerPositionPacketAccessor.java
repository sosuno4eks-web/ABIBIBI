package su.catlean.mixins.accessors;

import net.minecraft.class_10182;
import net.minecraft.class_2708;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2708.class})
public interface ClientboundPlayerPositionPacketAccessor {
   @Mutable
   @Accessor("comp_3228")
   void setChange(class_10182 var1);
}
