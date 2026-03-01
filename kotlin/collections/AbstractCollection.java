package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.1"
)
public abstract class AbstractCollection<E> implements Collection<E>, KMappedMarker {
   protected AbstractCollection() {
   }

   public abstract int getSize();

   @NotNull
   public abstract Iterator<E> iterator();

   public boolean contains(Object element) {
      Iterable $this$any$iv = (Iterable)this;
      int $i$f$any = false;
      boolean var10000;
      if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
         var10000 = false;
      } else {
         Iterator var4 = $this$any$iv.iterator();

         while(true) {
            if (!var4.hasNext()) {
               var10000 = false;
               break;
            }

            Object element$iv = var4.next();
            int var7 = false;
            if (Intrinsics.areEqual(element$iv, element)) {
               var10000 = true;
               break;
            }
         }
      }

      return var10000;
   }

   public boolean containsAll(@NotNull Collection<?> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      Iterable $this$all$iv = (Iterable)elements;
      int $i$f$all = false;
      boolean var10000;
      if (((Collection)$this$all$iv).isEmpty()) {
         var10000 = true;
      } else {
         Iterator var4 = $this$all$iv.iterator();

         while(true) {
            if (!var4.hasNext()) {
               var10000 = true;
               break;
            }

            Object element$iv = var4.next();
            int var7 = false;
            if (!this.contains(element$iv)) {
               var10000 = false;
               break;
            }
         }
      }

      return var10000;
   }

   public boolean isEmpty() {
      return this.size() == 0;
   }

   @NotNull
   public String toString() {
      return CollectionsKt.joinToString$default((Iterable)this, (CharSequence)", ", (CharSequence)"[", (CharSequence)"]", 0, (CharSequence)null, AbstractCollection::toString$lambda$2, 24, (Object)null);
   }

   @NotNull
   public Object[] toArray() {
      return CollectionToArray.toArray((Collection)this);
   }

   @NotNull
   public <T> T[] toArray(@NotNull T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      return CollectionToArray.toArray((Collection)this, array);
   }

   public boolean add(E element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean remove(Object element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean addAll(Collection<? extends E> elements) {
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

   private static final CharSequence toString$lambda$2(AbstractCollection this$0, Object it) {
      return it == this$0 ? (CharSequence)"(this Collection)" : (CharSequence)String.valueOf(it);
   }
}
