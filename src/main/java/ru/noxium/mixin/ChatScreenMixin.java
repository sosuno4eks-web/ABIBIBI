package ru.noxium.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// Command system removed - all command suggestion code disabled

@Environment(EnvType.CLIENT)
@Mixin({ChatScreen.class})
public class ChatScreenMixin {
   @Shadow
   private TextFieldWidget chatField;

   @Inject(
      method = {"init"},
      at = {@At("TAIL")}
   )
   private void onChatOpen(CallbackInfo ci) {
      // Command system removed
   }

   @Inject(
      method = {"removed"},
      at = {@At("HEAD")}
   )
   private void onChatClose(CallbackInfo ci) {
      // Command system removed
   }
}
