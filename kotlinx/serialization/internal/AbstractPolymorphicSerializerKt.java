package kotlinx.serialization.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AbstractPolymorphicSerializerKt {
   @JvmName(
      name = "throwSubtypeNotRegistered"
   )
   @NotNull
   public static final Void throwSubtypeNotRegistered(@Nullable String subClassName, @NotNull KClass<?> baseClass) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      String scope = "in the polymorphic scope of '" + baseClass.getSimpleName() + '\'';
      throw new SerializationException(subClassName == null ? "Class discriminator was missing and no default serializers were registered " + scope + '.' : "Serializer for subclass '" + subClassName + "' is not found " + scope + ".\nCheck if class with serial name '" + subClassName + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + subClassName + "' has to be '@Serializable', and the base class '" + baseClass.getSimpleName() + "' has to be sealed and '@Serializable'.");
   }

   @JvmName(
      name = "throwSubtypeNotRegistered"
   )
   @NotNull
   public static final Void throwSubtypeNotRegistered(@NotNull KClass<?> subClass, @NotNull KClass<?> baseClass) {
      Intrinsics.checkNotNullParameter(subClass, "subClass");
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      String var10000 = subClass.getSimpleName();
      if (var10000 == null) {
         var10000 = String.valueOf(subClass);
      }

      throwSubtypeNotRegistered(var10000, baseClass);
      throw new KotlinNothingValueException();
   }
}
