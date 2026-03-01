package com.github.weisj.jsvg.attributes.font;

import com.google.errorprone.annotations.Immutable;

@Immutable
public final class NumberFontWeight implements FontWeight {
   private final float weight;

   public NumberFontWeight(float weight) {
      this.weight = weight;
   }

   public int weight(int parentWeight) {
      return (int)this.weight;
   }

   public String toString() {
      return "NumberFontWeight{weight=" + this.weight + '}';
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof NumberFontWeight)) {
         return false;
      } else {
         NumberFontWeight that = (NumberFontWeight)o;
         return this.weight == that.weight;
      }
   }

   public int hashCode() {
      return Float.hashCode(this.weight);
   }
}
