package su.catlean.mixins.accessors;

import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_310.class})
public interface MinecraftAccessor {
   @Accessor("field_1752")
   int getUseCooldown();

   @Accessor("field_1752")
   void setUseCooldown(int var1);

   @Invoker("method_1583")
   void idoItemUse();

   @Invoker("method_1536")
   boolean idoAttack();
}
