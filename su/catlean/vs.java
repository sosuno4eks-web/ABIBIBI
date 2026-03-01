package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum vs {
   public static final vs Config;
   public static final vs Window;
   // $FF: synthetic field
   private static final EnumEntries w;
   private static String[] Z;

   @NotNull
   public static EnumEntries E() {
      return w;
   }

   // $FF: synthetic method
   private static final vs[] T() {
      vs[] var0 = new vs[]{Config, Window};
      return var0;
   }

   static {
      long var9 = j0.a(3522321362450920515L, 8667079659319345086L, MethodHandles.lookup().lookupClass()).a(123128818043245L) ^ 80968219890187L;
      if (-4329404250377374384L.A<invokedynamic>(-4329404250377374384L, var9) == null) {
         (new String[2]).A<invokedynamic>(new String[2], -4329657259665233483L, var9);
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
      String var5 = "\u0010\u009eè\u0087ò³¢b\bÃ\u009bÕ\u0094N\u001d\u0083\u0006";
      int var7 = "\u0010\u009eè\u0087ò³¢b\bÃ\u009bÕ\u0094N\u001d\u0083\u0006".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            Config = new vs(var0[0], 0);
            Window = new vs(var0[1], 1);
            w = EnumEntriesKt.enumEntries((Enum[])G);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void g(String[] var0) {
      Z = var0;
   }

   public static String[] V() {
      return Z;
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
