package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalSerializationApi
public abstract class AbstractDecoder implements Decoder, CompositeDecoder {
   @NotNull
   public Object decodeValue() {
      throw new SerializationException(Reflection.getOrCreateKotlinClass(this.getClass()) + " can't retrieve untyped values");
   }

   public boolean decodeNotNullMark() {
      return true;
   }

   @Nullable
   public Void decodeNull() {
      return null;
   }

   public boolean decodeBoolean() {
      Object var10000 = this.decodeValue();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Boolean");
      return (Boolean)var10000;
   }

   public byte decodeByte() {
      Object var10000 = this.decodeValue();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Byte");
      return (Byte)var10000;
   }

   public short decodeShort() {
      Object var10000 = this.decodeValue();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Short");
      return (Short)var10000;
   }

   public int decodeInt() {
      Object var10000 = this.decodeValue();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Int");
      return (Integer)var10000;
   }

   public long decodeLong() {
      Object var10000 = this.decodeValue();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Long");
      return (Long)var10000;
   }

   public float decodeFloat() {
      Object var10000 = this.decodeValue();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Float");
      return (Float)var10000;
   }

   public double decodeDouble() {
      Object var10000 = this.decodeValue();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Double");
      return (Double)var10000;
   }

   public char decodeChar() {
      Object var10000 = this.decodeValue();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Char");
      return (Character)var10000;
   }

   @NotNull
   public String decodeString() {
      Object var10000 = this.decodeValue();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.String");
      return (String)var10000;
   }

   public int decodeEnum(@NotNull SerialDescriptor enumDescriptor) {
      Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
      Object var10000 = this.decodeValue();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Int");
      return (Integer)var10000;
   }

   @NotNull
   public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return (Decoder)this;
   }

   public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      return this.decodeSerializableValue(deserializer);
   }

   // $FF: synthetic method
   public static Object decodeSerializableValue$default(AbstractDecoder var0, DeserializationStrategy var1, Object var2, int var3, Object var4) {
      if (var4 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
      } else {
         if ((var3 & 2) != 0) {
            var2 = null;
         }

         return var0.decodeSerializableValue(var1, var2);
      }
   }

   @NotNull
   public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return (CompositeDecoder)this;
   }

   public void endStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
   }

   public final boolean decodeBooleanElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeBoolean();
   }

   public final byte decodeByteElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeByte();
   }

   public final short decodeShortElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeShort();
   }

   public final int decodeIntElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeInt();
   }

   public final long decodeLongElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeLong();
   }

   public final float decodeFloatElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeFloat();
   }

   public final double decodeDoubleElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeDouble();
   }

   public final char decodeCharElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeChar();
   }

   @NotNull
   public final String decodeStringElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeString();
   }

   @NotNull
   public Decoder decodeInlineElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeInline(descriptor.getElementDescriptor(index));
   }

   public <T> T decodeSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      return this.decodeSerializableValue(deserializer, previousValue);
   }

   @Nullable
   public final <T> T decodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      Decoder $this$decodeIfNullable$iv = (Decoder)this;
      int $i$f$decodeIfNullable = false;
      boolean isNullabilitySupported$iv = deserializer.getDescriptor().isNullable();
      Object var10000;
      if (!isNullabilitySupported$iv && !$this$decodeIfNullable$iv.decodeNotNullMark()) {
         var10000 = $this$decodeIfNullable$iv.decodeNull();
      } else {
         int var9 = false;
         var10000 = this.decodeSerializableValue(deserializer, previousValue);
      }

      return var10000;
   }

   public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
      return Decoder.super.decodeSerializableValue(deserializer);
   }

   @ExperimentalSerializationApi
   @Nullable
   public <T> T decodeNullableSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
      return Decoder.super.decodeNullableSerializableValue(deserializer);
   }

   @ExperimentalSerializationApi
   public boolean decodeSequentially() {
      return CompositeDecoder.super.decodeSequentially();
   }

   public int decodeCollectionSize(@NotNull SerialDescriptor descriptor) {
      return CompositeDecoder.super.decodeCollectionSize(descriptor);
   }
}
