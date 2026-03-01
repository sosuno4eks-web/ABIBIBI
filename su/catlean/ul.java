package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum ul {
   public static final ul TIMER;
   public static final ul SOLID;
   public static final ul IGNORE;
   public static final ul FLY;
   private static final ul[] F;
   private static final EnumEntries T;
   private static int v;

   @NotNull
   public static EnumEntries f() {
      return T;
   }

   private static final ul[] v() {
      ul[] var0 = new ul[]{TIMER, SOLID, IGNORE, FLY};
      return var0;
   }

   static {
      long var9 = j0.a(1538848973248552523L, 1203575192621302628L, MethodHandles.lookup().lookupClass()).a(252278088116916L) ^ 76842292569264L;
      if (-8851723366121138572L.A<invokedynamic>(-8851723366121138572L, var9) != 0) {
         118.A<invokedynamic>(118, -8810621346529744748L, var9);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[4];
      int var6 = 0;
      String var5 = "¤\u008aw°qKç]\bc\u008f{N\u0002~\u008d\u009f";
      int var7 = "¤\u008aw°qKç]\bc\u008f{N\u0002~\u008d\u009f".length();
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
                  TIMER = new ul(var0[2], 0);
                  SOLID = new ul(var0[0], 1);
                  IGNORE = new ul(var0[1], 2);
                  FLY = new ul(var0[3], 3);
                  F = v();
                  T = EnumEntriesKt.enumEntries((Enum[])F);
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

               var5 = "l]&½\u007f\u0091\u009e*\b)\u0097·\u007f\u0010X-c";
               var7 = "l]&½\u007f\u0091\u009e*\b)\u0097·\u007f\u0010X-c".length();
               var4 = '\b';
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void M(int var0) {
      v = var0;
   }

   public static int W() {
      return v;
   }

   public static int V() {
      int var0 = W();

      try {
         return var0 == 0 ? 1 : 0;
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
