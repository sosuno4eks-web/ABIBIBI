package kotlin.time;

import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class InstantJvmKt {
   @NotNull
   private static final Clock systemClock;

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalTime
   private static void getSystemClock$annotations() {
   }

   @ExperimentalTime
   @NotNull
   public static final Instant systemClockNow() {
      return systemClock.now();
   }

   @ExperimentalTime
   @NotNull
   public static final Object serializedInstant(@NotNull Instant instant) {
      Intrinsics.checkNotNullParameter(instant, "instant");
      return new InstantSerialized(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
   }

   static {
      systemClock = PlatformImplementationsKt.IMPLEMENTATIONS.getSystemClock();
   }
}
