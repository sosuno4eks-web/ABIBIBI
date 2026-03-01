package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import org.jetbrains.annotations.NotNull;

final class Vertical extends PathCommand {
   private final float y;

   public Vertical(boolean isRelative, float y) {
      super(isRelative, 2);
      this.y = y;
   }

   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
      float xOff = hist.lastPoint.x;
      float yOff = this.isRelative() ? hist.lastPoint.y : 0.0F;
      path.lineTo((double)xOff, (double)(this.y + yOff));
      hist.setLastPoint(path.getCurrentPoint());
      hist.setLastKnot(path.getCurrentPoint());
   }

   public String toString() {
      return "V " + this.y;
   }
}
