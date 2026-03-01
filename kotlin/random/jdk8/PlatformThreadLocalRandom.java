package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.AbstractPlatformRandom;
import org.jetbrains.annotations.NotNull;

public final class PlatformThreadLocalRandom extends AbstractPlatformRandom {
   @NotNull
   public Random getImpl() {
      ThreadLocalRandom var10000 = ThreadLocalRandom.current();
      Intrinsics.checkNotNullExpressionValue(var10000, "current(...)");
      return (Random)var10000;
   }

   public int nextInt(int from, int until) {
      return ThreadLocalRandom.current().nextInt(from, until);
   }

   public long nextLong(long until) {
      return ThreadLocalRandom.current().nextLong(until);
   }

   public long nextLong(long from, long until) {
      return ThreadLocalRandom.current().nextLong(from, until);
   }

   public double nextDouble(double until) {
      return ThreadLocalRandom.current().nextDouble(until);
   }
}
