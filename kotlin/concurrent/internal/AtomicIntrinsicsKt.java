package kotlin.concurrent.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class AtomicIntrinsicsKt {
   @SinceKotlin(
      version = "2.1"
   )
   @PublishedApi
   public static final int compareAndExchange(@NotNull AtomicInteger $this$compareAndExchange, int expected, int newValue) {
      Intrinsics.checkNotNullParameter($this$compareAndExchange, "<this>");

      do {
         int currentValue = $this$compareAndExchange.get();
         if (expected != currentValue) {
            return currentValue;
         }
      } while(!$this$compareAndExchange.compareAndSet(expected, newValue));

      return expected;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @PublishedApi
   public static final long compareAndExchange(@NotNull AtomicLong $this$compareAndExchange, long expected, long newValue) {
      Intrinsics.checkNotNullParameter($this$compareAndExchange, "<this>");

      do {
         long currentValue = $this$compareAndExchange.get();
         if (expected != currentValue) {
            return currentValue;
         }
      } while(!$this$compareAndExchange.compareAndSet(expected, newValue));

      return expected;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @PublishedApi
   public static final boolean compareAndExchange(@NotNull AtomicBoolean $this$compareAndExchange, boolean expected, boolean newValue) {
      Intrinsics.checkNotNullParameter($this$compareAndExchange, "<this>");

      do {
         boolean currentValue = $this$compareAndExchange.get();
         if (expected != currentValue) {
            return currentValue;
         }
      } while(!$this$compareAndExchange.compareAndSet(expected, newValue));

      return expected;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @PublishedApi
   public static final <T> T compareAndExchange(@NotNull AtomicReference<T> $this$compareAndExchange, T expected, T newValue) {
      Intrinsics.checkNotNullParameter($this$compareAndExchange, "<this>");

      do {
         Object currentValue = $this$compareAndExchange.get();
         if (expected != currentValue) {
            return currentValue;
         }
      } while(!$this$compareAndExchange.compareAndSet(expected, newValue));

      return expected;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @PublishedApi
   public static final int compareAndExchange(@NotNull AtomicIntegerArray $this$compareAndExchange, int index, int expected, int newValue) {
      Intrinsics.checkNotNullParameter($this$compareAndExchange, "<this>");

      do {
         int currentValue = $this$compareAndExchange.get(index);
         if (expected != currentValue) {
            return currentValue;
         }
      } while(!$this$compareAndExchange.compareAndSet(index, expected, newValue));

      return expected;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @PublishedApi
   public static final long compareAndExchange(@NotNull AtomicLongArray $this$compareAndExchange, int index, long expected, long newValue) {
      Intrinsics.checkNotNullParameter($this$compareAndExchange, "<this>");

      do {
         long currentValue = $this$compareAndExchange.get(index);
         if (expected != currentValue) {
            return currentValue;
         }
      } while(!$this$compareAndExchange.compareAndSet(index, expected, newValue));

      return expected;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @PublishedApi
   public static final <T> T compareAndExchange(@NotNull AtomicReferenceArray<T> $this$compareAndExchange, int index, T expected, T newValue) {
      Intrinsics.checkNotNullParameter($this$compareAndExchange, "<this>");

      do {
         Object currentValue = $this$compareAndExchange.get(index);
         if (expected != currentValue) {
            return currentValue;
         }
      } while(!$this$compareAndExchange.compareAndSet(index, expected, newValue));

      return expected;
   }
}
