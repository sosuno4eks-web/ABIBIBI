package su.catlean.mixins.world;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1835;
import net.minecraft.class_1890;
import net.minecraft.class_1937;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.player.TridentUseEvent;
import su.catlean.api.event.events.player.TridentWeatherEvent;

@Mixin({class_1835.class})
public abstract class TridentItemMixin {
   @Inject(
      method = {"method_7840"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onStoppedUsingHook(class_1799 stack, class_1937 world, class_1309 user, int remainingUseTicks, CallbackInfoReturnable<Boolean> ci) {
      if (user == class_310.method_1551().field_1724 && class_1890.method_60123(stack, class_310.method_1551().field_1724) > 0.0F && TridentUseEvent.INSTANCE.call()) {
         ci.cancel();
         ci.setReturnValue(true);
      }

   }

   @Inject(
      method = {"method_7836"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void useHook(class_1937 world, class_1657 user, class_1268 hand, CallbackInfoReturnable<class_1269> cir) {
      class_1799 itemStack = user.method_5998(hand);
      if (class_1890.method_60123(itemStack, user) > 0.0F && !user.method_5721() && TridentWeatherEvent.INSTANCE.call()) {
         user.method_6019(hand);
         cir.setReturnValue(class_1269.field_21466);
      }

   }
}
