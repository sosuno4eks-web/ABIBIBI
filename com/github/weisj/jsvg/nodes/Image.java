package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.Overflow;
import com.github.weisj.jsvg.attributes.PreserveAspectRatio;
import com.github.weisj.jsvg.attributes.ViewBox;
import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.parser.UIFuture;
import com.github.weisj.jsvg.parser.ValueUIFuture;
import com.github.weisj.jsvg.parser.resources.MissingImageResource;
import com.github.weisj.jsvg.parser.resources.RenderableResource;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ElementCategories({Category.Graphic, Category.GraphicsReferencing})
@PermittedContent(
   categories = {Category.Animation, Category.Descriptive}
)
public final class Image extends RenderableSVGNode {
   private static final Logger LOGGER = Logger.getLogger(Image.class.getName());
   public static final String TAG = "image";
   private Length x;
   private Length y;
   private Length width;
   private Length height;
   private PreserveAspectRatio preserveAspectRatio;
   private Overflow overflow;
   private UIFuture<RenderableResource> imgResource;

   @NotNull
   public String tagName() {
      return "image";
   }

   public boolean isVisible(@NotNull RenderContext context) {
      return this.imgResource != null && super.isVisible(context);
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.x = attributeNode.getLength("x", 0.0F);
      this.y = attributeNode.getLength("y", 0.0F);
      this.width = attributeNode.getLength("width", Length.UNSPECIFIED);
      this.height = attributeNode.getLength("height", Length.UNSPECIFIED);
      this.preserveAspectRatio = PreserveAspectRatio.parse(attributeNode.getValue("preserveAspectRatio"), attributeNode.parser());
      this.overflow = (Overflow)attributeNode.getEnum("overflow", Overflow.Hidden);
      String url = attributeNode.parser().parseUrl(attributeNode.getHref());
      if (url != null) {
         try {
            this.imgResource = attributeNode.resourceLoader().loadImage(new URI(url));
         } catch (URISyntaxException | IOException var4) {
            LOGGER.log(Level.INFO, var4.getMessage(), var4);
            this.imgResource = null;
         }
      }

   }

   @Nullable
   private RenderableResource fetchImage(@NotNull RenderContext context) {
      if (this.imgResource == null) {
         return null;
      } else if (this.imgResource instanceof ValueUIFuture) {
         return (RenderableResource)this.imgResource.get();
      } else if (!this.imgResource.checkIfReady(context.platformSupport())) {
         return null;
      } else {
         RenderableResource resource = (RenderableResource)this.imgResource.get();
         if (resource != null) {
            this.imgResource = new ValueUIFuture(resource);
         }

         return resource;
      }
   }

   public void render(@NotNull RenderContext context, @NotNull Output output) {
      RenderableResource resource = this.fetchImage(context);
      if (resource == null) {
         resource = new MissingImageResource();
      }

      MeasureContext measure = context.measureContext();
      FloatSize intrinsicResourceSize = ((RenderableResource)resource).intrinsicSize(context);
      float resourceWidth = intrinsicResourceSize.width;
      float resourceHeight = intrinsicResourceSize.height;
      if (resourceWidth != 0.0F && resourceHeight != 0.0F) {
         float viewWidth = this.width.orElseIfUnspecified(resourceWidth).resolveWidth(measure);
         float viewHeight = this.height.orElseIfUnspecified(resourceHeight).resolveHeight(measure);
         output.translate((double)this.x.resolveWidth(measure), (double)this.y.resolveHeight(measure));
         if (this.overflow.establishesClip()) {
            output.applyClip(new ViewBox(viewWidth, viewHeight));
         }

         AffineTransform imgTransform = this.preserveAspectRatio.computeViewPortTransform(new FloatSize(viewWidth, viewHeight), new ViewBox(resourceWidth, resourceHeight));
         ((RenderableResource)resource).render(output, context, imgTransform);
      }
   }
}
