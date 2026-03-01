package su.catlean.mixins.render;

import net.minecraft.class_5223;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import su.catlean.api.event.events.render.StringDecomposerEvent;

@Mixin({class_5223.class})
public abstract class StringDecomposerMixin {
   @ModifyVariable(
      method = {"method_27473(Ljava/lang/String;ILnet/minecraft/class_2583;Lnet/minecraft/class_2583;Lnet/minecraft/class_5224;)Z"},
      at = @At("HEAD"),
      ordinal = 0,
      argsOnly = true
   )
   private static String iterateFormattedHook(String original) {
      return StringDecomposerEvent.INSTANCE.call(original);
   }
}
