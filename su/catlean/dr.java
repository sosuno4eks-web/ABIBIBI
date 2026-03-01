package su.catlean;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_2350;

// $FF: synthetic class
public final class dr {
   public static final int[] s;
   private static int k;

   static {
      long var0 = j0.a(4552042457230844497L, 7933781621299957396L, MethodHandles.lookup().lookupClass()).a(214686683565614L) ^ 30366284965948L;
      int[] var2 = new int[class_2350.values().length];
      106.A<invokedynamic>(106, -4213366287922935961L, var0);

      try {
         var2[class_2350.field_11034.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         var2[class_2350.field_11043.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var2[class_2350.field_11035.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[class_2350.field_11039.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      s = var2;
   }

   public static void w(int var0) {
      k = var0;
   }

   public static int r() {
      return k;
   }

   public static int C() {
      int var0 = r();

      try {
         return var0 == 0 ? 88 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
