package com.github.weisj.jsvg.attributes.filter;

import com.github.weisj.jsvg.attributes.HasMatchName;
import org.jetbrains.annotations.NotNull;

public enum BlendMode implements HasMatchName {
   Normal,
   Multiply,
   Screen,
   Overlay,
   Darken,
   Lighten,
   ColorDodge("color-dodge"),
   ColorBurn("color-burn"),
   HardLight("hard-light"),
   SoftLight("soft-light"),
   Difference,
   Exclusion,
   Hue,
   Saturation,
   Color,
   Luminosity;

   @NotNull
   private final String matchName;

   private BlendMode(@NotNull String matchName) {
      this.matchName = matchName;
   }

   private BlendMode() {
      this.matchName = this.name();
   }

   @NotNull
   public String matchName() {
      return this.matchName;
   }

   // $FF: synthetic method
   private static BlendMode[] $values() {
      return new BlendMode[]{Normal, Multiply, Screen, Overlay, Darken, Lighten, ColorDodge, ColorBurn, HardLight, SoftLight, Difference, Exclusion, Hue, Saturation, Color, Luminosity};
   }
}
