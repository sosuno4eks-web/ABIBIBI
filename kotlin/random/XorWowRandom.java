package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public final class XorWowRandom extends Random implements Serializable {
   @NotNull
   private static final XorWowRandom.Companion Companion = new XorWowRandom.Companion((DefaultConstructorMarker)null);
   private int x;
   private int y;
   private int z;
   private int w;
   private int v;
   private int addend;
   private static final long serialVersionUID = 0L;

   public XorWowRandom(int x, int y, int z, int w, int v, int addend) {
      this.x = x;
      this.y = y;
      this.z = z;
      this.w = w;
      this.v = v;
      this.addend = addend;
      if ((this.x | this.y | this.z | this.w | this.v) == 0) {
         int var11 = false;
         String var12 = "Initial state must have at least one non-zero element.";
         throw new IllegalArgumentException(var12.toString());
      } else {
         byte var7 = 64;

         for(int var8 = 0; var8 < var7; ++var8) {
            int var10 = false;
            this.nextInt();
         }

      }
   }

   public XorWowRandom(int seed1, int seed2) {
      this(seed1, seed2, 0, 0, ~seed1, seed1 << 10 ^ seed2 >>> 4);
   }

   public int nextInt() {
      int t = this.x;
      t ^= t >>> 2;
      this.x = this.y;
      this.y = this.z;
      this.z = this.w;
      int v0 = this.v;
      this.w = v0;
      t = t ^ t << 1 ^ v0 ^ v0 << 4;
      this.v = t;
      this.addend += 362437;
      return t + this.addend;
   }

   public int nextBits(int bitCount) {
      return RandomKt.takeUpperBits(this.nextInt(), bitCount);
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
