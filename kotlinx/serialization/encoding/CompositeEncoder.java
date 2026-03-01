package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CompositeEncoder {
   @NotNull
   SerializersModule getSerializersModule();

   void endStructure(@NotNull SerialDescriptor var1);

   @ExperimentalSerializationApi
   default boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return true;
   }

   void encodeBooleanElement(@NotNull SerialDescriptor var1, int var2, boolean var3);

   void encodeByteElement(@NotNull SerialDescriptor var1, int var2, byte var3);

   void encodeShortElement(@NotNull SerialDescriptor var1, int var2, short var3);

   void encodeCharElement(@NotNull SerialDescriptor var1, int var2, char var3);

   void encodeIntElement(@NotNull SerialDescriptor var1, int var2, int var3);

   void encodeLongElement(@NotNull SerialDescriptor var1, int var2, long var3);

   void encodeFloatElement(@NotNull SerialDescriptor var1, int var2, float var3);

   void encodeDoubleElement(@NotNull SerialDescriptor var1, int var2, double var3);

   void encodeStringElement(@NotNull SerialDescriptor var1, int var2, @NotNull String var3);

   @NotNull
   Encoder encodeInlineElement(@NotNull SerialDescriptor var1, int var2);

   <T> void encodeSerializableElement(@NotNull SerialDescriptor var1, int var2, @NotNull SerializationStrategy<? super T> var3, T var4);

   @ExperimentalSerializationApi
   <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor var1, int var2, @NotNull SerializationStrategy<? super T> var3, @Nullable T var4);

   public static final class DefaultImpls {
      /** @deprecated */
      @ExperimentalSerializationApi
      @Deprecated
      public static boolean shouldEncodeElementDefault(@NotNull CompositeEncoder $this, @NotNull SerialDescriptor descriptor, int index) {
         Intrinsics.checkNotNullParameter(descriptor, "descriptor");
         return $this.shouldEncodeElementDefault(descriptor, index);
      }
   }
}
