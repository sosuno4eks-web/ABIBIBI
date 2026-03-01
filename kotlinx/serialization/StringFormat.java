package kotlinx.serialization;

import org.jetbrains.annotations.NotNull;

public interface StringFormat extends SerialFormat {
   @NotNull
   <T> String encodeToString(@NotNull SerializationStrategy<? super T> var1, T var2);

   <T> T decodeFromString(@NotNull DeserializationStrategy<? extends T> var1, @NotNull String var2);
}
