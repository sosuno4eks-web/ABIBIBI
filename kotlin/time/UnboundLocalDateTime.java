package kotlin.time;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalTime
final class UnboundLocalDateTime {
   @NotNull
   public static final UnboundLocalDateTime.Companion Companion = new UnboundLocalDateTime.Companion((DefaultConstructorMarker)null);
   private final int year;
   private final int month;
   private final int day;
   private final int hour;
   private final int minute;
   private final int second;
   private final int nanosecond;

   public UnboundLocalDateTime(int year, int month, int day, int hour, int minute, int second, int nanosecond) {
      this.year = year;
      this.month = month;
      this.day = day;
      this.hour = hour;
      this.minute = minute;
      this.second = second;
      this.nanosecond = nanosecond;
   }

   public final int getYear() {
      return this.year;
   }

   public final int getMonth() {
      return this.month;
   }

   public final int getDay() {
      return this.day;
   }

   public final int getHour() {
      return this.hour;
   }

   public final int getMinute() {
      return this.minute;
   }

   public final int getSecond() {
      return this.second;
   }

   public final int getNanosecond() {
      return this.nanosecond;
   }

   public final <T> T toInstant(int offsetSeconds, @NotNull Function2<? super Long, ? super Integer, ? extends T> buildInstant) {
      Intrinsics.checkNotNullParameter(buildInstant, "buildInstant");
      int $i$f$toInstant = false;
      UnboundLocalDateTime $this$toInstant_u24lambda_u241 = (UnboundLocalDateTime)this;
      int var7 = false;
      int var9 = false;
      long y = (long)$this$toInstant_u24lambda_u241.getYear();
      long total = (long)365 * y;
      if (y >= 0L) {
         total += (y + (long)3) / (long)4 - (y + (long)99) / (long)100 + (y + (long)399) / (long)400;
      } else {
         total -= y / (long)-4 - y / (long)-100 + y / (long)-400;
      }

      total += (long)((367 * $this$toInstant_u24lambda_u241.getMonth() - 362) / 12);
      total += (long)($this$toInstant_u24lambda_u241.getDay() - 1);
      if ($this$toInstant_u24lambda_u241.getMonth() > 2) {
         total += -1L;
         if (!InstantKt.isLeapYear($this$toInstant_u24lambda_u241.getYear())) {
            total += -1L;
         }
      }

      long epochDays = total - (long)719528;
      int daySeconds = $this$toInstant_u24lambda_u241.getHour() * 3600 + $this$toInstant_u24lambda_u241.getMinute() * 60 + $this$toInstant_u24lambda_u241.getSecond();
      long epochSeconds = epochDays * (long)86400 + (long)daySeconds - (long)offsetSeconds;
      return buildInstant.invoke(epochSeconds, this.getNanosecond());
   }

   @NotNull
   public String toString() {
      return "UnboundLocalDateTime(" + this.year + '-' + this.month + '-' + this.day + ' ' + this.hour + ':' + this.minute + ':' + this.second + '.' + this.nanosecond + ')';
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final UnboundLocalDateTime fromInstant(@NotNull Instant instant) {
         Intrinsics.checkNotNullParameter(instant, "instant");
         long localSecond = instant.getEpochSeconds();
         long var8 = 86400L;
         long var10 = localSecond / var8;
         if ((localSecond ^ var8) < 0L && var10 * var8 != localSecond) {
            var10 += -1L;
         }

         long var9 = 86400L;
         long var11 = localSecond % var9;
         int secsOfDay = (int)(var11 + (var9 & ((var11 ^ var9) & (var11 | -var11)) >> 63));
         int year = false;
         int month = false;
         int day = false;
         UnboundLocalDateTime.Companion $this$fromInstant_u24lambda_u240 = (UnboundLocalDateTime.Companion)this;
         int var12 = false;
         long zeroDay = var10 + (long)719528;
         zeroDay -= (long)60;
         long adjust = 0L;
         long yearEst;
         if (zeroDay < 0L) {
            yearEst = (zeroDay + 1L) / (long)146097 - 1L;
            adjust = yearEst * (long)400;
            zeroDay += -yearEst * (long)146097;
         }

         yearEst = ((long)400 * zeroDay + (long)591) / (long)146097;
         long doyEst = zeroDay - ((long)365 * yearEst + yearEst / (long)4 - yearEst / (long)100 + yearEst / (long)400);
         if (doyEst < 0L) {
            yearEst += -1L;
            doyEst = zeroDay - ((long)365 * yearEst + yearEst / (long)4 - yearEst / (long)100 + yearEst / (long)400);
         }

         yearEst += adjust;
         int marchDoy0 = (int)doyEst;
         int marchMonth0 = (marchDoy0 * 5 + 2) / 153;
         int month = (marchMonth0 + 2) % 12 + 1;
         int day = marchDoy0 - (marchMonth0 * 306 + 5) / 10 + 1;
         int year = (int)(yearEst + (long)(marchMonth0 / 10));
         int hours = secsOfDay / 3600;
         int secondWithoutHours = secsOfDay - hours * 3600;
         int minutes = secondWithoutHours / 60;
         int second = secondWithoutHours - minutes * 60;
         return new UnboundLocalDateTime(year, month, day, hours, minutes, second, instant.getNanosecondsOfSecond());
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
