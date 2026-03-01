package su.catlean.mixins.accessors;

import java.util.Map;
import java.util.SequencedMap;
import net.minecraft.class_1921;
import net.minecraft.class_287;
import net.minecraft.class_9799;
import net.minecraft.class_4597.class_4598;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_4598.class})
public interface ImmediateAccessor {
   @Accessor("field_20953")
   SequencedMap<class_1921, class_9799> getLayers();

   @Accessor("field_52158")
   class_1921 getLastSharedType();

   @Accessor("field_52158")
   void setLastSharedType(class_1921 var1);

   @Accessor("field_52156")
   class_9799 getSharedBuffer();

   @Accessor("field_52157")
   Map<class_1921, class_287> getStartedBuilders();
}
