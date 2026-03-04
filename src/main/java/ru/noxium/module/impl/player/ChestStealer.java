package ru.noxium.module.impl.player;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import ru.noxium.event.EventInit;
import ru.noxium.event.impl.EventUpdate;
import ru.noxium.module.api.Category;
import ru.noxium.module.api.IModule;
import ru.noxium.module.api.Module;
import ru.noxium.module.api.setting.Setting;
import ru.noxium.module.api.setting.impl.BooleanSetting;
import ru.noxium.module.api.setting.impl.SliderSetting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Chest Stealer module with anti-cheat bypass
 * 
 * Features:
 * - Randomized delay between items (80-150ms)
 * - Randomized slot order (not top-left to bottom-right)
 * - Smart filtering (only valuable items)
 * - Auto-close when done
 * - Human-like CPS (6-10 items/second)
 */
@IModule(
   name = "Chest Stealer",
   description = "Automatically steals items from chests with anti-cheat bypass",
   category = Category.Player,
   bind = -1
)
@Environment(EnvType.CLIENT)
public class ChestStealer extends Module {
   
   // Settings
   public static SliderSetting minDelay = new SliderSetting("Min Delay (ms)", 80.0F, 50.0F, 300.0F, 10.0F, false);
   public static SliderSetting maxDelay = new SliderSetting("Max Delay (ms)", 150.0F, 50.0F, 500.0F, 10.0F, false);
   public static SliderSetting closeDelay = new SliderSetting("Close Delay (ms)", 200.0F, 0.0F, 1000.0F, 50.0F, false);
   public static BooleanSetting autoClose = new BooleanSetting("Auto Close", true);
   public static BooleanSetting smartFilter = new BooleanSetting("Smart Filter", true);
   public static BooleanSetting randomOrder = new BooleanSetting("Random Order", true);
   
   // Internal state
   private long lastStealTime = 0;
   private long nextStealDelay = 0;
   private long closeTime = 0;
   private boolean shouldClose = false;
   private List<Integer> slotOrder = new ArrayList<>();
   private int currentSlotIndex = 0;
   private final Random random = new Random();
   
   public ChestStealer() {
      this.addSettings(new Setting[]{
         minDelay,
         maxDelay,
         closeDelay,
         autoClose,
         smartFilter,
         randomOrder
      });
   }
   
   @Override
   public void onEnable() {
      super.onEnable();
      resetState();
   }
   
   @Override
   public void onDisable() {
      super.onDisable();
      resetState();
   }
   
   @EventInit
   public void onUpdate(EventUpdate e) {
      if (mc.player == null || mc.world == null) {
         return;
      }
      
      // Check if we have a chest screen open
      if (!(mc.currentScreen instanceof GenericContainerScreen)) {
         resetState();
         return;
      }
      
      GenericContainerScreen screen = (GenericContainerScreen) mc.currentScreen;
      GenericContainerScreenHandler handler = screen.getScreenHandler();
      
      // Check if we should close the chest
      if (shouldClose && autoClose.get()) {
         long currentTime = System.currentTimeMillis();
         if (currentTime >= closeTime) {
            mc.player.closeHandledScreen();
            resetState();
            return;
         }
      }
      
      // Initialize slot order if needed
      if (slotOrder.isEmpty()) {
         initializeSlotOrder(handler);
      }
      
      // Check if we can steal next item
      long currentTime = System.currentTimeMillis();
      if (currentTime - lastStealTime < nextStealDelay) {
         return; // Wait for delay
      }
      
      // Try to steal items
      boolean foundItem = false;
      int attempts = 0;
      int maxAttempts = slotOrder.size();
      
      while (!foundItem && attempts < maxAttempts && currentSlotIndex < slotOrder.size()) {
         int slotId = slotOrder.get(currentSlotIndex);
         currentSlotIndex++;
         attempts++;
         
         // Check if slot has an item
         if (handler.getSlot(slotId).hasStack()) {
            ItemStack stack = handler.getSlot(slotId).getStack();
            
            // Apply smart filter
            if (smartFilter.get() && !isValuableItem(stack)) {
               continue; // Skip non-valuable items
            }
            
            // Steal the item using shift-click (QUICK_MOVE)
            mc.interactionManager.clickSlot(
               handler.syncId,
               slotId,
               0,
               SlotActionType.QUICK_MOVE,
               mc.player
            );
            
            foundItem = true;
            lastStealTime = currentTime;
            
            // Generate random delay for next steal (80-150ms default)
            float min = minDelay.get();
            float max = maxDelay.get();
            nextStealDelay = (long) (min + random.nextFloat() * (max - min));
         }
      }
      
      // Check if we're done (no more items to steal)
      if (!foundItem || currentSlotIndex >= slotOrder.size()) {
         if (!shouldClose && autoClose.get()) {
            shouldClose = true;
            closeTime = System.currentTimeMillis() + (long) closeDelay.get();
         }
      }
   }
   
   /**
    * Initialize the slot order for stealing
    * Creates a randomized order if enabled, otherwise sequential
    */
   private void initializeSlotOrder(GenericContainerScreenHandler handler) {
      slotOrder.clear();
      currentSlotIndex = 0;
      
      // Get chest slots (exclude player inventory)
      int chestSize = handler.getRows() * 9;
      
      for (int i = 0; i < chestSize; i++) {
         slotOrder.add(i);
      }
      
      // Randomize order if enabled (anti-cheat bypass)
      if (randomOrder.get()) {
         Collections.shuffle(slotOrder, random);
      }
   }
   
   /**
    * Check if an item is valuable and should be stolen
    * Filters for tools, armor, ores, crystals, gaps, etc.
    */
   private boolean isValuableItem(ItemStack stack) {
      if (stack.isEmpty()) {
         return false;
      }
      
      Item item = stack.getItem();
      
      // Always take these valuable items
      if (item == Items.DIAMOND || item == Items.EMERALD || item == Items.NETHERITE_INGOT ||
          item == Items.GOLD_INGOT || item == Items.IRON_INGOT ||
          item == Items.DIAMOND_BLOCK || item == Items.EMERALD_BLOCK ||
          item == Items.NETHERITE_BLOCK || item == Items.GOLD_BLOCK || item == Items.IRON_BLOCK) {
         return true;
      }
      
      // Crystals and gaps
      if (item == Items.END_CRYSTAL || item == Items.GOLDEN_APPLE || item == Items.ENCHANTED_GOLDEN_APPLE) {
         return true;
      }
      
      // Ores
      if (item == Items.DIAMOND_ORE || item == Items.DEEPSLATE_DIAMOND_ORE ||
          item == Items.EMERALD_ORE || item == Items.DEEPSLATE_EMERALD_ORE ||
          item == Items.GOLD_ORE || item == Items.DEEPSLATE_GOLD_ORE ||
          item == Items.IRON_ORE || item == Items.DEEPSLATE_IRON_ORE ||
          item == Items.ANCIENT_DEBRIS) {
         return true;
      }
      
      // Tools (diamond, netherite)
      String itemName = item.toString().toLowerCase();
      if (itemName.contains("diamond") || itemName.contains("netherite")) {
         if (itemName.contains("sword") || itemName.contains("pickaxe") || 
             itemName.contains("axe") || itemName.contains("shovel") || 
             itemName.contains("hoe") || itemName.contains("helmet") || 
             itemName.contains("chestplate") || itemName.contains("leggings") || 
             itemName.contains("boots")) {
            return true;
         }
      }
      
      // Enchanted books
      if (item == Items.ENCHANTED_BOOK) {
         return true;
      }
      
      // Potions
      if (item == Items.POTION || item == Items.SPLASH_POTION || item == Items.LINGERING_POTION) {
         return true;
      }
      
      // Ender pearls and eyes
      if (item == Items.ENDER_PEARL || item == Items.ENDER_EYE) {
         return true;
      }
      
      // Totems
      if (item == Items.TOTEM_OF_UNDYING) {
         return true;
      }
      
      // Elytra
      if (item == Items.ELYTRA) {
         return true;
      }
      
      // Shulker boxes
      if (itemName.contains("shulker_box")) {
         return true;
      }
      
      // If smart filter is off, take everything
      return false;
   }
   
   /**
    * Reset internal state when chest is closed or module disabled
    */
   private void resetState() {
      slotOrder.clear();
      currentSlotIndex = 0;
      lastStealTime = 0;
      nextStealDelay = 0;
      shouldClose = false;
      closeTime = 0;
   }
}
