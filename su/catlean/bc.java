package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum bc {
   public static final bc NONE;
   public static final bc SILENT;
   public static final bc FORCE;
   // $FF: synthetic field
   private static final EnumEntries H;
   private static String N;

   @NotNull
   public static EnumEntries f() {
      return H;
   }

   // $FF: synthetic method
   private static final bc[] t() {
      bc[] var0 = new bc[]{NONE, SILENT, FORCE};
      return var0;
   }

   static {
      long var9 = j0.a(832106325844617022L, 791207510070687531L, MethodHandles.lookup().lookupClass()).a(218467472827867L) ^ 44335742532202L;
      if (-7268265954865591463L.A<invokedynamic>(-7268265954865591463L, var9) != null) {
         "SXffI".A<invokedynamic>("SXffI", -7242793407807465163L, var9);
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
      String var5 = "`rh}Ú °ô\b÷\u0000\b\u0097\u009c¾\u008b\u0007\bì0\u0098Ñ\u0000éý¨";
      int var7 = "`rh}Ú °ô\b÷\u0000\b\u0097\u009c¾\u008b\u0007\bì0\u0098Ñ\u0000éý¨".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            NONE = new bc(var0[2], 0);
            SILENT = new bc(var0[0], 1);
            FORCE = new bc(var0[1], 2);
            H = EnumEntriesKt.enumEntries((Enum[])r);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void T(String var0) {
      N = var0;
   }

   public static String Q() {
      return N;
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
