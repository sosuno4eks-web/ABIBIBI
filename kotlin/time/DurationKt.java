package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class DurationKt {
   public static final int NANOS_IN_MILLIS = 1000000;
   public static final long MAX_NANOS = 4611686018426999999L;
   public static final long MAX_MILLIS = 4611686018427387903L;
   private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;

   @SinceKotlin(
      version = "1.6"
   )
   public static final long toDuration(int $this$toDuration, @NotNull DurationUnit unit) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      return unit.compareTo((Enum)DurationUnit.SECONDS) <= 0 ? durationOfNanos(DurationUnitKt.convertDurationUnitOverflow((long)$this$toDuration, unit, DurationUnit.NANOSECONDS)) : toDuration((long)$this$toDuration, unit);
   }

   @SinceKotlin(
      version = "1.6"
   )
   public static final long toDuration(long $this$toDuration, @NotNull DurationUnit unit) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      long maxNsInUnit = DurationUnitKt.convertDurationUnitOverflow(4611686018426999999L, DurationUnit.NANOSECONDS, unit);
      if (-maxNsInUnit <= $this$toDuration ? $this$toDuration <= maxNsInUnit : false) {
         return durationOfNanos(DurationUnitKt.convertDurationUnitOverflow($this$toDuration, unit, DurationUnit.NANOSECONDS));
      } else {
         long millis = DurationUnitKt.convertDurationUnit($this$toDuration, unit, DurationUnit.MILLISECONDS);
         return durationOfMillis(RangesKt.coerceIn(millis, -4611686018427387903L, 4611686018427387903L));
      }
   }

   @SinceKotlin(
      version = "1.6"
   )
   public static final long toDuration(double $this$toDuration, @NotNull DurationUnit unit) {
      Intrinsics.checkNotNullParameter(unit, "unit");
      double valueInNs = DurationUnitKt.convertDurationUnit($this$toDuration, unit, DurationUnit.NANOSECONDS);
      if (Double.isNaN(valueInNs)) {
         int var6 = false;
         String var9 = "Duration value cannot be NaN.";
         throw new IllegalArgumentException(var9.toString());
      } else {
         long nanos = MathKt.roundToLong(valueInNs);
         long var10000;
         if (-4611686018426999999L <= nanos ? nanos < 4611686018427000000L : false) {
            var10000 = durationOfNanos(nanos);
         } else {
            long millis = MathKt.roundToLong(DurationUnitKt.convertDurationUnit($this$toDuration, unit, DurationUnit.MILLISECONDS));
            var10000 = durationOfMillisNormalized(millis);
         }

         return var10000;
      }
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final long times_mvk6XK0/* $FF was: times-mvk6XK0*/(int $this$times_u2dmvk6XK0, long duration) {
      return Duration.times-UwyO8pc(duration, $this$times_u2dmvk6XK0);
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final long times_kIfJnKk/* $FF was: times-kIfJnKk*/(double $this$times_u2dkIfJnKk, long duration) {
      return Duration.times-UwyO8pc(duration, $this$times_u2dkIfJnKk);
   }

   private static final long parseDuration(String value, boolean strictIso) {
      int length = value.length();
      if (length == 0) {
         throw new IllegalArgumentException("The string is empty");
      } else {
         int index = 0;
         long result = Duration.Companion.getZERO-UwyO8pc();
         String infinityString = "Infinity";
         switch(value.charAt(index)) {
         case '+':
         case '-':
            ++index;
         case ',':
         default:
            boolean hasSign = index > 0;
            boolean isNegative = hasSign && StringsKt.startsWith$default((CharSequence)value, '-', false, 2, (Object)null);
            if (length <= index) {
               throw new IllegalArgumentException("No components");
            } else {
               boolean isTimeComponent;
               String component;
               boolean $i$f$substringWhile;
               int dotIndex;
               String whole;
               String var10000;
               boolean $i$f$skipWhile;
               String var10001;
               int i$iv$iv;
               char it;
               boolean var20;
               DurationUnit unit;
               boolean var33;
               byte var35;
               if (value.charAt(index) != 'P') {
                  if (strictIso) {
                     throw new IllegalArgumentException();
                  }

                  int var22 = length - index;
                  int var24 = infinityString.length();
                  if (StringsKt.regionMatches(value, index, infinityString, 0, Math.max(var22, var24), true)) {
                     result = Duration.Companion.getINFINITE-UwyO8pc();
                  } else {
                     DurationUnit prevUnit = null;
                     isTimeComponent = false;
                     boolean allowSpaces = !hasSign;
                     if (hasSign && value.charAt(index) == '(' && StringsKt.last((CharSequence)value) == ')') {
                        allowSpaces = true;
                        ++index;
                        --length;
                        if (index == length) {
                           throw new IllegalArgumentException("No components");
                        }
                     }

                     while(index < length) {
                        if (isTimeComponent && allowSpaces) {
                           component = value;
                           int $i$f$skipWhile = false;

                           int i$iv;
                           for(i$iv = index; i$iv < component.length(); ++i$iv) {
                              char it = component.charAt(i$iv);
                              var33 = false;
                              if (it != ' ') {
                                 break;
                              }
                           }

                           index = i$iv;
                        }

                        isTimeComponent = true;
                        $i$f$substringWhile = false;
                        whole = value;
                        $i$f$skipWhile = false;

                        for(i$iv$iv = index; i$iv$iv < whole.length(); ++i$iv$iv) {
                           it = whole.charAt(i$iv$iv);
                           var20 = false;
                           if (!('0' <= it ? it < ':' : false) && it != '.') {
                              break;
                           }
                        }

                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type java.lang.String");
                        var10000 = value.substring(index, i$iv$iv);
                        Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
                        component = var10000;
                        if (((CharSequence)component).length() == 0) {
                           throw new IllegalArgumentException();
                        }

                        index += component.length();
                        int $i$f$substringWhile = false;
                        String $this$skipWhile$iv$iv = value;
                        int $i$f$skipWhile = false;

                        int i$iv$iv;
                        for(i$iv$iv = index; i$iv$iv < $this$skipWhile$iv$iv.length(); ++i$iv$iv) {
                           char it = $this$skipWhile$iv$iv.charAt(i$iv$iv);
                           int var21 = false;
                           if (!('a' <= it ? it < '{' : false)) {
                              break;
                           }
                        }

                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type java.lang.String");
                        var10000 = value.substring(index, i$iv$iv);
                        Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
                        String unitName = var10000;
                        index += unitName.length();
                        unit = DurationUnitKt.durationUnitByShortName(unitName);
                        if (prevUnit != null && prevUnit.compareTo((Enum)unit) <= 0) {
                           throw new IllegalArgumentException("Unexpected order of duration components");
                        }

                        prevUnit = unit;
                        dotIndex = StringsKt.indexOf$default((CharSequence)component, '.', 0, false, 6, (Object)null);
                        if (dotIndex > 0) {
                           var35 = 0;
                           Intrinsics.checkNotNull(component, "null cannot be cast to non-null type java.lang.String");
                           var10000 = component.substring(var35, dotIndex);
                           Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
                           whole = var10000;
                           result = Duration.plus-LRDsOJo(result, toDuration(Long.parseLong(whole), unit));
                           Intrinsics.checkNotNull(component, "null cannot be cast to non-null type java.lang.String");
                           var10001 = component.substring(dotIndex);
                           Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
                           result = Duration.plus-LRDsOJo(result, toDuration(Double.parseDouble(var10001), unit));
                           if (index < length) {
                              throw new IllegalArgumentException("Fractional component must be last");
                           }
                        } else {
                           result = Duration.plus-LRDsOJo(result, toDuration(Long.parseLong(component), unit));
                        }
                     }
                  }
               } else {
                  ++index;
                  if (index == length) {
                     throw new IllegalArgumentException();
                  }

                  String nonDigitSymbols = "+-.";
                  isTimeComponent = false;
                  DurationUnit prevUnit = null;

                  while(true) {
                     while(index < length) {
                        if (value.charAt(index) == 'T') {
                           if (isTimeComponent) {
                              throw new IllegalArgumentException();
                           }

                           ++index;
                           if (index == length) {
                              throw new IllegalArgumentException();
                           }

                           isTimeComponent = true;
                        } else {
                           $i$f$substringWhile = false;
                           whole = value;
                           $i$f$skipWhile = false;

                           for(i$iv$iv = index; i$iv$iv < whole.length(); ++i$iv$iv) {
                              it = whole.charAt(i$iv$iv);
                              var20 = false;
                              if (!('0' <= it ? it < ':' : false) && !StringsKt.contains$default((CharSequence)nonDigitSymbols, it, false, 2, (Object)null)) {
                                 break;
                              }
                           }

                           Intrinsics.checkNotNull(value, "null cannot be cast to non-null type java.lang.String");
                           var10000 = value.substring(index, i$iv$iv);
                           Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
                           component = var10000;
                           if (((CharSequence)component).length() == 0) {
                              throw new IllegalArgumentException();
                           }

                           index += component.length();
                           CharSequence var28 = (CharSequence)value;
                           if (!(0 <= index ? index < var28.length() : false)) {
                              var33 = false;
                              throw new IllegalArgumentException("Missing unit for value " + component);
                           }

                           char unitChar = var28.charAt(index);
                           ++index;
                           unit = DurationUnitKt.durationUnitByIsoChar(unitChar, isTimeComponent);
                           if (prevUnit != null && prevUnit.compareTo((Enum)unit) <= 0) {
                              throw new IllegalArgumentException("Unexpected order of duration components");
                           }

                           prevUnit = unit;
                           dotIndex = StringsKt.indexOf$default((CharSequence)component, '.', 0, false, 6, (Object)null);
                           if (unit == DurationUnit.SECONDS && dotIndex > 0) {
                              var35 = 0;
                              Intrinsics.checkNotNull(component, "null cannot be cast to non-null type java.lang.String");
                              var10000 = component.substring(var35, dotIndex);
                              Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
                              whole = var10000;
                              result = Duration.plus-LRDsOJo(result, toDuration(parseOverLongIsoComponent(whole), unit));
                              Intrinsics.checkNotNull(component, "null cannot be cast to non-null type java.lang.String");
                              var10001 = component.substring(dotIndex);
                              Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
                              result = Duration.plus-LRDsOJo(result, toDuration(Double.parseDouble(var10001), unit));
                           } else {
                              result = Duration.plus-LRDsOJo(result, toDuration(parseOverLongIsoComponent(component), unit));
                           }
                        }
                     }

                     return isNegative ? Duration.unaryMinus-UwyO8pc(result) : result;
                  }
               }

               return isNegative ? Duration.unaryMinus-UwyO8pc(result) : result;
            }
         }
      }
   }

   private static final long parseOverLongIsoComponent(String value) {
      int length = value.length();
      int startIndex = 0;
      if (length > 0 && StringsKt.contains$default((CharSequence)"+-", value.charAt(0), false, 2, (Object)null)) {
         ++startIndex;
      }

      if (length - startIndex > 16) {
         int var3 = false;
         int firstNonZero = startIndex;
         int index = startIndex;

         while(true) {
            if (index >= length) {
               if (length - firstNonZero > 16) {
                  return value.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
               }
               break;
            }

            char var6 = value.charAt(index);
            if (var6 == '0') {
               if (firstNonZero == index) {
                  ++firstNonZero;
               }
            } else if (!('1' <= var6 ? var6 < ':' : false)) {
               break;
            }

            ++index;
         }
      }

      long var10000;
      if (StringsKt.startsWith$default(value, "+", false, 2, (Object)null) && length > 1) {
         char var7 = value.charAt(1);
         if ('0' <= var7 ? var7 < ':' : false) {
            var10000 = Long.parseLong(StringsKt.drop(value, 1));
            return var10000;
         }
      }

      var10000 = Long.parseLong(value);
      return var10000;
   }

   private static final String substringWhile(String $this$substringWhile, int startIndex, Function1<? super Character, Boolean> predicate) {
      int $i$f$substringWhile = false;
      String $this$skipWhile$iv = $this$substringWhile;
      int $i$f$skipWhile = false;

      int i$iv;
      for(i$iv = startIndex; i$iv < $this$skipWhile$iv.length() && (Boolean)predicate.invoke($this$skipWhile$iv.charAt(i$iv)); ++i$iv) {
      }

      Intrinsics.checkNotNull($this$substringWhile, "null cannot be cast to non-null type java.lang.String");
      String var10000 = $this$substringWhile.substring(startIndex, i$iv);
      Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
      return var10000;
   }

   private static final int skipWhile(String $this$skipWhile, int startIndex, Function1<? super Character, Boolean> predicate) {
      int $i$f$skipWhile = false;

      int i;
      for(i = startIndex; i < $this$skipWhile.length() && (Boolean)predicate.invoke($this$skipWhile.charAt(i)); ++i) {
      }

      return i;
   }

   private static final long nanosToMillis(long nanos) {
      return nanos / (long)1000000;
   }

   private static final long millisToNanos(long millis) {
      return millis * (long)1000000;
   }

   private static final long durationOfNanos(long normalNanos) {
      return Duration.constructor-impl(normalNanos << 1);
   }

   private static final long durationOfMillis(long normalMillis) {
      return Duration.constructor-impl((normalMillis << 1) + 1L);
   }

   private static final long durationOf(long normalValue, int unitDiscriminator) {
      return Duration.constructor-impl((normalValue << 1) + (long)unitDiscriminator);
   }

   private static final long durationOfNanosNormalized(long nanos) {
      return (-4611686018426999999L <= nanos ? nanos < 4611686018427000000L : false) ? durationOfNanos(nanos) : durationOfMillis(nanosToMillis(nanos));
   }

   private static final long durationOfMillisNormalized(long millis) {
      return (-4611686018426L <= millis ? millis < 4611686018427L : false) ? durationOfNanos(millisToNanos(millis)) : durationOfMillis(RangesKt.coerceIn(millis, -4611686018427387903L, 4611686018427387903L));
   }

   // $FF: synthetic method
   public static final long access$parseDuration(String value, boolean strictIso) {
      return parseDuration(value, strictIso);
   }

   // $FF: synthetic method
   public static final long access$durationOf(long normalValue, int unitDiscriminator) {
      return durationOf(normalValue, unitDiscriminator);
   }

   // $FF: synthetic method
   public static final long access$durationOfNanosNormalized(long nanos) {
      return durationOfNanosNormalized(nanos);
   }

   // $FF: synthetic method
   public static final long access$durationOfMillisNormalized(long millis) {
      return durationOfMillisNormalized(millis);
   }

   // $FF: synthetic method
   public static final long access$nanosToMillis(long nanos) {
      return nanosToMillis(nanos);
   }

   // $FF: synthetic method
   public static final long access$millisToNanos(long millis) {
      return millisToNanos(millis);
   }

   // $FF: synthetic method
   public static final long access$durationOfNanos(long normalNanos) {
      return durationOfNanos(normalNanos);
   }

   // $FF: synthetic method
   public static final long access$durationOfMillis(long normalMillis) {
      return durationOfMillis(normalMillis);
   }
}
