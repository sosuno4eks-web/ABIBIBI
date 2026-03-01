package kotlin.uuid;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class UuidKt__UuidJVMKt {
   @ExperimentalUuidApi
   @NotNull
   public static final Uuid secureRandomUuid() {
      byte[] randomBytes = new byte[16];
      SecureRandomHolder.INSTANCE.getInstance().nextBytes(randomBytes);
      return UuidKt.uuidFromRandomBytes(randomBytes);
   }

   @ExperimentalUuidApi
   @NotNull
   public static final Object serializedUuid(@NotNull Uuid uuid) {
      Intrinsics.checkNotNullParameter(uuid, "uuid");
      return new UuidSerialized(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
   }

   @ExperimentalUuidApi
   public static final long getLongAt(@NotNull byte[] $this$getLongAt, int index) {
      Intrinsics.checkNotNullParameter($this$getLongAt, "<this>");
      return UuidKt.getLongAtCommonImpl($this$getLongAt, index);
   }

   @ExperimentalUuidApi
   public static final void formatBytesInto(long $this$formatBytesInto, @NotNull byte[] dst, int dstOffset, int startIndex, int endIndex) {
      Intrinsics.checkNotNullParameter(dst, "dst");
      UuidKt.formatBytesIntoCommonImpl($this$formatBytesInto, dst, dstOffset, startIndex, endIndex);
   }

   @ExperimentalUuidApi
   public static final void setLongAt(@NotNull byte[] $this$setLongAt, int index, long value) {
      Intrinsics.checkNotNullParameter($this$setLongAt, "<this>");
      UuidKt.setLongAtCommonImpl($this$setLongAt, index, value);
   }

   @ExperimentalUuidApi
   @NotNull
   public static final Uuid uuidParseHexDash(@NotNull String hexDashString) {
      Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
      return UuidKt.uuidParseHexDashCommonImpl(hexDashString);
   }

   @ExperimentalUuidApi
   @NotNull
   public static final Uuid uuidParseHex(@NotNull String hexString) {
      Intrinsics.checkNotNullParameter(hexString, "hexString");
      return UuidKt.uuidParseHexCommonImpl(hexString);
   }

   @SinceKotlin(
      version = "2.0"
   )
   @ExperimentalUuidApi
   @NotNull
   public static final Uuid toKotlinUuid(@NotNull UUID $this$toKotlinUuid) {
      Intrinsics.checkNotNullParameter($this$toKotlinUuid, "<this>");
      int $i$f$toKotlinUuid = false;
      return Uuid.Companion.fromLongs($this$toKotlinUuid.getMostSignificantBits(), $this$toKotlinUuid.getLeastSignificantBits());
   }

   @SinceKotlin(
      version = "2.0"
   )
   @ExperimentalUuidApi
   @NotNull
   public static final UUID toJavaUuid(@NotNull Uuid $this$toJavaUuid) {
      Intrinsics.checkNotNullParameter($this$toJavaUuid, "<this>");
      int $i$f$toJavaUuid = false;
      long var10000 = $this$toJavaUuid.getMostSignificantBits();
      long leastSignificantBits = $this$toJavaUuid.getLeastSignificantBits();
      long mostSignificantBits = var10000;
      int var7 = false;
      return new UUID(mostSignificantBits, leastSignificantBits);
   }

   @SinceKotlin(
      version = "2.0"
   )
   @ExperimentalUuidApi
   @NotNull
   public static final Uuid getUuid(@NotNull ByteBuffer $this$getUuid) {
      Intrinsics.checkNotNullParameter($this$getUuid, "<this>");
      if ($this$getUuid.position() + 15 >= $this$getUuid.limit()) {
         throw new BufferUnderflowException();
      } else {
         long msb = $this$getUuid.getLong();
         long lsb = $this$getUuid.getLong();
         if (Intrinsics.areEqual((Object)$this$getUuid.order(), (Object)ByteOrder.LITTLE_ENDIAN)) {
            int $i$f$reverseBytes = false;
            msb = Long.reverseBytes(msb);
            $i$f$reverseBytes = false;
            lsb = Long.reverseBytes(lsb);
         }

         return Uuid.Companion.fromLongs(msb, lsb);
      }
   }

   @SinceKotlin(
      version = "2.0"
   )
   @ExperimentalUuidApi
   @NotNull
   public static final Uuid getUuid(@NotNull ByteBuffer $this$getUuid, int index) {
      Intrinsics.checkNotNullParameter($this$getUuid, "<this>");
      if (index < 0) {
         throw new IndexOutOfBoundsException("Negative index: " + index);
      } else if (index + 15 >= $this$getUuid.limit()) {
         throw new IndexOutOfBoundsException("Not enough bytes to read a uuid at index: " + index + ", with limit: " + $this$getUuid.limit() + ' ');
      } else {
         long msb = $this$getUuid.getLong(index);
         long lsb = $this$getUuid.getLong(index + 8);
         if (Intrinsics.areEqual((Object)$this$getUuid.order(), (Object)ByteOrder.LITTLE_ENDIAN)) {
            int $i$f$reverseBytes = false;
            msb = Long.reverseBytes(msb);
            $i$f$reverseBytes = false;
            lsb = Long.reverseBytes(lsb);
         }

         return Uuid.Companion.fromLongs(msb, lsb);
      }
   }

   @SinceKotlin(
      version = "2.0"
   )
   @ExperimentalUuidApi
   @NotNull
   public static final ByteBuffer putUuid(@NotNull ByteBuffer $this$putUuid, @NotNull Uuid uuid) {
      Intrinsics.checkNotNullParameter($this$putUuid, "<this>");
      Intrinsics.checkNotNullParameter(uuid, "uuid");
      long var10000 = uuid.getMostSignificantBits();
      long lsb = uuid.getLeastSignificantBits();
      long msb = var10000;
      int var7 = false;
      if ($this$putUuid.position() + 15 >= $this$putUuid.limit()) {
         throw new BufferOverflowException();
      } else {
         ByteBuffer var11;
         if (Intrinsics.areEqual((Object)$this$putUuid.order(), (Object)ByteOrder.BIG_ENDIAN)) {
            $this$putUuid.putLong(msb);
            var11 = $this$putUuid.putLong(lsb);
         } else {
            int $i$f$reverseBytes = false;
            $this$putUuid.putLong(Long.reverseBytes(msb));
            $i$f$reverseBytes = false;
            var11 = $this$putUuid.putLong(Long.reverseBytes(lsb));
         }

         Intrinsics.checkNotNullExpressionValue(var11, "toLongs(...)");
         return var11;
      }
   }

   @SinceKotlin(
      version = "2.0"
   )
   @ExperimentalUuidApi
   @NotNull
   public static final ByteBuffer putUuid(@NotNull ByteBuffer $this$putUuid, int index, @NotNull Uuid uuid) {
      Intrinsics.checkNotNullParameter($this$putUuid, "<this>");
      Intrinsics.checkNotNullParameter(uuid, "uuid");
      long var10000 = uuid.getMostSignificantBits();
      long lsb = uuid.getLeastSignificantBits();
      long msb = var10000;
      int var8 = false;
      if (index < 0) {
         throw new IndexOutOfBoundsException("Negative index: " + index);
      } else if (index + 15 >= $this$putUuid.limit()) {
         throw new IndexOutOfBoundsException("Not enough capacity to write a uuid at index: " + index + ", with limit: " + $this$putUuid.limit() + ' ');
      } else {
         ByteBuffer var12;
         if (Intrinsics.areEqual((Object)$this$putUuid.order(), (Object)ByteOrder.BIG_ENDIAN)) {
            $this$putUuid.putLong(index, msb);
            var12 = $this$putUuid.putLong(index + 8, lsb);
         } else {
            int $i$f$reverseBytes = false;
            $this$putUuid.putLong(index, Long.reverseBytes(msb));
            int var10001 = index + 8;
            $i$f$reverseBytes = false;
            var12 = $this$putUuid.putLong(var10001, Long.reverseBytes(lsb));
         }

         Intrinsics.checkNotNullExpressionValue(var12, "toLongs(...)");
         return var12;
      }
   }

   public static final long reverseBytes(long $this$reverseBytes) {
      int $i$f$reverseBytes = false;
      return Long.reverseBytes($this$reverseBytes);
   }

   public UuidKt__UuidJVMKt() {
   }
}
