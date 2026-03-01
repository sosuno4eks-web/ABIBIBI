package su.catlean.mixins.render;

import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.class_332;
import net.minecraft.class_4011;
import net.minecraft.class_425;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_425.class})
public abstract class MixinLoadingOverlay {
   @Final
   @Shadow
   private boolean field_18219;
   @Shadow
   private float field_17770;
   @Shadow
   private long field_17771 = -1L;
   @Shadow
   private long field_18220 = -1L;
   @Final
   @Shadow
   private class_4011 field_17767;
   @Final
   @Shadow
   private Consumer<Optional<Throwable>> field_18218;

   @Inject(
      method = {"method_25394"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void render(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
   }
}
