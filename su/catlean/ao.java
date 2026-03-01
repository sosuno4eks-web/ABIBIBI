package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum ao {
   public static final ao REPEAT;
   public static final ao OFF;
   public static final ao NONE;
   private static final ao[] I;
   private static final EnumEntries F;
   private static int K;

   @NotNull
   public static EnumEntries A() {
      return F;
   }

   private static final ao[] X() {
      ao[] var0 = new ao[]{REPEAT, OFF, NONE};
      return var0;
   }

   static {
      long var9 = j0.a(4319568046608458117L, 5104896716005415866L, MethodHandles.lookup().lookupClass()).a(46567210402017L) ^ 65958759870254L;
      if (2427389325403745646L.A<invokedynamic>(2427389325403745646L, var9) != 0) {
         33.A<invokedynamic>(33, 2398010273422678563L, var9);
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
      String var5 = "=a'\\³\u009e|ê\bý\u009aûA\u009bniÅ\bµÑµ®\u000b¨Ûâ";
      int var7 = "=a'\\³\u009e|ê\bý\u009aûA\u009bniÅ\bµÑµ®\u000b¨Ûâ".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            REPEAT = new ao(var0[2], 0);
            OFF = new ao(var0[0], 1);
            NONE = new ao(var0[1], 2);
            I = X();
            F = EnumEntriesKt.enumEntries((Enum[])I);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void h(int var0) {
      K = var0;
   }

   public static int f() {
      return K;
   }

   public static int o() {
      int var0 = f();

      try {
         return var0 == 0 ? 8 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
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
