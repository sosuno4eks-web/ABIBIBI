package su.catlean.mixins.world;

import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.player.FinishUsingItemEvent;
import su.catlean.api.event.events.player.StackCollectEvent;

@Mixin({class_1799.class})
public class ItemStackMixin {
   @Inject(
      method = {"method_7910"},
      at = {@At("HEAD")}
   )
   private void onFinishUsing(class_1937 world, class_1309 entity, CallbackInfoReturnable<class_1799> cir) {
      if (entity == class_310.method_1551().field_1724) {
         FinishUsingItemEvent.INSTANCE.call((class_1799)this);
      }

   }

   @Inject(
      method = {"method_7912"},
      at = {@At("HEAD")}
   )
   private void onRenewItem(int bobbingAnimationTime, CallbackInfo ci) {
      if (bobbingAnimationTime == 5) {
         StackCollectEvent.INSTANCE.setItemStack((class_1799)this);
         StackCollectEvent.INSTANCE.call();
      }

   }
}
