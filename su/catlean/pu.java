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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class pu {
   @NotNull
   private final Runnable P;
   private int O;
   private byte Y;
   private boolean q;
   private long T;
   private static final long a = j0.a(5042846895899394494L, 4934728133187112118L, MethodHandles.lookup().lookupClass()).a(124926370063061L);
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public pu(long a, @NotNull Runnable action, int delay, byte priority, boolean tick, long time, char a) {
      long var10 = (var1 << 16 | (long)var9 << 48 >>> 48) ^ a;
      int var10000 = 379138928378444422L.A<invokedynamic>(379138928378444422L, var10);
      Intrinsics.checkNotNullParameter(var3, b);
      super();
      this.P = var3;
      int var12 = var10000;

      try {
         this.O = var4;
         this.Y = var5;
         this.q = var6;
         this.T = var7;
         if (var12 != 0) {
            (new int[5]).A<invokedynamic>(new int[5], 363090811641513650L, var10);
         }

      } catch (NumberFormatException var13) {
         throw var13.A<invokedynamic>(var13, 365600476446015202L, var10);
      }
   }

   public pu(Runnable var1, int var2, byte var3, boolean var4, long var5, int var7, long var8, DefaultConstructorMarker var10) {
      var8 ^= a;
      long var10001 = var8 ^ 122521536617526L;
      long var11 = (var8 ^ 122521536617526L) >>> 16;
      int var13 = (int)(var10001 << 48 >>> 48);
      if ((var7 & 4) != 0) {
         var3 = true.k<invokedynamic>(8857, 63685417998713260L ^ var8);
      }

      if ((var7 & true.k<invokedynamic>(1049, 8619105789589104429L ^ var8)) != 0) {
         var4 = true;
      }

      if ((var7 & true.k<invokedynamic>(1844, 2387219137584571395L ^ var8)) != 0) {
         var5 = s8.Z();
      }

      this(var11, var1, var2, (byte)var3, var4, var5, (char)var13);
   }

   @NotNull
   public final Runnable U() {
      return this.P;
   }

   public final int l() {
      return this.O;
   }

   public final void s(int <set-?>) {
      this.O = var1;
   }

   public final byte v() {
      return this.Y;
   }

   public final void n(byte <set-?>) {
      this.Y = var1;
   }

   public final boolean S() {
      return this.q;
   }

   public final void B(boolean <set-?>) {
      this.q = var1;
   }

   public final long V() {
      return this.T;
   }

   public final void l(long <set-?>) {
      this.T = var1;
   }

   public final boolean R(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 34864123889209L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("\f\u0080\u0019 û\u0094W ".getBytes("ISO-8859-1"));
      String var17 = a(var15).intern();
      boolean var10001 = true;
      b = var17;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "JÃ?óø\neIW\u0003àÀlY\u0014¸³|H>ø¡\u0095\u0097";
      int var5 = "JÃ?óø\neIW\u0003àÀlY\u0014¸³|H>ø¡\u0095\u0097".length();
      int var2 = 0;

      do {
         int var16 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var16, var2).getBytes("ISO-8859-1");
         var16 = var3++;
         long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
         long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         boolean var18 = true;
         var6[var16] = var10004;
      } while(var2 < var5);

      c = var6;
      d = new Integer[3];
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23288;
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
            throw new RuntimeException("su/catlean/pu", var14);
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
         throw new RuntimeException("su/catlean/pu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
