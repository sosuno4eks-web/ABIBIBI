package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;

public final class qm implements Runnable {
   final int q;
   private static final long a = j0.a(8788001938540053143L, 1013600714851803332L, MethodHandles.lookup().lookupClass()).a(117812164931134L);

   public qm(int $delay) {
      this.q = var1;
   }

   public final void run() {
      long var1 = a ^ 137225934302317L;
      long var10001 = var1 ^ 25285562201020L;
      int var3 = (int)((var1 ^ 25285562201020L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      4945711097694645591L.A<invokedynamic>(4945711097694645591L, var1);
      Thread.sleep((long)this.q);
      boolean var7 = false;
      List var8 = xx.l.l((char)var3, var4, var5);
      xx.S().clear();
      xx.S().addAll((Collection)var8);

      try {
         if (4943174254572487155L.A<invokedynamic>(4943174254572487155L, var1) == null) {
            (new String[5]).A<invokedynamic>(new String[5], 4967925186617803404L, var1);
         }

      } catch (NumberFormatException var9) {
         throw var9.A<invokedynamic>(var9, 5022010567203144997L, var1);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
