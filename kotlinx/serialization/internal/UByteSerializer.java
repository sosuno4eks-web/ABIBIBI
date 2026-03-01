package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class UByteSerializer implements KSerializer<UByte> {
   @NotNull
   public static final UByteSerializer INSTANCE = new UByteSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private UByteSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize_EK_6454/* $FF was: serialize-EK-6454*/(@NotNull Encoder encoder, byte value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeInline(this.getDescriptor()).encodeByte(value);
   }

   public byte deserialize_Wa3L5BU/* $FF was: deserialize-Wa3L5BU*/(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return UByte.constructor-impl(decoder.decodeInline(this.getDescriptor()).decodeByte());
   }

   static {
      descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UByte", BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE));
   }
}
