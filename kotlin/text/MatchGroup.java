package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MatchGroup {
   @NotNull
   private final String value;
   @NotNull
   private final IntRange range;

   public MatchGroup(@NotNull String value, @NotNull IntRange range) {
      Intrinsics.checkNotNullParameter(value, "value");
      Intrinsics.checkNotNullParameter(range, "range");
      super();
      this.value = value;
      this.range = range;
   }

   @NotNull
   public final String getValue() {
      return this.value;
   }

   @NotNull
   public final IntRange getRange() {
      return this.range;
   }

   @NotNull
   public final String component1() {
      return this.value;
   }

   @NotNull
   public final IntRange component2() {
      return this.range;
   }

   @NotNull
   public final MatchGroup copy(@NotNull String value, @NotNull IntRange range) {
      Intrinsics.checkNotNullParameter(value, "value");
      Intrinsics.checkNotNullParameter(range, "range");
      return new MatchGroup(value, range);
   }

   // $FF: synthetic method
   public static MatchGroup copy$default(MatchGroup var0, String var1, IntRange var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = var0.value;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.range;
      }

      return var0.copy(var1, var2);
   }

   @NotNull
   public String toString() {
      return "MatchGroup(value=" + this.value + ", range=" + this.range + ')';
   }

   public int hashCode() {
      int result = this.value.hashCode();
      result = result * 31 + this.range.hashCode();
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof MatchGroup)) {
         return false;
      } else {
         MatchGroup var2 = (MatchGroup)other;
         if (!Intrinsics.areEqual((Object)this.value, (Object)var2.value)) {
            return false;
         } else {
            return Intrinsics.areEqual((Object)this.range, (Object)var2.range);
         }
      }
   }
}
