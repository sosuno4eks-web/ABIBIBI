package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

enum gu {
   public static final gu Vanilla;
   public static final gu Creative;
   public static final gu MATRIX_JUMP;
   public static final gu GRIM_GLIDE;
   private static final gu[] q;
   private static final EnumEntries i;

   @NotNull
   public static EnumEntries c() {
      return i;
   }

   private static final gu[] A() {
      gu[] var0 = new gu[]{Vanilla, Creative, MATRIX_JUMP, GRIM_GLIDE};
      return var0;
   }

   static {
      long var9 = j0.a(6382357869493147838L, 6462362195158151943L, MethodHandles.lookup().lookupClass()).a(139636599401840L) ^ 135300448993800L;
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
      String var5 = "÷\u0086\u008bw\u000f%\u0003>\n^?HËµ*Z\u0010ã©ãð£|ðýá&\"\r1\u0016\u0001²";
      int var7 = "÷\u0086\u008bw\u000f%\u0003>\n^?HËµ*Z\u0010ã©ãð£|ðýá&\"\r1\u0016\u0001²".length();
      char var4 = 16;
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
                  Vanilla = new gu(var0[3], 0);
                  Creative = new gu(var0[0], 1);
                  MATRIX_JUMP = new gu(var0[1], 2);
                  GRIM_GLIDE = new gu(var0[2], 3);
                  q = A();
                  i = EnumEntriesKt.enumEntries((Enum[])q);
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

               var5 = "ç¢}\u0011\u0015`V·'å\u009bBq²*\u0001\b/8P\u0007\u0015\u009cX\u0080";
               var7 = "ç¢}\u0011\u0015`V·'å\u009bBq²*\u0001\b/8P\u0007\u0015\u009cX\u0080".length();
               var4 = 16;
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
