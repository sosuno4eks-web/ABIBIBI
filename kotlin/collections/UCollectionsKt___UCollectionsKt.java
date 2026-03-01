package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class UCollectionsKt___UCollectionsKt {
   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final byte[] toUByteArray(@NotNull Collection<UByte> $this$toUByteArray) {
      Intrinsics.checkNotNullParameter($this$toUByteArray, "<this>");
      byte[] result = UByteArray.constructor-impl($this$toUByteArray.size());
      int index = 0;
      Iterator var3 = $this$toUByteArray.iterator();

      while(var3.hasNext()) {
         byte element = ((UByte)var3.next()).unbox-impl();
         UByteArray.set-VurrAj0(result, index++, element);
      }

      return result;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final int[] toUIntArray(@NotNull Collection<UInt> $this$toUIntArray) {
      Intrinsics.checkNotNullParameter($this$toUIntArray, "<this>");
      int[] result = UIntArray.constructor-impl($this$toUIntArray.size());
      int index = 0;
      Iterator var3 = $this$toUIntArray.iterator();

      while(var3.hasNext()) {
         int element = ((UInt)var3.next()).unbox-impl();
         UIntArray.set-VXSXFK8(result, index++, element);
      }

      return result;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final long[] toULongArray(@NotNull Collection<ULong> $this$toULongArray) {
      Intrinsics.checkNotNullParameter($this$toULongArray, "<this>");
      long[] result = ULongArray.constructor-impl($this$toULongArray.size());
      int index = 0;
      Iterator var3 = $this$toULongArray.iterator();

      while(var3.hasNext()) {
         long element = ((ULong)var3.next()).unbox-impl();
         ULongArray.set-k8EXiF4(result, index++, element);
      }

      return result;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public static final short[] toUShortArray(@NotNull Collection<UShort> $this$toUShortArray) {
      Intrinsics.checkNotNullParameter($this$toUShortArray, "<this>");
      short[] result = UShortArray.constructor-impl($this$toUShortArray.size());
      int index = 0;
      Iterator var3 = $this$toUShortArray.iterator();

      while(var3.hasNext()) {
         short element = ((UShort)var3.next()).unbox-impl();
         UShortArray.set-01HTLdE(result, index++, element);
      }

      return result;
   }

   @JvmName(
      name = "sumOfUInt"
   )
   @SinceKotlin(
      version = "1.5"
   )
   public static final int sumOfUInt(@NotNull Iterable<UInt> $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      int sum = 0;

      int element;
      for(Iterator var2 = $this$sum.iterator(); var2.hasNext(); sum = UInt.constructor-impl(sum + element)) {
         element = ((UInt)var2.next()).unbox-impl();
      }

      return sum;
   }

   @JvmName(
      name = "sumOfULong"
   )
   @SinceKotlin(
      version = "1.5"
   )
   public static final long sumOfULong(@NotNull Iterable<ULong> $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      long sum = 0L;

      long element;
      for(Iterator var3 = $this$sum.iterator(); var3.hasNext(); sum = ULong.constructor-impl(sum + element)) {
         element = ((ULong)var3.next()).unbox-impl();
      }

      return sum;
   }

   @JvmName(
      name = "sumOfUByte"
   )
   @SinceKotlin(
      version = "1.5"
   )
   public static final int sumOfUByte(@NotNull Iterable<UByte> $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      int sum = 0;

      byte element;
      for(Iterator var2 = $this$sum.iterator(); var2.hasNext(); sum = UInt.constructor-impl(sum + UInt.constructor-impl(element & 255))) {
         element = ((UByte)var2.next()).unbox-impl();
      }

      return sum;
   }

   @JvmName(
      name = "sumOfUShort"
   )
   @SinceKotlin(
      version = "1.5"
   )
   public static final int sumOfUShort(@NotNull Iterable<UShort> $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      int sum = 0;

      short element;
      for(Iterator var2 = $this$sum.iterator(); var2.hasNext(); sum = UInt.constructor-impl(sum + UInt.constructor-impl(element & '\uffff'))) {
         element = ((UShort)var2.next()).unbox-impl();
      }

      return sum;
   }

   public UCollectionsKt___UCollectionsKt() {
   }
}
