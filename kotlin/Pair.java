package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Pair<A, B> implements Serializable {
   private final A first;
   private final B second;

   public Pair(A first, B second) {
      this.first = first;
      this.second = second;
   }

   public final A getFirst() {
      return this.first;
   }

   public final B getSecond() {
      return this.second;
   }

   @NotNull
   public String toString() {
      return "" + '(' + this.first + ", " + this.second + ')';
   }

   public final A component1() {
      return this.first;
   }

   public final B component2() {
      return this.second;
   }

   @NotNull
   public final Pair<A, B> copy(A first, B second) {
      return new Pair(first, second);
   }

   // $FF: synthetic method
   public static Pair copy$default(Pair var0, Object var1, Object var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = var0.first;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.second;
      }

      return var0.copy(var1, var2);
   }

   public int hashCode() {
      int result = this.first == null ? 0 : this.first.hashCode();
      result = result * 31 + (this.second == null ? 0 : this.second.hashCode());
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof Pair)) {
         return false;
      } else {
         Pair var2 = (Pair)other;
         if (!Intrinsics.areEqual(this.first, var2.first)) {
            return false;
         } else {
            return Intrinsics.areEqual(this.second, var2.second);
         }
      }
   }
}
