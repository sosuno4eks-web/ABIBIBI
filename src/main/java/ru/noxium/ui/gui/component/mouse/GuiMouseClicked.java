package ru.noxium.ui.gui.component.mouse;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import ru.noxium.ui.gui.GuiScreen;
import ru.noxium.Noxium;
import ru.noxium.ui.gui.component.mouse.category.GuiMouseClickedCategory;
import ru.noxium.ui.gui.component.mouse.colorpicker.GuiMouseClickedColorPicker;
import ru.noxium.ui.gui.component.mouse.module.GuiMouseClickedModule;
import ru.noxium.ui.gui.component.render.GuiRenderMain;

import ru.noxium.ui.gui.theme.ThemeScreen;
import ru.noxium.util.render.core.Renderer2D;
import ru.noxium.util.render.math.ScaleHelper;

@Environment(EnvType.CLIENT)
public class GuiMouseClicked extends GuiScreen {
   public static boolean mouseClicked(Renderer2D renderer2D, double pMouseX, double pMouseY, int pButton) {
      int mouseX = (int) ScaleHelper.calc((float) pMouseX, (float) pMouseY)[0];
      int mouseY = (int) ScaleHelper.calc((float) pMouseX, (float) pMouseY)[1];

      if (!GuiScreen.exit) {
         // Config buttons - use unscaled coordinates
         float buttonY = GuiScreen.y + 6.185F;
         float buttonHeight = 21.325F;
         float buttonWidth = 50.0F;
         float saveButtonX = GuiScreen.x + 366.475F - buttonWidth - 60.0F - 5.0F;
         float resetButtonX = GuiScreen.x + 366.475F - buttonWidth - 5.0F;
         
         // Save button click - use scaled mouse coordinates
         if (pButton == 0 && mouseX >= saveButtonX && mouseX <= saveButtonX + buttonWidth && 
             mouseY >= buttonY && mouseY <= buttonY + buttonHeight) {
            if (Noxium.get.configSystem != null) {
               // Save all module states
               for (ru.noxium.module.api.Module mod : Noxium.get.manager.getModules()) {
                  Noxium.get.configSystem.set("module." + mod.name + ".enabled", mod.enable);
                  Noxium.get.configSystem.set("module." + mod.name + ".bind", mod.bind);
               }
               Noxium.get.configSystem.saveConfig();
            }
            return true;
         }
         
         // Reset button click - use scaled mouse coordinates
         if (pButton == 0 && mouseX >= resetButtonX && mouseX <= resetButtonX + buttonWidth && 
             mouseY >= buttonY && mouseY <= buttonY + buttonHeight) {
            if (Noxium.get.configSystem != null) {
               Noxium.get.configSystem.resetConfig();
               // Disable all modules
               for (ru.noxium.module.api.Module mod : Noxium.get.manager.getModules()) {
                  if (mod.enable) {
                     mod.toggle();
                  }
               }
            }
            return true;
         }
         
         float searchX = GuiScreen.x + 111.885F;
         float searchY = GuiScreen.y + 6.185F;
         float searchWidth = 124.04F;
         float searchHeight = 21.325F;
         if (pButton == 0 && GuiRenderMain.isHovered(mouseX, mouseY, searchX, searchY, searchWidth, searchHeight)) {
            GuiScreen.activeSearch = true;
            return true;
         }

         GuiMouseClickedCategory.mouseClickedCategory(mouseX, mouseY);
         if (GuiMouseClickedColorPicker.mouseClickedColorPicker(mouseX, mouseY, pButton)) {
            return true;
         }

         if (GuiMouseClickedModule.mouseClickedModule(renderer2D, mouseX, mouseY, pButton)) {
            return true;
         }

         ThemeScreen.mouseClickedTheme(pMouseX, pMouseY, pButton);
      }

      if (GuiScreen.activeBindSetting != null && pButton >= 0 && pButton <= 10) {
         int mouseKey = -100 - pButton;
         GuiScreen.activeBindSetting.key = mouseKey;
         GuiScreen.activeBindSetting.active = false;
         GuiScreen.activeBindSetting = null;
         // Config auto-save removed
         return true;
      } else if (GuiScreen.activeModuleBind != null && pButton >= 0 && pButton <= 10) {
         int mouseKey = -100 - pButton;
         GuiScreen.activeModuleBind.bind = mouseKey;
         GuiScreen.activeModuleBind.binding = false;
         GuiScreen.activeModuleBind = null;
         // Config auto-save removed
         return true;
      } else {
         return false;
      }
   }
}
