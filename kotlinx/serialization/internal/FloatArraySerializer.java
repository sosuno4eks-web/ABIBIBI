package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class FloatArraySerializer extends PrimitiveArraySerializer<Float, float[], FloatArrayBuilder> implements KSerializer<float[]> {
   @NotNull
   public static final FloatArraySerializer INSTANCE = new FloatArraySerializer();

   private FloatArraySerializer() {
      super(BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
   }

   protected int collectionSize(@NotNull float[] $this$collectionSize) {
      Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
      return $this$collectionSize.length;
   }

   @NotNull
   protected FloatArrayBuilder toBuilder(@NotNull float[] $this$toBuilder) {
      Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
      return new FloatArrayBuilder($this$toBuilder);
   }

   @NotNull
   protected float[] empty() {
      return new float[0];
   }

   protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull FloatArrayBuilder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      builder.append$kotlinx_serialization_core(decoder.decodeFloatElement(this.getDescriptor(), index));
   }

   protected void writeContent(@NotNull CompositeEncoder encoder, @NotNull float[] content, int size) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(content, "content");

      for(int i = 0; i < size; ++i) {
         encoder.encodeFloatElement(this.getDescriptor(), i, content[i]);
      }

   }
}
