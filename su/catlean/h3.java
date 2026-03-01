package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum h3 {
   public static final h3 MIRROR;
   public static final h3 DEFAULT;
   public static final h3 BLOOM;
   public static final h3 DOUBLE;
   public static final h3 CAMOUFLAGE;
   private static final h3[] l;
   private static final EnumEntries B;
   private static String[] P;

   @NotNull
   public static EnumEntries L() {
      return B;
   }

   private static final h3[] d() {
      h3[] var0 = new h3[]{MIRROR, DEFAULT, BLOOM, DOUBLE, CAMOUFLAGE};
      return var0;
   }

   static {
      long var9 = j0.a(5336241916092207594L, 1075594112006490300L, MethodHandles.lookup().lookupClass()).a(259634142152389L) ^ 7315304073909L;
      if (-5161671580037879261L.A<invokedynamic>(-5161671580037879261L, var9) != null) {
         (new String[1]).A<invokedynamic>(new String[1], -5102293403383301865L, var9);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[5];
      int var6 = 0;
      String var5 = "\u0012\u008cù´5v\u0090k\bú\u009b\u0016ÄO\tµð\b\u009e×Ióâ\u0011\u008fò";
      int var7 = "\u0012\u008cù´5v\u0090k\bú\u009b\u0016ÄO\tµð\b\u009e×Ióâ\u0011\u008fò".length();
      char var4 = '\b';
      int var3 = -1;

      label32:
      while(true) {
         ++var3;
         String var11 = var5.substring(var3, var3 + var4);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var1.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var8).intern();
            switch(var10001) {
            case 0:
               var0[var6++] = var15;
               if ((var3 += var4) >= var7) {
                  MIRROR = new h3(var0[0], 0);
                  DEFAULT = new h3(var0[3], 1);
                  BLOOM = new h3(var0[1], 2);
                  DOUBLE = new h3(var0[2], 3);
                  CAMOUFLAGE = new h3(var0[4], 4);
                  l = d();
                  B = EnumEntriesKt.enumEntries((Enum[])l);
                  return;
               }

               var4 = var5.charAt(var3);
               break;
            default:
               var0[var6++] = var15;
               if ((var3 += var4) < var7) {
                  var4 = var5.charAt(var3);
                  continue label32;
               }

               var5 = "Í\u0089 3Öb\u0087\f\u0010pÛj½É®\u008c=°\u009df\u0011]~;Ù";
               var7 = "Í\u0089 3Öb\u0087\f\u0010pÛj½É®\u008c=°\u009df\u0011]~;Ù".length();
               var4 = '\b';
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void J(String[] var0) {
      P = var0;
   }

   public static String[] S() {
      return P;
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
