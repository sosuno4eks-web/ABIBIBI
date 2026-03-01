package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum eg {
   public static final eg OBBY;
   public static final eg WEB;
   private static final eg[] W;
   private static final EnumEntries M;
   private static String[] O;

   @NotNull
   public static EnumEntries z() {
      return M;
   }

   private static final eg[] v() {
      eg[] var0 = new eg[]{OBBY, WEB};
      return var0;
   }

   static {
      long var9 = j0.a(513372233976586806L, 5891287565139299328L, MethodHandles.lookup().lookupClass()).a(183423177982060L) ^ 65867662663206L;
      if (8040586972319998617L.A<invokedynamic>(8040586972319998617L, var9) != null) {
         (new String[5]).A<invokedynamic>(new String[5], 8046390198962297277L, var9);
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
      String var5 = "ê=üµÜàV\u0081\bÅF¬ò¡·µó";
      int var7 = "ê=üµÜàV\u0081\bÅF¬ò¡·µó".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            OBBY = new eg(var0[1], 0);
            WEB = new eg(var0[0], 1);
            W = v();
            M = EnumEntriesKt.enumEntries((Enum[])W);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void z(String[] var0) {
      O = var0;
   }

   public static String[] c() {
      return O;
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
