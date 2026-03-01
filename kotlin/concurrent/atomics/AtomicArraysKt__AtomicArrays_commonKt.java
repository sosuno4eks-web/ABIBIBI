package kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class AtomicArraysKt__AtomicArrays_commonKt {
   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final AtomicIntegerArray AtomicIntArray(int size, @NotNull Function1<? super Integer, Integer> init) {
      Intrinsics.checkNotNullParameter(init, "init");
      int $i$f$AtomicIntArray = false;
      int var3 = 0;

      int[] var4;
      for(var4 = new int[size]; var3 < size; ++var3) {
         var4[var3] = ((Number)init.invoke(var3)).intValue();
      }

      return new AtomicIntegerArray(var4);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final int fetchAndIncrementAt(@NotNull AtomicIntegerArray $this$fetchAndIncrementAt, int index) {
      Intrinsics.checkNotNullParameter($this$fetchAndIncrementAt, "<this>");
      return $this$fetchAndIncrementAt.getAndAdd(index, 1);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final int incrementAndFetchAt(@NotNull AtomicIntegerArray $this$incrementAndFetchAt, int index) {
      Intrinsics.checkNotNullParameter($this$incrementAndFetchAt, "<this>");
      return $this$incrementAndFetchAt.addAndGet(index, 1);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final int decrementAndFetchAt(@NotNull AtomicIntegerArray $this$decrementAndFetchAt, int index) {
      Intrinsics.checkNotNullParameter($this$decrementAndFetchAt, "<this>");
      return $this$decrementAndFetchAt.addAndGet(index, -1);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final int fetchAndDecrementAt(@NotNull AtomicIntegerArray $this$fetchAndDecrementAt, int index) {
      Intrinsics.checkNotNullParameter($this$fetchAndDecrementAt, "<this>");
      return $this$fetchAndDecrementAt.getAndAdd(index, -1);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final AtomicLongArray AtomicLongArray(int size, @NotNull Function1<? super Integer, Long> init) {
      Intrinsics.checkNotNullParameter(init, "init");
      int $i$f$AtomicLongArray = false;
      int var3 = 0;

      long[] var4;
      for(var4 = new long[size]; var3 < size; ++var3) {
         var4[var3] = ((Number)init.invoke(var3)).longValue();
      }

      return new AtomicLongArray(var4);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final long fetchAndIncrementAt(@NotNull AtomicLongArray $this$fetchAndIncrementAt, int index) {
      Intrinsics.checkNotNullParameter($this$fetchAndIncrementAt, "<this>");
      return $this$fetchAndIncrementAt.getAndAdd(index, 1L);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final long incrementAndFetchAt(@NotNull AtomicLongArray $this$incrementAndFetchAt, int index) {
      Intrinsics.checkNotNullParameter($this$incrementAndFetchAt, "<this>");
      return $this$incrementAndFetchAt.addAndGet(index, 1L);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final long decrementAndFetchAt(@NotNull AtomicLongArray $this$decrementAndFetchAt, int index) {
      Intrinsics.checkNotNullParameter($this$decrementAndFetchAt, "<this>");
      return $this$decrementAndFetchAt.addAndGet(index, -1L);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final long fetchAndDecrementAt(@NotNull AtomicLongArray $this$fetchAndDecrementAt, int index) {
      Intrinsics.checkNotNullParameter($this$fetchAndDecrementAt, "<this>");
      return $this$fetchAndDecrementAt.getAndAdd(index, -1L);
   }

   // $FF: synthetic method
   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final <T> AtomicReferenceArray<T> AtomicArray(int size, Function1<? super Integer, ? extends T> init) {
      Intrinsics.checkNotNullParameter(init, "init");
      int $i$f$AtomicArray = false;
      int var3 = 0;
      Intrinsics.reifiedOperationMarker(0, "T");

      Object[] var4;
      for(var4 = new Object[size]; var3 < size; ++var3) {
         var4[var3] = init.invoke(var3);
      }

      return new AtomicReferenceArray(var4);
   }

   public AtomicArraysKt__AtomicArrays_commonKt() {
   }
}
