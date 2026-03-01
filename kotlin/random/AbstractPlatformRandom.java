package kotlin.random;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractPlatformRandom extends Random {
   @NotNull
   public abstract java.util.Random getImpl();

   public int nextBits(int bitCount) {
      return RandomKt.takeUpperBits(this.getImpl().nextInt(), bitCount);
   }

   public int nextInt() {
      return this.getImpl().nextInt();
   }

   public int nextInt(int until) {
      return this.getImpl().nextInt(until);
   }

   public long nextLong() {
      return this.getImpl().nextLong();
   }

   public boolean nextBoolean() {
      return this.getImpl().nextBoolean();
   }

   public double nextDouble() {
      return this.getImpl().nextDouble();
   }

   public float nextFloat() {
      return this.getImpl().nextFloat();
   }

   @NotNull
   public byte[] nextBytes(@NotNull byte[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      int var4 = false;
      this.getImpl().nextBytes(array);
      return array;
   }
}
