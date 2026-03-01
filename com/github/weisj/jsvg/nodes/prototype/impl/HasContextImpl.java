package com.github.weisj.jsvg.nodes.prototype.impl;

import com.github.weisj.jsvg.attributes.FillRule;
import com.github.weisj.jsvg.attributes.font.AttributeFontSpec;
import com.github.weisj.jsvg.attributes.font.FontParser;
import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
import com.github.weisj.jsvg.nodes.prototype.HasContext;
import com.github.weisj.jsvg.nodes.prototype.Mutator;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.FontRenderContext;
import com.github.weisj.jsvg.renderer.PaintContext;
import org.jetbrains.annotations.NotNull;

public final class HasContextImpl implements HasContext {
   @NotNull
   private final PaintContext paintContext;
   @NotNull
   private final FontRenderContext fontRenderContext;
   @NotNull
   private final AttributeFontSpec fontSpec;
   @NotNull
   private final FillRule fillRule;

   private HasContextImpl(@NotNull PaintContext paintContext, @NotNull FontRenderContext fontRenderContext, @NotNull AttributeFontSpec fontSpec, @NotNull FillRule fillRule) {
      this.paintContext = paintContext;
      this.fontRenderContext = fontRenderContext;
      this.fontSpec = fontSpec;
      this.fillRule = fillRule;
   }

   @NotNull
   public static HasContext parse(@NotNull AttributeNode attributeNode) {
      return new HasContextImpl(PaintContext.parse(attributeNode), FontRenderContext.parse(attributeNode), FontParser.parseFontSpec(attributeNode), FillRule.parse(attributeNode));
   }

   @NotNull
   public FillRule fillRule() {
      return this.fillRule;
   }

   @NotNull
   public Mutator<MeasurableFontSpec> fontSpec() {
      return this.fontSpec;
   }

   @NotNull
   public FontRenderContext fontRenderContext() {
      return this.fontRenderContext;
   }

   @NotNull
   public Mutator<PaintContext> paintContext() {
      return this.paintContext;
   }
}
