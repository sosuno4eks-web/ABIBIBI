package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface SerializerCache<T> {
   @Nullable
   KSerializer<T> get(@NotNull KClass<Object> var1);

   default boolean isStored(@NotNull KClass<?> key) {
      Intrinsics.checkNotNullParameter(key, "key");
      return false;
   }

   public static final class DefaultImpls {
      /** @deprecated */
      @Deprecated
      public static <T> boolean isStored(@NotNull SerializerCache<T> $this, @NotNull KClass<?> key) {
         Intrinsics.checkNotNullParameter(key, "key");
         return $this.isStored(key);
      }
   }
}
