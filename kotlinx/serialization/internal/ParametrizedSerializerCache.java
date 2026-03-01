package kotlinx.serialization.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

public interface ParametrizedSerializerCache<T> {
   @NotNull
   Object get_gIAlu_s/* $FF was: get-gIAlu-s*/(@NotNull KClass<Object> var1, @NotNull List<? extends KType> var2);

   // $FF: synthetic method
   static Object get_gIAlu_s$default/* $FF was: get-gIAlu-s$default*/(ParametrizedSerializerCache var0, KClass var1, List var2, int var3, Object var4) {
      if (var4 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
      } else {
         if ((var3 & 2) != 0) {
            var2 = CollectionsKt.emptyList();
         }

         return var0.get-gIAlu-s(var1, var2);
      }
   }

   public static final class DefaultImpls {
      // $FF: synthetic method
      public static Object get_gIAlu_s$default/* $FF was: get-gIAlu-s$default*/(ParametrizedSerializerCache var0, KClass var1, List var2, int var3, Object var4) {
         return ParametrizedSerializerCache.get-gIAlu-s$default(var0, var1, var2, var3, var4);
      }
   }
}
