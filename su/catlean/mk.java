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
import org.jetbrains.annotations.NotNull;

public final class mk implements im {
   @NotNull
   public static final mk V;
   private static int y;
   private static int K;
   private static int T;
   private static String A;
   private static final long a = j0.a(4547354655141679403L, 8905303356940807336L, MethodHandles.lookup().lookupClass()).a(113103518635935L);
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   private mk() {
   }

   public final int Z() {
      return y;
   }

   public final void p(int <set-?>) {
      y = var1;
   }

   public final int o() {
      return K;
   }

   public final void Z(int <set-?>) {
      K = var1;
   }

   public final int d() {
      return T;
   }

   public final void f(int <set-?>) {
      T = var1;
   }

   public void b(long var1) {
   }

   public void r(long a, @NotNull qq rotation) {
      // $FF: Couldn't be decompiled
   }

   public void v(int var1, int var2, int var3) {
      int var4 = y;
      y = var4 + -1;
   }

   public final boolean w(long a, int offset) {
      // $FF: Couldn't be decompiled
   }

   public static boolean A(mk var0, int var1, int var2, Object var3, long var4) {
      var4 ^= a;
      long var6 = var4 ^ 21875170299269L;
      String var8 = 8780571685984875862L.A<invokedynamic>(8780571685984875862L, var4);

      int var10000;
      label20: {
         try {
            var10000 = var2 & 1;
            if (var8 == null) {
               return (boolean)var10000;
            }

            if (var10000 == 0) {
               break label20;
            }
         } catch (NumberFormatException var9) {
            throw var9.A<invokedynamic>(var9, 8689456789987017370L, var4);
         }

         var1 = 0;
      }

      var10000 = var0.w(var6, var1);
      return (boolean)var10000;
   }

   public final boolean x(char param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private final boolean J(int param1, short param2, int param3, short param4) {
      // $FF: Couldn't be decompiled
   }

   static boolean f(mk var0, int var1, int var2, long var3, Object var5) {
      var3 ^= a;
      long var10001 = var3 ^ 78539709560974L;
      int var6 = (int)((var3 ^ 78539709560974L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      String var9 = 2913211693072278753L.A<invokedynamic>(2913211693072278753L, var3);

      int var10000;
      label20: {
         try {
            var10000 = var2 & 1;
            if (var9 == null) {
               return (boolean)var10000;
            }

            if (var10000 == 0) {
               break label20;
            }
         } catch (NumberFormatException var10) {
            throw var10.A<invokedynamic>(var10, 2963424757554680621L, var3);
         }

         var1 = 0;
      }

      var10000 = var0.J(var6, (short)var7, var1, (short)var8);
      return (boolean)var10000;
   }

   private final int U(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var14 = a ^ 52489204387144L;
      if (-4173286972884284775L.A<invokedynamic>(-4173286972884284775L, var14) == null) {
         "r8rjlb".A<invokedynamic>("r8rjlb", -4106858014115111733L, var14);
      }

      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var14 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var13 = var11.doFinal("¬Eõ0P[Òh`\u009cúïRö~\u000b".getBytes("ISO-8859-1"));
      String var18 = a(var13).intern();
      boolean var10001 = true;
      b = var18;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[9];
      int var3 = 0;
      String var4 = "g¸NJñÀ+\"\u0011uÓî \u001cãh\u0010±Õkô\u0013Ê»ú\u0000&Y@/SÚAö¾\u0084t\u0082\u008b7|fÃ~|\u008emk\u0000C\u0099[\u009e\u00adM\u008c";
      int var5 = "g¸NJñÀ+\"\u0011uÓî \u001cãh\u0010±Õkô\u0013Ê»ú\u0000&Y@/SÚAö¾\u0084t\u0082\u008b7|fÃ~|\u008emk\u0000C\u0099[\u009e\u00adM\u008c".length();
      int var2 = 0;

      label33:
      while(true) {
         int var17 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var17, var2).getBytes("ISO-8859-1");
         long[] var16 = var6;
         var17 = var3++;
         long var19 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte var21 = -1;

         while(true) {
            long var8 = var19;
            byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
            long var23 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
            switch(var21) {
            case 0:
               var16[var17] = var23;
               if (var2 >= var5) {
                  c = var6;
                  d = new Integer[9];
                  V = new mk();
                  return;
               }
               break;
            default:
               var16[var17] = var23;
               if (var2 < var5) {
                  continue label33;
               }

               var4 = "Mº&\u009fþ\u009blÜ¦\u008eÇE\u008b\u000b4`";
               var5 = "Mº&\u009fþ\u009blÜ¦\u008eÇE\u008b\u000b4`".length();
               var2 = 0;
            }

            var17 = var2;
            var2 += 8;
            var7 = var4.substring(var17, var2).getBytes("ISO-8859-1");
            var16 = var6;
            var17 = var3++;
            var19 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
            var21 = 0;
         }
      }
   }

   public static void c(String var0) {
      A = var0;
   }

   public static String S() {
      return A;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27249;
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
            throw new RuntimeException("su/catlean/mk", var14);
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
         throw new RuntimeException("su/catlean/mk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
