package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

public final class SetBuilder<E> extends AbstractMutableSet<E> implements Set<E>, Serializable, KMutableSet {
   @NotNull
   private static final SetBuilder.Companion Companion = new SetBuilder.Companion((DefaultConstructorMarker)null);
   @NotNull
   private final MapBuilder<E, ?> backing;
   @NotNull
   private static final SetBuilder Empty;

   public SetBuilder(@NotNull MapBuilder<E, ?> backing) {
      Intrinsics.checkNotNullParameter(backing, "backing");
      super();
      this.backing = backing;
   }

   public SetBuilder() {
      this(new MapBuilder());
   }

   public SetBuilder(int initialCapacity) {
      this(new MapBuilder(initialCapacity));
   }

   @NotNull
   public final Set<E> build() {
      this.backing.build();
      return this.size() > 0 ? (Set)this : (Set)Empty;
   }

   private final Object writeReplace() {
      if (this.backing.isReadOnly$kotlin_stdlib()) {
         return new SerializedCollection((Collection)this, 1);
      } else {
         throw new NotSerializableException("The set cannot be serialized while it is being built.");
      }
   }

   private final void readObject(ObjectInputStream input) {
      throw new InvalidObjectException("Deserialization is supported via proxy only");
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
      return this.backing.addKey$kotlin_stdlib(element) >= 0;
   }

   public boolean remove(Object element) {
      return this.backing.removeKey$kotlin_stdlib(element);
   }

   @NotNull
   public Iterator<E> iterator() {
      return (Iterator)this.backing.keysIterator$kotlin_stdlib();
   }

   public boolean addAll(@NotNull Collection<? extends E> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      this.backing.checkIsMutable$kotlin_stdlib();
      return super.addAll(elements);
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

   static {
      Empty = new SetBuilder(MapBuilder.Companion.getEmpty$kotlin_stdlib());
   }

   private static final class Companion {
      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
