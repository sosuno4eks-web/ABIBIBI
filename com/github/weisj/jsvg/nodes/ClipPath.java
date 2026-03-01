package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.UnitType;
import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.geometry.util.GeometryUtil;
import com.github.weisj.jsvg.nodes.container.ContainerNode;
import com.github.weisj.jsvg.nodes.prototype.ShapedContainer;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.nodes.text.Text;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.MaskedPaint;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.util.BlittableImage;
import com.github.weisj.jsvg.util.ImageUtil;
import com.github.weisj.jsvg.util.ShapeUtil;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Double;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@ElementCategories({})
@PermittedContent(
   categories = {Category.Animation, Category.Descriptive, Category.Shape},
   anyOf = {Use.class, Text.class}
)
public final class ClipPath extends ContainerNode implements ShapedContainer<SVGNode> {
   public static final String TAG = "clippath";
   private boolean isValid;
   private UnitType clipPathUnits;

   @NotNull
   public String tagName() {
      return "clippath";
   }

   public boolean isValid() {
      return this.isValid;
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.isValid = this.checkIsValid();
      this.clipPathUnits = (UnitType)attributeNode.getEnum("clipPathUnits", UnitType.UserSpaceOnUse);
   }

   private boolean checkIsValid() {
      Iterator var1 = this.children().iterator();

      while(var1.hasNext()) {
         SVGNode child = (SVGNode)var1.next();
         if (child instanceof Use) {
            SVGNode referenced = ((Use)child).referencedNode();
            if (referenced != null && !this.isAcceptableType(referenced)) {
               return false;
            }
         }
      }

      return true;
   }

   @NotNull
   public Shape clipShape(@NotNull RenderContext context, @NotNull Rectangle2D elementBounds, boolean useSoftClip) {
      Shape shape = ShapedContainer.super.elementShape(context);
      if (!useSoftClip && this.clipPathUnits == UnitType.ObjectBoundingBox) {
         shape = this.clipPathUnits.viewTransform(elementBounds).createTransformedShape(shape);
      }

      Area areaShape = new Area(shape);
      return (Shape)(areaShape.isRectangular() ? areaShape.getBounds() : areaShape);
   }

   @NotNull
   public Paint createPaintForSoftClipping(@NotNull Output output, @NotNull RenderContext context, @NotNull Rectangle2D objectBounds, @NotNull Shape clipShape) {
      Rectangle2D transformedClipBounds = GeometryUtil.containingBoundsAfterTransform(this.clipPathUnits.viewTransform(objectBounds), clipShape.getBounds());
      BlittableImage blitImage = BlittableImage.create(ImageUtil::createLuminosityBuffer, context, output.clipBounds(), transformedClipBounds, objectBounds, this.clipPathUnits);
      Rectangle2D clipBoundsInUserSpace = blitImage.boundsInUserSpace();
      if (ShapeUtil.isInvalidArea(clipBoundsInUserSpace)) {
         return PaintParser.DEFAULT_COLOR;
      } else {
         blitImage.render(output, (g) -> {
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, blitImage.image().getWidth(), blitImage.image().getHeight());
            g.setColor(Color.WHITE);
            g.fill(clipShape);
         });
         Point2D offset = new Double(clipBoundsInUserSpace.getX(), clipBoundsInUserSpace.getY());
         context.rootTransform().transform(offset, offset);
         return new MaskedPaint(PaintParser.DEFAULT_COLOR, blitImage.image().getRaster(), offset);
      }
   }
}
