package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D.Float;
import org.jetbrains.annotations.NotNull;

final class CubicSmooth extends PathCommand {
   private final float x;
   private final float y;
   private final float k2x;
   private final float k2y;

   public CubicSmooth(boolean isRelative, float k2x, float k2y, float x, float y) {
      super(isRelative, 6);
      this.k2x = k2x;
      this.k2y = k2y;
      this.x = x;
      this.y = y;
   }

   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
      Float offset = this.offset(hist);
      Float knot = this.lastKnotReflection(hist);
      path.curveTo((double)knot.x, (double)knot.y, (double)(this.k2x + offset.x), (double)(this.k2y + offset.y), (double)(this.x + offset.x), (double)(this.y + offset.y));
      hist.setLastPoint(path.getCurrentPoint());
      hist.setLastKnot(this.k2x + offset.x, this.k2y + offset.y);
   }

   public String toString() {
      return "S " + this.k2x + " " + this.k2y + " " + this.x + " " + this.y;
   }
}
