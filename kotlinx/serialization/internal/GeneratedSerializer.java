package kotlinx.serialization.internal;

import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@InternalSerializationApi
public interface GeneratedSerializer<T> extends KSerializer<T> {
   @NotNull
   KSerializer<?>[] childSerializers();

   @NotNull
   default KSerializer<?>[] typeParametersSerializers() {
      return PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
   }

   public static final class DefaultImpls {
      /** @deprecated */
      @Deprecated
      @NotNull
      public static <T> KSerializer<?>[] typeParametersSerializers(@NotNull GeneratedSerializer<T> $this) {
         return $this.typeParametersSerializers();
      }
   }
}
