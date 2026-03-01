package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

final class ConcurrentHashMapParametrizedCache<T> implements ParametrizedSerializerCache<T> {
   @NotNull
   private final Function2<KClass<Object>, List<? extends KType>, KSerializer<T>> compute;
   @NotNull
   private final ConcurrentHashMap<Class<?>, ParametrizedCacheEntry<T>> cache;

   public ConcurrentHashMapParametrizedCache(@NotNull Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> compute) {
      Intrinsics.checkNotNullParameter(compute, "compute");
      super();
      this.compute = compute;
      this.cache = new ConcurrentHashMap();
   }

   @NotNull
   public Object get_gIAlu_s/* $FF was: get-gIAlu-s*/(@NotNull KClass<Object> key, @NotNull List<? extends KType> types) {
      Intrinsics.checkNotNullParameter(key, "key");
      Intrinsics.checkNotNullParameter(types, "types");
      ConcurrentMap $this$getOrPut$iv = (ConcurrentMap)this.cache;
      Object key$iv = JvmClassMappingKt.getJavaClass(key);
      int $i$f$getOrPut = false;
      Object var10000 = $this$getOrPut$iv.get(key$iv);
      if (var10000 == null) {
         int var6 = false;
         Object default$iv = new ParametrizedCacheEntry();
         int var8 = false;
         var10000 = $this$getOrPut$iv.putIfAbsent(key$iv, default$iv);
         if (var10000 == null) {
            var10000 = default$iv;
         }
      }

      ParametrizedCacheEntry this_$iv = (ParametrizedCacheEntry)var10000;
      $i$f$getOrPut = false;
      Iterable $this$map$iv$iv = (Iterable)types;
      int $i$f$map = false;
      Collection destination$iv$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv$iv, 10)));
      int $i$f$mapTo = false;
      Iterator var11 = $this$map$iv$iv.iterator();

      boolean var15;
      while(var11.hasNext()) {
         Object item$iv$iv$iv = var11.next();
         KType it$iv = (KType)item$iv$iv$iv;
         var15 = false;
         destination$iv$iv$iv.add(new KTypeWrapper(it$iv));
      }

      List wrappedTypes$iv = (List)destination$iv$iv$iv;
      ConcurrentMap $this$getOrPut$iv$iv = (ConcurrentMap)ParametrizedCacheEntry.access$getSerializers$p(this_$iv);
      int $i$f$getOrPut = false;
      var10000 = $this$getOrPut$iv$iv.get(wrappedTypes$iv);
      if (var10000 == null) {
         $i$f$mapTo = false;

         Object var24;
         Result.Companion var27;
         try {
            var27 = Result.Companion;
            int var25 = false;
            int var17 = false;
            var24 = Result.constructor-impl((KSerializer)this.compute.invoke(key, types));
         } catch (Throwable var18) {
            var27 = Result.Companion;
            var24 = Result.constructor-impl(ResultKt.createFailure(var18));
         }

         Object default$iv$iv = Result.box-impl(var24);
         var15 = false;
         var10000 = $this$getOrPut$iv$iv.putIfAbsent(wrappedTypes$iv, default$iv$iv);
         if (var10000 == null) {
            var10000 = default$iv$iv;
         }
      }

      Intrinsics.checkNotNullExpressionValue(var10000, "getOrPut(...)");
      return ((Result)var10000).unbox-impl();
   }
}
