package ru.noxium.module.impl.player;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import org.lwjgl.glfw.GLFW;
import ru.noxium.Noxium;
import ru.noxium.event.EventInit;
import ru.noxium.event.impl.EventUpdate;
import ru.noxium.event.input.KeyInputEvent;
import ru.noxium.event.input.MouseButtonEvent;
import ru.noxium.module.api.Category;
import ru.noxium.module.api.IModule;
import ru.noxium.module.api.Module;
import ru.noxium.module.api.setting.Setting;
import ru.noxium.module.api.setting.impl.BindSettings;
import ru.noxium.module.api.setting.impl.BooleanSetting;
import ru.noxium.module.api.setting.impl.SliderSetting;
import ru.noxium.util.other.StopWatchShadow;
import ru.noxium.util.render.utils.SoundUtil;

@IModule(
   name = "Middle Click",
   category = Category.Player,
   description = "Pearl throw and friend management",
   bind = -1
)
@Environment(EnvType.CLIENT)
public class MiddleClick extends Module {
   public static BooleanSetting pearl = new BooleanSetting("Pearl", true);
   public static BindSettings pearlkey = new BindSettings("Pearl Key", -1).hidden(() -> !pearl.get());
   public static BooleanSetting legitPearl = new BooleanSetting("Legit Pearl", false).hidden(() -> !pearl.get());
   public static SliderSetting pearlDelay = new SliderSetting("Pearl Delay", 0.1F, 0.1F, 1.0F, 0.1F, false).hidden(() -> !pearl.get() || !legitPearl.get());
   public static BooleanSetting friend = new BooleanSetting("Friend", true);
   public static BindSettings friendkey = new BindSettings("Friend Key", -1).hidden(() -> !friend.get());
   private final StopWatchShadow cooldown = new StopWatchShadow();
   
   // Legit mode state tracking
   private boolean isThrowingPearl = false;
   private int pearlSlot = -1;
   private int previousSlot = -1;
   private long slotSwitchTime = 0;
   private int throwStage = 0; // 0: idle, 1: switched to pearl, 2: thrown, 3: switching back

   public MiddleClick() {
      this.addSettings(new Setting[]{pearl, pearlkey, legitPearl, pearlDelay, friend, friendkey});
   }

   @EventInit
   public void onKey(KeyInputEvent e) {
      if (!this.enable || mc.player == null || mc.world == null) {
         return;
      }

      // Handle Pearl key binding (keyboard)
      if (pearl.get() && pearlkey.get() != -1 && e.key() == pearlkey.get() && this.cooldown.hasTimeElapsed(200L)) {
         handlePearlAction();
      }

      // Handle Friend key binding (keyboard)
      if (friend.get() && friendkey.get() != -1 && e.key() == friendkey.get() && this.cooldown.hasTimeElapsed(200L)) {
         handleFriendAction();
      }
   }
   
   @EventInit
   public void onUpdate(EventUpdate e) {
      if (!this.enable || mc.player == null || mc.world == null) {
         return;
      }
      
      // Handle legit pearl throwing with delays
      if (isThrowingPearl && legitPearl.get()) {
         handleLegitPearlThrow();
      }
   }

   @EventInit
   public void onMouseButton(MouseButtonEvent e) {
      if (!this.enable || mc.player == null || mc.world == null) {
         return;
      }

      // Only trigger on press (GLFW_PRESS = 1)
      if (e.action() != GLFW.GLFW_PRESS) {
         return;
      }

      // Handle middle mouse button for Pearl (GLFW_MOUSE_BUTTON_MIDDLE = 2)
      if (pearl.get() && e.button() == GLFW.GLFW_MOUSE_BUTTON_MIDDLE && this.cooldown.hasTimeElapsed(200L)) {
         handlePearlAction();
      }

      // Handle Pearl key if it's a mouse button
      if (pearl.get() && pearlkey.get() != -1 && e.button() == pearlkey.get() && this.cooldown.hasTimeElapsed(200L)) {
         handlePearlAction();
      }

      // Handle Friend key if it's a mouse button
      if (friend.get() && friendkey.get() != -1 && e.button() == friendkey.get() && this.cooldown.hasTimeElapsed(200L)) {
         handleFriendAction();
      }
   }

   private void handlePearlAction() {
      if (mc.player == null || mc.interactionManager == null) {
         return;
      }

      // Find ender pearl in hotbar (slots 0-8 only)
      int foundSlot = -1;
      for (int i = 0; i < 9; i++) {
         if (mc.player.getInventory().getStack(i).isOf(Items.ENDER_PEARL)) {
            foundSlot = i;
            break;
         }
      }
      
      if (foundSlot == -1) {
         return; // No pearl found in hotbar
      }
      
      // Check if legit mode is enabled
      if (legitPearl.get()) {
         // Start legit throw sequence
         isThrowingPearl = true;
         pearlSlot = foundSlot;
         previousSlot = mc.player.getInventory().getSelectedSlot();
         throwStage = 0;
         slotSwitchTime = System.currentTimeMillis();
      } else {
         // Instant throw (original behavior)
         int prevSlot = mc.player.getInventory().getSelectedSlot();
         
         // Send slot update packet to server
         mc.player.getInventory().setSelectedSlot(foundSlot);
         mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(foundSlot));
         
         // Throw the pearl
         mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
         
         // Switch back to previous slot
         mc.player.getInventory().setSelectedSlot(prevSlot);
         mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(prevSlot));
      }
      
      this.cooldown.reset();
   }
   
   private void handleLegitPearlThrow() {
      if (mc.player == null || mc.interactionManager == null) {
         return;
      }
      
      long currentTime = System.currentTimeMillis();
      long delayMs = (long) (pearlDelay.get() * 1000); // Convert seconds to milliseconds
      
      switch (throwStage) {
         case 0:
            // Stage 0: Switch to pearl slot
            mc.player.getInventory().setSelectedSlot(pearlSlot);
            mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(pearlSlot));
            slotSwitchTime = currentTime;
            throwStage = 1;
            break;
            
         case 1:
            // Stage 1: Wait for delay, then throw pearl
            if (currentTime - slotSwitchTime >= delayMs) {
               mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
               slotSwitchTime = currentTime;
               throwStage = 2;
            }
            break;
            
         case 2:
            // Stage 2: Wait for delay, then switch back
            if (currentTime - slotSwitchTime >= delayMs) {
               mc.player.getInventory().setSelectedSlot(previousSlot);
               mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(previousSlot));
               throwStage = 3;
            }
            break;
            
         case 3:
            // Stage 3: Complete - reset state
            isThrowingPearl = false;
            pearlSlot = -1;
            previousSlot = -1;
            throwStage = 0;
            break;
      }
   }

   private void handleFriendAction() {
      if (mc.player == null) {
         return;
      }

      HitResult hitResult = mc.crosshairTarget;
      
      // Ensure we're actually looking at an entity
      if (hitResult == null || hitResult.getType() != Type.ENTITY) {
         return;
      }

      // Ensure it's a player entity
      if (!(((EntityHitResult)hitResult).getEntity() instanceof PlayerEntity player)) {
         return;
      }

      String name = player.getName().getString();
      
      // Toggle friend status
      if (!Noxium.get.friendManager.isFriend(name)) {
         // Add friend
         Text msg = Text.literal("Friend - ")
            .formatted(Formatting.WHITE)
            .append(Text.literal(name).formatted(Formatting.GREEN))
            .append(Text.literal(" added").formatted(Formatting.GRAY));
         mc.player.sendMessage(msg, false);
         Noxium.get.friendManager.add(name);
         SoundUtil.playSound_wav("add", 0.5F);
      } else {
         // Remove friend
         Text msg = Text.literal("Friend - ")
            .formatted(Formatting.WHITE)
            .append(Text.literal(name).formatted(Formatting.RED))
            .append(Text.literal(" removed").formatted(Formatting.GRAY));
         mc.player.sendMessage(msg, false);
         Noxium.get.friendManager.remove(name);
         SoundUtil.playSound_wav("remove", 0.5F);
      }

      this.cooldown.reset();
   }
}
