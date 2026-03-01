package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public abstract class PrimitiveArraySerializer<Element, Array, Builder extends PrimitiveArrayBuilder<Array>> extends CollectionLikeSerializer<Element, Array, Builder> {
   @NotNull
   private final SerialDescriptor descriptor;

   public PrimitiveArraySerializer(@NotNull KSerializer<Element> primitiveSerializer) {
      Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
      super(primitiveSerializer, (DefaultConstructorMarker)null);
      this.descriptor = (SerialDescriptor)(new PrimitiveArrayDescriptor(primitiveSerializer.getDescriptor()));
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return this.descriptor;
   }

   protected final int builderSize(@NotNull Builder $this$builderSize) {
      Intrinsics.checkNotNullParameter($this$builderSize, "<this>");
      return $this$builderSize.getPosition$kotlinx_serialization_core();
   }

   protected final Array toResult(@NotNull Builder $this$toResult) {
      Intrinsics.checkNotNullParameter($this$toResult, "<this>");
      return $this$toResult.build$kotlinx_serialization_core();
   }

   protected final void checkCapacity(@NotNull Builder $this$checkCapacity, int size) {
      Intrinsics.checkNotNullParameter($this$checkCapacity, "<this>");
      $this$checkCapacity.ensureCapacity$kotlinx_serialization_core(size);
   }

   @NotNull
   protected final Iterator<Element> collectionIterator(Array $this$collectionIterator) {
      throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
   }

   protected final void insert(@NotNull Builder $this$insert, int index, Element element) {
      Intrinsics.checkNotNullParameter($this$insert, "<this>");
      throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
   }

   @NotNull
   protected final Builder builder() {
      return (PrimitiveArrayBuilder)this.toBuilder(this.empty());
   }

   protected abstract Array empty();

   protected abstract void readElement(@NotNull CompositeDecoder var1, int var2, @NotNull Builder var3, boolean var4);

   protected abstract void writeContent(@NotNull CompositeEncoder var1, Array var2, int var3);

   public final void serialize(@NotNull Encoder encoder, Array value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      int size = this.collectionSize(value);
      SerialDescriptor descriptor$iv = this.descriptor;
      int $i$f$encodeCollection = false;
      CompositeEncoder composite$iv = encoder.beginCollection(descriptor$iv, size);
      int var10 = false;
      this.writeContent(composite$iv, value, size);
      composite$iv.endStructure(descriptor$iv);
   }

   public final Array deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return this.merge(decoder, (Object)null);
   }
}
