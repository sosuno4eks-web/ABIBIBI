package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.geometry.MeasurableShape;
import com.github.weisj.jsvg.geometry.SVGEllipse;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.BasicShape, Category.Graphic, Category.Shape})
@PermittedContent(
   categories = {Category.Animation, Category.Descriptive}
)
public final class Ellipse extends ShapeNode {
   public static final String TAG = "ellipse";

   @NotNull
   public String tagName() {
      return "ellipse";
   }

   @NotNull
   protected MeasurableShape buildShape(@NotNull AttributeNode attributeNode) {
      return new SVGEllipse(attributeNode.getLength("cx", 0.0F), attributeNode.getLength("cy", 0.0F), attributeNode.getLength("rx", 0.0F), attributeNode.getLength("ry", 0.0F));
   }
}
