package kotlin.collections;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IndexedValue<T> {
   private final int index;
   private final T value;

   public IndexedValue(int index, T value) {
      this.index = index;
      this.value = value;
   }

   public final int getIndex() {
      return this.index;
   }

   public final T getValue() {
      return this.value;
   }

   public final int component1() {
      return this.index;
   }

   public final T component2() {
      return this.value;
   }

   @NotNull
   public final IndexedValue<T> copy(int index, T value) {
      return new IndexedValue(index, value);
   }

   // $FF: synthetic method
   public static IndexedValue copy$default(IndexedValue var0, int var1, Object var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = var0.index;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.value;
      }

      return var0.copy(var1, var2);
   }

   @NotNull
   public String toString() {
      return "IndexedValue(index=" + this.index + ", value=" + this.value + ')';
   }

   public int hashCode() {
      int result = Integer.hashCode(this.index);
      result = result * 31 + (this.value == null ? 0 : this.value.hashCode());
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof IndexedValue)) {
         return false;
      } else {
         IndexedValue var2 = (IndexedValue)other;
         if (this.index != var2.index) {
            return false;
         } else {
            return Intrinsics.areEqual(this.value, var2.value);
         }
      }
   }
}
