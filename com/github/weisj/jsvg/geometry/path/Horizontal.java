package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import org.jetbrains.annotations.NotNull;

final class Horizontal extends PathCommand {
   private final float x;

   public Horizontal(boolean isRelative, float x) {
      super(isRelative, 2);
      this.x = x;
   }

   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
      float xOff = this.isRelative() ? hist.lastPoint.x : 0.0F;
      float yOff = hist.lastPoint.y;
      path.lineTo((double)(this.x + xOff), (double)yOff);
      hist.setLastPoint(path.getCurrentPoint());
      hist.setLastKnot(path.getCurrentPoint());
   }

   public String toString() {
      return "H " + this.x;
   }
}
