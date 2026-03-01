package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum af {
   public static final af NORMAL;
   public static final af STRICT;
   public static final af OLD;
   public static final af NEW;
   private static final af[] H;
   private static final EnumEntries V;
   private static String K;

   @NotNull
   public static EnumEntries h() {
      return V;
   }

   private static final af[] f() {
      af[] var0 = new af[]{NORMAL, STRICT, OLD, NEW};
      return var0;
   }

   static {
      long var9 = j0.a(6621719115570244433L, 5276186260065760494L, MethodHandles.lookup().lookupClass()).a(138381320077755L) ^ 12285980781663L;
      if (8036741508600789799L.A<invokedynamic>(8036741508600789799L, var9) != null) {
         "cAZ0zb".A<invokedynamic>("cAZ0zb", 8049175572039710148L, var9);
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
      String var5 = "\f\u000e\u008dçÅßZø\b\u008f\u0080\u0084\u009d$\u0082D\u0086";
      int var7 = "\f\u000e\u008dçÅßZø\b\u008f\u0080\u0084\u009d$\u0082D\u0086".length();
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
                  NORMAL = new af(var0[2], 0);
                  STRICT = new af(var0[1], 1);
                  OLD = new af(var0[3], 2);
                  NEW = new af(var0[0], 3);
                  H = f();
                  V = EnumEntriesKt.enumEntries((Enum[])H);
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

               var5 = "\u0095E\u0093\u0002e\u008dÑ-\bÿë¸i\u0005F\u008cî";
               var7 = "\u0095E\u0093\u0002e\u008dÑ-\bÿë¸i\u0005F\u008cî".length();
               var4 = '\b';
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void K(String var0) {
      K = var0;
   }

   public static String P() {
      return K;
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
