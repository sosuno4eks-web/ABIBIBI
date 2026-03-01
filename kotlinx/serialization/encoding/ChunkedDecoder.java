package kotlinx.serialization.encoding;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@ExperimentalSerializationApi
public interface ChunkedDecoder {
   @ExperimentalSerializationApi
   void decodeStringChunked(@NotNull Function1<? super String, Unit> var1);
}
