package com.github.weisj.jsvg.geometry;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.geometry.util.GeometryUtil;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D.Float;
import org.jetbrains.annotations.NotNull;

public final class SVGLine implements MeasurableShape {
   @NotNull
   private final Float line = new Float();
   private final Length x1;
   private final Length y1;
   private final Length x2;
   private final Length y2;

   public SVGLine(@NotNull Length x1, @NotNull Length y1, @NotNull Length x2, @NotNull Length y2) {
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
   }

   public boolean canBeFilled() {
      return false;
   }

   private void validateShape(@NotNull MeasureContext measureContext) {
      this.line.setLine(this.x1.resolveWidth(measureContext), this.y1.resolveHeight(measureContext), this.x2.resolveWidth(measureContext), this.y2.resolveHeight(measureContext));
   }

   @NotNull
   public Shape shape(@NotNull RenderContext context, boolean validate) {
      if (validate) {
         this.validateShape(context.measureContext());
      }

      return this.line;
   }

   @NotNull
   public Rectangle2D bounds(@NotNull RenderContext context, boolean validate) {
      if (validate) {
         this.validateShape(context.measureContext());
      }

      return this.line.getBounds2D();
   }

   public double pathLength(@NotNull MeasureContext measureContext) {
      return GeometryUtil.lineLength((double)this.x1.resolveWidth(measureContext), (double)this.y1.resolveHeight(measureContext), (double)this.x2.resolveWidth(measureContext), (double)this.y2.resolveHeight(measureContext));
   }
}
