package ru.noxium.module.impl.visuals.HUD;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.util.Identifier;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL11;
import ru.noxium.module.impl.combat.AimAssist;
import ru.noxium.module.impl.visuals.Hud;
import ru.noxium.ui.draggable.DraggableManager;
import ru.noxium.util.render.animation.util.Animation;
import ru.noxium.util.render.animation.util.Easings;
import ru.noxium.util.render.core.Renderer2D;
import ru.noxium.util.render.math.ScaledResolution;
import ru.noxium.util.render.math.animation.AnimationMath;
import ru.noxium.util.render.text.FontRegistry;

@Environment(EnvType.CLIENT)
public class TargetHUD {
   public static MinecraftClient mc = MinecraftClient.getInstance();
   private static float animatedHealthPct = 0.0F;
   private static float animatedAbsorptionPct = 0.0F;
   private static float animatedEntityHealthPct = 0.0F;
   private static float animatedDamagePct = 0.0F;
   private static float animatedEntityDamagePct = 0.0F;
   public static Animation openAnimation = new Animation();
   private static Entity lastEntity = null;
   private static float circleTrackPct = 0.0F;
   private static final List<TargetHUD.PendingItemRender> pendingItems = new ArrayList<>();

   public static void targetHUD(Renderer2D r2, DrawContext drawContext) {
      ScaledResolution sr = new ScaledResolution(mc);
      float baseWidth = 194.14F;

      Entity auraTarget = AimAssist.target;
      boolean chatOpen = mc.currentScreen instanceof ChatScreen;
      boolean shouldShow = auraTarget != null || (chatOpen && mc.player != null);

      if (auraTarget != null) {
         lastEntity = auraTarget;
      } else if (chatOpen && mc.player != null) {
         lastEntity = mc.player;
      }

      Entity currentTarget = shouldShow ? (auraTarget != null ? auraTarget : mc.player) : lastEntity;
      float height = 63.34F;

      circleTrackPct = AnimationMath.animation(circleTrackPct, shouldShow ? 1.0F : 0.0F, 0.02F);

      openAnimation.update();
      openAnimation.run(shouldShow ? 1.0 : 0.0, 0.8F, Easings.ELASTIC_OUT);
      float alpha = openAnimation.get();
      if (alpha <= 0.001F) {
         animatedHealthPct = 0.0F;
         animatedAbsorptionPct = 0.0F;
         animatedEntityHealthPct = 0.0F;
         animatedDamagePct = 0.0F;
         animatedEntityDamagePct = 0.0F;
         circleTrackPct = 0.0F;
         lastEntity = null;
      } else {
         float nameWidth = 0.0F;
         float statsWidth = 0.0F;

         if (currentTarget != null) {
            String name = currentTarget instanceof CreeperEntity ? "Грустный крипер"
                  : currentTarget.getName().getString();
            nameWidth = r2.measureText(FontRegistry.INTER_MEDIUM, name, 28.0F).width;

            if (currentTarget instanceof LivingEntity livingTarget) {
               float hp = livingTarget.getHealth();
               float abs = livingTarget.getAbsorptionAmount();
               float targetTotalHP = hp + abs;

               float playerHP = mc.player != null ? mc.player.getHealth() : 0F;
               float playerAbs = mc.player != null ? mc.player.getAbsorptionAmount() : 0F;
               float playerTotalHP = playerHP + playerAbs;

               String winLoseString;
               if (playerTotalHP > targetTotalHP) {
                  winLoseString = "Win";
               } else if (playerTotalHP < targetTotalHP) {
                  winLoseString = "Lose";
               } else {
                  winLoseString = "Draw";
               }

               float displayHp = (livingTarget instanceof PlayerEntity) ? (hp + abs) : hp;
               String hpStr = String.format("%.1f", displayHp).replace('.', ',');

               float winLoseW = r2.measureText(FontRegistry.INTER_MEDIUM, winLoseString, 24.0F).width;
               float hpW = r2.measureText(FontRegistry.INTER_MEDIUM, hpStr, 24.0F).width;

               statsWidth = winLoseW + 5.0F + hpW;
            }
         }

         float width = Math.max(baseWidth, 74.0F + Math.max(nameWidth, statsWidth) + 20.0F);
         float preferredX = (sr.getWidth() - width) / 2.0F;
         float preferredY = (sr.getHeight() - height) / 2.0F;
         DraggableManager.DragSession session = DraggableManager.getInstance().beginDrag("targetHUD", preferredX,
               preferredY, width, height);
         float x = session.positionX();
         float y = session.positionY() + (20.0F - 20.0F * alpha);
         Hud.drawClientRect(r2, x, y, width, height, 13.0F, alpha, 1.0F);
         if (currentTarget instanceof PlayerEntity targetPlayer) {
            renderPlayer(r2, drawContext, targetPlayer, x, y, width, height, alpha, shouldShow);
         } else if (currentTarget instanceof LivingEntity livingEntity) {
            renderLiving(r2, drawContext, livingEntity, x, y, width, height, alpha, shouldShow);
         }

         r2.flush();
         renderPendingItems(drawContext);
         DraggableManager.getInstance().endDrag(session);
      }
   }

   private static void renderPlayer(Renderer2D r2, DrawContext drawContext, PlayerEntity targetPlayer, float x, float y,
         float width, float height, float alpha, boolean shouldShow) {
      float headSize = 36.0F;
      float headX = x + 12.0F;
      float headY = y + (height - headSize) / 2.0F;

      renderPlayerHead(r2, drawContext, targetPlayer, headX, headY, headSize, alpha);

      float maxHP = targetPlayer.getMaxHealth();
      float hp = targetPlayer.getHealth();
      float abs = targetPlayer.getAbsorptionAmount();

      float healthPct = shouldShow ? Math.min(hp / maxHP, 1.0F) : 0.0F;
      float absorptionPct = shouldShow ? Math.min(abs / maxHP, 1.0F) : 0.0F;

      animatedHealthPct = AnimationMath.animation(animatedHealthPct, healthPct, 0.2F);
      animatedDamagePct = AnimationMath.animation(animatedDamagePct, healthPct, 0.05F);
      animatedAbsorptionPct = AnimationMath.animation(animatedAbsorptionPct, absorptionPct, 0.05F);

      r2.pushAlpha(alpha);

      float centerX = headX + headSize / 2.0F;
      float centerY = headY + headSize / 2.0F;
      float circleRadius = headSize / 2.0F + 4.0F;
      int mainColor = Renderer2D.ColorUtil.getMainColor(1, 1);
      int trackColor = Renderer2D.ColorUtil.replAlpha(mainColor, 40);

      r2.circleOutline(centerX, centerY, circleRadius, 270.0F, circleTrackPct, trackColor, 3.0F);
      if (animatedDamagePct > 0.001F) {
         r2.circleOutline(centerX, centerY, circleRadius, 270.0F, Math.min(animatedDamagePct, circleTrackPct),
               Color.WHITE.getRGB(), 3.0F);
      }
      if (animatedHealthPct > 0.001F) {
         r2.circleOutline(centerX, centerY, circleRadius, 270.0F, Math.min(animatedHealthPct, circleTrackPct),
               mainColor, 3.0F);
      }
      if (animatedAbsorptionPct > 0.001F) {
         r2.circleOutline(centerX, centerY, circleRadius + 3.5F, 270.0F,
               Math.min(animatedAbsorptionPct, circleTrackPct),
               new Color(255, 200, 0).getRGB(), 2.0F);
      }

      // Compact layout offsets
      float nameY = y + 15.0F;
      float statsY = y + 30.0F;

      r2.text(FontRegistry.INTER_MEDIUM, x + 74.0F, nameY, 28.0F, targetPlayer.getName().getString(), -1);

      float playerHP = mc.player != null ? mc.player.getHealth() : 0F;
      float playerAbs = mc.player != null ? mc.player.getAbsorptionAmount() : 0F;
      float playerTotalHP = playerHP + playerAbs;
      float targetTotalHP = hp + abs;

      String winLoseString;
      int winLoseColor;
      if (playerTotalHP > targetTotalHP) {
         winLoseString = "Win";
         winLoseColor = new Color(85, 255, 85).getRGB();
      } else if (playerTotalHP < targetTotalHP) {
         winLoseString = "Lose";
         winLoseColor = new Color(255, 85, 85).getRGB();
      } else {
         winLoseString = "Draw";
         winLoseColor = new Color(255, 255, 85).getRGB();
      }

      String hpStr = String.format("%.1f", hp + abs).replace('.', ',');
      float winLoseWidth = r2.measureText(FontRegistry.INTER_MEDIUM, winLoseString, 24.0F).width;

      r2.text(FontRegistry.INTER_MEDIUM, x + 74.0F, statsY, 24.0F, winLoseString, winLoseColor);
      r2.text(FontRegistry.INTER_MEDIUM, x + 74.0F + winLoseWidth + 5.0F, statsY, 24.0F, hpStr, -1);

      r2.popAlpha();
      if (targetPlayer.getArmor() > 0) {
         float armorX = x + 72.0F;
         float armorY = y + 42.0F; // Compact position
         EquipmentSlot[] slots = new EquipmentSlot[] { EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS,
               EquipmentSlot.FEET };

         for (int i = 0; i < 4; i++) {
            float slotX = armorX + i * 22.0F;
            float slotY = armorY;
            int slotCol = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1),
                  (int) (40.0F * alpha));
            r2.rect(slotX, slotY, 17.0F, 17.0F, 3.0F, slotCol);
            ItemStack stack = targetPlayer.getEquippedStack(slots[i]);
            if (!stack.isEmpty()) {
               pendingItems.add(new TargetHUD.PendingItemRender(stack, slotX + 0.5F, slotY + 0.5F, i));
            } else {
               r2.pushAlpha(alpha);
               r2.text(
                     FontRegistry.ICONS, slotX + 3.0F, slotY + 12.0F, 20.0F, "6",
                     Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1), 100));
               r2.popAlpha();
            }
         }
      }
   }

   private static void renderLiving(Renderer2D r2, DrawContext drawContext, LivingEntity entity, float x, float y,
         float width, float height, float alpha, boolean shouldShow) {
      float headSize = 36.0F;
      float headX = x + 12.0F;
      float headY = y + (height - headSize) / 2.0F;

      renderEntityHead(r2, drawContext, entity, headX, headY, headSize, alpha);

      String name = entity instanceof CreeperEntity ? "Грустный крипер" : entity.getName().getString();
      float nameY = y + 15.0F;
      float statsY = y + 30.0F;

      r2.text(FontRegistry.INTER_MEDIUM, x + 74.0F, nameY, 28.0F, name, -1);

      int mainColor = Renderer2D.ColorUtil.getMainColor(1, 1);
      float playerHP = mc.player != null ? mc.player.getHealth() : 0F;
      float playerAbs = mc.player != null ? mc.player.getAbsorptionAmount() : 0F;
      float playerTotalHP = playerHP + playerAbs;
      float targetTotalHP = entity.getHealth();

      String winLoseString;
      int winLoseColor;
      if (playerTotalHP > targetTotalHP) {
         winLoseString = "Win";
         winLoseColor = new Color(85, 255, 85).getRGB();
      } else if (playerTotalHP < targetTotalHP) {
         winLoseString = "Lose";
         winLoseColor = new Color(255, 85, 85).getRGB();
      } else {
         winLoseString = "Draw";
         winLoseColor = new Color(255, 255, 85).getRGB();
      }

      r2.pushAlpha(alpha);
      String hpStr = String.format("%.1f", entity.getHealth()).replace('.', ',');
      float winLoseWidth = r2.measureText(FontRegistry.INTER_MEDIUM, winLoseString, 24.0F).width;

      r2.text(FontRegistry.INTER_MEDIUM, x + 74.0F, statsY, 24.0F, winLoseString, winLoseColor);
      r2.text(FontRegistry.INTER_MEDIUM, x + 74.0F + winLoseWidth + 5.0F, statsY, 24.0F, hpStr, -1);
      float targetHealthPct = shouldShow ? Math.min(entity.getHealth() / entity.getMaxHealth(), 1.0F) : 0.0F;
      animatedEntityHealthPct = AnimationMath.animation(animatedEntityHealthPct, targetHealthPct, 0.2F);
      animatedEntityDamagePct = AnimationMath.animation(animatedEntityDamagePct, targetHealthPct, 0.05F);

      float centerX = headX + headSize / 2.0F;
      float centerY = headY + headSize / 2.0F;
      float circleRadius = headSize / 2.0F + 4.0F;
      int trackColor = Renderer2D.ColorUtil.replAlpha(mainColor, 40);

      r2.circleOutline(centerX, centerY, circleRadius, 270.0F, circleTrackPct, trackColor, 3.0F);
      if (animatedEntityDamagePct > 0.001F) {
         r2.circleOutline(centerX, centerY, circleRadius, 270.0F, Math.min(animatedEntityDamagePct, circleTrackPct),
               Color.WHITE.getRGB(), 3.0F);
      }
      if (animatedEntityHealthPct > 0.001F) {
         r2.circleOutline(centerX, centerY, circleRadius, 270.0F, Math.min(animatedEntityHealthPct, circleTrackPct),
               mainColor, 3.0F);
      }

      r2.popAlpha();
   }

   private static void renderPlayerHead(Renderer2D r2, DrawContext drawContext, PlayerEntity player, float x, float y,
         float size, float alpha) {
      if (player == null)
         return;

      r2.flush();

      // Draw rounded background
      int bgColor = Renderer2D.ColorUtil.replAlpha(0x000000, (int) (60 * alpha));
      r2.circle(x + size / 2.0F, y + size / 2.0F, size / 2.0F, 0, 1.0F, bgColor);
      r2.flush();

      Identifier skin = Identifier.of("minecraft", "textures/entity/player/wide/steve.png");
      if (player instanceof AbstractClientPlayerEntity) {
         try {
            Object skinTextures = ((AbstractClientPlayerEntity) player).getClass().getMethod("getSkin").invoke(player);
            for (java.lang.reflect.Method m : skinTextures.getClass().getMethods()) {
               if (m.getReturnType() == Identifier.class && m.getParameterCount() == 0) {
                  skin = (Identifier) m.invoke(skinTextures);
                  break;
               }
            }
         } catch (Exception e) {
            try {
               Object skinTextures = ((AbstractClientPlayerEntity) player).getClass().getMethod("getSkinTextures")
                     .invoke(player);
               for (java.lang.reflect.Method m : skinTextures.getClass().getMethods()) {
                  if (m.getReturnType() == Identifier.class && m.getParameterCount() == 0) {
                     skin = (Identifier) m.invoke(skinTextures);
                     break;
                  }
               }
            } catch (Exception e2) {
            }
         }
      }

      try {
         net.minecraft.client.texture.AbstractTexture texture = mc.getTextureManager().getTexture(skin);
         if (texture == null)
            return;

         int glId = -1;
         try {
            java.lang.reflect.Method getGlId = texture.getClass().getMethod("getGlId");
            glId = (int) getGlId.invoke(texture);
         } catch (Exception e1) {
            try {
               java.lang.reflect.Method getGlTexture = texture.getClass().getMethod("getGlTexture");
               Object internalTexture = getGlTexture.invoke(texture);
               if (internalTexture != null) {
                  java.lang.reflect.Method internalGetId = internalTexture.getClass().getMethod("getGlId");
                  glId = (int) internalGetId.invoke(internalTexture);
               }
            } catch (Exception e2) {
            }
         }

         if (glId > 0) {
            r2.pushAlpha(alpha);
            // We use a rounded clip to make the face circular
            r2.pushRoundedClipRect(x, y, size, size, size / 2.0f, size / 2.0f, size / 2.0f, size / 2.0f);

            // Draw face (8, 8, 8, 8) in 64x64 skin texture -> UV (8/64, 8/64) to (16/64,
            // 16/64)
            r2.drawRgbaTextureWithUV(glId, x, y, size, size, 0.125f, 0.125f, 0.25f, 0.25f);

            // Draw hat (40, 8, 8, 8) in 64x64 skin texture -> UV (40/64, 8/64) to (48/64,
            // 16/64)
            r2.drawRgbaTextureWithUV(glId, x, y, size, size, 0.625f, 0.125f, 0.75f, 0.25f);

            r2.popClipRect();
            r2.popAlpha();
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   private static void renderEntityHead(Renderer2D r2, DrawContext drawContext, LivingEntity entity, float x, float y,
         float size, float alpha) {
      if (entity == null)
         return;

      r2.flush();
      int bgColor = Renderer2D.ColorUtil.replAlpha(0x000000, (int) (60 * alpha));
      r2.circle(x + size / 2.0F, y + size / 2.0F, size / 2.0F, 0, 1.0F, bgColor);
      r2.flush();

      // For non-player entities, we still use drawEntity but with fixed parameters
      // 3D rendering for mobs
      float origHeadYaw = entity.headYaw;
      float origBodyYaw = entity.bodyYaw;
      float origPitch = entity.getPitch();

      entity.setHeadYaw(0);
      entity.setBodyYaw(0);
      entity.setPitch(0);

      int ix = (int) x;
      int iy = (int) y;
      int isize = (int) size;

      // Position them so the head is in the circle
      int entityScale = (int) (isize * 2.0f);

      // InventoryScreen.drawEntity version with 10 parameters
      // context, x1, y1, x2, y2, size, mouseX, mouseY, unknown, entity
      InventoryScreen.drawEntity(drawContext, ix, iy, ix + isize, (int) (iy + isize * 2.0f),
            entityScale, 0.0f, 0.0f, 0.0f, entity);

      entity.setHeadYaw(origHeadYaw);
      entity.setBodyYaw(origBodyYaw);
      entity.setPitch(origPitch);
   }

   public static void renderPendingItems(DrawContext drawContext) {
      if (!pendingItems.isEmpty()) {
         GlStateManager._enableDepthTest();
         GlStateManager._enableBlend();
         GL11.glBlendFunc(770, 771);
         drawContext.getMatrices().pushMatrix();
         for (TargetHUD.PendingItemRender item : pendingItems) {
            drawContext.drawItem(item.stack, (int) item.x, (int) item.y, item.seed);
            drawContext.drawStackOverlay(mc.textRenderer, item.stack, (int) item.x, (int) item.y);
         }
         drawContext.getMatrices().popMatrix();
         GlStateManager._disableDepthTest();
         pendingItems.clear();
      }
   }

   @Environment(EnvType.CLIENT)
   private static class PendingItemRender {
      ItemStack stack;
      float x;
      float y;
      int seed;

      PendingItemRender(ItemStack stack, float x, float y, int seed) {
         this.stack = stack;
         this.x = x;
         this.y = y;
         this.seed = seed;
      }
   }
}
