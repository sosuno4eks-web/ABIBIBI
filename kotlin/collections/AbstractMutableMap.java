package kotlin.collections;

import java.util.Map;
import java.util.Set;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.1"
)
public abstract class AbstractMutableMap<K, V> extends java.util.AbstractMap<K, V> implements Map<K, V>, KMutableMap {
   protected AbstractMutableMap() {
   }

   @Nullable
   public abstract V put(K var1, V var2);

   public abstract Set<java.util.Map.Entry<K, V>> getEntries();
}
