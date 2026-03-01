package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum ua {
   public static final ua NO_REACTION;
   public static final ua ATTACK;
   public static final ua ACTION_X;
   private static final ua[] k;
   private static final EnumEntries Q;

   @NotNull
   public static EnumEntries z() {
      return Q;
   }

   private static final ua[] u() {
      ua[] var0 = new ua[]{NO_REACTION, ATTACK, ACTION_X};
      return var0;
   }

   static {
      long var9 = j0.a(2637632697589169159L, 8988834369145092440L, MethodHandles.lookup().lookupClass()).a(207508090547852L) ^ 86039014944551L;
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
      String var5 = "\u0092Ò¬åÎ»çdõ)ò \\ \u0085\u0003\b'Úþ\u0088÷f\u0014é\u0010\u009b!+puÀÞ¯#¥½¬ß\u0094\u001e¤";
      int var7 = "\u0092Ò¬åÎ»çdõ)ò \\ \u0085\u0003\b'Úþ\u0088÷f\u0014é\u0010\u009b!+puÀÞ¯#¥½¬ß\u0094\u001e¤".length();
      char var4 = 16;
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            NO_REACTION = new ua(var0[2], 0);
            ATTACK = new ua(var0[1], 1);
            ACTION_X = new ua(var0[0], 2);
            k = u();
            Q = EnumEntriesKt.enumEntries((Enum[])k);
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
