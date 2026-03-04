package ru.noxium.ui.gui.component.render;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import ru.noxium.api.UserData;
import ru.noxium.module.api.Category;
import ru.noxium.ui.gui.GuiScreen;
import ru.noxium.util.color.ColorUtil;
import ru.noxium.util.render.animation.util.Easings;
import ru.noxium.util.render.core.Renderer2D;
import ru.noxium.util.render.text.FontRegistry;

@Environment(EnvType.CLIENT)
public class GuiRenderLeftPanel extends GuiScreen {
      public static void renderLeftPanel(Renderer2D renderer2D, MatrixStack pose, float mainAlpha) {
            int outlineColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getOutLineColor(1, 1),
                        (int) (20.4F * mainAlpha));
            int backGroundTwoColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getBackGroundTwoColor(1, 1),
                        (int) (178.5F * mainAlpha));
            int mainColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1),
                        (int) (255.0F * mainAlpha));
            int mainColor40 = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1),
                        (int) (102.0F * mainAlpha));
            int textColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getTextColor(1, 1),
                        (int) (255.0F * mainAlpha));
            int textTwoColor40 = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getTextTwoColor(1, 1),
                        (int) (102.0F * mainAlpha));
            Color mainColorGlow35 = Renderer2D.ColorUtil.getColor(
                        Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1),
                                    (int) (56.0F * mainAlpha)));
            Color koronaColors = Renderer2D.ColorUtil
                        .getColor(Renderer2D.ColorUtil.replAlpha(Color.ORANGE.getRGB(), (int) (50.0F * mainAlpha)));

            // Custom Order: Combat -> Movement -> Visuals -> Player -> Misc
            Category[] sortedCategories = { Category.Combat, Category.Movement, Category.Visuals, Category.Player,
                        Category.Misc };

            // Calculate total width for centering
            float iconSize = 24.0F;
            float spacing = 15.0F;
            int categoryCount = sortedCategories.length;
            float totalWidth = (categoryCount * iconSize) + ((categoryCount - 1) * spacing);
            float startX = GuiScreen.x + (GuiScreen.width - totalWidth) / 2.0F;
            float startY = GuiScreen.y + GuiScreen.height - 35.0F;

            // Render Categories
            float currentX = startX;
            for (Category category : sortedCategories) {
                  category.anim33.update();
                  category.anim33.run(category == selectedCategories ? 1.0 : 0.0, 1.0, Easings.QUART_OUT);
                  float animVal = category.anim33.get();

                  // Icon
                  // Scale icon based on selection
                  float currentIconSize = 20.0F + (4.0F * animVal);
                  float renderX = currentX + (iconSize - currentIconSize) / 2.0F;
                  float renderY = startY + (iconSize - currentIconSize) / 2.0F;

                  // Render selection glow/bg if needed?
                  // Let's just color the icon
                  int iconColor = ColorUtil.overCol(mainColor40, mainColor, animVal);

                  renderer2D.text(FontRegistry.ICONS, renderX, renderY + 8.0F, currentIconSize, category.getIcon(),
                              iconColor);

                  // Add a small glow or indicator below
                  if (animVal > 0.01F) {
                        renderer2D.shadow(renderX, renderY + currentIconSize + 2.0F, currentIconSize, 2.0F, 5.0F, 1.0F,
                                    0.1F,
                                    ColorUtil.overCol(0, mainColorGlow35.getRGB(), animVal));
                  }

                  currentX += iconSize + spacing;
            }

            // User Info (User Image/Login/Role) - Move to bottom left
            float userInfoX = GuiScreen.x + 10.0F;
            float userInfoY = GuiScreen.y + GuiScreen.height - 30.0F;

            int textureId = -1;
            try {
                  Identifier iconId = Identifier.of("noxium", "textures/gui/user.png");
                  AbstractTexture texture = MinecraftClient.getInstance().getTextureManager().getTexture(iconId);
                  if (texture != null && texture.getGlTexture() instanceof GlTexture glTexture) {
                        textureId = glTexture.getGlId();
                  }
            } catch (Exception ignored) {
            }

            if (textureId != -1) {
                  renderer2D.drawRgbaTextureWithUVRounded(textureId, userInfoX, userInfoY, 19.27F, 19.27F, 0, 0, 1, 1,
                              15.0F);
            } else {
                  renderer2D.rect(
                              userInfoX,
                              userInfoY,
                              19.27F,
                              19.27F,
                              15.0F,
                              Renderer2D.ColorUtil.rgba(255, 255, 255, (int) (255.0F * GuiScreen.alphaPC.get())));
            }

            renderer2D.text(FontRegistry.INTER_MEDIUM, userInfoX + 25.0F, userInfoY + 7.0F, 14.0F, UserData.LOGIN,
                        textColor);
            renderer2D.text(FontRegistry.INTER_MEDIUM, userInfoX + 25.0F, userInfoY + 15.0F, 11.0F, UserData.ROLE,
                        textTwoColor40);
      }
}
