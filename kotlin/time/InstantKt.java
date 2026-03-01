package kotlin.time;

import kotlin.KotlinNothingValueException;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class InstantKt {
   private static final long DISTANT_PAST_SECONDS = -3217862419201L;
   private static final long DISTANT_FUTURE_SECONDS = 3093527980800L;
   private static final long MIN_SECOND = -31557014167219200L;
   private static final long MAX_SECOND = 31556889864403199L;
   private static final int DAYS_PER_CYCLE = 146097;
   private static final int DAYS_0000_TO_1970 = 719528;
   private static final int SECONDS_PER_HOUR = 3600;
   private static final int SECONDS_PER_MINUTE = 60;
   private static final int HOURS_PER_DAY = 24;
   private static final int SECONDS_PER_DAY = 86400;
   public static final int NANOS_PER_SECOND = 1000000000;
   private static final int NANOS_PER_MILLI = 1000000;
   private static final int MILLIS_PER_SECOND = 1000;
   @NotNull
   private static final int[] POWERS_OF_TEN;
   @NotNull
   private static final int[] asciiDigitPositionsInIsoStringAfterYear;
   @NotNull
   private static final int[] colonsInIsoOffsetString;
   @NotNull
   private static final int[] asciiDigitsInIsoOffsetString;

   private static final boolean isDistantPast(Instant $this$isDistantPast) {
      Intrinsics.checkNotNullParameter($this$isDistantPast, "<this>");
      return $this$isDistantPast.compareTo(Instant.Companion.getDISTANT_PAST()) <= 0;
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalTime
   @InlineOnly
   public static void isDistantPast$annotations(Instant <this>) {
   }

   private static final boolean isDistantFuture(Instant $this$isDistantFuture) {
      Intrinsics.checkNotNullParameter($this$isDistantFuture, "<this>");
      return $this$isDistantFuture.compareTo(Instant.Companion.getDISTANT_FUTURE()) >= 0;
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalTime
   @InlineOnly
   public static void isDistantFuture$annotations(Instant <this>) {
   }

   @ExperimentalTime
   private static final InstantParseResult parseIso(CharSequence isoString) {
      CharSequence s = isoString;
      int i = 0;
      if (isoString.length() == 0) {
         return (InstantParseResult)(new InstantParseResult.Failure("An empty string is not a valid Instant", isoString));
      } else {
         char c = isoString.charAt(i);
         char var10000;
         switch(c) {
         case '+':
         case '-':
            ++i;
            var10000 = c;
            break;
         case ',':
         default:
            var10000 = ' ';
         }

         char yearSign = var10000;
         int yearStart = i;

         int absYear;
         for(absYear = 0; i < s.length(); ++i) {
            char var6 = s.charAt(i);
            if (!('0' <= var6 ? var6 < ':' : false)) {
               break;
            }

            absYear = absYear * 10 + (s.charAt(i) - 48);
         }

         int yearStrLength = i - yearStart;
         if (yearStrLength > 10) {
            return (InstantParseResult)parseIso$parseFailure(isoString, "Expected at most 10 digits for the year number, got " + yearStrLength + " digits");
         } else if (yearStrLength == 10 && Intrinsics.compare(s.charAt(yearStart), 50) >= 0) {
            return (InstantParseResult)parseIso$parseFailure(isoString, "Expected at most 9 digits for the year number or year 1000000000, got " + yearStrLength + " digits");
         } else if (yearStrLength < 4) {
            return (InstantParseResult)parseIso$parseFailure(isoString, "The year number must be padded to 4 digits, got " + yearStrLength + " digits");
         } else if (yearSign == '+' && yearStrLength == 4) {
            return (InstantParseResult)parseIso$parseFailure(isoString, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
         } else if (yearSign == ' ' && yearStrLength != 4) {
            return (InstantParseResult)parseIso$parseFailure(isoString, "A '+' or '-' sign is required for year numbers longer than 4 digits");
         } else {
            int year = yearSign == '-' ? -absYear : absYear;
            if (s.length() < i + 16) {
               return (InstantParseResult)parseIso$parseFailure(isoString, "The input string is too short");
            } else {
               InstantParseResult.Failure var8 = parseIso$expect(isoString, "'-'", i, InstantKt::parseIso$lambda$0);
               boolean var38;
               if (var8 != null) {
                  var38 = false;
                  return (InstantParseResult)var8;
               } else {
                  var8 = parseIso$expect(isoString, "'-'", i + 3, InstantKt::parseIso$lambda$2);
                  if (var8 != null) {
                     var38 = false;
                     return (InstantParseResult)var8;
                  } else {
                     var8 = parseIso$expect(isoString, "'T' or 't'", i + 6, InstantKt::parseIso$lambda$4);
                     if (var8 != null) {
                        var38 = false;
                        return (InstantParseResult)var8;
                     } else {
                        var8 = parseIso$expect(isoString, "':'", i + 9, InstantKt::parseIso$lambda$6);
                        if (var8 != null) {
                           var38 = false;
                           return (InstantParseResult)var8;
                        } else {
                           var8 = parseIso$expect(isoString, "':'", i + 12, InstantKt::parseIso$lambda$8);
                           if (var8 != null) {
                              var38 = false;
                              return (InstantParseResult)var8;
                           } else {
                              int[] var36 = asciiDigitPositionsInIsoStringAfterYear;
                              int day = 0;

                              int hour;
                              int minute;
                              for(hour = var36.length; day < hour; ++day) {
                                 minute = var36[day];
                                 InstantParseResult.Failure var12 = parseIso$expect(isoString, "an ASCII digit", i + minute, InstantKt::parseIso$lambda$10);
                                 if (var12 != null) {
                                    int var15 = false;
                                    return (InstantParseResult)var12;
                                 }
                              }

                              int month = parseIso$twoDigitNumber(s, i + 1);
                              day = parseIso$twoDigitNumber(s, i + 4);
                              hour = parseIso$twoDigitNumber(s, i + 7);
                              minute = parseIso$twoDigitNumber(s, i + 10);
                              int second = parseIso$twoDigitNumber(s, i + 13);
                              int offsetSeconds;
                              int offsetStrLength;
                              int var50;
                              if (s.charAt(i + 15) == '.') {
                                 offsetSeconds = i + 16;
                                 i = offsetSeconds;

                                 int fraction;
                                 for(fraction = 0; i < s.length(); ++i) {
                                    char var16 = s.charAt(i);
                                    if (!('0' <= var16 ? var16 < ':' : false)) {
                                       break;
                                    }

                                    fraction = fraction * 10 + (s.charAt(i) - 48);
                                 }

                                 offsetStrLength = i - offsetSeconds;
                                 if (!(1 <= offsetStrLength ? offsetStrLength < 10 : false)) {
                                    return (InstantParseResult)parseIso$parseFailure(isoString, "1..9 digits are supported for the fraction of the second, got " + offsetStrLength + " digits");
                                 }

                                 var50 = fraction * POWERS_OF_TEN[9 - offsetStrLength];
                              } else {
                                 i += 15;
                                 var50 = 0;
                              }

                              int nanosecond = var50;
                              if (i >= s.length()) {
                                 return (InstantParseResult)parseIso$parseFailure(isoString, "The UTC offset at the end of the string is missing");
                              } else {
                                 char sign = s.charAt(i);
                                 switch(sign) {
                                 case '+':
                                 case '-':
                                    offsetStrLength = s.length() - i;
                                    StringBuilder var10001;
                                    int offsetMinute;
                                    if (offsetStrLength > 9) {
                                       var10001 = (new StringBuilder()).append("The UTC offset string \"");
                                       offsetMinute = s.length();
                                       return (InstantParseResult)parseIso$parseFailure(isoString, var10001.append(truncateForErrorMessage((CharSequence)s.subSequence(i, offsetMinute).toString(), 16)).append("\" is too long").toString());
                                    }

                                    if (offsetStrLength % 3 != 0) {
                                       var10001 = (new StringBuilder()).append("Invalid UTC offset string \"");
                                       offsetMinute = s.length();
                                       return (InstantParseResult)parseIso$parseFailure(isoString, var10001.append(s.subSequence(i, offsetMinute).toString()).append('"').toString());
                                    }

                                    int[] var17 = colonsInIsoOffsetString;
                                    offsetMinute = 0;

                                    int offsetSecond;
                                    int j;
                                    for(offsetSecond = var17.length; offsetMinute < offsetSecond; ++offsetMinute) {
                                       j = var17[offsetMinute];
                                       if (i + j >= s.length()) {
                                          break;
                                       }

                                       if (s.charAt(i + j) != ':') {
                                          return (InstantParseResult)parseIso$parseFailure(isoString, "Expected ':' at index " + (i + j) + ", got '" + s.charAt(i + j) + '\'');
                                       }
                                    }

                                    var17 = asciiDigitsInIsoOffsetString;
                                    offsetMinute = 0;

                                    for(offsetSecond = var17.length; offsetMinute < offsetSecond; ++offsetMinute) {
                                       j = var17[offsetMinute];
                                       if (i + j >= s.length()) {
                                          break;
                                       }

                                       char var21 = s.charAt(i + j);
                                       if (!('0' <= var21 ? var21 < ':' : false)) {
                                          return (InstantParseResult)parseIso$parseFailure(isoString, "Expected an ASCII digit at index " + (i + j) + ", got '" + s.charAt(i + j) + '\'');
                                       }
                                    }

                                    int offsetHour = parseIso$twoDigitNumber(s, i + 1);
                                    offsetMinute = offsetStrLength > 3 ? parseIso$twoDigitNumber(s, i + 4) : 0;
                                    offsetSecond = offsetStrLength > 6 ? parseIso$twoDigitNumber(s, i + 7) : 0;
                                    if (offsetMinute > 59) {
                                       return (InstantParseResult)parseIso$parseFailure(isoString, "Expected offset-minute-of-hour in 0..59, got " + offsetMinute);
                                    }

                                    if (offsetSecond > 59) {
                                       return (InstantParseResult)parseIso$parseFailure(isoString, "Expected offset-second-of-minute in 0..59, got " + offsetSecond);
                                    }

                                    if (offsetHour > 17 && (offsetHour != 18 || offsetMinute != 0 || offsetSecond != 0)) {
                                       var10001 = (new StringBuilder()).append("Expected an offset in -18:00..+18:00, got ");
                                       int var49 = s.length();
                                       return (InstantParseResult)parseIso$parseFailure(isoString, var10001.append(s.subSequence(i, var49).toString()).toString());
                                    }

                                    var50 = (offsetHour * 3600 + offsetMinute * 60 + offsetSecond) * (sign == '-' ? -1 : 1);
                                    break;
                                 case 'Z':
                                 case 'z':
                                    if (s.length() != i + 1) {
                                       return (InstantParseResult)parseIso$parseFailure(isoString, "Extra text after the instant at position " + (i + 1));
                                    }

                                    var50 = 0;
                                    break;
                                 default:
                                    return (InstantParseResult)parseIso$parseFailure(isoString, "Expected the UTC offset at position " + i + ", got '" + sign + '\'');
                                 }

                                 offsetSeconds = var50;
                                 if (!(1 <= month ? month < 13 : false)) {
                                    return (InstantParseResult)parseIso$parseFailure(isoString, "Expected a month number in 1..12, got " + month);
                                 } else if (!(1 <= day ? day <= monthLength(month, isLeapYear(year)) : false)) {
                                    return (InstantParseResult)parseIso$parseFailure(isoString, "Expected a valid day-of-month for month " + month + " of year " + year + ", got " + day);
                                 } else if (hour > 23) {
                                    return (InstantParseResult)parseIso$parseFailure(isoString, "Expected hour in 0..23, got " + hour);
                                 } else if (minute > 59) {
                                    return (InstantParseResult)parseIso$parseFailure(isoString, "Expected minute-of-hour in 0..59, got " + minute);
                                 } else if (second > 59) {
                                    return (InstantParseResult)parseIso$parseFailure(isoString, "Expected second-of-minute in 0..59, got " + second);
                                 } else {
                                    UnboundLocalDateTime this_$iv = new UnboundLocalDateTime(year, month, day, hour, minute, second, nanosecond);
                                    int $i$f$toInstant = false;
                                    int var46 = false;
                                    int var47 = false;
                                    long y$iv = (long)this_$iv.getYear();
                                    long total$iv = (long)365 * y$iv;
                                    if (y$iv >= 0L) {
                                       total$iv += (y$iv + (long)3) / (long)4 - (y$iv + (long)99) / (long)100 + (y$iv + (long)399) / (long)400;
                                    } else {
                                       total$iv -= y$iv / (long)-4 - y$iv / (long)-100 + y$iv / (long)-400;
                                    }

                                    total$iv += (long)((367 * this_$iv.getMonth() - 362) / 12);
                                    total$iv += (long)(this_$iv.getDay() - 1);
                                    if (this_$iv.getMonth() > 2) {
                                       total$iv += -1L;
                                       if (!isLeapYear(this_$iv.getYear())) {
                                          total$iv += -1L;
                                       }
                                    }

                                    long epochDays$iv = total$iv - (long)719528;
                                    int daySeconds$iv = this_$iv.getHour() * 3600 + this_$iv.getMinute() * 60 + this_$iv.getSecond();
                                    long epochSeconds$iv = epochDays$iv * (long)86400 + (long)daySeconds$iv - (long)offsetSeconds;
                                    int p1 = this_$iv.getNanosecond();
                                    int var33 = false;
                                    return (InstantParseResult)(new InstantParseResult.Success(epochSeconds$iv, p1));
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ExperimentalTime
   private static final String formatIso(Instant instant) {
      StringBuilder var1 = new StringBuilder();
      int var3 = false;
      UnboundLocalDateTime ldt = UnboundLocalDateTime.Companion.fromInstant(instant);
      int var6 = false;
      int number = ldt.getYear();
      if (Math.abs(number) < 1000) {
         StringBuilder innerBuilder = new StringBuilder();
         if (number >= 0) {
            Intrinsics.checkNotNullExpressionValue(innerBuilder.append(number + 10000).deleteCharAt(0), "deleteCharAt(...)");
         } else {
            Intrinsics.checkNotNullExpressionValue(innerBuilder.append(number - 10000).deleteCharAt(1), "deleteCharAt(...)");
         }

         var1.append((CharSequence)innerBuilder);
      } else {
         if (number >= 10000) {
            var1.append('+');
         }

         var1.append(number);
      }

      var1.append('-');
      formatIso$lambda$13$appendTwoDigits((Appendable)var1, var1, ldt.getMonth());
      var1.append('-');
      formatIso$lambda$13$appendTwoDigits((Appendable)var1, var1, ldt.getDay());
      var1.append('T');
      formatIso$lambda$13$appendTwoDigits((Appendable)var1, var1, ldt.getHour());
      var1.append(':');
      formatIso$lambda$13$appendTwoDigits((Appendable)var1, var1, ldt.getMinute());
      var1.append(':');
      formatIso$lambda$13$appendTwoDigits((Appendable)var1, var1, ldt.getSecond());
      if (ldt.getNanosecond() != 0) {
         var1.append('.');

         int zerosToStrip;
         for(zerosToStrip = 0; ldt.getNanosecond() % POWERS_OF_TEN[zerosToStrip + 1] == 0; ++zerosToStrip) {
         }

         zerosToStrip -= zerosToStrip % 3;
         int numberToOutput = ldt.getNanosecond() / POWERS_OF_TEN[zerosToStrip];
         String var10 = String.valueOf(numberToOutput + POWERS_OF_TEN[9 - zerosToStrip]);
         byte var11 = 1;
         Intrinsics.checkNotNull(var10, "null cannot be cast to non-null type java.lang.String");
         String var10001 = var10.substring(var11);
         Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
         var1.append(var10001);
      }

      var1.append('Z');
      return var1.toString();
   }

   private static final long safeAddOrElse(long a, long b, Function0 action) {
      int $i$f$safeAddOrElse = false;
      long sum = a + b;
      if ((a ^ sum) < 0L && (a ^ b) >= 0L) {
         action.invoke();
         throw new KotlinNothingValueException();
      } else {
         return sum;
      }
   }

   private static final long safeMultiplyOrElse(long a, long b, Function0 action) {
      int $i$f$safeMultiplyOrElse = false;
      if (b == 1L) {
         return a;
      } else if (a == 1L) {
         return b;
      } else if (a != 0L && b != 0L) {
         long total = a * b;
         if (total / b == a && (a != Long.MIN_VALUE || b != -1L) && (b != Long.MIN_VALUE || a != -1L)) {
            return total;
         } else {
            action.invoke();
            throw new KotlinNothingValueException();
         }
      } else {
         return 0L;
      }
   }

   public static final boolean isLeapYear(int year) {
      return (year & 3) == 0 && (year % 100 != 0 || year % 400 == 0);
   }

   private static final int monthLength(int $this$monthLength, boolean isLeapYear) {
      int var10000;
      switch($this$monthLength) {
      case 2:
         var10000 = isLeapYear ? 29 : 28;
         break;
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      default:
         var10000 = 31;
         break;
      case 4:
      case 6:
      case 9:
      case 11:
         var10000 = 30;
      }

      return var10000;
   }

   private static final String truncateForErrorMessage(CharSequence $this$truncateForErrorMessage, int maxLength) {
      return $this$truncateForErrorMessage.length() <= maxLength ? $this$truncateForErrorMessage.toString() : $this$truncateForErrorMessage.subSequence(0, maxLength).toString() + "...";
   }

   private static final InstantParseResult.Failure parseIso$parseFailure(CharSequence $isoString, String error) {
      return new InstantParseResult.Failure(error + " when parsing an Instant from \"" + truncateForErrorMessage($isoString, 64) + '"', $isoString);
   }

   private static final InstantParseResult.Failure parseIso$expect(CharSequence $isoString, String what, int where, Function1<? super Character, Boolean> predicate) {
      char c = $isoString.charAt(where);
      return (Boolean)predicate.invoke(c) ? null : parseIso$parseFailure($isoString, "Expected " + what + ", but got '" + c + "' at position " + where);
   }

   private static final boolean parseIso$lambda$0(char it) {
      return it == '-';
   }

   private static final boolean parseIso$lambda$2(char it) {
      return it == '-';
   }

   private static final boolean parseIso$lambda$4(char it) {
      return it == 'T' || it == 't';
   }

   private static final boolean parseIso$lambda$6(char it) {
      return it == ':';
   }

   private static final boolean parseIso$lambda$8(char it) {
      return it == ':';
   }

   private static final boolean parseIso$lambda$10(char it) {
      return '0' <= it ? it < ':' : false;
   }

   private static final int parseIso$twoDigitNumber(CharSequence s, int index) {
      return (s.charAt(index) - 48) * 10 + (s.charAt(index + 1) - 48);
   }

   private static final void formatIso$lambda$13$appendTwoDigits(Appendable $this$formatIso_u24lambda_u2413_u24appendTwoDigits, StringBuilder $this_buildString, int number) {
      if (number < 10) {
         $this$formatIso_u24lambda_u2413_u24appendTwoDigits.append('0');
      }

      $this_buildString.append(number);
   }

   // $FF: synthetic method
   public static final String access$formatIso(Instant instant) {
      return formatIso(instant);
   }

   // $FF: synthetic method
   public static final InstantParseResult access$parseIso(CharSequence isoString) {
      return parseIso(isoString);
   }

   // $FF: synthetic method
   public static final String access$truncateForErrorMessage(CharSequence $receiver, int maxLength) {
      return truncateForErrorMessage($receiver, maxLength);
   }

   static {
      int[] var0 = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
      POWERS_OF_TEN = var0;
      var0 = new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
      asciiDigitPositionsInIsoStringAfterYear = var0;
      var0 = new int[]{3, 6};
      colonsInIsoOffsetString = var0;
      var0 = new int[]{1, 2, 4, 5, 7, 8};
      asciiDigitsInIsoOffsetString = var0;
   }
}
