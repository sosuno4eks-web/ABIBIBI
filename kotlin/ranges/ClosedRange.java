package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public interface ClosedRange<T extends Comparable<? super T>> {
   @NotNull
   T getStart();

   @NotNull
   T getEndInclusive();

   boolean contains(@NotNull T var1);

   boolean isEmpty();

   public static final class DefaultImpls {
      public static <T extends Comparable<? super T>> boolean contains(@NotNull ClosedRange<T> $this, @NotNull T value) {
         Intrinsics.checkNotNullParameter(value, "value");
         return value.compareTo($this.getStart()) >= 0 && value.compareTo($this.getEndInclusive()) <= 0;
      }

      public static <T extends Comparable<? super T>> boolean isEmpty(@NotNull ClosedRange<T> $this) {
         return $this.getStart().compareTo($this.getEndInclusive()) > 0;
      }
   }
}
