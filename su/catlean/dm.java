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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;

public final class dm {
   @NotNull
   private final fs A;
   @NotNull
   private final Matrix3x2f E;
   private final float J;
   private final float t;
   private final float s;
   private final float C;
   private final float i;
   private static final long a = j0.a(5707914208586092757L, 183635294860887398L, MethodHandles.lookup().lookupClass()).a(216421794668962L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public dm(@NotNull fs image, @NotNull Matrix3x2f m, float x, float y, float w, float h, float a, long a) {
      var8 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(7518, 6019343859289250661L ^ var8));
      Intrinsics.checkNotNullParameter(var2, "m");
      super();
      this.A = var1;
      this.E = var2;
      this.J = var3;
      this.t = var4;
      this.s = var5;
      this.C = var6;
      this.i = var7;
   }

   @NotNull
   public final fs V() {
      return this.A;
   }

   @NotNull
   public final Matrix3x2f a() {
      return this.E;
   }

   public final float N() {
      return this.J;
   }

   public final float d() {
      return this.t;
   }

   public final float H() {
      return this.s;
   }

   public final float c() {
      return this.C;
   }

   public final float s() {
      return this.i;
   }

   @NotNull
   public final fs Y() {
      return this.A;
   }

   @NotNull
   public final Matrix3x2f O() {
      return this.E;
   }

   public final float W() {
      return this.J;
   }

   public final float L() {
      return this.t;
   }

   public final float K() {
      return this.s;
   }

   public final float C() {
      return this.C;
   }

   public final float f() {
      return this.i;
   }

   @NotNull
   public final dm R(@NotNull fs image, @NotNull Matrix3x2f m, float x, float y, long a, float w, float h, float a) {
      var5 ^= a;
      long var10 = var5 ^ 129824050704904L;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(19080, 4657869592627703469L ^ var5));
      Intrinsics.checkNotNullParameter(var2, "m");
      return new dm(var1, var2, var3, var4, var7, var8, var9, var10);
   }

   public static dm m(dm param0, fs param1, Matrix3x2f param2, float param3, float param4, float param5, float param6, float param7, int param8, long param9, Object param11) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 72777232911162L;
      float var3 = this.i;
      float var4 = this.C;
      float var5 = this.s;
      float var6 = this.t;
      float var7 = this.J;
      Matrix3x2f var8 = this.E;
      fs var9 = this.A;
      String var10000 = 4461.e<invokedynamic>(4461, 8009717058593575788L ^ var1);
      return var10000 + var9 + true.e<invokedynamic>(19329, 4819199573171767685L ^ var1) + var8 + true.e<invokedynamic>(32594, 5720304130267135312L ^ var1) + var7 + true.e<invokedynamic>(10081, 3858579933851411809L ^ var1) + var6 + true.e<invokedynamic>(28367, 5777873141340482764L ^ var1) + var5 + true.e<invokedynamic>(21422, 998527402278850980L ^ var1) + var4 + true.e<invokedynamic>(19870, 2276180756103696281L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 1729650567958L;
      int var4 = this.A.hashCode();
      var4 = var4 * true.t<invokedynamic>(24578, 6044686907534642218L ^ var1) + this.E.hashCode();
      int var10000 = -5000047659540060532L.A<invokedynamic>(-5000047659540060532L, var1);
      var4 = var4 * true.t<invokedynamic>(11334, 6398283879148961896L ^ var1) + Float.hashCode(this.J);
      int var3 = var10000;
      var4 = var4 * true.t<invokedynamic>(11334, 6398283879148961896L ^ var1) + Float.hashCode(this.t);
      var4 = var4 * true.t<invokedynamic>(11334, 6398283879148961896L ^ var1) + Float.hashCode(this.s);
      var4 = var4 * true.t<invokedynamic>(11334, 6398283879148961896L ^ var1) + Float.hashCode(this.C);
      var4 = var4 * true.t<invokedynamic>(11334, 6398283879148961896L ^ var1) + Float.hashCode(this.i);

      try {
         if (-4984210394755711042L.A<invokedynamic>(-4984210394755711042L, var1) == null) {
            ++var3;
            var3.A<invokedynamic>(var3, -5033429472425028861L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -5026524793239642940L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 20583486114043L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[9];
      int var18 = 0;
      String var17 = "@ô/XX\u0019\u001fZgóé½\u000e\u000fF¥\u0010À©\u009bî\u009bOW1ù\u0095$.£¬¿r\u0010ôpX|b\u0003s\u0019ct½\"¯ëzÕ0\\k\u0017÷º5\u0087¥¶«K1Î.#\u0002§\u0014ù>ä·v\u009f<F\u0093\u0095õ¾|^FÅ\u0096|â$8Ãtg\u0085Ø:n\u0080\u0017\u0010Fó¹þ[Ï3~ß\u0002w9\u0001¿±Ï\u0010¨CÓ\u0099I×\u009eUÎÖ]l\u00ad?\u0091\u008e\u0010¾}\u001b§'T½{<}µîÑ\u00944\u0012";
      int var19 = "@ô/XX\u0019\u001fZgóé½\u000e\u000fF¥\u0010À©\u009bî\u009bOW1ù\u0095$.£¬¿r\u0010ôpX|b\u0003s\u0019ct½\"¯ëzÕ0\\k\u0017÷º5\u0087¥¶«K1Î.#\u0002§\u0014ù>ä·v\u009f<F\u0093\u0095õ¾|^FÅ\u0096|â$8Ãtg\u0085Ø:n\u0080\u0017\u0010Fó¹þ[Ï3~ß\u0002w9\u0001¿±Ï\u0010¨CÓ\u0099I×\u009eUÎÖ]l\u00ad?\u0091\u008e\u0010¾}\u001b§'T½{<}µîÑ\u00944\u0012".length();
      char var16 = 16;
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[9];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[6];
                  int var3 = 0;
                  String var4 = "8À\"\u0087jÐÒ¸wñ\u001fZ\u00ad=7*)\u0005¸\u000eØ\u0001?}§ÖèÝ\f\u0002\u008e\u0018";
                  int var5 = "8À\"\u0087jÐÒ¸wñ\u001fZ\u00ad=7*)\u0005¸\u000eØ\u0001?}§ÖèÝ\f\u0002\u008e\u0018".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var26 = var3++;
                     long var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var31 = -1;

                     while(true) {
                        long var8 = var30;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var31) {
                        case 0:
                           var25[var26] = var33;
                           if (var2 >= var5) {
                              e = var6;
                              f = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "Î&:|(¤w´7A55»¢Î\u0017";
                           var5 = "Î&:|(¤w´7A55»¢Î\u0017".length();
                           var2 = 0;
                        }

                        var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var26 = var3++;
                        var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var31 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "?\u00926\u007fúw=Ê\u0013Wjò\u000fÉ¬\u0097\u0010\u0013\u000eJé¿\u0080ÙÞÍ\"oj¥df\f";
               var19 = "?\u00926\u007fúw=Ê\u0013Wjò\u000fÉ¬\u0097\u0010\u0013\u000eJé¿\u0080ÙÞÍ\"oj¥df\f".length();
               var16 = 16;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22829;
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
            throw new RuntimeException("su/catlean/dm", var10);
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
         throw new RuntimeException("su/catlean/dm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22312;
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
            throw new RuntimeException("su/catlean/dm", var14);
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
         throw new RuntimeException("su/catlean/dm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
