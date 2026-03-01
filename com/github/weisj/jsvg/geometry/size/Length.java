package com.github.weisj.jsvg.geometry.size;

import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@Immutable
public final class Length {
   public static final float UNSPECIFIED_RAW = Float.NaN;
   @NotNull
   public static final Length UNSPECIFIED;
   @NotNull
   public static final Length ZERO;
   @NotNull
   private final Unit unit;
   private final float value;
   private static final float pixelsPerInch = 96.0F;
   private static final float inchesPerCm = 0.3936F;

   public Length(@NotNull Unit unit, float value) {
      this.unit = unit;
      this.value = value;
   }

   public static boolean isUnspecified(float value) {
      return Float.isNaN(value);
   }

   public static boolean isSpecified(float value) {
      return !isUnspecified(value);
   }

   private float resolveNonPercentage(@NotNull MeasureContext context) {
      if (this.isUnspecified()) {
         throw new IllegalStateException("Can't resolve size of unspecified length");
      } else if (this.unit == Unit.Raw) {
         return this.value;
      } else {
         assert this.unit != Unit.PERCENTAGE;

         switch(this.unit) {
         case PX:
            return this.value;
         case IN:
            return 96.0F * this.value;
         case CM:
            return 37.7856F * this.value;
         case MM:
            return 3.7785597F * this.value;
         case PT:
            return 1.3333334F * this.value;
         case PC:
            return 16.0F * this.value;
         case EM:
            return context.em() * this.value;
         case REM:
            return context.rem() * this.value;
         case EX:
            return context.ex() * this.value;
         default:
            throw new UnsupportedOperationException("Not implemented: Can't convert " + this.unit + " to pixel");
         }
      }
   }

   public float resolveWidth(@NotNull MeasureContext context) {
      return this.unit == Unit.PERCENTAGE ? this.value * context.viewWidth() / 100.0F : this.resolveNonPercentage(context);
   }

   public float resolveHeight(@NotNull MeasureContext context) {
      return this.unit == Unit.PERCENTAGE ? this.value * context.viewHeight() / 100.0F : this.resolveNonPercentage(context);
   }

   public float resolveLength(@NotNull MeasureContext context) {
      return this.unit == Unit.PERCENTAGE ? this.value / 100.0F * context.normedDiagonalLength() : this.resolveNonPercentage(context);
   }

   public float resolveFontSize(@NotNull MeasureContext context) {
      return this.unit == Unit.PERCENTAGE ? this.value / 100.0F * context.em() : this.resolveNonPercentage(context);
   }

   public String toString() {
      return this.value + this.unit.suffix();
   }

   public boolean isZero() {
      return this.value == 0.0F;
   }

   public float raw() {
      return this.value;
   }

   @NotNull
   public Unit unit() {
      return this.unit;
   }

   public boolean isUnspecified() {
      return isUnspecified(this.raw());
   }

   public boolean isSpecified() {
      return !this.isUnspecified();
   }

   @NotNull
   public Length coerceNonNegative() {
      return this.isSpecified() && this.raw() <= 0.0F ? ZERO : this;
   }

   public Length orElseIfUnspecified(float value) {
      return this.isUnspecified() ? Unit.Raw.valueOf(value) : this;
   }

   public Length multiply(float scalingFactor) {
      return scalingFactor == 0.0F ? ZERO : new Length(this.unit(), scalingFactor * this.raw());
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof Length)) {
         return false;
      } else {
         Length length = (Length)o;
         return this.unit == length.unit && Float.compare(length.value, this.value) == 0;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.unit, this.value});
   }

   static {
      UNSPECIFIED = new Length(Unit.Raw, Float.NaN);
      ZERO = new Length(Unit.Raw, 0.0F);
   }
}
