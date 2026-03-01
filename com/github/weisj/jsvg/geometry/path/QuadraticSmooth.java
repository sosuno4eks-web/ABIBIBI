package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D.Float;
import org.jetbrains.annotations.NotNull;

final class QuadraticSmooth extends PathCommand {
   private final float x;
   private final float y;

   public QuadraticSmooth(boolean isRelative, float x, float y) {
      super(isRelative, 4);
      this.x = x;
      this.y = y;
   }

   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
      Float offset = this.offset(hist);
      Float knot = this.lastKnotReflection(hist);
      path.quadTo((double)knot.x, (double)knot.y, (double)(this.x + offset.x), (double)(this.y + offset.y));
      hist.setLastPoint(path.getCurrentPoint());
      hist.setLastKnot(knot);
   }

   public String toString() {
      return "T " + this.x + " " + this.y;
   }
}
