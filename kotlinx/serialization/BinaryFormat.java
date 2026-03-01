package kotlinx.serialization;

import org.jetbrains.annotations.NotNull;

public interface BinaryFormat extends SerialFormat {
   @NotNull
   <T> byte[] encodeToByteArray(@NotNull SerializationStrategy<? super T> var1, T var2);

   <T> T decodeFromByteArray(@NotNull DeserializationStrategy<? extends T> var1, @NotNull byte[] var2);
}
