package kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class AtomicsKt__Atomics_jvmKt extends AtomicsKt__Atomics_commonKt {
   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final AtomicInteger asJavaAtomic(@NotNull AtomicInteger $this$asJavaAtomic) {
      Intrinsics.checkNotNullParameter($this$asJavaAtomic, "<this>");
      return $this$asJavaAtomic;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final AtomicInteger asKotlinAtomic(@NotNull AtomicInteger $this$asKotlinAtomic) {
      Intrinsics.checkNotNullParameter($this$asKotlinAtomic, "<this>");
      return $this$asKotlinAtomic;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final AtomicLong asJavaAtomic(@NotNull AtomicLong $this$asJavaAtomic) {
      Intrinsics.checkNotNullParameter($this$asJavaAtomic, "<this>");
      return $this$asJavaAtomic;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final AtomicLong asKotlinAtomic(@NotNull AtomicLong $this$asKotlinAtomic) {
      Intrinsics.checkNotNullParameter($this$asKotlinAtomic, "<this>");
      return $this$asKotlinAtomic;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final AtomicBoolean asJavaAtomic(@NotNull AtomicBoolean $this$asJavaAtomic) {
      Intrinsics.checkNotNullParameter($this$asJavaAtomic, "<this>");
      return $this$asJavaAtomic;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final AtomicBoolean asKotlinAtomic(@NotNull AtomicBoolean $this$asKotlinAtomic) {
      Intrinsics.checkNotNullParameter($this$asKotlinAtomic, "<this>");
      return $this$asKotlinAtomic;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final <T> AtomicReference<T> asJavaAtomic(@NotNull AtomicReference<T> $this$asJavaAtomic) {
      Intrinsics.checkNotNullParameter($this$asJavaAtomic, "<this>");
      return $this$asJavaAtomic;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   @NotNull
   public static final <T> AtomicReference<T> asKotlinAtomic(@NotNull AtomicReference<T> $this$asKotlinAtomic) {
      Intrinsics.checkNotNullParameter($this$asKotlinAtomic, "<this>");
      return $this$asKotlinAtomic;
   }

   public AtomicsKt__Atomics_jvmKt() {
   }
}
