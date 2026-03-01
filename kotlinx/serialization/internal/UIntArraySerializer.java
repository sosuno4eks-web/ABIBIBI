package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UInt;
import kotlin.UIntArray;
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
public final class UIntArraySerializer extends PrimitiveArraySerializer<UInt, UIntArray, UIntArrayBuilder> implements KSerializer<UIntArray> {
   @NotNull
   public static final UIntArraySerializer INSTANCE = new UIntArraySerializer();

   private UIntArraySerializer() {
      super(BuiltinSerializersKt.serializer(UInt.Companion));
   }

   protected int collectionSize__ajY_9A/* $FF was: collectionSize--ajY-9A*/(@NotNull int[] $this$collectionSize_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$collectionSize_u2d_u2dajY_u2d9A, "$this$collectionSize");
      return UIntArray.getSize-impl($this$collectionSize_u2d_u2dajY_u2d9A);
   }

   @NotNull
   protected UIntArrayBuilder toBuilder__ajY_9A/* $FF was: toBuilder--ajY-9A*/(@NotNull int[] $this$toBuilder_u2d_u2dajY_u2d9A) {
      Intrinsics.checkNotNullParameter($this$toBuilder_u2d_u2dajY_u2d9A, "$this$toBuilder");
      return new UIntArrayBuilder($this$toBuilder_u2d_u2dajY_u2d9A, (DefaultConstructorMarker)null);
   }

   @NotNull
   protected int[] empty__hP7Qyg/* $FF was: empty--hP7Qyg*/() {
      return UIntArray.constructor-impl(0);
   }

   protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull UIntArrayBuilder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      builder.append-WZ4Q5Ns$kotlinx_serialization_core(UInt.constructor-impl(decoder.decodeInlineElement(this.getDescriptor(), index).decodeInt()));
   }

   protected void writeContent_CPlH8fI/* $FF was: writeContent-CPlH8fI*/(@NotNull CompositeEncoder encoder, @NotNull int[] content, int size) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(content, "content");

      for(int i = 0; i < size; ++i) {
         encoder.encodeInlineElement(this.getDescriptor(), i).encodeInt(UIntArray.get-pVg5ArA(content, i));
      }

   }
}
