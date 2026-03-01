package su.catlean.mixins.render;

import net.minecraft.class_10151;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.ShaderApplyEvent;

@Mixin({class_10151.class})
public abstract class ShaderManagerMixin {
   @Inject(
      method = {"method_62945(Lnet/minecraft/class_10151$class_10153;Lnet/minecraft/class_3300;Lnet/minecraft/class_3695;)V"},
      at = {@At("TAIL")}
   )
   private void applyResourcesHook(CallbackInfo info) {
      ShaderApplyEvent.INSTANCE.call();
   }
}
