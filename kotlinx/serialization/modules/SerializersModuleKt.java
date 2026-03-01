package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import org.jetbrains.annotations.NotNull;

public final class SerializersModuleKt {
   /** @deprecated */
   @NotNull
   private static final SerializersModule EmptySerializersModule = (SerializersModule)(new SerialModuleImpl(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), false));

   /** @deprecated */
   @NotNull
   public static final SerializersModule getEmptySerializersModule() {
      return EmptySerializersModule;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Deprecated in the favour of 'EmptySerializersModule()'",
      replaceWith = @ReplaceWith(
   expression = "EmptySerializersModule()",
   imports = {}
),
      level = DeprecationLevel.WARNING
   )
   public static void getEmptySerializersModule$annotations() {
   }

   @NotNull
   public static final SerializersModule plus(@NotNull SerializersModule $this$plus, @NotNull SerializersModule other) {
      Intrinsics.checkNotNullParameter($this$plus, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      int $i$f$SerializersModule = false;
      SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
      int var5 = false;
      builder$iv.include($this$plus);
      builder$iv.include(other);
      return builder$iv.build();
   }

   @NotNull
   public static final SerializersModule overwriteWith(@NotNull SerializersModule $this$overwriteWith, @NotNull SerializersModule other) {
      Intrinsics.checkNotNullParameter($this$overwriteWith, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      int $i$f$SerializersModule = false;
      final SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
      int var5 = false;
      builder$iv.include($this$overwriteWith);
      other.dumpTo((SerializersModuleCollector)(new SerializersModuleCollector() {
         public <T> void contextual(KClass<T> kClass, KSerializer<T> serializer) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            builder$iv.registerSerializer(kClass, (ContextualProvider)(new ContextualProvider.Argless(serializer)), true);
         }

         public <T> void contextual(KClass<T> kClass, Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(provider, "provider");
            builder$iv.registerSerializer(kClass, (ContextualProvider)(new ContextualProvider.WithTypeArguments(provider)), true);
         }

         public <Base, Sub extends Base> void polymorphic(KClass<Base> baseClass, KClass<Sub> actualClass, KSerializer<Sub> actualSerializer) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(actualClass, "actualClass");
            Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
            builder$iv.registerPolymorphicSerializer(baseClass, actualClass, actualSerializer, true);
         }

         public <Base> void polymorphicDefaultSerializer(KClass<Base> baseClass, Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
            builder$iv.registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, true);
         }

         public <Base> void polymorphicDefaultDeserializer(KClass<Base> baseClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
            builder$iv.registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, true);
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
         public <Base> void polymorphicDefault(KClass<Base> baseClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
            SerializersModuleCollector.super.polymorphicDefault(baseClass, defaultDeserializerProvider);
         }
      }));
      return builder$iv.build();
   }
}
