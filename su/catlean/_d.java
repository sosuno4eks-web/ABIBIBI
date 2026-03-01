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

public class _d {
   private float b;
   private float T;
   private float o;
   private float R;
   private int Y;
   private float X;
   private float i;
   private boolean D;
   private static final long a = j0.a(9210189106347382923L, 3286136636093674770L, MethodHandles.lookup().lookupClass()).a(248034408698637L);
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e = new HashMap(13);

   public _d(float x, float y, float motionX, float motionY, int time, float lastX, float lastY, boolean flame) {
      this.b = var1;
      this.T = var2;
      this.o = var3;
      this.R = var4;
      this.Y = var5;
      this.X = var6;
      this.i = var7;
      this.D = var8;
   }

   // $FF: synthetic method
   public _d(float var1, long var2, float var4, float var5, float var6, int var7, float var8, float var9, boolean var10, int var11, DefaultConstructorMarker var12) {
      var2 ^= a;
      if ((var11 & true.d<invokedynamic>(8665, 4149399266352764425L ^ var2)) != 0) {
         var8 = var1;
      }

      if ((var11 & true.d<invokedynamic>(9824, 7202364410868634034L ^ var2)) != 0) {
         var9 = var4;
      }

      if ((var11 & true.d<invokedynamic>(23958, 2897496944142510661L ^ var2)) != 0) {
         var10 = false;
      }

      this(var1, var4, var5, var6, var7, var8, var9, var10);
   }

   public final float Q() {
      return this.b;
   }

   public final void F(float <set-?>) {
      this.b = var1;
   }

   public final float U() {
      return this.T;
   }

   public final void e(float <set-?>) {
      this.T = var1;
   }

   public final float W() {
      return this.o;
   }

   public final void Y(float <set-?>) {
      this.o = var1;
   }

   public final float w() {
      return this.R;
   }

   public final void v(float <set-?>) {
      this.R = var1;
   }

   public final int G() {
      return this.Y;
   }

   public final void r(int <set-?>) {
      this.Y = var1;
   }

   public final float z() {
      return this.X;
   }

   public final void d(float <set-?>) {
      this.X = var1;
   }

   public final float X() {
      return this.i;
   }

   public final void j(float <set-?>) {
      this.i = var1;
   }

   public final boolean r() {
      return this.D;
   }

   public final void a(boolean <set-?>) {
      this.D = var1;
   }

   static {
      long var0 = a ^ 84397119897377L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[3];
      int var5 = 0;
      String var6 = "eÖ%WÑfl¸\u007f\u001e0,/!ÇÞ\u0086ÿÉZw\u0010MS";
      int var7 = "eÖ%WÑfl¸\u007f\u001e0,/!ÇÞ\u0086ÿÉZw\u0010MS".length();
      int var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
         byte[] var12 = var2.doFinal(new byte[]{(byte)((int)(var10 >>> 56)), (byte)((int)(var10 >>> 48)), (byte)((int)(var10 >>> 40)), (byte)((int)(var10 >>> 32)), (byte)((int)(var10 >>> 24)), (byte)((int)(var10 >>> 16)), (byte)((int)(var10 >>> 8)), (byte)((int)var10)});
         long var10004 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
         boolean var13 = true;
         var8[var10001] = var10004;
      } while(var4 < var7);

      c = var8;
      d = new Integer[3];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25024;
      if (d[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = c[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/_d", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
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
         throw new RuntimeException("su/catlean/_d" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
