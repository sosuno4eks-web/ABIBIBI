package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class ArraysKt___ArraysJvmKt extends ArraysKt__ArraysKt {
   @InlineOnly
   private static final <T> T elementAt(T[] $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return $this$elementAt[index];
   }

   @InlineOnly
   private static final byte elementAt(byte[] $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return $this$elementAt[index];
   }

   @InlineOnly
   private static final short elementAt(short[] $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return $this$elementAt[index];
   }

   @InlineOnly
   private static final int elementAt(int[] $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return $this$elementAt[index];
   }

   @InlineOnly
   private static final long elementAt(long[] $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return $this$elementAt[index];
   }

   @InlineOnly
   private static final float elementAt(float[] $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return $this$elementAt[index];
   }

   @InlineOnly
   private static final double elementAt(double[] $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return $this$elementAt[index];
   }

   @InlineOnly
   private static final boolean elementAt(boolean[] $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return $this$elementAt[index];
   }

   @InlineOnly
   private static final char elementAt(char[] $this$elementAt, int index) {
      Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
      return $this$elementAt[index];
   }

   @NotNull
   public static final <R> List<R> filterIsInstance(@NotNull Object[] $this$filterIsInstance, @NotNull Class<R> klass) {
      Intrinsics.checkNotNullParameter($this$filterIsInstance, "<this>");
      Intrinsics.checkNotNullParameter(klass, "klass");
      return (List)ArraysKt.filterIsInstanceTo($this$filterIsInstance, (Collection)(new ArrayList()), klass);
   }

   @NotNull
   public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Object[] $this$filterIsInstanceTo, @NotNull C destination, @NotNull Class<R> klass) {
      Intrinsics.checkNotNullParameter($this$filterIsInstanceTo, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(klass, "klass");
      int var3 = 0;

      for(int var4 = $this$filterIsInstanceTo.length; var3 < var4; ++var3) {
         Object element = $this$filterIsInstanceTo[var3];
         if (klass.isInstance(element)) {
            destination.add(element);
         }
      }

      return destination;
   }

   @NotNull
   public static final <T> List<T> asList(@NotNull T[] $this$asList) {
      Intrinsics.checkNotNullParameter($this$asList, "<this>");
      List var10000 = ArraysUtilJVM.asList($this$asList);
      Intrinsics.checkNotNullExpressionValue(var10000, "asList(...)");
      return var10000;
   }

   @NotNull
   public static final List<Byte> asList(@NotNull byte[] $this$asList) {
      Intrinsics.checkNotNullParameter($this$asList, "<this>");
      return (List)(new RandomAccess() {
         public int getSize() {
            return $this$asList.length;
         }

         public boolean isEmpty() {
            return $this$asList.length == 0;
         }

         public boolean contains(byte element) {
            return ArraysKt.contains($this$asList, element);
         }

         public Byte get(int index) {
            return $this$asList[index];
         }

         public int indexOf(byte element) {
            return ArraysKt.indexOf($this$asList, element);
         }

         public int lastIndexOf(byte element) {
            return ArraysKt.lastIndexOf($this$asList, element);
         }
      });
   }

   @NotNull
   public static final List<Short> asList(@NotNull short[] $this$asList) {
      Intrinsics.checkNotNullParameter($this$asList, "<this>");
      return (List)(new RandomAccess() {
         public int getSize() {
            return $this$asList.length;
         }

         public boolean isEmpty() {
            return $this$asList.length == 0;
         }

         public boolean contains(short element) {
            return ArraysKt.contains($this$asList, element);
         }

         public Short get(int index) {
            return $this$asList[index];
         }

         public int indexOf(short element) {
            return ArraysKt.indexOf($this$asList, element);
         }

         public int lastIndexOf(short element) {
            return ArraysKt.lastIndexOf($this$asList, element);
         }
      });
   }

   @NotNull
   public static final List<Integer> asList(@NotNull int[] $this$asList) {
      Intrinsics.checkNotNullParameter($this$asList, "<this>");
      return (List)(new RandomAccess() {
         public int getSize() {
            return $this$asList.length;
         }

         public boolean isEmpty() {
            return $this$asList.length == 0;
         }

         public boolean contains(int element) {
            return ArraysKt.contains($this$asList, element);
         }

         public Integer get(int index) {
            return $this$asList[index];
         }

         public int indexOf(int element) {
            return ArraysKt.indexOf($this$asList, element);
         }

         public int lastIndexOf(int element) {
            return ArraysKt.lastIndexOf($this$asList, element);
         }
      });
   }

   @NotNull
   public static final List<Long> asList(@NotNull long[] $this$asList) {
      Intrinsics.checkNotNullParameter($this$asList, "<this>");
      return (List)(new RandomAccess() {
         public int getSize() {
            return $this$asList.length;
         }

         public boolean isEmpty() {
            return $this$asList.length == 0;
         }

         public boolean contains(long element) {
            return ArraysKt.contains($this$asList, element);
         }

         public Long get(int index) {
            return $this$asList[index];
         }

         public int indexOf(long element) {
            return ArraysKt.indexOf($this$asList, element);
         }

         public int lastIndexOf(long element) {
            return ArraysKt.lastIndexOf($this$asList, element);
         }
      });
   }

   @NotNull
   public static final List<Float> asList(@NotNull float[] $this$asList) {
      Intrinsics.checkNotNullParameter($this$asList, "<this>");
      return (List)(new RandomAccess() {
         public int getSize() {
            return $this$asList.length;
         }

         public boolean isEmpty() {
            return $this$asList.length == 0;
         }

         public boolean contains(float element) {
            float[] $this$any$iv = $this$asList;
            int $i$f$any = false;
            int var4 = 0;
            int var5 = $this$any$iv.length;

            boolean var10000;
            while(true) {
               if (var4 >= var5) {
                  var10000 = false;
                  break;
               }

               float element$iv = $this$any$iv[var4];
               int var8 = false;
               if (Float.floatToIntBits(element$iv) == Float.floatToIntBits(element)) {
                  var10000 = true;
                  break;
               }

               ++var4;
            }

            return var10000;
         }

         public Float get(int index) {
            return $this$asList[index];
         }

         public int indexOf(float element) {
            float[] $this$indexOfFirst$iv = $this$asList;
            int $i$f$indexOfFirst = false;
            int index$iv = 0;
            int var5 = $this$indexOfFirst$iv.length;

            int var10000;
            while(true) {
               if (index$iv >= var5) {
                  var10000 = -1;
                  break;
               }

               float it = $this$indexOfFirst$iv[index$iv];
               int var7 = false;
               if (Float.floatToIntBits(it) == Float.floatToIntBits(element)) {
                  var10000 = index$iv;
                  break;
               }

               ++index$iv;
            }

            return var10000;
         }

         public int lastIndexOf(float element) {
            float[] $this$indexOfLast$iv = $this$asList;
            int $i$f$indexOfLast = false;
            int var4 = $this$indexOfLast$iv.length + -1;
            int var10000;
            if (0 <= var4) {
               do {
                  int index$iv = var4--;
                  float it = $this$indexOfLast$iv[index$iv];
                  int var7 = false;
                  if (Float.floatToIntBits(it) == Float.floatToIntBits(element)) {
                     var10000 = index$iv;
                     return var10000;
                  }
               } while(0 <= var4);
            }

            var10000 = -1;
            return var10000;
         }
      });
   }

   @NotNull
   public static final List<Double> asList(@NotNull double[] $this$asList) {
      Intrinsics.checkNotNullParameter($this$asList, "<this>");
      return (List)(new RandomAccess() {
         public int getSize() {
            return $this$asList.length;
         }

         public boolean isEmpty() {
            return $this$asList.length == 0;
         }

         public boolean contains(double element) {
            double[] $this$any$iv = $this$asList;
            int $i$f$any = false;
            int var5 = 0;
            int var6 = $this$any$iv.length;

            boolean var10000;
            while(true) {
               if (var5 >= var6) {
                  var10000 = false;
                  break;
               }

               double element$iv = $this$any$iv[var5];
               int var11 = false;
               if (Double.doubleToLongBits(element$iv) == Double.doubleToLongBits(element)) {
                  var10000 = true;
                  break;
               }

               ++var5;
            }

            return var10000;
         }

         public Double get(int index) {
            return $this$asList[index];
         }

         public int indexOf(double element) {
            double[] $this$indexOfFirst$iv = $this$asList;
            int $i$f$indexOfFirst = false;
            int index$iv = 0;
            int var6 = $this$indexOfFirst$iv.length;

            int var10000;
            while(true) {
               if (index$iv >= var6) {
                  var10000 = -1;
                  break;
               }

               double it = $this$indexOfFirst$iv[index$iv];
               int var9 = false;
               if (Double.doubleToLongBits(it) == Double.doubleToLongBits(element)) {
                  var10000 = index$iv;
                  break;
               }

               ++index$iv;
            }

            return var10000;
         }

         public int lastIndexOf(double element) {
            double[] $this$indexOfLast$iv = $this$asList;
            int $i$f$indexOfLast = false;
            int var5 = $this$indexOfLast$iv.length + -1;
            int var10000;
            if (0 <= var5) {
               do {
                  int index$iv = var5--;
                  double it = $this$indexOfLast$iv[index$iv];
                  int var9 = false;
                  if (Double.doubleToLongBits(it) == Double.doubleToLongBits(element)) {
                     var10000 = index$iv;
                     return var10000;
                  }
               } while(0 <= var5);
            }

            var10000 = -1;
            return var10000;
         }
      });
   }

   @NotNull
   public static final List<Boolean> asList(@NotNull boolean[] $this$asList) {
      Intrinsics.checkNotNullParameter($this$asList, "<this>");
      return (List)(new RandomAccess() {
         public int getSize() {
            return $this$asList.length;
         }

         public boolean isEmpty() {
            return $this$asList.length == 0;
         }

         public boolean contains(boolean element) {
            return ArraysKt.contains($this$asList, element);
         }

         public Boolean get(int index) {
            return $this$asList[index];
         }

         public int indexOf(boolean element) {
            return ArraysKt.indexOf($this$asList, element);
         }

         public int lastIndexOf(boolean element) {
            return ArraysKt.lastIndexOf($this$asList, element);
         }
      });
   }

   @NotNull
   public static final List<Character> asList(@NotNull char[] $this$asList) {
      Intrinsics.checkNotNullParameter($this$asList, "<this>");
      return (List)(new RandomAccess() {
         public int getSize() {
            return $this$asList.length;
         }

         public boolean isEmpty() {
            return $this$asList.length == 0;
         }

         public boolean contains(char element) {
            return ArraysKt.contains($this$asList, element);
         }

         public Character get(int index) {
            return $this$asList[index];
         }

         public int indexOf(char element) {
            return ArraysKt.indexOf($this$asList, element);
         }

         public int lastIndexOf(char element) {
            return ArraysKt.lastIndexOf($this$asList, element);
         }
      });
   }

   public static final <T> int binarySearch(@NotNull T[] $this$binarySearch, T element, @NotNull Comparator<? super T> comparator, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element, comparator);
   }

   // $FF: synthetic method
   public static int binarySearch$default(Object[] var0, Object var1, Comparator var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.length;
      }

      return ArraysKt.binarySearch(var0, var1, var2, var3, var4);
   }

   public static final <T> int binarySearch(@NotNull T[] $this$binarySearch, T element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
      return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static int binarySearch$default(Object[] var0, Object var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      return ArraysKt.binarySearch(var0, var1, var2, var3);
   }

   public static final int binarySearch(@NotNull byte[] $this$binarySearch, byte element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
      return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static int binarySearch$default(byte[] var0, byte var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      return ArraysKt.binarySearch(var0, var1, var2, var3);
   }

   public static final int binarySearch(@NotNull short[] $this$binarySearch, short element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
      return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static int binarySearch$default(short[] var0, short var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      return ArraysKt.binarySearch(var0, var1, var2, var3);
   }

   public static final int binarySearch(@NotNull int[] $this$binarySearch, int element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
      return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static int binarySearch$default(int[] var0, int var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      return ArraysKt.binarySearch(var0, var1, var2, var3);
   }

   public static final int binarySearch(@NotNull long[] $this$binarySearch, long element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
      return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static int binarySearch$default(long[] var0, long var1, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var3 = 0;
      }

      if ((var5 & 4) != 0) {
         var4 = var0.length;
      }

      return ArraysKt.binarySearch(var0, var1, var3, var4);
   }

   public static final int binarySearch(@NotNull float[] $this$binarySearch, float element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
      return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static int binarySearch$default(float[] var0, float var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      return ArraysKt.binarySearch(var0, var1, var2, var3);
   }

   public static final int binarySearch(@NotNull double[] $this$binarySearch, double element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
      return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static int binarySearch$default(double[] var0, double var1, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var3 = 0;
      }

      if ((var5 & 4) != 0) {
         var4 = var0.length;
      }

      return ArraysKt.binarySearch(var0, var1, var3, var4);
   }

   public static final int binarySearch(@NotNull char[] $this$binarySearch, char element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
      return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static int binarySearch$default(char[] var0, char var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      return ArraysKt.binarySearch(var0, var1, var2, var3);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @LowPriorityInOverloadResolution
   @JvmName(
      name = "contentDeepEqualsInline"
   )
   @InlineOnly
   private static final <T> boolean contentDeepEqualsInline(T[] $this$contentDeepEquals, T[] other) {
      Intrinsics.checkNotNullParameter($this$contentDeepEquals, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      return ArraysKt.contentDeepEquals($this$contentDeepEquals, other);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @JvmName(
      name = "contentDeepEqualsNullable"
   )
   @InlineOnly
   private static final <T> boolean contentDeepEqualsNullable(T[] $this$contentDeepEquals, T[] other) {
      return ArraysKt.contentDeepEquals($this$contentDeepEquals, other);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @LowPriorityInOverloadResolution
   @JvmName(
      name = "contentDeepHashCodeInline"
   )
   @InlineOnly
   private static final <T> int contentDeepHashCodeInline(T[] $this$contentDeepHashCode) {
      Intrinsics.checkNotNullParameter($this$contentDeepHashCode, "<this>");
      return ArraysKt.contentDeepHashCode($this$contentDeepHashCode);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @JvmName(
      name = "contentDeepHashCodeNullable"
   )
   @InlineOnly
   private static final <T> int contentDeepHashCodeNullable(T[] $this$contentDeepHashCode) {
      return ArraysKt.contentDeepHashCode($this$contentDeepHashCode);
   }

   @SinceKotlin(
      version = "1.1"
   )
   @LowPriorityInOverloadResolution
   @JvmName(
      name = "contentDeepToStringInline"
   )
   @InlineOnly
   private static final <T> String contentDeepToStringInline(T[] $this$contentDeepToString) {
      Intrinsics.checkNotNullParameter($this$contentDeepToString, "<this>");
      return ArraysKt.contentDeepToString($this$contentDeepToString);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @JvmName(
      name = "contentDeepToStringNullable"
   )
   @InlineOnly
   private static final <T> String contentDeepToStringNullable(T[] $this$contentDeepToString) {
      return ArraysKt.contentDeepToString($this$contentDeepToString);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final <T> boolean contentEquals(T[] $this$contentEquals, T[] other) {
      return Arrays.equals($this$contentEquals, other);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final boolean contentEquals(byte[] $this$contentEquals, byte[] other) {
      return Arrays.equals($this$contentEquals, other);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final boolean contentEquals(short[] $this$contentEquals, short[] other) {
      return Arrays.equals($this$contentEquals, other);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final boolean contentEquals(int[] $this$contentEquals, int[] other) {
      return Arrays.equals($this$contentEquals, other);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final boolean contentEquals(long[] $this$contentEquals, long[] other) {
      return Arrays.equals($this$contentEquals, other);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final boolean contentEquals(float[] $this$contentEquals, float[] other) {
      return Arrays.equals($this$contentEquals, other);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final boolean contentEquals(double[] $this$contentEquals, double[] other) {
      return Arrays.equals($this$contentEquals, other);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final boolean contentEquals(boolean[] $this$contentEquals, boolean[] other) {
      return Arrays.equals($this$contentEquals, other);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final boolean contentEquals(char[] $this$contentEquals, char[] other) {
      return Arrays.equals($this$contentEquals, other);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final <T> int contentHashCode(T[] $this$contentHashCode) {
      return Arrays.hashCode($this$contentHashCode);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int contentHashCode(byte[] $this$contentHashCode) {
      return Arrays.hashCode($this$contentHashCode);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int contentHashCode(short[] $this$contentHashCode) {
      return Arrays.hashCode($this$contentHashCode);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int contentHashCode(int[] $this$contentHashCode) {
      return Arrays.hashCode($this$contentHashCode);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int contentHashCode(long[] $this$contentHashCode) {
      return Arrays.hashCode($this$contentHashCode);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int contentHashCode(float[] $this$contentHashCode) {
      return Arrays.hashCode($this$contentHashCode);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int contentHashCode(double[] $this$contentHashCode) {
      return Arrays.hashCode($this$contentHashCode);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int contentHashCode(boolean[] $this$contentHashCode) {
      return Arrays.hashCode($this$contentHashCode);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final int contentHashCode(char[] $this$contentHashCode) {
      return Arrays.hashCode($this$contentHashCode);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final <T> String contentToString(T[] $this$contentToString) {
      String var10000 = Arrays.toString($this$contentToString);
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final String contentToString(byte[] $this$contentToString) {
      String var10000 = Arrays.toString($this$contentToString);
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final String contentToString(short[] $this$contentToString) {
      String var10000 = Arrays.toString($this$contentToString);
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final String contentToString(int[] $this$contentToString) {
      String var10000 = Arrays.toString($this$contentToString);
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final String contentToString(long[] $this$contentToString) {
      String var10000 = Arrays.toString($this$contentToString);
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final String contentToString(float[] $this$contentToString) {
      String var10000 = Arrays.toString($this$contentToString);
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final String contentToString(double[] $this$contentToString) {
      String var10000 = Arrays.toString($this$contentToString);
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final String contentToString(boolean[] $this$contentToString) {
      String var10000 = Arrays.toString($this$contentToString);
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @InlineOnly
   private static final String contentToString(char[] $this$contentToString) {
      String var10000 = Arrays.toString($this$contentToString);
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <T> T[] copyInto(@NotNull T[] $this$copyInto, @NotNull T[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
      return destination;
   }

   // $FF: synthetic method
   public static Object[] copyInto$default(Object[] var0, Object[] var1, int var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 0;
      }

      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.length;
      }

      return ArraysKt.copyInto(var0, var1, var2, var3, var4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final byte[] copyInto(@NotNull byte[] $this$copyInto, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
      return destination;
   }

   // $FF: synthetic method
   public static byte[] copyInto$default(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 0;
      }

      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.length;
      }

      return ArraysKt.copyInto(var0, var1, var2, var3, var4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final short[] copyInto(@NotNull short[] $this$copyInto, @NotNull short[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
      return destination;
   }

   // $FF: synthetic method
   public static short[] copyInto$default(short[] var0, short[] var1, int var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 0;
      }

      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.length;
      }

      return ArraysKt.copyInto(var0, var1, var2, var3, var4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final int[] copyInto(@NotNull int[] $this$copyInto, @NotNull int[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
      return destination;
   }

   // $FF: synthetic method
   public static int[] copyInto$default(int[] var0, int[] var1, int var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 0;
      }

      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.length;
      }

      return ArraysKt.copyInto(var0, var1, var2, var3, var4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final long[] copyInto(@NotNull long[] $this$copyInto, @NotNull long[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
      return destination;
   }

   // $FF: synthetic method
   public static long[] copyInto$default(long[] var0, long[] var1, int var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 0;
      }

      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.length;
      }

      return ArraysKt.copyInto(var0, var1, var2, var3, var4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final float[] copyInto(@NotNull float[] $this$copyInto, @NotNull float[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
      return destination;
   }

   // $FF: synthetic method
   public static float[] copyInto$default(float[] var0, float[] var1, int var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 0;
      }

      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.length;
      }

      return ArraysKt.copyInto(var0, var1, var2, var3, var4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final double[] copyInto(@NotNull double[] $this$copyInto, @NotNull double[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
      return destination;
   }

   // $FF: synthetic method
   public static double[] copyInto$default(double[] var0, double[] var1, int var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 0;
      }

      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.length;
      }

      return ArraysKt.copyInto(var0, var1, var2, var3, var4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final boolean[] copyInto(@NotNull boolean[] $this$copyInto, @NotNull boolean[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
      return destination;
   }

   // $FF: synthetic method
   public static boolean[] copyInto$default(boolean[] var0, boolean[] var1, int var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 0;
      }

      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.length;
      }

      return ArraysKt.copyInto(var0, var1, var2, var3, var4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final char[] copyInto(@NotNull char[] $this$copyInto, @NotNull char[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
      return destination;
   }

   // $FF: synthetic method
   public static char[] copyInto$default(char[] var0, char[] var1, int var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 0;
      }

      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.length;
      }

      return ArraysKt.copyInto(var0, var1, var2, var3, var4);
   }

   @InlineOnly
   private static final <T> T[] copyOf(T[] $this$copyOf) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      Object[] var10000 = Arrays.copyOf($this$copyOf, $this$copyOf.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final byte[] copyOf(byte[] $this$copyOf) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      byte[] var10000 = Arrays.copyOf($this$copyOf, $this$copyOf.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final short[] copyOf(short[] $this$copyOf) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      short[] var10000 = Arrays.copyOf($this$copyOf, $this$copyOf.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final int[] copyOf(int[] $this$copyOf) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      int[] var10000 = Arrays.copyOf($this$copyOf, $this$copyOf.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final long[] copyOf(long[] $this$copyOf) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      long[] var10000 = Arrays.copyOf($this$copyOf, $this$copyOf.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final float[] copyOf(float[] $this$copyOf) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      float[] var10000 = Arrays.copyOf($this$copyOf, $this$copyOf.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final double[] copyOf(double[] $this$copyOf) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      double[] var10000 = Arrays.copyOf($this$copyOf, $this$copyOf.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final boolean[] copyOf(boolean[] $this$copyOf) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      boolean[] var10000 = Arrays.copyOf($this$copyOf, $this$copyOf.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final char[] copyOf(char[] $this$copyOf) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      char[] var10000 = Arrays.copyOf($this$copyOf, $this$copyOf.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final byte[] copyOf(byte[] $this$copyOf, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      byte[] var10000 = Arrays.copyOf($this$copyOf, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final short[] copyOf(short[] $this$copyOf, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      short[] var10000 = Arrays.copyOf($this$copyOf, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final int[] copyOf(int[] $this$copyOf, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      int[] var10000 = Arrays.copyOf($this$copyOf, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final long[] copyOf(long[] $this$copyOf, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      long[] var10000 = Arrays.copyOf($this$copyOf, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final float[] copyOf(float[] $this$copyOf, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      float[] var10000 = Arrays.copyOf($this$copyOf, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final double[] copyOf(double[] $this$copyOf, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      double[] var10000 = Arrays.copyOf($this$copyOf, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final boolean[] copyOf(boolean[] $this$copyOf, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      boolean[] var10000 = Arrays.copyOf($this$copyOf, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final char[] copyOf(char[] $this$copyOf, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      char[] var10000 = Arrays.copyOf($this$copyOf, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @InlineOnly
   private static final <T> T[] copyOf(T[] $this$copyOf, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
      Object[] var10000 = Arrays.copyOf($this$copyOf, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @JvmName(
      name = "copyOfRangeInline"
   )
   @InlineOnly
   private static final <T> T[] copyOfRangeInline(T[] $this$copyOfRange, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
      return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
   }

   @JvmName(
      name = "copyOfRangeInline"
   )
   @InlineOnly
   private static final byte[] copyOfRangeInline(byte[] $this$copyOfRange, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
      return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
   }

   @JvmName(
      name = "copyOfRangeInline"
   )
   @InlineOnly
   private static final short[] copyOfRangeInline(short[] $this$copyOfRange, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
      return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
   }

   @JvmName(
      name = "copyOfRangeInline"
   )
   @InlineOnly
   private static final int[] copyOfRangeInline(int[] $this$copyOfRange, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
      return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
   }

   @JvmName(
      name = "copyOfRangeInline"
   )
   @InlineOnly
   private static final long[] copyOfRangeInline(long[] $this$copyOfRange, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
      return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
   }

   @JvmName(
      name = "copyOfRangeInline"
   )
   @InlineOnly
   private static final float[] copyOfRangeInline(float[] $this$copyOfRange, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
      return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
   }

   @JvmName(
      name = "copyOfRangeInline"
   )
   @InlineOnly
   private static final double[] copyOfRangeInline(double[] $this$copyOfRange, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
      return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
   }

   @JvmName(
      name = "copyOfRangeInline"
   )
   @InlineOnly
   private static final boolean[] copyOfRangeInline(boolean[] $this$copyOfRange, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
      return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
   }

   @JvmName(
      name = "copyOfRangeInline"
   )
   @InlineOnly
   private static final char[] copyOfRangeInline(char[] $this$copyOfRange, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
      return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @JvmName(
      name = "copyOfRange"
   )
   @NotNull
   public static final <T> T[] copyOfRange(@NotNull T[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
      ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
      Object[] var10000 = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOfRange(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @JvmName(
      name = "copyOfRange"
   )
   @NotNull
   public static final byte[] copyOfRange(@NotNull byte[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
      ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
      byte[] var10000 = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOfRange(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @JvmName(
      name = "copyOfRange"
   )
   @NotNull
   public static final short[] copyOfRange(@NotNull short[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
      ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
      short[] var10000 = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOfRange(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @JvmName(
      name = "copyOfRange"
   )
   @NotNull
   public static final int[] copyOfRange(@NotNull int[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
      ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
      int[] var10000 = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOfRange(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @JvmName(
      name = "copyOfRange"
   )
   @NotNull
   public static final long[] copyOfRange(@NotNull long[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
      ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
      long[] var10000 = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOfRange(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @JvmName(
      name = "copyOfRange"
   )
   @NotNull
   public static final float[] copyOfRange(@NotNull float[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
      ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
      float[] var10000 = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOfRange(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @JvmName(
      name = "copyOfRange"
   )
   @NotNull
   public static final double[] copyOfRange(@NotNull double[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
      ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
      double[] var10000 = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOfRange(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @JvmName(
      name = "copyOfRange"
   )
   @NotNull
   public static final boolean[] copyOfRange(@NotNull boolean[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
      ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
      boolean[] var10000 = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOfRange(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @JvmName(
      name = "copyOfRange"
   )
   @NotNull
   public static final char[] copyOfRange(@NotNull char[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
      ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
      char[] var10000 = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOfRange(...)");
      return var10000;
   }

   public static final <T> void fill(@NotNull T[] $this$fill, T element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill, "<this>");
      Arrays.fill($this$fill, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static void fill$default(Object[] var0, Object var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      ArraysKt.fill(var0, var1, var2, var3);
   }

   public static final void fill(@NotNull byte[] $this$fill, byte element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill, "<this>");
      Arrays.fill($this$fill, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static void fill$default(byte[] var0, byte var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      ArraysKt.fill(var0, var1, var2, var3);
   }

   public static final void fill(@NotNull short[] $this$fill, short element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill, "<this>");
      Arrays.fill($this$fill, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static void fill$default(short[] var0, short var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      ArraysKt.fill(var0, var1, var2, var3);
   }

   public static final void fill(@NotNull int[] $this$fill, int element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill, "<this>");
      Arrays.fill($this$fill, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static void fill$default(int[] var0, int var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      ArraysKt.fill(var0, var1, var2, var3);
   }

   public static final void fill(@NotNull long[] $this$fill, long element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill, "<this>");
      Arrays.fill($this$fill, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static void fill$default(long[] var0, long var1, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var3 = 0;
      }

      if ((var5 & 4) != 0) {
         var4 = var0.length;
      }

      ArraysKt.fill(var0, var1, var3, var4);
   }

   public static final void fill(@NotNull float[] $this$fill, float element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill, "<this>");
      Arrays.fill($this$fill, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static void fill$default(float[] var0, float var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      ArraysKt.fill(var0, var1, var2, var3);
   }

   public static final void fill(@NotNull double[] $this$fill, double element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill, "<this>");
      Arrays.fill($this$fill, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static void fill$default(double[] var0, double var1, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var3 = 0;
      }

      if ((var5 & 4) != 0) {
         var4 = var0.length;
      }

      ArraysKt.fill(var0, var1, var3, var4);
   }

   public static final void fill(@NotNull boolean[] $this$fill, boolean element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill, "<this>");
      Arrays.fill($this$fill, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static void fill$default(boolean[] var0, boolean var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      ArraysKt.fill(var0, var1, var2, var3);
   }

   public static final void fill(@NotNull char[] $this$fill, char element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill, "<this>");
      Arrays.fill($this$fill, fromIndex, toIndex, element);
   }

   // $FF: synthetic method
   public static void fill$default(char[] var0, char var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      ArraysKt.fill(var0, var1, var2, var3);
   }

   @NotNull
   public static final <T> T[] plus(@NotNull T[] $this$plus, T element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      int index = $this$plus.length;
      Object[] result = Arrays.copyOf($this$plus, index + 1);
      result[index] = element;
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final byte[] plus(@NotNull byte[] $this$plus, byte element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      int index = $this$plus.length;
      byte[] result = Arrays.copyOf($this$plus, index + 1);
      result[index] = element;
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final short[] plus(@NotNull short[] $this$plus, short element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      int index = $this$plus.length;
      short[] result = Arrays.copyOf($this$plus, index + 1);
      result[index] = element;
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final int[] plus(@NotNull int[] $this$plus, int element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      int index = $this$plus.length;
      int[] result = Arrays.copyOf($this$plus, index + 1);
      result[index] = element;
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final long[] plus(@NotNull long[] $this$plus, long element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      int index = $this$plus.length;
      long[] result = Arrays.copyOf($this$plus, index + 1);
      result[index] = element;
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final float[] plus(@NotNull float[] $this$plus, float element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      int index = $this$plus.length;
      float[] result = Arrays.copyOf($this$plus, index + 1);
      result[index] = element;
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final double[] plus(@NotNull double[] $this$plus, double element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      int index = $this$plus.length;
      double[] result = Arrays.copyOf($this$plus, index + 1);
      result[index] = element;
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final boolean[] plus(@NotNull boolean[] $this$plus, boolean element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      int index = $this$plus.length;
      boolean[] result = Arrays.copyOf($this$plus, index + 1);
      result[index] = element;
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final char[] plus(@NotNull char[] $this$plus, char element) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      int index = $this$plus.length;
      char[] result = Arrays.copyOf($this$plus, index + 1);
      result[index] = element;
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final <T> T[] plus(@NotNull T[] $this$plus, @NotNull Collection<? extends T> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = $this$plus.length;
      Object[] result = Arrays.copyOf($this$plus, index + elements.size());

      Object element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = var4.next();
      }

      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final byte[] plus(@NotNull byte[] $this$plus, @NotNull Collection<Byte> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = $this$plus.length;
      byte[] result = Arrays.copyOf($this$plus, index + elements.size());

      byte element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = ((Number)var4.next()).byteValue();
      }

      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final short[] plus(@NotNull short[] $this$plus, @NotNull Collection<Short> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = $this$plus.length;
      short[] result = Arrays.copyOf($this$plus, index + elements.size());

      short element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = ((Number)var4.next()).shortValue();
      }

      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final int[] plus(@NotNull int[] $this$plus, @NotNull Collection<Integer> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = $this$plus.length;
      int[] result = Arrays.copyOf($this$plus, index + elements.size());

      int element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = ((Number)var4.next()).intValue();
      }

      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final long[] plus(@NotNull long[] $this$plus, @NotNull Collection<Long> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = $this$plus.length;
      long[] result = Arrays.copyOf($this$plus, index + elements.size());

      long element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = ((Number)var4.next()).longValue();
      }

      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final float[] plus(@NotNull float[] $this$plus, @NotNull Collection<Float> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = $this$plus.length;
      float[] result = Arrays.copyOf($this$plus, index + elements.size());

      float element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = ((Number)var4.next()).floatValue();
      }

      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final double[] plus(@NotNull double[] $this$plus, @NotNull Collection<Double> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = $this$plus.length;
      double[] result = Arrays.copyOf($this$plus, index + elements.size());

      double element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = ((Number)var4.next()).doubleValue();
      }

      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final boolean[] plus(@NotNull boolean[] $this$plus, @NotNull Collection<Boolean> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = $this$plus.length;
      boolean[] result = Arrays.copyOf($this$plus, index + elements.size());

      boolean element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = (Boolean)var4.next();
      }

      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final char[] plus(@NotNull char[] $this$plus, @NotNull Collection<Character> elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = $this$plus.length;
      char[] result = Arrays.copyOf($this$plus, index + elements.size());

      char element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = (Character)var4.next();
      }

      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final <T> T[] plus(@NotNull T[] $this$plus, @NotNull T[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int thisSize = $this$plus.length;
      int arraySize = elements.length;
      Object[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
      System.arraycopy(elements, 0, result, thisSize, arraySize);
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final byte[] plus(@NotNull byte[] $this$plus, @NotNull byte[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int thisSize = $this$plus.length;
      int arraySize = elements.length;
      byte[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
      System.arraycopy(elements, 0, result, thisSize, arraySize);
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final short[] plus(@NotNull short[] $this$plus, @NotNull short[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int thisSize = $this$plus.length;
      int arraySize = elements.length;
      short[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
      System.arraycopy(elements, 0, result, thisSize, arraySize);
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final int[] plus(@NotNull int[] $this$plus, @NotNull int[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int thisSize = $this$plus.length;
      int arraySize = elements.length;
      int[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
      System.arraycopy(elements, 0, result, thisSize, arraySize);
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final long[] plus(@NotNull long[] $this$plus, @NotNull long[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int thisSize = $this$plus.length;
      int arraySize = elements.length;
      long[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
      System.arraycopy(elements, 0, result, thisSize, arraySize);
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final float[] plus(@NotNull float[] $this$plus, @NotNull float[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int thisSize = $this$plus.length;
      int arraySize = elements.length;
      float[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
      System.arraycopy(elements, 0, result, thisSize, arraySize);
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final double[] plus(@NotNull double[] $this$plus, @NotNull double[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int thisSize = $this$plus.length;
      int arraySize = elements.length;
      double[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
      System.arraycopy(elements, 0, result, thisSize, arraySize);
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final boolean[] plus(@NotNull boolean[] $this$plus, @NotNull boolean[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int thisSize = $this$plus.length;
      int arraySize = elements.length;
      boolean[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
      System.arraycopy(elements, 0, result, thisSize, arraySize);
      Intrinsics.checkNotNull(result);
      return result;
   }

   @NotNull
   public static final char[] plus(@NotNull char[] $this$plus, @NotNull char[] elements) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int thisSize = $this$plus.length;
      int arraySize = elements.length;
      char[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
      System.arraycopy(elements, 0, result, thisSize, arraySize);
      Intrinsics.checkNotNull(result);
      return result;
   }

   @InlineOnly
   private static final <T> T[] plusElement(T[] $this$plusElement, T element) {
      Intrinsics.checkNotNullParameter($this$plusElement, "<this>");
      return ArraysKt.plus($this$plusElement, element);
   }

   public static final void sort(@NotNull int[] $this$sort) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      if ($this$sort.length > 1) {
         Arrays.sort($this$sort);
      }

   }

   public static final void sort(@NotNull long[] $this$sort) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      if ($this$sort.length > 1) {
         Arrays.sort($this$sort);
      }

   }

   public static final void sort(@NotNull byte[] $this$sort) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      if ($this$sort.length > 1) {
         Arrays.sort($this$sort);
      }

   }

   public static final void sort(@NotNull short[] $this$sort) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      if ($this$sort.length > 1) {
         Arrays.sort($this$sort);
      }

   }

   public static final void sort(@NotNull double[] $this$sort) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      if ($this$sort.length > 1) {
         Arrays.sort($this$sort);
      }

   }

   public static final void sort(@NotNull float[] $this$sort) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      if ($this$sort.length > 1) {
         Arrays.sort($this$sort);
      }

   }

   public static final void sort(@NotNull char[] $this$sort) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      if ($this$sort.length > 1) {
         Arrays.sort($this$sort);
      }

   }

   @InlineOnly
   private static final <T extends Comparable<? super T>> void sort(T[] $this$sort) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      ArraysKt.sort($this$sort);
   }

   public static final <T> void sort(@NotNull T[] $this$sort) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      if ($this$sort.length > 1) {
         Arrays.sort($this$sort);
      }

   }

   @SinceKotlin(
      version = "1.4"
   )
   public static final <T extends Comparable<? super T>> void sort(@NotNull T[] $this$sort, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      Arrays.sort($this$sort, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void sort$default(Comparable[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.length;
      }

      ArraysKt.sort(var0, var1, var2);
   }

   public static final void sort(@NotNull byte[] $this$sort, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      Arrays.sort($this$sort, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void sort$default(byte[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.length;
      }

      ArraysKt.sort(var0, var1, var2);
   }

   public static final void sort(@NotNull short[] $this$sort, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      Arrays.sort($this$sort, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void sort$default(short[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.length;
      }

      ArraysKt.sort(var0, var1, var2);
   }

   public static final void sort(@NotNull int[] $this$sort, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      Arrays.sort($this$sort, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void sort$default(int[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.length;
      }

      ArraysKt.sort(var0, var1, var2);
   }

   public static final void sort(@NotNull long[] $this$sort, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      Arrays.sort($this$sort, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void sort$default(long[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.length;
      }

      ArraysKt.sort(var0, var1, var2);
   }

   public static final void sort(@NotNull float[] $this$sort, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      Arrays.sort($this$sort, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void sort$default(float[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.length;
      }

      ArraysKt.sort(var0, var1, var2);
   }

   public static final void sort(@NotNull double[] $this$sort, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      Arrays.sort($this$sort, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void sort$default(double[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.length;
      }

      ArraysKt.sort(var0, var1, var2);
   }

   public static final void sort(@NotNull char[] $this$sort, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      Arrays.sort($this$sort, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void sort$default(char[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.length;
      }

      ArraysKt.sort(var0, var1, var2);
   }

   public static final <T> void sort(@NotNull T[] $this$sort, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort, "<this>");
      Arrays.sort($this$sort, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void sort$default(Object[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.length;
      }

      ArraysKt.sort(var0, var1, var2);
   }

   public static final <T> void sortWith(@NotNull T[] $this$sortWith, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter($this$sortWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if ($this$sortWith.length > 1) {
         Arrays.sort($this$sortWith, comparator);
      }

   }

   public static final <T> void sortWith(@NotNull T[] $this$sortWith, @NotNull Comparator<? super T> comparator, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sortWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Arrays.sort($this$sortWith, fromIndex, toIndex, comparator);
   }

   // $FF: synthetic method
   public static void sortWith$default(Object[] var0, Comparator var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.length;
      }

      ArraysKt.sortWith(var0, var1, var2, var3);
   }

   @NotNull
   public static final Byte[] toTypedArray(@NotNull byte[] $this$toTypedArray) {
      Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
      Byte[] result = new Byte[$this$toTypedArray.length];
      int index = 0;

      for(int var3 = $this$toTypedArray.length; index < var3; ++index) {
         result[index] = $this$toTypedArray[index];
      }

      return result;
   }

   @NotNull
   public static final Short[] toTypedArray(@NotNull short[] $this$toTypedArray) {
      Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
      Short[] result = new Short[$this$toTypedArray.length];
      int index = 0;

      for(int var3 = $this$toTypedArray.length; index < var3; ++index) {
         result[index] = $this$toTypedArray[index];
      }

      return result;
   }

   @NotNull
   public static final Integer[] toTypedArray(@NotNull int[] $this$toTypedArray) {
      Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
      Integer[] result = new Integer[$this$toTypedArray.length];
      int index = 0;

      for(int var3 = $this$toTypedArray.length; index < var3; ++index) {
         result[index] = $this$toTypedArray[index];
      }

      return result;
   }

   @NotNull
   public static final Long[] toTypedArray(@NotNull long[] $this$toTypedArray) {
      Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
      Long[] result = new Long[$this$toTypedArray.length];
      int index = 0;

      for(int var3 = $this$toTypedArray.length; index < var3; ++index) {
         result[index] = $this$toTypedArray[index];
      }

      return result;
   }

   @NotNull
   public static final Float[] toTypedArray(@NotNull float[] $this$toTypedArray) {
      Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
      Float[] result = new Float[$this$toTypedArray.length];
      int index = 0;

      for(int var3 = $this$toTypedArray.length; index < var3; ++index) {
         result[index] = $this$toTypedArray[index];
      }

      return result;
   }

   @NotNull
   public static final Double[] toTypedArray(@NotNull double[] $this$toTypedArray) {
      Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
      Double[] result = new Double[$this$toTypedArray.length];
      int index = 0;

      for(int var3 = $this$toTypedArray.length; index < var3; ++index) {
         result[index] = $this$toTypedArray[index];
      }

      return result;
   }

   @NotNull
   public static final Boolean[] toTypedArray(@NotNull boolean[] $this$toTypedArray) {
      Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
      Boolean[] result = new Boolean[$this$toTypedArray.length];
      int index = 0;

      for(int var3 = $this$toTypedArray.length; index < var3; ++index) {
         result[index] = $this$toTypedArray[index];
      }

      return result;
   }

   @NotNull
   public static final Character[] toTypedArray(@NotNull char[] $this$toTypedArray) {
      Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
      Character[] result = new Character[$this$toTypedArray.length];
      int index = 0;

      for(int var3 = $this$toTypedArray.length; index < var3; ++index) {
         result[index] = $this$toTypedArray[index];
      }

      return result;
   }

   @NotNull
   public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull T[] $this$toSortedSet) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      return (SortedSet)ArraysKt.toCollection($this$toSortedSet, (Collection)(new TreeSet()));
   }

   @NotNull
   public static final SortedSet<Byte> toSortedSet(@NotNull byte[] $this$toSortedSet) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      return (SortedSet)ArraysKt.toCollection($this$toSortedSet, (Collection)(new TreeSet()));
   }

   @NotNull
   public static final SortedSet<Short> toSortedSet(@NotNull short[] $this$toSortedSet) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      return (SortedSet)ArraysKt.toCollection($this$toSortedSet, (Collection)(new TreeSet()));
   }

   @NotNull
   public static final SortedSet<Integer> toSortedSet(@NotNull int[] $this$toSortedSet) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      return (SortedSet)ArraysKt.toCollection($this$toSortedSet, (Collection)(new TreeSet()));
   }

   @NotNull
   public static final SortedSet<Long> toSortedSet(@NotNull long[] $this$toSortedSet) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      return (SortedSet)ArraysKt.toCollection($this$toSortedSet, (Collection)(new TreeSet()));
   }

   @NotNull
   public static final SortedSet<Float> toSortedSet(@NotNull float[] $this$toSortedSet) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      return (SortedSet)ArraysKt.toCollection($this$toSortedSet, (Collection)(new TreeSet()));
   }

   @NotNull
   public static final SortedSet<Double> toSortedSet(@NotNull double[] $this$toSortedSet) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      return (SortedSet)ArraysKt.toCollection($this$toSortedSet, (Collection)(new TreeSet()));
   }

   @NotNull
   public static final SortedSet<Boolean> toSortedSet(@NotNull boolean[] $this$toSortedSet) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      return (SortedSet)ArraysKt.toCollection($this$toSortedSet, (Collection)(new TreeSet()));
   }

   @NotNull
   public static final SortedSet<Character> toSortedSet(@NotNull char[] $this$toSortedSet) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      return (SortedSet)ArraysKt.toCollection($this$toSortedSet, (Collection)(new TreeSet()));
   }

   @NotNull
   public static final <T> SortedSet<T> toSortedSet(@NotNull T[] $this$toSortedSet, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return (SortedSet)ArraysKt.toCollection($this$toSortedSet, (Collection)(new TreeSet(comparator)));
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   @SinceKotlin(
      version = "1.1"
   )
   public static final Double max(Double[] $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return ArraysKt.maxOrNull($this$max);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   @SinceKotlin(
      version = "1.1"
   )
   public static final Float max(Float[] $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return ArraysKt.maxOrNull($this$max);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Comparable max(Comparable[] $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return ArraysKt.maxOrNull($this$max);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Byte max(byte[] $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return ArraysKt.maxOrNull($this$max);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Short max(short[] $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return ArraysKt.maxOrNull($this$max);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Integer max(int[] $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return ArraysKt.maxOrNull($this$max);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Long max(long[] $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return ArraysKt.maxOrNull($this$max);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Float max(float[] $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return ArraysKt.maxOrNull($this$max);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Double max(double[] $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return ArraysKt.maxOrNull($this$max);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Character max(char[] $this$max) {
      Intrinsics.checkNotNullParameter($this$max, "<this>");
      return ArraysKt.maxOrNull($this$max);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <T, R extends Comparable<? super R>> T maxBy(T[] $this$maxBy, Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxBy = false;
      Object[] $this$maxByOrNull$iv = $this$maxBy;
      int $i$f$maxByOrNull = false;
      Object var10000;
      if ($this$maxBy.length == 0) {
         var10000 = null;
      } else {
         Object maxElem$iv = $this$maxBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
         if (lastIndex$iv == 0) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  Object e$iv = $this$maxByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (maxValue$iv.compareTo(v$iv) < 0) {
                     maxElem$iv = e$iv;
                     maxValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = maxElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Byte maxBy(byte[] $this$maxBy, Function1<? super Byte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxBy = false;
      byte[] $this$maxByOrNull$iv = $this$maxBy;
      int $i$f$maxByOrNull = false;
      Byte var10000;
      if ($this$maxBy.length == 0) {
         var10000 = null;
      } else {
         byte maxElem$iv = $this$maxBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
         if (lastIndex$iv == 0) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  byte e$iv = $this$maxByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (maxValue$iv.compareTo(v$iv) < 0) {
                     maxElem$iv = e$iv;
                     maxValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = maxElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Short maxBy(short[] $this$maxBy, Function1<? super Short, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxBy = false;
      short[] $this$maxByOrNull$iv = $this$maxBy;
      int $i$f$maxByOrNull = false;
      Short var10000;
      if ($this$maxBy.length == 0) {
         var10000 = null;
      } else {
         short maxElem$iv = $this$maxBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
         if (lastIndex$iv == 0) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  short e$iv = $this$maxByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (maxValue$iv.compareTo(v$iv) < 0) {
                     maxElem$iv = e$iv;
                     maxValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = maxElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Integer maxBy(int[] $this$maxBy, Function1<? super Integer, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxBy = false;
      int[] $this$maxByOrNull$iv = $this$maxBy;
      int $i$f$maxByOrNull = false;
      Integer var10000;
      if ($this$maxBy.length == 0) {
         var10000 = null;
      } else {
         int maxElem$iv = $this$maxBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
         if (lastIndex$iv == 0) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  int e$iv = $this$maxByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (maxValue$iv.compareTo(v$iv) < 0) {
                     maxElem$iv = e$iv;
                     maxValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = maxElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Long maxBy(long[] $this$maxBy, Function1<? super Long, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxBy = false;
      long[] $this$maxByOrNull$iv = $this$maxBy;
      int $i$f$maxByOrNull = false;
      Long var10000;
      if ($this$maxBy.length == 0) {
         var10000 = null;
      } else {
         long maxElem$iv = $this$maxBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
         if (lastIndex$iv == 0) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  long e$iv = $this$maxByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (maxValue$iv.compareTo(v$iv) < 0) {
                     maxElem$iv = e$iv;
                     maxValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = maxElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Float maxBy(float[] $this$maxBy, Function1<? super Float, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxBy = false;
      float[] $this$maxByOrNull$iv = $this$maxBy;
      int $i$f$maxByOrNull = false;
      Float var10000;
      if ($this$maxBy.length == 0) {
         var10000 = null;
      } else {
         float maxElem$iv = $this$maxBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
         if (lastIndex$iv == 0) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  float e$iv = $this$maxByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (maxValue$iv.compareTo(v$iv) < 0) {
                     maxElem$iv = e$iv;
                     maxValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = maxElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Double maxBy(double[] $this$maxBy, Function1<? super Double, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxBy = false;
      double[] $this$maxByOrNull$iv = $this$maxBy;
      int $i$f$maxByOrNull = false;
      Double var10000;
      if ($this$maxBy.length == 0) {
         var10000 = null;
      } else {
         double maxElem$iv = $this$maxBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
         if (lastIndex$iv == 0) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  double e$iv = $this$maxByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (maxValue$iv.compareTo(v$iv) < 0) {
                     maxElem$iv = e$iv;
                     maxValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = maxElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Boolean maxBy(boolean[] $this$maxBy, Function1<? super Boolean, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxBy = false;
      boolean[] $this$maxByOrNull$iv = $this$maxBy;
      int $i$f$maxByOrNull = false;
      Boolean var10000;
      if ($this$maxBy.length == 0) {
         var10000 = null;
      } else {
         boolean maxElem$iv = $this$maxBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
         if (lastIndex$iv == 0) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  boolean e$iv = $this$maxByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (maxValue$iv.compareTo(v$iv) < 0) {
                     maxElem$iv = e$iv;
                     maxValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = maxElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Character maxBy(char[] $this$maxBy, Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$maxBy = false;
      char[] $this$maxByOrNull$iv = $this$maxBy;
      int $i$f$maxByOrNull = false;
      Character var10000;
      if ($this$maxBy.length == 0) {
         var10000 = null;
      } else {
         char maxElem$iv = $this$maxBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
         if (lastIndex$iv == 0) {
            var10000 = maxElem$iv;
         } else {
            Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  char e$iv = $this$maxByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (maxValue$iv.compareTo(v$iv) < 0) {
                     maxElem$iv = e$iv;
                     maxValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = maxElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Object maxWith(Object[] $this$maxWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.maxWithOrNull($this$maxWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Byte maxWith(byte[] $this$maxWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.maxWithOrNull($this$maxWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Short maxWith(short[] $this$maxWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.maxWithOrNull($this$maxWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Integer maxWith(int[] $this$maxWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.maxWithOrNull($this$maxWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Long maxWith(long[] $this$maxWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.maxWithOrNull($this$maxWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Float maxWith(float[] $this$maxWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.maxWithOrNull($this$maxWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Double maxWith(double[] $this$maxWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.maxWithOrNull($this$maxWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Boolean maxWith(boolean[] $this$maxWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.maxWithOrNull($this$maxWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use maxWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.maxWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Character maxWith(char[] $this$maxWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.maxWithOrNull($this$maxWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   @SinceKotlin(
      version = "1.1"
   )
   public static final Double min(Double[] $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return ArraysKt.minOrNull($this$min);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   @SinceKotlin(
      version = "1.1"
   )
   public static final Float min(Float[] $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return ArraysKt.minOrNull($this$min);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Comparable min(Comparable[] $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return ArraysKt.minOrNull($this$min);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Byte min(byte[] $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return ArraysKt.minOrNull($this$min);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Short min(short[] $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return ArraysKt.minOrNull($this$min);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Integer min(int[] $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return ArraysKt.minOrNull($this$min);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Long min(long[] $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return ArraysKt.minOrNull($this$min);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Float min(float[] $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return ArraysKt.minOrNull($this$min);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Double min(double[] $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return ArraysKt.minOrNull($this$min);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minOrNull()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Character min(char[] $this$min) {
      Intrinsics.checkNotNullParameter($this$min, "<this>");
      return ArraysKt.minOrNull($this$min);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <T, R extends Comparable<? super R>> T minBy(T[] $this$minBy, Function1<? super T, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minBy = false;
      Object[] $this$minByOrNull$iv = $this$minBy;
      int $i$f$minByOrNull = false;
      Object var10000;
      if ($this$minBy.length == 0) {
         var10000 = null;
      } else {
         Object minElem$iv = $this$minBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
         if (lastIndex$iv == 0) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  Object e$iv = $this$minByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (minValue$iv.compareTo(v$iv) > 0) {
                     minElem$iv = e$iv;
                     minValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = minElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Byte minBy(byte[] $this$minBy, Function1<? super Byte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minBy = false;
      byte[] $this$minByOrNull$iv = $this$minBy;
      int $i$f$minByOrNull = false;
      Byte var10000;
      if ($this$minBy.length == 0) {
         var10000 = null;
      } else {
         byte minElem$iv = $this$minBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
         if (lastIndex$iv == 0) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  byte e$iv = $this$minByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (minValue$iv.compareTo(v$iv) > 0) {
                     minElem$iv = e$iv;
                     minValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = minElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Short minBy(short[] $this$minBy, Function1<? super Short, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minBy = false;
      short[] $this$minByOrNull$iv = $this$minBy;
      int $i$f$minByOrNull = false;
      Short var10000;
      if ($this$minBy.length == 0) {
         var10000 = null;
      } else {
         short minElem$iv = $this$minBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
         if (lastIndex$iv == 0) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  short e$iv = $this$minByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (minValue$iv.compareTo(v$iv) > 0) {
                     minElem$iv = e$iv;
                     minValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = minElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Integer minBy(int[] $this$minBy, Function1<? super Integer, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minBy = false;
      int[] $this$minByOrNull$iv = $this$minBy;
      int $i$f$minByOrNull = false;
      Integer var10000;
      if ($this$minBy.length == 0) {
         var10000 = null;
      } else {
         int minElem$iv = $this$minBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
         if (lastIndex$iv == 0) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  int e$iv = $this$minByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (minValue$iv.compareTo(v$iv) > 0) {
                     minElem$iv = e$iv;
                     minValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = minElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Long minBy(long[] $this$minBy, Function1<? super Long, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minBy = false;
      long[] $this$minByOrNull$iv = $this$minBy;
      int $i$f$minByOrNull = false;
      Long var10000;
      if ($this$minBy.length == 0) {
         var10000 = null;
      } else {
         long minElem$iv = $this$minBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
         if (lastIndex$iv == 0) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  long e$iv = $this$minByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (minValue$iv.compareTo(v$iv) > 0) {
                     minElem$iv = e$iv;
                     minValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = minElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Float minBy(float[] $this$minBy, Function1<? super Float, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minBy = false;
      float[] $this$minByOrNull$iv = $this$minBy;
      int $i$f$minByOrNull = false;
      Float var10000;
      if ($this$minBy.length == 0) {
         var10000 = null;
      } else {
         float minElem$iv = $this$minBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
         if (lastIndex$iv == 0) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  float e$iv = $this$minByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (minValue$iv.compareTo(v$iv) > 0) {
                     minElem$iv = e$iv;
                     minValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = minElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Double minBy(double[] $this$minBy, Function1<? super Double, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minBy = false;
      double[] $this$minByOrNull$iv = $this$minBy;
      int $i$f$minByOrNull = false;
      Double var10000;
      if ($this$minBy.length == 0) {
         var10000 = null;
      } else {
         double minElem$iv = $this$minBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
         if (lastIndex$iv == 0) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  double e$iv = $this$minByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (minValue$iv.compareTo(v$iv) > 0) {
                     minElem$iv = e$iv;
                     minValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = minElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Boolean minBy(boolean[] $this$minBy, Function1<? super Boolean, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minBy = false;
      boolean[] $this$minByOrNull$iv = $this$minBy;
      int $i$f$minByOrNull = false;
      Boolean var10000;
      if ($this$minBy.length == 0) {
         var10000 = null;
      } else {
         boolean minElem$iv = $this$minBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
         if (lastIndex$iv == 0) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  boolean e$iv = $this$minByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (minValue$iv.compareTo(v$iv) > 0) {
                     minElem$iv = e$iv;
                     minValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = minElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minByOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minByOrNull(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final <R extends Comparable<? super R>> Character minBy(char[] $this$minBy, Function1<? super Character, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$minBy = false;
      char[] $this$minByOrNull$iv = $this$minBy;
      int $i$f$minByOrNull = false;
      Character var10000;
      if ($this$minBy.length == 0) {
         var10000 = null;
      } else {
         char minElem$iv = $this$minBy[0];
         int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
         if (lastIndex$iv == 0) {
            var10000 = minElem$iv;
         } else {
            Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
            int i$iv = 1;
            if (i$iv <= lastIndex$iv) {
               while(true) {
                  char e$iv = $this$minByOrNull$iv[i$iv];
                  Comparable v$iv = (Comparable)selector.invoke(e$iv);
                  if (minValue$iv.compareTo(v$iv) > 0) {
                     minElem$iv = e$iv;
                     minValue$iv = v$iv;
                  }

                  if (i$iv == lastIndex$iv) {
                     break;
                  }

                  ++i$iv;
               }
            }

            var10000 = minElem$iv;
         }
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Object minWith(Object[] $this$minWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.minWithOrNull($this$minWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Byte minWith(byte[] $this$minWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.minWithOrNull($this$minWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Short minWith(short[] $this$minWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.minWithOrNull($this$minWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Integer minWith(int[] $this$minWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.minWithOrNull($this$minWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Long minWith(long[] $this$minWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.minWithOrNull($this$minWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Float minWith(float[] $this$minWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.minWithOrNull($this$minWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Double minWith(double[] $this$minWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.minWithOrNull($this$minWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Boolean minWith(boolean[] $this$minWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.minWithOrNull($this$minWith, comparator);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use minWithOrNull instead.",
      replaceWith = @ReplaceWith(
   expression = "this.minWithOrNull(comparator)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.4",
      errorSince = "1.5",
      hiddenSince = "1.6"
   )
   public static final Character minWith(char[] $this$minWith, Comparator comparator) {
      Intrinsics.checkNotNullParameter($this$minWith, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ArraysKt.minWithOrNull($this$minWith, comparator);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigDecimal"
   )
   @InlineOnly
   private static final <T> BigDecimal sumOfBigDecimal(T[] $this$sumOf, Function1<? super T, ? extends BigDecimal> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigDecimal var10000 = BigDecimal.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigDecimal sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         Object element = $this$sumOf[var3];
         var10000 = sum.add((BigDecimal)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigDecimal"
   )
   @InlineOnly
   private static final BigDecimal sumOfBigDecimal(byte[] $this$sumOf, Function1<? super Byte, ? extends BigDecimal> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigDecimal var10000 = BigDecimal.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigDecimal sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         byte element = $this$sumOf[var3];
         var10000 = sum.add((BigDecimal)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigDecimal"
   )
   @InlineOnly
   private static final BigDecimal sumOfBigDecimal(short[] $this$sumOf, Function1<? super Short, ? extends BigDecimal> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigDecimal var10000 = BigDecimal.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigDecimal sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         short element = $this$sumOf[var3];
         var10000 = sum.add((BigDecimal)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigDecimal"
   )
   @InlineOnly
   private static final BigDecimal sumOfBigDecimal(int[] $this$sumOf, Function1<? super Integer, ? extends BigDecimal> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigDecimal var10000 = BigDecimal.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigDecimal sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         int element = $this$sumOf[var3];
         var10000 = sum.add((BigDecimal)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigDecimal"
   )
   @InlineOnly
   private static final BigDecimal sumOfBigDecimal(long[] $this$sumOf, Function1<? super Long, ? extends BigDecimal> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigDecimal var10000 = BigDecimal.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigDecimal sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         long element = $this$sumOf[var3];
         var10000 = sum.add((BigDecimal)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigDecimal"
   )
   @InlineOnly
   private static final BigDecimal sumOfBigDecimal(float[] $this$sumOf, Function1<? super Float, ? extends BigDecimal> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigDecimal var10000 = BigDecimal.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigDecimal sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         float element = $this$sumOf[var3];
         var10000 = sum.add((BigDecimal)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigDecimal"
   )
   @InlineOnly
   private static final BigDecimal sumOfBigDecimal(double[] $this$sumOf, Function1<? super Double, ? extends BigDecimal> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigDecimal var10000 = BigDecimal.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigDecimal sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         double element = $this$sumOf[var3];
         var10000 = sum.add((BigDecimal)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigDecimal"
   )
   @InlineOnly
   private static final BigDecimal sumOfBigDecimal(boolean[] $this$sumOf, Function1<? super Boolean, ? extends BigDecimal> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigDecimal var10000 = BigDecimal.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigDecimal sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         boolean element = $this$sumOf[var3];
         var10000 = sum.add((BigDecimal)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigDecimal"
   )
   @InlineOnly
   private static final BigDecimal sumOfBigDecimal(char[] $this$sumOf, Function1<? super Character, ? extends BigDecimal> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigDecimal var10000 = BigDecimal.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigDecimal sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         char element = $this$sumOf[var3];
         var10000 = sum.add((BigDecimal)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigInteger"
   )
   @InlineOnly
   private static final <T> BigInteger sumOfBigInteger(T[] $this$sumOf, Function1<? super T, ? extends BigInteger> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigInteger var10000 = BigInteger.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigInteger sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         Object element = $this$sumOf[var3];
         var10000 = sum.add((BigInteger)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigInteger"
   )
   @InlineOnly
   private static final BigInteger sumOfBigInteger(byte[] $this$sumOf, Function1<? super Byte, ? extends BigInteger> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigInteger var10000 = BigInteger.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigInteger sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         byte element = $this$sumOf[var3];
         var10000 = sum.add((BigInteger)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigInteger"
   )
   @InlineOnly
   private static final BigInteger sumOfBigInteger(short[] $this$sumOf, Function1<? super Short, ? extends BigInteger> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigInteger var10000 = BigInteger.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigInteger sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         short element = $this$sumOf[var3];
         var10000 = sum.add((BigInteger)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigInteger"
   )
   @InlineOnly
   private static final BigInteger sumOfBigInteger(int[] $this$sumOf, Function1<? super Integer, ? extends BigInteger> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigInteger var10000 = BigInteger.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigInteger sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         int element = $this$sumOf[var3];
         var10000 = sum.add((BigInteger)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigInteger"
   )
   @InlineOnly
   private static final BigInteger sumOfBigInteger(long[] $this$sumOf, Function1<? super Long, ? extends BigInteger> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigInteger var10000 = BigInteger.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigInteger sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         long element = $this$sumOf[var3];
         var10000 = sum.add((BigInteger)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigInteger"
   )
   @InlineOnly
   private static final BigInteger sumOfBigInteger(float[] $this$sumOf, Function1<? super Float, ? extends BigInteger> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigInteger var10000 = BigInteger.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigInteger sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         float element = $this$sumOf[var3];
         var10000 = sum.add((BigInteger)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigInteger"
   )
   @InlineOnly
   private static final BigInteger sumOfBigInteger(double[] $this$sumOf, Function1<? super Double, ? extends BigInteger> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigInteger var10000 = BigInteger.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigInteger sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         double element = $this$sumOf[var3];
         var10000 = sum.add((BigInteger)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigInteger"
   )
   @InlineOnly
   private static final BigInteger sumOfBigInteger(boolean[] $this$sumOf, Function1<? super Boolean, ? extends BigInteger> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigInteger var10000 = BigInteger.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigInteger sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         boolean element = $this$sumOf[var3];
         var10000 = sum.add((BigInteger)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfBigInteger"
   )
   @InlineOnly
   private static final BigInteger sumOfBigInteger(char[] $this$sumOf, Function1<? super Character, ? extends BigInteger> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      BigInteger var10000 = BigInteger.valueOf(0L);
      Intrinsics.checkNotNullExpressionValue(var10000, "valueOf(...)");
      BigInteger sum = var10000;
      int var3 = 0;

      for(int var4 = $this$sumOf.length; var3 < var4; ++var3) {
         char element = $this$sumOf[var3];
         var10000 = sum.add((BigInteger)selector.invoke(element));
         Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
         sum = var10000;
      }

      return sum;
   }

   public ArraysKt___ArraysJvmKt() {
   }
}
