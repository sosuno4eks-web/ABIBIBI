package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum ic {
   public static final ic FILL;
   public static final ic OUTLINE;
   public static final ic BOTH;
   // $FF: synthetic field
   private static final EnumEntries w;
   private static boolean t;

   @NotNull
   public static EnumEntries N() {
      return w;
   }

   // $FF: synthetic method
   private static final ic[] f() {
      ic[] var0 = new ic[]{FILL, OUTLINE, BOTH};
      return var0;
   }

   static {
      long var9 = j0.a(8831066388034652641L, 4086380747734255626L, MethodHandles.lookup().lookupClass()).a(106514623115303L) ^ 104376774629864L;
      if (6858227373668259552L.A<invokedynamic>(6858227373668259552L, var9)) {
         true.A<invokedynamic>(true, 6836036886538195224L, var9);
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
      String var5 = "s`\u008fÁzV\u008at\by\u008e-\u00187\u009e\n\u0081\b\u0019p\u0000?}\u0015\u0083P";
      int var7 = "s`\u008fÁzV\u008at\by\u008e-\u00187\u009e\n\u0081\b\u0019p\u0000?}\u0015\u0083P".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            FILL = new ic(var0[0], 0);
            OUTLINE = new ic(var0[2], 1);
            BOTH = new ic(var0[1], 2);
            w = EnumEntriesKt.enumEntries((Enum[])o);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void s(boolean var0) {
      t = var0;
   }

   public static boolean i() {
      return t;
   }

   public static boolean H() {
      boolean var0 = i();

      try {
         return !var0;
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
