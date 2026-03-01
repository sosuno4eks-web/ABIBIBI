package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Path2D;
import org.jetbrains.annotations.NotNull;

public final class Terminal extends PathCommand {
   Terminal() {
      super(1);
   }

   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
      path.closePath();
      hist.setLastPoint(hist.startPoint);
      hist.setLastKnot(hist.startPoint);
   }

   public String toString() {
      return "Z";
   }
}
