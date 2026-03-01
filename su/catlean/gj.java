package su.catlean;

import java.lang.invoke.MethodHandles;

public final class gj implements Runnable {
   final int N;
   private static String x;
   private static final long a = j0.a(5780929792202836939L, 4916170783263549135L, MethodHandles.lookup().lookupClass()).a(24621184865383L);

   public gj(int $delay) {
      this.N = var1;
   }

   public final void run() {
      long var1 = a ^ 42370190863446L;
      long var10001 = var1 ^ 20905788154328L;
      int var3 = (int)((var1 ^ 20905788154328L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      Thread.sleep((long)this.N);
      boolean var7 = false;
      String var10000 = -1297415440758199668L.A<invokedynamic>(-1297415440758199668L, var1);
      yr.v.f((char)var3, var4, (char)var5);
      String var6 = var10000;

      try {
         if (var6 != null) {
            (new int[3]).A<invokedynamic>(new int[3], -1317651475480367603L, var1);
         }

      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, -1335871552450166682L, var1);
      }
   }

   public static void U(String var0) {
      x = var0;
   }

   public static String v() {
      return x;
   }

   static {
      long var0 = a ^ 39017677836090L;
      if (-3561605743687824928L.A<invokedynamic>(-3561605743687824928L, var0) != null) {
         "Dm2EBc".A<invokedynamic>("Dm2EBc", -3584573360997568259L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
