package com.github.weisj.jsvg.attributes.paint;

import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface SimplePaintSVGPaint extends SVGPaint {
   @NotNull
   Paint paint();

   default void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
      output.setPaint(this.paint());
      output.fillShape(shape);
   }

   default void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
      output.setPaint(this.paint());
      output.drawShape(shape);
   }
}
