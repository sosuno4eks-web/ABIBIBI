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
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.gofra.Flow;

public final class o_ extends k9 {
   @NotNull
   public static final o_ g;
   static final KProperty[] k;
   @NotNull
   private static final zr u;
   @NotNull
   private static final z0 s;
   private static final long b = j0.a(5409631297939227254L, 5163865686626236464L, MethodHandles.lookup().lookupClass()).a(46370443599605L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] i;
   private static final Map l;

   private o_(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 73250627458874L;
      super(var3, true.d<invokedynamic>(21602, 5107540997588979278L ^ var1), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final x8 U(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 107320602247834L;
      int var3 = (int)((var1 ^ 107320602247834L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (x8)u.k((short)var3, this, k[0], (short)var4, var5);
   }

   private final int u(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 54279106100094L;
      int var3 = (int)((var1 ^ 54279106100094L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)s.k((short)var3, this, k[1], (short)var4, var5)).intValue();
   }

   @Flow(
      priority = -10
   )
   private final void S(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void b(PreSyncEvent param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 97275692611886L;
      long var22 = var20 ^ 3402709591668L;
      long var24 = var20 ^ 24543012826945L;
      long var26 = var20 ^ 83810225255784L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[8];
      int var16 = 0;
      String var15 = "Lh\u009a\u0093)oî-AÚIí²^âØ\u0010I;Æ49y*óg¬çwgå¬í\u0018\u0006!^Oã5µE\u0005vÿs\u008fO`9\u009b ×Wì\u008d\u007f|8öNs;/Ç:òç¢-\u0085=:\u0013\u00075y\u0084V\u009d\u001dmu\u0095\u009aú\u0095ÆL8(|\tyàvÿ\u0098ßY\u0091\u001blíjzLò«\u000e\t\u009eTÚ§\u0010³\u008b2;âoÆ\u0080sk\u008c®1¹Å? ¿Vî@Ù\u0003<°\u0002´Äa\"õüÌ\u0014À\u000ek\u008d\r*³JAÜ\u0003þ\u0014c\r";
      int var17 = "Lh\u009a\u0093)oî-AÚIí²^âØ\u0010I;Æ49y*óg¬çwgå¬í\u0018\u0006!^Oã5µE\u0005vÿs\u008fO`9\u009b ×Wì\u008d\u007f|8öNs;/Ç:òç¢-\u0085=:\u0013\u00075y\u0084V\u009d\u001dmu\u0095\u009aú\u0095ÆL8(|\tyàvÿ\u0098ßY\u0091\u001blíjzLò«\u000e\t\u009eTÚ§\u0010³\u008b2;âoÆ\u0080sk\u008c®1¹Å? ¿Vî@Ù\u0003<°\u0002´Äa\"õüÌ\u0014À\u000ek\u008d\r*³JAÜ\u0003þ\u0014c\r".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var35 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var35;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[8];
                  l = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "\"s|\u00adÊ»¦¦ûJ\u0016»ô\u0082ÓÔ";
                  int var5 = "\"s|\u00adÊ»¦¦ûJ\u0016»ô\u0082ÓÔ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var33 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                     long[] var32 = var6;
                     var33 = var3++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var32[var33] = var40;
                           if (var2 >= var5) {
                              f = var6;
                              i = new Integer[4];
                              KProperty[] var28 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(o_.class, true.d<invokedynamic>(18722, 3053141604665710429L ^ var20), true.d<invokedynamic>(25912, 6698614447762438981L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(o_.class, true.d<invokedynamic>(16073, 3071374379443069111L ^ var20), true.d<invokedynamic>(31355, 7495650865078133767L ^ var20), 0)))};
                              k = var28;
                              g = new o_(var26);
                              u = qi.M((il)g, true.d<invokedynamic>(31440, 8148865048533918889L ^ var20), (Enum)x8.DEFAULT, (pj)null, (Function0)null, true.l<invokedynamic>(26886, 5445734380914224571L ^ var20), (Object)null, var24);
                              s = qi.o((il)g, true.d<invokedynamic>(6110, 1059595248268511652L ^ var20), 2, new IntRange(1, true.l<invokedynamic>(15827, 9164321824552122732L ^ var20)), var22, (pj)null, (Function0)null, true.l<invokedynamic>(21500, 7284941645283891008L ^ var20), (Object)null);
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0097\u009eì\u0094\u008f]shí\u009bYsJ=K\f";
                           var5 = "\u0097\u009eì\u0094\u008f]shí\u009bYsJ=K\f".length();
                           var2 = 0;
                        }

                        var33 = var2;
                        var2 += 8;
                        var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                        var32 = var6;
                        var33 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var38 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var35;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u000eO\u007fp\u0002\u0014\u0015\u008aJ\u0083zÅ\u0019RêL\u0010uõ¨r+\u0080²N²\u00973/Á\u0082J©";
               var17 = "\u000eO\u007fp\u0002\u0014\u0015\u008aJ\u0083zÅ\u0019RêL\u0010uõ¨r+\u0080²N²\u00973/Á\u0082J©".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var29 = var15.substring(var13, var13 + var14);
            var10001 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22124;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/o_", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/o_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3244;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/o_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/o_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
