package kotlinx.serialization.internal;

import kotlin.PublishedApi;

@PublishedApi
public abstract class PrimitiveArrayBuilder<Array> {
   public abstract int getPosition$kotlinx_serialization_core();

   public abstract void ensureCapacity$kotlinx_serialization_core(int var1);

   // $FF: synthetic method
   public static void ensureCapacity$kotlinx_serialization_core$default(PrimitiveArrayBuilder var0, int var1, int var2, Object var3) {
      if (var3 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
      } else {
         if ((var2 & 1) != 0) {
            var1 = var0.getPosition$kotlinx_serialization_core() + 1;
         }

         var0.ensureCapacity$kotlinx_serialization_core(var1);
      }
   }

   public abstract Array build$kotlinx_serialization_core();
}
