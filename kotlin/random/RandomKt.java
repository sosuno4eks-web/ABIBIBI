package kotlin.random;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import org.jetbrains.annotations.NotNull;

public final class RandomKt {
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final Random Random(int seed) {
      return (Random)(new XorWowRandom(seed, seed >> 31));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final Random Random(long seed) {
      return (Random)(new XorWowRandom((int)seed, (int)(seed >> 32)));
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final int nextInt(@NotNull Random $this$nextInt, @NotNull IntRange range) {
      Intrinsics.checkNotNullParameter($this$nextInt, "<this>");
      Intrinsics.checkNotNullParameter(range, "range");
      if (range.isEmpty()) {
         throw new IllegalArgumentException("Cannot get random in empty range: " + range);
      } else {
         return range.getLast() < Integer.MAX_VALUE ? $this$nextInt.nextInt(range.getFirst(), range.getLast() + 1) : (range.getFirst() > Integer.MIN_VALUE ? $this$nextInt.nextInt(range.getFirst() - 1, range.getLast()) + 1 : $this$nextInt.nextInt());
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final long nextLong(@NotNull Random $this$nextLong, @NotNull LongRange range) {
      Intrinsics.checkNotNullParameter($this$nextLong, "<this>");
      Intrinsics.checkNotNullParameter(range, "range");
      if (range.isEmpty()) {
         throw new IllegalArgumentException("Cannot get random in empty range: " + range);
      } else {
         return range.getLast() < Long.MAX_VALUE ? $this$nextLong.nextLong(range.getFirst(), range.getLast() + 1L) : (range.getFirst() > Long.MIN_VALUE ? $this$nextLong.nextLong(range.getFirst() - 1L, range.getLast()) + 1L : $this$nextLong.nextLong());
      }
   }

   public static final int fastLog2(int value) {
      return 31 - Integer.numberOfLeadingZeros(value);
   }

   public static final int takeUpperBits(int $this$takeUpperBits, int bitCount) {
      return $this$takeUpperBits >>> 32 - bitCount & -bitCount >> 31;
   }

   public static final void checkRangeBounds(int from, int until) {
      if (until <= from) {
         int var2 = false;
         String var3 = boundsErrorMessage(from, until);
         throw new IllegalArgumentException(var3.toString());
      }
   }

   public static final void checkRangeBounds(long from, long until) {
      if (until <= from) {
         int var4 = false;
         String var5 = boundsErrorMessage(from, until);
         throw new IllegalArgumentException(var5.toString());
      }
   }

   public static final void checkRangeBounds(double from, double until) {
      if (!(until > from)) {
         int var4 = false;
         String var5 = boundsErrorMessage(from, until);
         throw new IllegalArgumentException(var5.toString());
      }
   }

   @NotNull
   public static final String boundsErrorMessage(@NotNull Object from, @NotNull Object until) {
      Intrinsics.checkNotNullParameter(from, "from");
      Intrinsics.checkNotNullParameter(until, "until");
      return "Random range is empty: [" + from + ", " + until + ").";
   }
}
