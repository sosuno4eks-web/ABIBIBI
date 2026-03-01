package kotlin.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.builders.SetBuilder;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class SetsKt__SetsJVMKt {
   @NotNull
   public static final <T> Set<T> setOf(T element) {
      Set var10000 = Collections.singleton(element);
      Intrinsics.checkNotNullExpressionValue(var10000, "singleton(...)");
      return var10000;
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <E> Set<E> buildSetInternal(Function1<? super Set<E>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      Set var1 = SetsKt.createSetBuilder();
      builderAction.invoke(var1);
      return SetsKt.build(var1);
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <E> Set<E> buildSetInternal(int capacity, Function1<? super Set<E>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      Set var2 = SetsKt.createSetBuilder(capacity);
      builderAction.invoke(var2);
      return SetsKt.build(var2);
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <E> Set<E> createSetBuilder() {
      return (Set)(new SetBuilder());
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <E> Set<E> createSetBuilder(int capacity) {
      return (Set)(new SetBuilder(capacity));
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <E> Set<E> build(@NotNull Set<E> builder) {
      Intrinsics.checkNotNullParameter(builder, "builder");
      return ((SetBuilder)builder).build();
   }

   @NotNull
   public static final <T> TreeSet<T> sortedSetOf(@NotNull T... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return (TreeSet)ArraysKt.toCollection(elements, (Collection)(new TreeSet()));
   }

   @NotNull
   public static final <T> TreeSet<T> sortedSetOf(@NotNull Comparator<? super T> comparator, @NotNull T... elements) {
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(elements, "elements");
      return (TreeSet)ArraysKt.toCollection(elements, (Collection)(new TreeSet(comparator)));
   }

   public SetsKt__SetsJVMKt() {
   }
}
