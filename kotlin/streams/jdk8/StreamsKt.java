package kotlin.streams.jdk8;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@JvmName(
   name = "StreamsKt"
)
public final class StreamsKt {
   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T> Sequence<T> asSequence(@NotNull Stream<T> $this$asSequence) {
      Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
      return (Sequence)(new StreamsKt$asSequence$$inlined$Sequence$1($this$asSequence));
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final Sequence<Integer> asSequence(@NotNull IntStream $this$asSequence) {
      Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
      return (Sequence)(new StreamsKt$asSequence$$inlined$Sequence$2($this$asSequence));
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final Sequence<Long> asSequence(@NotNull LongStream $this$asSequence) {
      Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
      return (Sequence)(new StreamsKt$asSequence$$inlined$Sequence$3($this$asSequence));
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final Sequence<Double> asSequence(@NotNull DoubleStream $this$asSequence) {
      Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
      return (Sequence)(new StreamsKt$asSequence$$inlined$Sequence$4($this$asSequence));
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T> Stream<T> asStream(@NotNull Sequence<? extends T> $this$asStream) {
      Intrinsics.checkNotNullParameter($this$asStream, "<this>");
      Stream var10000 = StreamSupport.stream(StreamsKt::asStream$lambda$4, 16, false);
      Intrinsics.checkNotNullExpressionValue(var10000, "stream(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T> List<T> toList(@NotNull Stream<T> $this$toList) {
      Intrinsics.checkNotNullParameter($this$toList, "<this>");
      Object var10000 = $this$toList.collect(Collectors.toList());
      Intrinsics.checkNotNullExpressionValue(var10000, "collect(...)");
      return (List)var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final List<Integer> toList(@NotNull IntStream $this$toList) {
      Intrinsics.checkNotNullParameter($this$toList, "<this>");
      int[] var10000 = $this$toList.toArray();
      Intrinsics.checkNotNullExpressionValue(var10000, "toArray(...)");
      return ArraysKt.asList(var10000);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final List<Long> toList(@NotNull LongStream $this$toList) {
      Intrinsics.checkNotNullParameter($this$toList, "<this>");
      long[] var10000 = $this$toList.toArray();
      Intrinsics.checkNotNullExpressionValue(var10000, "toArray(...)");
      return ArraysKt.asList(var10000);
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final List<Double> toList(@NotNull DoubleStream $this$toList) {
      Intrinsics.checkNotNullParameter($this$toList, "<this>");
      double[] var10000 = $this$toList.toArray();
      Intrinsics.checkNotNullExpressionValue(var10000, "toArray(...)");
      return ArraysKt.asList(var10000);
   }

   private static final Spliterator asStream$lambda$4(Sequence $this_asStream) {
      return Spliterators.spliteratorUnknownSize($this_asStream.iterator(), 16);
   }
}
