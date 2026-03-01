package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class DurationJvmKt {
   private static final boolean durationAssertionsEnabled = Duration.class.desiredAssertionStatus();
   @NotNull
   private static final ThreadLocal<DecimalFormat>[] precisionFormats;

   public static final boolean getDurationAssertionsEnabled() {
      return durationAssertionsEnabled;
   }

   private static final DecimalFormat createFormatForDecimals(int decimals) {
      DecimalFormat var1 = new DecimalFormat("0");
      int var3 = false;
      if (decimals > 0) {
         var1.setMinimumFractionDigits(decimals);
      }

      var1.setRoundingMode(RoundingMode.HALF_UP);
      return var1;
   }

   @NotNull
   public static final String formatToExactDecimals(double value, int decimals) {
      DecimalFormat var8;
      if (decimals < precisionFormats.length) {
         ThreadLocal var4 = precisionFormats[decimals];
         Object var10000 = var4.get();
         if (var10000 == null) {
            int var5 = false;
            DecimalFormat var7 = createFormatForDecimals(decimals);
            var4.set(var7);
            var10000 = var7;
         }

         var8 = (DecimalFormat)var10000;
      } else {
         var8 = createFormatForDecimals(decimals);
      }

      DecimalFormat format = var8;
      String var9 = format.format(value);
      Intrinsics.checkNotNullExpressionValue(var9, "format(...)");
      return var9;
   }

   static {
      int var0 = 0;

      ThreadLocal[] var1;
      for(var1 = new ThreadLocal[4]; var0 < 4; ++var0) {
         var1[var0] = new ThreadLocal();
      }

      precisionFormats = var1;
   }
}
