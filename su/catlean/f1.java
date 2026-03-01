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
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class f1 {
   @NotNull
   private final class_2338 q;
   @NotNull
   private final class_243 E;
   @NotNull
   private final class_2350 X;
   private static final long a = j0.a(7539751810343548462L, 6044172492068364310L, MethodHandles.lookup().lookupClass()).a(19453360100194L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public f1(@NotNull class_2338 bp, long a, @NotNull class_243 vec3d, @NotNull class_2350 dir) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.y<invokedynamic>(8475, 9054393781373407934L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.y<invokedynamic>(29351, 1297485897189703937L ^ var2));
      Intrinsics.checkNotNullParameter(var5, true.y<invokedynamic>(2867, 840716147846101137L ^ var2));
      super();
      this.q = var1;
      this.E = var4;
      this.X = var5;
   }

   @NotNull
   public final class_2338 x() {
      return this.q;
   }

   @NotNull
   public final class_243 J() {
      return this.E;
   }

   @NotNull
   public final class_2350 Z() {
      return this.X;
   }

   @NotNull
   public final class_2338 w() {
      return this.q;
   }

   @NotNull
   public final class_243 H() {
      return this.E;
   }

   @NotNull
   public final class_2350 D() {
      return this.X;
   }

   @NotNull
   public final f1 L(@NotNull class_2338 bp, int a, char a, @NotNull class_243 vec3d, short a, @NotNull class_2350 dir) {
      long var7 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 6246985017865L;
      Intrinsics.checkNotNullParameter(var1, true.y<invokedynamic>(18393, 8063029250360983212L ^ var7));
      Intrinsics.checkNotNullParameter(var4, true.y<invokedynamic>(11790, 5767132547819067258L ^ var7));
      Intrinsics.checkNotNullParameter(var6, true.y<invokedynamic>(30643, 5823835282036887237L ^ var7));
      return new f1(var1, var9, var4, var6);
   }

   public static f1 s(f1 var0, class_2338 var1, class_243 var2, class_2350 var3, long var4, int var6, Object var7) {
      var4 ^= a;
      long var10001 = var4 ^ 73675087119884L;
      int var8 = (int)((var4 ^ 73675087119884L) >>> 32);
      int var9 = (int)(var10001 << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      int[] var11 = 1369662882778358177L.A<invokedynamic>(1369662882778358177L, var4);

      int var10000;
      label41: {
         label40: {
            try {
               var10000 = var6 & 1;
               if (var11 != null) {
                  break label41;
               }

               if (var10000 == 0) {
                  break label40;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, 1374710737217646491L, var4);
            }

            var1 = var0.q;
         }

         var10000 = var6 & 2;
      }

      label32: {
         label31: {
            try {
               if (var11 != null) {
                  break label32;
               }

               if (var10000 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var12) {
               throw var12.A<invokedynamic>(var12, 1374710737217646491L, var4);
            }

            var2 = var0.E;
         }

         var10000 = var6 & 4;
      }

      if (var10000 != 0) {
         var3 = var0.X;
      }

      return var0.L(var1, var8, (char)var9, var2, (short)var10, var3);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 85911406860331L;
      class_2350 var3 = this.X;
      class_243 var4 = this.E;
      class_2338 var5 = this.q;
      String var10000 = 31896.y<invokedynamic>(31896, 5289071482045811006L ^ var1);
      return var10000 + var5 + true.y<invokedynamic>(14094, 2277973465160123041L ^ var1) + var4 + true.y<invokedynamic>(18199, 2432364459257459387L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 59214796564764L;
      int var3 = this.q.hashCode();
      var3 = var3 * true.n<invokedynamic>(1439, 2089571915224274041L ^ var1) + this.E.hashCode();
      var3 = var3 * true.n<invokedynamic>(31751, 6002977832376282592L ^ var1) + this.X.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 114507926130981L;
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
      String var17 = "8(~+!ÐgüÚBÛÕçÛiñ 4_Î\u009fá}\u00049\u0093w¨©  \u0015ÖrÑlåg¤\rË¸\u0088³X\fÏ\u0080\u008f\u0010*\u008f\u0000 Ü÷\u0006A56i_\u0097/h4\u0010<\u009ba'\u0000\u0082\u001aé\u008c»}VÀî\u0098_\u0010ÜïáA\\<\f\\µBJþ\u007f\u0017ù\u0006\u0010\u0097\b·hkO/Ã\f\tÁ\u0082\u0086\"n6\u0010Ónb\u0094Ç\u0002VP\u000b7@\u0011\u0001À\u009b¤";
      int var19 = "8(~+!ÐgüÚBÛÕçÛiñ 4_Î\u009fá}\u00049\u0093w¨©  \u0015ÖrÑlåg¤\rË¸\u0088³X\fÏ\u0080\u008f\u0010*\u008f\u0000 Ü÷\u0006A56i_\u0097/h4\u0010<\u009ba'\u0000\u0082\u001aé\u008c»}VÀî\u0098_\u0010ÜïáA\\<\f\\µBJþ\u007f\u0017ù\u0006\u0010\u0097\b·hkO/Ã\f\tÁ\u0082\u0086\"n6\u0010Ónb\u0094Ç\u0002VP\u000b7@\u0011\u0001À\u009b¤".length();
      char var16 = 16;
      int var15 = -1;

      label45:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var27;
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
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "\u0099Üa\u001c\u001dy\u007f\u0099oî\u0001Ä¬\u0013u\u0092";
                  int var5 = "\u0099Üa\u001c\u001dy\u007f\u0099oî\u0001Ä¬\u0013u\u0092".length();
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
                  f = new Integer[2];
                  return;
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var27;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label45;
               }

               var17 = "fÈ\u0004Ùô_²\u009aÆ\\E\u009c\u008e\u0088¶\u008e\u0018ÆêC#\u0083VDÄW;X\u0093Eü=\u0002dã!\u008fèdÏí";
               var19 = "fÈ\u0004Ùô_²\u009aÆ\\E\u009c\u008e\u0088¶\u008e\u0018ÆêC#\u0083VDÄW;X\u0093Eü=\u0002dã!\u008fèdÏí".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3417;
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
            throw new RuntimeException("su/catlean/f1", var10);
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
         throw new RuntimeException("su/catlean/f1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6183;
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
            throw new RuntimeException("su/catlean/f1", var14);
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
         throw new RuntimeException("su/catlean/f1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
