package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.attributes.AttributeParser;
import com.github.weisj.jsvg.attributes.ViewBox;
import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.nodes.ClipPath;
import com.github.weisj.jsvg.nodes.Mask;
import com.github.weisj.jsvg.nodes.filter.Filter;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.parser.css.StyleSheet;
import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AttributeNode {
   private static final Length TopOrLeft;
   private static final Length Center;
   private static final Length BottomOrRight;
   @NotNull
   private final String tagName;
   @NotNull
   private final Map<String, String> attributes;
   @Nullable
   private final AttributeNode parent;
   @NotNull
   private final Map<String, Object> namedElements;
   @NotNull
   private final List<StyleSheet> styleSheets;
   @NotNull
   private final LoadHelper loadHelper;

   public AttributeNode(@NotNull String tagName, @NotNull Map<String, String> attributes, @Nullable AttributeNode parent, @NotNull Map<String, Object> namedElements, @NotNull List<StyleSheet> styleSheets, @NotNull LoadHelper loadHelper) {
      this.tagName = tagName;
      this.attributes = attributes;
      this.parent = parent;
      this.namedElements = namedElements;
      this.styleSheets = styleSheets;
      this.loadHelper = loadHelper;
   }

   void prepareForNodeBuilding(@NotNull ParsedElement parsedElement) {
      Map<String, String> styleSheetAttributes = new HashMap();
      preprocessAttributes(this.attributes, styleSheetAttributes);
      List<StyleSheet> sheets = this.styleSheets();

      for(int i = sheets.size() - 1; i >= 0; --i) {
         StyleSheet sheet = (StyleSheet)sheets.get(i);
         sheet.forEachMatchingRule(parsedElement, (p) -> {
            if (!styleSheetAttributes.containsKey(p.name())) {
               styleSheetAttributes.put(p.name(), p.value());
            }

         });
      }

      this.attributes.putAll(styleSheetAttributes);
   }

   private static boolean isBlank(@NotNull String s) {
      return s.trim().isEmpty();
   }

   private static void preprocessAttributes(@NotNull Map<String, String> attributes, @NotNull Map<String, String> styleAttributes) {
      String styleStr = (String)attributes.get("style");
      if (styleStr != null && !isBlank(styleStr)) {
         String[] styles = styleStr.split(";");
         String[] var4 = styles;
         int var5 = styles.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String style = var4[var6];
            if (!isBlank(style)) {
               String[] styleDef = style.split(":", 2);
               styleAttributes.put(styleDef[0].trim().toLowerCase(Locale.ENGLISH), styleDef[1].trim());
            }
         }
      }

   }

   @NotNull
   Map<String, Object> namedElements() {
      return this.namedElements;
   }

   @NotNull
   List<StyleSheet> styleSheets() {
      return this.styleSheets;
   }

   @Nullable
   private <T> T getElementById(@NotNull Class<T> type, @Nullable String id) {
      if (id == null) {
         return null;
      } else {
         Object node = this.namedElements.get(id);
         if (node instanceof ParsedElement) {
            node = ((ParsedElement)node).nodeEnsuringBuildStatus();
         }

         return type.isInstance(node) ? type.cast(node) : null;
      }
   }

   @Nullable
   private <T> T getElementByUrl(@NotNull Class<T> type, @Nullable String value) {
      String url = this.loadHelper.attributeParser().parseUrl(value);
      if (url != null && url.startsWith("#")) {
         url = url.substring(1);
      }

      return this.getElementById(type, url);
   }

   @Nullable
   public <T> T getElementByHref(@NotNull Class<T> type, @Nullable String value) {
      return value == null ? null : this.getElementByUrl(type, value);
   }

   @Nullable
   public <T> T getElementByHref(@NotNull Class<T> type, @NotNull Category category, @Nullable String value) {
      T element = this.getElementByHref(type, value);
      if (element == null) {
         return null;
      } else {
         Category[] var5 = ((ElementCategories)element.getClass().getAnnotation(ElementCategories.class)).value();
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            Category cat = var5[var7];
            if (cat == category) {
               return element;
            }
         }

         return null;
      }
   }

   @NotNull
   public Map<String, String> attributes() {
      return this.attributes;
   }

   @NotNull
   public String tagName() {
      return this.tagName;
   }

   public boolean tagIsOneOf(@NotNull String... tags) {
      String[] var2 = tags;
      int var3 = tags.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String tag = var2[var4];
         if (this.tagName.equals(tag)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   public AttributeNode parent() {
      return this.parent;
   }

   @Nullable
   public String getValue(@NotNull String key) {
      return (String)this.attributes.get(key);
   }

   @NotNull
   public Color getColor(@NotNull String key) {
      return this.getColor(key, PaintParser.DEFAULT_COLOR);
   }

   @Contract("_,!null -> !null")
   @Nullable
   public Color getColor(@NotNull String key, @Nullable Color fallback) {
      String value = this.getValue(key);
      if (value == null) {
         return fallback;
      } else {
         Color c = this.loadHelper.attributeParser().paintParser().parseColor(value.toLowerCase(Locale.ENGLISH), this);
         return c != null ? c : fallback;
      }
   }

   @NotNull
   public SVGPaint getPaint(@NotNull String key, @NotNull SVGPaint fallback) {
      SVGPaint paint = this.getPaint(key);
      return paint != null ? paint : fallback;
   }

   @Nullable
   public SVGPaint getPaint(@NotNull String key) {
      String value = this.getValue(key);
      SVGPaint paint = (SVGPaint)this.getElementByUrl(SVGPaint.class, value);
      return paint != null ? paint : this.loadHelper.attributeParser().parsePaint(value, this);
   }

   @Nullable
   public Length getLength(@NotNull String key) {
      return this.getLengthInternal(key, (Length)null);
   }

   @NotNull
   public Length getLength(@NotNull String key, float fallback) {
      return this.getLength(key, Unit.Raw.valueOf(fallback));
   }

   @NotNull
   public Length getLength(@NotNull String key, @NotNull Length fallback) {
      return this.getLengthInternal(key, fallback);
   }

   @Contract("_,!null -> !null")
   @Nullable
   private Length getLengthInternal(@NotNull String key, @Nullable Length fallback) {
      return this.loadHelper.attributeParser().parseLength(this.getValue(key), fallback);
   }

   @NotNull
   public Length getHorizontalReferenceLength(@NotNull String key) {
      return this.parseReferenceLength(key, "left", "right");
   }

   @NotNull
   public Length getVerticalReferenceLength(@NotNull String key) {
      return this.parseReferenceLength(key, "top", "bottom");
   }

   @NotNull
   private Length parseReferenceLength(@NotNull String key, @NotNull String topLeft, @NotNull String bottomRight) {
      String value = this.getValue(key);
      if (topLeft.equals(value)) {
         return TopOrLeft;
      } else if ("center".equals(value)) {
         return Center;
      } else {
         return bottomRight.equals(value) ? BottomOrRight : this.loadHelper.attributeParser().parseLength(value, Length.ZERO);
      }
   }

   public float getPercentage(@NotNull String key, float fallback) {
      return this.loadHelper.attributeParser().parsePercentage(this.getValue(key), fallback);
   }

   @NotNull
   public Length[] getLengthList(@NotNull String key) {
      return this.loadHelper.attributeParser().parseLengthList(this.getValue(key));
   }

   public float[] getFloatList(@NotNull String key) {
      return this.loadHelper.attributeParser().parseFloatList(this.getValue(key));
   }

   public double[] getDoubleList(@NotNull String key) {
      return this.loadHelper.attributeParser().parseDoubleList(this.getValue(key));
   }

   @NotNull
   public <E extends Enum<E>> E getEnum(@NotNull String key, @NotNull E fallback) {
      return this.loadHelper.attributeParser().parseEnum(this.getValue(key), fallback);
   }

   @Nullable
   public <E extends Enum<E>> E getEnumNullable(@NotNull String key, @NotNull Class<E> enumType) {
      return this.loadHelper.attributeParser().parseEnum(this.getValue(key), enumType);
   }

   @Nullable
   public ClipPath getClipPath() {
      return (ClipPath)this.getElementByUrl(ClipPath.class, this.getValue("clip-path"));
   }

   @Nullable
   public Mask getMask() {
      return (Mask)this.getElementByUrl(Mask.class, this.getValue("mask"));
   }

   @Nullable
   public Filter getFilter() {
      return (Filter)this.getElementByUrl(Filter.class, this.getValue("filter"));
   }

   @NotNull
   public FilterChannelKey getFilterChannelKey(@NotNull String key, @NotNull DefaultFilterChannel fallback) {
      String in = this.getValue(key);
      return (FilterChannelKey)(in == null ? fallback : new FilterChannelKey.StringKey(in));
   }

   @Nullable
   public AffineTransform parseTransform(@NotNull String key) {
      return this.loadHelper.attributeParser().parseTransform(this.getValue(key));
   }

   public boolean hasAttribute(@NotNull String name) {
      return this.attributes.containsKey(name);
   }

   @NotNull
   public String[] getStringList(@NotNull String name) {
      return this.getStringList(name, SeparatorMode.COMMA_AND_WHITESPACE);
   }

   @NotNull
   public String[] getStringList(@NotNull String name, SeparatorMode separatorMode) {
      return this.loadHelper.attributeParser().parseStringList(this.getValue(name), separatorMode);
   }

   public float getFloat(@NotNull String name, float fallback) {
      return this.loadHelper.attributeParser().parseFloat(this.getValue(name), fallback);
   }

   public float getNonNegativeFloat(@NotNull String name, float fallback) {
      float value = this.getFloat(name, fallback);
      return Float.isFinite(value) && value < 0.0F ? fallback : value;
   }

   public int getInt(@NotNull String key, int fallback) {
      return this.loadHelper.attributeParser().parseInt(this.getValue(key), fallback);
   }

   @Nullable
   public String getHref() {
      String href = this.getValue("href");
      return href == null ? this.getValue("xlink:href") : href;
   }

   @Nullable
   public ViewBox getViewBox() {
      float[] viewBoxCords = this.getFloatList("viewBox");
      return viewBoxCords.length == 4 ? new ViewBox(viewBoxCords) : null;
   }

   @NotNull
   public AttributeParser parser() {
      return this.loadHelper.attributeParser();
   }

   @NotNull
   public ResourceLoader resourceLoader() {
      return this.loadHelper.resourceLoader();
   }

   static {
      TopOrLeft = new Length(Unit.PERCENTAGE, 0.0F);
      Center = new Length(Unit.PERCENTAGE, 50.0F);
      BottomOrRight = new Length(Unit.PERCENTAGE, 100.0F);
   }
}
