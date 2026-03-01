package com.github.weisj.jsvg.renderer.jdk;

import java.awt.Color;
import java.awt.MultipleGradientPaint.ColorSpaceType;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.geom.AffineTransform;
import org.jetbrains.annotations.NotNull;

final class SVGRadialGradientPaintContext extends SVGMultipleGradientPaintContext {
   private final boolean isSimpleFocus;
   private final boolean isNonCyclic;
   private final float centerX;
   private final float centerY;
   private float focusX;
   private float focusY;
   private final float radiusSq;
   private final float focusRadius;
   private final float focusRadiusSq;
   private final float constA;
   private final float constB;
   private final float gDeltaDelta;
   private final float trivial;
   private static final float FOCUS_CLAMP_DOWNSCALE = 0.99F;
   private static final int SQRT_LUT_SIZE = 2048;
   private static final float[] sqrtLookup = new float[2049];

   SVGRadialGradientPaintContext(@NotNull SVGRadialGradientPaint paint, @NotNull AffineTransform t, float cx, float cy, float r, float fx, float fy, float fr, @NotNull float[] fractions, @NotNull Color[] colors, CycleMethod cycleMethod, ColorSpaceType colorSpace) {
      super(paint, t, fractions, colors, cycleMethod, colorSpace);
      this.centerX = cx;
      this.centerY = cy;
      this.focusX = fx;
      this.focusY = fy;
      this.isSimpleFocus = this.focusX == this.centerX && this.focusY == this.centerY && fr == 0.0F;
      this.isNonCyclic = cycleMethod == CycleMethod.NO_CYCLE;
      this.radiusSq = r * r;
      this.focusRadius = fr;
      this.focusRadiusSq = fr * fr;
      float dX = this.focusX - this.centerX;
      float dY = this.focusY - this.centerY;
      double distSq = (double)(dX * dX + dY * dY);
      if (distSq > (double)(this.radiusSq * 0.99F)) {
         float scale = (float)Math.sqrt((double)(this.radiusSq * 0.99F) / distSq);
         dX *= scale;
         dY *= scale;
         this.focusX = this.centerX + dX;
         this.focusY = this.centerY + dY;
      }

      this.trivial = (float)Math.sqrt((double)(this.radiusSq - dX * dX));
      this.constA = this.a02 - this.centerX;
      this.constB = this.a12 - this.centerY;
      this.gDeltaDelta = 2.0F * (this.a00 * this.a00 + this.a10 * this.a10) / this.radiusSq;
   }

   protected void fillRaster(int[] pixels, int off, int adjust, int x, int y, int w, int h) {
      if (this.isSimpleFocus && this.isNonCyclic && this.isSimpleLookup) {
         this.simpleNonCyclicFillRaster(pixels, off, adjust, x, y, w, h);
      } else {
         this.cyclicCircularGradientFillRaster(pixels, off, adjust, x, y, w, h);
      }

   }

   private void simpleNonCyclicFillRaster(int[] pixels, int off, int adjust, int x, int y, int w, int h) {
      float rowX = this.a00 * (float)x + this.a01 * (float)y + this.constA;
      float rowY = this.a10 * (float)x + this.a11 * (float)y + this.constB;
      float gDeltaDelta = this.gDeltaDelta;
      adjust += w;
      int rgbclip = this.gradient[this.fastGradientArraySize];

      for(int j = 0; j < h; ++j) {
         float gRel = (rowX * rowX + rowY * rowY) / this.radiusSq;
         float gDelta = 2.0F * (this.a00 * rowX + this.a10 * rowY) / this.radiusSq + gDeltaDelta / 2.0F;

         int i;
         for(i = 0; i < w && gRel >= 1.0F; ++i) {
            pixels[off + i] = rgbclip;
            gRel += gDelta;
            gDelta += gDeltaDelta;
         }

         while(i < w && gRel < 1.0F) {
            int gIndex;
            if (gRel <= 0.0F) {
               gIndex = 0;
            } else {
               float fIndex = gRel * 2048.0F;
               int iIndex = (int)fIndex;
               float s0 = sqrtLookup[iIndex];
               float s1 = sqrtLookup[iIndex + 1] - s0;
               fIndex = s0 + (fIndex - (float)iIndex) * s1;
               gIndex = (int)(fIndex * (float)this.fastGradientArraySize);
            }

            pixels[off + i] = this.gradient[gIndex];
            gRel += gDelta;
            gDelta += gDeltaDelta;
            ++i;
         }

         while(i < w) {
            pixels[off + i] = rgbclip;
            ++i;
         }

         off += adjust;
         rowX += this.a01;
         rowY += this.a11;
      }

   }

   private void cyclicCircularGradientFillRaster(int[] pixels, int off, int adjust, int x, int y, int w, int h) {
      double constC = (double)(-this.radiusSq + this.centerX * this.centerX + this.centerY * this.centerY);
      float constX = this.a00 * (float)x + this.a01 * (float)y + this.a02;
      float constY = this.a10 * (float)x + this.a11 * (float)y + this.a12;
      float precalc2 = 2.0F * this.centerY;
      float precalc3 = -2.0F * this.centerX;
      int indexer = off;
      int pixInc = w + adjust;

      for(int j = 0; j < h; ++j) {
         float X = this.a01 * (float)j + constX;
         float Y = this.a11 * (float)j + constY;

         for(int i = 0; i < w; ++i) {
            double solutionX;
            double solutionY;
            if (X == this.focusX) {
               solutionX = (double)this.focusX;
               solutionY = (double)this.centerY;
               solutionY += Y > this.focusY ? (double)this.trivial : (double)(-this.trivial);
            } else {
               double slope = (double)((Y - this.focusY) / (X - this.focusX));
               double yIntercept = (double)Y - slope * (double)X;
               double A = slope * slope + 1.0D;
               double B = (double)precalc3 + -2.0D * slope * ((double)this.centerY - yIntercept);
               double C = constC + yIntercept * (yIntercept - (double)precalc2);
               float det = (float)Math.sqrt(B * B - 4.0D * A * C);
               solutionX = -B;
               solutionX += X < this.focusX ? (double)(-det) : (double)det;
               solutionX /= 2.0D * A;
               solutionY = slope * solutionX + yIntercept;
            }

            float deltaXSq = X - this.focusX;
            deltaXSq *= deltaXSq;
            float deltaYSq = Y - this.focusY;
            deltaYSq *= deltaYSq;
            float currentToFocusSq = deltaXSq + deltaYSq;
            int colorAtPoint;
            if (currentToFocusSq <= this.focusRadiusSq) {
               colorAtPoint = this.indexIntoGradientsArrays(0.0F);
            } else {
               deltaXSq = (float)solutionX - this.focusX;
               deltaXSq *= deltaXSq;
               deltaYSq = (float)solutionY - this.focusY;
               deltaYSq *= deltaYSq;
               float intersectToFocusSq = deltaXSq + deltaYSq;
               float g;
               if (this.focusRadius > 0.0F) {
                  float currentToFocus = (float)Math.sqrt((double)currentToFocusSq);
                  float intersectToFocus = (float)Math.sqrt((double)intersectToFocusSq);
                  g = (currentToFocus - this.focusRadius) / (intersectToFocus - this.focusRadius);
               } else {
                  g = (float)Math.sqrt((double)(currentToFocusSq / intersectToFocusSq));
               }

               colorAtPoint = this.indexIntoGradientsArrays(g);
            }

            pixels[indexer + i] = colorAtPoint;
            X += this.a00;
            Y += this.a10;
         }

         indexer += pixInc;
      }

   }

   static {
      for(int i = 0; i < sqrtLookup.length; ++i) {
         sqrtLookup[i] = (float)Math.sqrt((double)((float)i / 2048.0F));
      }

   }
}
