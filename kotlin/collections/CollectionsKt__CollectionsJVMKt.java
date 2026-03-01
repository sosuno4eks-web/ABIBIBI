package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.builders.ListBuilder;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class CollectionsKt__CollectionsJVMKt {
   @NotNull
   public static final <T> List<T> listOf(T element) {
      List var10000 = Collections.singletonList(element);
      Intrinsics.checkNotNullExpressionValue(var10000, "singletonList(...)");
      return var10000;
   }

   @InlineOnly
   private static final <T> ArrayList<T> asArrayList(T[] $this$asArrayList) {
      Intrinsics.checkNotNullParameter($this$asArrayList, "<this>");
      return new ArrayList(CollectionsKt.asCollection($this$asArrayList, true));
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <E> List<E> buildListInternal(Function1<? super List<E>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      List var1 = CollectionsKt.createListBuilder();
      builderAction.invoke(var1);
      return CollectionsKt.build(var1);
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <E> List<E> buildListInternal(int capacity, Function1<? super List<E>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      List var2 = CollectionsKt.createListBuilder(capacity);
      builderAction.invoke(var2);
      return CollectionsKt.build(var2);
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <E> List<E> createListBuilder() {
      return (List)(new ListBuilder(0, 1, (DefaultConstructorMarker)null));
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <E> List<E> createListBuilder(int capacity) {
      return (List)(new ListBuilder(capacity));
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <E> List<E> build(@NotNull List<E> builder) {
      Intrinsics.checkNotNullParameter(builder, "builder");
      return ((ListBuilder)builder).build();
   }

   @InlineOnly
   private static final <T> List<T> toList(Enumeration<T> $this$toList) {
      Intrinsics.checkNotNullParameter($this$toList, "<this>");
      ArrayList var10000 = Collections.list($this$toList);
      Intrinsics.checkNotNullExpressionValue(var10000, "list(...)");
      return (List)var10000;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> $this$shuffled) {
      Intrinsics.checkNotNullParameter($this$shuffled, "<this>");
      List var1 = CollectionsKt.toMutableList($this$shuffled);
      int var3 = false;
      Collections.shuffle(var1);
      return var1;
   }

   @SinceKotlin(
      version = "1.2"
   )
   @NotNull
   public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> $this$shuffled, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$shuffled, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");
      List var2 = CollectionsKt.toMutableList($this$shuffled);
      int var4 = false;
      Collections.shuffle(var2, random);
      return var2;
   }

   @InlineOnly
   private static final Object[] collectionToArray(Collection<?> collection) {
      Intrinsics.checkNotNullParameter(collection, "collection");
      return CollectionToArray.toArray(collection);
   }

   @InlineOnly
   private static final <T> T[] collectionToArray(Collection<?> collection, T[] array) {
      Intrinsics.checkNotNullParameter(collection, "collection");
      Intrinsics.checkNotNullParameter(array, "array");
      return CollectionToArray.toArray(collection, array);
   }

   @NotNull
   public static final <T> T[] terminateCollectionToArray(int collectionSize, @NotNull T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      if (collectionSize < array.length) {
         array[collectionSize] = null;
      }

      return array;
   }

   @NotNull
   public static final <T> Object[] copyToArrayOfAny(@NotNull T[] $this$copyToArrayOfAny, boolean isVarargs) {
      Intrinsics.checkNotNullParameter($this$copyToArrayOfAny, "<this>");
      Object[] var10000;
      if (isVarargs && Intrinsics.areEqual((Object)$this$copyToArrayOfAny.getClass(), (Object)Object[].class)) {
         var10000 = $this$copyToArrayOfAny;
      } else {
         var10000 = Arrays.copyOf($this$copyToArrayOfAny, $this$copyToArrayOfAny.length, Object[].class);
         Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      }

      return var10000;
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final int checkIndexOverflow(int index) {
      if (index < 0) {
         CollectionsKt.throwIndexOverflow();
      }

      return index;
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final int checkCountOverflow(int count) {
      if (count < 0) {
         CollectionsKt.throwCountOverflow();
      }

      return count;
   }

   public CollectionsKt__CollectionsJVMKt() {
   }
}
