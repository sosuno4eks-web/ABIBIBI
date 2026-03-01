package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum gi {
   @NotNull
   private final q7 u;
   public static final gi ARROWS_1;
   public static final gi ARROWS_2;
   public static final gi ARROWS_3;
   public static final gi ARROWS_4;
   public static final gi ARROWS_5;
   public static final gi LINES;
   private static final gi[] w;
   private static final EnumEntries C;
   private static String[] U;
   private static final long a = j0.a(2391072346822905077L, 3238951748812055197L, MethodHandles.lookup().lookupClass()).a(134572553977511L);
   private static final long b;

   private gi(q7 var3) {
      this.u = var3;
   }

   @NotNull
   public final q7 b() {
      return this.u;
   }

   @NotNull
   public static EnumEntries k() {
      return C;
   }

   private static final gi[] D(short var0, short var1, int var2) {
      long var3 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32) ^ a;
      gi[] var5 = new gi[(int)b];
      var5[0] = ARROWS_1;
      var5[1] = ARROWS_2;
      var5[2] = ARROWS_3;
      var5[3] = ARROWS_4;
      var5[4] = ARROWS_5;
      var5[5] = LINES;
      return var5;
   }

   static {
      long var14 = a ^ 134673287029529L;
      long var10001 = var14 ^ 4338902691307L;
      int var16 = (int)((var14 ^ 4338902691307L) >>> 48);
      int var17 = (int)(var10001 << 16 >>> 48);
      int var18 = (int)(var10001 << 32 >>> 32);
      if (-6430848424156184376L.A<invokedynamic>(-6430848424156184376L, var14) != null) {
         (new String[4]).A<invokedynamic>(new String[4], -6477778410812540658L, var14);
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
      String var10 = ">#\u008d\u000fàû£¯0Æ\u0084\u0095tù\u0010U\u0010\u0098¬1ì\u0086@c-s\u001c$\u0080BN\r\u0005\u0010\u0086[á4\u008eyµ\u008b7f\u001b¿\u0090È¦)\u0010\u0093ãi®J\u009e\u001aX3\f§ÈF¸u´";
      int var12 = ">#\u008d\u000fàû£¯0Æ\u0084\u0095tù\u0010U\u0010\u0098¬1ì\u0086@c-s\u001c$\u0080BN\r\u0005\u0010\u0086[á4\u008eyµ\u008b7f\u001b¿\u0090È¦)\u0010\u0093ãi®J\u009e\u001aX3\f§ÈF¸u´".length();
      char var9 = 16;
      int var8 = -1;

      label41:
      while(true) {
         ++var8;
         String var19 = var10.substring(var8, var8 + var9);
         byte var21 = -1;

         while(true) {
            byte[] var13 = var6.doFinal(var19.getBytes("ISO-8859-1"));
            String var25 = a(var13).intern();
            switch(var21) {
            case 0:
               var5[var11++] = var25;
               if ((var8 += var9) >= var12) {
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 9190261900373401851L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var27 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var24 = true;
                  b = var27;
                  ARROWS_1 = new gi(var5[0], 0, q7.TRIANGLE1);
                  ARROWS_2 = new gi(var5[5], 1, q7.TRIANGLE2);
                  ARROWS_3 = new gi(var5[3], 2, q7.TRIANGLE3);
                  ARROWS_4 = new gi(var5[1], 3, q7.TRIANGLE4);
                  ARROWS_5 = new gi(var5[2], 4, q7.TRIANGLE5);
                  LINES = new gi(var5[4], 5, q7.TRIANGLE1);
                  w = D((short)var16, (short)var17, var18);
                  C = EnumEntriesKt.enumEntries((Enum[])w);
                  return;
               }

               var9 = var10.charAt(var8);
               break;
            default:
               var5[var11++] = var25;
               if ((var8 += var9) < var12) {
                  var9 = var10.charAt(var8);
                  continue label41;
               }

               var10 = "¶dÕRË×á´\u0010\u001brÍrg\"Ê\u0000*T\u00886\u009f<P\u0084";
               var12 = "¶dÕRË×á´\u0010\u001brÍrg\"Ê\u0000*T\u00886\u009f<P\u0084".length();
               var9 = '\b';
               var8 = -1;
            }

            ++var8;
            var19 = var10.substring(var8, var8 + var9);
            var21 = 0;
         }
      }
   }

   public static void X(String[] var0) {
      U = var0;
   }

   public static String[] M() {
      return U;
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
