package kotlin.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "2.1"
)
@ExperimentalTime
public final class Instant implements Comparable<Instant>, Serializable {
   @NotNull
   public static final Instant.Companion Companion = new Instant.Companion((DefaultConstructorMarker)null);
   private final long epochSeconds;
   private final int nanosecondsOfSecond;
   @NotNull
   private static final Instant MIN = new Instant(-31557014167219200L, 0);
   @NotNull
   private static final Instant MAX = new Instant(31556889864403199L, 999999999);

   public Instant(long epochSeconds, int nanosecondsOfSecond) {
      this.epochSeconds = epochSeconds;
      this.nanosecondsOfSecond = nanosecondsOfSecond;
      long var4 = this.epochSeconds;
      if (!(-31557014167219200L <= var4 ? var4 < 31556889864403200L : false)) {
         int var5 = false;
         String var6 = "Instant exceeds minimum or maximum instant";
         throw new IllegalArgumentException(var6.toString());
      }
   }

   public final long getEpochSeconds() {
      return this.epochSeconds;
   }

   public final int getNanosecondsOfSecond() {
      return this.nanosecondsOfSecond;
   }

   public final long toEpochMilliseconds() {
      long var10000;
      long millis;
      long a$iv;
      long b$iv;
      long sum$iv;
      boolean $i$f$safeMultiplyOrElse;
      long total$iv;
      boolean var10;
      boolean $i$f$safeAddOrElse;
      boolean var12;
      if (this.epochSeconds >= 0L) {
         a$iv = this.epochSeconds;
         b$iv = 1000L;
         $i$f$safeMultiplyOrElse = false;
         if (b$iv == 1L) {
            var10000 = a$iv;
         } else if (a$iv == 1L) {
            var10000 = b$iv;
         } else if (a$iv != 0L && b$iv != 0L) {
            total$iv = a$iv * b$iv;
            if (total$iv / b$iv != a$iv || a$iv == Long.MIN_VALUE && b$iv == -1L || b$iv == Long.MIN_VALUE && a$iv == -1L) {
               var10 = false;
               return Long.MAX_VALUE;
            }

            var10000 = total$iv;
         } else {
            var10000 = 0L;
         }

         millis = var10000;
         a$iv = (long)(this.nanosecondsOfSecond / 1000000);
         $i$f$safeAddOrElse = false;
         sum$iv = millis + a$iv;
         if ((millis ^ sum$iv) < 0L && (millis ^ a$iv) >= 0L) {
            var12 = false;
            return Long.MAX_VALUE;
         } else {
            return sum$iv;
         }
      } else {
         a$iv = this.epochSeconds + 1L;
         b$iv = 1000L;
         $i$f$safeMultiplyOrElse = false;
         if (b$iv == 1L) {
            var10000 = a$iv;
         } else if (a$iv == 1L) {
            var10000 = b$iv;
         } else if (a$iv != 0L && b$iv != 0L) {
            total$iv = a$iv * b$iv;
            if (total$iv / b$iv != a$iv || a$iv == Long.MIN_VALUE && b$iv == -1L || b$iv == Long.MIN_VALUE && a$iv == -1L) {
               var10 = false;
               return Long.MIN_VALUE;
            }

            var10000 = total$iv;
         } else {
            var10000 = 0L;
         }

         millis = var10000;
         a$iv = (long)(this.nanosecondsOfSecond / 1000000 - 1000);
         $i$f$safeAddOrElse = false;
         sum$iv = millis + a$iv;
         if ((millis ^ sum$iv) < 0L && (millis ^ a$iv) >= 0L) {
            var12 = false;
            return Long.MIN_VALUE;
         } else {
            return sum$iv;
         }
      }
   }

   @NotNull
   public final Instant plus_LRDsOJo/* $FF was: plus-LRDsOJo*/(long duration) {
      int var3 = false;
      long var10000 = Duration.getInWholeSeconds-impl(duration);
      int nanosecondsToAdd = Duration.getNanosecondsComponent-impl(duration);
      long secondsToAdd = var10000;
      int var7 = false;
      if (secondsToAdd == 0L && nanosecondsToAdd == 0) {
         return this;
      } else {
         long a$iv = this.epochSeconds;
         int $i$f$safeAddOrElse = false;
         long sum$iv = a$iv + secondsToAdd;
         if ((a$iv ^ sum$iv) < 0L && (a$iv ^ secondsToAdd) >= 0L) {
            int var13 = false;
            return Duration.isPositive-impl(duration) ? MAX : MIN;
         } else {
            int nanoAdjustment = this.nanosecondsOfSecond + nanosecondsToAdd;
            return Companion.fromEpochSeconds(sum$iv, nanoAdjustment);
         }
      }
   }

   @NotNull
   public final Instant minus_LRDsOJo/* $FF was: minus-LRDsOJo*/(long duration) {
      return this.plus-LRDsOJo(Duration.unaryMinus-UwyO8pc(duration));
   }

   public final long minus_UwyO8pc/* $FF was: minus-UwyO8pc*/(@NotNull Instant other) {
      Intrinsics.checkNotNullParameter(other, "other");
      Duration.Companion var10000 = Duration.Companion;
      long var2 = DurationKt.toDuration(this.epochSeconds - other.epochSeconds, DurationUnit.SECONDS);
      Duration.Companion var10001 = Duration.Companion;
      return Duration.plus-LRDsOJo(var2, DurationKt.toDuration(this.nanosecondsOfSecond - other.nanosecondsOfSecond, DurationUnit.NANOSECONDS));
   }

   public int compareTo(@NotNull Instant other) {
      Intrinsics.checkNotNullParameter(other, "other");
      int s = Intrinsics.compare(this.epochSeconds, other.epochSeconds);
      return s != 0 ? s : Intrinsics.compare(this.nanosecondsOfSecond, other.nanosecondsOfSecond);
   }

   public boolean equals(@Nullable Object other) {
      return this == other || other instanceof Instant && this.epochSeconds == ((Instant)other).epochSeconds && this.nanosecondsOfSecond == ((Instant)other).nanosecondsOfSecond;
   }

   public int hashCode() {
      return Long.hashCode(this.epochSeconds) + 51 * this.nanosecondsOfSecond;
   }

   @NotNull
   public String toString() {
      return InstantKt.access$formatIso(this);
   }

   private final Object writeReplace() {
      return InstantJvmKt.serializedInstant(this);
   }

   private final void readObject(ObjectInputStream input) {
      throw new InvalidObjectException("Deserialization is supported via proxy only");
   }

   public static final class Companion {
      private Companion() {
      }

      /** @deprecated */
      @Deprecated(
         message = "Use Clock.System.now() instead",
         replaceWith = @ReplaceWith(
   expression = "Clock.System.now()",
   imports = {"kotlin.time.Clock"}
),
         level = DeprecationLevel.ERROR
      )
      @NotNull
      public final Instant now() {
         throw new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
      }

      @NotNull
      public final Instant fromEpochMilliseconds(long epochMilliseconds) {
         long var7 = 1000L;
         long var9 = epochMilliseconds / var7;
         if ((epochMilliseconds ^ var7) < 0L && var9 * var7 != epochMilliseconds) {
            var9 += -1L;
         }

         long var8 = 1000L;
         long var10 = epochMilliseconds % var8;
         int nanosecondsOfSecond = (int)((var10 + (var8 & ((var10 ^ var8) & (var10 | -var10)) >> 63)) * (long)1000000);
         return var9 < -31557014167219200L ? this.getMIN$kotlin_stdlib() : (var9 > 31556889864403199L ? this.getMAX$kotlin_stdlib() : this.fromEpochSeconds(var9, nanosecondsOfSecond));
      }

      @NotNull
      public final Instant fromEpochSeconds(long epochSeconds, long nanosecondAdjustment) {
         long var9 = 1000000000L;
         long var11 = nanosecondAdjustment / var9;
         if ((nanosecondAdjustment ^ var9) < 0L && var11 * var9 != nanosecondAdjustment) {
            var11 += -1L;
         }

         int $i$f$safeAddOrElse = false;
         long sum$iv = epochSeconds + var11;
         if ((epochSeconds ^ sum$iv) < 0L && (epochSeconds ^ var11) >= 0L) {
            int var14 = false;
            return epochSeconds > 0L ? Instant.Companion.getMAX$kotlin_stdlib() : Instant.Companion.getMIN$kotlin_stdlib();
         } else {
            long seconds = sum$iv;
            Instant var10000;
            if (sum$iv < -31557014167219200L) {
               var10000 = this.getMIN$kotlin_stdlib();
            } else if (sum$iv > 31556889864403199L) {
               var10000 = this.getMAX$kotlin_stdlib();
            } else {
               sum$iv = 1000000000L;
               long var12 = nanosecondAdjustment % sum$iv;
               int nanoseconds = (int)(var12 + (sum$iv & ((var12 ^ sum$iv) & (var12 | -var12)) >> 63));
               var10000 = new Instant(seconds, nanoseconds);
            }

            return var10000;
         }
      }

      // $FF: synthetic method
      public static Instant fromEpochSeconds$default(Instant.Companion var0, long var1, long var3, int var5, Object var6) {
         if ((var5 & 2) != 0) {
            var3 = 0L;
         }

         return var0.fromEpochSeconds(var1, var3);
      }

      @NotNull
      public final Instant fromEpochSeconds(long epochSeconds, int nanosecondAdjustment) {
         return this.fromEpochSeconds(epochSeconds, (long)nanosecondAdjustment);
      }

      @NotNull
      public final Instant parse(@NotNull CharSequence input) {
         Intrinsics.checkNotNullParameter(input, "input");
         return InstantKt.access$parseIso(input).toInstant();
      }

      @SinceKotlin(
         version = "2.2"
      )
      @Nullable
      public final Instant parseOrNull(@NotNull CharSequence input) {
         Intrinsics.checkNotNullParameter(input, "input");
         return InstantKt.access$parseIso(input).toInstantOrNull();
      }

      @NotNull
      public final Instant getDISTANT_PAST() {
         return this.fromEpochSeconds(-3217862419201L, 999999999);
      }

      @NotNull
      public final Instant getDISTANT_FUTURE() {
         return this.fromEpochSeconds(3093527980800L, 0);
      }

      @NotNull
      public final Instant getMIN$kotlin_stdlib() {
         return Instant.MIN;
      }

      @NotNull
      public final Instant getMAX$kotlin_stdlib() {
         return Instant.MAX;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
