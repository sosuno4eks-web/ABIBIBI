package kotlin.comparisons;

import java.util.Comparator;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class ComparisonsKt___ComparisonsKt extends ComparisonsKt___ComparisonsJvmKt {
   @SinceKotlin(
      version = "1.1"
   )
   public static final <T> T maxOf(T a, T b, T c, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ComparisonsKt.maxOf(a, ComparisonsKt.maxOf(b, c, comparator), comparator);
   }

   @SinceKotlin(
      version = "1.1"
   )
   public static final <T> T maxOf(T a, T b, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return comparator.compare(a, b) >= 0 ? a : b;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final <T> T maxOf(T a, @NotNull T[] other, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Object max = a;
      int var4 = 0;

      for(int var5 = other.length; var4 < var5; ++var4) {
         Object e = other[var4];
         if (comparator.compare(max, e) < 0) {
            max = e;
         }
      }

      return max;
   }

   @SinceKotlin(
      version = "1.1"
   )
   public static final <T> T minOf(T a, T b, T c, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ComparisonsKt.minOf(a, ComparisonsKt.minOf(b, c, comparator), comparator);
   }

   @SinceKotlin(
      version = "1.1"
   )
   public static final <T> T minOf(T a, T b, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return comparator.compare(a, b) <= 0 ? a : b;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final <T> T minOf(T a, @NotNull T[] other, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Object min = a;
      int var4 = 0;

      for(int var5 = other.length; var4 < var5; ++var4) {
         Object e = other[var4];
         if (comparator.compare(min, e) > 0) {
            min = e;
         }
      }

      return min;
   }

   public ComparisonsKt___ComparisonsKt() {
   }
}
