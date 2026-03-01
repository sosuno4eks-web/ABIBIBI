package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.Overflow;
import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.nodes.container.CommonInnerViewContainer;
import com.github.weisj.jsvg.nodes.filter.Filter;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.nodes.text.Text;
import com.github.weisj.jsvg.parser.AttributeNode;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.Container, Category.Structural})
@PermittedContent(
   categories = {Category.Animation, Category.Descriptive, Category.Shape, Category.Structural, Category.Gradient},
   anyOf = {Anchor.class, ClipPath.class, Filter.class, Image.class, Mask.class, Marker.class, Pattern.class, Style.class, Text.class, View.class}
)
public final class SVG extends CommonInnerViewContainer {
   public static final String TAG = "svg";
   @NotNull
   private static final Length TOP_LEVEL_TRANSFORM_ORIGIN;
   private static final float FALLBACK_WIDTH = 300.0F;
   private static final float FALLBACK_HEIGHT = 150.0F;
   private boolean isTopLevel;

   @NotNull
   public String tagName() {
      return "svg";
   }

   public boolean isTopLevel() {
      return this.isTopLevel;
   }

   public boolean shouldTransform() {
      return !this.isTopLevel();
   }

   public void build(@NotNull AttributeNode attributeNode) {
      this.isTopLevel = attributeNode.parent() == null;
      super.build(attributeNode);
   }

   @NotNull
   protected Point2D outerLocation(@NotNull MeasureContext context) {
      return (Point2D)(this.isTopLevel ? new Point(0, 0) : super.outerLocation(context));
   }

   @NotNull
   public Point2D transformOrigin(@NotNull MeasureContext context) {
      return (Point2D)(!this.isTopLevel ? super.transformOrigin(context) : new Float(TOP_LEVEL_TRANSFORM_ORIGIN.resolveWidth(context), TOP_LEVEL_TRANSFORM_ORIGIN.resolveHeight(context)));
   }

   @NotNull
   protected Overflow defaultOverflow() {
      return this.isTopLevel ? Overflow.Visible : Overflow.Hidden;
   }

   @NotNull
   public FloatSize sizeForTopLevel(float em, float ex) {
      MeasureContext topLevelContext = MeasureContext.createInitial(new FloatSize(100.0F, 100.0F), em, ex);
      return new FloatSize(this.width.orElseIfUnspecified(this.viewBox != null ? this.viewBox.width : 300.0F).resolveWidth(topLevelContext), this.height.orElseIfUnspecified(this.viewBox != null ? this.viewBox.height : 150.0F).resolveHeight(topLevelContext));
   }

   static {
      TOP_LEVEL_TRANSFORM_ORIGIN = Unit.PERCENTAGE.valueOf(50.0F);
   }
}
