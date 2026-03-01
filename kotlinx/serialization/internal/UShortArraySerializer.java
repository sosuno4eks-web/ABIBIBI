package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.UShortArray;
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
public final class UShortArraySerializer extends PrimitiveArraySerializer<UShort, UShortArray, UShortArrayBuilder> implements KSerializer<UShortArray> {
   @NotNull
   public static final UShortArraySerializer INSTANCE = new UShortArraySerializer();

   private UShortArraySerializer() {
      super(BuiltinSerializersKt.serializer(UShort.Companion));
   }

   protected int collectionSize_rL5Bavg/* $FF was: collectionSize-rL5Bavg*/(@NotNull short[] $this$collectionSize_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$collectionSize_u2drL5Bavg, "$this$collectionSize");
      return UShortArray.getSize-impl($this$collectionSize_u2drL5Bavg);
   }

   @NotNull
   protected UShortArrayBuilder toBuilder_rL5Bavg/* $FF was: toBuilder-rL5Bavg*/(@NotNull short[] $this$toBuilder_u2drL5Bavg) {
      Intrinsics.checkNotNullParameter($this$toBuilder_u2drL5Bavg, "$this$toBuilder");
      return new UShortArrayBuilder($this$toBuilder_u2drL5Bavg, (DefaultConstructorMarker)null);
   }

   @NotNull
   protected short[] empty_amswpOA/* $FF was: empty-amswpOA*/() {
      return UShortArray.constructor-impl(0);
   }

   protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull UShortArrayBuilder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      builder.append-xj2QHRw$kotlinx_serialization_core(UShort.constructor-impl(decoder.decodeInlineElement(this.getDescriptor(), index).decodeShort()));
   }

   protected void writeContent_eny0XGE/* $FF was: writeContent-eny0XGE*/(@NotNull CompositeEncoder encoder, @NotNull short[] content, int size) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(content, "content");

      for(int i = 0; i < size; ++i) {
         encoder.encodeInlineElement(this.getDescriptor(), i).encodeShort(UShortArray.get-Mh2AYeg(content, i));
      }

   }
}
