package su.catlean.mixins.client;

import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2490;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.world.StepOnSlimeEvent;

@Mixin({class_2490.class})
public class SlimeBlockMixin {
   @Inject(
      method = {"method_9591"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onSteppedOnHook(class_1937 world, class_2338 pos, class_2680 state, class_1297 entity, CallbackInfo ci) {
      if (StepOnSlimeEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }
}
