package su.catlean.mixins.render;

import java.util.Collection;
import net.minecraft.class_1293;
import net.minecraft.class_1297;
import net.minecraft.class_266;
import net.minecraft.class_310;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.catlean.api.event.events.render.CrosshairRenderEvent;
import su.catlean.api.event.events.render.HotBarRenderEventPost;
import su.catlean.api.event.events.render.HotBarRenderEventPre;
import su.catlean.api.event.events.render.ItemNameRenderEvent;
import su.catlean.api.event.events.render.NauseaRenderEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.RenderPortalOverlayEvent;
import su.catlean.api.event.events.render.RenderVignetteOverlayEvent;
import su.catlean.api.event.events.render.ScoreBoardRenderEvent;
import su.catlean.api.event.events.render.StatusEffectsRenderEvent;

@Mixin({class_329.class})
public abstract class GuiMixin {
   @Inject(
      at = {@At("HEAD")},
      method = {"method_1753"}
   )
   public void renderHook(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      Render2DEvent.INSTANCE.call(context);
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"method_1749"},
      cancellable = true
   )
   public void renderHeldItemTooltipHook(class_332 context, CallbackInfo ci) {
      if (ItemNameRenderEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderScoreboardSidebarHook(class_332 context, class_266 objective, CallbackInfo ci) {
      if (ScoreBoardRenderEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_1735"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderVignetteOverlayHook(class_332 context, class_1297 entity, CallbackInfo ci) {
      if (RenderVignetteOverlayEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_1746"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderPortalOverlayHook(class_332 context, float nauseaStrength, CallbackInfo ci) {
      if (RenderPortalOverlayEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_1765"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderStatusEffectOverlayHook(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      Collection<class_1293> collection = class_310.method_1551().field_1724.method_6026();
      if (!collection.isEmpty() && class_310.method_1551().field_1755 == null && StatusEffectsRenderEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_61980"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderNauseaOverlayHook(class_332 context, float nauseaStrength, CallbackInfo ci) {
      if (NauseaRenderEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_1736"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void renderCrosshair(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      if (CrosshairRenderEvent.INSTANCE.call()) {
         ci.cancel();
      }

   }

   @Inject(
      method = {"method_1759"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void renderHotbarHookPre(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      HotBarRenderEventPre.INSTANCE.call();
   }

   @Inject(
      method = {"method_1759"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void renderHotbarHookPost(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      HotBarRenderEventPost.INSTANCE.call();
   }
}
