package kotlin.time;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "2.1"
)
@ExperimentalTime
public interface Clock {
   @NotNull
   Clock.Companion Companion = Clock.Companion.$$INSTANCE;

   @NotNull
   Instant now();

   public static final class Companion {
      // $FF: synthetic field
      static final Clock.Companion $$INSTANCE = new Clock.Companion();

      private Companion() {
      }
   }

   public static final class System implements Clock {
      @NotNull
      public static final Clock.System INSTANCE = new Clock.System();

      private System() {
      }

      @NotNull
      public Instant now() {
         return InstantJvmKt.systemClockNow();
      }
   }
}
