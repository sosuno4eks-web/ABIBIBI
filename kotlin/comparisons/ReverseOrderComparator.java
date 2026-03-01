package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class ReverseOrderComparator implements Comparator<Comparable<? super Object>> {
   @NotNull
   public static final ReverseOrderComparator INSTANCE = new ReverseOrderComparator();

   private ReverseOrderComparator() {
   }

   public int compare(@NotNull Comparable<Object> a, @NotNull Comparable<Object> b) {
      Intrinsics.checkNotNullParameter(a, "a");
      Intrinsics.checkNotNullParameter(b, "b");
      return b.compareTo(a);
   }

   @NotNull
   public final Comparator<Comparable<Object>> reversed() {
      return (Comparator)NaturalOrderComparator.INSTANCE;
   }
}
