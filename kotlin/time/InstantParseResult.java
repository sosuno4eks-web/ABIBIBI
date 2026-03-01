package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalTime
interface InstantParseResult {
   @NotNull
   Instant toInstant();

   @Nullable
   Instant toInstantOrNull();

   public static final class Failure implements InstantParseResult {
      @NotNull
      private final String error;
      @NotNull
      private final CharSequence input;

      public Failure(@NotNull String error, @NotNull CharSequence input) {
         Intrinsics.checkNotNullParameter(error, "error");
         Intrinsics.checkNotNullParameter(input, "input");
         super();
         this.error = error;
         this.input = input;
      }

      @NotNull
      public final String getError() {
         return this.error;
      }

      @NotNull
      public final CharSequence getInput() {
         return this.input;
      }

      @NotNull
      public Instant toInstant() {
         throw new InstantFormatException(this.error + " when parsing an Instant from \"" + InstantKt.access$truncateForErrorMessage(this.input, 64) + '"');
      }

      @Nullable
      public Instant toInstantOrNull() {
         return null;
      }
   }

   public static final class Success implements InstantParseResult {
      private final long epochSeconds;
      private final int nanosecondsOfSecond;

      public Success(long epochSeconds, int nanosecondsOfSecond) {
         this.epochSeconds = epochSeconds;
         this.nanosecondsOfSecond = nanosecondsOfSecond;
      }

      public final long getEpochSeconds() {
         return this.epochSeconds;
      }

      public final int getNanosecondsOfSecond() {
         return this.nanosecondsOfSecond;
      }

      @NotNull
      public Instant toInstant() {
         if (this.epochSeconds >= Instant.Companion.getMIN$kotlin_stdlib().getEpochSeconds() && this.epochSeconds <= Instant.Companion.getMAX$kotlin_stdlib().getEpochSeconds()) {
            return Instant.Companion.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
         } else {
            throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + this.epochSeconds + ')');
         }
      }

      @Nullable
      public Instant toInstantOrNull() {
         return this.epochSeconds >= Instant.Companion.getMIN$kotlin_stdlib().getEpochSeconds() && this.epochSeconds <= Instant.Companion.getMAX$kotlin_stdlib().getEpochSeconds() ? Instant.Companion.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond) : null;
      }
   }
}
