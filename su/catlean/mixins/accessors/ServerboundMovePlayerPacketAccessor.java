package su.catlean.mixins.accessors;

import net.minecraft.class_2828;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2828.class})
public interface ServerboundMovePlayerPacketAccessor {
   @Mutable
   @Accessor("field_29179")
   void setGround(boolean var1);
}
