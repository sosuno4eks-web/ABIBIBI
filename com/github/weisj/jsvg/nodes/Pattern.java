package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.Overflow;
import com.github.weisj.jsvg.attributes.PreserveAspectRatio;
import com.github.weisj.jsvg.attributes.UnitType;
import com.github.weisj.jsvg.attributes.ViewBox;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.container.BaseInnerViewContainer;
import com.github.weisj.jsvg.nodes.filter.Filter;
import com.github.weisj.jsvg.nodes.prototype.ShapedContainer;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.nodes.text.Text;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Graphics2DOutput;
import com.github.weisj.jsvg.renderer.GraphicsUtil;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.renderer.TransformedPaint;
import com.github.weisj.jsvg.renderer.awt.PlatformSupport;
import com.github.weisj.jsvg.util.ImageUtil;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.TexturePaint;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Float;
import java.awt.geom.Rectangle2D.Double;
import java.awt.image.BufferedImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ElementCategories({Category.Container})
@PermittedContent(
   categories = {Category.Animation, Category.Descriptive, Category.Shape, Category.Structural, Category.Gradient},
   anyOf = {Anchor.class, ClipPath.class, Filter.class, Image.class, Mask.class, Marker.class, Pattern.class, Style.class, Text.class, View.class}
)
public final class Pattern extends BaseInnerViewContainer implements SVGPaint, ShapedContainer<SVGNode> {
   public static final String TAG = "pattern";
   private Length x;
   private Length y;
   private Length width;
   private Length height;
   private UnitType patternUnits;
   private UnitType patternContentUnits;
   private AffineTransform patternTransform;

   @NotNull
   public String tagName() {
      return "pattern";
   }

   @NotNull
   protected Point2D outerLocation(@NotNull MeasureContext context) {
      return new Float(0.0F, 0.0F);
   }

   @Nullable
   protected Point2D anchorLocation(@NotNull MeasureContext context) {
      return null;
   }

   @NotNull
   protected Overflow defaultOverflow() {
      return Overflow.Hidden;
   }

   @NotNull
   public FloatSize size(@NotNull RenderContext context) {
      return new FloatSize(this.width.resolveWidth(context.measureContext()), this.height.resolveHeight(context.measureContext()));
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      Pattern template = this.parseTemplate(attributeNode);
      if (this.viewBox == null && template != null) {
         this.viewBox = template.viewBox;
      }

      this.preserveAspectRatio = template != null ? template.preserveAspectRatio : this.preserveAspectRatio;
      this.x = attributeNode.getLength("x", template != null ? template.x : Length.ZERO);
      this.y = attributeNode.getLength("y", template != null ? template.y : Length.ZERO);
      this.width = attributeNode.getLength("width", template != null ? template.width : Length.ZERO).coerceNonNegative();
      this.height = attributeNode.getLength("height", template != null ? template.height : Length.ZERO).coerceNonNegative();
      this.patternTransform = attributeNode.parseTransform("patternTransform");
      if (this.patternTransform == null && template != null) {
         this.patternTransform = template.patternTransform;
      }

      this.patternUnits = (UnitType)attributeNode.getEnum("patternUnits", template != null ? template.patternUnits : UnitType.ObjectBoundingBox);
      this.patternContentUnits = (UnitType)attributeNode.getEnum("patternContentUnits", template != null ? template.patternContentUnits : UnitType.UserSpaceOnUse);
   }

   @Nullable
   private Pattern parseTemplate(@NotNull AttributeNode attributeNode) {
      Pattern template = (Pattern)attributeNode.getElementByHref(Pattern.class, attributeNode.getHref());
      return template != this ? template : null;
   }

   public boolean isVisible() {
      return !this.width.isZero() && !this.height.isZero() && SVGPaint.super.isVisible();
   }

   public boolean requiresInstantiation() {
      return true;
   }

   public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
      Rectangle2D b = bounds != null ? bounds : shape.getBounds2D();
      output.setPaint(() -> {
         return this.paintForBounds(output, context, b);
      });
      output.fillShape(shape);
   }

   public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
      Rectangle2D b = bounds != null ? bounds : shape.getBounds2D();
      output.setPaint(() -> {
         return this.paintForBounds(output, context, b);
      });
      output.drawShape(shape);
   }

   @NotNull
   private Paint paintForBounds(@NotNull Output output, @NotNull RenderContext context, @NotNull Rectangle2D bounds) {
      MeasureContext measure = context.measureContext();
      Double patternBounds = this.patternUnits.computeViewBounds(measure, bounds, this.x, this.y, this.width, this.height);
      BufferedImage img = ImageUtil.createCompatibleTransparentImage(output, patternBounds.width, patternBounds.height);
      Graphics2D imgGraphics = GraphicsUtil.createGraphics(img);
      imgGraphics.setRenderingHints(output.renderingHints());
      imgGraphics.scale((double)img.getWidth() / patternBounds.width, (double)img.getHeight() / patternBounds.height);
      RenderContext patternContext = RenderContext.createInitial((PlatformSupport)null, this.patternContentUnits.deriveMeasure(measure));
      patternContext.setRootTransform(imgGraphics.getTransform());
      ViewBox view = this.viewBox;
      PreserveAspectRatio aspectRation = this.preserveAspectRatio;
      FloatSize size;
      if (view == null && this.patternContentUnits == UnitType.ObjectBoundingBox) {
         size = new FloatSize((float)img.getWidth(), (float)img.getHeight());
         view = new ViewBox(0.0F, 0.0F, 1.0F, 1.0F);
         aspectRation = PreserveAspectRatio.none();
      } else {
         size = new FloatSize((float)patternBounds.getWidth(), (float)patternBounds.getHeight());
      }

      this.renderWithSize(size, view, aspectRation, patternContext, new Graphics2DOutput(imgGraphics));
      imgGraphics.dispose();
      return (Paint)(this.patternTransform != null ? new TransformedPaint(new TexturePaint(img, patternBounds), this.patternTransform) : new TexturePaint(img, patternBounds));
   }
}
