package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.FillRule;
import com.github.weisj.jsvg.geometry.AWTSVGShape;
import com.github.weisj.jsvg.geometry.FillRuleAwareAWTSVGShape;
import com.github.weisj.jsvg.geometry.MeasurableShape;
import com.github.weisj.jsvg.nodes.prototype.HasFillRule;
import com.github.weisj.jsvg.parser.AttributeNode;
import java.awt.Rectangle;
import java.awt.geom.Path2D;
import java.awt.geom.Path2D.Float;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractPolyShape extends ShapeNode implements HasFillRule {
   private FillRule fillRule;

   @NotNull
   public FillRule fillRule() {
      return this.fillRule;
   }

   @NotNull
   protected final MeasurableShape buildShape(@NotNull AttributeNode attributeNode) {
      this.fillRule = FillRule.parse(attributeNode);
      float[] points = attributeNode.getFloatList("points");
      if (points.length <= 0) {
         return new AWTSVGShape(new Rectangle());
      } else {
         Path2D path = new Float(0, points.length / 2);
         path.moveTo((double)points[0], (double)points[1]);

         for(int i = 2; i < points.length; i += 2) {
            path.lineTo((double)points[i], (double)points[i + 1]);
         }

         if (this.doClose()) {
            path.closePath();
         }

         return new FillRuleAwareAWTSVGShape(path);
      }
   }

   protected abstract boolean doClose();
}
