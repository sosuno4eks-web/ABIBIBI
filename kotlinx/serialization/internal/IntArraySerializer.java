package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class IntArraySerializer extends PrimitiveArraySerializer<Integer, int[], IntArrayBuilder> implements KSerializer<int[]> {
   @NotNull
   public static final IntArraySerializer INSTANCE = new IntArraySerializer();

   private IntArraySerializer() {
      super(BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
   }

   protected int collectionSize(@NotNull int[] $this$collectionSize) {
      Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
      return $this$collectionSize.length;
   }

   @NotNull
   protected IntArrayBuilder toBuilder(@NotNull int[] $this$toBuilder) {
      Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
      return new IntArrayBuilder($this$toBuilder);
   }

   @NotNull
   protected int[] empty() {
      return new int[0];
   }

   protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull IntArrayBuilder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      builder.append$kotlinx_serialization_core(decoder.decodeIntElement(this.getDescriptor(), index));
   }

   protected void writeContent(@NotNull CompositeEncoder encoder, @NotNull int[] content, int size) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(content, "content");

      for(int i = 0; i < size; ++i) {
         encoder.encodeIntElement(this.getDescriptor(), i, content[i]);
      }

   }
}
