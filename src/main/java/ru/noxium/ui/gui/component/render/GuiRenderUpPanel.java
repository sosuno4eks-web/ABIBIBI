package ru.noxium.ui.gui.component.render;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector4f;
import ru.noxium.ui.gui.GuiScreen;

import ru.noxium.util.render.backends.gl.StencilHelper;
import ru.noxium.util.render.core.Renderer2D;
import ru.noxium.util.render.text.FontRegistry;

@Environment(EnvType.CLIENT)
public class GuiRenderUpPanel extends GuiScreen {
      public static void renderUpPanel(Renderer2D renderer2D, MatrixStack pose, float mainAlpha) {
            int outlineColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getOutLineColor(1, 1),
                        (int) (20.4F * mainAlpha));
            int backGroundTwoColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getBackGroundTwoColor(1, 1),
                        (int) (178.5F * mainAlpha));
            int backGroundThreeColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1),
                        (int) (10.2F * mainAlpha));
            int mainColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1),
                        (int) (255.0F * mainAlpha));
            int textColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getTextColor(1, 1),
                        (int) (255.0F * mainAlpha));
            int textTwoColor40 = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getTextTwoColor(1, 1),
                        (int) (80.0F * mainAlpha));
            int blur = Renderer2D.ColorUtil.replAlpha(-1, (int) (255.0F * mainAlpha));
            Color mainColorGlow = Renderer2D.ColorUtil.getColor(
                        Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1),
                                    (int) (35.0F * mainAlpha)));
            renderer2D.flush();
            StencilHelper.initStencil();
            RenderUtil.drawRoundedCorner(renderer2D, GuiScreen.x, GuiScreen.y, 366.475F, 33.7F,
                        new Vector4f(6.5F, 0.0F, 0.0F, 0.0F), -1);
            renderer2D.flush();
            StencilHelper.bindReadStencilBuffer(1);
            renderer2D.rectOutline(GuiScreen.x, GuiScreen.y, 366.475F, 36.7F, 6.5F, outlineColor, 0.5F);
            renderer2D.rect(GuiScreen.x, GuiScreen.y, 366.475F, 36.7F, 6.5F, backGroundTwoColor);
            renderer2D.flush();
            StencilHelper.uninitStencilBuffer();
            renderer2D.text(FontRegistry.INTER_MEDIUM, GuiScreen.x + 15.0F, GuiScreen.y + 12.595F + 7.0F, 14.0F,
                        "Levkin DLC",
                        textColor);
            renderer2D.text(FontRegistry.INTER_MEDIUM, GuiScreen.x + 60.0F, GuiScreen.y + 12.595F + 7.0F, 14.0F,
                        "v1",
                        textTwoColor40);
            
            // Config buttons
            float buttonY = GuiScreen.y + 6.185F;
            float buttonHeight = 21.325F;
            float buttonWidth = 50.0F;
            float saveButtonX = GuiScreen.x + 366.475F - buttonWidth - 60.0F - 5.0F;
            float resetButtonX = GuiScreen.x + 366.475F - buttonWidth - 5.0F;
            
            // Save button
            renderer2D.rectOutline(saveButtonX, buttonY, buttonWidth, buttonHeight, 5.5F, outlineColor, 0.1F);
            renderer2D.rect(saveButtonX, buttonY, buttonWidth, buttonHeight, 5.5F, backGroundThreeColor);
            renderer2D.text(FontRegistry.INTER_MEDIUM, saveButtonX + 10.0F, buttonY + 7.0F + 7.0F, 12.0F, "Save", textColor);
            
            // Reset button
            renderer2D.rectOutline(resetButtonX, buttonY, buttonWidth, buttonHeight, 5.5F, outlineColor, 0.1F);
            renderer2D.rect(resetButtonX, buttonY, buttonWidth, buttonHeight, 5.5F, backGroundThreeColor);
            renderer2D.text(FontRegistry.INTER_MEDIUM, resetButtonX + 8.0F, buttonY + 7.0F + 7.0F, 12.0F, "Reset", textColor);
            
            renderer2D.rectOutline(GuiScreen.x + 111.885F, GuiScreen.y + 6.185F, 124.04F, 21.325F, 5.5F, outlineColor,
                        0.1F);
            renderer2D.rect(GuiScreen.x + 111.885F, GuiScreen.y + 6.185F, 124.04F, 21.325F, 5.5F, backGroundThreeColor);
            renderer2D.text(FontRegistry.ICONS, GuiScreen.x + 119.87F, GuiScreen.y + 12.335F - 1.0F + 9.75F, 17.5F, "C",
                        mainColor);
            float searchTextX = GuiScreen.x + 134.775F;
            float searchTextY = GuiScreen.y + 12.595F + 7.0F - 0.4F;
            String searchDisplayText;
            if (GuiScreen.activeSearch) {
                  searchDisplayText = GuiScreen.searchText.isEmpty() ? "" : GuiScreen.searchText;
            } else {
                  searchDisplayText = "Search";
            }

            renderer2D.text(FontRegistry.INTER_MEDIUM, searchTextX, searchTextY, 14.0F, searchDisplayText,
                        textTwoColor40);
            if (GuiScreen.activeSearch) {
                  long currentTime = System.currentTimeMillis();
                  boolean showCursor = currentTime / 500L % 2L == 0L;
                  if (showCursor) {
                        float textWidth = renderer2D.measureText(FontRegistry.INTER_MEDIUM, searchDisplayText,
                                    14.0F).width;
                        float cursorX = searchTextX + textWidth;
                        float cursorY = searchTextY - 0.5F;
                        renderer2D.rect(cursorX, cursorY - 5.0F, 1.0F, 7.0F, 0.5F, mainColor);
                  }
            }

      }

}
