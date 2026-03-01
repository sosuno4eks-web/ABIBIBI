package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $FF: synthetic class
public final class gh {
   public static final int[] z;
   private static boolean j;

   static {
      long var11 = j0.a(5541130034778849613L, 1675539847040753155L, MethodHandles.lookup().lookupClass()).a(14524414489244L) ^ 118491348103056L;
      if (5106710322488502071L.A<invokedynamic>(5106710322488502071L, var11)) {
         true.A<invokedynamic>(true, 5061420383270772508L, var11);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[6];
      int var4 = 0;
      String var5 = "Öí\u0099#\u0095ÜgcµktÔÁ\u009a8âÃæ\u001aRK71BÇ¹êlêãïo";
      int var6 = "Öí\u0099#\u0095ÜgcµktÔÁ\u009a8âÃæ\u001aRK71BÇ¹êlêãïo".length();
      int var3 = 0;

      label97:
      while(true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var26 = var0;
         var10001 = var4++;
         long var27 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte var29 = -1;

         while(true) {
            long var8 = var27;
            byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
            long var31 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
            switch(var29) {
            case 0:
               var26[var10001] = var31;
               if (var3 >= var6) {
                  int[] var13 = new int[dy.values().length];

                  try {
                     var13[dy.Default.ordinal()] = 1;
                  } catch (NoSuchFieldError var25) {
                  }

                  try {
                     var13[dy.Bonk.ordinal()] = 2;
                  } catch (NoSuchFieldError var24) {
                  }

                  try {
                     var13[dy.Rubber.ordinal()] = 3;
                  } catch (NoSuchFieldError var23) {
                  }

                  try {
                     var13[dy.Flip.ordinal()] = 4;
                  } catch (NoSuchFieldError var22) {
                  }

                  try {
                     var13[dy.Snap.ordinal()] = 5;
                  } catch (NoSuchFieldError var21) {
                  }

                  try {
                     var13[dy.Hook.ordinal()] = (int)var0[5];
                  } catch (NoSuchFieldError var20) {
                  }

                  try {
                     var13[dy.Swipe.ordinal()] = (int)var0[4];
                  } catch (NoSuchFieldError var19) {
                  }

                  try {
                     var13[dy.Tap.ordinal()] = (int)var0[3];
                  } catch (NoSuchFieldError var18) {
                  }

                  try {
                     var13[dy.Inject.ordinal()] = (int)var0[0];
                  } catch (NoSuchFieldError var17) {
                  }

                  try {
                     var13[dy.Slap.ordinal()] = (int)var0[2];
                  } catch (NoSuchFieldError var16) {
                  }

                  try {
                     var13[dy.Akrien.ordinal()] = (int)var0[1];
                  } catch (NoSuchFieldError var15) {
                  }

                  z = var13;
                  return;
               }
               break;
            default:
               var26[var10001] = var31;
               if (var3 < var6) {
                  continue label97;
               }

               var5 = "Ñl@¬\u000b`rÖò?ß¬K6¹o";
               var6 = "Ñl@¬\u000b`rÖò?ß¬K6¹o".length();
               var3 = 0;
            }

            var10001 = var3;
            var3 += 8;
            var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
            var26 = var0;
            var10001 = var4++;
            var27 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
            var29 = 0;
         }
      }
   }

   public static void h(boolean var0) {
      j = var0;
   }

   public static boolean W() {
      return j;
   }

   public static boolean k() {
      boolean var0 = W();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
