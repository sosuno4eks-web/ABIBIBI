package com.github.weisj.jsvg.attributes.paint;

import com.github.weisj.jsvg.attributes.AttributeParser;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.parser.SeparatorMode;
import java.awt.Color;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DefaultPaintParser implements PaintParser {
   private static final Logger LOGGER = Logger.getLogger(DefaultPaintParser.class.getName());

   @Nullable
   public Color parseColor(@NotNull String value, @NotNull AttributeNode node) {
      if (value.isEmpty()) {
         return null;
      } else {
         try {
            if (value.charAt(0) == '#') {
               int rgba = -16777216;
               switch(value.length()) {
               case 4:
                  rgba = this.parseHex(new char[]{value.charAt(1), value.charAt(1), value.charAt(2), value.charAt(2), value.charAt(3), value.charAt(3), 'F', 'F'});
                  break;
               case 5:
                  rgba = this.parseHex(new char[]{value.charAt(1), value.charAt(1), value.charAt(2), value.charAt(2), value.charAt(3), value.charAt(3), value.charAt(4), value.charAt(4)});
               case 6:
               case 8:
               default:
                  break;
               case 7:
                  rgba = this.parseHex(new char[]{value.charAt(1), value.charAt(2), value.charAt(3), value.charAt(4), value.charAt(5), value.charAt(6), 'F', 'F'});
                  break;
               case 9:
                  rgba = this.parseHex(value.substring(1).toCharArray());
               }

               return new Color(rgba, true);
            } else if (value.length() > 3 && value.substring(0, 3).equalsIgnoreCase("rgb")) {
               boolean isRgba = value.length() > 4 && (value.charAt(3) == 'a' || value.charAt(3) == 'A');
               int startIndex = isRgba ? 5 : 4;
               String[] values = node.parser().parseStringList(value.substring(startIndex, value.length() - 1), SeparatorMode.COMMA_AND_WHITESPACE);
               isRgba = isRgba && values.length >= 4;
               AttributeParser parser = node.parser();
               return new Color(this.parseColorComponent(values[0], false, parser), this.parseColorComponent(values[1], false, parser), this.parseColorComponent(values[2], false, parser), isRgba ? this.parseColorComponent(values[3], true, parser) : 255);
            } else {
               return (Color)DefaultPaintParser.ColorLookup.colorMap().get(value.toLowerCase(Locale.ENGLISH));
            }
         } catch (Exception var7) {
            LOGGER.log(Level.INFO, var7.getMessage(), var7);
            return null;
         }
      }
   }

   @Nullable
   public SVGPaint parsePaint(@Nullable String value, @NotNull AttributeNode node) {
      if (value == null) {
         return null;
      } else {
         String lower = value.toLowerCase(Locale.ENGLISH);
         if (!"none".equals(lower) && !"transparent".equals(lower)) {
            if ("currentcolor".equals(lower)) {
               return SVGPaint.CURRENT_COLOR;
            } else if ("context-fill".equals(lower)) {
               return SVGPaint.CONTEXT_FILL;
            } else if ("context-stroke".equals(lower)) {
               return SVGPaint.CONTEXT_STROKE;
            } else {
               Color color = this.parseColor(lower, node);
               return color == null ? null : new AwtSVGPaint(color);
            }
         } else {
            return SVGPaint.NONE;
         }
      }
   }

   private int parseColorComponent(String value, boolean percentage, @NotNull AttributeParser parser) {
      float parsed;
      if (value.endsWith("%")) {
         parsed = parser.parseFloat(value.substring(0, value.length() - 1), 0.0F);
         parsed /= 100.0F;
         parsed *= 255.0F;
      } else {
         parsed = parser.parseFloat(value, 0.0F);
         if (percentage) {
            parsed *= 255.0F;
         }
      }

      return Math.min(255, Math.max(0, (int)parsed));
   }

   private int parseHex(char[] chars) {
      int r = this.charToColorInt(chars[0]) << 4 | this.charToColorInt(chars[1]);
      int g = this.charToColorInt(chars[2]) << 4 | this.charToColorInt(chars[3]);
      int b = this.charToColorInt(chars[4]) << 4 | this.charToColorInt(chars[5]);
      int a = this.charToColorInt(chars[6]) << 4 | this.charToColorInt(chars[7]);
      return (a & 255) << 24 | (r & 255) << 16 | (g & 255) << 8 | b & 255;
   }

   private int charToColorInt(char c) {
      if (c >= '0' && c <= '9') {
         return c - 48;
      } else if (c >= 'a' && c <= 'z') {
         return c - 97 + 10;
      } else {
         return c >= 'A' && c <= 'Z' ? c - 65 + 10 : 0;
      }
   }

   private static final class ColorLookup {
      private static Map<String, Color> colorMap;

      private static Map<String, Color> colorMap() {
         if (colorMap != null) {
            return colorMap;
         } else {
            colorMap = new HashMap(143);
            colorMap.put("aliceblue", new Color(15792383));
            colorMap.put("antiquewhite", new Color(16444375));
            colorMap.put("aqua", new Color(65535));
            colorMap.put("aquamarine", new Color(8388564));
            colorMap.put("azure", new Color(15794175));
            colorMap.put("beige", new Color(16119260));
            colorMap.put("bisque", new Color(16770244));
            colorMap.put("black", new Color(0));
            colorMap.put("blanchedalmond", new Color(16772045));
            colorMap.put("blue", new Color(255));
            colorMap.put("blueviolet", new Color(9055202));
            colorMap.put("brown", new Color(10824234));
            colorMap.put("burlywood", new Color(14596231));
            colorMap.put("cadetblue", new Color(6266528));
            colorMap.put("chartreuse", new Color(8388352));
            colorMap.put("chocolate", new Color(13789470));
            colorMap.put("coral", new Color(16744272));
            colorMap.put("cornflowerblue", new Color(6591981));
            colorMap.put("cornsilk", new Color(16775388));
            colorMap.put("crimson", new Color(14423100));
            colorMap.put("cyan", new Color(65535));
            colorMap.put("darkblue", new Color(139));
            colorMap.put("darkcyan", new Color(35723));
            colorMap.put("darkgoldenrod", new Color(12092939));
            colorMap.put("darkgray", new Color(11119017));
            colorMap.put("darkgrey", new Color(11119017));
            colorMap.put("darkgreen", new Color(25600));
            colorMap.put("darkkhaki", new Color(12433259));
            colorMap.put("darkmagenta", new Color(9109643));
            colorMap.put("darkolivegreen", new Color(5597999));
            colorMap.put("darkorange", new Color(16747520));
            colorMap.put("darkorchid", new Color(10040012));
            colorMap.put("darkred", new Color(9109504));
            colorMap.put("darksalmon", new Color(15308410));
            colorMap.put("darkseagreen", new Color(9419919));
            colorMap.put("darkslateblue", new Color(4734347));
            colorMap.put("darkslategray", new Color(3100495));
            colorMap.put("darkslategrey", new Color(3100495));
            colorMap.put("darkturquoise", new Color(52945));
            colorMap.put("darkviolet", new Color(9699539));
            colorMap.put("deeppink", new Color(16716947));
            colorMap.put("deepskyblue", new Color(49151));
            colorMap.put("dimgray", new Color(6908265));
            colorMap.put("dimgrey", new Color(6908265));
            colorMap.put("dodgerblue", new Color(2003199));
            colorMap.put("feldspar", new Color(13734517));
            colorMap.put("firebrick", new Color(11674146));
            colorMap.put("floralwhite", new Color(16775920));
            colorMap.put("forestgreen", new Color(2263842));
            colorMap.put("fuchsia", new Color(16711935));
            colorMap.put("gainsboro", new Color(14474460));
            colorMap.put("ghostwhite", new Color(16316671));
            colorMap.put("gold", new Color(16766720));
            colorMap.put("goldenrod", new Color(14329120));
            colorMap.put("gray", new Color(8421504));
            colorMap.put("grey", new Color(8421504));
            colorMap.put("green", new Color(32768));
            colorMap.put("greenyellow", new Color(11403055));
            colorMap.put("honeydew", new Color(15794160));
            colorMap.put("hotpink", new Color(16738740));
            colorMap.put("indianred", new Color(13458524));
            colorMap.put("indigo", new Color(4915330));
            colorMap.put("ivory", new Color(16777200));
            colorMap.put("khaki", new Color(15787660));
            colorMap.put("lavender", new Color(15132410));
            colorMap.put("lavenderblush", new Color(16773365));
            colorMap.put("lawngreen", new Color(8190976));
            colorMap.put("lemonchiffon", new Color(16775885));
            colorMap.put("lightblue", new Color(11393254));
            colorMap.put("lightcoral", new Color(15761536));
            colorMap.put("lightcyan", new Color(14745599));
            colorMap.put("lightgoldenrodyellow", new Color(16448210));
            colorMap.put("lightgrey", new Color(13882323));
            colorMap.put("lightgreen", new Color(9498256));
            colorMap.put("lightpink", new Color(16758465));
            colorMap.put("lightsalmon", new Color(16752762));
            colorMap.put("lightseagreen", new Color(2142890));
            colorMap.put("lightskyblue", new Color(8900346));
            colorMap.put("lightslateblue", new Color(8679679));
            colorMap.put("lightslategray", new Color(7833753));
            colorMap.put("lightslategrey", new Color(7833753));
            colorMap.put("lightsteelblue", new Color(11584734));
            colorMap.put("lightyellow", new Color(16777184));
            colorMap.put("lime", new Color(65280));
            colorMap.put("limegreen", new Color(3329330));
            colorMap.put("linen", new Color(16445670));
            colorMap.put("magenta", new Color(16711935));
            colorMap.put("maroon", new Color(8388608));
            colorMap.put("mediumaquamarine", new Color(6737322));
            colorMap.put("mediumblue", new Color(205));
            colorMap.put("mediumorchid", new Color(12211667));
            colorMap.put("mediumpurple", new Color(9662680));
            colorMap.put("mediumseagreen", new Color(3978097));
            colorMap.put("mediumslateblue", new Color(8087790));
            colorMap.put("mediumspringgreen", new Color(64154));
            colorMap.put("mediumturquoise", new Color(4772300));
            colorMap.put("mediumvioletred", new Color(13047173));
            colorMap.put("midnightblue", new Color(1644912));
            colorMap.put("mintcream", new Color(16121850));
            colorMap.put("mistyrose", new Color(16770273));
            colorMap.put("moccasin", new Color(16770229));
            colorMap.put("navajowhite", new Color(16768685));
            colorMap.put("navy", new Color(128));
            colorMap.put("oldlace", new Color(16643558));
            colorMap.put("olive", new Color(8421376));
            colorMap.put("olivedrab", new Color(7048739));
            colorMap.put("orange", new Color(16753920));
            colorMap.put("orangered", new Color(16729344));
            colorMap.put("orchid", new Color(14315734));
            colorMap.put("palegoldenrod", new Color(15657130));
            colorMap.put("palegreen", new Color(10025880));
            colorMap.put("paleturquoise", new Color(11529966));
            colorMap.put("palevioletred", new Color(14184595));
            colorMap.put("papayawhip", new Color(16773077));
            colorMap.put("peachpuff", new Color(16767673));
            colorMap.put("peru", new Color(13468991));
            colorMap.put("pink", new Color(16761035));
            colorMap.put("plum", new Color(14524637));
            colorMap.put("powderblue", new Color(11591910));
            colorMap.put("purple", new Color(8388736));
            colorMap.put("red", new Color(16711680));
            colorMap.put("rosybrown", new Color(12357519));
            colorMap.put("royalblue", new Color(4286945));
            colorMap.put("saddlebrown", new Color(9127187));
            colorMap.put("salmon", new Color(16416882));
            colorMap.put("sandybrown", new Color(16032864));
            colorMap.put("seagreen", new Color(3050327));
            colorMap.put("seashell", new Color(16774638));
            colorMap.put("sienna", new Color(10506797));
            colorMap.put("silver", new Color(12632256));
            colorMap.put("skyblue", new Color(8900331));
            colorMap.put("slateblue", new Color(6970061));
            colorMap.put("slategray", new Color(7372944));
            colorMap.put("slategrey", new Color(7372944));
            colorMap.put("snow", new Color(16775930));
            colorMap.put("springgreen", new Color(65407));
            colorMap.put("steelblue", new Color(4620980));
            colorMap.put("tan", new Color(13808780));
            colorMap.put("teal", new Color(32896));
            colorMap.put("thistle", new Color(14204888));
            colorMap.put("tomato", new Color(16737095));
            colorMap.put("turquoise", new Color(4251856));
            colorMap.put("violet", new Color(15631086));
            colorMap.put("violetred", new Color(13639824));
            colorMap.put("wheat", new Color(16113331));
            colorMap.put("white", new Color(16777215));
            colorMap.put("whitesmoke", new Color(16119285));
            colorMap.put("yellow", new Color(16776960));
            colorMap.put("yellowgreen", new Color(10145074));
            colorMap = Collections.unmodifiableMap(colorMap);
            return colorMap;
         }
      }
   }
}
