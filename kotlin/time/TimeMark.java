package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.9"
)
@WasExperimental(
   markerClass = {ExperimentalTime.class}
)
public interface TimeMark {
   long elapsedNow_UwyO8pc/* $FF was: elapsedNow-UwyO8pc*/();

   @NotNull
   TimeMark plus_LRDsOJo/* $FF was: plus-LRDsOJo*/(long var1);

   @NotNull
   TimeMark minus_LRDsOJo/* $FF was: minus-LRDsOJo*/(long var1);

   boolean hasPassedNow();

   boolean hasNotPassedNow();

   public static final class DefaultImpls {
      @NotNull
      public static TimeMark plus_LRDsOJo/* $FF was: plus-LRDsOJo*/(@NotNull TimeMark $this, long duration) {
         return (TimeMark)(new AdjustedTimeMark($this, duration, (DefaultConstructorMarker)null));
      }

      @NotNull
      public static TimeMark minus_LRDsOJo/* $FF was: minus-LRDsOJo*/(@NotNull TimeMark $this, long duration) {
         return $this.plus-LRDsOJo(Duration.unaryMinus-UwyO8pc(duration));
      }

      public static boolean hasPassedNow(@NotNull TimeMark $this) {
         return !Duration.isNegative-impl($this.elapsedNow-UwyO8pc());
      }

      public static boolean hasNotPassedNow(@NotNull TimeMark $this) {
         return Duration.isNegative-impl($this.elapsedNow-UwyO8pc());
      }
   }
}
