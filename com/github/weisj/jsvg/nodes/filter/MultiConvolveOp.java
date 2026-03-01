package com.github.weisj.jsvg.nodes.filter;

import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.awt.image.ConvolveOp;
import java.awt.image.Raster;
import java.awt.image.RasterOp;
import java.awt.image.WritableRaster;
import org.jetbrains.annotations.NotNull;

final class MultiConvolveOp implements BufferedImageOp, RasterOp {
   @NotNull
   private final ConvolveOp[] ops;
   @NotNull
   private final ConvolveOp op;

   public MultiConvolveOp(@NotNull ConvolveOp[] ops) {
      if (ops.length == 0) {
         throw new IllegalStateException("Must supply at least one op");
      } else {
         this.ops = ops;
         this.op = ops[0];
      }
   }

   public BufferedImage filter(BufferedImage src, BufferedImage dest) {
      BufferedImage result1 = this.op.filter(src, dest);
      if (this.ops.length == 1) {
         return result1;
      } else {
         BufferedImage result2 = this.ops[1].filter(result1, (BufferedImage)null);
         BufferedImage r = result2;

         for(int i = 2; i < this.ops.length; ++i) {
            result1 = this.ops[1].filter(result2, result1);
            r = result1;
            result1 = result2;
            result2 = r;
         }

         return r;
      }
   }

   public WritableRaster filter(Raster src, WritableRaster dest) {
      WritableRaster result1 = this.op.filter(src, dest);
      if (this.ops.length == 1) {
         return result1;
      } else {
         WritableRaster result2 = this.ops[1].filter(result1, (WritableRaster)null);
         WritableRaster r = result2;

         for(int i = 2; i < this.ops.length; ++i) {
            result1 = this.ops[1].filter(result2, result1);
            r = result1;
            result1 = result2;
            result2 = r;
         }

         return r;
      }
   }

   public BufferedImage createCompatibleDestImage(BufferedImage src, ColorModel destCM) {
      return this.op.createCompatibleDestImage(src, destCM);
   }

   public WritableRaster createCompatibleDestRaster(Raster src) {
      return this.op.createCompatibleDestRaster(src);
   }

   public Rectangle2D getBounds2D(@NotNull BufferedImage src) {
      return this.op.getBounds2D(src);
   }

   public Rectangle2D getBounds2D(@NotNull Raster src) {
      return this.op.getBounds2D(src);
   }

   public Point2D getPoint2D(Point2D srcPt, Point2D dstPt) {
      return this.op.getPoint2D(srcPt, dstPt);
   }

   public RenderingHints getRenderingHints() {
      return this.op.getRenderingHints();
   }
}
