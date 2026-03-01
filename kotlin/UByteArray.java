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
public final class UByteArray implements Collection<UByte>, KMappedMarker {
   @NotNull
   private final byte[] storage;

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getStorage$annotations() {
   }

   @NotNull
   public static byte[] constructor_impl/* $FF was: constructor-impl*/(int size) {
      return constructor-impl(new byte[size]);
   }

   public static final byte get_w2LRezQ/* $FF was: get-w2LRezQ*/(byte[] arg0, int index) {
      return UByte.constructor-impl(arg0[index]);
   }

   public static final void set_VurrAj0/* $FF was: set-VurrAj0*/(byte[] arg0, int index, byte value) {
      arg0[index] = value;
   }

   public static int getSize_impl/* $FF was: getSize-impl*/(byte[] arg0) {
      return arg0.length;
   }

   public int getSize() {
      return getSize-impl(this.storage);
   }

   @NotNull
   public static java.util.Iterator<UByte> iterator_impl/* $FF was: iterator-impl*/(byte[] arg0) {
      return (java.util.Iterator)(new UByteArray.Iterator(arg0));
   }

   @NotNull
   public java.util.Iterator<UByte> iterator() {
      return iterator-impl(this.storage);
   }

   public static boolean contains_7apg3OU/* $FF was: contains-7apg3OU*/(byte[] arg0, byte element) {
      return ArraysKt.contains(arg0, element);
   }

   public boolean contains_7apg3OU/* $FF was: contains-7apg3OU*/(byte element) {
      return contains-7apg3OU(this.storage, element);
   }

   public static boolean containsAll_impl/* $FF was: containsAll-impl*/(byte[] arg0, @NotNull Collection<UByte> elements) {
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
            if (!(element$iv instanceof UByte) || !ArraysKt.contains(arg0, ((UByte)element$iv).unbox-impl())) {
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

   public static boolean isEmpty_impl/* $FF was: isEmpty-impl*/(byte[] arg0) {
      return arg0.length == 0;
   }

   public boolean isEmpty() {
      return isEmpty-impl(this.storage);
   }

   public static String toString_impl/* $FF was: toString-impl*/(byte[] arg0) {
      return "UByteArray(storage=" + Arrays.toString(arg0) + ')';
   }

   public String toString() {
      return toString-impl(this.storage);
   }

   public static int hashCode_impl/* $FF was: hashCode-impl*/(byte[] arg0) {
      return Arrays.hashCode(arg0);
   }

   public int hashCode() {
      return hashCode-impl(this.storage);
   }

   public static boolean equals_impl/* $FF was: equals-impl*/(byte[] arg0, Object other) {
      if (!(other instanceof UByteArray)) {
         return false;
      } else {
         return Intrinsics.areEqual((Object)arg0, (Object)((UByteArray)other).unbox-impl());
      }
   }

   public boolean equals(Object other) {
      return equals-impl(this.storage, other);
   }

   public boolean add_7apg3OU/* $FF was: add-7apg3OU*/(byte element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean remove(Object element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean addAll(Collection<? extends UByte> elements) {
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
   private UByteArray(byte[] storage) {
      this.storage = storage;
   }

   @PublishedApi
   @NotNull
   public static byte[] constructor_impl/* $FF was: constructor-impl*/(@NotNull byte[] storage) {
      Intrinsics.checkNotNullParameter(storage, "storage");
      return storage;
   }

   // $FF: synthetic method
   public static final UByteArray box_impl/* $FF was: box-impl*/(byte[] v) {
      return new UByteArray(v);
   }

   // $FF: synthetic method
   public final byte[] unbox_impl/* $FF was: unbox-impl*/() {
      return this.storage;
   }

   public static final boolean equals_impl0/* $FF was: equals-impl0*/(byte[] p1, byte[] p2) {
      return Intrinsics.areEqual((Object)p1, (Object)p2);
   }

   public <T> T[] toArray(T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      return CollectionToArray.toArray((Collection)this, array);
   }

   public Object[] toArray() {
      return CollectionToArray.toArray((Collection)this);
   }

   private static final class Iterator implements java.util.Iterator<UByte>, KMappedMarker {
      @NotNull
      private final byte[] array;
      private int index;

      public Iterator(@NotNull byte[] array) {
         Intrinsics.checkNotNullParameter(array, "array");
         super();
         this.array = array;
      }

      public boolean hasNext() {
         return this.index < this.array.length;
      }

      public byte next_w2LRezQ/* $FF was: next-w2LRezQ*/() {
         if (this.index < this.array.length) {
            byte[] var10000 = this.array;
            int var1 = this.index++;
            return UByte.constructor-impl(var10000[var1]);
         } else {
            throw new NoSuchElementException(String.valueOf(this.index));
         }
      }

      public void remove() {
         throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
   }
}
