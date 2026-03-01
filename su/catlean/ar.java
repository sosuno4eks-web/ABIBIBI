package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum ar {
   public static final ar DEFAULT;
   public static final ar LINES;
   public static final ar DOTS;
   private static final ar[] p;
   private static final EnumEntries x;
   private static k9[] J;

   @NotNull
   public static EnumEntries Y() {
      return x;
   }

   private static final ar[] T() {
      ar[] var0 = new ar[]{DEFAULT, LINES, DOTS};
      return var0;
   }

   static {
      long var9 = j0.a(4554254817203941408L, 3138376502623554408L, MethodHandles.lookup().lookupClass()).a(93614764502119L) ^ 116900176265839L;
      if (-4252963433938755274L.A<invokedynamic>(-4252963433938755274L, var9) != null) {
         (new k9[2]).A<invokedynamic>(new k9[2], -4310879994328743601L, var9);
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
      String var5 = "\u007f5y\u001bÖ5;\u0089\bcð¿\u0090\u000f®N\u0017\b¢\u0012{Qk\u0014D{";
      int var7 = "\u007f5y\u001bÖ5;\u0089\bcð¿\u0090\u000f®N\u0017\b¢\u0012{Qk\u0014D{".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            DEFAULT = new ar(var0[2], 0);
            LINES = new ar(var0[0], 1);
            DOTS = new ar(var0[1], 2);
            p = T();
            x = EnumEntriesKt.enumEntries((Enum[])p);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void I(k9[] var0) {
      J = var0;
   }

   public static k9[] F() {
      return J;
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
