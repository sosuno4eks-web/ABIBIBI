package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.parser.SeparatorMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FontParser {
   private FontParser() {
   }

   @NotNull
   public static AttributeFontSpec parseFontSpec(@NotNull AttributeNode node) {
      String[] fontFamilies = node.getStringList("font-family", SeparatorMode.COMMA_ONLY);
      FontWeight weight = parseWeight(node);
      FontSize size = parseFontSize(node);
      Length sizeAdjust = parseSizeAdjust(node);
      FontStyle style = parseFontStyle(node);
      float stretch = parseStretch(node);
      return new AttributeFontSpec(fontFamilies, style, sizeAdjust, stretch, size, weight);
   }

   @Nullable
   public static FontWeight parseWeight(@NotNull AttributeNode node) {
      String fontWeightKey = "font-weight";
      FontWeight weight = (FontWeight)node.getEnum("font-weight", PredefinedFontWeight.Number);
      if (weight == PredefinedFontWeight.Number) {
         if (node.hasAttribute("font-weight")) {
            weight = new NumberFontWeight(Math.max(1.0F, Math.min(1000.0F, node.getFloat("font-weight", 400.0F))));
         } else {
            weight = null;
         }
      }

      return (FontWeight)weight;
   }

   public static float parseStretch(@NotNull AttributeNode node) {
      FontStretch stretch = (FontStretch)node.getEnum("font-stretch", FontStretch.Percentage);
      return stretch == FontStretch.Percentage ? node.parser().parsePercentage(node.getValue("font-stretch"), Float.NaN, 0.5F, 2.0F) : stretch.percentage();
   }

   @Nullable
   public static FontSize parseFontSize(@NotNull AttributeNode node) {
      FontSize fontSize = (FontSize)node.getEnum("font-size", PredefinedFontSize.Number);
      if (fontSize == PredefinedFontSize.Number) {
         Length size = node.getLength("font-size", Length.UNSPECIFIED);
         fontSize = size.isSpecified() ? new LengthFontSize(size) : null;
      }

      return (FontSize)fontSize;
   }

   @Nullable
   public static Length parseSizeAdjust(@NotNull AttributeNode node) {
      return node.getLength("font-size-adjust");
   }

   @Nullable
   public static FontStyle parseFontStyle(@NotNull AttributeNode node) {
      FontStyle style = null;
      String styleStr = node.getValue("font-style");
      if ("normal".equalsIgnoreCase(styleStr)) {
         style = FontStyle.normal();
      } else if ("italic".equalsIgnoreCase(styleStr)) {
         style = FontStyle.italic();
      } else if (styleStr != null && styleStr.startsWith("oblique")) {
         String[] comps = styleStr.split(" ", 2);
         if (comps.length == 2) {
            style = new FontStyle.Oblique(node.parser().parseAngle(comps[1], FontStyle.Oblique.DEFAULT_ANGLE));
         } else {
            style = FontStyle.oblique();
         }
      }

      return (FontStyle)style;
   }
}
