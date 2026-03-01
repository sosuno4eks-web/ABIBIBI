package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum z4 {
   public static final z4 NONE;
   public static final z4 RANDOM;
   public static final z4 ROAMING;
   public static final z4 SINE;
   public static final z4 DRUNK_SINE;
   private static final z4[] J;
   private static final EnumEntries M;
   private static String V;

   @NotNull
   public static EnumEntries Z() {
      return M;
   }

   private static final z4[] v() {
      z4[] var0 = new z4[]{NONE, RANDOM, ROAMING, SINE, DRUNK_SINE};
      return var0;
   }

   static {
      long var9 = j0.a(3850696354058517338L, 4176697140059882680L, MethodHandles.lookup().lookupClass()).a(142027017309628L) ^ 25977306745150L;
      if (-3906255503003690433L.A<invokedynamic>(-3906255503003690433L, var9) != null) {
         "D5B7U".A<invokedynamic>("D5B7U", -3937660771564903643L, var9);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[5];
      int var6 = 0;
      String var5 = "(Ý}ûb\u0019aA\u0010\u001eñä\u0090CÊ\u0014\u0087\u007f®S'[\u0083\u008a»\by\u009e\u0089\u0085Õa\u0001Ì";
      int var7 = "(Ý}ûb\u0019aA\u0010\u001eñä\u0090CÊ\u0014\u0087\u007f®S'[\u0083\u008a»\by\u009e\u0089\u0085Õa\u0001Ì".length();
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
                  NONE = new z4(var0[0], 0);
                  RANDOM = new z4(var0[4], 1);
                  ROAMING = new z4(var0[2], 2);
                  SINE = new z4(var0[3], 3);
                  DRUNK_SINE = new z4(var0[1], 4);
                  J = v();
                  M = EnumEntriesKt.enumEntries((Enum[])J);
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

               var5 = "¥kó\u008aÝ\u000b§\u0080\b÷Z,)ÖÚ\"Ã";
               var7 = "¥kó\u008aÝ\u000b§\u0080\b÷Z,)ÖÚ\"Ã".length();
               var4 = '\b';
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void L(String var0) {
      V = var0;
   }

   public static String t() {
      return V;
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
