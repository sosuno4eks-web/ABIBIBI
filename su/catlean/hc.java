package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum hc {
   public static final hc NCP;
   public static final hc VANILLA;
   public static final hc STRICT_NCP;
   public static final hc NCP_2;
   private static final hc[] Z;
   private static final EnumEntries h;
   private static boolean d;

   @NotNull
   public static EnumEntries M() {
      return h;
   }

   private static final hc[] G() {
      hc[] var0 = new hc[]{NCP, VANILLA, STRICT_NCP, NCP_2};
      return var0;
   }

   static {
      long var9 = j0.a(189364068519343713L, 6167453853844369484L, MethodHandles.lookup().lookupClass()).a(82838534932148L) ^ 64421926858230L;
      if (!-8756182888414839654L.A<invokedynamic>(-8756182888414839654L, var9)) {
         true.A<invokedynamic>(true, -8770694574107069133L, var9);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[4];
      int var6 = 0;
      String var5 = "á*5\u0087pC»\u008d\b%\u0086Êîeìñê";
      int var7 = "á*5\u0087pC»\u008d\b%\u0086Êîeìñê".length();
      char var4 = '\b';
      int var3 = -1;

      label32:
      while(true) {
         ++var3;
         String var11 = var5.substring(var3, var3 + var4);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var1.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var8).intern();
            switch(var10001) {
            case 0:
               var0[var6++] = var15;
               if ((var3 += var4) >= var7) {
                  NCP = new hc(var0[1], 0);
                  VANILLA = new hc(var0[2], 1);
                  STRICT_NCP = new hc(var0[3], 2);
                  NCP_2 = new hc(var0[0], 3);
                  Z = G();
                  h = EnumEntriesKt.enumEntries((Enum[])Z);
                  return;
               }

               var4 = var5.charAt(var3);
               break;
            default:
               var0[var6++] = var15;
               if ((var3 += var4) < var7) {
                  var4 = var5.charAt(var3);
                  continue label32;
               }

               var5 = "`Ý?²uç \u0019\u0010\u00807§\u0004\u001a|§\u0097ñà>¿Ñ\u0011üN";
               var7 = "`Ý?²uç \u0019\u0010\u00807§\u0004\u001a|§\u0097ñà>¿Ñ\u0011üN".length();
               var4 = '\b';
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void Z(boolean var0) {
      d = var0;
   }

   public static boolean B() {
      return d;
   }

   public static boolean C() {
      boolean var0 = B();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else {
            char var6;
            byte var7;
            if (var5 < 224) {
               var6 = (char)((char)(var5 & 31) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            } else if (var4 < var2 - 2) {
               var6 = (char)((char)(var5 & 15) << 12);
               ++var4;
               var7 = var0[var4];
               var6 = (char)(var6 | (char)(var7 & 63) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            }
         }
      }

      return new String(var3, 0, var1);
   }
}
