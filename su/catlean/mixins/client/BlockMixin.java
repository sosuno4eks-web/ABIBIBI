package su.catlean.mixins.client;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.render.XRayBlockEvent;
import su.catlean.api.event.events.world.SlipperinessEvent;
import su.catlean.api.event.events.world.VelocityMultiplierEvent;

@Mixin({class_2248.class})
public class BlockMixin {
   @Inject(
      method = {"method_23349"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getVelocityMultiplierHook(CallbackInfoReturnable<Float> cir) {
      if (VelocityMultiplierEvent.INSTANCE.call((class_2248)this)) {
         cir.setReturnValue(class_2246.field_10566.method_23349());
      }

   }

   @Inject(
      method = {"method_9499"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getSlipperinessHook(CallbackInfoReturnable<Float> cir) {
      if (SlipperinessEvent.INSTANCE.call((class_2248)this)) {
         cir.setReturnValue(class_2246.field_10566.method_9499());
      }

   }

   @ModifyReturnValue(
      method = {"method_9607"},
      at = {@At("RETURN")}
   )
   private static boolean shouldDrawSideHook(boolean original, class_2680 state, class_2680 otherState, class_2350 side) {
      if (GofraState.INSTANCE.getXray()) {
         XRayBlockEvent event = new XRayBlockEvent();
         event.call(state.method_26204());
         return event.getCancelled();
      } else {
         return original;
      }
   }
}
