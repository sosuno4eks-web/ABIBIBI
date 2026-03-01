package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class ComparableRange<T extends Comparable<? super T>> implements ClosedRange<T> {
   @NotNull
   private final T start;
   @NotNull
   private final T endInclusive;

   public ComparableRange(@NotNull T start, @NotNull T endInclusive) {
      Intrinsics.checkNotNullParameter(start, "start");
      Intrinsics.checkNotNullParameter(endInclusive, "endInclusive");
      super();
      this.start = start;
      this.endInclusive = endInclusive;
   }

   @NotNull
   public T getStart() {
      return this.start;
   }

   @NotNull
   public T getEndInclusive() {
      return this.endInclusive;
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof ComparableRange && (this.isEmpty() && ((ComparableRange)other).isEmpty() || Intrinsics.areEqual((Object)this.getStart(), (Object)((ComparableRange)other).getStart()) && Intrinsics.areEqual((Object)this.getEndInclusive(), (Object)((ComparableRange)other).getEndInclusive()));
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : 31 * this.getStart().hashCode() + this.getEndInclusive().hashCode();
   }

   @NotNull
   public String toString() {
      return this.getStart() + ".." + this.getEndInclusive();
   }

   public boolean contains(@NotNull T value) {
      return ClosedRange.DefaultImpls.contains(this, value);
   }

   public boolean isEmpty() {
      return ClosedRange.DefaultImpls.isEmpty(this);
   }
}
