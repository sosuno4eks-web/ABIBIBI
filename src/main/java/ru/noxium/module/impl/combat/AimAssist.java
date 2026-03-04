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

/**
 * AimAssist - High-performance, frame-rate independent aim smoothing
 * Optimized for Minecraft 1.21.11 Fabric with Yarn mappings
 * 
 * Key Features:
 * - Frame-based rotation (not tick-based) for buttery smooth movement
 * - Exponential smoothing for human-like, classy feel
 * - Cached targeting to reduce CPU overhead
 * - Sub-pixel deadzone to eliminate micro-jitter
 */
@IModule(
   name = "Aim Assist",
   description = "Smoothly assists aiming at targets",
   category = Category.Combat,
   bind = -1
)
@Environment(EnvType.CLIENT)
public class AimAssist extends Module {
   
   // Settings
   public SliderSetting smoothness = new SliderSetting("Smoothness", 0.12F, 0.05F, 0.3F, 0.01F, false);
   public SliderSetting range = new SliderSetting("Range", 5.0F, 3.0F, 10.0F, 0.5F, false);
   public SliderSetting fov = new SliderSetting("FOV", 90.0F, 30.0F, 180.0F, 5.0F, false);
   public BooleanSetting showFOV = new BooleanSetting("Show FOV", true);
   public BooleanSetting filled = new BooleanSetting("Filled", false);
   
   // Cached target (updated once per frame for performance)
   public static PlayerEntity target = null;
   private PlayerEntity cachedTarget = null;
   private long lastTargetUpdateFrame = -1;

   public AimAssist() {
      this.addSettings(new Setting[]{smoothness, range, fov, showFOV, filled});
   }

   /**
    * Main render event - runs every frame (60-240+ FPS)
    * This is where rotation happens for frame-rate independence
    */
   @EventInit
   public void onRender(RenderEvent event) {
      if (!this.enable) {
         target = null;
         cachedTarget = null;
         return;
      }
      
      if (mc.player == null || mc.world == null) {
         target = null;
         cachedTarget = null;
         return;
      }
      
      // Update target once per frame (cached for performance)
      updateTargetCache();
      
      // Apply frame-based rotation if target exists
      if (cachedTarget != null) {
         applyFrameBasedRotation(event);
      }
      
      // Render FOV circle
      if (showFOV.get()) {
         renderFOVCircle(event);
      }
   }
   
   /**
    * Update target cache once per frame to avoid redundant calculations
    * This significantly reduces CPU usage
    */
   private void updateTargetCache() {
      long currentFrame = System.nanoTime() / 16_666_666; // ~60 FPS frame counter
      
      // Only update target once per frame
      if (lastTargetUpdateFrame == currentFrame) {
         return;
      }
      
      lastTargetUpdateFrame = currentFrame;
      cachedTarget = findClosestTarget();
      target = cachedTarget; // Update public static reference
   }
   
   /**
    * Apply rotation every frame using exponential smoothing
    * This creates human-like, classy movement without jitter
    */
   private void applyFrameBasedRotation(RenderEvent event) {
      if (cachedTarget == null) return;
      
      // Frame-Rate Independence: Get tick delta for sub-tick interpolation
      float tickDelta = mc.getRenderTickCounter().getTickProgress(true);
      
      // Calculate target angles using lerped position (eliminates entity micro-stutter)
      Vec3d eyePos = mc.player.getEyePos();
      Vec3d targetPos = cachedTarget.getLerpedPos(tickDelta).add(0, cachedTarget.getHeight() * 0.5, 0);
      Vec3d direction = targetPos.subtract(eyePos);
      
      // Calculate target yaw and pitch
      double horizontalDist = Math.sqrt(direction.x * direction.x + direction.z * direction.z);
      float targetYaw = (float) Math.toDegrees(Math.atan2(-direction.x, direction.z));
      float targetPitch = (float) -Math.toDegrees(Math.atan2(direction.y, horizontalDist));
      
      // Get current angles
      float currentYaw = mc.player.getYaw();
      float currentPitch = mc.player.getPitch();
      
      // Calculate angle differences (shortest path)
      float yawDiff = MathHelper.wrapDegrees(targetYaw - currentYaw);
      float pitchDiff = MathHelper.wrapDegrees(targetPitch - currentPitch);
      
      // Deadzone: Stop if already on target (prevents sub-pixel jitter)
      if (Math.abs(yawDiff) < 0.02F && Math.abs(pitchDiff) < 0.02F) {
         return;
      }
      
      // Human-Like Smoothness: Exponential smoothing formula
      // Formula: newAngle = current + (target - current) * (1 - (1 - smoothness)^deltaTime)
      // This creates natural acceleration/deceleration
      float deltaTime = tickDelta * 20.0F; // Normalize to tick time
      float smoothFactor = (float) (1.0 - Math.pow(1.0 - smoothness.get(), deltaTime));
      
      // Apply exponential smoothing using lerpAngleDegrees (handles -180/180 transitions)
      float newYaw = MathHelper.lerpAngleDegrees(smoothFactor, currentYaw, targetYaw);
      float newPitch = MathHelper.lerpAngleDegrees(smoothFactor, currentPitch, targetPitch);
      
      // Clamp pitch to valid range
      newPitch = MathHelper.clamp(newPitch, -90.0F, 90.0F);
      
      // Apply rotation to player
      mc.player.setYaw(newYaw);
      mc.player.setPitch(newPitch);
   }
   
   /**
    * Find the closest valid target within FOV and range
    * Optimized to run once per frame
    */
   private PlayerEntity findClosestTarget() {
      PlayerEntity bestTarget = null;
      double bestDistance = Double.MAX_VALUE;
      
      // Pre-calculate FOV and range values
      Vec3d eyePos = mc.player.getEyePos();
      Vec3d lookVec = mc.player.getRotationVec(1.0F);
      double maxFovRadians = Math.toRadians(fov.get() / 2.0);
      double maxRange = range.get();
      double maxRangeSq = maxRange * maxRange; // Use squared distance for performance
      
      // Iterate through entities
      for (Entity entity : mc.world.getEntities()) {
         // Type check
         if (!(entity instanceof PlayerEntity player)) continue;
         if (player == mc.player) continue;
         if (!player.isAlive()) continue;
         if (player instanceof ClientPlayerEntity) continue;
         
         // Friend check
         if (Noxium.get.friendManager.isFriend(player.getName().getString())) {
            continue;
         }
         
         // Distance check (squared for performance)
         double distanceSq = mc.player.squaredDistanceTo(player);
         if (distanceSq > maxRangeSq) continue;
         
         // FOV check
         Vec3d targetPos = new Vec3d(player.getX(), player.getY() + player.getHeight() * 0.5, player.getZ());
         Vec3d toTarget = targetPos.subtract(eyePos).normalize();
         double dotProduct = lookVec.dotProduct(toTarget);
         double angle = Math.acos(MathHelper.clamp(dotProduct, -1.0, 1.0));
         
         if (angle > maxFovRadians) continue;
         
         // Find closest target
         if (distanceSq < bestDistance) {
            bestDistance = distanceSq;
            bestTarget = player;
         }
      }
      
      return bestTarget;
   }
   
   /**
    * Render FOV circle indicator
    */
   private void renderFOVCircle(RenderEvent event) {
      Renderer2D renderer = event.renderer();
      int width = event.viewportWidth();
      int height = event.viewportHeight();
      
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
      int fillColor = cachedTarget != null ? 0x1A00FF00 : 0x0AFFFFFF;
      int outlineColor = cachedTarget != null ? 0xFF00FF00 : 0xFFFFFFFF;
      
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
      cachedTarget = null;
      lastTargetUpdateFrame = -1;
   }
}
