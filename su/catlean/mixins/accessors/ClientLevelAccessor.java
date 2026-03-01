package su.catlean.mixins.accessors;

import net.minecraft.class_1297;
import net.minecraft.class_5582;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_638.class})
public interface ClientLevelAccessor {
   @Accessor("field_27734")
   class_5582<class_1297> iGetEntityLookup();
}
