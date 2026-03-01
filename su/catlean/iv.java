package su.catlean;

import java.lang.invoke.MethodHandles;

public final class iv {
   private long D;
   private static String[] n;
   private static final long a = j0.a(2306408701680638261L, 7162253051968424335L, MethodHandles.lookup().lookupClass()).a(43851856044808L);

   public iv() {
      this.a();
   }

   public final boolean C(int ms, long a) {
      var2 ^= a;
      String[] var4 = 8904435293360094035L.A<invokedynamic>(8904435293360094035L, var2);

      int var10000;
      label32: {
         try {
            long var6;
            var10000 = (var6 = s8.Z() - this.D - (long)var1) == 0L ? 0 : (var6 < 0L ? -1 : 1);
            if (var4 == null) {
               return (boolean)var10000;
            }

            if (var10000 >= 0) {
               break label32;
            }
         } catch (NumberFormatException var5) {
            throw var5.A<invokedynamic>(var5, 8906666898008334535L, var2);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   public final boolean a(long a, int ms) {
      // $FF: Couldn't be decompiled
   }

   public final void H(int ms) {
      this.D = System.currentTimeMillis() - (long)var1;
   }

   public final long D() {
      return s8.Z() - this.D;
   }

   public final void a() {
      this.D = s8.Z();
   }

   public static void F(String[] var0) {
      n = var0;
   }

   public static String[] A() {
      return n;
   }

   static {
      long var0 = a ^ 74344207313850L;
      if (-6358884720542996735L.A<invokedynamic>(-6358884720542996735L, var0) == null) {
         (new String[1]).A<invokedynamic>(new String[1], -6412129515879314970L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
