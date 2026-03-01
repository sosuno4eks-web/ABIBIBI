package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum h8 {
   public static final h8 STRICT_STRAFE;
   public static final h8 MATRIX;
   public static final h8 NCP;
   public static final h8 GRIM_ENTITY;
   public static final h8 FIREWORK;
   public static final h8 OLD_MATRIX;
   private static final h8[] x;
   private static final EnumEntries R;
   private static final long a = j0.a(3255034369902306788L, 955017662598173886L, MethodHandles.lookup().lookupClass()).a(230727308591816L);
   private static final long b;

   @NotNull
   public static EnumEntries B() {
      return R;
   }

   private static final h8[] t(long var0) {
      long var10000 = a ^ var0;
      h8[] var2 = new h8[(int)b];
      var2[0] = STRICT_STRAFE;
      var2[1] = MATRIX;
      var2[2] = NCP;
      var2[3] = GRIM_ENTITY;
      var2[4] = FIREWORK;
      var2[5] = OLD_MATRIX;
      return var2;
   }

   static {
      long var14 = a ^ 74976183606965L;
      long var16 = var14 ^ 78056823265532L;
      Cipher var6;
      Cipher var10000 = var6 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var7 = 1; var7 < 8; ++var7) {
         var10003[var7] = (byte)((int)(var14 << var7 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var5 = new String[6];
      int var11 = 0;
      String var10 = "ßb»®Ø\u008f'\u008c\bi4Ó¦°¡`s\u0010DW¹{vroñ\u0080y\u0092Qp\"W_\u0010\u0017\u0089\u009d^w¢ÜS\u00adIgI\fæOX";
      int var12 = "ßb»®Ø\u008f'\u008c\bi4Ó¦°¡`s\u0010DW¹{vroñ\u0080y\u0092Qp\"W_\u0010\u0017\u0089\u009d^w¢ÜS\u00adIgI\fæOX".length();
      char var9 = '\b';
      int var8 = -1;

      label37:
      while(true) {
         ++var8;
         String var18 = var10.substring(var8, var8 + var9);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var6.doFinal(var18.getBytes("ISO-8859-1"));
            String var23 = a(var13).intern();
            switch(var10001) {
            case 0:
               var5[var11++] = var23;
               if ((var8 += var9) >= var12) {
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -2083574704646049274L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var25 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var21 = true;
                  b = var25;
                  STRICT_STRAFE = new h8(var5[5], 0);
                  MATRIX = new h8(var5[1], 1);
                  NCP = new h8(var5[0], 2);
                  GRIM_ENTITY = new h8(var5[2], 3);
                  FIREWORK = new h8(var5[4], 4);
                  OLD_MATRIX = new h8(var5[3], 5);
                  x = t(var16);
                  R = EnumEntriesKt.enumEntries((Enum[])x);
                  return;
               }

               var9 = var10.charAt(var8);
               break;
            default:
               var5[var11++] = var23;
               if ((var8 += var9) < var12) {
                  var9 = var10.charAt(var8);
                  continue label37;
               }

               var10 = "\u009fQ&G¯J\u0018*öX²ï\u000f\u0016\u009f\u0097\u0010\u008e\u0089ÒÒâ\u0083\u0084XcüÑ[\\¢\u008a_";
               var12 = "\u009fQ&G¯J\u0018*öX²ï\u000f\u0016\u009f\u0097\u0010\u008e\u0089ÒÒâ\u0083\u0084XcüÑ[\\¢\u008a_".length();
               var9 = 16;
               var8 = -1;
            }

            ++var8;
            var18 = var10.substring(var8, var8 + var9);
            var10001 = 0;
         }
      }
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
