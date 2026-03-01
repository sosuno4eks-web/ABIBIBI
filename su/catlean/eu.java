package su.catlean;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_1304;
import net.minecraft.class_1322.class_1323;

// $FF: synthetic class
public final class eu {
   public static final int[] d;
   public static final int[] m;
   private static String[] l;

   static {
      long var0 = j0.a(1452176568548294681L, 2278826715174179436L, MethodHandles.lookup().lookupClass()).a(103952970348184L) ^ 114860233734620L;
      int[] var2 = new int[class_1304.values().length];
      null.A<invokedynamic>((Object)null, -8460107601307064002L, var0);

      try {
         var2[class_1304.field_6169.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         var2[class_1304.field_48824.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         var2[class_1304.field_6172.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         var2[class_1304.field_6166.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      d = var2;
      var2 = new int[class_1323.values().length];

      try {
         var2[class_1323.field_6328.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var2[class_1323.field_6330.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var2[class_1323.field_6331.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      m = var2;
   }

   public static void t(String[] var0) {
      l = var0;
   }

   public static String[] i() {
      return l;
   }
}
