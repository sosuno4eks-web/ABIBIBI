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
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_2596;
import net.minecraft.class_2885;
import net.minecraft.class_3965;
import net.minecraft.class_2828.class_2830;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class tf extends k9 {
   @NotNull
   public static final tf y;
   static final KProperty[] k;
   @NotNull
   private static final zo W;
   @Nullable
   private static class_2338 l;
   @NotNull
   private static final iv B;
   private static final long b = j0.a(-4360160366892763309L, 946642832116325585L, MethodHandles.lookup().lookupClass()).a(267351399175471L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private tf(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ b;
      long var6 = var4 ^ 106719710338399L;
      super(var6, true.t<invokedynamic>(32291, 4218349874748873187L ^ var4), pa.N(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean Q(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 24644431992612L;
      int var3 = (int)((var1 ^ 24644431992612L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)W.k((short)var3, this, k[0], (short)var4, var5);
   }

   public void n(long var1) {
      long var3 = var1 ^ 102853793849744L;
      long var5 = var1 ^ 109974564318850L;
      -6668717802799326597L.A<invokedynamic>(-6668717802799326597L, var1);
      l = class_2338.method_49638((class_2374)this.W(var5, (class_1297)s8.f(var3)));

      try {
         if (-6751506765941201113L.A<invokedynamic>(-6751506765941201113L, var1) == null) {
            (new k9[2]).A<invokedynamic>(new k9[2], -6746068529590343803L, var1);
         }

      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, -6748209217119764863L, var1);
      }
   }

   @Flow
   public final void T(@NotNull PlayerUpdateEvent e) {
      // $FF: Couldn't be decompiled
   }

   private final void Z(long var1, double var3, float var5) {
      var1 ^= b;
      long var6 = var1 ^ 91368943129257L;
      long var8 = var1 ^ 100962981065527L;
      h4.G((class_2596)(new class_2830(s8.f(var6).method_23317(), s8.f(var6).method_23318() + var3, s8.f(var6).method_23321(), s8.f(var6).method_36454(), var5, false, s8.f(var6).field_5976)), var8);
   }

   private static final class_2596 B(class_2338 var0, int var1) {
      return (class_2596)(new class_2885(class_1268.field_5808, new class_3965(var0.method_46558().method_1031(0.0D, -0.5D, 0.0D), class_2350.field_11036, var0.method_10074(), false), var1));
   }

   static {
      long var20 = b ^ 71826784196363L;
      long var22 = var20 ^ 84603083089372L;
      long var10001 = var20 ^ 130306348077352L;
      int var24 = (int)((var20 ^ 130306348077352L) >>> 32);
      long var25 = var10001 << 32 >>> 32;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[7];
      int var16 = 0;
      String var15 = "Ö\u008b\u0096êb6\u0007Rî\u009b4Ýn ±8 Þp¤ø7ÄÄ\u009d\u0084µ®\u000f\u001a@??û\u0013\u0082=ó'ÈtX^¦¬@\u000f\u0013ë\u00105þÇkY¤³\u0011\u000eîSâ8÷\u008b\u000e 9\u001e8Ão¾¶WtÞÎ#n\u0010\u0001`óîî\u000b\u009d±\u0012X\u001fó¹\u001b^B\b\u0095\u0018Tí\t`c5\u000e®\u008eÈ\u001a5B0¿Úog\u0007\u009e¯£Fø";
      int var17 = "Ö\u008b\u0096êb6\u0007Rî\u009b4Ýn ±8 Þp¤ø7ÄÄ\u009d\u0084µ®\u000f\u001a@??û\u0013\u0082=ó'ÈtX^¦¬@\u000f\u0013ë\u00105þÇkY¤³\u0011\u000eîSâ8÷\u008b\u000e 9\u001e8Ão¾¶WtÞÎ#n\u0010\u0001`óîî\u000b\u009d±\u0012X\u001fó¹\u001b^B\b\u0095\u0018Tí\t`c5\u000e®\u008eÈ\u001a5B0¿Úog\u0007\u009e¯£Fø".length();
      char var14 = 16;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var28 = var15.substring(var13, var13 + var14);
         byte var30 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var28.getBytes("ISO-8859-1"));
            String var34 = b(var19).intern();
            switch(var30) {
            case 0:
               var18[var16++] = var34;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[7];
                  i = new HashMap(13);
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
                  String var4 = "¸\u0090l´ùá\u0013¬i\u0018\u0000\u0081õ¥Å·S2Óë9\u001b\u0018®";
                  int var5 = "¸\u0090l´ùá\u0013¬i\u0018\u0000\u0081õ¥Å·S2Óë9\u001b\u0018®".length();
                  int var2 = 0;

                  do {
                     int var33 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                     var33 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var36 = true;
                     var6[var33] = var10004;
                  } while(var2 < var5);

                  f = var6;
                  g = new Integer[3];
                  KProperty[] var27 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tf.class, true.t<invokedynamic>(21803, 101730397435359667L ^ var20), true.t<invokedynamic>(6223, 7231428635643788500L ^ var20), 0)))};
                  k = var27;
                  y = new tf(var24, var25);
                  W = qi.R((il)y, true.t<invokedynamic>(869, 5864859195092150271L ^ var20), true, (pj)null, (Function0)null, true.t<invokedynamic>(24135, 5593982687664159996L ^ var20), var22, (Object)null);
                  B = new iv();
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var34;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "\u0017R¢\u0093ÄÖ~ßªV\u000fCú\u008d\u0019x \u0006ÌìÞ\u0003à\u009e\u0085É\u0092\u0017´å[I\u0088¦$as;R\u0084F¯¾08\u001e\u0088\u008fý";
               var17 = "\u0017R¢\u0093ÄÖ~ßªV\u000fCú\u008d\u0019x \u0006ÌìÞ\u0003à\u009e\u0085É\u0092\u0017´å[I\u0088¦$as;R\u0084F¯¾08\u001e\u0088\u008fý".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var28 = var15.substring(var13, var13 + var14);
            var30 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25062;
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
            throw new RuntimeException("su/catlean/tf", var10);
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
         throw new RuntimeException("su/catlean/tf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10183;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/tf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/tf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
