package su.catlean;

import java.io.File;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

public final class kf {
   @NotNull
   private static final File a;
   @NotNull
   private static final File U;
   @NotNull
   private static final File w;
   @NotNull
   private static final File[] g;
   private static boolean j;

   @NotNull
   public static final File e() {
      return a;
   }

   @NotNull
   public static final File t() {
      return U;
   }

   @NotNull
   public static final File a() {
      return w;
   }

   @NotNull
   public static final File[] R() {
      return g;
   }

   static {
      long var9 = j0.a(3208678644084663413L, 7098539478508821417L, MethodHandles.lookup().lookupClass()).a(243456021978466L) ^ 74316709311547L;
      if (!6065551910983463712L.A<invokedynamic>(6065551910983463712L, var9)) {
         true.A<invokedynamic>(true, 6096823678793991270L, var9);
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
      String var5 = "<\u0016ÆD\u0004Çê÷\tïh:å 6\u007f\u0010e85@ÆêÂ/c:,\u0080Ð\u000bì\u0099";
      int var7 = "<\u0016ÆD\u0004Çê÷\tïh:å 6\u007f\u0010e85@ÆêÂ/c:,\u0080Ð\u000bì\u0099".length();
      char var4 = 16;
      int var3 = -1;

      label32:
      while(true) {
         ++var3;
         String var12 = var5.substring(var3, var3 + var4);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var1.doFinal(var12.getBytes("ISO-8859-1"));
            String var16 = a(var8).intern();
            switch(var10001) {
            case 0:
               var0[var6++] = var16;
               if ((var3 += var4) >= var7) {
                  var16 = System.getProperty(var0[1]);
                  a = new File(var16 + var0[3]);
                  U = new File(a + var0[2]);
                  w = new File(a + var0[0]);
                  File[] var11 = new File[]{a, U, w};
                  g = var11;
                  return;
               }

               var4 = var5.charAt(var3);
               break;
            default:
               var0[var6++] = var16;
               if ((var3 += var4) < var7) {
                  var4 = var5.charAt(var3);
                  continue label32;
               }

               var5 = "P\u0081wQF±\u008b\u008dôÄ9É\u009ei{%\b}¾.\u0011EÅ7±";
               var7 = "P\u0081wQF±\u008b\u008dôÄ9É\u009ei{%\b}¾.\u0011EÅ7±".length();
               var4 = 16;
               var3 = -1;
            }

            ++var3;
            var12 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void z(boolean var0) {
      j = var0;
   }

   public static boolean P() {
      return j;
   }

   public static boolean o() {
      boolean var0 = P();

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
