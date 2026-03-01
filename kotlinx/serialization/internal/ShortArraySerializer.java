package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class ShortArraySerializer extends PrimitiveArraySerializer<Short, short[], ShortArrayBuilder> implements KSerializer<short[]> {
   @NotNull
   public static final ShortArraySerializer INSTANCE = new ShortArraySerializer();

   private ShortArraySerializer() {
      super(BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE));
   }

   protected int collectionSize(@NotNull short[] $this$collectionSize) {
      Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
      return $this$collectionSize.length;
   }

   @NotNull
   protected ShortArrayBuilder toBuilder(@NotNull short[] $this$toBuilder) {
      Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
      return new ShortArrayBuilder($this$toBuilder);
   }

   @NotNull
   protected short[] empty() {
      return new short[0];
   }

   protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull ShortArrayBuilder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      builder.append$kotlinx_serialization_core(decoder.decodeShortElement(this.getDescriptor(), index));
   }

   protected void writeContent(@NotNull CompositeEncoder encoder, @NotNull short[] content, int size) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(content, "content");

      for(int i = 0; i < size; ++i) {
         encoder.encodeShortElement(this.getDescriptor(), i, content[i]);
      }

   }
}
