package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.jdk.SVGRadialGradientPaint;
import java.awt.Color;
import java.awt.Paint;
import java.awt.MultipleGradientPaint.ColorSpaceType;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Float;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ElementCategories({Category.Gradient})
@PermittedContent(
   categories = {Category.Descriptive},
   anyOf = {Stop.class, Animate.class, AnimateTransform.class, Set.class}
)
public final class RadialGradient extends AbstractGradient<RadialGradient> {
   public static final String TAG = "radialgradient";
   private Length cx;
   private Length cy;
   private Length r;
   private Length fr;
   private Length fx;
   private Length fy;

   @NotNull
   public String tagName() {
      return "radialgradient";
   }

   protected void buildGradient(@NotNull AttributeNode attributeNode, @Nullable RadialGradient template) {
      this.cx = attributeNode.getLength("cx", template != null ? template.cx : Unit.PERCENTAGE.valueOf(50.0F));
      this.cy = attributeNode.getLength("cy", template != null ? template.cy : Unit.PERCENTAGE.valueOf(50.0F));
      this.r = attributeNode.getLength("r", template != null ? template.r : Unit.PERCENTAGE.valueOf(50.0F));
      this.fr = attributeNode.getLength("fr", template != null ? template.fr : Unit.PERCENTAGE.valueOf(0.0F));
      this.fx = attributeNode.getLength("fx", template != null ? template.fx : this.cx);
      this.fy = attributeNode.getLength("fy", template != null ? template.fy : this.cy);
   }

   @NotNull
   protected Paint gradientForBounds(@NotNull MeasureContext measure, @NotNull Rectangle2D bounds, float[] gradOffsets, @NotNull Color[] gradColors) {
      Float center = new Float(this.cx.resolveWidth(measure), this.cy.resolveHeight(measure));
      Float focusCenter = new Float(this.fx.resolveWidth(measure), this.fy.resolveHeight(measure));
      float radius = this.r.resolveLength(measure);
      float focusRadius = this.fr.resolveLength(measure);
      return new SVGRadialGradientPaint(center, radius, focusCenter, focusRadius, gradOffsets, gradColors, this.spreadMethod.cycleMethod(), ColorSpaceType.SRGB, this.computeViewTransform(bounds));
   }

   public String toString() {
      return "RadialGradient{spreadMethod=" + this.spreadMethod + ", gradientTransform=" + this.gradientTransform + ", cx=" + this.cx + ", cy=" + this.cy + ", r=" + this.r + ", fr=" + this.fr + ", fx=" + this.fx + ", fy=" + this.fy + ", colors=" + Arrays.toString(this.colors()) + ", offsets=" + Arrays.toString(this.offsets()) + '}';
   }
}
