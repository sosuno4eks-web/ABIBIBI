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

public enum rq {
   @NotNull
   private final q7 J;
   public static final rq STAR;
   public static final rq FIRE_FLY;
   public static final rq DOLLAR;
   public static final rq HEART;
   public static final rq SNOW_FLAKE;
   public static final rq DROP;
   public static final rq CLOUD;
   // $FF: synthetic field
   private static final EnumEntries s;
   private static final long a = j0.a(9148619927258700950L, 1792530869962097868L, MethodHandles.lookup().lookupClass()).a(119821547564933L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   private rq(q7 var3) {
      this.J = var3;
   }

   @NotNull
   public final q7 A() {
      return this.J;
   }

   @NotNull
   public static EnumEntries q() {
      return s;
   }

   // $FF: synthetic method
   private static final rq[] X(long var0) {
      var0 ^= a;
      rq[] var2 = new rq[true.g<invokedynamic>(19145, 6898682286733984524L ^ var0)];
      var2[0] = STAR;
      var2[1] = FIRE_FLY;
      var2[2] = DOLLAR;
      var2[3] = HEART;
      var2[4] = SNOW_FLAKE;
      var2[5] = DROP;
      var2[true.g<invokedynamic>(19884, 8435688159524521064L ^ var0)] = CLOUD;
      return var2;
   }

   static {
      long var20 = a ^ 45539538981573L;
      long var22 = var20 ^ 134918225959170L;
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
      String var16 = "ñq\u008drj\u0002x\u0015\bÄ\u009f8ML1×\u0010\b/\u0097!×\u008b\u008dà\\\u0010Ç%¦7\u0083Ik\u0088~Ë\rÉÄS$N\b\u0018{A\u0000Õ\u0084<\u0098";
      int var18 = "ñq\u008drj\u0002x\u0015\bÄ\u009f8ML1×\u0010\b/\u0097!×\u008b\u008dà\\\u0010Ç%¦7\u0083Ik\u0088~Ë\rÉÄS$N\b\u0018{A\u0000Õ\u0084<\u0098".length();
      char var15 = '\b';
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
                  String var4 = "\u0004IôÄ:\u009d9±t¼°½ Ãf§$¾æT\u001d¬}Ê";
                  int var5 = "\u0004IôÄ:\u009d9±t¼°½ Ãf§$¾æT\u001d¬}Ê".length();
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
                  STAR = new rq(var11[2], 0, q7.STAR);
                  FIRE_FLY = new rq(var11[3], 1, q7.FIREFLY);
                  DOLLAR = new rq(var11[5], 2, q7.DOLLAR);
                  HEART = new rq(var11[0], 3, q7.HEART);
                  SNOW_FLAKE = new rq(var11[6], 4, q7.SNOWFLAKE);
                  DROP = new rq(var11[4], 5, q7.DROP);
                  CLOUD = new rq(var11[1], true.g<invokedynamic>(9805, 1158519633179591969L ^ var20), q7.CLOUD);
                  s = EnumEntriesKt.enumEntries((Enum[])H);
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

               var16 = "\u0013;P}\\á_ \u0010ËÄ¼\u000b¡åwiëIËs»\fÊ\u008a";
               var18 = "\u0013;P}\\á_ \u0010ËÄ¼\u000b¡åwiëIËs»\fÊ\u008a".length();
               var15 = '\b';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 515;
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
            throw new RuntimeException("su/catlean/rq", var14);
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
         throw new RuntimeException("su/catlean/rq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
