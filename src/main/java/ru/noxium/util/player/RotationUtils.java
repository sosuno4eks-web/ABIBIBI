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
     * Apply smooth aim rotation with kinetic smoothing and exponential decay
     * for natural, fluid mouse-like movement without jitter or steps
     * 
     * @param target The entity to aim at
     * @param smooth Smoothing factor (0.5 = very smooth, 3.0 = responsive)
     * @param maxTurnSpeed Maximum degrees per tick (2.0 = legit, 15.0 = fast)
     */
    public static void applySmoothAim(Entity target, float smooth, float maxTurnSpeed) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null) return;
        
        // Sub-Frame Interpolation: Get tick delta to sync with monitor refresh rate
        // This is CRITICAL to eliminate steps and make movement fluid
        float tickDelta = client.getRenderTickCounter().getTickProgress(true);
        
        // Calculate target rotations using lerped position (eliminates micro-stutter)
        float[] rotations = getRotationsToEntity(target, tickDelta);
        
        float currentYaw = client.player.getYaw();
        float currentPitch = client.player.getPitch();
        
        float targetYaw = rotations[0];
        float targetPitch = rotations[1];
        
        // Shortest Path Logic: Use wrapDegrees to prevent 360-degree glitches
        // This ensures we ALWAYS take the shortest path
        float yawDiff = MathHelper.wrapDegrees(targetYaw - currentYaw);
        float pitchDiff = MathHelper.wrapDegrees(targetPitch - currentPitch);
        
        // Weighted Smoothing: Exponential decay formula for kinetic movement
        // Formula: currentAngle += (targetAngle - currentAngle) * (1 - smoothness^delta)
        // This creates fast start with soft slowdown at the end
        float smoothFactor = (float) (1.0 - Math.pow(0.95, smooth * tickDelta * 60.0));
        
        // Calculate the change for this frame using exponential decay
        float yawChange = yawDiff * smoothFactor;
        float pitchChange = pitchDiff * smoothFactor;
        
        // Velocity Clamping: Limit max degrees-per-frame scaled by frame time
        // This keeps movement consistent across different FPS
        float maxStepPerFrame = maxTurnSpeed * tickDelta;
        
        // Clamp the change to prevent sudden snaps
        yawChange = MathHelper.clamp(yawChange, -maxStepPerFrame, maxStepPerFrame);
        pitchChange = MathHelper.clamp(pitchChange, -maxStepPerFrame, maxStepPerFrame);
        
        // No Direct Snap: Apply the smoothed change (never set to target directly)
        float newYaw = currentYaw + yawChange;
        float newPitch = currentPitch + pitchChange;
        
        // Wrap the final angles to keep them in valid range
        newYaw = MathHelper.wrapDegrees(newYaw);
        
        // Clamp pitch to valid range (-90 to 90)
        newPitch = MathHelper.clamp(newPitch, -90.0F, 90.0F);
        
        // Apply rotation to player
        client.player.setYaw(newYaw);
        client.player.setPitch(newPitch);
    }
}
