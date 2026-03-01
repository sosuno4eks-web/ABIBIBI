package com.github.weisj.jsvg.util;

import java.awt.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ColorUtil {
   private ColorUtil() {
   }

   public static Color withAlpha(@NotNull Color c, float alpha) {
      int a = Math.max(Math.min(255, (int)(alpha * 255.0F)), 0);
      return new Color(c.getRed(), c.getGreen(), c.getBlue(), a);
   }

   public static String toString(@Nullable Color c) {
      return c == null ? "null" : String.format("Color[%d,%d,%d,%d]", c.getRed(), c.getGreen(), c.getBlue(), c.getAlpha());
   }

   public static void RGBtoHSL(int r, int g, int b, @NotNull float[] hsl) {
      if (r < 0) {
         r = 0;
      } else if (r > 255) {
         r = 255;
      }

      if (g < 0) {
         g = 0;
      } else if (g > 255) {
         g = 255;
      }

      if (b < 0) {
         b = 0;
      } else if (b > 255) {
         b = 255;
      }

      float componentR = (float)r / 255.0F;
      float componentG = (float)g / 255.0F;
      float componentB = (float)b / 255.0F;
      float minComponent;
      float maxComponent;
      if (componentR > componentG) {
         minComponent = componentG;
         maxComponent = componentR;
      } else {
         minComponent = componentR;
         maxComponent = componentG;
      }

      if (componentB > maxComponent) {
         maxComponent = componentB;
      }

      if (componentB < minComponent) {
         minComponent = componentB;
      }

      float deltaMax = maxComponent - minComponent;
      float l = (maxComponent + minComponent) / 2.0F;
      float h;
      float s;
      if (deltaMax - 0.01F <= 0.0F) {
         h = 0.0F;
         s = 0.0F;
      } else {
         if (l < 0.5F) {
            assert maxComponent + minComponent != 0.0F;

            s = deltaMax / (maxComponent + minComponent);
         } else {
            s = deltaMax / (2.0F - maxComponent - minComponent);
         }

         assert deltaMax > 0.0F;

         float deltaR = ((maxComponent - componentR) / 6.0F + deltaMax / 2.0F) / deltaMax;
         float deltaG = ((maxComponent - componentG) / 6.0F + deltaMax / 2.0F) / deltaMax;
         float deltaB = ((maxComponent - componentB) / 6.0F + deltaMax / 2.0F) / deltaMax;
         if (componentR == maxComponent) {
            h = deltaB - deltaG;
         } else if (componentG == maxComponent) {
            h = 0.33333334F + deltaR - deltaB;
         } else {
            h = 0.6666667F + deltaG - deltaR;
         }

         if (h < 0.0F) {
            ++h;
         }

         if (h > 1.0F) {
            --h;
         }
      }

      hsl[0] = h;
      hsl[1] = s;
      hsl[2] = l;
   }

   public static void HSLtoRGB(float h, float s, float l, @NotNull int[] rgb) {
      if (h < 0.0F) {
         h = 0.0F;
      } else if (h > 1.0F) {
         h = 1.0F;
      }

      if (s < 0.0F) {
         s = 0.0F;
      } else if (s > 1.0F) {
         s = 1.0F;
      }

      if (l < 0.0F) {
         l = 0.0F;
      } else if (l > 1.0F) {
         l = 1.0F;
      }

      int r;
      int g;
      int b;
      if (s - 0.01F <= 0.0F) {
         r = (int)(l * 255.0F);
         g = (int)(l * 255.0F);
         b = (int)(l * 255.0F);
      } else {
         float y;
         if (l < 0.5F) {
            y = l * (1.0F + s);
         } else {
            y = l + s - s * l;
         }

         float x = 2.0F * l - y;
         r = (int)(255.0F * hue2RGB(x, y, h + 0.33333334F));
         g = (int)(255.0F * hue2RGB(x, y, h));
         b = (int)(255.0F * hue2RGB(x, y, h - 0.33333334F));
      }

      rgb[0] = r;
      rgb[1] = g;
      rgb[2] = b;
   }

   private static float hue2RGB(float v1, float v2, float vH) {
      if (vH < 0.0F) {
         ++vH;
      }

      if (vH > 1.0F) {
         --vH;
      }

      if (6.0F * vH < 1.0F) {
         return v1 + (v2 - v1) * 6.0F * vH;
      } else if (2.0F * vH < 1.0F) {
         return v2;
      } else {
         return 3.0F * vH < 2.0F ? v1 + (v2 - v1) * (0.6666667F - vH) * 6.0F : v1;
      }
   }
}
