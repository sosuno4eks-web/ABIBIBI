package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
import com.github.weisj.jsvg.attributes.paint.AwtSVGPaint;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.geometry.size.FloatInsets;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Graphics2DOutput;
import com.github.weisj.jsvg.renderer.GraphicsUtil;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.FilterPrimitive})
@PermittedContent(
   anyOf = {Animate.class, Set.class}
)
public final class FeFlood extends AbstractFilterPrimitive {
   public static final String TAG = "feflood";
   private SVGPaint floodColor;
   private float floodOpacity;

   @NotNull
   public String tagName() {
      return "feflood";
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.floodColor = attributeNode.getPaint("flood-color", new AwtSVGPaint(Color.BLACK));
      this.floodOpacity = attributeNode.getPercentage("flood-opacity", 1.0F);
   }

   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
      LayoutBounds layoutBounds = new LayoutBounds(filterLayoutContext.filterPrimitiveRegion(context.measureContext(), this), new FloatInsets());
      this.impl().saveLayoutResult(layoutBounds, filterLayoutContext);
   }

   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
      Filter.FilterInfo info = filterContext.info();
      BufferedImage img = new BufferedImage(info.imageWidth, info.imageHeight, 2);
      if (this.floodOpacity != 0.0F) {
         Graphics2D graphics = GraphicsUtil.createGraphics(img);
         graphics.setComposite(AlphaComposite.Src.derive(this.floodOpacity));
         Rectangle rect = new Rectangle(0, 0, img.getWidth(), img.getHeight());
         this.floodColor.fillShape(new Graphics2DOutput(graphics), context, rect, rect);
         graphics.dispose();
      }

      this.impl().saveResult(new ImageProducerChannel(img.getSource()), filterContext);
   }
}
