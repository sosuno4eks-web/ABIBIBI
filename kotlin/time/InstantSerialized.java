package kotlin.time;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalTime
final class InstantSerialized implements Externalizable {
   @NotNull
   public static final InstantSerialized.Companion Companion = new InstantSerialized.Companion((DefaultConstructorMarker)null);
   private long epochSeconds;
   private int nanosecondsOfSecond;
   private static final long serialVersionUID = 0L;

   public InstantSerialized(long epochSeconds, int nanosecondsOfSecond) {
      this.epochSeconds = epochSeconds;
      this.nanosecondsOfSecond = nanosecondsOfSecond;
   }

   public final long getEpochSeconds() {
      return this.epochSeconds;
   }

   public final void setEpochSeconds(long <set-?>) {
      this.epochSeconds = var1;
   }

   public final int getNanosecondsOfSecond() {
      return this.nanosecondsOfSecond;
   }

   public final void setNanosecondsOfSecond(int <set-?>) {
      this.nanosecondsOfSecond = var1;
   }

   public InstantSerialized() {
      this(0L, 0);
   }

   public void writeExternal(@NotNull ObjectOutput output) {
      Intrinsics.checkNotNullParameter(output, "output");
      output.writeLong(this.epochSeconds);
      output.writeInt(this.nanosecondsOfSecond);
   }

   public void readExternal(@NotNull ObjectInput input) {
      Intrinsics.checkNotNullParameter(input, "input");
      this.epochSeconds = input.readLong();
      this.nanosecondsOfSecond = input.readInt();
   }

   private final Object readResolve() {
      return Instant.Companion.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
   }

   public static final class Companion {
      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
