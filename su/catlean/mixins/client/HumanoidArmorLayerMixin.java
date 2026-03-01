package su.catlean.mixins.client;

import net.minecraft.class_10034;
import net.minecraft.class_11659;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_4587;
import net.minecraft.class_572;
import net.minecraft.class_970;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.RenderArmorEvent;

@Mixin({class_970.class})
public abstract class HumanoidArmorLayerMixin<S extends class_10034, M extends class_572<S>, A extends class_572<S>> {
   @Inject(
      method = {"method_4169"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderArmor(class_4587 matrices, class_11659 queue, class_1799 stack, class_1304 slot, int light, S state, CallbackInfo ci) {
      if (RenderArmorEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }
}
