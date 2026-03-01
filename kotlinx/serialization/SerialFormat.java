package kotlinx.serialization;

import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

public interface SerialFormat {
   @NotNull
   SerializersModule getSerializersModule();
}
