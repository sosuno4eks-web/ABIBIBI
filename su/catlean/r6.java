package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum r6 {
   public static final r6 DEFAULT;
   public static final r6 ALWAYS;
   public static final r6 BOOLS;
   // $FF: synthetic field
   private static final EnumEntries i;
   private static k9[] s;

   @NotNull
   public static EnumEntries s() {
      return i;
   }

   // $FF: synthetic method
   private static final r6[] W() {
      r6[] var0 = new r6[]{DEFAULT, ALWAYS, BOOLS};
      return var0;
   }

   static {
      long var9 = j0.a(802087041276901426L, 4635896392113159690L, MethodHandles.lookup().lookupClass()).a(184483586583906L) ^ 8445573724438L;
      if (-5910812690320423358L.A<invokedynamic>(-5910812690320423358L, var9) != null) {
         (new k9[2]).A<invokedynamic>(new k9[2], -6012920254160086693L, var9);
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
      String var5 = "x &\u0099\u009f¢\u0000\u0099\bÑ\u001f¦\u001fI-ov\bfâ\u0007§\rGèz";
      int var7 = "x &\u0099\u009f¢\u0000\u0099\bÑ\u001f¦\u001fI-ov\bfâ\u0007§\rGèz".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            DEFAULT = new r6(var0[1], 0);
            ALWAYS = new r6(var0[0], 1);
            BOOLS = new r6(var0[2], 2);
            i = EnumEntriesKt.enumEntries((Enum[])H);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void S(k9[] var0) {
      s = var0;
   }

   public static k9[] O() {
      return s;
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
