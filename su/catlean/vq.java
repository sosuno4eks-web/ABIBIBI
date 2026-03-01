package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum vq {
   public static final vq ONLY_SELF;
   public static final vq FRIENDS;
   public static final vq ALL;
   private static final vq[] o;
   private static final EnumEntries g;
   private static String[] U;

   @NotNull
   public static EnumEntries N() {
      return g;
   }

   private static final vq[] H() {
      vq[] var0 = new vq[]{ONLY_SELF, FRIENDS, ALL};
      return var0;
   }

   static {
      long var9 = j0.a(3570122085769681025L, 3148406117120270669L, MethodHandles.lookup().lookupClass()).a(186747792299518L) ^ 11441187510317L;
      if (-4108581627963268106L.A<invokedynamic>(-4108581627963268106L, var9) != null) {
         (new String[5]).A<invokedynamic>(new String[5], -4109287267213787279L, var9);
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
      String var5 = "tëÀ\u0080Ø\u000bÞ\"\bùlQ\\\u0094#xÔ\u0010¨C\u0000ê\\\u0091?\u0019Þ\u0083\u008e|(}(Î";
      int var7 = "tëÀ\u0080Ø\u000bÞ\"\bùlQ\\\u0094#xÔ\u0010¨C\u0000ê\\\u0091?\u0019Þ\u0083\u008e|(}(Î".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            ONLY_SELF = new vq(var0[2], 0);
            FRIENDS = new vq(var0[0], 1);
            ALL = new vq(var0[1], 2);
            o = H();
            g = EnumEntriesKt.enumEntries((Enum[])o);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void i(String[] var0) {
      U = var0;
   }

   public static String[] m() {
      return U;
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
