package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.geometry.MeasurableShape;
import com.github.weisj.jsvg.geometry.SVGRectangle;
import com.github.weisj.jsvg.geometry.SVGRoundRectangle;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.BasicShape, Category.Graphic, Category.Shape})
@PermittedContent(
   categories = {Category.Animation, Category.Descriptive}
)
public final class Rect extends ShapeNode {
   public static final String TAG = "rect";

   @NotNull
   public String tagName() {
      return "rect";
   }

   @NotNull
   protected MeasurableShape buildShape(@NotNull AttributeNode node) {
      Length x = node.getLength("x", 0.0F);
      Length y = node.getLength("y", 0.0F);
      Length width = node.getLength("width", 0.0F);
      Length height = node.getLength("height", 0.0F);
      Length rx = node.getLength("rx", Length.UNSPECIFIED);
      Length ry = node.getLength("ry", rx);
      if (rx.isUnspecified()) {
         rx = ry;
      }

      rx = rx.coerceNonNegative().orElseIfUnspecified(0.0F);
      ry = ry.coerceNonNegative().orElseIfUnspecified(0.0F);
      return (MeasurableShape)(rx.isZero() && ry.isZero() ? new SVGRectangle(x, y, width, height) : new SVGRoundRectangle(x, y, width, height, rx, ry));
   }
}
