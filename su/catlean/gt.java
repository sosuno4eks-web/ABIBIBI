package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum gt {
   public static final gt Silent;
   public static final gt Normal;
   public static final gt Alternative;
   // $FF: synthetic field
   private static final EnumEntries p;
   private static k9[] X;

   @NotNull
   public static EnumEntries b() {
      return p;
   }

   // $FF: synthetic method
   private static final gt[] M() {
      gt[] var0 = new gt[]{Silent, Normal, Alternative};
      return var0;
   }

   static {
      long var9 = j0.a(1835954572096708516L, 4674047392240396280L, MethodHandles.lookup().lookupClass()).a(242530813890301L) ^ 133085224600613L;
      if (-4730717203079707100L.A<invokedynamic>(-4730717203079707100L, var9) == null) {
         (new k9[3]).A<invokedynamic>(new k9[3], -4723034645975516511L, var9);
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
      String var5 = "\u0082?£\u009b¢\u008d Ï¥±°¿\u009cìØ\u0080\bNG\u001dßÛ\u009d@<\b:°Ú|\u0086+á\u0097";
      int var7 = "\u0082?£\u009b¢\u008d Ï¥±°¿\u009cìØ\u0080\bNG\u001dßÛ\u009d@<\b:°Ú|\u0086+á\u0097".length();
      char var4 = 16;
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            Silent = new gt(var0[1], 0);
            Normal = new gt(var0[2], 1);
            Alternative = new gt(var0[0], 2);
            p = EnumEntriesKt.enumEntries((Enum[])i);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void H(k9[] var0) {
      X = var0;
   }

   public static k9[] Y() {
      return X;
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
