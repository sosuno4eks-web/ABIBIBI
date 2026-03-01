package com.github.weisj.jsvg.nodes.filter;

import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.RasterFormatException;
import java.awt.image.WritableRaster;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractBlendComposite implements Composite {
   @NotNull
   protected abstract AbstractBlendComposite.Blender blender();

   private static boolean isColorModelInvalid(ColorModel cm) {
      if (cm instanceof DirectColorModel && cm.getTransferType() == 3) {
         DirectColorModel directCM = (DirectColorModel)cm;
         return directCM.getRedMask() != 16711680 || directCM.getGreenMask() != 65280 || directCM.getBlueMask() != 255 || directCM.getNumComponents() == 4 && directCM.getAlphaMask() != -16777216;
      } else {
         return true;
      }
   }

   public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel, RenderingHints hints) {
      if (!isColorModelInvalid(srcColorModel) && !isColorModelInvalid(dstColorModel)) {
         return new AbstractBlendComposite.BlendingContext(this.blender());
      } else {
         throw new RasterFormatException("Incompatible color models");
      }
   }

   private static final class BlendingContext implements CompositeContext {
      @NotNull
      private final AbstractBlendComposite.Blender blender;

      private BlendingContext(@NotNull AbstractBlendComposite.Blender blender) {
         this.blender = blender;
      }

      public void dispose() {
      }

      public void compose(@NotNull Raster src, @NotNull Raster dstIn, @NotNull WritableRaster dstOut) {
         int width = Math.min(src.getWidth(), dstIn.getWidth());
         int height = Math.min(src.getHeight(), dstIn.getHeight());
         int[] result = new int[4];
         int[] srcPixel = new int[4];
         int[] dstPixel = new int[4];
         int[] srcPixels = new int[width];
         int[] dstPixels = new int[width];

         for(int y = 0; y < height; ++y) {
            src.getDataElements(0, y, width, 1, srcPixels);
            dstIn.getDataElements(0, y, width, 1, dstPixels);

            for(int x = 0; x < width; ++x) {
               int pixel = srcPixels[x];
               srcPixel[0] = pixel >> 16 & 255;
               srcPixel[1] = pixel >> 8 & 255;
               srcPixel[2] = pixel & 255;
               srcPixel[3] = pixel >> 24 & 255;
               pixel = dstPixels[x];
               dstPixel[0] = pixel >> 16 & 255;
               dstPixel[1] = pixel >> 8 & 255;
               dstPixel[2] = pixel & 255;
               dstPixel[3] = pixel >> 24 & 255;
               this.blender.blend(srcPixel, dstPixel, result);
               dstPixels[x] = (result[3] & 255) << 24 | (result[0] & 255) << 16 | (result[1] & 255) << 8 | result[2] & 255;
            }

            dstOut.setDataElements(0, y, width, 1, dstPixels);
         }

      }

      // $FF: synthetic method
      BlendingContext(AbstractBlendComposite.Blender x0, Object x1) {
         this(x0);
      }
   }

   @FunctionalInterface
   interface Blender {
      void blend(int[] var1, int[] var2, int[] var3);
   }
}
