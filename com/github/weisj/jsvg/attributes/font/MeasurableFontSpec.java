package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
public final class MeasurableFontSpec extends FontSpec {
   @NotNull
   public static final String DEFAULT_FONT_FAMILY_NAME = "Default";
   private final int currentWeight;
   @NotNull
   private final Length currentSize;

   MeasurableFontSpec(@NotNull String[] families, @Nullable FontStyle style, @Nullable Length sizeAdjust, float stretch, int currentWeight, @NotNull Length currentSize) {
      super(families, style, sizeAdjust, stretch);
      this.currentWeight = currentWeight;
      this.currentSize = currentSize;
   }

   @NotNull
   public static MeasurableFontSpec createDefault() {
      return new MeasurableFontSpec(new String[]{"Default"}, FontStyle.normal(), (Length)null, FontStretch.Normal.percentage(), 400, Unit.Raw.valueOf(SVGFont.defaultFontSize()));
   }

   @NotNull
   public String[] families() {
      return this.families;
   }

   @NotNull
   public FontStyle style() {
      assert this.style != null;

      return this.style;
   }

   public float stretch() {
      return this.stretch;
   }

   public int currentWeight() {
      return this.currentWeight;
   }

   @NotNull
   public Length currentSize() {
      return this.currentSize;
   }

   public float effectiveSize(@NotNull MeasureContext context) {
      float emSize = this.currentSize().resolveFontSize(context);
      return this.sizeAdjust != null ? SVGFont.emFromEx(emSize * this.sizeAdjust.resolveFontSize(context)) : emSize;
   }

   @NotNull
   public MeasurableFontSpec withFontSize(@Nullable FontSize size, @Nullable Length sizeAdjust) {
      return size == null && sizeAdjust == null ? this : new MeasurableFontSpec(this.families, this.style, sizeAdjust != null ? sizeAdjust : this.sizeAdjust, this.stretch, this.currentWeight, size != null ? size.size(this.currentSize) : this.currentSize);
   }

   @NotNull
   public MeasurableFontSpec derive(@Nullable AttributeFontSpec other) {
      if (other == null) {
         return this;
      } else {
         String[] newFamilies = other.families != null && other.families.length > 0 ? other.families : this.families;
         FontStyle newStyle = other.style != null ? other.style : this.style;
         int newWeight = other.weight() != null ? other.weight().weight(this.currentWeight) : this.currentWeight;
         Length newSize = other.size() != null ? other.size().size(this.currentSize) : this.currentSize;
         Length newSizeAdjust = other.sizeAdjust != null ? other.sizeAdjust : this.sizeAdjust;
         float newStretch = Length.isSpecified(other.stretch) ? other.stretch : this.stretch;
         return new MeasurableFontSpec(newFamilies, newStyle, newSizeAdjust, newStretch, newWeight, newSize);
      }
   }

   public String toString() {
      return "MeasurableFontSpec{families=" + Arrays.toString(this.families) + ", style=" + this.style + ", sizeAdjust=" + this.sizeAdjust + ", stretch=" + this.stretch + ", currentWeight=" + this.currentWeight + ", currentSize=" + this.currentSize + '}';
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof MeasurableFontSpec)) {
         return false;
      } else if (!super.equals(o)) {
         return false;
      } else {
         MeasurableFontSpec fontSpec = (MeasurableFontSpec)o;
         return this.currentWeight == fontSpec.currentWeight && this.currentSize.equals(fontSpec.currentSize);
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{super.hashCode(), this.currentWeight, this.currentSize});
   }
}
