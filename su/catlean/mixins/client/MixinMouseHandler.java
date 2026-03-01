package su.catlean.mixins.client;

import net.minecraft.class_11910;
import net.minecraft.class_310;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.interfaces.IMouse;

@Mixin({class_312.class})
public class MixinMouseHandler implements IMouse {
   @Shadow
   private double field_1795;
   @Shadow
   private double field_1794;

   @Inject(
      method = {"method_1601"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onMouseButtonHook(long window, class_11910 input, int action, CallbackInfo ci) {
      if (window == class_310.method_1551().method_22683().method_4490() && InputEvent.INSTANCE.call(input.comp_4801(), InputEvent.Device.Mouse, action == 0 ? InputEvent.Action.Release : InputEvent.Action.Press)) {
         ci.cancel();
      }

   }

   public void setPosition(int xp, int yp) {
      this.field_1795 = (double)xp;
      this.field_1794 = (double)yp;
   }
}
