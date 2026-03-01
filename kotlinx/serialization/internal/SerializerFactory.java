package kotlinx.serialization.internal;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
@Deprecated(
   message = "Inserted into generated code and should not be used directly",
   level = DeprecationLevel.HIDDEN
)
public interface SerializerFactory {
   @NotNull
   KSerializer<?> serializer(@NotNull KSerializer<?>... var1);
}
