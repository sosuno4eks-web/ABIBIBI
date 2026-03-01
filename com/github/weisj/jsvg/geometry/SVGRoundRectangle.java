package com.github.weisj.jsvg.geometry;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D.Float;
import org.jetbrains.annotations.NotNull;

public final class SVGRoundRectangle implements MeasurableShape {
   @NotNull
   private final Float rect = new Float();
   @NotNull
   private final Length x;
   @NotNull
   private final Length y;
   @NotNull
   private final Length w;
   @NotNull
   private final Length h;
   @NotNull
   private final Length rx;
   @NotNull
   private final Length ry;

   public SVGRoundRectangle(@NotNull Length x, @NotNull Length y, @NotNull Length w, @NotNull Length h, @NotNull Length rx, @NotNull Length ry) {
      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
      this.rx = rx;
      this.ry = ry;
   }

   private void validateShape(@NotNull MeasureContext measureContext) {
      this.rect.setRoundRect(this.x.resolveWidth(measureContext), this.y.resolveHeight(measureContext), this.w.resolveWidth(measureContext), this.h.resolveHeight(measureContext), this.rx.resolveWidth(measureContext) * 2.0F, this.ry.resolveHeight(measureContext) * 2.0F);
   }

   @NotNull
   public Shape shape(@NotNull RenderContext context, boolean validate) {
      if (validate) {
         this.validateShape(context.measureContext());
      }

      return this.rect;
   }

   @NotNull
   public Rectangle2D bounds(@NotNull RenderContext context, boolean validate) {
      if (validate) {
         this.validateShape(context.measureContext());
      }

      return this.rect.getBounds2D();
   }

   public double pathLength(@NotNull MeasureContext measureContext) {
      float a = this.rx.resolveWidth(measureContext);
      float b = this.ry.resolveHeight(measureContext);
      double l = (double)(2.0F * (this.w.resolveWidth(measureContext) - 2.0F * a + (this.h.resolveHeight(measureContext) - 2.0F * b)));
      return a == b ? l + SVGCircle.circumference((double)a) : l + SVGEllipse.ellipseCircumference((double)a, (double)b);
   }
}
