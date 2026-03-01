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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

final class ParametrizedCacheEntry<T> {
   @NotNull
   private final ConcurrentHashMap<List<KTypeWrapper>, Result<KSerializer<T>>> serializers = new ConcurrentHashMap();

   public ParametrizedCacheEntry() {
   }

   @NotNull
   public final Object computeIfAbsent_gIAlu_s/* $FF was: computeIfAbsent-gIAlu-s*/(@NotNull List<? extends KType> types, @NotNull Function0<? extends KSerializer<T>> producer) {
      Intrinsics.checkNotNullParameter(types, "types");
      Intrinsics.checkNotNullParameter(producer, "producer");
      int var3 = false;
      Iterable $this$map$iv = (Iterable)types;
      int $i$f$map = false;
      Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
      int $i$f$mapTo = false;
      Iterator var10 = $this$map$iv.iterator();

      boolean var13;
      while(var10.hasNext()) {
         Object item$iv$iv = var10.next();
         KType it = (KType)item$iv$iv;
         var13 = false;
         destination$iv$iv.add(new KTypeWrapper(it));
      }

      List wrappedTypes = (List)destination$iv$iv;
      ConcurrentMap $this$getOrPut$iv = (ConcurrentMap)access$getSerializers$p(this);
      int $i$f$getOrPut = false;
      Object var10000 = $this$getOrPut$iv.get(wrappedTypes);
      if (var10000 == null) {
         $i$f$mapTo = false;

         Object var18;
         Result.Companion var21;
         try {
            var21 = Result.Companion;
            int var19 = false;
            var18 = Result.constructor-impl((KSerializer)producer.invoke());
         } catch (Throwable var15) {
            var21 = Result.Companion;
            var18 = Result.constructor-impl(ResultKt.createFailure(var15));
         }

         Object default$iv = Result.box-impl(var18);
         var13 = false;
         var10000 = $this$getOrPut$iv.putIfAbsent(wrappedTypes, default$iv);
         if (var10000 == null) {
            var10000 = default$iv;
         }
      }

      Intrinsics.checkNotNullExpressionValue(var10000, "getOrPut(...)");
      return ((Result)var10000).unbox-impl();
   }

   // $FF: synthetic method
   public static final ConcurrentHashMap access$getSerializers$p(ParametrizedCacheEntry $this) {
      return $this.serializers;
   }
}
