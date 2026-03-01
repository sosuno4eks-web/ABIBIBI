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
import org.jetbrains.annotations.Nullable;

public final class mg {
   private final float D;
   private final float K;
   private final boolean r;
   private final boolean a;
   private static boolean x;
   private static final long b = j0.a(2918582621079994859L, 4821218366183244153L, MethodHandles.lookup().lookupClass()).a(50146045684405L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public mg(float damage, float selfDamage, boolean override, boolean lethal) {
      this.D = var1;
      this.K = var2;
      this.r = var3;
      this.a = var4;
   }

   public final float e() {
      return this.D;
   }

   public final float X() {
      return this.K;
   }

   public final boolean c() {
      return this.r;
   }

   public final boolean m() {
      return this.a;
   }

   public final float R() {
      return this.D;
   }

   public final float S() {
      return this.K;
   }

   public final boolean A() {
      return this.r;
   }

   public final boolean y() {
      return this.a;
   }

   @NotNull
   public final mg g(float damage, float selfDamage, boolean override, boolean lethal) {
      return new mg(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   public static mg i(int param0, mg param1, float param2, float param3, boolean param4, boolean param5, int param6, int param7, Object param8) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 107649852745499L;
      boolean var3 = this.a;
      boolean var4 = this.r;
      float var5 = this.K;
      float var6 = this.D;
      String var10000 = 26281.m<invokedynamic>(26281, 7677253013728208106L ^ var1);
      return var10000 + var6 + true.m<invokedynamic>(21209, 4877701262550765721L ^ var1) + var5 + true.m<invokedynamic>(17718, 4681123247380596596L ^ var1) + var4 + true.m<invokedynamic>(6840, 2992579579696503033L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = b ^ 131459634310207L;
      int var3 = Float.hashCode(this.D);
      var3 = var3 * true.d<invokedynamic>(22087, 7432492089142363120L ^ var1) + Float.hashCode(this.K);
      var3 = var3 * true.d<invokedynamic>(5588, 6377025207286726752L ^ var1) + Boolean.hashCode(this.r);
      var3 = var3 * true.d<invokedynamic>(5588, 6377025207286726752L ^ var1) + Boolean.hashCode(this.a);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public static void m(boolean var0) {
      x = var0;
   }

   public static boolean B() {
      return x;
   }

   public static boolean k() {
      boolean var0 = B();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var20 = b ^ 115864550790068L;
      e = new HashMap(13);
      true.A<invokedynamic>(true, -2156270835723781559L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[4];
      int var16 = 0;
      String var15 = "J^§\t\u008d\u008fá\u0011\b¥$\u0094r`\u001cê>8\u0091+\u0094\u0096Äp\u0018¼c\u0085¿/~bªÎ\u001frè\u0003k\u000eq]¨q^Okîï";
      int var17 = "J^§\t\u008d\u008fá\u0011\b¥$\u0094r`\u001cê>8\u0091+\u0094\u0096Äp\u0018¼c\u0085¿/~bªÎ\u001frè\u0003k\u000eq]¨q^Okîï".length();
      char var14 = 24;
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
                  c = var18;
                  d = new String[4];
                  h = new HashMap(13);
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
                  String var4 = "\u0088¬\u0003©ã°â¡´§\u009eÛ©V© ÿXº}\u0089j+t";
                  int var5 = "\u0088¬\u0003©ã°â¡´§\u009eÛ©V© ÿXº}\u0089j+t".length();
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

                  f = var6;
                  g = new Integer[3];
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

               var15 = "\u0098ðQ\u0007p¾ð\u0086R)H¤tp\u009aFm°\n«ð¿Ë\u00825&ãÆíJÓÚ0¿\u001b£\u008b\u0082\u009aé\u00ado\u0097ý\u001bE èÃ&Þ&\u0089\u0003fv)L\u0099Âæ÷\u0018J24\u008a Ô\"îÝ}íN]iô_¹\u0098";
               var17 = "\u0098ðQ\u0007p¾ð\u0086R)H¤tp\u009aFm°\n«ð¿Ë\u00825&ãÆíJÓÚ0¿\u001b£\u008b\u0082\u009aé\u00ado\u0097ý\u001bE èÃ&Þ&\u0089\u0003fv)L\u0099Âæ÷\u0018J24\u008a Ô\"îÝ}íN]iô_¹\u0098".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21844;
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
            throw new RuntimeException("su/catlean/mg", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/mg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2437;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/mg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/mg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
