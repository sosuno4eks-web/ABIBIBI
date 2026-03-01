package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ClocksKt {
   @SinceKotlin(
      version = "2.2"
   )
   @ExperimentalTime
   @JvmName(
      name = "fromTimeSource"
   )
   @NotNull
   public static final Clock fromTimeSource(@NotNull TimeSource $this$asClock, @NotNull Instant origin) {
      Intrinsics.checkNotNullParameter($this$asClock, "<this>");
      Intrinsics.checkNotNullParameter(origin, "origin");
      return (Clock)(new Clock($this$asClock) {
         private final TimeMark startMark;

         {
            this.startMark = $receiver.markNow();
         }

         public Instant now() {
            return origin.plus-LRDsOJo(this.startMark.elapsedNow-UwyO8pc());
         }
      });
   }
}
