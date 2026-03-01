package su.catlean.mixins.accessors;

import net.minecraft.class_11246;
import net.minecraft.class_332;
import net.minecraft.class_332.class_8214;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_332.class})
public interface GuiGraphicsAccessor {
   @Accessor("field_59826")
   class_11246 getGuiRenderState();

   @Accessor("field_44659")
   class_8214 getScissorStack();
}
