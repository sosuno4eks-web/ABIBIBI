package su.catlean.mixins.accessors;

import net.minecraft.class_11910;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_312.class})
public interface MouseHandlerAccessor {
   @Invoker("method_1601")
   void iMouseClick(long var1, class_11910 var3, int var4);
}
