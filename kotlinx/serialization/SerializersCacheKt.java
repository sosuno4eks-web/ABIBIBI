package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.SerializerCache;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SerializersCacheKt {
   @NotNull
   private static final SerializerCache<? extends Object> SERIALIZERS_CACHE = CachingKt.createCache(SerializersCacheKt::SERIALIZERS_CACHE$lambda$0);
   @NotNull
   private static final SerializerCache<Object> SERIALIZERS_CACHE_NULLABLE = CachingKt.createCache(SerializersCacheKt::SERIALIZERS_CACHE_NULLABLE$lambda$1);
   @NotNull
   private static final ParametrizedSerializerCache<? extends Object> PARAMETRIZED_SERIALIZERS_CACHE = CachingKt.createParametrizedCache(SerializersCacheKt::PARAMETRIZED_SERIALIZERS_CACHE$lambda$3);
   @NotNull
   private static final ParametrizedSerializerCache<Object> PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE = CachingKt.createParametrizedCache(SerializersCacheKt::PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5);

   @NotNull
   public static final SerializerCache<? extends Object> getSERIALIZERS_CACHE() {
      return SERIALIZERS_CACHE;
   }

   /** @deprecated */
   // $FF: synthetic method
   public static void getSERIALIZERS_CACHE$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   private static void getSERIALIZERS_CACHE_NULLABLE$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   private static void getPARAMETRIZED_SERIALIZERS_CACHE$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   private static void getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations() {
   }

   @Nullable
   public static final KSerializer<Object> findCachedSerializer(@NotNull KClass<Object> clazz, boolean isNullable) {
      Intrinsics.checkNotNullParameter(clazz, "clazz");
      KSerializer var10000;
      if (!isNullable) {
         var10000 = SERIALIZERS_CACHE.get(clazz);
         if (var10000 != null) {
            KSerializer $this$cast$iv = var10000;
            int $i$f$cast = false;
            var10000 = $this$cast$iv;
         } else {
            var10000 = null;
         }
      } else {
         var10000 = SERIALIZERS_CACHE_NULLABLE.get(clazz);
      }

      return var10000;
   }

   @NotNull
   public static final Object findParametrizedCachedSerializer(@NotNull KClass<Object> clazz, @NotNull List<? extends KType> types, boolean isNullable) {
      Intrinsics.checkNotNullParameter(clazz, "clazz");
      Intrinsics.checkNotNullParameter(types, "types");
      return !isNullable ? PARAMETRIZED_SERIALIZERS_CACHE.get-gIAlu-s(clazz, types) : PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.get-gIAlu-s(clazz, types);
   }

   @Nullable
   public static final PolymorphicSerializer<? extends Object> polymorphicIfInterface(@NotNull KClass<?> $this$polymorphicIfInterface) {
      Intrinsics.checkNotNullParameter($this$polymorphicIfInterface, "<this>");
      int $i$f$polymorphicIfInterface = false;
      return PlatformKt.isInterface($this$polymorphicIfInterface) ? new PolymorphicSerializer($this$polymorphicIfInterface) : null;
   }

   private static final KSerializer SERIALIZERS_CACHE$lambda$0(KClass it) {
      Intrinsics.checkNotNullParameter(it, "it");
      KSerializer var10000 = SerializersKt.serializerOrNull(it);
      if (var10000 == null) {
         int $i$f$polymorphicIfInterface = false;
         var10000 = (KSerializer)(PlatformKt.isInterface(it) ? new PolymorphicSerializer(it) : null);
      }

      return var10000;
   }

   private static final KSerializer SERIALIZERS_CACHE_NULLABLE$lambda$1(KClass it) {
      Intrinsics.checkNotNullParameter(it, "it");
      KSerializer var10000 = SerializersKt.serializerOrNull(it);
      boolean $i$f$cast;
      if (var10000 == null) {
         $i$f$cast = false;
         var10000 = (KSerializer)(PlatformKt.isInterface(it) ? new PolymorphicSerializer(it) : null);
      }

      if (var10000 != null) {
         var10000 = BuiltinSerializersKt.getNullable(var10000);
         if (var10000 != null) {
            KSerializer $this$cast$iv = var10000;
            $i$f$cast = false;
            var10000 = $this$cast$iv;
            return var10000;
         }
      }

      var10000 = null;
      return var10000;
   }

   private static final KClassifier PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(List $types) {
      return ((KType)$types.get(0)).getClassifier();
   }

   private static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(KClass clazz, List types) {
      Intrinsics.checkNotNullParameter(clazz, "clazz");
      Intrinsics.checkNotNullParameter(types, "types");
      List var10000 = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
      Intrinsics.checkNotNull(var10000);
      List serializers = var10000;
      return SerializersKt.parametrizedSerializerOrNull(clazz, serializers, SerializersCacheKt::PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2);
   }

   private static final KClassifier PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(List $types) {
      return ((KType)$types.get(0)).getClassifier();
   }

   private static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(KClass clazz, List types) {
      Intrinsics.checkNotNullParameter(clazz, "clazz");
      Intrinsics.checkNotNullParameter(types, "types");
      List var10000 = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
      Intrinsics.checkNotNull(var10000);
      List serializers = var10000;
      KSerializer var5 = SerializersKt.parametrizedSerializerOrNull(clazz, serializers, SerializersCacheKt::PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4);
      if (var5 != null) {
         var5 = BuiltinSerializersKt.getNullable(var5);
         if (var5 != null) {
            KSerializer $this$cast$iv = var5;
            int $i$f$cast = false;
            var5 = $this$cast$iv;
            return var5;
         }
      }

      var5 = null;
      return var5;
   }
}
