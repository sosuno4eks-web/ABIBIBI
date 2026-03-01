package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;

public final class bt {
   private static String[] H;
   private static final long a = j0.a(7797624757879591683L, 6523545235810490456L, MethodHandles.lookup().lookupClass()).a(215956596142845L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static final void m(float x, float y, float w, float h, float originRadius, long a, @NotNull Color colorValue1, @NotNull Color colorValue2, @NotNull Color colorValue3, @NotNull Color colorValue4, @NotNull Matrix3x2fStack matrix, float originOutline, @NotNull Color outlineColorValue) {
      var5 ^= a;
      long var14 = var5 ^ 27374313805919L;
      long var16 = var5 ^ 17005313010855L;
      long var10001 = var5 ^ 24875316644983L;
      int var18 = (int)((var5 ^ 24875316644983L) >>> 48);
      int var19 = (int)(var10001 << 16 >>> 48);
      int var20 = (int)(var10001 << 32 >>> 32);
      long var21 = var5 ^ 28936380028834L;
      long var23 = var5 ^ 33101181787713L;
      long var25 = var5 ^ 126659523116929L;
      Intrinsics.checkNotNullParameter(var7, true.k<invokedynamic>(21764, 7213220691188052643L ^ var5));
      int var10000 = -59283100601977487L.A<invokedynamic>(-59283100601977487L, var5);
      Intrinsics.checkNotNullParameter(var8, true.k<invokedynamic>(24481, 5664244014608218126L ^ var5));
      Intrinsics.checkNotNullParameter(var9, true.k<invokedynamic>(20187, 1403470070433868159L ^ var5));
      Intrinsics.checkNotNullParameter(var10, true.k<invokedynamic>(18737, 7395955419124788881L ^ var5));
      int var27 = var10000;
      Intrinsics.checkNotNullParameter(var11, true.k<invokedynamic>(22669, 6161423011552591659L ^ var5));
      Intrinsics.checkNotNullParameter(var13, true.k<invokedynamic>(1040, 8028925780124804017L ^ var5));
      VertexFormat var10002 = class_290.field_1576;
      Intrinsics.checkNotNullExpressionValue(var10002, true.k<invokedynamic>(28365, 1358468034337360238L ^ var5));
      ib var28 = ib.P(ib.P(ib.P(ib.P(new ib(var10002, 0, false, true.a<invokedynamic>(25941, 7290421089597987968L ^ var5), var16, (DefaultConstructorMarker)null), var0 - 1.0F, var1 - 1.0F, 0.0F, var21, 4, (Object)null).N(var8, var14), var0 - 1.0F, var1 + var3 + 2.0F, 0.0F, var21, 4, (Object)null).N(var7, var14), var0 + var2 + 2.0F, var1 + var3 + 2.0F, 0.0F, var21, 4, (Object)null).N(var9, var14), var0 + var2 + 2.0F, var1 - 1.0F, 0.0F, var21, 4, (Object)null).N(var10, var14);
      RenderPipeline var29 = v2.S.E();
      class_276 var34 = s8.H((short)var18, (short)var19, var20).method_1522();
      Intrinsics.checkNotNullExpressionValue(var34, true.k<invokedynamic>(14784, 3150566388566826594L ^ var5));
      class_276 var30 = var34;
      Matrix3x2f var31 = new Matrix3x2f((Matrix3x2fc)var11);
      GpuBufferSlice var32 = bb.K.G().method_71102((class_11281)(new _l(var2, var3, var4, var12 / 2.0F, var23, var13)));

      try {
         ib.j(var28, var29, var30, var25, var32, (Matrix4f)null, var31, (Map)null, true.a<invokedynamic>(12805, 2528722907341507537L ^ var5), (Object)null);
         if (-37790383356118509L.A<invokedynamic>(-37790383356118509L, var5) == null) {
            ++var27;
            var27.A<invokedynamic>(var27, -4705895100399690L, var5);
         }

      } catch (NumberFormatException var33) {
         throw var33.A<invokedynamic>(var33, -65257301314532488L, var5);
      }
   }

   public static void f(float var0, float var1, float var2, float var3, float var4, Color var5, Color var6, Color var7, Color var8, Matrix3x2fStack var9, long var10, float var12, Color var13, int var14, Object var15) {
      var10 ^= a;
      long var16 = var10 ^ 78839468267752L;
      int var18 = -3588961532673440659L.A<invokedynamic>(-3588961532673440659L, var10);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var14 & true.a<invokedynamic>(26807, 5358582085698953341L ^ var10);
               if (var18 == 0) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var19) {
               throw var19.A<invokedynamic>(var19, -3601692223915181468L, var10);
            }

            var12 = 0.0F;
         }

         var10000 = var14 & true.a<invokedynamic>(32212, 4598345356648887583L ^ var10);
      }

      if (var10000 != 0) {
         Color var20 = Color.WHITE;
         Intrinsics.checkNotNullExpressionValue(var20, true.k<invokedynamic>(15216, 4812868109766700489L ^ var10));
         var13 = var20;
      }

      m(var0, var1, var2, var3, var4, var16, var5, var6, var7, var8, var9, var12, var13);
   }

   public static void O(String[] var0) {
      H = var0;
   }

   public static String[] D() {
      return H;
   }

   static {
      long var20 = a ^ 87047481575775L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, -2224538838776278169L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[9];
      int var16 = 0;
      String var15 = "z&\u0000sÅ)\u0087\u0000\u008f;A\u0082\u009a\u0098\u0084½\u008a3ZÛG\u001fKt\u007f\u001d\u0019YV¥Pa\u0010\u008e/´@J¼\u000f\tAºÎ>\u0086x\n£\u0010kÜØ¡nO\u0011\u000eÛÀÞhË\rRk vÈ\u0091ÈicÜ7\u0080ØçOÐ%y5j\u009dg\u001c,Ä\u0097\u00ad\u0095\u0088l\u0085\u009fT.!\u0018\u0094ÁNá`\u0089üÍÕ\u0015Z\u0090ýF\u0007:Rn\u009c\u0010»F_\f0@ïáá\\\u00adò\r\u000fT=äÉ}çN\u00881\u0095¾G\u007fçYÄ¹\u001a)øÆ*+°,ù\u0002\u0090|a²7DôH@«n:(f¡\u0082*ïºiv\u0004\fÍbk\u009få\u009e\b\u0017¦.Þi¼\u0084RK;É²\u0081\u0000\u0016\u0092ôãdà\u008fgS";
      int var17 = "z&\u0000sÅ)\u0087\u0000\u008f;A\u0082\u009a\u0098\u0084½\u008a3ZÛG\u001fKt\u007f\u001d\u0019YV¥Pa\u0010\u008e/´@J¼\u000f\tAºÎ>\u0086x\n£\u0010kÜØ¡nO\u0011\u000eÛÀÞhË\rRk vÈ\u0091ÈicÜ7\u0080ØçOÐ%y5j\u009dg\u001c,Ä\u0097\u00ad\u0095\u0088l\u0085\u009fT.!\u0018\u0094ÁNá`\u0089üÍÕ\u0015Z\u0090ýF\u0007:Rn\u009c\u0010»F_\f0@ïáá\\\u00adò\r\u000fT=äÉ}çN\u00881\u0095¾G\u007fçYÄ¹\u001a)øÆ*+°,ù\u0002\u0090|a²7DôH@«n:(f¡\u0082*ïºiv\u0004\fÍbk\u009få\u009e\b\u0017¦.Þi¼\u0084RK;É²\u0081\u0000\u0016\u0092ôãdà\u008fgS".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var28;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[9];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "ñx¶ÞÔ·à ^¦Ü\u008cqþ\u001bä";
                  int var5 = "ñx¶ÞÔ·à ^¦Ü\u008cqþ\u001bä".length();
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
                              f = new Integer[4];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0085ÈWÙ_\u0018ïS!\u0092[ZÆgÝÊ";
                           var5 = "\u0085ÈWÙ_\u0018ïS!\u0092[ZÆgÝÊ".length();
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

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var28;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0012Daâ\u009cE®zÁ¼u¤\u008a\b,\u009eEa\u009di{ï\u0016\u001e\u0018ºYZÜ\u0000ù^'}Ú6\u001cÃß\b\u000e\b$M©v:\fø";
               var17 = "\u0012Daâ\u009cE®zÁ¼u¤\u008a\b,\u009eEa\u009di{ï\u0016\u001e\u0018ºYZÜ\u0000ù^'}Ú6\u001cÃß\b\u000e\b$M©v:\fø".length();
               var14 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22793;
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
            throw new RuntimeException("su/catlean/bt", var10);
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
         throw new RuntimeException("su/catlean/bt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1913;
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
            throw new RuntimeException("su/catlean/bt", var14);
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
         throw new RuntimeException("su/catlean/bt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
