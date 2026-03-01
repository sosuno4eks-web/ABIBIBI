package kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class AtomicsKt__Atomics_commonKt {
   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final void plusAssign(@NotNull AtomicInteger $this$plusAssign, int delta) {
      Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
      $this$plusAssign.addAndGet(delta);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final void minusAssign(@NotNull AtomicInteger $this$minusAssign, int delta) {
      Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
      $this$minusAssign.addAndGet(-delta);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final int fetchAndIncrement(@NotNull AtomicInteger $this$fetchAndIncrement) {
      Intrinsics.checkNotNullParameter($this$fetchAndIncrement, "<this>");
      return $this$fetchAndIncrement.getAndAdd(1);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final int incrementAndFetch(@NotNull AtomicInteger $this$incrementAndFetch) {
      Intrinsics.checkNotNullParameter($this$incrementAndFetch, "<this>");
      return $this$incrementAndFetch.addAndGet(1);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final int decrementAndFetch(@NotNull AtomicInteger $this$decrementAndFetch) {
      Intrinsics.checkNotNullParameter($this$decrementAndFetch, "<this>");
      return $this$decrementAndFetch.addAndGet(-1);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final int fetchAndDecrement(@NotNull AtomicInteger $this$fetchAndDecrement) {
      Intrinsics.checkNotNullParameter($this$fetchAndDecrement, "<this>");
      return $this$fetchAndDecrement.getAndAdd(-1);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final void plusAssign(@NotNull AtomicLong $this$plusAssign, long delta) {
      Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
      $this$plusAssign.addAndGet(delta);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final void minusAssign(@NotNull AtomicLong $this$minusAssign, long delta) {
      Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
      $this$minusAssign.addAndGet(-delta);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final long fetchAndIncrement(@NotNull AtomicLong $this$fetchAndIncrement) {
      Intrinsics.checkNotNullParameter($this$fetchAndIncrement, "<this>");
      return $this$fetchAndIncrement.getAndAdd(1L);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final long incrementAndFetch(@NotNull AtomicLong $this$incrementAndFetch) {
      Intrinsics.checkNotNullParameter($this$incrementAndFetch, "<this>");
      return $this$incrementAndFetch.addAndGet(1L);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final long decrementAndFetch(@NotNull AtomicLong $this$decrementAndFetch) {
      Intrinsics.checkNotNullParameter($this$decrementAndFetch, "<this>");
      return $this$decrementAndFetch.addAndGet(-1L);
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalAtomicApi
   public static final long fetchAndDecrement(@NotNull AtomicLong $this$fetchAndDecrement) {
      Intrinsics.checkNotNullParameter($this$fetchAndDecrement, "<this>");
      return $this$fetchAndDecrement.getAndAdd(-1L);
   }

   public AtomicsKt__Atomics_commonKt() {
   }
}
