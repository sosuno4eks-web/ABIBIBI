package su.catlean;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
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
import net.minecraft.class_241;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;

public final class xj {
   @NotNull
   public static final xj Y;
   private static long b;
   @NotNull
   private static final GpuTextureView[] I;
   @NotNull
   private static class_241 W;
   private static final long a = j0.a(4616435755929487280L, 6042137287551091843L, MethodHandles.lookup().lookupClass()).a(12050754632550L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   private xj() {
   }

   @NotNull
   public final GpuTextureView S() {
      return I[0];
   }

   private final GpuTextureView M(int var1, long var2) {
      var2 ^= a;
      long var10001 = var2 ^ 34827246602838L;
      int var4 = (int)((var2 ^ 34827246602838L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      double var7 = (double)1 / Math.pow(2.0D, (double)var1);
      int var9 = (int)((double)s8.H((short)var4, (short)var5, var6).method_22683().method_4489() * var7);
      int var10 = (int)((double)s8.H((short)var4, (short)var5, var6).method_22683().method_4506() * var7);
      GpuTextureView var10000 = RenderSystem.getDevice().createTextureView(RenderSystem.getDevice().createTexture(true.g<invokedynamic>(27069, 7294304804796762651L ^ var2) + var1, true.z<invokedynamic>(28842, 6531729871608280510L ^ var2), TextureFormat.RGBA8, var9, var10, 1, 1));
      Intrinsics.checkNotNullExpressionValue(var10000, true.g<invokedynamic>(3092, 4229487280465964979L ^ var2));
      return var10000;
   }

   public final void A(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void H(GpuTextureView var1, long var2, GpuTextureView var4, RenderPipeline var5) {
      var2 ^= a;
      long var6 = var2 ^ 87930286845860L;
      long var8 = var2 ^ 94643165415550L;
      long var10001 = var2 ^ 18573131198096L;
      int var10 = (int)((var2 ^ 18573131198096L) >>> 48);
      int var11 = (int)(var10001 << 16 >>> 32);
      int var12 = (int)(var10001 << 48 >>> 48);
      ib.P((new ib((VertexFormat)null, 0, false, true.z<invokedynamic>(15518, 8709818279291731117L ^ var2), var6, (DefaultConstructorMarker)null)).B(var8), var5, (short)var10, var11, var1, (GpuTextureView)null, bo.t.C().method_71102((class_11281)(new bi(0.5F / (float)var1.getWidth(0), 0.5F / (float)var1.getHeight(0), 5.0F))), (Matrix4f)null, (Matrix3x2f)null, var12, MapsKt.mapOf(TuplesKt.to(true.g<invokedynamic>(11063, 2074641622151056817L ^ var2), var4)), true.z<invokedynamic>(13251, 4612716653387068404L ^ var2), (Object)null);
   }

   private final int z(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 132061196419895L;
      long var22 = var20 ^ 58262529604536L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[3];
      int var16 = 0;
      String var15 = "ÍÅ=\u008f\u0014>éTô±ã92\u0097LÆ\u0087³¬)a\u0092\u008ew\nS\\þu§í\u0081\u008cW\u0084²\u0095eLþ(\u0087EA_x¹:-\u0085#2\u0082_\u0085s\u001aêçbnu\u000bïèí/£HÄ\u008eÀ@\u009b%W:ÝÞèÙ ÷b\u0015¢(} Ä·dU\u0012c\u000f\u0005Uö+sîa_±\u0016\b½\u001c3çSò\u0080";
      int var17 = "ÍÅ=\u008f\u0014>éTô±ã92\u0097LÆ\u0087³¬)a\u0092\u008ew\nS\\þu§í\u0081\u008cW\u0084²\u0095eLþ(\u0087EA_x¹:-\u0085#2\u0082_\u0085s\u001aêçbnu\u000bïèí/£HÄ\u008eÀ@\u009b%W:ÝÞèÙ ÷b\u0015¢(} Ä·dU\u0012c\u000f\u0005Uö+sîa_±\u0016\b½\u001c3çSò\u0080".length();
      char var14 = '(';
      int var13 = -1;

      while(true) {
         ++var13;
         byte[] var19 = var11.doFinal(var15.substring(var13, var13 + var14).getBytes("ISO-8859-1"));
         String var30 = a(var19).intern();
         boolean var10001 = true;
         var18[var16++] = var30;
         if ((var13 += var14) >= var17) {
            c = var18;
            d = new String[3];
            h = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[6];
            int var3 = 0;
            String var4 = "Cx\u008e\"Jò\u00ad90@¢¯§¦\bü¸ê¤û½!@%Rð\u0017ON\f,Ï";
            int var5 = "Cx\u008e\"Jò\u00ad90@¢¯§¦\bü¸ê¤û½!@%Rð\u0017ON\f,Ï".length();
            int var2 = 0;

            label42:
            while(true) {
               int var29 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
               long[] var27 = var6;
               var29 = var3++;
               long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte var33 = -1;

               while(true) {
                  long var8 = var32;
                  byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                  long var36 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                  switch(var33) {
                  case 0:
                     var27[var29] = var36;
                     if (var2 >= var5) {
                        f = var6;
                        g = new Integer[6];
                        Y = new xj();
                        int var24 = 0;

                        GpuTextureView[] var25;
                        for(var25 = new GpuTextureView[true.z<invokedynamic>(9437, 6766688880085705178L ^ var20)]; var24 < true.z<invokedynamic>(11132, 4843772668402740858L ^ var20); ++var24) {
                           var25[var24] = Y.M(var24, var22);
                        }

                        I = var25;
                        W = new class_241(0.0F, 0.0F);
                        return;
                     }
                     break;
                  default:
                     var27[var29] = var36;
                     if (var2 < var5) {
                        continue label42;
                     }

                     var4 = "B\u0095\u0088V¨}}Ã©=0^p¼\u0015F";
                     var5 = "B\u0095\u0088V¨}}Ã©=0^p¼\u0015F".length();
                     var2 = 0;
                  }

                  var29 = var2;
                  var2 += 8;
                  var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                  var27 = var6;
                  var29 = var3++;
                  var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                  var33 = 0;
               }
            }
         }

         var14 = var15.charAt(var13);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6953;
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
            throw new RuntimeException("su/catlean/xj", var10);
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
         throw new RuntimeException("su/catlean/xj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32159;
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
            throw new RuntimeException("su/catlean/xj", var14);
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
         throw new RuntimeException("su/catlean/xj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
