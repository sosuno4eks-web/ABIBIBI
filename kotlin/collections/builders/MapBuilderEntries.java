package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class MapBuilderEntries<K, V> extends AbstractMapBuilderEntrySet<Entry<K, V>, K, V> {
   @NotNull
   private final MapBuilder<K, V> backing;

   public MapBuilderEntries(@NotNull MapBuilder<K, V> backing) {
      Intrinsics.checkNotNullParameter(backing, "backing");
      super();
      this.backing = backing;
   }

   @NotNull
   public final MapBuilder<K, V> getBacking() {
      return this.backing;
   }

   public int getSize() {
      return this.backing.size();
   }

   public boolean isEmpty() {
      return this.backing.isEmpty();
   }

   public boolean containsEntry(@NotNull Entry<? extends K, ? extends V> element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return this.backing.containsEntry$kotlin_stdlib(element);
   }

   public void clear() {
      this.backing.clear();
   }

   public boolean add(@NotNull Entry<K, V> element) {
      Intrinsics.checkNotNullParameter(element, "element");
      throw new UnsupportedOperationException();
   }

   public boolean addAll(@NotNull Collection<? extends Entry<K, V>> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      throw new UnsupportedOperationException();
   }

   public boolean remove(@NotNull Entry<K, V> element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return this.backing.removeEntry$kotlin_stdlib(element);
   }

   @NotNull
   public Iterator<Entry<K, V>> iterator() {
      return (Iterator)this.backing.entriesIterator$kotlin_stdlib();
   }

   public boolean containsAll(@NotNull Collection<?> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return this.backing.containsAllEntries$kotlin_stdlib(elements);
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
