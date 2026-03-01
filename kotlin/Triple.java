package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Triple<A, B, C> implements Serializable {
   private final A first;
   private final B second;
   private final C third;

   public Triple(A first, B second, C third) {
      this.first = first;
      this.second = second;
      this.third = third;
   }

   public final A getFirst() {
      return this.first;
   }

   public final B getSecond() {
      return this.second;
   }

   public final C getThird() {
      return this.third;
   }

   @NotNull
   public String toString() {
      return "" + '(' + this.first + ", " + this.second + ", " + this.third + ')';
   }

   public final A component1() {
      return this.first;
   }

   public final B component2() {
      return this.second;
   }

   public final C component3() {
      return this.third;
   }

   @NotNull
   public final Triple<A, B, C> copy(A first, B second, C third) {
      return new Triple(first, second, third);
   }

   // $FF: synthetic method
   public static Triple copy$default(Triple var0, Object var1, Object var2, Object var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = var0.first;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.second;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.third;
      }

      return var0.copy(var1, var2, var3);
   }

   public int hashCode() {
      int result = this.first == null ? 0 : this.first.hashCode();
      result = result * 31 + (this.second == null ? 0 : this.second.hashCode());
      result = result * 31 + (this.third == null ? 0 : this.third.hashCode());
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof Triple)) {
         return false;
      } else {
         Triple var2 = (Triple)other;
         if (!Intrinsics.areEqual(this.first, var2.first)) {
            return false;
         } else if (!Intrinsics.areEqual(this.second, var2.second)) {
            return false;
         } else {
            return Intrinsics.areEqual(this.third, var2.third);
         }
      }
   }
}
