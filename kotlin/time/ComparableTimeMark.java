package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.9"
)
@WasExperimental(
   markerClass = {ExperimentalTime.class}
)
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {
   @NotNull
   ComparableTimeMark plus_LRDsOJo/* $FF was: plus-LRDsOJo*/(long var1);

   @NotNull
   ComparableTimeMark minus_LRDsOJo/* $FF was: minus-LRDsOJo*/(long var1);

   long minus_UwyO8pc/* $FF was: minus-UwyO8pc*/(@NotNull ComparableTimeMark var1);

   int compareTo(@NotNull ComparableTimeMark var1);

   boolean equals(@Nullable Object var1);

   int hashCode();

   public static final class DefaultImpls {
      @NotNull
      public static ComparableTimeMark minus_LRDsOJo/* $FF was: minus-LRDsOJo*/(@NotNull ComparableTimeMark $this, long duration) {
         return $this.plus-LRDsOJo(Duration.unaryMinus-UwyO8pc(duration));
      }

      public static int compareTo(@NotNull ComparableTimeMark $this, @NotNull ComparableTimeMark other) {
         Intrinsics.checkNotNullParameter(other, "other");
         return Duration.compareTo-LRDsOJo($this.minus-UwyO8pc(other), Duration.Companion.getZERO-UwyO8pc());
      }

      public static boolean hasPassedNow(@NotNull ComparableTimeMark $this) {
         return TimeMark.DefaultImpls.hasPassedNow((TimeMark)$this);
      }

      public static boolean hasNotPassedNow(@NotNull ComparableTimeMark $this) {
         return TimeMark.DefaultImpls.hasNotPassedNow((TimeMark)$this);
      }
   }
}
