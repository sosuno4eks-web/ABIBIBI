package com.github.weisj.jsvg.renderer.jdk;

import java.awt.Color;
import java.awt.Paint;
import java.awt.MultipleGradientPaint.ColorSpaceType;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;
import java.lang.ref.SoftReference;
import org.jetbrains.annotations.NotNull;

public abstract class SVGMultipleGradientPaint implements Paint {
   final int transparency;
   @NotNull
   final float[] fractions;
   @NotNull
   final Color[] colors;
   @NotNull
   final AffineTransform gradientTransform;
   @NotNull
   final CycleMethod cycleMethod;
   @NotNull
   final ColorSpaceType colorSpace;
   ColorModel model;
   float[] normalizedIntervals;
   boolean isSimpleLookup;
   SoftReference<int[][]> gradients;
   SoftReference<int[]> gradient;
   int fastGradientArraySize;

   SVGMultipleGradientPaint(@NotNull float[] fractions, @NotNull Color[] colors, @NotNull CycleMethod cycleMethod, @NotNull ColorSpaceType colorSpace, @NotNull AffineTransform gradientTransform) {
      if (fractions.length != colors.length) {
         throw new IllegalArgumentException("Colors and fractions must have equal size");
      } else if (colors.length < 2) {
         throw new IllegalArgumentException("User must specify at least 2 colors");
      } else {
         float previousFraction = -1.0F;
         float[] var7 = fractions;
         int var8 = fractions.length;

         int var9;
         for(var9 = 0; var9 < var8; ++var9) {
            float currentFraction = var7[var9];
            if (currentFraction < 0.0F || currentFraction > 1.0F) {
               throw new IllegalArgumentException("Fraction values must be in the range 0 to 1: " + currentFraction);
            }

            if (currentFraction <= previousFraction) {
               throw new IllegalArgumentException("Keyframe fractions must be increasing: " + currentFraction);
            }

            previousFraction = currentFraction;
         }

         if (fractions[0] != 0.0F) {
            throw new IllegalStateException("Gradient start point must be equal to zero");
         } else if (fractions[fractions.length - 1] != 1.0F) {
            throw new IllegalStateException("Gradient end point must be equal to one");
         } else {
            this.fractions = fractions;
            this.colors = colors;
            this.colorSpace = colorSpace;
            this.cycleMethod = cycleMethod;
            this.gradientTransform = gradientTransform;
            boolean opaque = true;
            Color[] var13 = colors;
            var9 = colors.length;

            for(int var14 = 0; var14 < var9; ++var14) {
               Color color = var13[var14];
               opaque = opaque && color.getAlpha() == 255;
            }

            this.transparency = opaque ? 1 : 3;
         }
      }
   }

   public int getTransparency() {
      return this.transparency;
   }
}
