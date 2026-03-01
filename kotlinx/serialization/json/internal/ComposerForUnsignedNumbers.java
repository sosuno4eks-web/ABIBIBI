package kotlinx.serialization.json.internal;

import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressAnimalSniffer
public final class ComposerForUnsignedNumbers extends Composer {
   private final boolean forceQuoting;

   public ComposerForUnsignedNumbers(@NotNull InternalJsonWriter writer, boolean forceQuoting) {
      Intrinsics.checkNotNullParameter(writer, "writer");
      super(writer);
      this.forceQuoting = forceQuoting;
   }

   public void print(int v) {
      if (this.forceQuoting) {
         this.printQuoted(Integer.toUnsignedString(UInt.constructor-impl(v)));
      } else {
         this.print(Integer.toUnsignedString(UInt.constructor-impl(v)));
      }

   }

   public void print(long v) {
      if (this.forceQuoting) {
         this.printQuoted(Long.toUnsignedString(ULong.constructor-impl(v)));
      } else {
         this.print(Long.toUnsignedString(ULong.constructor-impl(v)));
      }

   }

   public void print(byte v) {
      if (this.forceQuoting) {
         this.printQuoted(UByte.toString-impl(UByte.constructor-impl(v)));
      } else {
         this.print(UByte.toString-impl(UByte.constructor-impl(v)));
      }

   }

   public void print(short v) {
      if (this.forceQuoting) {
         this.printQuoted(UShort.toString-impl(UShort.constructor-impl(v)));
      } else {
         this.print(UShort.toString-impl(UShort.constructor-impl(v)));
      }

   }
}
