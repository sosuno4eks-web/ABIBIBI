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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class ol extends k9 {
   @NotNull
   public static final ol z;
   // $FF: synthetic field
   static final KProperty[] o;
   @NotNull
   private static final zc e;
   @NotNull
   private static final zo d;
   @NotNull
   private static final z0 n;
   @NotNull
   private static final iv r;
   private static final long b = j0.a(865760691568969141L, 6669670469303790582L, MethodHandles.lookup().lookupClass()).a(159976193030334L);
   private static final String[] c;
   private static final String[] f;
   private static final Map g;

   private ol(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 52703135795975L;
      super(var6, true.y<invokedynamic>(3615, 7330318900246663747L ^ var4), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   public final float j(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 125199284802991L;
      int var3 = (int)((var1 ^ 125199284802991L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)e.k((short)var3, this, o[0], (short)var4, var5)).floatValue();
   }

   public final boolean G(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 125972629821082L;
      int var3 = (int)((var1 ^ 125972629821082L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      int var6 = -1905305785216302871L.A<invokedynamic>(-1905305785216302871L, var1);

      try {
         boolean var10000 = (Boolean)d.k((short)var3, this, o[1], (short)var4, var5);
         if (-1904819855213731590L.A<invokedynamic>(-1904819855213731590L, var1) == null) {
            ++var6;
            var6.A<invokedynamic>(var6, -1891544652625609462L, var1);
         }

         return var10000;
      } catch (NumberFormatException var7) {
         throw var7.A<invokedynamic>(var7, -1898790896502812942L, var1);
      }
   }

   public final int i(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 33409674411174L;
      int var3 = (int)((var1 ^ 33409674411174L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      int var6 = -8092244454033593643L.A<invokedynamic>(-8092244454033593643L, var1);

      try {
         int var10000 = ((Number)n.k((short)var3, this, o[2], (short)var4, var5)).intValue();
         if (var6 != 0) {
            (new int[5]).A<invokedynamic>(new int[5], -8117835219876754196L, var1);
         }

         return var10000;
      } catch (NumberFormatException var7) {
         throw var7.A<invokedynamic>(var7, -8099073783896726322L, var1);
      }
   }

   @NotNull
   public final iv v() {
      return r;
   }

   public void n(long var1) {
      r.a();
   }

   @Flow
   private final void D(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean f() {
      long var0 = b ^ 107646590051805L;
      long var2 = var0 ^ 36855251599770L;
      return z.G(var2);
   }

   static {
      long var20 = b ^ 115887771210641L;
      long var22 = var20 ^ 77494230791687L;
      long var24 = var20 ^ 58274189837526L;
      long var26 = var20 ^ 106669491796161L;
      long var10001 = var20 ^ 17967841592298L;
      int var28 = (int)((var20 ^ 17967841592298L) >>> 48);
      int var29 = (int)(var10001 << 16 >>> 32);
      int var30 = (int)(var10001 << 48 >>> 48);
      g = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[10];
      int var16 = 0;
      String var15 = "ë¯\u009a½\u001d\u0090²|èÆÔ|æ°å\u0004\u0010Ê\u009aj\u0010£\u001eJD\u0096c\u0091Í\u000e\u008eH\u009d\u0010ÈÞøáMF\u0019@6,C6¥¹\u001fÀ\u0010«þPutHL®ZQ\u008b\f\u0089»\u001cµ\u0010\u008b\u0007Û/$\u0002y´\u0086µV)óx\u0084ª(\u001d\u00995Ç¥\n\u001dV§\u008bþ\u0097Ô¾§\u0090#e´n\u0004$\u0000w\u0087¸Pð Q\u0016m\u008fÜÐï5Í\u0000í\u0018Ê2Æ»Ì\u0085×¾G|'Z®K\u0092i¿\u0097\u009bó?õ!'\u0018}\u0002\u009dÝ\u0014\u0091\u0094\u0015ÕVkØP3ôëñw^\u007fÖ¨Ð6";
      int var17 = "ë¯\u009a½\u001d\u0090²|èÆÔ|æ°å\u0004\u0010Ê\u009aj\u0010£\u001eJD\u0096c\u0091Í\u000e\u008eH\u009d\u0010ÈÞøáMF\u0019@6,C6¥¹\u001fÀ\u0010«þPutHL®ZQ\u008b\f\u0089»\u001cµ\u0010\u008b\u0007Û/$\u0002y´\u0086µV)óx\u0084ª(\u001d\u00995Ç¥\n\u001dV§\u008bþ\u0097Ô¾§\u0090#e´n\u0004$\u0000w\u0087¸Pð Q\u0016m\u008fÜÐï5Í\u0000í\u0018Ê2Æ»Ì\u0085×¾G|'Z®K\u0092i¿\u0097\u009bó?õ!'\u0018}\u0002\u009dÝ\u0014\u0091\u0094\u0015ÕVkØP3ôëñw^\u007fÖ¨Ð6".length();
      char var14 = 16;
      int var13 = -1;

      label55:
      while(true) {
         ++var13;
         String var32 = var15.substring(var13, var13 + var14);
         byte var34 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
            String var39 = b(var19).intern();
            switch(var34) {
            case 0:
               var18[var16++] = var39;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  f = new String[10];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[4];
                  int var4 = 0;
                  String var5 = "ó\u001e\u0015Ý\u0012õ¹O\u000bÉ~GýÓ~+";
                  int var6 = "ó\u001e\u0015Ý\u0012õ¹O\u000bÉ~GýÓ~+".length();
                  int var3 = 0;

                  label37:
                  while(true) {
                     int var38 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var38, var3).getBytes("ISO-8859-1");
                     long[] var35 = var0;
                     var38 = var4++;
                     long var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var8 = var41;
                        byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var42) {
                        case 0:
                           var35[var38] = var44;
                           if (var3 >= var6) {
                              KProperty[] var31 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ol.class, true.y<invokedynamic>(27565, 3776276935292633064L ^ var20), true.y<invokedynamic>(9630, 8348810499138777555L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ol.class, true.y<invokedynamic>(10925, 2096494803894992621L ^ var20), true.y<invokedynamic>(1135, 7887316408767139875L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ol.class, true.y<invokedynamic>(20974, 4891726312943650220L ^ var20), true.y<invokedynamic>(21420, 6111590628587866093L ^ var20), 0)))};
                              o = var31;
                              z = new ol((short)var28, var29, (short)var30);
                              e = qi.g((il)z, true.y<invokedynamic>(16942, 5860117269391906409L ^ var20), 1.0F, RangesKt.rangeTo(0.1F, 10.0F), (pj)null, (Function0)null, (int)var0[2], var24, (Object)null);
                              d = qi.R((il)z, true.y<invokedynamic>(9582, 1216149841702416682L ^ var20), false, (pj)null, (Function0)null, (int)var0[1], var26, (Object)null);
                              n = qi.o((il)z, true.y<invokedynamic>(24304, 4547313795401026227L ^ var20), 1, new IntRange(1, (int)var0[0]), var22, (pj)null, ol::f, (int)var0[3], (Object)null);
                              r = new iv();
                              return;
                           }
                           break;
                        default:
                           var35[var38] = var44;
                           if (var3 < var6) {
                              continue label37;
                           }

                           var5 = "5¸öÈ0JñlùÖê\u000füP«Ø";
                           var6 = "5¸öÈ0JñlùÖê\u000füP«Ø".length();
                           var3 = 0;
                        }

                        var38 = var3;
                        var3 += 8;
                        var7 = var5.substring(var38, var3).getBytes("ISO-8859-1");
                        var35 = var0;
                        var38 = var4++;
                        var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var42 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var39;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label55;
               }

               var15 = "<[B \u0015vC¬ \u0093Þæ'\u0088\u0083Kê§¨{Äú\u0088\u008f_Þñ[\u0082J\u0093v\u00180xx`¡¸Msü\u0004î\u0004u\u0087¤ÉÕ(Y\u0089-E\\y";
               var17 = "<[B \u0015vC¬ \u0093Þæ'\u0088\u0083Kê§¨{Äú\u0088\u008f_Þñ[\u0082J\u0093v\u00180xx`¡¸Msü\u0004î\u0004u\u0087¤ÉÕ(Y\u0089-E\\y".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var32 = var15.substring(var13, var13 + var14);
            var34 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19493;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ol", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         f[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ol" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
