package ru.noxium.util.player;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class RotationUtils {
    
    /**
     * Linearly interpolate between two angles, taking the shortest path
     */
    public static float lerpAngle(float current, float target, float alpha) {
        float diff = MathHelper.wrapDegrees(target - current);
        return current + diff * alpha;
    }
    
    /**
     * Calculate yaw and pitch rotations to look at an entity
     * Uses lerped position for smooth interpolation between ticks
     */
    public static float[] getRotationsToEntity(Entity target, float tickDelta) {
        MinecraftClient client = MinecraftClient.getInstance();
        
        // Use camera position for accurate eye-level calculation
        Vec3d playerPos = client.player.getCameraPosVec(tickDelta);
        
        // Use lerped position to avoid micro-stutter at 20 TPS
        Vec3d targetPos = target.getLerpedPos(tickDelta)
                .add(0, target.getHeight() * 0.5, 0);
        
        Vec3d diff = targetPos.subtract(playerPos);
        
        // Calculate horizontal distance
        double distXZ = Math.sqrt(diff.x * diff.x + diff.z * diff.z);
        
        // Calculate yaw (horizontal rotation)
        float yaw = (float)(Math.toDegrees(Math.atan2(diff.z, diff.x)) - 90.0);
        
        // Calculate pitch (vertical rotation)
        float pitch = (float)(-Math.toDegrees(Math.atan2(diff.y, distXZ)));
        
        return new float[]{yaw, pitch};
    }
    
    /**
     * Apply smooth aim rotation towards a target entity with exponential smoothing
     * and ease-out deceleration for natural, fluid mouse-like movement
     * 
     * @param target The entity to aim at
     * @param smooth Smoothing factor (0.05 = very smooth, 0.12 = aggressive)
     * @param maxTurnSpeed Maximum degrees per tick (4.0 = legit, 10.0 = fast)
     */
    public static void applySmoothAim(Entity target, float smooth, float maxTurnSpeed) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null) return;
        
        // Sub-tick Precision: Get tick delta for buttery smooth frame-by-frame rotation
        float tickDelta = client.getRenderTickCounter().getTickProgress(true);
        
        // Calculate target rotations using lerped position (eliminates micro-stutter)
        float[] rotations = getRotationsToEntity(target, tickDelta);
        
        float currentYaw = client.player.getYaw();
        float currentPitch = client.player.getPitch();
        
        float targetYaw = rotations[0];
        float targetPitch = rotations[1];
        
        // No Snap: Use wrapDegrees to find shortest path (prevents 360-degree spins)
        float yawDiff = MathHelper.wrapDegrees(targetYaw - currentYaw);
        float pitchDiff = MathHelper.wrapDegrees(targetPitch - currentPitch);
        
        // Calculate distance to target for ease-out
        float totalDistance = (float) Math.sqrt(yawDiff * yawDiff + pitchDiff * pitchDiff);
        
        // Acceleration/Deceleration: Ease-out when close to target
        // This makes the movement feel 'heavy' and 'fluid', not robotic
        float easeOutFactor = 1.0F;
        if (totalDistance < 5.0F) {
            // Smooth deceleration as we approach target (quadratic ease-out)
            easeOutFactor = totalDistance / 5.0F;
            easeOutFactor = 1.0F - (1.0F - easeOutFactor) * (1.0F - easeOutFactor);
        }
        
        // Exponential Smoothing: Apply smoothing factor for natural interpolation
        // Lower values = more 'weight' and 'drag', higher = more responsive
        float effectiveSmooth = smooth * 0.05F * easeOutFactor;
        
        // Mouse Sensitivity Weight: Calculate fractional movement
        // This ensures we don't teleport, but gradually move towards target
        float yawChange = yawDiff * effectiveSmooth;
        float pitchChange = pitchDiff * effectiveSmooth;
        
        // Clamp to maximum turn speed (prevents snapping on large angles)
        float maxStep = maxTurnSpeed * tickDelta;
        yawChange = MathHelper.clamp(yawChange, -maxStep, maxStep);
        pitchChange = MathHelper.clamp(pitchChange, -maxStep, maxStep);
        
        // Apply the fractional change (not absolute target)
        float newYaw = currentYaw + yawChange;
        float newPitch = currentPitch + pitchChange;
        
        // Clamp pitch to valid range
        newPitch = MathHelper.clamp(newPitch, -90.0F, 90.0F);
        
        // Apply rotation to player
        client.player.setYaw(newYaw);
        client.player.setPitch(newPitch);
    }
}
