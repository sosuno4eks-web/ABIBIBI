package kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class AtomicArraysKt__AtomicArrays_jvmKt extends AtomicArraysKt__AtomicArrays_commonKt {
   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final AtomicIntegerArray asJavaAtomicArray(@NotNull AtomicIntegerArray $this$asJavaAtomicArray) {
      Intrinsics.checkNotNullParameter($this$asJavaAtomicArray, "<this>");
      return $this$asJavaAtomicArray;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final AtomicIntegerArray asKotlinAtomicArray(@NotNull AtomicIntegerArray $this$asKotlinAtomicArray) {
      Intrinsics.checkNotNullParameter($this$asKotlinAtomicArray, "<this>");
      return $this$asKotlinAtomicArray;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final AtomicLongArray asJavaAtomicArray(@NotNull AtomicLongArray $this$asJavaAtomicArray) {
      Intrinsics.checkNotNullParameter($this$asJavaAtomicArray, "<this>");
      return $this$asJavaAtomicArray;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final AtomicLongArray asKotlinAtomicArray(@NotNull AtomicLongArray $this$asKotlinAtomicArray) {
      Intrinsics.checkNotNullParameter($this$asKotlinAtomicArray, "<this>");
      return $this$asKotlinAtomicArray;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final <T> AtomicReferenceArray<T> asJavaAtomicArray(@NotNull AtomicReferenceArray<T> $this$asJavaAtomicArray) {
      Intrinsics.checkNotNullParameter($this$asJavaAtomicArray, "<this>");
      return $this$asJavaAtomicArray;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final <T> AtomicReferenceArray<T> asKotlinAtomicArray(@NotNull AtomicReferenceArray<T> $this$asKotlinAtomicArray) {
      Intrinsics.checkNotNullParameter($this$asKotlinAtomicArray, "<this>");
      return $this$asKotlinAtomicArray;
   }

   public AtomicArraysKt__AtomicArrays_jvmKt() {
   }
}
