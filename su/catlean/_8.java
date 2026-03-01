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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;

public final class _8 {
   private static int N;
   private static final long a = j0.a(9106332970689137380L, 2851530544483535703L, MethodHandles.lookup().lookupClass()).a(15555219402083L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static final void O(@NotNull Matrix3x2fStack stack, float x, float y, float w, float h, float radiusValue, float outlineWidth, float mixValue, float alphaValue, @NotNull Color colorValue, @NotNull Color outlineColorValue, float radius2, float radius3, float radius4, long a) {
      var14 ^= a;
      long var16 = var14 ^ 131179906574741L;
      long var18 = var14 ^ 106500095712621L;
      long var20 = var14 ^ 43013780200689L;
      long var22 = var14 ^ 64774020445394L;
      long var24 = var14 ^ 129718235735656L;
      long var10001 = var14 ^ 81918247529520L;
      int var26 = (int)((var14 ^ 81918247529520L) >>> 32);
      int var27 = (int)(var10001 << 32 >>> 48);
      int var28 = (int)(var10001 << 48 >>> 48);
      long var29 = var14 ^ 11348329187677L;
      long var31 = var14 ^ 31443725733451L;
      Intrinsics.checkNotNullParameter(var0, true.o<invokedynamic>(6999, 2913145469590349273L ^ var14));
      Intrinsics.checkNotNullParameter(var9, true.o<invokedynamic>(13118, 849913333489601971L ^ var14));
      int var10000 = 5651170899303518317L.A<invokedynamic>(5651170899303518317L, var14);
      Intrinsics.checkNotNullParameter(var10, true.o<invokedynamic>(23343, 54660413129254311L ^ var14));
      float var34 = RangesKt.coerceIn(var3 / 10000.0F, 0.0F, 1.0F);
      float var35 = RangesKt.coerceIn(var4 / 10000.0F, 0.0F, 1.0F);
      float var36 = RangesKt.coerceIn(var8, 0.0F, 1.0F);
      int var33 = var10000;
      VertexFormat var10002 = class_290.field_1575;
      Intrinsics.checkNotNullExpressionValue(var10002, true.o<invokedynamic>(23851, 5111558391935001511L ^ var14));
      ib var37 = ib.P(ib.P(ib.P(ib.P(new ib(var10002, 0, false, true.h<invokedynamic>(6107, 7590872444827128858L ^ var14), var18, (DefaultConstructorMarker)null), var1 - 1.0F, var2 + var4 + 2.0F, 0.0F, var24, 4, (Object)null).k(var26, var34, var35, (short)var27, (char)var28).N(new Color(0.0F, 0.0F, var36, var36), var16), var1 - 1.0F, var2 - 1.0F, 0.0F, var24, 4, (Object)null).k(var26, var34, var35, (short)var27, (char)var28).N(new Color(0.0F, 0.0F, var36, var36), var16), var1 + var3 + 2.0F, var2 - 1.0F, 0.0F, var24, 4, (Object)null).k(var26, var34, var35, (short)var27, (char)var28).N(new Color(0.0F, 0.0F, var36, var36), var16), var1 + var3 + 2.0F, var2 + var4 + 2.0F, 0.0F, var24, 4, (Object)null).k(var26, var34, var35, (short)var27, (char)var28).N(new Color(0.0F, 0.0F, var36, var36), var16);
      RenderPipeline var38 = v2.S.R();
      Matrix3x2f var39 = new Matrix3x2f((Matrix3x2fc)var0);
      GpuBufferSlice var40 = xn.e.b().method_71102((class_11281)(new zb(var5, var11, var12, var13, var22, var6 / 2.0F, gk.E.e(var20, var9, gk.E.D(var29, var9) * gk.E.p()), gk.E.e(var20, var10, gk.E.D(var29, var10) * gk.E.p()), var7)));
      Map var41 = MapsKt.mapOf(TuplesKt.to(true.o<invokedynamic>(29988, 4122389725645982635L ^ var14), xj.Y.S()));

      try {
         ib.j(var37, var38, (class_276)null, var31, var40, (Matrix4f)null, var39, var41, true.h<invokedynamic>(5574, 2197405726827238912L ^ var14), (Object)null);
         if (var33 != 0) {
            (new int[3]).A<invokedynamic>(new int[3], 5640935608928865779L, var14);
         }

      } catch (NumberFormatException var42) {
         throw var42.A<invokedynamic>(var42, 5629809104311231790L, var14);
      }
   }

   public static void M(Matrix3x2fStack var0, float var1, float var2, float var3, float var4, float var5, int var6, float var7, float var8, char var9, float var10, Color var11, Color var12, float var13, float var14, short var15, float var16, int var17, Object var18) {
      long var19 = ((long)var6 << 32 | (long)var9 << 48 >>> 32 | (long)var15 << 48 >>> 48) ^ a;
      long var21 = var19 ^ 103675392622609L;
      int var23 = -7337478400450555792L.A<invokedynamic>(-7337478400450555792L, var19);

      int var10000;
      label41: {
         label40: {
            try {
               var10000 = var17 & true.h<invokedynamic>(25882, 2184653378642670097L ^ var19);
               if (var23 == 0) {
                  break label41;
               }

               if (var10000 == 0) {
                  break label40;
               }
            } catch (NumberFormatException var25) {
               throw var25.A<invokedynamic>(var25, -7283976225794231835L, var19);
            }

            var13 = var5;
         }

         var10000 = var17 & true.h<invokedynamic>(286, 956402704336918039L ^ var19);
      }

      label32: {
         label31: {
            try {
               if (var23 == 0) {
                  break label32;
               }

               if (var10000 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var24) {
               throw var24.A<invokedynamic>(var24, -7283976225794231835L, var19);
            }

            var14 = var5;
         }

         var10000 = var17 & true.h<invokedynamic>(11509, 9016063317157035005L ^ var19);
      }

      if (var10000 != 0) {
         var16 = var5;
      }

      O(var0, var1, var2, var3, var4, var5, var7, var8, var10, var11, var12, var13, var14, var16, var21);
   }

   public static void r(int var0) {
      N = var0;
   }

   public static int S() {
      return N;
   }

   public static int U() {
      int var0 = S();

      try {
         return var0 == 0 ? 113 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var20 = a ^ 70852680413538L;
      d = new HashMap(13);
      0.A<invokedynamic>(0, 2664183020047983776L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "ÎlhÖTtÓ¯{¼ò\u00adè\"#\u0081ç`\u0006i'½í\u00ad1³ÙæpY¦)ü\u001eSçë\u001b1ú Ü¶\u0088ÿã\u0085no\u0015ÛmAN\u0013îYÚe¬\u009c<¥¹\u0007¬u\u0017]pø¡\u0018\u0010ÈsiÐ:LJî\u009bÚ\u001cÔJãèO";
      int var17 = "ÎlhÖTtÓ¯{¼ò\u00adè\"#\u0081ç`\u0006i'½í\u00ad1³ÙæpY¦)ü\u001eSçë\u001b1ú Ü¶\u0088ÿã\u0085no\u0015ÛmAN\u0013îYÚe¬\u009c<¥¹\u0007¬u\u0017]pø¡\u0018\u0010ÈsiÐ:LJî\u009bÚ\u001cÔJãèO".length();
      char var14 = '(';
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
                  c = new String[5];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "]\u0015YÏB)¬Í\u0014å´1®|\r¨\u0003\u000et-w\u0093á~";
                  int var5 = "]\u0015YÏB)¬Í\u0014å´1®|\r¨\u0003\u000et-w\u0093á~".length();
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
                              f = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\tù\u0091\u0012h\u007fñô!\u008fÓ@:UU(";
                           var5 = "\tù\u0091\u0012h\u007fñô!\u008fÓ@:UU(".length();
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

               var15 = "O\u008d\b.Dpæ×ïs\u0019!Øed\f:÷\u0081³Þè¬\u009då!_e\u009aïºj ÇWÀz§\u0014¾6\u0096\u0085ñ?²\u008bS©\u0092\u0016ì\u0086A\u0013\u0088\u008a)/KKbÍÃ\u0081";
               var17 = "O\u008d\b.Dpæ×ïs\u0019!Øed\f:÷\u0081³Þè¬\u009då!_e\u009aïºj ÇWÀz§\u0014¾6\u0096\u0085ñ?²\u008bS©\u0092\u0016ì\u0086A\u0013\u0088\u008a)/KKbÍÃ\u0081".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29160;
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
            throw new RuntimeException("su/catlean/_8", var10);
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
         throw new RuntimeException("su/catlean/_8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3238;
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
            throw new RuntimeException("su/catlean/_8", var14);
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
         throw new RuntimeException("su/catlean/_8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
