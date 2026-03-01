package su.catlean.mixins.world;

import net.minecraft.class_1657;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_4970;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.player.CalcBlockBreakingDeltaEvent;

@Mixin({class_4970.class})
public class BlockBehaviourMixin {
   @Inject(
      method = {"method_9594"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void calcBlockBreakingDeltaHook(class_2680 state, class_1657 player, class_1922 world, class_2338 pos, CallbackInfoReturnable<Float> ci) {
      if (CalcBlockBreakingDeltaEvent.INSTANCE.call(pos, state)) {
         ci.setReturnValue(CalcBlockBreakingDeltaEvent.INSTANCE.getDelta());
      }

   }
}
