package kotlin.sequences;

import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class USequencesKt___USequencesKt {
   @JvmName(
      name = "sumOfUInt"
   )
   @SinceKotlin(
      version = "1.5"
   )
   public static final int sumOfUInt(@NotNull Sequence<UInt> $this$sum) {
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
   public static final long sumOfULong(@NotNull Sequence<ULong> $this$sum) {
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
   public static final int sumOfUByte(@NotNull Sequence<UByte> $this$sum) {
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
   public static final int sumOfUShort(@NotNull Sequence<UShort> $this$sum) {
      Intrinsics.checkNotNullParameter($this$sum, "<this>");
      int sum = 0;

      short element;
      for(Iterator var2 = $this$sum.iterator(); var2.hasNext(); sum = UInt.constructor-impl(sum + UInt.constructor-impl(element & '\uffff'))) {
         element = ((UShort)var2.next()).unbox-impl();
      }

      return sum;
   }

   public USequencesKt___USequencesKt() {
   }
}
