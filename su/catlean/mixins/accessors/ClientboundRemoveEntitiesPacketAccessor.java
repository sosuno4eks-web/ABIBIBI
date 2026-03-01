package su.catlean.mixins.accessors;

import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.class_2716;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2716.class})
public interface ClientboundRemoveEntitiesPacketAccessor {
   @Accessor("field_33690")
   IntList getIds();

   @Mutable
   @Accessor("field_33690")
   void setIds(IntList var1);
}
