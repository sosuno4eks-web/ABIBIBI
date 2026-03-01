package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;

public final class NoOpEncoder extends AbstractEncoder {
   @NotNull
   public static final NoOpEncoder INSTANCE = new NoOpEncoder();
   @NotNull
   private static final SerializersModule serializersModule = SerializersModuleBuildersKt.EmptySerializersModule();

   private NoOpEncoder() {
   }

   @NotNull
   public SerializersModule getSerializersModule() {
      return serializersModule;
   }

   public void encodeValue(@NotNull Object value) {
      Intrinsics.checkNotNullParameter(value, "value");
   }

   public void encodeNull() {
   }

   public void encodeBoolean(boolean value) {
   }

   public void encodeByte(byte value) {
   }

   public void encodeShort(short value) {
   }

   public void encodeInt(int value) {
   }

   public void encodeLong(long value) {
   }

   public void encodeFloat(float value) {
   }

   public void encodeDouble(double value) {
   }

   public void encodeChar(char value) {
   }

   public void encodeString(@NotNull String value) {
      Intrinsics.checkNotNullParameter(value, "value");
   }

   public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int index) {
      Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
   }
}
