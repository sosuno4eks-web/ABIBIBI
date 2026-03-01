package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

public interface SerializationStrategy<T> {
   @NotNull
   SerialDescriptor getDescriptor();

   void serialize(@NotNull Encoder var1, T var2);
}
