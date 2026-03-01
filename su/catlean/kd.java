package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class kd extends kr {
   @NotNull
   public static final kd K;
   // $FF: synthetic field
   static final KProperty[] Q;
   @NotNull
   private static final zq C;
   private static final long c = j0.a(-2143448289859692675L, 7836571808159748616L, MethodHandles.lookup().lookupClass()).a(124682857606898L);
   private static final String[] e;
   private static final String[] k;
   private static final Map m;
   private static final long[] q;
   private static final Integer[] s;
   private static final Map y;

   private kd(short var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ c;
      long var6 = var4 ^ 101770684340397L;
      super(true.n<invokedynamic>(969, 4301975613050924060L ^ var4), var6, pa.V(), 0, false, true.q<invokedynamic>(10814, 266738554219044369L ^ var4), (DefaultConstructorMarker)null);
   }

   private final kq T(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 109531545395628L;
      int var3 = (int)((var1 ^ 109531545395628L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (kq)C.k((short)var3, this, Q[0], (short)var4, var5);
   }

   private final void n(short var1, int var2, char var3, kq var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ c;
      long var10001 = var5 ^ 7610010850190L;
      int var7 = (int)((var5 ^ 7610010850190L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      C.P(this, var7, Q[0], (short)var8, var4, (short)var9);
   }

   @Flow
   private final void v(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean W(@NotNull class_2338 pos, long a) {
      var2 ^= c;
      long var4 = var2 ^ 134528846564425L;
      long var6 = var2 ^ 113892036308120L;
      long var10001 = var2 ^ 138050267620718L;
      int var8 = (int)((var2 ^ 138050267620718L) >>> 32);
      int var9 = (int)(var10001 << 32 >>> 32);
      long var10 = var2 ^ 42187562886109L;
      int var10000 = 8605400181595389909L.A<invokedynamic>(8605400181595389909L, var2);
      Intrinsics.checkNotNullParameter(var1, true.n<invokedynamic>(28175, 4448292735251229606L ^ var2));
      int var12 = var10000;

      try {
         boolean var14 = ml.j.T(var8, var1, this.p(var6), this.c(), this.G(var10), var9, this.f(var4));
         if (8639873563330835084L.A<invokedynamic>(8639873563330835084L, var2) == null) {
            ++var12;
            var12.A<invokedynamic>(var12, 8576858694274889577L, var2);
         }

         return var14;
      } catch (NumberFormatException var13) {
         throw var13.A<invokedynamic>(var13, 8580369114078757855L, var2);
      }
   }

   @NotNull
   protected List W(long var1) {
      long var3 = var1 ^ 57945736497161L;
      return this.T(var3).G();
   }

   static {
      long var20 = c ^ 14348083052287L;
      long var10001 = var20 ^ 105056786752179L;
      int var22 = (int)((var20 ^ 105056786752179L) >>> 48);
      int var23 = (int)(var10001 << 16 >>> 48);
      int var24 = (int)(var10001 << 32 >>> 32);
      var10001 = var20 ^ 12228919964855L;
      int var25 = (int)((var20 ^ 12228919964855L) >>> 48);
      int var26 = (int)(var10001 << 16 >>> 32);
      int var27 = (int)(var10001 << 48 >>> 48);
      var10001 = var20 ^ 57712698711759L;
      int var28 = (int)((var20 ^ 57712698711759L) >>> 32);
      int var29 = (int)(var10001 << 32 >>> 48);
      int var30 = (int)(var10001 << 48 >>> 48);
      m = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[9];
      int var16 = 0;
      String var15 = "óDé\u009bBj\u0089^|p\u008fcÃ/Æ`pÀ\u0094ËÝ`Ø» ·\u0011áK\u0002÷\u0017ûþ\u0094Ð\u008ac\u0019î¦¹Áªc 9\u0084©õ¤k\u0099\\\u000f`` b)À^\u008fÔV S¯Ð\u009eâ\b\u0089Ùú\u008f\u0099ì\"3#\u00942X´\u009co6\fÒ\u00102Ló%z\u0013ÁÇB(³l\u008a\u0002¤Ù\u0018×\u007f&\u0089s«¢ þ!þð\u000fihÚcè¤#%È\u009a= >\u001f\u0004\u0000¬bÎ\u0002uÐÉ¢åa±iÆí;ÅftÆ\u008d\"\u0011\u0098á³ÓCl(;<ìu\u0092æ³oT\\\u0090øE½Ý>÷\u0018¦â\u0005\u0087áeN0Å®\n\r\u0096\b2Ó]ðP\u0001dv";
      int var17 = "óDé\u009bBj\u0089^|p\u008fcÃ/Æ`pÀ\u0094ËÝ`Ø» ·\u0011áK\u0002÷\u0017ûþ\u0094Ð\u008ac\u0019î¦¹Áªc 9\u0084©õ¤k\u0099\\\u000f`` b)À^\u008fÔV S¯Ð\u009eâ\b\u0089Ùú\u008f\u0099ì\"3#\u00942X´\u009co6\fÒ\u00102Ló%z\u0013ÁÇB(³l\u008a\u0002¤Ù\u0018×\u007f&\u0089s«¢ þ!þð\u000fihÚcè¤#%È\u009a= >\u001f\u0004\u0000¬bÎ\u0002uÐÉ¢åa±iÆí;ÅftÆ\u008d\"\u0011\u0098á³ÓCl(;<ìu\u0092æ³oT\\\u0090øE½Ý>÷\u0018¦â\u0005\u0087áeN0Å®\n\r\u0096\b2Ó]ðP\u0001dv".length();
      char var14 = 24;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var32 = var15.substring(var13, var13 + var14);
         byte var35 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
            String var38 = c(var19).intern();
            switch(var35) {
            case 0:
               var18[var16++] = var38;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  k = new String[9];
                  y = new HashMap(13);
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
                  String var4 = "\u0018èQíÜ\u0086]Úö¹¾\u0011Ê¢\u0003ç+©Lt«ò«7";
                  int var5 = "\u0018èQíÜ\u0086]Úö¹¾\u0011Ê¢\u0003ç+©Lt«ò«7".length();
                  int var2 = 0;

                  do {
                     int var40 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                     var40 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var41 = true;
                     var6[var40] = var10004;
                  } while(var2 < var5);

                  q = var6;
                  s = new Integer[3];
                  KProperty[] var31 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kd.class, true.n<invokedynamic>(26960, 3675695315935958934L ^ var20), true.n<invokedynamic>(22351, 4686698940543871361L ^ var20), 0)))};
                  Q = var31;
                  K = new kd((short)var22, (short)var23, var24);
                  il var34 = (il)K;
                  var38 = 19478.n<invokedynamic>(19478, 283433560988005076L ^ var20);
                  class_2248[] var42 = new class_2248[1];
                  class_2248 var10007 = class_2246.field_10540;
                  Intrinsics.checkNotNullExpressionValue(var10007, true.n<invokedynamic>(8919, 1998006817553832976L ^ var20));
                  var42[0] = var10007;
                  C = qi.K(var34, var28, var38, new kq((short)var25, var26, CollectionsKt.mutableListOf(var42), (char)var27), (pj)null, (short)var29, (Function0)null, (char)var30, true.q<invokedynamic>(21632, 2642313119303774655L ^ var20), (Object)null);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var38;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "Áp\u0093v3¹ïBÑ#Àc\u0097Q~\u0099líÇo«\u001bSZ\u0011q\u0003aO*´\u0001`\u0018ß\u000e$8E\u0015\\wq¹»~\u0016\u000b\u0013ÀFN/\u0080ÚV\u0094ý\u0089\n}ÆáL!\u0090p´\u008a\u0082K\u007f¥Ú\u0006ýþïx»å7*Ý\u0084Ö¥\u0011ö\u0006ßâ»\u0017TÃ\u000b\u0007¶\u0005el§\u0012\u0096Vì='\u0017Q\\\u0013vaº\u0088\u000bNfC\u0082ù\u0097\"\u0015\u0081d1";
               var17 = "Áp\u0093v3¹ïBÑ#Àc\u0097Q~\u0099líÇo«\u001bSZ\u0011q\u0003aO*´\u0001`\u0018ß\u000e$8E\u0015\\wq¹»~\u0016\u000b\u0013ÀFN/\u0080ÚV\u0094ý\u0089\n}ÆáL!\u0090p´\u008a\u0082K\u007f¥Ú\u0006ýþïx»å7*Ý\u0084Ö¥\u0011ö\u0006ßâ»\u0017TÃ\u000b\u0007¶\u0005el§\u0012\u0096Vì='\u0017Q\\\u0013vaº\u0088\u000bNfC\u0082ù\u0097\"\u0015\u0081d1".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var32 = var15.substring(var13, var13 + var14);
            var35 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13211;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/kd", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/kd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10338;
      if (s[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = q[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])y.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               y.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/kd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         s[var3] = var15;
      }

      return s[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/kd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
