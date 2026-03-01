package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D.Float;
import org.jetbrains.annotations.NotNull;

public abstract class PathCommand {
   private final boolean isRelative;
   private final int nodeCount;

   protected PathCommand(int nodeCount) {
      this(false, nodeCount);
   }

   protected PathCommand(boolean isRelative, int nodeCount) {
      this.isRelative = isRelative;
      this.nodeCount = nodeCount;
   }

   protected Float offset(@NotNull BuildHistory hist) {
      return this.isRelative() ? new Float(hist.lastPoint.x, hist.lastPoint.y) : new Float(0.0F, 0.0F);
   }

   protected Float lastKnotReflection(@NotNull BuildHistory hist) {
      float oldKx = hist.lastKnot.x;
      float oldKy = hist.lastKnot.y;
      float oldX = hist.lastPoint.x;
      float oldY = hist.lastPoint.y;
      float kx = oldX * 2.0F - oldKx;
      float ky = oldY * 2.0F - oldKy;
      return new Float(kx, ky);
   }

   public boolean isRelative() {
      return this.isRelative;
   }

   public abstract void appendPath(@NotNull Path2D var1, @NotNull BuildHistory var2);

   public int nodeCount() {
      return this.nodeCount;
   }
}
