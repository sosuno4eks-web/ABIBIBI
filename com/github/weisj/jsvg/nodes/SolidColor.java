package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.paint.SimplePaintSVGPaint;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.util.ColorUtil;
import java.awt.Color;
import java.awt.Paint;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.Gradient})
@PermittedContent(
   categories = {Category.Animation, Category.Descriptive}
)
public final class SolidColor extends AbstractSVGNode implements SimplePaintSVGPaint {
   public static final String TAG = "solidcolor";
   private Color color;

   @NotNull
   public String tagName() {
      return "solidcolor";
   }

   @NotNull
   public Paint paint() {
      return this.color;
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      Color c = attributeNode.getColor("solid-color");
      float opacity = attributeNode.getPercentage("solid-opacity", (float)c.getAlpha() / 255.0F);
      this.color = ColorUtil.withAlpha(c, opacity);
   }
}
