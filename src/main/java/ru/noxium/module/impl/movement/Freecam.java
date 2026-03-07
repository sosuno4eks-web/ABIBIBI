package ru.noxium.module.impl.movement;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.util.math.Vec3d;
import ru.noxium.event.EventInit;
import ru.noxium.event.impl.EventPacket;
import ru.noxium.event.impl.EventUpdate;
import ru.noxium.event.player.EventMotion;
import ru.noxium.module.api.Category;
import ru.noxium.module.api.IModule;
import ru.noxium.module.api.Module;
import ru.noxium.module.api.setting.impl.SliderSetting;

/**
 * Freecam Module - Minecraft 1.21.11
 * Client-side noclip movement while appearing stationary on server
 */
@IModule(
    name = "Freecam",
    description = "Fly through blocks while staying still on server",
    category = Category.Player,
    bind = -1
)
@Environment(EnvType.CLIENT)
public class Freecam extends Module {
    
    // Server-side position (where other players see you)
    private double serverX, serverY, serverZ;
    private float serverYaw, serverPitch;
    private boolean serverOnGround;
    
    // Settings
    private final SliderSetting speed;
    
    public Freecam() {
        this.speed = new SliderSetting("Speed", 1.0f, 0.1f, 10.0f, 0.1f, false);
        this.addSettings(speed);
    }
    
    @Override
    public void onEnable() {
        super.onEnable();
        
        if (mc.player == null || mc.world == null) {
            this.setEnable(false);
            return;
        }
        
        // Store server position (where you actually are on server)
        serverX = mc.player.getX();
        serverY = mc.player.getY();
        serverZ = mc.player.getZ();
        serverYaw = mc.player.getYaw();
        serverPitch = mc.player.getPitch();
        serverOnGround = mc.player.isOnGround();
    }
    
    @Override
    public void onDisable() {
        super.onDisable();
        
        if (mc.player != null && mc.world != null) {
            // Disable noclip
            mc.player.noClip = false;
            mc.player.getAbilities().flying = false;
            
            // Teleport back to server position
            mc.player.setPosition(serverX, serverY, serverZ);
            mc.player.setYaw(serverYaw);
            mc.player.setPitch(serverPitch);
            mc.player.setVelocity(Vec3d.ZERO);
        }
    }
    
    @EventInit
    public void onUpdate(EventUpdate event) {
        if (mc.player == null) return;
        
        // Enable noclip (fly through blocks)
        mc.player.noClip = true;
        mc.player.setOnGround(false);
        mc.player.getAbilities().flying = true;
        
        // Set velocity to zero (no falling)
        mc.player.setVelocity(0, 0, 0);
        
        // Calculate movement based on input
        double moveSpeed = speed.get() * 0.1; // Reduced multiplier for better control
        
        double forward = 0;
        double strafe = 0;
        double vertical = 0;
        
        // Get input
        if (mc.options.forwardKey.isPressed()) forward += 1;
        if (mc.options.backKey.isPressed()) forward -= 1;
        if (mc.options.leftKey.isPressed()) strafe -= 1;  // Fixed: left is negative
        if (mc.options.rightKey.isPressed()) strafe += 1; // Fixed: right is positive
        if (mc.options.jumpKey.isPressed()) vertical += 1;
        if (mc.options.sneakKey.isPressed()) vertical -= 1;
        
        // Sprint multiplier
        if (mc.options.sprintKey.isPressed()) {
            moveSpeed *= 2.0;
        }
        
        // Only move if there's input
        if (forward != 0 || strafe != 0 || vertical != 0) {
            // Calculate movement vector based on yaw
            double yawRad = Math.toRadians(mc.player.getYaw());
            
            // Forward/backward movement
            double moveX = -Math.sin(yawRad) * forward * moveSpeed;
            double moveZ = Math.cos(yawRad) * forward * moveSpeed;
            
            // Strafe movement
            moveX += Math.cos(yawRad) * strafe * moveSpeed;
            moveZ += Math.sin(yawRad) * strafe * moveSpeed;
            
            // Vertical movement
            double moveY = vertical * moveSpeed;
            
            // Apply movement to CLIENT position
            double newX = mc.player.getX() + moveX;
            double newY = mc.player.getY() + moveY;
            double newZ = mc.player.getZ() + moveZ;
            
            mc.player.setPosition(newX, newY, newZ);
        }
    }
    
    @EventInit
    public void onMotion(EventMotion event) {
        if (mc.player == null) return;
        
        // Override motion event to send SERVER position (not client position)
        // This makes you appear stationary on server
        event.setPosX(serverX);
        event.setPosY(serverY);
        event.setPosZ(serverZ);
        event.setYaw(serverYaw);
        event.setPitch(serverPitch);
        event.setOnGround(serverOnGround);
    }
    
    @EventInit
    public void onPacket(EventPacket event) {
        if (mc.player == null) return;
        
        // Cancel all movement packets to server
        // This prevents server from knowing you moved
        if (event.getPacket() instanceof PlayerMoveC2SPacket) {
            event.cancel();
            
            // Send fake packet with server position instead
            // Constructor: Full(double x, double y, double z, float yaw, float pitch, boolean onGround, boolean horizontalCollision)
            PlayerMoveC2SPacket fakePacket = new PlayerMoveC2SPacket.Full(
                serverX,
                serverY,
                serverZ,
                serverYaw,
                serverPitch,
                serverOnGround,
                false // horizontalCollision
            );
            
            // Send fake packet
            if (mc.getNetworkHandler() != null) {
                mc.getNetworkHandler().sendPacket(fakePacket);
            }
        }
    }
    
    /**
     * Check if freecam is currently active
     */
    public boolean isFreecamActive() {
        return this.enable;
    }
}
