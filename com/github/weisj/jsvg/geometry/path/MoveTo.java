package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D.Float;
import org.jetbrains.annotations.NotNull;

final class MoveTo extends PathCommand {
   private final float x;
   private final float y;

   public MoveTo(boolean isRelative, float x, float y) {
      super(isRelative, 2);
      this.x = x;
      this.y = y;
   }

   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
      Float offset = this.offset(hist);
      path.moveTo((double)(this.x + offset.x), (double)(this.y + offset.y));
      hist.setStartPoint(path.getCurrentPoint());
      hist.setLastPoint(path.getCurrentPoint());
      hist.setLastKnot(path.getCurrentPoint());
   }

   public String toString() {
      return "M " + this.x + " " + this.y;
   }
}
