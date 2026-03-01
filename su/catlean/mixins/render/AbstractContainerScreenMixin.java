package su.catlean.mixins.render;

import net.minecraft.class_1703;
import net.minecraft.class_1735;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3936;
import net.minecraft.class_437;
import net.minecraft.class_465;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.RenderToolTipEvent;
import su.catlean.api.event.events.render.SlotRenderEvent;

@Mixin({class_465.class})
public abstract class AbstractContainerScreenMixin<T extends class_1703> extends class_437 implements class_3936<T> {
   @Shadow
   @Nullable
   protected class_1735 field_2787;
   @Shadow
   protected int field_2776;
   @Shadow
   protected int field_2800;

   protected AbstractContainerScreenMixin(class_2561 title) {
      super(title);
   }

   @Inject(
      method = {"method_25394"},
      at = {@At("TAIL")}
   )
   private void renderHook(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
      if (this.field_2787 != null && !this.field_2787.method_7677().method_7960() && class_310.method_1551().field_1724.field_7498.method_34255().method_7960()) {
         RenderToolTipEvent.INSTANCE.call(this.field_2787.method_7677(), context, mouseX, mouseY);
      }

   }

   @Inject(
      method = {"method_2385(Lnet/minecraft/class_332;Lnet/minecraft/class_1735;II)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_332;method_51428(Lnet/minecraft/class_1799;III)V",
   shift = Shift.BEFORE
)}
   )
   protected void drawSlotHook(class_332 drawContext, class_1735 slot, int i, int j, CallbackInfo ci) {
      SlotRenderEvent.INSTANCE.setSlot(slot);
      SlotRenderEvent.INSTANCE.setContext(drawContext);
      SlotRenderEvent.INSTANCE.call();
   }
}
