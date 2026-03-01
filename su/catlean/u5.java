package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum u5 {
   public static final u5 ON;
   public static final u5 ANONYMOUSLY;
   public static final u5 OFF;
   private static final u5[] N;
   private static final EnumEntries O;
   private static int[] C;

   @NotNull
   public static EnumEntries s() {
      return O;
   }

   private static final u5[] l() {
      u5[] var0 = new u5[]{ON, ANONYMOUSLY, OFF};
      return var0;
   }

   static {
      long var9 = j0.a(8737570580735407212L, 7442740532296150510L, MethodHandles.lookup().lookupClass()).a(154761226255172L) ^ 122436858377758L;
      if (-1199574258654419283L.A<invokedynamic>(-1199574258654419283L, var9) != null) {
         (new int[2]).A<invokedynamic>(new int[2], -1167776048716280390L, var9);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[3];
      int var6 = 0;
      String var5 = "\u0097½\u0089ç\u0012\u0016Ö\u0093\u008eÿ@Z\u0089`\u0013:\bÖ\u0090[¬\r7Oq\bqò\u001a¦\u0084\u0085M\u0004";
      int var7 = "\u0097½\u0089ç\u0012\u0016Ö\u0093\u008eÿ@Z\u0089`\u0013:\bÖ\u0090[¬\r7Oq\bqò\u001a¦\u0084\u0085M\u0004".length();
      char var4 = 16;
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            ON = new u5(var0[2], 0);
            ANONYMOUSLY = new u5(var0[0], 1);
            OFF = new u5(var0[1], 2);
            N = l();
            O = EnumEntriesKt.enumEntries((Enum[])N);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void c(int[] var0) {
      C = var0;
   }

   public static int[] U() {
      return C;
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
