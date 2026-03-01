package kotlinx.serialization.encoding;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DecodingKt {
   @Nullable
   public static final <T> T decodeIfNullable(@NotNull Decoder $this$decodeIfNullable, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull Function0<? extends T> block) {
      Intrinsics.checkNotNullParameter($this$decodeIfNullable, "<this>");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$decodeIfNullable = false;
      boolean isNullabilitySupported = deserializer.getDescriptor().isNullable();
      return !isNullabilitySupported && !$this$decodeIfNullable.decodeNotNullMark() ? $this$decodeIfNullable.decodeNull() : block.invoke();
   }

   public static final <T> T decodeStructure(@NotNull Decoder $this$decodeStructure, @NotNull SerialDescriptor descriptor, @NotNull Function1<? super CompositeDecoder, ? extends T> block) {
      Intrinsics.checkNotNullParameter($this$decodeStructure, "<this>");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$decodeStructure = false;
      CompositeDecoder composite = $this$decodeStructure.beginStructure(descriptor);
      Object result = block.invoke(composite);
      composite.endStructure(descriptor);
      return result;
   }
}
