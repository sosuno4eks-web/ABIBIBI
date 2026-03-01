package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum si {
   public static final si Packet;
   public static final si Motion;
   private static final si[] b;
   private static final EnumEntries x;
   private static k9[] e;

   @NotNull
   public static EnumEntries F() {
      return x;
   }

   private static final si[] g() {
      si[] var0 = new si[]{Packet, Motion};
      return var0;
   }

   static {
      long var9 = j0.a(4124525922963916448L, 3717412898181008445L, MethodHandles.lookup().lookupClass()).a(247765677671479L) ^ 18972593995722L;
      if (-7180714263442962793L.A<invokedynamic>(-7180714263442962793L, var9) != null) {
         (new k9[4]).A<invokedynamic>(new k9[4], -7176192572233285953L, var9);
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
      String var5 = "%&ÐO\u0000ÐKÝ\bj\u009a¼Vj\u000f=\u0097";
      int var7 = "%&ÐO\u0000ÐKÝ\bj\u009a¼Vj\u000f=\u0097".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            Packet = new si(var0[1], 0);
            Motion = new si(var0[0], 1);
            b = g();
            x = EnumEntriesKt.enumEntries((Enum[])b);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void j(k9[] var0) {
      e = var0;
   }

   public static k9[] P() {
      return e;
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
