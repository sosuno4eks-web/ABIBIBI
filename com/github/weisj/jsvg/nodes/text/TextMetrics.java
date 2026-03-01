package com.github.weisj.jsvg.nodes.text;

public final class TextMetrics {
   private final double letterSpacingLength;
   private final double glyphLength;
   private final double fixedGlyphLength;
   private final int glyphCount;
   private final int controllableLetterSpacingCount;

   public TextMetrics(double letterSpacingLength, double visibleCodepointLength, int glyphCount, double fixedGlyphLength, int controllableLetterSpacingCount) {
      this.letterSpacingLength = letterSpacingLength;
      this.glyphLength = visibleCodepointLength;
      this.glyphCount = glyphCount;
      this.fixedGlyphLength = fixedGlyphLength;
      this.controllableLetterSpacingCount = controllableLetterSpacingCount;
   }

   public double letterSpacingLength() {
      return this.letterSpacingLength;
   }

   public double glyphLength() {
      return this.glyphLength;
   }

   public double fixedGlyphLength() {
      return this.fixedGlyphLength;
   }

   public double totalAdjustableLength() {
      return this.glyphLength() + this.letterSpacingLength();
   }

   public int glyphCount() {
      return this.glyphCount;
   }

   public int controllableLetterSpacingCount() {
      return this.controllableLetterSpacingCount;
   }

   public String toString() {
      return "TextMetrics{whiteSpaceLength=" + this.letterSpacingLength + ", glyphLength=" + this.glyphLength + ", glyphCount=" + this.glyphCount + ", fixedGlyphLength=" + this.fixedGlyphLength + '}';
   }
}
