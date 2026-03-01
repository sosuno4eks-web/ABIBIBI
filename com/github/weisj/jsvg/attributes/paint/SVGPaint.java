package com.github.weisj.jsvg.attributes.paint;

import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface SVGPaint {
   AwtSVGPaint DEFAULT_PAINT = new AwtSVGPaint(PaintParser.DEFAULT_COLOR);
   SVGPaint NONE = new SVGPaint() {
      public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
      }

      public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
      }

      public String toString() {
         return "SVGPaint.None";
      }
   };
   SVGPaint CURRENT_COLOR = new SVGPaint() {
      public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
         throw new IllegalStateException("Sentinel color CURRENT_COLOR shouldn't be used for painting directly");
      }

      public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
         throw new IllegalStateException("Sentinel color CURRENT_COLOR shouldn't be used for painting directly");
      }

      public String toString() {
         return "SVGPaint.CurrentColor";
      }
   };
   SVGPaint CONTEXT_FILL = new SVGPaint() {
      public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
         throw new IllegalStateException("Sentinel color CONTEXT_FILL shouldn't be used for painting directly");
      }

      public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
         throw new IllegalStateException("Sentinel color CONTEXT_FILL shouldn't be used for painting directly");
      }

      public String toString() {
         return "SVGPaint.ContextFill";
      }
   };
   SVGPaint CONTEXT_STROKE = new SVGPaint() {
      public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
         throw new IllegalStateException("Sentinel color CONTEXT_STROKE shouldn't be used for painting directly");
      }

      public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
         throw new IllegalStateException("Sentinel color CONTEXT_STROKE shouldn't be used for painting directly");
      }

      public String toString() {
         return "SVGPaint.ContextStroke";
      }
   };

   void fillShape(@NotNull Output var1, @NotNull RenderContext var2, @NotNull Shape var3, @Nullable Rectangle2D var4);

   void drawShape(@NotNull Output var1, @NotNull RenderContext var2, @NotNull Shape var3, @Nullable Rectangle2D var4);

   default boolean isVisible() {
      return this != NONE;
   }
}
