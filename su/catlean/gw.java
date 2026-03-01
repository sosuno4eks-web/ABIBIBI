package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedRange;
import org.jetbrains.annotations.NotNull;

public final class gw {
   @NotNull
   private static final Random X;
   private static int V;
   private static final long a = j0.a(7011545149138472698L, 6879263990027025578L, MethodHandles.lookup().lookupClass()).a(239462405373023L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   @NotNull
   public static final Random O() {
      return X;
   }

   public static final int W(int from, int to, boolean normalDistribution) {
      return MathKt.roundToInt((float)var0 + (float)(var1 - var0) * (float)u(var2));
   }

   // $FF: synthetic method
   public static int R(long var0, int var2, int var3, boolean var4, int var5, Object var6) {
      long var10000 = a ^ var0;
      if ((var5 & 4) != 0) {
         var4 = true;
      }

      return W(var2, var3, var4);
   }

   public static final float z(float from, float to, boolean normalDistribution) {
      return var0 + (var1 - var0) * (float)u(var2);
   }

   // $FF: synthetic method
   public static float Y(float var0, short var1, float var2, boolean var3, char var4, int var5, int var6, Object var7) {
      long var8 = ((long)var1 << 48 | (long)var4 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ a;
      int var10 = -3222782092500030670L.A<invokedynamic>(-3222782092500030670L, var8);

      int var10000;
      label20: {
         try {
            var10000 = var5 & 4;
            if (var10 == 0) {
               break label20;
            }

            if (var10000 == 0) {
               return z(var0, var2, (boolean)var3);
            }
         } catch (NumberFormatException var11) {
            throw var11.A<invokedynamic>(var11, -3213992012268842874L, var8);
         }

         var10000 = 1;
      }

      var3 = var10000;
      return z(var0, var2, (boolean)var3);
   }

   public static final double n(double from, double to, boolean normalDistribution) {
      return var0 + (var2 - var0) * u(var4);
   }

   // $FF: synthetic method
   public static double H(double var0, double var2, boolean var4, long var5, int var7, Object var8) {
      var5 ^= a;
      int var9 = 1803227191187497330L.A<invokedynamic>(1803227191187497330L, var5);

      int var10000;
      label20: {
         try {
            var10000 = var7 & 4;
            if (var9 == 0) {
               break label20;
            }

            if (var10000 == 0) {
               return n(var0, var2, (boolean)var4);
            }
         } catch (NumberFormatException var10) {
            throw var10.A<invokedynamic>(var10, 1812032664312486598L, var5);
         }

         var10000 = 1;
      }

      var4 = var10000;
      return n(var0, var2, (boolean)var4);
   }

   public static final double t(@NotNull ClosedRange range, char a, short a, int a, boolean normalDistribution) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var0, true.s<invokedynamic>(13118, 8925814763278354293L ^ var5));
      return n(((Number)var0.getStart()).doubleValue(), ((Number)var0.getEndInclusive()).doubleValue(), var4);
   }

   // $FF: synthetic method
   public static double g(ClosedRange var0, boolean var1, int var2, Object var3, long var4) {
      var4 ^= a;
      long var10001 = var4 ^ 98666637170877L;
      int var6 = (int)((var4 ^ 98666637170877L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      int var9 = 2701625626634181898L.A<invokedynamic>(2701625626634181898L, var4);

      int var10000;
      label20: {
         try {
            var10000 = var2 & 2;
            if (var9 == 0) {
               break label20;
            }

            if (var10000 == 0) {
               return t(var0, (char)var6, (short)var7, var8, (boolean)var1);
            }
         } catch (NumberFormatException var10) {
            throw var10.A<invokedynamic>(var10, 2692556339444524734L, var4);
         }

         var10000 = 1;
      }

      var1 = var10000;
      return t(var0, (char)var6, (short)var7, var8, (boolean)var1);
   }

   public static final float g(@NotNull ClosedRange range, boolean normalDistribution, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var0, true.s<invokedynamic>(26829, 3369495022499260291L ^ var2));
      return z(((Number)var0.getStart()).floatValue(), ((Number)var0.getEndInclusive()).floatValue(), var1);
   }

   // $FF: synthetic method
   public static float h(long var0, ClosedRange var2, boolean var3, int var4, Object var5) {
      var0 ^= a;
      long var6 = var0 ^ 103160530122851L;
      int var8 = 9109186073463236670L.A<invokedynamic>(9109186073463236670L, var0);

      int var10000;
      label20: {
         try {
            var10000 = var4 & 2;
            if (var8 != 0) {
               break label20;
            }

            if (var10000 == 0) {
               return g(var2, (boolean)var3, var6);
            }
         } catch (NumberFormatException var9) {
            throw var9.A<invokedynamic>(var9, 9117473631787318628L, var0);
         }

         var10000 = 1;
      }

      var3 = var10000;
      return g(var2, (boolean)var3, var6);
   }

   public static final int z(@NotNull ClosedRange range, boolean normalDistribution, long a) {
      var2 ^= a;
      int var10000 = 2865541814757973936L.A<invokedynamic>(2865541814757973936L, var2);
      Intrinsics.checkNotNullParameter(var0, true.s<invokedynamic>(13118, 8925850121804825444L ^ var2));
      int var4 = var10000;

      try {
         var10000 = W(((Number)var0.getStart()).intValue(), ((Number)var0.getEndInclusive()).intValue(), var1);
         if (2862183269404451538L.A<invokedynamic>(2862183269404451538L, var2) == null) {
            ++var4;
            var4.A<invokedynamic>(var4, 2779308026811331581L, var2);
         }

         return var10000;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 2875417044464116740L, var2);
      }
   }

   // $FF: synthetic method
   public static int l(ClosedRange var0, boolean var1, int var2, Object var3, long var4) {
      var4 ^= a;
      long var6 = var4 ^ 113741666165407L;
      int var8 = -7256138309763472583L.A<invokedynamic>(-7256138309763472583L, var4);

      int var10000;
      label20: {
         try {
            var10000 = var2 & 2;
            if (var8 == 0) {
               return var10000;
            }

            if (var10000 == 0) {
               break label20;
            }
         } catch (NumberFormatException var9) {
            throw var9.A<invokedynamic>(var9, -7246574173118556019L, var4);
         }

         var1 = true;
      }

      var10000 = z(var0, var1, var6);
      return var10000;
   }

   public static final double u(boolean normalDistribution) {
      return X.nextDouble();
   }

   public static final double S() {
      return X.nextGaussian();
   }

   static {
      long var16 = a ^ 132898725583357L;
      d = new HashMap(13);
      0.A<invokedynamic>(0, 5122283235982725753L, var16);
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var16 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[2];
      int var12 = 0;
      String var11 = "ì9\u0080±/ÑP\u0087\u0012(5¹E=öÿ\u0010¨ª\u0002\u0007Ë×ìg\u0013\u009a÷º,¢Öa";
      int var13 = "ì9\u0080±/ÑP\u0087\u0012(5¹E=öÿ\u0010¨ª\u0002\u0007Ë×ìg\u0013\u009a÷º,¢Öa".length();
      char var10 = 16;
      int var9 = -1;

      while(true) {
         ++var9;
         byte[] var15 = var7.doFinal(var11.substring(var9, var9 + var10).getBytes("ISO-8859-1"));
         String var19 = a(var15).intern();
         boolean var10001 = true;
         var14[var12++] = var19;
         if ((var9 += var10) >= var13) {
            b = var14;
            c = new String[2];
            Cipher var2;
            var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var3 = 1; var3 < 8; ++var3) {
               var10003[var3] = (byte)((int)(var16 << var3 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var4 = -1775404236427445647L;
            byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
            long var21 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
            var10001 = true;
            long var0 = var21;
            X = new Random(var0);
            return;
         }

         var10 = var11.charAt(var9);
      }
   }

   public static void b(int var0) {
      V = var0;
   }

   public static int T() {
      return V;
   }

   public static int Q() {
      int var0 = T();

      try {
         return var0 == 0 ? 55 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22069;
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
            throw new RuntimeException("su/catlean/gw", var10);
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
         throw new RuntimeException("su/catlean/gw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
