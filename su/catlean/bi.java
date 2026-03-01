package su.catlean;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bi implements class_11281 {
   private final float k;
   private final float J;
   private final float g;
   private static final long a = j0.a(2730882789997093311L, 165079707598054861L, MethodHandles.lookup().lookupClass()).a(10224164721189L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map h;

   public bi(float halfTexelSizeX, float halfTexelSizeY, float offset) {
      this.k = var1;
      this.J = var2;
      this.g = var3;
   }

   public final float D() {
      return this.k;
   }

   public final float i() {
      return this.J;
   }

   public final float n() {
      return this.g;
   }

   public void method_71104(@NotNull ByteBuffer buffer) {
      long var2 = a ^ 101831514078855L;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(13717, 3685975986610377735L ^ var2));
      Std140Builder.intoBuffer(var1).putVec2(this.k, this.J).putFloat(this.g);
   }

   public final float a() {
      return this.k;
   }

   public final float L() {
      return this.J;
   }

   public final float W() {
      return this.g;
   }

   @NotNull
   public final bi M(float halfTexelSizeX, float halfTexelSizeY, float offset) {
      return new bi(var1, var2, var3);
   }

   public static bi X(bi var0, float var1, float var2, long var3, float var5, int var6, Object var7) {
      var3 ^= a;
      k9[] var8 = -1354206667659050226L.A<invokedynamic>(-1354206667659050226L, var3);

      int var10000;
      label41: {
         label40: {
            try {
               var10000 = var6 & 1;
               if (var8 == null) {
                  break label41;
               }

               if (var10000 == 0) {
                  break label40;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, -1328274612550600278L, var3);
            }

            var1 = var0.k;
         }

         var10000 = var6 & 2;
      }

      label32: {
         label31: {
            try {
               if (var8 == null) {
                  break label32;
               }

               if (var10000 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var9) {
               throw var9.A<invokedynamic>(var9, -1328274612550600278L, var3);
            }

            var2 = var0.J;
         }

         var10000 = var6 & 4;
      }

      if (var10000 != 0) {
         var5 = var0.g;
      }

      return var0.M(var1, var2, var5);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 54825549347368L;
      float var3 = this.g;
      float var4 = this.J;
      float var5 = this.k;
      String var10000 = 17918.j<invokedynamic>(17918, 8342928438816628930L ^ var1);
      return var10000 + var5 + true.j<invokedynamic>(9057, 6095380985291933279L ^ var1) + var4 + true.j<invokedynamic>(24723, 1532685158623462828L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 31454721328679L;
      int var3 = Float.hashCode(this.k);
      var3 = var3 * true.j<invokedynamic>(31822, 4950035251291050711L ^ var1) + Float.hashCode(this.J);
      var3 = var3 * true.j<invokedynamic>(19287, 8904416721048397263L ^ var1) + Float.hashCode(this.g);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 23892588193254L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[4];
      int var18 = 0;
      String var17 = "ï¾à\tP\u000eµ\u0097£xX¤Ü\u001b´dØ×°\u0093í5\"|\u00907X2ÒA\u0015MÇ\u0099\u0088Síç)\u009e íP\u0084\u0001\u000e\u0019'\u0090\u009eõ®\u0010Xj\u0087bu#\u0086Ç8G®8õ]lË¹$ø\u008f";
      int var19 = "ï¾à\tP\u000eµ\u0097£xX¤Ü\u001b´dØ×°\u0093í5\"|\u00907X2ÒA\u0015MÇ\u0099\u0088Síç)\u009e íP\u0084\u0001\u000e\u0019'\u0090\u009eõ®\u0010Xj\u0087bu#\u0086Ç8G®8õ]lË¹$ø\u008f".length();
      char var16 = '(';
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
                  c = new String[4];
                  h = new HashMap(13);
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
                  String var4 = "ç\u0091H\u0014ê;£ù\u0006úí\fº¼À\u0012";
                  int var5 = "ç\u0091H\u0014ê;£ù\u0006úí\fº¼À\u0012".length();
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

               var17 = "\u0018oB\u001f\u0095Q\u000eÚ`+NØ. P|EÓï\u009báK\u008d\u0094}ø)\u000fj\u008a'\u0011\u001dú\u0011iøâ\u0091a8\u0017L\u000eéèm ¬A¬ctÁ2o\u0010ñ\u0090&MÀ\u008e?\u0084AH]Õ\u0096-®\u008a";
               var19 = "\u0018oB\u001f\u0095Q\u000eÚ`+NØ. P|EÓï\u009báK\u008d\u0094}ø)\u000fj\u008a'\u0011\u001dú\u0011iøâ\u0091a8\u0017L\u000eéèm ¬A¬ctÁ2o\u0010ñ\u0090&MÀ\u008e?\u0084AH]Õ\u0096-®\u008a".length();
               var16 = '8';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1971;
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
            throw new RuntimeException("su/catlean/bi", var10);
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
         throw new RuntimeException("su/catlean/bi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28699;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
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
            throw new RuntimeException("su/catlean/bi", var14);
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
         throw new RuntimeException("su/catlean/bi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
