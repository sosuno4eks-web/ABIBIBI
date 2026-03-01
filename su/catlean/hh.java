package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum hh {
   public static final hh MODULES;
   public static final hh WIDGETS;
   // $FF: synthetic field
   private static final EnumEntries y;
   private static String C;

   @NotNull
   public static EnumEntries V() {
      return y;
   }

   // $FF: synthetic method
   private static final hh[] M() {
      hh[] var0 = new hh[]{MODULES, WIDGETS};
      return var0;
   }

   static {
      long var9 = j0.a(3440040954047031498L, 8743569368957992899L, MethodHandles.lookup().lookupClass()).a(18773660397984L) ^ 81594291795568L;
      if (-7334172236313110046L.A<invokedynamic>(-7334172236313110046L, var9) == null) {
         "FjNNFc".A<invokedynamic>("FjNNFc", -7316156600960871220L, var9);
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
      String var5 = "[ø\u0012\u0099r\u0016uw\b¬ôÎ \u0002þÑs";
      int var7 = "[ø\u0012\u0099r\u0016uw\b¬ôÎ \u0002þÑs".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            MODULES = new hh(var0[1], 0);
            WIDGETS = new hh(var0[0], 1);
            y = EnumEntriesKt.enumEntries((Enum[])F);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void Y(String var0) {
      C = var0;
   }

   public static String d() {
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
