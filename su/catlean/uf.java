package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum uf {
   public static final uf NONE;
   public static final uf ONLY_LETHAL;
   public static final uf FULL;
   private static final uf[] k;
   private static final EnumEntries G;
   private static int p;

   @NotNull
   public static EnumEntries Y() {
      return G;
   }

   private static final uf[] v() {
      uf[] var0 = new uf[]{NONE, ONLY_LETHAL, FULL};
      return var0;
   }

   static {
      long var9 = j0.a(8877128134668464655L, 8055576069998897400L, MethodHandles.lookup().lookupClass()).a(144413621913044L) ^ 114037533631669L;
      if (-124259300587999947L.A<invokedynamic>(-124259300587999947L, var9) != 0) {
         33.A<invokedynamic>(33, -83717446010681549L, var9);
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
      String var5 = "áDùúÝ±.Ñ\b\u0082\u00ad\u000e´\u008a+\u0017î\u0010à(ózWà¿áaûcG\u0002\u0097p\u0001";
      int var7 = "áDùúÝ±.Ñ\b\u0082\u00ad\u000e´\u008a+\u0017î\u0010à(ózWà¿áaûcG\u0002\u0097p\u0001".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            NONE = new uf(var0[1], 0);
            ONLY_LETHAL = new uf(var0[2], 1);
            FULL = new uf(var0[0], 2);
            k = v();
            G = EnumEntriesKt.enumEntries((Enum[])k);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void A(int var0) {
      p = var0;
   }

   public static int h() {
      return p;
   }

   public static int t() {
      int var0 = h();

      try {
         return var0 == 0 ? 112 : 0;
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
