package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
   @NotNull
   public static final <T> List<T> flatten(@NotNull T[][] $this$flatten) {
      Intrinsics.checkNotNullParameter($this$flatten, "<this>");
      Object[] var2 = (Object[])$this$flatten;
      int var3 = 0;
      int var4 = 0;

      for(int var5 = var2.length; var4 < var5; ++var4) {
         Object var6 = var2[var4];
         Object[] it = (Object[])var6;
         int var8 = false;
         int var10 = it.length;
         var3 += var10;
      }

      ArrayList result = new ArrayList(var3);
      int var12 = 0;

      for(var3 = ((Object[])$this$flatten).length; var12 < var3; ++var12) {
         Object[] element = $this$flatten[var12];
         CollectionsKt.addAll((Collection)result, element);
      }

      return (List)result;
   }

   @NotNull
   public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Pair<? extends T, ? extends R>[] $this$unzip) {
      Intrinsics.checkNotNullParameter($this$unzip, "<this>");
      ArrayList listT = new ArrayList($this$unzip.length);
      ArrayList listR = new ArrayList($this$unzip.length);
      int var3 = 0;

      for(int var4 = $this$unzip.length; var3 < var4; ++var3) {
         Pair pair = $this$unzip[var3];
         listT.add(pair.getFirst());
         listR.add(pair.getSecond());
      }

      return TuplesKt.to(listT, listR);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final boolean isNullOrEmpty(Object[] $this$isNullOrEmpty) {
      return $this$isNullOrEmpty == null || $this$isNullOrEmpty.length == 0;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <C extends Object[] & R, R> R ifEmpty(C $this$ifEmpty, Function0<? extends R> defaultValue) {
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return $this$ifEmpty.length == 0 ? defaultValue.invoke() : $this$ifEmpty;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @JvmName(
      name = "contentDeepEquals"
   )
   public static final <T> boolean contentDeepEquals(@Nullable T[] $this$contentDeepEqualsImpl, @Nullable T[] other) {
      if ($this$contentDeepEqualsImpl == other) {
         return true;
      } else if ($this$contentDeepEqualsImpl != null && other != null && $this$contentDeepEqualsImpl.length == other.length) {
         int i = 0;

         for(int var3 = $this$contentDeepEqualsImpl.length; i < var3; ++i) {
            Object v1 = $this$contentDeepEqualsImpl[i];
            Object v2 = other[i];
            if (v1 != v2) {
               if (v1 == null || v2 == null) {
                  return false;
               }

               if (v1 instanceof Object[] && v2 instanceof Object[]) {
                  if (!ArraysKt.contentDeepEquals((Object[])v1, (Object[])v2)) {
                     return false;
                  }
               } else if (v1 instanceof byte[] && v2 instanceof byte[]) {
                  if (!Arrays.equals((byte[])v1, (byte[])v2)) {
                     return false;
                  }
               } else if (v1 instanceof short[] && v2 instanceof short[]) {
                  if (!Arrays.equals((short[])v1, (short[])v2)) {
                     return false;
                  }
               } else if (v1 instanceof int[] && v2 instanceof int[]) {
                  if (!Arrays.equals((int[])v1, (int[])v2)) {
                     return false;
                  }
               } else if (v1 instanceof long[] && v2 instanceof long[]) {
                  if (!Arrays.equals((long[])v1, (long[])v2)) {
                     return false;
                  }
               } else if (v1 instanceof float[] && v2 instanceof float[]) {
                  if (!Arrays.equals((float[])v1, (float[])v2)) {
                     return false;
                  }
               } else if (v1 instanceof double[] && v2 instanceof double[]) {
                  if (!Arrays.equals((double[])v1, (double[])v2)) {
                     return false;
                  }
               } else if (v1 instanceof char[] && v2 instanceof char[]) {
                  if (!Arrays.equals((char[])v1, (char[])v2)) {
                     return false;
                  }
               } else if (v1 instanceof boolean[] && v2 instanceof boolean[]) {
                  if (!Arrays.equals((boolean[])v1, (boolean[])v2)) {
                     return false;
                  }
               } else if (v1 instanceof UByteArray && v2 instanceof UByteArray) {
                  if (!UArraysKt.contentEquals-kV0jMPg(((UByteArray)v1).unbox-impl(), ((UByteArray)v2).unbox-impl())) {
                     return false;
                  }
               } else if (v1 instanceof UShortArray && v2 instanceof UShortArray) {
                  if (!UArraysKt.contentEquals-FGO6Aew(((UShortArray)v1).unbox-impl(), ((UShortArray)v2).unbox-impl())) {
                     return false;
                  }
               } else if (v1 instanceof UIntArray && v2 instanceof UIntArray) {
                  if (!UArraysKt.contentEquals-KJPZfPQ(((UIntArray)v1).unbox-impl(), ((UIntArray)v2).unbox-impl())) {
                     return false;
                  }
               } else if (v1 instanceof ULongArray && v2 instanceof ULongArray) {
                  if (!UArraysKt.contentEquals-lec5QzE(((ULongArray)v1).unbox-impl(), ((ULongArray)v2).unbox-impl())) {
                     return false;
                  }
               } else if (!Intrinsics.areEqual(v1, v2)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @JvmName(
      name = "contentDeepToString"
   )
   @NotNull
   public static final <T> String contentDeepToString(@Nullable T[] $this$contentDeepToStringImpl) {
      if ($this$contentDeepToStringImpl == null) {
         return "null";
      } else {
         int length = RangesKt.coerceAtMost($this$contentDeepToStringImpl.length, 429496729) * 5 + 2;
         StringBuilder var2 = new StringBuilder(length);
         int var4 = false;
         contentDeepToStringInternal$ArraysKt__ArraysKt($this$contentDeepToStringImpl, var2, (List)(new ArrayList()));
         return var2.toString();
      }
   }

   private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] $this$contentDeepToStringInternal, StringBuilder result, List<Object[]> processed) {
      if (processed.contains($this$contentDeepToStringInternal)) {
         result.append("[...]");
      } else {
         processed.add($this$contentDeepToStringInternal);
         result.append('[');
         int i = 0;

         for(int var4 = $this$contentDeepToStringInternal.length; i < var4; ++i) {
            if (i != 0) {
               result.append(", ");
            }

            Object element = $this$contentDeepToStringInternal[i];
            if (element == null) {
               result.append("null");
            } else if (element instanceof Object[]) {
               contentDeepToStringInternal$ArraysKt__ArraysKt((Object[])element, result, processed);
               Unit var10000 = Unit.INSTANCE;
            } else {
               String var10001;
               if (element instanceof byte[]) {
                  var10001 = Arrays.toString((byte[])element);
                  Intrinsics.checkNotNullExpressionValue(var10001, "toString(...)");
                  result.append(var10001);
               } else if (element instanceof short[]) {
                  var10001 = Arrays.toString((short[])element);
                  Intrinsics.checkNotNullExpressionValue(var10001, "toString(...)");
                  result.append(var10001);
               } else if (element instanceof int[]) {
                  var10001 = Arrays.toString((int[])element);
                  Intrinsics.checkNotNullExpressionValue(var10001, "toString(...)");
                  result.append(var10001);
               } else if (element instanceof long[]) {
                  var10001 = Arrays.toString((long[])element);
                  Intrinsics.checkNotNullExpressionValue(var10001, "toString(...)");
                  result.append(var10001);
               } else if (element instanceof float[]) {
                  var10001 = Arrays.toString((float[])element);
                  Intrinsics.checkNotNullExpressionValue(var10001, "toString(...)");
                  result.append(var10001);
               } else if (element instanceof double[]) {
                  var10001 = Arrays.toString((double[])element);
                  Intrinsics.checkNotNullExpressionValue(var10001, "toString(...)");
                  result.append(var10001);
               } else if (element instanceof char[]) {
                  var10001 = Arrays.toString((char[])element);
                  Intrinsics.checkNotNullExpressionValue(var10001, "toString(...)");
                  result.append(var10001);
               } else if (element instanceof boolean[]) {
                  var10001 = Arrays.toString((boolean[])element);
                  Intrinsics.checkNotNullExpressionValue(var10001, "toString(...)");
                  result.append(var10001);
               } else if (element instanceof UByteArray) {
                  result.append(UArraysKt.contentToString-2csIQuQ((UByteArray)element != null ? ((UByteArray)element).unbox-impl() : null));
               } else if (element instanceof UShortArray) {
                  result.append(UArraysKt.contentToString-d-6D3K8((UShortArray)element != null ? ((UShortArray)element).unbox-impl() : null));
               } else if (element instanceof UIntArray) {
                  result.append(UArraysKt.contentToString-XUkPCBk((UIntArray)element != null ? ((UIntArray)element).unbox-impl() : null));
               } else if (element instanceof ULongArray) {
                  result.append(UArraysKt.contentToString-uLth9ew((ULongArray)element != null ? ((ULongArray)element).unbox-impl() : null));
               } else {
                  result.append(element.toString());
               }
            }
         }

         result.append(']');
         processed.remove(CollectionsKt.getLastIndex(processed));
      }
   }

   public ArraysKt__ArraysKt() {
   }
}
