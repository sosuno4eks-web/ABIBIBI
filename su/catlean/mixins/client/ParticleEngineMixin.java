package su.catlean.mixins.client;

import net.minecraft.class_702;
import net.minecraft.class_703;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.RenderParticleEvent;

@Mixin({class_702.class})
public class ParticleEngineMixin {
   @Inject(
      at = {@At("HEAD")},
      method = {"method_3058(Lnet/minecraft/class_703;)V"},
      cancellable = true
   )
   public void addParticleHook(class_703 particle, CallbackInfo ci) {
      if (RenderParticleEvent.INSTANCE.call(particle)) {
         ci.cancel();
      }

   }
}
