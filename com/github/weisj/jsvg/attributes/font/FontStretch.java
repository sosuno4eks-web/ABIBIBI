package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.attributes.HasMatchName;
import org.jetbrains.annotations.NotNull;

public enum FontStretch implements HasMatchName {
   Normal(1.0F),
   UltraCondensed(0.5F, "ultra-condensed"),
   ExtraCondensed(0.625F, "extra-condensed"),
   Condensed(0.75F, "condensed"),
   SemiCondensed(0.875F, "semi-condensed"),
   SemiExpanded(1.125F, "semi-expanded"),
   Expanded(1.25F),
   ExtraExpanded(1.5F, "extra-expanded"),
   UltraExpanded(2.0F, "ultra-expanded"),
   Percentage(-1.0F);

   private final float percentage;
   @NotNull
   private final String matchName;

   private FontStretch(float percentage, @NotNull String matchName) {
      this.percentage = percentage;
      this.matchName = matchName;
   }

   private FontStretch(float percentage) {
      this.percentage = percentage;
      this.matchName = this.name();
   }

   @NotNull
   public String matchName() {
      return this.matchName;
   }

   public float percentage() {
      if (this == Percentage) {
         throw new UnsupportedOperationException("Percentage needs to be computed manually");
      } else {
         return this.percentage;
      }
   }

   // $FF: synthetic method
   private static FontStretch[] $values() {
      return new FontStretch[]{Normal, UltraCondensed, ExtraCondensed, Condensed, SemiCondensed, SemiExpanded, Expanded, ExtraExpanded, UltraExpanded, Percentage};
   }
}
