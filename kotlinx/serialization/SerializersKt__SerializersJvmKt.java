package kotlinx.serialization;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

// $FF: synthetic class
final class SerializersKt__SerializersJvmKt {
   @NotNull
   public static final KSerializer<Object> serializer(@NotNull Type type) {
      Intrinsics.checkNotNullParameter(type, "type");
      return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
   }

   @Nullable
   public static final KSerializer<Object> serializerOrNull(@NotNull Type type) {
      Intrinsics.checkNotNullParameter(type, "type");
      return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
   }

   @NotNull
   public static final KSerializer<Object> serializer(@NotNull SerializersModule $this$serializer, @NotNull Type type) {
      Intrinsics.checkNotNullParameter($this$serializer, "<this>");
      Intrinsics.checkNotNullParameter(type, "type");
      KSerializer var10000 = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt($this$serializer, type, true);
      if (var10000 == null) {
         PlatformKt.serializerNotRegistered(prettyClass$SerializersKt__SerializersJvmKt(type));
         throw new KotlinNothingValueException();
      } else {
         return var10000;
      }
   }

   @Nullable
   public static final KSerializer<Object> serializerOrNull(@NotNull SerializersModule $this$serializerOrNull, @NotNull Type type) {
      Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
      Intrinsics.checkNotNullParameter(type, "type");
      return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt($this$serializerOrNull, type, false);
   }

   private static final KSerializer<Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(SerializersModule $this$serializerByJavaTypeImpl, Type type, boolean failOnMissingTypeArgSerializer) {
      KSerializer var10000;
      if (type instanceof GenericArrayType) {
         var10000 = genericArraySerializer$SerializersKt__SerializersJvmKt($this$serializerByJavaTypeImpl, (GenericArrayType)type, failOnMissingTypeArgSerializer);
      } else if (type instanceof Class) {
         var10000 = typeSerializer$SerializersKt__SerializersJvmKt($this$serializerByJavaTypeImpl, (Class)type, failOnMissingTypeArgSerializer);
      } else if (type instanceof ParameterizedType) {
         Type var24 = ((ParameterizedType)type).getRawType();
         Intrinsics.checkNotNull(var24, "null cannot be cast to non-null type java.lang.Class<*>");
         Class rootClass = (Class)var24;
         Type[] args = ((ParameterizedType)type).getActualTypeArguments();
         boolean $i$f$map;
         Type[] $this$mapTo$iv$iv;
         Collection destination$iv$iv;
         boolean $i$f$mapTo;
         int var12;
         int var13;
         Type item$iv$iv;
         boolean var16;
         List var26;
         if (failOnMissingTypeArgSerializer) {
            Intrinsics.checkNotNull(args);
            $i$f$map = false;
            $this$mapTo$iv$iv = args;
            destination$iv$iv = (Collection)(new ArrayList(args.length));
            $i$f$mapTo = false;
            var12 = 0;

            for(var13 = args.length; var12 < var13; ++var12) {
               item$iv$iv = $this$mapTo$iv$iv[var12];
               var16 = false;
               Intrinsics.checkNotNull(item$iv$iv);
               destination$iv$iv.add(SerializersKt.serializer($this$serializerByJavaTypeImpl, item$iv$iv));
            }

            var26 = (List)destination$iv$iv;
         } else {
            Intrinsics.checkNotNull(args);
            $i$f$map = false;
            $this$mapTo$iv$iv = args;
            destination$iv$iv = (Collection)(new ArrayList(args.length));
            $i$f$mapTo = false;
            var12 = 0;

            for(var13 = args.length; var12 < var13; ++var12) {
               item$iv$iv = $this$mapTo$iv$iv[var12];
               var16 = false;
               Intrinsics.checkNotNull(item$iv$iv);
               var10000 = SerializersKt.serializerOrNull($this$serializerByJavaTypeImpl, item$iv$iv);
               if (var10000 == null) {
                  return null;
               }

               destination$iv$iv.add(var10000);
            }

            var26 = (List)destination$iv$iv;
         }

         List argsSerializers = var26;
         if (Set.class.isAssignableFrom(rootClass)) {
            var10000 = BuiltinSerializersKt.SetSerializer((KSerializer)argsSerializers.get(0));
            Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
         } else if (!List.class.isAssignableFrom(rootClass) && !Collection.class.isAssignableFrom(rootClass)) {
            if (Map.class.isAssignableFrom(rootClass)) {
               var10000 = BuiltinSerializersKt.MapSerializer((KSerializer)argsSerializers.get(0), (KSerializer)argsSerializers.get(1));
               Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            } else if (Entry.class.isAssignableFrom(rootClass)) {
               var10000 = BuiltinSerializersKt.MapEntrySerializer((KSerializer)argsSerializers.get(0), (KSerializer)argsSerializers.get(1));
               Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            } else if (Pair.class.isAssignableFrom(rootClass)) {
               var10000 = BuiltinSerializersKt.PairSerializer((KSerializer)argsSerializers.get(0), (KSerializer)argsSerializers.get(1));
               Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            } else if (Triple.class.isAssignableFrom(rootClass)) {
               var10000 = BuiltinSerializersKt.TripleSerializer((KSerializer)argsSerializers.get(0), (KSerializer)argsSerializers.get(1), (KSerializer)argsSerializers.get(2));
               Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            } else {
               Iterable $this$map$iv = (Iterable)argsSerializers;
               int $i$f$map = false;
               Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
               int $i$f$mapTo = false;
               Iterator var22 = $this$map$iv.iterator();

               while(var22.hasNext()) {
                  Object item$iv$iv = var22.next();
                  KSerializer it = (KSerializer)item$iv$iv;
                  var16 = false;
                  Intrinsics.checkNotNull(it, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                  destination$iv$iv.add(it);
               }

               List varargs = (List)destination$iv$iv;
               var10000 = reflectiveOrContextual$SerializersKt__SerializersJvmKt($this$serializerByJavaTypeImpl, rootClass, varargs);
            }
         } else {
            var10000 = BuiltinSerializersKt.ListSerializer((KSerializer)argsSerializers.get(0));
            Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
         }
      } else {
         if (!(type instanceof WildcardType)) {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.getOrCreateKotlinClass(type.getClass()));
         }

         Type[] var10001 = ((WildcardType)type).getUpperBounds();
         Intrinsics.checkNotNullExpressionValue(var10001, "getUpperBounds(...)");
         Object var25 = ArraysKt.first((Object[])var10001);
         Intrinsics.checkNotNullExpressionValue(var25, "first(...)");
         var10000 = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default($this$serializerByJavaTypeImpl, (Type)var25, false, 2, (Object)null);
      }

      return var10000;
   }

   // $FF: synthetic method
   static KSerializer serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(SerializersModule var0, Type var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = true;
      }

      return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(var0, var1, var2);
   }

   private static final KSerializer<Object> typeSerializer$SerializersKt__SerializersJvmKt(SerializersModule $this$typeSerializer, Class<?> type, boolean failOnMissingTypeArgSerializer) {
      KSerializer var10000;
      if (type.isArray() && !type.getComponentType().isPrimitive()) {
         Class var6 = type.getComponentType();
         Intrinsics.checkNotNullExpressionValue(var6, "getComponentType(...)");
         Class eType = var6;
         if (failOnMissingTypeArgSerializer) {
            var10000 = SerializersKt.serializer($this$typeSerializer, (Type)eType);
         } else {
            var10000 = SerializersKt.serializerOrNull($this$typeSerializer, (Type)eType);
            if (var10000 == null) {
               return null;
            }
         }

         KSerializer s = var10000;
         KClass var7 = JvmClassMappingKt.getKotlinClass(eType);
         Intrinsics.checkNotNull(var7, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
         KSerializer arraySerializer = BuiltinSerializersKt.ArraySerializer(var7, s);
         Intrinsics.checkNotNull(arraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
         var10000 = arraySerializer;
      } else {
         Intrinsics.checkNotNull(type, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
         var10000 = reflectiveOrContextual$SerializersKt__SerializersJvmKt($this$typeSerializer, type, CollectionsKt.emptyList());
      }

      return var10000;
   }

   private static final <T> KSerializer<T> reflectiveOrContextual$SerializersKt__SerializersJvmKt(SerializersModule $this$reflectiveOrContextual, Class<T> jClass, List<? extends KSerializer<Object>> typeArgumentsSerializers) {
      Collection $this$toTypedArray$iv = (Collection)typeArgumentsSerializers;
      int $i$f$toTypedArray = false;
      KSerializer[] var4 = (KSerializer[])$this$toTypedArray$iv.toArray(new KSerializer[0]);
      KSerializer var3 = PlatformKt.constructSerializerForGivenTypeArgs(jClass, (KSerializer[])Arrays.copyOf(var4, var4.length));
      if (var3 != null) {
         $i$f$toTypedArray = false;
         return var3;
      } else {
         KClass kClass = JvmClassMappingKt.getKotlinClass(jClass);
         KSerializer var10000 = PrimitivesKt.builtinSerializerOrNull(kClass);
         if (var10000 == null) {
            var10000 = $this$reflectiveOrContextual.getContextual(kClass, typeArgumentsSerializers);
            if (var10000 == null) {
               var10000 = jClass.isInterface() ? (KSerializer)(new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass(jClass))) : null;
            }
         }

         return var10000;
      }
   }

   private static final KSerializer<Object> genericArraySerializer$SerializersKt__SerializersJvmKt(SerializersModule $this$genericArraySerializer, GenericArrayType type, boolean failOnMissingTypeArgSerializer) {
      Type it = type.getGenericComponentType();
      int var6 = false;
      Type var8;
      if (it instanceof WildcardType) {
         Type[] var10000 = ((WildcardType)it).getUpperBounds();
         Intrinsics.checkNotNullExpressionValue(var10000, "getUpperBounds(...)");
         var8 = (Type)ArraysKt.first((Object[])var10000);
      } else {
         var8 = it;
      }

      Type eType = var8;
      KSerializer var10;
      if (failOnMissingTypeArgSerializer) {
         Intrinsics.checkNotNull(eType);
         var10 = SerializersKt.serializer($this$genericArraySerializer, eType);
      } else {
         Intrinsics.checkNotNull(eType);
         var10 = SerializersKt.serializerOrNull($this$genericArraySerializer, eType);
         if (var10 == null) {
            return null;
         }
      }

      KSerializer serializer = var10;
      KClass var11;
      if (eType instanceof ParameterizedType) {
         var8 = ((ParameterizedType)eType).getRawType();
         Intrinsics.checkNotNull(var8, "null cannot be cast to non-null type java.lang.Class<*>");
         var11 = JvmClassMappingKt.getKotlinClass((Class)var8);
      } else {
         if (!(eType instanceof KClass)) {
            throw new IllegalStateException("unsupported type in GenericArray: " + Reflection.getOrCreateKotlinClass(eType.getClass()));
         }

         var11 = (KClass)eType;
      }

      KClass var9 = var11;
      Intrinsics.checkNotNull(var9, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
      var10 = BuiltinSerializersKt.ArraySerializer(var9, serializer);
      Intrinsics.checkNotNull(var10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
      return var10;
   }

   private static final Class<?> prettyClass$SerializersKt__SerializersJvmKt(Type $this$prettyClass) {
      Class var10000;
      if ($this$prettyClass instanceof Class) {
         var10000 = (Class)$this$prettyClass;
      } else {
         Type var2;
         if ($this$prettyClass instanceof ParameterizedType) {
            var2 = ((ParameterizedType)$this$prettyClass).getRawType();
            Intrinsics.checkNotNullExpressionValue(var2, "getRawType(...)");
            var10000 = prettyClass$SerializersKt__SerializersJvmKt(var2);
         } else if ($this$prettyClass instanceof WildcardType) {
            Type[] var3 = ((WildcardType)$this$prettyClass).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(var3, "getUpperBounds(...)");
            Object var4 = ArraysKt.first((Object[])var3);
            Intrinsics.checkNotNullExpressionValue(var4, "first(...)");
            var10000 = prettyClass$SerializersKt__SerializersJvmKt((Type)var4);
         } else {
            if (!($this$prettyClass instanceof GenericArrayType)) {
               throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + $this$prettyClass + " has type " + Reflection.getOrCreateKotlinClass($this$prettyClass.getClass()));
            }

            var2 = ((GenericArrayType)$this$prettyClass).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(var2, "getGenericComponentType(...)");
            var10000 = prettyClass$SerializersKt__SerializersJvmKt(var2);
         }
      }

      return var10000;
   }
}
