package su.catlean.mixins.world;

import net.minecraft.class_1511;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.world.CrystalCreateEvent;

@Mixin({class_1511.class})
public class EndCrystalMixin {
   @Shadow
   public int field_7034;
   @Unique
   float startAge = -1.0F;

   @Inject(
      method = {"<init>(Lnet/minecraft/class_1299;Lnet/minecraft/class_1937;)V"},
      at = {@At("TAIL")}
   )
   private void tickHook(CallbackInfo ci) {
      if (CrystalCreateEvent.INSTANCE.call() && this.startAge == -1.0F) {
         this.startAge = (float)this.field_7034;
         this.field_7034 = 0;
      }

   }
}
