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

enum dy {
   public static final dy Default;
   public static final dy Bonk;
   public static final dy Rubber;
   public static final dy Akrien;
   public static final dy Flip;
   public static final dy Snap;
   public static final dy Hook;
   public static final dy Swipe;
   public static final dy Tap;
   public static final dy Inject;
   public static final dy Slap;
   private static final dy[] p;
   private static final EnumEntries J;
   private static final long a = j0.a(6571346181640695445L, 4181723687316320735L, MethodHandles.lookup().lookupClass()).a(3490865481822L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   @NotNull
   public static EnumEntries s() {
      return J;
   }

   private static final dy[] A(long var0) {
      var0 ^= a;
      dy[] var2 = new dy[true.c<invokedynamic>(4591, 8229236349212010757L ^ var0)];
      var2[0] = Default;
      var2[1] = Bonk;
      var2[2] = Rubber;
      var2[3] = Akrien;
      var2[4] = Flip;
      var2[5] = Snap;
      var2[true.c<invokedynamic>(12517, 6907525584011429894L ^ var0)] = Hook;
      var2[true.c<invokedynamic>(26743, 5388765274022727830L ^ var0)] = Swipe;
      var2[true.c<invokedynamic>(9899, 2526593642586971725L ^ var0)] = Tap;
      var2[true.c<invokedynamic>(12985, 1438674833212705371L ^ var0)] = Inject;
      var2[true.c<invokedynamic>(24739, 5695831706278647880L ^ var0)] = Slap;
      return var2;
   }

   static {
      long var20 = a ^ 70342253756472L;
      long var22 = var20 ^ 105834176973078L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[11];
      int var17 = 0;
      String var16 = "vÐ\u0095Å\u0084yï\u0001\b\u00858Rm\u009a$\u0018Ü\bÊ,\u000bq<ER%\b§\u0019@\u008e\u001dÌt3\b/à¿\u0081u3\u00940\b1³\u0003%êNxÜ\bßLDëÀ«UÄ\bRu5\u0017/uÐ¯\b\tdÔ\u008d\"«ÞÙ";
      int var18 = "vÐ\u0095Å\u0084yï\u0001\b\u00858Rm\u009a$\u0018Ü\bÊ,\u000bq<ER%\b§\u0019@\u008e\u001dÌt3\b/à¿\u0081u3\u00940\b1³\u0003%êNxÜ\bßLDëÀ«UÄ\bRu5\u0017/uÐ¯\b\tdÔ\u008d\"«ÞÙ".length();
      char var15 = '\b';
      int var14 = -1;

      label54:
      while(true) {
         ++var14;
         String var24 = var16.substring(var14, var14 + var15);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = a(var19).intern();
            switch(var10001) {
            case 0:
               var11[var17++] = var30;
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
                  long[] var6 = new long[11];
                  int var3 = 0;
                  String var4 = "\u00ad\u0083\u0018õpt¢iØn+Ñ\u0006~\n\u001e\u007f÷åº\u009d³)¯\u001c¤\n@¹¤|d×\fm^!³ÕÈTç ô,Ã\u0091=T\u001a\u001a\u007f$\rFñ\u0016í$\\\u0003æÍrÎ\u001dz´ð$\u0005Z";
                  int var5 = "\u00ad\u0083\u0018õpt¢iØn+Ñ\u0006~\n\u001e\u007f÷åº\u009d³)¯\u001c¤\n@¹¤|d×\fm^!³ÕÈTç ô,Ã\u0091=T\u001a\u001a\u007f$\rFñ\u0016í$\\\u0003æÍrÎ\u001dz´ð$\u0005Z".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var27[var28] = var35;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[11];
                              Default = new dy(var11[4], 0);
                              Bonk = new dy(var11[10], 1);
                              Rubber = new dy(var11[7], 2);
                              Akrien = new dy(var11[3], 3);
                              Flip = new dy(var11[0], 4);
                              Snap = new dy(var11[6], 5);
                              Hook = new dy(var11[5], true.c<invokedynamic>(10322, 3198239622084849316L ^ var20));
                              Swipe = new dy(var11[1], true.c<invokedynamic>(30638, 6717337635733844317L ^ var20));
                              Tap = new dy(var11[2], true.c<invokedynamic>(9359, 2460968259658441339L ^ var20));
                              Inject = new dy(var11[9], true.c<invokedynamic>(24476, 5737467548195002731L ^ var20));
                              Slap = new dy(var11[8], true.c<invokedynamic>(10927, 6433245322974194773L ^ var20));
                              p = A(var22);
                              J = EnumEntriesKt.enumEntries((Enum[])p);
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "OGÃ.\u0099c\f\u0087\u0093Ô=Ôø\"ù³";
                           var5 = "OGÃ.\u0099c\f\u0087\u0093Ô=Ôø\"ù³".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var15 = var16.charAt(var14);
               break;
            default:
               var11[var17++] = var30;
               if ((var14 += var15) < var18) {
                  var15 = var16.charAt(var14);
                  continue label54;
               }

               var16 = "FÆÎeðZûØ\b\u001aWØá\u0094©¬4";
               var18 = "FÆÎeðZûØ\b\u001aWØá\u0094©¬4".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29133;
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
            throw new RuntimeException("su/catlean/dy", var14);
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
         throw new RuntimeException("su/catlean/dy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
