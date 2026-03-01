package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;

public interface DeserializationStrategy<T> {
   @NotNull
   SerialDescriptor getDescriptor();

   T deserialize(@NotNull Decoder var1);
}
