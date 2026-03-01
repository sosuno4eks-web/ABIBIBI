package com.github.weisj.jsvg.renderer;

import com.github.weisj.jsvg.attributes.FillRule;
import com.github.weisj.jsvg.attributes.ViewBox;
import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.ClipPath;
import com.github.weisj.jsvg.nodes.Mask;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.filter.Filter;
import com.github.weisj.jsvg.nodes.prototype.HasClip;
import com.github.weisj.jsvg.nodes.prototype.HasFillRule;
import com.github.weisj.jsvg.nodes.prototype.HasFilter;
import com.github.weisj.jsvg.nodes.prototype.HasFontContext;
import com.github.weisj.jsvg.nodes.prototype.HasFontRenderContext;
import com.github.weisj.jsvg.nodes.prototype.HasPaintContext;
import com.github.weisj.jsvg.nodes.prototype.HasShape;
import com.github.weisj.jsvg.nodes.prototype.Instantiator;
import com.github.weisj.jsvg.nodes.prototype.Mutator;
import com.github.weisj.jsvg.nodes.prototype.Renderable;
import com.github.weisj.jsvg.nodes.prototype.Transformable;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NodeRenderer {
   private static final boolean CLIP_DEBUG = false;

   private NodeRenderer() {
   }

   public static void renderNode(@NotNull SVGNode node, @NotNull RenderContext context, @NotNull Output output) {
      NodeRenderer.Info info = createRenderInfo(node, context, output, (Instantiator)null);

      try {
         if (info != null) {
            info.renderable.render(info.context, info.output());
         }
      } catch (Throwable var7) {
         if (info != null) {
            try {
               info.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (info != null) {
         info.close();
      }

   }

   @NotNull
   public static RenderContext createChildContext(@NotNull SVGNode node, @NotNull RenderContext context, @Nullable Instantiator instantiator) {
      return setupRenderContext(instantiator, node, context);
   }

   @Nullable
   public static NodeRenderer.Info createRenderInfo(@NotNull SVGNode node, @NotNull RenderContext context, @NotNull Output output, @Nullable Instantiator instantiator) {
      if (!(node instanceof Renderable)) {
         return null;
      } else {
         Renderable renderable = (Renderable)node;
         boolean instantiated = renderable.requiresInstantiation();
         if (instantiated && (instantiator == null || !instantiator.canInstantiate(node))) {
            return null;
         } else if (!renderable.isVisible(context)) {
            return null;
         } else {
            RenderContext childContext = createChildContext(node, context, instantiator);
            Output childOutput = output.createChild();
            if (renderable instanceof Transformable && ((Transformable)renderable).shouldTransform()) {
               ((Transformable)renderable).applyTransform(childOutput, childContext);
            }

            Rectangle2D elementBounds = null;
            if (renderable instanceof HasClip) {
               Mask mask = ((HasClip)renderable).mask();
               if (mask != null) {
                  Rectangle2D bounds = elementBounds(renderable, childContext);
                  elementBounds = bounds;
                  if (!bounds.isEmpty()) {
                     childOutput.setPaint(() -> {
                        return mask.createMaskPaint(childOutput, childContext, bounds);
                     });
                  }
               }

               ClipPath childClip = ((HasClip)renderable).clipPath();
               if (childClip != null) {
                  if (!childClip.isValid()) {
                     return null;
                  }

                  if (elementBounds == null) {
                     elementBounds = elementBounds(renderable, childContext);
                  }

                  Shape childClipShape;
                  if (output.isSoftClippingEnabled()) {
                     if (!elementBounds.isEmpty()) {
                        childClipShape = childClip.clipShape(childContext, elementBounds, true);
                        childOutput.setPaint(() -> {
                           return childClip.createPaintForSoftClipping(childOutput, childContext, elementBounds, childClipShape);
                        });
                     }
                  } else {
                     childClipShape = childClip.clipShape(childContext, elementBounds, false);
                     childOutput.applyClip(childClipShape);
                  }
               }
            }

            NodeRenderer.Info info = tryCreateFilterInfo(renderable, childContext, childOutput, elementBounds);
            return (NodeRenderer.Info)(info != null ? info : new NodeRenderer.Info(renderable, childContext, childOutput));
         }
      }
   }

   @Nullable
   private static NodeRenderer.InfoWithFilter tryCreateFilterInfo(@NotNull Renderable renderable, @NotNull RenderContext childContext, @NotNull Output childOutput, @Nullable Rectangle2D elementBounds) {
      Filter filter = renderable instanceof HasFilter ? ((HasFilter)renderable).filter() : null;
      if (filter != null && filter.hasEffect() && childOutput.supportsFilters()) {
         if (elementBounds == null) {
            elementBounds = elementBounds(renderable, childContext);
         }

         return NodeRenderer.InfoWithFilter.create(renderable, childContext, childOutput, filter, elementBounds);
      } else {
         return null;
      }
   }

   @NotNull
   private static Rectangle2D elementBounds(@NotNull Object node, @NotNull RenderContext childContext) {
      Object elementBounds;
      if (node instanceof HasShape) {
         elementBounds = ((HasShape)node).untransformedElementBounds(childContext);
      } else {
         MeasureContext measureContext = childContext.measureContext();
         elementBounds = new ViewBox(measureContext.viewWidth(), measureContext.viewHeight());
      }

      return (Rectangle2D)elementBounds;
   }

   @NotNull
   public static RenderContext setupRenderContext(@NotNull Object node, @NotNull RenderContext context) {
      return setupRenderContext((Instantiator)null, node, context);
   }

   @NotNull
   private static RenderContext setupRenderContext(@Nullable Instantiator instantiator, @NotNull Object node, @NotNull RenderContext context) {
      Mutator<PaintContext> paintContext = null;
      Mutator<MeasurableFontSpec> fontSpec = null;
      FontRenderContext fontRenderContext = null;
      FillRule fillRule = null;
      if (node instanceof HasPaintContext) {
         paintContext = ((HasPaintContext)node).paintContext();
      }

      if (node instanceof HasFontContext) {
         fontSpec = ((HasFontContext)node).fontSpec();
      }

      if (node instanceof HasFontRenderContext) {
         fontRenderContext = ((HasFontRenderContext)node).fontRenderContext();
      }

      if (node instanceof HasFillRule) {
         fillRule = ((HasFillRule)node).fillRule();
      }

      ContextElementAttributes contextElementAttributes = null;
      if (instantiator != null) {
         contextElementAttributes = instantiator.createContextAttributes(context);
      }

      return context.derive(paintContext, fontSpec, (ViewBox)null, fontRenderContext, fillRule, contextElementAttributes);
   }

   @NotNull
   public static RenderContext setupInnerViewRenderContext(@NotNull ViewBox viewBox, @NotNull RenderContext context, boolean inheritAttributes) {
      if (inheritAttributes) {
         return context.derive((Mutator)null, (Mutator)null, viewBox, (FontRenderContext)null, (FillRule)null, (ContextElementAttributes)null);
      } else {
         MeasureContext newMeasure = context.measureContext().derive(viewBox, Float.NaN, Float.NaN);
         return new RenderContext(context.platformSupport(), new AffineTransform(), new AffineTransform(), PaintContext.createDefault(), newMeasure, FontRenderContext.createDefault(), MeasurableFontSpec.createDefault(), context.fillRule(), context.contextElementAttributes());
      }
   }

   // $FF: synthetic method
   private static void lambda$createRenderInfo$2(Shape childClipShape, Graphics2D g) {
      g.setClip((Shape)null);
      g.setPaint(Color.MAGENTA);
      g.draw(childClipShape);
   }

   public static class Info implements AutoCloseable {
      @NotNull
      public final Renderable renderable;
      @NotNull
      public final RenderContext context;
      @NotNull
      public final Output output;

      Info(@NotNull Renderable renderable, @NotNull RenderContext context, @NotNull Output output) {
         this.renderable = renderable;
         this.context = context;
         this.output = output;
      }

      @NotNull
      public Output output() {
         return this.output;
      }

      public void close() {
         this.output.dispose();
      }
   }

   private static final class InfoWithFilter extends NodeRenderer.Info {
      @NotNull
      private final Filter filter;
      @NotNull
      private final Filter.FilterInfo filterInfo;

      @Nullable
      static NodeRenderer.InfoWithFilter create(@NotNull Renderable renderable, @NotNull RenderContext context, @NotNull Output output, @NotNull Filter filter, @NotNull Rectangle2D elementBounds) {
         Filter.FilterInfo info = filter.createFilterInfo(output, context, elementBounds);
         return info == null ? null : new NodeRenderer.InfoWithFilter(renderable, context, output, filter, info);
      }

      private InfoWithFilter(@NotNull Renderable renderable, @NotNull RenderContext context, @NotNull Output output, @NotNull Filter filter, @NotNull Filter.FilterInfo filterInfo) {
         super(renderable, context, output);
         this.filter = filter;
         this.filterInfo = filterInfo;
      }

      @NotNull
      public Output output() {
         return this.filterInfo.output();
      }

      public void close() {
         this.filter.applyFilter(this.output, this.context, this.filterInfo);
         this.filterInfo.blitImage(this.output, this.context);
         this.filterInfo.close();
         super.close();
      }
   }
}
