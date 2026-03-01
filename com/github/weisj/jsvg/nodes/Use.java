package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.FillRule;
import com.github.weisj.jsvg.attributes.font.AttributeFontSpec;
import com.github.weisj.jsvg.attributes.font.FontParser;
import com.github.weisj.jsvg.geometry.AWTSVGShape;
import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.container.CommonInnerViewContainer;
import com.github.weisj.jsvg.nodes.prototype.HasContext;
import com.github.weisj.jsvg.nodes.prototype.HasShape;
import com.github.weisj.jsvg.nodes.prototype.Instantiator;
import com.github.weisj.jsvg.nodes.prototype.Renderable;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.FontRenderContext;
import com.github.weisj.jsvg.renderer.NodeRenderer;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.PaintContext;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ElementCategories({Category.Graphic, Category.GraphicsReferencing, Category.Structural})
@PermittedContent(
   categories = {Category.Animation, Category.Descriptive}
)
public final class Use extends RenderableSVGNode implements HasContext, HasShape, Instantiator {
   public static final String TAG = "use";
   private Length x;
   private Length y;
   private Length width;
   private Length height;
   @Nullable
   private SVGNode referencedNode;
   private PaintContext paintContext;
   private FontRenderContext fontRenderContext;
   private AttributeFontSpec fontSpec;
   private FillRule fillRule;

   @NotNull
   public String tagName() {
      return "use";
   }

   @Nullable
   public SVGNode referencedNode() {
      return this.referencedNode;
   }

   public boolean isVisible(@NotNull RenderContext context) {
      return super.isVisible(context) && this.referencedNode instanceof Renderable;
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.x = attributeNode.getLength("x", 0.0F);
      this.y = attributeNode.getLength("y", 0.0F);
      this.width = attributeNode.getLength("width", Length.UNSPECIFIED);
      this.height = attributeNode.getLength("height", Length.UNSPECIFIED);
      String href = attributeNode.getValue("href");
      if (href == null) {
         href = attributeNode.getValue("xlink:href");
      }

      this.referencedNode = (SVGNode)attributeNode.getElementByHref(SVGNode.class, href);
      this.paintContext = PaintContext.parse(attributeNode);
      this.fontRenderContext = FontRenderContext.parse(attributeNode);
      this.fontSpec = FontParser.parseFontSpec(attributeNode);
      this.fillRule = FillRule.parse(attributeNode);
   }

   @NotNull
   public Shape untransformedElementShape(@NotNull RenderContext context) {
      return (Shape)(this.referencedNode instanceof HasShape ? ((HasShape)this.referencedNode).elementShape(NodeRenderer.createChildContext(this.referencedNode, context, this)) : AWTSVGShape.EMPTY_SHAPE);
   }

   @NotNull
   public Rectangle2D untransformedElementBounds(@NotNull RenderContext context) {
      return this.referencedNode instanceof HasShape ? ((HasShape)this.referencedNode).elementBounds(NodeRenderer.createChildContext(this.referencedNode, context, this)) : AWTSVGShape.EMPTY_SHAPE;
   }

   @NotNull
   public PaintContext paintContext() {
      return this.paintContext;
   }

   @NotNull
   public FontRenderContext fontRenderContext() {
      return this.fontRenderContext;
   }

   @NotNull
   public AttributeFontSpec fontSpec() {
      return this.fontSpec;
   }

   @NotNull
   public FillRule fillRule() {
      return this.fillRule;
   }

   public boolean canInstantiate(@NotNull SVGNode node) {
      return node instanceof CommonInnerViewContainer;
   }

   public void render(@NotNull RenderContext context, @NotNull Output output) {
      if (this.referencedNode != null) {
         MeasureContext measureContext = context.measureContext();
         context.translate(output, (double)this.x.resolveWidth(measureContext), (double)this.y.resolveHeight(measureContext));
         NodeRenderer.Info info = NodeRenderer.createRenderInfo(this.referencedNode, context, output, this);

         label56: {
            try {
               if (info != null) {
                  if (this.referencedNode instanceof CommonInnerViewContainer) {
                     FloatSize targetViewBox = new FloatSize(Float.NaN, Float.NaN);
                     if (this.width.isSpecified()) {
                        targetViewBox.width = this.width.resolveWidth(measureContext);
                     }

                     if (this.height.isSpecified()) {
                        targetViewBox.height = this.height.resolveHeight(measureContext);
                     }

                     CommonInnerViewContainer view = (CommonInnerViewContainer)this.referencedNode;
                     view.renderWithSize(targetViewBox, view.viewBox(info.context), info.context, info.output());
                  } else {
                     info.renderable.render(info.context, info.output());
                  }
                  break label56;
               }
            } catch (Throwable var8) {
               if (info != null) {
                  try {
                     info.close();
                  } catch (Throwable var7) {
                     var8.addSuppressed(var7);
                  }
               }

               throw var8;
            }

            if (info != null) {
               info.close();
            }

            return;
         }

         if (info != null) {
            info.close();
         }
      }

   }

   public String toString() {
      return "Use{x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ", referencedNode=" + (this.referencedNode != null ? this.referencedNode.id() : null) + ", styleContext=" + this.paintContext + ", fillRule=" + this.fillRule + '}';
   }
}
