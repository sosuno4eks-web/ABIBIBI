package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.geometry.size.Length;
import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@Immutable
public final class LengthFontSize implements FontSize {
   @NotNull
   private final Length size;

   public LengthFontSize(@NotNull Length size) {
      this.size = size;
   }

   @NotNull
   public Length size(@NotNull Length parentSize) {
      return this.size;
   }

   public String toString() {
      return "LengthFontSize{size=" + this.size + '}';
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof LengthFontSize)) {
         return false;
      } else {
         LengthFontSize that = (LengthFontSize)o;
         return this.size.equals(that.size);
      }
   }

   public int hashCode() {
      return Objects.hashCode(this.size);
   }
}
