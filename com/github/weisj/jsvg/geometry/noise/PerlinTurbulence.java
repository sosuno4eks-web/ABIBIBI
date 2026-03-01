package com.github.weisj.jsvg.geometry.noise;

import java.awt.geom.Rectangle2D.Double;
import org.jetbrains.annotations.Nullable;

public final class PerlinTurbulence {
   private static final int RAND_m = Integer.MAX_VALUE;
   private static final int RAND_a = 16807;
   private static final int RAND_q = 127773;
   private static final int RAND_r = 2836;
   private static final int BSize = 256;
   private static final int BM = 255;
   private static final double PerlinN = 4096.0D;
   private final int[] uLatticeSelector = new int[257];
   private final double[] fGradient = new double[2056];
   private final int numOctaves;
   private final double xFrequency;
   private final double yFrequency;

   public PerlinTurbulence(int seed, int numOctaves, double xFrequency, double yFrequency) {
      this.numOctaves = numOctaves;
      this.xFrequency = xFrequency;
      this.yFrequency = yFrequency;
      this.init(seed);
   }

   private static int setupSeed(int seed) {
      if (seed <= 0) {
         seed = -(seed % 2147483646) + 1;
      }

      if (seed > 2147483646) {
         seed = 2147483646;
      }

      return seed;
   }

   private static int random(int seed) {
      int result = 16807 * (seed % 127773) - 2836 * (seed / 127773);
      if (result <= 0) {
         result += Integer.MAX_VALUE;
      }

      return result;
   }

   private void init(int seed) {
      int lSeed = setupSeed(seed);

      int i;
      int k;
      double s;
      for(k = 0; k < 4; ++k) {
         for(i = 0; i < 256; ++i) {
            double u;
            do {
               u = (double)((lSeed = random(lSeed)) % 512) - 256.0D;
               s = (double)((lSeed = random(lSeed)) % 512) - 256.0D;
            } while(u == 0.0D && s == 0.0D);

            double s = Math.sqrt(u * u + s * s);
            double si = 1.0D / s;
            this.fGradient[i * 8 + k * 2] = u * si;
            this.fGradient[i * 8 + k * 2 + 1] = s * si;
         }
      }

      for(i = 0; i < 256; this.uLatticeSelector[i] = i++) {
      }

      while(true) {
         --i;
         int j;
         if (i <= 0) {
            this.uLatticeSelector[256] = this.uLatticeSelector[0];

            for(j = 0; j < 8; ++j) {
               this.fGradient[2048 + j] = this.fGradient[j];
            }

            return;
         }

         k = this.uLatticeSelector[i];
         j = (lSeed = random(lSeed)) % 256;
         this.uLatticeSelector[i] = this.uLatticeSelector[j];
         this.uLatticeSelector[j] = k;
         int s1 = i << 3;
         int s2 = j << 3;

         for(j = 0; j < 8; ++j) {
            s = this.fGradient[s1 + j];
            this.fGradient[s1 + j] = this.fGradient[s2 + j];
            this.fGradient[s2 + j] = s;
         }
      }
   }

   private static double curve(double t) {
      return t * t * (3.0D - 2.0D * t);
   }

   private static double lerp(double t, double a, double b) {
      return a + t * (b - a);
   }

   private void noise2(double[] noiseChannels, double vec0, double vec1, @Nullable PerlinTurbulence.StitchInfo stitchInfo) {
      double t = vec0 + 4096.0D;
      int bx0 = (int)t;
      int bx1 = bx0 + 1;
      double rx0 = t - (double)bx0;
      double rx1 = rx0 - 1.0D;
      double sx = curve(rx0);
      t = vec1 + 4096.0D;
      int by0 = (int)t;
      int by1 = by0 + 1;
      double ry0 = t - (double)((int)t);
      double ry1 = ry0 - 1.0D;
      double sy = curve(ry0);
      if (stitchInfo != null) {
         if (bx0 >= stitchInfo.wrapX) {
            bx0 -= stitchInfo.width;
         }

         if (bx1 >= stitchInfo.wrapX) {
            bx1 -= stitchInfo.width;
         }

         if (by0 >= stitchInfo.wrapY) {
            by0 -= stitchInfo.height;
         }

         if (by1 >= stitchInfo.wrapY) {
            by1 -= stitchInfo.height;
         }
      }

      bx0 &= 255;
      bx1 &= 255;
      by0 &= 255;
      by1 &= 255;
      int i = this.uLatticeSelector[bx0];
      int j = this.uLatticeSelector[bx1];
      int b00 = (i + by0 & 255) << 3;
      int b10 = (j + by0 & 255) << 3;
      int b01 = (i + by1 & 255) << 3;
      int b11 = (j + by1 & 255) << 3;

      for(int channelIndex = 0; channelIndex < noiseChannels.length; ++channelIndex) {
         int offset = 2 * channelIndex;
         noiseChannels[channelIndex] = lerp(sy, lerp(sx, rx0 * this.fGradient[b00 + offset] + ry0 * this.fGradient[b00 + offset + 1], rx1 * this.fGradient[b10 + offset] + ry0 * this.fGradient[b10 + offset + 1]), lerp(sx, rx0 * this.fGradient[b01 + offset] + ry1 * this.fGradient[b01 + offset + 1], rx1 * this.fGradient[b11 + offset] + ry1 * this.fGradient[b11 + offset + 1]));
      }

   }

   public void turbulence(double[] turbulenceChannels, double pointX, double pointY, boolean fractalSum, @Nullable PerlinTurbulence.StitchInfo stitchInfo, @Nullable Double tile) {
      double baseFrequencyX = this.xFrequency;
      double baseFrequencyY = this.yFrequency;
      if (stitchInfo != null) {
         assert tile != null;

         if (baseFrequencyX != 0.0D) {
            baseFrequencyX = this.adjustFrequency(baseFrequencyX, tile.width);
         }

         if (baseFrequencyY != 0.0D) {
            baseFrequencyY = this.adjustFrequency(baseFrequencyY, tile.height);
         }

         stitchInfo.width = (int)(tile.width * baseFrequencyX + 0.5D);
         stitchInfo.wrapX = (int)(tile.x * baseFrequencyX + 4096.0D + (double)stitchInfo.width);
         stitchInfo.height = (int)(tile.height * baseFrequencyY + 0.5D);
         stitchInfo.wrapY = (int)(tile.y * baseFrequencyY + 4096.0D + (double)stitchInfo.height);
      }

      double[] fSum = fractalSum ? new double[]{127.5D, 127.5D, 127.5D, 127.5D} : new double[]{0.0D, 0.0D, 0.0D, 0.0D};
      double vec0 = pointX * baseFrequencyX;
      double vec1 = pointY * baseFrequencyY;
      double ratio = fractalSum ? 127.5D : 255.0D;

      for(int nOctave = 0; nOctave < this.numOctaves; ++nOctave) {
         this.noise2(turbulenceChannels, vec0, vec1, stitchInfo);
         int i;
         if (fractalSum) {
            for(i = 0; i < turbulenceChannels.length; ++i) {
               fSum[i] += turbulenceChannels[i] * ratio;
            }
         } else {
            for(i = 0; i < turbulenceChannels.length; ++i) {
               fSum[i] += Math.abs(turbulenceChannels[i]) * ratio;
            }
         }

         vec0 *= 2.0D;
         vec1 *= 2.0D;
         ratio *= 0.5D;
         if (stitchInfo != null) {
            stitchInfo.width = 2;
            stitchInfo.wrapX = 2;
            stitchInfo.wrapX = 4096;
            stitchInfo.height = 2;
            stitchInfo.wrapY = 2;
            stitchInfo.wrapY = 4096;
         }
      }

      System.arraycopy(fSum, 0, turbulenceChannels, 0, fSum.length);
   }

   private double adjustFrequency(double frequency, double tileSize) {
      double fLoFreq = Math.floor(tileSize * frequency) / tileSize;
      double fHiFreq = Math.ceil(tileSize * frequency) / tileSize;
      return frequency / fLoFreq < fHiFreq / frequency ? fLoFreq : fHiFreq;
   }

   public static final class StitchInfo {
      private int width;
      private int height;
      private int wrapX;
      private int wrapY;
   }
}
