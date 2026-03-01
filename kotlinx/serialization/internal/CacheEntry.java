package kotlinx.serialization.internal;

import kotlin.jvm.JvmField;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.Nullable;

final class CacheEntry<T> {
   @JvmField
   @Nullable
   public final KSerializer<T> serializer;

   public CacheEntry(@Nullable KSerializer<T> serializer) {
      this.serializer = serializer;
   }
}
