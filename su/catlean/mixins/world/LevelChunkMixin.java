package su.catlean.mixins.world;

import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import su.catlean.api.event.events.world.BlockStateEvent;

@Mixin({class_2818.class})
public class LevelChunkMixin {
   @Shadow
   @Final
   class_1937 field_12858;

   @Inject(
      method = {"method_12010"},
      at = {@At("RETURN")}
   )
   private void setBlockStateHook(class_2338 pos, class_2680 state, int flags, CallbackInfoReturnable<class_2680> cir) {
      if (this.field_12858.method_8608()) {
         BlockStateEvent.INSTANCE.call(pos, state, (class_2680)cir.getReturnValue());
      }

   }
}
