package su.catlean.mixins.world;

import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_5329;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.player.CollisionEvent;

@Mixin(
   value = {class_5329.class},
   priority = 800
)
public abstract class BlockCollisionsMixin {
   @Redirect(
      method = {"computeNext"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1922;method_8320(Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;"
)
   )
   private class_2680 computeNextHook(class_1922 instance, class_2338 blockPos) {
      if (class_310.method_1551().field_1687 != null && class_310.method_1551().field_1724 != null && GofraState.INSTANCE.getModifyCollisions()) {
         CollisionEvent event = new CollisionEvent();
         event.call(instance.method_8320(blockPos), blockPos);
         return event.getState();
      } else {
         return instance.method_8320(blockPos);
      }
   }
}
