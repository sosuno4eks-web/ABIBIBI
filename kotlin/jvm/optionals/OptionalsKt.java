package kotlin.jvm.optionals;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class OptionalsKt {
   @SinceKotlin(
      version = "1.8"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @Nullable
   public static final <T> T getOrNull(@NotNull Optional<T> $this$getOrNull) {
      Intrinsics.checkNotNullParameter($this$getOrNull, "<this>");
      return $this$getOrNull.orElse((Object)null);
   }

   @SinceKotlin(
      version = "1.8"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final <T> T getOrDefault(@NotNull Optional<? extends T> $this$getOrDefault, T defaultValue) {
      Intrinsics.checkNotNullParameter($this$getOrDefault, "<this>");
      return $this$getOrDefault.isPresent() ? $this$getOrDefault.get() : defaultValue;
   }

   @SinceKotlin(
      version = "1.8"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public static final <T> T getOrElse(@NotNull Optional<? extends T> $this$getOrElse, @NotNull Function0<? extends T> defaultValue) {
      Intrinsics.checkNotNullParameter($this$getOrElse, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      int $i$f$getOrElse = false;
      return $this$getOrElse.isPresent() ? $this$getOrElse.get() : defaultValue.invoke();
   }

   @SinceKotlin(
      version = "1.8"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @NotNull
   public static final <T, C extends Collection<? super T>> C toCollection(@NotNull Optional<T> $this$toCollection, @NotNull C destination) {
      Intrinsics.checkNotNullParameter($this$toCollection, "<this>");
      Intrinsics.checkNotNullParameter(destination, "destination");
      if ($this$toCollection.isPresent()) {
         Object var10001 = $this$toCollection.get();
         Intrinsics.checkNotNullExpressionValue(var10001, "get(...)");
         destination.add(var10001);
      }

      return destination;
   }

   @SinceKotlin(
      version = "1.8"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @NotNull
   public static final <T> List<T> toList(@NotNull Optional<? extends T> $this$toList) {
      Intrinsics.checkNotNullParameter($this$toList, "<this>");
      return $this$toList.isPresent() ? CollectionsKt.listOf($this$toList.get()) : CollectionsKt.emptyList();
   }

   @SinceKotlin(
      version = "1.8"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @NotNull
   public static final <T> Set<T> toSet(@NotNull Optional<? extends T> $this$toSet) {
      Intrinsics.checkNotNullParameter($this$toSet, "<this>");
      return $this$toSet.isPresent() ? SetsKt.setOf($this$toSet.get()) : SetsKt.emptySet();
   }

   @SinceKotlin(
      version = "1.8"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @NotNull
   public static final <T> Sequence<T> asSequence(@NotNull Optional<? extends T> $this$asSequence) {
      Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
      return $this$asSequence.isPresent() ? SequencesKt.sequenceOf($this$asSequence.get()) : SequencesKt.emptySequence();
   }
}
