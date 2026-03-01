package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

public final class CompareToKt {
   @InlineOnly
   @SinceKotlin(
      version = "1.6"
   )
   private static final <T> int compareTo(Comparable<? super T> $this$compareTo, T other) {
      Intrinsics.checkNotNullParameter($this$compareTo, "<this>");
      return $this$compareTo.compareTo(other);
   }
}
