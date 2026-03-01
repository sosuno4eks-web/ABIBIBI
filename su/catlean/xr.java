package su.catlean;

import java.lang.invoke.MethodHandles;

public final class xr implements Runnable {
   final int e;
   final boolean X;
   private static int[] C;
   private static final long a = j0.a(435958886112885047L, 7875026119366948772L, MethodHandles.lookup().lookupClass()).a(225668756558551L);

   public xr(int var1, boolean var2) {
      this.e = var1;
      this.X = var2;
   }

   public final void run() {
      long var1 = a ^ 90739737139819L;
      long var10001 = var1 ^ 63984895968652L;
      int var3 = (int)((var1 ^ 63984895968652L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 98842831887835L;
      int var6 = (int)((var1 ^ 98842831887835L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      int[] var10000 = 327703911513740620L.A<invokedynamic>(327703911513740620L, var1);
      Thread.sleep((long)this.e);
      int[] var9 = var10000;
      boolean var10 = false;

      try {
         km var12 = km.q;
         km.r(iy.t(var6, var7, o6.V, (short)var8, km.X((short)var3, km.q, var4, var5), this.X));
         if (var9 == null) {
            (new int[3]).A<invokedynamic>(new int[3], 336540838949734160L, var1);
         }

      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, 333034613572780281L, var1);
      }
   }

   public static void R(int[] var0) {
      C = var0;
   }

   public static int[] O() {
      return C;
   }

   static {
      long var0 = a ^ 98159663484682L;
      if (1291749385194651693L.A<invokedynamic>(1291749385194651693L, var0) == null) {
         (new int[3]).A<invokedynamic>(new int[3], 1273111040752336537L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
