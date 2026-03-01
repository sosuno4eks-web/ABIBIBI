package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class ComparableOpenEndRange<T extends Comparable<? super T>> implements OpenEndRange<T> {
   @NotNull
   private final T start;
   @NotNull
   private final T endExclusive;

   public ComparableOpenEndRange(@NotNull T start, @NotNull T endExclusive) {
      Intrinsics.checkNotNullParameter(start, "start");
      Intrinsics.checkNotNullParameter(endExclusive, "endExclusive");
      super();
      this.start = start;
      this.endExclusive = endExclusive;
   }

   @NotNull
   public T getStart() {
      return this.start;
   }

   @NotNull
   public T getEndExclusive() {
      return this.endExclusive;
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof ComparableOpenEndRange && (this.isEmpty() && ((ComparableOpenEndRange)other).isEmpty() || Intrinsics.areEqual((Object)this.getStart(), (Object)((ComparableOpenEndRange)other).getStart()) && Intrinsics.areEqual((Object)this.getEndExclusive(), (Object)((ComparableOpenEndRange)other).getEndExclusive()));
   }

   public int hashCode() {
      return this.isEmpty() ? -1 : 31 * this.getStart().hashCode() + this.getEndExclusive().hashCode();
   }

   @NotNull
   public String toString() {
      return this.getStart() + "..<" + this.getEndExclusive();
   }

   public boolean contains(@NotNull T value) {
      return OpenEndRange.DefaultImpls.contains(this, value);
   }

   public boolean isEmpty() {
      return OpenEndRange.DefaultImpls.isEmpty(this);
   }
}
