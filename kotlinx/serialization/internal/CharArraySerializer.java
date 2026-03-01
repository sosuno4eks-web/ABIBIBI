package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class CharArraySerializer extends PrimitiveArraySerializer<Character, char[], CharArrayBuilder> implements KSerializer<char[]> {
   @NotNull
   public static final CharArraySerializer INSTANCE = new CharArraySerializer();

   private CharArraySerializer() {
      super(BuiltinSerializersKt.serializer(CharCompanionObject.INSTANCE));
   }

   protected int collectionSize(@NotNull char[] $this$collectionSize) {
      Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
      return $this$collectionSize.length;
   }

   @NotNull
   protected CharArrayBuilder toBuilder(@NotNull char[] $this$toBuilder) {
      Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
      return new CharArrayBuilder($this$toBuilder);
   }

   @NotNull
   protected char[] empty() {
      return new char[0];
   }

   protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull CharArrayBuilder builder, boolean checkIndex) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      Intrinsics.checkNotNullParameter(builder, "builder");
      builder.append$kotlinx_serialization_core(decoder.decodeCharElement(this.getDescriptor(), index));
   }

   protected void writeContent(@NotNull CompositeEncoder encoder, @NotNull char[] content, int size) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(content, "content");

      for(int i = 0; i < size; ++i) {
         encoder.encodeCharElement(this.getDescriptor(), i, content[i]);
      }

   }
}
