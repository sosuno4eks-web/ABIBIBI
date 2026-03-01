package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.PaintOrder;
import com.github.weisj.jsvg.attributes.VectorEffect;
import com.github.weisj.jsvg.attributes.font.FontParser;
import com.github.weisj.jsvg.attributes.font.FontSize;
import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
import com.github.weisj.jsvg.geometry.MeasurableShape;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.prototype.HasFontContext;
import com.github.weisj.jsvg.nodes.prototype.HasPaintContext;
import com.github.weisj.jsvg.nodes.prototype.HasShape;
import com.github.weisj.jsvg.nodes.prototype.HasVectorEffects;
import com.github.weisj.jsvg.nodes.prototype.Instantiator;
import com.github.weisj.jsvg.nodes.prototype.Mutator;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.PaintContext;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.renderer.ShapeRenderer;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

public abstract class ShapeNode extends RenderableSVGNode implements HasShape, HasPaintContext, HasFontContext, HasVectorEffects, Instantiator {
   private PaintOrder paintOrder;
   private PaintContext paintContext;
   private FontSize fontSize;
   private Length fontSizeAdjust;
   private Length pathLength;
   private MeasurableShape shape;
   private Marker markerStart;
   private Marker markerMid;
   private Marker markerEnd;
   private Set<VectorEffect> vectorEffects;

   @NotNull
   public PaintContext paintContext() {
      return this.paintContext;
   }

   @NotNull
   public Mutator<MeasurableFontSpec> fontSpec() {
      return (s) -> {
         return s.withFontSize(this.fontSize, this.fontSizeAdjust);
      };
   }

   @NotNull
   public MeasurableShape shape() {
      return this.shape;
   }

   @NotNull
   public Set<VectorEffect> vectorEffects() {
      return this.vectorEffects;
   }

   public final void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.paintOrder = PaintOrder.parse(attributeNode);
      this.paintContext = PaintContext.parse(attributeNode);
      this.fontSize = FontParser.parseFontSize(attributeNode);
      this.fontSizeAdjust = FontParser.parseSizeAdjust(attributeNode);
      this.shape = this.buildShape(attributeNode);
      this.pathLength = attributeNode.getLength("pathLength", Length.UNSPECIFIED);
      Marker template = (Marker)attributeNode.getElementByHref(Marker.class, attributeNode.getValue("marker"));
      this.markerStart = (Marker)attributeNode.getElementByHref(Marker.class, attributeNode.getValue("marker-start"));
      if (this.markerStart == null) {
         this.markerStart = template;
      }

      this.markerMid = (Marker)attributeNode.getElementByHref(Marker.class, attributeNode.getValue("marker-mid"));
      if (this.markerMid == null) {
         this.markerMid = template;
      }

      this.markerEnd = (Marker)attributeNode.getElementByHref(Marker.class, attributeNode.getValue("marker-end"));
      if (this.markerEnd == null) {
         this.markerEnd = template;
      }

      this.vectorEffects = VectorEffect.parse(attributeNode);
   }

   @NotNull
   protected abstract MeasurableShape buildShape(@NotNull AttributeNode var1);

   @NotNull
   public Shape untransformedElementShape(@NotNull RenderContext context) {
      return this.shape.shape(context);
   }

   @NotNull
   public Rectangle2D untransformedElementBounds(@NotNull RenderContext context) {
      return this.shape.bounds(context, true);
   }

   public boolean isVisible(@NotNull RenderContext context) {
      return super.isVisible(context);
   }

   public boolean canInstantiate(@NotNull SVGNode node) {
      return node instanceof Marker;
   }

   @NotNull
   private Stroke computeEffectiveStroke(@NotNull RenderContext context) {
      MeasureContext measureContext = context.measureContext();
      float pathLengthFactor = 1.0F;
      if (this.pathLength.isSpecified()) {
         double effectiveLength = (double)this.pathLength.resolveLength(measureContext);
         double actualLength = this.shape.pathLength(measureContext);
         pathLengthFactor = (float)(actualLength / effectiveLength);
      }

      return context.stroke(pathLengthFactor);
   }

   public final void render(@NotNull RenderContext context, @NotNull Output output) {
      Shape paintShape = this.shape.shape(context);
      Rectangle2D bounds = this.shape.usesOptimizedBoundsCalculation() ? this.shape.bounds(context, false) : null;
      Stroke effectiveStroke = this.computeEffectiveStroke(context);
      ShapeRenderer.renderWithPaintOrder(output, this.shape.canBeFilled(), this.paintOrder, new ShapeRenderer.ShapePaintContext(context, this.vectorEffects(), effectiveStroke, this.transform()), new ShapeRenderer.PaintShape(paintShape, bounds), new ShapeRenderer.ShapeMarkerInfo(this, this.markerStart, this.markerMid, this.markerEnd, this.shouldPaintStartEndMarkersInMiddle()));
   }

   protected boolean shouldPaintStartEndMarkersInMiddle() {
      return true;
   }
}
