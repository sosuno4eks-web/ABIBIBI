package kotlin.random;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {
   @NotNull
   private final <undefinedtype> implStorage = new ThreadLocal<java.util.Random>() {
      protected java.util.Random initialValue() {
         return new java.util.Random();
      }
   };

   @NotNull
   public java.util.Random getImpl() {
      Object var10000 = this.implStorage.get();
      Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
      return (java.util.Random)var10000;
   }
}
