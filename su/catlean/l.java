package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class l implements Runnable {
   final int J;
   final k9 s;
   private static int[] E;
   private static final long a = j0.a(5066193255030369265L, 4850479928681404872L, MethodHandles.lookup().lookupClass()).a(227869189435436L);

   public l(int var1, k9 var2) {
      this.J = var1;
      this.s = var2;
   }

   public final void run() {
      long var1 = a ^ 78523691877163L;
      long var10001 = var1 ^ 13725899109390L;
      int var3 = (int)((var1 ^ 13725899109390L) >>> 32);
      int var4 = (int)(var10001 << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      Thread.sleep((long)this.J);
      boolean var7 = false;
      int[] var10000 = -3718315994201940051L.A<invokedynamic>(-3718315994201940051L, var1);
      Iterable var8 = (Iterable)e1.L();
      boolean var9 = false;
      Iterator var10 = var8.iterator();
      int[] var6 = var10000;

      label57:
      while(true) {
         boolean var22 = var10.hasNext();

         label54:
         while(var22) {
            Object var11 = var10.next();
            c_ var12 = (c_)var11;
            boolean var13 = false;
            Iterable var14 = (Iterable)var12.m();
            boolean var15 = false;
            if (var6 != null) {
               return;
            }

            Iterator var16 = var14.iterator();

            while(var16.hasNext()) {
               Object var17 = var16.next();
               ba var18 = (ba)var17;
               boolean var19 = false;

               label64: {
                  try {
                     if (var6 != null) {
                        break label64;
                     }

                     var22 = Intrinsics.areEqual((Object)var18.x(), (Object)this.s);
                     if (var6 != null) {
                        continue label54;
                     }
                  } catch (NumberFormatException var21) {
                     throw var21.A<invokedynamic>(var21, -3689922478552108126L, var1);
                  }

                  try {
                     if (var22) {
                        var18.Y(var3, (short)var4, (short)var5);
                     }
                  } catch (NumberFormatException var20) {
                     throw var20.A<invokedynamic>(var20, -3689922478552108126L, var1);
                  }
               }

               if (var6 != null) {
                  break;
               }
            }

            if (var6 == null) {
               continue label57;
            }

            return;
         }

         return;
      }
   }

   public static void D(int[] var0) {
      E = var0;
   }

   public static int[] l() {
      return E;
   }

   static {
      long var0 = a ^ 13379478483105L;
      if (-4600303546684377L.A<invokedynamic>(-4600303546684377L, var0) != null) {
         (new int[3]).A<invokedynamic>(new int[3], -30453473519954061L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
