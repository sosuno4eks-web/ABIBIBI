package su.catlean.mixins.render;

import java.util.Map;
import java.util.UUID;
import net.minecraft.class_332;
import net.minecraft.class_337;
import net.minecraft.class_345;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.BossBarRenderEvent;

@Mixin({class_337.class})
public class BossHealthOverlayMixin {
   @Final
   @Shadow
   Map<UUID, class_345> field_2060;

   @Inject(
      method = {"method_1796"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderHook(class_332 context, CallbackInfo ci) {
      if (!this.field_2060.isEmpty() && BossBarRenderEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }
}
