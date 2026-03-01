package kotlinx.serialization.json;

import kotlin.SubclassOptInRequired;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SealedSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SubclassOptInRequired(
   markerClass = {SealedSerializationApi.class}
)
public interface JsonDecoder extends Decoder, CompositeDecoder {
   @NotNull
   Json getJson();

   @NotNull
   JsonElement decodeJsonElement();

   public static final class DefaultImpls {
      /** @deprecated */
      @Deprecated
      public static <T> T decodeSerializableValue(@NotNull JsonDecoder $this, @NotNull DeserializationStrategy<? extends T> deserializer) {
         Intrinsics.checkNotNullParameter(deserializer, "deserializer");
         return $this.decodeSerializableValue(deserializer);
      }

      /** @deprecated */
      @ExperimentalSerializationApi
      @Deprecated
      @Nullable
      public static <T> T decodeNullableSerializableValue(@NotNull JsonDecoder $this, @NotNull DeserializationStrategy<? extends T> deserializer) {
         Intrinsics.checkNotNullParameter(deserializer, "deserializer");
         return $this.decodeNullableSerializableValue(deserializer);
      }

      /** @deprecated */
      @ExperimentalSerializationApi
      @Deprecated
      public static boolean decodeSequentially(@NotNull JsonDecoder $this) {
         return $this.decodeSequentially();
      }

      /** @deprecated */
      @Deprecated
      public static int decodeCollectionSize(@NotNull JsonDecoder $this, @NotNull SerialDescriptor descriptor) {
         Intrinsics.checkNotNullParameter(descriptor, "descriptor");
         return $this.decodeCollectionSize(descriptor);
      }
   }
}
