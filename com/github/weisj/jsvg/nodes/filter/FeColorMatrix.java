package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.image.RGBImageFilter;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ElementCategories({Category.FilterPrimitive})
@PermittedContent(
   anyOf = {Animate.class, Set.class}
)
public final class FeColorMatrix extends AbstractFilterPrimitive {
   public static final String TAG = "fecolormatrix";
   private static final String KEY_VALUES = "values";
   @Nullable
   private FeColorMatrix.AffineRGBImageFilter filter;

   @NotNull
   public String tagName() {
      return "fecolormatrix";
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      String type = attributeNode.getValue("type");
      if (type == null) {
         type = "matrix";
      }

      this.filter = null;
      String var3 = type.toLowerCase(Locale.ENGLISH);
      byte var4 = -1;
      switch(var3.hashCode()) {
      case -2114203985:
         if (var3.equals("saturate")) {
            var4 = 1;
         }
         break;
      case -1081239615:
         if (var3.equals("matrix")) {
            var4 = 0;
         }
         break;
      case -132305973:
         if (var3.equals("luminancetoalpha")) {
            var4 = 3;
         }
         break;
      case 1567021139:
         if (var3.equals("huerotate")) {
            var4 = 2;
         }
      }

      switch(var4) {
      case 0:
         double[] colorTransform = attributeNode.getDoubleList("values");
         if (colorTransform.length == 20) {
            boolean isIdentity = Arrays.equals(colorTransform, new double[]{1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D});
            if (!isIdentity) {
               this.filter = new FeColorMatrix.MatrixRGBFilter(colorTransform);
            }
         }
         break;
      case 1:
         float s = attributeNode.getFloat("values", 1.0F);
         if (s != 1.0F) {
            this.filter = new FeColorMatrix.LinearRGBFilter(0.213D + 0.787D * (double)s, 0.715D * (double)(1.0F - s), 0.072D * (double)(1.0F - s), 0.213D * (double)(1.0F - s), 0.715D + 0.285D * (double)s, 0.072D * (double)(1.0F - s), 0.213D * (double)(1.0F - s), 0.715D * (double)(1.0F - s), 0.072D + 0.928D * (double)s);
         }
         break;
      case 2:
         float hueRotate = attributeNode.getFloat("values", 0.0F);
         if (hueRotate != 1.0F) {
            double radians = Math.toRadians((double)hueRotate);
            double sin = Math.sin(radians);
            double cos = Math.cos(radians);
            this.filter = new FeColorMatrix.LinearRGBFilter(0.213D + cos * 0.787D - sin * 0.2127D, 0.715D - 0.715D * cos - 0.715D * sin, 0.072D - 0.072D * cos + 0.982D * sin, 0.213D - cos * 0.213D + sin * 0.143D, 0.715D + 0.285D * cos + 0.14D * sin, 0.072D - 0.072D * cos - 0.283D * sin, 0.213D - cos * 0.213D - sin * 0.787D, 0.715D - 0.715D * cos + 0.715D * sin, 0.072D + 0.982D * cos + 0.072D * sin);
         }
         break;
      case 3:
         this.filter = new FeColorMatrix.LuminanceToAlphaFilter();
      }

   }

   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
      LayoutBounds bounds = this.impl().layoutInput(filterLayoutContext).withFlags(new LayoutBounds.ComputeFlags(this.filter != null && !this.filter.isLinear()));
      this.impl().saveLayoutResult(bounds, filterLayoutContext);
   }

   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
      RGBImageFilter f = this.filter;
      if (f == null) {
         this.impl().noop(filterContext);
      } else {
         this.impl().saveResult(this.impl().inputChannel(filterContext).applyFilter(f), filterContext);
      }
   }

   private static int toRgbRange(double value) {
      return (int)Math.max(Math.min(Math.round(value), 255L), 0L);
   }

   private abstract static class AffineRGBImageFilter extends RGBImageFilter {
      private AffineRGBImageFilter() {
      }

      abstract boolean isLinear();

      // $FF: synthetic method
      AffineRGBImageFilter(Object x0) {
         this();
      }
   }

   private static final class MatrixRGBFilter extends FeColorMatrix.AffineRGBImageFilter {
      private final double r1;
      private final double r2;
      private final double r3;
      private final double r4;
      private final double r5;
      private final double g1;
      private final double g2;
      private final double g3;
      private final double g4;
      private final double g5;
      private final double b1;
      private final double b2;
      private final double b3;
      private final double b4;
      private final double b5;
      private final double a1;
      private final double a2;
      private final double a3;
      private final double a4;
      private final double a5;

      private MatrixRGBFilter(double[] values) {
         super(null);
         this.r1 = values[0];
         this.r2 = values[1];
         this.r3 = values[2];
         this.r4 = values[3];
         this.r5 = values[4];
         this.g1 = values[5];
         this.g2 = values[6];
         this.g3 = values[7];
         this.g4 = values[8];
         this.g5 = values[9];
         this.b1 = values[10];
         this.b2 = values[11];
         this.b3 = values[12];
         this.b4 = values[13];
         this.b5 = values[14];
         this.a1 = values[15];
         this.a2 = values[16];
         this.a3 = values[17];
         this.a4 = values[18];
         this.a5 = values[19];
      }

      boolean isLinear() {
         return this.r5 == 0.0D && this.g5 == 0.0D && this.b5 == 0.0D && this.a5 == 0.0D;
      }

      public int filterRGB(int x, int y, int rgb) {
         int a = rgb >> 24 & 255;
         int r = rgb >> 16 & 255;
         int g = rgb >> 8 & 255;
         int b = rgb & 255;
         int nr = FeColorMatrix.toRgbRange(this.r1 * (double)r + this.r2 * (double)g + this.r3 * (double)b + this.r4 * (double)a + this.r5 * 255.0D);
         int ng = FeColorMatrix.toRgbRange(this.g1 * (double)r + this.g2 * (double)g + this.g3 * (double)b + this.g4 * (double)a + this.g5 * 255.0D);
         int nb = FeColorMatrix.toRgbRange(this.b1 * (double)r + this.b2 * (double)g + this.b3 * (double)b + this.b4 * (double)a + this.b5 * 255.0D);
         int na = FeColorMatrix.toRgbRange(this.a1 * (double)r + this.a2 * (double)g + this.a3 * (double)b + this.a4 * (double)a + this.a5 * 255.0D);
         return (na & 255) << 24 | (nr & 255) << 16 | (ng & 255) << 8 | nb & 255;
      }

      // $FF: synthetic method
      MatrixRGBFilter(double[] x0, Object x1) {
         this(x0);
      }
   }

   private static final class LinearRGBFilter extends FeColorMatrix.AffineRGBImageFilter {
      private final double r1;
      private final double r2;
      private final double r3;
      private final double g1;
      private final double g2;
      private final double g3;
      private final double b1;
      private final double b2;
      private final double b3;

      private LinearRGBFilter(double r1, double r2, double r3, double g1, double g2, double g3, double b1, double b2, double b3) {
         super(null);
         this.r1 = r1;
         this.r2 = r2;
         this.r3 = r3;
         this.g1 = g1;
         this.g2 = g2;
         this.g3 = g3;
         this.b1 = b1;
         this.b2 = b2;
         this.b3 = b3;
      }

      boolean isLinear() {
         return true;
      }

      public int filterRGB(int x, int y, int rgb) {
         int a = rgb >> 24 & 255;
         int r = rgb >> 16 & 255;
         int g = rgb >> 8 & 255;
         int b = rgb & 255;
         int nr = FeColorMatrix.toRgbRange(this.r1 * (double)r + this.r2 * (double)g + this.r3 * (double)b);
         int ng = FeColorMatrix.toRgbRange(this.g1 * (double)r + this.g2 * (double)g + this.g3 * (double)b);
         int nb = FeColorMatrix.toRgbRange(this.b1 * (double)r + this.b2 * (double)g + this.b3 * (double)b);
         return a << 24 | (nr & 255) << 16 | (ng & 255) << 8 | nb & 255;
      }

      // $FF: synthetic method
      LinearRGBFilter(double x0, double x1, double x2, double x3, double x4, double x5, double x6, double x7, double x8, Object x9) {
         this(x0, x1, x2, x3, x4, x5, x6, x7, x8);
      }
   }

   private static final class LuminanceToAlphaFilter extends FeColorMatrix.AffineRGBImageFilter {
      private LuminanceToAlphaFilter() {
         super(null);
      }

      boolean isLinear() {
         return true;
      }

      public int filterRGB(int x, int y, int rgb) {
         int r = rgb >> 16 & 255;
         int g = rgb >> 8 & 255;
         int b = rgb & 255;
         int na = FeColorMatrix.toRgbRange(0.2125D * (double)r + 0.7164D * (double)g + 0.0712D * (double)b);
         return (na & 255) << 24;
      }

      // $FF: synthetic method
      LuminanceToAlphaFilter(Object x0) {
         this();
      }
   }
}
