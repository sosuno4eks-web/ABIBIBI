package kotlin.random;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.3"
)
public abstract class Random {
   @NotNull
   public static final Random.Default Default = new Random.Default((DefaultConstructorMarker)null);
   @NotNull
   private static final Random defaultRandom;

   public abstract int nextBits(int var1);

   public int nextInt() {
      return this.nextBits(32);
   }

   public int nextInt(int until) {
      return this.nextInt(0, until);
   }

   public int nextInt(int from, int until) {
      RandomKt.checkRangeBounds(from, until);
      int n = until - from;
      int rnd;
      if (n <= 0 && n != Integer.MIN_VALUE) {
         do {
            rnd = this.nextInt();
         } while(!(from <= rnd ? rnd < until : false));

         return rnd;
      } else {
         int var10000;
         int v;
         if ((n & -n) == n) {
            v = RandomKt.fastLog2(n);
            var10000 = this.nextBits(v);
         } else {
            boolean var7 = false;

            int bits;
            do {
               bits = this.nextInt() >>> 1;
               v = bits % n;
            } while(bits - v + (n - 1) < 0);

            var10000 = v;
         }

         rnd = var10000;
         return from + rnd;
      }
   }

   public long nextLong() {
      return ((long)this.nextInt() << 32) + (long)this.nextInt();
   }

   public long nextLong(long until) {
      return this.nextLong(0L, until);
   }

   public long nextLong(long from, long until) {
      RandomKt.checkRangeBounds(from, until);
      long n = until - from;
      long rnd;
      if (n <= 0L) {
         do {
            rnd = this.nextLong();
         } while(!(from <= rnd ? rnd < until : false));

         return rnd;
      } else {
         rnd = 0L;
         if ((n & -n) == n) {
            int nLow = (int)n;
            int nHigh = (int)(n >>> 32);
            long var10000;
            int bitCount;
            if (nLow != 0) {
               bitCount = RandomKt.fastLog2(nLow);
               var10000 = (long)this.nextBits(bitCount) & 4294967295L;
            } else if (nHigh == 1) {
               var10000 = (long)this.nextInt() & 4294967295L;
            } else {
               bitCount = RandomKt.fastLog2(nHigh);
               var10000 = ((long)this.nextBits(bitCount) << 32) + ((long)this.nextInt() & 4294967295L);
            }

            rnd = var10000;
         } else {
            long v = 0L;

            long bits;
            do {
               bits = this.nextLong() >>> 1;
               v = bits % n;
            } while(bits - v + (n - 1L) < 0L);

            rnd = v;
         }

         return from + rnd;
      }
   }

   public boolean nextBoolean() {
      return this.nextBits(1) != 0;
   }

   public double nextDouble() {
      return PlatformRandomKt.doubleFromParts(this.nextBits(26), this.nextBits(27));
   }

   public double nextDouble(double until) {
      return this.nextDouble(0.0D, until);
   }

   public double nextDouble(double from, double until) {
      RandomKt.checkRangeBounds(from, until);
      double size = until - from;
      double var10000;
      if (Double.isInfinite(size) && Math.abs(from) <= Double.MAX_VALUE && Math.abs(until) <= Double.MAX_VALUE) {
         double r1 = this.nextDouble() * (until / (double)2 - from / (double)2);
         var10000 = from + r1 + r1;
      } else {
         var10000 = from + this.nextDouble() * size;
      }

      double r = var10000;
      return r >= until ? Math.nextAfter(until, Double.NEGATIVE_INFINITY) : r;
   }

   public float nextFloat() {
      return (float)this.nextBits(24) / 1.6777216E7F;
   }

   @NotNull
   public byte[] nextBytes(@NotNull byte[] array, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter(array, "array");
      boolean position;
      String var11;
      if (!(0 <= fromIndex ? fromIndex <= array.length : false) || !(0 <= toIndex ? toIndex <= array.length : false)) {
         position = false;
         var11 = "fromIndex (" + fromIndex + ") or toIndex (" + toIndex + ") are out of range: 0.." + array.length + '.';
         throw new IllegalArgumentException(var11.toString());
      } else if (fromIndex > toIndex) {
         position = false;
         var11 = "fromIndex (" + fromIndex + ") must be not greater than toIndex (" + toIndex + ").";
         throw new IllegalArgumentException(var11.toString());
      } else {
         int steps = (toIndex - fromIndex) / 4;
         position = false;
         int position = fromIndex;

         int remainder;
         for(remainder = 0; remainder < steps; ++remainder) {
            int var8 = false;
            int v = this.nextInt();
            array[position] = (byte)v;
            array[position + 1] = (byte)(v >>> 8);
            array[position + 2] = (byte)(v >>> 16);
            array[position + 3] = (byte)(v >>> 24);
            position += 4;
         }

         remainder = toIndex - position;
         int vr = this.nextBits(remainder * 8);

         for(int i = 0; i < remainder; ++i) {
            array[position + i] = (byte)(vr >>> i * 8);
         }

         return array;
      }
   }

   // $FF: synthetic method
   public static byte[] nextBytes$default(Random var0, byte[] var1, int var2, int var3, int var4, Object var5) {
      if (var5 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
      } else {
         if ((var4 & 2) != 0) {
            var2 = 0;
         }

         if ((var4 & 4) != 0) {
            var3 = var1.length;
         }

         return var0.nextBytes(var1, var2, var3);
      }
   }

   @NotNull
   public byte[] nextBytes(@NotNull byte[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      return this.nextBytes(array, 0, array.length);
   }

   @NotNull
   public byte[] nextBytes(int size) {
      return this.nextBytes(new byte[size]);
   }

   static {
      defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
   }

   public static final class Default extends Random implements Serializable {
      private Default() {
      }

      private final Object writeReplace() {
         return Random.Default.Serialized.INSTANCE;
      }

      private final void readObject(ObjectInputStream input) {
         throw new InvalidObjectException("Deserialization is supported via proxy only");
      }

      public int nextBits(int bitCount) {
         return Random.defaultRandom.nextBits(bitCount);
      }

      public int nextInt() {
         return Random.defaultRandom.nextInt();
      }

      public int nextInt(int until) {
         return Random.defaultRandom.nextInt(until);
      }

      public int nextInt(int from, int until) {
         return Random.defaultRandom.nextInt(from, until);
      }

      public long nextLong() {
         return Random.defaultRandom.nextLong();
      }

      public long nextLong(long until) {
         return Random.defaultRandom.nextLong(until);
      }

      public long nextLong(long from, long until) {
         return Random.defaultRandom.nextLong(from, until);
      }

      public boolean nextBoolean() {
         return Random.defaultRandom.nextBoolean();
      }

      public double nextDouble() {
         return Random.defaultRandom.nextDouble();
      }

      public double nextDouble(double until) {
         return Random.defaultRandom.nextDouble(until);
      }

      public double nextDouble(double from, double until) {
         return Random.defaultRandom.nextDouble(from, until);
      }

      public float nextFloat() {
         return Random.defaultRandom.nextFloat();
      }

      @NotNull
      public byte[] nextBytes(@NotNull byte[] array) {
         Intrinsics.checkNotNullParameter(array, "array");
         return Random.defaultRandom.nextBytes(array);
      }

      @NotNull
      public byte[] nextBytes(int size) {
         return Random.defaultRandom.nextBytes(size);
      }

      @NotNull
      public byte[] nextBytes(@NotNull byte[] array, int fromIndex, int toIndex) {
         Intrinsics.checkNotNullParameter(array, "array");
         return Random.defaultRandom.nextBytes(array, fromIndex, toIndex);
      }

      // $FF: synthetic method
      public Default(DefaultConstructorMarker $constructor_marker) {
         this();
      }

      private static final class Serialized implements Serializable {
         @NotNull
         public static final Random.Default.Serialized INSTANCE = new Random.Default.Serialized();
         private static final long serialVersionUID = 0L;

         private final Object readResolve() {
            return Random.Default;
         }
      }
   }
}
