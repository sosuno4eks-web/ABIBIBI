package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum nq {
   public static final nq CLIENT;
   public static final nq SERVER;
   public static final nq PREDICT;
   private static final nq[] a;
   private static final EnumEntries f;
   private static k9[] z;

   @NotNull
   public static EnumEntries c() {
      return f;
   }

   private static final nq[] n() {
      nq[] var0 = new nq[]{CLIENT, SERVER, PREDICT};
      return var0;
   }

   static {
      long var9 = j0.a(7386173466006730100L, 104987636992066764L, MethodHandles.lookup().lookupClass()).a(23540606542813L) ^ 128429004758L;
      if (-2084485884764537035L.A<invokedynamic>(-2084485884764537035L, var9) == null) {
         (new k9[2]).A<invokedynamic>(new k9[2], -2076048795826294673L, var9);
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
      String var5 = "îS½Ãÿ\u0017\u009a\u0088\bÚªHY£;¿\u009b\bÎ\u0014\u001cÓå\u001e¦\u009e";
      int var7 = "îS½Ãÿ\u0017\u009a\u0088\bÚªHY£;¿\u009b\bÎ\u0014\u001cÓå\u001e¦\u009e".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            CLIENT = new nq(var0[0], 0);
            SERVER = new nq(var0[1], 1);
            PREDICT = new nq(var0[2], 2);
            a = n();
            f = EnumEntriesKt.enumEntries((Enum[])a);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void q(k9[] var0) {
      z = var0;
   }

   public static k9[] z() {
      return z;
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
