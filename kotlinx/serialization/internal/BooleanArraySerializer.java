package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class BooleanArraySerializer extends PrimitiveArraySerializer<Boolean, boolean[], BooleanArrayBuilder> implements KSerializer<boolean[]> {
   @NotNull
   public static final BooleanArraySerializer INSTANCE = new BooleanArraySerializer();

   private BooleanArraySerializer() {
      super(BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
   }

   protected int collectionSize(@NotNull boolean[] $this$collectionSize) {
      Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
      return $this$collectionSize.length;
   }

   @NotNull
   protected BooleanArrayBuilder toBuilder(@NotNull boolean[] $this$toBuilder) {
      Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
      return new BooleanArrayBuilder($this$toBuilder);
   }

   @NotNull
   protected boolean[] empty() {
      return new boolean[0];
   }

   protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull BooleanArrayBuilder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      builder.append$kotlinx_serialization_core(decoder.decodeBooleanElement(this.getDescriptor(), index));
   }

   protected void writeContent(@NotNull CompositeEncoder encoder, @NotNull boolean[] content, int size) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(content, "content");

      for(int i = 0; i < size; ++i) {
         encoder.encodeBooleanElement(this.getDescriptor(), i, content[i]);
      }

   }
}
