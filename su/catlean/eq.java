package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum eq {
   public static final eq NCP;
   public static final eq DEFAULT;
   public static final eq ANTI;
   private static final eq[] w;
   private static final EnumEntries M;
   private static String f;

   @NotNull
   public static EnumEntries Y() {
      return M;
   }

   private static final eq[] n() {
      eq[] var0 = new eq[]{NCP, DEFAULT, ANTI};
      return var0;
   }

   static {
      long var9 = j0.a(8886392193284990574L, 5562789572019947903L, MethodHandles.lookup().lookupClass()).a(137768711593510L) ^ 82480971334121L;
      if (-1782671205788626018L.A<invokedynamic>(-1782671205788626018L, var9) != null) {
         "dePoK".A<invokedynamic>("dePoK", -1729633872536693063L, var9);
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
      String var5 = "f\u0017\u001e©ý°\t«\b^\u009b\u009e\u0083/\r[h\bÏé/vBâà(";
      int var7 = "f\u0017\u001e©ý°\t«\b^\u009b\u009e\u0083/\r[h\bÏé/vBâà(".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            NCP = new eq(var0[0], 0);
            DEFAULT = new eq(var0[2], 1);
            ANTI = new eq(var0[1], 2);
            w = n();
            M = EnumEntriesKt.enumEntries((Enum[])w);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void c(String var0) {
      f = var0;
   }

   public static String C() {
      return f;
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
