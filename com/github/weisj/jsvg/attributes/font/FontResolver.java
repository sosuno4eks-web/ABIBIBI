package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.google.errorprone.annotations.Immutable;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public final class FontResolver {
   private FontResolver() {
   }

   public static void clearFontCache() {
      FontResolver.FontCache.INSTANCE.cache.clear();
   }

   @NotNull
   public static SVGFont resolve(@NotNull MeasurableFontSpec fontSpec, @NotNull MeasureContext measureContext) {
      FontResolver.FontCache.CacheKey key = new FontResolver.FontCache.CacheKey(fontSpec, measureContext);
      SVGFont cachedFont = (SVGFont)FontResolver.FontCache.INSTANCE.cache.get(key);
      if (cachedFont != null) {
         return cachedFont;
      } else {
         SVGFont resolvedFont = resolveWithoutCache(fontSpec, measureContext);
         FontResolver.FontCache.INSTANCE.cache.put(key, resolvedFont);
         return resolvedFont;
      }
   }

   @NotNull
   public static SVGFont resolveWithoutCache(@NotNull MeasurableFontSpec fontSpec, @NotNull MeasureContext measureContext) {
      String family = findSupportedFontFamily(fontSpec);
      FontStyle style = fontSpec.style();
      float weight = cssWeightToAwtWeight((float)fontSpec.currentWeight());
      float size = fontSpec.effectiveSize(measureContext);
      float stretch = fontSpec.stretch();
      Map<Attribute, Object> attributes = new HashMap(5, 1.0F);
      attributes.put(TextAttribute.FAMILY, family);
      attributes.put(TextAttribute.SIZE, size);
      attributes.put(TextAttribute.WEIGHT, weight);
      attributes.put(TextAttribute.WIDTH, stretch);
      if (style instanceof FontStyle.Normal) {
         attributes.put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
      } else if (style instanceof FontStyle.Italic) {
         attributes.put(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE);
      } else {
         AffineTransform transform = style.transform();
         if (transform != null) {
            attributes.put(TextAttribute.TRANSFORM, transform);
         }
      }

      Font font = new Font(attributes);
      return new AWTSVGFont(font);
   }

   private static float cssWeightToAwtWeight(float weight) {
      int normalWeight = 400;
      float currentWeight = weight;
      if (weight > (float)normalWeight) {
         float awtWeightCompensationFactor = TextAttribute.WEIGHT_BOLD * (float)normalWeight / 700.0F;
         currentWeight = weight * awtWeightCompensationFactor;
      }

      return currentWeight / (float)normalWeight;
   }

   @NotNull
   private static String findSupportedFontFamily(@NotNull MeasurableFontSpec fontSpec) {
      String[] families = fontSpec.families();
      String[] var2 = families;
      int var3 = families.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String family = var2[var4];
         if (FontResolver.FontFamiliesCache.INSTANCE.isSupportedFontFamily(family)) {
            return family;
         }
      }

      return "Default";
   }

   @NotNull
   public static List<String> supportedFonts() {
      return Collections.unmodifiableList(Arrays.asList(FontResolver.FontFamiliesCache.INSTANCE.supportedFonts));
   }

   private static enum FontCache {
      INSTANCE;

      private final HashMap<FontResolver.FontCache.CacheKey, SVGFont> cache = new HashMap();

      // $FF: synthetic method
      private static FontResolver.FontCache[] $values() {
         return new FontResolver.FontCache[]{INSTANCE};
      }

      @Immutable
      private static final class CacheKey {
         @NotNull
         private final MeasurableFontSpec spec;
         @NotNull
         private final MeasureContext context;

         private CacheKey(@NotNull MeasurableFontSpec spec, @NotNull MeasureContext context) {
            this.spec = spec;
            this.context = context;
         }

         public String toString() {
            return "CacheKey{spec=" + this.spec + ", context=" + this.context + '}';
         }

         public boolean equals(Object o) {
            if (this == o) {
               return true;
            } else if (!(o instanceof FontResolver.FontCache.CacheKey)) {
               return false;
            } else {
               FontResolver.FontCache.CacheKey cacheKey = (FontResolver.FontCache.CacheKey)o;
               return this.spec.equals(cacheKey.spec) && this.context.equals(cacheKey.context);
            }
         }

         public int hashCode() {
            return Objects.hash(new Object[]{this.spec, this.context});
         }

         // $FF: synthetic method
         CacheKey(MeasurableFontSpec x0, MeasureContext x1, Object x2) {
            this(x0, x1);
         }
      }
   }

   private static enum FontFamiliesCache {
      INSTANCE;

      @NotNull
      private final String[] supportedFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

      boolean isSupportedFontFamily(@NotNull String fontName) {
         String[] var2 = this.supportedFonts;
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            String supportedFont = var2[var4];
            if (supportedFont.equalsIgnoreCase(fontName)) {
               return true;
            }
         }

         return false;
      }

      // $FF: synthetic method
      private static FontResolver.FontFamiliesCache[] $values() {
         return new FontResolver.FontFamiliesCache[]{INSTANCE};
      }
   }
}
