package kotlinx.serialization.modules;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.internal.PlatformKt;
import org.jetbrains.annotations.NotNull;

public final class SerializersModuleBuilder implements SerializersModuleCollector {
   @NotNull
   private final Map<KClass<?>, ContextualProvider> class2ContextualProvider = (Map)(new HashMap());
   @NotNull
   private final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> polyBase2Serializers = (Map)(new HashMap());
   @NotNull
   private final Map<KClass<?>, Function1<?, SerializationStrategy<?>>> polyBase2DefaultSerializerProvider = (Map)(new HashMap());
   @NotNull
   private final Map<KClass<?>, Map<String, KSerializer<?>>> polyBase2NamedSerializers = (Map)(new HashMap());
   @NotNull
   private final Map<KClass<?>, Function1<String, DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider = (Map)(new HashMap());
   private boolean hasInterfaceContextualSerializers;

   public <T> void contextual(@NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer) {
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      registerSerializer$default(this, kClass, (ContextualProvider)(new ContextualProvider.Argless(serializer)), false, 4, (Object)null);
   }

   public <T> void contextual(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      Intrinsics.checkNotNullParameter(provider, "provider");
      registerSerializer$default(this, kClass, (ContextualProvider)(new ContextualProvider.WithTypeArguments(provider)), false, 4, (Object)null);
   }

   public <Base, Sub extends Base> void polymorphic(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> actualClass, @NotNull KSerializer<Sub> actualSerializer) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(actualClass, "actualClass");
      Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
      registerPolymorphicSerializer$default(this, baseClass, actualClass, actualSerializer, false, 8, (Object)null);
   }

   public <Base> void polymorphicDefaultSerializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
      this.registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, false);
   }

   public <Base> void polymorphicDefaultDeserializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
      this.registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, false);
   }

   public final void include(@NotNull SerializersModule module) {
      Intrinsics.checkNotNullParameter(module, "module");
      module.dumpTo((SerializersModuleCollector)this);
   }

   @JvmName(
      name = "registerSerializer"
   )
   public final <T> void registerSerializer(@NotNull KClass<T> forClass, @NotNull ContextualProvider provider, boolean allowOverwrite) {
      Intrinsics.checkNotNullParameter(forClass, "forClass");
      Intrinsics.checkNotNullParameter(provider, "provider");
      if (!allowOverwrite) {
         ContextualProvider previous = (ContextualProvider)this.class2ContextualProvider.get(forClass);
         if (previous != null && !Intrinsics.areEqual((Object)previous, (Object)provider)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
         }
      }

      this.class2ContextualProvider.put(forClass, provider);
      if (PlatformKt.isInterface(forClass)) {
         this.hasInterfaceContextualSerializers = true;
      }

   }

   // $FF: synthetic method
   public static void registerSerializer$default(SerializersModuleBuilder var0, KClass var1, ContextualProvider var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }

      var0.registerSerializer(var1, var2, var3);
   }

   @JvmName(
      name = "registerDefaultPolymorphicSerializer"
   )
   public final <Base> void registerDefaultPolymorphicSerializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider, boolean allowOverwrite) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
      Function1 previous = (Function1)this.polyBase2DefaultSerializerProvider.get(baseClass);
      if (previous != null && !Intrinsics.areEqual((Object)previous, (Object)defaultSerializerProvider) && !allowOverwrite) {
         throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + previous);
      } else {
         this.polyBase2DefaultSerializerProvider.put(baseClass, defaultSerializerProvider);
      }
   }

   @JvmName(
      name = "registerDefaultPolymorphicDeserializer"
   )
   public final <Base> void registerDefaultPolymorphicDeserializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider, boolean allowOverwrite) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
      Function1 previous = (Function1)this.polyBase2DefaultDeserializerProvider.get(baseClass);
      if (previous != null && !Intrinsics.areEqual((Object)previous, (Object)defaultDeserializerProvider) && !allowOverwrite) {
         throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + previous);
      } else {
         this.polyBase2DefaultDeserializerProvider.put(baseClass, defaultDeserializerProvider);
      }
   }

   @JvmName(
      name = "registerPolymorphicSerializer"
   )
   public final <Base, Sub extends Base> void registerPolymorphicSerializer(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> concreteClass, @NotNull KSerializer<Sub> concreteSerializer, boolean allowOverwrite) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
      Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
      String name = concreteSerializer.getDescriptor().getSerialName();
      Map names = this.polyBase2Serializers;
      int $i$f$getOrPut = false;
      Object value$iv = names.get(baseClass);
      Object var10000;
      if (value$iv == null) {
         int var11 = false;
         Object answer$iv = new HashMap();
         names.put(baseClass, answer$iv);
         var10000 = answer$iv;
      } else {
         var10000 = value$iv;
      }

      Map baseClassSerializers = (Map)var10000;
      Map $this$getOrPut$iv = this.polyBase2NamedSerializers;
      int $i$f$getOrPut = false;
      Object value$iv = $this$getOrPut$iv.get(baseClass);
      if (value$iv == null) {
         int var12 = false;
         Object answer$iv = new HashMap();
         $this$getOrPut$iv.put(baseClass, answer$iv);
         var10000 = answer$iv;
      } else {
         var10000 = value$iv;
      }

      names = (Map)var10000;
      KSerializer previousSerializer = (KSerializer)baseClassSerializers.get(concreteClass);
      KSerializer var25;
      if (previousSerializer != null && !Intrinsics.areEqual((Object)previousSerializer, (Object)concreteSerializer)) {
         if (!allowOverwrite) {
            throw new SerializerAlreadyRegisteredException(baseClass, concreteClass);
         }

         var25 = (KSerializer)names.remove(previousSerializer.getDescriptor().getSerialName());
      }

      KSerializer previousByName = (KSerializer)names.get(name);
      if (previousByName != null && !Intrinsics.areEqual((Object)previousByName, (Object)concreteSerializer)) {
         Sequence var13 = MapsKt.asSequence(baseClassSerializers);
         Iterator var14 = var13.iterator();

         while(true) {
            if (var14.hasNext()) {
               Object var15 = var14.next();
               Entry it = (Entry)var15;
               int var17 = false;
               if (it.getValue() != previousByName) {
                  continue;
               }

               var10000 = var15;
            } else {
               var10000 = null;
            }

            Entry var26 = (Entry)var10000;
            if (var26 == null) {
               throw new IllegalStateException(("Name " + name + " is registered in the module but no Kotlin class is associated with it.").toString());
            }

            KClass var27 = (KClass)var26.getKey();
            if (var27 == null) {
               throw new IllegalStateException(("Name " + name + " is registered in the module but no Kotlin class is associated with it.").toString());
            }

            KClass previousClass = var27;
            if (!allowOverwrite) {
               throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + baseClass + "' have the same serial name '" + name + "': " + concreteSerializer + " for '" + concreteClass + "' and " + previousByName + " for '" + previousClass + '\'');
            }

            var25 = (KSerializer)baseClassSerializers.remove(previousClass);
            break;
         }
      }

      baseClassSerializers.put(concreteClass, concreteSerializer);
      names.put(name, concreteSerializer);
   }

   // $FF: synthetic method
   public static void registerPolymorphicSerializer$default(SerializersModuleBuilder var0, KClass var1, KClass var2, KSerializer var3, boolean var4, int var5, Object var6) {
      if ((var5 & 8) != 0) {
         var4 = false;
      }

      var0.registerPolymorphicSerializer(var1, var2, var3, var4);
   }

   @PublishedApi
   @NotNull
   public final SerializersModule build() {
      return (SerializersModule)(new SerialModuleImpl(this.class2ContextualProvider, this.polyBase2Serializers, this.polyBase2DefaultSerializerProvider, this.polyBase2NamedSerializers, this.polyBase2DefaultDeserializerProvider, this.hasInterfaceContextualSerializers));
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
