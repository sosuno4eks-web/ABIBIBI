package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

public final class MapBuilderKeys<E> extends AbstractMutableSet<E> implements Set<E>, KMutableSet {
   @NotNull
   private final MapBuilder<E, ?> backing;

   public MapBuilderKeys(@NotNull MapBuilder<E, ?> backing) {
      Intrinsics.checkNotNullParameter(backing, "backing");
      super();
      this.backing = backing;
   }

   public int getSize() {
      return this.backing.size();
   }

   public boolean isEmpty() {
      return this.backing.isEmpty();
   }

   public boolean contains(Object element) {
      return this.backing.containsKey(element);
   }

   public void clear() {
      this.backing.clear();
   }

   public boolean add(E element) {
      throw new UnsupportedOperationException();
   }

   public boolean addAll(@NotNull Collection<? extends E> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      throw new UnsupportedOperationException();
   }

   public boolean remove(Object element) {
      return this.backing.removeKey$kotlin_stdlib(element);
   }

   @NotNull
   public Iterator<E> iterator() {
      return (Iterator)this.backing.keysIterator$kotlin_stdlib();
   }

   public boolean removeAll(@NotNull Collection<?> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      this.backing.checkIsMutable$kotlin_stdlib();
      return super.removeAll(elements);
   }

   public boolean retainAll(@NotNull Collection<?> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      this.backing.checkIsMutable$kotlin_stdlib();
      return super.retainAll(elements);
   }
}
