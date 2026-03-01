package su.catlean.mixins.render;

import net.minecraft.class_11687;
import net.minecraft.class_4597;
import net.minecraft.class_10444.class_10445;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import su.catlean.api.event.events.render.ItemCommandEvent;

@Mixin({class_11687.class})
public abstract class ItemFeatureRendererMixin {
   @ModifyArg(
      method = {"method_73010"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_918;method_62476(Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;II[ILjava/util/List;Lnet/minecraft/class_1921;Lnet/minecraft/class_10444$class_10445;)V"
),
      index = 2
   )
   private class_4597 renderHook(class_4597 original) {
      return ItemCommandEvent.INSTANCE.call() ? ItemCommandEvent.INSTANCE.getProvider() : original;
   }

   @ModifyArg(
      method = {"method_73010"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_918;method_62476(Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;II[ILjava/util/List;Lnet/minecraft/class_1921;Lnet/minecraft/class_10444$class_10445;)V"
),
      index = 8
   )
   private class_10445 renderHook(class_10445 original) {
      return ItemCommandEvent.INSTANCE.call() ? class_10445.field_55341 : original;
   }
}
