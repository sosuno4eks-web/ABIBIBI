package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class ULongSerializer implements KSerializer<ULong> {
   @NotNull
   public static final ULongSerializer INSTANCE = new ULongSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private ULongSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize_2TYgG_w/* $FF was: serialize-2TYgG_w*/(@NotNull Encoder encoder, long value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeInline(this.getDescriptor()).encodeLong(value);
   }

   public long deserialize_I7RO_PI/* $FF was: deserialize-I7RO_PI*/(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return ULong.constructor-impl(decoder.decodeInline(this.getDescriptor()).decodeLong());
   }

   static {
      descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.ULong", BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
   }
}
