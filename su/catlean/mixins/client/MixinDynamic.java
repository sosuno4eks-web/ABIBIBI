package su.catlean.mixins.client;

import net.minecraft.class_9779.class_9781;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.client.TickFactorEvent;

@Mixin({class_9781.class})
public class MixinDynamic {
   @Shadow
   private float field_51958;
   @Shadow
   private float field_51959;
   @Shadow
   private long field_51962;
   @Final
   @Shadow
   private float field_51964;

   @Inject(
      method = {"method_60639(J)I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void beginRenderTickHook(long timeMillis, CallbackInfoReturnable<Integer> cir) {
      if (TickFactorEvent.INSTANCE.call()) {
         this.field_51958 = (float)(timeMillis - this.field_51962) / this.field_51964 * TickFactorEvent.INSTANCE.getFactor();
         this.field_51962 = timeMillis;
         this.field_51959 += this.field_51958;
         int roundedTickDelta = (int)this.field_51959;
         this.field_51959 -= (float)roundedTickDelta;
         cir.setReturnValue(roundedTickDelta);
      }

   }
}
