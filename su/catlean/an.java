package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum an {
   public static final an FREE;
   public static final an FOCUS;
   private static final an[] q;
   private static final EnumEntries A;
   private static String[] f;

   @NotNull
   public static EnumEntries Y() {
      return A;
   }

   private static final an[] x() {
      an[] var0 = new an[]{FREE, FOCUS};
      return var0;
   }

   static {
      long var9 = j0.a(4139090909216534295L, 9030709225912107695L, MethodHandles.lookup().lookupClass()).a(219720171305617L) ^ 120299932189526L;
      if (7019489286934022556L.A<invokedynamic>(7019489286934022556L, var9) == null) {
         (new String[4]).A<invokedynamic>(new String[4], 7060234621548910178L, var9);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[2];
      int var6 = 0;
      String var5 = "©\u0092l\u0086âÐ\u0085¢\b\u0087lBàI±m8";
      int var7 = "©\u0092l\u0086âÐ\u0085¢\b\u0087lBàI±m8".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            FREE = new an(var0[1], 0);
            FOCUS = new an(var0[0], 1);
            q = x();
            A = EnumEntriesKt.enumEntries((Enum[])q);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void s(String[] var0) {
      f = var0;
   }

   public static String[] R() {
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
