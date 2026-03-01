package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

@ExperimentalSerializationApi
@PublishedApi
@ExperimentalUnsignedTypes
public final class UByteArraySerializer extends PrimitiveArraySerializer<UByte, UByteArray, UByteArrayBuilder> implements KSerializer<UByteArray> {
   @NotNull
   public static final UByteArraySerializer INSTANCE = new UByteArraySerializer();

   private UByteArraySerializer() {
      super(BuiltinSerializersKt.serializer(UByte.Companion));
   }

   protected int collectionSize_GBYM_sE/* $FF was: collectionSize-GBYM_sE*/(@NotNull byte[] $this$collectionSize_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$collectionSize_u2dGBYM_sE, "$this$collectionSize");
      return UByteArray.getSize-impl($this$collectionSize_u2dGBYM_sE);
   }

   @NotNull
   protected UByteArrayBuilder toBuilder_GBYM_sE/* $FF was: toBuilder-GBYM_sE*/(@NotNull byte[] $this$toBuilder_u2dGBYM_sE) {
      Intrinsics.checkNotNullParameter($this$toBuilder_u2dGBYM_sE, "$this$toBuilder");
      return new UByteArrayBuilder($this$toBuilder_u2dGBYM_sE, (DefaultConstructorMarker)null);
   }

   @NotNull
   protected byte[] empty_TcUX1vc/* $FF was: empty-TcUX1vc*/() {
      return UByteArray.constructor-impl(0);
   }

   protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull UByteArrayBuilder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      builder.append-7apg3OU$kotlinx_serialization_core(UByte.constructor-impl(decoder.decodeInlineElement(this.getDescriptor(), index).decodeByte()));
   }

   protected void writeContent_Coi6ktg/* $FF was: writeContent-Coi6ktg*/(@NotNull CompositeEncoder encoder, @NotNull byte[] content, int size) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(content, "content");

      for(int i = 0; i < size; ++i) {
         encoder.encodeInlineElement(this.getDescriptor(), i).encodeByte(UByteArray.get-w2LRezQ(content, i));
      }

   }
}
