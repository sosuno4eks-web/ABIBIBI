package com.github.weisj.jsvg.geometry.path;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import org.jetbrains.annotations.NotNull;

public final class BuildHistory {
   @NotNull
   final Float startPoint = new Float();
   @NotNull
   final Float lastPoint = new Float();
   @NotNull
   final Float lastKnot = new Float();

   public void setStartPoint(@NotNull Point2D point) {
      this.startPoint.setLocation(point);
   }

   public void setLastPoint(@NotNull Point2D point) {
      this.lastPoint.setLocation(point);
   }

   public void setLastKnot(float x, float y) {
      this.lastKnot.setLocation(x, y);
   }

   public void setLastKnot(@NotNull Point2D point) {
      this.lastKnot.setLocation(point);
   }
}
