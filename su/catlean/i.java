package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_276;
import net.minecraft.class_2960;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;

public final class i {
   private static final long a = j0.a(8831182232378113179L, 5261482053716502819L, MethodHandles.lookup().lookupClass()).a(201967952644509L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static final void N(float x, float y, float w, long a, float h, float radiusValue, float outline, float mixValue, float alphaValue, @NotNull Color colorValue, @NotNull Color outlineColorValue, @Nullable Matrix3x2fStack matrix, @NotNull class_2960 textureId) {
      var3 ^= a;
      long var14 = var3 ^ 8531747272158L;
      long var10001 = var3 ^ 33168221426958L;
      int var16 = (int)((var3 ^ 33168221426958L) >>> 48);
      int var17 = (int)(var10001 << 16 >>> 48);
      int var18 = (int)(var10001 << 32 >>> 32);
      long var19 = var3 ^ 20772319973083L;
      long var21 = var3 ^ 37119844365268L;
      long var23 = var3 ^ 135820279686904L;
      Intrinsics.checkNotNullParameter(var10, true.c<invokedynamic>(9008, 2828814806549953928L ^ var3));
      Intrinsics.checkNotNullParameter(var11, true.c<invokedynamic>(27554, 8146496085009577244L ^ var3));
      Intrinsics.checkNotNullParameter(var13, true.c<invokedynamic>(19277, 2834967665785607668L ^ var3));
      GpuTextureView var10000 = s8.H((short)var16, (short)var17, var18).method_1531().method_4619(var13).method_71659();
      Intrinsics.checkNotNullExpressionValue(var10000, true.c<invokedynamic>(3265, 7327053910550008442L ^ var3));
      GpuTextureView var25 = var10000;
      ib var26 = ib.P(ib.P(ib.P(ib.P(new ib((VertexFormat)null, 0, false, true.v<invokedynamic>(6675, 8302322919393201962L ^ var3), var14, (DefaultConstructorMarker)null), var0 - 1.0F, var1 - 1.0F, 0.0F, var19, 4, (Object)null), var0 - 1.0F, var1 + var5 + 2.0F, 0.0F, var19, 4, (Object)null), var0 + var2 + 2.0F, var1 + var5 + 2.0F, 0.0F, var19, 4, (Object)null), var0 + var2 + 2.0F, var1 - 1.0F, 0.0F, var19, 4, (Object)null);
      RenderPipeline var27 = v2.S.k();
      Matrix3x2f var28 = new Matrix3x2f((Matrix3x2fc)var12);
      GpuBufferSlice var29 = ma.o.m().method_71102((class_11281)(new fb(var21, var2, var5, var6, var9, var7 / 2.0F, var10, var11, var8)));
      Map var30 = MapsKt.mapOf(TuplesKt.to(true.c<invokedynamic>(7597, 884662426237813527L ^ var3), var25));
      ib.j(var26, var27, (class_276)null, var23, var29, (Matrix4f)null, var28, var30, true.v<invokedynamic>(24002, 6652428579355248890L ^ var3), (Object)null);
   }

   static {
      long var11 = a ^ 90390328050323L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[5];
      int var18 = 0;
      String var17 = "\u009f\u0002H\u0019\u0006O4ßÑé-9S:\u0011ðõ+ ô\u0084!û\u0083È¨\u000bIÑ{¾Ö(\u0092\u000fzDÄÒz ¤¼8Ê\u001b\u0082\u00875^Î~¿t\u001e\u0097E \u0007øN¾\u0086ãÕæ!NÃKH\u0015\u001c ß\u0087ìûM\u0089.í,s\u0096\b\u009e¡·\u0001\u0002Å\u001d§á´gÓ_\u0000«\u0017¥\u0098!S";
      int var19 = "\u009f\u0002H\u0019\u0006O4ßÑé-9S:\u0011ðõ+ ô\u0084!û\u0083È¨\u000bIÑ{¾Ö(\u0092\u000fzDÄÒz ¤¼8Ê\u001b\u0082\u00875^Î~¿t\u001e\u0097E \u0007øN¾\u0086ãÕæ!NÃKH\u0015\u001c ß\u0087ìûM\u0089.í,s\u0096\b\u009e¡·\u0001\u0002Å\u001d§á´gÓ_\u0000«\u0017¥\u0098!S".length();
      char var16 = ' ';
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
                  c = new String[5];
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
                  String var4 = "\u0082ç\u0082P,\u0013eSï\u0097Ut\u009eÎ`Ú";
                  int var5 = "\u0082ç\u0082P,\u0013eSï\u0097Ut\u009eÎ`Ú".length();
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

               var17 = "Þ*mr\u0017¹\u0081Þq:FõMB\u0094î>~qÙÃÏ\u009aý(\u0097öv«Ô°Î«É»èÕó\\àN¦c\u0081FSá\u0088\u0089À\u008f\u0019Òm¼·;_·ÒÜq\u0082\u009dB";
               var19 = "Þ*mr\u0017¹\u0081Þq:FõMB\u0094î>~qÙÃÏ\u009aý(\u0097öv«Ô°Î«É»èÕó\\àN¦c\u0081FSá\u0088\u0089À\u008f\u0019Òm¼·;_·ÒÜq\u0082\u009dB".length();
               var16 = 24;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31085;
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
            throw new RuntimeException("su/catlean/i", var10);
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
         throw new RuntimeException("su/catlean/i" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13038;
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
            throw new RuntimeException("su/catlean/i", var14);
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
         throw new RuntimeException("su/catlean/i" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
