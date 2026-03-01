package com.github.weisj.jsvg.attributes.paint;

import java.awt.Color;
import java.awt.Paint;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public final class AwtSVGPaint implements SimplePaintSVGPaint {
   @NotNull
   private final Paint paint;

   public AwtSVGPaint(@NotNull Paint paint) {
      this.paint = paint;
   }

   @NotNull
   public Paint paint() {
      return this.paint;
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof AwtSVGPaint)) {
         return false;
      } else {
         AwtSVGPaint that = (AwtSVGPaint)o;
         return this.paint.equals(that.paint);
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.paint});
   }

   public String toString() {
      return "AwtSVGPaint{paint=" + this.formatPaint() + '}';
   }

   @NotNull
   private String formatPaint() {
      if (this.paint instanceof Color) {
         Color c = (Color)this.paint;
         return "Color{r=" + c.getRed() + ",g=" + c.getGreen() + ",b=" + c.getBlue() + ",a=" + c.getAlpha() + "}";
      } else {
         return this.paint.toString();
      }
   }
}
