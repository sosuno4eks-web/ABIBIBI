package kotlinx.serialization;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.AbstractPolymorphicSerializerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PolymorphicSerializerKt {
   @InternalSerializationApi
   @NotNull
   public static final <T> DeserializationStrategy<T> findPolymorphicSerializer(@NotNull AbstractPolymorphicSerializer<T> $this$findPolymorphicSerializer, @NotNull CompositeDecoder decoder, @Nullable String klassName) {
      Intrinsics.checkNotNullParameter($this$findPolymorphicSerializer, "<this>");
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      DeserializationStrategy var10000 = $this$findPolymorphicSerializer.findPolymorphicSerializerOrNull(decoder, klassName);
      if (var10000 == null) {
         AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(klassName, $this$findPolymorphicSerializer.getBaseClass());
         throw new KotlinNothingValueException();
      } else {
         return var10000;
      }
   }

   @InternalSerializationApi
   @NotNull
   public static final <T> SerializationStrategy<T> findPolymorphicSerializer(@NotNull AbstractPolymorphicSerializer<T> $this$findPolymorphicSerializer, @NotNull Encoder encoder, @NotNull T value) {
      Intrinsics.checkNotNullParameter($this$findPolymorphicSerializer, "<this>");
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      SerializationStrategy var10000 = $this$findPolymorphicSerializer.findPolymorphicSerializerOrNull(encoder, value);
      if (var10000 == null) {
         AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(Reflection.getOrCreateKotlinClass(value.getClass()), $this$findPolymorphicSerializer.getBaseClass());
         throw new KotlinNothingValueException();
      } else {
         return var10000;
      }
   }
}
