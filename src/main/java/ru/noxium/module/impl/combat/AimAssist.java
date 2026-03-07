package ru.noxium.module.impl.combat;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributes;
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
   public SliderSetting speed = new SliderSetting("Speed", 5.0F, 1.0F, 20.0F, 0.5F, false);
   public SliderSetting range = new SliderSetting("Range", 5.0F, 3.0F, 10.0F, 0.5F, false);
   public SliderSetting fov = new SliderSetting("FOV", 90.0F, 30.0F, 180.0F, 5.0F, false);
   public SliderSetting breakDistance = new SliderSetting("Break Distance", 8.0F, 5.0F, 12.0F, 0.5F, false);
   
   // Sticky Aim
   public BooleanSetting stickyAim = new BooleanSetting("Sticky Aim", true);
   
   // Filters
   public BooleanSetting noFriend = new BooleanSetting("No Friend", true);
   public BooleanSetting onlyWeapons = new BooleanSetting("Only With Weapons", true);
   
   // Randomization
   public BooleanSetting randomization = new BooleanSetting("Randomization", true);
   
   // FOV Visuals
   public BooleanSetting showFOV = new BooleanSetting("Show FOV", true);
   public BooleanSetting filled = new BooleanSetting("Filled", false);
   public SliderSetting fovAlpha = new SliderSetting("FOV Alpha", 0.3F, 0.1F, 1.0F, 0.05F, false);
   public SliderSetting fovColorR = new SliderSetting("FOV Red", 255.0F, 0.0F, 255.0F, 1.0F, false);
   public SliderSetting fovColorG = new SliderSetting("FOV Green", 255.0F, 0.0F, 255.0F, 1.0F, false);
   public SliderSetting fovColorB = new SliderSetting("FOV Blue", 255.0F, 0.0F, 255.0F, 1.0F, false);
   public SliderSetting fovFillAlpha = new SliderSetting("Fill Alpha", 0.1F, 0.0F, 0.5F, 0.05F, false);
   
   // Cached target (updated once per frame for performance)
   public static PlayerEntity target = null;
   private PlayerEntity cachedTarget = null;
   private long lastTargetUpdateFrame = -1;
   
   // Sticky Target: Last attacked entity memory
   private PlayerEntity targetEntity = null;
   private int targetEntityId = -1;
   private long lastAttackTime = 0;
   
   // Randomization state for anti-cheat bypass
   private double targetOffsetX = 0.0;
   private double targetOffsetY = 0.0;
   private double targetOffsetZ = 0.0;
   private double smoothedOffsetX = 0.0;
   private double smoothedOffsetY = 0.0;
   private double smoothedOffsetZ = 0.0;
   private long lastOffsetUpdate = 0;
   private double perlinTime = 0.0;
   private java.util.Random random = new java.util.Random();
   
   // Human error simulation
   private double humanErrorYaw = 0.0;
   private double humanErrorPitch = 0.0;
   private long lastHumanErrorUpdate = 0;

   public AimAssist() {
      this.addSettings(new Setting[]{
         smoothness, speed, range, fov, breakDistance,
         stickyAim, noFriend, onlyWeapons, randomization,
         showFOV, filled, fovAlpha, fovColorR, fovColorG, fovColorB, fovFillAlpha
      });
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
      
      // Check if holding weapon - only aim with weapons if enabled
      if (onlyWeapons.get()) {
         ItemStack heldStack = mc.player.getMainHandStack();
         if (!isWeapon(heldStack)) {
            target = null;
            cachedTarget = null;
            return;
         }
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
    * Implements sticky aim logic for priority locking
    */
   private void updateTargetCache() {
      long currentFrame = System.nanoTime() / 16_666_666; // ~60 FPS frame counter
      
      // Only update target once per frame
      if (lastTargetUpdateFrame == currentFrame) {
         return;
      }
      
      lastTargetUpdateFrame = currentFrame;
      
      // Sticky Aim Logic: Check if we should use sticky target
      if (stickyAim.get() && targetEntity != null) {
         // Validate sticky target
         if (isTargetEntityValid()) {
            cachedTarget = targetEntity;
            target = cachedTarget;
            return;
         } else {
            // Reset sticky target if invalid
            clearTargetEntity();
         }
      }
      
      // Find new target (or first target if no sticky)
      PlayerEntity newTarget = findClosestTarget();
      
      // Update sticky target if we attacked recently
      updateTargetEntity(newTarget);
      
      cachedTarget = newTarget;
      target = cachedTarget;
   }
   
   /**
    * Check if targetEntity is still valid for sticky aim
    * Returns false if target should be cleared
    */
   private boolean isTargetEntityValid() {
      // Condition 1: Check if target is alive
      if (targetEntity == null || !targetEntity.isAlive()) {
         return false;
      }
      
      // Check if target is removed from world
      if (targetEntity.isRemoved()) {
         return false;
      }
      
      // Condition 3: Check break distance (max 8 blocks)
      double distance = mc.player.distanceTo(targetEntity);
      if (distance > breakDistance.get()) {
         return false;
      }
      
      // Condition 2: Check if target is within FOV range
      Vec3d eyePos = mc.player.getEyePos();
      Vec3d lookVec = mc.player.getRotationVec(1.0F);
      double maxFovRadians = Math.toRadians(fov.get() / 2.0);
      
      Vec3d targetPos = new Vec3d(
         targetEntity.getX(),
         targetEntity.getY() + targetEntity.getHeight() * 0.5,
         targetEntity.getZ()
      );
      Vec3d toTarget = targetPos.subtract(eyePos).normalize();
      double angle = Math.acos(MathHelper.clamp(lookVec.dotProduct(toTarget), -1.0, 1.0));
      
      if (angle > maxFovRadians) {
         return false;
      }
      
      // Target is still valid - prioritize it
      return true;
   }
   
   /**
    * Update targetEntity based on recent attacks
    * Uses AttackEntityCallback heuristic
    */
   private void updateTargetEntity(PlayerEntity newTarget) {
      if (!stickyAim.get()) {
         return;
      }
      
      long currentTime = System.currentTimeMillis();
      
      // Detect attack by checking if player is attacking
      // In production, use AttackEntityCallback for precise detection
      if (newTarget != null && newTarget != targetEntity) {
         // Check if this could be a new attack target
         if (mc.options.attackKey.isPressed() || currentTime - lastAttackTime < 500) {
            // Lock onto this target
            targetEntity = newTarget;
            targetEntityId = newTarget.getId();
            lastAttackTime = currentTime;
         }
      }
      
      // Auto-lock if we don't have a sticky target yet
      if (targetEntity == null && newTarget != null) {
         targetEntity = newTarget;
         targetEntityId = newTarget.getId();
         lastAttackTime = currentTime;
      }
   }
   
   /**
    * Clear targetEntity (smooth switch to next target)
    */
   private void clearTargetEntity() {
      targetEntity = null;
      targetEntityId = -1;
   }
   
   /**
    * Apply rotation with heavy damping and friction for professional feel
    * Eliminates screen shaking with low-pass filtering
    */
   private void applyFrameBasedRotation(RenderEvent event) {
      if (cachedTarget == null) return;
      
      // Direct Rendering Sync: Get tick delta to match visual position
      float tickDelta = mc.getRenderTickCounter().getTickProgress(true);
      
      // Stable Offsets: Update slowly and interpolate
      updateStableOffsets(tickDelta);
      
      // Update human error simulation
      updateHumanError();
      
      // Calculate target position with smoothed offsets
      Vec3d eyePos = mc.player.getEyePos();
      Vec3d baseTargetPos = cachedTarget.getLerpedPos(tickDelta);
      
      // Apply smoothed offsets (interpolated, not instant)
      Vec3d targetPos;
      if (randomization.get()) {
         targetPos = new Vec3d(
            baseTargetPos.x + smoothedOffsetX,
            baseTargetPos.y + smoothedOffsetY,
            baseTargetPos.z + smoothedOffsetZ
         );
      } else {
         targetPos = baseTargetPos.add(0, cachedTarget.getHeight() * 0.6, 0);
      }
      
      Vec3d direction = targetPos.subtract(eyePos);
      
      // Calculate target yaw and pitch
      double horizontalDist = Math.sqrt(direction.x * direction.x + direction.z * direction.z);
      double targetYaw = Math.toDegrees(Math.atan2(-direction.x, direction.z));
      double targetPitch = -Math.toDegrees(Math.atan2(direction.y, horizontalDist));
      
      // Human Error Simulation
      if (randomization.get()) {
         targetYaw += humanErrorYaw;
         targetPitch += humanErrorPitch;
      }
      
      // Get current angles
      double currentYaw = mc.player.getYaw();
      double currentPitch = mc.player.getPitch();
      
      // Calculate angle differences (shortest path)
      double yawDiff = MathHelper.wrapDegrees((float)(targetYaw - currentYaw));
      double pitchDiff = MathHelper.wrapDegrees((float)(targetPitch - currentPitch));
      
      // Calculate distance to target
      double totalDistance = Math.sqrt(yawDiff * yawDiff + pitchDiff * pitchDiff);
      
      // Deadzone: Stop if already on target
      if (totalDistance < 0.02) {
         return;
      }
      
      // Friction Logic: Ease-out as we approach target (prevents overshooting)
      double frictionMultiplier;
      if (totalDistance < 2.0) {
         // Very close: Heavy friction (quadratic ease-out)
         frictionMultiplier = (totalDistance / 2.0);
         frictionMultiplier = frictionMultiplier * frictionMultiplier; // Square for stronger ease
      } else if (totalDistance < 8.0) {
         // Medium distance: Moderate friction
         frictionMultiplier = 0.25 + ((totalDistance - 2.0) / 6.0) * 0.75;
      } else {
         // Far: Full speed
         frictionMultiplier = 1.0;
      }
      
      // Damping (The Shake Fix): Low-pass filter - move only 5-10% per frame
      // This is THE KEY to eliminating screen shake
      double dampingFactor = smoothness.get() * 0.08; // 5-10% movement per frame
      
      // Apply damping with friction
      double effectiveDamping = dampingFactor * frictionMultiplier;
      
      // Calculate movement for this frame
      double yawChange = yawDiff * effectiveDamping;
      double pitchChange = pitchDiff * effectiveDamping;
      
      // Speed Cap: Hard limit to prevent jumps (2-3 degrees max per frame)
      double maxDegreesPerFrame = 2.5 * tickDelta;
      
      yawChange = Math.signum(yawChange) * Math.min(Math.abs(yawChange), maxDegreesPerFrame);
      pitchChange = Math.signum(pitchChange) * Math.min(Math.abs(pitchChange), maxDegreesPerFrame);
      
      // Apply rotation
      double newYaw = currentYaw + yawChange;
      double newPitch = currentPitch + pitchChange;
      
      // Micro-Movement: Subtle sensor noise (much smaller now)
      if (randomization.get()) {
         double microNoiseYaw = (random.nextGaussian() * 0.0003);
         double microNoisePitch = (random.nextGaussian() * 0.0003);
         
         newYaw += microNoiseYaw;
         newPitch += microNoisePitch;
      }
      
      // Cast to float and apply
      float finalYaw = MathHelper.wrapDegrees((float) newYaw);
      float finalPitch = MathHelper.clamp((float) newPitch, -90.0F, 90.0F);
      
      // Apply rotation directly
      mc.player.setYaw(finalYaw);
      mc.player.setPitch(finalPitch);
   }
   
   /**
    * Stable Offsets: Update slowly and interpolate to prevent vibration
    * Changes only every 500-1000ms with smooth transitions
    * 60/40 distribution: 60% center, 40% full body
    */
   private void updateStableOffsets(float tickDelta) {
      if (!randomization.get()) {
         smoothedOffsetX = 0.0;
         smoothedOffsetY = 0.0;
         smoothedOffsetZ = 0.0;
         targetOffsetX = 0.0;
         targetOffsetY = 0.0;
         targetOffsetZ = 0.0;
         return;
      }
      
      long currentTime = System.currentTimeMillis();
      
      // Randomized Timing: Update target offsets with unpredictable intervals
      // Base 500ms + random 300-800ms = 800-1300ms total
      int randomInterval = 300 + random.nextInt(500);
      
      if (currentTime - lastOffsetUpdate > 500 + randomInterval) {
         lastOffsetUpdate = currentTime;
         
         // Get hitbox dimensions
         double width = cachedTarget.getWidth();
         double height = cachedTarget.getHeight();
         
         // Dynamic Jitter: Check target velocity
         Vec3d targetVelocity = cachedTarget.getVelocity();
         double targetSpeed = Math.sqrt(
            targetVelocity.x * targetVelocity.x + 
            targetVelocity.z * targetVelocity.z
         );
         double reactionLag = Math.min(targetSpeed * 0.15, 0.1);
         
         // Lower Center Weight: 60% center, 40% full body
         // Use less aggressive Gaussian bias
         double randX = random.nextDouble();
         double randZ = random.nextDouble();
         
         // Reduced bias: (rand - 0.5) * sqrt(rand) instead of (rand - 0.5) * rand
         // This creates 60/40 distribution instead of 80/20
         double weightedX = (randX - 0.5) * Math.sqrt(randX);
         double weightedZ = (randZ - 0.5) * Math.sqrt(randZ);
         
         targetOffsetX = weightedX * width * 0.4 - (targetVelocity.x * reactionLag);
         targetOffsetZ = weightedZ * width * 0.4 - (targetVelocity.z * reactionLag);
         
         // Vertical Expansion: Allow full body targeting (legs to head)
         // 60% chance for center (chest/neck), 40% chance for full body
         double randY = random.nextDouble();
         
         if (randY < 0.6) {
            // 60%: Center focus (upper body: 40% to 85% of height)
            double centerRand = random.nextDouble();
            double weightedY = (centerRand - 0.5) * Math.sqrt(centerRand);
            double yCenter = 0.625; // Neck/upper chest
            double yRange = 0.225;  // ±0.225 gives 0.4 to 0.85
            
            targetOffsetY = (yCenter + (weightedY * yRange)) * height;
         } else {
            // 40%: Full body drift (legs to head: 20% to 95% of height)
            // Uniform distribution across full body
            double fullBodyRand = random.nextDouble();
            double minHeight = 0.2;  // Legs
            double maxHeight = 0.95; // Top of head
            
            targetOffsetY = (minHeight + (fullBodyRand * (maxHeight - minHeight))) * height;
         }
      }
      
      // Slow Transition: Interpolate smoothed offsets towards target offsets
      // Takes 300-500ms for full transition (5% per frame at 60 FPS)
      double offsetLerpSpeed = 0.05 * tickDelta;
      
      smoothedOffsetX += (targetOffsetX - smoothedOffsetX) * offsetLerpSpeed;
      smoothedOffsetY += (targetOffsetY - smoothedOffsetY) * offsetLerpSpeed;
      smoothedOffsetZ += (targetOffsetZ - smoothedOffsetZ) * offsetLerpSpeed;
   }
   
   /**
    * Update randomized target offsets using Gaussian distribution
    * 80/20 rule: 80% of offsets stay within inner 20% of hitbox
    */
   private void updateRandomizedOffsets() {
      // This method is now replaced by updateStableOffsets
      // Kept for compatibility but does nothing
   }
   
   /**
    * Human Error Simulation: Occasional undershoot/overshoot
    * Mimics muscle fatigue and imperfect human aim
    */
   private void updateHumanError() {
      if (!randomization.get()) {
         humanErrorYaw = 0.0;
         humanErrorPitch = 0.0;
         return;
      }
      
      long currentTime = System.currentTimeMillis();
      
      // Update human error every 500-1500ms
      if (currentTime - lastHumanErrorUpdate > 500 + random.nextInt(1000)) {
         lastHumanErrorUpdate = currentTime;
         
         // 30% chance to add error, 70% chance to be accurate
         if (random.nextDouble() < 0.3) {
            // Small undershoot/overshoot (±0.5 to ±2.0 degrees)
            humanErrorYaw = (random.nextGaussian() * 1.0);
            humanErrorPitch = (random.nextGaussian() * 0.8);
         } else {
            // Gradually reduce error back to zero (correction)
            humanErrorYaw *= 0.7;
            humanErrorPitch *= 0.7;
            
            // Clear if very small
            if (Math.abs(humanErrorYaw) < 0.01) humanErrorYaw = 0.0;
            if (Math.abs(humanErrorPitch) < 0.01) humanErrorPitch = 0.0;
         }
      }
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
         
         // Friend check - skip friends if noFriend is enabled
         if (noFriend.get() && Noxium.get.friendManager.isFriend(player.getName().getString())) {
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
    * Render FOV circle with customizable colors
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
      
      // Get custom RGB colors
      int r = (int) fovColorR.get();
      int g = (int) fovColorG.get();
      int b = (int) fovColorB.get();
      
      // Calculate alpha values (0-255)
      int outlineAlpha = (int) (fovAlpha.get() * 255);
      int fillAlpha = (int) (fovFillAlpha.get() * 255);
      
      // Create ARGB colors
      // Change color to green if target is locked
      if (cachedTarget != null) {
         r = 0;
         g = 255;
         b = 0;
      }
      
      int fillColor = (fillAlpha << 24) | (r << 16) | (g << 8) | b;
      int outlineColor = (outlineAlpha << 24) | (r << 16) | (g << 8) | b;
      
      // Draw filled circle if enabled
      if (filled.get()) {
         renderer.circle(centerX, centerY, radius, 0.0F, 1.0F, fillColor);
      }
      
      // Draw outline with smooth rendering
      renderer.circleOutline(centerX, centerY, radius, 0.0F, 1.0F, outlineColor, 1.5F);
   }
   
   /**
    * Checks if the held item is a weapon (sword, axe, or has attack damage)
    */
   private boolean isWeapon(ItemStack stack) {
      if (stack.isEmpty()) {
         return false;
      }
      
      Item item = stack.getItem();
      
      // Check if it's an axe
      if (item instanceof AxeItem) {
         return true;
      }
      
      // Check if item has attack damage attribute (swords, tridents, etc)
      AttributeModifiersComponent modifiers = stack.get(DataComponentTypes.ATTRIBUTE_MODIFIERS);
      if (modifiers != null) {
         for (var entry : modifiers.modifiers()) {
            if (entry.attribute().equals(EntityAttributes.ATTACK_DAMAGE)) {
               return true;
            }
         }
      }
      
      return false;
   }
   
   @Override
   public void onDisable() {
      // Lightweight cleanup - no heavy operations
      target = null;
      cachedTarget = null;
      targetEntity = null;
      targetEntityId = -1;
   }
}
