package kotlin.random;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class KotlinRandom extends java.util.Random {
   @NotNull
   private static final KotlinRandom.Companion Companion = new KotlinRandom.Companion((DefaultConstructorMarker)null);
   @NotNull
   private final Random impl;
   private boolean seedInitialized;
   private static final long serialVersionUID = 0L;

   public KotlinRandom(@NotNull Random impl) {
      Intrinsics.checkNotNullParameter(impl, "impl");
      super();
      this.impl = impl;
   }

   @NotNull
   public final Random getImpl() {
      return this.impl;
   }

   protected int next(int bits) {
      return this.impl.nextBits(bits);
   }

   public int nextInt() {
      return this.impl.nextInt();
   }

   public int nextInt(int bound) {
      return this.impl.nextInt(bound);
   }

   public boolean nextBoolean() {
      return this.impl.nextBoolean();
   }

   public long nextLong() {
      return this.impl.nextLong();
   }

   public float nextFloat() {
      return this.impl.nextFloat();
   }

   public double nextDouble() {
      return this.impl.nextDouble();
   }

   public void nextBytes(@NotNull byte[] bytes) {
      Intrinsics.checkNotNullParameter(bytes, "bytes");
      this.impl.nextBytes(bytes);
   }

   public void setSeed(long seed) {
      if (!this.seedInitialized) {
         this.seedInitialized = true;
      } else {
         throw new UnsupportedOperationException("Setting seed is not supported.");
      }
   }

   private static final class Companion {
      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
