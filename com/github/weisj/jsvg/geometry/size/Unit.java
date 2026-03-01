package com.github.weisj.jsvg.geometry.size;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public enum Unit {
   PX,
   CM,
   MM,
   IN,
   EM,
   REM,
   EX,
   PT,
   PC,
   PERCENTAGE("%"),
   Raw("");

   private static final Unit[] units = values();
   @NotNull
   private final String suffix;

   public static Unit[] units() {
      return units;
   }

   private Unit(@NotNull String suffix) {
      this.suffix = suffix;
   }

   private Unit() {
      this.suffix = this.name().toLowerCase(Locale.ENGLISH);
   }

   @NotNull
   public Length valueOf(float value) {
      return value == 0.0F ? Length.ZERO : new Length(this, value);
   }

   @NotNull
   public String suffix() {
      return this.suffix;
   }

   // $FF: synthetic method
   private static Unit[] $values() {
      return new Unit[]{PX, CM, MM, IN, EM, REM, EX, PT, PC, PERCENTAGE, Raw};
   }
}
