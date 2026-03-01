package com.github.weisj.jsvg.geometry.size;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public enum AngleUnit {
   Deg,
   Grad,
   Rad,
   Turn,
   Raw("");

   private static final AngleUnit[] units = values();
   private static final double GRADIANS_TO_RADIANS = 0.015707962916848627D;
   @NotNull
   private final String suffix;

   public static AngleUnit[] units() {
      return units;
   }

   private AngleUnit(@NotNull String suffix) {
      this.suffix = suffix;
   }

   private AngleUnit() {
      this.suffix = this.name().toLowerCase(Locale.ENGLISH);
   }

   @NotNull
   public String suffix() {
      return this.suffix;
   }

   public float toRadians(float value, @NotNull AngleUnit rawReplacement) {
      if (rawReplacement == Raw) {
         throw new IllegalArgumentException("Cant replace raw unit with raw");
      } else {
         switch(this) {
         case Deg:
            return (float)Math.toRadians((double)value);
         case Grad:
            return (float)((double)value * 0.015707962916848627D);
         case Rad:
            return value;
         case Turn:
            return (float)((double)value * 3.141592653589793D * 2.0D);
         case Raw:
            return rawReplacement.toRadians(value, rawReplacement);
         default:
            throw new IllegalArgumentException("Unknown angle unit " + this);
         }
      }
   }

   // $FF: synthetic method
   private static AngleUnit[] $values() {
      return new AngleUnit[]{Deg, Grad, Rad, Turn, Raw};
   }
}
