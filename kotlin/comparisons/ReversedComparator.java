package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class ReversedComparator<T> implements Comparator<T> {
   @NotNull
   private final Comparator<T> comparator;

   public ReversedComparator(@NotNull Comparator<T> comparator) {
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      super();
      this.comparator = comparator;
   }

   @NotNull
   public final Comparator<T> getComparator() {
      return this.comparator;
   }

   public int compare(T a, T b) {
      return this.comparator.compare(b, a);
   }

   @NotNull
   public final Comparator<T> reversed() {
      return this.comparator;
   }
}
