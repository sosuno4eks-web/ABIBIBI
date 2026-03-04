package ru.noxium.module.impl.combat;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import ru.noxium.Noxium;
import ru.noxium.event.EventInit;
import ru.noxium.event.impl.EventUpdate;
import ru.noxium.module.api.Category;
import ru.noxium.module.api.IModule;
import ru.noxium.module.api.Module;
import ru.noxium.module.api.setting.Setting;
import ru.noxium.module.api.setting.impl.BooleanSetting;
import ru.noxium.module.api.setting.impl.MultiBooleanSetting;
import ru.noxium.module.api.setting.impl.SliderSetting;

import java.util.Random;

/**
 * Refactored TriggerBot with Criticals toggle and merged logic
 * 
 * Logic Flow:
 * 1. Check crosshairTarget is LivingEntity within 3.0 blocks
 * 2. Check attack cooldown >= 1.0f (100%)
 * 3. Branching:
 *    - Criticals OFF: Attack immediately
 *    - Criticals ON:
 *      - Space NOT held: Attack normally
 *      - Space IS held: Only attack if falling (!onGround && fallDistance > 0)
 * 4. Sprint Reset for every attack
 * 5. Random delay (10-40ms)
 */
@IModule(
   name = "Trigger Bot",
   description = "TriggerBot with Criticals toggle and Sprint Reset",
   category = Category.Combat,
   bind = -1
)
@Environment(EnvType.CLIENT)
public class TriggerBot extends Module {
   // Target selection settings
   public static MultiBooleanSetting targets = new MultiBooleanSetting(
      "Targets", 
      new BooleanSetting("Players", true), 
      new BooleanSetting("Naked", true), 
      new BooleanSetting("Mobs", true)
   );
   
   // Basic settings
   public static SliderSetting range = new SliderSetting("Range", 3.0F, 2.0F, 6.0F, 0.1F, false);
   public static BooleanSetting criticals = new BooleanSetting("Criticals", false);
   public static BooleanSetting onlyWeapons = new BooleanSetting("Only With Weapons", true);
   public static BooleanSetting ignoreEating = new BooleanSetting("Ignore While Eating", true);
   public static BooleanSetting ignoreTeam = new BooleanSetting("Ignore Team", true);
   
   // Sprint Reset (W-Tap/S-Tap bypass)
   public static BooleanSetting sprintReset = new BooleanSetting("Sprint Reset", true);
   
   // Anti-cheat bypass settings (10-40ms delay)
   public static SliderSetting minDelay = new SliderSetting("Min Delay (ms)", 10.0F, 0.0F, 100.0F, 1.0F, false);
   public static SliderSetting maxDelay = new SliderSetting("Max Delay (ms)", 40.0F, 0.0F, 200.0F, 1.0F, false);
   
   // Internal state variables
   private long lastAttackTime = 0;
   private long nextAttackDelay = 0;
   private LivingEntity currentTarget = null;
   private long targetDetectedTime = 0;
   private final Random random = new Random();

   public TriggerBot() {
      this.addSettings(new Setting[]{
         targets, 
         range,
         criticals,
         onlyWeapons, 
         ignoreEating, 
         ignoreTeam,
         sprintReset,
         minDelay,
         maxDelay
      });
   }

   @EventInit
   public void onUpdate(EventUpdate e) {
      if (mc.player == null || mc.world == null || mc.interactionManager == null) {
         return;
      }

      if (!mc.player.isAlive()) {
         this.toggle();
         return;
      }

      // Check if eating - don't attack while eating
      if (ignoreEating.get() && mc.player.isUsingItem()) {
         return;
      }

      // Check if holding weapon - only attack with weapons if enabled
      if (onlyWeapons.get()) {
         ItemStack heldStack = mc.player.getMainHandStack();
         if (!isWeapon(heldStack)) {
            return;
         }
      }

      // STEP 1: Initial Check - crosshairTarget must be LivingEntity within 3.0 blocks
      LivingEntity target = getTargetFromCrosshair();
      
      if (target == null || !isValidTarget(target)) {
         // No valid target - reset state
         currentTarget = null;
         return;
      }

      // STEP 2: Check Attack Cooldown - must be 100% ready
      if (mc.player.getAttackCooldownProgress(0.5F) < 1.0F) {
         // Cooldown not ready - wait
         return;
      }

      // STEP 3: Branching Logic based on 'Criticals' toggle
      if (criticals.get()) {
         // CRITICALS TOGGLE IS ON - Check Space Bar
         boolean spaceHeld = mc.options.jumpKey.isPressed();
         
         if (spaceHeld) {
            // Sub-condition B: Space IS held - ONLY attack if falling
            if (mc.player.isOnGround() || mc.player.fallDistance <= 0.0F) {
               // On ground or not falling - WAIT, do not attack
               currentTarget = null;
               return;
            }
            // Falling conditions met - proceed to attack
         }
         // Sub-condition A: Space NOT held - attack normally (proceed to attack)
      }
      // CRITICALS TOGGLE IS OFF - attack immediately (proceed to attack)

      // STEP 4: Anti-Cheat - Random delay (10-40ms)
      long currentTime = System.currentTimeMillis();
      
      // New target detected - set initial delay
      if (currentTarget != target) {
         currentTarget = target;
         targetDetectedTime = currentTime;
         
         // Generate random delay (10-40ms default)
         float min = minDelay.get();
         float max = maxDelay.get();
         nextAttackDelay = (long) (min + random.nextFloat() * (max - min));
      }
      
      // Check if enough time has passed since target detection
      if (currentTime - targetDetectedTime < nextAttackDelay) {
         return; // Wait for delay to pass
      }
      
      // STEP 5: Legit Sprint Reset (W-Tap/S-Tap bypass)
      boolean wasSprintingBefore = mc.player.isSprinting();
      
      if (sprintReset.get() && wasSprintingBefore) {
         // BEFORE attack: Stop sprinting
         mc.player.setSprinting(false);
      }
      
      // Perform the attack
      mc.interactionManager.attackEntity(mc.player, target);
      mc.player.swingHand(mc.player.getActiveHand());
      
      if (sprintReset.get() && wasSprintingBefore) {
         // AFTER attack: Resume sprinting if forward key is held
         if (mc.options.forwardKey.isPressed()) {
            mc.player.setSprinting(true);
         }
      }
      
      // Update attack tracking
      lastAttackTime = currentTime;
      
      // Generate new random delay for next attack
      float min = minDelay.get();
      float max = maxDelay.get();
      nextAttackDelay = (long) (min + random.nextFloat() * (max - min));
      targetDetectedTime = currentTime;
   }
   
   /**
    * Gets the entity from crosshair target (mc.crosshairTarget)
    * Returns null if not a LivingEntity or out of range (3.0 blocks)
    */
   private LivingEntity getTargetFromCrosshair() {
      if (mc.crosshairTarget == null || mc.crosshairTarget.getType() != HitResult.Type.ENTITY) {
         return null;
      }
      
      EntityHitResult entityHit = (EntityHitResult) mc.crosshairTarget;
      Entity entity = entityHit.getEntity();
      
      if (!(entity instanceof LivingEntity)) {
         return null;
      }
      
      LivingEntity living = (LivingEntity) entity;
      
      // Check if within range (3.0 blocks default)
      if (mc.player.distanceTo(living) > range.get()) {
         return null;
      }
      
      return living;
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

   /**
    * Validates if an entity is a valid target based on configured filters
    */
   private boolean isValidTarget(LivingEntity entity) {
      // Don't target ourselves
      if (entity instanceof ClientPlayerEntity) {
         return false;
      }
      
      // Check distance
      if (mc.player.distanceTo(entity) > range.get()) {
         return false;
      }
      
      // Player-specific checks
      if (entity instanceof PlayerEntity p) {
         // Don't attack friends
         if (Noxium.get.friendManager.isFriend(p.getName().getString())) {
            return false;
         }
         
         // Don't attack teammates if enabled
         if (ignoreTeam.get() && mc.player.isTeammate(p)) {
            return false;
         }
         
         // Check if players are enabled as targets
         if (!targets.get("Players")) {
            return false;
         }
         
         // Check naked players filter
         if (entity.getArmor() == 0 && !targets.get("Naked")) {
            return false;
         }
         
         // Don't attack creative mode players
         if (p.isCreative()) {
            return false;
         }
      }
      
      // Mob-specific checks
      if ((entity instanceof Monster || entity instanceof SlimeEntity || 
           entity instanceof VillagerEntity || entity instanceof AnimalEntity) && 
          !targets.get("Mobs")) {
         return false;
      }
      
      // Final checks: not invulnerable, alive, and not an armor stand
      return !entity.isInvulnerable() && entity.isAlive() && !(entity instanceof ArmorStandEntity);
   }
}
