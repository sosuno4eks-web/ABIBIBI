package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.EdgeMode;
import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
import com.github.weisj.jsvg.geometry.util.GeometryUtil;
import com.github.weisj.jsvg.nodes.InplaceBoxBlurFilter;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Dimension;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.awt.image.Kernel;
import java.awt.image.WritableRaster;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ElementCategories({Category.FilterPrimitive})
@PermittedContent(
   anyOf = {Animate.class, Set.class}
)
public final class FeGaussianBlur extends AbstractFilterPrimitive {
   public static final String TAG = "fegaussianblur";
   private static final double SQRT_2_PI = Math.sqrt(6.283185307179586D);
   private static final double THREE_QUARTER_SQRT_2_PI;
   private static final float KERNEL_PRECISION = 0.001F;
   private static final double BOX_BLUR_APPROXIMATION_THRESHOLD = 2.0D;
   private float[] stdDeviation;
   private EdgeMode edgeMode;
   private double xCurrent;
   private double yCurrent;
   private Kernel xBlur;
   private Kernel yBlur;

   @NotNull
   public String tagName() {
      return "fegaussianblur";
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.stdDeviation = attributeNode.getFloatList("stdDeviation");
      this.edgeMode = (EdgeMode)attributeNode.getEnum("edgeMode", EdgeMode.Duplicate);
   }

   private double[] computeAbsoluteStdDeviation(@Nullable AffineTransform at) {
      if (this.stdDeviation.length == 0) {
         return new double[]{0.0D, 0.0D};
      } else {
         double xSigma = (double)this.stdDeviation[0];
         double ySigma = (double)this.stdDeviation[Math.min(this.stdDeviation.length - 1, 1)];
         if (at != null) {
            xSigma *= GeometryUtil.scaleXOfTransform(at);
            ySigma *= GeometryUtil.scaleYOfTransform(at);
         }

         return new double[]{xSigma, ySigma};
      }
   }

   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
      LayoutBounds input = this.impl().layoutInput(filterLayoutContext);
      double[] sigma = this.computeAbsoluteStdDeviation((AffineTransform)null);
      int hExtend = kernelDiameterForStandardDeviation(sigma[0]);
      int vExtend = kernelDiameterForStandardDeviation(sigma[1]);
      this.impl().saveLayoutResult(input.grow((float)hExtend, (float)vExtend, filterLayoutContext), filterLayoutContext);
   }

   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
      if (this.stdDeviation.length == 0) {
         this.impl().noop(filterContext);
      } else {
         double[] sigma = this.computeAbsoluteStdDeviation(filterContext.info().output().transform());
         double xSigma = sigma[0];
         double ySigma = sigma[1];
         if (xSigma <= 0.0D && ySigma <= 0.0D) {
            this.impl().noop(filterContext);
         } else {
            ImageProducer input = this.impl().inputChannel(filterContext).producer();
            Kernel xBlurKernel = null;
            Kernel yBlurKernel = null;
            int dX = kernelDiameterForStandardDeviation(xSigma);
            int dY = kernelDiameterForStandardDeviation(ySigma);
            if (xSigma > 0.0D && xSigma < 2.0D) {
               xBlurKernel = this.createConvolveKernel(dX, xSigma, true);
            }

            if (ySigma > 0.0D && ySigma < 2.0D) {
               yBlurKernel = this.createConvolveKernel(dX, ySigma, false);
            }

            ImageProducer output = this.edgeMode.convolve(context, filterContext, input, new FeGaussianBlur.MixedQualityConvolveOperation(xBlurKernel, yBlurKernel, dX, dY));
            this.impl().saveResult(new ImageProducerChannel(output), filterContext);
         }
      }
   }

   @NotNull
   private Kernel createConvolveKernel(int diameter, double sigma, boolean horizontal) {
      if (horizontal && this.xBlur != null && this.xCurrent == sigma) {
         return this.xBlur;
      } else if (!horizontal && this.yBlur != null && this.yCurrent == sigma) {
         return this.yBlur;
      } else {
         if (horizontal) {
            this.xCurrent = sigma;
         } else {
            this.yCurrent = sigma;
         }

         float[] data = computeGaussianKernelData(diameter, sigma);
         if (horizontal) {
            this.xBlur = new Kernel(diameter, 1, data);
         } else {
            this.yBlur = new Kernel(1, diameter, data);
         }

         return horizontal ? this.xBlur : this.yBlur;
      }
   }

   private static float normalConvolve(float x, double standardDeviation) {
      return (float)(Math.pow(2.718281828459045D, (double)(-x * x) / (2.0D * standardDeviation * standardDeviation)) / (standardDeviation * SQRT_2_PI));
   }

   private static float[] computeGaussianKernelData(int diameter, double standardDeviation) {
      float[] data = new float[diameter];
      int mid = diameter / 2;
      float total = 0.0F;

      int i;
      for(i = 0; i < diameter; ++i) {
         data[i] = normalConvolve((float)i - (float)mid, standardDeviation);
         total += data[i];
      }

      if (total > 0.0F) {
         for(i = 0; i < diameter; ++i) {
            data[i] /= total;
         }
      }

      return data;
   }

   public static int kernelDiameterForStandardDeviation(double standardDeviation) {
      if (!(standardDeviation < 2.0D)) {
         return (int)Math.floor(THREE_QUARTER_SQRT_2_PI * standardDeviation + 0.5D);
      } else {
         float areaSum = (float)(0.5D / (standardDeviation * SQRT_2_PI));

         int i;
         for(i = 0; (double)areaSum < 0.49899999995250255D; ++i) {
            areaSum += normalConvolve((float)i, standardDeviation);
         }

         return i * 2 + 1;
      }
   }

   static {
      THREE_QUARTER_SQRT_2_PI = SQRT_2_PI * 3.0D / 4.0D;
   }

   private static final class MixedQualityConvolveOperation implements EdgeMode.ConvolveOperation {
      @Nullable
      private final Kernel xKernel;
      @Nullable
      private final Kernel yKernel;
      private final int dX;
      private final int dY;

      private MixedQualityConvolveOperation(@Nullable Kernel xKernel, @Nullable Kernel yKernel, int dX, int dY) {
         this.xKernel = xKernel;
         this.yKernel = yKernel;
         this.dX = dX;
         this.dY = dY;
      }

      @NotNull
      public Dimension maximumKernelSize() {
         return new Dimension(this.xKernel != null ? this.xKernel.getXOrigin() : this.dX, this.yKernel != null ? this.yKernel.getXOrigin() : this.dY);
      }

      @NotNull
      public ImageProducer convolve(@NotNull BufferedImage image, @NotNull RenderingHints hints, int awtEdgeMode) {
         WritableRaster raster = image.getRaster();
         if (this.xKernel != null && this.yKernel != null) {
            BufferedImageOp op = new MultiConvolveOp(new ConvolveOp[]{new ConvolveOp(this.xKernel, awtEdgeMode, hints), new ConvolveOp(this.yKernel, awtEdgeMode, hints)});
            return new FilteredImageSource(image.getSource(), new BufferedImageFilter(op));
         } else if (this.xKernel != null) {
            this.verticalBoxBlur(raster);
            return new FilteredImageSource(image.getSource(), new BufferedImageFilter(new ConvolveOp(this.xKernel, awtEdgeMode, hints)));
         } else if (this.yKernel != null) {
            this.horizontalBoxBlur(raster);
            return new FilteredImageSource(image.getSource(), new BufferedImageFilter(new ConvolveOp(this.yKernel, awtEdgeMode, hints)));
         } else {
            this.horizontalBoxBlur(raster);
            this.verticalBoxBlur(raster);
            return image.getSource();
         }
      }

      private void horizontalBoxBlur(@NotNull WritableRaster raster) {
         if ((this.dX & 1) == 0) {
            InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2);
            InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2 - 1);
            InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX + 1, this.dX / 2);
         } else {
            InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2);
            InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2);
            InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2);
         }

      }

      private void verticalBoxBlur(@NotNull WritableRaster raster) {
         if ((this.dY & 1) == 0) {
            InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2);
            InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2 - 1);
            InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY + 1, this.dY / 2);
         } else {
            InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2);
            InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2);
            InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2);
         }

      }

      // $FF: synthetic method
      MixedQualityConvolveOperation(Kernel x0, Kernel x1, int x2, int x3, Object x4) {
         this(x0, x1, x2, x3);
      }
   }
}
