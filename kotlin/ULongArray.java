package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(
   version = "1.3"
)
@ExperimentalUnsignedTypes
public final class ULongArray implements Collection<ULong>, KMappedMarker {
   @NotNull
   private final long[] storage;

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getStorage$annotations() {
   }

   @NotNull
   public static long[] constructor_impl/* $FF was: constructor-impl*/(int size) {
      return constructor-impl(new long[size]);
   }

   public static final long get_s_VKNKU/* $FF was: get-s-VKNKU*/(long[] arg0, int index) {
      return ULong.constructor-impl(arg0[index]);
   }

   public static final void set_k8EXiF4/* $FF was: set-k8EXiF4*/(long[] arg0, int index, long value) {
      arg0[index] = value;
   }

   public static int getSize_impl/* $FF was: getSize-impl*/(long[] arg0) {
      return arg0.length;
   }

   public int getSize() {
      return getSize-impl(this.storage);
   }

   @NotNull
   public static java.util.Iterator<ULong> iterator_impl/* $FF was: iterator-impl*/(long[] arg0) {
      return (java.util.Iterator)(new ULongArray.Iterator(arg0));
   }

   @NotNull
   public java.util.Iterator<ULong> iterator() {
      return iterator-impl(this.storage);
   }

   public static boolean contains_VKZWuLQ/* $FF was: contains-VKZWuLQ*/(long[] arg0, long element) {
      return ArraysKt.contains(arg0, element);
   }

   public boolean contains_VKZWuLQ/* $FF was: contains-VKZWuLQ*/(long element) {
      return contains-VKZWuLQ(this.storage, element);
   }

   public static boolean containsAll_impl/* $FF was: containsAll-impl*/(long[] arg0, @NotNull Collection<ULong> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      Iterable $this$all$iv = (Iterable)elements;
      int $i$f$all = false;
      boolean var10000;
      if (((Collection)$this$all$iv).isEmpty()) {
         var10000 = true;
      } else {
         java.util.Iterator var4 = $this$all$iv.iterator();

         while(true) {
            if (!var4.hasNext()) {
               var10000 = true;
               break;
            }

            Object element$iv = var4.next();
            int var7 = false;
            if (!(element$iv instanceof ULong) || !ArraysKt.contains(arg0, ((ULong)element$iv).unbox-impl())) {
               var10000 = false;
               break;
            }
         }
      }

      return var10000;
   }

   public boolean containsAll(@NotNull Collection<?> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return containsAll-impl(this.storage, elements);
   }

   public static boolean isEmpty_impl/* $FF was: isEmpty-impl*/(long[] arg0) {
      return arg0.length == 0;
   }

   public boolean isEmpty() {
      return isEmpty-impl(this.storage);
   }

   public static String toString_impl/* $FF was: toString-impl*/(long[] arg0) {
      return "ULongArray(storage=" + Arrays.toString(arg0) + ')';
   }

   public String toString() {
      return toString-impl(this.storage);
   }

   public static int hashCode_impl/* $FF was: hashCode-impl*/(long[] arg0) {
      return Arrays.hashCode(arg0);
   }

   public int hashCode() {
      return hashCode-impl(this.storage);
   }

   public static boolean equals_impl/* $FF was: equals-impl*/(long[] arg0, Object other) {
      if (!(other instanceof ULongArray)) {
         return false;
      } else {
         return Intrinsics.areEqual((Object)arg0, (Object)((ULongArray)other).unbox-impl());
      }
   }

   public boolean equals(Object other) {
      return equals-impl(this.storage, other);
   }

   public boolean add_VKZWuLQ/* $FF was: add-VKZWuLQ*/(long element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean remove(Object element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean addAll(Collection<? extends ULong> elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean removeAll(Collection<?> elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean retainAll(Collection<?> elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   // $FF: synthetic method
   @PublishedApi
   private ULongArray(long[] storage) {
      this.storage = storage;
   }

   @PublishedApi
   @NotNull
   public static long[] constructor_impl/* $FF was: constructor-impl*/(@NotNull long[] storage) {
      Intrinsics.checkNotNullParameter(storage, "storage");
      return storage;
   }

   // $FF: synthetic method
   public static final ULongArray box_impl/* $FF was: box-impl*/(long[] v) {
      return new ULongArray(v);
   }

   // $FF: synthetic method
   public final long[] unbox_impl/* $FF was: unbox-impl*/() {
      return this.storage;
   }

   public static final boolean equals_impl0/* $FF was: equals-impl0*/(long[] p1, long[] p2) {
      return Intrinsics.areEqual((Object)p1, (Object)p2);
   }

   public <T> T[] toArray(T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      return CollectionToArray.toArray((Collection)this, array);
   }

   public Object[] toArray() {
      return CollectionToArray.toArray((Collection)this);
   }

   private static final class Iterator implements java.util.Iterator<ULong>, KMappedMarker {
      @NotNull
      private final long[] array;
      private int index;

      public Iterator(@NotNull long[] array) {
         Intrinsics.checkNotNullParameter(array, "array");
         super();
         this.array = array;
      }

      public boolean hasNext() {
         return this.index < this.array.length;
      }

      public long next_s_VKNKU/* $FF was: next-s-VKNKU*/() {
         if (this.index < this.array.length) {
            long[] var10000 = this.array;
            int var1 = this.index++;
            return ULong.constructor-impl(var10000[var1]);
         } else {
            throw new NoSuchElementException(String.valueOf(this.index));
         }
      }

      public void remove() {
         throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
   }
}
