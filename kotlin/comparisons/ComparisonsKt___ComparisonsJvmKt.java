package kotlin.comparisons;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a, @NotNull T b) {
      Intrinsics.checkNotNullParameter(a, "a");
      Intrinsics.checkNotNullParameter(b, "b");
      return a.compareTo(b) >= 0 ? a : b;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final byte maxOf(byte a, byte b) {
      return (byte)Math.max(a, b);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final short maxOf(short a, short b) {
      return (short)Math.max(a, b);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final int maxOf(int a, int b) {
      return Math.max(a, b);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final long maxOf(long a, long b) {
      return Math.max(a, b);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final float maxOf(float a, float b) {
      return Math.max(a, b);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final double maxOf(double a, double b) {
      return Math.max(a, b);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a, @NotNull T b, @NotNull T c) {
      Intrinsics.checkNotNullParameter(a, "a");
      Intrinsics.checkNotNullParameter(b, "b");
      Intrinsics.checkNotNullParameter(c, "c");
      return ComparisonsKt.maxOf(a, ComparisonsKt.maxOf(b, c));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final byte maxOf(byte a, byte b, byte c) {
      return (byte)Math.max(a, Math.max(b, c));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final short maxOf(short a, short b, short c) {
      return (short)Math.max(a, Math.max(b, c));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final int maxOf(int a, int b, int c) {
      return Math.max(a, Math.max(b, c));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final long maxOf(long a, long b, long c) {
      return Math.max(a, Math.max(b, c));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final float maxOf(float a, float b, float c) {
      return Math.max(a, Math.max(b, c));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final double maxOf(double a, double b, double c) {
      return Math.max(a, Math.max(b, c));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a, @NotNull T... other) {
      Intrinsics.checkNotNullParameter(a, "a");
      Intrinsics.checkNotNullParameter(other, "other");
      Comparable max = a;
      int var3 = 0;

      for(int var4 = other.length; var3 < var4; ++var3) {
         Comparable e = other[var3];
         max = ComparisonsKt.maxOf(max, e);
      }

      return max;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final byte maxOf(byte a, @NotNull byte... other) {
      Intrinsics.checkNotNullParameter(other, "other");
      byte max = a;
      int var3 = 0;

      for(int var4 = other.length; var3 < var4; ++var3) {
         byte e = other[var3];
         max = (byte)Math.max(max, e);
      }

      return max;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final short maxOf(short a, @NotNull short... other) {
      Intrinsics.checkNotNullParameter(other, "other");
      short max = a;
      int var3 = 0;

      for(int var4 = other.length; var3 < var4; ++var3) {
         short e = other[var3];
         max = (short)Math.max(max, e);
      }

      return max;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final int maxOf(int a, @NotNull int... other) {
      Intrinsics.checkNotNullParameter(other, "other");
      int max = a;
      int var3 = 0;

      for(int var4 = other.length; var3 < var4; ++var3) {
         int e = other[var3];
         max = Math.max(max, e);
      }

      return max;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final long maxOf(long a, @NotNull long... other) {
      Intrinsics.checkNotNullParameter(other, "other");
      long max = a;
      int var5 = 0;

      for(int var6 = other.length; var5 < var6; ++var5) {
         long e = other[var5];
         max = Math.max(max, e);
      }

      return max;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final float maxOf(float a, @NotNull float... other) {
      Intrinsics.checkNotNullParameter(other, "other");
      float max = a;
      int var3 = 0;

      for(int var4 = other.length; var3 < var4; ++var3) {
         float e = other[var3];
         max = Math.max(max, e);
      }

      return max;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final double maxOf(double a, @NotNull double... other) {
      Intrinsics.checkNotNullParameter(other, "other");
      double max = a;
      int var5 = 0;

      for(int var6 = other.length; var5 < var6; ++var5) {
         double e = other[var5];
         max = Math.max(max, e);
      }

      return max;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T extends Comparable<? super T>> T minOf(@NotNull T a, @NotNull T b) {
      Intrinsics.checkNotNullParameter(a, "a");
      Intrinsics.checkNotNullParameter(b, "b");
      return a.compareTo(b) <= 0 ? a : b;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final byte minOf(byte a, byte b) {
      return (byte)Math.min(a, b);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final short minOf(short a, short b) {
      return (short)Math.min(a, b);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final int minOf(int a, int b) {
      return Math.min(a, b);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final long minOf(long a, long b) {
      return Math.min(a, b);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final float minOf(float a, float b) {
      return Math.min(a, b);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final double minOf(double a, double b) {
      return Math.min(a, b);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @NotNull
   public static final <T extends Comparable<? super T>> T minOf(@NotNull T a, @NotNull T b, @NotNull T c) {
      Intrinsics.checkNotNullParameter(a, "a");
      Intrinsics.checkNotNullParameter(b, "b");
      Intrinsics.checkNotNullParameter(c, "c");
      return ComparisonsKt.minOf(a, ComparisonsKt.minOf(b, c));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final byte minOf(byte a, byte b, byte c) {
      return (byte)Math.min(a, Math.min(b, c));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final short minOf(short a, short b, short c) {
      return (short)Math.min(a, Math.min(b, c));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final int minOf(int a, int b, int c) {
      return Math.min(a, Math.min(b, c));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final long minOf(long a, long b, long c) {
      return Math.min(a, Math.min(b, c));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final float minOf(float a, float b, float c) {
      return Math.min(a, Math.min(b, c));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final double minOf(double a, double b, double c) {
      return Math.min(a, Math.min(b, c));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T extends Comparable<? super T>> T minOf(@NotNull T a, @NotNull T... other) {
      Intrinsics.checkNotNullParameter(a, "a");
      Intrinsics.checkNotNullParameter(other, "other");
      Comparable min = a;
      int var3 = 0;

      for(int var4 = other.length; var3 < var4; ++var3) {
         Comparable e = other[var3];
         min = ComparisonsKt.minOf(min, e);
      }

      return min;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final byte minOf(byte a, @NotNull byte... other) {
      Intrinsics.checkNotNullParameter(other, "other");
      byte min = a;
      int var3 = 0;

      for(int var4 = other.length; var3 < var4; ++var3) {
         byte e = other[var3];
         min = (byte)Math.min(min, e);
      }

      return min;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final short minOf(short a, @NotNull short... other) {
      Intrinsics.checkNotNullParameter(other, "other");
      short min = a;
      int var3 = 0;

      for(int var4 = other.length; var3 < var4; ++var3) {
         short e = other[var3];
         min = (short)Math.min(min, e);
      }

      return min;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final int minOf(int a, @NotNull int... other) {
      Intrinsics.checkNotNullParameter(other, "other");
      int min = a;
      int var3 = 0;

      for(int var4 = other.length; var3 < var4; ++var3) {
         int e = other[var3];
         min = Math.min(min, e);
      }

      return min;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final long minOf(long a, @NotNull long... other) {
      Intrinsics.checkNotNullParameter(other, "other");
      long min = a;
      int var5 = 0;

      for(int var6 = other.length; var5 < var6; ++var5) {
         long e = other[var5];
         min = Math.min(min, e);
      }

      return min;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final float minOf(float a, @NotNull float... other) {
      Intrinsics.checkNotNullParameter(other, "other");
      float min = a;
      int var3 = 0;

      for(int var4 = other.length; var3 < var4; ++var3) {
         float e = other[var3];
         min = Math.min(min, e);
      }

      return min;
   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final double minOf(double a, @NotNull double... other) {
      Intrinsics.checkNotNullParameter(other, "other");
      double min = a;
      int var5 = 0;

      for(int var6 = other.length; var5 < var6; ++var5) {
         double e = other[var5];
         min = Math.min(min, e);
      }

      return min;
   }

   public ComparisonsKt___ComparisonsJvmKt() {
   }
}
