package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Decoder {
   @NotNull
   SerializersModule getSerializersModule();

   @ExperimentalSerializationApi
   boolean decodeNotNullMark();

   @ExperimentalSerializationApi
   @Nullable
   Void decodeNull();

   boolean decodeBoolean();

   byte decodeByte();

   short decodeShort();

   char decodeChar();

   int decodeInt();

   long decodeLong();

   float decodeFloat();

   double decodeDouble();

   @NotNull
   String decodeString();

   int decodeEnum(@NotNull SerialDescriptor var1);

   @NotNull
   Decoder decodeInline(@NotNull SerialDescriptor var1);

   @NotNull
   CompositeDecoder beginStructure(@NotNull SerialDescriptor var1);

   default <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      return deserializer.deserialize(this);
   }

   @ExperimentalSerializationApi
   @Nullable
   default <T> T decodeNullableSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      int $i$f$decodeIfNullable = false;
      boolean isNullabilitySupported$iv = deserializer.getDescriptor().isNullable();
      Object var10000;
      if (!isNullabilitySupported$iv && !this.decodeNotNullMark()) {
         var10000 = this.decodeNull();
      } else {
         int var6 = false;
         var10000 = this.decodeSerializableValue(deserializer);
      }

      return var10000;
   }

   public static final class DefaultImpls {
      /** @deprecated */
      @Deprecated
      public static <T> T decodeSerializableValue(@NotNull Decoder $this, @NotNull DeserializationStrategy<? extends T> deserializer) {
         Intrinsics.checkNotNullParameter(deserializer, "deserializer");
         return $this.decodeSerializableValue(deserializer);
      }

      /** @deprecated */
      @ExperimentalSerializationApi
      @Deprecated
      @Nullable
      public static <T> T decodeNullableSerializableValue(@NotNull Decoder $this, @NotNull DeserializationStrategy<? extends T> deserializer) {
         Intrinsics.checkNotNullParameter(deserializer, "deserializer");
         return $this.decodeNullableSerializableValue(deserializer);
      }
   }
}
