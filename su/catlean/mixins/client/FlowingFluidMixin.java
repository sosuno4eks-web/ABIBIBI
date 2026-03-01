package su.catlean.mixins.client;

import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3609;
import net.minecraft.class_3610;
import net.minecraft.class_3611;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.world.WaterPushEvent;

@Mixin({class_3609.class})
public abstract class FlowingFluidMixin {
   @Inject(
      method = {"method_15782"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getVelocityHook(class_1922 world, class_2338 pos, class_3610 state, CallbackInfoReturnable<class_243> cir) {
      if (WaterPushEvent.INSTANCE.call(pos, (class_3611)this, state, class_243.field_1353)) {
         cir.setReturnValue(WaterPushEvent.INSTANCE.getVec());
      }

   }
}
