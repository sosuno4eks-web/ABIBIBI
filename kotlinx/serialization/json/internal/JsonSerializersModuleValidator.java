package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.modules.SerializersModuleCollector;
import org.jetbrains.annotations.NotNull;

public final class JsonSerializersModuleValidator implements SerializersModuleCollector {
   @NotNull
   private final String discriminator;
   private final boolean useArrayPolymorphism;
   private final boolean isDiscriminatorRequired;

   public JsonSerializersModuleValidator(@NotNull JsonConfiguration configuration) {
      Intrinsics.checkNotNullParameter(configuration, "configuration");
      super();
      this.discriminator = configuration.getClassDiscriminator();
      this.useArrayPolymorphism = configuration.getUseArrayPolymorphism();
      this.isDiscriminatorRequired = configuration.getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE;
   }

   public <T> void contextual(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      Intrinsics.checkNotNullParameter(provider, "provider");
   }

   public <Base, Sub extends Base> void polymorphic(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> actualClass, @NotNull KSerializer<Sub> actualSerializer) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(actualClass, "actualClass");
      Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
      SerialDescriptor descriptor = actualSerializer.getDescriptor();
      this.checkKind(descriptor, actualClass);
      if (!this.useArrayPolymorphism && this.isDiscriminatorRequired) {
         this.checkDiscriminatorCollisions(descriptor, actualClass);
      }

   }

   private final void checkKind(SerialDescriptor descriptor, KClass<?> actualClass) {
      SerialKind kind = descriptor.getKind();
      if (!(kind instanceof PolymorphicKind) && !Intrinsics.areEqual((Object)kind, (Object)SerialKind.CONTEXTUAL.INSTANCE)) {
         if (!this.useArrayPolymorphism) {
            if (this.isDiscriminatorRequired) {
               if (Intrinsics.areEqual((Object)kind, (Object)StructureKind.LIST.INSTANCE) || Intrinsics.areEqual((Object)kind, (Object)StructureKind.MAP.INSTANCE) || kind instanceof PrimitiveKind || kind instanceof SerialKind.ENUM) {
                  throw new IllegalArgumentException("Serializer for " + actualClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
               }
            }
         }
      } else {
         throw new IllegalArgumentException("Serializer for " + actualClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
      }
   }

   private final void checkDiscriminatorCollisions(SerialDescriptor descriptor, KClass<?> actualClass) {
      int i = 0;

      for(int var4 = descriptor.getElementsCount(); i < var4; ++i) {
         String name = descriptor.getElementName(i);
         if (Intrinsics.areEqual((Object)name, (Object)this.discriminator)) {
            throw new IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + name + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
         }
      }

   }

   public <Base> void polymorphicDefaultSerializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
   }

   public <Base> void polymorphicDefaultDeserializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
   }

   public <T> void contextual(@NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer) {
      SerializersModuleCollector.super.contextual(kClass, serializer);
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
   public <Base> void polymorphicDefault(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
      SerializersModuleCollector.super.polymorphicDefault(baseClass, defaultDeserializerProvider);
   }
}
