package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.renderer.NodeRenderer;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Path2D.Float;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public interface ShapedContainer<E> extends Container<E>, HasShape {
   @NotNull
   default Shape untransformedElementShape(@NotNull RenderContext context) {
      Path2D shape = new Float();
      Iterator var3 = this.children().iterator();

      while(var3.hasNext()) {
         E child = var3.next();
         if (child instanceof HasShape) {
            RenderContext childContext = NodeRenderer.setupRenderContext(child, context);
            Shape childShape = ((HasShape)child).elementShape(childContext);
            shape.append(childShape, false);
         }
      }

      return shape;
   }

   @NotNull
   default Rectangle2D untransformedElementBounds(@NotNull RenderContext context) {
      Rectangle2D bounds = null;
      Iterator var3 = this.children().iterator();

      while(var3.hasNext()) {
         E child = var3.next();
         if (child instanceof HasShape) {
            RenderContext childContext = NodeRenderer.setupRenderContext(child, context);
            Rectangle2D childBounds = ((HasShape)child).elementBounds(childContext);
            if (!childBounds.isEmpty()) {
               if (bounds == null) {
                  bounds = childBounds;
               } else {
                  Rectangle2D.union(bounds, childBounds, bounds);
               }
            }
         }
      }

      return bounds;
   }
}
