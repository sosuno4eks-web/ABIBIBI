package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.1"
)
public abstract class AbstractMap<K, V> implements Map<K, V>, KMappedMarker {
   @NotNull
   public static final AbstractMap.Companion Companion = new AbstractMap.Companion((DefaultConstructorMarker)null);
   @Nullable
   private volatile Set<? extends K> _keys;
   @Nullable
   private volatile Collection<? extends V> _values;

   protected AbstractMap() {
   }

   public boolean containsKey(Object key) {
      return this.implFindEntry(key) != null;
   }

   public boolean containsValue(Object value) {
      Iterable $this$any$iv = (Iterable)this.entrySet();
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
            Entry it = (Entry)element$iv;
            int var7 = false;
            if (Intrinsics.areEqual(it.getValue(), value)) {
               var10000 = true;
               break;
            }
         }
      }

      return var10000;
   }

   public final boolean containsEntry$kotlin_stdlib(@Nullable Entry<?, ?> entry) {
      if (entry == null) {
         return false;
      } else {
         Object key = entry.getKey();
         Object value = entry.getValue();
         Map var10000 = (Map)this;
         Intrinsics.checkNotNull((Map)this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
         Object ourValue = var10000.get(key);
         if (!Intrinsics.areEqual(value, ourValue)) {
            return false;
         } else {
            if (ourValue == null) {
               var10000 = (Map)this;
               Intrinsics.checkNotNull((Map)this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
               if (!var10000.containsKey(key)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public boolean equals(@Nullable Object other) {
      if (other == this) {
         return true;
      } else if (!(other instanceof Map)) {
         return false;
      } else if (this.size() != ((Map)other).size()) {
         return false;
      } else {
         Iterable $this$all$iv = (Iterable)((Map)other).entrySet();
         int $i$f$all = false;
         boolean var10000;
         if ($this$all$iv instanceof Collection && ((Collection)$this$all$iv).isEmpty()) {
            var10000 = true;
         } else {
            Iterator var4 = $this$all$iv.iterator();

            while(true) {
               if (!var4.hasNext()) {
                  var10000 = true;
                  break;
               }

               Object element$iv = var4.next();
               Entry it = (Entry)element$iv;
               int var7 = false;
               if (!this.containsEntry$kotlin_stdlib(it)) {
                  var10000 = false;
                  break;
               }
            }
         }

         return var10000;
      }
   }

   @Nullable
   public V get(Object key) {
      Entry var10000 = this.implFindEntry(key);
      return var10000 != null ? var10000.getValue() : null;
   }

   public int hashCode() {
      return this.entrySet().hashCode();
   }

   public boolean isEmpty() {
      return this.size() == 0;
   }

   public int getSize() {
      return this.entrySet().size();
   }

   @NotNull
   public Set<K> getKeys() {
      if (this._keys == null) {
         this._keys = (Set)(new AbstractSet<K>() {
            public boolean contains(Object element) {
               return AbstractMap.this.containsKey(element);
            }

            public Iterator<K> iterator() {
               final Iterator entryIterator = AbstractMap.this.entrySet().iterator();
               return (Iterator)(new Iterator<K>() {
                  public boolean hasNext() {
                     return entryIterator.hasNext();
                  }

                  public K next() {
                     return ((Entry)entryIterator.next()).getKey();
                  }

                  public void remove() {
                     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                  }
               });
            }

            public int getSize() {
               return AbstractMap.this.size();
            }
         });
      }

      Set var10000 = this._keys;
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   @NotNull
   public String toString() {
      return CollectionsKt.joinToString$default((Iterable)this.entrySet(), (CharSequence)", ", (CharSequence)"{", (CharSequence)"}", 0, (CharSequence)null, AbstractMap::toString$lambda$2, 24, (Object)null);
   }

   private final String toString(Entry<? extends K, ? extends V> entry) {
      return this.toString(entry.getKey()) + '=' + this.toString(entry.getValue());
   }

   private final String toString(Object o) {
      return o == this ? "(this Map)" : String.valueOf(o);
   }

   @NotNull
   public Collection<V> getValues() {
      if (this._values == null) {
         this._values = (Collection)(new AbstractCollection<V>() {
            public boolean contains(Object element) {
               return AbstractMap.this.containsValue(element);
            }

            public Iterator<V> iterator() {
               final Iterator entryIterator = AbstractMap.this.entrySet().iterator();
               return (Iterator)(new Iterator<V>() {
                  public boolean hasNext() {
                     return entryIterator.hasNext();
                  }

                  public V next() {
                     return ((Entry)entryIterator.next()).getValue();
                  }

                  public void remove() {
                     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                  }
               });
            }

            public int getSize() {
               return AbstractMap.this.size();
            }
         });
      }

      Collection var10000 = this._values;
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   private final Entry<K, V> implFindEntry(K key) {
      Iterable $this$firstOrNull$iv = (Iterable)this.entrySet();
      int $i$f$firstOrNull = false;
      Iterator var4 = $this$firstOrNull$iv.iterator();

      Object var10000;
      while(true) {
         if (var4.hasNext()) {
            Object element$iv = var4.next();
            Entry it = (Entry)element$iv;
            int var7 = false;
            if (!Intrinsics.areEqual(it.getKey(), key)) {
               continue;
            }

            var10000 = element$iv;
            break;
         }

         var10000 = null;
         break;
      }

      return (Entry)var10000;
   }

   public V put(K key, V value) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public V remove(Object key) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void putAll(Map<? extends K, ? extends V> from) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   private static final CharSequence toString$lambda$2(AbstractMap this$0, Entry it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return (CharSequence)this$0.toString(it);
   }

   public abstract Set<Entry<K, V>> getEntries();

   public static final class Companion {
      private Companion() {
      }

      public final int entryHashCode$kotlin_stdlib(@NotNull Entry<?, ?> e) {
         Intrinsics.checkNotNullParameter(e, "e");
         int var3 = false;
         Object var10000 = e.getKey();
         int var4 = var10000 != null ? var10000.hashCode() : 0;
         Object var10001 = e.getValue();
         return var4 ^ (var10001 != null ? var10001.hashCode() : 0);
      }

      @NotNull
      public final String entryToString$kotlin_stdlib(@NotNull Entry<?, ?> e) {
         Intrinsics.checkNotNullParameter(e, "e");
         int var3 = false;
         return "" + e.getKey() + '=' + e.getValue();
      }

      public final boolean entryEquals$kotlin_stdlib(@NotNull Entry<?, ?> e, @Nullable Object other) {
         Intrinsics.checkNotNullParameter(e, "e");
         if (!(other instanceof Entry)) {
            return false;
         } else {
            return Intrinsics.areEqual(e.getKey(), ((Entry)other).getKey()) && Intrinsics.areEqual(e.getValue(), ((Entry)other).getValue());
         }
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
