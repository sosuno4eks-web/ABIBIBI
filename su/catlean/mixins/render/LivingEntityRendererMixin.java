package su.catlean.mixins.render;

import java.awt.Color;
import java.util.Objects;
import net.minecraft.class_10042;
import net.minecraft.class_10055;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_583;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import su.catlean.api.event.events.render.EntityAlphaEvent;
import su.catlean.api.event.events.render.LookRenderEvent;

@Mixin({class_922.class})
public class LivingEntityRendererMixin<T extends class_1309, S extends class_10042, M extends class_583<? super S>> {
   @Unique
   private S prevState;

   @Inject(
      method = {"method_4054(Lnet/minecraft/class_10042;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_12075;)V"},
      at = {@At("HEAD")}
   )
   private void renderHook(S state, class_4587 matrixStack, class_11659 orderedRenderCommandQueue, class_12075 cameraRenderState, CallbackInfo ci) {
      this.prevState = state;
      if (state instanceof class_10055) {
         class_10055 prs = (class_10055)state;
         if (class_310.method_1551().field_1724 != null && Objects.equals(prs.field_53528, class_310.method_1551().field_1724.method_5628())) {
            LookRenderEvent.INSTANCE.call(state.field_53447, state.field_53448, state.field_53446);
            state.field_53447 = LookRenderEvent.INSTANCE.getYaw();
            state.field_53448 = LookRenderEvent.INSTANCE.getPitch();
            state.field_53446 = LookRenderEvent.INSTANCE.getBodyYaw();
         }
      }

   }

   @ModifyArgs(
      method = {"method_4054(Lnet/minecraft/class_10042;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_12075;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_11659;method_73490(Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_4587;Lnet/minecraft/class_1921;IIILnet/minecraft/class_1058;ILnet/minecraft/class_11683$class_11792;)V"
)
   )
   private void renderHook(Args args) {
      if (this.prevState != null) {
         class_10042 var3 = this.prevState;
         if (var3 instanceof class_10055) {
            class_10055 prs = (class_10055)var3;
            if (class_310.method_1551().field_1724 != null && !Objects.equals(prs.field_53528, class_310.method_1551().field_1724.method_5628()) && EntityAlphaEvent.INSTANCE.call(new class_243(prs.field_53325, prs.field_53326, prs.field_53327))) {
               args.set(6, this.withAlpha(new Color(654311423), EntityAlphaEvent.INSTANCE.getAlpha()).getRGB());
            }
         }
      }

   }

   @Unique
   private Color withAlpha(Color c, float alpha) {
      return new Color(c.getRed(), c.getGreen(), c.getBlue(), (int)(255.0F * alpha));
   }
}
