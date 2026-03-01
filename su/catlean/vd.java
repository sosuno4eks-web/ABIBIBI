package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum vd {
   public static final vd DolphinGrace;
   public static final vd Vanilla;
   public static final vd Legit;
   private static final vd[] E;
   private static final EnumEntries H;
   private static String[] f;

   @NotNull
   public static EnumEntries y() {
      return H;
   }

   private static final vd[] C() {
      vd[] var0 = new vd[]{DolphinGrace, Vanilla, Legit};
      return var0;
   }

   static {
      long var9 = j0.a(4416641429879860302L, 3945275536183027481L, MethodHandles.lookup().lookupClass()).a(96250025627365L) ^ 75449200336281L;
      if (-4562907149738408282L.A<invokedynamic>(-4562907149738408282L, var9) != null) {
         (new String[1]).A<invokedynamic>(new String[1], -4542625875943966646L, var9);
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
      String var5 = "~q}LÑ\u001c4Ï\u0010\u0007\u0002\u0014ÂÐF\u0012v±J\u0004LÂhRØ\bk\u009bÉD\u008e®½\u001e";
      int var7 = "~q}LÑ\u001c4Ï\u0010\u0007\u0002\u0014ÂÐF\u0012v±J\u0004LÂhRØ\bk\u009bÉD\u008e®½\u001e".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            DolphinGrace = new vd(var0[1], 0);
            Vanilla = new vd(var0[0], 1);
            Legit = new vd(var0[2], 2);
            E = C();
            H = EnumEntriesKt.enumEntries((Enum[])E);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void w(String[] var0) {
      f = var0;
   }

   public static String[] F() {
      return f;
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
