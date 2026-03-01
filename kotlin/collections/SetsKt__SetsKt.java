package kotlin.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.BuilderInference;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class SetsKt__SetsKt extends SetsKt__SetsJVMKt {
   @NotNull
   public static final <T> Set<T> emptySet() {
      return (Set)EmptySet.INSTANCE;
   }

   @NotNull
   public static final <T> Set<T> setOf(@NotNull T... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return ArraysKt.toSet(elements);
   }

   @InlineOnly
   private static final <T> Set<T> setOf() {
      return SetsKt.emptySet();
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <T> Set<T> mutableSetOf() {
      return (Set)(new LinkedHashSet());
   }

   @NotNull
   public static final <T> Set<T> mutableSetOf(@NotNull T... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return (Set)ArraysKt.toCollection(elements, (Collection)(new LinkedHashSet(MapsKt.mapCapacity(elements.length))));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <T> HashSet<T> hashSetOf() {
      return new HashSet();
   }

   @NotNull
   public static final <T> HashSet<T> hashSetOf(@NotNull T... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return (HashSet)ArraysKt.toCollection(elements, (Collection)(new HashSet(MapsKt.mapCapacity(elements.length))));
   }

   @SinceKotlin(
      version = "1.1"
   )
   @InlineOnly
   private static final <T> LinkedHashSet<T> linkedSetOf() {
      return new LinkedHashSet();
   }

   @NotNull
   public static final <T> LinkedHashSet<T> linkedSetOf(@NotNull T... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return (LinkedHashSet)ArraysKt.toCollection(elements, (Collection)(new LinkedHashSet(MapsKt.mapCapacity(elements.length))));
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T> Set<T> setOfNotNull(@Nullable T element) {
      return element != null ? SetsKt.setOf(element) : SetsKt.emptySet();
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T> Set<T> setOfNotNull(@NotNull T... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return (Set)ArraysKt.filterNotNullTo(elements, (Collection)(new LinkedHashSet()));
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final <E> Set<E> buildSet(@BuilderInference Function1<? super Set<E>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      Set var1 = SetsKt.createSetBuilder();
      builderAction.invoke(var1);
      return SetsKt.build(var1);
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final <E> Set<E> buildSet(int capacity, @BuilderInference Function1<? super Set<E>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      Set var2 = SetsKt.createSetBuilder(capacity);
      builderAction.invoke(var2);
      return SetsKt.build(var2);
   }

   @InlineOnly
   private static final <T> Set<T> orEmpty(Set<? extends T> $this$orEmpty) {
      Set var10000 = $this$orEmpty;
      if ($this$orEmpty == null) {
         var10000 = SetsKt.emptySet();
      }

      return var10000;
   }

   @NotNull
   public static final <T> Set<T> optimizeReadOnlySet(@NotNull Set<? extends T> $this$optimizeReadOnlySet) {
      Intrinsics.checkNotNullParameter($this$optimizeReadOnlySet, "<this>");
      Set var10000;
      switch($this$optimizeReadOnlySet.size()) {
      case 0:
         var10000 = SetsKt.emptySet();
         break;
      case 1:
         var10000 = SetsKt.setOf($this$optimizeReadOnlySet.iterator().next());
         break;
      default:
         var10000 = $this$optimizeReadOnlySet;
      }

      return var10000;
   }

   public SetsKt__SetsKt() {
   }
}
