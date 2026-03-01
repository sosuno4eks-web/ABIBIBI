package su.catlean.mixins.client;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_2172;
import net.minecraft.class_342;
import net.minecraft.class_4717;
import net.minecraft.class_4717.class_464;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.client.InputSuggestorEvent;

@Mixin({class_4717.class})
public abstract class MixinCommandSuggestions {
   @Final
   @Shadow
   class_342 field_21599;
   @Shadow
   boolean field_21614;
   @Shadow
   private ParseResults<class_2172> field_21610;
   @Shadow
   private CompletableFuture<Suggestions> field_21611;
   @Shadow
   private class_464 field_21612;

   @Shadow
   protected abstract void method_23937();

   @Inject(
      method = {"method_23934"},
      at = {@At(
   value = "INVOKE",
   target = "Lcom/mojang/brigadier/StringReader;canRead()Z",
   remap = false
)},
      cancellable = true
   )
   public void refreshHook(CallbackInfo ci, @Local StringReader reader) {
      if (InputSuggestorEvent.INSTANCE.call() && reader.canRead(InputSuggestorEvent.INSTANCE.getPrefix().length()) && reader.getString().startsWith(InputSuggestorEvent.INSTANCE.getPrefix(), reader.getCursor())) {
         reader.setCursor(reader.getCursor() + 1);
         if (this.field_21610 == null) {
            this.field_21610 = ((CommandDispatcher)Objects.requireNonNull(InputSuggestorEvent.INSTANCE.getDispatcher())).parse(reader, (class_2172)Objects.requireNonNull(InputSuggestorEvent.INSTANCE.getSource()));
         }

         int cursor = this.field_21599.method_1881();
         if (cursor >= 1 && (this.field_21612 == null || !this.field_21614)) {
            this.field_21611 = ((CommandDispatcher)Objects.requireNonNull(InputSuggestorEvent.INSTANCE.getDispatcher())).getCompletionSuggestions(this.field_21610, cursor);
            this.field_21611.thenRun(() -> {
               if (this.field_21611.isDone()) {
                  this.method_23937();
               }

            });
         }

         ci.cancel();
      }

   }
}
