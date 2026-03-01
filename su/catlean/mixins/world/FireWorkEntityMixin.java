package su.catlean.mixins.world;

import net.minecraft.class_1309;
import net.minecraft.class_1671;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import su.catlean.api.event.events.world.FireWorkVectorEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;

@Mixin({class_1671.class})
public class FireWorkEntityMixin {
   @Shadow
   private class_1309 field_7616;

   @Redirect(
      method = {"method_5773"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1309;method_5720()Lnet/minecraft/class_243;"
)
   )
   private class_243 tickHook(class_1309 instance) {
      return this.field_7616 == class_310.method_1551().field_1724 && FireWorkVectorEvent.INSTANCE.call(this.field_7616.method_5720()) ? FireWorkVectorEvent.INSTANCE.getVector() : this.field_7616.method_5720();
   }

   @ModifyArgs(
      method = {"method_5773"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1309;method_18799(Lnet/minecraft/class_243;)V"
)
   )
   public void tickHook2(Args args) {
      if (this.field_7616 == class_310.method_1551().field_1724 && FireWorkVelocityEvent.INSTANCE.call()) {
         args.set(0, FireWorkVelocityEvent.INSTANCE.getVelocity());
      }

   }
}
