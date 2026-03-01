package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum xz {
   @NotNull
   private final String E;
   @NotNull
   private final Map c;
   public static final xz EN;
   public static final xz RU;
   public static final xz PL;
   private static final xz[] D;
   private static final EnumEntries W;

   private xz(String var3, Map var4) {
      this.E = var3;
      this.c = var4;
   }

   @NotNull
   public final String P() {
      return this.E;
   }

   @NotNull
   public final Map i() {
      return this.c;
   }

   @NotNull
   public static EnumEntries c() {
      return W;
   }

   private static final xz[] T() {
      xz[] var0 = new xz[]{EN, RU, PL};
      return var0;
   }

   static {
      long var9 = j0.a(367492728980698720L, 4336052257538944999L, MethodHandles.lookup().lookupClass()).a(222359567328554L) ^ 43863496037438L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[6];
      int var6 = 0;
      String var5 = "ßL\u00ad|øg?×\b3yái\"X\u000f\u0018\b}I\u0006SPÁL.\bñ3m» eu\u009a";
      int var7 = "ßL\u00ad|øg?×\b3yái\"X\u000f\u0018\b}I\u0006SPÁL.\bñ3m» eu\u009a".length();
      char var4 = '\b';
      int var3 = -1;

      label28:
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
                  EN = new xz(var0[0], 0, var0[5], (Map)(new LinkedHashMap()));
                  RU = new xz(var0[2], 1, var0[3], (Map)(new LinkedHashMap()));
                  PL = new xz(var0[1], 2, var0[4], (Map)(new LinkedHashMap()));
                  D = T();
                  W = EnumEntriesKt.enumEntries((Enum[])D);
                  return;
               }

               var4 = var5.charAt(var3);
               break;
            default:
               var0[var6++] = var15;
               if ((var3 += var4) < var7) {
                  var4 = var5.charAt(var3);
                  continue label28;
               }

               var5 = "¼\u0001¶øv×÷7\b¥º£\u001f/ù\u0000\u009b";
               var7 = "¼\u0001¶øv×÷7\b¥º£\u001f/ù\u0000\u009b".length();
               var4 = '\b';
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
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
