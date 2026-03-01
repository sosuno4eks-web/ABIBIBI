package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum cd {
   public static final cd NONE;
   public static final cd DISABLE_CLICKS;
   public static final cd STRICT_NCP;
   public static final cd STRICT_NCP_2;
   public static final cd MATRIX_NCP;
   public static final cd LEGIT;
   private static final cd[] r;
   private static final EnumEntries i;
   private static String[] J;
   private static final long a = j0.a(7560772993270525539L, 3285028416637225212L, MethodHandles.lookup().lookupClass()).a(155557260106958L);
   private static final long b;

   @NotNull
   public static EnumEntries Z() {
      return i;
   }

   private static final cd[] R(long var0) {
      long var10000 = a ^ var0;
      cd[] var2 = new cd[(int)b];
      var2[0] = NONE;
      var2[1] = DISABLE_CLICKS;
      var2[2] = STRICT_NCP;
      var2[3] = STRICT_NCP_2;
      var2[4] = MATRIX_NCP;
      var2[5] = LEGIT;
      return var2;
   }

   static {
      long var14 = a ^ 32373874971857L;
      long var16 = var14 ^ 64879508237810L;
      if (-832367266279228786L.A<invokedynamic>(-832367266279228786L, var14) == null) {
         (new String[1]).A<invokedynamic>(new String[1], -818873289179165510L, var14);
      }

      Cipher var6;
      Cipher var10000 = var6 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var7 = 1; var7 < 8; ++var7) {
         var10003[var7] = (byte)((int)(var14 << var7 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var5 = new String[6];
      int var11 = 0;
      String var10 = "\u0087´!:\u0005\u0081w\n1\u0014¢\u000f\u008dÔp\u0083\u0010¾U\u009dó®Y8%OKü´ë\u0084aç\b\u0014¡Y.\u0011CB.\u0010~ ü*³*ª\u0012âp³;\u0091\u001b'\u0019";
      int var12 = "\u0087´!:\u0005\u0081w\n1\u0014¢\u000f\u008dÔp\u0083\u0010¾U\u009dó®Y8%OKü´ë\u0084aç\b\u0014¡Y.\u0011CB.\u0010~ ü*³*ª\u0012âp³;\u0091\u001b'\u0019".length();
      char var9 = 16;
      int var8 = -1;

      label41:
      while(true) {
         ++var8;
         String var18 = var10.substring(var8, var8 + var9);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var6.doFinal(var18.getBytes("ISO-8859-1"));
            String var23 = a(var13).intern();
            switch(var10001) {
            case 0:
               var5[var11++] = var23;
               if ((var8 += var9) >= var12) {
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -71537848888655552L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var25 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var21 = true;
                  b = var25;
                  NONE = new cd(var5[2], 0);
                  DISABLE_CLICKS = new cd(var5[1], 1);
                  STRICT_NCP = new cd(var5[4], 2);
                  STRICT_NCP_2 = new cd(var5[0], 3);
                  MATRIX_NCP = new cd(var5[3], 4);
                  LEGIT = new cd(var5[5], 5);
                  r = R(var16);
                  i = EnumEntriesKt.enumEntries((Enum[])r);
                  return;
               }

               var9 = var10.charAt(var8);
               break;
            default:
               var5[var11++] = var23;
               if ((var8 += var9) < var12) {
                  var9 = var10.charAt(var8);
                  continue label41;
               }

               var10 = "\u0087´!:\u0005\u0081w\ncS\u0018JsËØA\bµUy\b\u0099stÑ";
               var12 = "\u0087´!:\u0005\u0081w\ncS\u0018JsËØA\bµUy\b\u0099stÑ".length();
               var9 = 16;
               var8 = -1;
            }

            ++var8;
            var18 = var10.substring(var8, var8 + var9);
            var10001 = 0;
         }
      }
   }

   public static void y(String[] var0) {
      J = var0;
   }

   public static String[] E() {
      return J;
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
