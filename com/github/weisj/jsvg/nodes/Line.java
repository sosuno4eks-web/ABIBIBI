package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.geometry.MeasurableShape;
import com.github.weisj.jsvg.geometry.SVGLine;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.BasicShape, Category.Graphic, Category.Shape})
@PermittedContent(
   categories = {Category.Animation, Category.Descriptive}
)
public final class Line extends ShapeNode {
   public static final String TAG = "line";

   @NotNull
   public String tagName() {
      return "line";
   }

   @NotNull
   protected MeasurableShape buildShape(@NotNull AttributeNode attributeNode) {
      return new SVGLine(attributeNode.getLength("x1", 0.0F), attributeNode.getLength("y1", 0.0F), attributeNode.getLength("x2", 0.0F), attributeNode.getLength("y2", 0.0F));
   }
}
