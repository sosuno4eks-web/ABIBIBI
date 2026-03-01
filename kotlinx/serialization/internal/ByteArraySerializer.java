package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class ByteArraySerializer extends PrimitiveArraySerializer<Byte, byte[], ByteArrayBuilder> implements KSerializer<byte[]> {
   @NotNull
   public static final ByteArraySerializer INSTANCE = new ByteArraySerializer();

   private ByteArraySerializer() {
      super(BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE));
   }

   protected int collectionSize(@NotNull byte[] $this$collectionSize) {
      Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
      return $this$collectionSize.length;
   }

   @NotNull
   protected ByteArrayBuilder toBuilder(@NotNull byte[] $this$toBuilder) {
      Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
      return new ByteArrayBuilder($this$toBuilder);
   }

   @NotNull
   protected byte[] empty() {
      return new byte[0];
   }

   protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull ByteArrayBuilder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      builder.append$kotlinx_serialization_core(decoder.decodeByteElement(this.getDescriptor(), index));
   }

   protected void writeContent(@NotNull CompositeEncoder encoder, @NotNull byte[] content, int size) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(content, "content");

      for(int i = 0; i < size; ++i) {
         encoder.encodeByteElement(this.getDescriptor(), i, content[i]);
      }

   }
}
