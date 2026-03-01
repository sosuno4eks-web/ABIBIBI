package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
import com.github.weisj.jsvg.geometry.noise.PerlinTurbulence;
import com.github.weisj.jsvg.geometry.size.FloatInsets;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.util.ImageUtil;
import java.awt.color.ColorSpace;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.FilterPrimitive})
@PermittedContent(
   anyOf = {Animate.class, Set.class}
)
public final class FeTurbulence extends AbstractFilterPrimitive {
   public static final String TAG = "feturbulence";
   private float seed;
   private float[] baseFrequency;
   private int numOctaves;
   private FeTurbulence.Type type;

   @NotNull
   public String tagName() {
      return "feturbulence";
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.seed = attributeNode.getFloat("seed", 0.0F);
      this.baseFrequency = attributeNode.getFloatList("baseFrequency");
      if (this.baseFrequency.length == 0) {
         this.baseFrequency = new float[]{0.0F};
      }

      this.numOctaves = attributeNode.getInt("numOctaves", 1);
      this.numOctaves = Math.min(this.numOctaves, 8);
      this.type = (FeTurbulence.Type)attributeNode.getEnum("type", FeTurbulence.Type.fractalNoise);
   }

   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
      this.impl().saveLayoutResult(new LayoutBounds(filterLayoutContext.filterPrimitiveRegion(context.measureContext(), this), new FloatInsets()), filterLayoutContext);
   }

   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
      Filter.FilterInfo info = filterContext.info();
      Channel turbulenceChannel = new FeTurbulence.TurbulenceChannel(info.imageBounds(), info.imageWidth, info.imageHeight, this.seed, this.numOctaves, (double)this.baseFrequency[0], this.baseFrequency.length > 1 ? (double)this.baseFrequency[1] : (double)this.baseFrequency[0], this.type);
      this.impl().saveResult(turbulenceChannel, filterContext);
   }

   public static enum Type {
      fractalNoise,
      Turbulence;

      // $FF: synthetic method
      private static FeTurbulence.Type[] $values() {
         return new FeTurbulence.Type[]{fractalNoise, Turbulence};
      }
   }

   public static final class TurbulenceChannel implements Channel, PixelProvider {
      private final PerlinTurbulence perlinTurbulence;
      private final double[] channels = new double[4];
      private final int imageWidth;
      private final int imageHeight;
      private final FeTurbulence.Type type;
      private final Rectangle2D tileBounds;
      private BufferedImage bufferedImage;

      public TurbulenceChannel(@NotNull Rectangle2D tileBounds, int imageWidth, int imageHeight, float seed, int octaves, double xFrequency, double yFrequency, FeTurbulence.Type type) {
         this.tileBounds = tileBounds;
         this.imageWidth = imageWidth;
         this.imageHeight = imageHeight;
         this.type = type;
         this.perlinTurbulence = new PerlinTurbulence((int)seed, octaves, xFrequency, yFrequency);
      }

      @NotNull
      private BufferedImage ensureImageBackingStore() {
         if (this.bufferedImage == null) {
            ColorSpace cs = ColorSpace.getInstance(1004);
            ColorModel cm = new DirectColorModel(cs, 32, 16711680, 65280, 255, -16777216, false, 3);
            WritableRaster dest = cm.createCompatibleWritableRaster(this.imageWidth, this.imageHeight);
            this.bufferedImage = new BufferedImage(cm, dest, false, (Hashtable)null);
            int w = dest.getWidth();
            int h = dest.getHeight();
            double scaleX = this.tileBounds.getWidth() / (double)w;
            double scaleY = this.tileBounds.getHeight() / (double)h;
            double startX = this.tileBounds.getX();
            double startY = this.tileBounds.getY();
            boolean fractalNoise = this.type == FeTurbulence.Type.fractalNoise;
            int[] destPixels = ImageUtil.getINT_RGBA_DataBank(dest);
            int dstAdjust = ImageUtil.getINT_RGBA_DataAdjust(dest);
            int dp = ImageUtil.getINT_RGBA_DataOffset(dest);
            double point_1 = startY;

            for(int i = 0; i < h; ++i) {
               double point_0 = startX;

               for(int end = dp + w; dp < end; ++dp) {
                  this.perlinTurbulence.turbulence(this.channels, point_0, point_1, fractalNoise, (PerlinTurbulence.StitchInfo)null, (Double)null);
                  destPixels[dp] = cm.getRGB(channelsToRGB(this.channels));
                  point_0 += scaleX;
               }

               point_1 += scaleY;
               dp += dstAdjust;
            }
         }

         return this.bufferedImage;
      }

      @NotNull
      public ImageProducer producer() {
         return this.ensureImageBackingStore().getSource();
      }

      @NotNull
      public BufferedImage toBufferedImageNonAliased(@NotNull RenderContext context) {
         BufferedImage img = this.ensureImageBackingStore();
         ColorModel cm = img.getColorModel();
         WritableRaster raster = img.copyData((WritableRaster)null);
         return new BufferedImage(cm, raster, cm.isAlphaPremultiplied(), (Hashtable)null);
      }

      @NotNull
      public Channel applyFilter(@NotNull ImageFilter filter) {
         return new ImageProducerChannel(new FilteredImageSource(this.producer(), filter));
      }

      @NotNull
      public PixelProvider pixels(@NotNull RenderContext context) {
         return this;
      }

      public int pixelAt(double x, double y) {
         this.perlinTurbulence.turbulence(this.channels, x, y, this.type == FeTurbulence.Type.fractalNoise, (PerlinTurbulence.StitchInfo)null, (Double)null);
         return channelsToRGB(this.channels);
      }

      private static int channelsToRGB(double[] channels) {
         int i = (int)channels[0];
         int j;
         if ((i & -256) == 0) {
            j = i << 16;
         } else {
            j = (i & Integer.MIN_VALUE) != 0 ? 0 : 16711680;
         }

         i = (int)channels[1];
         if ((i & -256) == 0) {
            j |= i << 8;
         } else {
            j |= (i & Integer.MIN_VALUE) != 0 ? 0 : '\uff00';
         }

         i = (int)channels[2];
         if ((i & -256) == 0) {
            j |= i;
         } else {
            j |= (i & Integer.MIN_VALUE) != 0 ? 0 : 255;
         }

         i = (int)channels[3];
         if ((i & -256) == 0) {
            j |= i << 24;
         } else {
            j |= (i & Integer.MIN_VALUE) != 0 ? 0 : -16777216;
         }

         return j;
      }
   }
}
