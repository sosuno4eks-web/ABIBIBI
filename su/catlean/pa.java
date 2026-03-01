package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

public final class pa {
   @NotNull
   private static final p5 U;
   @NotNull
   private static final p5 l;
   @NotNull
   private static final p5 L;
   @NotNull
   private static final p5 S;
   @NotNull
   private static final p5 k;
   @NotNull
   private static final p5 m;
   @NotNull
   private static final p5 q;
   @NotNull
   private static final p5 B;
   @NotNull
   private static final p5 b;
   @NotNull
   private static final p5 T;
   @NotNull
   private static final p5 s;
   private static k9[] i;

   @NotNull
   public static final p5 N() {
      return U;
   }

   @NotNull
   public static final p5 Q() {
      return l;
   }

   @NotNull
   public static final p5 w() {
      return L;
   }

   @NotNull
   public static final p5 E() {
      return S;
   }

   @NotNull
   public static final p5 c() {
      return k;
   }

   @NotNull
   public static final p5 g() {
      return m;
   }

   @NotNull
   public static final p5 W() {
      return q;
   }

   @NotNull
   public static final p5 m() {
      return B;
   }

   @NotNull
   public static final p5 b() {
      return b;
   }

   @NotNull
   public static final p5 e() {
      return T;
   }

   @NotNull
   public static final p5 V() {
      return s;
   }

   static {
      long var9 = j0.a(2390329529922926075L, 2639089597173665018L, MethodHandles.lookup().lookupClass()).a(14429222964460L) ^ 60573771367167L;
      long var11 = var9 ^ 122158023268560L;
      if (1654306958297405514L.A<invokedynamic>(1654306958297405514L, var9) == null) {
         (new k9[4]).A<invokedynamic>(new k9[4], 1587135570167063523L, var9);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[11];
      int var6 = 0;
      String var5 = "ð°Ú©\u0093\u0098\u009f\u009cnµîy°\u009dûý\b\u0090iÜÃuXÄ~\b\u0005\u0091þ\u0010âÙ¶J\b²8(«i\u0092e+\b¾Vó\u008aÉIfd\bÑè $Ñèð\u000e\b\u00821»ÖØ\u0011K?\b|u\t\u0017x\u009a£\u0097\bn\u0011Eê\u0013\u0015©\u0004";
      int var7 = "ð°Ú©\u0093\u0098\u009f\u009cnµîy°\u009dûý\b\u0090iÜÃuXÄ~\b\u0005\u0091þ\u0010âÙ¶J\b²8(«i\u0092e+\b¾Vó\u008aÉIfd\bÑè $Ñèð\u000e\b\u00821»ÖØ\u0011K?\b|u\t\u0017x\u009a£\u0097\bn\u0011Eê\u0013\u0015©\u0004".length();
      char var4 = 16;
      int var3 = -1;

      label32:
      while(true) {
         ++var3;
         String var13 = var5.substring(var3, var3 + var4);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var17 = a(var8).intern();
            switch(var10001) {
            case 0:
               var0[var6++] = var17;
               if ((var3 += var4) >= var7) {
                  U = new p5(var0[1], var11);
                  l = new p5(var0[8], var11);
                  L = new p5(var0[5], var11);
                  S = new p5(var0[4], var11);
                  k = new p5(var0[9], var11);
                  m = new p5(var0[0], var11);
                  q = new p5(var0[10], var11);
                  B = new p5(var0[6], var11);
                  b = new p5(var0[3], var11);
                  T = new p5(var0[2], var11);
                  s = new p5(var0[7], var11);
                  return;
               }

               var4 = var5.charAt(var3);
               break;
            default:
               var0[var6++] = var17;
               if ((var3 += var4) < var7) {
                  var4 = var5.charAt(var3);
                  continue label32;
               }

               var5 = "3eÙÒãì\u0019\u008f\b\u0001:\u0091sò5\u009c\u009a";
               var7 = "3eÙÒãì\u0019\u008f\b\u0001:\u0091sò5\u009c\u009a".length();
               var4 = '\b';
               var3 = -1;
            }

            ++var3;
            var13 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void t(k9[] var0) {
      i = var0;
   }

   public static k9[] C() {
      return i;
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
