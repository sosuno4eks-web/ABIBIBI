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
public final class UShortArray implements Collection<UShort>, KMappedMarker {
   @NotNull
   private final short[] storage;

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getStorage$annotations() {
   }

   @NotNull
   public static short[] constructor_impl/* $FF was: constructor-impl*/(int size) {
      return constructor-impl(new short[size]);
   }

   public static final short get_Mh2AYeg/* $FF was: get-Mh2AYeg*/(short[] arg0, int index) {
      return UShort.constructor-impl(arg0[index]);
   }

   public static final void set_01HTLdE/* $FF was: set-01HTLdE*/(short[] arg0, int index, short value) {
      arg0[index] = value;
   }

   public static int getSize_impl/* $FF was: getSize-impl*/(short[] arg0) {
      return arg0.length;
   }

   public int getSize() {
      return getSize-impl(this.storage);
   }

   @NotNull
   public static java.util.Iterator<UShort> iterator_impl/* $FF was: iterator-impl*/(short[] arg0) {
      return (java.util.Iterator)(new UShortArray.Iterator(arg0));
   }

   @NotNull
   public java.util.Iterator<UShort> iterator() {
      return iterator-impl(this.storage);
   }

   public static boolean contains_xj2QHRw/* $FF was: contains-xj2QHRw*/(short[] arg0, short element) {
      return ArraysKt.contains(arg0, element);
   }

   public boolean contains_xj2QHRw/* $FF was: contains-xj2QHRw*/(short element) {
      return contains-xj2QHRw(this.storage, element);
   }

   public static boolean containsAll_impl/* $FF was: containsAll-impl*/(short[] arg0, @NotNull Collection<UShort> elements) {
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
            if (!(element$iv instanceof UShort) || !ArraysKt.contains(arg0, ((UShort)element$iv).unbox-impl())) {
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

   public static boolean isEmpty_impl/* $FF was: isEmpty-impl*/(short[] arg0) {
      return arg0.length == 0;
   }

   public boolean isEmpty() {
      return isEmpty-impl(this.storage);
   }

   public static String toString_impl/* $FF was: toString-impl*/(short[] arg0) {
      return "UShortArray(storage=" + Arrays.toString(arg0) + ')';
   }

   public String toString() {
      return toString-impl(this.storage);
   }

   public static int hashCode_impl/* $FF was: hashCode-impl*/(short[] arg0) {
      return Arrays.hashCode(arg0);
   }

   public int hashCode() {
      return hashCode-impl(this.storage);
   }

   public static boolean equals_impl/* $FF was: equals-impl*/(short[] arg0, Object other) {
      if (!(other instanceof UShortArray)) {
         return false;
      } else {
         return Intrinsics.areEqual((Object)arg0, (Object)((UShortArray)other).unbox-impl());
      }
   }

   public boolean equals(Object other) {
      return equals-impl(this.storage, other);
   }

   public boolean add_xj2QHRw/* $FF was: add-xj2QHRw*/(short element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean remove(Object element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean addAll(Collection<? extends UShort> elements) {
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
   private UShortArray(short[] storage) {
      this.storage = storage;
   }

   @PublishedApi
   @NotNull
   public static short[] constructor_impl/* $FF was: constructor-impl*/(@NotNull short[] storage) {
      Intrinsics.checkNotNullParameter(storage, "storage");
      return storage;
   }

   // $FF: synthetic method
   public static final UShortArray box_impl/* $FF was: box-impl*/(short[] v) {
      return new UShortArray(v);
   }

   // $FF: synthetic method
   public final short[] unbox_impl/* $FF was: unbox-impl*/() {
      return this.storage;
   }

   public static final boolean equals_impl0/* $FF was: equals-impl0*/(short[] p1, short[] p2) {
      return Intrinsics.areEqual((Object)p1, (Object)p2);
   }

   public <T> T[] toArray(T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      return CollectionToArray.toArray((Collection)this, array);
   }

   public Object[] toArray() {
      return CollectionToArray.toArray((Collection)this);
   }

   private static final class Iterator implements java.util.Iterator<UShort>, KMappedMarker {
      @NotNull
      private final short[] array;
      private int index;

      public Iterator(@NotNull short[] array) {
         Intrinsics.checkNotNullParameter(array, "array");
         super();
         this.array = array;
      }

      public boolean hasNext() {
         return this.index < this.array.length;
      }

      public short next_Mh2AYeg/* $FF was: next-Mh2AYeg*/() {
         if (this.index < this.array.length) {
            short[] var10000 = this.array;
            int var1 = this.index++;
            return UShort.constructor-impl(var10000[var1]);
         } else {
            throw new NoSuchElementException(String.valueOf(this.index));
         }
      }

      public void remove() {
         throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
   }
}
