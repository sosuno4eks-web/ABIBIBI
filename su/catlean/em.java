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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class em {
   @NotNull
   private final String i;
   @NotNull
   private final Number y;
   @NotNull
   private final String X;
   private static final long a = j0.a(5444598616078607121L, 214461262480444547L, MethodHandles.lookup().lookupClass()).a(147652322694773L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public em(long a, @NotNull String name, @NotNull Number value, @NotNull String overrideName) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.n<invokedynamic>(21052, 5530837040225925187L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.n<invokedynamic>(16820, 4023047923482241992L ^ var1));
      Intrinsics.checkNotNullParameter(var5, true.n<invokedynamic>(7811, 6631362365712758013L ^ var1));
      super();
      this.i = var3;
      this.y = var4;
      this.X = var5;
   }

   @NotNull
   public final String y() {
      return this.i;
   }

   @NotNull
   public final Number b() {
      return this.y;
   }

   @NotNull
   public final String B() {
      return this.X;
   }

   @NotNull
   public final String u() {
      return this.i;
   }

   @NotNull
   public final Number D() {
      return this.y;
   }

   @NotNull
   public final String f() {
      return this.X;
   }

   @NotNull
   public final em S(byte a, @NotNull String name, @NotNull Number value, long a, @NotNull String overrideName) {
      long var7 = ((long)var1 << 56 | var4 << 8 >>> 8) ^ a;
      long var9 = var7 ^ 37005456808169L;
      Intrinsics.checkNotNullParameter(var2, true.n<invokedynamic>(13647, 1877436304885958861L ^ var7));
      Intrinsics.checkNotNullParameter(var3, true.n<invokedynamic>(4524, 3674119722685819945L ^ var7));
      Intrinsics.checkNotNullParameter(var6, true.n<invokedynamic>(10555, 3825586502501192891L ^ var7));
      return new em(var9, var2, var3, var6);
   }

   public static em g(long var0, em var2, String var3, Number var4, String var5, int var6, Object var7) {
      var0 ^= a;
      long var10001 = var0 ^ 73930552248289L;
      int var8 = (int)((var0 ^ 73930552248289L) >>> 56);
      long var9 = var10001 << 8 >>> 8;
      boolean var11 = -3400628853504441008L.A<invokedynamic>(-3400628853504441008L, var0);

      int var10000;
      label41: {
         label40: {
            try {
               var10000 = var6 & 1;
               if (var11) {
                  break label41;
               }

               if (var10000 == 0) {
                  break label40;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, -3446015303169658030L, var0);
            }

            var3 = var2.i;
         }

         var10000 = var6 & 2;
      }

      label32: {
         label31: {
            try {
               if (var11) {
                  break label32;
               }

               if (var10000 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var12) {
               throw var12.A<invokedynamic>(var12, -3446015303169658030L, var0);
            }

            var4 = var2.y;
         }

         var10000 = var6 & 4;
      }

      if (var10000 != 0) {
         var5 = var2.X;
      }

      return var2.S((byte)var8, var3, var4, var9, var5);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 98105442462728L;
      String var3 = this.X;
      Number var4 = this.y;
      String var5 = this.i;
      String var10000 = 23740.n<invokedynamic>(23740, 6735063721862732608L ^ var1);
      return var10000 + var5 + true.n<invokedynamic>(26365, 5604163301635924234L ^ var1) + var4 + true.n<invokedynamic>(27881, 941379108337003287L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 63144463728508L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[9];
      int var18 = 0;
      String var17 = "8\u001a©®PÜÍ0^\u0099OI\u0096ö¾è\u007f\u001d\u0013\u0085ñ±\u0095lÖSy\nceØd\u0018¯\u0003íg\u0018\u0002\u0002²Ý\u009dÜ²c\u009cÔ[ùMÿ{Ú@|\u0012\u0010ì\tõ\u001d\u008aD)\u008e\u0086j\u0091õ\u001ciÉ\u000b8_£ê\u0084rËãKNa\u0002hï«ÍèBé5|GOv\u0089¸ûÃ\u008dYû6¸\u0006üãØìÜ\u00005¼Ù¥\u0011GòÄ¦jf¼ÐÅñqþ\u0010±\u0011¦ zi°\u0001îã}y\u0097¹â\u0080\u0010\n¸\u000e¬\u0014îv\u008fÍ¾\u0081EÕ»?P\u0018¬{\u0002\u0003s \u001e\u0016'\u0005:ä\u0093Hªêl¬`Û\u0081X^u";
      int var19 = "8\u001a©®PÜÍ0^\u0099OI\u0096ö¾è\u007f\u001d\u0013\u0085ñ±\u0095lÖSy\nceØd\u0018¯\u0003íg\u0018\u0002\u0002²Ý\u009dÜ²c\u009cÔ[ùMÿ{Ú@|\u0012\u0010ì\tõ\u001d\u008aD)\u008e\u0086j\u0091õ\u001ciÉ\u000b8_£ê\u0084rËãKNa\u0002hï«ÍèBé5|GOv\u0089¸ûÃ\u008dYû6¸\u0006üãØìÜ\u00005¼Ù¥\u0011GòÄ¦jf¼ÐÅñqþ\u0010±\u0011¦ zi°\u0001îã}y\u0097¹â\u0080\u0010\n¸\u000e¬\u0014îv\u008fÍ¾\u0081EÕ»?P\u0018¬{\u0002\u0003s \u001e\u0016'\u0005:ä\u0093Hªêl¬`Û\u0081X^u".length();
      char var16 = ' ';
      int var15 = -1;

      label45:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var27;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[9];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "ì+MÄ\u00902Ç¬\tçÊ½Y\r±.";
                  int var5 = "ì+MÄ\u00902Ç¬\tçÊ½Y\r±.".length();
                  int var2 = 0;

                  do {
                     int var25 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
                     var25 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var29 = true;
                     var6[var25] = var10004;
                  } while(var2 < var5);

                  e = var6;
                  f = new Integer[2];
                  return;
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var27;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label45;
               }

               var17 = "ç\nØËÝ\u001b\u0016\b7\u0084°\u0018\u001eÞ2\u0081 >¯ãØqÀQ\u0004\u0003\u0082\u0089è.¾\u0080ª\u0010%Ìº@S\u009cÈDfç*Y48D";
               var19 = "ç\nØËÝ\u001b\u0016\b7\u0084°\u0018\u001eÞ2\u0081 >¯ãØqÀQ\u0004\u0003\u0082\u0089è.¾\u0080ª\u0010%Ìº@S\u009cÈDfç*Y48D".length();
               var16 = 16;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
            var10001 = 0;
         }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9446;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/em", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/em" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22490;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/em", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/em" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
