package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.SpreadMethod;
import com.github.weisj.jsvg.attributes.UnitType;
import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.container.ContainerNode;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class AbstractGradient<Self extends AbstractGradient<Self>> extends ContainerNode implements SVGPaint {
   protected AffineTransform gradientTransform;
   protected UnitType gradientUnits;
   protected SpreadMethod spreadMethod;
   @NotNull
   private Color[] colors;
   private float[] offsets;

   public final float[] offsets() {
      return this.offsets;
   }

   @NotNull
   public final Color[] colors() {
      return this.colors;
   }

   public final void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      AbstractGradient<?> template = this.parseTemplate(attributeNode);
      this.gradientUnits = (UnitType)attributeNode.getEnum("gradientUnits", template != null ? template.gradientUnits : UnitType.ObjectBoundingBox);
      this.spreadMethod = (SpreadMethod)attributeNode.getEnum("spreadMethod", template != null ? template.spreadMethod : SpreadMethod.Pad);
      this.gradientTransform = attributeNode.parseTransform("gradientTransform");
      if (this.gradientTransform == null && template != null) {
         this.gradientTransform = template.gradientTransform;
      }

      List<Stop> stops = this.childrenOfType(Stop.class);
      if (stops.isEmpty() && template != null) {
         this.colors = template.colors();
         this.offsets = template.offsets();
      } else {
         this.parseStops(stops);
      }

      Self selfTemplate = this.getClass().isInstance(template) ? template : null;
      this.buildGradient(attributeNode, selfTemplate);
      this.children().clear();
   }

   private void parseStops(@NotNull List<Stop> stops) {
      stops.sort((s1, s2) -> {
         return Float.compare(s1.offset(), s2.offset());
      });
      this.colors = new Color[stops.size()];
      this.offsets = new float[stops.size()];
      boolean realGradient = false;

      int offsetLength;
      for(offsetLength = 0; offsetLength < this.offsets.length; ++offsetLength) {
         Stop stop = (Stop)stops.get(offsetLength);
         float stopOffset = Math.max(0.0F, Math.min(1.0F, stop.offset()));
         Color stopColor = stop.color();
         if (offsetLength > 0) {
            realGradient = realGradient || stopOffset > ((Stop)stops.get(offsetLength - 1)).offset() || !stopColor.equals(this.colors[offsetLength - 1]);
            if (stopOffset <= this.offsets[offsetLength - 1]) {
               stopOffset = Math.nextAfter(this.offsets[offsetLength - 1], Double.MAX_VALUE);
            }
         }

         this.offsets[offsetLength] = stopOffset;
         this.colors[offsetLength] = stopColor;
      }

      int off;
      if (this.offsets[this.offsets.length - 1] > 1.0F) {
         float diff = this.offsets[this.offsets.length - 1] - 1.0F;
         this.offsets[this.offsets.length - 1] = 1.0F;

         float[] var10000;
         for(off = this.offsets.length - 2; off >= 0 && this.offsets[off] >= this.offsets[off + 1]; var10000[off] -= diff) {
            var10000 = this.offsets;
         }
      }

      if (!realGradient && this.colors.length > 0) {
         this.colors = new Color[]{this.colors[0]};
         this.offsets = new float[]{0.0F};
      } else {
         offsetLength = this.offsets.length;
         off = 0;
         boolean fixFirst = false;
         boolean fixLast = false;
         if (this.offsets[0] != 0.0F) {
            fixFirst = true;
            ++offsetLength;
            ++off;
         }

         if (this.offsets[this.offsets.length - 1] != 1.0F) {
            fixLast = true;
            ++offsetLength;
         }

         float[] oldOffsets = this.offsets;
         Color[] oldColors = this.colors;
         this.offsets = new float[offsetLength];
         this.colors = new Color[offsetLength];
         System.arraycopy(oldOffsets, 0, this.offsets, off, oldOffsets.length);
         System.arraycopy(oldColors, 0, this.colors, off, oldColors.length);
         if (fixFirst) {
            this.offsets[0] = 0.0F;
            this.colors[0] = oldColors[0];
         }

         if (fixLast) {
            this.offsets[offsetLength - 1] = 1.0F;
            this.colors[offsetLength - 1] = oldColors[oldColors.length - 1];
         }
      }

   }

   @Nullable
   private AbstractGradient<?> parseTemplate(@NotNull AttributeNode attributeNode) {
      AbstractGradient<?> template = (AbstractGradient)attributeNode.getElementByHref(AbstractGradient.class, attributeNode.getHref());
      return template != this ? template : null;
   }

   protected abstract void buildGradient(@NotNull AttributeNode var1, @Nullable Self var2);

   public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
      Rectangle2D b = bounds != null ? bounds : shape.getBounds2D();
      output.setPaint(() -> {
         return this.paintForBounds(context.measureContext(), b);
      });
      output.fillShape(shape);
   }

   public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
      Rectangle2D b = bounds != null ? bounds : shape.getBounds2D();
      output.setPaint(() -> {
         return this.paintForBounds(context.measureContext(), b);
      });
      output.drawShape(shape);
   }

   @NotNull
   private Paint paintForBounds(@NotNull MeasureContext context, @NotNull Rectangle2D bounds) {
      Color[] gradColors = this.colors();
      if (gradColors.length == 0) {
         return PaintParser.DEFAULT_COLOR;
      } else {
         return (Paint)(gradColors.length == 1 ? gradColors[0] : this.gradientForBounds(this.gradientUnits.deriveMeasure(context), bounds, this.offsets(), gradColors));
      }
   }

   @NotNull
   protected abstract Paint gradientForBounds(@NotNull MeasureContext var1, @NotNull Rectangle2D var2, float[] var3, @NotNull Color[] var4);

   @NotNull
   protected final AffineTransform computeViewTransform(@NotNull Rectangle2D bounds) {
      AffineTransform viewTransform = this.gradientUnits.viewTransform(bounds);
      if (this.gradientTransform != null) {
         viewTransform.concatenate(this.gradientTransform);
      }

      return viewTransform;
   }
}
