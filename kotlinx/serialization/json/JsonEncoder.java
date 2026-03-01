package kotlinx.serialization.json;

import kotlin.SubclassOptInRequired;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SealedSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SubclassOptInRequired(
   markerClass = {SealedSerializationApi.class}
)
public interface JsonEncoder extends Encoder, CompositeEncoder {
   @NotNull
   Json getJson();

   void encodeJsonElement(@NotNull JsonElement var1);

   public static final class DefaultImpls {
      /** @deprecated */
      @ExperimentalSerializationApi
      @Deprecated
      public static void encodeNotNullMark(@NotNull JsonEncoder $this) {
         $this.encodeNotNullMark();
      }

      /** @deprecated */
      @Deprecated
      @NotNull
      public static CompositeEncoder beginCollection(@NotNull JsonEncoder $this, @NotNull SerialDescriptor descriptor, int collectionSize) {
         Intrinsics.checkNotNullParameter(descriptor, "descriptor");
         return $this.beginCollection(descriptor, collectionSize);
      }

      /** @deprecated */
      @Deprecated
      public static <T> void encodeSerializableValue(@NotNull JsonEncoder $this, @NotNull SerializationStrategy<? super T> serializer, T value) {
         Intrinsics.checkNotNullParameter(serializer, "serializer");
         $this.encodeSerializableValue(serializer, value);
      }

      /** @deprecated */
      @ExperimentalSerializationApi
      @Deprecated
      public static <T> void encodeNullableSerializableValue(@NotNull JsonEncoder $this, @NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
         Intrinsics.checkNotNullParameter(serializer, "serializer");
         $this.encodeNullableSerializableValue(serializer, value);
      }

      /** @deprecated */
      @ExperimentalSerializationApi
      @Deprecated
      public static boolean shouldEncodeElementDefault(@NotNull JsonEncoder $this, @NotNull SerialDescriptor descriptor, int index) {
         Intrinsics.checkNotNullParameter(descriptor, "descriptor");
         return $this.shouldEncodeElementDefault(descriptor, index);
      }
   }
}
