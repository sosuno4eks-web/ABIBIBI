package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.geometry.MeasurableShape;
import com.github.weisj.jsvg.geometry.SVGCircle;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.BasicShape, Category.Graphic, Category.Shape})
@PermittedContent(
   categories = {Category.Animation, Category.Descriptive}
)
public final class Circle extends ShapeNode {
   public static final String TAG = "circle";

   @NotNull
   public String tagName() {
      return "circle";
   }

   @NotNull
   protected MeasurableShape buildShape(@NotNull AttributeNode attributeNode) {
      return new SVGCircle(attributeNode.getLength("cx", 0.0F), attributeNode.getLength("cy", 0.0F), attributeNode.getLength("r", 0.0F));
   }
}
