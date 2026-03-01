package kotlinx.serialization.modules;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
   public SerializerAlreadyRegisteredException(@NotNull String msg) {
      Intrinsics.checkNotNullParameter(msg, "msg");
      super(msg);
   }

   public SerializerAlreadyRegisteredException(@NotNull KClass<?> baseClass, @NotNull KClass<?> concreteClass) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
      this("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
   }
}
