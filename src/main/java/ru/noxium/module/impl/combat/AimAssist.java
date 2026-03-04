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
   public SliderSetting smoothness = new SliderSetting("Smoothness", 0.15F, 0.05F, 0.5F, 0.01F, false);
   public SliderSetting range = new SliderSetting("Range", 5.0F, 3.0F, 10.0F, 0.5F, false);
   public SliderSetting fov = new SliderSetting("FOV", 90.0F, 30.0F, 180.0F, 5.0F, false);
   public BooleanSetting showFOV = new BooleanSetting("Show FOV", true);
   public BooleanSetting filled = new BooleanSetting("Filled", false);
   
   public static PlayerEntity target = null; // Public for other modules

   public AimAssist() {
      this.addSettings(new Setting[]{smoothness, range, fov, showFOV, filled});
   }

   @EventInit
   public void onRender(RenderEvent e) {
      if (!this.enable) {
         target = null;
         return;
      }
      
      // Render FOV circle
      if (showFOV.get()) {
         renderFOVCircle(e);
      }
      
      // Apply rotation every frame (not every tick) for high-end smoothness
      if (mc.player == null || mc.world == null) {
         target = null;
         return;
      }
      
      // Find target
      target = findClosestTarget();
      
      if (target == null) {
         return;
      }
      
      // Apply smooth rotation using frame-based interpolation
      applyFrameBasedRotation();
   }
   
   /**
    * Apply rotation every frame using tickDelta for perfect smoothness
    * This is the KEY to eliminating jitter - updating on render, not tick
    */
   private void applyFrameBasedRotation() {
      if (target == null) return;
      
      // CRITICAL: Get tick delta to interpolate every single frame
      float tickDelta = mc.getRenderTickCounter().getTickProgress(true);
      
      // Calculate target angles using lerped position
      Vec3d eyePos = mc.player.getEyePos();
      Vec3d targetPos = target.getLerpedPos(tickDelta).add(0, target.getHeight() * 0.5, 0);
      Vec3d direction = targetPos.subtract(eyePos);
      
      // Calculate yaw and pitch to target
      float targetYaw = (float) Math.toDegrees(Math.atan2(-direction.x, direction.z));
      float targetPitch = (float) -Math.toDegrees(Math.atan2(direction.y, Math.sqrt(direction.x * direction.x + direction.z * direction.z)));
      
      // Get current angles
      float currentYaw = mc.player.getYaw();
      float currentPitch = mc.player.getPitch();
      
      // Use wrapDegrees to find shortest path
      float deltaYaw = MathHelper.wrapDegrees(targetYaw - currentYaw);
      float deltaPitch = MathHelper.wrapDegrees(targetPitch - currentPitch);
      
      // Anti-Jitter: Stop if already on target to prevent vibration
      if (Math.abs(deltaYaw) < 0.05F && Math.abs(deltaPitch) < 0.05F) {
         return;
      }
      
      // Exponential Smoothing: Apply smoothness with tickDelta for frame interpolation
      float smoothFactor = smoothness.get() * tickDelta;
      
      // Use lerpAngleDegrees for perfectly smooth transitions across 180-degree border
      float newYaw = MathHelper.lerpAngleDegrees(smoothFactor, currentYaw, targetYaw);
      float newPitch = MathHelper.lerpAngleDegrees(smoothFactor, currentPitch, targetPitch);
      
      // Clamp pitch to valid range
      newPitch = MathHelper.clamp(newPitch, -90.0F, 90.0F);
      
      // Apply rotation to player
      mc.player.setYaw(newYaw);
      mc.player.setPitch(newPitch);
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
    * Render FOV circle
    */
   private void renderFOVCircle(RenderEvent e) {
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
   
   @Override
   public void onDisable() {
      target = null;
   }
}
