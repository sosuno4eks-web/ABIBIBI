package kotlin.uuid;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.ULong;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "2.0"
)
@ExperimentalUuidApi
public final class Uuid implements Comparable<Uuid>, Serializable {
   @NotNull
   public static final Uuid.Companion Companion = new Uuid.Companion((DefaultConstructorMarker)null);
   private final long mostSignificantBits;
   private final long leastSignificantBits;
   @NotNull
   private static final Uuid NIL = new Uuid(0L, 0L);
   public static final int SIZE_BYTES = 16;
   public static final int SIZE_BITS = 128;

   private Uuid(long mostSignificantBits, long leastSignificantBits) {
      this.mostSignificantBits = mostSignificantBits;
      this.leastSignificantBits = leastSignificantBits;
   }

   public final long getMostSignificantBits() {
      return this.mostSignificantBits;
   }

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getMostSignificantBits$annotations() {
   }

   public final long getLeastSignificantBits() {
      return this.leastSignificantBits;
   }

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getLeastSignificantBits$annotations() {
   }

   @InlineOnly
   private final <T> T toLongs(Function2<? super Long, ? super Long, ? extends T> action) {
      Intrinsics.checkNotNullParameter(action, "action");
      return action.invoke(this.getMostSignificantBits(), this.getLeastSignificantBits());
   }

   @InlineOnly
   private final <T> T toULongs(Function2<? super ULong, ? super ULong, ? extends T> action) {
      Intrinsics.checkNotNullParameter(action, "action");
      return action.invoke(ULong.box-impl(ULong.constructor-impl(this.getMostSignificantBits())), ULong.box-impl(ULong.constructor-impl(this.getLeastSignificantBits())));
   }

   @NotNull
   public String toString() {
      return this.toHexDashString();
   }

   @SinceKotlin(
      version = "2.1"
   )
   @NotNull
   public final String toHexDashString() {
      byte[] bytes = new byte[36];
      UuidKt.formatBytesInto(this.mostSignificantBits, bytes, 0, 0, 4);
      bytes[8] = 45;
      UuidKt.formatBytesInto(this.mostSignificantBits, bytes, 9, 4, 6);
      bytes[13] = 45;
      UuidKt.formatBytesInto(this.mostSignificantBits, bytes, 14, 6, 8);
      bytes[18] = 45;
      UuidKt.formatBytesInto(this.leastSignificantBits, bytes, 19, 0, 2);
      bytes[23] = 45;
      UuidKt.formatBytesInto(this.leastSignificantBits, bytes, 24, 2, 8);
      return StringsKt.decodeToString(bytes);
   }

   @NotNull
   public final String toHexString() {
      byte[] bytes = new byte[32];
      UuidKt.formatBytesInto(this.mostSignificantBits, bytes, 0, 0, 8);
      UuidKt.formatBytesInto(this.leastSignificantBits, bytes, 16, 0, 8);
      return StringsKt.decodeToString(bytes);
   }

   @NotNull
   public final byte[] toByteArray() {
      byte[] bytes = new byte[16];
      UuidKt.setLongAt(bytes, 0, this.mostSignificantBits);
      UuidKt.setLongAt(bytes, 8, this.leastSignificantBits);
      return bytes;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalUnsignedTypes
   @NotNull
   public final byte[] toUByteArray_TcUX1vc/* $FF was: toUByteArray-TcUX1vc*/() {
      return UByteArray.constructor-impl(this.toByteArray());
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof Uuid)) {
         return false;
      } else {
         return this.mostSignificantBits == ((Uuid)other).mostSignificantBits && this.leastSignificantBits == ((Uuid)other).leastSignificantBits;
      }
   }

   @SinceKotlin(
      version = "2.1"
   )
   public int compareTo(@NotNull Uuid other) {
      Intrinsics.checkNotNullParameter(other, "other");
      return this.mostSignificantBits != other.mostSignificantBits ? Long.compareUnsigned(ULong.constructor-impl(this.mostSignificantBits), ULong.constructor-impl(other.mostSignificantBits)) : Long.compareUnsigned(ULong.constructor-impl(this.leastSignificantBits), ULong.constructor-impl(other.leastSignificantBits));
   }

   public int hashCode() {
      return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
   }

   private final Object writeReplace() {
      return UuidKt.serializedUuid(this);
   }

   private final void readObject(ObjectInputStream input) {
      throw new InvalidObjectException("Deserialization is supported via proxy only");
   }

   // $FF: synthetic method
   public Uuid(long mostSignificantBits, long leastSignificantBits, DefaultConstructorMarker $constructor_marker) {
      this(mostSignificantBits, leastSignificantBits);
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final Uuid getNIL() {
         return Uuid.NIL;
      }

      @NotNull
      public final Uuid fromLongs(long mostSignificantBits, long leastSignificantBits) {
         return mostSignificantBits == 0L && leastSignificantBits == 0L ? this.getNIL() : new Uuid(mostSignificantBits, leastSignificantBits, (DefaultConstructorMarker)null);
      }

      @NotNull
      public final Uuid fromULongs_eb3DHEI/* $FF was: fromULongs-eb3DHEI*/(long mostSignificantBits, long leastSignificantBits) {
         return this.fromLongs(mostSignificantBits, leastSignificantBits);
      }

      @NotNull
      public final Uuid fromByteArray(@NotNull byte[] byteArray) {
         Intrinsics.checkNotNullParameter(byteArray, "byteArray");
         if (byteArray.length != 16) {
            int var2 = false;
            String var3 = "Expected exactly 16 bytes, but was " + UuidKt__UuidKt.access$truncateForErrorMessage((byte[])byteArray, 32) + " of size " + byteArray.length;
            throw new IllegalArgumentException(var3.toString());
         } else {
            return this.fromLongs(UuidKt.getLongAt(byteArray, 0), UuidKt.getLongAt(byteArray, 8));
         }
      }

      @SinceKotlin(
         version = "2.1"
      )
      @ExperimentalUnsignedTypes
      @NotNull
      public final Uuid fromUByteArray_GBYM_sE/* $FF was: fromUByteArray-GBYM_sE*/(@NotNull byte[] ubyteArray) {
         Intrinsics.checkNotNullParameter(ubyteArray, "ubyteArray");
         return this.fromByteArray(ubyteArray);
      }

      @NotNull
      public final Uuid parse(@NotNull String uuidString) {
         Intrinsics.checkNotNullParameter(uuidString, "uuidString");
         Uuid var10000;
         switch(uuidString.length()) {
         case 32:
            var10000 = UuidKt.uuidParseHex(uuidString);
            break;
         case 36:
            var10000 = UuidKt.uuidParseHexDash(uuidString);
            break;
         default:
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + UuidKt__UuidKt.access$truncateForErrorMessage((String)uuidString, 64) + "\" of length " + uuidString.length());
         }

         return var10000;
      }

      @SinceKotlin(
         version = "2.1"
      )
      @NotNull
      public final Uuid parseHexDash(@NotNull String hexDashString) {
         Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
         if (hexDashString.length() != 36) {
            int var2 = false;
            String var3 = "Expected a 36-char string in the standard hex-and-dash UUID format, but was \"" + UuidKt__UuidKt.access$truncateForErrorMessage((String)hexDashString, 64) + "\" of length " + hexDashString.length();
            throw new IllegalArgumentException(var3.toString());
         } else {
            return UuidKt.uuidParseHexDash(hexDashString);
         }
      }

      @NotNull
      public final Uuid parseHex(@NotNull String hexString) {
         Intrinsics.checkNotNullParameter(hexString, "hexString");
         if (hexString.length() != 32) {
            int var2 = false;
            String var3 = "Expected a 32-char hexadecimal string, but was \"" + UuidKt__UuidKt.access$truncateForErrorMessage((String)hexString, 64) + "\" of length " + hexString.length();
            throw new IllegalArgumentException(var3.toString());
         } else {
            return UuidKt.uuidParseHex(hexString);
         }
      }

      @NotNull
      public final Uuid random() {
         return UuidKt.secureRandomUuid();
      }

      /** @deprecated */
      @NotNull
      public final Comparator<Uuid> getLEXICAL_ORDER() {
         return ComparisonsKt.naturalOrder();
      }

      /** @deprecated */
      // $FF: synthetic method
      @Deprecated(
         message = "Use naturalOrder<Uuid>() instead",
         replaceWith = @ReplaceWith(
   expression = "naturalOrder<Uuid>()",
   imports = {"kotlin.comparisons.naturalOrder"}
)
      )
      @DeprecatedSinceKotlin(
         warningSince = "2.1"
      )
      public static void getLEXICAL_ORDER$annotations() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
