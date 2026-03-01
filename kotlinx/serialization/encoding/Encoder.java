package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Encoder {
   @NotNull
   SerializersModule getSerializersModule();

   @ExperimentalSerializationApi
   default void encodeNotNullMark() {
   }

   @ExperimentalSerializationApi
   void encodeNull();

   void encodeBoolean(boolean var1);

   void encodeByte(byte var1);

   void encodeShort(short var1);

   void encodeChar(char var1);

   void encodeInt(int var1);

   void encodeLong(long var1);

   void encodeFloat(float var1);

   void encodeDouble(double var1);

   void encodeString(@NotNull String var1);

   void encodeEnum(@NotNull SerialDescriptor var1, int var2);

   @NotNull
   Encoder encodeInline(@NotNull SerialDescriptor var1);

   @NotNull
   CompositeEncoder beginStructure(@NotNull SerialDescriptor var1);

   @NotNull
   default CompositeEncoder beginCollection(@NotNull SerialDescriptor descriptor, int collectionSize) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.beginStructure(descriptor);
   }

   default <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> serializer, T value) {
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      serializer.serialize(this, value);
   }

   @ExperimentalSerializationApi
   default <T> void encodeNullableSerializableValue(@NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      boolean isNullabilitySupported = serializer.getDescriptor().isNullable();
      if (isNullabilitySupported) {
         this.encodeSerializableValue(serializer, value);
      } else {
         if (value == null) {
            this.encodeNull();
         } else {
            this.encodeNotNullMark();
            this.encodeSerializableValue(serializer, value);
         }

      }
   }

   public static final class DefaultImpls {
      /** @deprecated */
      @ExperimentalSerializationApi
      @Deprecated
      public static void encodeNotNullMark(@NotNull Encoder $this) {
         $this.encodeNotNullMark();
      }

      /** @deprecated */
      @Deprecated
      @NotNull
      public static CompositeEncoder beginCollection(@NotNull Encoder $this, @NotNull SerialDescriptor descriptor, int collectionSize) {
         Intrinsics.checkNotNullParameter(descriptor, "descriptor");
         return $this.beginCollection(descriptor, collectionSize);
      }

      /** @deprecated */
      @Deprecated
      public static <T> void encodeSerializableValue(@NotNull Encoder $this, @NotNull SerializationStrategy<? super T> serializer, T value) {
         Intrinsics.checkNotNullParameter(serializer, "serializer");
         $this.encodeSerializableValue(serializer, value);
      }

      /** @deprecated */
      @ExperimentalSerializationApi
      @Deprecated
      public static <T> void encodeNullableSerializableValue(@NotNull Encoder $this, @NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
         Intrinsics.checkNotNullParameter(serializer, "serializer");
         $this.encodeNullableSerializableValue(serializer, value);
      }
   }
}
