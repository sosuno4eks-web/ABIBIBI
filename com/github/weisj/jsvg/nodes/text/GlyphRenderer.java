package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.attributes.PaintOrder;
import com.github.weisj.jsvg.attributes.VectorEffect;
import com.github.weisj.jsvg.attributes.font.SVGFont;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.renderer.FontRenderContext;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.renderer.ShapeRenderer;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Path2D.Float;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

final class GlyphRenderer {
   private static final boolean DEBUG = false;

   private GlyphRenderer() {
   }

   static void prepareGlyphRun(@NotNull StringTextSegment segment, @NotNull GlyphCursor cursor, @NotNull SVGFont font, @NotNull RenderContext context) {
      MeasureContext measure = context.measureContext();
      Shape glyphRun = layoutGlyphRun(segment, cursor, font, measure, context.fontRenderContext());
      Rectangle2D bounds = glyphRun.getBounds2D();
      if (Length.isUnspecified((float)cursor.completeGlyphRunBounds.getX())) {
         cursor.completeGlyphRunBounds.setRect(bounds);
      } else {
         Rectangle2D.union(cursor.completeGlyphRunBounds, bounds, cursor.completeGlyphRunBounds);
      }

      segment.currentGlyphRun = glyphRun;
      segment.currentRenderContext = context;
   }

   static void renderGlyphRun(@NotNull Output output, @NotNull PaintOrder paintOrder, @NotNull Set<VectorEffect> vectorEffects, @NotNull StringTextSegment segment, @NotNull Rectangle2D completeGlyphRunBounds) {
      RenderContext context = segment.currentRenderContext;

      assert context != null;

      Shape glyphRun = segment.currentGlyphRun;

      assert glyphRun != null;

      Stroke stroke = context.stroke(1.0F);
      ShapeRenderer.renderWithPaintOrder(output, true, paintOrder, new ShapeRenderer.ShapePaintContext(context, vectorEffects, stroke, (AffineTransform)null), new ShapeRenderer.PaintShape(glyphRun, completeGlyphRunBounds), (ShapeRenderer.ShapeMarkerInfo)null);
      segment.currentRenderContext = null;
      segment.currentGlyphRun = null;
   }

   static Shape layoutGlyphRun(@NotNull StringTextSegment segment, @NotNull GlyphCursor cursor, @NotNull SVGFont font, @NotNull MeasureContext measure, @NotNull FontRenderContext fontRenderContext) {
      float letterSpacing = fontRenderContext.letterSpacing().resolveLength(measure);
      Path2D glyphPath = new Float();
      boolean isLastSegment = segment.isLastSegmentInParent();
      boolean shouldSkipLastSpacing = isLastSegment && cursor.advancement().shouldSkipLastSpacing();
      char[] codepoints = segment.codepoints();
      int i = 0;

      for(int count = codepoints.length; i < count; ++i) {
         char codepoint = codepoints[i];
         boolean lastCodepoint = i == count - 1;
         Glyph glyph = font.codepointGlyph(codepoint);
         AffineTransform glyphTransform = cursor.advance(measure, glyph);
         boolean skipSpacing = lastCodepoint && shouldSkipLastSpacing;
         if (!skipSpacing) {
            cursor.advanceSpacing(letterSpacing);
         }

         if (glyphTransform == null) {
            break;
         }

         if (glyph.isRendered()) {
            Shape glyphOutline = glyph.glyphOutline();
            float baselineOffset = computeBaselineOffset(font, fontRenderContext);
            glyphTransform.translate(0.0D, (double)(-baselineOffset));
            Shape renderPath = glyphTransform.createTransformedShape(glyphOutline);
            glyphPath.append(renderPath, false);
         }
      }

      return glyphPath;
   }

   private static float computeBaselineOffset(@NotNull SVGFont font, @NotNull FontRenderContext fontRenderContext) {
      switch(fontRenderContext.dominantBaseline()) {
      case Auto:
      case Alphabetic:
      default:
         return font.romanBaseline();
      case Hanging:
         return font.hangingBaseline();
      case Central:
         return font.centerBaseline();
      case Middle:
         return font.middleBaseline();
      case Mathematical:
         return font.mathematicalBaseline();
      case Ideographic:
      case TextAfterEdge:
      case TextBottom:
         return font.textUnderBaseline();
      case TextBeforeEdge:
      case TextTop:
         return font.textOverBaseline();
      }
   }
}
