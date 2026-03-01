package kotlinx.serialization.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class MutableSoftReference<T> {
   @JvmField
   @NotNull
   public volatile SoftReference<T> reference = new SoftReference((Object)null);

   public MutableSoftReference() {
   }

   public final synchronized T getOrSetWithLock(@NotNull Function0<? extends T> factory) {
      Intrinsics.checkNotNullParameter(factory, "factory");
      Object var10000 = this.reference.get();
      if (var10000 != null) {
         Object it = var10000;
         int var4 = false;
         return it;
      } else {
         Object value = factory.invoke();
         this.reference = new SoftReference(value);
         return value;
      }
   }
}
