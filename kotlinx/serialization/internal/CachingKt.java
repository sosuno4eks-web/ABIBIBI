package kotlinx.serialization.internal;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

public final class CachingKt {
   private static final boolean useClassValue;

   @NotNull
   public static final <T> SerializerCache<T> createCache(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> factory) {
      Intrinsics.checkNotNullParameter(factory, "factory");
      return useClassValue ? (SerializerCache)(new ClassValueCache(factory)) : (SerializerCache)(new ConcurrentHashMapCache(factory));
   }

   @NotNull
   public static final <T> ParametrizedSerializerCache<T> createParametrizedCache(@NotNull Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> factory) {
      Intrinsics.checkNotNullParameter(factory, "factory");
      return useClassValue ? (ParametrizedSerializerCache)(new ClassValueParametrizedCache(factory)) : (ParametrizedSerializerCache)(new ConcurrentHashMapParametrizedCache(factory));
   }

   static {
      boolean var0;
      try {
         Class.forName("java.lang.ClassValue");
         var0 = true;
      } catch (Throwable var2) {
         var0 = false;
      }

      useClassValue = var0;
   }
}
