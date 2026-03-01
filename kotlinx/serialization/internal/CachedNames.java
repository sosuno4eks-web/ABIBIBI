package kotlinx.serialization.internal;

import java.util.Set;
import org.jetbrains.annotations.NotNull;

public interface CachedNames {
   @NotNull
   Set<String> getSerialNames();
}
