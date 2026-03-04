package ru.noxium.util.render;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.render.Camera;
import net.minecraft.util.math.MathHelper;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Optimized rendering manager for visual modules
 * Implements frustum culling, distance checks, and entity caching
 */
public class OptimizedRenderManager {
    private static final MinecraftClient mc = MinecraftClient.getInstance();
    
    // Culling distances
    private static final double MAX_NAMETAG_DISTANCE = 40.0;
    private static final double MAX_ESP_DISTANCE = 40.0;
    private static final double MAX_CHEST_DISTANCE = 32.0;
    
    // Cached visible entities (updated per frame)
    private static final Map<Entity, CachedEntityData> visibleEntities = new ConcurrentHashMap<>();
    private static long lastUpdateTime = 0;
    private static final long UPDATE_INTERVAL_MS = 16; // ~60 FPS
    
    // Pre-calculated FOV circle vertices (32 segments)
    private static final int FOV_SEGMENTS = 32;
    private static float[] fovCircleVertices = null;
    
    public static class CachedEntityData {
        public final double distance;
        public final Vec3d interpolatedPos;
        public final boolean inFrustum;
        public final long timestamp;
        
        public CachedEntityData(double distance, Vec3d pos, boolean inFrustum) {
            this.distance = distance;
            this.interpolatedPos = pos;
            this.inFrustum = inFrustum;
            this.timestamp = System.currentTimeMillis();
        }
    }
    
    /**
     * Update visible entities cache (call once per frame)
     */
    public static void updateVisibleEntities(float tickDelta) {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastUpdateTime < UPDATE_INTERVAL_MS) {
            return; // Skip update if too soon
        }
        lastUpdateTime = currentTime;
        
        if (mc.world == null || mc.player == null) {
            visibleEntities.clear();
            return;
        }
        
        Camera camera = mc.gameRenderer.getCamera();
        Vec3d cameraPos = camera.getCameraPos();
        
        // Clear old entries
        visibleEntities.clear();
        
        // Update entity cache
        for (Entity entity : mc.world.getEntities()) {
            if (entity == mc.player) continue;
            
            // Interpolate position
            double x = MathHelper.lerp(tickDelta, entity.lastRenderX, entity.getX());
            double y = MathHelper.lerp(tickDelta, entity.lastRenderY, entity.getY());
            double z = MathHelper.lerp(tickDelta, entity.lastRenderZ, entity.getZ());
            Vec3d entityPos = new Vec3d(x, y, z);
            
            // Calculate distance
            double distance = cameraPos.distanceTo(entityPos);
            
            // Frustum culling
            boolean inFrustum = isInFrustum(cameraPos, camera, entityPos);
            
            // Cache the data
            visibleEntities.put(entity, new CachedEntityData(distance, entityPos, inFrustum));
        }
    }
    
    /**
     * Check if entity should be rendered for NameTags
     */
    public static boolean shouldRenderNameTag(Entity entity) {
        CachedEntityData data = visibleEntities.get(entity);
        if (data == null) return false;
        
        return data.inFrustum && data.distance <= MAX_NAMETAG_DISTANCE;
    }
    
    /**
     * Check if entity should be rendered for ESP
     */
    public static boolean shouldRenderESP(Entity entity) {
        CachedEntityData data = visibleEntities.get(entity);
        if (data == null) return false;
        
        return data.inFrustum && data.distance <= MAX_ESP_DISTANCE;
    }
    
    /**
     * Check if block entity should be rendered (chests, etc)
     */
    public static boolean shouldRenderBlockEntity(Vec3d pos) {
        if (mc.player == null) return false;
        
        Camera camera = mc.gameRenderer.getCamera();
        Vec3d cameraPos = camera.getCameraPos();
        double distance = cameraPos.distanceTo(pos);
        
        // Reduce distance when many players nearby
        int nearbyPlayers = getNearbyPlayerCount();
        double maxDistance = nearbyPlayers > 5 ? MAX_CHEST_DISTANCE * 0.75 : MAX_CHEST_DISTANCE;
        
        return distance <= maxDistance && isInFrustum(cameraPos, camera, pos);
    }
    
    /**
     * Get cached entity data
     */
    public static CachedEntityData getCachedData(Entity entity) {
        return visibleEntities.get(entity);
    }
    
    /**
     * Get all visible entities sorted by distance (for rendering order)
     */
    public static List<Entity> getVisibleEntitiesSorted() {
        List<Entity> entities = new ArrayList<>(visibleEntities.keySet());
        entities.sort((e1, e2) -> {
            CachedEntityData d1 = visibleEntities.get(e1);
            CachedEntityData d2 = visibleEntities.get(e2);
            return Double.compare(d2.distance, d1.distance); // Far to near
        });
        return entities;
    }
    
    /**
     * Frustum culling check
     */
    private static boolean isInFrustum(Vec3d cameraPos, Camera camera, Vec3d entityPos) {
        Vec3d toEntity = entityPos.subtract(cameraPos).normalize();
        
        // Get camera direction from yaw and pitch
        float yaw = camera.getYaw();
        float pitch = camera.getPitch();
        double yawRad = Math.toRadians(yaw);
        double pitchRad = Math.toRadians(pitch);
        
        Vec3d cameraDir = new Vec3d(
            -Math.sin(yawRad) * Math.cos(pitchRad),
            -Math.sin(pitchRad),
            Math.cos(yawRad) * Math.cos(pitchRad)
        );
        
        // Dot product for angle check
        double dot = toEntity.dotProduct(cameraDir);
        
        // FOV check (90 degrees = 0.0, behind camera = negative)
        return dot > -0.1; // Allow slightly behind for edge cases
    }
    
    /**
     * Get nearby player count for dynamic distance adjustment
     */
    private static int getNearbyPlayerCount() {
        if (mc.world == null || mc.player == null) return 0;
        
        int count = 0;
        Vec3d playerPos = new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ());
        
        for (Entity entity : mc.world.getEntities()) {
            if (entity instanceof LivingEntity && entity != mc.player) {
                Vec3d entityPos = new Vec3d(entity.getX(), entity.getY(), entity.getZ());
                if (playerPos.distanceTo(entityPos) < 50.0) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    /**
     * Get pre-calculated FOV circle vertices
     */
    public static float[] getFOVCircleVertices(float radius) {
        if (fovCircleVertices == null) {
            fovCircleVertices = new float[FOV_SEGMENTS * 2];
            for (int i = 0; i < FOV_SEGMENTS; i++) {
                double angle = 2.0 * Math.PI * i / FOV_SEGMENTS;
                fovCircleVertices[i * 2] = (float) Math.cos(angle);
                fovCircleVertices[i * 2 + 1] = (float) Math.sin(angle);
            }
        }
        return fovCircleVertices;
    }
    
    /**
     * Clear cache (call on world change)
     */
    public static void clearCache() {
        visibleEntities.clear();
        lastUpdateTime = 0;
    }
}
