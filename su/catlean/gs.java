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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

final class gs {
   private float b;
   private float r;
   private float s;
   private float S;
   private float z;
   private float m;
   private float d;
   private float X;
   private float H;
   private int i;
   private float y;
   private final float o;
   private final int D;
   private final int G;
   private static final long a = j0.a(9195859816481851776L, 8367102295321958483L, MethodHandles.lookup().lookupClass()).a(111944678295625L);
   private static final long[] c;
   private static final Integer[] e;
   private static final Map f = new HashMap(13);

   public gs(float x, float y, float z, short a, float prevX, float prevY, float prevZ, float motionX, float motionY, float motionZ, int age, float rotation, float rotationSpeed, long a, int offset, int maxAge) {
      long var18 = ((long)var4 << 48 | var14 << 16 >>> 16) ^ a;
      super();
      this.b = var1;
      4027349510790691332L.A<invokedynamic>(4027349510790691332L, var18);
      this.r = var2;

      try {
         this.s = var3;
         this.S = var5;
         this.z = var6;
         this.m = var7;
         this.d = var8;
         this.X = var9;
         this.H = var10;
         this.i = var11;
         this.y = var12;
         this.o = var13;
         this.D = var16;
         this.G = var17;
         if (3998551282611794455L.A<invokedynamic>(3998551282611794455L, var18) == null) {
            (new k9[5]).A<invokedynamic>(new k9[5], 3917299653839747926L, var18);
         }

      } catch (NumberFormatException var21) {
         throw var21.A<invokedynamic>(var21, 3973094738465867584L, var18);
      }
   }

   public gs(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, long var10, int var12, float var13, float var14, int var15, int var16, int var17, DefaultConstructorMarker var18) {
      var10 ^= a;
      long var19 = var10 ^ 77038668380101L;
      long var21 = var10 ^ 137199062716972L;
      long var10001 = var10 ^ 130685932505689L;
      int var23 = (int)((var10 ^ 130685932505689L) >>> 48);
      long var24 = var10001 << 16 >>> 16;
      k9[] var26 = -974160874216259685L.A<invokedynamic>(-974160874216259685L, var10);
      if ((var17 & true.b<invokedynamic>(22478, 256481710402415947L ^ var10)) != 0) {
         var4 = var1;
      }

      if ((var17 & true.b<invokedynamic>(4481, 262802897182681871L ^ var10)) != 0) {
         var5 = var2;
      }

      if ((var17 & true.b<invokedynamic>(25108, 4113978707573446803L ^ var10)) != 0) {
         var6 = var3;
      }

      if ((var17 & true.b<invokedynamic>(26859, 3238956892999324263L ^ var10)) != 0) {
         var7 = gw.h(var21, (ClosedRange)RangesKt.rangeTo(-0.1F, 0.1F), false, 2, (Object)null);
      }

      if ((var17 & true.b<invokedynamic>(21869, 2691556395169558498L ^ var10)) != 0) {
         var8 = gw.h(var21, (ClosedRange)RangesKt.rangeTo(0.01F, 0.03F), false, 2, (Object)null);
      }

      if ((var17 & true.b<invokedynamic>(8739, 1471480315068111013L ^ var10)) != 0) {
         var9 = gw.h(var21, (ClosedRange)RangesKt.rangeTo(-0.1F, 0.1F), false, 2, (Object)null);
      }

      if ((var17 & true.b<invokedynamic>(32675, 8541875386733856035L ^ var10)) != 0) {
         var12 = 0;
      }

      if ((var17 & true.b<invokedynamic>(1411, 701311637826371342L ^ var10)) != 0) {
         var13 = gw.h(var21, (ClosedRange)RangesKt.rangeTo(-15.0F, 15.0F), false, 2, (Object)null);
      }

      if ((var17 & true.b<invokedynamic>(28443, 2813593174030980504L ^ var10)) != 0) {
         var14 = gw.h(var21, (ClosedRange)RangesKt.rangeTo(-0.5F, 0.5F), false, 2, (Object)null);
      }

      if ((var17 & true.b<invokedynamic>(25492, 9004105895311743253L ^ var10)) != 0) {
         var15 = gw.l((ClosedRange)(new IntRange(0, true.b<invokedynamic>(29894, 3778038850367753806L ^ var10))), false, 2, (Object)null, var19);
      }

      if ((var17 & true.b<invokedynamic>(21245, 8221229474471684212L ^ var10)) != 0) {
         var16 = gw.l((ClosedRange)(new IntRange(true.b<invokedynamic>(27099, 1549549226340258655L ^ var10), true.b<invokedynamic>(13100, 5029176338520197550L ^ var10))), false, 2, (Object)null, var19);
      }

      this(var1, var2, var3, (short)var23, var4, var5, var6, var7, var8, var9, var12, var13, var14, var24, var15, var16);
      if (var26 != null) {
         (new int[5]).A<invokedynamic>(new int[5], -1001533486813531742L, var10);
      }

   }

   public final float y() {
      return this.b;
   }

   public final void w(float <set-?>) {
      this.b = var1;
   }

   public final float K() {
      return this.r;
   }

   public final void Y(float <set-?>) {
      this.r = var1;
   }

   public final float o() {
      return this.s;
   }

   public final void f(float <set-?>) {
      this.s = var1;
   }

   public final float e() {
      return this.S;
   }

   public final void A(float <set-?>) {
      this.S = var1;
   }

   public final float Q() {
      return this.z;
   }

   public final void u(float <set-?>) {
      this.z = var1;
   }

   public final float Z() {
      return this.m;
   }

   public final void a(float <set-?>) {
      this.m = var1;
   }

   public final float g() {
      return this.d;
   }

   public final void l(float <set-?>) {
      this.d = var1;
   }

   public final float q() {
      return this.X;
   }

   public final void I(float <set-?>) {
      this.X = var1;
   }

   public final float T() {
      return this.H;
   }

   public final void e(float <set-?>) {
      this.H = var1;
   }

   public final int i() {
      return this.i;
   }

   public final void n(int <set-?>) {
      this.i = var1;
   }

   public final float m() {
      return this.y;
   }

   public final void q(float <set-?>) {
      this.y = var1;
   }

   public final float R() {
      return this.o;
   }

   public final int a() {
      return this.D;
   }

   public final int J() {
      return this.G;
   }

   static {
      long var0 = a ^ 79783794775858L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[14];
      int var5 = 0;
      String var6 = "]\u0019·'Gn\"ÓÿfR\u001eþÙÿM\u0014\u008a \u0090\u0084\u008f#ÿÆà\u008f;\f\u0086îwÈÍ° \u0087_ê®ÕæÊqeIìÍ\u008eVK\u001bÐ¢Í\u0092:mCF Ó\u0016þ ü\u00134Ôï\u0097\u001cuéÜ\"\u0015ÍtfÛ\u00ad\u0019ª\u009c\u008c\u001e-\u0000\u00adl\u009a\u001d\u007f¿5";
      int var7 = "]\u0019·'Gn\"ÓÿfR\u001eþÙÿM\u0014\u008a \u0090\u0084\u008f#ÿÆà\u008f;\f\u0086îwÈÍ° \u0087_ê®ÕæÊqeIìÍ\u008eVK\u001bÐ¢Í\u0092:mCF Ó\u0016þ ü\u00134Ôï\u0097\u001cuéÜ\"\u0015ÍtfÛ\u00ad\u0019ª\u009c\u008c\u001e-\u0000\u00adl\u009a\u001d\u007f¿5".length();
      int var4 = 0;

      label23:
      while(true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var13 = var8;
         var10001 = var5++;
         long var14 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
         byte var16 = -1;

         while(true) {
            long var10 = var14;
            byte[] var12 = var2.doFinal(new byte[]{(byte)((int)(var10 >>> 56)), (byte)((int)(var10 >>> 48)), (byte)((int)(var10 >>> 40)), (byte)((int)(var10 >>> 32)), (byte)((int)(var10 >>> 24)), (byte)((int)(var10 >>> 16)), (byte)((int)(var10 >>> 8)), (byte)((int)var10)});
            long var18 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
            switch(var16) {
            case 0:
               var13[var10001] = var18;
               if (var4 >= var7) {
                  c = var8;
                  e = new Integer[14];
                  return;
               }
               break;
            default:
               var13[var10001] = var18;
               if (var4 < var7) {
                  continue label23;
               }

               var6 = "\u001a\u0085NÏ¿m<CÃ@=jº§h\\";
               var7 = "\u001a\u0085NÏ¿m<CÃ@=jº§h\\".length();
               var4 = 0;
            }

            var10001 = var4;
            var4 += 8;
            var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
            var13 = var8;
            var10001 = var5++;
            var14 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
            var16 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2481;
      if (e[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = c[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/gs", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
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
         throw new RuntimeException("su/catlean/gs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
