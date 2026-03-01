package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

// $FF: synthetic class
final class SerializersKt__SerializersKt {
   // $FF: synthetic method
   public static final <T> KSerializer<T> serializer() {
      int $i$f$serializer = false;
      Intrinsics.reifiedOperationMarker(6, "T");
      KSerializer $this$cast$iv = SerializersKt.serializer((KType)null);
      int $i$f$cast = false;
      Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
      return (KSerializer)$this$cast$iv;
   }

   // $FF: synthetic method
   public static final <T> KSerializer<T> serializer(SerializersModule $this$serializer) {
      Intrinsics.checkNotNullParameter($this$serializer, "<this>");
      int $i$f$serializer = false;
      Intrinsics.reifiedOperationMarker(6, "T");
      KSerializer $this$cast$iv = SerializersKt.serializer($this$serializer, (KType)null);
      int $i$f$cast = false;
      Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
      return (KSerializer)$this$cast$iv;
   }

   @NotNull
   public static final KSerializer<Object> serializer(@NotNull KType type) {
      Intrinsics.checkNotNullParameter(type, "type");
      return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
   }

   @ExperimentalSerializationApi
   @NotNull
   public static final KSerializer<Object> serializer(@NotNull KClass<?> kClass, @NotNull List<? extends KSerializer<?>> typeArgumentsSerializers, boolean isNullable) {
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
      return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), kClass, typeArgumentsSerializers, isNullable);
   }

   @Nullable
   public static final KSerializer<Object> serializerOrNull(@NotNull KType type) {
      Intrinsics.checkNotNullParameter(type, "type");
      return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
   }

   @NotNull
   public static final KSerializer<Object> serializer(@NotNull SerializersModule $this$serializer, @NotNull KType type) {
      Intrinsics.checkNotNullParameter($this$serializer, "<this>");
      Intrinsics.checkNotNullParameter(type, "type");
      KSerializer var10000 = serializerByKTypeImpl$SerializersKt__SerializersKt($this$serializer, type, true);
      if (var10000 == null) {
         PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type));
         throw new KotlinNothingValueException();
      } else {
         return var10000;
      }
   }

   @ExperimentalSerializationApi
   @NotNull
   public static final KSerializer<Object> serializer(@NotNull SerializersModule $this$serializer, @NotNull KClass<?> kClass, @NotNull List<? extends KSerializer<?>> typeArgumentsSerializers, boolean isNullable) {
      Intrinsics.checkNotNullParameter($this$serializer, "<this>");
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
      KSerializer var10000 = serializerByKClassImpl$SerializersKt__SerializersKt($this$serializer, kClass, typeArgumentsSerializers, isNullable);
      if (var10000 == null) {
         PlatformKt.platformSpecificSerializerNotRegistered(kClass);
         throw new KotlinNothingValueException();
      } else {
         return var10000;
      }
   }

   @Nullable
   public static final KSerializer<Object> serializerOrNull(@NotNull SerializersModule $this$serializerOrNull, @NotNull KType type) {
      Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
      Intrinsics.checkNotNullParameter(type, "type");
      return serializerByKTypeImpl$SerializersKt__SerializersKt($this$serializerOrNull, type, false);
   }

   private static final KSerializer<Object> serializerByKTypeImpl$SerializersKt__SerializersKt(SerializersModule $this$serializerByKTypeImpl, KType type, boolean failOnMissingTypeArgSerializer) {
      KClass rootClass = Platform_commonKt.kclass(type);
      boolean isNullable = type.isMarkedNullable();
      Iterable $this$map$iv = (Iterable)type.getArguments();
      int $i$f$map = false;
      Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
      int $i$f$cast = false;
      Iterator var11 = $this$map$iv.iterator();

      while(var11.hasNext()) {
         Object item$iv$iv = var11.next();
         KTypeProjection p0 = (KTypeProjection)item$iv$iv;
         int var14 = false;
         destination$iv$iv.add(Platform_commonKt.typeOrThrow(p0));
      }

      List typeArguments = (List)destination$iv$iv;
      KSerializer var10000;
      if (typeArguments.isEmpty()) {
         var10000 = PlatformKt.isInterface(rootClass) && SerializersModule.getContextual$default($this$serializerByKTypeImpl, rootClass, (List)null, 2, (Object)null) != null ? null : SerializersCacheKt.findCachedSerializer(rootClass, isNullable);
      } else if ($this$serializerByKTypeImpl.getHasInterfaceContextualSerializers$kotlinx_serialization_core()) {
         var10000 = null;
      } else {
         Object var17 = SerializersCacheKt.findParametrizedCachedSerializer(rootClass, typeArguments, isNullable);
         var10000 = (KSerializer)(Result.isFailure-impl(var17) ? null : var17);
      }

      KSerializer cachedSerializer = var10000;
      if (cachedSerializer != null) {
         return cachedSerializer;
      } else {
         if (typeArguments.isEmpty()) {
            var10000 = SerializersKt.serializerOrNull(rootClass);
            if (var10000 == null) {
               var10000 = SerializersModule.getContextual$default($this$serializerByKTypeImpl, rootClass, (List)null, 2, (Object)null);
               if (var10000 == null) {
                  int $i$f$polymorphicIfInterface = false;
                  var10000 = (KSerializer)(PlatformKt.isInterface(rootClass) ? new PolymorphicSerializer(rootClass) : null);
               }
            }
         } else {
            List var21 = SerializersKt.serializersForParameters($this$serializerByKTypeImpl, typeArguments, failOnMissingTypeArgSerializer);
            if (var21 == null) {
               return null;
            }

            List serializers = var21;
            var10000 = SerializersKt.parametrizedSerializerOrNull(rootClass, serializers, SerializersKt__SerializersKt::serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt);
            if (var10000 == null) {
               var10000 = $this$serializerByKTypeImpl.getContextual(rootClass, serializers);
               if (var10000 == null) {
                  int $i$f$polymorphicIfInterface = false;
                  var10000 = (KSerializer)(PlatformKt.isInterface(rootClass) ? new PolymorphicSerializer(rootClass) : null);
               }
            }
         }

         KSerializer contextualSerializer = var10000;
         if (contextualSerializer != null) {
            $i$f$cast = false;
            var10000 = nullable$SerializersKt__SerializersKt(contextualSerializer, isNullable);
         } else {
            var10000 = null;
         }

         return var10000;
      }
   }

   private static final KSerializer<Object> serializerByKClassImpl$SerializersKt__SerializersKt(SerializersModule $this$serializerByKClassImpl, KClass<Object> rootClass, List<? extends KSerializer<Object>> typeArgumentsSerializers, boolean isNullable) {
      KSerializer var10000;
      if (typeArgumentsSerializers.isEmpty()) {
         var10000 = SerializersKt.serializerOrNull(rootClass);
         if (var10000 == null) {
            var10000 = SerializersModule.getContextual$default($this$serializerByKClassImpl, rootClass, (List)null, 2, (Object)null);
         }
      } else {
         KSerializer var5;
         try {
            var10000 = SerializersKt.parametrizedSerializerOrNull(rootClass, typeArgumentsSerializers, SerializersKt__SerializersKt::serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt);
            if (var10000 == null) {
               var10000 = $this$serializerByKClassImpl.getContextual(rootClass, typeArgumentsSerializers);
            }

            var5 = var10000;
         } catch (IndexOutOfBoundsException var8) {
            throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", (Throwable)var8);
         }

         var10000 = var5;
      }

      KSerializer serializer = var10000;
      if (serializer != null) {
         int $i$f$cast = false;
         var10000 = nullable$SerializersKt__SerializersKt(serializer, isNullable);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   @Nullable
   public static final List<KSerializer<Object>> serializersForParameters(@NotNull SerializersModule $this$serializersForParameters, @NotNull List<? extends KType> typeArguments, boolean failOnMissingTypeArgSerializer) {
      Intrinsics.checkNotNullParameter($this$serializersForParameters, "<this>");
      Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
      Iterable $this$map$iv;
      boolean $i$f$map;
      Collection destination$iv$iv;
      boolean $i$f$mapTo;
      Iterator var9;
      Object item$iv$iv;
      KType it;
      boolean var12;
      List var10000;
      if (failOnMissingTypeArgSerializer) {
         $this$map$iv = (Iterable)typeArguments;
         $i$f$map = false;
         destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
         $i$f$mapTo = false;
         var9 = $this$map$iv.iterator();

         while(var9.hasNext()) {
            item$iv$iv = var9.next();
            it = (KType)item$iv$iv;
            var12 = false;
            destination$iv$iv.add(SerializersKt.serializer($this$serializersForParameters, it));
         }

         var10000 = (List)destination$iv$iv;
      } else {
         $this$map$iv = (Iterable)typeArguments;
         $i$f$map = false;
         destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
         $i$f$mapTo = false;
         var9 = $this$map$iv.iterator();

         while(var9.hasNext()) {
            item$iv$iv = var9.next();
            it = (KType)item$iv$iv;
            var12 = false;
            KSerializer var14 = SerializersKt.serializerOrNull($this$serializersForParameters, it);
            if (var14 == null) {
               return null;
            }

            destination$iv$iv.add(var14);
         }

         var10000 = (List)destination$iv$iv;
      }

      List serializers = var10000;
      return serializers;
   }

   @InternalSerializationApi
   @NotNull
   public static final <T> KSerializer<T> serializer(@NotNull KClass<T> $this$serializer) {
      Intrinsics.checkNotNullParameter($this$serializer, "<this>");
      KSerializer var10000 = SerializersKt.serializerOrNull($this$serializer);
      if (var10000 == null) {
         Platform_commonKt.serializerNotRegistered($this$serializer);
         throw new KotlinNothingValueException();
      } else {
         return var10000;
      }
   }

   @InternalSerializationApi
   @Nullable
   public static final <T> KSerializer<T> serializerOrNull(@NotNull KClass<T> $this$serializerOrNull) {
      Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
      KSerializer var10000 = PlatformKt.compiledSerializerImpl($this$serializerOrNull);
      if (var10000 == null) {
         var10000 = PrimitivesKt.builtinSerializerOrNull($this$serializerOrNull);
      }

      return var10000;
   }

   @Nullable
   public static final KSerializer<? extends Object> parametrizedSerializerOrNull(@NotNull KClass<Object> $this$parametrizedSerializerOrNull, @NotNull List<? extends KSerializer<Object>> serializers, @NotNull Function0<? extends KClassifier> elementClassifierIfArray) {
      Intrinsics.checkNotNullParameter($this$parametrizedSerializerOrNull, "<this>");
      Intrinsics.checkNotNullParameter(serializers, "serializers");
      Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
      KSerializer var10000 = builtinParametrizedSerializer$SerializersKt__SerializersKt($this$parametrizedSerializerOrNull, serializers, elementClassifierIfArray);
      if (var10000 == null) {
         var10000 = compiledParametrizedSerializer$SerializersKt__SerializersKt($this$parametrizedSerializerOrNull, serializers);
      }

      return var10000;
   }

   private static final KSerializer<? extends Object> compiledParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> $this$compiledParametrizedSerializer, List<? extends KSerializer<Object>> serializers) {
      Collection $this$toTypedArray$iv = (Collection)serializers;
      int $i$f$toTypedArray = false;
      KSerializer[] var2 = (KSerializer[])$this$toTypedArray$iv.toArray(new KSerializer[0]);
      return PlatformKt.constructSerializerForGivenTypeArgs($this$compiledParametrizedSerializer, (KSerializer[])Arrays.copyOf(var2, var2.length));
   }

   private static final KSerializer<? extends Object> builtinParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> $this$builtinParametrizedSerializer, List<? extends KSerializer<Object>> serializers, Function0<? extends KClassifier> elementClassifierIfArray) {
      KSerializer var10000;
      if (!Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(Collection.class)) && !Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(List.class)) && !Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(List.class)) && !Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(ArrayList.class))) {
         if (Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(HashSet.class))) {
            var10000 = (KSerializer)(new HashSetSerializer((KSerializer)serializers.get(0)));
         } else if (!Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(Set.class)) && !Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(Set.class)) && !Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            if (Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(HashMap.class))) {
               var10000 = (KSerializer)(new HashMapSerializer((KSerializer)serializers.get(0), (KSerializer)serializers.get(1)));
            } else if (!Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(Map.class)) && !Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(Map.class)) && !Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
               if (Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(Entry.class))) {
                  var10000 = BuiltinSerializersKt.MapEntrySerializer((KSerializer)serializers.get(0), (KSerializer)serializers.get(1));
               } else if (Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(Pair.class))) {
                  var10000 = BuiltinSerializersKt.PairSerializer((KSerializer)serializers.get(0), (KSerializer)serializers.get(1));
               } else if (Intrinsics.areEqual((Object)$this$builtinParametrizedSerializer, (Object)Reflection.getOrCreateKotlinClass(Triple.class))) {
                  var10000 = BuiltinSerializersKt.TripleSerializer((KSerializer)serializers.get(0), (KSerializer)serializers.get(1), (KSerializer)serializers.get(2));
               } else if (PlatformKt.isReferenceArray($this$builtinParametrizedSerializer)) {
                  Object var4 = elementClassifierIfArray.invoke();
                  Intrinsics.checkNotNull(var4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                  var10000 = BuiltinSerializersKt.ArraySerializer((KClass)var4, (KSerializer)serializers.get(0));
               } else {
                  var10000 = null;
               }
            } else {
               var10000 = (KSerializer)(new LinkedHashMapSerializer((KSerializer)serializers.get(0), (KSerializer)serializers.get(1)));
            }
         } else {
            var10000 = (KSerializer)(new LinkedHashSetSerializer((KSerializer)serializers.get(0)));
         }
      } else {
         var10000 = (KSerializer)(new ArrayListSerializer((KSerializer)serializers.get(0)));
      }

      return var10000;
   }

   private static final <T> KSerializer<T> nullable$SerializersKt__SerializersKt(KSerializer<T> $this$nullable, boolean shouldBeNullable) {
      if (shouldBeNullable) {
         return BuiltinSerializersKt.getNullable($this$nullable);
      } else {
         Intrinsics.checkNotNull($this$nullable, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
         return $this$nullable;
      }
   }

   @PublishedApi
   @NotNull
   public static final KSerializer<?> noCompiledSerializer(@NotNull String forClass) {
      Intrinsics.checkNotNullParameter(forClass, "forClass");
      throw new SerializationException(Platform_commonKt.notRegisteredMessage(forClass));
   }

   @PublishedApi
   @NotNull
   public static final KSerializer<?> noCompiledSerializer(@NotNull SerializersModule module, @NotNull KClass<?> kClass) {
      Intrinsics.checkNotNullParameter(module, "module");
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      KSerializer var10000 = SerializersModule.getContextual$default(module, kClass, (List)null, 2, (Object)null);
      if (var10000 == null) {
         Platform_commonKt.serializerNotRegistered(kClass);
         throw new KotlinNothingValueException();
      } else {
         return var10000;
      }
   }

   @PublishedApi
   @NotNull
   public static final KSerializer<?> noCompiledSerializer(@NotNull SerializersModule module, @NotNull KClass<?> kClass, @NotNull KSerializer<?>[] argSerializers) {
      Intrinsics.checkNotNullParameter(module, "module");
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
      KSerializer var10000 = module.getContextual(kClass, ArraysKt.asList(argSerializers));
      if (var10000 == null) {
         Platform_commonKt.serializerNotRegistered(kClass);
         throw new KotlinNothingValueException();
      } else {
         return var10000;
      }
   }

   @PublishedApi
   @NotNull
   public static final KSerializer<?> moduleThenPolymorphic(@NotNull SerializersModule module, @NotNull KClass<?> kClass) {
      Intrinsics.checkNotNullParameter(module, "module");
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      KSerializer var10000 = SerializersModule.getContextual$default(module, kClass, (List)null, 2, (Object)null);
      if (var10000 == null) {
         var10000 = (KSerializer)(new PolymorphicSerializer(kClass));
      }

      return var10000;
   }

   @PublishedApi
   @NotNull
   public static final KSerializer<?> moduleThenPolymorphic(@NotNull SerializersModule module, @NotNull KClass<?> kClass, @NotNull KSerializer<?>[] argSerializers) {
      Intrinsics.checkNotNullParameter(module, "module");
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
      KSerializer var10000 = module.getContextual(kClass, ArraysKt.asList(argSerializers));
      if (var10000 == null) {
         var10000 = (KSerializer)(new PolymorphicSerializer(kClass));
      }

      return var10000;
   }

   private static final KClassifier serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(List $typeArguments) {
      return ((KType)$typeArguments.get(0)).getClassifier();
   }

   private static final KClassifier serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt() {
      throw new SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
   }
}
