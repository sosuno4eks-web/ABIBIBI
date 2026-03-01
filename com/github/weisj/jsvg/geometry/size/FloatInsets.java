package com.github.weisj.jsvg.geometry.size;

import java.util.Objects;

public final class FloatInsets {
   private final float top;
   private final float left;
   private final float bottom;
   private final float right;

   public FloatInsets(float top, float left, float bottom, float right) {
      this.top = top;
      this.left = left;
      this.bottom = bottom;
      this.right = right;
   }

   public FloatInsets() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public float top() {
      return this.top;
   }

   public float bottom() {
      return this.bottom;
   }

   public float left() {
      return this.left;
   }

   public float right() {
      return this.right;
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof FloatInsets)) {
         return false;
      } else {
         FloatInsets that = (FloatInsets)o;
         return Float.compare(that.top, this.top) == 0 && Float.compare(that.bottom, this.bottom) == 0 && Float.compare(that.left, this.left) == 0 && Float.compare(that.right, this.right) == 0;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.top, this.left, this.bottom, this.right});
   }

   public String toString() {
      return "[" + this.top + "," + this.left + "," + this.bottom + "," + this.right + "]";
   }
}
