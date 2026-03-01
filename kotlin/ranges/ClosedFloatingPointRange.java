package kotlin.ranges;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.1"
)
public interface ClosedFloatingPointRange<T extends Comparable<? super T>> extends ClosedRange<T> {
   boolean contains(@NotNull T var1);

   boolean isEmpty();

   boolean lessThanOrEquals(@NotNull T var1, @NotNull T var2);

   public static final class DefaultImpls {
      public static <T extends Comparable<? super T>> boolean contains(@NotNull ClosedFloatingPointRange<T> $this, @NotNull T value) {
         Intrinsics.checkNotNullParameter(value, "value");
         return $this.lessThanOrEquals($this.getStart(), value) && $this.lessThanOrEquals(value, $this.getEndInclusive());
      }

      public static <T extends Comparable<? super T>> boolean isEmpty(@NotNull ClosedFloatingPointRange<T> $this) {
         return !$this.lessThanOrEquals($this.getStart(), $this.getEndInclusive());
      }
   }
}
