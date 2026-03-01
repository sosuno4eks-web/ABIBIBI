package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.NoOpEncoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalSerializationApi
public abstract class AbstractEncoder implements Encoder, CompositeEncoder {
   @NotNull
   public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return (CompositeEncoder)this;
   }

   public void endStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
   }

   public boolean encodeElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return true;
   }

   public void encodeValue(@NotNull Object value) {
      Intrinsics.checkNotNullParameter(value, "value");
      throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(this.getClass()) + " encoder");
   }

   public void encodeNull() {
      throw new SerializationException("'null' is not supported by default");
   }

   public void encodeBoolean(boolean value) {
      this.encodeValue(value);
   }

   public void encodeByte(byte value) {
      this.encodeValue(value);
   }

   public void encodeShort(short value) {
      this.encodeValue(value);
   }

   public void encodeInt(int value) {
      this.encodeValue(value);
   }

   public void encodeLong(long value) {
      this.encodeValue(value);
   }

   public void encodeFloat(float value) {
      this.encodeValue(value);
   }

   public void encodeDouble(double value) {
      this.encodeValue(value);
   }

   public void encodeChar(char value) {
      this.encodeValue(value);
   }

   public void encodeString(@NotNull String value) {
      Intrinsics.checkNotNullParameter(value, "value");
      this.encodeValue(value);
   }

   public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int index) {
      Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
      this.encodeValue(index);
   }

   @NotNull
   public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return (Encoder)this;
   }

   public final void encodeBooleanElement(@NotNull SerialDescriptor descriptor, int index, boolean value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (this.encodeElement(descriptor, index)) {
         this.encodeBoolean(value);
      }

   }

   public final void encodeByteElement(@NotNull SerialDescriptor descriptor, int index, byte value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (this.encodeElement(descriptor, index)) {
         this.encodeByte(value);
      }

   }

   public final void encodeShortElement(@NotNull SerialDescriptor descriptor, int index, short value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (this.encodeElement(descriptor, index)) {
         this.encodeShort(value);
      }

   }

   public final void encodeIntElement(@NotNull SerialDescriptor descriptor, int index, int value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (this.encodeElement(descriptor, index)) {
         this.encodeInt(value);
      }

   }

   public final void encodeLongElement(@NotNull SerialDescriptor descriptor, int index, long value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (this.encodeElement(descriptor, index)) {
         this.encodeLong(value);
      }

   }

   public final void encodeFloatElement(@NotNull SerialDescriptor descriptor, int index, float value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (this.encodeElement(descriptor, index)) {
         this.encodeFloat(value);
      }

   }

   public final void encodeDoubleElement(@NotNull SerialDescriptor descriptor, int index, double value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (this.encodeElement(descriptor, index)) {
         this.encodeDouble(value);
      }

   }

   public final void encodeCharElement(@NotNull SerialDescriptor descriptor, int index, char value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (this.encodeElement(descriptor, index)) {
         this.encodeChar(value);
      }

   }

   public final void encodeStringElement(@NotNull SerialDescriptor descriptor, int index, @NotNull String value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(value, "value");
      if (this.encodeElement(descriptor, index)) {
         this.encodeString(value);
      }

   }

   @NotNull
   public final Encoder encodeInlineElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.encodeElement(descriptor, index) ? this.encodeInline(descriptor.getElementDescriptor(index)) : (Encoder)NoOpEncoder.INSTANCE;
   }

   public <T> void encodeSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull SerializationStrategy<? super T> serializer, T value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      if (this.encodeElement(descriptor, index)) {
         this.encodeSerializableValue(serializer, value);
      }

   }

   public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      if (this.encodeElement(descriptor, index)) {
         this.encodeNullableSerializableValue(serializer, value);
      }

   }

   @ExperimentalSerializationApi
   public void encodeNotNullMark() {
      Encoder.super.encodeNotNullMark();
   }

   @NotNull
   public CompositeEncoder beginCollection(@NotNull SerialDescriptor descriptor, int collectionSize) {
      return Encoder.super.beginCollection(descriptor, collectionSize);
   }

   public <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> serializer, T value) {
      Encoder.super.encodeSerializableValue(serializer, value);
   }

   @ExperimentalSerializationApi
   public <T> void encodeNullableSerializableValue(@NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
      Encoder.super.encodeNullableSerializableValue(serializer, value);
   }

   @ExperimentalSerializationApi
   public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
      return CompositeEncoder.super.shouldEncodeElementDefault(descriptor, index);
   }
}
