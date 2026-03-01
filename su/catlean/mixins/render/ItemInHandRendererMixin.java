package su.catlean.mixins.render;

import net.minecraft.class_11659;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.EquipArmEvent;
import su.catlean.api.event.events.render.HandModifyEvent;
import su.catlean.api.event.events.render.SwingArmEvent;

@Mixin({class_759.class})
public class ItemInHandRendererMixin {
   @Inject(
      method = {"method_3228"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_759;method_3233(Lnet/minecraft/class_1309;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"
)}
   )
   private void onRenderItem(class_742 player, float tickProgress, float pitch, class_1268 hand, float swingProgress, class_1799 item, float equipProgress, class_4587 matrices, class_11659 orderedRenderCommandQueue, int light, CallbackInfo ci) {
      HandModifyEvent.INSTANCE.call(hand, matrices, item, false);
   }

   @Inject(
      method = {"method_3218"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void applyEatOrDrinkTransformationHook(class_4587 matrices, float tickDelta, class_1306 arm, class_1799 stack, class_1657 player, CallbackInfo ci) {
      if (HandModifyEvent.INSTANCE.call(class_310.method_1551().field_1690.method_42552().method_41753() == class_1306.field_6183 ? (arm == class_1306.field_6183 ? class_1268.field_5808 : class_1268.field_5810) : (arm == class_1306.field_6183 ? class_1268.field_5810 : class_1268.field_5808), matrices, stack, true)) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_65816(FLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void swingArmHook(float f, class_4587 matrixStack, int i, class_1306 arm, CallbackInfo ci) {
      if (SwingArmEvent.INSTANCE.call(f, matrixStack, i, arm)) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_3224"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void swingArmHook(class_4587 matrices, class_1306 arm, float equipProgress, CallbackInfo ci) {
      if (EquipArmEvent.INSTANCE.call(equipProgress, arm)) {
         ci.cancel();
      }

   }
}
