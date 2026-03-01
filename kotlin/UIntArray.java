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
public final class UIntArray implements Collection<UInt>, KMappedMarker {
   @NotNull
   private final int[] storage;

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getStorage$annotations() {
   }

   @NotNull
   public static int[] constructor_impl/* $FF was: constructor-impl*/(int size) {
      return constructor-impl(new int[size]);
   }

   public static final int get_pVg5ArA/* $FF was: get-pVg5ArA*/(int[] arg0, int index) {
      return UInt.constructor-impl(arg0[index]);
   }

   public static final void set_VXSXFK8/* $FF was: set-VXSXFK8*/(int[] arg0, int index, int value) {
      arg0[index] = value;
   }

   public static int getSize_impl/* $FF was: getSize-impl*/(int[] arg0) {
      return arg0.length;
   }

   public int getSize() {
      return getSize-impl(this.storage);
   }

   @NotNull
   public static java.util.Iterator<UInt> iterator_impl/* $FF was: iterator-impl*/(int[] arg0) {
      return (java.util.Iterator)(new UIntArray.Iterator(arg0));
   }

   @NotNull
   public java.util.Iterator<UInt> iterator() {
      return iterator-impl(this.storage);
   }

   public static boolean contains_WZ4Q5Ns/* $FF was: contains-WZ4Q5Ns*/(int[] arg0, int element) {
      return ArraysKt.contains(arg0, element);
   }

   public boolean contains_WZ4Q5Ns/* $FF was: contains-WZ4Q5Ns*/(int element) {
      return contains-WZ4Q5Ns(this.storage, element);
   }

   public static boolean containsAll_impl/* $FF was: containsAll-impl*/(int[] arg0, @NotNull Collection<UInt> elements) {
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
            if (!(element$iv instanceof UInt) || !ArraysKt.contains(arg0, ((UInt)element$iv).unbox-impl())) {
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

   public static boolean isEmpty_impl/* $FF was: isEmpty-impl*/(int[] arg0) {
      return arg0.length == 0;
   }

   public boolean isEmpty() {
      return isEmpty-impl(this.storage);
   }

   public static String toString_impl/* $FF was: toString-impl*/(int[] arg0) {
      return "UIntArray(storage=" + Arrays.toString(arg0) + ')';
   }

   public String toString() {
      return toString-impl(this.storage);
   }

   public static int hashCode_impl/* $FF was: hashCode-impl*/(int[] arg0) {
      return Arrays.hashCode(arg0);
   }

   public int hashCode() {
      return hashCode-impl(this.storage);
   }

   public static boolean equals_impl/* $FF was: equals-impl*/(int[] arg0, Object other) {
      if (!(other instanceof UIntArray)) {
         return false;
      } else {
         return Intrinsics.areEqual((Object)arg0, (Object)((UIntArray)other).unbox-impl());
      }
   }

   public boolean equals(Object other) {
      return equals-impl(this.storage, other);
   }

   public boolean add_WZ4Q5Ns/* $FF was: add-WZ4Q5Ns*/(int element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean remove(Object element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean addAll(Collection<? extends UInt> elements) {
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
   private UIntArray(int[] storage) {
      this.storage = storage;
   }

   @PublishedApi
   @NotNull
   public static int[] constructor_impl/* $FF was: constructor-impl*/(@NotNull int[] storage) {
      Intrinsics.checkNotNullParameter(storage, "storage");
      return storage;
   }

   // $FF: synthetic method
   public static final UIntArray box_impl/* $FF was: box-impl*/(int[] v) {
      return new UIntArray(v);
   }

   // $FF: synthetic method
   public final int[] unbox_impl/* $FF was: unbox-impl*/() {
      return this.storage;
   }

   public static final boolean equals_impl0/* $FF was: equals-impl0*/(int[] p1, int[] p2) {
      return Intrinsics.areEqual((Object)p1, (Object)p2);
   }

   public <T> T[] toArray(T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      return CollectionToArray.toArray((Collection)this, array);
   }

   public Object[] toArray() {
      return CollectionToArray.toArray((Collection)this);
   }

   private static final class Iterator implements java.util.Iterator<UInt>, KMappedMarker {
      @NotNull
      private final int[] array;
      private int index;

      public Iterator(@NotNull int[] array) {
         Intrinsics.checkNotNullParameter(array, "array");
         super();
         this.array = array;
      }

      public boolean hasNext() {
         return this.index < this.array.length;
      }

      public int next_pVg5ArA/* $FF was: next-pVg5ArA*/() {
         if (this.index < this.array.length) {
            int[] var10000 = this.array;
            int var1 = this.index++;
            return UInt.constructor-impl(var10000[var1]);
         } else {
            throw new NoSuchElementException(String.valueOf(this.index));
         }
      }

      public void remove() {
         throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
   }
}
