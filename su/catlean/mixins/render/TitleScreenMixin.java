package su.catlean.mixins.render;

import net.minecraft.class_2561;
import net.minecraft.class_437;
import net.minecraft.class_442;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.client.PostTitleScreenInitEvent;

@Mixin({class_442.class})
public class TitleScreenMixin extends class_437 {
   protected TitleScreenMixin(class_2561 title) {
      super(title);
   }

   @Inject(
      method = {"method_25426"},
      at = {@At("RETURN")}
   )
   public void postInitHook(CallbackInfo ci) {
      PostTitleScreenInitEvent.INSTANCE.call();
   }
}
