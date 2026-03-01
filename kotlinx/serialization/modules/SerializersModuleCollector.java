package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import org.jetbrains.annotations.NotNull;

@ExperimentalSerializationApi
public interface SerializersModuleCollector {
   default <T> void contextual(@NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer) {
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      this.contextual(kClass, SerializersModuleCollector::contextual$lambda$0);
   }

   <T> void contextual(@NotNull KClass<T> var1, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> var2);

   <Base, Sub extends Base> void polymorphic(@NotNull KClass<Base> var1, @NotNull KClass<Sub> var2, @NotNull KSerializer<Sub> var3);

   <Base> void polymorphicDefaultSerializer(@NotNull KClass<Base> var1, @NotNull Function1<? super Base, ? extends SerializationStrategy<? super Base>> var2);

   <Base> void polymorphicDefaultDeserializer(@NotNull KClass<Base> var1, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> var2);

   /** @deprecated */
   @Deprecated(
      message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer",
      replaceWith = @ReplaceWith(
   expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)",
   imports = {}
),
      level = DeprecationLevel.WARNING
   )
   default <Base> void polymorphicDefault(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
      this.polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider);
   }

   private static KSerializer contextual$lambda$0(KSerializer $serializer, List it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return $serializer;
   }

   public static final class DefaultImpls {
      /** @deprecated */
      @java.lang.Deprecated
      public static <T> void contextual(@NotNull SerializersModuleCollector $this, @NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer) {
         Intrinsics.checkNotNullParameter(kClass, "kClass");
         Intrinsics.checkNotNullParameter(serializer, "serializer");
         $this.contextual(kClass, serializer);
      }

      /** @deprecated */
      @Deprecated(
         message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer",
         replaceWith = @ReplaceWith(
   expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)",
   imports = {}
),
         level = DeprecationLevel.WARNING
      )
      @java.lang.Deprecated
      public static <Base> void polymorphicDefault(@NotNull SerializersModuleCollector $this, @NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
         Intrinsics.checkNotNullParameter(baseClass, "baseClass");
         Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
         $this.polymorphicDefault(baseClass, defaultDeserializerProvider);
      }
   }
}
