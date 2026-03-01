package su.catlean.mixins.accessors;

import java.util.List;
import net.minecraft.class_630;
import net.minecraft.class_630.class_628;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_630.class})
public interface ModelPartAccessor {
   @Accessor("field_3663")
   List<class_628> getCuboidsList();
}
