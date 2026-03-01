package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class EmptyMap implements Map, Serializable, KMappedMarker {
   @NotNull
   public static final EmptyMap INSTANCE = new EmptyMap();
   private static final long serialVersionUID = 8246714829545688274L;

   private EmptyMap() {
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof Map && ((Map)other).isEmpty();
   }

   public int hashCode() {
      return 0;
   }

   @NotNull
   public String toString() {
      return "{}";
   }

   public int getSize() {
      return 0;
   }

   public boolean isEmpty() {
      return true;
   }

   public boolean containsKey(@Nullable Object key) {
      return false;
   }

   public boolean containsValue(@NotNull Void value) {
      Intrinsics.checkNotNullParameter(value, "value");
      return false;
   }

   @Nullable
   public Void get(@Nullable Object key) {
      return null;
   }

   @NotNull
   public Set<Entry> getEntries() {
      return (Set)EmptySet.INSTANCE;
   }

   @NotNull
   public Set<Object> getKeys() {
      return (Set)EmptySet.INSTANCE;
   }

   @NotNull
   public Collection getValues() {
      return (Collection)EmptyList.INSTANCE;
   }

   private final Object readResolve() {
      return INSTANCE;
   }

   public Void put(Object key, Void value) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public Void remove(Object key) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean remove(Object key, Object value) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void putAll(Map from) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
