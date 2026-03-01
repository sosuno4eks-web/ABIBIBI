package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class NothingSerializer implements KSerializer {
   @NotNull
   public static final NothingSerializer INSTANCE = new NothingSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private NothingSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, @NotNull Void value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      throw new SerializationException("'kotlin.Nothing' cannot be serialized");
   }

   @NotNull
   public Void deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      throw new SerializationException("'kotlin.Nothing' does not have instances");
   }

   static {
      descriptor = (SerialDescriptor)NothingSerialDescriptor.INSTANCE;
   }
}
