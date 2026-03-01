package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {
   @NotNull
   public static final MapBuilder.Companion Companion = new MapBuilder.Companion((DefaultConstructorMarker)null);
   @NotNull
   private K[] keysArray;
   @Nullable
   private V[] valuesArray;
   @NotNull
   private int[] presenceArray;
   @NotNull
   private int[] hashArray;
   private int maxProbeDistance;
   private int length;
   private int hashShift;
   private int modCount;
   private int size;
   @Nullable
   private MapBuilderKeys<K> keysView;
   @Nullable
   private MapBuilderValues<V> valuesView;
   @Nullable
   private MapBuilderEntries<K, V> entriesView;
   private boolean isReadOnly;
   private static final int MAGIC = -1640531527;
   private static final int INITIAL_CAPACITY = 8;
   private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
   private static final int TOMBSTONE = -1;
   @NotNull
   private static final MapBuilder Empty;

   private MapBuilder(K[] keysArray, V[] valuesArray, int[] presenceArray, int[] hashArray, int maxProbeDistance, int length) {
      this.keysArray = keysArray;
      this.valuesArray = valuesArray;
      this.presenceArray = presenceArray;
      this.hashArray = hashArray;
      this.maxProbeDistance = maxProbeDistance;
      this.length = length;
      this.hashShift = Companion.computeShift(this.getHashSize());
   }

   public int getSize() {
      return this.size;
   }

   public final boolean isReadOnly$kotlin_stdlib() {
      return this.isReadOnly;
   }

   public MapBuilder() {
      this(8);
   }

   public MapBuilder(int initialCapacity) {
      this(ListBuilderKt.arrayOfUninitializedElements(initialCapacity), (Object[])null, new int[initialCapacity], new int[Companion.computeHashSize(initialCapacity)], 2, 0);
   }

   @NotNull
   public final Map<K, V> build() {
      this.checkIsMutable$kotlin_stdlib();
      this.isReadOnly = true;
      Map var10000;
      if (this.size() > 0) {
         var10000 = (Map)this;
      } else {
         MapBuilder var1 = Empty;
         Intrinsics.checkNotNull(var1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
         var10000 = (Map)var1;
      }

      return var10000;
   }

   private final Object writeReplace() {
      if (this.isReadOnly) {
         return new SerializedMap((Map)this);
      } else {
         throw new NotSerializableException("The map cannot be serialized while it is being built.");
      }
   }

   private final void readObject(ObjectInputStream input) {
      throw new InvalidObjectException("Deserialization is supported via proxy only");
   }

   public boolean isEmpty() {
      return this.size() == 0;
   }

   public boolean containsKey(Object key) {
      return this.findKey(key) >= 0;
   }

   public boolean containsValue(Object value) {
      return this.findValue(value) >= 0;
   }

   @Nullable
   public V get(Object key) {
      int index = this.findKey(key);
      if (index < 0) {
         return null;
      } else {
         Object[] var10000 = this.valuesArray;
         Intrinsics.checkNotNull(var10000);
         return var10000[index];
      }
   }

   @Nullable
   public V put(K key, V value) {
      this.checkIsMutable$kotlin_stdlib();
      int index = this.addKey$kotlin_stdlib(key);
      Object[] valuesArray = this.allocateValuesArray();
      if (index < 0) {
         Object oldValue = valuesArray[-index - 1];
         valuesArray[-index - 1] = value;
         return oldValue;
      } else {
         valuesArray[index] = value;
         return null;
      }
   }

   public void putAll(@NotNull Map<? extends K, ? extends V> from) {
      Intrinsics.checkNotNullParameter(from, "from");
      this.checkIsMutable$kotlin_stdlib();
      this.putAllEntries((Collection)from.entrySet());
   }

   @Nullable
   public V remove(Object key) {
      this.checkIsMutable$kotlin_stdlib();
      int index = this.findKey(key);
      if (index < 0) {
         return null;
      } else {
         Object[] var10000 = this.valuesArray;
         Intrinsics.checkNotNull(var10000);
         Object oldValue = var10000[index];
         this.removeEntryAt(index);
         return oldValue;
      }
   }

   public void clear() {
      this.checkIsMutable$kotlin_stdlib();
      int i = 0;
      int var2 = this.length - 1;
      if (i <= var2) {
         while(true) {
            int hash = this.presenceArray[i];
            if (hash >= 0) {
               this.hashArray[hash] = 0;
               this.presenceArray[i] = -1;
            }

            if (i == var2) {
               break;
            }

            ++i;
         }
      }

      ListBuilderKt.resetRange(this.keysArray, 0, this.length);
      Object[] var10000 = this.valuesArray;
      if (var10000 != null) {
         ListBuilderKt.resetRange(var10000, 0, this.length);
      }

      this.size = 0;
      this.length = 0;
      this.registerModification();
   }

   @NotNull
   public Set<K> getKeys() {
      MapBuilderKeys cur = this.keysView;
      Set var10000;
      if (cur == null) {
         MapBuilderKeys var2 = new MapBuilderKeys(this);
         this.keysView = var2;
         var10000 = (Set)var2;
      } else {
         var10000 = (Set)cur;
      }

      return var10000;
   }

   @NotNull
   public Collection<V> getValues() {
      MapBuilderValues cur = this.valuesView;
      Collection var10000;
      if (cur == null) {
         MapBuilderValues var2 = new MapBuilderValues(this);
         this.valuesView = var2;
         var10000 = (Collection)var2;
      } else {
         var10000 = (Collection)cur;
      }

      return var10000;
   }

   @NotNull
   public Set<java.util.Map.Entry<K, V>> getEntries() {
      MapBuilderEntries cur = this.entriesView;
      if (cur == null) {
         MapBuilderEntries var2 = new MapBuilderEntries(this);
         this.entriesView = var2;
         return (Set)var2;
      } else {
         return (Set)cur;
      }
   }

   public boolean equals(@Nullable Object other) {
      return other == this || other instanceof Map && this.contentEquals((Map)other);
   }

   public int hashCode() {
      int result = 0;

      for(MapBuilder.EntriesItr it = this.entriesIterator$kotlin_stdlib(); it.hasNext(); result += it.nextHashCode$kotlin_stdlib()) {
      }

      return result;
   }

   @NotNull
   public String toString() {
      StringBuilder sb = new StringBuilder(2 + this.size() * 3);
      sb.append("{");
      int i = 0;

      for(MapBuilder.EntriesItr it = this.entriesIterator$kotlin_stdlib(); it.hasNext(); ++i) {
         if (i > 0) {
            sb.append(", ");
         }

         it.nextAppendString(sb);
      }

      sb.append("}");
      String var10000 = sb.toString();
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   public final int getCapacity$kotlin_stdlib() {
      return this.keysArray.length;
   }

   private final int getHashSize() {
      return this.hashArray.length;
   }

   private final void registerModification() {
      ++this.modCount;
   }

   public final void checkIsMutable$kotlin_stdlib() {
      if (this.isReadOnly) {
         throw new UnsupportedOperationException();
      }
   }

   private final void ensureExtraCapacity(int n) {
      if (this.shouldCompact(n)) {
         this.compact(true);
      } else {
         this.ensureCapacity(this.length + n);
      }

   }

   private final boolean shouldCompact(int extraCapacity) {
      int spareCapacity = this.getCapacity$kotlin_stdlib() - this.length;
      int gaps = this.length - this.size();
      return spareCapacity < extraCapacity && gaps + spareCapacity >= extraCapacity && gaps >= this.getCapacity$kotlin_stdlib() / 4;
   }

   private final void ensureCapacity(int minCapacity) {
      if (minCapacity < 0) {
         throw new OutOfMemoryError();
      } else {
         if (minCapacity > this.getCapacity$kotlin_stdlib()) {
            int newSize = AbstractList.Companion.newCapacity$kotlin_stdlib(this.getCapacity$kotlin_stdlib(), minCapacity);
            this.keysArray = ListBuilderKt.copyOfUninitializedElements(this.keysArray, newSize);
            Object[] var10001 = this.valuesArray;
            this.valuesArray = var10001 != null ? ListBuilderKt.copyOfUninitializedElements(var10001, newSize) : null;
            int[] var4 = Arrays.copyOf(this.presenceArray, newSize);
            Intrinsics.checkNotNullExpressionValue(var4, "copyOf(...)");
            this.presenceArray = var4;
            int newHashSize = Companion.computeHashSize(newSize);
            if (newHashSize > this.getHashSize()) {
               this.rehash(newHashSize);
            }
         }

      }
   }

   private final V[] allocateValuesArray() {
      Object[] curValuesArray = this.valuesArray;
      if (curValuesArray != null) {
         return curValuesArray;
      } else {
         Object[] newValuesArray = ListBuilderKt.arrayOfUninitializedElements(this.getCapacity$kotlin_stdlib());
         this.valuesArray = newValuesArray;
         return newValuesArray;
      }
   }

   private final int hash(K key) {
      return (key != null ? key.hashCode() : 0) * -1640531527 >>> this.hashShift;
   }

   private final void compact(boolean updateHashArray) {
      int i = 0;
      int j = 0;

      Object[] valuesArray;
      for(valuesArray = this.valuesArray; i < this.length; ++i) {
         int hash = this.presenceArray[i];
         if (hash >= 0) {
            this.keysArray[j] = this.keysArray[i];
            if (valuesArray != null) {
               valuesArray[j] = valuesArray[i];
            }

            if (updateHashArray) {
               this.presenceArray[j] = hash;
               this.hashArray[hash] = j + 1;
            }

            ++j;
         }
      }

      ListBuilderKt.resetRange(this.keysArray, j, this.length);
      if (valuesArray != null) {
         ListBuilderKt.resetRange(valuesArray, j, this.length);
      }

      this.length = j;
   }

   private final void rehash(int newHashSize) {
      this.registerModification();
      if (this.length > this.size()) {
         this.compact(false);
      }

      this.hashArray = new int[newHashSize];
      this.hashShift = Companion.computeShift(newHashSize);
      int i = 0;

      do {
         if (i >= this.length) {
            return;
         }
      } while(this.putRehash(i++));

      throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
   }

   private final boolean putRehash(int i) {
      int hash = this.hash(this.keysArray[i]);
      int probesLeft = this.maxProbeDistance;

      while(true) {
         int index = this.hashArray[hash];
         if (index == 0) {
            this.hashArray[hash] = i + 1;
            this.presenceArray[i] = hash;
            return true;
         }

         --probesLeft;
         if (probesLeft < 0) {
            return false;
         }

         if (hash-- == 0) {
            hash = this.getHashSize() - 1;
         }
      }
   }

   private final int findKey(K key) {
      int hash = this.hash(key);
      int probesLeft = this.maxProbeDistance;

      while(true) {
         int index = this.hashArray[hash];
         if (index == 0) {
            return -1;
         }

         if (index > 0 && Intrinsics.areEqual(this.keysArray[index - 1], key)) {
            return index - 1;
         }

         --probesLeft;
         if (probesLeft < 0) {
            return -1;
         }

         if (hash-- == 0) {
            hash = this.getHashSize() - 1;
         }
      }
   }

   private final int findValue(V value) {
      int i = this.length;

      while(true) {
         --i;
         if (i < 0) {
            return -1;
         }

         if (this.presenceArray[i] >= 0) {
            Object[] var10000 = this.valuesArray;
            Intrinsics.checkNotNull(var10000);
            if (Intrinsics.areEqual(var10000[i], value)) {
               return i;
            }
         }
      }
   }

   public final int addKey$kotlin_stdlib(K key) {
      this.checkIsMutable$kotlin_stdlib();

      while(true) {
         while(true) {
            int hash = this.hash(key);
            int tentativeMaxProbeDistance = RangesKt.coerceAtMost(this.maxProbeDistance * 2, this.getHashSize() / 2);
            int probeDistance = 0;

            while(true) {
               int index = this.hashArray[hash];
               if (index <= 0) {
                  if (this.length < this.getCapacity$kotlin_stdlib()) {
                     int var7 = this.length++;
                     int putIndex = var7;
                     this.keysArray[var7] = key;
                     this.presenceArray[var7] = hash;
                     this.hashArray[hash] = var7 + 1;
                     var7 = this.size();
                     this.size = var7 + 1;
                     this.registerModification();
                     if (probeDistance > this.maxProbeDistance) {
                        this.maxProbeDistance = probeDistance;
                     }

                     return putIndex;
                  }

                  this.ensureExtraCapacity(1);
                  break;
               }

               if (Intrinsics.areEqual(this.keysArray[index - 1], key)) {
                  return -index;
               }

               ++probeDistance;
               if (probeDistance > tentativeMaxProbeDistance) {
                  this.rehash(this.getHashSize() * 2);
                  break;
               }

               if (hash-- == 0) {
                  hash = this.getHashSize() - 1;
               }
            }
         }
      }
   }

   public final boolean removeKey$kotlin_stdlib(K key) {
      this.checkIsMutable$kotlin_stdlib();
      int index = this.findKey(key);
      if (index < 0) {
         return false;
      } else {
         this.removeEntryAt(index);
         return true;
      }
   }

   private final void removeEntryAt(int index) {
      ListBuilderKt.resetAt(this.keysArray, index);
      Object[] var10000 = this.valuesArray;
      if (var10000 != null) {
         ListBuilderKt.resetAt(var10000, index);
      }

      this.removeHashAt(this.presenceArray[index]);
      this.presenceArray[index] = -1;
      int var2 = this.size();
      this.size = var2 + -1;
      this.registerModification();
   }

   private final void removeHashAt(int removedHash) {
      int hash = removedHash;
      int hole = removedHash;
      int probeDistance = 0;
      int patchAttemptsLeft = RangesKt.coerceAtMost(this.maxProbeDistance * 2, this.getHashSize() / 2);

      do {
         if (hash-- == 0) {
            hash = this.getHashSize() - 1;
         }

         ++probeDistance;
         if (probeDistance > this.maxProbeDistance) {
            this.hashArray[hole] = 0;
            return;
         }

         int index = this.hashArray[hash];
         if (index == 0) {
            this.hashArray[hole] = 0;
            return;
         }

         if (index < 0) {
            this.hashArray[hole] = -1;
            hole = hash;
            probeDistance = 0;
         } else {
            int otherHash = this.hash(this.keysArray[index - 1]);
            if ((otherHash - hash & this.getHashSize() - 1) >= probeDistance) {
               this.hashArray[hole] = index;
               this.presenceArray[index - 1] = hole;
               hole = hash;
               probeDistance = 0;
            }
         }

         --patchAttemptsLeft;
      } while(patchAttemptsLeft >= 0);

      this.hashArray[hole] = -1;
   }

   public final boolean containsEntry$kotlin_stdlib(@NotNull java.util.Map.Entry<? extends K, ? extends V> entry) {
      Intrinsics.checkNotNullParameter(entry, "entry");
      int index = this.findKey(entry.getKey());
      if (index < 0) {
         return false;
      } else {
         Object[] var10000 = this.valuesArray;
         Intrinsics.checkNotNull(var10000);
         return Intrinsics.areEqual(var10000[index], entry.getValue());
      }
   }

   private final boolean contentEquals(Map<?, ?> other) {
      return this.size() == other.size() && this.containsAllEntries$kotlin_stdlib((Collection)other.entrySet());
   }

   public final boolean containsAllEntries$kotlin_stdlib(@NotNull Collection<?> m) {
      Intrinsics.checkNotNullParameter(m, "m");
      Iterator it = m.iterator();

      while(true) {
         if (it.hasNext()) {
            Object entry = it.next();

            try {
               if (entry != null && this.containsEntry$kotlin_stdlib((java.util.Map.Entry)entry)) {
                  continue;
               }

               return false;
            } catch (ClassCastException var5) {
               return false;
            }
         }

         return true;
      }
   }

   private final boolean putEntry(java.util.Map.Entry<? extends K, ? extends V> entry) {
      int index = this.addKey$kotlin_stdlib(entry.getKey());
      Object[] valuesArray = this.allocateValuesArray();
      if (index >= 0) {
         valuesArray[index] = entry.getValue();
         return true;
      } else {
         Object oldValue = valuesArray[-index - 1];
         if (!Intrinsics.areEqual(entry.getValue(), oldValue)) {
            valuesArray[-index - 1] = entry.getValue();
            return true;
         } else {
            return false;
         }
      }
   }

   private final boolean putAllEntries(Collection<? extends java.util.Map.Entry<? extends K, ? extends V>> from) {
      if (from.isEmpty()) {
         return false;
      } else {
         this.ensureExtraCapacity(from.size());
         Iterator it = from.iterator();
         boolean updated = false;

         while(it.hasNext()) {
            if (this.putEntry((java.util.Map.Entry)it.next())) {
               updated = true;
            }
         }

         return updated;
      }
   }

   public final boolean removeEntry$kotlin_stdlib(@NotNull java.util.Map.Entry<? extends K, ? extends V> entry) {
      Intrinsics.checkNotNullParameter(entry, "entry");
      this.checkIsMutable$kotlin_stdlib();
      int index = this.findKey(entry.getKey());
      if (index < 0) {
         return false;
      } else {
         Object[] var10000 = this.valuesArray;
         Intrinsics.checkNotNull(var10000);
         if (!Intrinsics.areEqual(var10000[index], entry.getValue())) {
            return false;
         } else {
            this.removeEntryAt(index);
            return true;
         }
      }
   }

   public final boolean removeValue$kotlin_stdlib(V element) {
      this.checkIsMutable$kotlin_stdlib();
      int index = this.findValue(element);
      if (index < 0) {
         return false;
      } else {
         this.removeEntryAt(index);
         return true;
      }
   }

   @NotNull
   public final MapBuilder.KeysItr<K, V> keysIterator$kotlin_stdlib() {
      return new MapBuilder.KeysItr(this);
   }

   @NotNull
   public final MapBuilder.ValuesItr<K, V> valuesIterator$kotlin_stdlib() {
      return new MapBuilder.ValuesItr(this);
   }

   @NotNull
   public final MapBuilder.EntriesItr<K, V> entriesIterator$kotlin_stdlib() {
      return new MapBuilder.EntriesItr(this);
   }

   static {
      MapBuilder var0 = new MapBuilder(0);
      int var2 = false;
      var0.isReadOnly = true;
      Empty = var0;
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final MapBuilder getEmpty$kotlin_stdlib() {
         return MapBuilder.Empty;
      }

      private final int computeHashSize(int capacity) {
         return Integer.highestOneBit(RangesKt.coerceAtLeast(capacity, 1) * 3);
      }

      private final int computeShift(int hashSize) {
         return Integer.numberOfLeadingZeros(hashSize) + 1;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }

   public static final class EntriesItr<K, V> extends MapBuilder.Itr<K, V> implements Iterator<java.util.Map.Entry<K, V>>, KMutableIterator {
      public EntriesItr(@NotNull MapBuilder<K, V> map) {
         Intrinsics.checkNotNullParameter(map, "map");
         super(map);
      }

      @NotNull
      public MapBuilder.EntryRef<K, V> next() {
         this.checkForComodification$kotlin_stdlib();
         if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
            throw new NoSuchElementException();
         } else {
            int var1 = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(var1 + 1);
            this.setLastIndex$kotlin_stdlib(var1);
            MapBuilder.EntryRef result = new MapBuilder.EntryRef(this.getMap$kotlin_stdlib(), this.getLastIndex$kotlin_stdlib());
            this.initNext$kotlin_stdlib();
            return result;
         }
      }

      public final int nextHashCode$kotlin_stdlib() {
         if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
            throw new NoSuchElementException();
         } else {
            int result = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(result + 1);
            this.setLastIndex$kotlin_stdlib(result);
            Object var10000 = this.getMap$kotlin_stdlib().keysArray[this.getLastIndex$kotlin_stdlib()];
            int var2 = var10000 != null ? var10000.hashCode() : 0;
            Object[] var10001 = this.getMap$kotlin_stdlib().valuesArray;
            Intrinsics.checkNotNull(var10001);
            Object var3 = var10001[this.getLastIndex$kotlin_stdlib()];
            result = var2 ^ (var3 != null ? var3.hashCode() : 0);
            this.initNext$kotlin_stdlib();
            return result;
         }
      }

      public final void nextAppendString(@NotNull StringBuilder sb) {
         Intrinsics.checkNotNullParameter(sb, "sb");
         if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
            throw new NoSuchElementException();
         } else {
            int var2 = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(var2 + 1);
            this.setLastIndex$kotlin_stdlib(var2);
            Object key = this.getMap$kotlin_stdlib().keysArray[this.getLastIndex$kotlin_stdlib()];
            if (key == this.getMap$kotlin_stdlib()) {
               sb.append("(this Map)");
            } else {
               sb.append(key);
            }

            sb.append('=');
            Object[] var10000 = this.getMap$kotlin_stdlib().valuesArray;
            Intrinsics.checkNotNull(var10000);
            Object value = var10000[this.getLastIndex$kotlin_stdlib()];
            if (value == this.getMap$kotlin_stdlib()) {
               sb.append("(this Map)");
            } else {
               sb.append(value);
            }

            this.initNext$kotlin_stdlib();
         }
      }
   }

   public static final class EntryRef<K, V> implements java.util.Map.Entry<K, V>, KMutableMap.Entry {
      @NotNull
      private final MapBuilder<K, V> map;
      private final int index;
      private final int expectedModCount;

      public EntryRef(@NotNull MapBuilder<K, V> map, int index) {
         Intrinsics.checkNotNullParameter(map, "map");
         super();
         this.map = map;
         this.index = index;
         this.expectedModCount = this.map.modCount;
      }

      public K getKey() {
         this.checkForComodification();
         return this.map.keysArray[this.index];
      }

      public V getValue() {
         this.checkForComodification();
         Object[] var10000 = this.map.valuesArray;
         Intrinsics.checkNotNull(var10000);
         return var10000[this.index];
      }

      public V setValue(V newValue) {
         this.checkForComodification();
         this.map.checkIsMutable$kotlin_stdlib();
         Object[] valuesArray = this.map.allocateValuesArray();
         Object oldValue = valuesArray[this.index];
         valuesArray[this.index] = newValue;
         return oldValue;
      }

      public boolean equals(@Nullable Object other) {
         return other instanceof java.util.Map.Entry && Intrinsics.areEqual(((java.util.Map.Entry)other).getKey(), this.getKey()) && Intrinsics.areEqual(((java.util.Map.Entry)other).getValue(), this.getValue());
      }

      public int hashCode() {
         Object var10000 = this.getKey();
         int var1 = var10000 != null ? var10000.hashCode() : 0;
         Object var10001 = this.getValue();
         return var1 ^ (var10001 != null ? var10001.hashCode() : 0);
      }

      @NotNull
      public String toString() {
         return "" + this.getKey() + '=' + this.getValue();
      }

      private final void checkForComodification() {
         if (this.map.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
         }
      }
   }

   public static class Itr<K, V> {
      @NotNull
      private final MapBuilder<K, V> map;
      private int index;
      private int lastIndex;
      private int expectedModCount;

      public Itr(@NotNull MapBuilder<K, V> map) {
         Intrinsics.checkNotNullParameter(map, "map");
         super();
         this.map = map;
         this.lastIndex = -1;
         this.expectedModCount = this.map.modCount;
         this.initNext$kotlin_stdlib();
      }

      @NotNull
      public final MapBuilder<K, V> getMap$kotlin_stdlib() {
         return this.map;
      }

      public final int getIndex$kotlin_stdlib() {
         return this.index;
      }

      public final void setIndex$kotlin_stdlib(int <set-?>) {
         this.index = var1;
      }

      public final int getLastIndex$kotlin_stdlib() {
         return this.lastIndex;
      }

      public final void setLastIndex$kotlin_stdlib(int <set-?>) {
         this.lastIndex = var1;
      }

      public final void initNext$kotlin_stdlib() {
         while(this.index < this.map.length && this.map.presenceArray[this.index] < 0) {
            int var1 = this.index++;
         }

      }

      public final boolean hasNext() {
         return this.index < this.map.length;
      }

      public final void remove() {
         this.checkForComodification$kotlin_stdlib();
         if (this.lastIndex == -1) {
            int var1 = false;
            String var2 = "Call next() before removing element from the iterator.";
            throw new IllegalStateException(var2.toString());
         } else {
            this.map.checkIsMutable$kotlin_stdlib();
            this.map.removeEntryAt(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = this.map.modCount;
         }
      }

      public final void checkForComodification$kotlin_stdlib() {
         if (this.map.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
         }
      }
   }

   public static final class KeysItr<K, V> extends MapBuilder.Itr<K, V> implements Iterator<K>, KMutableIterator {
      public KeysItr(@NotNull MapBuilder<K, V> map) {
         Intrinsics.checkNotNullParameter(map, "map");
         super(map);
      }

      public K next() {
         this.checkForComodification$kotlin_stdlib();
         if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
            throw new NoSuchElementException();
         } else {
            int var1 = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(var1 + 1);
            this.setLastIndex$kotlin_stdlib(var1);
            Object result = this.getMap$kotlin_stdlib().keysArray[this.getLastIndex$kotlin_stdlib()];
            this.initNext$kotlin_stdlib();
            return result;
         }
      }
   }

   public static final class ValuesItr<K, V> extends MapBuilder.Itr<K, V> implements Iterator<V>, KMutableIterator {
      public ValuesItr(@NotNull MapBuilder<K, V> map) {
         Intrinsics.checkNotNullParameter(map, "map");
         super(map);
      }

      public V next() {
         this.checkForComodification$kotlin_stdlib();
         if (this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().length) {
            throw new NoSuchElementException();
         } else {
            int var1 = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(var1 + 1);
            this.setLastIndex$kotlin_stdlib(var1);
            Object[] var10000 = this.getMap$kotlin_stdlib().valuesArray;
            Intrinsics.checkNotNull(var10000);
            Object result = var10000[this.getLastIndex$kotlin_stdlib()];
            this.initNext$kotlin_stdlib();
            return result;
         }
      }
   }
}
