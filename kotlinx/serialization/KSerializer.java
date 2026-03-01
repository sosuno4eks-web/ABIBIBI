package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

public interface KSerializer<T> extends SerializationStrategy<T>, DeserializationStrategy<T> {
   @NotNull
   SerialDescriptor getDescriptor();
}
