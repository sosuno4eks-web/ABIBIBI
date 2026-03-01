package com.github.weisj.jsvg.renderer.jdk;

import java.awt.Color;
import java.awt.PaintContext;
import java.awt.MultipleGradientPaint.ColorSpaceType;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.SinglePixelPackedSampleModel;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

abstract class SVGMultipleGradientPaintContext implements PaintContext {
   private static final float MIN_INTERVAL_LENGTH = 0.001F;
   protected ColorModel model;
   private static final ColorModel XRGB_MODEL = new DirectColorModel(24, 16711680, 65280, 255);
   protected static ColorModel cachedModel;
   protected static WeakReference<Raster> cached;
   protected Raster saved;
   protected CycleMethod cycleMethod;
   protected ColorSpaceType colorSpace;
   protected float a00;
   protected float a01;
   protected float a10;
   protected float a11;
   protected float a02;
   protected float a12;
   protected boolean isSimpleLookup;
   protected int fastGradientArraySize;
   protected int[] gradient;
   private int[][] gradients;
   private float[] normalizedIntervals;
   private final float[] fractions;
   private int transparencyTest;
   private static final int[] SRGBtoLinearRGB = new int[256];
   private static final int[] LinearRGBtoSRGB = new int[256];
   protected static final int GRADIENT_SIZE = 256;
   protected static final int GRADIENT_SIZE_INDEX = 255;
   private static final int MAX_GRADIENT_ARRAY_SIZE = 5000;

   protected SVGMultipleGradientPaintContext(@NotNull SVGMultipleGradientPaint mgp, @NotNull AffineTransform t, @NotNull float[] fractions, @NotNull Color[] colors, CycleMethod cycleMethod, ColorSpaceType colorSpace) {
      AffineTransform tInv;
      try {
         t.invert();
         tInv = t;
      } catch (NoninvertibleTransformException var11) {
         tInv = new AffineTransform();
      }

      double[] m = new double[6];
      tInv.getMatrix(m);
      this.a00 = (float)m[0];
      this.a10 = (float)m[1];
      this.a01 = (float)m[2];
      this.a11 = (float)m[3];
      this.a02 = (float)m[4];
      this.a12 = (float)m[5];
      this.cycleMethod = cycleMethod;
      this.colorSpace = colorSpace;
      this.fractions = fractions;
      int[] gradient = mgp.gradient != null ? (int[])mgp.gradient.get() : null;
      int[][] gradients = mgp.gradients != null ? (int[][])mgp.gradients.get() : null;
      if (gradient == null && gradients == null) {
         this.calculateLookupData(colors);
         mgp.model = this.model;
         mgp.normalizedIntervals = this.normalizedIntervals;
         mgp.isSimpleLookup = this.isSimpleLookup;
         if (this.isSimpleLookup) {
            mgp.fastGradientArraySize = this.fastGradientArraySize;
            mgp.gradient = new SoftReference(this.gradient);
         } else {
            mgp.gradients = new SoftReference(this.gradients);
         }
      } else {
         this.model = mgp.model;
         this.normalizedIntervals = mgp.normalizedIntervals;
         this.isSimpleLookup = mgp.isSimpleLookup;
         this.gradient = gradient;
         this.fastGradientArraySize = mgp.fastGradientArraySize;
         this.gradients = gradients;
      }

   }

   private void calculateLookupData(Color[] colors) {
      Color[] normalizedColors;
      int i;
      int estimatedSize;
      int a;
      int r;
      int g;
      if (this.colorSpace == ColorSpaceType.LINEAR_RGB) {
         normalizedColors = new Color[colors.length];

         for(i = 0; i < colors.length; ++i) {
            estimatedSize = colors[i].getRGB();
            a = estimatedSize >>> 24;
            r = SRGBtoLinearRGB[estimatedSize >> 16 & 255];
            g = SRGBtoLinearRGB[estimatedSize >> 8 & 255];
            int b = SRGBtoLinearRGB[estimatedSize & 255];
            normalizedColors[i] = new Color(r, g, b, a);
         }
      } else {
         normalizedColors = colors;
      }

      this.normalizedIntervals = new float[this.fractions.length - 1];

      for(i = 0; i < this.normalizedIntervals.length; ++i) {
         this.normalizedIntervals[i] = this.fractions[i + 1] - this.fractions[i];
      }

      this.transparencyTest = -16777216;
      this.gradients = new int[this.normalizedIntervals.length][];
      float Imin = 1.0F;
      float[] var10 = this.normalizedIntervals;
      a = var10.length;

      for(r = 0; r < a; ++r) {
         float interval = var10[r];
         if (interval > 0.001F) {
            Imin = Math.min(Imin, interval);
         }
      }

      estimatedSize = 0;
      float[] var11 = this.normalizedIntervals;
      r = var11.length;

      for(g = 0; g < r; ++g) {
         float normalizedInterval = var11[g];
         estimatedSize += (int)(normalizedInterval / Imin * 256.0F);
      }

      if (estimatedSize > 5000) {
         this.calculateMultipleArrayGradient(normalizedColors);
      } else {
         this.calculateSingleArrayGradient(normalizedColors, Imin);
      }

      if (this.transparencyTest >>> 24 == 255) {
         this.model = XRGB_MODEL;
      } else {
         this.model = ColorModel.getRGBdefault();
      }

   }

   private void calculateSingleArrayGradient(Color[] colors, float Imin) {
      this.isSimpleLookup = true;
      int gradientsTot = 1;

      int curOffset;
      int i;
      for(curOffset = 0; curOffset < this.gradients.length; ++curOffset) {
         i = (int)(this.normalizedIntervals[curOffset] / Imin * 255.0F);
         gradientsTot += i;
         this.gradients[curOffset] = new int[i];
         int rgb1 = colors[curOffset].getRGB();
         int rgb2 = colors[curOffset + 1].getRGB();
         this.interpolate(rgb1, rgb2, this.gradients[curOffset]);
         this.transparencyTest &= rgb1;
         this.transparencyTest &= rgb2;
      }

      this.gradient = new int[gradientsTot];
      curOffset = 0;
      int[][] var11 = this.gradients;
      int var8 = var11.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         int[] ints = var11[var9];
         System.arraycopy(ints, 0, this.gradient, curOffset, ints.length);
         curOffset += ints.length;
      }

      this.gradient[this.gradient.length - 1] = colors[colors.length - 1].getRGB();
      if (this.colorSpace == ColorSpaceType.LINEAR_RGB) {
         for(i = 0; i < this.gradient.length; ++i) {
            this.gradient[i] = this.convertEntireColorLinearRGBtoSRGB(this.gradient[i]);
         }
      }

      this.fastGradientArraySize = this.gradient.length - 1;
   }

   private void calculateMultipleArrayGradient(Color[] colors) {
      this.isSimpleLookup = false;

      int j;
      for(j = 0; j < this.gradients.length; ++j) {
         this.gradients[j] = new int[256];
         int rgb1 = colors[j].getRGB();
         int rgb2 = colors[j + 1].getRGB();
         this.interpolate(rgb1, rgb2, this.gradients[j]);
         this.transparencyTest &= rgb1;
         this.transparencyTest &= rgb2;
      }

      if (this.colorSpace == ColorSpaceType.LINEAR_RGB) {
         for(j = 0; j < this.gradients.length; ++j) {
            for(int i = 0; i < this.gradients[j].length; ++i) {
               this.gradients[j][i] = this.convertEntireColorLinearRGBtoSRGB(this.gradients[j][i]);
            }
         }
      }

   }

   private void interpolate(int rgb1, int rgb2, int[] output) {
      float stepSize = 1.0F / (float)output.length;
      int a1 = rgb1 >> 24 & 255;
      int r1 = rgb1 >> 16 & 255;
      int g1 = rgb1 >> 8 & 255;
      int b1 = rgb1 & 255;
      int da = (rgb2 >> 24 & 255) - a1;
      int dr = (rgb2 >> 16 & 255) - r1;
      int dg = (rgb2 >> 8 & 255) - g1;
      int db = (rgb2 & 255) - b1;

      for(int i = 0; i < output.length; ++i) {
         output[i] = (int)((double)((float)a1 + (float)(i * da) * stepSize) + 0.5D) << 24 | (int)((double)((float)r1 + (float)(i * dr) * stepSize) + 0.5D) << 16 | (int)((double)((float)g1 + (float)(i * dg) * stepSize) + 0.5D) << 8 | (int)((double)((float)b1 + (float)(i * db) * stepSize) + 0.5D);
      }

   }

   private int convertEntireColorLinearRGBtoSRGB(int rgb) {
      int a1 = rgb >> 24 & 255;
      int r1 = rgb >> 16 & 255;
      int g1 = rgb >> 8 & 255;
      int b1 = rgb & 255;
      r1 = LinearRGBtoSRGB[r1];
      g1 = LinearRGBtoSRGB[g1];
      b1 = LinearRGBtoSRGB[b1];
      return a1 << 24 | r1 << 16 | g1 << 8 | b1;
   }

   protected final int indexIntoGradientsArrays(float position) {
      int i;
      if (this.cycleMethod == CycleMethod.NO_CYCLE) {
         if (position > 1.0F) {
            position = 1.0F;
         } else if (position < 0.0F) {
            position = 0.0F;
         }
      } else if (this.cycleMethod == CycleMethod.REPEAT) {
         position -= (float)((int)position);
         if (position < 0.0F) {
            ++position;
         }
      } else {
         if (position < 0.0F) {
            position = -position;
         }

         i = (int)position;
         position -= (float)i;
         if ((i & 1) == 1) {
            position = 1.0F - position;
         }
      }

      if (this.isSimpleLookup) {
         return this.gradient[(int)(position * (float)this.fastGradientArraySize)];
      } else {
         for(i = 0; i < this.gradients.length; ++i) {
            if (position < this.fractions[i + 1]) {
               float delta = position - this.fractions[i];
               int index = (int)(delta / this.normalizedIntervals[i] * 255.0F);
               return this.gradients[i][index];
            }
         }

         return this.gradients[this.gradients.length - 1][255];
      }
   }

   private static int convertSRGBtoLinearRGB(int color) {
      float input = (float)color / 255.0F;
      float output;
      if (input <= 0.04045F) {
         output = input / 12.92F;
      } else {
         output = (float)Math.pow(((double)input + 0.055D) / 1.055D, 2.4D);
      }

      return Math.round(output * 255.0F);
   }

   private static int convertLinearRGBtoSRGB(int color) {
      float input = (float)color / 255.0F;
      float output;
      if ((double)input <= 0.0031308D) {
         output = input * 12.92F;
      } else {
         output = 1.055F * (float)Math.pow((double)input, 0.4166666666666667D) - 0.055F;
      }

      return Math.round(output * 255.0F);
   }

   public final Raster getRaster(int x, int y, int w, int h) {
      Raster raster = this.saved;
      if (raster == null || raster.getWidth() < w || raster.getHeight() < h) {
         raster = getCachedRaster(this.model, w, h);
         this.saved = raster;
      }

      DataBufferInt rasterDB = (DataBufferInt)raster.getDataBuffer();
      int[] pixels = rasterDB.getData(0);
      int off = rasterDB.getOffset();
      int scanlineStride = ((SinglePixelPackedSampleModel)raster.getSampleModel()).getScanlineStride();
      int adjust = scanlineStride - w;
      this.fillRaster(pixels, off, adjust, x, y, w, h);
      return raster;
   }

   protected abstract void fillRaster(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   private static synchronized Raster getCachedRaster(ColorModel cm, int w, int h) {
      if (Objects.equals(cm, cachedModel) && cached != null) {
         Raster ras = (Raster)cached.get();
         if (ras != null && ras.getWidth() >= w && ras.getHeight() >= h) {
            cached = null;
            return ras;
         }
      }

      return cm.createCompatibleWritableRaster(w, h);
   }

   private static synchronized void putCachedRaster(ColorModel cm, Raster ras) {
      if (cached != null) {
         Raster cras = (Raster)cached.get();
         if (cras != null) {
            int cw = cras.getWidth();
            int ch = cras.getHeight();
            int iw = ras.getWidth();
            int ih = ras.getHeight();
            if (cw >= iw && ch >= ih) {
               return;
            }

            if (cw * ch >= iw * ih) {
               return;
            }
         }
      }

      cachedModel = cm;
      cached = new WeakReference(ras);
   }

   public final void dispose() {
      if (this.saved != null) {
         putCachedRaster(this.model, this.saved);
         this.saved = null;
      }

   }

   public final ColorModel getColorModel() {
      return this.model;
   }

   static {
      for(int k = 0; k < 256; ++k) {
         SRGBtoLinearRGB[k] = convertSRGBtoLinearRGB(k);
         LinearRGBtoSRGB[k] = convertLinearRGBtoSRGB(k);
      }

   }
}
