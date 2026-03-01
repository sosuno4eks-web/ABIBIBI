package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D.Float;
import org.jetbrains.annotations.NotNull;

final class Cubic extends PathCommand {
   private final float k1x;
   private final float k1y;
   private final float k2x;
   private final float k2y;
   private final float x;
   private final float y;

   public Cubic(boolean isRelative, float k1x, float k1y, float k2x, float k2y, float x, float y) {
      super(isRelative, 6);
      this.k1x = k1x;
      this.k1y = k1y;
      this.k2x = k2x;
      this.k2y = k2y;
      this.x = x;
      this.y = y;
   }

   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
      Float offset = this.offset(hist);
      path.curveTo((double)(this.k1x + offset.x), (double)(this.k1y + offset.y), (double)(this.k2x + offset.x), (double)(this.k2y + offset.y), (double)(this.x + offset.x), (double)(this.y + offset.y));
      hist.setLastPoint(path.getCurrentPoint());
      hist.setLastKnot(this.k2x + offset.x, this.k2y + offset.y);
   }

   public String toString() {
      return "C " + this.k1x + " " + this.k1y + " " + this.k2x + " " + this.k2y + " " + this.x + " " + this.y;
   }
}
