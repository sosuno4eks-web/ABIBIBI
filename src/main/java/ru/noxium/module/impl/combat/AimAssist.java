package ru.noxium.module.impl.combat;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.network.ClientPlayerEntity;
import ru.noxium.Noxium;
import ru.noxium.event.EventInit;
import ru.noxium.event.impl.EventUpdate;
import ru.noxium.event.render.RenderEvent;
import ru.noxium.module.api.Category;
import ru.noxium.module.api.IModule;
import ru.noxium.module.api.Module;
import ru.noxium.module.api.setting.Setting;
import ru.noxium.module.api.setting.impl.BooleanSetting;
import ru.noxium.module.api.setting.impl.SliderSetting;
import ru.noxium.util.render.core.Renderer2D;

@IModule(
   name = "Aim Assist",
   description = "Smoothly assists aiming at targets",
   category = Category.Combat,
   bind = -1
)
@Environment(EnvType.CLIENT)
public class AimAssist extends Module {
   
   // Settings
   public SliderSetting smoothness = new SliderSetting("Smoothness", 0.3F, 0.1F, 1.0F, 0.05F, false);
   public SliderSetting range = new SliderSetting("Range", 5.0F, 3.0F, 10.0F, 0.5F, false);
   public SliderSetting fov = new SliderSetting("FOV", 90.0F, 30.0F, 180.0F, 5.0F, false);
   public BooleanSetting showFOV = new BooleanSetting("Show FOV", true);
   public BooleanSetting filled = new BooleanSetting("Filled", false);
   
   public static PlayerEntity target = null; // Public for other modules

   public AimAssist() {
      this.addSettings(new Setting[]{smoothness, range, fov, showFOV, filled});
   }

   @EventInit
   public void onUpdate(EventUpdate event) {
      if (!this.enable || mc.player == null || mc.world == null) {
         target = null;
         return;
      }
      
      // Find target
      target = findClosestTarget();
      
      if (target == null) {
         return;
      }
      
      // Apply smooth rotation
      applyRotation();
   }
   
   /**
    * Find the closest valid target within FOV
    */
   private PlayerEntity findClosestTarget() {
      PlayerEntity bestTarget = null;
      double bestDistance = Double.MAX_VALUE;
      
      Vec3d eyePos = mc.player.getEyePos();
      Vec3d lookVec = mc.player.getRotationVec(1.0F);
      double maxFovRadians = Math.toRadians(fov.get() / 2.0);
      double maxRange = range.get();
      
      for (Entity entity : mc.world.getEntities()) {
         // Check if entity is a valid player target
         if (!(entity instanceof PlayerEntity player)) continue;
         if (player == mc.player) continue;
         if (!player.isAlive()) continue;
         if (player instanceof ClientPlayerEntity) continue;
         
         // Check if friend
         if (Noxium.get.friendManager.isFriend(player.getName().getString())) {
            continue;
         }
         
         // Distance check
         double distance = mc.player.distanceTo(player);
         if (distance > maxRange) continue;
         
         // FOV check
         Vec3d targetPos = new Vec3d(player.getX(), player.getY() + player.getHeight() * 0.5, player.getZ());
         Vec3d toTarget = targetPos.subtract(eyePos).normalize();
         double angle = Math.acos(MathHelper.clamp(lookVec.dotProduct(toTarget), -1.0, 1.0));
         
         if (angle > maxFovRadians) continue;
         
         // Find closest
         if (distance < bestDistance) {
            bestDistance = distance;
            bestTarget = player;
         }
      }
      
      return bestTarget;
   }
   
   /**
    * Apply smooth interpolated rotation towards target
    */
   private void applyRotation() {
      if (target == null) return;
      
      // Calculate target angles
      Vec3d eyePos = mc.player.getEyePos();
      Vec3d targetPos = new Vec3d(target.getX(), target.getY() + target.getHeight() * 0.5, target.getZ());
      Vec3d direction = targetPos.subtract(eyePos);
      
      // Calculate yaw and pitch to target
      float targetYaw = (float) Math.toDegrees(Math.atan2(-direction.x, direction.z));
      float targetPitch = (float) -Math.toDegrees(Math.atan2(direction.y, Math.sqrt(direction.x * direction.x + direction.z * direction.z)));
      
      // Get current angles
      float currentYaw = mc.player.getYaw();
      float currentPitch = mc.player.getPitch();
      
      // Calculate differences using wrapDegrees to find shortest path
      float yawDiff = wrapDegrees(targetYaw - currentYaw);
      float pitchDiff = targetPitch - currentPitch;
      
      // Deadzone: Stop if already very close to prevent micro-jitter
      if (Math.abs(yawDiff) < 0.5F && Math.abs(pitchDiff) < 0.5F) {
         return;
      }
      
      // Smooth interpolation (lerp) - lower value = smoother
      // smoothness setting: 0.1 to 1.0 maps to 0.08 to 0.2 smoothing factor
      float smoothingFactor = smoothness.get() * 0.2F;
      
      // Apply smooth rotation
      float newYaw = currentYaw + yawDiff * smoothingFactor;
      float newPitch = currentPitch + pitchDiff * smoothingFactor;
      
      // Clamp pitch to valid range
      newPitch = MathHelper.clamp(newPitch, -90.0F, 90.0F);
      
      // Apply rotation to player
      mc.player.setYaw(newYaw);
      mc.player.setPitch(newPitch);
   }
   
   /**
    * Wrap degrees to -180 to 180 range
    */
   private float wrapDegrees(float degrees) {
      degrees = degrees % 360.0F;
      if (degrees >= 180.0F) degrees -= 360.0F;
      if (degrees < -180.0F) degrees += 360.0F;
      return degrees;
   }
   
   @Override
   public void onDisable() {
      target = null;
   }
   
   @EventInit
   public void onRender(RenderEvent e) {
      if (!this.enable || !showFOV.get()) return;
      
      Renderer2D renderer = e.renderer();
      int width = e.viewportWidth();
      int height = e.viewportHeight();
      
      float centerX = width / 2.0F;
      float centerY = height / 2.0F;
      
      // Calculate radius based on FOV
      float fovValue = fov.get();
      float screenFov = mc.options.getFov().getValue().floatValue();
      
      double targetFovRad = Math.toRadians(fovValue / 2.0);
      double screenFovRad = Math.toRadians(screenFov / 2.0);
      float radius = (float)((height / 2.0) * Math.tan(targetFovRad) / Math.tan(screenFovRad));
      
      // Clamp to reasonable size
      radius = Math.max(30.0F, Math.min(radius, Math.min(width, height) * 0.48F));
      
      // Colors - green if target found, white otherwise
      int fillColor = target != null ? 0x1A00FF00 : 0x0AFFFFFF;
      int outlineColor = target != null ? 0xFF00FF00 : 0xFFFFFFFF;
      
      // Draw filled circle if enabled
      if (filled.get()) {
         renderer.circle(centerX, centerY, radius, 0.0F, 1.0F, fillColor);
      }
      
      // Draw outline
      renderer.circleOutline(centerX, centerY, radius, 0.0F, 1.0F, outlineColor, 1.5F);
   }
}
