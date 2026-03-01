package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.geom.Path2D;
import org.jetbrains.annotations.NotNull;

interface TextSegment {
   public interface RenderableSegment extends TextSegment {
      void prepareSegmentForRendering(@NotNull GlyphCursor var1, @NotNull RenderContext var2);

      void renderSegmentWithoutLayout(@NotNull GlyphCursor var1, @NotNull RenderContext var2, @NotNull Output var3);

      boolean hasFixedLength();

      @NotNull
      TextMetrics computeTextMetrics(@NotNull RenderContext var1, @NotNull TextSegment.RenderableSegment.UseTextLengthForCalculation var2);

      void appendTextShape(@NotNull GlyphCursor var1, @NotNull Path2D var2, @NotNull RenderContext var3);

      public static enum UseTextLengthForCalculation {
         YES,
         NO;

         // $FF: synthetic method
         private static TextSegment.RenderableSegment.UseTextLengthForCalculation[] $values() {
            return new TextSegment.RenderableSegment.UseTextLengthForCalculation[]{YES, NO};
         }
      }
   }
}
