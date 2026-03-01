package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum gr {
   public static final gr OFF;
   public static final gr COMETS;
   public static final gr SELECTION;
   public static final gr BLOOM_CIRCLE;
   private static final gr[] L;
   private static final EnumEntries Y;
   private static boolean d;

   @NotNull
   public static EnumEntries O() {
      return Y;
   }

   private static final gr[] g() {
      gr[] var0 = new gr[]{OFF, COMETS, SELECTION, BLOOM_CIRCLE};
      return var0;
   }

   static {
      long var9 = j0.a(5519523256609586721L, 9114147081010019394L, MethodHandles.lookup().lookupClass()).a(9061998332113L) ^ 55484582341381L;
      if (9104371555537645685L.A<invokedynamic>(9104371555537645685L, var9)) {
         true.A<invokedynamic>(true, 9087755059462808660L, var9);
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
      String var5 = "¶8JÌÍÂY2\b/!÷)\u0084 { ";
      int var7 = "¶8JÌÍÂY2\b/!÷)\u0084 { ".length();
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
                  OFF = new gr(var0[0], 0);
                  COMETS = new gr(var0[1], 1);
                  SELECTION = new gr(var0[2], 2);
                  BLOOM_CIRCLE = new gr(var0[3], 3);
                  L = g();
                  Y = EnumEntriesKt.enumEntries((Enum[])L);
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

               var5 = "¾è´jcÅ+zæw\u0098Jò,¿ÿ\u0010Ô\u0002Z\u0086\u001fa\u008bBP\u008b\u00809µ\u0091>Ç";
               var7 = "¾è´jcÅ+zæw\u0098Jò,¿ÿ\u0010Ô\u0002Z\u0086\u001fa\u008bBP\u008b\u00809µ\u0091>Ç".length();
               var4 = 16;
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void e(boolean var0) {
      d = var0;
   }

   public static boolean I() {
      return d;
   }

   public static boolean y() {
      boolean var0 = I();

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
