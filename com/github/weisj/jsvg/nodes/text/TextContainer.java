package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.attributes.PaintOrder;
import com.github.weisj.jsvg.attributes.VectorEffect;
import com.github.weisj.jsvg.attributes.font.AttributeFontSpec;
import com.github.weisj.jsvg.attributes.font.FontParser;
import com.github.weisj.jsvg.attributes.font.SVGFont;
import com.github.weisj.jsvg.attributes.text.LengthAdjust;
import com.github.weisj.jsvg.attributes.text.TextAnchor;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.container.BaseContainerNode;
import com.github.weisj.jsvg.nodes.prototype.HasContext;
import com.github.weisj.jsvg.nodes.prototype.HasShape;
import com.github.weisj.jsvg.nodes.prototype.HasVectorEffects;
import com.github.weisj.jsvg.nodes.prototype.Renderable;
import com.github.weisj.jsvg.nodes.prototype.impl.HasContextImpl;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.NodeRenderer;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class TextContainer extends BaseContainerNode<TextSegment> implements TextSegment.RenderableSegment, HasShape, HasContext.ByDelegate, HasVectorEffects, Renderable {
   private final List<TextSegment> segments = new ArrayList();
   private PaintOrder paintOrder;
   protected AttributeFontSpec fontSpec;
   protected LengthAdjust lengthAdjust;
   protected Length textLength;
   private boolean isVisible;
   private HasContext context;
   private Set<VectorEffect> vectorEffects;

   @MustBeInvokedByOverriders
   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.paintOrder = PaintOrder.parse(attributeNode);
      this.fontSpec = FontParser.parseFontSpec(attributeNode);
      this.lengthAdjust = (LengthAdjust)attributeNode.getEnum("lengthAdjust", LengthAdjust.Spacing);
      this.textLength = attributeNode.getLength("textLength", Length.UNSPECIFIED);
      if (this.textLength.raw() < 0.0F) {
         this.textLength = Length.UNSPECIFIED;
      }

      this.isVisible = this.parseIsVisible(attributeNode);
      this.context = HasContextImpl.parse(attributeNode);
      this.vectorEffects = VectorEffect.parse(attributeNode);
   }

   @NotNull
   public Set<VectorEffect> vectorEffects() {
      return this.vectorEffects;
   }

   @NotNull
   public HasContext contextDelegate() {
      return this.context;
   }

   protected boolean acceptChild(@Nullable String id, @NotNull SVGNode node) {
      return node instanceof TextSegment;
   }

   protected void doAdd(@NotNull SVGNode node) {
      this.segments.add((TextSegment)node);
   }

   public final void addContent(char[] content) {
      if (content.length != 0) {
         this.segments.add(new StringTextSegment(this, this.segments.size(), content));
      }
   }

   public List<? extends TextSegment> children() {
      return this.segments;
   }

   protected abstract GlyphCursor createLocalCursor(@NotNull RenderContext var1, @NotNull GlyphCursor var2);

   protected abstract void cleanUpLocalCursor(@NotNull GlyphCursor var1, @NotNull GlyphCursor var2);

   protected final void renderSegment(@NotNull GlyphCursor cursor, @NotNull RenderContext context, @NotNull Output output) {
      this.prepareSegmentForRendering(cursor, context);
      double offset = this.textAnchorOffset(context.fontRenderContext().textAnchor(), cursor);
      context.translate(output, -offset, 0.0D);
      this.renderSegmentWithoutLayout(cursor, context, output);
   }

   private double textAnchorOffset(@NotNull TextAnchor textAnchor, @NotNull GlyphCursor glyphCursor) {
      switch(textAnchor) {
      case Start:
      default:
         return 0.0D;
      case Middle:
         return glyphCursor.completeGlyphRunBounds.getWidth() / 2.0D;
      case End:
         return glyphCursor.completeGlyphRunBounds.getWidth();
      }
   }

   private void forEachSegment(@NotNull RenderContext context, @NotNull BiConsumer<StringTextSegment, RenderContext> onStringTextSegment, @NotNull BiConsumer<TextSegment.RenderableSegment, RenderContext> onRenderableSegment) {
      Iterator var4 = this.children().iterator();

      while(var4.hasNext()) {
         TextSegment segment = (TextSegment)var4.next();
         RenderContext currentContext = context;
         if (segment instanceof Renderable) {
            currentContext = NodeRenderer.setupRenderContext(segment, context);
         }

         if (segment instanceof StringTextSegment) {
            onStringTextSegment.accept((StringTextSegment)segment, currentContext);
         } else {
            if (!(segment instanceof TextSegment.RenderableSegment)) {
               throw new IllegalStateException("Unexpected segment " + segment);
            }

            onRenderableSegment.accept((TextSegment.RenderableSegment)segment, currentContext);
         }
      }

   }

   @NotNull
   public TextMetrics computeTextMetrics(@NotNull RenderContext context, @NotNull TextSegment.RenderableSegment.UseTextLengthForCalculation flag) {
      if (flag == TextSegment.RenderableSegment.UseTextLengthForCalculation.YES && this.hasFixedLength()) {
         return new TextMetrics(0.0D, 0.0D, 0, (double)this.textLength.resolveLength(context.measureContext()), 0);
      } else {
         SVGFont font = context.font();
         float letterSpacing = context.fontRenderContext().letterSpacing().resolveLength(context.measureContext());
         TextContainer.IntermediateTextMetrics metrics = new TextContainer.IntermediateTextMetrics();
         int index = 0;

         for(Iterator var7 = this.children().iterator(); var7.hasNext(); ++index) {
            TextSegment segment = (TextSegment)var7.next();
            RenderContext currentContext = context;
            if (segment instanceof Renderable) {
               currentContext = NodeRenderer.setupRenderContext(segment, context);
            }

            if (segment instanceof StringTextSegment) {
               StringTextSegment stringTextSegment = (StringTextSegment)segment;
               this.accumulateSegmentMetrics(metrics, stringTextSegment, font, letterSpacing, index);
            } else {
               if (!(segment instanceof TextSegment.RenderableSegment)) {
                  throw new IllegalStateException("Unexpected segment " + segment);
               }

               this.accumulateRenderableSegmentMetrics((TextSegment.RenderableSegment)segment, metrics, currentContext);
            }
         }

         return new TextMetrics(metrics.letterSpacingLength, metrics.glyphLength, metrics.glyphCount, metrics.fixedGlyphLength, metrics.controllableLetterSpacingCount);
      }
   }

   private void accumulateRenderableSegmentMetrics(@NotNull TextSegment.RenderableSegment segment, @NotNull TextContainer.IntermediateTextMetrics metrics, @NotNull RenderContext currentContext) {
      TextMetrics textMetrics = segment.computeTextMetrics(currentContext, TextSegment.RenderableSegment.UseTextLengthForCalculation.YES);
      metrics.letterSpacingLength += textMetrics.letterSpacingLength();
      metrics.glyphLength += textMetrics.glyphLength();
      metrics.glyphCount += textMetrics.glyphCount();
      metrics.fixedGlyphLength += textMetrics.fixedGlyphLength();
      metrics.controllableLetterSpacingCount += textMetrics.controllableLetterSpacingCount();
   }

   private void accumulateSegmentMetrics(@NotNull TextContainer.IntermediateTextMetrics metrics, @NotNull StringTextSegment segment, @NotNull SVGFont font, float letterSpacing, int index) {
      int glyphCount = segment.codepoints().length;
      boolean lastSegment = index == this.children().size() - 1;
      int whiteSpaceCount = lastSegment ? glyphCount - 1 : glyphCount;
      metrics.glyphCount += glyphCount;
      metrics.letterSpacingLength += (double)((float)whiteSpaceCount * letterSpacing);
      metrics.controllableLetterSpacingCount += whiteSpaceCount;
      char[] var9 = segment.codepoints();
      int var10 = var9.length;

      for(int var11 = 0; var11 < var10; ++var11) {
         char codepoint = var9[var11];
         metrics.glyphLength += (double)font.codepointGlyph(codepoint).advance();
      }

   }

   public boolean hasFixedLength() {
      return this.textLength.isSpecified();
   }

   public void renderSegmentWithoutLayout(@NotNull GlyphCursor cursor, @NotNull RenderContext context, @NotNull Output output) {
      this.forEachSegment(context, (segment, ctx) -> {
         if (this.isVisible(ctx)) {
            GlyphRenderer.renderGlyphRun(output, this.paintOrder, this.vectorEffects(), segment, cursor.completeGlyphRunBounds);
         }

      }, (segment, ctx) -> {
         segment.renderSegmentWithoutLayout(cursor, ctx, output);
      });
   }

   public void prepareSegmentForRendering(@NotNull GlyphCursor cursor, @NotNull RenderContext context) {
      SVGFont font = context.font();
      GlyphCursor localCursor = this.createLocalCursor(context, cursor);
      localCursor.setAdvancement(this.localGlyphAdvancement(context, cursor));
      this.forEachSegment(context, (segment, ctx) -> {
         GlyphRenderer.prepareGlyphRun(segment, localCursor, font, ctx);
      }, (segment, ctx) -> {
         segment.prepareSegmentForRendering(localCursor, ctx);
      });
      this.cleanUpLocalCursor(cursor, localCursor);
   }

   public void appendTextShape(@NotNull GlyphCursor cursor, @NotNull Path2D textShape, @NotNull RenderContext context) {
      SVGFont font = context.font();
      GlyphCursor localCursor = this.createLocalCursor(context, cursor);
      localCursor.setAdvancement(this.localGlyphAdvancement(context, cursor));
      this.forEachSegment(context, (segment, ctx) -> {
         textShape.append(GlyphRenderer.layoutGlyphRun(segment, localCursor, font, ctx.measureContext(), ctx.fontRenderContext()), false);
      }, (segment, ctx) -> {
         segment.appendTextShape(localCursor, textShape, ctx);
      });
      this.cleanUpLocalCursor(cursor, localCursor);
   }

   @NotNull
   private GlyphAdvancement localGlyphAdvancement(@NotNull RenderContext context, @NotNull GlyphCursor cursor) {
      return this.hasFixedLength() ? new GlyphAdvancement(this.computeTextMetrics(context, TextSegment.RenderableSegment.UseTextLengthForCalculation.NO), this.textLength.resolveWidth(context.measureContext()), this.lengthAdjust) : cursor.advancement();
   }

   @NotNull
   public Rectangle2D untransformedElementBounds(@NotNull RenderContext context) {
      return this.untransformedElementShape(context).getBounds2D();
   }

   public boolean isVisible(@NotNull RenderContext context) {
      return this.isVisible;
   }

   private static final class IntermediateTextMetrics {
      double letterSpacingLength;
      double glyphLength;
      double fixedGlyphLength;
      int glyphCount;
      int controllableLetterSpacingCount;

      private IntermediateTextMetrics() {
         this.letterSpacingLength = 0.0D;
         this.glyphLength = 0.0D;
         this.fixedGlyphLength = 0.0D;
         this.glyphCount = 0;
         this.controllableLetterSpacingCount = 0;
      }

      // $FF: synthetic method
      IntermediateTextMetrics(Object x0) {
         this();
      }
   }
}
