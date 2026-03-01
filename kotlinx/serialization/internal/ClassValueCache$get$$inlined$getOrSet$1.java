package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

public final class ClassValueCache$get$$inlined$getOrSet$1 implements Function0<T> {
   // $FF: synthetic field
   final ClassValueCache this$0;
   // $FF: synthetic field
   final KClass $key$inlined;

   public ClassValueCache$get$$inlined$getOrSet$1(ClassValueCache var1, KClass var2) {
      this.this$0 = var1;
      this.$key$inlined = var2;
   }

   public final T invoke() {
      int var1 = false;
      return new CacheEntry((KSerializer)this.this$0.getCompute().invoke(this.$key$inlined));
   }
}
