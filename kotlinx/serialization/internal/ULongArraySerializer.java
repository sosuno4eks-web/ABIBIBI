package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.ULongArray;
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
public final class ULongArraySerializer extends PrimitiveArraySerializer<ULong, ULongArray, ULongArrayBuilder> implements KSerializer<ULongArray> {
   @NotNull
   public static final ULongArraySerializer INSTANCE = new ULongArraySerializer();

   private ULongArraySerializer() {
      super(BuiltinSerializersKt.serializer(ULong.Companion));
   }

   protected int collectionSize_QwZRm1k/* $FF was: collectionSize-QwZRm1k*/(@NotNull long[] $this$collectionSize_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$collectionSize_u2dQwZRm1k, "$this$collectionSize");
      return ULongArray.getSize-impl($this$collectionSize_u2dQwZRm1k);
   }

   @NotNull
   protected ULongArrayBuilder toBuilder_QwZRm1k/* $FF was: toBuilder-QwZRm1k*/(@NotNull long[] $this$toBuilder_u2dQwZRm1k) {
      Intrinsics.checkNotNullParameter($this$toBuilder_u2dQwZRm1k, "$this$toBuilder");
      return new ULongArrayBuilder($this$toBuilder_u2dQwZRm1k, (DefaultConstructorMarker)null);
   }

   @NotNull
   protected long[] empty_Y2RjT0g/* $FF was: empty-Y2RjT0g*/() {
      return ULongArray.constructor-impl(0);
   }

   protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull ULongArrayBuilder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      builder.append-VKZWuLQ$kotlinx_serialization_core(ULong.constructor-impl(decoder.decodeInlineElement(this.getDescriptor(), index).decodeLong()));
   }

   protected void writeContent_0q3Fkuo/* $FF was: writeContent-0q3Fkuo*/(@NotNull CompositeEncoder encoder, @NotNull long[] content, int size) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(content, "content");

      for(int i = 0; i < size; ++i) {
         encoder.encodeInlineElement(this.getDescriptor(), i).encodeLong(ULongArray.get-s-VKNKU(content, i));
      }

   }
}
