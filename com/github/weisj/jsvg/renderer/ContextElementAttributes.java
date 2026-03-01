package com.github.weisj.jsvg.renderer;

import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public final class ContextElementAttributes {
   @NotNull
   public final SVGPaint fillPaint;
   @NotNull
   public final SVGPaint strokePaint;

   public ContextElementAttributes(@NotNull SVGPaint fillPaint, @NotNull SVGPaint strokePaint) {
      this.fillPaint = fillPaint;
      this.strokePaint = strokePaint;
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof ContextElementAttributes)) {
         return false;
      } else {
         ContextElementAttributes that = (ContextElementAttributes)o;
         return this.fillPaint.equals(that.fillPaint) && this.strokePaint.equals(that.strokePaint);
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.fillPaint, this.strokePaint});
   }

   public String toString() {
      return "ContextElementAttributes{fillPaint=" + this.fillPaint + ", strokePaint=" + this.strokePaint + '}';
   }
}
