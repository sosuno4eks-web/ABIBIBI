package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.attributes.text.LengthAdjust;
import com.google.errorprone.annotations.Immutable;
import java.awt.geom.AffineTransform;
import org.jetbrains.annotations.NotNull;

@Immutable
final class GlyphAdvancement {
   private final float spacingAdjustment;
   private final float absoluteSpacingAdjustment;
   private final float glyphAdjustment;
   private final boolean needsLastSpacing;

   private GlyphAdvancement() {
      this.spacingAdjustment = 1.0F;
      this.absoluteSpacingAdjustment = 0.0F;
      this.glyphAdjustment = 1.0F;
      this.needsLastSpacing = false;
   }

   GlyphAdvancement(@NotNull TextMetrics textMetrics, float desiredLength, @NotNull LengthAdjust lengthAdjust) {
      double totalSpace = (double)desiredLength - textMetrics.fixedGlyphLength();
      switch(lengthAdjust) {
      case Spacing:
      default:
         this.spacingAdjustment = 1.0F;
         this.glyphAdjustment = 1.0F;
         if (textMetrics.glyphCount() == 0) {
            this.absoluteSpacingAdjustment = 0.0F;
            this.needsLastSpacing = false;
         } else {
            float adjustableSpace = (float)(totalSpace - textMetrics.glyphLength());
            int spacingCount = textMetrics.controllableLetterSpacingCount();
            if (spacingCount == 0) {
               this.absoluteSpacingAdjustment = adjustableSpace;
               this.needsLastSpacing = true;
            } else {
               this.absoluteSpacingAdjustment = adjustableSpace / (float)spacingCount;
               this.needsLastSpacing = false;
            }
         }
         break;
      case SpacingAndGlyphs:
         this.absoluteSpacingAdjustment = 0.0F;
         this.needsLastSpacing = false;
         this.spacingAdjustment = (float)(totalSpace / textMetrics.totalAdjustableLength());
         this.glyphAdjustment = this.spacingAdjustment;
      }

   }

   static GlyphAdvancement defaultAdvancement() {
      return new GlyphAdvancement();
   }

   public float maxLookBehind() {
      return -Math.min(0.0F, this.absoluteSpacingAdjustment);
   }

   float spacingAdvancement(float letterSpacing) {
      return letterSpacing * this.spacingAdjustment + this.absoluteSpacingAdjustment;
   }

   float glyphAdvancement(@NotNull Glyph glyph) {
      return glyph.advance() * this.glyphAdjustment;
   }

   boolean shouldSkipLastSpacing() {
      if (this.needsLastSpacing) {
         return false;
      } else {
         return this.absoluteSpacingAdjustment != 0.0F || this.spacingAdjustment != 1.0F || this.glyphAdjustment != 1.0F;
      }
   }

   @NotNull
   AffineTransform glyphTransform(@NotNull AffineTransform transform) {
      if (this.glyphAdjustment == 1.0F) {
         return transform;
      } else {
         AffineTransform glyphTransform = new AffineTransform(transform);
         glyphTransform.scale((double)this.glyphAdjustment, 1.0D);
         return glyphTransform;
      }
   }

   public String toString() {
      return "GlyphAdvancement{spacingAdjustment=" + this.spacingAdjustment + ", absoluteSpacingAdjustment=" + this.absoluteSpacingAdjustment + ", glyphAdjustment=" + this.glyphAdjustment + ", needsLastSpacing=" + this.needsLastSpacing + '}';
   }
}
