package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.UnitType;
import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.nodes.container.CommonRenderableContainerNode;
import com.github.weisj.jsvg.nodes.filter.Filter;
import com.github.weisj.jsvg.nodes.prototype.Instantiator;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.nodes.text.Text;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Graphics2DOutput;
import com.github.weisj.jsvg.renderer.MaskedPaint;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.util.BlittableImage;
import com.github.weisj.jsvg.util.ImageUtil;
import com.github.weisj.jsvg.util.ShapeUtil;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.Container})
@PermittedContent(
   categories = {Category.Animation, Category.Descriptive, Category.Shape, Category.Structural, Category.Gradient},
   anyOf = {Anchor.class, ClipPath.class, Filter.class, Image.class, Marker.class, Mask.class, Pattern.class, Style.class, Text.class, View.class}
)
public final class Mask extends CommonRenderableContainerNode implements Instantiator {
   private static final boolean DEBUG = false;
   public static final String TAG = "mask";
   private Length x;
   private Length y;
   private Length width;
   private Length height;
   private UnitType maskContentUnits;
   private UnitType maskUnits;

   @NotNull
   public String tagName() {
      return "mask";
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.x = attributeNode.getLength("x", Unit.PERCENTAGE.valueOf(-10.0F));
      this.y = attributeNode.getLength("y", Unit.PERCENTAGE.valueOf(-10.0F));
      this.width = attributeNode.getLength("width", Unit.PERCENTAGE.valueOf(120.0F));
      this.height = attributeNode.getLength("height", Unit.PERCENTAGE.valueOf(120.0F));
      this.maskContentUnits = (UnitType)attributeNode.getEnum("maskContentUnits", UnitType.UserSpaceOnUse);
      this.maskUnits = (UnitType)attributeNode.getEnum("maskUnits", UnitType.ObjectBoundingBox);
   }

   @NotNull
   public Paint createMaskPaint(@NotNull Output output, @NotNull RenderContext context, @NotNull Rectangle2D objectBounds) {
      Double maskBounds = this.maskUnits.computeViewBounds(context.measureContext(), objectBounds, this.x, this.y, this.width, this.height);
      BlittableImage blitImage = BlittableImage.create(ImageUtil::createLuminosityBuffer, context, output.clipBounds(), maskBounds.createIntersection(objectBounds), objectBounds, this.maskContentUnits);
      Rectangle2D maskBoundsInUserSpace = blitImage.boundsInUserSpace();
      if (ShapeUtil.isInvalidArea(maskBoundsInUserSpace)) {
         return PaintParser.DEFAULT_COLOR;
      } else {
         blitImage.renderNode(output, this, this);
         Point2D offset = new java.awt.geom.Point2D.Double(maskBoundsInUserSpace.getX(), maskBoundsInUserSpace.getY());
         context.rootTransform().transform(offset, offset);
         return new MaskedPaint(PaintParser.DEFAULT_COLOR, blitImage.image().getRaster(), offset);
      }
   }

   public boolean requiresInstantiation() {
      return true;
   }

   public boolean canInstantiate(@NotNull SVGNode node) {
      return node == this;
   }

   // $FF: synthetic method
   private static void lambda$createMaskPaint$0(BlittableImage blitImage, RenderContext context, Graphics2D g) {
      g.setComposite(AlphaComposite.SrcOver.derive(0.5F));
      blitImage.blitTo(new Graphics2DOutput(g), context);
   }
}
