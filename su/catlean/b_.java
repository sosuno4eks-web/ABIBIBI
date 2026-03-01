package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum b_ {
   public static final b_ CENTER;
   public static final b_ EYES;
   public static final b_ CLOSEST;
   public static final b_ ROAMING;
   public static final b_ RUST;
   private static final b_[] o;
   private static final EnumEntries X;

   @NotNull
   public static EnumEntries X() {
      return X;
   }

   private static final b_[] Q() {
      b_[] var0 = new b_[]{CENTER, EYES, CLOSEST, ROAMING, RUST};
      return var0;
   }

   static {
      long var9 = j0.a(7878580321601387452L, 6253367774970355003L, MethodHandles.lookup().lookupClass()).a(195625118572355L) ^ 58448587771986L;
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
      String var5 = "º`\u008eáUômô\b½ôw&ïm0M\b)ha¢¨è/Z";
      int var7 = "º`\u008eáUômô\b½ôw&ïm0M\b)ha¢¨è/Z".length();
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
                  CENTER = new b_(var0[4], 0);
                  EYES = new b_(var0[3], 1);
                  CLOSEST = new b_(var0[1], 2);
                  ROAMING = new b_(var0[0], 3);
                  RUST = new b_(var0[2], 4);
                  o = Q();
                  X = EnumEntriesKt.enumEntries((Enum[])o);
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

               var5 = "\u0012Äß_\u0086\f\u001dÌ\b\u000eh\u0002¼Ê¼Ø\u008d";
               var7 = "\u0012Äß_\u0086\f\u001dÌ\b\u000eh\u0002¼Ê¼Ø\u008d".length();
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
