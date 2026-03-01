package com.github.weisj.jsvg.geometry.size;

import java.awt.geom.Dimension2D;
import java.util.Objects;

public final class FloatSize extends Dimension2D {
   public float width;
   public float height;

   public FloatSize(float width, float height) {
      this.width = width;
      this.height = height;
   }

   public double getWidth() {
      return (double)this.width;
   }

   public double getHeight() {
      return (double)this.height;
   }

   public void setSize(double width, double height) {
      this.width = (float)width;
      this.height = (float)height;
   }

   public String toString() {
      return "FloatSize{width=" + this.width + ", height=" + this.height + '}';
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof FloatSize)) {
         return false;
      } else {
         FloatSize floatSize = (FloatSize)o;
         return Float.compare(floatSize.width, this.width) == 0 && Float.compare(floatSize.height, this.height) == 0;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.width, this.height});
   }
}
