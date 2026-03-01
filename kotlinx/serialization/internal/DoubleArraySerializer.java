package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class DoubleArraySerializer extends PrimitiveArraySerializer<Double, double[], DoubleArrayBuilder> implements KSerializer<double[]> {
   @NotNull
   public static final DoubleArraySerializer INSTANCE = new DoubleArraySerializer();

   private DoubleArraySerializer() {
      super(BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
   }

   protected int collectionSize(@NotNull double[] $this$collectionSize) {
      Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
      return $this$collectionSize.length;
   }

   @NotNull
   protected DoubleArrayBuilder toBuilder(@NotNull double[] $this$toBuilder) {
      Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
      return new DoubleArrayBuilder($this$toBuilder);
   }

   @NotNull
   protected double[] empty() {
      return new double[0];
   }

   protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull DoubleArrayBuilder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      builder.append$kotlinx_serialization_core(decoder.decodeDoubleElement(this.getDescriptor(), index));
   }

   protected void writeContent(@NotNull CompositeEncoder encoder, @NotNull double[] content, int size) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(content, "content");

      for(int i = 0; i < size; ++i) {
         encoder.encodeDoubleElement(this.getDescriptor(), i, content[i]);
      }

   }
}
