package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

public final class CreateMapForCacheKt {
   @NotNull
   public static final <K, V> Map<K, V> createMapForCache(int initialCapacity) {
      return (Map)(new ConcurrentHashMap(initialCapacity));
   }
}
