package su.catlean;

import java.awt.Color;
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
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

public final class b0 {
   private float Z;
   private float L;
   private float c;
   private float S;
   private float X;
   private float i;
   private float G;
   private float T;
   private float W;
   private float P;
   private float N;
   private float B;
   private float F;
   private int j;
   private int w;
   private boolean V;
   private boolean r;
   private int z;
   @NotNull
   private final Color E;
   private float d;
   private static final long a = j0.a(7706958190864087105L, 3532720658887997551L, MethodHandles.lookup().lookupClass()).a(18136509736607L);
   private static final long[] b;
   private static final Integer[] e;
   private static final Map f = new HashMap(13);

   public b0(float posX, float posY, float posZ, long a, float motionX, float motionY, float motionZ, float rot, float rotSpeed, float size) {
      // $FF: Couldn't be decompiled
   }

   public final float u() {
      return this.Z;
   }

   public final void E(float <set-?>) {
      this.Z = var1;
   }

   public final float g() {
      return this.L;
   }

   public final void k(float <set-?>) {
      this.L = var1;
   }

   public final float P() {
      return this.c;
   }

   public final void B(float <set-?>) {
      this.c = var1;
   }

   public final float D() {
      return this.S;
   }

   public final void D(float <set-?>) {
      this.S = var1;
   }

   public final float i() {
      return this.X;
   }

   public final void U(float <set-?>) {
      this.X = var1;
   }

   public final float X() {
      return this.i;
   }

   public final void S(float <set-?>) {
      this.i = var1;
   }

   public final float O() {
      return this.G;
   }

   public final void d(float <set-?>) {
      this.G = var1;
   }

   public final float h() {
      return this.T;
   }

   public final void V(float <set-?>) {
      this.T = var1;
   }

   public final float L() {
      return this.W;
   }

   public final void f(float <set-?>) {
      this.W = var1;
   }

   public final float d() {
      return this.P;
   }

   public final void o(float <set-?>) {
      this.P = var1;
   }

   public final float o() {
      return this.N;
   }

   public final void O(float <set-?>) {
      this.N = var1;
   }

   public final float I() {
      return this.B;
   }

   public final void T(float <set-?>) {
      this.B = var1;
   }

   public final float R() {
      return this.F;
   }

   public final void M(float <set-?>) {
      this.F = var1;
   }

   public final int N() {
      return this.j;
   }

   public final void U(int <set-?>) {
      this.j = var1;
   }

   public final int E() {
      return this.w;
   }

   public final void J(int <set-?>) {
      this.w = var1;
   }

   public final boolean K() {
      return this.V;
   }

   public final void z(boolean <set-?>) {
      this.V = var1;
   }

   public final boolean Q() {
      return this.r;
   }

   public final void o(boolean <set-?>) {
      this.r = var1;
   }

   public final int e() {
      return this.z;
   }

   public final void o(int <set-?>) {
      this.z = var1;
   }

   @NotNull
   public final Color c() {
      return this.E;
   }

   public final float v() {
      return this.d;
   }

   public final void r(float <set-?>) {
      this.d = var1;
   }

   static {
      long var0 = a ^ 57649594946718L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[5];
      int var5 = 0;
      String var6 = "Ô\u009d¿\u000bB\u000f Çò\u0095÷7¡=Ñ\u009d\r\b×\u008a\u0014lÙ\u0086";
      int var7 = "Ô\u009d¿\u000bB\u000f Çò\u0095÷7¡=Ñ\u009d\r\b×\u008a\u0014lÙ\u0086".length();
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
                  b = var8;
                  e = new Integer[5];
                  return;
               }
               break;
            default:
               var13[var10001] = var18;
               if (var4 < var7) {
                  continue label23;
               }

               var6 = "ÿÝ*\u0014õ\u0098\u009a\u0087\u001f\r-Ï\n#û»";
               var7 = "ÿÝ*\u0014õ\u0098\u009a\u0087\u001f\r-Ï\n#û»".length();
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

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12136;
      if (e[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = b[var3];
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
            throw new RuntimeException("su/catlean/b0", var14);
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
         throw new RuntimeException("su/catlean/b0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
