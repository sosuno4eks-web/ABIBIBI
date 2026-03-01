package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

enum bl {
   public static final bl VANILLA;
   public static final bl GRIM_SHULKER;
   public static final bl ELYTRA;
   private static final bl[] Y;
   private static final EnumEntries o;

   @NotNull
   public static EnumEntries C() {
      return o;
   }

   private static final bl[] U() {
      bl[] var0 = new bl[]{VANILLA, GRIM_SHULKER, ELYTRA};
      return var0;
   }

   static {
      long var9 = j0.a(1689017368983055218L, 5070553100800537738L, MethodHandles.lookup().lookupClass()).a(197388130711077L) ^ 68449074617543L;
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
      String var5 = "ÿ,.Y\u00809½2`Ð.\u0091\u0011\u009c1L\b\fÂ\u0096¬_ûö\u009b\b½þJF´pwÍ";
      int var7 = "ÿ,.Y\u00809½2`Ð.\u0091\u0011\u009c1L\b\fÂ\u0096¬_ûö\u009b\b½þJF´pwÍ".length();
      char var4 = 16;
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            VANILLA = new bl(var0[1], 0);
            GRIM_SHULKER = new bl(var0[0], 1);
            ELYTRA = new bl(var0[2], 2);
            Y = U();
            o = EnumEntriesKt.enumEntries((Enum[])Y);
            return;
         }

         var4 = var5.charAt(var3);
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
