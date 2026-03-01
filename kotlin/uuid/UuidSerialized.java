package kotlin.uuid;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalUuidApi
final class UuidSerialized implements Externalizable {
   @NotNull
   public static final UuidSerialized.Companion Companion = new UuidSerialized.Companion((DefaultConstructorMarker)null);
   private long mostSignificantBits;
   private long leastSignificantBits;
   private static final long serialVersionUID = 0L;

   public UuidSerialized(long mostSignificantBits, long leastSignificantBits) {
      this.mostSignificantBits = mostSignificantBits;
      this.leastSignificantBits = leastSignificantBits;
   }

   public final long getMostSignificantBits() {
      return this.mostSignificantBits;
   }

   public final void setMostSignificantBits(long <set-?>) {
      this.mostSignificantBits = var1;
   }

   public final long getLeastSignificantBits() {
      return this.leastSignificantBits;
   }

   public final void setLeastSignificantBits(long <set-?>) {
      this.leastSignificantBits = var1;
   }

   public UuidSerialized() {
      this(0L, 0L);
   }

   public void writeExternal(@NotNull ObjectOutput output) {
      Intrinsics.checkNotNullParameter(output, "output");
      output.writeLong(this.mostSignificantBits);
      output.writeLong(this.leastSignificantBits);
   }

   public void readExternal(@NotNull ObjectInput input) {
      Intrinsics.checkNotNullParameter(input, "input");
      this.mostSignificantBits = input.readLong();
      this.leastSignificantBits = input.readLong();
   }

   private final Object readResolve() {
      return Uuid.Companion.fromLongs(this.mostSignificantBits, this.leastSignificantBits);
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
