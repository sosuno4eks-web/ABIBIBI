package su.catlean.mixins.accessors;

import java.util.Optional;
import net.minecraft.class_243;
import net.minecraft.class_2664;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2664.class})
public interface ClientboundExplodePacketAccessor {
   @Mutable
   @Accessor("comp_2884")
   void setPlayerKnockback(Optional<class_243> var1);
}
