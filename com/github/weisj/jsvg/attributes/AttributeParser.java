package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.geometry.size.AngleUnit;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.parser.SeparatorMode;
import com.github.weisj.jsvg.util.ParserBase;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AttributeParser {
   @NotNull
   private final PaintParser paintParser;
   private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s");
   private static final Pattern TRANSFORM_PATTERN = Pattern.compile("\\w+\\([^)]*\\)");

   public AttributeParser(@NotNull PaintParser paintParser) {
      this.paintParser = paintParser;
   }

   @Contract("_,!null -> !null")
   @Nullable
   public Length parseLength(@Nullable String value, @Nullable Length fallback) {
      if (value == null) {
         return fallback;
      } else {
         Unit unit = Unit.Raw;
         String lower = value.toLowerCase(Locale.ENGLISH);
         Unit[] var5 = Unit.units();
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            Unit u = var5[var7];
            if (lower.endsWith(u.suffix())) {
               unit = u;
               break;
            }
         }

         String str = lower.substring(0, lower.length() - unit.suffix().length());

         try {
            return unit.valueOf(Float.parseFloat(str));
         } catch (NumberFormatException var9) {
            return fallback;
         }
      }
   }

   public float parsePercentage(@Nullable String value, float fallback) {
      return this.parsePercentage(value, fallback, 0.0F, 1.0F);
   }

   public float parsePercentage(@Nullable String value, float fallback, float min, float max) {
      if (value == null) {
         return fallback;
      } else {
         try {
            float parsed;
            if (value.endsWith("%")) {
               parsed = Float.parseFloat(value.substring(0, value.length() - 1)) / 100.0F;
            } else {
               parsed = Float.parseFloat(value);
            }

            return Math.max(min, Math.min(max, parsed));
         } catch (NumberFormatException var6) {
            return fallback;
         }
      }
   }

   public int parseInt(@Nullable String value, int fallback) {
      if (value == null) {
         return fallback;
      } else {
         try {
            return Integer.parseInt(value);
         } catch (NumberFormatException var4) {
            return fallback;
         }
      }
   }

   public float parseFloat(@Nullable String value, float fallback) {
      if (value == null) {
         return fallback;
      } else {
         try {
            return Float.parseFloat(value);
         } catch (NumberFormatException var4) {
            return fallback;
         }
      }
   }

   public double parseDouble(@Nullable String value, double fallback) {
      if (value == null) {
         return fallback;
      } else {
         try {
            return Double.parseDouble(value);
         } catch (NumberFormatException var5) {
            return fallback;
         }
      }
   }

   public float parseAngle(@Nullable String value, float fallback) {
      if (value == null) {
         return fallback;
      } else {
         AngleUnit unit = AngleUnit.Raw;
         String lower = value.toLowerCase(Locale.ENGLISH);
         AngleUnit[] var5 = AngleUnit.units();
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            AngleUnit u = var5[var7];
            if (lower.endsWith(u.suffix())) {
               unit = u;
               break;
            }
         }

         String str = lower.substring(0, lower.length() - unit.suffix().length());

         try {
            return unit.toRadians(Float.parseFloat(str), AngleUnit.Deg);
         } catch (NumberFormatException var9) {
            return fallback;
         }
      }
   }

   public Length[] parseLengthList(@Nullable String value) {
      if (value != null && value.equalsIgnoreCase("none")) {
         return new Length[0];
      } else {
         String[] values = this.parseStringList(value, SeparatorMode.COMMA_AND_WHITESPACE);
         Length[] ret = new Length[values.length];

         for(int i = 0; i < ret.length; ++i) {
            Length length = this.parseLength(values[i], (Length)null);
            if (length == null) {
               return new Length[0];
            }

            ret[i] = length;
         }

         return ret;
      }
   }

   public float[] parseFloatList(@Nullable String value) {
      String[] values = this.parseStringList(value, SeparatorMode.COMMA_AND_WHITESPACE);
      float[] ret = new float[values.length];

      for(int i = 0; i < ret.length; ++i) {
         ret[i] = this.parseFloat(values[i], 0.0F);
      }

      return ret;
   }

   public double[] parseDoubleList(@Nullable String value) {
      if (value != null && !value.isEmpty()) {
         List<Double> list = new ArrayList();
         ParserBase base = new ParserBase(value, 0);

         while(base.hasNext()) {
            list.add(base.nextDouble());
            base.consumeWhiteSpaceOrSeparator();
         }

         return list.stream().mapToDouble(Double::doubleValue).toArray();
      } else {
         return new double[0];
      }
   }

   @NotNull
   public String[] parseStringList(@Nullable String value, SeparatorMode separatorMode) {
      if (value != null && !value.isEmpty()) {
         List<String> list = new ArrayList();
         int max = value.length();
         int start = 0;
         int i = 0;

         for(boolean inWhiteSpace = false; i < max; ++i) {
            char c = value.charAt(i);
            if (Character.isWhitespace(c)) {
               if (!inWhiteSpace && separatorMode != SeparatorMode.COMMA_ONLY && i - start > 0) {
                  list.add(value.substring(start, i));
                  start = i + 1;
               }

               inWhiteSpace = true;
            } else {
               inWhiteSpace = false;
               if (c == ',' && separatorMode != SeparatorMode.WHITESPACE_ONLY) {
                  list.add(value.substring(start, i));
                  start = i + 1;
               }
            }
         }

         if (i - start > 0) {
            list.add(value.substring(start, i));
         }

         return (String[])list.toArray(new String[0]);
      } else {
         return new String[0];
      }
   }

   @Nullable
   public SVGPaint parsePaint(@Nullable String value, @NotNull AttributeNode attributeNode) {
      return this.paintParser.parsePaint(value, attributeNode);
   }

   @NotNull
   public <E extends Enum<E>> E parseEnum(@Nullable String value, @NotNull E fallback) {
      E e = this.parseEnum(value, fallback.getDeclaringClass());
      return e == null ? fallback : e;
   }

   @Nullable
   public <E extends Enum<E>> E parseEnum(@Nullable String value, @NotNull Class<E> enumType) {
      if (value == null) {
         return null;
      } else {
         Enum[] var3 = (Enum[])enumType.getEnumConstants();
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            E enumConstant = var3[var5];
            String name = enumConstant instanceof HasMatchName ? ((HasMatchName)enumConstant).matchName() : enumConstant.name();
            if (name.equalsIgnoreCase(value)) {
               return enumConstant;
            }
         }

         return null;
      }
   }

   @NotNull
   private String removeWhiteSpace(@NotNull String value) {
      return WHITESPACE_PATTERN.matcher(value).replaceAll("");
   }

   @Nullable
   public String parseUrl(@Nullable String value) {
      if (value == null) {
         return null;
      } else {
         return value.startsWith("url(") && value.endsWith(")") ? this.removeWhiteSpace(value.substring(4, value.length() - 1)) : this.removeWhiteSpace(value);
      }
   }

   @Nullable
   public AffineTransform parseTransform(@Nullable String value) {
      if (value == null) {
         return null;
      } else {
         Matcher transformMatcher = TRANSFORM_PATTERN.matcher(value);
         AffineTransform transform = new AffineTransform();

         while(transformMatcher.find()) {
            String group = transformMatcher.group();

            try {
               this.parseSingleTransform(group, transform);
            } catch (Exception var6) {
               throw new IllegalArgumentException("Illegal transform definition '" + value + "' encountered error while parsing '" + group + "'", var6);
            }
         }

         return transform;
      }
   }

   private void parseSingleTransform(@NotNull String value, @NotNull AffineTransform tx) {
      int first = value.indexOf(40);
      int last = value.lastIndexOf(41);
      String command = value.substring(0, value.indexOf(40)).toLowerCase(Locale.ENGLISH);
      double[] values = this.parseDoubleList(value.substring(first + 1, last));
      byte var8 = -1;
      switch(command.hashCode()) {
      case -1721943830:
         if (command.equals("translatex")) {
            var8 = 2;
         }
         break;
      case -1721943829:
         if (command.equals("translatey")) {
            var8 = 3;
         }
         break;
      case -1081239615:
         if (command.equals("matrix")) {
            var8 = 0;
         }
         break;
      case -925180581:
         if (command.equals("rotate")) {
            var8 = 7;
         }
         break;
      case -908189586:
         if (command.equals("scalex")) {
            var8 = 5;
         }
         break;
      case -908189585:
         if (command.equals("scaley")) {
            var8 = 6;
         }
         break;
      case 109250890:
         if (command.equals("scale")) {
            var8 = 4;
         }
         break;
      case 109493422:
         if (command.equals("skewx")) {
            var8 = 8;
         }
         break;
      case 109493423:
         if (command.equals("skewy")) {
            var8 = 9;
         }
         break;
      case 1052832078:
         if (command.equals("translate")) {
            var8 = 1;
         }
      }

      switch(var8) {
      case 0:
         tx.concatenate(new AffineTransform(values));
         break;
      case 1:
         if (values.length == 1) {
            tx.translate(values[0], 0.0D);
         } else {
            tx.translate(values[0], values[1]);
         }
         break;
      case 2:
         tx.translate(values[0], 0.0D);
         break;
      case 3:
         tx.translate(0.0D, values[0]);
         break;
      case 4:
         if (values.length == 1) {
            tx.scale(values[0], values[0]);
         } else {
            tx.scale(values[0], values[1]);
         }
         break;
      case 5:
         tx.scale(values[0], 1.0D);
         break;
      case 6:
         tx.scale(1.0D, values[0]);
         break;
      case 7:
         if (values.length > 2) {
            tx.rotate(Math.toRadians(values[0]), values[1], values[2]);
         } else {
            tx.rotate(Math.toRadians(values[0]));
         }
         break;
      case 8:
         tx.shear(Math.tan(Math.toRadians(values[0])), 0.0D);
         break;
      case 9:
         tx.shear(0.0D, Math.tan(Math.toRadians(values[0])));
         break;
      default:
         throw new IllegalArgumentException("Unknown transform type: " + command);
      }

   }

   @NotNull
   public PaintParser paintParser() {
      return this.paintParser;
   }
}
