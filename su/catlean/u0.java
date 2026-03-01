package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

enum u0 {
   public static final u0 GAPPLE_SHIELD;
   public static final u0 BALL_SHIELD;
   public static final u0 GAPPLE_BALL;
   public static final u0 BALL_TOTEM;
   public static final u0 TOTEM_TOTEM;
   public static final u0 BALL_BALL;
   public static final u0 CUSTOM;
   private static final u0[] l;
   private static final EnumEntries C;
   private static final long a = j0.a(8071992651116828208L, 7863607200171865141L, MethodHandles.lookup().lookupClass()).a(180215633152508L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   @NotNull
   public static EnumEntries U() {
      return C;
   }

   private static final u0[] c(long var0) {
      var0 ^= a;
      u0[] var2 = new u0[true.p<invokedynamic>(6375, 1200088076461600896L ^ var0)];
      var2[0] = GAPPLE_SHIELD;
      var2[1] = BALL_SHIELD;
      var2[2] = GAPPLE_BALL;
      var2[3] = BALL_TOTEM;
      var2[4] = TOTEM_TOTEM;
      var2[5] = BALL_BALL;
      var2[true.p<invokedynamic>(10843, 7689703076956914237L ^ var0)] = CUSTOM;
      return var2;
   }

   static {
      long var20 = a ^ 83640739175838L;
      long var22 = var20 ^ 21990829902977L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[7];
      int var17 = 0;
      String var16 = "\u008eWÍëa\u008f!ïôÒ\rü\u0003z©\u0017\u0010\u0013ÁSÐ;\u008a0;ë>7E=\u0004\u007f(\u0010ÿó_\u000bËÇO\u009a\u001b\u0081(T\nS×\u0083\bWÕ×ÈçÀTñ\u0010\u007f/Ã¾\u0099<ÿ¸Ñ\u0094\bh\u0095W¥D";
      int var18 = "\u008eWÍëa\u008f!ïôÒ\rü\u0003z©\u0017\u0010\u0013ÁSÐ;\u008a0;ë>7E=\u0004\u007f(\u0010ÿó_\u000bËÇO\u009a\u001b\u0081(T\nS×\u0083\bWÕ×ÈçÀTñ\u0010\u007f/Ã¾\u0099<ÿ¸Ñ\u0094\bh\u0095W¥D".length();
      char var15 = 16;
      int var14 = -1;

      label45:
      while(true) {
         ++var14;
         String var24 = var16.substring(var14, var14 + var15);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var24.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var11[var17++] = var29;
               if ((var14 += var15) >= var18) {
                  d = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "¸\nò7cëÖ\u0096j\u0015\u008fß´úI¦ÔøÙ¾þ¢\u001a6";
                  int var5 = "¸\nò7cëÖ\u0096j\u0015\u008fß´úI¦ÔøÙ¾þ¢\u001a6".length();
                  int var2 = 0;

                  do {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     var27 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var31 = true;
                     var6[var27] = var10004;
                  } while(var2 < var5);

                  b = var6;
                  c = new Integer[3];
                  GAPPLE_SHIELD = new u0(var11[5], 0);
                  BALL_SHIELD = new u0(var11[2], 1);
                  GAPPLE_BALL = new u0(var11[1], 2);
                  BALL_TOTEM = new u0(var11[4], 3);
                  TOTEM_TOTEM = new u0(var11[0], 4);
                  BALL_BALL = new u0(var11[6], 5);
                  CUSTOM = new u0(var11[3], true.p<invokedynamic>(31309, 4135100700487072294L ^ var20));
                  l = c(var22);
                  C = EnumEntriesKt.enumEntries((Enum[])l);
                  return;
               }

               var15 = var16.charAt(var14);
               break;
            default:
               var11[var17++] = var29;
               if ((var14 += var15) < var18) {
                  var15 = var16.charAt(var14);
                  continue label45;
               }

               var16 = "\u008e>\u0001Þyu¡bÉ\u0092«¯ô×\u001f\u0082\u0010?\u0018\u008eU¨ÁÐ%ÎÌm\u001d\u001f\u0006kä";
               var18 = "\u008e>\u0001Þyu¡bÉ\u0092«¯ô×\u001f\u0082\u0010?\u0018\u008eU¨ÁÐ%ÎÌm\u001d\u001f\u0006kä".length();
               var15 = 16;
               var14 = -1;
            }

            ++var14;
            var24 = var16.substring(var14, var14 + var15);
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14712;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = b[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/u0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/u0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
