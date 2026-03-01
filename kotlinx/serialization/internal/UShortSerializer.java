package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class UShortSerializer implements KSerializer<UShort> {
   @NotNull
   public static final UShortSerializer INSTANCE = new UShortSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private UShortSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize_i8woANY/* $FF was: serialize-i8woANY*/(@NotNull Encoder encoder, short value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      encoder.encodeInline(this.getDescriptor()).encodeShort(value);
   }

   public short deserialize_BwKQO78/* $FF was: deserialize-BwKQO78*/(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return UShort.constructor-impl(decoder.decodeInline(this.getDescriptor()).decodeShort());
   }

   static {
      descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UShort", BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE));
   }
}
