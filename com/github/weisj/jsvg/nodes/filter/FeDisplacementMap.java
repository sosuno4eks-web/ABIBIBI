package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.ColorChannel;
import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.util.ImageUtil;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.color.ColorSpace;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageFilter;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.FilterPrimitive})
@PermittedContent(
   anyOf = {Animate.class, Set.class}
)
public final class FeDisplacementMap extends AbstractFilterPrimitive {
   public static final String TAG = "fedisplacementmap";
   private ColorChannel xChannelSelector;
   private ColorChannel yChannelSelector;
   private float scale;
   private FilterChannelKey inputChannel2;

   @NotNull
   public String tagName() {
      return "fedisplacementmap";
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.xChannelSelector = (ColorChannel)attributeNode.getEnum("xChannelSelector", ColorChannel.A);
      this.yChannelSelector = (ColorChannel)attributeNode.getEnum("yChannelSelector", ColorChannel.A);
      this.scale = attributeNode.getFloat("scale", 0.0F);
      this.inputChannel2 = attributeNode.getFilterChannelKey("in2", DefaultFilterChannel.LastResult);
   }

   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
      this.impl().saveLayoutResult(this.impl().layoutInput(filterLayoutContext), filterLayoutContext);
   }

   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
      if (this.scale == 0.0F) {
         this.impl().noop(filterContext);
      } else {
         Channel input = this.impl().inputChannel(filterContext);
         Channel displacementInput = filterContext.getChannel(this.inputChannel2);
         ImageFilter displacementFilter = new BufferedImageFilter(new FeDisplacementMap.DisplacementOp(displacementInput.pixels(context), filterContext.info().tile()));
         this.impl().saveResult(input.applyFilter(displacementFilter), filterContext);
      }
   }

   private final class DisplacementOp implements BufferedImageOp {
      @NotNull
      private final PixelProvider displacementChannel;
      private final Rectangle2D sourceBounds;

      public DisplacementOp(@NotNull PixelProvider displacementChannel, Rectangle2D sourceBounds) {
         this.displacementChannel = displacementChannel;
         this.sourceBounds = sourceBounds;
      }

      public BufferedImage createCompatibleDestImage(BufferedImage src, ColorModel dstCM) {
         if (dstCM == null) {
            dstCM = src.getColorModel();
         }

         return new BufferedImage(dstCM, dstCM.createCompatibleWritableRaster(src.getWidth(), src.getHeight()), dstCM.isAlphaPremultiplied(), (Hashtable)null);
      }

      public Rectangle2D getBounds2D(BufferedImage src) {
         return new Rectangle(0, 0, src.getWidth(), src.getHeight());
      }

      public Point2D getPoint2D(Point2D srcPt, Point2D dstPt) {
         return (Point2D)srcPt.clone();
      }

      public BufferedImage filter(BufferedImage src, BufferedImage dest) {
         if (src == null) {
            throw new NullPointerException("src image is null");
         } else if (src == dest) {
            throw new IllegalArgumentException("src image cannot be the same as the dst image");
         } else {
            BufferedImage result = dest;
            if (dest == null) {
               ColorSpace cs = ColorSpace.getInstance(1000);
               ColorModel cm = new DirectColorModel(cs, 32, 16711680, 65280, 255, -16777216, false, 3);
               result = this.createCompatibleDestImage(src, cm);
            }

            WritableRaster raster = result.getRaster();
            int w = raster.getWidth();
            int h = raster.getHeight();
            double scaleX = this.sourceBounds.getWidth() / (double)w;
            double scaleY = this.sourceBounds.getHeight() / (double)h;
            double startX = this.sourceBounds.getX();
            double startY = this.sourceBounds.getY();
            Raster sourceRaster = src.getRaster();
            Rectangle sourceRasterBounds = sourceRaster.getBounds();
            int[] destPixels = ImageUtil.getINT_RGBA_DataBank(raster);
            int dstAdjust = ImageUtil.getINT_RGBA_DataAdjust(raster);
            int dp = ImageUtil.getINT_RGBA_DataOffset(raster);
            double point_1 = startY;
            int y = 0;

            for(int i = 0; i < h; ++i) {
               int x = 0;
               double point_0 = startX;

               for(int end = dp + w; dp < end; ++dp) {
                  int displacementRGB = this.displacementChannel.pixelAt(point_0, point_1);
                  double xDisplacement = (double)FeDisplacementMap.this.xChannelSelector.value(displacementRGB) / 255.0D - 0.5D;
                  double yDisplacement = (double)FeDisplacementMap.this.yChannelSelector.value(displacementRGB) / 255.0D - 0.5D;
                  int xDest = (int)((double)x + (double)FeDisplacementMap.this.scale * xDisplacement / scaleX);
                  int yDest = (int)((double)y + (double)FeDisplacementMap.this.scale * yDisplacement / scaleY);
                  if (sourceRasterBounds.contains(xDest, yDest)) {
                     destPixels[dp] = src.getRGB(xDest, yDest);
                  } else {
                     destPixels[dp] = 0;
                  }

                  point_0 += scaleX;
                  ++x;
               }

               point_1 += scaleY;
               dp += dstAdjust;
               ++y;
            }

            return result;
         }
      }

      public RenderingHints getRenderingHints() {
         return null;
      }
   }
}
