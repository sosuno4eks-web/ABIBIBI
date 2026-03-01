package kotlin.collections.unsigned;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt;
import kotlin.collections.UArraySortingKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class UArraysKt___UArraysKt extends UArraysKt___UArraysJvmKt {
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int component1__ajY_9A/* $FF was: component1--ajY-9A*/(int[] $this$component1_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$component1_u2d_u2dajY_u2d9A, "$this$component1");
      return UIntArray.get-pVg5ArA($this$component1_u2d_u2dajY_u2d9A, 0);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long component1_QwZRm1k/* $FF was: component1-QwZRm1k*/(long[] $this$component1_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$component1_u2dQwZRm1k, "$this$component1");
      return ULongArray.get-s-VKNKU($this$component1_u2dQwZRm1k, 0);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte component1_GBYM_sE/* $FF was: component1-GBYM_sE*/(byte[] $this$component1_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$component1_u2dGBYM_sE, "$this$component1");
      return UByteArray.get-w2LRezQ($this$component1_u2dGBYM_sE, 0);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short component1_rL5Bavg/* $FF was: component1-rL5Bavg*/(short[] $this$component1_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$component1_u2drL5Bavg, "$this$component1");
      return UShortArray.get-Mh2AYeg($this$component1_u2drL5Bavg, 0);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int component2__ajY_9A/* $FF was: component2--ajY-9A*/(int[] $this$component2_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$component2_u2d_u2dajY_u2d9A, "$this$component2");
      return UIntArray.get-pVg5ArA($this$component2_u2d_u2dajY_u2d9A, 1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long component2_QwZRm1k/* $FF was: component2-QwZRm1k*/(long[] $this$component2_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$component2_u2dQwZRm1k, "$this$component2");
      return ULongArray.get-s-VKNKU($this$component2_u2dQwZRm1k, 1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte component2_GBYM_sE/* $FF was: component2-GBYM_sE*/(byte[] $this$component2_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$component2_u2dGBYM_sE, "$this$component2");
      return UByteArray.get-w2LRezQ($this$component2_u2dGBYM_sE, 1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short component2_rL5Bavg/* $FF was: component2-rL5Bavg*/(short[] $this$component2_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$component2_u2drL5Bavg, "$this$component2");
      return UShortArray.get-Mh2AYeg($this$component2_u2drL5Bavg, 1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int component3__ajY_9A/* $FF was: component3--ajY-9A*/(int[] $this$component3_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$component3_u2d_u2dajY_u2d9A, "$this$component3");
      return UIntArray.get-pVg5ArA($this$component3_u2d_u2dajY_u2d9A, 2);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long component3_QwZRm1k/* $FF was: component3-QwZRm1k*/(long[] $this$component3_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$component3_u2dQwZRm1k, "$this$component3");
      return ULongArray.get-s-VKNKU($this$component3_u2dQwZRm1k, 2);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte component3_GBYM_sE/* $FF was: component3-GBYM_sE*/(byte[] $this$component3_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$component3_u2dGBYM_sE, "$this$component3");
      return UByteArray.get-w2LRezQ($this$component3_u2dGBYM_sE, 2);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short component3_rL5Bavg/* $FF was: component3-rL5Bavg*/(short[] $this$component3_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$component3_u2drL5Bavg, "$this$component3");
      return UShortArray.get-Mh2AYeg($this$component3_u2drL5Bavg, 2);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int component4__ajY_9A/* $FF was: component4--ajY-9A*/(int[] $this$component4_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$component4_u2d_u2dajY_u2d9A, "$this$component4");
      return UIntArray.get-pVg5ArA($this$component4_u2d_u2dajY_u2d9A, 3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long component4_QwZRm1k/* $FF was: component4-QwZRm1k*/(long[] $this$component4_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$component4_u2dQwZRm1k, "$this$component4");
      return ULongArray.get-s-VKNKU($this$component4_u2dQwZRm1k, 3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte component4_GBYM_sE/* $FF was: component4-GBYM_sE*/(byte[] $this$component4_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$component4_u2dGBYM_sE, "$this$component4");
      return UByteArray.get-w2LRezQ($this$component4_u2dGBYM_sE, 3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short component4_rL5Bavg/* $FF was: component4-rL5Bavg*/(short[] $this$component4_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$component4_u2drL5Bavg, "$this$component4");
      return UShortArray.get-Mh2AYeg($this$component4_u2drL5Bavg, 3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int component5__ajY_9A/* $FF was: component5--ajY-9A*/(int[] $this$component5_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$component5_u2d_u2dajY_u2d9A, "$this$component5");
      return UIntArray.get-pVg5ArA($this$component5_u2d_u2dajY_u2d9A, 4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long component5_QwZRm1k/* $FF was: component5-QwZRm1k*/(long[] $this$component5_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$component5_u2dQwZRm1k, "$this$component5");
      return ULongArray.get-s-VKNKU($this$component5_u2dQwZRm1k, 4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte component5_GBYM_sE/* $FF was: component5-GBYM_sE*/(byte[] $this$component5_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$component5_u2dGBYM_sE, "$this$component5");
      return UByteArray.get-w2LRezQ($this$component5_u2dGBYM_sE, 4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short component5_rL5Bavg/* $FF was: component5-rL5Bavg*/(short[] $this$component5_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$component5_u2drL5Bavg, "$this$component5");
      return UShortArray.get-Mh2AYeg($this$component5_u2drL5Bavg, 4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int elementAtOrElse_QxvSvLU/* $FF was: elementAtOrElse-QxvSvLU*/(int[] $this$elementAtOrElse_u2dQxvSvLU, int index, Function1<? super Integer, UInt> defaultValue) {
      Intrinsics.checkNotNullParameter($this$elementAtOrElse_u2dQxvSvLU, "$this$elementAtOrElse");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return (0 <= index ? index < UIntArray.getSize-impl($this$elementAtOrElse_u2dQxvSvLU) : false) ? UIntArray.get-pVg5ArA($this$elementAtOrElse_u2dQxvSvLU, index) : ((UInt)defaultValue.invoke(index)).unbox-impl();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long elementAtOrElse_Xw8i6dc/* $FF was: elementAtOrElse-Xw8i6dc*/(long[] $this$elementAtOrElse_u2dXw8i6dc, int index, Function1<? super Integer, ULong> defaultValue) {
      Intrinsics.checkNotNullParameter($this$elementAtOrElse_u2dXw8i6dc, "$this$elementAtOrElse");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return (0 <= index ? index < ULongArray.getSize-impl($this$elementAtOrElse_u2dXw8i6dc) : false) ? ULongArray.get-s-VKNKU($this$elementAtOrElse_u2dXw8i6dc, index) : ((ULong)defaultValue.invoke(index)).unbox-impl();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte elementAtOrElse_cO_VybQ/* $FF was: elementAtOrElse-cO-VybQ*/(byte[] $this$elementAtOrElse_u2dcO_u2dVybQ, int index, Function1<? super Integer, UByte> defaultValue) {
      Intrinsics.checkNotNullParameter($this$elementAtOrElse_u2dcO_u2dVybQ, "$this$elementAtOrElse");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return (0 <= index ? index < UByteArray.getSize-impl($this$elementAtOrElse_u2dcO_u2dVybQ) : false) ? UByteArray.get-w2LRezQ($this$elementAtOrElse_u2dcO_u2dVybQ, index) : ((UByte)defaultValue.invoke(index)).unbox-impl();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short elementAtOrElse_CVVdw08/* $FF was: elementAtOrElse-CVVdw08*/(short[] $this$elementAtOrElse_u2dCVVdw08, int index, Function1<? super Integer, UShort> defaultValue) {
      Intrinsics.checkNotNullParameter($this$elementAtOrElse_u2dCVVdw08, "$this$elementAtOrElse");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return (0 <= index ? index < UShortArray.getSize-impl($this$elementAtOrElse_u2dCVVdw08) : false) ? UShortArray.get-Mh2AYeg($this$elementAtOrElse_u2dCVVdw08, index) : ((UShort)defaultValue.invoke(index)).unbox-impl();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UInt elementAtOrNull_qFRl0hI/* $FF was: elementAtOrNull-qFRl0hI*/(int[] $this$elementAtOrNull_u2dqFRl0hI, int index) {
      Intrinsics.checkNotNullParameter($this$elementAtOrNull_u2dqFRl0hI, "$this$elementAtOrNull");
      return UArraysKt.getOrNull-qFRl0hI($this$elementAtOrNull_u2dqFRl0hI, index);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final ULong elementAtOrNull_r7IrZao/* $FF was: elementAtOrNull-r7IrZao*/(long[] $this$elementAtOrNull_u2dr7IrZao, int index) {
      Intrinsics.checkNotNullParameter($this$elementAtOrNull_u2dr7IrZao, "$this$elementAtOrNull");
      return UArraysKt.getOrNull-r7IrZao($this$elementAtOrNull_u2dr7IrZao, index);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UByte elementAtOrNull_PpDY95g/* $FF was: elementAtOrNull-PpDY95g*/(byte[] $this$elementAtOrNull_u2dPpDY95g, int index) {
      Intrinsics.checkNotNullParameter($this$elementAtOrNull_u2dPpDY95g, "$this$elementAtOrNull");
      return UArraysKt.getOrNull-PpDY95g($this$elementAtOrNull_u2dPpDY95g, index);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UShort elementAtOrNull_nggk6HY/* $FF was: elementAtOrNull-nggk6HY*/(short[] $this$elementAtOrNull_u2dnggk6HY, int index) {
      Intrinsics.checkNotNullParameter($this$elementAtOrNull_u2dnggk6HY, "$this$elementAtOrNull");
      return UArraysKt.getOrNull-nggk6HY($this$elementAtOrNull_u2dnggk6HY, index);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UInt find_jgv0xPQ/* $FF was: find-jgv0xPQ*/(int[] $this$find_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$find_u2djgv0xPQ, "$this$find");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int[] var2 = $this$find_u2djgv0xPQ;
      int var3 = 0;
      int var4 = UIntArray.getSize-impl($this$find_u2djgv0xPQ);

      UInt var10000;
      while(true) {
         if (var3 >= var4) {
            var10000 = null;
            break;
         }

         int var5 = UIntArray.get-pVg5ArA(var2, var3);
         if ((Boolean)predicate.invoke(UInt.box-impl(var5))) {
            var10000 = UInt.box-impl(var5);
            break;
         }

         ++var3;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final ULong find_MShoTSo/* $FF was: find-MShoTSo*/(long[] $this$find_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$find_u2dMShoTSo, "$this$find");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      long[] var2 = $this$find_u2dMShoTSo;
      int var3 = 0;
      int var4 = ULongArray.getSize-impl($this$find_u2dMShoTSo);

      ULong var10000;
      while(true) {
         if (var3 >= var4) {
            var10000 = null;
            break;
         }

         long var5 = ULongArray.get-s-VKNKU(var2, var3);
         if ((Boolean)predicate.invoke(ULong.box-impl(var5))) {
            var10000 = ULong.box-impl(var5);
            break;
         }

         ++var3;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UByte find_JOV_ifY/* $FF was: find-JOV_ifY*/(byte[] $this$find_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$find_u2dJOV_ifY, "$this$find");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      byte[] var2 = $this$find_u2dJOV_ifY;
      int var3 = 0;
      int var4 = UByteArray.getSize-impl($this$find_u2dJOV_ifY);

      UByte var10000;
      while(true) {
         if (var3 >= var4) {
            var10000 = null;
            break;
         }

         byte var5 = UByteArray.get-w2LRezQ(var2, var3);
         if ((Boolean)predicate.invoke(UByte.box-impl(var5))) {
            var10000 = UByte.box-impl(var5);
            break;
         }

         ++var3;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UShort find_xTcfx_M/* $FF was: find-xTcfx_M*/(short[] $this$find_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$find_u2dxTcfx_M, "$this$find");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      short[] var2 = $this$find_u2dxTcfx_M;
      int var3 = 0;
      int var4 = UShortArray.getSize-impl($this$find_u2dxTcfx_M);

      UShort var10000;
      while(true) {
         if (var3 >= var4) {
            var10000 = null;
            break;
         }

         short var5 = UShortArray.get-Mh2AYeg(var2, var3);
         if ((Boolean)predicate.invoke(UShort.box-impl(var5))) {
            var10000 = UShort.box-impl(var5);
            break;
         }

         ++var3;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UInt findLast_jgv0xPQ/* $FF was: findLast-jgv0xPQ*/(int[] $this$findLast_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$findLast_u2djgv0xPQ, "$this$findLast");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int[] var2 = $this$findLast_u2djgv0xPQ;
      int var3 = UIntArray.getSize-impl($this$findLast_u2djgv0xPQ) + -1;
      UInt var10000;
      if (0 <= var3) {
         do {
            int var4 = var3--;
            int var5 = UIntArray.get-pVg5ArA(var2, var4);
            if ((Boolean)predicate.invoke(UInt.box-impl(var5))) {
               var10000 = UInt.box-impl(var5);
               return var10000;
            }
         } while(0 <= var3);
      }

      var10000 = null;
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final ULong findLast_MShoTSo/* $FF was: findLast-MShoTSo*/(long[] $this$findLast_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$findLast_u2dMShoTSo, "$this$findLast");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      long[] var2 = $this$findLast_u2dMShoTSo;
      int var3 = ULongArray.getSize-impl($this$findLast_u2dMShoTSo) + -1;
      ULong var10000;
      if (0 <= var3) {
         do {
            int var4 = var3--;
            long var5 = ULongArray.get-s-VKNKU(var2, var4);
            if ((Boolean)predicate.invoke(ULong.box-impl(var5))) {
               var10000 = ULong.box-impl(var5);
               return var10000;
            }
         } while(0 <= var3);
      }

      var10000 = null;
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UByte findLast_JOV_ifY/* $FF was: findLast-JOV_ifY*/(byte[] $this$findLast_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$findLast_u2dJOV_ifY, "$this$findLast");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      byte[] var2 = $this$findLast_u2dJOV_ifY;
      int var3 = UByteArray.getSize-impl($this$findLast_u2dJOV_ifY) + -1;
      UByte var10000;
      if (0 <= var3) {
         do {
            int var4 = var3--;
            byte var5 = UByteArray.get-w2LRezQ(var2, var4);
            if ((Boolean)predicate.invoke(UByte.box-impl(var5))) {
               var10000 = UByte.box-impl(var5);
               return var10000;
            }
         } while(0 <= var3);
      }

      var10000 = null;
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UShort findLast_xTcfx_M/* $FF was: findLast-xTcfx_M*/(short[] $this$findLast_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$findLast_u2dxTcfx_M, "$this$findLast");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      short[] var2 = $this$findLast_u2dxTcfx_M;
      int var3 = UShortArray.getSize-impl($this$findLast_u2dxTcfx_M) + -1;
      UShort var10000;
      if (0 <= var3) {
         do {
            int var4 = var3--;
            short var5 = UShortArray.get-Mh2AYeg(var2, var4);
            if ((Boolean)predicate.invoke(UShort.box-impl(var5))) {
               var10000 = UShort.box-impl(var5);
               return var10000;
            }
         } while(0 <= var3);
      }

      var10000 = null;
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int first__ajY_9A/* $FF was: first--ajY-9A*/(int[] $this$first_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$first_u2d_u2dajY_u2d9A, "$this$first");
      return UInt.constructor-impl(ArraysKt.first($this$first_u2d_u2dajY_u2d9A));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long first_QwZRm1k/* $FF was: first-QwZRm1k*/(long[] $this$first_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$first_u2dQwZRm1k, "$this$first");
      return ULong.constructor-impl(ArraysKt.first($this$first_u2dQwZRm1k));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte first_GBYM_sE/* $FF was: first-GBYM_sE*/(byte[] $this$first_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$first_u2dGBYM_sE, "$this$first");
      return UByte.constructor-impl(ArraysKt.first($this$first_u2dGBYM_sE));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short first_rL5Bavg/* $FF was: first-rL5Bavg*/(short[] $this$first_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$first_u2drL5Bavg, "$this$first");
      return UShort.constructor-impl(ArraysKt.first($this$first_u2drL5Bavg));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int first_jgv0xPQ/* $FF was: first-jgv0xPQ*/(int[] $this$first_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$first_u2djgv0xPQ, "$this$first");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UIntArray.getSize-impl($this$first_u2djgv0xPQ); var2 < var3; ++var2) {
         int element = UIntArray.get-pVg5ArA($this$first_u2djgv0xPQ, var2);
         if ((Boolean)predicate.invoke(UInt.box-impl(element))) {
            return element;
         }
      }

      throw new NoSuchElementException("Array contains no element matching the predicate.");
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long first_MShoTSo/* $FF was: first-MShoTSo*/(long[] $this$first_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$first_u2dMShoTSo, "$this$first");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = ULongArray.getSize-impl($this$first_u2dMShoTSo); var2 < var3; ++var2) {
         long element = ULongArray.get-s-VKNKU($this$first_u2dMShoTSo, var2);
         if ((Boolean)predicate.invoke(ULong.box-impl(element))) {
            return element;
         }
      }

      throw new NoSuchElementException("Array contains no element matching the predicate.");
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte first_JOV_ifY/* $FF was: first-JOV_ifY*/(byte[] $this$first_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$first_u2dJOV_ifY, "$this$first");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UByteArray.getSize-impl($this$first_u2dJOV_ifY); var2 < var3; ++var2) {
         byte element = UByteArray.get-w2LRezQ($this$first_u2dJOV_ifY, var2);
         if ((Boolean)predicate.invoke(UByte.box-impl(element))) {
            return element;
         }
      }

      throw new NoSuchElementException("Array contains no element matching the predicate.");
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short first_xTcfx_M/* $FF was: first-xTcfx_M*/(short[] $this$first_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$first_u2dxTcfx_M, "$this$first");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UShortArray.getSize-impl($this$first_u2dxTcfx_M); var2 < var3; ++var2) {
         short element = UShortArray.get-Mh2AYeg($this$first_u2dxTcfx_M, var2);
         if ((Boolean)predicate.invoke(UShort.box-impl(element))) {
            return element;
         }
      }

      throw new NoSuchElementException("Array contains no element matching the predicate.");
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UInt firstOrNull__ajY_9A/* $FF was: firstOrNull--ajY-9A*/(@NotNull int[] $this$firstOrNull_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$firstOrNull_u2d_u2dajY_u2d9A, "$this$firstOrNull");
      return UIntArray.isEmpty-impl($this$firstOrNull_u2d_u2dajY_u2d9A) ? null : UInt.box-impl(UIntArray.get-pVg5ArA($this$firstOrNull_u2d_u2dajY_u2d9A, 0));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final ULong firstOrNull_QwZRm1k/* $FF was: firstOrNull-QwZRm1k*/(@NotNull long[] $this$firstOrNull_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$firstOrNull_u2dQwZRm1k, "$this$firstOrNull");
      return ULongArray.isEmpty-impl($this$firstOrNull_u2dQwZRm1k) ? null : ULong.box-impl(ULongArray.get-s-VKNKU($this$firstOrNull_u2dQwZRm1k, 0));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UByte firstOrNull_GBYM_sE/* $FF was: firstOrNull-GBYM_sE*/(@NotNull byte[] $this$firstOrNull_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$firstOrNull_u2dGBYM_sE, "$this$firstOrNull");
      return UByteArray.isEmpty-impl($this$firstOrNull_u2dGBYM_sE) ? null : UByte.box-impl(UByteArray.get-w2LRezQ($this$firstOrNull_u2dGBYM_sE, 0));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UShort firstOrNull_rL5Bavg/* $FF was: firstOrNull-rL5Bavg*/(@NotNull short[] $this$firstOrNull_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$firstOrNull_u2drL5Bavg, "$this$firstOrNull");
      return UShortArray.isEmpty-impl($this$firstOrNull_u2drL5Bavg) ? null : UShort.box-impl(UShortArray.get-Mh2AYeg($this$firstOrNull_u2drL5Bavg, 0));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UInt firstOrNull_jgv0xPQ/* $FF was: firstOrNull-jgv0xPQ*/(int[] $this$firstOrNull_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$firstOrNull_u2djgv0xPQ, "$this$firstOrNull");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UIntArray.getSize-impl($this$firstOrNull_u2djgv0xPQ); var2 < var3; ++var2) {
         int element = UIntArray.get-pVg5ArA($this$firstOrNull_u2djgv0xPQ, var2);
         if ((Boolean)predicate.invoke(UInt.box-impl(element))) {
            return UInt.box-impl(element);
         }
      }

      return null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final ULong firstOrNull_MShoTSo/* $FF was: firstOrNull-MShoTSo*/(long[] $this$firstOrNull_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$firstOrNull_u2dMShoTSo, "$this$firstOrNull");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = ULongArray.getSize-impl($this$firstOrNull_u2dMShoTSo); var2 < var3; ++var2) {
         long element = ULongArray.get-s-VKNKU($this$firstOrNull_u2dMShoTSo, var2);
         if ((Boolean)predicate.invoke(ULong.box-impl(element))) {
            return ULong.box-impl(element);
         }
      }

      return null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UByte firstOrNull_JOV_ifY/* $FF was: firstOrNull-JOV_ifY*/(byte[] $this$firstOrNull_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$firstOrNull_u2dJOV_ifY, "$this$firstOrNull");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UByteArray.getSize-impl($this$firstOrNull_u2dJOV_ifY); var2 < var3; ++var2) {
         byte element = UByteArray.get-w2LRezQ($this$firstOrNull_u2dJOV_ifY, var2);
         if ((Boolean)predicate.invoke(UByte.box-impl(element))) {
            return UByte.box-impl(element);
         }
      }

      return null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UShort firstOrNull_xTcfx_M/* $FF was: firstOrNull-xTcfx_M*/(short[] $this$firstOrNull_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$firstOrNull_u2dxTcfx_M, "$this$firstOrNull");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UShortArray.getSize-impl($this$firstOrNull_u2dxTcfx_M); var2 < var3; ++var2) {
         short element = UShortArray.get-Mh2AYeg($this$firstOrNull_u2dxTcfx_M, var2);
         if ((Boolean)predicate.invoke(UShort.box-impl(element))) {
            return UShort.box-impl(element);
         }
      }

      return null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int getOrElse_QxvSvLU/* $FF was: getOrElse-QxvSvLU*/(int[] $this$getOrElse_u2dQxvSvLU, int index, Function1<? super Integer, UInt> defaultValue) {
      Intrinsics.checkNotNullParameter($this$getOrElse_u2dQxvSvLU, "$this$getOrElse");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return (0 <= index ? index < UIntArray.getSize-impl($this$getOrElse_u2dQxvSvLU) : false) ? UIntArray.get-pVg5ArA($this$getOrElse_u2dQxvSvLU, index) : ((UInt)defaultValue.invoke(index)).unbox-impl();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long getOrElse_Xw8i6dc/* $FF was: getOrElse-Xw8i6dc*/(long[] $this$getOrElse_u2dXw8i6dc, int index, Function1<? super Integer, ULong> defaultValue) {
      Intrinsics.checkNotNullParameter($this$getOrElse_u2dXw8i6dc, "$this$getOrElse");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return (0 <= index ? index < ULongArray.getSize-impl($this$getOrElse_u2dXw8i6dc) : false) ? ULongArray.get-s-VKNKU($this$getOrElse_u2dXw8i6dc, index) : ((ULong)defaultValue.invoke(index)).unbox-impl();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte getOrElse_cO_VybQ/* $FF was: getOrElse-cO-VybQ*/(byte[] $this$getOrElse_u2dcO_u2dVybQ, int index, Function1<? super Integer, UByte> defaultValue) {
      Intrinsics.checkNotNullParameter($this$getOrElse_u2dcO_u2dVybQ, "$this$getOrElse");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return (0 <= index ? index < UByteArray.getSize-impl($this$getOrElse_u2dcO_u2dVybQ) : false) ? UByteArray.get-w2LRezQ($this$getOrElse_u2dcO_u2dVybQ, index) : ((UByte)defaultValue.invoke(index)).unbox-impl();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short getOrElse_CVVdw08/* $FF was: getOrElse-CVVdw08*/(short[] $this$getOrElse_u2dCVVdw08, int index, Function1<? super Integer, UShort> defaultValue) {
      Intrinsics.checkNotNullParameter($this$getOrElse_u2dCVVdw08, "$this$getOrElse");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return (0 <= index ? index < UShortArray.getSize-impl($this$getOrElse_u2dCVVdw08) : false) ? UShortArray.get-Mh2AYeg($this$getOrElse_u2dCVVdw08, index) : ((UShort)defaultValue.invoke(index)).unbox-impl();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UInt getOrNull_qFRl0hI/* $FF was: getOrNull-qFRl0hI*/(@NotNull int[] $this$getOrNull_u2dqFRl0hI, int index) {
      Intrinsics.checkNotNullParameter($this$getOrNull_u2dqFRl0hI, "$this$getOrNull");
      return (0 <= index ? index < UIntArray.getSize-impl($this$getOrNull_u2dqFRl0hI) : false) ? UInt.box-impl(UIntArray.get-pVg5ArA($this$getOrNull_u2dqFRl0hI, index)) : null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final ULong getOrNull_r7IrZao/* $FF was: getOrNull-r7IrZao*/(@NotNull long[] $this$getOrNull_u2dr7IrZao, int index) {
      Intrinsics.checkNotNullParameter($this$getOrNull_u2dr7IrZao, "$this$getOrNull");
      return (0 <= index ? index < ULongArray.getSize-impl($this$getOrNull_u2dr7IrZao) : false) ? ULong.box-impl(ULongArray.get-s-VKNKU($this$getOrNull_u2dr7IrZao, index)) : null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UByte getOrNull_PpDY95g/* $FF was: getOrNull-PpDY95g*/(@NotNull byte[] $this$getOrNull_u2dPpDY95g, int index) {
      Intrinsics.checkNotNullParameter($this$getOrNull_u2dPpDY95g, "$this$getOrNull");
      return (0 <= index ? index < UByteArray.getSize-impl($this$getOrNull_u2dPpDY95g) : false) ? UByte.box-impl(UByteArray.get-w2LRezQ($this$getOrNull_u2dPpDY95g, index)) : null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UShort getOrNull_nggk6HY/* $FF was: getOrNull-nggk6HY*/(@NotNull short[] $this$getOrNull_u2dnggk6HY, int index) {
      Intrinsics.checkNotNullParameter($this$getOrNull_u2dnggk6HY, "$this$getOrNull");
      return (0 <= index ? index < UShortArray.getSize-impl($this$getOrNull_u2dnggk6HY) : false) ? UShort.box-impl(UShortArray.get-Mh2AYeg($this$getOrNull_u2dnggk6HY, index)) : null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int indexOf_uWY9BYg/* $FF was: indexOf-uWY9BYg*/(int[] $this$indexOf_u2duWY9BYg, int element) {
      Intrinsics.checkNotNullParameter($this$indexOf_u2duWY9BYg, "$this$indexOf");
      return ArraysKt.indexOf($this$indexOf_u2duWY9BYg, element);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int indexOf_3uqUaXg/* $FF was: indexOf-3uqUaXg*/(long[] $this$indexOf_u2d3uqUaXg, long element) {
      Intrinsics.checkNotNullParameter($this$indexOf_u2d3uqUaXg, "$this$indexOf");
      return ArraysKt.indexOf($this$indexOf_u2d3uqUaXg, element);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int indexOf_gMuBH34/* $FF was: indexOf-gMuBH34*/(byte[] $this$indexOf_u2dgMuBH34, byte element) {
      Intrinsics.checkNotNullParameter($this$indexOf_u2dgMuBH34, "$this$indexOf");
      return ArraysKt.indexOf($this$indexOf_u2dgMuBH34, element);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int indexOf_XzdR7RA/* $FF was: indexOf-XzdR7RA*/(short[] $this$indexOf_u2dXzdR7RA, short element) {
      Intrinsics.checkNotNullParameter($this$indexOf_u2dXzdR7RA, "$this$indexOf");
      return ArraysKt.indexOf($this$indexOf_u2dXzdR7RA, element);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int indexOfFirst_jgv0xPQ/* $FF was: indexOfFirst-jgv0xPQ*/(int[] $this$indexOfFirst_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfFirst_u2djgv0xPQ, "$this$indexOfFirst");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int[] $this$indexOfFirst$iv = $this$indexOfFirst_u2djgv0xPQ;
      int $i$f$indexOfFirst = false;
      int index$iv = 0;
      int var5 = $this$indexOfFirst_u2djgv0xPQ.length;

      int var10000;
      while(true) {
         if (index$iv >= var5) {
            var10000 = -1;
            break;
         }

         int it = $this$indexOfFirst$iv[index$iv];
         int var7 = false;
         if ((Boolean)predicate.invoke(UInt.box-impl(UInt.constructor-impl(it)))) {
            var10000 = index$iv;
            break;
         }

         ++index$iv;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int indexOfFirst_MShoTSo/* $FF was: indexOfFirst-MShoTSo*/(long[] $this$indexOfFirst_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfFirst_u2dMShoTSo, "$this$indexOfFirst");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      long[] $this$indexOfFirst$iv = $this$indexOfFirst_u2dMShoTSo;
      int $i$f$indexOfFirst = false;
      int index$iv = 0;
      int var5 = $this$indexOfFirst_u2dMShoTSo.length;

      int var10000;
      while(true) {
         if (index$iv >= var5) {
            var10000 = -1;
            break;
         }

         long it = $this$indexOfFirst$iv[index$iv];
         int var8 = false;
         if ((Boolean)predicate.invoke(ULong.box-impl(ULong.constructor-impl(it)))) {
            var10000 = index$iv;
            break;
         }

         ++index$iv;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int indexOfFirst_JOV_ifY/* $FF was: indexOfFirst-JOV_ifY*/(byte[] $this$indexOfFirst_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfFirst_u2dJOV_ifY, "$this$indexOfFirst");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      byte[] $this$indexOfFirst$iv = $this$indexOfFirst_u2dJOV_ifY;
      int $i$f$indexOfFirst = false;
      int index$iv = 0;
      int var5 = $this$indexOfFirst_u2dJOV_ifY.length;

      int var10000;
      while(true) {
         if (index$iv >= var5) {
            var10000 = -1;
            break;
         }

         byte it = $this$indexOfFirst$iv[index$iv];
         int var7 = false;
         if ((Boolean)predicate.invoke(UByte.box-impl(UByte.constructor-impl(it)))) {
            var10000 = index$iv;
            break;
         }

         ++index$iv;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int indexOfFirst_xTcfx_M/* $FF was: indexOfFirst-xTcfx_M*/(short[] $this$indexOfFirst_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfFirst_u2dxTcfx_M, "$this$indexOfFirst");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      short[] $this$indexOfFirst$iv = $this$indexOfFirst_u2dxTcfx_M;
      int $i$f$indexOfFirst = false;
      int index$iv = 0;
      int var5 = $this$indexOfFirst_u2dxTcfx_M.length;

      int var10000;
      while(true) {
         if (index$iv >= var5) {
            var10000 = -1;
            break;
         }

         short it = $this$indexOfFirst$iv[index$iv];
         int var7 = false;
         if ((Boolean)predicate.invoke(UShort.box-impl(UShort.constructor-impl(it)))) {
            var10000 = index$iv;
            break;
         }

         ++index$iv;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int indexOfLast_jgv0xPQ/* $FF was: indexOfLast-jgv0xPQ*/(int[] $this$indexOfLast_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfLast_u2djgv0xPQ, "$this$indexOfLast");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int[] $this$indexOfLast$iv = $this$indexOfLast_u2djgv0xPQ;
      int $i$f$indexOfLast = false;
      int var4 = $this$indexOfLast_u2djgv0xPQ.length + -1;
      int var10000;
      if (0 <= var4) {
         do {
            int index$iv = var4--;
            int it = $this$indexOfLast$iv[index$iv];
            int var7 = false;
            if ((Boolean)predicate.invoke(UInt.box-impl(UInt.constructor-impl(it)))) {
               var10000 = index$iv;
               return var10000;
            }
         } while(0 <= var4);
      }

      var10000 = -1;
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int indexOfLast_MShoTSo/* $FF was: indexOfLast-MShoTSo*/(long[] $this$indexOfLast_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfLast_u2dMShoTSo, "$this$indexOfLast");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      long[] $this$indexOfLast$iv = $this$indexOfLast_u2dMShoTSo;
      int $i$f$indexOfLast = false;
      int var4 = $this$indexOfLast_u2dMShoTSo.length + -1;
      int var10000;
      if (0 <= var4) {
         do {
            int index$iv = var4--;
            long it = $this$indexOfLast$iv[index$iv];
            int var8 = false;
            if ((Boolean)predicate.invoke(ULong.box-impl(ULong.constructor-impl(it)))) {
               var10000 = index$iv;
               return var10000;
            }
         } while(0 <= var4);
      }

      var10000 = -1;
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int indexOfLast_JOV_ifY/* $FF was: indexOfLast-JOV_ifY*/(byte[] $this$indexOfLast_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfLast_u2dJOV_ifY, "$this$indexOfLast");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      byte[] $this$indexOfLast$iv = $this$indexOfLast_u2dJOV_ifY;
      int $i$f$indexOfLast = false;
      int var4 = $this$indexOfLast_u2dJOV_ifY.length + -1;
      int var10000;
      if (0 <= var4) {
         do {
            int index$iv = var4--;
            byte it = $this$indexOfLast$iv[index$iv];
            int var7 = false;
            if ((Boolean)predicate.invoke(UByte.box-impl(UByte.constructor-impl(it)))) {
               var10000 = index$iv;
               return var10000;
            }
         } while(0 <= var4);
      }

      var10000 = -1;
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int indexOfLast_xTcfx_M/* $FF was: indexOfLast-xTcfx_M*/(short[] $this$indexOfLast_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$indexOfLast_u2dxTcfx_M, "$this$indexOfLast");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      short[] $this$indexOfLast$iv = $this$indexOfLast_u2dxTcfx_M;
      int $i$f$indexOfLast = false;
      int var4 = $this$indexOfLast_u2dxTcfx_M.length + -1;
      int var10000;
      if (0 <= var4) {
         do {
            int index$iv = var4--;
            short it = $this$indexOfLast$iv[index$iv];
            int var7 = false;
            if ((Boolean)predicate.invoke(UShort.box-impl(UShort.constructor-impl(it)))) {
               var10000 = index$iv;
               return var10000;
            }
         } while(0 <= var4);
      }

      var10000 = -1;
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int last__ajY_9A/* $FF was: last--ajY-9A*/(int[] $this$last_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$last_u2d_u2dajY_u2d9A, "$this$last");
      return UInt.constructor-impl(ArraysKt.last($this$last_u2d_u2dajY_u2d9A));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long last_QwZRm1k/* $FF was: last-QwZRm1k*/(long[] $this$last_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$last_u2dQwZRm1k, "$this$last");
      return ULong.constructor-impl(ArraysKt.last($this$last_u2dQwZRm1k));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte last_GBYM_sE/* $FF was: last-GBYM_sE*/(byte[] $this$last_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$last_u2dGBYM_sE, "$this$last");
      return UByte.constructor-impl(ArraysKt.last($this$last_u2dGBYM_sE));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short last_rL5Bavg/* $FF was: last-rL5Bavg*/(short[] $this$last_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$last_u2drL5Bavg, "$this$last");
      return UShort.constructor-impl(ArraysKt.last($this$last_u2drL5Bavg));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int last_jgv0xPQ/* $FF was: last-jgv0xPQ*/(int[] $this$last_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$last_u2djgv0xPQ, "$this$last");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = UIntArray.getSize-impl($this$last_u2djgv0xPQ) + -1;
      if (0 <= var2) {
         do {
            int index = var2--;
            int element = UIntArray.get-pVg5ArA($this$last_u2djgv0xPQ, index);
            if ((Boolean)predicate.invoke(UInt.box-impl(element))) {
               return element;
            }
         } while(0 <= var2);
      }

      throw new NoSuchElementException("Array contains no element matching the predicate.");
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long last_MShoTSo/* $FF was: last-MShoTSo*/(long[] $this$last_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$last_u2dMShoTSo, "$this$last");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = ULongArray.getSize-impl($this$last_u2dMShoTSo) + -1;
      if (0 <= var2) {
         do {
            int index = var2--;
            long element = ULongArray.get-s-VKNKU($this$last_u2dMShoTSo, index);
            if ((Boolean)predicate.invoke(ULong.box-impl(element))) {
               return element;
            }
         } while(0 <= var2);
      }

      throw new NoSuchElementException("Array contains no element matching the predicate.");
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte last_JOV_ifY/* $FF was: last-JOV_ifY*/(byte[] $this$last_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$last_u2dJOV_ifY, "$this$last");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = UByteArray.getSize-impl($this$last_u2dJOV_ifY) + -1;
      if (0 <= var2) {
         do {
            int index = var2--;
            byte element = UByteArray.get-w2LRezQ($this$last_u2dJOV_ifY, index);
            if ((Boolean)predicate.invoke(UByte.box-impl(element))) {
               return element;
            }
         } while(0 <= var2);
      }

      throw new NoSuchElementException("Array contains no element matching the predicate.");
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short last_xTcfx_M/* $FF was: last-xTcfx_M*/(short[] $this$last_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$last_u2dxTcfx_M, "$this$last");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = UShortArray.getSize-impl($this$last_u2dxTcfx_M) + -1;
      if (0 <= var2) {
         do {
            int index = var2--;
            short element = UShortArray.get-Mh2AYeg($this$last_u2dxTcfx_M, index);
            if ((Boolean)predicate.invoke(UShort.box-impl(element))) {
               return element;
            }
         } while(0 <= var2);
      }

      throw new NoSuchElementException("Array contains no element matching the predicate.");
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int lastIndexOf_uWY9BYg/* $FF was: lastIndexOf-uWY9BYg*/(int[] $this$lastIndexOf_u2duWY9BYg, int element) {
      Intrinsics.checkNotNullParameter($this$lastIndexOf_u2duWY9BYg, "$this$lastIndexOf");
      return ArraysKt.lastIndexOf($this$lastIndexOf_u2duWY9BYg, element);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int lastIndexOf_3uqUaXg/* $FF was: lastIndexOf-3uqUaXg*/(long[] $this$lastIndexOf_u2d3uqUaXg, long element) {
      Intrinsics.checkNotNullParameter($this$lastIndexOf_u2d3uqUaXg, "$this$lastIndexOf");
      return ArraysKt.lastIndexOf($this$lastIndexOf_u2d3uqUaXg, element);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int lastIndexOf_gMuBH34/* $FF was: lastIndexOf-gMuBH34*/(byte[] $this$lastIndexOf_u2dgMuBH34, byte element) {
      Intrinsics.checkNotNullParameter($this$lastIndexOf_u2dgMuBH34, "$this$lastIndexOf");
      return ArraysKt.lastIndexOf($this$lastIndexOf_u2dgMuBH34, element);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int lastIndexOf_XzdR7RA/* $FF was: lastIndexOf-XzdR7RA*/(short[] $this$lastIndexOf_u2dXzdR7RA, short element) {
      Intrinsics.checkNotNullParameter($this$lastIndexOf_u2dXzdR7RA, "$this$lastIndexOf");
      return ArraysKt.lastIndexOf($this$lastIndexOf_u2dXzdR7RA, element);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UInt lastOrNull__ajY_9A/* $FF was: lastOrNull--ajY-9A*/(@NotNull int[] $this$lastOrNull_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$lastOrNull_u2d_u2dajY_u2d9A, "$this$lastOrNull");
      return UIntArray.isEmpty-impl($this$lastOrNull_u2d_u2dajY_u2d9A) ? null : UInt.box-impl(UIntArray.get-pVg5ArA($this$lastOrNull_u2d_u2dajY_u2d9A, UIntArray.getSize-impl($this$lastOrNull_u2d_u2dajY_u2d9A) - 1));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final ULong lastOrNull_QwZRm1k/* $FF was: lastOrNull-QwZRm1k*/(@NotNull long[] $this$lastOrNull_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$lastOrNull_u2dQwZRm1k, "$this$lastOrNull");
      return ULongArray.isEmpty-impl($this$lastOrNull_u2dQwZRm1k) ? null : ULong.box-impl(ULongArray.get-s-VKNKU($this$lastOrNull_u2dQwZRm1k, ULongArray.getSize-impl($this$lastOrNull_u2dQwZRm1k) - 1));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UByte lastOrNull_GBYM_sE/* $FF was: lastOrNull-GBYM_sE*/(@NotNull byte[] $this$lastOrNull_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$lastOrNull_u2dGBYM_sE, "$this$lastOrNull");
      return UByteArray.isEmpty-impl($this$lastOrNull_u2dGBYM_sE) ? null : UByte.box-impl(UByteArray.get-w2LRezQ($this$lastOrNull_u2dGBYM_sE, UByteArray.getSize-impl($this$lastOrNull_u2dGBYM_sE) - 1));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UShort lastOrNull_rL5Bavg/* $FF was: lastOrNull-rL5Bavg*/(@NotNull short[] $this$lastOrNull_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$lastOrNull_u2drL5Bavg, "$this$lastOrNull");
      return UShortArray.isEmpty-impl($this$lastOrNull_u2drL5Bavg) ? null : UShort.box-impl(UShortArray.get-Mh2AYeg($this$lastOrNull_u2drL5Bavg, UShortArray.getSize-impl($this$lastOrNull_u2drL5Bavg) - 1));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UInt lastOrNull_jgv0xPQ/* $FF was: lastOrNull-jgv0xPQ*/(int[] $this$lastOrNull_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$lastOrNull_u2djgv0xPQ, "$this$lastOrNull");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = UIntArray.getSize-impl($this$lastOrNull_u2djgv0xPQ) + -1;
      if (0 <= var2) {
         do {
            int index = var2--;
            int element = UIntArray.get-pVg5ArA($this$lastOrNull_u2djgv0xPQ, index);
            if ((Boolean)predicate.invoke(UInt.box-impl(element))) {
               return UInt.box-impl(element);
            }
         } while(0 <= var2);
      }

      return null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final ULong lastOrNull_MShoTSo/* $FF was: lastOrNull-MShoTSo*/(long[] $this$lastOrNull_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$lastOrNull_u2dMShoTSo, "$this$lastOrNull");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = ULongArray.getSize-impl($this$lastOrNull_u2dMShoTSo) + -1;
      if (0 <= var2) {
         do {
            int index = var2--;
            long element = ULongArray.get-s-VKNKU($this$lastOrNull_u2dMShoTSo, index);
            if ((Boolean)predicate.invoke(ULong.box-impl(element))) {
               return ULong.box-impl(element);
            }
         } while(0 <= var2);
      }

      return null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UByte lastOrNull_JOV_ifY/* $FF was: lastOrNull-JOV_ifY*/(byte[] $this$lastOrNull_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$lastOrNull_u2dJOV_ifY, "$this$lastOrNull");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = UByteArray.getSize-impl($this$lastOrNull_u2dJOV_ifY) + -1;
      if (0 <= var2) {
         do {
            int index = var2--;
            byte element = UByteArray.get-w2LRezQ($this$lastOrNull_u2dJOV_ifY, index);
            if ((Boolean)predicate.invoke(UByte.box-impl(element))) {
               return UByte.box-impl(element);
            }
         } while(0 <= var2);
      }

      return null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UShort lastOrNull_xTcfx_M/* $FF was: lastOrNull-xTcfx_M*/(short[] $this$lastOrNull_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$lastOrNull_u2dxTcfx_M, "$this$lastOrNull");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = UShortArray.getSize-impl($this$lastOrNull_u2dxTcfx_M) + -1;
      if (0 <= var2) {
         do {
            int index = var2--;
            short element = UShortArray.get-Mh2AYeg($this$lastOrNull_u2dxTcfx_M, index);
            if ((Boolean)predicate.invoke(UShort.box-impl(element))) {
               return UShort.box-impl(element);
            }
         } while(0 <= var2);
      }

      return null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int random__ajY_9A/* $FF was: random--ajY-9A*/(int[] $this$random_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$random_u2d_u2dajY_u2d9A, "$this$random");
      return UArraysKt.random-2D5oskM($this$random_u2d_u2dajY_u2d9A, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long random_QwZRm1k/* $FF was: random-QwZRm1k*/(long[] $this$random_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$random_u2dQwZRm1k, "$this$random");
      return UArraysKt.random-JzugnMA($this$random_u2dQwZRm1k, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte random_GBYM_sE/* $FF was: random-GBYM_sE*/(byte[] $this$random_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$random_u2dGBYM_sE, "$this$random");
      return UArraysKt.random-oSF2wD8($this$random_u2dGBYM_sE, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short random_rL5Bavg/* $FF was: random-rL5Bavg*/(short[] $this$random_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$random_u2drL5Bavg, "$this$random");
      return UArraysKt.random-s5X_as8($this$random_u2drL5Bavg, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final int random_2D5oskM/* $FF was: random-2D5oskM*/(@NotNull int[] $this$random_u2d2D5oskM, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$random_u2d2D5oskM, "$this$random");
      Intrinsics.checkNotNullParameter(random, "random");
      if (UIntArray.isEmpty-impl($this$random_u2d2D5oskM)) {
         throw new NoSuchElementException("Array is empty.");
      } else {
         return UIntArray.get-pVg5ArA($this$random_u2d2D5oskM, random.nextInt(UIntArray.getSize-impl($this$random_u2d2D5oskM)));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final long random_JzugnMA/* $FF was: random-JzugnMA*/(@NotNull long[] $this$random_u2dJzugnMA, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$random_u2dJzugnMA, "$this$random");
      Intrinsics.checkNotNullParameter(random, "random");
      if (ULongArray.isEmpty-impl($this$random_u2dJzugnMA)) {
         throw new NoSuchElementException("Array is empty.");
      } else {
         return ULongArray.get-s-VKNKU($this$random_u2dJzugnMA, random.nextInt(ULongArray.getSize-impl($this$random_u2dJzugnMA)));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final byte random_oSF2wD8/* $FF was: random-oSF2wD8*/(@NotNull byte[] $this$random_u2doSF2wD8, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$random_u2doSF2wD8, "$this$random");
      Intrinsics.checkNotNullParameter(random, "random");
      if (UByteArray.isEmpty-impl($this$random_u2doSF2wD8)) {
         throw new NoSuchElementException("Array is empty.");
      } else {
         return UByteArray.get-w2LRezQ($this$random_u2doSF2wD8, random.nextInt(UByteArray.getSize-impl($this$random_u2doSF2wD8)));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final short random_s5X_as8/* $FF was: random-s5X_as8*/(@NotNull short[] $this$random_u2ds5X_as8, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$random_u2ds5X_as8, "$this$random");
      Intrinsics.checkNotNullParameter(random, "random");
      if (UShortArray.isEmpty-impl($this$random_u2ds5X_as8)) {
         throw new NoSuchElementException("Array is empty.");
      } else {
         return UShortArray.get-Mh2AYeg($this$random_u2ds5X_as8, random.nextInt(UShortArray.getSize-impl($this$random_u2ds5X_as8)));
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UInt randomOrNull__ajY_9A/* $FF was: randomOrNull--ajY-9A*/(int[] $this$randomOrNull_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$randomOrNull_u2d_u2dajY_u2d9A, "$this$randomOrNull");
      return UArraysKt.randomOrNull-2D5oskM($this$randomOrNull_u2d_u2dajY_u2d9A, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final ULong randomOrNull_QwZRm1k/* $FF was: randomOrNull-QwZRm1k*/(long[] $this$randomOrNull_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$randomOrNull_u2dQwZRm1k, "$this$randomOrNull");
      return UArraysKt.randomOrNull-JzugnMA($this$randomOrNull_u2dQwZRm1k, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UByte randomOrNull_GBYM_sE/* $FF was: randomOrNull-GBYM_sE*/(byte[] $this$randomOrNull_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$randomOrNull_u2dGBYM_sE, "$this$randomOrNull");
      return UArraysKt.randomOrNull-oSF2wD8($this$randomOrNull_u2dGBYM_sE, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UShort randomOrNull_rL5Bavg/* $FF was: randomOrNull-rL5Bavg*/(short[] $this$randomOrNull_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$randomOrNull_u2drL5Bavg, "$this$randomOrNull");
      return UArraysKt.randomOrNull-s5X_as8($this$randomOrNull_u2drL5Bavg, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UInt randomOrNull_2D5oskM/* $FF was: randomOrNull-2D5oskM*/(@NotNull int[] $this$randomOrNull_u2d2D5oskM, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$randomOrNull_u2d2D5oskM, "$this$randomOrNull");
      Intrinsics.checkNotNullParameter(random, "random");
      return UIntArray.isEmpty-impl($this$randomOrNull_u2d2D5oskM) ? null : UInt.box-impl(UIntArray.get-pVg5ArA($this$randomOrNull_u2d2D5oskM, random.nextInt(UIntArray.getSize-impl($this$randomOrNull_u2d2D5oskM))));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final ULong randomOrNull_JzugnMA/* $FF was: randomOrNull-JzugnMA*/(@NotNull long[] $this$randomOrNull_u2dJzugnMA, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$randomOrNull_u2dJzugnMA, "$this$randomOrNull");
      Intrinsics.checkNotNullParameter(random, "random");
      return ULongArray.isEmpty-impl($this$randomOrNull_u2dJzugnMA) ? null : ULong.box-impl(ULongArray.get-s-VKNKU($this$randomOrNull_u2dJzugnMA, random.nextInt(ULongArray.getSize-impl($this$randomOrNull_u2dJzugnMA))));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UByte randomOrNull_oSF2wD8/* $FF was: randomOrNull-oSF2wD8*/(@NotNull byte[] $this$randomOrNull_u2doSF2wD8, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$randomOrNull_u2doSF2wD8, "$this$randomOrNull");
      Intrinsics.checkNotNullParameter(random, "random");
      return UByteArray.isEmpty-impl($this$randomOrNull_u2doSF2wD8) ? null : UByte.box-impl(UByteArray.get-w2LRezQ($this$randomOrNull_u2doSF2wD8, random.nextInt(UByteArray.getSize-impl($this$randomOrNull_u2doSF2wD8))));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UShort randomOrNull_s5X_as8/* $FF was: randomOrNull-s5X_as8*/(@NotNull short[] $this$randomOrNull_u2ds5X_as8, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$randomOrNull_u2ds5X_as8, "$this$randomOrNull");
      Intrinsics.checkNotNullParameter(random, "random");
      return UShortArray.isEmpty-impl($this$randomOrNull_u2ds5X_as8) ? null : UShort.box-impl(UShortArray.get-Mh2AYeg($this$randomOrNull_u2ds5X_as8, random.nextInt(UShortArray.getSize-impl($this$randomOrNull_u2ds5X_as8))));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int single__ajY_9A/* $FF was: single--ajY-9A*/(int[] $this$single_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$single_u2d_u2dajY_u2d9A, "$this$single");
      return UInt.constructor-impl(ArraysKt.single($this$single_u2d_u2dajY_u2d9A));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long single_QwZRm1k/* $FF was: single-QwZRm1k*/(long[] $this$single_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$single_u2dQwZRm1k, "$this$single");
      return ULong.constructor-impl(ArraysKt.single($this$single_u2dQwZRm1k));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte single_GBYM_sE/* $FF was: single-GBYM_sE*/(byte[] $this$single_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$single_u2dGBYM_sE, "$this$single");
      return UByte.constructor-impl(ArraysKt.single($this$single_u2dGBYM_sE));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short single_rL5Bavg/* $FF was: single-rL5Bavg*/(short[] $this$single_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$single_u2drL5Bavg, "$this$single");
      return UShort.constructor-impl(ArraysKt.single($this$single_u2drL5Bavg));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int single_jgv0xPQ/* $FF was: single-jgv0xPQ*/(int[] $this$single_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$single_u2djgv0xPQ, "$this$single");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      UInt single = null;
      boolean found = false;
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$single_u2djgv0xPQ); var4 < var5; ++var4) {
         int element = UIntArray.get-pVg5ArA($this$single_u2djgv0xPQ, var4);
         if ((Boolean)predicate.invoke(UInt.box-impl(element))) {
            if (found) {
               throw new IllegalArgumentException("Array contains more than one matching element.");
            }

            single = UInt.box-impl(element);
            found = true;
         }
      }

      if (!found) {
         throw new NoSuchElementException("Array contains no element matching the predicate.");
      } else {
         return single.unbox-impl();
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long single_MShoTSo/* $FF was: single-MShoTSo*/(long[] $this$single_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$single_u2dMShoTSo, "$this$single");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      ULong single = null;
      boolean found = false;
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$single_u2dMShoTSo); var4 < var5; ++var4) {
         long element = ULongArray.get-s-VKNKU($this$single_u2dMShoTSo, var4);
         if ((Boolean)predicate.invoke(ULong.box-impl(element))) {
            if (found) {
               throw new IllegalArgumentException("Array contains more than one matching element.");
            }

            single = ULong.box-impl(element);
            found = true;
         }
      }

      if (!found) {
         throw new NoSuchElementException("Array contains no element matching the predicate.");
      } else {
         return single.unbox-impl();
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte single_JOV_ifY/* $FF was: single-JOV_ifY*/(byte[] $this$single_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$single_u2dJOV_ifY, "$this$single");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      UByte single = null;
      boolean found = false;
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$single_u2dJOV_ifY); var4 < var5; ++var4) {
         byte element = UByteArray.get-w2LRezQ($this$single_u2dJOV_ifY, var4);
         if ((Boolean)predicate.invoke(UByte.box-impl(element))) {
            if (found) {
               throw new IllegalArgumentException("Array contains more than one matching element.");
            }

            single = UByte.box-impl(element);
            found = true;
         }
      }

      if (!found) {
         throw new NoSuchElementException("Array contains no element matching the predicate.");
      } else {
         return single.unbox-impl();
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short single_xTcfx_M/* $FF was: single-xTcfx_M*/(short[] $this$single_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$single_u2dxTcfx_M, "$this$single");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      UShort single = null;
      boolean found = false;
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$single_u2dxTcfx_M); var4 < var5; ++var4) {
         short element = UShortArray.get-Mh2AYeg($this$single_u2dxTcfx_M, var4);
         if ((Boolean)predicate.invoke(UShort.box-impl(element))) {
            if (found) {
               throw new IllegalArgumentException("Array contains more than one matching element.");
            }

            single = UShort.box-impl(element);
            found = true;
         }
      }

      if (!found) {
         throw new NoSuchElementException("Array contains no element matching the predicate.");
      } else {
         return single.unbox-impl();
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UInt singleOrNull__ajY_9A/* $FF was: singleOrNull--ajY-9A*/(@NotNull int[] $this$singleOrNull_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$singleOrNull_u2d_u2dajY_u2d9A, "$this$singleOrNull");
      return UIntArray.getSize-impl($this$singleOrNull_u2d_u2dajY_u2d9A) == 1 ? UInt.box-impl(UIntArray.get-pVg5ArA($this$singleOrNull_u2d_u2dajY_u2d9A, 0)) : null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final ULong singleOrNull_QwZRm1k/* $FF was: singleOrNull-QwZRm1k*/(@NotNull long[] $this$singleOrNull_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$singleOrNull_u2dQwZRm1k, "$this$singleOrNull");
      return ULongArray.getSize-impl($this$singleOrNull_u2dQwZRm1k) == 1 ? ULong.box-impl(ULongArray.get-s-VKNKU($this$singleOrNull_u2dQwZRm1k, 0)) : null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UByte singleOrNull_GBYM_sE/* $FF was: singleOrNull-GBYM_sE*/(@NotNull byte[] $this$singleOrNull_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$singleOrNull_u2dGBYM_sE, "$this$singleOrNull");
      return UByteArray.getSize-impl($this$singleOrNull_u2dGBYM_sE) == 1 ? UByte.box-impl(UByteArray.get-w2LRezQ($this$singleOrNull_u2dGBYM_sE, 0)) : null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UShort singleOrNull_rL5Bavg/* $FF was: singleOrNull-rL5Bavg*/(@NotNull short[] $this$singleOrNull_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$singleOrNull_u2drL5Bavg, "$this$singleOrNull");
      return UShortArray.getSize-impl($this$singleOrNull_u2drL5Bavg) == 1 ? UShort.box-impl(UShortArray.get-Mh2AYeg($this$singleOrNull_u2drL5Bavg, 0)) : null;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UInt singleOrNull_jgv0xPQ/* $FF was: singleOrNull-jgv0xPQ*/(int[] $this$singleOrNull_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$singleOrNull_u2djgv0xPQ, "$this$singleOrNull");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      UInt single = null;
      boolean found = false;
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$singleOrNull_u2djgv0xPQ); var4 < var5; ++var4) {
         int element = UIntArray.get-pVg5ArA($this$singleOrNull_u2djgv0xPQ, var4);
         if ((Boolean)predicate.invoke(UInt.box-impl(element))) {
            if (found) {
               return null;
            }

            single = UInt.box-impl(element);
            found = true;
         }
      }

      if (!found) {
         return null;
      } else {
         return single;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final ULong singleOrNull_MShoTSo/* $FF was: singleOrNull-MShoTSo*/(long[] $this$singleOrNull_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$singleOrNull_u2dMShoTSo, "$this$singleOrNull");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      ULong single = null;
      boolean found = false;
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$singleOrNull_u2dMShoTSo); var4 < var5; ++var4) {
         long element = ULongArray.get-s-VKNKU($this$singleOrNull_u2dMShoTSo, var4);
         if ((Boolean)predicate.invoke(ULong.box-impl(element))) {
            if (found) {
               return null;
            }

            single = ULong.box-impl(element);
            found = true;
         }
      }

      if (!found) {
         return null;
      } else {
         return single;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UByte singleOrNull_JOV_ifY/* $FF was: singleOrNull-JOV_ifY*/(byte[] $this$singleOrNull_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$singleOrNull_u2dJOV_ifY, "$this$singleOrNull");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      UByte single = null;
      boolean found = false;
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$singleOrNull_u2dJOV_ifY); var4 < var5; ++var4) {
         byte element = UByteArray.get-w2LRezQ($this$singleOrNull_u2dJOV_ifY, var4);
         if ((Boolean)predicate.invoke(UByte.box-impl(element))) {
            if (found) {
               return null;
            }

            single = UByte.box-impl(element);
            found = true;
         }
      }

      if (!found) {
         return null;
      } else {
         return single;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UShort singleOrNull_xTcfx_M/* $FF was: singleOrNull-xTcfx_M*/(short[] $this$singleOrNull_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$singleOrNull_u2dxTcfx_M, "$this$singleOrNull");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      UShort single = null;
      boolean found = false;
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$singleOrNull_u2dxTcfx_M); var4 < var5; ++var4) {
         short element = UShortArray.get-Mh2AYeg($this$singleOrNull_u2dxTcfx_M, var4);
         if ((Boolean)predicate.invoke(UShort.box-impl(element))) {
            if (found) {
               return null;
            }

            single = UShort.box-impl(element);
            found = true;
         }
      }

      if (!found) {
         return null;
      } else {
         return single;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UInt> drop_qFRl0hI/* $FF was: drop-qFRl0hI*/(@NotNull int[] $this$drop_u2dqFRl0hI, int n) {
      Intrinsics.checkNotNullParameter($this$drop_u2dqFRl0hI, "$this$drop");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return UArraysKt.takeLast-qFRl0hI($this$drop_u2dqFRl0hI, RangesKt.coerceAtLeast(UIntArray.getSize-impl($this$drop_u2dqFRl0hI) - n, 0));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<ULong> drop_r7IrZao/* $FF was: drop-r7IrZao*/(@NotNull long[] $this$drop_u2dr7IrZao, int n) {
      Intrinsics.checkNotNullParameter($this$drop_u2dr7IrZao, "$this$drop");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return UArraysKt.takeLast-r7IrZao($this$drop_u2dr7IrZao, RangesKt.coerceAtLeast(ULongArray.getSize-impl($this$drop_u2dr7IrZao) - n, 0));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UByte> drop_PpDY95g/* $FF was: drop-PpDY95g*/(@NotNull byte[] $this$drop_u2dPpDY95g, int n) {
      Intrinsics.checkNotNullParameter($this$drop_u2dPpDY95g, "$this$drop");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return UArraysKt.takeLast-PpDY95g($this$drop_u2dPpDY95g, RangesKt.coerceAtLeast(UByteArray.getSize-impl($this$drop_u2dPpDY95g) - n, 0));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UShort> drop_nggk6HY/* $FF was: drop-nggk6HY*/(@NotNull short[] $this$drop_u2dnggk6HY, int n) {
      Intrinsics.checkNotNullParameter($this$drop_u2dnggk6HY, "$this$drop");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return UArraysKt.takeLast-nggk6HY($this$drop_u2dnggk6HY, RangesKt.coerceAtLeast(UShortArray.getSize-impl($this$drop_u2dnggk6HY) - n, 0));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UInt> dropLast_qFRl0hI/* $FF was: dropLast-qFRl0hI*/(@NotNull int[] $this$dropLast_u2dqFRl0hI, int n) {
      Intrinsics.checkNotNullParameter($this$dropLast_u2dqFRl0hI, "$this$dropLast");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return UArraysKt.take-qFRl0hI($this$dropLast_u2dqFRl0hI, RangesKt.coerceAtLeast(UIntArray.getSize-impl($this$dropLast_u2dqFRl0hI) - n, 0));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<ULong> dropLast_r7IrZao/* $FF was: dropLast-r7IrZao*/(@NotNull long[] $this$dropLast_u2dr7IrZao, int n) {
      Intrinsics.checkNotNullParameter($this$dropLast_u2dr7IrZao, "$this$dropLast");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return UArraysKt.take-r7IrZao($this$dropLast_u2dr7IrZao, RangesKt.coerceAtLeast(ULongArray.getSize-impl($this$dropLast_u2dr7IrZao) - n, 0));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UByte> dropLast_PpDY95g/* $FF was: dropLast-PpDY95g*/(@NotNull byte[] $this$dropLast_u2dPpDY95g, int n) {
      Intrinsics.checkNotNullParameter($this$dropLast_u2dPpDY95g, "$this$dropLast");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return UArraysKt.take-PpDY95g($this$dropLast_u2dPpDY95g, RangesKt.coerceAtLeast(UByteArray.getSize-impl($this$dropLast_u2dPpDY95g) - n, 0));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UShort> dropLast_nggk6HY/* $FF was: dropLast-nggk6HY*/(@NotNull short[] $this$dropLast_u2dnggk6HY, int n) {
      Intrinsics.checkNotNullParameter($this$dropLast_u2dnggk6HY, "$this$dropLast");
      if (n < 0) {
         int var2 = false;
         String var3 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return UArraysKt.take-nggk6HY($this$dropLast_u2dnggk6HY, RangesKt.coerceAtLeast(UShortArray.getSize-impl($this$dropLast_u2dnggk6HY) - n, 0));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UInt> dropLastWhile_jgv0xPQ/* $FF was: dropLastWhile-jgv0xPQ*/(int[] $this$dropLastWhile_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropLastWhile_u2djgv0xPQ, "$this$dropLastWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var4 = false;

      for(int index = ArraysKt.getLastIndex($this$dropLastWhile_u2djgv0xPQ); -1 < index; --index) {
         if (!(Boolean)predicate.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$dropLastWhile_u2djgv0xPQ, index)))) {
            return UArraysKt.take-qFRl0hI($this$dropLastWhile_u2djgv0xPQ, index + 1);
         }
      }

      return CollectionsKt.emptyList();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<ULong> dropLastWhile_MShoTSo/* $FF was: dropLastWhile-MShoTSo*/(long[] $this$dropLastWhile_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropLastWhile_u2dMShoTSo, "$this$dropLastWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var4 = false;

      for(int index = ArraysKt.getLastIndex($this$dropLastWhile_u2dMShoTSo); -1 < index; --index) {
         if (!(Boolean)predicate.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$dropLastWhile_u2dMShoTSo, index)))) {
            return UArraysKt.take-r7IrZao($this$dropLastWhile_u2dMShoTSo, index + 1);
         }
      }

      return CollectionsKt.emptyList();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UByte> dropLastWhile_JOV_ifY/* $FF was: dropLastWhile-JOV_ifY*/(byte[] $this$dropLastWhile_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropLastWhile_u2dJOV_ifY, "$this$dropLastWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var4 = false;

      for(int index = ArraysKt.getLastIndex($this$dropLastWhile_u2dJOV_ifY); -1 < index; --index) {
         if (!(Boolean)predicate.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$dropLastWhile_u2dJOV_ifY, index)))) {
            return UArraysKt.take-PpDY95g($this$dropLastWhile_u2dJOV_ifY, index + 1);
         }
      }

      return CollectionsKt.emptyList();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UShort> dropLastWhile_xTcfx_M/* $FF was: dropLastWhile-xTcfx_M*/(short[] $this$dropLastWhile_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropLastWhile_u2dxTcfx_M, "$this$dropLastWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var4 = false;

      for(int index = ArraysKt.getLastIndex($this$dropLastWhile_u2dxTcfx_M); -1 < index; --index) {
         if (!(Boolean)predicate.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$dropLastWhile_u2dxTcfx_M, index)))) {
            return UArraysKt.take-nggk6HY($this$dropLastWhile_u2dxTcfx_M, index + 1);
         }
      }

      return CollectionsKt.emptyList();
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UInt> dropWhile_jgv0xPQ/* $FF was: dropWhile-jgv0xPQ*/(int[] $this$dropWhile_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropWhile_u2djgv0xPQ, "$this$dropWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      boolean yielding = false;
      ArrayList list = new ArrayList();
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$dropWhile_u2djgv0xPQ); var4 < var5; ++var4) {
         int item = UIntArray.get-pVg5ArA($this$dropWhile_u2djgv0xPQ, var4);
         if (yielding) {
            list.add(UInt.box-impl(item));
         } else if (!(Boolean)predicate.invoke(UInt.box-impl(item))) {
            list.add(UInt.box-impl(item));
            yielding = true;
         }
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<ULong> dropWhile_MShoTSo/* $FF was: dropWhile-MShoTSo*/(long[] $this$dropWhile_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropWhile_u2dMShoTSo, "$this$dropWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      boolean yielding = false;
      ArrayList list = new ArrayList();
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$dropWhile_u2dMShoTSo); var4 < var5; ++var4) {
         long item = ULongArray.get-s-VKNKU($this$dropWhile_u2dMShoTSo, var4);
         if (yielding) {
            list.add(ULong.box-impl(item));
         } else if (!(Boolean)predicate.invoke(ULong.box-impl(item))) {
            list.add(ULong.box-impl(item));
            yielding = true;
         }
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UByte> dropWhile_JOV_ifY/* $FF was: dropWhile-JOV_ifY*/(byte[] $this$dropWhile_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropWhile_u2dJOV_ifY, "$this$dropWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      boolean yielding = false;
      ArrayList list = new ArrayList();
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$dropWhile_u2dJOV_ifY); var4 < var5; ++var4) {
         byte item = UByteArray.get-w2LRezQ($this$dropWhile_u2dJOV_ifY, var4);
         if (yielding) {
            list.add(UByte.box-impl(item));
         } else if (!(Boolean)predicate.invoke(UByte.box-impl(item))) {
            list.add(UByte.box-impl(item));
            yielding = true;
         }
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UShort> dropWhile_xTcfx_M/* $FF was: dropWhile-xTcfx_M*/(short[] $this$dropWhile_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$dropWhile_u2dxTcfx_M, "$this$dropWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      boolean yielding = false;
      ArrayList list = new ArrayList();
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$dropWhile_u2dxTcfx_M); var4 < var5; ++var4) {
         short item = UShortArray.get-Mh2AYeg($this$dropWhile_u2dxTcfx_M, var4);
         if (yielding) {
            list.add(UShort.box-impl(item));
         } else if (!(Boolean)predicate.invoke(UShort.box-impl(item))) {
            list.add(UShort.box-impl(item));
            yielding = true;
         }
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UInt> filter_jgv0xPQ/* $FF was: filter-jgv0xPQ*/(int[] $this$filter_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filter_u2djgv0xPQ, "$this$filter");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int[] var2 = $this$filter_u2djgv0xPQ;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$filter_u2djgv0xPQ); var4 < var5; ++var4) {
         int var6 = UIntArray.get-pVg5ArA(var2, var4);
         if ((Boolean)predicate.invoke(UInt.box-impl(var6))) {
            var3.add(UInt.box-impl(var6));
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<ULong> filter_MShoTSo/* $FF was: filter-MShoTSo*/(long[] $this$filter_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filter_u2dMShoTSo, "$this$filter");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      long[] var2 = $this$filter_u2dMShoTSo;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$filter_u2dMShoTSo); var4 < var5; ++var4) {
         long var6 = ULongArray.get-s-VKNKU(var2, var4);
         if ((Boolean)predicate.invoke(ULong.box-impl(var6))) {
            var3.add(ULong.box-impl(var6));
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UByte> filter_JOV_ifY/* $FF was: filter-JOV_ifY*/(byte[] $this$filter_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filter_u2dJOV_ifY, "$this$filter");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      byte[] var2 = $this$filter_u2dJOV_ifY;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$filter_u2dJOV_ifY); var4 < var5; ++var4) {
         byte var6 = UByteArray.get-w2LRezQ(var2, var4);
         if ((Boolean)predicate.invoke(UByte.box-impl(var6))) {
            var3.add(UByte.box-impl(var6));
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UShort> filter_xTcfx_M/* $FF was: filter-xTcfx_M*/(short[] $this$filter_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filter_u2dxTcfx_M, "$this$filter");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      short[] var2 = $this$filter_u2dxTcfx_M;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$filter_u2dxTcfx_M); var4 < var5; ++var4) {
         short var6 = UShortArray.get-Mh2AYeg(var2, var4);
         if ((Boolean)predicate.invoke(UShort.box-impl(var6))) {
            var3.add(UShort.box-impl(var6));
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UInt> filterIndexed_WyvcNBI/* $FF was: filterIndexed-WyvcNBI*/(int[] $this$filterIndexed_u2dWyvcNBI, Function2<? super Integer, ? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexed_u2dWyvcNBI, "$this$filterIndexed");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      Collection var3 = (Collection)(new ArrayList());
      int[] var4 = $this$filterIndexed_u2dWyvcNBI;
      int var5 = 0;
      int var6 = 0;

      for(int var7 = UIntArray.getSize-impl($this$filterIndexed_u2dWyvcNBI); var6 < var7; ++var6) {
         int var8 = UIntArray.get-pVg5ArA(var4, var6);
         int var10 = var5++;
         if ((Boolean)predicate.invoke(var10, UInt.box-impl(var8))) {
            var3.add(UInt.box-impl(var8));
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<ULong> filterIndexed_s8dVfGU/* $FF was: filterIndexed-s8dVfGU*/(long[] $this$filterIndexed_u2ds8dVfGU, Function2<? super Integer, ? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexed_u2ds8dVfGU, "$this$filterIndexed");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      Collection var3 = (Collection)(new ArrayList());
      long[] var4 = $this$filterIndexed_u2ds8dVfGU;
      int var5 = 0;
      int var6 = 0;

      for(int var7 = ULongArray.getSize-impl($this$filterIndexed_u2ds8dVfGU); var6 < var7; ++var6) {
         long var8 = ULongArray.get-s-VKNKU(var4, var6);
         int var12 = var5++;
         if ((Boolean)predicate.invoke(var12, ULong.box-impl(var8))) {
            var3.add(ULong.box-impl(var8));
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UByte> filterIndexed_ELGow60/* $FF was: filterIndexed-ELGow60*/(byte[] $this$filterIndexed_u2dELGow60, Function2<? super Integer, ? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexed_u2dELGow60, "$this$filterIndexed");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      Collection var3 = (Collection)(new ArrayList());
      byte[] var4 = $this$filterIndexed_u2dELGow60;
      int var5 = 0;
      int var6 = 0;

      for(int var7 = UByteArray.getSize-impl($this$filterIndexed_u2dELGow60); var6 < var7; ++var6) {
         byte var8 = UByteArray.get-w2LRezQ(var4, var6);
         int var10 = var5++;
         if ((Boolean)predicate.invoke(var10, UByte.box-impl(var8))) {
            var3.add(UByte.box-impl(var8));
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UShort> filterIndexed_xzaTVY8/* $FF was: filterIndexed-xzaTVY8*/(short[] $this$filterIndexed_u2dxzaTVY8, Function2<? super Integer, ? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexed_u2dxzaTVY8, "$this$filterIndexed");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      Collection var3 = (Collection)(new ArrayList());
      short[] var4 = $this$filterIndexed_u2dxzaTVY8;
      int var5 = 0;
      int var6 = 0;

      for(int var7 = UShortArray.getSize-impl($this$filterIndexed_u2dxzaTVY8); var6 < var7; ++var6) {
         short var8 = UShortArray.get-Mh2AYeg(var4, var6);
         int var10 = var5++;
         if ((Boolean)predicate.invoke(var10, UShort.box-impl(var8))) {
            var3.add(UShort.box-impl(var8));
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <C extends Collection<? super UInt>> C filterIndexedTo__6EtJGI/* $FF was: filterIndexedTo--6EtJGI*/(int[] $this$filterIndexedTo_u2d_u2d6EtJGI, C destination, Function2<? super Integer, ? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexedTo_u2d_u2d6EtJGI, "$this$filterIndexedTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int[] var3 = $this$filterIndexedTo_u2d_u2d6EtJGI;
      int var4 = 0;
      int var5 = 0;

      for(int var6 = UIntArray.getSize-impl($this$filterIndexedTo_u2d_u2d6EtJGI); var5 < var6; ++var5) {
         int var7 = UIntArray.get-pVg5ArA(var3, var5);
         int index = var4++;
         int var10 = false;
         if ((Boolean)predicate.invoke(index, UInt.box-impl(var7))) {
            destination.add(UInt.box-impl(var7));
         }
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <C extends Collection<? super ULong>> C filterIndexedTo_pe2Q0Dw/* $FF was: filterIndexedTo-pe2Q0Dw*/(long[] $this$filterIndexedTo_u2dpe2Q0Dw, C destination, Function2<? super Integer, ? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexedTo_u2dpe2Q0Dw, "$this$filterIndexedTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      long[] var3 = $this$filterIndexedTo_u2dpe2Q0Dw;
      int var4 = 0;
      int var5 = 0;

      for(int var6 = ULongArray.getSize-impl($this$filterIndexedTo_u2dpe2Q0Dw); var5 < var6; ++var5) {
         long var7 = ULongArray.get-s-VKNKU(var3, var5);
         int index = var4++;
         int var12 = false;
         if ((Boolean)predicate.invoke(index, ULong.box-impl(var7))) {
            destination.add(ULong.box-impl(var7));
         }
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <C extends Collection<? super UByte>> C filterIndexedTo_eNpIKz8/* $FF was: filterIndexedTo-eNpIKz8*/(byte[] $this$filterIndexedTo_u2deNpIKz8, C destination, Function2<? super Integer, ? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexedTo_u2deNpIKz8, "$this$filterIndexedTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      byte[] var3 = $this$filterIndexedTo_u2deNpIKz8;
      int var4 = 0;
      int var5 = 0;

      for(int var6 = UByteArray.getSize-impl($this$filterIndexedTo_u2deNpIKz8); var5 < var6; ++var5) {
         byte var7 = UByteArray.get-w2LRezQ(var3, var5);
         int index = var4++;
         int var10 = false;
         if ((Boolean)predicate.invoke(index, UByte.box-impl(var7))) {
            destination.add(UByte.box-impl(var7));
         }
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <C extends Collection<? super UShort>> C filterIndexedTo_QqktQ3k/* $FF was: filterIndexedTo-QqktQ3k*/(short[] $this$filterIndexedTo_u2dQqktQ3k, C destination, Function2<? super Integer, ? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterIndexedTo_u2dQqktQ3k, "$this$filterIndexedTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      short[] var3 = $this$filterIndexedTo_u2dQqktQ3k;
      int var4 = 0;
      int var5 = 0;

      for(int var6 = UShortArray.getSize-impl($this$filterIndexedTo_u2dQqktQ3k); var5 < var6; ++var5) {
         short var7 = UShortArray.get-Mh2AYeg(var3, var5);
         int index = var4++;
         int var10 = false;
         if ((Boolean)predicate.invoke(index, UShort.box-impl(var7))) {
            destination.add(UShort.box-impl(var7));
         }
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UInt> filterNot_jgv0xPQ/* $FF was: filterNot-jgv0xPQ*/(int[] $this$filterNot_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNot_u2djgv0xPQ, "$this$filterNot");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int[] var2 = $this$filterNot_u2djgv0xPQ;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$filterNot_u2djgv0xPQ); var4 < var5; ++var4) {
         int var6 = UIntArray.get-pVg5ArA(var2, var4);
         if (!(Boolean)predicate.invoke(UInt.box-impl(var6))) {
            var3.add(UInt.box-impl(var6));
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<ULong> filterNot_MShoTSo/* $FF was: filterNot-MShoTSo*/(long[] $this$filterNot_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNot_u2dMShoTSo, "$this$filterNot");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      long[] var2 = $this$filterNot_u2dMShoTSo;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$filterNot_u2dMShoTSo); var4 < var5; ++var4) {
         long var6 = ULongArray.get-s-VKNKU(var2, var4);
         if (!(Boolean)predicate.invoke(ULong.box-impl(var6))) {
            var3.add(ULong.box-impl(var6));
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UByte> filterNot_JOV_ifY/* $FF was: filterNot-JOV_ifY*/(byte[] $this$filterNot_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNot_u2dJOV_ifY, "$this$filterNot");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      byte[] var2 = $this$filterNot_u2dJOV_ifY;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$filterNot_u2dJOV_ifY); var4 < var5; ++var4) {
         byte var6 = UByteArray.get-w2LRezQ(var2, var4);
         if (!(Boolean)predicate.invoke(UByte.box-impl(var6))) {
            var3.add(UByte.box-impl(var6));
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UShort> filterNot_xTcfx_M/* $FF was: filterNot-xTcfx_M*/(short[] $this$filterNot_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNot_u2dxTcfx_M, "$this$filterNot");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      short[] var2 = $this$filterNot_u2dxTcfx_M;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$filterNot_u2dxTcfx_M); var4 < var5; ++var4) {
         short var6 = UShortArray.get-Mh2AYeg(var2, var4);
         if (!(Boolean)predicate.invoke(UShort.box-impl(var6))) {
            var3.add(UShort.box-impl(var6));
         }
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <C extends Collection<? super UInt>> C filterNotTo_wU5IKMo/* $FF was: filterNotTo-wU5IKMo*/(int[] $this$filterNotTo_u2dwU5IKMo, C destination, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNotTo_u2dwU5IKMo, "$this$filterNotTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var3 = 0;

      for(int var4 = UIntArray.getSize-impl($this$filterNotTo_u2dwU5IKMo); var3 < var4; ++var3) {
         int element = UIntArray.get-pVg5ArA($this$filterNotTo_u2dwU5IKMo, var3);
         if (!(Boolean)predicate.invoke(UInt.box-impl(element))) {
            destination.add(UInt.box-impl(element));
         }
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <C extends Collection<? super ULong>> C filterNotTo_HqK1JgA/* $FF was: filterNotTo-HqK1JgA*/(long[] $this$filterNotTo_u2dHqK1JgA, C destination, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNotTo_u2dHqK1JgA, "$this$filterNotTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var3 = 0;

      for(int var4 = ULongArray.getSize-impl($this$filterNotTo_u2dHqK1JgA); var3 < var4; ++var3) {
         long element = ULongArray.get-s-VKNKU($this$filterNotTo_u2dHqK1JgA, var3);
         if (!(Boolean)predicate.invoke(ULong.box-impl(element))) {
            destination.add(ULong.box-impl(element));
         }
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <C extends Collection<? super UByte>> C filterNotTo_wzUQCXU/* $FF was: filterNotTo-wzUQCXU*/(byte[] $this$filterNotTo_u2dwzUQCXU, C destination, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNotTo_u2dwzUQCXU, "$this$filterNotTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$filterNotTo_u2dwzUQCXU); var3 < var4; ++var3) {
         byte element = UByteArray.get-w2LRezQ($this$filterNotTo_u2dwzUQCXU, var3);
         if (!(Boolean)predicate.invoke(UByte.box-impl(element))) {
            destination.add(UByte.box-impl(element));
         }
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <C extends Collection<? super UShort>> C filterNotTo_oEOeDjA/* $FF was: filterNotTo-oEOeDjA*/(short[] $this$filterNotTo_u2doEOeDjA, C destination, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterNotTo_u2doEOeDjA, "$this$filterNotTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$filterNotTo_u2doEOeDjA); var3 < var4; ++var3) {
         short element = UShortArray.get-Mh2AYeg($this$filterNotTo_u2doEOeDjA, var3);
         if (!(Boolean)predicate.invoke(UShort.box-impl(element))) {
            destination.add(UShort.box-impl(element));
         }
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <C extends Collection<? super UInt>> C filterTo_wU5IKMo/* $FF was: filterTo-wU5IKMo*/(int[] $this$filterTo_u2dwU5IKMo, C destination, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterTo_u2dwU5IKMo, "$this$filterTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var3 = 0;

      for(int var4 = UIntArray.getSize-impl($this$filterTo_u2dwU5IKMo); var3 < var4; ++var3) {
         int element = UIntArray.get-pVg5ArA($this$filterTo_u2dwU5IKMo, var3);
         if ((Boolean)predicate.invoke(UInt.box-impl(element))) {
            destination.add(UInt.box-impl(element));
         }
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <C extends Collection<? super ULong>> C filterTo_HqK1JgA/* $FF was: filterTo-HqK1JgA*/(long[] $this$filterTo_u2dHqK1JgA, C destination, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterTo_u2dHqK1JgA, "$this$filterTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var3 = 0;

      for(int var4 = ULongArray.getSize-impl($this$filterTo_u2dHqK1JgA); var3 < var4; ++var3) {
         long element = ULongArray.get-s-VKNKU($this$filterTo_u2dHqK1JgA, var3);
         if ((Boolean)predicate.invoke(ULong.box-impl(element))) {
            destination.add(ULong.box-impl(element));
         }
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <C extends Collection<? super UByte>> C filterTo_wzUQCXU/* $FF was: filterTo-wzUQCXU*/(byte[] $this$filterTo_u2dwzUQCXU, C destination, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterTo_u2dwzUQCXU, "$this$filterTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$filterTo_u2dwzUQCXU); var3 < var4; ++var3) {
         byte element = UByteArray.get-w2LRezQ($this$filterTo_u2dwzUQCXU, var3);
         if ((Boolean)predicate.invoke(UByte.box-impl(element))) {
            destination.add(UByte.box-impl(element));
         }
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <C extends Collection<? super UShort>> C filterTo_oEOeDjA/* $FF was: filterTo-oEOeDjA*/(short[] $this$filterTo_u2doEOeDjA, C destination, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$filterTo_u2doEOeDjA, "$this$filterTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$filterTo_u2doEOeDjA); var3 < var4; ++var3) {
         short element = UShortArray.get-Mh2AYeg($this$filterTo_u2doEOeDjA, var3);
         if ((Boolean)predicate.invoke(UShort.box-impl(element))) {
            destination.add(UShort.box-impl(element));
         }
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UInt> slice_tAntMlw/* $FF was: slice-tAntMlw*/(@NotNull int[] $this$slice_u2dtAntMlw, @NotNull IntRange indices) {
      Intrinsics.checkNotNullParameter($this$slice_u2dtAntMlw, "$this$slice");
      Intrinsics.checkNotNullParameter(indices, "indices");
      if (indices.isEmpty()) {
         return CollectionsKt.emptyList();
      } else {
         int var3 = indices.getStart();
         int var4 = indices.getEndInclusive() + 1;
         return UArraysKt.asList--ajY-9A(UIntArray.constructor-impl(ArraysKt.copyOfRange($this$slice_u2dtAntMlw, var3, var4)));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<ULong> slice_ZRhS8yI/* $FF was: slice-ZRhS8yI*/(@NotNull long[] $this$slice_u2dZRhS8yI, @NotNull IntRange indices) {
      Intrinsics.checkNotNullParameter($this$slice_u2dZRhS8yI, "$this$slice");
      Intrinsics.checkNotNullParameter(indices, "indices");
      if (indices.isEmpty()) {
         return CollectionsKt.emptyList();
      } else {
         int var3 = indices.getStart();
         int var4 = indices.getEndInclusive() + 1;
         return UArraysKt.asList-QwZRm1k(ULongArray.constructor-impl(ArraysKt.copyOfRange($this$slice_u2dZRhS8yI, var3, var4)));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UByte> slice_c0bezYM/* $FF was: slice-c0bezYM*/(@NotNull byte[] $this$slice_u2dc0bezYM, @NotNull IntRange indices) {
      Intrinsics.checkNotNullParameter($this$slice_u2dc0bezYM, "$this$slice");
      Intrinsics.checkNotNullParameter(indices, "indices");
      if (indices.isEmpty()) {
         return CollectionsKt.emptyList();
      } else {
         int var3 = indices.getStart();
         int var4 = indices.getEndInclusive() + 1;
         return UArraysKt.asList-GBYM_sE(UByteArray.constructor-impl(ArraysKt.copyOfRange($this$slice_u2dc0bezYM, var3, var4)));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UShort> slice_Q6IL4kU/* $FF was: slice-Q6IL4kU*/(@NotNull short[] $this$slice_u2dQ6IL4kU, @NotNull IntRange indices) {
      Intrinsics.checkNotNullParameter($this$slice_u2dQ6IL4kU, "$this$slice");
      Intrinsics.checkNotNullParameter(indices, "indices");
      if (indices.isEmpty()) {
         return CollectionsKt.emptyList();
      } else {
         int var3 = indices.getStart();
         int var4 = indices.getEndInclusive() + 1;
         return UArraysKt.asList-rL5Bavg(UShortArray.constructor-impl(ArraysKt.copyOfRange($this$slice_u2dQ6IL4kU, var3, var4)));
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UInt> slice_HwE9HBo/* $FF was: slice-HwE9HBo*/(@NotNull int[] $this$slice_u2dHwE9HBo, @NotNull Iterable<Integer> indices) {
      Intrinsics.checkNotNullParameter($this$slice_u2dHwE9HBo, "$this$slice");
      Intrinsics.checkNotNullParameter(indices, "indices");
      int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
      if (size == 0) {
         return CollectionsKt.emptyList();
      } else {
         ArrayList list = new ArrayList(size);
         Iterator var4 = indices.iterator();

         while(var4.hasNext()) {
            int index = ((Number)var4.next()).intValue();
            list.add(UInt.box-impl(UIntArray.get-pVg5ArA($this$slice_u2dHwE9HBo, index)));
         }

         return (List)list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<ULong> slice_F7u83W8/* $FF was: slice-F7u83W8*/(@NotNull long[] $this$slice_u2dF7u83W8, @NotNull Iterable<Integer> indices) {
      Intrinsics.checkNotNullParameter($this$slice_u2dF7u83W8, "$this$slice");
      Intrinsics.checkNotNullParameter(indices, "indices");
      int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
      if (size == 0) {
         return CollectionsKt.emptyList();
      } else {
         ArrayList list = new ArrayList(size);
         Iterator var4 = indices.iterator();

         while(var4.hasNext()) {
            int index = ((Number)var4.next()).intValue();
            list.add(ULong.box-impl(ULongArray.get-s-VKNKU($this$slice_u2dF7u83W8, index)));
         }

         return (List)list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UByte> slice_JQknh5Q/* $FF was: slice-JQknh5Q*/(@NotNull byte[] $this$slice_u2dJQknh5Q, @NotNull Iterable<Integer> indices) {
      Intrinsics.checkNotNullParameter($this$slice_u2dJQknh5Q, "$this$slice");
      Intrinsics.checkNotNullParameter(indices, "indices");
      int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
      if (size == 0) {
         return CollectionsKt.emptyList();
      } else {
         ArrayList list = new ArrayList(size);
         Iterator var4 = indices.iterator();

         while(var4.hasNext()) {
            int index = ((Number)var4.next()).intValue();
            list.add(UByte.box-impl(UByteArray.get-w2LRezQ($this$slice_u2dJQknh5Q, index)));
         }

         return (List)list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UShort> slice_JGPC0_M/* $FF was: slice-JGPC0-M*/(@NotNull short[] $this$slice_u2dJGPC0_u2dM, @NotNull Iterable<Integer> indices) {
      Intrinsics.checkNotNullParameter($this$slice_u2dJGPC0_u2dM, "$this$slice");
      Intrinsics.checkNotNullParameter(indices, "indices");
      int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
      if (size == 0) {
         return CollectionsKt.emptyList();
      } else {
         ArrayList list = new ArrayList(size);
         Iterator var4 = indices.iterator();

         while(var4.hasNext()) {
            int index = ((Number)var4.next()).intValue();
            list.add(UShort.box-impl(UShortArray.get-Mh2AYeg($this$slice_u2dJGPC0_u2dM, index)));
         }

         return (List)list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final int[] sliceArray_CFIt9YE/* $FF was: sliceArray-CFIt9YE*/(@NotNull int[] $this$sliceArray_u2dCFIt9YE, @NotNull Collection<Integer> indices) {
      Intrinsics.checkNotNullParameter($this$sliceArray_u2dCFIt9YE, "$this$sliceArray");
      Intrinsics.checkNotNullParameter(indices, "indices");
      return UIntArray.constructor-impl(ArraysKt.sliceArray($this$sliceArray_u2dCFIt9YE, indices));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final long[] sliceArray_kzHmqpY/* $FF was: sliceArray-kzHmqpY*/(@NotNull long[] $this$sliceArray_u2dkzHmqpY, @NotNull Collection<Integer> indices) {
      Intrinsics.checkNotNullParameter($this$sliceArray_u2dkzHmqpY, "$this$sliceArray");
      Intrinsics.checkNotNullParameter(indices, "indices");
      return ULongArray.constructor-impl(ArraysKt.sliceArray($this$sliceArray_u2dkzHmqpY, indices));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final byte[] sliceArray_xo_DsdI/* $FF was: sliceArray-xo_DsdI*/(@NotNull byte[] $this$sliceArray_u2dxo_DsdI, @NotNull Collection<Integer> indices) {
      Intrinsics.checkNotNullParameter($this$sliceArray_u2dxo_DsdI, "$this$sliceArray");
      Intrinsics.checkNotNullParameter(indices, "indices");
      return UByteArray.constructor-impl(ArraysKt.sliceArray($this$sliceArray_u2dxo_DsdI, indices));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final short[] sliceArray_ojwP5H8/* $FF was: sliceArray-ojwP5H8*/(@NotNull short[] $this$sliceArray_u2dojwP5H8, @NotNull Collection<Integer> indices) {
      Intrinsics.checkNotNullParameter($this$sliceArray_u2dojwP5H8, "$this$sliceArray");
      Intrinsics.checkNotNullParameter(indices, "indices");
      return UShortArray.constructor-impl(ArraysKt.sliceArray($this$sliceArray_u2dojwP5H8, indices));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final int[] sliceArray_tAntMlw/* $FF was: sliceArray-tAntMlw*/(@NotNull int[] $this$sliceArray_u2dtAntMlw, @NotNull IntRange indices) {
      Intrinsics.checkNotNullParameter($this$sliceArray_u2dtAntMlw, "$this$sliceArray");
      Intrinsics.checkNotNullParameter(indices, "indices");
      return UIntArray.constructor-impl(ArraysKt.sliceArray($this$sliceArray_u2dtAntMlw, indices));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final long[] sliceArray_ZRhS8yI/* $FF was: sliceArray-ZRhS8yI*/(@NotNull long[] $this$sliceArray_u2dZRhS8yI, @NotNull IntRange indices) {
      Intrinsics.checkNotNullParameter($this$sliceArray_u2dZRhS8yI, "$this$sliceArray");
      Intrinsics.checkNotNullParameter(indices, "indices");
      return ULongArray.constructor-impl(ArraysKt.sliceArray($this$sliceArray_u2dZRhS8yI, indices));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final byte[] sliceArray_c0bezYM/* $FF was: sliceArray-c0bezYM*/(@NotNull byte[] $this$sliceArray_u2dc0bezYM, @NotNull IntRange indices) {
      Intrinsics.checkNotNullParameter($this$sliceArray_u2dc0bezYM, "$this$sliceArray");
      Intrinsics.checkNotNullParameter(indices, "indices");
      return UByteArray.constructor-impl(ArraysKt.sliceArray($this$sliceArray_u2dc0bezYM, indices));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final short[] sliceArray_Q6IL4kU/* $FF was: sliceArray-Q6IL4kU*/(@NotNull short[] $this$sliceArray_u2dQ6IL4kU, @NotNull IntRange indices) {
      Intrinsics.checkNotNullParameter($this$sliceArray_u2dQ6IL4kU, "$this$sliceArray");
      Intrinsics.checkNotNullParameter(indices, "indices");
      return UShortArray.constructor-impl(ArraysKt.sliceArray($this$sliceArray_u2dQ6IL4kU, indices));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UInt> take_qFRl0hI/* $FF was: take-qFRl0hI*/(@NotNull int[] $this$take_u2dqFRl0hI, int n) {
      Intrinsics.checkNotNullParameter($this$take_u2dqFRl0hI, "$this$take");
      if (n < 0) {
         int var7 = false;
         String var8 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var8.toString());
      } else if (n == 0) {
         return CollectionsKt.emptyList();
      } else if (n >= UIntArray.getSize-impl($this$take_u2dqFRl0hI)) {
         return CollectionsKt.toList((Iterable)UIntArray.box-impl($this$take_u2dqFRl0hI));
      } else if (n == 1) {
         return CollectionsKt.listOf(UInt.box-impl(UIntArray.get-pVg5ArA($this$take_u2dqFRl0hI, 0)));
      } else {
         int count = 0;
         ArrayList list = new ArrayList(n);
         int var4 = 0;

         for(int var5 = UIntArray.getSize-impl($this$take_u2dqFRl0hI); var4 < var5; ++var4) {
            int item = UIntArray.get-pVg5ArA($this$take_u2dqFRl0hI, var4);
            list.add(UInt.box-impl(item));
            ++count;
            if (count == n) {
               break;
            }
         }

         return (List)list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<ULong> take_r7IrZao/* $FF was: take-r7IrZao*/(@NotNull long[] $this$take_u2dr7IrZao, int n) {
      Intrinsics.checkNotNullParameter($this$take_u2dr7IrZao, "$this$take");
      if (n < 0) {
         int var8 = false;
         String var9 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var9.toString());
      } else if (n == 0) {
         return CollectionsKt.emptyList();
      } else if (n >= ULongArray.getSize-impl($this$take_u2dr7IrZao)) {
         return CollectionsKt.toList((Iterable)ULongArray.box-impl($this$take_u2dr7IrZao));
      } else if (n == 1) {
         return CollectionsKt.listOf(ULong.box-impl(ULongArray.get-s-VKNKU($this$take_u2dr7IrZao, 0)));
      } else {
         int count = 0;
         ArrayList list = new ArrayList(n);
         int var4 = 0;

         for(int var5 = ULongArray.getSize-impl($this$take_u2dr7IrZao); var4 < var5; ++var4) {
            long item = ULongArray.get-s-VKNKU($this$take_u2dr7IrZao, var4);
            list.add(ULong.box-impl(item));
            ++count;
            if (count == n) {
               break;
            }
         }

         return (List)list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UByte> take_PpDY95g/* $FF was: take-PpDY95g*/(@NotNull byte[] $this$take_u2dPpDY95g, int n) {
      Intrinsics.checkNotNullParameter($this$take_u2dPpDY95g, "$this$take");
      if (n < 0) {
         int var7 = false;
         String var8 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var8.toString());
      } else if (n == 0) {
         return CollectionsKt.emptyList();
      } else if (n >= UByteArray.getSize-impl($this$take_u2dPpDY95g)) {
         return CollectionsKt.toList((Iterable)UByteArray.box-impl($this$take_u2dPpDY95g));
      } else if (n == 1) {
         return CollectionsKt.listOf(UByte.box-impl(UByteArray.get-w2LRezQ($this$take_u2dPpDY95g, 0)));
      } else {
         int count = 0;
         ArrayList list = new ArrayList(n);
         int var4 = 0;

         for(int var5 = UByteArray.getSize-impl($this$take_u2dPpDY95g); var4 < var5; ++var4) {
            byte item = UByteArray.get-w2LRezQ($this$take_u2dPpDY95g, var4);
            list.add(UByte.box-impl(item));
            ++count;
            if (count == n) {
               break;
            }
         }

         return (List)list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UShort> take_nggk6HY/* $FF was: take-nggk6HY*/(@NotNull short[] $this$take_u2dnggk6HY, int n) {
      Intrinsics.checkNotNullParameter($this$take_u2dnggk6HY, "$this$take");
      if (n < 0) {
         int var7 = false;
         String var8 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var8.toString());
      } else if (n == 0) {
         return CollectionsKt.emptyList();
      } else if (n >= UShortArray.getSize-impl($this$take_u2dnggk6HY)) {
         return CollectionsKt.toList((Iterable)UShortArray.box-impl($this$take_u2dnggk6HY));
      } else if (n == 1) {
         return CollectionsKt.listOf(UShort.box-impl(UShortArray.get-Mh2AYeg($this$take_u2dnggk6HY, 0)));
      } else {
         int count = 0;
         ArrayList list = new ArrayList(n);
         int var4 = 0;

         for(int var5 = UShortArray.getSize-impl($this$take_u2dnggk6HY); var4 < var5; ++var4) {
            short item = UShortArray.get-Mh2AYeg($this$take_u2dnggk6HY, var4);
            list.add(UShort.box-impl(item));
            ++count;
            if (count == n) {
               break;
            }
         }

         return (List)list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UInt> takeLast_qFRl0hI/* $FF was: takeLast-qFRl0hI*/(@NotNull int[] $this$takeLast_u2dqFRl0hI, int n) {
      Intrinsics.checkNotNullParameter($this$takeLast_u2dqFRl0hI, "$this$takeLast");
      if (n < 0) {
         int var5 = false;
         String var6 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var6.toString());
      } else if (n == 0) {
         return CollectionsKt.emptyList();
      } else {
         int size = UIntArray.getSize-impl($this$takeLast_u2dqFRl0hI);
         if (n >= size) {
            return CollectionsKt.toList((Iterable)UIntArray.box-impl($this$takeLast_u2dqFRl0hI));
         } else if (n == 1) {
            return CollectionsKt.listOf(UInt.box-impl(UIntArray.get-pVg5ArA($this$takeLast_u2dqFRl0hI, size - 1)));
         } else {
            ArrayList list = new ArrayList(n);

            for(int index = size - n; index < size; ++index) {
               list.add(UInt.box-impl(UIntArray.get-pVg5ArA($this$takeLast_u2dqFRl0hI, index)));
            }

            return (List)list;
         }
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<ULong> takeLast_r7IrZao/* $FF was: takeLast-r7IrZao*/(@NotNull long[] $this$takeLast_u2dr7IrZao, int n) {
      Intrinsics.checkNotNullParameter($this$takeLast_u2dr7IrZao, "$this$takeLast");
      if (n < 0) {
         int var5 = false;
         String var6 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var6.toString());
      } else if (n == 0) {
         return CollectionsKt.emptyList();
      } else {
         int size = ULongArray.getSize-impl($this$takeLast_u2dr7IrZao);
         if (n >= size) {
            return CollectionsKt.toList((Iterable)ULongArray.box-impl($this$takeLast_u2dr7IrZao));
         } else if (n == 1) {
            return CollectionsKt.listOf(ULong.box-impl(ULongArray.get-s-VKNKU($this$takeLast_u2dr7IrZao, size - 1)));
         } else {
            ArrayList list = new ArrayList(n);

            for(int index = size - n; index < size; ++index) {
               list.add(ULong.box-impl(ULongArray.get-s-VKNKU($this$takeLast_u2dr7IrZao, index)));
            }

            return (List)list;
         }
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UByte> takeLast_PpDY95g/* $FF was: takeLast-PpDY95g*/(@NotNull byte[] $this$takeLast_u2dPpDY95g, int n) {
      Intrinsics.checkNotNullParameter($this$takeLast_u2dPpDY95g, "$this$takeLast");
      if (n < 0) {
         int var5 = false;
         String var6 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var6.toString());
      } else if (n == 0) {
         return CollectionsKt.emptyList();
      } else {
         int size = UByteArray.getSize-impl($this$takeLast_u2dPpDY95g);
         if (n >= size) {
            return CollectionsKt.toList((Iterable)UByteArray.box-impl($this$takeLast_u2dPpDY95g));
         } else if (n == 1) {
            return CollectionsKt.listOf(UByte.box-impl(UByteArray.get-w2LRezQ($this$takeLast_u2dPpDY95g, size - 1)));
         } else {
            ArrayList list = new ArrayList(n);

            for(int index = size - n; index < size; ++index) {
               list.add(UByte.box-impl(UByteArray.get-w2LRezQ($this$takeLast_u2dPpDY95g, index)));
            }

            return (List)list;
         }
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UShort> takeLast_nggk6HY/* $FF was: takeLast-nggk6HY*/(@NotNull short[] $this$takeLast_u2dnggk6HY, int n) {
      Intrinsics.checkNotNullParameter($this$takeLast_u2dnggk6HY, "$this$takeLast");
      if (n < 0) {
         int var5 = false;
         String var6 = "Requested element count " + n + " is less than zero.";
         throw new IllegalArgumentException(var6.toString());
      } else if (n == 0) {
         return CollectionsKt.emptyList();
      } else {
         int size = UShortArray.getSize-impl($this$takeLast_u2dnggk6HY);
         if (n >= size) {
            return CollectionsKt.toList((Iterable)UShortArray.box-impl($this$takeLast_u2dnggk6HY));
         } else if (n == 1) {
            return CollectionsKt.listOf(UShort.box-impl(UShortArray.get-Mh2AYeg($this$takeLast_u2dnggk6HY, size - 1)));
         } else {
            ArrayList list = new ArrayList(n);

            for(int index = size - n; index < size; ++index) {
               list.add(UShort.box-impl(UShortArray.get-Mh2AYeg($this$takeLast_u2dnggk6HY, index)));
            }

            return (List)list;
         }
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UInt> takeLastWhile_jgv0xPQ/* $FF was: takeLastWhile-jgv0xPQ*/(int[] $this$takeLastWhile_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeLastWhile_u2djgv0xPQ, "$this$takeLastWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var4 = false;

      for(int index = ArraysKt.getLastIndex($this$takeLastWhile_u2djgv0xPQ); -1 < index; --index) {
         if (!(Boolean)predicate.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$takeLastWhile_u2djgv0xPQ, index)))) {
            return UArraysKt.drop-qFRl0hI($this$takeLastWhile_u2djgv0xPQ, index + 1);
         }
      }

      return CollectionsKt.toList((Iterable)UIntArray.box-impl($this$takeLastWhile_u2djgv0xPQ));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<ULong> takeLastWhile_MShoTSo/* $FF was: takeLastWhile-MShoTSo*/(long[] $this$takeLastWhile_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeLastWhile_u2dMShoTSo, "$this$takeLastWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var4 = false;

      for(int index = ArraysKt.getLastIndex($this$takeLastWhile_u2dMShoTSo); -1 < index; --index) {
         if (!(Boolean)predicate.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$takeLastWhile_u2dMShoTSo, index)))) {
            return UArraysKt.drop-r7IrZao($this$takeLastWhile_u2dMShoTSo, index + 1);
         }
      }

      return CollectionsKt.toList((Iterable)ULongArray.box-impl($this$takeLastWhile_u2dMShoTSo));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UByte> takeLastWhile_JOV_ifY/* $FF was: takeLastWhile-JOV_ifY*/(byte[] $this$takeLastWhile_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeLastWhile_u2dJOV_ifY, "$this$takeLastWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var4 = false;

      for(int index = ArraysKt.getLastIndex($this$takeLastWhile_u2dJOV_ifY); -1 < index; --index) {
         if (!(Boolean)predicate.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$takeLastWhile_u2dJOV_ifY, index)))) {
            return UArraysKt.drop-PpDY95g($this$takeLastWhile_u2dJOV_ifY, index + 1);
         }
      }

      return CollectionsKt.toList((Iterable)UByteArray.box-impl($this$takeLastWhile_u2dJOV_ifY));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UShort> takeLastWhile_xTcfx_M/* $FF was: takeLastWhile-xTcfx_M*/(short[] $this$takeLastWhile_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeLastWhile_u2dxTcfx_M, "$this$takeLastWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var4 = false;

      for(int index = ArraysKt.getLastIndex($this$takeLastWhile_u2dxTcfx_M); -1 < index; --index) {
         if (!(Boolean)predicate.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$takeLastWhile_u2dxTcfx_M, index)))) {
            return UArraysKt.drop-nggk6HY($this$takeLastWhile_u2dxTcfx_M, index + 1);
         }
      }

      return CollectionsKt.toList((Iterable)UShortArray.box-impl($this$takeLastWhile_u2dxTcfx_M));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UInt> takeWhile_jgv0xPQ/* $FF was: takeWhile-jgv0xPQ*/(int[] $this$takeWhile_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeWhile_u2djgv0xPQ, "$this$takeWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      ArrayList list = new ArrayList();
      int var3 = 0;

      for(int var4 = UIntArray.getSize-impl($this$takeWhile_u2djgv0xPQ); var3 < var4; ++var3) {
         int item = UIntArray.get-pVg5ArA($this$takeWhile_u2djgv0xPQ, var3);
         if (!(Boolean)predicate.invoke(UInt.box-impl(item))) {
            break;
         }

         list.add(UInt.box-impl(item));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<ULong> takeWhile_MShoTSo/* $FF was: takeWhile-MShoTSo*/(long[] $this$takeWhile_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeWhile_u2dMShoTSo, "$this$takeWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      ArrayList list = new ArrayList();
      int var3 = 0;

      for(int var4 = ULongArray.getSize-impl($this$takeWhile_u2dMShoTSo); var3 < var4; ++var3) {
         long item = ULongArray.get-s-VKNKU($this$takeWhile_u2dMShoTSo, var3);
         if (!(Boolean)predicate.invoke(ULong.box-impl(item))) {
            break;
         }

         list.add(ULong.box-impl(item));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UByte> takeWhile_JOV_ifY/* $FF was: takeWhile-JOV_ifY*/(byte[] $this$takeWhile_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeWhile_u2dJOV_ifY, "$this$takeWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      ArrayList list = new ArrayList();
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$takeWhile_u2dJOV_ifY); var3 < var4; ++var3) {
         byte item = UByteArray.get-w2LRezQ($this$takeWhile_u2dJOV_ifY, var3);
         if (!(Boolean)predicate.invoke(UByte.box-impl(item))) {
            break;
         }

         list.add(UByte.box-impl(item));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UShort> takeWhile_xTcfx_M/* $FF was: takeWhile-xTcfx_M*/(short[] $this$takeWhile_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$takeWhile_u2dxTcfx_M, "$this$takeWhile");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      ArrayList list = new ArrayList();
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$takeWhile_u2dxTcfx_M); var3 < var4; ++var3) {
         short item = UShortArray.get-Mh2AYeg($this$takeWhile_u2dxTcfx_M, var3);
         if (!(Boolean)predicate.invoke(UShort.box-impl(item))) {
            break;
         }

         list.add(UShort.box-impl(item));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void reverse__ajY_9A/* $FF was: reverse--ajY-9A*/(int[] $this$reverse_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$reverse_u2d_u2dajY_u2d9A, "$this$reverse");
      ArraysKt.reverse($this$reverse_u2d_u2dajY_u2d9A);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void reverse_QwZRm1k/* $FF was: reverse-QwZRm1k*/(long[] $this$reverse_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$reverse_u2dQwZRm1k, "$this$reverse");
      ArraysKt.reverse($this$reverse_u2dQwZRm1k);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void reverse_GBYM_sE/* $FF was: reverse-GBYM_sE*/(byte[] $this$reverse_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$reverse_u2dGBYM_sE, "$this$reverse");
      ArraysKt.reverse($this$reverse_u2dGBYM_sE);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void reverse_rL5Bavg/* $FF was: reverse-rL5Bavg*/(short[] $this$reverse_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$reverse_u2drL5Bavg, "$this$reverse");
      ArraysKt.reverse($this$reverse_u2drL5Bavg);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void reverse_oBK06Vg/* $FF was: reverse-oBK06Vg*/(int[] $this$reverse_u2doBK06Vg, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$reverse_u2doBK06Vg, "$this$reverse");
      ArraysKt.reverse($this$reverse_u2doBK06Vg, fromIndex, toIndex);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void reverse__nroSd4/* $FF was: reverse--nroSd4*/(long[] $this$reverse_u2d_u2dnroSd4, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$reverse_u2d_u2dnroSd4, "$this$reverse");
      ArraysKt.reverse($this$reverse_u2d_u2dnroSd4, fromIndex, toIndex);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void reverse_4UcCI2c/* $FF was: reverse-4UcCI2c*/(byte[] $this$reverse_u2d4UcCI2c, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$reverse_u2d4UcCI2c, "$this$reverse");
      ArraysKt.reverse($this$reverse_u2d4UcCI2c, fromIndex, toIndex);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void reverse_Aa5vz7o/* $FF was: reverse-Aa5vz7o*/(short[] $this$reverse_u2dAa5vz7o, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$reverse_u2dAa5vz7o, "$this$reverse");
      ArraysKt.reverse($this$reverse_u2dAa5vz7o, fromIndex, toIndex);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UInt> reversed__ajY_9A/* $FF was: reversed--ajY-9A*/(@NotNull int[] $this$reversed_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$reversed_u2d_u2dajY_u2d9A, "$this$reversed");
      if (UIntArray.isEmpty-impl($this$reversed_u2d_u2dajY_u2d9A)) {
         return CollectionsKt.emptyList();
      } else {
         List list = CollectionsKt.toMutableList((Collection)UIntArray.box-impl($this$reversed_u2d_u2dajY_u2d9A));
         CollectionsKt.reverse(list);
         return list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<ULong> reversed_QwZRm1k/* $FF was: reversed-QwZRm1k*/(@NotNull long[] $this$reversed_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$reversed_u2dQwZRm1k, "$this$reversed");
      if (ULongArray.isEmpty-impl($this$reversed_u2dQwZRm1k)) {
         return CollectionsKt.emptyList();
      } else {
         List list = CollectionsKt.toMutableList((Collection)ULongArray.box-impl($this$reversed_u2dQwZRm1k));
         CollectionsKt.reverse(list);
         return list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UByte> reversed_GBYM_sE/* $FF was: reversed-GBYM_sE*/(@NotNull byte[] $this$reversed_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$reversed_u2dGBYM_sE, "$this$reversed");
      if (UByteArray.isEmpty-impl($this$reversed_u2dGBYM_sE)) {
         return CollectionsKt.emptyList();
      } else {
         List list = CollectionsKt.toMutableList((Collection)UByteArray.box-impl($this$reversed_u2dGBYM_sE));
         CollectionsKt.reverse(list);
         return list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UShort> reversed_rL5Bavg/* $FF was: reversed-rL5Bavg*/(@NotNull short[] $this$reversed_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$reversed_u2drL5Bavg, "$this$reversed");
      if (UShortArray.isEmpty-impl($this$reversed_u2drL5Bavg)) {
         return CollectionsKt.emptyList();
      } else {
         List list = CollectionsKt.toMutableList((Collection)UShortArray.box-impl($this$reversed_u2drL5Bavg));
         CollectionsKt.reverse(list);
         return list;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] reversedArray__ajY_9A/* $FF was: reversedArray--ajY-9A*/(int[] $this$reversedArray_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$reversedArray_u2d_u2dajY_u2d9A, "$this$reversedArray");
      return UIntArray.constructor-impl(ArraysKt.reversedArray($this$reversedArray_u2d_u2dajY_u2d9A));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] reversedArray_QwZRm1k/* $FF was: reversedArray-QwZRm1k*/(long[] $this$reversedArray_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$reversedArray_u2dQwZRm1k, "$this$reversedArray");
      return ULongArray.constructor-impl(ArraysKt.reversedArray($this$reversedArray_u2dQwZRm1k));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] reversedArray_GBYM_sE/* $FF was: reversedArray-GBYM_sE*/(byte[] $this$reversedArray_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$reversedArray_u2dGBYM_sE, "$this$reversedArray");
      return UByteArray.constructor-impl(ArraysKt.reversedArray($this$reversedArray_u2dGBYM_sE));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] reversedArray_rL5Bavg/* $FF was: reversedArray-rL5Bavg*/(short[] $this$reversedArray_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$reversedArray_u2drL5Bavg, "$this$reversedArray");
      return UShortArray.constructor-impl(ArraysKt.reversedArray($this$reversedArray_u2drL5Bavg));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void shuffle__ajY_9A/* $FF was: shuffle--ajY-9A*/(@NotNull int[] $this$shuffle_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$shuffle_u2d_u2dajY_u2d9A, "$this$shuffle");
      UArraysKt.shuffle-2D5oskM($this$shuffle_u2d_u2dajY_u2d9A, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void shuffle_QwZRm1k/* $FF was: shuffle-QwZRm1k*/(@NotNull long[] $this$shuffle_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$shuffle_u2dQwZRm1k, "$this$shuffle");
      UArraysKt.shuffle-JzugnMA($this$shuffle_u2dQwZRm1k, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void shuffle_GBYM_sE/* $FF was: shuffle-GBYM_sE*/(@NotNull byte[] $this$shuffle_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$shuffle_u2dGBYM_sE, "$this$shuffle");
      UArraysKt.shuffle-oSF2wD8($this$shuffle_u2dGBYM_sE, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void shuffle_rL5Bavg/* $FF was: shuffle-rL5Bavg*/(@NotNull short[] $this$shuffle_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$shuffle_u2drL5Bavg, "$this$shuffle");
      UArraysKt.shuffle-s5X_as8($this$shuffle_u2drL5Bavg, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void shuffle_2D5oskM/* $FF was: shuffle-2D5oskM*/(@NotNull int[] $this$shuffle_u2d2D5oskM, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$shuffle_u2d2D5oskM, "$this$shuffle");
      Intrinsics.checkNotNullParameter(random, "random");
      int var4 = false;

      for(int i = ArraysKt.getLastIndex($this$shuffle_u2d2D5oskM); 0 < i; --i) {
         int j = random.nextInt(i + 1);
         int copy = UIntArray.get-pVg5ArA($this$shuffle_u2d2D5oskM, i);
         UIntArray.set-VXSXFK8($this$shuffle_u2d2D5oskM, i, UIntArray.get-pVg5ArA($this$shuffle_u2d2D5oskM, j));
         UIntArray.set-VXSXFK8($this$shuffle_u2d2D5oskM, j, copy);
      }

   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void shuffle_JzugnMA/* $FF was: shuffle-JzugnMA*/(@NotNull long[] $this$shuffle_u2dJzugnMA, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$shuffle_u2dJzugnMA, "$this$shuffle");
      Intrinsics.checkNotNullParameter(random, "random");
      int var4 = false;

      for(int i = ArraysKt.getLastIndex($this$shuffle_u2dJzugnMA); 0 < i; --i) {
         int j = random.nextInt(i + 1);
         long copy = ULongArray.get-s-VKNKU($this$shuffle_u2dJzugnMA, i);
         ULongArray.set-k8EXiF4($this$shuffle_u2dJzugnMA, i, ULongArray.get-s-VKNKU($this$shuffle_u2dJzugnMA, j));
         ULongArray.set-k8EXiF4($this$shuffle_u2dJzugnMA, j, copy);
      }

   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void shuffle_oSF2wD8/* $FF was: shuffle-oSF2wD8*/(@NotNull byte[] $this$shuffle_u2doSF2wD8, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$shuffle_u2doSF2wD8, "$this$shuffle");
      Intrinsics.checkNotNullParameter(random, "random");
      int var4 = false;

      for(int i = ArraysKt.getLastIndex($this$shuffle_u2doSF2wD8); 0 < i; --i) {
         int j = random.nextInt(i + 1);
         byte copy = UByteArray.get-w2LRezQ($this$shuffle_u2doSF2wD8, i);
         UByteArray.set-VurrAj0($this$shuffle_u2doSF2wD8, i, UByteArray.get-w2LRezQ($this$shuffle_u2doSF2wD8, j));
         UByteArray.set-VurrAj0($this$shuffle_u2doSF2wD8, j, copy);
      }

   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void shuffle_s5X_as8/* $FF was: shuffle-s5X_as8*/(@NotNull short[] $this$shuffle_u2ds5X_as8, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$shuffle_u2ds5X_as8, "$this$shuffle");
      Intrinsics.checkNotNullParameter(random, "random");
      int var4 = false;

      for(int i = ArraysKt.getLastIndex($this$shuffle_u2ds5X_as8); 0 < i; --i) {
         int j = random.nextInt(i + 1);
         short copy = UShortArray.get-Mh2AYeg($this$shuffle_u2ds5X_as8, i);
         UShortArray.set-01HTLdE($this$shuffle_u2ds5X_as8, i, UShortArray.get-Mh2AYeg($this$shuffle_u2ds5X_as8, j));
         UShortArray.set-01HTLdE($this$shuffle_u2ds5X_as8, j, copy);
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final void sortDescending__ajY_9A/* $FF was: sortDescending--ajY-9A*/(@NotNull int[] $this$sortDescending_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$sortDescending_u2d_u2dajY_u2d9A, "$this$sortDescending");
      if (UIntArray.getSize-impl($this$sortDescending_u2d_u2dajY_u2d9A) > 1) {
         UArraysKt.sort--ajY-9A($this$sortDescending_u2d_u2dajY_u2d9A);
         ArraysKt.reverse($this$sortDescending_u2d_u2dajY_u2d9A);
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final void sortDescending_QwZRm1k/* $FF was: sortDescending-QwZRm1k*/(@NotNull long[] $this$sortDescending_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$sortDescending_u2dQwZRm1k, "$this$sortDescending");
      if (ULongArray.getSize-impl($this$sortDescending_u2dQwZRm1k) > 1) {
         UArraysKt.sort-QwZRm1k($this$sortDescending_u2dQwZRm1k);
         ArraysKt.reverse($this$sortDescending_u2dQwZRm1k);
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final void sortDescending_GBYM_sE/* $FF was: sortDescending-GBYM_sE*/(@NotNull byte[] $this$sortDescending_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$sortDescending_u2dGBYM_sE, "$this$sortDescending");
      if (UByteArray.getSize-impl($this$sortDescending_u2dGBYM_sE) > 1) {
         UArraysKt.sort-GBYM_sE($this$sortDescending_u2dGBYM_sE);
         ArraysKt.reverse($this$sortDescending_u2dGBYM_sE);
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final void sortDescending_rL5Bavg/* $FF was: sortDescending-rL5Bavg*/(@NotNull short[] $this$sortDescending_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$sortDescending_u2drL5Bavg, "$this$sortDescending");
      if (UShortArray.getSize-impl($this$sortDescending_u2drL5Bavg) > 1) {
         UArraysKt.sort-rL5Bavg($this$sortDescending_u2drL5Bavg);
         ArraysKt.reverse($this$sortDescending_u2drL5Bavg);
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UInt> sorted__ajY_9A/* $FF was: sorted--ajY-9A*/(@NotNull int[] $this$sorted_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$sorted_u2d_u2dajY_u2d9A, "$this$sorted");
      int[] var10000 = Arrays.copyOf($this$sorted_u2d_u2dajY_u2d9A, $this$sorted_u2d_u2dajY_u2d9A.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      int[] var1 = UIntArray.constructor-impl(var10000);
      int var3 = false;
      UArraysKt.sort--ajY-9A(var1);
      return UArraysKt.asList--ajY-9A(var1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<ULong> sorted_QwZRm1k/* $FF was: sorted-QwZRm1k*/(@NotNull long[] $this$sorted_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$sorted_u2dQwZRm1k, "$this$sorted");
      long[] var10000 = Arrays.copyOf($this$sorted_u2dQwZRm1k, $this$sorted_u2dQwZRm1k.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      long[] var1 = ULongArray.constructor-impl(var10000);
      int var3 = false;
      UArraysKt.sort-QwZRm1k(var1);
      return UArraysKt.asList-QwZRm1k(var1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UByte> sorted_GBYM_sE/* $FF was: sorted-GBYM_sE*/(@NotNull byte[] $this$sorted_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$sorted_u2dGBYM_sE, "$this$sorted");
      byte[] var10000 = Arrays.copyOf($this$sorted_u2dGBYM_sE, $this$sorted_u2dGBYM_sE.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      byte[] var1 = UByteArray.constructor-impl(var10000);
      int var3 = false;
      UArraysKt.sort-GBYM_sE(var1);
      return UArraysKt.asList-GBYM_sE(var1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UShort> sorted_rL5Bavg/* $FF was: sorted-rL5Bavg*/(@NotNull short[] $this$sorted_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$sorted_u2drL5Bavg, "$this$sorted");
      short[] var10000 = Arrays.copyOf($this$sorted_u2drL5Bavg, $this$sorted_u2drL5Bavg.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      short[] var1 = UShortArray.constructor-impl(var10000);
      int var3 = false;
      UArraysKt.sort-rL5Bavg(var1);
      return UArraysKt.asList-rL5Bavg(var1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final int[] sortedArray__ajY_9A/* $FF was: sortedArray--ajY-9A*/(@NotNull int[] $this$sortedArray_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$sortedArray_u2d_u2dajY_u2d9A, "$this$sortedArray");
      if (UIntArray.isEmpty-impl($this$sortedArray_u2d_u2dajY_u2d9A)) {
         return $this$sortedArray_u2d_u2dajY_u2d9A;
      } else {
         int[] var10000 = Arrays.copyOf($this$sortedArray_u2d_u2dajY_u2d9A, $this$sortedArray_u2d_u2dajY_u2d9A.length);
         Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
         int[] var1 = UIntArray.constructor-impl(var10000);
         int var3 = false;
         UArraysKt.sort--ajY-9A(var1);
         return var1;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final long[] sortedArray_QwZRm1k/* $FF was: sortedArray-QwZRm1k*/(@NotNull long[] $this$sortedArray_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$sortedArray_u2dQwZRm1k, "$this$sortedArray");
      if (ULongArray.isEmpty-impl($this$sortedArray_u2dQwZRm1k)) {
         return $this$sortedArray_u2dQwZRm1k;
      } else {
         long[] var10000 = Arrays.copyOf($this$sortedArray_u2dQwZRm1k, $this$sortedArray_u2dQwZRm1k.length);
         Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
         long[] var1 = ULongArray.constructor-impl(var10000);
         int var3 = false;
         UArraysKt.sort-QwZRm1k(var1);
         return var1;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final byte[] sortedArray_GBYM_sE/* $FF was: sortedArray-GBYM_sE*/(@NotNull byte[] $this$sortedArray_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$sortedArray_u2dGBYM_sE, "$this$sortedArray");
      if (UByteArray.isEmpty-impl($this$sortedArray_u2dGBYM_sE)) {
         return $this$sortedArray_u2dGBYM_sE;
      } else {
         byte[] var10000 = Arrays.copyOf($this$sortedArray_u2dGBYM_sE, $this$sortedArray_u2dGBYM_sE.length);
         Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
         byte[] var1 = UByteArray.constructor-impl(var10000);
         int var3 = false;
         UArraysKt.sort-GBYM_sE(var1);
         return var1;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final short[] sortedArray_rL5Bavg/* $FF was: sortedArray-rL5Bavg*/(@NotNull short[] $this$sortedArray_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$sortedArray_u2drL5Bavg, "$this$sortedArray");
      if (UShortArray.isEmpty-impl($this$sortedArray_u2drL5Bavg)) {
         return $this$sortedArray_u2drL5Bavg;
      } else {
         short[] var10000 = Arrays.copyOf($this$sortedArray_u2drL5Bavg, $this$sortedArray_u2drL5Bavg.length);
         Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
         short[] var1 = UShortArray.constructor-impl(var10000);
         int var3 = false;
         UArraysKt.sort-rL5Bavg(var1);
         return var1;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final int[] sortedArrayDescending__ajY_9A/* $FF was: sortedArrayDescending--ajY-9A*/(@NotNull int[] $this$sortedArrayDescending_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$sortedArrayDescending_u2d_u2dajY_u2d9A, "$this$sortedArrayDescending");
      if (UIntArray.isEmpty-impl($this$sortedArrayDescending_u2d_u2dajY_u2d9A)) {
         return $this$sortedArrayDescending_u2d_u2dajY_u2d9A;
      } else {
         int[] var10000 = Arrays.copyOf($this$sortedArrayDescending_u2d_u2dajY_u2d9A, $this$sortedArrayDescending_u2d_u2dajY_u2d9A.length);
         Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
         int[] var1 = UIntArray.constructor-impl(var10000);
         int var3 = false;
         UArraysKt.sortDescending--ajY-9A(var1);
         return var1;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final long[] sortedArrayDescending_QwZRm1k/* $FF was: sortedArrayDescending-QwZRm1k*/(@NotNull long[] $this$sortedArrayDescending_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$sortedArrayDescending_u2dQwZRm1k, "$this$sortedArrayDescending");
      if (ULongArray.isEmpty-impl($this$sortedArrayDescending_u2dQwZRm1k)) {
         return $this$sortedArrayDescending_u2dQwZRm1k;
      } else {
         long[] var10000 = Arrays.copyOf($this$sortedArrayDescending_u2dQwZRm1k, $this$sortedArrayDescending_u2dQwZRm1k.length);
         Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
         long[] var1 = ULongArray.constructor-impl(var10000);
         int var3 = false;
         UArraysKt.sortDescending-QwZRm1k(var1);
         return var1;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final byte[] sortedArrayDescending_GBYM_sE/* $FF was: sortedArrayDescending-GBYM_sE*/(@NotNull byte[] $this$sortedArrayDescending_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$sortedArrayDescending_u2dGBYM_sE, "$this$sortedArrayDescending");
      if (UByteArray.isEmpty-impl($this$sortedArrayDescending_u2dGBYM_sE)) {
         return $this$sortedArrayDescending_u2dGBYM_sE;
      } else {
         byte[] var10000 = Arrays.copyOf($this$sortedArrayDescending_u2dGBYM_sE, $this$sortedArrayDescending_u2dGBYM_sE.length);
         Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
         byte[] var1 = UByteArray.constructor-impl(var10000);
         int var3 = false;
         UArraysKt.sortDescending-GBYM_sE(var1);
         return var1;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final short[] sortedArrayDescending_rL5Bavg/* $FF was: sortedArrayDescending-rL5Bavg*/(@NotNull short[] $this$sortedArrayDescending_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$sortedArrayDescending_u2drL5Bavg, "$this$sortedArrayDescending");
      if (UShortArray.isEmpty-impl($this$sortedArrayDescending_u2drL5Bavg)) {
         return $this$sortedArrayDescending_u2drL5Bavg;
      } else {
         short[] var10000 = Arrays.copyOf($this$sortedArrayDescending_u2drL5Bavg, $this$sortedArrayDescending_u2drL5Bavg.length);
         Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
         short[] var1 = UShortArray.constructor-impl(var10000);
         int var3 = false;
         UArraysKt.sortDescending-rL5Bavg(var1);
         return var1;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UInt> sortedDescending__ajY_9A/* $FF was: sortedDescending--ajY-9A*/(@NotNull int[] $this$sortedDescending_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$sortedDescending_u2d_u2dajY_u2d9A, "$this$sortedDescending");
      int[] var10000 = Arrays.copyOf($this$sortedDescending_u2d_u2dajY_u2d9A, $this$sortedDescending_u2d_u2dajY_u2d9A.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      int[] var1 = UIntArray.constructor-impl(var10000);
      int var3 = false;
      UArraysKt.sort--ajY-9A(var1);
      return UArraysKt.reversed--ajY-9A(var1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<ULong> sortedDescending_QwZRm1k/* $FF was: sortedDescending-QwZRm1k*/(@NotNull long[] $this$sortedDescending_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$sortedDescending_u2dQwZRm1k, "$this$sortedDescending");
      long[] var10000 = Arrays.copyOf($this$sortedDescending_u2dQwZRm1k, $this$sortedDescending_u2dQwZRm1k.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      long[] var1 = ULongArray.constructor-impl(var10000);
      int var3 = false;
      UArraysKt.sort-QwZRm1k(var1);
      return UArraysKt.reversed-QwZRm1k(var1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UByte> sortedDescending_GBYM_sE/* $FF was: sortedDescending-GBYM_sE*/(@NotNull byte[] $this$sortedDescending_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$sortedDescending_u2dGBYM_sE, "$this$sortedDescending");
      byte[] var10000 = Arrays.copyOf($this$sortedDescending_u2dGBYM_sE, $this$sortedDescending_u2dGBYM_sE.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      byte[] var1 = UByteArray.constructor-impl(var10000);
      int var3 = false;
      UArraysKt.sort-GBYM_sE(var1);
      return UArraysKt.reversed-GBYM_sE(var1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<UShort> sortedDescending_rL5Bavg/* $FF was: sortedDescending-rL5Bavg*/(@NotNull short[] $this$sortedDescending_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$sortedDescending_u2drL5Bavg, "$this$sortedDescending");
      short[] var10000 = Arrays.copyOf($this$sortedDescending_u2drL5Bavg, $this$sortedDescending_u2drL5Bavg.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      short[] var1 = UShortArray.constructor-impl(var10000);
      int var3 = false;
      UArraysKt.sort-rL5Bavg(var1);
      return UArraysKt.reversed-rL5Bavg(var1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] asByteArray_GBYM_sE/* $FF was: asByteArray-GBYM_sE*/(byte[] $this$asByteArray_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$asByteArray_u2dGBYM_sE, "$this$asByteArray");
      return $this$asByteArray_u2dGBYM_sE;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] asIntArray__ajY_9A/* $FF was: asIntArray--ajY-9A*/(int[] $this$asIntArray_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$asIntArray_u2d_u2dajY_u2d9A, "$this$asIntArray");
      return $this$asIntArray_u2d_u2dajY_u2d9A;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] asLongArray_QwZRm1k/* $FF was: asLongArray-QwZRm1k*/(long[] $this$asLongArray_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$asLongArray_u2dQwZRm1k, "$this$asLongArray");
      return $this$asLongArray_u2dQwZRm1k;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] asShortArray_rL5Bavg/* $FF was: asShortArray-rL5Bavg*/(short[] $this$asShortArray_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$asShortArray_u2drL5Bavg, "$this$asShortArray");
      return $this$asShortArray_u2drL5Bavg;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] asUByteArray(byte[] $this$asUByteArray) {
      Intrinsics.checkNotNullParameter($this$asUByteArray, "<this>");
      return UByteArray.constructor-impl($this$asUByteArray);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] asUIntArray(int[] $this$asUIntArray) {
      Intrinsics.checkNotNullParameter($this$asUIntArray, "<this>");
      return UIntArray.constructor-impl($this$asUIntArray);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] asULongArray(long[] $this$asULongArray) {
      Intrinsics.checkNotNullParameter($this$asULongArray, "<this>");
      return ULongArray.constructor-impl($this$asULongArray);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] asUShortArray(short[] $this$asUShortArray) {
      Intrinsics.checkNotNullParameter($this$asUShortArray, "<this>");
      return UShortArray.constructor-impl($this$asUShortArray);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final boolean contentEquals_KJPZfPQ/* $FF was: contentEquals-KJPZfPQ*/(@Nullable int[] $this$contentEquals_u2dKJPZfPQ, @Nullable int[] other) {
      int[] var10000 = $this$contentEquals_u2dKJPZfPQ;
      if ($this$contentEquals_u2dKJPZfPQ == null) {
         var10000 = null;
      }

      int[] var10001 = other;
      if (other == null) {
         var10001 = null;
      }

      return Arrays.equals(var10000, var10001);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final boolean contentEquals_lec5QzE/* $FF was: contentEquals-lec5QzE*/(@Nullable long[] $this$contentEquals_u2dlec5QzE, @Nullable long[] other) {
      long[] var10000 = $this$contentEquals_u2dlec5QzE;
      if ($this$contentEquals_u2dlec5QzE == null) {
         var10000 = null;
      }

      long[] var10001 = other;
      if (other == null) {
         var10001 = null;
      }

      return Arrays.equals(var10000, var10001);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final boolean contentEquals_kV0jMPg/* $FF was: contentEquals-kV0jMPg*/(@Nullable byte[] $this$contentEquals_u2dkV0jMPg, @Nullable byte[] other) {
      byte[] var10000 = $this$contentEquals_u2dkV0jMPg;
      if ($this$contentEquals_u2dkV0jMPg == null) {
         var10000 = null;
      }

      byte[] var10001 = other;
      if (other == null) {
         var10001 = null;
      }

      return Arrays.equals(var10000, var10001);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final boolean contentEquals_FGO6Aew/* $FF was: contentEquals-FGO6Aew*/(@Nullable short[] $this$contentEquals_u2dFGO6Aew, @Nullable short[] other) {
      short[] var10000 = $this$contentEquals_u2dFGO6Aew;
      if ($this$contentEquals_u2dFGO6Aew == null) {
         var10000 = null;
      }

      short[] var10001 = other;
      if (other == null) {
         var10001 = null;
      }

      return Arrays.equals(var10000, var10001);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final int contentHashCode_XUkPCBk/* $FF was: contentHashCode-XUkPCBk*/(@Nullable int[] $this$contentHashCode_u2dXUkPCBk) {
      int[] var10000 = $this$contentHashCode_u2dXUkPCBk;
      if ($this$contentHashCode_u2dXUkPCBk == null) {
         var10000 = null;
      }

      return Arrays.hashCode(var10000);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final int contentHashCode_uLth9ew/* $FF was: contentHashCode-uLth9ew*/(@Nullable long[] $this$contentHashCode_u2duLth9ew) {
      long[] var10000 = $this$contentHashCode_u2duLth9ew;
      if ($this$contentHashCode_u2duLth9ew == null) {
         var10000 = null;
      }

      return Arrays.hashCode(var10000);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final int contentHashCode_2csIQuQ/* $FF was: contentHashCode-2csIQuQ*/(@Nullable byte[] $this$contentHashCode_u2d2csIQuQ) {
      byte[] var10000 = $this$contentHashCode_u2d2csIQuQ;
      if ($this$contentHashCode_u2d2csIQuQ == null) {
         var10000 = null;
      }

      return Arrays.hashCode(var10000);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final int contentHashCode_d_6D3K8/* $FF was: contentHashCode-d-6D3K8*/(@Nullable short[] $this$contentHashCode_u2dd_u2d6D3K8) {
      short[] var10000 = $this$contentHashCode_u2dd_u2d6D3K8;
      if ($this$contentHashCode_u2dd_u2d6D3K8 == null) {
         var10000 = null;
      }

      return Arrays.hashCode(var10000);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final String contentToString_XUkPCBk/* $FF was: contentToString-XUkPCBk*/(@Nullable int[] $this$contentToString_u2dXUkPCBk) {
      String var10000;
      if ($this$contentToString_u2dXUkPCBk != null) {
         var10000 = CollectionsKt.joinToString$default((Iterable)UIntArray.box-impl($this$contentToString_u2dXUkPCBk), (CharSequence)", ", (CharSequence)"[", (CharSequence)"]", 0, (CharSequence)null, (Function1)null, 56, (Object)null);
         if (var10000 != null) {
            return var10000;
         }
      }

      var10000 = "null";
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final String contentToString_uLth9ew/* $FF was: contentToString-uLth9ew*/(@Nullable long[] $this$contentToString_u2duLth9ew) {
      String var10000;
      if ($this$contentToString_u2duLth9ew != null) {
         var10000 = CollectionsKt.joinToString$default((Iterable)ULongArray.box-impl($this$contentToString_u2duLth9ew), (CharSequence)", ", (CharSequence)"[", (CharSequence)"]", 0, (CharSequence)null, (Function1)null, 56, (Object)null);
         if (var10000 != null) {
            return var10000;
         }
      }

      var10000 = "null";
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final String contentToString_2csIQuQ/* $FF was: contentToString-2csIQuQ*/(@Nullable byte[] $this$contentToString_u2d2csIQuQ) {
      String var10000;
      if ($this$contentToString_u2d2csIQuQ != null) {
         var10000 = CollectionsKt.joinToString$default((Iterable)UByteArray.box-impl($this$contentToString_u2d2csIQuQ), (CharSequence)", ", (CharSequence)"[", (CharSequence)"]", 0, (CharSequence)null, (Function1)null, 56, (Object)null);
         if (var10000 != null) {
            return var10000;
         }
      }

      var10000 = "null";
      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final String contentToString_d_6D3K8/* $FF was: contentToString-d-6D3K8*/(@Nullable short[] $this$contentToString_u2dd_u2d6D3K8) {
      String var10000;
      if ($this$contentToString_u2dd_u2d6D3K8 != null) {
         var10000 = CollectionsKt.joinToString$default((Iterable)UShortArray.box-impl($this$contentToString_u2dd_u2d6D3K8), (CharSequence)", ", (CharSequence)"[", (CharSequence)"]", 0, (CharSequence)null, (Function1)null, 56, (Object)null);
         if (var10000 != null) {
            return var10000;
         }
      }

      var10000 = "null";
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] copyInto_sIZ3KeM/* $FF was: copyInto-sIZ3KeM*/(int[] $this$copyInto_u2dsIZ3KeM, int[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto_u2dsIZ3KeM, "$this$copyInto");
      Intrinsics.checkNotNullParameter(destination, "destination");
      ArraysKt.copyInto($this$copyInto_u2dsIZ3KeM, destination, destinationOffset, startIndex, endIndex);
      return destination;
   }

   // $FF: synthetic method
   static int[] copyInto_sIZ3KeM$default/* $FF was: copyInto-sIZ3KeM$default*/(int[] $this$copyInto_u2dsIZ3KeM_u24default, int[] destination, int destinationOffset, int startIndex, int endIndex, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         destinationOffset = 0;
      }

      if ((var5 & 4) != 0) {
         startIndex = 0;
      }

      if ((var5 & 8) != 0) {
         endIndex = UIntArray.getSize-impl($this$copyInto_u2dsIZ3KeM_u24default);
      }

      Intrinsics.checkNotNullParameter($this$copyInto_u2dsIZ3KeM_u24default, "$this$copyInto");
      Intrinsics.checkNotNullParameter(destination, "destination");
      ArraysKt.copyInto($this$copyInto_u2dsIZ3KeM_u24default, destination, destinationOffset, startIndex, endIndex);
      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] copyInto__B0_L2c/* $FF was: copyInto--B0-L2c*/(long[] $this$copyInto_u2d_u2dB0_u2dL2c, long[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto_u2d_u2dB0_u2dL2c, "$this$copyInto");
      Intrinsics.checkNotNullParameter(destination, "destination");
      ArraysKt.copyInto($this$copyInto_u2d_u2dB0_u2dL2c, destination, destinationOffset, startIndex, endIndex);
      return destination;
   }

   // $FF: synthetic method
   static long[] copyInto__B0_L2c$default/* $FF was: copyInto--B0-L2c$default*/(long[] $this$copyInto_u2d_u2dB0_u2dL2c_u24default, long[] destination, int destinationOffset, int startIndex, int endIndex, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         destinationOffset = 0;
      }

      if ((var5 & 4) != 0) {
         startIndex = 0;
      }

      if ((var5 & 8) != 0) {
         endIndex = ULongArray.getSize-impl($this$copyInto_u2d_u2dB0_u2dL2c_u24default);
      }

      Intrinsics.checkNotNullParameter($this$copyInto_u2d_u2dB0_u2dL2c_u24default, "$this$copyInto");
      Intrinsics.checkNotNullParameter(destination, "destination");
      ArraysKt.copyInto($this$copyInto_u2d_u2dB0_u2dL2c_u24default, destination, destinationOffset, startIndex, endIndex);
      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] copyInto_FUQE5sA/* $FF was: copyInto-FUQE5sA*/(byte[] $this$copyInto_u2dFUQE5sA, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto_u2dFUQE5sA, "$this$copyInto");
      Intrinsics.checkNotNullParameter(destination, "destination");
      ArraysKt.copyInto($this$copyInto_u2dFUQE5sA, destination, destinationOffset, startIndex, endIndex);
      return destination;
   }

   // $FF: synthetic method
   static byte[] copyInto_FUQE5sA$default/* $FF was: copyInto-FUQE5sA$default*/(byte[] $this$copyInto_u2dFUQE5sA_u24default, byte[] destination, int destinationOffset, int startIndex, int endIndex, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         destinationOffset = 0;
      }

      if ((var5 & 4) != 0) {
         startIndex = 0;
      }

      if ((var5 & 8) != 0) {
         endIndex = UByteArray.getSize-impl($this$copyInto_u2dFUQE5sA_u24default);
      }

      Intrinsics.checkNotNullParameter($this$copyInto_u2dFUQE5sA_u24default, "$this$copyInto");
      Intrinsics.checkNotNullParameter(destination, "destination");
      ArraysKt.copyInto($this$copyInto_u2dFUQE5sA_u24default, destination, destinationOffset, startIndex, endIndex);
      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] copyInto_9_ak10g/* $FF was: copyInto-9-ak10g*/(short[] $this$copyInto_u2d9_u2dak10g, short[] destination, int destinationOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$copyInto_u2d9_u2dak10g, "$this$copyInto");
      Intrinsics.checkNotNullParameter(destination, "destination");
      ArraysKt.copyInto($this$copyInto_u2d9_u2dak10g, destination, destinationOffset, startIndex, endIndex);
      return destination;
   }

   // $FF: synthetic method
   static short[] copyInto_9_ak10g$default/* $FF was: copyInto-9-ak10g$default*/(short[] $this$copyInto_u2d9_u2dak10g_u24default, short[] destination, int destinationOffset, int startIndex, int endIndex, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         destinationOffset = 0;
      }

      if ((var5 & 4) != 0) {
         startIndex = 0;
      }

      if ((var5 & 8) != 0) {
         endIndex = UShortArray.getSize-impl($this$copyInto_u2d9_u2dak10g_u24default);
      }

      Intrinsics.checkNotNullParameter($this$copyInto_u2d9_u2dak10g_u24default, "$this$copyInto");
      Intrinsics.checkNotNullParameter(destination, "destination");
      ArraysKt.copyInto($this$copyInto_u2d9_u2dak10g_u24default, destination, destinationOffset, startIndex, endIndex);
      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] copyOf__ajY_9A/* $FF was: copyOf--ajY-9A*/(int[] $this$copyOf_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$copyOf_u2d_u2dajY_u2d9A, "$this$copyOf");
      int[] var10000 = Arrays.copyOf($this$copyOf_u2d_u2dajY_u2d9A, $this$copyOf_u2d_u2dajY_u2d9A.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return UIntArray.constructor-impl(var10000);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] copyOf_QwZRm1k/* $FF was: copyOf-QwZRm1k*/(long[] $this$copyOf_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$copyOf_u2dQwZRm1k, "$this$copyOf");
      long[] var10000 = Arrays.copyOf($this$copyOf_u2dQwZRm1k, $this$copyOf_u2dQwZRm1k.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return ULongArray.constructor-impl(var10000);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] copyOf_GBYM_sE/* $FF was: copyOf-GBYM_sE*/(byte[] $this$copyOf_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$copyOf_u2dGBYM_sE, "$this$copyOf");
      byte[] var10000 = Arrays.copyOf($this$copyOf_u2dGBYM_sE, $this$copyOf_u2dGBYM_sE.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return UByteArray.constructor-impl(var10000);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] copyOf_rL5Bavg/* $FF was: copyOf-rL5Bavg*/(short[] $this$copyOf_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$copyOf_u2drL5Bavg, "$this$copyOf");
      short[] var10000 = Arrays.copyOf($this$copyOf_u2drL5Bavg, $this$copyOf_u2drL5Bavg.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return UShortArray.constructor-impl(var10000);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] copyOf_qFRl0hI/* $FF was: copyOf-qFRl0hI*/(int[] $this$copyOf_u2dqFRl0hI, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf_u2dqFRl0hI, "$this$copyOf");
      int[] var10000 = Arrays.copyOf($this$copyOf_u2dqFRl0hI, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return UIntArray.constructor-impl(var10000);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] copyOf_r7IrZao/* $FF was: copyOf-r7IrZao*/(long[] $this$copyOf_u2dr7IrZao, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf_u2dr7IrZao, "$this$copyOf");
      long[] var10000 = Arrays.copyOf($this$copyOf_u2dr7IrZao, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return ULongArray.constructor-impl(var10000);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] copyOf_PpDY95g/* $FF was: copyOf-PpDY95g*/(byte[] $this$copyOf_u2dPpDY95g, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf_u2dPpDY95g, "$this$copyOf");
      byte[] var10000 = Arrays.copyOf($this$copyOf_u2dPpDY95g, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return UByteArray.constructor-impl(var10000);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] copyOf_nggk6HY/* $FF was: copyOf-nggk6HY*/(short[] $this$copyOf_u2dnggk6HY, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOf_u2dnggk6HY, "$this$copyOf");
      short[] var10000 = Arrays.copyOf($this$copyOf_u2dnggk6HY, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return UShortArray.constructor-impl(var10000);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] copyOfRange_oBK06Vg/* $FF was: copyOfRange-oBK06Vg*/(int[] $this$copyOfRange_u2doBK06Vg, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange_u2doBK06Vg, "$this$copyOfRange");
      return UIntArray.constructor-impl(ArraysKt.copyOfRange($this$copyOfRange_u2doBK06Vg, fromIndex, toIndex));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] copyOfRange__nroSd4/* $FF was: copyOfRange--nroSd4*/(long[] $this$copyOfRange_u2d_u2dnroSd4, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange_u2d_u2dnroSd4, "$this$copyOfRange");
      return ULongArray.constructor-impl(ArraysKt.copyOfRange($this$copyOfRange_u2d_u2dnroSd4, fromIndex, toIndex));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] copyOfRange_4UcCI2c/* $FF was: copyOfRange-4UcCI2c*/(byte[] $this$copyOfRange_u2d4UcCI2c, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange_u2d4UcCI2c, "$this$copyOfRange");
      return UByteArray.constructor-impl(ArraysKt.copyOfRange($this$copyOfRange_u2d4UcCI2c, fromIndex, toIndex));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] copyOfRange_Aa5vz7o/* $FF was: copyOfRange-Aa5vz7o*/(short[] $this$copyOfRange_u2dAa5vz7o, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$copyOfRange_u2dAa5vz7o, "$this$copyOfRange");
      return UShortArray.constructor-impl(ArraysKt.copyOfRange($this$copyOfRange_u2dAa5vz7o, fromIndex, toIndex));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final void fill_2fe2U9s/* $FF was: fill-2fe2U9s*/(@NotNull int[] $this$fill_u2d2fe2U9s, int element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill_u2d2fe2U9s, "$this$fill");
      ArraysKt.fill($this$fill_u2d2fe2U9s, element, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void fill_2fe2U9s$default/* $FF was: fill-2fe2U9s$default*/(int[] var0, int var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = UIntArray.getSize-impl(var0);
      }

      UArraysKt.fill-2fe2U9s(var0, var1, var2, var3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final void fill_K6DWlUc/* $FF was: fill-K6DWlUc*/(@NotNull long[] $this$fill_u2dK6DWlUc, long element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill_u2dK6DWlUc, "$this$fill");
      ArraysKt.fill($this$fill_u2dK6DWlUc, element, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void fill_K6DWlUc$default/* $FF was: fill-K6DWlUc$default*/(long[] var0, long var1, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var3 = 0;
      }

      if ((var5 & 4) != 0) {
         var4 = ULongArray.getSize-impl(var0);
      }

      UArraysKt.fill-K6DWlUc(var0, var1, var3, var4);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final void fill_WpHrYlw/* $FF was: fill-WpHrYlw*/(@NotNull byte[] $this$fill_u2dWpHrYlw, byte element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill_u2dWpHrYlw, "$this$fill");
      ArraysKt.fill($this$fill_u2dWpHrYlw, element, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void fill_WpHrYlw$default/* $FF was: fill-WpHrYlw$default*/(byte[] var0, byte var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = UByteArray.getSize-impl(var0);
      }

      UArraysKt.fill-WpHrYlw(var0, var1, var2, var3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final void fill_EtDCXyQ/* $FF was: fill-EtDCXyQ*/(@NotNull short[] $this$fill_u2dEtDCXyQ, short element, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$fill_u2dEtDCXyQ, "$this$fill");
      ArraysKt.fill($this$fill_u2dEtDCXyQ, element, fromIndex, toIndex);
   }

   // $FF: synthetic method
   public static void fill_EtDCXyQ$default/* $FF was: fill-EtDCXyQ$default*/(short[] var0, short var1, int var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = UShortArray.getSize-impl(var0);
      }

      UArraysKt.fill-EtDCXyQ(var0, var1, var2, var3);
   }

   @NotNull
   public static final IntRange getIndices__ajY_9A/* $FF was: getIndices--ajY-9A*/(@NotNull int[] $this$indices) {
      Intrinsics.checkNotNullParameter($this$indices, "$this$indices");
      int var1 = false;
      return ArraysKt.getIndices($this$indices);
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static void getIndices__ajY_9A$annotations/* $FF was: getIndices--ajY-9A$annotations*/(int[] <this>) {
   }

   @NotNull
   public static final IntRange getIndices_QwZRm1k/* $FF was: getIndices-QwZRm1k*/(@NotNull long[] $this$indices) {
      Intrinsics.checkNotNullParameter($this$indices, "$this$indices");
      int var1 = false;
      return ArraysKt.getIndices($this$indices);
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static void getIndices_QwZRm1k$annotations/* $FF was: getIndices-QwZRm1k$annotations*/(long[] <this>) {
   }

   @NotNull
   public static final IntRange getIndices_GBYM_sE/* $FF was: getIndices-GBYM_sE*/(@NotNull byte[] $this$indices) {
      Intrinsics.checkNotNullParameter($this$indices, "$this$indices");
      int var1 = false;
      return ArraysKt.getIndices($this$indices);
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static void getIndices_GBYM_sE$annotations/* $FF was: getIndices-GBYM_sE$annotations*/(byte[] <this>) {
   }

   @NotNull
   public static final IntRange getIndices_rL5Bavg/* $FF was: getIndices-rL5Bavg*/(@NotNull short[] $this$indices) {
      Intrinsics.checkNotNullParameter($this$indices, "$this$indices");
      int var1 = false;
      return ArraysKt.getIndices($this$indices);
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static void getIndices_rL5Bavg$annotations/* $FF was: getIndices-rL5Bavg$annotations*/(short[] <this>) {
   }

   public static final int getLastIndex__ajY_9A/* $FF was: getLastIndex--ajY-9A*/(@NotNull int[] $this$lastIndex) {
      Intrinsics.checkNotNullParameter($this$lastIndex, "$this$lastIndex");
      int var1 = false;
      return ArraysKt.getLastIndex($this$lastIndex);
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static void getLastIndex__ajY_9A$annotations/* $FF was: getLastIndex--ajY-9A$annotations*/(int[] <this>) {
   }

   public static final int getLastIndex_QwZRm1k/* $FF was: getLastIndex-QwZRm1k*/(@NotNull long[] $this$lastIndex) {
      Intrinsics.checkNotNullParameter($this$lastIndex, "$this$lastIndex");
      int var1 = false;
      return ArraysKt.getLastIndex($this$lastIndex);
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static void getLastIndex_QwZRm1k$annotations/* $FF was: getLastIndex-QwZRm1k$annotations*/(long[] <this>) {
   }

   public static final int getLastIndex_GBYM_sE/* $FF was: getLastIndex-GBYM_sE*/(@NotNull byte[] $this$lastIndex) {
      Intrinsics.checkNotNullParameter($this$lastIndex, "$this$lastIndex");
      int var1 = false;
      return ArraysKt.getLastIndex($this$lastIndex);
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static void getLastIndex_GBYM_sE$annotations/* $FF was: getLastIndex-GBYM_sE$annotations*/(byte[] <this>) {
   }

   public static final int getLastIndex_rL5Bavg/* $FF was: getLastIndex-rL5Bavg*/(@NotNull short[] $this$lastIndex) {
      Intrinsics.checkNotNullParameter($this$lastIndex, "$this$lastIndex");
      int var1 = false;
      return ArraysKt.getLastIndex($this$lastIndex);
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static void getLastIndex_rL5Bavg$annotations/* $FF was: getLastIndex-rL5Bavg$annotations*/(short[] <this>) {
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] plus_uWY9BYg/* $FF was: plus-uWY9BYg*/(int[] $this$plus_u2duWY9BYg, int element) {
      Intrinsics.checkNotNullParameter($this$plus_u2duWY9BYg, "$this$plus");
      return UIntArray.constructor-impl(ArraysKt.plus($this$plus_u2duWY9BYg, element));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] plus_3uqUaXg/* $FF was: plus-3uqUaXg*/(long[] $this$plus_u2d3uqUaXg, long element) {
      Intrinsics.checkNotNullParameter($this$plus_u2d3uqUaXg, "$this$plus");
      return ULongArray.constructor-impl(ArraysKt.plus($this$plus_u2d3uqUaXg, element));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] plus_gMuBH34/* $FF was: plus-gMuBH34*/(byte[] $this$plus_u2dgMuBH34, byte element) {
      Intrinsics.checkNotNullParameter($this$plus_u2dgMuBH34, "$this$plus");
      return UByteArray.constructor-impl(ArraysKt.plus($this$plus_u2dgMuBH34, element));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] plus_XzdR7RA/* $FF was: plus-XzdR7RA*/(short[] $this$plus_u2dXzdR7RA, short element) {
      Intrinsics.checkNotNullParameter($this$plus_u2dXzdR7RA, "$this$plus");
      return UShortArray.constructor-impl(ArraysKt.plus($this$plus_u2dXzdR7RA, element));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final int[] plus_CFIt9YE/* $FF was: plus-CFIt9YE*/(@NotNull int[] $this$plus_u2dCFIt9YE, @NotNull Collection<UInt> elements) {
      Intrinsics.checkNotNullParameter($this$plus_u2dCFIt9YE, "$this$plus");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = UIntArray.getSize-impl($this$plus_u2dCFIt9YE);
      int[] var10000 = Arrays.copyOf($this$plus_u2dCFIt9YE, UIntArray.getSize-impl($this$plus_u2dCFIt9YE) + elements.size());
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      int[] result = var10000;

      int element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = ((UInt)var4.next()).unbox-impl();
      }

      return UIntArray.constructor-impl(result);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final long[] plus_kzHmqpY/* $FF was: plus-kzHmqpY*/(@NotNull long[] $this$plus_u2dkzHmqpY, @NotNull Collection<ULong> elements) {
      Intrinsics.checkNotNullParameter($this$plus_u2dkzHmqpY, "$this$plus");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = ULongArray.getSize-impl($this$plus_u2dkzHmqpY);
      long[] var10000 = Arrays.copyOf($this$plus_u2dkzHmqpY, ULongArray.getSize-impl($this$plus_u2dkzHmqpY) + elements.size());
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      long[] result = var10000;

      long element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = ((ULong)var4.next()).unbox-impl();
      }

      return ULongArray.constructor-impl(result);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final byte[] plus_xo_DsdI/* $FF was: plus-xo_DsdI*/(@NotNull byte[] $this$plus_u2dxo_DsdI, @NotNull Collection<UByte> elements) {
      Intrinsics.checkNotNullParameter($this$plus_u2dxo_DsdI, "$this$plus");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = UByteArray.getSize-impl($this$plus_u2dxo_DsdI);
      byte[] var10000 = Arrays.copyOf($this$plus_u2dxo_DsdI, UByteArray.getSize-impl($this$plus_u2dxo_DsdI) + elements.size());
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      byte[] result = var10000;

      byte element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = ((UByte)var4.next()).unbox-impl();
      }

      return UByteArray.constructor-impl(result);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final short[] plus_ojwP5H8/* $FF was: plus-ojwP5H8*/(@NotNull short[] $this$plus_u2dojwP5H8, @NotNull Collection<UShort> elements) {
      Intrinsics.checkNotNullParameter($this$plus_u2dojwP5H8, "$this$plus");
      Intrinsics.checkNotNullParameter(elements, "elements");
      int index = UShortArray.getSize-impl($this$plus_u2dojwP5H8);
      short[] var10000 = Arrays.copyOf($this$plus_u2dojwP5H8, UShortArray.getSize-impl($this$plus_u2dojwP5H8) + elements.size());
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      short[] result = var10000;

      short element;
      for(Iterator var4 = elements.iterator(); var4.hasNext(); result[index++] = element) {
         element = ((UShort)var4.next()).unbox-impl();
      }

      return UShortArray.constructor-impl(result);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] plus_ctEhBpI/* $FF was: plus-ctEhBpI*/(int[] $this$plus_u2dctEhBpI, int[] elements) {
      Intrinsics.checkNotNullParameter($this$plus_u2dctEhBpI, "$this$plus");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return UIntArray.constructor-impl(ArraysKt.plus($this$plus_u2dctEhBpI, elements));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] plus_us8wMrg/* $FF was: plus-us8wMrg*/(long[] $this$plus_u2dus8wMrg, long[] elements) {
      Intrinsics.checkNotNullParameter($this$plus_u2dus8wMrg, "$this$plus");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return ULongArray.constructor-impl(ArraysKt.plus($this$plus_u2dus8wMrg, elements));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] plus_kdPth3s/* $FF was: plus-kdPth3s*/(byte[] $this$plus_u2dkdPth3s, byte[] elements) {
      Intrinsics.checkNotNullParameter($this$plus_u2dkdPth3s, "$this$plus");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return UByteArray.constructor-impl(ArraysKt.plus($this$plus_u2dkdPth3s, elements));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] plus_mazbYpA/* $FF was: plus-mazbYpA*/(short[] $this$plus_u2dmazbYpA, short[] elements) {
      Intrinsics.checkNotNullParameter($this$plus_u2dmazbYpA, "$this$plus");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return UShortArray.constructor-impl(ArraysKt.plus($this$plus_u2dmazbYpA, elements));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final void sort__ajY_9A/* $FF was: sort--ajY-9A*/(@NotNull int[] $this$sort_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$sort_u2d_u2dajY_u2d9A, "$this$sort");
      if (UIntArray.getSize-impl($this$sort_u2d_u2dajY_u2d9A) > 1) {
         UArraySortingKt.sortArray-oBK06Vg($this$sort_u2d_u2dajY_u2d9A, 0, UIntArray.getSize-impl($this$sort_u2d_u2dajY_u2d9A));
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final void sort_QwZRm1k/* $FF was: sort-QwZRm1k*/(@NotNull long[] $this$sort_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$sort_u2dQwZRm1k, "$this$sort");
      if (ULongArray.getSize-impl($this$sort_u2dQwZRm1k) > 1) {
         UArraySortingKt.sortArray--nroSd4($this$sort_u2dQwZRm1k, 0, ULongArray.getSize-impl($this$sort_u2dQwZRm1k));
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final void sort_GBYM_sE/* $FF was: sort-GBYM_sE*/(@NotNull byte[] $this$sort_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$sort_u2dGBYM_sE, "$this$sort");
      if (UByteArray.getSize-impl($this$sort_u2dGBYM_sE) > 1) {
         UArraySortingKt.sortArray-4UcCI2c($this$sort_u2dGBYM_sE, 0, UByteArray.getSize-impl($this$sort_u2dGBYM_sE));
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   public static final void sort_rL5Bavg/* $FF was: sort-rL5Bavg*/(@NotNull short[] $this$sort_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$sort_u2drL5Bavg, "$this$sort");
      if (UShortArray.getSize-impl($this$sort_u2drL5Bavg) > 1) {
         UArraySortingKt.sortArray-Aa5vz7o($this$sort_u2drL5Bavg, 0, UShortArray.getSize-impl($this$sort_u2drL5Bavg));
      }

   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void sort_oBK06Vg/* $FF was: sort-oBK06Vg*/(@NotNull int[] $this$sort_u2doBK06Vg, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort_u2doBK06Vg, "$this$sort");
      AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, UIntArray.getSize-impl($this$sort_u2doBK06Vg));
      if (fromIndex < toIndex - 1) {
         UArraySortingKt.sortArray-oBK06Vg($this$sort_u2doBK06Vg, fromIndex, toIndex);
      }

   }

   // $FF: synthetic method
   public static void sort_oBK06Vg$default/* $FF was: sort-oBK06Vg$default*/(int[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = UIntArray.getSize-impl(var0);
      }

      UArraysKt.sort-oBK06Vg(var0, var1, var2);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void sort__nroSd4/* $FF was: sort--nroSd4*/(@NotNull long[] $this$sort_u2d_u2dnroSd4, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort_u2d_u2dnroSd4, "$this$sort");
      AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, ULongArray.getSize-impl($this$sort_u2d_u2dnroSd4));
      if (fromIndex < toIndex - 1) {
         UArraySortingKt.sortArray--nroSd4($this$sort_u2d_u2dnroSd4, fromIndex, toIndex);
      }

   }

   // $FF: synthetic method
   public static void sort__nroSd4$default/* $FF was: sort--nroSd4$default*/(long[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = ULongArray.getSize-impl(var0);
      }

      UArraysKt.sort--nroSd4(var0, var1, var2);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void sort_4UcCI2c/* $FF was: sort-4UcCI2c*/(@NotNull byte[] $this$sort_u2d4UcCI2c, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort_u2d4UcCI2c, "$this$sort");
      AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, UByteArray.getSize-impl($this$sort_u2d4UcCI2c));
      if (fromIndex < toIndex - 1) {
         UArraySortingKt.sortArray-4UcCI2c($this$sort_u2d4UcCI2c, fromIndex, toIndex);
      }

   }

   // $FF: synthetic method
   public static void sort_4UcCI2c$default/* $FF was: sort-4UcCI2c$default*/(byte[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = UByteArray.getSize-impl(var0);
      }

      UArraysKt.sort-4UcCI2c(var0, var1, var2);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void sort_Aa5vz7o/* $FF was: sort-Aa5vz7o*/(@NotNull short[] $this$sort_u2dAa5vz7o, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sort_u2dAa5vz7o, "$this$sort");
      AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, UShortArray.getSize-impl($this$sort_u2dAa5vz7o));
      if (fromIndex < toIndex - 1) {
         UArraySortingKt.sortArray-Aa5vz7o($this$sort_u2dAa5vz7o, fromIndex, toIndex);
      }

   }

   // $FF: synthetic method
   public static void sort_Aa5vz7o$default/* $FF was: sort-Aa5vz7o$default*/(short[] var0, int var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = 0;
      }

      if ((var3 & 2) != 0) {
         var2 = UShortArray.getSize-impl(var0);
      }

      UArraysKt.sort-Aa5vz7o(var0, var1, var2);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void sortDescending_oBK06Vg/* $FF was: sortDescending-oBK06Vg*/(@NotNull int[] $this$sortDescending_u2doBK06Vg, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sortDescending_u2doBK06Vg, "$this$sortDescending");
      UArraysKt.sort-oBK06Vg($this$sortDescending_u2doBK06Vg, fromIndex, toIndex);
      ArraysKt.reverse($this$sortDescending_u2doBK06Vg, fromIndex, toIndex);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void sortDescending__nroSd4/* $FF was: sortDescending--nroSd4*/(@NotNull long[] $this$sortDescending_u2d_u2dnroSd4, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sortDescending_u2d_u2dnroSd4, "$this$sortDescending");
      UArraysKt.sort--nroSd4($this$sortDescending_u2d_u2dnroSd4, fromIndex, toIndex);
      ArraysKt.reverse($this$sortDescending_u2d_u2dnroSd4, fromIndex, toIndex);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void sortDescending_4UcCI2c/* $FF was: sortDescending-4UcCI2c*/(@NotNull byte[] $this$sortDescending_u2d4UcCI2c, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sortDescending_u2d4UcCI2c, "$this$sortDescending");
      UArraysKt.sort-4UcCI2c($this$sortDescending_u2d4UcCI2c, fromIndex, toIndex);
      ArraysKt.reverse($this$sortDescending_u2d4UcCI2c, fromIndex, toIndex);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   public static final void sortDescending_Aa5vz7o/* $FF was: sortDescending-Aa5vz7o*/(@NotNull short[] $this$sortDescending_u2dAa5vz7o, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$sortDescending_u2dAa5vz7o, "$this$sortDescending");
      UArraysKt.sort-Aa5vz7o($this$sortDescending_u2dAa5vz7o, fromIndex, toIndex);
      ArraysKt.reverse($this$sortDescending_u2dAa5vz7o, fromIndex, toIndex);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] toByteArray_GBYM_sE/* $FF was: toByteArray-GBYM_sE*/(byte[] $this$toByteArray_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$toByteArray_u2dGBYM_sE, "$this$toByteArray");
      byte[] var10000 = Arrays.copyOf($this$toByteArray_u2dGBYM_sE, $this$toByteArray_u2dGBYM_sE.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] toIntArray__ajY_9A/* $FF was: toIntArray--ajY-9A*/(int[] $this$toIntArray_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$toIntArray_u2d_u2dajY_u2d9A, "$this$toIntArray");
      int[] var10000 = Arrays.copyOf($this$toIntArray_u2d_u2dajY_u2d9A, $this$toIntArray_u2d_u2dajY_u2d9A.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] toLongArray_QwZRm1k/* $FF was: toLongArray-QwZRm1k*/(long[] $this$toLongArray_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$toLongArray_u2dQwZRm1k, "$this$toLongArray");
      long[] var10000 = Arrays.copyOf($this$toLongArray_u2dQwZRm1k, $this$toLongArray_u2dQwZRm1k.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] toShortArray_rL5Bavg/* $FF was: toShortArray-rL5Bavg*/(short[] $this$toShortArray_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$toShortArray_u2drL5Bavg, "$this$toShortArray");
      short[] var10000 = Arrays.copyOf($this$toShortArray_u2drL5Bavg, $this$toShortArray_u2drL5Bavg.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final UInt[] toTypedArray__ajY_9A/* $FF was: toTypedArray--ajY-9A*/(@NotNull int[] $this$toTypedArray_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$toTypedArray_u2d_u2dajY_u2d9A, "$this$toTypedArray");
      int var1 = 0;
      int var2 = UIntArray.getSize-impl($this$toTypedArray_u2d_u2dajY_u2d9A);

      UInt[] var3;
      for(var3 = new UInt[var2]; var1 < var2; ++var1) {
         var3[var1] = UInt.box-impl(UIntArray.get-pVg5ArA($this$toTypedArray_u2d_u2dajY_u2d9A, var1));
      }

      return var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final ULong[] toTypedArray_QwZRm1k/* $FF was: toTypedArray-QwZRm1k*/(@NotNull long[] $this$toTypedArray_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$toTypedArray_u2dQwZRm1k, "$this$toTypedArray");
      int var1 = 0;
      int var2 = ULongArray.getSize-impl($this$toTypedArray_u2dQwZRm1k);

      ULong[] var3;
      for(var3 = new ULong[var2]; var1 < var2; ++var1) {
         var3[var1] = ULong.box-impl(ULongArray.get-s-VKNKU($this$toTypedArray_u2dQwZRm1k, var1));
      }

      return var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final UByte[] toTypedArray_GBYM_sE/* $FF was: toTypedArray-GBYM_sE*/(@NotNull byte[] $this$toTypedArray_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$toTypedArray_u2dGBYM_sE, "$this$toTypedArray");
      int var1 = 0;
      int var2 = UByteArray.getSize-impl($this$toTypedArray_u2dGBYM_sE);

      UByte[] var3;
      for(var3 = new UByte[var2]; var1 < var2; ++var1) {
         var3[var1] = UByte.box-impl(UByteArray.get-w2LRezQ($this$toTypedArray_u2dGBYM_sE, var1));
      }

      return var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final UShort[] toTypedArray_rL5Bavg/* $FF was: toTypedArray-rL5Bavg*/(@NotNull short[] $this$toTypedArray_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$toTypedArray_u2drL5Bavg, "$this$toTypedArray");
      int var1 = 0;
      int var2 = UShortArray.getSize-impl($this$toTypedArray_u2drL5Bavg);

      UShort[] var3;
      for(var3 = new UShort[var2]; var1 < var2; ++var1) {
         var3[var1] = UShort.box-impl(UShortArray.get-Mh2AYeg($this$toTypedArray_u2drL5Bavg, var1));
      }

      return var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final byte[] toUByteArray(@NotNull UByte[] $this$toUByteArray) {
      Intrinsics.checkNotNullParameter($this$toUByteArray, "<this>");
      int var1 = $this$toUByteArray.length;
      int var2 = 0;

      byte[] var3;
      for(var3 = new byte[var1]; var2 < var1; ++var2) {
         int var6 = false;
         byte var9 = $this$toUByteArray[var2].unbox-impl();
         var3[var2] = var9;
      }

      return UByteArray.constructor-impl(var3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] toUByteArray(byte[] $this$toUByteArray) {
      Intrinsics.checkNotNullParameter($this$toUByteArray, "<this>");
      byte[] var10000 = Arrays.copyOf($this$toUByteArray, $this$toUByteArray.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return UByteArray.constructor-impl(var10000);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final int[] toUIntArray(@NotNull UInt[] $this$toUIntArray) {
      Intrinsics.checkNotNullParameter($this$toUIntArray, "<this>");
      int var1 = $this$toUIntArray.length;
      int var2 = 0;

      int[] var3;
      for(var3 = new int[var1]; var2 < var1; ++var2) {
         int var6 = false;
         int var9 = $this$toUIntArray[var2].unbox-impl();
         var3[var2] = var9;
      }

      return UIntArray.constructor-impl(var3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] toUIntArray(int[] $this$toUIntArray) {
      Intrinsics.checkNotNullParameter($this$toUIntArray, "<this>");
      int[] var10000 = Arrays.copyOf($this$toUIntArray, $this$toUIntArray.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return UIntArray.constructor-impl(var10000);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final long[] toULongArray(@NotNull ULong[] $this$toULongArray) {
      Intrinsics.checkNotNullParameter($this$toULongArray, "<this>");
      int var1 = $this$toULongArray.length;
      int var2 = 0;

      long[] var3;
      for(var3 = new long[var1]; var2 < var1; ++var2) {
         int var6 = false;
         long var9 = $this$toULongArray[var2].unbox-impl();
         var3[var2] = var9;
      }

      return ULongArray.constructor-impl(var3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] toULongArray(long[] $this$toULongArray) {
      Intrinsics.checkNotNullParameter($this$toULongArray, "<this>");
      long[] var10000 = Arrays.copyOf($this$toULongArray, $this$toULongArray.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return ULongArray.constructor-impl(var10000);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final short[] toUShortArray(@NotNull UShort[] $this$toUShortArray) {
      Intrinsics.checkNotNullParameter($this$toUShortArray, "<this>");
      int var1 = $this$toUShortArray.length;
      int var2 = 0;

      short[] var3;
      for(var3 = new short[var1]; var2 < var1; ++var2) {
         int var6 = false;
         short var9 = $this$toUShortArray[var2].unbox-impl();
         var3[var2] = var9;
      }

      return UShortArray.constructor-impl(var3);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] toUShortArray(short[] $this$toUShortArray) {
      Intrinsics.checkNotNullParameter($this$toUShortArray, "<this>");
      short[] var10000 = Arrays.copyOf($this$toUShortArray, $this$toUShortArray.length);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return UShortArray.constructor-impl(var10000);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <V> Map<UInt, V> associateWith_jgv0xPQ/* $FF was: associateWith-jgv0xPQ*/(int[] $this$associateWith_u2djgv0xPQ, Function1<? super UInt, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWith_u2djgv0xPQ, "$this$associateWith");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      LinkedHashMap result = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(UIntArray.getSize-impl($this$associateWith_u2djgv0xPQ)), 16));
      int[] var3 = $this$associateWith_u2djgv0xPQ;
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$associateWith_u2djgv0xPQ); var4 < var5; ++var4) {
         int var6 = UIntArray.get-pVg5ArA(var3, var4);
         ((Map)result).put(UInt.box-impl(var6), valueSelector.invoke(UInt.box-impl(var6)));
      }

      return (Map)result;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <V> Map<ULong, V> associateWith_MShoTSo/* $FF was: associateWith-MShoTSo*/(long[] $this$associateWith_u2dMShoTSo, Function1<? super ULong, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWith_u2dMShoTSo, "$this$associateWith");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      LinkedHashMap result = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(ULongArray.getSize-impl($this$associateWith_u2dMShoTSo)), 16));
      long[] var3 = $this$associateWith_u2dMShoTSo;
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$associateWith_u2dMShoTSo); var4 < var5; ++var4) {
         long var6 = ULongArray.get-s-VKNKU(var3, var4);
         ((Map)result).put(ULong.box-impl(var6), valueSelector.invoke(ULong.box-impl(var6)));
      }

      return (Map)result;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <V> Map<UByte, V> associateWith_JOV_ifY/* $FF was: associateWith-JOV_ifY*/(byte[] $this$associateWith_u2dJOV_ifY, Function1<? super UByte, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWith_u2dJOV_ifY, "$this$associateWith");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      LinkedHashMap result = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(UByteArray.getSize-impl($this$associateWith_u2dJOV_ifY)), 16));
      byte[] var3 = $this$associateWith_u2dJOV_ifY;
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$associateWith_u2dJOV_ifY); var4 < var5; ++var4) {
         byte var6 = UByteArray.get-w2LRezQ(var3, var4);
         ((Map)result).put(UByte.box-impl(var6), valueSelector.invoke(UByte.box-impl(var6)));
      }

      return (Map)result;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <V> Map<UShort, V> associateWith_xTcfx_M/* $FF was: associateWith-xTcfx_M*/(short[] $this$associateWith_u2dxTcfx_M, Function1<? super UShort, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWith_u2dxTcfx_M, "$this$associateWith");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      LinkedHashMap result = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(UShortArray.getSize-impl($this$associateWith_u2dxTcfx_M)), 16));
      short[] var3 = $this$associateWith_u2dxTcfx_M;
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$associateWith_u2dxTcfx_M); var4 < var5; ++var4) {
         short var6 = UShortArray.get-Mh2AYeg(var3, var4);
         ((Map)result).put(UShort.box-impl(var6), valueSelector.invoke(UShort.box-impl(var6)));
      }

      return (Map)result;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <V, M extends Map<? super UInt, ? super V>> M associateWithTo_4D70W2E/* $FF was: associateWithTo-4D70W2E*/(int[] $this$associateWithTo_u2d4D70W2E, M destination, Function1<? super UInt, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWithTo_u2d4D70W2E, "$this$associateWithTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      int var3 = 0;

      for(int var4 = UIntArray.getSize-impl($this$associateWithTo_u2d4D70W2E); var3 < var4; ++var3) {
         int element = UIntArray.get-pVg5ArA($this$associateWithTo_u2d4D70W2E, var3);
         destination.put(UInt.box-impl(element), valueSelector.invoke(UInt.box-impl(element)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <V, M extends Map<? super ULong, ? super V>> M associateWithTo_X6OPwNk/* $FF was: associateWithTo-X6OPwNk*/(long[] $this$associateWithTo_u2dX6OPwNk, M destination, Function1<? super ULong, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWithTo_u2dX6OPwNk, "$this$associateWithTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      int var3 = 0;

      for(int var4 = ULongArray.getSize-impl($this$associateWithTo_u2dX6OPwNk); var3 < var4; ++var3) {
         long element = ULongArray.get-s-VKNKU($this$associateWithTo_u2dX6OPwNk, var3);
         destination.put(ULong.box-impl(element), valueSelector.invoke(ULong.box-impl(element)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <V, M extends Map<? super UByte, ? super V>> M associateWithTo_H21X9dk/* $FF was: associateWithTo-H21X9dk*/(byte[] $this$associateWithTo_u2dH21X9dk, M destination, Function1<? super UByte, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWithTo_u2dH21X9dk, "$this$associateWithTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$associateWithTo_u2dH21X9dk); var3 < var4; ++var3) {
         byte element = UByteArray.get-w2LRezQ($this$associateWithTo_u2dH21X9dk, var3);
         destination.put(UByte.box-impl(element), valueSelector.invoke(UByte.box-impl(element)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <V, M extends Map<? super UShort, ? super V>> M associateWithTo_ciTST_8/* $FF was: associateWithTo-ciTST-8*/(short[] $this$associateWithTo_u2dciTST_u2d8, M destination, Function1<? super UShort, ? extends V> valueSelector) {
      Intrinsics.checkNotNullParameter($this$associateWithTo_u2dciTST_u2d8, "$this$associateWithTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$associateWithTo_u2dciTST_u2d8); var3 < var4; ++var3) {
         short element = UShortArray.get-Mh2AYeg($this$associateWithTo_u2dciTST_u2d8, var3);
         destination.put(UShort.box-impl(element), valueSelector.invoke(UShort.box-impl(element)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> flatMap_jgv0xPQ/* $FF was: flatMap-jgv0xPQ*/(int[] $this$flatMap_u2djgv0xPQ, Function1<? super UInt, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMap_u2djgv0xPQ, "$this$flatMap");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int[] var2 = $this$flatMap_u2djgv0xPQ;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$flatMap_u2djgv0xPQ); var4 < var5; ++var4) {
         int var6 = UIntArray.get-pVg5ArA(var2, var4);
         CollectionsKt.addAll(var3, (Iterable)transform.invoke(UInt.box-impl(var6)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> flatMap_MShoTSo/* $FF was: flatMap-MShoTSo*/(long[] $this$flatMap_u2dMShoTSo, Function1<? super ULong, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMap_u2dMShoTSo, "$this$flatMap");
      Intrinsics.checkNotNullParameter(transform, "transform");
      long[] var2 = $this$flatMap_u2dMShoTSo;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$flatMap_u2dMShoTSo); var4 < var5; ++var4) {
         long var6 = ULongArray.get-s-VKNKU(var2, var4);
         CollectionsKt.addAll(var3, (Iterable)transform.invoke(ULong.box-impl(var6)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> flatMap_JOV_ifY/* $FF was: flatMap-JOV_ifY*/(byte[] $this$flatMap_u2dJOV_ifY, Function1<? super UByte, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMap_u2dJOV_ifY, "$this$flatMap");
      Intrinsics.checkNotNullParameter(transform, "transform");
      byte[] var2 = $this$flatMap_u2dJOV_ifY;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$flatMap_u2dJOV_ifY); var4 < var5; ++var4) {
         byte var6 = UByteArray.get-w2LRezQ(var2, var4);
         CollectionsKt.addAll(var3, (Iterable)transform.invoke(UByte.box-impl(var6)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> flatMap_xTcfx_M/* $FF was: flatMap-xTcfx_M*/(short[] $this$flatMap_u2dxTcfx_M, Function1<? super UShort, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMap_u2dxTcfx_M, "$this$flatMap");
      Intrinsics.checkNotNullParameter(transform, "transform");
      short[] var2 = $this$flatMap_u2dxTcfx_M;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$flatMap_u2dxTcfx_M); var4 < var5; ++var4) {
         short var6 = UShortArray.get-Mh2AYeg(var2, var4);
         CollectionsKt.addAll(var3, (Iterable)transform.invoke(UShort.box-impl(var6)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> flatMapIndexed_WyvcNBI/* $FF was: flatMapIndexed-WyvcNBI*/(int[] $this$flatMapIndexed_u2dWyvcNBI, Function2<? super Integer, ? super UInt, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexed_u2dWyvcNBI, "$this$flatMapIndexed");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int[] var2 = $this$flatMapIndexed_u2dWyvcNBI;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;
      int var5 = 0;

      for(int var6 = UIntArray.getSize-impl($this$flatMapIndexed_u2dWyvcNBI); var5 < var6; ++var5) {
         int var7 = UIntArray.get-pVg5ArA(var2, var5);
         CollectionsKt.addAll(var3, (Iterable)transform.invoke(var4++, UInt.box-impl(var7)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> flatMapIndexed_s8dVfGU/* $FF was: flatMapIndexed-s8dVfGU*/(long[] $this$flatMapIndexed_u2ds8dVfGU, Function2<? super Integer, ? super ULong, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexed_u2ds8dVfGU, "$this$flatMapIndexed");
      Intrinsics.checkNotNullParameter(transform, "transform");
      long[] var2 = $this$flatMapIndexed_u2ds8dVfGU;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;
      int var5 = 0;

      for(int var6 = ULongArray.getSize-impl($this$flatMapIndexed_u2ds8dVfGU); var5 < var6; ++var5) {
         long var7 = ULongArray.get-s-VKNKU(var2, var5);
         CollectionsKt.addAll(var3, (Iterable)transform.invoke(var4++, ULong.box-impl(var7)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> flatMapIndexed_ELGow60/* $FF was: flatMapIndexed-ELGow60*/(byte[] $this$flatMapIndexed_u2dELGow60, Function2<? super Integer, ? super UByte, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexed_u2dELGow60, "$this$flatMapIndexed");
      Intrinsics.checkNotNullParameter(transform, "transform");
      byte[] var2 = $this$flatMapIndexed_u2dELGow60;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;
      int var5 = 0;

      for(int var6 = UByteArray.getSize-impl($this$flatMapIndexed_u2dELGow60); var5 < var6; ++var5) {
         byte var7 = UByteArray.get-w2LRezQ(var2, var5);
         CollectionsKt.addAll(var3, (Iterable)transform.invoke(var4++, UByte.box-impl(var7)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> flatMapIndexed_xzaTVY8/* $FF was: flatMapIndexed-xzaTVY8*/(short[] $this$flatMapIndexed_u2dxzaTVY8, Function2<? super Integer, ? super UShort, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexed_u2dxzaTVY8, "$this$flatMapIndexed");
      Intrinsics.checkNotNullParameter(transform, "transform");
      short[] var2 = $this$flatMapIndexed_u2dxzaTVY8;
      Collection var3 = (Collection)(new ArrayList());
      int var4 = 0;
      int var5 = 0;

      for(int var6 = UShortArray.getSize-impl($this$flatMapIndexed_u2dxzaTVY8); var5 < var6; ++var5) {
         short var7 = UShortArray.get-Mh2AYeg(var2, var5);
         CollectionsKt.addAll(var3, (Iterable)transform.invoke(var4++, UShort.box-impl(var7)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C flatMapIndexedTo__6EtJGI/* $FF was: flatMapIndexedTo--6EtJGI*/(int[] $this$flatMapIndexedTo_u2d_u2d6EtJGI, C destination, Function2<? super Integer, ? super UInt, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexedTo_u2d_u2d6EtJGI, "$this$flatMapIndexedTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int index = 0;
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$flatMapIndexedTo_u2d_u2d6EtJGI); var4 < var5; ++var4) {
         int element = UIntArray.get-pVg5ArA($this$flatMapIndexedTo_u2d_u2d6EtJGI, var4);
         Iterable list = (Iterable)transform.invoke(index++, UInt.box-impl(element));
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C flatMapIndexedTo_pe2Q0Dw/* $FF was: flatMapIndexedTo-pe2Q0Dw*/(long[] $this$flatMapIndexedTo_u2dpe2Q0Dw, C destination, Function2<? super Integer, ? super ULong, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexedTo_u2dpe2Q0Dw, "$this$flatMapIndexedTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int index = 0;
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$flatMapIndexedTo_u2dpe2Q0Dw); var4 < var5; ++var4) {
         long element = ULongArray.get-s-VKNKU($this$flatMapIndexedTo_u2dpe2Q0Dw, var4);
         Iterable list = (Iterable)transform.invoke(index++, ULong.box-impl(element));
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C flatMapIndexedTo_eNpIKz8/* $FF was: flatMapIndexedTo-eNpIKz8*/(byte[] $this$flatMapIndexedTo_u2deNpIKz8, C destination, Function2<? super Integer, ? super UByte, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexedTo_u2deNpIKz8, "$this$flatMapIndexedTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int index = 0;
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$flatMapIndexedTo_u2deNpIKz8); var4 < var5; ++var4) {
         byte element = UByteArray.get-w2LRezQ($this$flatMapIndexedTo_u2deNpIKz8, var4);
         Iterable list = (Iterable)transform.invoke(index++, UByte.box-impl(element));
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C flatMapIndexedTo_QqktQ3k/* $FF was: flatMapIndexedTo-QqktQ3k*/(short[] $this$flatMapIndexedTo_u2dQqktQ3k, C destination, Function2<? super Integer, ? super UShort, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapIndexedTo_u2dQqktQ3k, "$this$flatMapIndexedTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int index = 0;
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$flatMapIndexedTo_u2dQqktQ3k); var4 < var5; ++var4) {
         short element = UShortArray.get-Mh2AYeg($this$flatMapIndexedTo_u2dQqktQ3k, var4);
         Iterable list = (Iterable)transform.invoke(index++, UShort.box-impl(element));
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C flatMapTo_wU5IKMo/* $FF was: flatMapTo-wU5IKMo*/(int[] $this$flatMapTo_u2dwU5IKMo, C destination, Function1<? super UInt, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapTo_u2dwU5IKMo, "$this$flatMapTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int var3 = 0;

      for(int var4 = UIntArray.getSize-impl($this$flatMapTo_u2dwU5IKMo); var3 < var4; ++var3) {
         int element = UIntArray.get-pVg5ArA($this$flatMapTo_u2dwU5IKMo, var3);
         Iterable list = (Iterable)transform.invoke(UInt.box-impl(element));
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C flatMapTo_HqK1JgA/* $FF was: flatMapTo-HqK1JgA*/(long[] $this$flatMapTo_u2dHqK1JgA, C destination, Function1<? super ULong, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapTo_u2dHqK1JgA, "$this$flatMapTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int var3 = 0;

      for(int var4 = ULongArray.getSize-impl($this$flatMapTo_u2dHqK1JgA); var3 < var4; ++var3) {
         long element = ULongArray.get-s-VKNKU($this$flatMapTo_u2dHqK1JgA, var3);
         Iterable list = (Iterable)transform.invoke(ULong.box-impl(element));
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C flatMapTo_wzUQCXU/* $FF was: flatMapTo-wzUQCXU*/(byte[] $this$flatMapTo_u2dwzUQCXU, C destination, Function1<? super UByte, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapTo_u2dwzUQCXU, "$this$flatMapTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$flatMapTo_u2dwzUQCXU); var3 < var4; ++var3) {
         byte element = UByteArray.get-w2LRezQ($this$flatMapTo_u2dwzUQCXU, var3);
         Iterable list = (Iterable)transform.invoke(UByte.box-impl(element));
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C flatMapTo_oEOeDjA/* $FF was: flatMapTo-oEOeDjA*/(short[] $this$flatMapTo_u2doEOeDjA, C destination, Function1<? super UShort, ? extends Iterable<? extends R>> transform) {
      Intrinsics.checkNotNullParameter($this$flatMapTo_u2doEOeDjA, "$this$flatMapTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$flatMapTo_u2doEOeDjA); var3 < var4; ++var3) {
         short element = UShortArray.get-Mh2AYeg($this$flatMapTo_u2doEOeDjA, var3);
         Iterable list = (Iterable)transform.invoke(UShort.box-impl(element));
         CollectionsKt.addAll(destination, list);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K> Map<K, List<UInt>> groupBy_jgv0xPQ/* $FF was: groupBy-jgv0xPQ*/(int[] $this$groupBy_u2djgv0xPQ, Function1<? super UInt, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupBy_u2djgv0xPQ, "$this$groupBy");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int[] var2 = $this$groupBy_u2djgv0xPQ;
      Map var3 = (Map)(new LinkedHashMap());
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$groupBy_u2djgv0xPQ); var4 < var5; ++var4) {
         int var6 = UIntArray.get-pVg5ArA(var2, var4);
         Object var7 = keySelector.invoke(UInt.box-impl(var6));
         Object var10000 = var3.get(var7);
         if (var10000 == null) {
            List var9 = (List)(new ArrayList());
            var3.put(var7, var9);
            var10000 = var9;
         }

         ((List)var10000).add(UInt.box-impl(var6));
      }

      return var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K> Map<K, List<ULong>> groupBy_MShoTSo/* $FF was: groupBy-MShoTSo*/(long[] $this$groupBy_u2dMShoTSo, Function1<? super ULong, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupBy_u2dMShoTSo, "$this$groupBy");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      long[] var2 = $this$groupBy_u2dMShoTSo;
      Map var3 = (Map)(new LinkedHashMap());
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$groupBy_u2dMShoTSo); var4 < var5; ++var4) {
         long var6 = ULongArray.get-s-VKNKU(var2, var4);
         Object var8 = keySelector.invoke(ULong.box-impl(var6));
         Object var10000 = var3.get(var8);
         if (var10000 == null) {
            List var10 = (List)(new ArrayList());
            var3.put(var8, var10);
            var10000 = var10;
         }

         ((List)var10000).add(ULong.box-impl(var6));
      }

      return var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K> Map<K, List<UByte>> groupBy_JOV_ifY/* $FF was: groupBy-JOV_ifY*/(byte[] $this$groupBy_u2dJOV_ifY, Function1<? super UByte, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupBy_u2dJOV_ifY, "$this$groupBy");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      byte[] var2 = $this$groupBy_u2dJOV_ifY;
      Map var3 = (Map)(new LinkedHashMap());
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$groupBy_u2dJOV_ifY); var4 < var5; ++var4) {
         byte var6 = UByteArray.get-w2LRezQ(var2, var4);
         Object var7 = keySelector.invoke(UByte.box-impl(var6));
         Object var10000 = var3.get(var7);
         if (var10000 == null) {
            List var9 = (List)(new ArrayList());
            var3.put(var7, var9);
            var10000 = var9;
         }

         ((List)var10000).add(UByte.box-impl(var6));
      }

      return var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K> Map<K, List<UShort>> groupBy_xTcfx_M/* $FF was: groupBy-xTcfx_M*/(short[] $this$groupBy_u2dxTcfx_M, Function1<? super UShort, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupBy_u2dxTcfx_M, "$this$groupBy");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      short[] var2 = $this$groupBy_u2dxTcfx_M;
      Map var3 = (Map)(new LinkedHashMap());
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$groupBy_u2dxTcfx_M); var4 < var5; ++var4) {
         short var6 = UShortArray.get-Mh2AYeg(var2, var4);
         Object var7 = keySelector.invoke(UShort.box-impl(var6));
         Object var10000 = var3.get(var7);
         if (var10000 == null) {
            List var9 = (List)(new ArrayList());
            var3.put(var7, var9);
            var10000 = var9;
         }

         ((List)var10000).add(UShort.box-impl(var6));
      }

      return var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K, V> Map<K, List<V>> groupBy_L4rlFek/* $FF was: groupBy-L4rlFek*/(int[] $this$groupBy_u2dL4rlFek, Function1<? super UInt, ? extends K> keySelector, Function1<? super UInt, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$groupBy_u2dL4rlFek, "$this$groupBy");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int[] var3 = $this$groupBy_u2dL4rlFek;
      Map var4 = (Map)(new LinkedHashMap());
      int var5 = 0;

      for(int var6 = UIntArray.getSize-impl($this$groupBy_u2dL4rlFek); var5 < var6; ++var5) {
         int var7 = UIntArray.get-pVg5ArA(var3, var5);
         Object var8 = keySelector.invoke(UInt.box-impl(var7));
         Object var10000 = var4.get(var8);
         if (var10000 == null) {
            List var10 = (List)(new ArrayList());
            var4.put(var8, var10);
            var10000 = var10;
         }

         ((List)var10000).add(valueTransform.invoke(UInt.box-impl(var7)));
      }

      return var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K, V> Map<K, List<V>> groupBy___j2Y_Q/* $FF was: groupBy--_j2Y-Q*/(long[] $this$groupBy_u2d_u2d_j2Y_u2dQ, Function1<? super ULong, ? extends K> keySelector, Function1<? super ULong, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$groupBy_u2d_u2d_j2Y_u2dQ, "$this$groupBy");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      long[] var3 = $this$groupBy_u2d_u2d_j2Y_u2dQ;
      Map var4 = (Map)(new LinkedHashMap());
      int var5 = 0;

      for(int var6 = ULongArray.getSize-impl($this$groupBy_u2d_u2d_j2Y_u2dQ); var5 < var6; ++var5) {
         long var7 = ULongArray.get-s-VKNKU(var3, var5);
         Object var9 = keySelector.invoke(ULong.box-impl(var7));
         Object var10000 = var4.get(var9);
         if (var10000 == null) {
            List var11 = (List)(new ArrayList());
            var4.put(var9, var11);
            var10000 = var11;
         }

         ((List)var10000).add(valueTransform.invoke(ULong.box-impl(var7)));
      }

      return var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K, V> Map<K, List<V>> groupBy_bBsjw1Y/* $FF was: groupBy-bBsjw1Y*/(byte[] $this$groupBy_u2dbBsjw1Y, Function1<? super UByte, ? extends K> keySelector, Function1<? super UByte, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$groupBy_u2dbBsjw1Y, "$this$groupBy");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      byte[] var3 = $this$groupBy_u2dbBsjw1Y;
      Map var4 = (Map)(new LinkedHashMap());
      int var5 = 0;

      for(int var6 = UByteArray.getSize-impl($this$groupBy_u2dbBsjw1Y); var5 < var6; ++var5) {
         byte var7 = UByteArray.get-w2LRezQ(var3, var5);
         Object var8 = keySelector.invoke(UByte.box-impl(var7));
         Object var10000 = var4.get(var8);
         if (var10000 == null) {
            List var10 = (List)(new ArrayList());
            var4.put(var8, var10);
            var10000 = var10;
         }

         ((List)var10000).add(valueTransform.invoke(UByte.box-impl(var7)));
      }

      return var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K, V> Map<K, List<V>> groupBy_3bBvP4M/* $FF was: groupBy-3bBvP4M*/(short[] $this$groupBy_u2d3bBvP4M, Function1<? super UShort, ? extends K> keySelector, Function1<? super UShort, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$groupBy_u2d3bBvP4M, "$this$groupBy");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      short[] var3 = $this$groupBy_u2d3bBvP4M;
      Map var4 = (Map)(new LinkedHashMap());
      int var5 = 0;

      for(int var6 = UShortArray.getSize-impl($this$groupBy_u2d3bBvP4M); var5 < var6; ++var5) {
         short var7 = UShortArray.get-Mh2AYeg(var3, var5);
         Object var8 = keySelector.invoke(UShort.box-impl(var7));
         Object var10000 = var4.get(var8);
         if (var10000 == null) {
            List var10 = (List)(new ArrayList());
            var4.put(var8, var10);
            var10000 = var10;
         }

         ((List)var10000).add(valueTransform.invoke(UShort.box-impl(var7)));
      }

      return var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K, M extends Map<? super K, List<UInt>>> M groupByTo_4D70W2E/* $FF was: groupByTo-4D70W2E*/(int[] $this$groupByTo_u2d4D70W2E, M destination, Function1<? super UInt, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupByTo_u2d4D70W2E, "$this$groupByTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int var3 = 0;

      for(int var4 = UIntArray.getSize-impl($this$groupByTo_u2d4D70W2E); var3 < var4; ++var3) {
         int element = UIntArray.get-pVg5ArA($this$groupByTo_u2d4D70W2E, var3);
         Object key = keySelector.invoke(UInt.box-impl(element));
         int $i$f$getOrPut = false;
         Object value$iv = destination.get(key);
         Object var10000;
         if (value$iv == null) {
            int var11 = false;
            Object answer$iv = (List)(new ArrayList());
            destination.put(key, answer$iv);
            var10000 = answer$iv;
         } else {
            var10000 = value$iv;
         }

         List list = (List)var10000;
         list.add(UInt.box-impl(element));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K, M extends Map<? super K, List<ULong>>> M groupByTo_X6OPwNk/* $FF was: groupByTo-X6OPwNk*/(long[] $this$groupByTo_u2dX6OPwNk, M destination, Function1<? super ULong, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupByTo_u2dX6OPwNk, "$this$groupByTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int var3 = 0;

      for(int var4 = ULongArray.getSize-impl($this$groupByTo_u2dX6OPwNk); var3 < var4; ++var3) {
         long element = ULongArray.get-s-VKNKU($this$groupByTo_u2dX6OPwNk, var3);
         Object key = keySelector.invoke(ULong.box-impl(element));
         int $i$f$getOrPut = false;
         Object value$iv = destination.get(key);
         Object var10000;
         if (value$iv == null) {
            int var12 = false;
            Object answer$iv = (List)(new ArrayList());
            destination.put(key, answer$iv);
            var10000 = answer$iv;
         } else {
            var10000 = value$iv;
         }

         List list = (List)var10000;
         list.add(ULong.box-impl(element));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K, M extends Map<? super K, List<UByte>>> M groupByTo_H21X9dk/* $FF was: groupByTo-H21X9dk*/(byte[] $this$groupByTo_u2dH21X9dk, M destination, Function1<? super UByte, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupByTo_u2dH21X9dk, "$this$groupByTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$groupByTo_u2dH21X9dk); var3 < var4; ++var3) {
         byte element = UByteArray.get-w2LRezQ($this$groupByTo_u2dH21X9dk, var3);
         Object key = keySelector.invoke(UByte.box-impl(element));
         int $i$f$getOrPut = false;
         Object value$iv = destination.get(key);
         Object var10000;
         if (value$iv == null) {
            int var11 = false;
            Object answer$iv = (List)(new ArrayList());
            destination.put(key, answer$iv);
            var10000 = answer$iv;
         } else {
            var10000 = value$iv;
         }

         List list = (List)var10000;
         list.add(UByte.box-impl(element));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K, M extends Map<? super K, List<UShort>>> M groupByTo_ciTST_8/* $FF was: groupByTo-ciTST-8*/(short[] $this$groupByTo_u2dciTST_u2d8, M destination, Function1<? super UShort, ? extends K> keySelector) {
      Intrinsics.checkNotNullParameter($this$groupByTo_u2dciTST_u2d8, "$this$groupByTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$groupByTo_u2dciTST_u2d8); var3 < var4; ++var3) {
         short element = UShortArray.get-Mh2AYeg($this$groupByTo_u2dciTST_u2d8, var3);
         Object key = keySelector.invoke(UShort.box-impl(element));
         int $i$f$getOrPut = false;
         Object value$iv = destination.get(key);
         Object var10000;
         if (value$iv == null) {
            int var11 = false;
            Object answer$iv = (List)(new ArrayList());
            destination.put(key, answer$iv);
            var10000 = answer$iv;
         } else {
            var10000 = value$iv;
         }

         List list = (List)var10000;
         list.add(UShort.box-impl(element));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K, V, M extends Map<? super K, List<V>>> M groupByTo_JM6gNCM/* $FF was: groupByTo-JM6gNCM*/(int[] $this$groupByTo_u2dJM6gNCM, M destination, Function1<? super UInt, ? extends K> keySelector, Function1<? super UInt, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$groupByTo_u2dJM6gNCM, "$this$groupByTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$groupByTo_u2dJM6gNCM); var4 < var5; ++var4) {
         int element = UIntArray.get-pVg5ArA($this$groupByTo_u2dJM6gNCM, var4);
         Object key = keySelector.invoke(UInt.box-impl(element));
         int $i$f$getOrPut = false;
         Object value$iv = destination.get(key);
         Object var10000;
         if (value$iv == null) {
            int var12 = false;
            Object answer$iv = (List)(new ArrayList());
            destination.put(key, answer$iv);
            var10000 = answer$iv;
         } else {
            var10000 = value$iv;
         }

         List list = (List)var10000;
         list.add(valueTransform.invoke(UInt.box-impl(element)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K, V, M extends Map<? super K, List<V>>> M groupByTo_QxgOkWg/* $FF was: groupByTo-QxgOkWg*/(long[] $this$groupByTo_u2dQxgOkWg, M destination, Function1<? super ULong, ? extends K> keySelector, Function1<? super ULong, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$groupByTo_u2dQxgOkWg, "$this$groupByTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$groupByTo_u2dQxgOkWg); var4 < var5; ++var4) {
         long element = ULongArray.get-s-VKNKU($this$groupByTo_u2dQxgOkWg, var4);
         Object key = keySelector.invoke(ULong.box-impl(element));
         int $i$f$getOrPut = false;
         Object value$iv = destination.get(key);
         Object var10000;
         if (value$iv == null) {
            int var13 = false;
            Object answer$iv = (List)(new ArrayList());
            destination.put(key, answer$iv);
            var10000 = answer$iv;
         } else {
            var10000 = value$iv;
         }

         List list = (List)var10000;
         list.add(valueTransform.invoke(ULong.box-impl(element)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K, V, M extends Map<? super K, List<V>>> M groupByTo_qOZmbk8/* $FF was: groupByTo-qOZmbk8*/(byte[] $this$groupByTo_u2dqOZmbk8, M destination, Function1<? super UByte, ? extends K> keySelector, Function1<? super UByte, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$groupByTo_u2dqOZmbk8, "$this$groupByTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$groupByTo_u2dqOZmbk8); var4 < var5; ++var4) {
         byte element = UByteArray.get-w2LRezQ($this$groupByTo_u2dqOZmbk8, var4);
         Object key = keySelector.invoke(UByte.box-impl(element));
         int $i$f$getOrPut = false;
         Object value$iv = destination.get(key);
         Object var10000;
         if (value$iv == null) {
            int var12 = false;
            Object answer$iv = (List)(new ArrayList());
            destination.put(key, answer$iv);
            var10000 = answer$iv;
         } else {
            var10000 = value$iv;
         }

         List list = (List)var10000;
         list.add(valueTransform.invoke(UByte.box-impl(element)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <K, V, M extends Map<? super K, List<V>>> M groupByTo_q8RuPII/* $FF was: groupByTo-q8RuPII*/(short[] $this$groupByTo_u2dq8RuPII, M destination, Function1<? super UShort, ? extends K> keySelector, Function1<? super UShort, ? extends V> valueTransform) {
      Intrinsics.checkNotNullParameter($this$groupByTo_u2dq8RuPII, "$this$groupByTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(keySelector, "keySelector");
      Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$groupByTo_u2dq8RuPII); var4 < var5; ++var4) {
         short element = UShortArray.get-Mh2AYeg($this$groupByTo_u2dq8RuPII, var4);
         Object key = keySelector.invoke(UShort.box-impl(element));
         int $i$f$getOrPut = false;
         Object value$iv = destination.get(key);
         Object var10000;
         if (value$iv == null) {
            int var12 = false;
            Object answer$iv = (List)(new ArrayList());
            destination.put(key, answer$iv);
            var10000 = answer$iv;
         } else {
            var10000 = value$iv;
         }

         List list = (List)var10000;
         list.add(valueTransform.invoke(UShort.box-impl(element)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> map_jgv0xPQ/* $FF was: map-jgv0xPQ*/(int[] $this$map_u2djgv0xPQ, Function1<? super UInt, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$map_u2djgv0xPQ, "$this$map");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int[] var2 = $this$map_u2djgv0xPQ;
      Collection var3 = (Collection)(new ArrayList(UIntArray.getSize-impl($this$map_u2djgv0xPQ)));
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$map_u2djgv0xPQ); var4 < var5; ++var4) {
         int var6 = UIntArray.get-pVg5ArA(var2, var4);
         var3.add(transform.invoke(UInt.box-impl(var6)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> map_MShoTSo/* $FF was: map-MShoTSo*/(long[] $this$map_u2dMShoTSo, Function1<? super ULong, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$map_u2dMShoTSo, "$this$map");
      Intrinsics.checkNotNullParameter(transform, "transform");
      long[] var2 = $this$map_u2dMShoTSo;
      Collection var3 = (Collection)(new ArrayList(ULongArray.getSize-impl($this$map_u2dMShoTSo)));
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$map_u2dMShoTSo); var4 < var5; ++var4) {
         long var6 = ULongArray.get-s-VKNKU(var2, var4);
         var3.add(transform.invoke(ULong.box-impl(var6)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> map_JOV_ifY/* $FF was: map-JOV_ifY*/(byte[] $this$map_u2dJOV_ifY, Function1<? super UByte, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$map_u2dJOV_ifY, "$this$map");
      Intrinsics.checkNotNullParameter(transform, "transform");
      byte[] var2 = $this$map_u2dJOV_ifY;
      Collection var3 = (Collection)(new ArrayList(UByteArray.getSize-impl($this$map_u2dJOV_ifY)));
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$map_u2dJOV_ifY); var4 < var5; ++var4) {
         byte var6 = UByteArray.get-w2LRezQ(var2, var4);
         var3.add(transform.invoke(UByte.box-impl(var6)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> map_xTcfx_M/* $FF was: map-xTcfx_M*/(short[] $this$map_u2dxTcfx_M, Function1<? super UShort, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$map_u2dxTcfx_M, "$this$map");
      Intrinsics.checkNotNullParameter(transform, "transform");
      short[] var2 = $this$map_u2dxTcfx_M;
      Collection var3 = (Collection)(new ArrayList(UShortArray.getSize-impl($this$map_u2dxTcfx_M)));
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$map_u2dxTcfx_M); var4 < var5; ++var4) {
         short var6 = UShortArray.get-Mh2AYeg(var2, var4);
         var3.add(transform.invoke(UShort.box-impl(var6)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> mapIndexed_WyvcNBI/* $FF was: mapIndexed-WyvcNBI*/(int[] $this$mapIndexed_u2dWyvcNBI, Function2<? super Integer, ? super UInt, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexed_u2dWyvcNBI, "$this$mapIndexed");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int[] var2 = $this$mapIndexed_u2dWyvcNBI;
      Collection var3 = (Collection)(new ArrayList(UIntArray.getSize-impl($this$mapIndexed_u2dWyvcNBI)));
      int var4 = 0;
      int var5 = 0;

      for(int var6 = UIntArray.getSize-impl($this$mapIndexed_u2dWyvcNBI); var5 < var6; ++var5) {
         int var7 = UIntArray.get-pVg5ArA(var2, var5);
         var3.add(transform.invoke(var4++, UInt.box-impl(var7)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> mapIndexed_s8dVfGU/* $FF was: mapIndexed-s8dVfGU*/(long[] $this$mapIndexed_u2ds8dVfGU, Function2<? super Integer, ? super ULong, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexed_u2ds8dVfGU, "$this$mapIndexed");
      Intrinsics.checkNotNullParameter(transform, "transform");
      long[] var2 = $this$mapIndexed_u2ds8dVfGU;
      Collection var3 = (Collection)(new ArrayList(ULongArray.getSize-impl($this$mapIndexed_u2ds8dVfGU)));
      int var4 = 0;
      int var5 = 0;

      for(int var6 = ULongArray.getSize-impl($this$mapIndexed_u2ds8dVfGU); var5 < var6; ++var5) {
         long var7 = ULongArray.get-s-VKNKU(var2, var5);
         var3.add(transform.invoke(var4++, ULong.box-impl(var7)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> mapIndexed_ELGow60/* $FF was: mapIndexed-ELGow60*/(byte[] $this$mapIndexed_u2dELGow60, Function2<? super Integer, ? super UByte, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexed_u2dELGow60, "$this$mapIndexed");
      Intrinsics.checkNotNullParameter(transform, "transform");
      byte[] var2 = $this$mapIndexed_u2dELGow60;
      Collection var3 = (Collection)(new ArrayList(UByteArray.getSize-impl($this$mapIndexed_u2dELGow60)));
      int var4 = 0;
      int var5 = 0;

      for(int var6 = UByteArray.getSize-impl($this$mapIndexed_u2dELGow60); var5 < var6; ++var5) {
         byte var7 = UByteArray.get-w2LRezQ(var2, var5);
         var3.add(transform.invoke(var4++, UByte.box-impl(var7)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> mapIndexed_xzaTVY8/* $FF was: mapIndexed-xzaTVY8*/(short[] $this$mapIndexed_u2dxzaTVY8, Function2<? super Integer, ? super UShort, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexed_u2dxzaTVY8, "$this$mapIndexed");
      Intrinsics.checkNotNullParameter(transform, "transform");
      short[] var2 = $this$mapIndexed_u2dxzaTVY8;
      Collection var3 = (Collection)(new ArrayList(UShortArray.getSize-impl($this$mapIndexed_u2dxzaTVY8)));
      int var4 = 0;
      int var5 = 0;

      for(int var6 = UShortArray.getSize-impl($this$mapIndexed_u2dxzaTVY8); var5 < var6; ++var5) {
         short var7 = UShortArray.get-Mh2AYeg(var2, var5);
         var3.add(transform.invoke(var4++, UShort.box-impl(var7)));
      }

      return (List)var3;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C mapIndexedTo__6EtJGI/* $FF was: mapIndexedTo--6EtJGI*/(int[] $this$mapIndexedTo_u2d_u2d6EtJGI, C destination, Function2<? super Integer, ? super UInt, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexedTo_u2d_u2d6EtJGI, "$this$mapIndexedTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int index = 0;
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$mapIndexedTo_u2d_u2d6EtJGI); var4 < var5; ++var4) {
         int item = UIntArray.get-pVg5ArA($this$mapIndexedTo_u2d_u2d6EtJGI, var4);
         destination.add(transform.invoke(index++, UInt.box-impl(item)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C mapIndexedTo_pe2Q0Dw/* $FF was: mapIndexedTo-pe2Q0Dw*/(long[] $this$mapIndexedTo_u2dpe2Q0Dw, C destination, Function2<? super Integer, ? super ULong, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexedTo_u2dpe2Q0Dw, "$this$mapIndexedTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int index = 0;
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$mapIndexedTo_u2dpe2Q0Dw); var4 < var5; ++var4) {
         long item = ULongArray.get-s-VKNKU($this$mapIndexedTo_u2dpe2Q0Dw, var4);
         destination.add(transform.invoke(index++, ULong.box-impl(item)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C mapIndexedTo_eNpIKz8/* $FF was: mapIndexedTo-eNpIKz8*/(byte[] $this$mapIndexedTo_u2deNpIKz8, C destination, Function2<? super Integer, ? super UByte, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexedTo_u2deNpIKz8, "$this$mapIndexedTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int index = 0;
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$mapIndexedTo_u2deNpIKz8); var4 < var5; ++var4) {
         byte item = UByteArray.get-w2LRezQ($this$mapIndexedTo_u2deNpIKz8, var4);
         destination.add(transform.invoke(index++, UByte.box-impl(item)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C mapIndexedTo_QqktQ3k/* $FF was: mapIndexedTo-QqktQ3k*/(short[] $this$mapIndexedTo_u2dQqktQ3k, C destination, Function2<? super Integer, ? super UShort, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapIndexedTo_u2dQqktQ3k, "$this$mapIndexedTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int index = 0;
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$mapIndexedTo_u2dQqktQ3k); var4 < var5; ++var4) {
         short item = UShortArray.get-Mh2AYeg($this$mapIndexedTo_u2dQqktQ3k, var4);
         destination.add(transform.invoke(index++, UShort.box-impl(item)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C mapTo_wU5IKMo/* $FF was: mapTo-wU5IKMo*/(int[] $this$mapTo_u2dwU5IKMo, C destination, Function1<? super UInt, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapTo_u2dwU5IKMo, "$this$mapTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int var3 = 0;

      for(int var4 = UIntArray.getSize-impl($this$mapTo_u2dwU5IKMo); var3 < var4; ++var3) {
         int item = UIntArray.get-pVg5ArA($this$mapTo_u2dwU5IKMo, var3);
         destination.add(transform.invoke(UInt.box-impl(item)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C mapTo_HqK1JgA/* $FF was: mapTo-HqK1JgA*/(long[] $this$mapTo_u2dHqK1JgA, C destination, Function1<? super ULong, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapTo_u2dHqK1JgA, "$this$mapTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int var3 = 0;

      for(int var4 = ULongArray.getSize-impl($this$mapTo_u2dHqK1JgA); var3 < var4; ++var3) {
         long item = ULongArray.get-s-VKNKU($this$mapTo_u2dHqK1JgA, var3);
         destination.add(transform.invoke(ULong.box-impl(item)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C mapTo_wzUQCXU/* $FF was: mapTo-wzUQCXU*/(byte[] $this$mapTo_u2dwzUQCXU, C destination, Function1<? super UByte, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapTo_u2dwzUQCXU, "$this$mapTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$mapTo_u2dwzUQCXU); var3 < var4; ++var3) {
         byte item = UByteArray.get-w2LRezQ($this$mapTo_u2dwzUQCXU, var3);
         destination.add(transform.invoke(UByte.box-impl(item)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, C extends Collection<? super R>> C mapTo_oEOeDjA/* $FF was: mapTo-oEOeDjA*/(short[] $this$mapTo_u2doEOeDjA, C destination, Function1<? super UShort, ? extends R> transform) {
      Intrinsics.checkNotNullParameter($this$mapTo_u2doEOeDjA, "$this$mapTo");
      Intrinsics.checkNotNullParameter(destination, "destination");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$mapTo_u2doEOeDjA); var3 < var4; ++var3) {
         short item = UShortArray.get-Mh2AYeg($this$mapTo_u2doEOeDjA, var3);
         destination.add(transform.invoke(UShort.box-impl(item)));
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final Iterable<IndexedValue<UInt>> withIndex__ajY_9A/* $FF was: withIndex--ajY-9A*/(@NotNull int[] $this$withIndex_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$withIndex_u2d_u2dajY_u2d9A, "$this$withIndex");
      return (Iterable)(new IndexingIterable(UArraysKt___UArraysKt::withIndex__ajY_9A$lambda$56$UArraysKt___UArraysKt));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final Iterable<IndexedValue<ULong>> withIndex_QwZRm1k/* $FF was: withIndex-QwZRm1k*/(@NotNull long[] $this$withIndex_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$withIndex_u2dQwZRm1k, "$this$withIndex");
      return (Iterable)(new IndexingIterable(UArraysKt___UArraysKt::withIndex_QwZRm1k$lambda$57$UArraysKt___UArraysKt));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final Iterable<IndexedValue<UByte>> withIndex_GBYM_sE/* $FF was: withIndex-GBYM_sE*/(@NotNull byte[] $this$withIndex_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$withIndex_u2dGBYM_sE, "$this$withIndex");
      return (Iterable)(new IndexingIterable(UArraysKt___UArraysKt::withIndex_GBYM_sE$lambda$58$UArraysKt___UArraysKt));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final Iterable<IndexedValue<UShort>> withIndex_rL5Bavg/* $FF was: withIndex-rL5Bavg*/(@NotNull short[] $this$withIndex_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$withIndex_u2drL5Bavg, "$this$withIndex");
      return (Iterable)(new IndexingIterable(UArraysKt___UArraysKt::withIndex_rL5Bavg$lambda$59$UArraysKt___UArraysKt));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean all_jgv0xPQ/* $FF was: all-jgv0xPQ*/(int[] $this$all_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$all_u2djgv0xPQ, "$this$all");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UIntArray.getSize-impl($this$all_u2djgv0xPQ); var2 < var3; ++var2) {
         int element = UIntArray.get-pVg5ArA($this$all_u2djgv0xPQ, var2);
         if (!(Boolean)predicate.invoke(UInt.box-impl(element))) {
            return false;
         }
      }

      return true;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean all_MShoTSo/* $FF was: all-MShoTSo*/(long[] $this$all_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$all_u2dMShoTSo, "$this$all");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = ULongArray.getSize-impl($this$all_u2dMShoTSo); var2 < var3; ++var2) {
         long element = ULongArray.get-s-VKNKU($this$all_u2dMShoTSo, var2);
         if (!(Boolean)predicate.invoke(ULong.box-impl(element))) {
            return false;
         }
      }

      return true;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean all_JOV_ifY/* $FF was: all-JOV_ifY*/(byte[] $this$all_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$all_u2dJOV_ifY, "$this$all");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UByteArray.getSize-impl($this$all_u2dJOV_ifY); var2 < var3; ++var2) {
         byte element = UByteArray.get-w2LRezQ($this$all_u2dJOV_ifY, var2);
         if (!(Boolean)predicate.invoke(UByte.box-impl(element))) {
            return false;
         }
      }

      return true;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean all_xTcfx_M/* $FF was: all-xTcfx_M*/(short[] $this$all_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$all_u2dxTcfx_M, "$this$all");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UShortArray.getSize-impl($this$all_u2dxTcfx_M); var2 < var3; ++var2) {
         short element = UShortArray.get-Mh2AYeg($this$all_u2dxTcfx_M, var2);
         if (!(Boolean)predicate.invoke(UShort.box-impl(element))) {
            return false;
         }
      }

      return true;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean any__ajY_9A/* $FF was: any--ajY-9A*/(int[] $this$any_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$any_u2d_u2dajY_u2d9A, "$this$any");
      return ArraysKt.any($this$any_u2d_u2dajY_u2d9A);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean any_QwZRm1k/* $FF was: any-QwZRm1k*/(long[] $this$any_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$any_u2dQwZRm1k, "$this$any");
      return ArraysKt.any($this$any_u2dQwZRm1k);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean any_GBYM_sE/* $FF was: any-GBYM_sE*/(byte[] $this$any_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$any_u2dGBYM_sE, "$this$any");
      return ArraysKt.any($this$any_u2dGBYM_sE);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean any_rL5Bavg/* $FF was: any-rL5Bavg*/(short[] $this$any_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$any_u2drL5Bavg, "$this$any");
      return ArraysKt.any($this$any_u2drL5Bavg);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean any_jgv0xPQ/* $FF was: any-jgv0xPQ*/(int[] $this$any_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$any_u2djgv0xPQ, "$this$any");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UIntArray.getSize-impl($this$any_u2djgv0xPQ); var2 < var3; ++var2) {
         int element = UIntArray.get-pVg5ArA($this$any_u2djgv0xPQ, var2);
         if ((Boolean)predicate.invoke(UInt.box-impl(element))) {
            return true;
         }
      }

      return false;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean any_MShoTSo/* $FF was: any-MShoTSo*/(long[] $this$any_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$any_u2dMShoTSo, "$this$any");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = ULongArray.getSize-impl($this$any_u2dMShoTSo); var2 < var3; ++var2) {
         long element = ULongArray.get-s-VKNKU($this$any_u2dMShoTSo, var2);
         if ((Boolean)predicate.invoke(ULong.box-impl(element))) {
            return true;
         }
      }

      return false;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean any_JOV_ifY/* $FF was: any-JOV_ifY*/(byte[] $this$any_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$any_u2dJOV_ifY, "$this$any");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UByteArray.getSize-impl($this$any_u2dJOV_ifY); var2 < var3; ++var2) {
         byte element = UByteArray.get-w2LRezQ($this$any_u2dJOV_ifY, var2);
         if ((Boolean)predicate.invoke(UByte.box-impl(element))) {
            return true;
         }
      }

      return false;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean any_xTcfx_M/* $FF was: any-xTcfx_M*/(short[] $this$any_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$any_u2dxTcfx_M, "$this$any");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UShortArray.getSize-impl($this$any_u2dxTcfx_M); var2 < var3; ++var2) {
         short element = UShortArray.get-Mh2AYeg($this$any_u2dxTcfx_M, var2);
         if ((Boolean)predicate.invoke(UShort.box-impl(element))) {
            return true;
         }
      }

      return false;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int count_jgv0xPQ/* $FF was: count-jgv0xPQ*/(int[] $this$count_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$count_u2djgv0xPQ, "$this$count");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int count = 0;
      int var3 = 0;

      for(int var4 = UIntArray.getSize-impl($this$count_u2djgv0xPQ); var3 < var4; ++var3) {
         int element = UIntArray.get-pVg5ArA($this$count_u2djgv0xPQ, var3);
         if ((Boolean)predicate.invoke(UInt.box-impl(element))) {
            ++count;
         }
      }

      return count;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int count_MShoTSo/* $FF was: count-MShoTSo*/(long[] $this$count_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$count_u2dMShoTSo, "$this$count");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int count = 0;
      int var3 = 0;

      for(int var4 = ULongArray.getSize-impl($this$count_u2dMShoTSo); var3 < var4; ++var3) {
         long element = ULongArray.get-s-VKNKU($this$count_u2dMShoTSo, var3);
         if ((Boolean)predicate.invoke(ULong.box-impl(element))) {
            ++count;
         }
      }

      return count;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int count_JOV_ifY/* $FF was: count-JOV_ifY*/(byte[] $this$count_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$count_u2dJOV_ifY, "$this$count");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int count = 0;
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$count_u2dJOV_ifY); var3 < var4; ++var3) {
         byte element = UByteArray.get-w2LRezQ($this$count_u2dJOV_ifY, var3);
         if ((Boolean)predicate.invoke(UByte.box-impl(element))) {
            ++count;
         }
      }

      return count;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int count_xTcfx_M/* $FF was: count-xTcfx_M*/(short[] $this$count_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$count_u2dxTcfx_M, "$this$count");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int count = 0;
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$count_u2dxTcfx_M); var3 < var4; ++var3) {
         short element = UShortArray.get-Mh2AYeg($this$count_u2dxTcfx_M, var3);
         if ((Boolean)predicate.invoke(UShort.box-impl(element))) {
            ++count;
         }
      }

      return count;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R fold_zi1B2BA/* $FF was: fold-zi1B2BA*/(int[] $this$fold_u2dzi1B2BA, R initial, Function2<? super R, ? super UInt, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$fold_u2dzi1B2BA, "$this$fold");
      Intrinsics.checkNotNullParameter(operation, "operation");
      Object accumulator = initial;
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$fold_u2dzi1B2BA); var4 < var5; ++var4) {
         int element = UIntArray.get-pVg5ArA($this$fold_u2dzi1B2BA, var4);
         accumulator = operation.invoke(accumulator, UInt.box-impl(element));
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R fold_A8wKCXQ/* $FF was: fold-A8wKCXQ*/(long[] $this$fold_u2dA8wKCXQ, R initial, Function2<? super R, ? super ULong, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$fold_u2dA8wKCXQ, "$this$fold");
      Intrinsics.checkNotNullParameter(operation, "operation");
      Object accumulator = initial;
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$fold_u2dA8wKCXQ); var4 < var5; ++var4) {
         long element = ULongArray.get-s-VKNKU($this$fold_u2dA8wKCXQ, var4);
         accumulator = operation.invoke(accumulator, ULong.box-impl(element));
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R fold_yXmHNn8/* $FF was: fold-yXmHNn8*/(byte[] $this$fold_u2dyXmHNn8, R initial, Function2<? super R, ? super UByte, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$fold_u2dyXmHNn8, "$this$fold");
      Intrinsics.checkNotNullParameter(operation, "operation");
      Object accumulator = initial;
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$fold_u2dyXmHNn8); var4 < var5; ++var4) {
         byte element = UByteArray.get-w2LRezQ($this$fold_u2dyXmHNn8, var4);
         accumulator = operation.invoke(accumulator, UByte.box-impl(element));
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R fold_zww5nb8/* $FF was: fold-zww5nb8*/(short[] $this$fold_u2dzww5nb8, R initial, Function2<? super R, ? super UShort, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$fold_u2dzww5nb8, "$this$fold");
      Intrinsics.checkNotNullParameter(operation, "operation");
      Object accumulator = initial;
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$fold_u2dzww5nb8); var4 < var5; ++var4) {
         short element = UShortArray.get-Mh2AYeg($this$fold_u2dzww5nb8, var4);
         accumulator = operation.invoke(accumulator, UShort.box-impl(element));
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R foldIndexed_yVwIW0Q/* $FF was: foldIndexed-yVwIW0Q*/(int[] $this$foldIndexed_u2dyVwIW0Q, R initial, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldIndexed_u2dyVwIW0Q, "$this$foldIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int index = 0;
      Object accumulator = initial;
      int var5 = 0;

      for(int var6 = UIntArray.getSize-impl($this$foldIndexed_u2dyVwIW0Q); var5 < var6; ++var5) {
         int element = UIntArray.get-pVg5ArA($this$foldIndexed_u2dyVwIW0Q, var5);
         accumulator = operation.invoke(index++, accumulator, UInt.box-impl(element));
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R foldIndexed_mwnnOCs/* $FF was: foldIndexed-mwnnOCs*/(long[] $this$foldIndexed_u2dmwnnOCs, R initial, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldIndexed_u2dmwnnOCs, "$this$foldIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int index = 0;
      Object accumulator = initial;
      int var5 = 0;

      for(int var6 = ULongArray.getSize-impl($this$foldIndexed_u2dmwnnOCs); var5 < var6; ++var5) {
         long element = ULongArray.get-s-VKNKU($this$foldIndexed_u2dmwnnOCs, var5);
         accumulator = operation.invoke(index++, accumulator, ULong.box-impl(element));
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R foldIndexed_3iWJZGE/* $FF was: foldIndexed-3iWJZGE*/(byte[] $this$foldIndexed_u2d3iWJZGE, R initial, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldIndexed_u2d3iWJZGE, "$this$foldIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int index = 0;
      Object accumulator = initial;
      int var5 = 0;

      for(int var6 = UByteArray.getSize-impl($this$foldIndexed_u2d3iWJZGE); var5 < var6; ++var5) {
         byte element = UByteArray.get-w2LRezQ($this$foldIndexed_u2d3iWJZGE, var5);
         accumulator = operation.invoke(index++, accumulator, UByte.box-impl(element));
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R foldIndexed_bzxtMww/* $FF was: foldIndexed-bzxtMww*/(short[] $this$foldIndexed_u2dbzxtMww, R initial, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldIndexed_u2dbzxtMww, "$this$foldIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int index = 0;
      Object accumulator = initial;
      int var5 = 0;

      for(int var6 = UShortArray.getSize-impl($this$foldIndexed_u2dbzxtMww); var5 < var6; ++var5) {
         short element = UShortArray.get-Mh2AYeg($this$foldIndexed_u2dbzxtMww, var5);
         accumulator = operation.invoke(index++, accumulator, UShort.box-impl(element));
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R foldRight_zi1B2BA/* $FF was: foldRight-zi1B2BA*/(int[] $this$foldRight_u2dzi1B2BA, R initial, Function2<? super UInt, ? super R, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldRight_u2dzi1B2BA, "$this$foldRight");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var5 = false;
      int index = ArraysKt.getLastIndex($this$foldRight_u2dzi1B2BA);

      Object accumulator;
      for(accumulator = initial; index >= 0; accumulator = operation.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$foldRight_u2dzi1B2BA, index--)), accumulator)) {
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R foldRight_A8wKCXQ/* $FF was: foldRight-A8wKCXQ*/(long[] $this$foldRight_u2dA8wKCXQ, R initial, Function2<? super ULong, ? super R, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldRight_u2dA8wKCXQ, "$this$foldRight");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var5 = false;
      int index = ArraysKt.getLastIndex($this$foldRight_u2dA8wKCXQ);

      Object accumulator;
      for(accumulator = initial; index >= 0; accumulator = operation.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$foldRight_u2dA8wKCXQ, index--)), accumulator)) {
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R foldRight_yXmHNn8/* $FF was: foldRight-yXmHNn8*/(byte[] $this$foldRight_u2dyXmHNn8, R initial, Function2<? super UByte, ? super R, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldRight_u2dyXmHNn8, "$this$foldRight");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var5 = false;
      int index = ArraysKt.getLastIndex($this$foldRight_u2dyXmHNn8);

      Object accumulator;
      for(accumulator = initial; index >= 0; accumulator = operation.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$foldRight_u2dyXmHNn8, index--)), accumulator)) {
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R foldRight_zww5nb8/* $FF was: foldRight-zww5nb8*/(short[] $this$foldRight_u2dzww5nb8, R initial, Function2<? super UShort, ? super R, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldRight_u2dzww5nb8, "$this$foldRight");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var5 = false;
      int index = ArraysKt.getLastIndex($this$foldRight_u2dzww5nb8);

      Object accumulator;
      for(accumulator = initial; index >= 0; accumulator = operation.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$foldRight_u2dzww5nb8, index--)), accumulator)) {
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R foldRightIndexed_yVwIW0Q/* $FF was: foldRightIndexed-yVwIW0Q*/(int[] $this$foldRightIndexed_u2dyVwIW0Q, R initial, Function3<? super Integer, ? super UInt, ? super R, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldRightIndexed_u2dyVwIW0Q, "$this$foldRightIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var5 = false;
      int index = ArraysKt.getLastIndex($this$foldRightIndexed_u2dyVwIW0Q);

      Object accumulator;
      for(accumulator = initial; index >= 0; --index) {
         accumulator = operation.invoke(index, UInt.box-impl(UIntArray.get-pVg5ArA($this$foldRightIndexed_u2dyVwIW0Q, index)), accumulator);
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R foldRightIndexed_mwnnOCs/* $FF was: foldRightIndexed-mwnnOCs*/(long[] $this$foldRightIndexed_u2dmwnnOCs, R initial, Function3<? super Integer, ? super ULong, ? super R, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldRightIndexed_u2dmwnnOCs, "$this$foldRightIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var5 = false;
      int index = ArraysKt.getLastIndex($this$foldRightIndexed_u2dmwnnOCs);

      Object accumulator;
      for(accumulator = initial; index >= 0; --index) {
         accumulator = operation.invoke(index, ULong.box-impl(ULongArray.get-s-VKNKU($this$foldRightIndexed_u2dmwnnOCs, index)), accumulator);
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R foldRightIndexed_3iWJZGE/* $FF was: foldRightIndexed-3iWJZGE*/(byte[] $this$foldRightIndexed_u2d3iWJZGE, R initial, Function3<? super Integer, ? super UByte, ? super R, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldRightIndexed_u2d3iWJZGE, "$this$foldRightIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var5 = false;
      int index = ArraysKt.getLastIndex($this$foldRightIndexed_u2d3iWJZGE);

      Object accumulator;
      for(accumulator = initial; index >= 0; --index) {
         accumulator = operation.invoke(index, UByte.box-impl(UByteArray.get-w2LRezQ($this$foldRightIndexed_u2d3iWJZGE, index)), accumulator);
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R foldRightIndexed_bzxtMww/* $FF was: foldRightIndexed-bzxtMww*/(short[] $this$foldRightIndexed_u2dbzxtMww, R initial, Function3<? super Integer, ? super UShort, ? super R, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$foldRightIndexed_u2dbzxtMww, "$this$foldRightIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var5 = false;
      int index = ArraysKt.getLastIndex($this$foldRightIndexed_u2dbzxtMww);

      Object accumulator;
      for(accumulator = initial; index >= 0; --index) {
         accumulator = operation.invoke(index, UShort.box-impl(UShortArray.get-Mh2AYeg($this$foldRightIndexed_u2dbzxtMww, index)), accumulator);
      }

      return accumulator;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void forEach_jgv0xPQ/* $FF was: forEach-jgv0xPQ*/(int[] $this$forEach_u2djgv0xPQ, Function1<? super UInt, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEach_u2djgv0xPQ, "$this$forEach");
      Intrinsics.checkNotNullParameter(action, "action");
      int var2 = 0;

      for(int var3 = UIntArray.getSize-impl($this$forEach_u2djgv0xPQ); var2 < var3; ++var2) {
         int element = UIntArray.get-pVg5ArA($this$forEach_u2djgv0xPQ, var2);
         action.invoke(UInt.box-impl(element));
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void forEach_MShoTSo/* $FF was: forEach-MShoTSo*/(long[] $this$forEach_u2dMShoTSo, Function1<? super ULong, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEach_u2dMShoTSo, "$this$forEach");
      Intrinsics.checkNotNullParameter(action, "action");
      int var2 = 0;

      for(int var3 = ULongArray.getSize-impl($this$forEach_u2dMShoTSo); var2 < var3; ++var2) {
         long element = ULongArray.get-s-VKNKU($this$forEach_u2dMShoTSo, var2);
         action.invoke(ULong.box-impl(element));
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void forEach_JOV_ifY/* $FF was: forEach-JOV_ifY*/(byte[] $this$forEach_u2dJOV_ifY, Function1<? super UByte, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEach_u2dJOV_ifY, "$this$forEach");
      Intrinsics.checkNotNullParameter(action, "action");
      int var2 = 0;

      for(int var3 = UByteArray.getSize-impl($this$forEach_u2dJOV_ifY); var2 < var3; ++var2) {
         byte element = UByteArray.get-w2LRezQ($this$forEach_u2dJOV_ifY, var2);
         action.invoke(UByte.box-impl(element));
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void forEach_xTcfx_M/* $FF was: forEach-xTcfx_M*/(short[] $this$forEach_u2dxTcfx_M, Function1<? super UShort, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEach_u2dxTcfx_M, "$this$forEach");
      Intrinsics.checkNotNullParameter(action, "action");
      int var2 = 0;

      for(int var3 = UShortArray.getSize-impl($this$forEach_u2dxTcfx_M); var2 < var3; ++var2) {
         short element = UShortArray.get-Mh2AYeg($this$forEach_u2dxTcfx_M, var2);
         action.invoke(UShort.box-impl(element));
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void forEachIndexed_WyvcNBI/* $FF was: forEachIndexed-WyvcNBI*/(int[] $this$forEachIndexed_u2dWyvcNBI, Function2<? super Integer, ? super UInt, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEachIndexed_u2dWyvcNBI, "$this$forEachIndexed");
      Intrinsics.checkNotNullParameter(action, "action");
      int index = 0;
      int var3 = 0;

      for(int var4 = UIntArray.getSize-impl($this$forEachIndexed_u2dWyvcNBI); var3 < var4; ++var3) {
         int item = UIntArray.get-pVg5ArA($this$forEachIndexed_u2dWyvcNBI, var3);
         action.invoke(index++, UInt.box-impl(item));
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void forEachIndexed_s8dVfGU/* $FF was: forEachIndexed-s8dVfGU*/(long[] $this$forEachIndexed_u2ds8dVfGU, Function2<? super Integer, ? super ULong, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEachIndexed_u2ds8dVfGU, "$this$forEachIndexed");
      Intrinsics.checkNotNullParameter(action, "action");
      int index = 0;
      int var3 = 0;

      for(int var4 = ULongArray.getSize-impl($this$forEachIndexed_u2ds8dVfGU); var3 < var4; ++var3) {
         long item = ULongArray.get-s-VKNKU($this$forEachIndexed_u2ds8dVfGU, var3);
         action.invoke(index++, ULong.box-impl(item));
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void forEachIndexed_ELGow60/* $FF was: forEachIndexed-ELGow60*/(byte[] $this$forEachIndexed_u2dELGow60, Function2<? super Integer, ? super UByte, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEachIndexed_u2dELGow60, "$this$forEachIndexed");
      Intrinsics.checkNotNullParameter(action, "action");
      int index = 0;
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$forEachIndexed_u2dELGow60); var3 < var4; ++var3) {
         byte item = UByteArray.get-w2LRezQ($this$forEachIndexed_u2dELGow60, var3);
         action.invoke(index++, UByte.box-impl(item));
      }

   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final void forEachIndexed_xzaTVY8/* $FF was: forEachIndexed-xzaTVY8*/(short[] $this$forEachIndexed_u2dxzaTVY8, Function2<? super Integer, ? super UShort, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEachIndexed_u2dxzaTVY8, "$this$forEachIndexed");
      Intrinsics.checkNotNullParameter(action, "action");
      int index = 0;
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$forEachIndexed_u2dxzaTVY8); var3 < var4; ++var3) {
         short item = UShortArray.get-Mh2AYeg($this$forEachIndexed_u2dxzaTVY8, var3);
         action.invoke(index++, UShort.box-impl(item));
      }

   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final int maxOrThrow_U/* $FF was: maxOrThrow-U*/(@NotNull int[] $this$max_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$max_u2d_u2dajY_u2d9A, "$this$max");
      if (UIntArray.isEmpty-impl($this$max_u2d_u2dajY_u2d9A)) {
         throw new NoSuchElementException();
      } else {
         int max = UIntArray.get-pVg5ArA($this$max_u2d_u2dajY_u2d9A, 0);
         int i = 1;
         int var5 = false;
         int var3 = ArraysKt.getLastIndex($this$max_u2d_u2dajY_u2d9A);
         if (i <= var3) {
            while(true) {
               int e = UIntArray.get-pVg5ArA($this$max_u2d_u2dajY_u2d9A, i);
               if (Integer.compareUnsigned(max, e) < 0) {
                  max = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final long maxOrThrow_U/* $FF was: maxOrThrow-U*/(@NotNull long[] $this$max_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$max_u2dQwZRm1k, "$this$max");
      if (ULongArray.isEmpty-impl($this$max_u2dQwZRm1k)) {
         throw new NoSuchElementException();
      } else {
         long max = ULongArray.get-s-VKNKU($this$max_u2dQwZRm1k, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$max_u2dQwZRm1k);
         if (i <= var4) {
            while(true) {
               long e = ULongArray.get-s-VKNKU($this$max_u2dQwZRm1k, i);
               if (Long.compareUnsigned(max, e) < 0) {
                  max = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final byte maxOrThrow_U/* $FF was: maxOrThrow-U*/(@NotNull byte[] $this$max_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$max_u2dGBYM_sE, "$this$max");
      if (UByteArray.isEmpty-impl($this$max_u2dGBYM_sE)) {
         throw new NoSuchElementException();
      } else {
         byte max = UByteArray.get-w2LRezQ($this$max_u2dGBYM_sE, 0);
         int i = 1;
         int var5 = false;
         int var3 = ArraysKt.getLastIndex($this$max_u2dGBYM_sE);
         if (i <= var3) {
            while(true) {
               byte e = UByteArray.get-w2LRezQ($this$max_u2dGBYM_sE, i);
               if (Intrinsics.compare(max & 255, e & 255) < 0) {
                  max = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final short maxOrThrow_U/* $FF was: maxOrThrow-U*/(@NotNull short[] $this$max_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$max_u2drL5Bavg, "$this$max");
      if (UShortArray.isEmpty-impl($this$max_u2drL5Bavg)) {
         throw new NoSuchElementException();
      } else {
         short max = UShortArray.get-Mh2AYeg($this$max_u2drL5Bavg, 0);
         int i = 1;
         int var5 = false;
         int var3 = ArraysKt.getLastIndex($this$max_u2drL5Bavg);
         if (i <= var3) {
            while(true) {
               short e = UShortArray.get-Mh2AYeg($this$max_u2drL5Bavg, i);
               if (Intrinsics.compare(max & '\uffff', e & '\uffff') < 0) {
                  max = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxByOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> int maxByOrThrow_U/* $FF was: maxByOrThrow-U*/(int[] $this$maxBy_u2djgv0xPQ, Function1<? super UInt, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy_u2djgv0xPQ, "$this$maxBy");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$maxBy_u2djgv0xPQ)) {
         throw new NoSuchElementException();
      } else {
         int maxElem = UIntArray.get-pVg5ArA($this$maxBy_u2djgv0xPQ, 0);
         int var5 = false;
         int lastIndex = ArraysKt.getLastIndex($this$maxBy_u2djgv0xPQ);
         if (lastIndex == 0) {
            return maxElem;
         } else {
            Comparable maxValue = (Comparable)selector.invoke(UInt.box-impl(maxElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  int e = UIntArray.get-pVg5ArA($this$maxBy_u2djgv0xPQ, i);
                  Comparable v = (Comparable)selector.invoke(UInt.box-impl(e));
                  if (maxValue.compareTo(v) < 0) {
                     maxElem = e;
                     maxValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return maxElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxByOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> long maxByOrThrow_U/* $FF was: maxByOrThrow-U*/(long[] $this$maxBy_u2dMShoTSo, Function1<? super ULong, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy_u2dMShoTSo, "$this$maxBy");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$maxBy_u2dMShoTSo)) {
         throw new NoSuchElementException();
      } else {
         long maxElem = ULongArray.get-s-VKNKU($this$maxBy_u2dMShoTSo, 0);
         int var6 = false;
         int lastIndex = ArraysKt.getLastIndex($this$maxBy_u2dMShoTSo);
         if (lastIndex == 0) {
            return maxElem;
         } else {
            Comparable maxValue = (Comparable)selector.invoke(ULong.box-impl(maxElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  long e = ULongArray.get-s-VKNKU($this$maxBy_u2dMShoTSo, i);
                  Comparable v = (Comparable)selector.invoke(ULong.box-impl(e));
                  if (maxValue.compareTo(v) < 0) {
                     maxElem = e;
                     maxValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return maxElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxByOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> byte maxByOrThrow_U/* $FF was: maxByOrThrow-U*/(byte[] $this$maxBy_u2dJOV_ifY, Function1<? super UByte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy_u2dJOV_ifY, "$this$maxBy");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$maxBy_u2dJOV_ifY)) {
         throw new NoSuchElementException();
      } else {
         byte maxElem = UByteArray.get-w2LRezQ($this$maxBy_u2dJOV_ifY, 0);
         int var5 = false;
         int lastIndex = ArraysKt.getLastIndex($this$maxBy_u2dJOV_ifY);
         if (lastIndex == 0) {
            return maxElem;
         } else {
            Comparable maxValue = (Comparable)selector.invoke(UByte.box-impl(maxElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  byte e = UByteArray.get-w2LRezQ($this$maxBy_u2dJOV_ifY, i);
                  Comparable v = (Comparable)selector.invoke(UByte.box-impl(e));
                  if (maxValue.compareTo(v) < 0) {
                     maxElem = e;
                     maxValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return maxElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxByOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> short maxByOrThrow_U/* $FF was: maxByOrThrow-U*/(short[] $this$maxBy_u2dxTcfx_M, Function1<? super UShort, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxBy_u2dxTcfx_M, "$this$maxBy");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$maxBy_u2dxTcfx_M)) {
         throw new NoSuchElementException();
      } else {
         short maxElem = UShortArray.get-Mh2AYeg($this$maxBy_u2dxTcfx_M, 0);
         int var5 = false;
         int lastIndex = ArraysKt.getLastIndex($this$maxBy_u2dxTcfx_M);
         if (lastIndex == 0) {
            return maxElem;
         } else {
            Comparable maxValue = (Comparable)selector.invoke(UShort.box-impl(maxElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  short e = UShortArray.get-Mh2AYeg($this$maxBy_u2dxTcfx_M, i);
                  Comparable v = (Comparable)selector.invoke(UShort.box-impl(e));
                  if (maxValue.compareTo(v) < 0) {
                     maxElem = e;
                     maxValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return maxElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> UInt maxByOrNull_jgv0xPQ/* $FF was: maxByOrNull-jgv0xPQ*/(int[] $this$maxByOrNull_u2djgv0xPQ, Function1<? super UInt, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxByOrNull_u2djgv0xPQ, "$this$maxByOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$maxByOrNull_u2djgv0xPQ)) {
         return null;
      } else {
         int maxElem = UIntArray.get-pVg5ArA($this$maxByOrNull_u2djgv0xPQ, 0);
         int var5 = false;
         int lastIndex = ArraysKt.getLastIndex($this$maxByOrNull_u2djgv0xPQ);
         if (lastIndex == 0) {
            return UInt.box-impl(maxElem);
         } else {
            Comparable maxValue = (Comparable)selector.invoke(UInt.box-impl(maxElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  int e = UIntArray.get-pVg5ArA($this$maxByOrNull_u2djgv0xPQ, i);
                  Comparable v = (Comparable)selector.invoke(UInt.box-impl(e));
                  if (maxValue.compareTo(v) < 0) {
                     maxElem = e;
                     maxValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return UInt.box-impl(maxElem);
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> ULong maxByOrNull_MShoTSo/* $FF was: maxByOrNull-MShoTSo*/(long[] $this$maxByOrNull_u2dMShoTSo, Function1<? super ULong, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxByOrNull_u2dMShoTSo, "$this$maxByOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$maxByOrNull_u2dMShoTSo)) {
         return null;
      } else {
         long maxElem = ULongArray.get-s-VKNKU($this$maxByOrNull_u2dMShoTSo, 0);
         int var6 = false;
         int lastIndex = ArraysKt.getLastIndex($this$maxByOrNull_u2dMShoTSo);
         if (lastIndex == 0) {
            return ULong.box-impl(maxElem);
         } else {
            Comparable maxValue = (Comparable)selector.invoke(ULong.box-impl(maxElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  long e = ULongArray.get-s-VKNKU($this$maxByOrNull_u2dMShoTSo, i);
                  Comparable v = (Comparable)selector.invoke(ULong.box-impl(e));
                  if (maxValue.compareTo(v) < 0) {
                     maxElem = e;
                     maxValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return ULong.box-impl(maxElem);
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> UByte maxByOrNull_JOV_ifY/* $FF was: maxByOrNull-JOV_ifY*/(byte[] $this$maxByOrNull_u2dJOV_ifY, Function1<? super UByte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxByOrNull_u2dJOV_ifY, "$this$maxByOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$maxByOrNull_u2dJOV_ifY)) {
         return null;
      } else {
         byte maxElem = UByteArray.get-w2LRezQ($this$maxByOrNull_u2dJOV_ifY, 0);
         int var5 = false;
         int lastIndex = ArraysKt.getLastIndex($this$maxByOrNull_u2dJOV_ifY);
         if (lastIndex == 0) {
            return UByte.box-impl(maxElem);
         } else {
            Comparable maxValue = (Comparable)selector.invoke(UByte.box-impl(maxElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  byte e = UByteArray.get-w2LRezQ($this$maxByOrNull_u2dJOV_ifY, i);
                  Comparable v = (Comparable)selector.invoke(UByte.box-impl(e));
                  if (maxValue.compareTo(v) < 0) {
                     maxElem = e;
                     maxValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return UByte.box-impl(maxElem);
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> UShort maxByOrNull_xTcfx_M/* $FF was: maxByOrNull-xTcfx_M*/(short[] $this$maxByOrNull_u2dxTcfx_M, Function1<? super UShort, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxByOrNull_u2dxTcfx_M, "$this$maxByOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$maxByOrNull_u2dxTcfx_M)) {
         return null;
      } else {
         short maxElem = UShortArray.get-Mh2AYeg($this$maxByOrNull_u2dxTcfx_M, 0);
         int var5 = false;
         int lastIndex = ArraysKt.getLastIndex($this$maxByOrNull_u2dxTcfx_M);
         if (lastIndex == 0) {
            return UShort.box-impl(maxElem);
         } else {
            Comparable maxValue = (Comparable)selector.invoke(UShort.box-impl(maxElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  short e = UShortArray.get-Mh2AYeg($this$maxByOrNull_u2dxTcfx_M, i);
                  Comparable v = (Comparable)selector.invoke(UShort.box-impl(e));
                  if (maxValue.compareTo(v) < 0) {
                     maxElem = e;
                     maxValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return UShort.box-impl(maxElem);
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double maxOf_jgv0xPQ/* $FF was: maxOf-jgv0xPQ*/(int[] $this$maxOf_u2djgv0xPQ, Function1<? super UInt, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf_u2djgv0xPQ, "$this$maxOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$maxOf_u2djgv0xPQ)) {
         throw new NoSuchElementException();
      } else {
         double maxValue = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOf_u2djgv0xPQ, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOf_u2djgv0xPQ);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOf_u2djgv0xPQ, i)))).doubleValue();
               maxValue = Math.max(maxValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double maxOf_MShoTSo/* $FF was: maxOf-MShoTSo*/(long[] $this$maxOf_u2dMShoTSo, Function1<? super ULong, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf_u2dMShoTSo, "$this$maxOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$maxOf_u2dMShoTSo)) {
         throw new NoSuchElementException();
      } else {
         double maxValue = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOf_u2dMShoTSo, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOf_u2dMShoTSo);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOf_u2dMShoTSo, i)))).doubleValue();
               maxValue = Math.max(maxValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double maxOf_JOV_ifY/* $FF was: maxOf-JOV_ifY*/(byte[] $this$maxOf_u2dJOV_ifY, Function1<? super UByte, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf_u2dJOV_ifY, "$this$maxOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$maxOf_u2dJOV_ifY)) {
         throw new NoSuchElementException();
      } else {
         double maxValue = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOf_u2dJOV_ifY, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOf_u2dJOV_ifY);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOf_u2dJOV_ifY, i)))).doubleValue();
               maxValue = Math.max(maxValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double maxOf_xTcfx_M/* $FF was: maxOf-xTcfx_M*/(short[] $this$maxOf_u2dxTcfx_M, Function1<? super UShort, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf_u2dxTcfx_M, "$this$maxOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$maxOf_u2dxTcfx_M)) {
         throw new NoSuchElementException();
      } else {
         double maxValue = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOf_u2dxTcfx_M, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOf_u2dxTcfx_M);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOf_u2dxTcfx_M, i)))).doubleValue();
               maxValue = Math.max(maxValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final float maxOf_jgv0xPQ/* $FF was: maxOf-jgv0xPQ*/(int[] $this$maxOf_u2djgv0xPQ, Function1<? super UInt, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf_u2djgv0xPQ, "$this$maxOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$maxOf_u2djgv0xPQ)) {
         throw new NoSuchElementException();
      } else {
         float maxValue = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOf_u2djgv0xPQ, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOf_u2djgv0xPQ);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOf_u2djgv0xPQ, i)))).floatValue();
               maxValue = Math.max(maxValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final float maxOf_MShoTSo/* $FF was: maxOf-MShoTSo*/(long[] $this$maxOf_u2dMShoTSo, Function1<? super ULong, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf_u2dMShoTSo, "$this$maxOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$maxOf_u2dMShoTSo)) {
         throw new NoSuchElementException();
      } else {
         float maxValue = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOf_u2dMShoTSo, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOf_u2dMShoTSo);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOf_u2dMShoTSo, i)))).floatValue();
               maxValue = Math.max(maxValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final float maxOf_JOV_ifY/* $FF was: maxOf-JOV_ifY*/(byte[] $this$maxOf_u2dJOV_ifY, Function1<? super UByte, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf_u2dJOV_ifY, "$this$maxOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$maxOf_u2dJOV_ifY)) {
         throw new NoSuchElementException();
      } else {
         float maxValue = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOf_u2dJOV_ifY, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOf_u2dJOV_ifY);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOf_u2dJOV_ifY, i)))).floatValue();
               maxValue = Math.max(maxValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final float maxOf_xTcfx_M/* $FF was: maxOf-xTcfx_M*/(short[] $this$maxOf_u2dxTcfx_M, Function1<? super UShort, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf_u2dxTcfx_M, "$this$maxOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$maxOf_u2dxTcfx_M)) {
         throw new NoSuchElementException();
      } else {
         float maxValue = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOf_u2dxTcfx_M, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOf_u2dxTcfx_M);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOf_u2dxTcfx_M, i)))).floatValue();
               maxValue = Math.max(maxValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R maxOf_jgv0xPQ/* $FF was: maxOf-jgv0xPQ*/(int[] $this$maxOf_u2djgv0xPQ, Function1<? super UInt, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf_u2djgv0xPQ, "$this$maxOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$maxOf_u2djgv0xPQ)) {
         throw new NoSuchElementException();
      } else {
         Comparable maxValue = (Comparable)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOf_u2djgv0xPQ, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOf_u2djgv0xPQ);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOf_u2djgv0xPQ, i)));
               if (maxValue.compareTo(v) < 0) {
                  maxValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R maxOf_MShoTSo/* $FF was: maxOf-MShoTSo*/(long[] $this$maxOf_u2dMShoTSo, Function1<? super ULong, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf_u2dMShoTSo, "$this$maxOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$maxOf_u2dMShoTSo)) {
         throw new NoSuchElementException();
      } else {
         Comparable maxValue = (Comparable)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOf_u2dMShoTSo, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOf_u2dMShoTSo);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOf_u2dMShoTSo, i)));
               if (maxValue.compareTo(v) < 0) {
                  maxValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R maxOf_JOV_ifY/* $FF was: maxOf-JOV_ifY*/(byte[] $this$maxOf_u2dJOV_ifY, Function1<? super UByte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf_u2dJOV_ifY, "$this$maxOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$maxOf_u2dJOV_ifY)) {
         throw new NoSuchElementException();
      } else {
         Comparable maxValue = (Comparable)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOf_u2dJOV_ifY, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOf_u2dJOV_ifY);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOf_u2dJOV_ifY, i)));
               if (maxValue.compareTo(v) < 0) {
                  maxValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R maxOf_xTcfx_M/* $FF was: maxOf-xTcfx_M*/(short[] $this$maxOf_u2dxTcfx_M, Function1<? super UShort, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOf_u2dxTcfx_M, "$this$maxOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$maxOf_u2dxTcfx_M)) {
         throw new NoSuchElementException();
      } else {
         Comparable maxValue = (Comparable)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOf_u2dxTcfx_M, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOf_u2dxTcfx_M);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOf_u2dxTcfx_M, i)));
               if (maxValue.compareTo(v) < 0) {
                  maxValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Double maxOfOrNull_jgv0xPQ/* $FF was: maxOfOrNull-jgv0xPQ*/(int[] $this$maxOfOrNull_u2djgv0xPQ, Function1<? super UInt, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull_u2djgv0xPQ, "$this$maxOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$maxOfOrNull_u2djgv0xPQ)) {
         return null;
      } else {
         double maxValue = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOfOrNull_u2djgv0xPQ, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOfOrNull_u2djgv0xPQ);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOfOrNull_u2djgv0xPQ, i)))).doubleValue();
               maxValue = Math.max(maxValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Double maxOfOrNull_MShoTSo/* $FF was: maxOfOrNull-MShoTSo*/(long[] $this$maxOfOrNull_u2dMShoTSo, Function1<? super ULong, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull_u2dMShoTSo, "$this$maxOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$maxOfOrNull_u2dMShoTSo)) {
         return null;
      } else {
         double maxValue = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOfOrNull_u2dMShoTSo, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOfOrNull_u2dMShoTSo);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOfOrNull_u2dMShoTSo, i)))).doubleValue();
               maxValue = Math.max(maxValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Double maxOfOrNull_JOV_ifY/* $FF was: maxOfOrNull-JOV_ifY*/(byte[] $this$maxOfOrNull_u2dJOV_ifY, Function1<? super UByte, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull_u2dJOV_ifY, "$this$maxOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$maxOfOrNull_u2dJOV_ifY)) {
         return null;
      } else {
         double maxValue = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOfOrNull_u2dJOV_ifY, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOfOrNull_u2dJOV_ifY);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOfOrNull_u2dJOV_ifY, i)))).doubleValue();
               maxValue = Math.max(maxValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Double maxOfOrNull_xTcfx_M/* $FF was: maxOfOrNull-xTcfx_M*/(short[] $this$maxOfOrNull_u2dxTcfx_M, Function1<? super UShort, Double> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull_u2dxTcfx_M, "$this$maxOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$maxOfOrNull_u2dxTcfx_M)) {
         return null;
      } else {
         double maxValue = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOfOrNull_u2dxTcfx_M, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOfOrNull_u2dxTcfx_M);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOfOrNull_u2dxTcfx_M, i)))).doubleValue();
               maxValue = Math.max(maxValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Float maxOfOrNull_jgv0xPQ/* $FF was: maxOfOrNull-jgv0xPQ*/(int[] $this$maxOfOrNull_u2djgv0xPQ, Function1<? super UInt, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull_u2djgv0xPQ, "$this$maxOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$maxOfOrNull_u2djgv0xPQ)) {
         return null;
      } else {
         float maxValue = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOfOrNull_u2djgv0xPQ, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOfOrNull_u2djgv0xPQ);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOfOrNull_u2djgv0xPQ, i)))).floatValue();
               maxValue = Math.max(maxValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Float maxOfOrNull_MShoTSo/* $FF was: maxOfOrNull-MShoTSo*/(long[] $this$maxOfOrNull_u2dMShoTSo, Function1<? super ULong, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull_u2dMShoTSo, "$this$maxOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$maxOfOrNull_u2dMShoTSo)) {
         return null;
      } else {
         float maxValue = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOfOrNull_u2dMShoTSo, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOfOrNull_u2dMShoTSo);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOfOrNull_u2dMShoTSo, i)))).floatValue();
               maxValue = Math.max(maxValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Float maxOfOrNull_JOV_ifY/* $FF was: maxOfOrNull-JOV_ifY*/(byte[] $this$maxOfOrNull_u2dJOV_ifY, Function1<? super UByte, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull_u2dJOV_ifY, "$this$maxOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$maxOfOrNull_u2dJOV_ifY)) {
         return null;
      } else {
         float maxValue = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOfOrNull_u2dJOV_ifY, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOfOrNull_u2dJOV_ifY);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOfOrNull_u2dJOV_ifY, i)))).floatValue();
               maxValue = Math.max(maxValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Float maxOfOrNull_xTcfx_M/* $FF was: maxOfOrNull-xTcfx_M*/(short[] $this$maxOfOrNull_u2dxTcfx_M, Function1<? super UShort, Float> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull_u2dxTcfx_M, "$this$maxOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$maxOfOrNull_u2dxTcfx_M)) {
         return null;
      } else {
         float maxValue = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOfOrNull_u2dxTcfx_M, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOfOrNull_u2dxTcfx_M);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOfOrNull_u2dxTcfx_M, i)))).floatValue();
               maxValue = Math.max(maxValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R maxOfOrNull_jgv0xPQ/* $FF was: maxOfOrNull-jgv0xPQ*/(int[] $this$maxOfOrNull_u2djgv0xPQ, Function1<? super UInt, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull_u2djgv0xPQ, "$this$maxOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$maxOfOrNull_u2djgv0xPQ)) {
         return null;
      } else {
         Comparable maxValue = (Comparable)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOfOrNull_u2djgv0xPQ, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOfOrNull_u2djgv0xPQ);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOfOrNull_u2djgv0xPQ, i)));
               if (maxValue.compareTo(v) < 0) {
                  maxValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R maxOfOrNull_MShoTSo/* $FF was: maxOfOrNull-MShoTSo*/(long[] $this$maxOfOrNull_u2dMShoTSo, Function1<? super ULong, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull_u2dMShoTSo, "$this$maxOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$maxOfOrNull_u2dMShoTSo)) {
         return null;
      } else {
         Comparable maxValue = (Comparable)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOfOrNull_u2dMShoTSo, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOfOrNull_u2dMShoTSo);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOfOrNull_u2dMShoTSo, i)));
               if (maxValue.compareTo(v) < 0) {
                  maxValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R maxOfOrNull_JOV_ifY/* $FF was: maxOfOrNull-JOV_ifY*/(byte[] $this$maxOfOrNull_u2dJOV_ifY, Function1<? super UByte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull_u2dJOV_ifY, "$this$maxOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$maxOfOrNull_u2dJOV_ifY)) {
         return null;
      } else {
         Comparable maxValue = (Comparable)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOfOrNull_u2dJOV_ifY, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOfOrNull_u2dJOV_ifY);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOfOrNull_u2dJOV_ifY, i)));
               if (maxValue.compareTo(v) < 0) {
                  maxValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R maxOfOrNull_xTcfx_M/* $FF was: maxOfOrNull-xTcfx_M*/(short[] $this$maxOfOrNull_u2dxTcfx_M, Function1<? super UShort, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfOrNull_u2dxTcfx_M, "$this$maxOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$maxOfOrNull_u2dxTcfx_M)) {
         return null;
      } else {
         Comparable maxValue = (Comparable)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOfOrNull_u2dxTcfx_M, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOfOrNull_u2dxTcfx_M);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOfOrNull_u2dxTcfx_M, i)));
               if (maxValue.compareTo(v) < 0) {
                  maxValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R maxOfWith_myNOsp4/* $FF was: maxOfWith-myNOsp4*/(int[] $this$maxOfWith_u2dmyNOsp4, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWith_u2dmyNOsp4, "$this$maxOfWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$maxOfWith_u2dmyNOsp4)) {
         throw new NoSuchElementException();
      } else {
         Object maxValue = selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOfWith_u2dmyNOsp4, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOfWith_u2dmyNOsp4);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOfWith_u2dmyNOsp4, i)));
               if (comparator.compare(maxValue, v) < 0) {
                  maxValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R maxOfWith_5NtCtWE/* $FF was: maxOfWith-5NtCtWE*/(long[] $this$maxOfWith_u2d5NtCtWE, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWith_u2d5NtCtWE, "$this$maxOfWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$maxOfWith_u2d5NtCtWE)) {
         throw new NoSuchElementException();
      } else {
         Object maxValue = selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOfWith_u2d5NtCtWE, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOfWith_u2d5NtCtWE);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOfWith_u2d5NtCtWE, i)));
               if (comparator.compare(maxValue, v) < 0) {
                  maxValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R maxOfWith_LTi4i_s/* $FF was: maxOfWith-LTi4i_s*/(byte[] $this$maxOfWith_u2dLTi4i_s, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWith_u2dLTi4i_s, "$this$maxOfWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$maxOfWith_u2dLTi4i_s)) {
         throw new NoSuchElementException();
      } else {
         Object maxValue = selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOfWith_u2dLTi4i_s, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOfWith_u2dLTi4i_s);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOfWith_u2dLTi4i_s, i)));
               if (comparator.compare(maxValue, v) < 0) {
                  maxValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R maxOfWith_l8EHGbQ/* $FF was: maxOfWith-l8EHGbQ*/(short[] $this$maxOfWith_u2dl8EHGbQ, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWith_u2dl8EHGbQ, "$this$maxOfWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$maxOfWith_u2dl8EHGbQ)) {
         throw new NoSuchElementException();
      } else {
         Object maxValue = selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOfWith_u2dl8EHGbQ, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOfWith_u2dl8EHGbQ);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOfWith_u2dl8EHGbQ, i)));
               if (comparator.compare(maxValue, v) < 0) {
                  maxValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R maxOfWithOrNull_myNOsp4/* $FF was: maxOfWithOrNull-myNOsp4*/(int[] $this$maxOfWithOrNull_u2dmyNOsp4, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWithOrNull_u2dmyNOsp4, "$this$maxOfWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$maxOfWithOrNull_u2dmyNOsp4)) {
         return null;
      } else {
         Object maxValue = selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOfWithOrNull_u2dmyNOsp4, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOfWithOrNull_u2dmyNOsp4);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$maxOfWithOrNull_u2dmyNOsp4, i)));
               if (comparator.compare(maxValue, v) < 0) {
                  maxValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R maxOfWithOrNull_5NtCtWE/* $FF was: maxOfWithOrNull-5NtCtWE*/(long[] $this$maxOfWithOrNull_u2d5NtCtWE, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWithOrNull_u2d5NtCtWE, "$this$maxOfWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$maxOfWithOrNull_u2d5NtCtWE)) {
         return null;
      } else {
         Object maxValue = selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOfWithOrNull_u2d5NtCtWE, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOfWithOrNull_u2d5NtCtWE);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$maxOfWithOrNull_u2d5NtCtWE, i)));
               if (comparator.compare(maxValue, v) < 0) {
                  maxValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R maxOfWithOrNull_LTi4i_s/* $FF was: maxOfWithOrNull-LTi4i_s*/(byte[] $this$maxOfWithOrNull_u2dLTi4i_s, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWithOrNull_u2dLTi4i_s, "$this$maxOfWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$maxOfWithOrNull_u2dLTi4i_s)) {
         return null;
      } else {
         Object maxValue = selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOfWithOrNull_u2dLTi4i_s, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOfWithOrNull_u2dLTi4i_s);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$maxOfWithOrNull_u2dLTi4i_s, i)));
               if (comparator.compare(maxValue, v) < 0) {
                  maxValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R maxOfWithOrNull_l8EHGbQ/* $FF was: maxOfWithOrNull-l8EHGbQ*/(short[] $this$maxOfWithOrNull_u2dl8EHGbQ, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$maxOfWithOrNull_u2dl8EHGbQ, "$this$maxOfWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$maxOfWithOrNull_u2dl8EHGbQ)) {
         return null;
      } else {
         Object maxValue = selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOfWithOrNull_u2dl8EHGbQ, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxOfWithOrNull_u2dl8EHGbQ);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$maxOfWithOrNull_u2dl8EHGbQ, i)));
               if (comparator.compare(maxValue, v) < 0) {
                  maxValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return maxValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UInt maxOrNull__ajY_9A/* $FF was: maxOrNull--ajY-9A*/(@NotNull int[] $this$maxOrNull_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$maxOrNull_u2d_u2dajY_u2d9A, "$this$maxOrNull");
      if (UIntArray.isEmpty-impl($this$maxOrNull_u2d_u2dajY_u2d9A)) {
         return null;
      } else {
         int max = UIntArray.get-pVg5ArA($this$maxOrNull_u2d_u2dajY_u2d9A, 0);
         int i = 1;
         int var5 = false;
         int var3 = ArraysKt.getLastIndex($this$maxOrNull_u2d_u2dajY_u2d9A);
         if (i <= var3) {
            while(true) {
               int e = UIntArray.get-pVg5ArA($this$maxOrNull_u2d_u2dajY_u2d9A, i);
               if (Integer.compareUnsigned(max, e) < 0) {
                  max = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return UInt.box-impl(max);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final ULong maxOrNull_QwZRm1k/* $FF was: maxOrNull-QwZRm1k*/(@NotNull long[] $this$maxOrNull_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$maxOrNull_u2dQwZRm1k, "$this$maxOrNull");
      if (ULongArray.isEmpty-impl($this$maxOrNull_u2dQwZRm1k)) {
         return null;
      } else {
         long max = ULongArray.get-s-VKNKU($this$maxOrNull_u2dQwZRm1k, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxOrNull_u2dQwZRm1k);
         if (i <= var4) {
            while(true) {
               long e = ULongArray.get-s-VKNKU($this$maxOrNull_u2dQwZRm1k, i);
               if (Long.compareUnsigned(max, e) < 0) {
                  max = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return ULong.box-impl(max);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UByte maxOrNull_GBYM_sE/* $FF was: maxOrNull-GBYM_sE*/(@NotNull byte[] $this$maxOrNull_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$maxOrNull_u2dGBYM_sE, "$this$maxOrNull");
      if (UByteArray.isEmpty-impl($this$maxOrNull_u2dGBYM_sE)) {
         return null;
      } else {
         byte max = UByteArray.get-w2LRezQ($this$maxOrNull_u2dGBYM_sE, 0);
         int i = 1;
         int var5 = false;
         int var3 = ArraysKt.getLastIndex($this$maxOrNull_u2dGBYM_sE);
         if (i <= var3) {
            while(true) {
               byte e = UByteArray.get-w2LRezQ($this$maxOrNull_u2dGBYM_sE, i);
               if (Intrinsics.compare(max & 255, e & 255) < 0) {
                  max = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return UByte.box-impl(max);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UShort maxOrNull_rL5Bavg/* $FF was: maxOrNull-rL5Bavg*/(@NotNull short[] $this$maxOrNull_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$maxOrNull_u2drL5Bavg, "$this$maxOrNull");
      if (UShortArray.isEmpty-impl($this$maxOrNull_u2drL5Bavg)) {
         return null;
      } else {
         short max = UShortArray.get-Mh2AYeg($this$maxOrNull_u2drL5Bavg, 0);
         int i = 1;
         int var5 = false;
         int var3 = ArraysKt.getLastIndex($this$maxOrNull_u2drL5Bavg);
         if (i <= var3) {
            while(true) {
               short e = UShortArray.get-Mh2AYeg($this$maxOrNull_u2drL5Bavg, i);
               if (Intrinsics.compare(max & '\uffff', e & '\uffff') < 0) {
                  max = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return UShort.box-impl(max);
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxWithOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final int maxWithOrThrow_U/* $FF was: maxWithOrThrow-U*/(@NotNull int[] $this$maxWith_u2dYmdZ_VM, @NotNull Comparator<? super UInt> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith_u2dYmdZ_VM, "$this$maxWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (UIntArray.isEmpty-impl($this$maxWith_u2dYmdZ_VM)) {
         throw new NoSuchElementException();
      } else {
         int max = UIntArray.get-pVg5ArA($this$maxWith_u2dYmdZ_VM, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxWith_u2dYmdZ_VM);
         if (i <= var4) {
            while(true) {
               int e = UIntArray.get-pVg5ArA($this$maxWith_u2dYmdZ_VM, i);
               if (comparator.compare(UInt.box-impl(max), UInt.box-impl(e)) < 0) {
                  max = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxWithOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final long maxWithOrThrow_U/* $FF was: maxWithOrThrow-U*/(@NotNull long[] $this$maxWith_u2dzrEWJaI, @NotNull Comparator<? super ULong> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith_u2dzrEWJaI, "$this$maxWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (ULongArray.isEmpty-impl($this$maxWith_u2dzrEWJaI)) {
         throw new NoSuchElementException();
      } else {
         long max = ULongArray.get-s-VKNKU($this$maxWith_u2dzrEWJaI, 0);
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxWith_u2dzrEWJaI);
         if (i <= var5) {
            while(true) {
               long e = ULongArray.get-s-VKNKU($this$maxWith_u2dzrEWJaI, i);
               if (comparator.compare(ULong.box-impl(max), ULong.box-impl(e)) < 0) {
                  max = e;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxWithOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final byte maxWithOrThrow_U/* $FF was: maxWithOrThrow-U*/(@NotNull byte[] $this$maxWith_u2dXMRcp5o, @NotNull Comparator<? super UByte> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith_u2dXMRcp5o, "$this$maxWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (UByteArray.isEmpty-impl($this$maxWith_u2dXMRcp5o)) {
         throw new NoSuchElementException();
      } else {
         byte max = UByteArray.get-w2LRezQ($this$maxWith_u2dXMRcp5o, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxWith_u2dXMRcp5o);
         if (i <= var4) {
            while(true) {
               byte e = UByteArray.get-w2LRezQ($this$maxWith_u2dXMRcp5o, i);
               if (comparator.compare(UByte.box-impl(max), UByte.box-impl(e)) < 0) {
                  max = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "maxWithOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final short maxWithOrThrow_U/* $FF was: maxWithOrThrow-U*/(@NotNull short[] $this$maxWith_u2deOHTfZs, @NotNull Comparator<? super UShort> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWith_u2deOHTfZs, "$this$maxWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (UShortArray.isEmpty-impl($this$maxWith_u2deOHTfZs)) {
         throw new NoSuchElementException();
      } else {
         short max = UShortArray.get-Mh2AYeg($this$maxWith_u2deOHTfZs, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxWith_u2deOHTfZs);
         if (i <= var4) {
            while(true) {
               short e = UShortArray.get-Mh2AYeg($this$maxWith_u2deOHTfZs, i);
               if (comparator.compare(UShort.box-impl(max), UShort.box-impl(e)) < 0) {
                  max = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return max;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UInt maxWithOrNull_YmdZ_VM/* $FF was: maxWithOrNull-YmdZ_VM*/(@NotNull int[] $this$maxWithOrNull_u2dYmdZ_VM, @NotNull Comparator<? super UInt> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWithOrNull_u2dYmdZ_VM, "$this$maxWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (UIntArray.isEmpty-impl($this$maxWithOrNull_u2dYmdZ_VM)) {
         return null;
      } else {
         int max = UIntArray.get-pVg5ArA($this$maxWithOrNull_u2dYmdZ_VM, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxWithOrNull_u2dYmdZ_VM);
         if (i <= var4) {
            while(true) {
               int e = UIntArray.get-pVg5ArA($this$maxWithOrNull_u2dYmdZ_VM, i);
               if (comparator.compare(UInt.box-impl(max), UInt.box-impl(e)) < 0) {
                  max = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return UInt.box-impl(max);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final ULong maxWithOrNull_zrEWJaI/* $FF was: maxWithOrNull-zrEWJaI*/(@NotNull long[] $this$maxWithOrNull_u2dzrEWJaI, @NotNull Comparator<? super ULong> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWithOrNull_u2dzrEWJaI, "$this$maxWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (ULongArray.isEmpty-impl($this$maxWithOrNull_u2dzrEWJaI)) {
         return null;
      } else {
         long max = ULongArray.get-s-VKNKU($this$maxWithOrNull_u2dzrEWJaI, 0);
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$maxWithOrNull_u2dzrEWJaI);
         if (i <= var5) {
            while(true) {
               long e = ULongArray.get-s-VKNKU($this$maxWithOrNull_u2dzrEWJaI, i);
               if (comparator.compare(ULong.box-impl(max), ULong.box-impl(e)) < 0) {
                  max = e;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return ULong.box-impl(max);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UByte maxWithOrNull_XMRcp5o/* $FF was: maxWithOrNull-XMRcp5o*/(@NotNull byte[] $this$maxWithOrNull_u2dXMRcp5o, @NotNull Comparator<? super UByte> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWithOrNull_u2dXMRcp5o, "$this$maxWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (UByteArray.isEmpty-impl($this$maxWithOrNull_u2dXMRcp5o)) {
         return null;
      } else {
         byte max = UByteArray.get-w2LRezQ($this$maxWithOrNull_u2dXMRcp5o, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxWithOrNull_u2dXMRcp5o);
         if (i <= var4) {
            while(true) {
               byte e = UByteArray.get-w2LRezQ($this$maxWithOrNull_u2dXMRcp5o, i);
               if (comparator.compare(UByte.box-impl(max), UByte.box-impl(e)) < 0) {
                  max = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return UByte.box-impl(max);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UShort maxWithOrNull_eOHTfZs/* $FF was: maxWithOrNull-eOHTfZs*/(@NotNull short[] $this$maxWithOrNull_u2deOHTfZs, @NotNull Comparator<? super UShort> comparator) {
      Intrinsics.checkNotNullParameter($this$maxWithOrNull_u2deOHTfZs, "$this$maxWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (UShortArray.isEmpty-impl($this$maxWithOrNull_u2deOHTfZs)) {
         return null;
      } else {
         short max = UShortArray.get-Mh2AYeg($this$maxWithOrNull_u2deOHTfZs, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$maxWithOrNull_u2deOHTfZs);
         if (i <= var4) {
            while(true) {
               short e = UShortArray.get-Mh2AYeg($this$maxWithOrNull_u2deOHTfZs, i);
               if (comparator.compare(UShort.box-impl(max), UShort.box-impl(e)) < 0) {
                  max = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return UShort.box-impl(max);
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final int minOrThrow_U/* $FF was: minOrThrow-U*/(@NotNull int[] $this$min_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$min_u2d_u2dajY_u2d9A, "$this$min");
      if (UIntArray.isEmpty-impl($this$min_u2d_u2dajY_u2d9A)) {
         throw new NoSuchElementException();
      } else {
         int min = UIntArray.get-pVg5ArA($this$min_u2d_u2dajY_u2d9A, 0);
         int i = 1;
         int var5 = false;
         int var3 = ArraysKt.getLastIndex($this$min_u2d_u2dajY_u2d9A);
         if (i <= var3) {
            while(true) {
               int e = UIntArray.get-pVg5ArA($this$min_u2d_u2dajY_u2d9A, i);
               if (Integer.compareUnsigned(min, e) > 0) {
                  min = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final long minOrThrow_U/* $FF was: minOrThrow-U*/(@NotNull long[] $this$min_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$min_u2dQwZRm1k, "$this$min");
      if (ULongArray.isEmpty-impl($this$min_u2dQwZRm1k)) {
         throw new NoSuchElementException();
      } else {
         long min = ULongArray.get-s-VKNKU($this$min_u2dQwZRm1k, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$min_u2dQwZRm1k);
         if (i <= var4) {
            while(true) {
               long e = ULongArray.get-s-VKNKU($this$min_u2dQwZRm1k, i);
               if (Long.compareUnsigned(min, e) > 0) {
                  min = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final byte minOrThrow_U/* $FF was: minOrThrow-U*/(@NotNull byte[] $this$min_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$min_u2dGBYM_sE, "$this$min");
      if (UByteArray.isEmpty-impl($this$min_u2dGBYM_sE)) {
         throw new NoSuchElementException();
      } else {
         byte min = UByteArray.get-w2LRezQ($this$min_u2dGBYM_sE, 0);
         int i = 1;
         int var5 = false;
         int var3 = ArraysKt.getLastIndex($this$min_u2dGBYM_sE);
         if (i <= var3) {
            while(true) {
               byte e = UByteArray.get-w2LRezQ($this$min_u2dGBYM_sE, i);
               if (Intrinsics.compare(min & 255, e & 255) > 0) {
                  min = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final short minOrThrow_U/* $FF was: minOrThrow-U*/(@NotNull short[] $this$min_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$min_u2drL5Bavg, "$this$min");
      if (UShortArray.isEmpty-impl($this$min_u2drL5Bavg)) {
         throw new NoSuchElementException();
      } else {
         short min = UShortArray.get-Mh2AYeg($this$min_u2drL5Bavg, 0);
         int i = 1;
         int var5 = false;
         int var3 = ArraysKt.getLastIndex($this$min_u2drL5Bavg);
         if (i <= var3) {
            while(true) {
               short e = UShortArray.get-Mh2AYeg($this$min_u2drL5Bavg, i);
               if (Intrinsics.compare(min & '\uffff', e & '\uffff') > 0) {
                  min = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minByOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> int minByOrThrow_U/* $FF was: minByOrThrow-U*/(int[] $this$minBy_u2djgv0xPQ, Function1<? super UInt, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy_u2djgv0xPQ, "$this$minBy");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$minBy_u2djgv0xPQ)) {
         throw new NoSuchElementException();
      } else {
         int minElem = UIntArray.get-pVg5ArA($this$minBy_u2djgv0xPQ, 0);
         int var5 = false;
         int lastIndex = ArraysKt.getLastIndex($this$minBy_u2djgv0xPQ);
         if (lastIndex == 0) {
            return minElem;
         } else {
            Comparable minValue = (Comparable)selector.invoke(UInt.box-impl(minElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  int e = UIntArray.get-pVg5ArA($this$minBy_u2djgv0xPQ, i);
                  Comparable v = (Comparable)selector.invoke(UInt.box-impl(e));
                  if (minValue.compareTo(v) > 0) {
                     minElem = e;
                     minValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return minElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minByOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> long minByOrThrow_U/* $FF was: minByOrThrow-U*/(long[] $this$minBy_u2dMShoTSo, Function1<? super ULong, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy_u2dMShoTSo, "$this$minBy");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$minBy_u2dMShoTSo)) {
         throw new NoSuchElementException();
      } else {
         long minElem = ULongArray.get-s-VKNKU($this$minBy_u2dMShoTSo, 0);
         int var6 = false;
         int lastIndex = ArraysKt.getLastIndex($this$minBy_u2dMShoTSo);
         if (lastIndex == 0) {
            return minElem;
         } else {
            Comparable minValue = (Comparable)selector.invoke(ULong.box-impl(minElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  long e = ULongArray.get-s-VKNKU($this$minBy_u2dMShoTSo, i);
                  Comparable v = (Comparable)selector.invoke(ULong.box-impl(e));
                  if (minValue.compareTo(v) > 0) {
                     minElem = e;
                     minValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return minElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minByOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> byte minByOrThrow_U/* $FF was: minByOrThrow-U*/(byte[] $this$minBy_u2dJOV_ifY, Function1<? super UByte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy_u2dJOV_ifY, "$this$minBy");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$minBy_u2dJOV_ifY)) {
         throw new NoSuchElementException();
      } else {
         byte minElem = UByteArray.get-w2LRezQ($this$minBy_u2dJOV_ifY, 0);
         int var5 = false;
         int lastIndex = ArraysKt.getLastIndex($this$minBy_u2dJOV_ifY);
         if (lastIndex == 0) {
            return minElem;
         } else {
            Comparable minValue = (Comparable)selector.invoke(UByte.box-impl(minElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  byte e = UByteArray.get-w2LRezQ($this$minBy_u2dJOV_ifY, i);
                  Comparable v = (Comparable)selector.invoke(UByte.box-impl(e));
                  if (minValue.compareTo(v) > 0) {
                     minElem = e;
                     minValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return minElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minByOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> short minByOrThrow_U/* $FF was: minByOrThrow-U*/(short[] $this$minBy_u2dxTcfx_M, Function1<? super UShort, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minBy_u2dxTcfx_M, "$this$minBy");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$minBy_u2dxTcfx_M)) {
         throw new NoSuchElementException();
      } else {
         short minElem = UShortArray.get-Mh2AYeg($this$minBy_u2dxTcfx_M, 0);
         int var5 = false;
         int lastIndex = ArraysKt.getLastIndex($this$minBy_u2dxTcfx_M);
         if (lastIndex == 0) {
            return minElem;
         } else {
            Comparable minValue = (Comparable)selector.invoke(UShort.box-impl(minElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  short e = UShortArray.get-Mh2AYeg($this$minBy_u2dxTcfx_M, i);
                  Comparable v = (Comparable)selector.invoke(UShort.box-impl(e));
                  if (minValue.compareTo(v) > 0) {
                     minElem = e;
                     minValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return minElem;
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> UInt minByOrNull_jgv0xPQ/* $FF was: minByOrNull-jgv0xPQ*/(int[] $this$minByOrNull_u2djgv0xPQ, Function1<? super UInt, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minByOrNull_u2djgv0xPQ, "$this$minByOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$minByOrNull_u2djgv0xPQ)) {
         return null;
      } else {
         int minElem = UIntArray.get-pVg5ArA($this$minByOrNull_u2djgv0xPQ, 0);
         int var5 = false;
         int lastIndex = ArraysKt.getLastIndex($this$minByOrNull_u2djgv0xPQ);
         if (lastIndex == 0) {
            return UInt.box-impl(minElem);
         } else {
            Comparable minValue = (Comparable)selector.invoke(UInt.box-impl(minElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  int e = UIntArray.get-pVg5ArA($this$minByOrNull_u2djgv0xPQ, i);
                  Comparable v = (Comparable)selector.invoke(UInt.box-impl(e));
                  if (minValue.compareTo(v) > 0) {
                     minElem = e;
                     minValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return UInt.box-impl(minElem);
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> ULong minByOrNull_MShoTSo/* $FF was: minByOrNull-MShoTSo*/(long[] $this$minByOrNull_u2dMShoTSo, Function1<? super ULong, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minByOrNull_u2dMShoTSo, "$this$minByOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$minByOrNull_u2dMShoTSo)) {
         return null;
      } else {
         long minElem = ULongArray.get-s-VKNKU($this$minByOrNull_u2dMShoTSo, 0);
         int var6 = false;
         int lastIndex = ArraysKt.getLastIndex($this$minByOrNull_u2dMShoTSo);
         if (lastIndex == 0) {
            return ULong.box-impl(minElem);
         } else {
            Comparable minValue = (Comparable)selector.invoke(ULong.box-impl(minElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  long e = ULongArray.get-s-VKNKU($this$minByOrNull_u2dMShoTSo, i);
                  Comparable v = (Comparable)selector.invoke(ULong.box-impl(e));
                  if (minValue.compareTo(v) > 0) {
                     minElem = e;
                     minValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return ULong.box-impl(minElem);
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> UByte minByOrNull_JOV_ifY/* $FF was: minByOrNull-JOV_ifY*/(byte[] $this$minByOrNull_u2dJOV_ifY, Function1<? super UByte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minByOrNull_u2dJOV_ifY, "$this$minByOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$minByOrNull_u2dJOV_ifY)) {
         return null;
      } else {
         byte minElem = UByteArray.get-w2LRezQ($this$minByOrNull_u2dJOV_ifY, 0);
         int var5 = false;
         int lastIndex = ArraysKt.getLastIndex($this$minByOrNull_u2dJOV_ifY);
         if (lastIndex == 0) {
            return UByte.box-impl(minElem);
         } else {
            Comparable minValue = (Comparable)selector.invoke(UByte.box-impl(minElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  byte e = UByteArray.get-w2LRezQ($this$minByOrNull_u2dJOV_ifY, i);
                  Comparable v = (Comparable)selector.invoke(UByte.box-impl(e));
                  if (minValue.compareTo(v) > 0) {
                     minElem = e;
                     minValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return UByte.box-impl(minElem);
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> UShort minByOrNull_xTcfx_M/* $FF was: minByOrNull-xTcfx_M*/(short[] $this$minByOrNull_u2dxTcfx_M, Function1<? super UShort, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minByOrNull_u2dxTcfx_M, "$this$minByOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$minByOrNull_u2dxTcfx_M)) {
         return null;
      } else {
         short minElem = UShortArray.get-Mh2AYeg($this$minByOrNull_u2dxTcfx_M, 0);
         int var5 = false;
         int lastIndex = ArraysKt.getLastIndex($this$minByOrNull_u2dxTcfx_M);
         if (lastIndex == 0) {
            return UShort.box-impl(minElem);
         } else {
            Comparable minValue = (Comparable)selector.invoke(UShort.box-impl(minElem));
            int i = 1;
            if (i <= lastIndex) {
               while(true) {
                  short e = UShortArray.get-Mh2AYeg($this$minByOrNull_u2dxTcfx_M, i);
                  Comparable v = (Comparable)selector.invoke(UShort.box-impl(e));
                  if (minValue.compareTo(v) > 0) {
                     minElem = e;
                     minValue = v;
                  }

                  if (i == lastIndex) {
                     break;
                  }

                  ++i;
               }
            }

            return UShort.box-impl(minElem);
         }
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double minOf_jgv0xPQ/* $FF was: minOf-jgv0xPQ*/(int[] $this$minOf_u2djgv0xPQ, Function1<? super UInt, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOf_u2djgv0xPQ, "$this$minOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$minOf_u2djgv0xPQ)) {
         throw new NoSuchElementException();
      } else {
         double minValue = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOf_u2djgv0xPQ, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOf_u2djgv0xPQ);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOf_u2djgv0xPQ, i)))).doubleValue();
               minValue = Math.min(minValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double minOf_MShoTSo/* $FF was: minOf-MShoTSo*/(long[] $this$minOf_u2dMShoTSo, Function1<? super ULong, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOf_u2dMShoTSo, "$this$minOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$minOf_u2dMShoTSo)) {
         throw new NoSuchElementException();
      } else {
         double minValue = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOf_u2dMShoTSo, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOf_u2dMShoTSo);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOf_u2dMShoTSo, i)))).doubleValue();
               minValue = Math.min(minValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double minOf_JOV_ifY/* $FF was: minOf-JOV_ifY*/(byte[] $this$minOf_u2dJOV_ifY, Function1<? super UByte, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOf_u2dJOV_ifY, "$this$minOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$minOf_u2dJOV_ifY)) {
         throw new NoSuchElementException();
      } else {
         double minValue = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOf_u2dJOV_ifY, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOf_u2dJOV_ifY);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOf_u2dJOV_ifY, i)))).doubleValue();
               minValue = Math.min(minValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double minOf_xTcfx_M/* $FF was: minOf-xTcfx_M*/(short[] $this$minOf_u2dxTcfx_M, Function1<? super UShort, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOf_u2dxTcfx_M, "$this$minOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$minOf_u2dxTcfx_M)) {
         throw new NoSuchElementException();
      } else {
         double minValue = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOf_u2dxTcfx_M, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOf_u2dxTcfx_M);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOf_u2dxTcfx_M, i)))).doubleValue();
               minValue = Math.min(minValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final float minOf_jgv0xPQ/* $FF was: minOf-jgv0xPQ*/(int[] $this$minOf_u2djgv0xPQ, Function1<? super UInt, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOf_u2djgv0xPQ, "$this$minOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$minOf_u2djgv0xPQ)) {
         throw new NoSuchElementException();
      } else {
         float minValue = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOf_u2djgv0xPQ, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOf_u2djgv0xPQ);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOf_u2djgv0xPQ, i)))).floatValue();
               minValue = Math.min(minValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final float minOf_MShoTSo/* $FF was: minOf-MShoTSo*/(long[] $this$minOf_u2dMShoTSo, Function1<? super ULong, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOf_u2dMShoTSo, "$this$minOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$minOf_u2dMShoTSo)) {
         throw new NoSuchElementException();
      } else {
         float minValue = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOf_u2dMShoTSo, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOf_u2dMShoTSo);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOf_u2dMShoTSo, i)))).floatValue();
               minValue = Math.min(minValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final float minOf_JOV_ifY/* $FF was: minOf-JOV_ifY*/(byte[] $this$minOf_u2dJOV_ifY, Function1<? super UByte, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOf_u2dJOV_ifY, "$this$minOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$minOf_u2dJOV_ifY)) {
         throw new NoSuchElementException();
      } else {
         float minValue = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOf_u2dJOV_ifY, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOf_u2dJOV_ifY);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOf_u2dJOV_ifY, i)))).floatValue();
               minValue = Math.min(minValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final float minOf_xTcfx_M/* $FF was: minOf-xTcfx_M*/(short[] $this$minOf_u2dxTcfx_M, Function1<? super UShort, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOf_u2dxTcfx_M, "$this$minOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$minOf_u2dxTcfx_M)) {
         throw new NoSuchElementException();
      } else {
         float minValue = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOf_u2dxTcfx_M, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOf_u2dxTcfx_M);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOf_u2dxTcfx_M, i)))).floatValue();
               minValue = Math.min(minValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R minOf_jgv0xPQ/* $FF was: minOf-jgv0xPQ*/(int[] $this$minOf_u2djgv0xPQ, Function1<? super UInt, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOf_u2djgv0xPQ, "$this$minOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$minOf_u2djgv0xPQ)) {
         throw new NoSuchElementException();
      } else {
         Comparable minValue = (Comparable)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOf_u2djgv0xPQ, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOf_u2djgv0xPQ);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOf_u2djgv0xPQ, i)));
               if (minValue.compareTo(v) > 0) {
                  minValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R minOf_MShoTSo/* $FF was: minOf-MShoTSo*/(long[] $this$minOf_u2dMShoTSo, Function1<? super ULong, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOf_u2dMShoTSo, "$this$minOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$minOf_u2dMShoTSo)) {
         throw new NoSuchElementException();
      } else {
         Comparable minValue = (Comparable)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOf_u2dMShoTSo, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOf_u2dMShoTSo);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOf_u2dMShoTSo, i)));
               if (minValue.compareTo(v) > 0) {
                  minValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R minOf_JOV_ifY/* $FF was: minOf-JOV_ifY*/(byte[] $this$minOf_u2dJOV_ifY, Function1<? super UByte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOf_u2dJOV_ifY, "$this$minOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$minOf_u2dJOV_ifY)) {
         throw new NoSuchElementException();
      } else {
         Comparable minValue = (Comparable)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOf_u2dJOV_ifY, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOf_u2dJOV_ifY);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOf_u2dJOV_ifY, i)));
               if (minValue.compareTo(v) > 0) {
                  minValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R minOf_xTcfx_M/* $FF was: minOf-xTcfx_M*/(short[] $this$minOf_u2dxTcfx_M, Function1<? super UShort, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOf_u2dxTcfx_M, "$this$minOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$minOf_u2dxTcfx_M)) {
         throw new NoSuchElementException();
      } else {
         Comparable minValue = (Comparable)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOf_u2dxTcfx_M, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOf_u2dxTcfx_M);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOf_u2dxTcfx_M, i)));
               if (minValue.compareTo(v) > 0) {
                  minValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Double minOfOrNull_jgv0xPQ/* $FF was: minOfOrNull-jgv0xPQ*/(int[] $this$minOfOrNull_u2djgv0xPQ, Function1<? super UInt, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull_u2djgv0xPQ, "$this$minOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$minOfOrNull_u2djgv0xPQ)) {
         return null;
      } else {
         double minValue = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOfOrNull_u2djgv0xPQ, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOfOrNull_u2djgv0xPQ);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOfOrNull_u2djgv0xPQ, i)))).doubleValue();
               minValue = Math.min(minValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Double minOfOrNull_MShoTSo/* $FF was: minOfOrNull-MShoTSo*/(long[] $this$minOfOrNull_u2dMShoTSo, Function1<? super ULong, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull_u2dMShoTSo, "$this$minOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$minOfOrNull_u2dMShoTSo)) {
         return null;
      } else {
         double minValue = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOfOrNull_u2dMShoTSo, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOfOrNull_u2dMShoTSo);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOfOrNull_u2dMShoTSo, i)))).doubleValue();
               minValue = Math.min(minValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Double minOfOrNull_JOV_ifY/* $FF was: minOfOrNull-JOV_ifY*/(byte[] $this$minOfOrNull_u2dJOV_ifY, Function1<? super UByte, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull_u2dJOV_ifY, "$this$minOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$minOfOrNull_u2dJOV_ifY)) {
         return null;
      } else {
         double minValue = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOfOrNull_u2dJOV_ifY, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOfOrNull_u2dJOV_ifY);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOfOrNull_u2dJOV_ifY, i)))).doubleValue();
               minValue = Math.min(minValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Double minOfOrNull_xTcfx_M/* $FF was: minOfOrNull-xTcfx_M*/(short[] $this$minOfOrNull_u2dxTcfx_M, Function1<? super UShort, Double> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull_u2dxTcfx_M, "$this$minOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$minOfOrNull_u2dxTcfx_M)) {
         return null;
      } else {
         double minValue = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOfOrNull_u2dxTcfx_M, 0)))).doubleValue();
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOfOrNull_u2dxTcfx_M);
         if (i <= var5) {
            while(true) {
               double v = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOfOrNull_u2dxTcfx_M, i)))).doubleValue();
               minValue = Math.min(minValue, v);
               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Float minOfOrNull_jgv0xPQ/* $FF was: minOfOrNull-jgv0xPQ*/(int[] $this$minOfOrNull_u2djgv0xPQ, Function1<? super UInt, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull_u2djgv0xPQ, "$this$minOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$minOfOrNull_u2djgv0xPQ)) {
         return null;
      } else {
         float minValue = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOfOrNull_u2djgv0xPQ, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOfOrNull_u2djgv0xPQ);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOfOrNull_u2djgv0xPQ, i)))).floatValue();
               minValue = Math.min(minValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Float minOfOrNull_MShoTSo/* $FF was: minOfOrNull-MShoTSo*/(long[] $this$minOfOrNull_u2dMShoTSo, Function1<? super ULong, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull_u2dMShoTSo, "$this$minOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$minOfOrNull_u2dMShoTSo)) {
         return null;
      } else {
         float minValue = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOfOrNull_u2dMShoTSo, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOfOrNull_u2dMShoTSo);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOfOrNull_u2dMShoTSo, i)))).floatValue();
               minValue = Math.min(minValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Float minOfOrNull_JOV_ifY/* $FF was: minOfOrNull-JOV_ifY*/(byte[] $this$minOfOrNull_u2dJOV_ifY, Function1<? super UByte, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull_u2dJOV_ifY, "$this$minOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$minOfOrNull_u2dJOV_ifY)) {
         return null;
      } else {
         float minValue = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOfOrNull_u2dJOV_ifY, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOfOrNull_u2dJOV_ifY);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOfOrNull_u2dJOV_ifY, i)))).floatValue();
               minValue = Math.min(minValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final Float minOfOrNull_xTcfx_M/* $FF was: minOfOrNull-xTcfx_M*/(short[] $this$minOfOrNull_u2dxTcfx_M, Function1<? super UShort, Float> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull_u2dxTcfx_M, "$this$minOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$minOfOrNull_u2dxTcfx_M)) {
         return null;
      } else {
         float minValue = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOfOrNull_u2dxTcfx_M, 0)))).floatValue();
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOfOrNull_u2dxTcfx_M);
         if (i <= var4) {
            while(true) {
               float v = ((Number)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOfOrNull_u2dxTcfx_M, i)))).floatValue();
               minValue = Math.min(minValue, v);
               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R minOfOrNull_jgv0xPQ/* $FF was: minOfOrNull-jgv0xPQ*/(int[] $this$minOfOrNull_u2djgv0xPQ, Function1<? super UInt, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull_u2djgv0xPQ, "$this$minOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$minOfOrNull_u2djgv0xPQ)) {
         return null;
      } else {
         Comparable minValue = (Comparable)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOfOrNull_u2djgv0xPQ, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOfOrNull_u2djgv0xPQ);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOfOrNull_u2djgv0xPQ, i)));
               if (minValue.compareTo(v) > 0) {
                  minValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R minOfOrNull_MShoTSo/* $FF was: minOfOrNull-MShoTSo*/(long[] $this$minOfOrNull_u2dMShoTSo, Function1<? super ULong, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull_u2dMShoTSo, "$this$minOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$minOfOrNull_u2dMShoTSo)) {
         return null;
      } else {
         Comparable minValue = (Comparable)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOfOrNull_u2dMShoTSo, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOfOrNull_u2dMShoTSo);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOfOrNull_u2dMShoTSo, i)));
               if (minValue.compareTo(v) > 0) {
                  minValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R minOfOrNull_JOV_ifY/* $FF was: minOfOrNull-JOV_ifY*/(byte[] $this$minOfOrNull_u2dJOV_ifY, Function1<? super UByte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull_u2dJOV_ifY, "$this$minOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$minOfOrNull_u2dJOV_ifY)) {
         return null;
      } else {
         Comparable minValue = (Comparable)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOfOrNull_u2dJOV_ifY, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOfOrNull_u2dJOV_ifY);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOfOrNull_u2dJOV_ifY, i)));
               if (minValue.compareTo(v) > 0) {
                  minValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R extends Comparable<? super R>> R minOfOrNull_xTcfx_M/* $FF was: minOfOrNull-xTcfx_M*/(short[] $this$minOfOrNull_u2dxTcfx_M, Function1<? super UShort, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfOrNull_u2dxTcfx_M, "$this$minOfOrNull");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$minOfOrNull_u2dxTcfx_M)) {
         return null;
      } else {
         Comparable minValue = (Comparable)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOfOrNull_u2dxTcfx_M, 0)));
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOfOrNull_u2dxTcfx_M);
         if (i <= var4) {
            while(true) {
               Comparable v = (Comparable)selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOfOrNull_u2dxTcfx_M, i)));
               if (minValue.compareTo(v) > 0) {
                  minValue = v;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R minOfWith_myNOsp4/* $FF was: minOfWith-myNOsp4*/(int[] $this$minOfWith_u2dmyNOsp4, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWith_u2dmyNOsp4, "$this$minOfWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$minOfWith_u2dmyNOsp4)) {
         throw new NoSuchElementException();
      } else {
         Object minValue = selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOfWith_u2dmyNOsp4, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOfWith_u2dmyNOsp4);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOfWith_u2dmyNOsp4, i)));
               if (comparator.compare(minValue, v) > 0) {
                  minValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R minOfWith_5NtCtWE/* $FF was: minOfWith-5NtCtWE*/(long[] $this$minOfWith_u2d5NtCtWE, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWith_u2d5NtCtWE, "$this$minOfWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$minOfWith_u2d5NtCtWE)) {
         throw new NoSuchElementException();
      } else {
         Object minValue = selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOfWith_u2d5NtCtWE, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOfWith_u2d5NtCtWE);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOfWith_u2d5NtCtWE, i)));
               if (comparator.compare(minValue, v) > 0) {
                  minValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R minOfWith_LTi4i_s/* $FF was: minOfWith-LTi4i_s*/(byte[] $this$minOfWith_u2dLTi4i_s, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWith_u2dLTi4i_s, "$this$minOfWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$minOfWith_u2dLTi4i_s)) {
         throw new NoSuchElementException();
      } else {
         Object minValue = selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOfWith_u2dLTi4i_s, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOfWith_u2dLTi4i_s);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOfWith_u2dLTi4i_s, i)));
               if (comparator.compare(minValue, v) > 0) {
                  minValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R minOfWith_l8EHGbQ/* $FF was: minOfWith-l8EHGbQ*/(short[] $this$minOfWith_u2dl8EHGbQ, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWith_u2dl8EHGbQ, "$this$minOfWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$minOfWith_u2dl8EHGbQ)) {
         throw new NoSuchElementException();
      } else {
         Object minValue = selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOfWith_u2dl8EHGbQ, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOfWith_u2dl8EHGbQ);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOfWith_u2dl8EHGbQ, i)));
               if (comparator.compare(minValue, v) > 0) {
                  minValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R minOfWithOrNull_myNOsp4/* $FF was: minOfWithOrNull-myNOsp4*/(int[] $this$minOfWithOrNull_u2dmyNOsp4, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWithOrNull_u2dmyNOsp4, "$this$minOfWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UIntArray.isEmpty-impl($this$minOfWithOrNull_u2dmyNOsp4)) {
         return null;
      } else {
         Object minValue = selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOfWithOrNull_u2dmyNOsp4, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOfWithOrNull_u2dmyNOsp4);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$minOfWithOrNull_u2dmyNOsp4, i)));
               if (comparator.compare(minValue, v) > 0) {
                  minValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R minOfWithOrNull_5NtCtWE/* $FF was: minOfWithOrNull-5NtCtWE*/(long[] $this$minOfWithOrNull_u2d5NtCtWE, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWithOrNull_u2d5NtCtWE, "$this$minOfWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (ULongArray.isEmpty-impl($this$minOfWithOrNull_u2d5NtCtWE)) {
         return null;
      } else {
         Object minValue = selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOfWithOrNull_u2d5NtCtWE, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOfWithOrNull_u2d5NtCtWE);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$minOfWithOrNull_u2d5NtCtWE, i)));
               if (comparator.compare(minValue, v) > 0) {
                  minValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R minOfWithOrNull_LTi4i_s/* $FF was: minOfWithOrNull-LTi4i_s*/(byte[] $this$minOfWithOrNull_u2dLTi4i_s, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWithOrNull_u2dLTi4i_s, "$this$minOfWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UByteArray.isEmpty-impl($this$minOfWithOrNull_u2dLTi4i_s)) {
         return null;
      } else {
         Object minValue = selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOfWithOrNull_u2dLTi4i_s, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOfWithOrNull_u2dLTi4i_s);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$minOfWithOrNull_u2dLTi4i_s, i)));
               if (comparator.compare(minValue, v) > 0) {
                  minValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> R minOfWithOrNull_l8EHGbQ/* $FF was: minOfWithOrNull-l8EHGbQ*/(short[] $this$minOfWithOrNull_u2dl8EHGbQ, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
      Intrinsics.checkNotNullParameter($this$minOfWithOrNull_u2dl8EHGbQ, "$this$minOfWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      if (UShortArray.isEmpty-impl($this$minOfWithOrNull_u2dl8EHGbQ)) {
         return null;
      } else {
         Object minValue = selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOfWithOrNull_u2dl8EHGbQ, 0)));
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minOfWithOrNull_u2dl8EHGbQ);
         if (i <= var5) {
            while(true) {
               Object v = selector.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$minOfWithOrNull_u2dl8EHGbQ, i)));
               if (comparator.compare(minValue, v) > 0) {
                  minValue = v;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return minValue;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UInt minOrNull__ajY_9A/* $FF was: minOrNull--ajY-9A*/(@NotNull int[] $this$minOrNull_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$minOrNull_u2d_u2dajY_u2d9A, "$this$minOrNull");
      if (UIntArray.isEmpty-impl($this$minOrNull_u2d_u2dajY_u2d9A)) {
         return null;
      } else {
         int min = UIntArray.get-pVg5ArA($this$minOrNull_u2d_u2dajY_u2d9A, 0);
         int i = 1;
         int var5 = false;
         int var3 = ArraysKt.getLastIndex($this$minOrNull_u2d_u2dajY_u2d9A);
         if (i <= var3) {
            while(true) {
               int e = UIntArray.get-pVg5ArA($this$minOrNull_u2d_u2dajY_u2d9A, i);
               if (Integer.compareUnsigned(min, e) > 0) {
                  min = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return UInt.box-impl(min);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final ULong minOrNull_QwZRm1k/* $FF was: minOrNull-QwZRm1k*/(@NotNull long[] $this$minOrNull_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$minOrNull_u2dQwZRm1k, "$this$minOrNull");
      if (ULongArray.isEmpty-impl($this$minOrNull_u2dQwZRm1k)) {
         return null;
      } else {
         long min = ULongArray.get-s-VKNKU($this$minOrNull_u2dQwZRm1k, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minOrNull_u2dQwZRm1k);
         if (i <= var4) {
            while(true) {
               long e = ULongArray.get-s-VKNKU($this$minOrNull_u2dQwZRm1k, i);
               if (Long.compareUnsigned(min, e) > 0) {
                  min = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return ULong.box-impl(min);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UByte minOrNull_GBYM_sE/* $FF was: minOrNull-GBYM_sE*/(@NotNull byte[] $this$minOrNull_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$minOrNull_u2dGBYM_sE, "$this$minOrNull");
      if (UByteArray.isEmpty-impl($this$minOrNull_u2dGBYM_sE)) {
         return null;
      } else {
         byte min = UByteArray.get-w2LRezQ($this$minOrNull_u2dGBYM_sE, 0);
         int i = 1;
         int var5 = false;
         int var3 = ArraysKt.getLastIndex($this$minOrNull_u2dGBYM_sE);
         if (i <= var3) {
            while(true) {
               byte e = UByteArray.get-w2LRezQ($this$minOrNull_u2dGBYM_sE, i);
               if (Intrinsics.compare(min & 255, e & 255) > 0) {
                  min = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return UByte.box-impl(min);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UShort minOrNull_rL5Bavg/* $FF was: minOrNull-rL5Bavg*/(@NotNull short[] $this$minOrNull_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$minOrNull_u2drL5Bavg, "$this$minOrNull");
      if (UShortArray.isEmpty-impl($this$minOrNull_u2drL5Bavg)) {
         return null;
      } else {
         short min = UShortArray.get-Mh2AYeg($this$minOrNull_u2drL5Bavg, 0);
         int i = 1;
         int var5 = false;
         int var3 = ArraysKt.getLastIndex($this$minOrNull_u2drL5Bavg);
         if (i <= var3) {
            while(true) {
               short e = UShortArray.get-Mh2AYeg($this$minOrNull_u2drL5Bavg, i);
               if (Intrinsics.compare(min & '\uffff', e & '\uffff') > 0) {
                  min = e;
               }

               if (i == var3) {
                  break;
               }

               ++i;
            }
         }

         return UShort.box-impl(min);
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minWithOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final int minWithOrThrow_U/* $FF was: minWithOrThrow-U*/(@NotNull int[] $this$minWith_u2dYmdZ_VM, @NotNull Comparator<? super UInt> comparator) {
      Intrinsics.checkNotNullParameter($this$minWith_u2dYmdZ_VM, "$this$minWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (UIntArray.isEmpty-impl($this$minWith_u2dYmdZ_VM)) {
         throw new NoSuchElementException();
      } else {
         int min = UIntArray.get-pVg5ArA($this$minWith_u2dYmdZ_VM, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minWith_u2dYmdZ_VM);
         if (i <= var4) {
            while(true) {
               int e = UIntArray.get-pVg5ArA($this$minWith_u2dYmdZ_VM, i);
               if (comparator.compare(UInt.box-impl(min), UInt.box-impl(e)) > 0) {
                  min = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minWithOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final long minWithOrThrow_U/* $FF was: minWithOrThrow-U*/(@NotNull long[] $this$minWith_u2dzrEWJaI, @NotNull Comparator<? super ULong> comparator) {
      Intrinsics.checkNotNullParameter($this$minWith_u2dzrEWJaI, "$this$minWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (ULongArray.isEmpty-impl($this$minWith_u2dzrEWJaI)) {
         throw new NoSuchElementException();
      } else {
         long min = ULongArray.get-s-VKNKU($this$minWith_u2dzrEWJaI, 0);
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minWith_u2dzrEWJaI);
         if (i <= var5) {
            while(true) {
               long e = ULongArray.get-s-VKNKU($this$minWith_u2dzrEWJaI, i);
               if (comparator.compare(ULong.box-impl(min), ULong.box-impl(e)) > 0) {
                  min = e;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minWithOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final byte minWithOrThrow_U/* $FF was: minWithOrThrow-U*/(@NotNull byte[] $this$minWith_u2dXMRcp5o, @NotNull Comparator<? super UByte> comparator) {
      Intrinsics.checkNotNullParameter($this$minWith_u2dXMRcp5o, "$this$minWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (UByteArray.isEmpty-impl($this$minWith_u2dXMRcp5o)) {
         throw new NoSuchElementException();
      } else {
         byte min = UByteArray.get-w2LRezQ($this$minWith_u2dXMRcp5o, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minWith_u2dXMRcp5o);
         if (i <= var4) {
            while(true) {
               byte e = UByteArray.get-w2LRezQ($this$minWith_u2dXMRcp5o, i);
               if (comparator.compare(UByte.box-impl(min), UByte.box-impl(e)) > 0) {
                  min = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.7"
   )
   @JvmName(
      name = "minWithOrThrow-U"
   )
   @ExperimentalUnsignedTypes
   public static final short minWithOrThrow_U/* $FF was: minWithOrThrow-U*/(@NotNull short[] $this$minWith_u2deOHTfZs, @NotNull Comparator<? super UShort> comparator) {
      Intrinsics.checkNotNullParameter($this$minWith_u2deOHTfZs, "$this$minWith");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (UShortArray.isEmpty-impl($this$minWith_u2deOHTfZs)) {
         throw new NoSuchElementException();
      } else {
         short min = UShortArray.get-Mh2AYeg($this$minWith_u2deOHTfZs, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minWith_u2deOHTfZs);
         if (i <= var4) {
            while(true) {
               short e = UShortArray.get-Mh2AYeg($this$minWith_u2deOHTfZs, i);
               if (comparator.compare(UShort.box-impl(min), UShort.box-impl(e)) > 0) {
                  min = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return min;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UInt minWithOrNull_YmdZ_VM/* $FF was: minWithOrNull-YmdZ_VM*/(@NotNull int[] $this$minWithOrNull_u2dYmdZ_VM, @NotNull Comparator<? super UInt> comparator) {
      Intrinsics.checkNotNullParameter($this$minWithOrNull_u2dYmdZ_VM, "$this$minWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (UIntArray.isEmpty-impl($this$minWithOrNull_u2dYmdZ_VM)) {
         return null;
      } else {
         int min = UIntArray.get-pVg5ArA($this$minWithOrNull_u2dYmdZ_VM, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minWithOrNull_u2dYmdZ_VM);
         if (i <= var4) {
            while(true) {
               int e = UIntArray.get-pVg5ArA($this$minWithOrNull_u2dYmdZ_VM, i);
               if (comparator.compare(UInt.box-impl(min), UInt.box-impl(e)) > 0) {
                  min = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return UInt.box-impl(min);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final ULong minWithOrNull_zrEWJaI/* $FF was: minWithOrNull-zrEWJaI*/(@NotNull long[] $this$minWithOrNull_u2dzrEWJaI, @NotNull Comparator<? super ULong> comparator) {
      Intrinsics.checkNotNullParameter($this$minWithOrNull_u2dzrEWJaI, "$this$minWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (ULongArray.isEmpty-impl($this$minWithOrNull_u2dzrEWJaI)) {
         return null;
      } else {
         long min = ULongArray.get-s-VKNKU($this$minWithOrNull_u2dzrEWJaI, 0);
         int i = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$minWithOrNull_u2dzrEWJaI);
         if (i <= var5) {
            while(true) {
               long e = ULongArray.get-s-VKNKU($this$minWithOrNull_u2dzrEWJaI, i);
               if (comparator.compare(ULong.box-impl(min), ULong.box-impl(e)) > 0) {
                  min = e;
               }

               if (i == var5) {
                  break;
               }

               ++i;
            }
         }

         return ULong.box-impl(min);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UByte minWithOrNull_XMRcp5o/* $FF was: minWithOrNull-XMRcp5o*/(@NotNull byte[] $this$minWithOrNull_u2dXMRcp5o, @NotNull Comparator<? super UByte> comparator) {
      Intrinsics.checkNotNullParameter($this$minWithOrNull_u2dXMRcp5o, "$this$minWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (UByteArray.isEmpty-impl($this$minWithOrNull_u2dXMRcp5o)) {
         return null;
      } else {
         byte min = UByteArray.get-w2LRezQ($this$minWithOrNull_u2dXMRcp5o, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minWithOrNull_u2dXMRcp5o);
         if (i <= var4) {
            while(true) {
               byte e = UByteArray.get-w2LRezQ($this$minWithOrNull_u2dXMRcp5o, i);
               if (comparator.compare(UByte.box-impl(min), UByte.box-impl(e)) > 0) {
                  min = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return UByte.box-impl(min);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @Nullable
   public static final UShort minWithOrNull_eOHTfZs/* $FF was: minWithOrNull-eOHTfZs*/(@NotNull short[] $this$minWithOrNull_u2deOHTfZs, @NotNull Comparator<? super UShort> comparator) {
      Intrinsics.checkNotNullParameter($this$minWithOrNull_u2deOHTfZs, "$this$minWithOrNull");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      if (UShortArray.isEmpty-impl($this$minWithOrNull_u2deOHTfZs)) {
         return null;
      } else {
         short min = UShortArray.get-Mh2AYeg($this$minWithOrNull_u2deOHTfZs, 0);
         int i = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$minWithOrNull_u2deOHTfZs);
         if (i <= var4) {
            while(true) {
               short e = UShortArray.get-Mh2AYeg($this$minWithOrNull_u2deOHTfZs, i);
               if (comparator.compare(UShort.box-impl(min), UShort.box-impl(e)) > 0) {
                  min = e;
               }

               if (i == var4) {
                  break;
               }

               ++i;
            }
         }

         return UShort.box-impl(min);
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean none__ajY_9A/* $FF was: none--ajY-9A*/(int[] $this$none_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$none_u2d_u2dajY_u2d9A, "$this$none");
      return UIntArray.isEmpty-impl($this$none_u2d_u2dajY_u2d9A);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean none_QwZRm1k/* $FF was: none-QwZRm1k*/(long[] $this$none_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$none_u2dQwZRm1k, "$this$none");
      return ULongArray.isEmpty-impl($this$none_u2dQwZRm1k);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean none_GBYM_sE/* $FF was: none-GBYM_sE*/(byte[] $this$none_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$none_u2dGBYM_sE, "$this$none");
      return UByteArray.isEmpty-impl($this$none_u2dGBYM_sE);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean none_rL5Bavg/* $FF was: none-rL5Bavg*/(short[] $this$none_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$none_u2drL5Bavg, "$this$none");
      return UShortArray.isEmpty-impl($this$none_u2drL5Bavg);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean none_jgv0xPQ/* $FF was: none-jgv0xPQ*/(int[] $this$none_u2djgv0xPQ, Function1<? super UInt, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$none_u2djgv0xPQ, "$this$none");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UIntArray.getSize-impl($this$none_u2djgv0xPQ); var2 < var3; ++var2) {
         int element = UIntArray.get-pVg5ArA($this$none_u2djgv0xPQ, var2);
         if ((Boolean)predicate.invoke(UInt.box-impl(element))) {
            return false;
         }
      }

      return true;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean none_MShoTSo/* $FF was: none-MShoTSo*/(long[] $this$none_u2dMShoTSo, Function1<? super ULong, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$none_u2dMShoTSo, "$this$none");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = ULongArray.getSize-impl($this$none_u2dMShoTSo); var2 < var3; ++var2) {
         long element = ULongArray.get-s-VKNKU($this$none_u2dMShoTSo, var2);
         if ((Boolean)predicate.invoke(ULong.box-impl(element))) {
            return false;
         }
      }

      return true;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean none_JOV_ifY/* $FF was: none-JOV_ifY*/(byte[] $this$none_u2dJOV_ifY, Function1<? super UByte, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$none_u2dJOV_ifY, "$this$none");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UByteArray.getSize-impl($this$none_u2dJOV_ifY); var2 < var3; ++var2) {
         byte element = UByteArray.get-w2LRezQ($this$none_u2dJOV_ifY, var2);
         if ((Boolean)predicate.invoke(UByte.box-impl(element))) {
            return false;
         }
      }

      return true;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final boolean none_xTcfx_M/* $FF was: none-xTcfx_M*/(short[] $this$none_u2dxTcfx_M, Function1<? super UShort, Boolean> predicate) {
      Intrinsics.checkNotNullParameter($this$none_u2dxTcfx_M, "$this$none");
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      int var2 = 0;

      for(int var3 = UShortArray.getSize-impl($this$none_u2dxTcfx_M); var2 < var3; ++var2) {
         short element = UShortArray.get-Mh2AYeg($this$none_u2dxTcfx_M, var2);
         if ((Boolean)predicate.invoke(UShort.box-impl(element))) {
            return false;
         }
      }

      return true;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] onEach_jgv0xPQ/* $FF was: onEach-jgv0xPQ*/(int[] $this$onEach_u2djgv0xPQ, Function1<? super UInt, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEach_u2djgv0xPQ, "$this$onEach");
      Intrinsics.checkNotNullParameter(action, "action");
      int[] $this$onEach_jgv0xPQ_u24lambda_u2460 = $this$onEach_u2djgv0xPQ;
      int var4 = false;
      int var5 = 0;

      for(int var6 = UIntArray.getSize-impl($this$onEach_u2djgv0xPQ); var5 < var6; ++var5) {
         int element = UIntArray.get-pVg5ArA($this$onEach_jgv0xPQ_u24lambda_u2460, var5);
         action.invoke(UInt.box-impl(element));
      }

      return $this$onEach_u2djgv0xPQ;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] onEach_MShoTSo/* $FF was: onEach-MShoTSo*/(long[] $this$onEach_u2dMShoTSo, Function1<? super ULong, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEach_u2dMShoTSo, "$this$onEach");
      Intrinsics.checkNotNullParameter(action, "action");
      long[] $this$onEach_MShoTSo_u24lambda_u2461 = $this$onEach_u2dMShoTSo;
      int var4 = false;
      int var5 = 0;

      for(int var6 = ULongArray.getSize-impl($this$onEach_u2dMShoTSo); var5 < var6; ++var5) {
         long element = ULongArray.get-s-VKNKU($this$onEach_MShoTSo_u24lambda_u2461, var5);
         action.invoke(ULong.box-impl(element));
      }

      return $this$onEach_u2dMShoTSo;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] onEach_JOV_ifY/* $FF was: onEach-JOV_ifY*/(byte[] $this$onEach_u2dJOV_ifY, Function1<? super UByte, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEach_u2dJOV_ifY, "$this$onEach");
      Intrinsics.checkNotNullParameter(action, "action");
      byte[] $this$onEach_JOV_ifY_u24lambda_u2462 = $this$onEach_u2dJOV_ifY;
      int var4 = false;
      int var5 = 0;

      for(int var6 = UByteArray.getSize-impl($this$onEach_u2dJOV_ifY); var5 < var6; ++var5) {
         byte element = UByteArray.get-w2LRezQ($this$onEach_JOV_ifY_u24lambda_u2462, var5);
         action.invoke(UByte.box-impl(element));
      }

      return $this$onEach_u2dJOV_ifY;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] onEach_xTcfx_M/* $FF was: onEach-xTcfx_M*/(short[] $this$onEach_u2dxTcfx_M, Function1<? super UShort, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEach_u2dxTcfx_M, "$this$onEach");
      Intrinsics.checkNotNullParameter(action, "action");
      short[] $this$onEach_xTcfx_M_u24lambda_u2463 = $this$onEach_u2dxTcfx_M;
      int var4 = false;
      int var5 = 0;

      for(int var6 = UShortArray.getSize-impl($this$onEach_u2dxTcfx_M); var5 < var6; ++var5) {
         short element = UShortArray.get-Mh2AYeg($this$onEach_xTcfx_M_u24lambda_u2463, var5);
         action.invoke(UShort.box-impl(element));
      }

      return $this$onEach_u2dxTcfx_M;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int[] onEachIndexed_WyvcNBI/* $FF was: onEachIndexed-WyvcNBI*/(int[] $this$onEachIndexed_u2dWyvcNBI, Function2<? super Integer, ? super UInt, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEachIndexed_u2dWyvcNBI, "$this$onEachIndexed");
      Intrinsics.checkNotNullParameter(action, "action");
      int var4 = false;
      int[] var5 = $this$onEachIndexed_u2dWyvcNBI;
      int var6 = 0;
      int var7 = 0;

      for(int var8 = UIntArray.getSize-impl($this$onEachIndexed_u2dWyvcNBI); var7 < var8; ++var7) {
         int var9 = UIntArray.get-pVg5ArA(var5, var7);
         action.invoke(var6++, UInt.box-impl(var9));
      }

      return $this$onEachIndexed_u2dWyvcNBI;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long[] onEachIndexed_s8dVfGU/* $FF was: onEachIndexed-s8dVfGU*/(long[] $this$onEachIndexed_u2ds8dVfGU, Function2<? super Integer, ? super ULong, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEachIndexed_u2ds8dVfGU, "$this$onEachIndexed");
      Intrinsics.checkNotNullParameter(action, "action");
      int var4 = false;
      long[] var5 = $this$onEachIndexed_u2ds8dVfGU;
      int var6 = 0;
      int var7 = 0;

      for(int var8 = ULongArray.getSize-impl($this$onEachIndexed_u2ds8dVfGU); var7 < var8; ++var7) {
         long var9 = ULongArray.get-s-VKNKU(var5, var7);
         action.invoke(var6++, ULong.box-impl(var9));
      }

      return $this$onEachIndexed_u2ds8dVfGU;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte[] onEachIndexed_ELGow60/* $FF was: onEachIndexed-ELGow60*/(byte[] $this$onEachIndexed_u2dELGow60, Function2<? super Integer, ? super UByte, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEachIndexed_u2dELGow60, "$this$onEachIndexed");
      Intrinsics.checkNotNullParameter(action, "action");
      int var4 = false;
      byte[] var5 = $this$onEachIndexed_u2dELGow60;
      int var6 = 0;
      int var7 = 0;

      for(int var8 = UByteArray.getSize-impl($this$onEachIndexed_u2dELGow60); var7 < var8; ++var7) {
         byte var9 = UByteArray.get-w2LRezQ(var5, var7);
         action.invoke(var6++, UByte.box-impl(var9));
      }

      return $this$onEachIndexed_u2dELGow60;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short[] onEachIndexed_xzaTVY8/* $FF was: onEachIndexed-xzaTVY8*/(short[] $this$onEachIndexed_u2dxzaTVY8, Function2<? super Integer, ? super UShort, Unit> action) {
      Intrinsics.checkNotNullParameter($this$onEachIndexed_u2dxzaTVY8, "$this$onEachIndexed");
      Intrinsics.checkNotNullParameter(action, "action");
      int var4 = false;
      short[] var5 = $this$onEachIndexed_u2dxzaTVY8;
      int var6 = 0;
      int var7 = 0;

      for(int var8 = UShortArray.getSize-impl($this$onEachIndexed_u2dxzaTVY8); var7 < var8; ++var7) {
         short var9 = UShortArray.get-Mh2AYeg(var5, var7);
         action.invoke(var6++, UShort.box-impl(var9));
      }

      return $this$onEachIndexed_u2dxzaTVY8;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int reduce_WyvcNBI/* $FF was: reduce-WyvcNBI*/(int[] $this$reduce_u2dWyvcNBI, Function2<? super UInt, ? super UInt, UInt> operation) {
      Intrinsics.checkNotNullParameter($this$reduce_u2dWyvcNBI, "$this$reduce");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UIntArray.isEmpty-impl($this$reduce_u2dWyvcNBI)) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         int accumulator = UIntArray.get-pVg5ArA($this$reduce_u2dWyvcNBI, 0);
         int index = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$reduce_u2dWyvcNBI);
         if (index <= var4) {
            while(true) {
               accumulator = ((UInt)operation.invoke(UInt.box-impl(accumulator), UInt.box-impl(UIntArray.get-pVg5ArA($this$reduce_u2dWyvcNBI, index)))).unbox-impl();
               if (index == var4) {
                  break;
               }

               ++index;
            }
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long reduce_s8dVfGU/* $FF was: reduce-s8dVfGU*/(long[] $this$reduce_u2ds8dVfGU, Function2<? super ULong, ? super ULong, ULong> operation) {
      Intrinsics.checkNotNullParameter($this$reduce_u2ds8dVfGU, "$this$reduce");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (ULongArray.isEmpty-impl($this$reduce_u2ds8dVfGU)) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         long accumulator = ULongArray.get-s-VKNKU($this$reduce_u2ds8dVfGU, 0);
         int index = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$reduce_u2ds8dVfGU);
         if (index <= var5) {
            while(true) {
               accumulator = ((ULong)operation.invoke(ULong.box-impl(accumulator), ULong.box-impl(ULongArray.get-s-VKNKU($this$reduce_u2ds8dVfGU, index)))).unbox-impl();
               if (index == var5) {
                  break;
               }

               ++index;
            }
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte reduce_ELGow60/* $FF was: reduce-ELGow60*/(byte[] $this$reduce_u2dELGow60, Function2<? super UByte, ? super UByte, UByte> operation) {
      Intrinsics.checkNotNullParameter($this$reduce_u2dELGow60, "$this$reduce");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UByteArray.isEmpty-impl($this$reduce_u2dELGow60)) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         byte accumulator = UByteArray.get-w2LRezQ($this$reduce_u2dELGow60, 0);
         int index = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$reduce_u2dELGow60);
         if (index <= var4) {
            while(true) {
               accumulator = ((UByte)operation.invoke(UByte.box-impl(accumulator), UByte.box-impl(UByteArray.get-w2LRezQ($this$reduce_u2dELGow60, index)))).unbox-impl();
               if (index == var4) {
                  break;
               }

               ++index;
            }
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short reduce_xzaTVY8/* $FF was: reduce-xzaTVY8*/(short[] $this$reduce_u2dxzaTVY8, Function2<? super UShort, ? super UShort, UShort> operation) {
      Intrinsics.checkNotNullParameter($this$reduce_u2dxzaTVY8, "$this$reduce");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UShortArray.isEmpty-impl($this$reduce_u2dxzaTVY8)) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         short accumulator = UShortArray.get-Mh2AYeg($this$reduce_u2dxzaTVY8, 0);
         int index = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$reduce_u2dxzaTVY8);
         if (index <= var4) {
            while(true) {
               accumulator = ((UShort)operation.invoke(UShort.box-impl(accumulator), UShort.box-impl(UShortArray.get-Mh2AYeg($this$reduce_u2dxzaTVY8, index)))).unbox-impl();
               if (index == var4) {
                  break;
               }

               ++index;
            }
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int reduceIndexed_D40WMg8/* $FF was: reduceIndexed-D40WMg8*/(int[] $this$reduceIndexed_u2dD40WMg8, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexed_u2dD40WMg8, "$this$reduceIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UIntArray.isEmpty-impl($this$reduceIndexed_u2dD40WMg8)) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         int accumulator = UIntArray.get-pVg5ArA($this$reduceIndexed_u2dD40WMg8, 0);
         int index = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$reduceIndexed_u2dD40WMg8);
         if (index <= var4) {
            while(true) {
               accumulator = ((UInt)operation.invoke(index, UInt.box-impl(accumulator), UInt.box-impl(UIntArray.get-pVg5ArA($this$reduceIndexed_u2dD40WMg8, index)))).unbox-impl();
               if (index == var4) {
                  break;
               }

               ++index;
            }
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long reduceIndexed_z1zDJgo/* $FF was: reduceIndexed-z1zDJgo*/(long[] $this$reduceIndexed_u2dz1zDJgo, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexed_u2dz1zDJgo, "$this$reduceIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (ULongArray.isEmpty-impl($this$reduceIndexed_u2dz1zDJgo)) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         long accumulator = ULongArray.get-s-VKNKU($this$reduceIndexed_u2dz1zDJgo, 0);
         int index = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$reduceIndexed_u2dz1zDJgo);
         if (index <= var5) {
            while(true) {
               accumulator = ((ULong)operation.invoke(index, ULong.box-impl(accumulator), ULong.box-impl(ULongArray.get-s-VKNKU($this$reduceIndexed_u2dz1zDJgo, index)))).unbox-impl();
               if (index == var5) {
                  break;
               }

               ++index;
            }
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte reduceIndexed_EOyYB1Y/* $FF was: reduceIndexed-EOyYB1Y*/(byte[] $this$reduceIndexed_u2dEOyYB1Y, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexed_u2dEOyYB1Y, "$this$reduceIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UByteArray.isEmpty-impl($this$reduceIndexed_u2dEOyYB1Y)) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         byte accumulator = UByteArray.get-w2LRezQ($this$reduceIndexed_u2dEOyYB1Y, 0);
         int index = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$reduceIndexed_u2dEOyYB1Y);
         if (index <= var4) {
            while(true) {
               accumulator = ((UByte)operation.invoke(index, UByte.box-impl(accumulator), UByte.box-impl(UByteArray.get-w2LRezQ($this$reduceIndexed_u2dEOyYB1Y, index)))).unbox-impl();
               if (index == var4) {
                  break;
               }

               ++index;
            }
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short reduceIndexed_aLgx1Fo/* $FF was: reduceIndexed-aLgx1Fo*/(short[] $this$reduceIndexed_u2daLgx1Fo, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexed_u2daLgx1Fo, "$this$reduceIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UShortArray.isEmpty-impl($this$reduceIndexed_u2daLgx1Fo)) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         short accumulator = UShortArray.get-Mh2AYeg($this$reduceIndexed_u2daLgx1Fo, 0);
         int index = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$reduceIndexed_u2daLgx1Fo);
         if (index <= var4) {
            while(true) {
               accumulator = ((UShort)operation.invoke(index, UShort.box-impl(accumulator), UShort.box-impl(UShortArray.get-Mh2AYeg($this$reduceIndexed_u2daLgx1Fo, index)))).unbox-impl();
               if (index == var4) {
                  break;
               }

               ++index;
            }
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UInt reduceIndexedOrNull_D40WMg8/* $FF was: reduceIndexedOrNull-D40WMg8*/(int[] $this$reduceIndexedOrNull_u2dD40WMg8, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexedOrNull_u2dD40WMg8, "$this$reduceIndexedOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UIntArray.isEmpty-impl($this$reduceIndexedOrNull_u2dD40WMg8)) {
         return null;
      } else {
         int accumulator = UIntArray.get-pVg5ArA($this$reduceIndexedOrNull_u2dD40WMg8, 0);
         int index = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$reduceIndexedOrNull_u2dD40WMg8);
         if (index <= var4) {
            while(true) {
               accumulator = ((UInt)operation.invoke(index, UInt.box-impl(accumulator), UInt.box-impl(UIntArray.get-pVg5ArA($this$reduceIndexedOrNull_u2dD40WMg8, index)))).unbox-impl();
               if (index == var4) {
                  break;
               }

               ++index;
            }
         }

         return UInt.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final ULong reduceIndexedOrNull_z1zDJgo/* $FF was: reduceIndexedOrNull-z1zDJgo*/(long[] $this$reduceIndexedOrNull_u2dz1zDJgo, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexedOrNull_u2dz1zDJgo, "$this$reduceIndexedOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (ULongArray.isEmpty-impl($this$reduceIndexedOrNull_u2dz1zDJgo)) {
         return null;
      } else {
         long accumulator = ULongArray.get-s-VKNKU($this$reduceIndexedOrNull_u2dz1zDJgo, 0);
         int index = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$reduceIndexedOrNull_u2dz1zDJgo);
         if (index <= var5) {
            while(true) {
               accumulator = ((ULong)operation.invoke(index, ULong.box-impl(accumulator), ULong.box-impl(ULongArray.get-s-VKNKU($this$reduceIndexedOrNull_u2dz1zDJgo, index)))).unbox-impl();
               if (index == var5) {
                  break;
               }

               ++index;
            }
         }

         return ULong.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UByte reduceIndexedOrNull_EOyYB1Y/* $FF was: reduceIndexedOrNull-EOyYB1Y*/(byte[] $this$reduceIndexedOrNull_u2dEOyYB1Y, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexedOrNull_u2dEOyYB1Y, "$this$reduceIndexedOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UByteArray.isEmpty-impl($this$reduceIndexedOrNull_u2dEOyYB1Y)) {
         return null;
      } else {
         byte accumulator = UByteArray.get-w2LRezQ($this$reduceIndexedOrNull_u2dEOyYB1Y, 0);
         int index = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$reduceIndexedOrNull_u2dEOyYB1Y);
         if (index <= var4) {
            while(true) {
               accumulator = ((UByte)operation.invoke(index, UByte.box-impl(accumulator), UByte.box-impl(UByteArray.get-w2LRezQ($this$reduceIndexedOrNull_u2dEOyYB1Y, index)))).unbox-impl();
               if (index == var4) {
                  break;
               }

               ++index;
            }
         }

         return UByte.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UShort reduceIndexedOrNull_aLgx1Fo/* $FF was: reduceIndexedOrNull-aLgx1Fo*/(short[] $this$reduceIndexedOrNull_u2daLgx1Fo, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
      Intrinsics.checkNotNullParameter($this$reduceIndexedOrNull_u2daLgx1Fo, "$this$reduceIndexedOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UShortArray.isEmpty-impl($this$reduceIndexedOrNull_u2daLgx1Fo)) {
         return null;
      } else {
         short accumulator = UShortArray.get-Mh2AYeg($this$reduceIndexedOrNull_u2daLgx1Fo, 0);
         int index = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$reduceIndexedOrNull_u2daLgx1Fo);
         if (index <= var4) {
            while(true) {
               accumulator = ((UShort)operation.invoke(index, UShort.box-impl(accumulator), UShort.box-impl(UShortArray.get-Mh2AYeg($this$reduceIndexedOrNull_u2daLgx1Fo, index)))).unbox-impl();
               if (index == var4) {
                  break;
               }

               ++index;
            }
         }

         return UShort.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UInt reduceOrNull_WyvcNBI/* $FF was: reduceOrNull-WyvcNBI*/(int[] $this$reduceOrNull_u2dWyvcNBI, Function2<? super UInt, ? super UInt, UInt> operation) {
      Intrinsics.checkNotNullParameter($this$reduceOrNull_u2dWyvcNBI, "$this$reduceOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UIntArray.isEmpty-impl($this$reduceOrNull_u2dWyvcNBI)) {
         return null;
      } else {
         int accumulator = UIntArray.get-pVg5ArA($this$reduceOrNull_u2dWyvcNBI, 0);
         int index = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$reduceOrNull_u2dWyvcNBI);
         if (index <= var4) {
            while(true) {
               accumulator = ((UInt)operation.invoke(UInt.box-impl(accumulator), UInt.box-impl(UIntArray.get-pVg5ArA($this$reduceOrNull_u2dWyvcNBI, index)))).unbox-impl();
               if (index == var4) {
                  break;
               }

               ++index;
            }
         }

         return UInt.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final ULong reduceOrNull_s8dVfGU/* $FF was: reduceOrNull-s8dVfGU*/(long[] $this$reduceOrNull_u2ds8dVfGU, Function2<? super ULong, ? super ULong, ULong> operation) {
      Intrinsics.checkNotNullParameter($this$reduceOrNull_u2ds8dVfGU, "$this$reduceOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (ULongArray.isEmpty-impl($this$reduceOrNull_u2ds8dVfGU)) {
         return null;
      } else {
         long accumulator = ULongArray.get-s-VKNKU($this$reduceOrNull_u2ds8dVfGU, 0);
         int index = 1;
         int var7 = false;
         int var5 = ArraysKt.getLastIndex($this$reduceOrNull_u2ds8dVfGU);
         if (index <= var5) {
            while(true) {
               accumulator = ((ULong)operation.invoke(ULong.box-impl(accumulator), ULong.box-impl(ULongArray.get-s-VKNKU($this$reduceOrNull_u2ds8dVfGU, index)))).unbox-impl();
               if (index == var5) {
                  break;
               }

               ++index;
            }
         }

         return ULong.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UByte reduceOrNull_ELGow60/* $FF was: reduceOrNull-ELGow60*/(byte[] $this$reduceOrNull_u2dELGow60, Function2<? super UByte, ? super UByte, UByte> operation) {
      Intrinsics.checkNotNullParameter($this$reduceOrNull_u2dELGow60, "$this$reduceOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UByteArray.isEmpty-impl($this$reduceOrNull_u2dELGow60)) {
         return null;
      } else {
         byte accumulator = UByteArray.get-w2LRezQ($this$reduceOrNull_u2dELGow60, 0);
         int index = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$reduceOrNull_u2dELGow60);
         if (index <= var4) {
            while(true) {
               accumulator = ((UByte)operation.invoke(UByte.box-impl(accumulator), UByte.box-impl(UByteArray.get-w2LRezQ($this$reduceOrNull_u2dELGow60, index)))).unbox-impl();
               if (index == var4) {
                  break;
               }

               ++index;
            }
         }

         return UByte.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UShort reduceOrNull_xzaTVY8/* $FF was: reduceOrNull-xzaTVY8*/(short[] $this$reduceOrNull_u2dxzaTVY8, Function2<? super UShort, ? super UShort, UShort> operation) {
      Intrinsics.checkNotNullParameter($this$reduceOrNull_u2dxzaTVY8, "$this$reduceOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UShortArray.isEmpty-impl($this$reduceOrNull_u2dxzaTVY8)) {
         return null;
      } else {
         short accumulator = UShortArray.get-Mh2AYeg($this$reduceOrNull_u2dxzaTVY8, 0);
         int index = 1;
         int var6 = false;
         int var4 = ArraysKt.getLastIndex($this$reduceOrNull_u2dxzaTVY8);
         if (index <= var4) {
            while(true) {
               accumulator = ((UShort)operation.invoke(UShort.box-impl(accumulator), UShort.box-impl(UShortArray.get-Mh2AYeg($this$reduceOrNull_u2dxzaTVY8, index)))).unbox-impl();
               if (index == var4) {
                  break;
               }

               ++index;
            }
         }

         return UShort.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int reduceRight_WyvcNBI/* $FF was: reduceRight-WyvcNBI*/(int[] $this$reduceRight_u2dWyvcNBI, Function2<? super UInt, ? super UInt, UInt> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRight_u2dWyvcNBI, "$this$reduceRight");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRight_u2dWyvcNBI);
      if (index < 0) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         int accumulator;
         for(accumulator = UIntArray.get-pVg5ArA($this$reduceRight_u2dWyvcNBI, index--); index >= 0; accumulator = ((UInt)operation.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$reduceRight_u2dWyvcNBI, index--)), UInt.box-impl(accumulator))).unbox-impl()) {
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long reduceRight_s8dVfGU/* $FF was: reduceRight-s8dVfGU*/(long[] $this$reduceRight_u2ds8dVfGU, Function2<? super ULong, ? super ULong, ULong> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRight_u2ds8dVfGU, "$this$reduceRight");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRight_u2ds8dVfGU);
      if (index < 0) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         long accumulator;
         for(accumulator = ULongArray.get-s-VKNKU($this$reduceRight_u2ds8dVfGU, index--); index >= 0; accumulator = ((ULong)operation.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$reduceRight_u2ds8dVfGU, index--)), ULong.box-impl(accumulator))).unbox-impl()) {
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte reduceRight_ELGow60/* $FF was: reduceRight-ELGow60*/(byte[] $this$reduceRight_u2dELGow60, Function2<? super UByte, ? super UByte, UByte> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRight_u2dELGow60, "$this$reduceRight");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRight_u2dELGow60);
      if (index < 0) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         byte accumulator;
         for(accumulator = UByteArray.get-w2LRezQ($this$reduceRight_u2dELGow60, index--); index >= 0; accumulator = ((UByte)operation.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$reduceRight_u2dELGow60, index--)), UByte.box-impl(accumulator))).unbox-impl()) {
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short reduceRight_xzaTVY8/* $FF was: reduceRight-xzaTVY8*/(short[] $this$reduceRight_u2dxzaTVY8, Function2<? super UShort, ? super UShort, UShort> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRight_u2dxzaTVY8, "$this$reduceRight");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRight_u2dxzaTVY8);
      if (index < 0) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         short accumulator;
         for(accumulator = UShortArray.get-Mh2AYeg($this$reduceRight_u2dxzaTVY8, index--); index >= 0; accumulator = ((UShort)operation.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$reduceRight_u2dxzaTVY8, index--)), UShort.box-impl(accumulator))).unbox-impl()) {
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int reduceRightIndexed_D40WMg8/* $FF was: reduceRightIndexed-D40WMg8*/(int[] $this$reduceRightIndexed_u2dD40WMg8, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightIndexed_u2dD40WMg8, "$this$reduceRightIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRightIndexed_u2dD40WMg8);
      if (index < 0) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         int accumulator;
         for(accumulator = UIntArray.get-pVg5ArA($this$reduceRightIndexed_u2dD40WMg8, index--); index >= 0; --index) {
            accumulator = ((UInt)operation.invoke(index, UInt.box-impl(UIntArray.get-pVg5ArA($this$reduceRightIndexed_u2dD40WMg8, index)), UInt.box-impl(accumulator))).unbox-impl();
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long reduceRightIndexed_z1zDJgo/* $FF was: reduceRightIndexed-z1zDJgo*/(long[] $this$reduceRightIndexed_u2dz1zDJgo, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightIndexed_u2dz1zDJgo, "$this$reduceRightIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRightIndexed_u2dz1zDJgo);
      if (index < 0) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         long accumulator;
         for(accumulator = ULongArray.get-s-VKNKU($this$reduceRightIndexed_u2dz1zDJgo, index--); index >= 0; --index) {
            accumulator = ((ULong)operation.invoke(index, ULong.box-impl(ULongArray.get-s-VKNKU($this$reduceRightIndexed_u2dz1zDJgo, index)), ULong.box-impl(accumulator))).unbox-impl();
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final byte reduceRightIndexed_EOyYB1Y/* $FF was: reduceRightIndexed-EOyYB1Y*/(byte[] $this$reduceRightIndexed_u2dEOyYB1Y, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightIndexed_u2dEOyYB1Y, "$this$reduceRightIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRightIndexed_u2dEOyYB1Y);
      if (index < 0) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         byte accumulator;
         for(accumulator = UByteArray.get-w2LRezQ($this$reduceRightIndexed_u2dEOyYB1Y, index--); index >= 0; --index) {
            accumulator = ((UByte)operation.invoke(index, UByte.box-impl(UByteArray.get-w2LRezQ($this$reduceRightIndexed_u2dEOyYB1Y, index)), UByte.box-impl(accumulator))).unbox-impl();
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final short reduceRightIndexed_aLgx1Fo/* $FF was: reduceRightIndexed-aLgx1Fo*/(short[] $this$reduceRightIndexed_u2daLgx1Fo, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightIndexed_u2daLgx1Fo, "$this$reduceRightIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRightIndexed_u2daLgx1Fo);
      if (index < 0) {
         throw new UnsupportedOperationException("Empty array can't be reduced.");
      } else {
         short accumulator;
         for(accumulator = UShortArray.get-Mh2AYeg($this$reduceRightIndexed_u2daLgx1Fo, index--); index >= 0; --index) {
            accumulator = ((UShort)operation.invoke(index, UShort.box-impl(UShortArray.get-Mh2AYeg($this$reduceRightIndexed_u2daLgx1Fo, index)), UShort.box-impl(accumulator))).unbox-impl();
         }

         return accumulator;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UInt reduceRightIndexedOrNull_D40WMg8/* $FF was: reduceRightIndexedOrNull-D40WMg8*/(int[] $this$reduceRightIndexedOrNull_u2dD40WMg8, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightIndexedOrNull_u2dD40WMg8, "$this$reduceRightIndexedOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRightIndexedOrNull_u2dD40WMg8);
      if (index < 0) {
         return null;
      } else {
         int accumulator;
         for(accumulator = UIntArray.get-pVg5ArA($this$reduceRightIndexedOrNull_u2dD40WMg8, index--); index >= 0; --index) {
            accumulator = ((UInt)operation.invoke(index, UInt.box-impl(UIntArray.get-pVg5ArA($this$reduceRightIndexedOrNull_u2dD40WMg8, index)), UInt.box-impl(accumulator))).unbox-impl();
         }

         return UInt.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final ULong reduceRightIndexedOrNull_z1zDJgo/* $FF was: reduceRightIndexedOrNull-z1zDJgo*/(long[] $this$reduceRightIndexedOrNull_u2dz1zDJgo, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightIndexedOrNull_u2dz1zDJgo, "$this$reduceRightIndexedOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRightIndexedOrNull_u2dz1zDJgo);
      if (index < 0) {
         return null;
      } else {
         long accumulator;
         for(accumulator = ULongArray.get-s-VKNKU($this$reduceRightIndexedOrNull_u2dz1zDJgo, index--); index >= 0; --index) {
            accumulator = ((ULong)operation.invoke(index, ULong.box-impl(ULongArray.get-s-VKNKU($this$reduceRightIndexedOrNull_u2dz1zDJgo, index)), ULong.box-impl(accumulator))).unbox-impl();
         }

         return ULong.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UByte reduceRightIndexedOrNull_EOyYB1Y/* $FF was: reduceRightIndexedOrNull-EOyYB1Y*/(byte[] $this$reduceRightIndexedOrNull_u2dEOyYB1Y, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightIndexedOrNull_u2dEOyYB1Y, "$this$reduceRightIndexedOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRightIndexedOrNull_u2dEOyYB1Y);
      if (index < 0) {
         return null;
      } else {
         byte accumulator;
         for(accumulator = UByteArray.get-w2LRezQ($this$reduceRightIndexedOrNull_u2dEOyYB1Y, index--); index >= 0; --index) {
            accumulator = ((UByte)operation.invoke(index, UByte.box-impl(UByteArray.get-w2LRezQ($this$reduceRightIndexedOrNull_u2dEOyYB1Y, index)), UByte.box-impl(accumulator))).unbox-impl();
         }

         return UByte.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UShort reduceRightIndexedOrNull_aLgx1Fo/* $FF was: reduceRightIndexedOrNull-aLgx1Fo*/(short[] $this$reduceRightIndexedOrNull_u2daLgx1Fo, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightIndexedOrNull_u2daLgx1Fo, "$this$reduceRightIndexedOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRightIndexedOrNull_u2daLgx1Fo);
      if (index < 0) {
         return null;
      } else {
         short accumulator;
         for(accumulator = UShortArray.get-Mh2AYeg($this$reduceRightIndexedOrNull_u2daLgx1Fo, index--); index >= 0; --index) {
            accumulator = ((UShort)operation.invoke(index, UShort.box-impl(UShortArray.get-Mh2AYeg($this$reduceRightIndexedOrNull_u2daLgx1Fo, index)), UShort.box-impl(accumulator))).unbox-impl();
         }

         return UShort.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UInt reduceRightOrNull_WyvcNBI/* $FF was: reduceRightOrNull-WyvcNBI*/(int[] $this$reduceRightOrNull_u2dWyvcNBI, Function2<? super UInt, ? super UInt, UInt> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightOrNull_u2dWyvcNBI, "$this$reduceRightOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRightOrNull_u2dWyvcNBI);
      if (index < 0) {
         return null;
      } else {
         int accumulator;
         for(accumulator = UIntArray.get-pVg5ArA($this$reduceRightOrNull_u2dWyvcNBI, index--); index >= 0; accumulator = ((UInt)operation.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$reduceRightOrNull_u2dWyvcNBI, index--)), UInt.box-impl(accumulator))).unbox-impl()) {
         }

         return UInt.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final ULong reduceRightOrNull_s8dVfGU/* $FF was: reduceRightOrNull-s8dVfGU*/(long[] $this$reduceRightOrNull_u2ds8dVfGU, Function2<? super ULong, ? super ULong, ULong> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightOrNull_u2ds8dVfGU, "$this$reduceRightOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRightOrNull_u2ds8dVfGU);
      if (index < 0) {
         return null;
      } else {
         long accumulator;
         for(accumulator = ULongArray.get-s-VKNKU($this$reduceRightOrNull_u2ds8dVfGU, index--); index >= 0; accumulator = ((ULong)operation.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$reduceRightOrNull_u2ds8dVfGU, index--)), ULong.box-impl(accumulator))).unbox-impl()) {
         }

         return ULong.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UByte reduceRightOrNull_ELGow60/* $FF was: reduceRightOrNull-ELGow60*/(byte[] $this$reduceRightOrNull_u2dELGow60, Function2<? super UByte, ? super UByte, UByte> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightOrNull_u2dELGow60, "$this$reduceRightOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRightOrNull_u2dELGow60);
      if (index < 0) {
         return null;
      } else {
         byte accumulator;
         for(accumulator = UByteArray.get-w2LRezQ($this$reduceRightOrNull_u2dELGow60, index--); index >= 0; accumulator = ((UByte)operation.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$reduceRightOrNull_u2dELGow60, index--)), UByte.box-impl(accumulator))).unbox-impl()) {
         }

         return UByte.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final UShort reduceRightOrNull_xzaTVY8/* $FF was: reduceRightOrNull-xzaTVY8*/(short[] $this$reduceRightOrNull_u2dxzaTVY8, Function2<? super UShort, ? super UShort, UShort> operation) {
      Intrinsics.checkNotNullParameter($this$reduceRightOrNull_u2dxzaTVY8, "$this$reduceRightOrNull");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int var4 = false;
      int index = ArraysKt.getLastIndex($this$reduceRightOrNull_u2dxzaTVY8);
      if (index < 0) {
         return null;
      } else {
         short accumulator;
         for(accumulator = UShortArray.get-Mh2AYeg($this$reduceRightOrNull_u2dxzaTVY8, index--); index >= 0; accumulator = ((UShort)operation.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$reduceRightOrNull_u2dxzaTVY8, index--)), UShort.box-impl(accumulator))).unbox-impl()) {
         }

         return UShort.box-impl(accumulator);
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> runningFold_zi1B2BA/* $FF was: runningFold-zi1B2BA*/(int[] $this$runningFold_u2dzi1B2BA, R initial, Function2<? super R, ? super UInt, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFold_u2dzi1B2BA, "$this$runningFold");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UIntArray.isEmpty-impl($this$runningFold_u2dzi1B2BA)) {
         return CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(UIntArray.getSize-impl($this$runningFold_u2dzi1B2BA) + 1);
         int var6 = false;
         var4.add(initial);
         ArrayList result = var4;
         Object accumulator = initial;
         int var5 = 0;

         for(int var9 = UIntArray.getSize-impl($this$runningFold_u2dzi1B2BA); var5 < var9; ++var5) {
            int element = UIntArray.get-pVg5ArA($this$runningFold_u2dzi1B2BA, var5);
            accumulator = operation.invoke(accumulator, UInt.box-impl(element));
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> runningFold_A8wKCXQ/* $FF was: runningFold-A8wKCXQ*/(long[] $this$runningFold_u2dA8wKCXQ, R initial, Function2<? super R, ? super ULong, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFold_u2dA8wKCXQ, "$this$runningFold");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (ULongArray.isEmpty-impl($this$runningFold_u2dA8wKCXQ)) {
         return CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(ULongArray.getSize-impl($this$runningFold_u2dA8wKCXQ) + 1);
         int var6 = false;
         var4.add(initial);
         ArrayList result = var4;
         Object accumulator = initial;
         int var5 = 0;

         for(int var10 = ULongArray.getSize-impl($this$runningFold_u2dA8wKCXQ); var5 < var10; ++var5) {
            long element = ULongArray.get-s-VKNKU($this$runningFold_u2dA8wKCXQ, var5);
            accumulator = operation.invoke(accumulator, ULong.box-impl(element));
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> runningFold_yXmHNn8/* $FF was: runningFold-yXmHNn8*/(byte[] $this$runningFold_u2dyXmHNn8, R initial, Function2<? super R, ? super UByte, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFold_u2dyXmHNn8, "$this$runningFold");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UByteArray.isEmpty-impl($this$runningFold_u2dyXmHNn8)) {
         return CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(UByteArray.getSize-impl($this$runningFold_u2dyXmHNn8) + 1);
         int var6 = false;
         var4.add(initial);
         ArrayList result = var4;
         Object accumulator = initial;
         int var5 = 0;

         for(int var9 = UByteArray.getSize-impl($this$runningFold_u2dyXmHNn8); var5 < var9; ++var5) {
            byte element = UByteArray.get-w2LRezQ($this$runningFold_u2dyXmHNn8, var5);
            accumulator = operation.invoke(accumulator, UByte.box-impl(element));
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> runningFold_zww5nb8/* $FF was: runningFold-zww5nb8*/(short[] $this$runningFold_u2dzww5nb8, R initial, Function2<? super R, ? super UShort, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFold_u2dzww5nb8, "$this$runningFold");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UShortArray.isEmpty-impl($this$runningFold_u2dzww5nb8)) {
         return CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(UShortArray.getSize-impl($this$runningFold_u2dzww5nb8) + 1);
         int var6 = false;
         var4.add(initial);
         ArrayList result = var4;
         Object accumulator = initial;
         int var5 = 0;

         for(int var9 = UShortArray.getSize-impl($this$runningFold_u2dzww5nb8); var5 < var9; ++var5) {
            short element = UShortArray.get-Mh2AYeg($this$runningFold_u2dzww5nb8, var5);
            accumulator = operation.invoke(accumulator, UShort.box-impl(element));
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> runningFoldIndexed_yVwIW0Q/* $FF was: runningFoldIndexed-yVwIW0Q*/(int[] $this$runningFoldIndexed_u2dyVwIW0Q, R initial, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFoldIndexed_u2dyVwIW0Q, "$this$runningFoldIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UIntArray.isEmpty-impl($this$runningFoldIndexed_u2dyVwIW0Q)) {
         return CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(UIntArray.getSize-impl($this$runningFoldIndexed_u2dyVwIW0Q) + 1);
         int var6 = false;
         var4.add(initial);
         ArrayList result = var4;
         Object accumulator = initial;
         int index = 0;

         for(int var8 = UIntArray.getSize-impl($this$runningFoldIndexed_u2dyVwIW0Q); index < var8; ++index) {
            accumulator = operation.invoke(index, accumulator, UInt.box-impl(UIntArray.get-pVg5ArA($this$runningFoldIndexed_u2dyVwIW0Q, index)));
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> runningFoldIndexed_mwnnOCs/* $FF was: runningFoldIndexed-mwnnOCs*/(long[] $this$runningFoldIndexed_u2dmwnnOCs, R initial, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFoldIndexed_u2dmwnnOCs, "$this$runningFoldIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (ULongArray.isEmpty-impl($this$runningFoldIndexed_u2dmwnnOCs)) {
         return CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(ULongArray.getSize-impl($this$runningFoldIndexed_u2dmwnnOCs) + 1);
         int var6 = false;
         var4.add(initial);
         ArrayList result = var4;
         Object accumulator = initial;
         int index = 0;

         for(int var8 = ULongArray.getSize-impl($this$runningFoldIndexed_u2dmwnnOCs); index < var8; ++index) {
            accumulator = operation.invoke(index, accumulator, ULong.box-impl(ULongArray.get-s-VKNKU($this$runningFoldIndexed_u2dmwnnOCs, index)));
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> runningFoldIndexed_3iWJZGE/* $FF was: runningFoldIndexed-3iWJZGE*/(byte[] $this$runningFoldIndexed_u2d3iWJZGE, R initial, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFoldIndexed_u2d3iWJZGE, "$this$runningFoldIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UByteArray.isEmpty-impl($this$runningFoldIndexed_u2d3iWJZGE)) {
         return CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(UByteArray.getSize-impl($this$runningFoldIndexed_u2d3iWJZGE) + 1);
         int var6 = false;
         var4.add(initial);
         ArrayList result = var4;
         Object accumulator = initial;
         int index = 0;

         for(int var8 = UByteArray.getSize-impl($this$runningFoldIndexed_u2d3iWJZGE); index < var8; ++index) {
            accumulator = operation.invoke(index, accumulator, UByte.box-impl(UByteArray.get-w2LRezQ($this$runningFoldIndexed_u2d3iWJZGE, index)));
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> runningFoldIndexed_bzxtMww/* $FF was: runningFoldIndexed-bzxtMww*/(short[] $this$runningFoldIndexed_u2dbzxtMww, R initial, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$runningFoldIndexed_u2dbzxtMww, "$this$runningFoldIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UShortArray.isEmpty-impl($this$runningFoldIndexed_u2dbzxtMww)) {
         return CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(UShortArray.getSize-impl($this$runningFoldIndexed_u2dbzxtMww) + 1);
         int var6 = false;
         var4.add(initial);
         ArrayList result = var4;
         Object accumulator = initial;
         int index = 0;

         for(int var8 = UShortArray.getSize-impl($this$runningFoldIndexed_u2dbzxtMww); index < var8; ++index) {
            accumulator = operation.invoke(index, accumulator, UShort.box-impl(UShortArray.get-Mh2AYeg($this$runningFoldIndexed_u2dbzxtMww, index)));
            result.add(accumulator);
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UInt> runningReduce_WyvcNBI/* $FF was: runningReduce-WyvcNBI*/(int[] $this$runningReduce_u2dWyvcNBI, Function2<? super UInt, ? super UInt, UInt> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduce_u2dWyvcNBI, "$this$runningReduce");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UIntArray.isEmpty-impl($this$runningReduce_u2dWyvcNBI)) {
         return CollectionsKt.emptyList();
      } else {
         int accumulator = false;
         int accumulator = UIntArray.get-pVg5ArA($this$runningReduce_u2dWyvcNBI, 0);
         ArrayList var4 = new ArrayList(UIntArray.getSize-impl($this$runningReduce_u2dWyvcNBI));
         int var6 = false;
         var4.add(UInt.box-impl(accumulator));
         ArrayList result = var4;
         int index = 1;

         for(int var5 = UIntArray.getSize-impl($this$runningReduce_u2dWyvcNBI); index < var5; ++index) {
            accumulator = ((UInt)operation.invoke(UInt.box-impl(accumulator), UInt.box-impl(UIntArray.get-pVg5ArA($this$runningReduce_u2dWyvcNBI, index)))).unbox-impl();
            result.add(UInt.box-impl(accumulator));
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<ULong> runningReduce_s8dVfGU/* $FF was: runningReduce-s8dVfGU*/(long[] $this$runningReduce_u2ds8dVfGU, Function2<? super ULong, ? super ULong, ULong> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduce_u2ds8dVfGU, "$this$runningReduce");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (ULongArray.isEmpty-impl($this$runningReduce_u2ds8dVfGU)) {
         return CollectionsKt.emptyList();
      } else {
         long accumulator = 0L;
         accumulator = ULongArray.get-s-VKNKU($this$runningReduce_u2ds8dVfGU, 0);
         ArrayList var3 = new ArrayList(ULongArray.getSize-impl($this$runningReduce_u2ds8dVfGU));
         int var5 = false;
         var3.add(ULong.box-impl(accumulator));
         ArrayList result = var3;
         int index = 1;

         for(int var4 = ULongArray.getSize-impl($this$runningReduce_u2ds8dVfGU); index < var4; ++index) {
            accumulator = ((ULong)operation.invoke(ULong.box-impl(accumulator), ULong.box-impl(ULongArray.get-s-VKNKU($this$runningReduce_u2ds8dVfGU, index)))).unbox-impl();
            result.add(ULong.box-impl(accumulator));
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UByte> runningReduce_ELGow60/* $FF was: runningReduce-ELGow60*/(byte[] $this$runningReduce_u2dELGow60, Function2<? super UByte, ? super UByte, UByte> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduce_u2dELGow60, "$this$runningReduce");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UByteArray.isEmpty-impl($this$runningReduce_u2dELGow60)) {
         return CollectionsKt.emptyList();
      } else {
         byte accumulator = false;
         byte accumulator = UByteArray.get-w2LRezQ($this$runningReduce_u2dELGow60, 0);
         ArrayList var4 = new ArrayList(UByteArray.getSize-impl($this$runningReduce_u2dELGow60));
         int var6 = false;
         var4.add(UByte.box-impl(accumulator));
         ArrayList result = var4;
         int index = 1;

         for(int var5 = UByteArray.getSize-impl($this$runningReduce_u2dELGow60); index < var5; ++index) {
            accumulator = ((UByte)operation.invoke(UByte.box-impl(accumulator), UByte.box-impl(UByteArray.get-w2LRezQ($this$runningReduce_u2dELGow60, index)))).unbox-impl();
            result.add(UByte.box-impl(accumulator));
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UShort> runningReduce_xzaTVY8/* $FF was: runningReduce-xzaTVY8*/(short[] $this$runningReduce_u2dxzaTVY8, Function2<? super UShort, ? super UShort, UShort> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduce_u2dxzaTVY8, "$this$runningReduce");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UShortArray.isEmpty-impl($this$runningReduce_u2dxzaTVY8)) {
         return CollectionsKt.emptyList();
      } else {
         short accumulator = false;
         short accumulator = UShortArray.get-Mh2AYeg($this$runningReduce_u2dxzaTVY8, 0);
         ArrayList var4 = new ArrayList(UShortArray.getSize-impl($this$runningReduce_u2dxzaTVY8));
         int var6 = false;
         var4.add(UShort.box-impl(accumulator));
         ArrayList result = var4;
         int index = 1;

         for(int var5 = UShortArray.getSize-impl($this$runningReduce_u2dxzaTVY8); index < var5; ++index) {
            accumulator = ((UShort)operation.invoke(UShort.box-impl(accumulator), UShort.box-impl(UShortArray.get-Mh2AYeg($this$runningReduce_u2dxzaTVY8, index)))).unbox-impl();
            result.add(UShort.box-impl(accumulator));
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UInt> runningReduceIndexed_D40WMg8/* $FF was: runningReduceIndexed-D40WMg8*/(int[] $this$runningReduceIndexed_u2dD40WMg8, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduceIndexed_u2dD40WMg8, "$this$runningReduceIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UIntArray.isEmpty-impl($this$runningReduceIndexed_u2dD40WMg8)) {
         return CollectionsKt.emptyList();
      } else {
         int accumulator = false;
         int accumulator = UIntArray.get-pVg5ArA($this$runningReduceIndexed_u2dD40WMg8, 0);
         ArrayList var4 = new ArrayList(UIntArray.getSize-impl($this$runningReduceIndexed_u2dD40WMg8));
         int var6 = false;
         var4.add(UInt.box-impl(accumulator));
         ArrayList result = var4;
         int index = 1;

         for(int var5 = UIntArray.getSize-impl($this$runningReduceIndexed_u2dD40WMg8); index < var5; ++index) {
            accumulator = ((UInt)operation.invoke(index, UInt.box-impl(accumulator), UInt.box-impl(UIntArray.get-pVg5ArA($this$runningReduceIndexed_u2dD40WMg8, index)))).unbox-impl();
            result.add(UInt.box-impl(accumulator));
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<ULong> runningReduceIndexed_z1zDJgo/* $FF was: runningReduceIndexed-z1zDJgo*/(long[] $this$runningReduceIndexed_u2dz1zDJgo, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduceIndexed_u2dz1zDJgo, "$this$runningReduceIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (ULongArray.isEmpty-impl($this$runningReduceIndexed_u2dz1zDJgo)) {
         return CollectionsKt.emptyList();
      } else {
         long accumulator = 0L;
         accumulator = ULongArray.get-s-VKNKU($this$runningReduceIndexed_u2dz1zDJgo, 0);
         ArrayList var3 = new ArrayList(ULongArray.getSize-impl($this$runningReduceIndexed_u2dz1zDJgo));
         int var5 = false;
         var3.add(ULong.box-impl(accumulator));
         ArrayList result = var3;
         int index = 1;

         for(int var4 = ULongArray.getSize-impl($this$runningReduceIndexed_u2dz1zDJgo); index < var4; ++index) {
            accumulator = ((ULong)operation.invoke(index, ULong.box-impl(accumulator), ULong.box-impl(ULongArray.get-s-VKNKU($this$runningReduceIndexed_u2dz1zDJgo, index)))).unbox-impl();
            result.add(ULong.box-impl(accumulator));
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UByte> runningReduceIndexed_EOyYB1Y/* $FF was: runningReduceIndexed-EOyYB1Y*/(byte[] $this$runningReduceIndexed_u2dEOyYB1Y, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduceIndexed_u2dEOyYB1Y, "$this$runningReduceIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UByteArray.isEmpty-impl($this$runningReduceIndexed_u2dEOyYB1Y)) {
         return CollectionsKt.emptyList();
      } else {
         byte accumulator = false;
         byte accumulator = UByteArray.get-w2LRezQ($this$runningReduceIndexed_u2dEOyYB1Y, 0);
         ArrayList var4 = new ArrayList(UByteArray.getSize-impl($this$runningReduceIndexed_u2dEOyYB1Y));
         int var6 = false;
         var4.add(UByte.box-impl(accumulator));
         ArrayList result = var4;
         int index = 1;

         for(int var5 = UByteArray.getSize-impl($this$runningReduceIndexed_u2dEOyYB1Y); index < var5; ++index) {
            accumulator = ((UByte)operation.invoke(index, UByte.box-impl(accumulator), UByte.box-impl(UByteArray.get-w2LRezQ($this$runningReduceIndexed_u2dEOyYB1Y, index)))).unbox-impl();
            result.add(UByte.box-impl(accumulator));
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final List<UShort> runningReduceIndexed_aLgx1Fo/* $FF was: runningReduceIndexed-aLgx1Fo*/(short[] $this$runningReduceIndexed_u2daLgx1Fo, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
      Intrinsics.checkNotNullParameter($this$runningReduceIndexed_u2daLgx1Fo, "$this$runningReduceIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      if (UShortArray.isEmpty-impl($this$runningReduceIndexed_u2daLgx1Fo)) {
         return CollectionsKt.emptyList();
      } else {
         short accumulator = false;
         short accumulator = UShortArray.get-Mh2AYeg($this$runningReduceIndexed_u2daLgx1Fo, 0);
         ArrayList var4 = new ArrayList(UShortArray.getSize-impl($this$runningReduceIndexed_u2daLgx1Fo));
         int var6 = false;
         var4.add(UShort.box-impl(accumulator));
         ArrayList result = var4;
         int index = 1;

         for(int var5 = UShortArray.getSize-impl($this$runningReduceIndexed_u2daLgx1Fo); index < var5; ++index) {
            accumulator = ((UShort)operation.invoke(index, UShort.box-impl(accumulator), UShort.box-impl(UShortArray.get-Mh2AYeg($this$runningReduceIndexed_u2daLgx1Fo, index)))).unbox-impl();
            result.add(UShort.box-impl(accumulator));
         }

         return (List)result;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> scan_zi1B2BA/* $FF was: scan-zi1B2BA*/(int[] $this$scan_u2dzi1B2BA, R initial, Function2<? super R, ? super UInt, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scan_u2dzi1B2BA, "$this$scan");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int[] var3 = $this$scan_u2dzi1B2BA;
      List var10000;
      if (UIntArray.isEmpty-impl($this$scan_u2dzi1B2BA)) {
         var10000 = CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(UIntArray.getSize-impl($this$scan_u2dzi1B2BA) + 1);
         var4.add(initial);
         ArrayList var6 = var4;
         Object var9 = initial;
         int var5 = 0;

         for(int var7 = UIntArray.getSize-impl($this$scan_u2dzi1B2BA); var5 < var7; ++var5) {
            int var8 = UIntArray.get-pVg5ArA(var3, var5);
            var9 = operation.invoke(var9, UInt.box-impl(var8));
            var6.add(var9);
         }

         var10000 = (List)var6;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> scan_A8wKCXQ/* $FF was: scan-A8wKCXQ*/(long[] $this$scan_u2dA8wKCXQ, R initial, Function2<? super R, ? super ULong, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scan_u2dA8wKCXQ, "$this$scan");
      Intrinsics.checkNotNullParameter(operation, "operation");
      long[] var3 = $this$scan_u2dA8wKCXQ;
      List var10000;
      if (ULongArray.isEmpty-impl($this$scan_u2dA8wKCXQ)) {
         var10000 = CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(ULongArray.getSize-impl($this$scan_u2dA8wKCXQ) + 1);
         var4.add(initial);
         ArrayList var6 = var4;
         Object var10 = initial;
         int var5 = 0;

         for(int var7 = ULongArray.getSize-impl($this$scan_u2dA8wKCXQ); var5 < var7; ++var5) {
            long var8 = ULongArray.get-s-VKNKU(var3, var5);
            var10 = operation.invoke(var10, ULong.box-impl(var8));
            var6.add(var10);
         }

         var10000 = (List)var6;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> scan_yXmHNn8/* $FF was: scan-yXmHNn8*/(byte[] $this$scan_u2dyXmHNn8, R initial, Function2<? super R, ? super UByte, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scan_u2dyXmHNn8, "$this$scan");
      Intrinsics.checkNotNullParameter(operation, "operation");
      byte[] var3 = $this$scan_u2dyXmHNn8;
      List var10000;
      if (UByteArray.isEmpty-impl($this$scan_u2dyXmHNn8)) {
         var10000 = CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(UByteArray.getSize-impl($this$scan_u2dyXmHNn8) + 1);
         var4.add(initial);
         ArrayList var6 = var4;
         Object var9 = initial;
         int var5 = 0;

         for(int var7 = UByteArray.getSize-impl($this$scan_u2dyXmHNn8); var5 < var7; ++var5) {
            byte var8 = UByteArray.get-w2LRezQ(var3, var5);
            var9 = operation.invoke(var9, UByte.box-impl(var8));
            var6.add(var9);
         }

         var10000 = (List)var6;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> scan_zww5nb8/* $FF was: scan-zww5nb8*/(short[] $this$scan_u2dzww5nb8, R initial, Function2<? super R, ? super UShort, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scan_u2dzww5nb8, "$this$scan");
      Intrinsics.checkNotNullParameter(operation, "operation");
      short[] var3 = $this$scan_u2dzww5nb8;
      List var10000;
      if (UShortArray.isEmpty-impl($this$scan_u2dzww5nb8)) {
         var10000 = CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(UShortArray.getSize-impl($this$scan_u2dzww5nb8) + 1);
         var4.add(initial);
         ArrayList var6 = var4;
         Object var9 = initial;
         int var5 = 0;

         for(int var7 = UShortArray.getSize-impl($this$scan_u2dzww5nb8); var5 < var7; ++var5) {
            short var8 = UShortArray.get-Mh2AYeg(var3, var5);
            var9 = operation.invoke(var9, UShort.box-impl(var8));
            var6.add(var9);
         }

         var10000 = (List)var6;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> scanIndexed_yVwIW0Q/* $FF was: scanIndexed-yVwIW0Q*/(int[] $this$scanIndexed_u2dyVwIW0Q, R initial, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scanIndexed_u2dyVwIW0Q, "$this$scanIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      int[] var3 = $this$scanIndexed_u2dyVwIW0Q;
      List var10000;
      if (UIntArray.isEmpty-impl($this$scanIndexed_u2dyVwIW0Q)) {
         var10000 = CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(UIntArray.getSize-impl($this$scanIndexed_u2dyVwIW0Q) + 1);
         var4.add(initial);
         ArrayList var6 = var4;
         Object var8 = initial;
         int var5 = 0;

         for(int var7 = UIntArray.getSize-impl($this$scanIndexed_u2dyVwIW0Q); var5 < var7; ++var5) {
            var8 = operation.invoke(var5, var8, UInt.box-impl(UIntArray.get-pVg5ArA(var3, var5)));
            var6.add(var8);
         }

         var10000 = (List)var6;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> scanIndexed_mwnnOCs/* $FF was: scanIndexed-mwnnOCs*/(long[] $this$scanIndexed_u2dmwnnOCs, R initial, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scanIndexed_u2dmwnnOCs, "$this$scanIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      long[] var3 = $this$scanIndexed_u2dmwnnOCs;
      List var10000;
      if (ULongArray.isEmpty-impl($this$scanIndexed_u2dmwnnOCs)) {
         var10000 = CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(ULongArray.getSize-impl($this$scanIndexed_u2dmwnnOCs) + 1);
         var4.add(initial);
         ArrayList var6 = var4;
         Object var8 = initial;
         int var5 = 0;

         for(int var7 = ULongArray.getSize-impl($this$scanIndexed_u2dmwnnOCs); var5 < var7; ++var5) {
            var8 = operation.invoke(var5, var8, ULong.box-impl(ULongArray.get-s-VKNKU(var3, var5)));
            var6.add(var8);
         }

         var10000 = (List)var6;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> scanIndexed_3iWJZGE/* $FF was: scanIndexed-3iWJZGE*/(byte[] $this$scanIndexed_u2d3iWJZGE, R initial, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scanIndexed_u2d3iWJZGE, "$this$scanIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      byte[] var3 = $this$scanIndexed_u2d3iWJZGE;
      List var10000;
      if (UByteArray.isEmpty-impl($this$scanIndexed_u2d3iWJZGE)) {
         var10000 = CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(UByteArray.getSize-impl($this$scanIndexed_u2d3iWJZGE) + 1);
         var4.add(initial);
         ArrayList var6 = var4;
         Object var8 = initial;
         int var5 = 0;

         for(int var7 = UByteArray.getSize-impl($this$scanIndexed_u2d3iWJZGE); var5 < var7; ++var5) {
            var8 = operation.invoke(var5, var8, UByte.box-impl(UByteArray.get-w2LRezQ(var3, var5)));
            var6.add(var8);
         }

         var10000 = (List)var6;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R> List<R> scanIndexed_bzxtMww/* $FF was: scanIndexed-bzxtMww*/(short[] $this$scanIndexed_u2dbzxtMww, R initial, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
      Intrinsics.checkNotNullParameter($this$scanIndexed_u2dbzxtMww, "$this$scanIndexed");
      Intrinsics.checkNotNullParameter(operation, "operation");
      short[] var3 = $this$scanIndexed_u2dbzxtMww;
      List var10000;
      if (UShortArray.isEmpty-impl($this$scanIndexed_u2dbzxtMww)) {
         var10000 = CollectionsKt.listOf(initial);
      } else {
         ArrayList var4 = new ArrayList(UShortArray.getSize-impl($this$scanIndexed_u2dbzxtMww) + 1);
         var4.add(initial);
         ArrayList var6 = var4;
         Object var8 = initial;
         int var5 = 0;

         for(int var7 = UShortArray.getSize-impl($this$scanIndexed_u2dbzxtMww); var5 < var7; ++var5) {
            var8 = operation.invoke(var5, var8, UShort.box-impl(UShortArray.get-Mh2AYeg(var3, var5)));
            var6.add(var8);
         }

         var10000 = (List)var6;
      }

      return var10000;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use sumOf instead.",
      replaceWith = @ReplaceWith(
   expression = "this.sumOf(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sumBy_jgv0xPQ/* $FF was: sumBy-jgv0xPQ*/(int[] $this$sumBy_u2djgv0xPQ, Function1<? super UInt, UInt> selector) {
      Intrinsics.checkNotNullParameter($this$sumBy_u2djgv0xPQ, "$this$sumBy");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = 0;
      int var3 = 0;

      for(int var4 = UIntArray.getSize-impl($this$sumBy_u2djgv0xPQ); var3 < var4; ++var3) {
         int element = UIntArray.get-pVg5ArA($this$sumBy_u2djgv0xPQ, var3);
         sum = UInt.constructor-impl(sum + ((UInt)selector.invoke(UInt.box-impl(element))).unbox-impl());
      }

      return sum;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use sumOf instead.",
      replaceWith = @ReplaceWith(
   expression = "this.sumOf(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sumBy_MShoTSo/* $FF was: sumBy-MShoTSo*/(long[] $this$sumBy_u2dMShoTSo, Function1<? super ULong, UInt> selector) {
      Intrinsics.checkNotNullParameter($this$sumBy_u2dMShoTSo, "$this$sumBy");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = 0;
      int var3 = 0;

      for(int var4 = ULongArray.getSize-impl($this$sumBy_u2dMShoTSo); var3 < var4; ++var3) {
         long element = ULongArray.get-s-VKNKU($this$sumBy_u2dMShoTSo, var3);
         sum = UInt.constructor-impl(sum + ((UInt)selector.invoke(ULong.box-impl(element))).unbox-impl());
      }

      return sum;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use sumOf instead.",
      replaceWith = @ReplaceWith(
   expression = "this.sumOf(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sumBy_JOV_ifY/* $FF was: sumBy-JOV_ifY*/(byte[] $this$sumBy_u2dJOV_ifY, Function1<? super UByte, UInt> selector) {
      Intrinsics.checkNotNullParameter($this$sumBy_u2dJOV_ifY, "$this$sumBy");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = 0;
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$sumBy_u2dJOV_ifY); var3 < var4; ++var3) {
         byte element = UByteArray.get-w2LRezQ($this$sumBy_u2dJOV_ifY, var3);
         sum = UInt.constructor-impl(sum + ((UInt)selector.invoke(UByte.box-impl(element))).unbox-impl());
      }

      return sum;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use sumOf instead.",
      replaceWith = @ReplaceWith(
   expression = "this.sumOf(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sumBy_xTcfx_M/* $FF was: sumBy-xTcfx_M*/(short[] $this$sumBy_u2dxTcfx_M, Function1<? super UShort, UInt> selector) {
      Intrinsics.checkNotNullParameter($this$sumBy_u2dxTcfx_M, "$this$sumBy");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = 0;
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$sumBy_u2dxTcfx_M); var3 < var4; ++var3) {
         short element = UShortArray.get-Mh2AYeg($this$sumBy_u2dxTcfx_M, var3);
         sum = UInt.constructor-impl(sum + ((UInt)selector.invoke(UShort.box-impl(element))).unbox-impl());
      }

      return sum;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use sumOf instead.",
      replaceWith = @ReplaceWith(
   expression = "this.sumOf(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double sumByDouble_jgv0xPQ/* $FF was: sumByDouble-jgv0xPQ*/(int[] $this$sumByDouble_u2djgv0xPQ, Function1<? super UInt, Double> selector) {
      Intrinsics.checkNotNullParameter($this$sumByDouble_u2djgv0xPQ, "$this$sumByDouble");
      Intrinsics.checkNotNullParameter(selector, "selector");
      double sum = 0.0D;
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$sumByDouble_u2djgv0xPQ); var4 < var5; ++var4) {
         int element = UIntArray.get-pVg5ArA($this$sumByDouble_u2djgv0xPQ, var4);
         sum += ((Number)selector.invoke(UInt.box-impl(element))).doubleValue();
      }

      return sum;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use sumOf instead.",
      replaceWith = @ReplaceWith(
   expression = "this.sumOf(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double sumByDouble_MShoTSo/* $FF was: sumByDouble-MShoTSo*/(long[] $this$sumByDouble_u2dMShoTSo, Function1<? super ULong, Double> selector) {
      Intrinsics.checkNotNullParameter($this$sumByDouble_u2dMShoTSo, "$this$sumByDouble");
      Intrinsics.checkNotNullParameter(selector, "selector");
      double sum = 0.0D;
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$sumByDouble_u2dMShoTSo); var4 < var5; ++var4) {
         long element = ULongArray.get-s-VKNKU($this$sumByDouble_u2dMShoTSo, var4);
         sum += ((Number)selector.invoke(ULong.box-impl(element))).doubleValue();
      }

      return sum;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use sumOf instead.",
      replaceWith = @ReplaceWith(
   expression = "this.sumOf(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double sumByDouble_JOV_ifY/* $FF was: sumByDouble-JOV_ifY*/(byte[] $this$sumByDouble_u2dJOV_ifY, Function1<? super UByte, Double> selector) {
      Intrinsics.checkNotNullParameter($this$sumByDouble_u2dJOV_ifY, "$this$sumByDouble");
      Intrinsics.checkNotNullParameter(selector, "selector");
      double sum = 0.0D;
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$sumByDouble_u2dJOV_ifY); var4 < var5; ++var4) {
         byte element = UByteArray.get-w2LRezQ($this$sumByDouble_u2dJOV_ifY, var4);
         sum += ((Number)selector.invoke(UByte.box-impl(element))).doubleValue();
      }

      return sum;
   }

   /** @deprecated */
   @Deprecated(
      message = "Use sumOf instead.",
      replaceWith = @ReplaceWith(
   expression = "this.sumOf(selector)",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.5"
   )
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double sumByDouble_xTcfx_M/* $FF was: sumByDouble-xTcfx_M*/(short[] $this$sumByDouble_u2dxTcfx_M, Function1<? super UShort, Double> selector) {
      Intrinsics.checkNotNullParameter($this$sumByDouble_u2dxTcfx_M, "$this$sumByDouble");
      Intrinsics.checkNotNullParameter(selector, "selector");
      double sum = 0.0D;
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$sumByDouble_u2dxTcfx_M); var4 < var5; ++var4) {
         short element = UShortArray.get-Mh2AYeg($this$sumByDouble_u2dxTcfx_M, var4);
         sum += ((Number)selector.invoke(UShort.box-impl(element))).doubleValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfDouble"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double sumOfDouble(int[] $this$sumOf_u2djgv0xPQ, Function1<? super UInt, Double> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2djgv0xPQ, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      double sum = 0.0D;
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$sumOf_u2djgv0xPQ); var4 < var5; ++var4) {
         int element = UIntArray.get-pVg5ArA($this$sumOf_u2djgv0xPQ, var4);
         sum += ((Number)selector.invoke(UInt.box-impl(element))).doubleValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfDouble"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double sumOfDouble(long[] $this$sumOf_u2dMShoTSo, Function1<? super ULong, Double> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dMShoTSo, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      double sum = 0.0D;
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$sumOf_u2dMShoTSo); var4 < var5; ++var4) {
         long element = ULongArray.get-s-VKNKU($this$sumOf_u2dMShoTSo, var4);
         sum += ((Number)selector.invoke(ULong.box-impl(element))).doubleValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfDouble"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double sumOfDouble(byte[] $this$sumOf_u2dJOV_ifY, Function1<? super UByte, Double> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dJOV_ifY, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      double sum = 0.0D;
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$sumOf_u2dJOV_ifY); var4 < var5; ++var4) {
         byte element = UByteArray.get-w2LRezQ($this$sumOf_u2dJOV_ifY, var4);
         sum += ((Number)selector.invoke(UByte.box-impl(element))).doubleValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfDouble"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final double sumOfDouble(short[] $this$sumOf_u2dxTcfx_M, Function1<? super UShort, Double> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dxTcfx_M, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      double sum = 0.0D;
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$sumOf_u2dxTcfx_M); var4 < var5; ++var4) {
         short element = UShortArray.get-Mh2AYeg($this$sumOf_u2dxTcfx_M, var4);
         sum += ((Number)selector.invoke(UShort.box-impl(element))).doubleValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @JvmName(
      name = "sumOfInt"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sumOfInt(int[] $this$sumOf_u2djgv0xPQ, Function1<? super UInt, Integer> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2djgv0xPQ, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = 0;
      int var3 = 0;

      for(int var4 = UIntArray.getSize-impl($this$sumOf_u2djgv0xPQ); var3 < var4; ++var3) {
         int element = UIntArray.get-pVg5ArA($this$sumOf_u2djgv0xPQ, var3);
         sum += ((Number)selector.invoke(UInt.box-impl(element))).intValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @JvmName(
      name = "sumOfInt"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sumOfInt(long[] $this$sumOf_u2dMShoTSo, Function1<? super ULong, Integer> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dMShoTSo, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = 0;
      int var3 = 0;

      for(int var4 = ULongArray.getSize-impl($this$sumOf_u2dMShoTSo); var3 < var4; ++var3) {
         long element = ULongArray.get-s-VKNKU($this$sumOf_u2dMShoTSo, var3);
         sum += ((Number)selector.invoke(ULong.box-impl(element))).intValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @JvmName(
      name = "sumOfInt"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sumOfInt(byte[] $this$sumOf_u2dJOV_ifY, Function1<? super UByte, Integer> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dJOV_ifY, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = 0;
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$sumOf_u2dJOV_ifY); var3 < var4; ++var3) {
         byte element = UByteArray.get-w2LRezQ($this$sumOf_u2dJOV_ifY, var3);
         sum += ((Number)selector.invoke(UByte.box-impl(element))).intValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @JvmName(
      name = "sumOfInt"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sumOfInt(short[] $this$sumOf_u2dxTcfx_M, Function1<? super UShort, Integer> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dxTcfx_M, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = 0;
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$sumOf_u2dxTcfx_M); var3 < var4; ++var3) {
         short element = UShortArray.get-Mh2AYeg($this$sumOf_u2dxTcfx_M, var3);
         sum += ((Number)selector.invoke(UShort.box-impl(element))).intValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfLong"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long sumOfLong(int[] $this$sumOf_u2djgv0xPQ, Function1<? super UInt, Long> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2djgv0xPQ, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      long sum = 0L;
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$sumOf_u2djgv0xPQ); var4 < var5; ++var4) {
         int element = UIntArray.get-pVg5ArA($this$sumOf_u2djgv0xPQ, var4);
         sum += ((Number)selector.invoke(UInt.box-impl(element))).longValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfLong"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long sumOfLong(long[] $this$sumOf_u2dMShoTSo, Function1<? super ULong, Long> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dMShoTSo, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      long sum = 0L;
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$sumOf_u2dMShoTSo); var4 < var5; ++var4) {
         long element = ULongArray.get-s-VKNKU($this$sumOf_u2dMShoTSo, var4);
         sum += ((Number)selector.invoke(ULong.box-impl(element))).longValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfLong"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long sumOfLong(byte[] $this$sumOf_u2dJOV_ifY, Function1<? super UByte, Long> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dJOV_ifY, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      long sum = 0L;
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$sumOf_u2dJOV_ifY); var4 < var5; ++var4) {
         byte element = UByteArray.get-w2LRezQ($this$sumOf_u2dJOV_ifY, var4);
         sum += ((Number)selector.invoke(UByte.box-impl(element))).longValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.4"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfLong"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long sumOfLong(short[] $this$sumOf_u2dxTcfx_M, Function1<? super UShort, Long> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dxTcfx_M, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      long sum = 0L;
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$sumOf_u2dxTcfx_M); var4 < var5; ++var4) {
         short element = UShortArray.get-Mh2AYeg($this$sumOf_u2dxTcfx_M, var4);
         sum += ((Number)selector.invoke(UShort.box-impl(element))).longValue();
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @JvmName(
      name = "sumOfUInt"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sumOfUInt(int[] $this$sumOf_u2djgv0xPQ, Function1<? super UInt, UInt> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2djgv0xPQ, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = UInt.constructor-impl(0);
      int var3 = 0;

      for(int var4 = UIntArray.getSize-impl($this$sumOf_u2djgv0xPQ); var3 < var4; ++var3) {
         int element = UIntArray.get-pVg5ArA($this$sumOf_u2djgv0xPQ, var3);
         sum = UInt.constructor-impl(sum + ((UInt)selector.invoke(UInt.box-impl(element))).unbox-impl());
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @JvmName(
      name = "sumOfUInt"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sumOfUInt(long[] $this$sumOf_u2dMShoTSo, Function1<? super ULong, UInt> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dMShoTSo, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = UInt.constructor-impl(0);
      int var3 = 0;

      for(int var4 = ULongArray.getSize-impl($this$sumOf_u2dMShoTSo); var3 < var4; ++var3) {
         long element = ULongArray.get-s-VKNKU($this$sumOf_u2dMShoTSo, var3);
         sum = UInt.constructor-impl(sum + ((UInt)selector.invoke(ULong.box-impl(element))).unbox-impl());
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @JvmName(
      name = "sumOfUInt"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sumOfUInt(byte[] $this$sumOf_u2dJOV_ifY, Function1<? super UByte, UInt> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dJOV_ifY, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = UInt.constructor-impl(0);
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$sumOf_u2dJOV_ifY); var3 < var4; ++var3) {
         byte element = UByteArray.get-w2LRezQ($this$sumOf_u2dJOV_ifY, var3);
         sum = UInt.constructor-impl(sum + ((UInt)selector.invoke(UByte.box-impl(element))).unbox-impl());
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @JvmName(
      name = "sumOfUInt"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sumOfUInt(short[] $this$sumOf_u2dxTcfx_M, Function1<? super UShort, UInt> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dxTcfx_M, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int sum = UInt.constructor-impl(0);
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$sumOf_u2dxTcfx_M); var3 < var4; ++var3) {
         short element = UShortArray.get-Mh2AYeg($this$sumOf_u2dxTcfx_M, var3);
         sum = UInt.constructor-impl(sum + ((UInt)selector.invoke(UShort.box-impl(element))).unbox-impl());
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfULong"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long sumOfULong(int[] $this$sumOf_u2djgv0xPQ, Function1<? super UInt, ULong> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2djgv0xPQ, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      long sum = ULong.constructor-impl(0L);
      int var4 = 0;

      for(int var5 = UIntArray.getSize-impl($this$sumOf_u2djgv0xPQ); var4 < var5; ++var4) {
         int element = UIntArray.get-pVg5ArA($this$sumOf_u2djgv0xPQ, var4);
         sum = ULong.constructor-impl(sum + ((ULong)selector.invoke(UInt.box-impl(element))).unbox-impl());
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfULong"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long sumOfULong(long[] $this$sumOf_u2dMShoTSo, Function1<? super ULong, ULong> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dMShoTSo, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      long sum = ULong.constructor-impl(0L);
      int var4 = 0;

      for(int var5 = ULongArray.getSize-impl($this$sumOf_u2dMShoTSo); var4 < var5; ++var4) {
         long element = ULongArray.get-s-VKNKU($this$sumOf_u2dMShoTSo, var4);
         sum = ULong.constructor-impl(sum + ((ULong)selector.invoke(ULong.box-impl(element))).unbox-impl());
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfULong"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long sumOfULong(byte[] $this$sumOf_u2dJOV_ifY, Function1<? super UByte, ULong> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dJOV_ifY, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      long sum = ULong.constructor-impl(0L);
      int var4 = 0;

      for(int var5 = UByteArray.getSize-impl($this$sumOf_u2dJOV_ifY); var4 < var5; ++var4) {
         byte element = UByteArray.get-w2LRezQ($this$sumOf_u2dJOV_ifY, var4);
         sum = ULong.constructor-impl(sum + ((ULong)selector.invoke(UByte.box-impl(element))).unbox-impl());
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @OverloadResolutionByLambdaReturnType
   @JvmName(
      name = "sumOfULong"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long sumOfULong(short[] $this$sumOf_u2dxTcfx_M, Function1<? super UShort, ULong> selector) {
      Intrinsics.checkNotNullParameter($this$sumOf_u2dxTcfx_M, "$this$sumOf");
      Intrinsics.checkNotNullParameter(selector, "selector");
      long sum = ULong.constructor-impl(0L);
      int var4 = 0;

      for(int var5 = UShortArray.getSize-impl($this$sumOf_u2dxTcfx_M); var4 < var5; ++var4) {
         short element = UShortArray.get-Mh2AYeg($this$sumOf_u2dxTcfx_M, var4);
         sum = ULong.constructor-impl(sum + ((ULong)selector.invoke(UShort.box-impl(element))).unbox-impl());
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final <R> List<Pair<UInt, R>> zip_C_E_24M/* $FF was: zip-C-E_24M*/(@NotNull int[] $this$zip_u2dC_u2dE_24M, @NotNull R[] other) {
      Intrinsics.checkNotNullParameter($this$zip_u2dC_u2dE_24M, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      int[] var2 = $this$zip_u2dC_u2dE_24M;
      int var3 = Math.min(UIntArray.getSize-impl($this$zip_u2dC_u2dE_24M), other.length);
      ArrayList var4 = new ArrayList(var3);

      for(int var5 = 0; var5 < var3; ++var5) {
         int var10001 = UIntArray.get-pVg5ArA(var2, var5);
         Object t2 = other[var5];
         int t1 = var10001;
         int var8 = false;
         var4.add(TuplesKt.to(UInt.box-impl(t1), t2));
      }

      return (List)var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final <R> List<Pair<ULong, R>> zip_f7H3mmw/* $FF was: zip-f7H3mmw*/(@NotNull long[] $this$zip_u2df7H3mmw, @NotNull R[] other) {
      Intrinsics.checkNotNullParameter($this$zip_u2df7H3mmw, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      long[] var2 = $this$zip_u2df7H3mmw;
      int var3 = Math.min(ULongArray.getSize-impl($this$zip_u2df7H3mmw), other.length);
      ArrayList var4 = new ArrayList(var3);

      for(int var5 = 0; var5 < var3; ++var5) {
         long var10001 = ULongArray.get-s-VKNKU(var2, var5);
         Object t2 = other[var5];
         long t1 = var10001;
         int var9 = false;
         var4.add(TuplesKt.to(ULong.box-impl(t1), t2));
      }

      return (List)var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final <R> List<Pair<UByte, R>> zip_nl983wc/* $FF was: zip-nl983wc*/(@NotNull byte[] $this$zip_u2dnl983wc, @NotNull R[] other) {
      Intrinsics.checkNotNullParameter($this$zip_u2dnl983wc, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      byte[] var2 = $this$zip_u2dnl983wc;
      int var3 = Math.min(UByteArray.getSize-impl($this$zip_u2dnl983wc), other.length);
      ArrayList var4 = new ArrayList(var3);

      for(int var5 = 0; var5 < var3; ++var5) {
         byte var10001 = UByteArray.get-w2LRezQ(var2, var5);
         Object t2 = other[var5];
         byte t1 = var10001;
         int var8 = false;
         var4.add(TuplesKt.to(UByte.box-impl(t1), t2));
      }

      return (List)var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final <R> List<Pair<UShort, R>> zip_uaTIQ5s/* $FF was: zip-uaTIQ5s*/(@NotNull short[] $this$zip_u2duaTIQ5s, @NotNull R[] other) {
      Intrinsics.checkNotNullParameter($this$zip_u2duaTIQ5s, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      short[] var2 = $this$zip_u2duaTIQ5s;
      int var3 = Math.min(UShortArray.getSize-impl($this$zip_u2duaTIQ5s), other.length);
      ArrayList var4 = new ArrayList(var3);

      for(int var5 = 0; var5 < var3; ++var5) {
         short var10001 = UShortArray.get-Mh2AYeg(var2, var5);
         Object t2 = other[var5];
         short t1 = var10001;
         int var8 = false;
         var4.add(TuplesKt.to(UShort.box-impl(t1), t2));
      }

      return (List)var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, V> List<V> zip_ZjwqOic/* $FF was: zip-ZjwqOic*/(int[] $this$zip_u2dZjwqOic, R[] other, Function2<? super UInt, ? super R, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip_u2dZjwqOic, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int size = Math.min(UIntArray.getSize-impl($this$zip_u2dZjwqOic), other.length);
      ArrayList list = new ArrayList(size);

      for(int i = 0; i < size; ++i) {
         list.add(transform.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$zip_u2dZjwqOic, i)), other[i]));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, V> List<V> zip_8LME4QE/* $FF was: zip-8LME4QE*/(long[] $this$zip_u2d8LME4QE, R[] other, Function2<? super ULong, ? super R, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip_u2d8LME4QE, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int size = Math.min(ULongArray.getSize-impl($this$zip_u2d8LME4QE), other.length);
      ArrayList list = new ArrayList(size);

      for(int i = 0; i < size; ++i) {
         list.add(transform.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$zip_u2d8LME4QE, i)), other[i]));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, V> List<V> zip_LuipOMY/* $FF was: zip-LuipOMY*/(byte[] $this$zip_u2dLuipOMY, R[] other, Function2<? super UByte, ? super R, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip_u2dLuipOMY, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int size = Math.min(UByteArray.getSize-impl($this$zip_u2dLuipOMY), other.length);
      ArrayList list = new ArrayList(size);

      for(int i = 0; i < size; ++i) {
         list.add(transform.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$zip_u2dLuipOMY, i)), other[i]));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, V> List<V> zip_ePBmRWY/* $FF was: zip-ePBmRWY*/(short[] $this$zip_u2dePBmRWY, R[] other, Function2<? super UShort, ? super R, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip_u2dePBmRWY, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int size = Math.min(UShortArray.getSize-impl($this$zip_u2dePBmRWY), other.length);
      ArrayList list = new ArrayList(size);

      for(int i = 0; i < size; ++i) {
         list.add(transform.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$zip_u2dePBmRWY, i)), other[i]));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final <R> List<Pair<UInt, R>> zip_HwE9HBo/* $FF was: zip-HwE9HBo*/(@NotNull int[] $this$zip_u2dHwE9HBo, @NotNull Iterable<? extends R> other) {
      Intrinsics.checkNotNullParameter($this$zip_u2dHwE9HBo, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      int[] var2 = $this$zip_u2dHwE9HBo;
      int var3 = UIntArray.getSize-impl($this$zip_u2dHwE9HBo);
      ArrayList var4 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), var3));
      int var5 = 0;
      Iterator var6 = other.iterator();

      while(var6.hasNext()) {
         Object var7 = var6.next();
         if (var5 >= var3) {
            break;
         }

         int t1 = UIntArray.get-pVg5ArA(var2, var5++);
         int var10 = false;
         var4.add(TuplesKt.to(UInt.box-impl(t1), var7));
      }

      return (List)var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final <R> List<Pair<ULong, R>> zip_F7u83W8/* $FF was: zip-F7u83W8*/(@NotNull long[] $this$zip_u2dF7u83W8, @NotNull Iterable<? extends R> other) {
      Intrinsics.checkNotNullParameter($this$zip_u2dF7u83W8, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      long[] var2 = $this$zip_u2dF7u83W8;
      int var3 = ULongArray.getSize-impl($this$zip_u2dF7u83W8);
      ArrayList var4 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), var3));
      int var5 = 0;
      Iterator var6 = other.iterator();

      while(var6.hasNext()) {
         Object var7 = var6.next();
         if (var5 >= var3) {
            break;
         }

         long t1 = ULongArray.get-s-VKNKU(var2, var5++);
         int var11 = false;
         var4.add(TuplesKt.to(ULong.box-impl(t1), var7));
      }

      return (List)var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final <R> List<Pair<UByte, R>> zip_JQknh5Q/* $FF was: zip-JQknh5Q*/(@NotNull byte[] $this$zip_u2dJQknh5Q, @NotNull Iterable<? extends R> other) {
      Intrinsics.checkNotNullParameter($this$zip_u2dJQknh5Q, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      byte[] var2 = $this$zip_u2dJQknh5Q;
      int var3 = UByteArray.getSize-impl($this$zip_u2dJQknh5Q);
      ArrayList var4 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), var3));
      int var5 = 0;
      Iterator var6 = other.iterator();

      while(var6.hasNext()) {
         Object var7 = var6.next();
         if (var5 >= var3) {
            break;
         }

         byte t1 = UByteArray.get-w2LRezQ(var2, var5++);
         int var10 = false;
         var4.add(TuplesKt.to(UByte.box-impl(t1), var7));
      }

      return (List)var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final <R> List<Pair<UShort, R>> zip_JGPC0_M/* $FF was: zip-JGPC0-M*/(@NotNull short[] $this$zip_u2dJGPC0_u2dM, @NotNull Iterable<? extends R> other) {
      Intrinsics.checkNotNullParameter($this$zip_u2dJGPC0_u2dM, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      short[] var2 = $this$zip_u2dJGPC0_u2dM;
      int var3 = UShortArray.getSize-impl($this$zip_u2dJGPC0_u2dM);
      ArrayList var4 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), var3));
      int var5 = 0;
      Iterator var6 = other.iterator();

      while(var6.hasNext()) {
         Object var7 = var6.next();
         if (var5 >= var3) {
            break;
         }

         short t1 = UShortArray.get-Mh2AYeg(var2, var5++);
         int var10 = false;
         var4.add(TuplesKt.to(UShort.box-impl(t1), var7));
      }

      return (List)var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, V> List<V> zip_7znnbtw/* $FF was: zip-7znnbtw*/(int[] $this$zip_u2d7znnbtw, Iterable<? extends R> other, Function2<? super UInt, ? super R, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip_u2d7znnbtw, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int arraySize = UIntArray.getSize-impl($this$zip_u2d7znnbtw);
      ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), arraySize));
      int i = 0;
      Iterator var6 = other.iterator();

      while(var6.hasNext()) {
         Object element = var6.next();
         if (i >= arraySize) {
            break;
         }

         list.add(transform.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$zip_u2d7znnbtw, i++)), element));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, V> List<V> zip_TUPTUsU/* $FF was: zip-TUPTUsU*/(long[] $this$zip_u2dTUPTUsU, Iterable<? extends R> other, Function2<? super ULong, ? super R, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip_u2dTUPTUsU, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int arraySize = ULongArray.getSize-impl($this$zip_u2dTUPTUsU);
      ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), arraySize));
      int i = 0;
      Iterator var6 = other.iterator();

      while(var6.hasNext()) {
         Object element = var6.next();
         if (i >= arraySize) {
            break;
         }

         list.add(transform.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$zip_u2dTUPTUsU, i++)), element));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, V> List<V> zip_UCnP4_w/* $FF was: zip-UCnP4_w*/(byte[] $this$zip_u2dUCnP4_w, Iterable<? extends R> other, Function2<? super UByte, ? super R, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip_u2dUCnP4_w, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int arraySize = UByteArray.getSize-impl($this$zip_u2dUCnP4_w);
      ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), arraySize));
      int i = 0;
      Iterator var6 = other.iterator();

      while(var6.hasNext()) {
         Object element = var6.next();
         if (i >= arraySize) {
            break;
         }

         list.add(transform.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$zip_u2dUCnP4_w, i++)), element));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <R, V> List<V> zip_kBb4a_s/* $FF was: zip-kBb4a-s*/(short[] $this$zip_u2dkBb4a_u2ds, Iterable<? extends R> other, Function2<? super UShort, ? super R, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip_u2dkBb4a_u2ds, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int arraySize = UShortArray.getSize-impl($this$zip_u2dkBb4a_u2ds);
      ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), arraySize));
      int i = 0;
      Iterator var6 = other.iterator();

      while(var6.hasNext()) {
         Object element = var6.next();
         if (i >= arraySize) {
            break;
         }

         list.add(transform.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$zip_u2dkBb4a_u2ds, i++)), element));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<Pair<UInt, UInt>> zip_ctEhBpI/* $FF was: zip-ctEhBpI*/(@NotNull int[] $this$zip_u2dctEhBpI, @NotNull int[] other) {
      Intrinsics.checkNotNullParameter($this$zip_u2dctEhBpI, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      int[] var2 = $this$zip_u2dctEhBpI;
      int var3 = Math.min(UIntArray.getSize-impl($this$zip_u2dctEhBpI), UIntArray.getSize-impl(other));
      ArrayList var4 = new ArrayList(var3);

      for(int var5 = 0; var5 < var3; ++var5) {
         int var10001 = UIntArray.get-pVg5ArA(var2, var5);
         int t2 = UIntArray.get-pVg5ArA(other, var5);
         int t1 = var10001;
         int var8 = false;
         var4.add(TuplesKt.to(UInt.box-impl(t1), UInt.box-impl(t2)));
      }

      return (List)var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<Pair<ULong, ULong>> zip_us8wMrg/* $FF was: zip-us8wMrg*/(@NotNull long[] $this$zip_u2dus8wMrg, @NotNull long[] other) {
      Intrinsics.checkNotNullParameter($this$zip_u2dus8wMrg, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      long[] var2 = $this$zip_u2dus8wMrg;
      int var3 = Math.min(ULongArray.getSize-impl($this$zip_u2dus8wMrg), ULongArray.getSize-impl(other));
      ArrayList var4 = new ArrayList(var3);

      for(int var5 = 0; var5 < var3; ++var5) {
         long var10001 = ULongArray.get-s-VKNKU(var2, var5);
         long t2 = ULongArray.get-s-VKNKU(other, var5);
         long t1 = var10001;
         int var10 = false;
         var4.add(TuplesKt.to(ULong.box-impl(t1), ULong.box-impl(t2)));
      }

      return (List)var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<Pair<UByte, UByte>> zip_kdPth3s/* $FF was: zip-kdPth3s*/(@NotNull byte[] $this$zip_u2dkdPth3s, @NotNull byte[] other) {
      Intrinsics.checkNotNullParameter($this$zip_u2dkdPth3s, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      byte[] var2 = $this$zip_u2dkdPth3s;
      int var3 = Math.min(UByteArray.getSize-impl($this$zip_u2dkdPth3s), UByteArray.getSize-impl(other));
      ArrayList var4 = new ArrayList(var3);

      for(int var5 = 0; var5 < var3; ++var5) {
         byte var10001 = UByteArray.get-w2LRezQ(var2, var5);
         byte t2 = UByteArray.get-w2LRezQ(other, var5);
         byte t1 = var10001;
         int var8 = false;
         var4.add(TuplesKt.to(UByte.box-impl(t1), UByte.box-impl(t2)));
      }

      return (List)var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final List<Pair<UShort, UShort>> zip_mazbYpA/* $FF was: zip-mazbYpA*/(@NotNull short[] $this$zip_u2dmazbYpA, @NotNull short[] other) {
      Intrinsics.checkNotNullParameter($this$zip_u2dmazbYpA, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      short[] var2 = $this$zip_u2dmazbYpA;
      int var3 = Math.min(UShortArray.getSize-impl($this$zip_u2dmazbYpA), UShortArray.getSize-impl(other));
      ArrayList var4 = new ArrayList(var3);

      for(int var5 = 0; var5 < var3; ++var5) {
         short var10001 = UShortArray.get-Mh2AYeg(var2, var5);
         short t2 = UShortArray.get-Mh2AYeg(other, var5);
         short t1 = var10001;
         int var8 = false;
         var4.add(TuplesKt.to(UShort.box-impl(t1), UShort.box-impl(t2)));
      }

      return (List)var4;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <V> List<V> zip_L83TJbI/* $FF was: zip-L83TJbI*/(int[] $this$zip_u2dL83TJbI, int[] other, Function2<? super UInt, ? super UInt, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip_u2dL83TJbI, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int size = Math.min(UIntArray.getSize-impl($this$zip_u2dL83TJbI), UIntArray.getSize-impl(other));
      ArrayList list = new ArrayList(size);

      for(int i = 0; i < size; ++i) {
         list.add(transform.invoke(UInt.box-impl(UIntArray.get-pVg5ArA($this$zip_u2dL83TJbI, i)), UInt.box-impl(UIntArray.get-pVg5ArA(other, i))));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <V> List<V> zip_PabeH_Q/* $FF was: zip-PabeH-Q*/(long[] $this$zip_u2dPabeH_u2dQ, long[] other, Function2<? super ULong, ? super ULong, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip_u2dPabeH_u2dQ, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int size = Math.min(ULongArray.getSize-impl($this$zip_u2dPabeH_u2dQ), ULongArray.getSize-impl(other));
      ArrayList list = new ArrayList(size);

      for(int i = 0; i < size; ++i) {
         list.add(transform.invoke(ULong.box-impl(ULongArray.get-s-VKNKU($this$zip_u2dPabeH_u2dQ, i)), ULong.box-impl(ULongArray.get-s-VKNKU(other, i))));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <V> List<V> zip_JAKpvQM/* $FF was: zip-JAKpvQM*/(byte[] $this$zip_u2dJAKpvQM, byte[] other, Function2<? super UByte, ? super UByte, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip_u2dJAKpvQM, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int size = Math.min(UByteArray.getSize-impl($this$zip_u2dJAKpvQM), UByteArray.getSize-impl(other));
      ArrayList list = new ArrayList(size);

      for(int i = 0; i < size; ++i) {
         list.add(transform.invoke(UByte.box-impl(UByteArray.get-w2LRezQ($this$zip_u2dJAKpvQM, i)), UByte.box-impl(UByteArray.get-w2LRezQ(other, i))));
      }

      return (List)list;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final <V> List<V> zip_gVVukQo/* $FF was: zip-gVVukQo*/(short[] $this$zip_u2dgVVukQo, short[] other, Function2<? super UShort, ? super UShort, ? extends V> transform) {
      Intrinsics.checkNotNullParameter($this$zip_u2dgVVukQo, "$this$zip");
      Intrinsics.checkNotNullParameter(other, "other");
      Intrinsics.checkNotNullParameter(transform, "transform");
      int size = Math.min(UShortArray.getSize-impl($this$zip_u2dgVVukQo), UShortArray.getSize-impl(other));
      ArrayList list = new ArrayList(size);

      for(int i = 0; i < size; ++i) {
         list.add(transform.invoke(UShort.box-impl(UShortArray.get-Mh2AYeg($this$zip_u2dgVVukQo, i)), UShort.box-impl(UShortArray.get-Mh2AYeg(other, i))));
      }

      return (List)list;
   }

   @JvmName(
      name = "sumOfUInt"
   )
   @SinceKotlin(
      version = "1.5"
   )
   public static final int sumOfUInt(@NotNull UInt[] $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      int sum = 0;
      int var2 = 0;

      for(int var3 = $this$sum.length; var2 < var3; ++var2) {
         int element = $this$sum[var2].unbox-impl();
         sum = UInt.constructor-impl(sum + element);
      }

      return sum;
   }

   @JvmName(
      name = "sumOfULong"
   )
   @SinceKotlin(
      version = "1.5"
   )
   public static final long sumOfULong(@NotNull ULong[] $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      long sum = 0L;
      int var3 = 0;

      for(int var4 = $this$sum.length; var3 < var4; ++var3) {
         long element = $this$sum[var3].unbox-impl();
         sum = ULong.constructor-impl(sum + element);
      }

      return sum;
   }

   @JvmName(
      name = "sumOfUByte"
   )
   @SinceKotlin(
      version = "1.5"
   )
   public static final int sumOfUByte(@NotNull UByte[] $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      int sum = 0;
      int var2 = 0;

      for(int var3 = $this$sum.length; var2 < var3; ++var2) {
         byte element = $this$sum[var2].unbox-impl();
         sum = UInt.constructor-impl(sum + UInt.constructor-impl(element & 255));
      }

      return sum;
   }

   @JvmName(
      name = "sumOfUShort"
   )
   @SinceKotlin(
      version = "1.5"
   )
   public static final int sumOfUShort(@NotNull UShort[] $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      int sum = 0;
      int var2 = 0;

      for(int var3 = $this$sum.length; var2 < var3; ++var2) {
         short element = $this$sum[var2].unbox-impl();
         sum = UInt.constructor-impl(sum + UInt.constructor-impl(element & '\uffff'));
      }

      return sum;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sum__ajY_9A/* $FF was: sum--ajY-9A*/(int[] $this$sum_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$sum_u2d_u2dajY_u2d9A, "$this$sum");
      return UInt.constructor-impl(ArraysKt.sum($this$sum_u2d_u2dajY_u2d9A));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final long sum_QwZRm1k/* $FF was: sum-QwZRm1k*/(long[] $this$sum_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$sum_u2dQwZRm1k, "$this$sum");
      return ULong.constructor-impl(ArraysKt.sum($this$sum_u2dQwZRm1k));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sum_GBYM_sE/* $FF was: sum-GBYM_sE*/(byte[] $this$sum_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$sum_u2dGBYM_sE, "$this$sum");
      byte[] var1 = $this$sum_u2dGBYM_sE;
      int var2 = UInt.constructor-impl(0);
      int var3 = 0;

      for(int var4 = UByteArray.getSize-impl($this$sum_u2dGBYM_sE); var3 < var4; ++var3) {
         byte var5 = UByteArray.get-w2LRezQ(var1, var3);
         int var7 = false;
         int var9 = UInt.constructor-impl(var5 & 255);
         var2 = UInt.constructor-impl(var2 + var9);
      }

      return var2;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @InlineOnly
   private static final int sum_rL5Bavg/* $FF was: sum-rL5Bavg*/(short[] $this$sum_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$sum_u2drL5Bavg, "$this$sum");
      short[] var1 = $this$sum_u2drL5Bavg;
      int var2 = UInt.constructor-impl(0);
      int var3 = 0;

      for(int var4 = UShortArray.getSize-impl($this$sum_u2drL5Bavg); var3 < var4; ++var3) {
         short var5 = UShortArray.get-Mh2AYeg(var1, var3);
         int var7 = false;
         int var9 = UInt.constructor-impl(var5 & '\uffff');
         var2 = UInt.constructor-impl(var2 + var9);
      }

      return var2;
   }

   private static final Iterator withIndex__ajY_9A$lambda$56$UArraysKt___UArraysKt(int[] $this_withIndex) {
      return UIntArray.iterator-impl($this_withIndex);
   }

   private static final Iterator withIndex_QwZRm1k$lambda$57$UArraysKt___UArraysKt(long[] $this_withIndex) {
      return ULongArray.iterator-impl($this_withIndex);
   }

   private static final Iterator withIndex_GBYM_sE$lambda$58$UArraysKt___UArraysKt(byte[] $this_withIndex) {
      return UByteArray.iterator-impl($this_withIndex);
   }

   private static final Iterator withIndex_rL5Bavg$lambda$59$UArraysKt___UArraysKt(short[] $this_withIndex) {
      return UShortArray.iterator-impl($this_withIndex);
   }

   public UArraysKt___UArraysKt() {
   }
}
