package su.catlean.mixins.accessors;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.minecraft.class_10865;
import net.minecraft.class_10867;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_10865.class})
public interface GlDeviceAccessor {
   @Invoker("method_68381")
   class_10867 compilePipelineCachedCatlean(RenderPipeline var1);
}
