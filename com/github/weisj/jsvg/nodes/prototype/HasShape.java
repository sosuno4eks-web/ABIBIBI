package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;

public interface HasShape {
   @NotNull
   default Shape elementShape(@NotNull RenderContext context) {
      Shape shape = this.untransformedElementShape(context);
      return this instanceof Transformable ? ((Transformable)this).transformShape(shape, context.measureContext()) : shape;
   }

   @NotNull
   Shape untransformedElementShape(@NotNull RenderContext var1);

   @NotNull
   default Rectangle2D elementBounds(@NotNull RenderContext context) {
      Rectangle2D shape = this.untransformedElementBounds(context);
      return this instanceof Transformable ? ((Transformable)this).transformShape(shape, context.measureContext()).getBounds2D() : shape;
   }

   @NotNull
   Rectangle2D untransformedElementBounds(@NotNull RenderContext var1);
}
