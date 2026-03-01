package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractMutableCollection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.jetbrains.annotations.NotNull;

public final class MapBuilderValues<V> extends AbstractMutableCollection<V> implements Collection<V>, KMutableCollection {
   @NotNull
   private final MapBuilder<?, V> backing;

   public MapBuilderValues(@NotNull MapBuilder<?, V> backing) {
      Intrinsics.checkNotNullParameter(backing, "backing");
      super();
      this.backing = backing;
   }

   @NotNull
   public final MapBuilder<?, V> getBacking() {
      return this.backing;
   }

   public int getSize() {
      return this.backing.size();
   }

   public boolean isEmpty() {
      return this.backing.isEmpty();
   }

   public boolean contains(Object element) {
      return this.backing.containsValue(element);
   }

   public boolean add(V element) {
      throw new UnsupportedOperationException();
   }

   public boolean addAll(@NotNull Collection<? extends V> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      throw new UnsupportedOperationException();
   }

   public void clear() {
      this.backing.clear();
   }

   @NotNull
   public Iterator<V> iterator() {
      return (Iterator)this.backing.valuesIterator$kotlin_stdlib();
   }

   public boolean remove(Object element) {
      return this.backing.removeValue$kotlin_stdlib(element);
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
