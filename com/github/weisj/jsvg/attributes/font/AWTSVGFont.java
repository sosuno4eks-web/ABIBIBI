package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.nodes.text.Glyph;
import java.awt.Font;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphMetrics;
import java.awt.font.GlyphVector;
import java.awt.font.LineMetrics;
import java.awt.geom.AffineTransform;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AWTSVGFont implements SVGFont {
   @NotNull
   private final Font font;
   private final FontRenderContext frc = new FontRenderContext((AffineTransform)null, true, true);
   private final HashMap<Character, Glyph> glyphCache;
   @Nullable
   private LineMetrics lineMetrics;
   private float[] baselineOffsets;
   private float exHeight = Float.NaN;
   private float mathBaseline = Float.NaN;

   public AWTSVGFont(@NotNull Font font) {
      this.font = font;
      this.glyphCache = new HashMap();
   }

   @NotNull
   public Glyph codepointGlyph(char codepoint) {
      Glyph glyph = (Glyph)this.glyphCache.get(codepoint);
      if (glyph != null) {
         return glyph;
      } else {
         glyph = this.createGlyph(codepoint);
         this.glyphCache.put(codepoint, glyph);
         return glyph;
      }
   }

   @NotNull
   public String family() {
      return this.font.getFamily();
   }

   public int size() {
      return this.font.getSize();
   }

   @NotNull
   private LineMetrics lineMetrics() {
      if (this.lineMetrics == null) {
         this.lineMetrics = this.font.getLineMetrics("Ax-", 0, 1, this.frc);
      }

      return this.lineMetrics;
   }

   public float effectiveExHeight() {
      if (Length.isUnspecified(this.exHeight)) {
         this.exHeight = (float)this.codepointGlyph('x').glyphOutline().getBounds2D().getHeight();
      }

      return this.exHeight;
   }

   public float effectiveEmHeight() {
      return this.font.getSize2D();
   }

   public float mathematicalBaseline() {
      if (Length.isUnspecified(this.mathBaseline)) {
         this.mathBaseline = -this.effectiveExHeight() / 2.0F;
      }

      return this.mathBaseline;
   }

   private float[] baselineOffsets() {
      if (this.baselineOffsets == null) {
         this.baselineOffsets = this.lineMetrics().getBaselineOffsets();
      }

      return this.baselineOffsets;
   }

   public float hangingBaseline() {
      return this.baselineOffsets()[2];
   }

   public float romanBaseline() {
      return this.baselineOffsets()[0];
   }

   public float centerBaseline() {
      return this.baselineOffsets()[1];
   }

   public float middleBaseline() {
      return (this.romanBaseline() - this.effectiveExHeight()) / 2.0F;
   }

   public float textUnderBaseline() {
      return this.lineMetrics().getUnderlineOffset();
   }

   public float textOverBaseline() {
      return this.textUnderBaseline() - this.effectiveEmHeight();
   }

   @NotNull
   private Glyph createGlyph(char codepoint) {
      char[] buffer = new char[]{codepoint};
      GlyphVector glyphVector = this.font.createGlyphVector(this.frc, buffer);
      GlyphMetrics gm = glyphVector.getGlyphMetrics(0);
      float advance = gm.getAdvanceX();
      Shape shape = glyphVector.getGlyphOutline(0);
      return new Glyph(shape, advance, gm.getBounds2D().isEmpty());
   }
}
