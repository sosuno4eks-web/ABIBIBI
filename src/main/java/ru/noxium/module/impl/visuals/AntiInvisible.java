package ru.noxium.module.impl.visuals;

import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import ru.noxium.event.EventInit;
import ru.noxium.event.impl.EventChangeWorld;
import ru.noxium.event.impl.EventScreen;
import ru.noxium.event.render.EventRender3D;
import ru.noxium.module.api.Category;
import ru.noxium.module.api.IModule;
import ru.noxium.module.api.Module;
import ru.noxium.module.api.setting.Setting;
import ru.noxium.module.api.setting.impl.BooleanSetting;
import ru.noxium.util.other.Mathf;
import ru.noxium.util.render.core.Renderer2D;
import ru.noxium.util.render.text.FontRegistry;

/**
 * Anti-Invisible Module
 * Shows invisible entities with a red [INVIS] label
 */
@IModule(
   name = "Anti Invisible",
   description = "Shows invisible entities with [INVIS] label",
   category = Category.Visuals,
   bind = -1
)
@Environment(EnvType.CLIENT)
public class AntiInvisible extends Module {
   
   public static BooleanSetting playersOnly = new BooleanSetting("Players Only", true);
   
   private static final Map<LivingEntity, double[]> invisibleEntityPositions = new HashMap<>();
   
   public AntiInvisible() {
      this.addSettings(new Setting[]{playersOnly});
   }
   
   @EventInit
   public void onWorldLoad(EventChangeWorld e) {
      invisibleEntityPositions.clear();
   }
   
   @EventInit
   public void onRender3D(EventRender3D event) {
      this.updateInvisiblePositions(event.getTickDelta());
   }
   
   private void updateInvisiblePositions(float tickDelta) {
      invisibleEntityPositions.clear();
      
      if (mc.world != null && mc.player != null) {
         for (net.minecraft.entity.Entity e : mc.world.getEntities()) {
            if (e instanceof LivingEntity entity && entity != mc.player && entity.isInvisible()) {
               // Check if "Players Only" filter is enabled
               if (playersOnly.get() && !(entity instanceof PlayerEntity)) {
                  continue;
               }
               
               double x = MathHelper.lerp(tickDelta, entity.lastRenderX, entity.getX());
               double y = MathHelper.lerp(tickDelta, entity.lastRenderY, entity.getY());
               double z = MathHelper.lerp(tickDelta, entity.lastRenderZ, entity.getZ());
               
               Vec3d headPos = new Vec3d(x, y + entity.getHeight() + 0.5, z);
               Vec3d headScreen = Mathf.worldSpaceToScreenSpace(headPos);
               
               if (headScreen != null && headScreen.z >= 0.0 && headScreen.z <= 1.0) {
                  invisibleEntityPositions.put(entity, new double[]{headScreen.x, headScreen.y, headScreen.z});
               }
            }
         }
      }
   }
   
   @EventInit
   public void onRender2D(EventScreen event) {
      if (mc.world != null && mc.player != null) {
         Renderer2D renderer = event.renderer();
         Vec3d cameraPos = mc.gameRenderer.getCamera().getCameraPos();
         
         for (LivingEntity entity : invisibleEntityPositions.keySet()) {
            double[] pos = invisibleEntityPositions.get(entity);
            if (pos != null && pos[2] >= 0.0 && pos[2] <= 1.0) {
               Vec3d entityPos = new Vec3d(entity.getX(), entity.getY(), entity.getZ());
               double distance = cameraPos.distanceTo(entityPos);
               double baseDistance = 5.0;
               float scale = (float) (baseDistance / Math.max(distance, 5.0));
               scale = MathHelper.clamp(scale, 0.5F, 2.0F);
               
               renderer.pushTranslation((float) pos[0] * 2.0F, (float) pos[1] * 2.0F);
               renderer.pushScale(scale, scale);
               
               String label = "[INVIS]";
               float fontSize = 28.0F;
               float labelWidth = renderer.measureText(FontRegistry.INTER_MEDIUM, label, fontSize).width;
               float width = labelWidth + 12.0F;
               
               // Draw background
               Hud.drawClientRect(renderer, -width / 2.0F - 2.0F, -12.0F, width + 4.0F, 24.0F, 7.0F, 1.0F, 1.0F);
               
               // Draw red [INVIS] text
               renderer.text(FontRegistry.INTER_MEDIUM, -width / 2.0F + 6.0F, 4.75F, fontSize, label,
                     Renderer2D.ColorUtil.getColor(255, 40, 40, 255));
               
               renderer.popScale();
               renderer.popTransform();
            }
         }
      }
   }
}
