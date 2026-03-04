package ru.noxium.ui.gui.component.render;

import java.awt.Color;
import java.util.List;
import java.util.stream.Collectors;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.util.math.MatrixStack;
import ru.noxium.module.api.Module;
import ru.noxium.module.api.setting.Setting;
import ru.noxium.module.api.setting.impl.HueSetting;
import ru.noxium.ui.gui.GuiScreen;
import ru.noxium.ui.gui.component.setting.GuiRenderSetting;
import ru.noxium.util.color.ColorUtil;
import ru.noxium.util.keyboard.Keyboard;
import ru.noxium.util.player.MovementManager;
import ru.noxium.util.render.animation.util.Easings;
import ru.noxium.util.render.core.Renderer2D;
import ru.noxium.util.render.math.MathHelper;
import ru.noxium.util.render.math.animation.Direction;
import ru.noxium.util.render.text.FontRegistry;
import ru.noxium.util.render.utils.KeyUtil;

@Environment(EnvType.CLIENT)
public class GuiRenderMain extends GuiScreen {
      public static void renderMain(Renderer2D renderer2D, MatrixStack pose, int mouseX, int mouseY, float mainAlpha) {
            if (GuiScreen.activeSearch) {
                  MovementManager.getInstance().lockMovement("Search");
            } else {
                  MovementManager.getInstance().unlockMovement("Search");
            }

            if (GuiScreen.activeSearch) {
                  boolean backspaceDown = KeyUtil.isKeyDown(259);
                  long currentTime = System.currentTimeMillis();
                  if (backspaceDown) {
                        if (!GuiScreen.backspaceHeld) {
                              GuiScreen.backspaceHeld = true;
                              GuiScreen.firstBackspacePressTime = currentTime;
                              GuiScreen.lastBackspaceTime = currentTime;
                              if (!GuiScreen.searchText.isEmpty()) {
                                    GuiScreen.searchText = GuiScreen.searchText.substring(0,
                                                GuiScreen.searchText.length() - 1);
                              }
                        } else if (currentTime - GuiScreen.firstBackspacePressTime > 500L
                                    && currentTime - GuiScreen.lastBackspaceTime > 30L) {
                              if (!GuiScreen.searchText.isEmpty()) {
                                    GuiScreen.searchText = GuiScreen.searchText.substring(0,
                                                GuiScreen.searchText.length() - 1);
                              }

                              GuiScreen.lastBackspaceTime = currentTime;
                        }
                  } else {
                        GuiScreen.backspaceHeld = false;
                        GuiScreen.firstBackspacePressTime = 0L;
                  }
            } else {
                  GuiScreen.backspaceHeld = false;
                  GuiScreen.firstBackspacePressTime = 0L;
            }

            int outlineColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getOutLineColor(1, 1),
                        (int) (20.4F * mainAlpha));
            int backGroundThreeColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1),
                        (int) (40.0F * mainAlpha));
            int mainColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1),
                        (int) (255.0F * mainAlpha));
            int mainColor6 = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1),
                        (int) (15.3F * mainAlpha));
            int mainColor40 = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1),
                        (int) (102.0F * mainAlpha));
            int textColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getTextColor(1, 1),
                        (int) (255.0F * mainAlpha));
            int backGroundOneColor = Renderer2D.ColorUtil.replAlpha(Renderer2D.ColorUtil.getBackGroundColor(1, 1),
                        (int) (178.5F * mainAlpha));
            Color mainColorGlow35 = Renderer2D.ColorUtil.getColor(Renderer2D.ColorUtil
                        .replAlpha(Renderer2D.ColorUtil.getMainColor(1, 1), (int) (56.0F * mainAlpha)));

            // Layout Calculations
            float x1 = GuiScreen.x;
            float y1 = GuiScreen.y + 34.025F;
            float rectWidth = GuiScreen.width;
            float rectHeight = GuiScreen.height - 34.025F - 40.0F;

            // Column Positions
            float moduleWidth = 121.47F;
            float gapX = 20.0F;
            float gapY = 10.0F; // Vertical gap between modules
            float totalContentWidth = (moduleWidth * 2) + gapX;
            float startMargin = (rectWidth - totalContentWidth) / 2.0F;

            float col1X = GuiScreen.x + startMargin;
            float col2X = GuiScreen.x + startMargin + moduleWidth + gapX;

            float clipX = x1;
            float clipY = y1;
            float clipWidth = rectWidth;
            float clipHeight = rectHeight;
            renderer2D.pushRoundedClipRect(clipX, clipY, clipWidth, clipHeight, 0.0F, 0.0F, 0.0F, 0.0F);

            List<Module> filteredModules = GuiScreen.modules;
            if (GuiScreen.activeSearch && !GuiScreen.searchText.isEmpty()) {
                  String searchLower = GuiScreen.searchText.toLowerCase().trim();
                  filteredModules = GuiScreen.modules.stream()
                              .filter(modulex -> modulex.name.toLowerCase().contains(searchLower))
                              .collect(Collectors.toList());
            }

            // Calculate Scroll & Content Height
            float scrollY = GuiScreen.getScrollUtil().getScroll();

            // Independent column trackers
            float currentY_Col1 = scrollY;
            float currentY_Col2 = scrollY;

            int index = 0;
            for (Module module : filteredModules) {
                  module.animation.update();
                  module.animation.run(module.enable ? 1.0 : 0.0, 0.15F, Easings.SINE_OUT);
                  module.animation1.setDirection(module.enable ? Direction.FORWARDS : Direction.BACKWARDS);
                  float animPC = module.animation.get();

                  // Calculate Settings Height
                  float settingsHeight = 12.0F;
                  float fullSettingsHeight = 12.0F;
                  float settingsAnim = GuiScreen.getModuleSettingsAnimation(module).get();
                  float settingsAlphaAnim = GuiScreen.getModuleSettingsAlphaAnimation(module).get();

                  boolean settingsOpen = GuiScreen.openSettingsModules.contains(module) || settingsAnim > 0.0F
                              || settingsAlphaAnim > 0.0F;
                  if (settingsOpen) {
                        for (Setting setting : module.getSettingsForGUI()) {
                              fullSettingsHeight += GuiRenderSetting.getSettingHeight(renderer2D, setting);
                        }
                        fullSettingsHeight = Math.max(fullSettingsHeight, 20.0F);
                        // Height logic: Base (12) + Expanded
                        settingsHeight = 12.0F + (fullSettingsHeight - 12.0F) * settingsAnim;
                  } else {
                        settingsHeight = 0.0F; // No extra height if closed
                  }

                  float moduleBaseHeight = 21.325F;
                  float currentModuleTotalHeight = moduleBaseHeight + settingsHeight;

                  // Determine column based on index
                  boolean isCol2 = (index % 2 != 0);
                  float drawX = isCol2 ? col2X : col1X;
                  float drawY = isCol2 ? currentY_Col2 : currentY_Col1;

                  // Render Module Background
                  // If fully closed settings
                  if (!settingsOpen) {
                        renderer2D.rectOutline(drawX, GuiScreen.y + 43.365F + drawY, moduleWidth, moduleBaseHeight,
                                    6.5F, outlineColor, 0.1F);
                        renderer2D.rect(drawX, GuiScreen.y + 43.365F + drawY, moduleWidth, moduleBaseHeight, 6.5F,
                                    backGroundThreeColor);
                  } else {
                        // Expanded
                        float expandedHeight = moduleBaseHeight + settingsHeight;
                        renderer2D.rectOutline(drawX, GuiScreen.y + 43.365F + drawY, moduleWidth, expandedHeight, 6.5F,
                                    outlineColor, 0.1F);
                        renderer2D.rect(drawX, GuiScreen.y + 43.365F + drawY, moduleWidth, expandedHeight, 6.5F,
                                    backGroundThreeColor);

                        if (settingsAlphaAnim > 0.01F) {
                              renderer2D.rect(
                                          drawX + 0.165F, GuiScreen.y + 64.69F + drawY, moduleWidth - 0.33F, 1.0F,
                                          ColorUtil.multAlpha(outlineColor, settingsAlphaAnim));
                        }
                  }

                  // Render Module Name
                  float moduleNameX = drawX + 9.545F;
                  float moduleNameY = GuiScreen.y + 49.555F + drawY;
                  renderer2D.text(FontRegistry.INTER_MEDIUM, moduleNameX, moduleNameY + 6.6F, 14.0F, module.name,
                              ColorUtil.overCol(mainColor40, textColor, animPC));

                  // Binding Indicator or Key
                  float bindAnim = GuiScreen.getModuleBindAnimation(module).get();
                  if (module.binding || module.bind != -1 || bindAnim > 0.0F) {
                        float bindHeight = 10.0F;
                        String keyText = module.binding ? "..."
                                    : (module.bind != -1 ? Keyboard.keyName(module.bind) : "");
                        float keyTextWidth = keyText.isEmpty() ? 0.0F
                                    : renderer2D.measureText(FontRegistry.INTER_MEDIUM, keyText, 12.0F).width;
                        float minButtonWidth = 6.0F;
                        float buttonWidth = Math.max(minButtonWidth, keyTextWidth + 6.0F);
                        float moduleNameWidth = renderer2D.measureText(FontRegistry.INTER_MEDIUM, module.name,
                                    14.0F).width;
                        float bindX = moduleNameX + moduleNameWidth + 4.0F;
                        float bindY = moduleNameY - 0.35F;
                        renderer2D.rectOutline(bindX, bindY, buttonWidth, bindHeight, 3.0F,
                                    ColorUtil.multAlpha(outlineColor, bindAnim), 0.1F);
                        renderer2D.rect(bindX, bindY, buttonWidth, bindHeight, 3.0F,
                                    ColorUtil.multAlpha(mainColor6, bindAnim));
                        if (!keyText.isEmpty()) {
                              renderer2D.text(
                                          FontRegistry.INTER_MEDIUM,
                                          bindX + buttonWidth / 2.0F - keyTextWidth / 2.0F - 0.2F,
                                          bindY + 2.0F + 5.25F,
                                          12.0F,
                                          keyText,
                                          ColorUtil.multAlpha(module.binding ? mainColor : mainColor40, bindAnim));
                        }
                  }

                  // Toggle Checkbox/Indicator
                  float indicatorX = drawX + 110.065F - 1.5F;
                  float indicatorY = GuiScreen.y + 52.505F + drawY - 1.5F - 0.35F;
                  renderer2D.rectOutline(indicatorX, indicatorY, 6.0F, 6.0F, 3.0F, outlineColor, 0.08F);
                  renderer2D.rect(indicatorX, indicatorY, 6.0F, 6.0F, 3.0F, mainColor6);
                  renderer2D.rect(
                              indicatorX + 0.75F, indicatorY + 0.75F, 3.0F, 3.0F, 1.5F,
                              ColorUtil.overCol(mainColor40, mainColor, animPC));
                  renderer2D.shadow(
                              indicatorX + 2.25F, indicatorY + 2.25F, 0.1F, 0.1F, 1.5F, 2.575F, 0.1F,
                              ColorUtil.overCol(0, mainColorGlow35.getRGB(), animPC));

                  // Settings Icon
                  if (!module.getSettingsForGUI().isEmpty()) {
                        float iconY = GuiScreen.y + 52.81F + drawY - 1.5F - 0.7F + 6.5F;
                        // S rotates to R
                        renderer2D.text(
                                    FontRegistry.ICONS,
                                    drawX + 99.625F,
                                    iconY + 6.0F - 6.0F * settingsAnim,
                                    11.0F,
                                    "S",
                                    ColorUtil.overCol(0, mainColor, settingsAnim));
                        renderer2D.text(
                                    FontRegistry.ICONS,
                                    drawX + 99.625F,
                                    iconY + 6.0F * settingsAnim,
                                    11.0F,
                                    "R",
                                    ColorUtil.overCol(mainColor40, 0, settingsAnim));
                  }

                  // Render Settings Content if Open
                  if (settingsOpen) {
                        float settingYStart = GuiScreen.y + 64.69F + drawY + 4.0F;
                        float settingXStart = drawX + 9.0F;
                        float settingWidth = 105.47F;
                        float currentSettingOffset = 0.0F;

                        for (Setting setting : module.getSettingsForGUI()) {
                              currentSettingOffset += GuiRenderSetting.renderSetting(
                                          renderer2D,
                                          setting,
                                          settingXStart,
                                          settingYStart + currentSettingOffset,
                                          settingWidth,
                                          mouseX,
                                          mouseY,
                                          ColorUtil.multAlpha(outlineColor, settingsAlphaAnim),
                                          ColorUtil.multAlpha(mainColor, settingsAlphaAnim),
                                          ColorUtil.multAlpha(mainColor6, settingsAlphaAnim),
                                          ColorUtil.multAlpha(mainColor40, settingsAlphaAnim),
                                          ColorUtil.multAlpha(textColor, settingsAlphaAnim),
                                          mainAlpha * settingsAlphaAnim) * settingsAlphaAnim;
                        }
                  }

                  // Increment Y for the specific column
                  if (isCol2) {
                        currentY_Col2 += currentModuleTotalHeight + gapY;
                  } else {
                        currentY_Col1 += currentModuleTotalHeight + gapY;
                  }

                  index++;
            }

            renderer2D.popClipRect();

            // Update Scroll Max
            float maxContentHeight = Math.max(currentY_Col1, currentY_Col2) - scrollY; // Total height content used
            float visibleHeight = rectHeight - 10.0F;
            GuiScreen.getScrollUtil().setSpeed(6.0F);
            GuiScreen.getScrollUtil().setEnabled(isHovered(mouseX, mouseY, clipX, clipY, clipWidth, clipHeight));
            GuiScreen.getScrollUtil().update();
            GuiScreen.getScrollUtil().setMax(MathHelper.clamp(maxContentHeight, visibleHeight, 9999.0F), visibleHeight);

            GuiScreen.getScrollUtil().render(renderer2D, GuiScreen.x + rectWidth - 6.0F, GuiScreen.y + 34.025F + 5.0F,
                        2.0F, 194.5F, mainAlpha);

            if (GuiScreen.activeColorPicker != null && GuiScreen.activeColorPicker instanceof HueSetting) {
                  GuiRenderColorPicker.renderColorPickerWindow(
                              renderer2D,
                              GuiScreen.activeColorPicker,
                              mouseX,
                              mouseY,
                              ColorUtil.multAlpha(outlineColor, GuiScreen.animation15.getOutput()),
                              ColorUtil.multAlpha(backGroundOneColor, GuiScreen.animation15.getOutput()),
                              ColorUtil.multAlpha(mainColor40, GuiScreen.animation15.getOutput()),
                              mainAlpha * GuiScreen.animation15.getOutput());
            }
      }

      public static boolean isHovered(float mouseX, float mouseY, float x, float y, float width, float height) {
            return mouseX >= x && mouseY >= y && mouseX < x + width && mouseY < y + height;
      }
}
