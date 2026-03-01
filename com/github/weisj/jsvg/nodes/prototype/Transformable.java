package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Transformable {
   default boolean shouldTransform() {
      return true;
   }

   @Nullable
   AffineTransform transform();

   @NotNull
   Point2D transformOrigin(@NotNull MeasureContext var1);

   default void applyTransform(@NotNull Output output, @NotNull RenderContext context) {
      AffineTransform transform = this.transform();
      if (transform != null) {
         Point2D transformOrigin = this.transformOrigin(context.measureContext());
         AffineTransform conjugate = AffineTransform.getTranslateInstance(transformOrigin.getX(), transformOrigin.getY());
         conjugate.concatenate(transform);
         conjugate.translate(-transformOrigin.getX(), -transformOrigin.getY());
         output.applyTransform(conjugate);
         context.userSpaceTransform().concatenate(conjugate);
      }

   }

   default Shape transformShape(@NotNull Shape shape, @NotNull MeasureContext measureContext) {
      AffineTransform transform = this.transform();
      if (transform != null) {
         Point2D transformOrigin = this.transformOrigin(measureContext);
         AffineTransform at = new AffineTransform();
         at.translate(transformOrigin.getX(), transformOrigin.getY());
         at.concatenate(transform);
         at.translate(-transformOrigin.getX(), -transformOrigin.getY());
         return at.createTransformedShape(shape);
      } else {
         return shape;
      }
   }
}
