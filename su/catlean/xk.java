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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class xk implements zh {
   @NotNull
   public static final xk s;
   private static String t;
   private static final long a = j0.a(2624795223712539299L, 160629536239234671L, MethodHandles.lookup().lookupClass()).a(248695999342676L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private xk() {
   }

   public final int d(byte a, long a, @NotNull class_1657 target) {
      long var5 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
      long var7 = var5 ^ 107859633472101L;
      long var9 = var5 ^ 97009599363738L;
      Intrinsics.checkNotNullParameter(var4, true.o<invokedynamic>(24200, 4438151247905361392L ^ var5));
      int var11 = vi.h(vi.o, (class_1657)null, 1, var9, (Object)null);
      int var12 = vi.o.X(var4, var7);
      float var13 = 0.12857F * (float)(var11 + var12) - (float)true.k<invokedynamic>(16379, 6092810674650933671L ^ var5);
      return RangesKt.coerceIn(MathKt.roundToInt(var13), 0, true.k<invokedynamic>(29666, 8907579853551805885L ^ var5));
   }

   public final boolean M(@NotNull class_1657 $this$isInWeb, long a) {
      // $FF: Couldn't be decompiled
   }

   public final boolean x(@NotNull class_1657 $this$isInBerry, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final List O(@NotNull class_1657 $this$getAffectedBlocks, long a) {
      var2 ^= a;
      7946625312662425501L.A<invokedynamic>(7946625312662425501L, var2);
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(9517, 3970566073065654206L ^ var2));
      double var5 = (double)class_2338.method_49637(var1.method_23317(), (double)MathKt.roundToInt(var1.method_23318()), var1.method_23321()).method_10264();
      class_238 var10000 = var1.method_5829();
      Intrinsics.checkNotNullExpressionValue(var10000, true.o<invokedynamic>(19997, 4819987724952153226L ^ var2));
      class_238 var7 = var10000;
      float var8 = 1.0E-5F;
      class_2338[] var10 = new class_2338[4];
      class_2338 var10002 = class_2338.method_49637(var7.field_1323, var5, var7.field_1321);
      Intrinsics.checkNotNullExpressionValue(var10002, true.o<invokedynamic>(31538, 7397432576760256934L ^ var2));
      var10[0] = var10002;
      var10002 = class_2338.method_49637(var7.field_1323, var5, var7.field_1324 - (double)var8);
      Intrinsics.checkNotNullExpressionValue(var10002, true.o<invokedynamic>(13345, 1458846041090971313L ^ var2));
      var10[1] = var10002;
      var10002 = class_2338.method_49637(var7.field_1320 - (double)var8, var5, var7.field_1321);
      Intrinsics.checkNotNullExpressionValue(var10002, true.o<invokedynamic>(13345, 1458846041090971313L ^ var2));
      var10[2] = var10002;
      var10002 = class_2338.method_49637(var7.field_1320 - (double)var8, var5, var7.field_1324 - (double)var8);
      Intrinsics.checkNotNullExpressionValue(var10002, true.o<invokedynamic>(13345, 1458846041090971313L ^ var2));
      var10[3] = var10002;
      Set var9 = SetsKt.setOf(var10);

      try {
         List var12 = CollectionsKt.toList((Iterable)var9);
         if (8029311305781570055L.A<invokedynamic>(8029311305781570055L, var2) == null) {
            (new k9[1]).A<invokedynamic>(new k9[1], 8004491712844706791L, var2);
         }

         return var12;
      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, 8042945881438611462L, var2);
      }
   }

   public final boolean d(long a, @NotNull class_243 from, @NotNull class_243 to) {
      var1 ^= a;
      long var10001 = var1 ^ 55748367069444L;
      int var5 = (int)((var1 ^ 55748367069444L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);

      boolean var10000;
      try {
         Intrinsics.checkNotNullParameter(var3, true.o<invokedynamic>(32433, 1469038441843010698L ^ var1));
         Intrinsics.checkNotNullParameter(var4, true.o<invokedynamic>(16168, 3364060279912099095L ^ var1));
         if (ab.S(ab.O, var5, var3, var4, false, (List)null, false, (short)var6, true.k<invokedynamic>(355, 6858007497597539965L ^ var1), var7, (Object)null) == null) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, 6859055673327343784L, var1);
      }

      var10000 = false;
      return var10000;
   }

   public final boolean u(@NotNull class_1657 $this$isPartlyInWeb, char a, int a, char a, boolean checkFace) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static boolean K(xk var0, class_1657 var1, long var2, boolean var4, int var5, Object var6) {
      var2 ^= a;
      long var10001 = var2 ^ 34703595936177L;
      int var7 = (int)((var2 ^ 34703595936177L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      k9[] var10 = 4546479487268576973L.A<invokedynamic>(4546479487268576973L, var2);

      int var10000;
      label20: {
         try {
            var10000 = var5 & 1;
            if (var10 == null) {
               return (boolean)var10000;
            }

            if (var10000 == 0) {
               break label20;
            }
         } catch (NumberFormatException var11) {
            throw var11.A<invokedynamic>(var11, 4525565900446218582L, var2);
         }

         var4 = false;
      }

      var10000 = var0.u(var1, (char)var7, var8, (char)var9, var4);
      return (boolean)var10000;
   }

   public final boolean j(int a, @NotNull class_1657 $this$isPartlyInBerry, char a, short a) {
      long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var10001 = var5 ^ 137473099232846L;
      int var7 = (int)((var5 ^ 137473099232846L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var5 ^ 40212985298153L;
      Intrinsics.checkNotNullParameter(var2, true.o<invokedynamic>(5746, 4102247883021757355L ^ var5));
      return Intrinsics.areEqual((Object)s8.i((char)var7, var8, (short)var9).method_8320(class_2338.method_49638((class_2374)k6.Y.W(var10, (class_1297)var2))).method_26204(), (Object)class_2246.field_16999);
   }

   static {
      long var20 = a ^ 49777157398690L;
      d = new HashMap(13);
      "AcGb7".A<invokedynamic>("AcGb7", 8848257424835789762L, var20);
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
      String var15 = "ZÙ\u008bL=\u0017W\u009d\u0083m\u0093Áþ;\u0093\u009e($JH5y\u0089\u0082)Î¾øö\u008b3\u008dâÜV\u0014qX$å \u009dÚpñ\u00ad)\fý[\u0085^ú\u0014\u0089ñè Ï\u0090àü8Ç\u0081ã3\u009f>)Zÿó½ÇÌ÷Ð>-Ã°¼\r\u0001)\u0081±/û\u0010N\u008c©×E\u0006\u0084Vº\u009d@ü©ËUý\u0010ò\u0005égK\u0006q\nMPBIÀÎb×\u0010ÿÿÛ]\u008e\u009e\u0080Ô\u007ffÙ\u0089$Ý¢f";
      int var17 = "ZÙ\u008bL=\u0017W\u009d\u0083m\u0093Áþ;\u0093\u009e($JH5y\u0089\u0082)Î¾øö\u008b3\u008dâÜV\u0014qX$å \u009dÚpñ\u00ad)\fý[\u0085^ú\u0014\u0089ñè Ï\u0090àü8Ç\u0081ã3\u009f>)Zÿó½ÇÌ÷Ð>-Ã°¼\r\u0001)\u0081±/û\u0010N\u008c©×E\u0006\u0084Vº\u009d@ü©ËUý\u0010ò\u0005égK\u0006q\nMPBIÀÎb×\u0010ÿÿÛ]\u008e\u009e\u0080Ô\u007ffÙ\u0089$Ý¢f".length();
      char var14 = 16;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var27;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[8];
                  g = new HashMap(13);
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
                  String var4 = "Í\u0010\u007fÜõKÂ[ÕEàõkÞ\u00106IÜ÷\u0096%7\u0013W";
                  int var5 = "Í\u0010\u007fÜõKÂ[ÕEàõkÞ\u00106IÜ÷\u0096%7\u0013W".length();
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
                  f = new Integer[3];
                  s = new xk();
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var27;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "«[å\u0002jUó|\u0096â\u0018µ\u009b\u00adý\u008cT\u009dÇ\u0098#¾ÜL\u0010V\u0098qªí\u0084øñú©0,þ>\u0014C";
               var17 = "«[å\u0002jUó|\u0096â\u0018µ\u009b\u00adý\u008cT\u009dÇ\u0098#¾ÜL\u0010V\u0098qªí\u0084øñú©0,þ>\u0014C".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void S(String var0) {
      t = var0;
   }

   public static String p() {
      return t;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3116;
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
            throw new RuntimeException("su/catlean/xk", var10);
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
         throw new RuntimeException("su/catlean/xk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2314;
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
            throw new RuntimeException("su/catlean/xk", var14);
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
         throw new RuntimeException("su/catlean/xk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
