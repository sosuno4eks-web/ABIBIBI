package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class UIntSerializer implements KSerializer<UInt> {
   @NotNull
   public static final UIntSerializer INSTANCE = new UIntSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private UIntSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize_Qn1smSk/* $FF was: serialize-Qn1smSk*/(@NotNull Encoder encoder, int value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeInline(this.getDescriptor()).encodeInt(value);
   }

   public int deserialize_OGnWXxg/* $FF was: deserialize-OGnWXxg*/(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return UInt.constructor-impl(decoder.decodeInline(this.getDescriptor()).decodeInt());
   }

   static {
      descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UInt", BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
   }
}
