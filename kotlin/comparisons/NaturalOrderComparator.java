package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class NaturalOrderComparator implements Comparator<Comparable<? super Object>> {
   @NotNull
   public static final NaturalOrderComparator INSTANCE = new NaturalOrderComparator();

   private NaturalOrderComparator() {
   }

   public int compare(@NotNull Comparable<Object> a, @NotNull Comparable<Object> b) {
      Intrinsics.checkNotNullParameter(a, "a");
      Intrinsics.checkNotNullParameter(b, "b");
      return a.compareTo(b);
   }

   @NotNull
   public final Comparator<Comparable<Object>> reversed() {
      return (Comparator)ReverseOrderComparator.INSTANCE;
   }
}
