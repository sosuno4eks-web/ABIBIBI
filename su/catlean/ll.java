package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
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
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class ll extends k9 {
   @NotNull
   public static final ll Q;
   private static float A;
   private static float d;
   private static float y;
   private static float t;
   private static float O;
   private static float C;
   private static float L;
   private static float c;
   private static float r;
   private static int M;
   private static final long b = j0.a(4931541771084661978L, 7936840327556640799L, MethodHandles.lookup().lookupClass()).a(244311001167071L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g;
   private static final long[] i;
   private static final Integer[] k;
   private static final Map l;

   private ll(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 43331428740682L;
      super(var3, true.v<invokedynamic>(27776, 1888095874955775216L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   public void n(long var1) {
      long var10001 = var1 ^ 67690049692709L;
      int var3 = (int)((var1 ^ 67690049692709L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 102853793849744L;
      var10001 = var1 ^ 139745504383299L;
      int var8 = (int)((var1 ^ 139745504383299L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      k9[] var11 = -6717952057414120907L.A<invokedynamic>(-6717952057414120907L, var1);

      class_746 var10000;
      label22: {
         try {
            var10000 = s8.H((short)var8, (short)var9, var10).field_1724;
            if (var11 == null) {
               break label22;
            }

            if (var10000 == null) {
               return;
            }
         } catch (NumberFormatException var12) {
            throw var12.A<invokedynamic>(var12, -6717885347515736671L, var1);
         }

         M = 0;
         s8.i((char)var3, var4, (short)var5).method_8486((double)A, (double)d + 0.5D, (double)y, class_3417.field_15079, class_3419.field_15245, 0.2F, 1.0F, false);
         A = (float)s8.f(var6).method_33571().field_1352;
         d = (float)s8.f(var6).method_33571().field_1351;
         y = (float)s8.f(var6).method_33571().field_1350;
         L = (float)s8.f(var6).method_5720().field_1352;
         c = (float)s8.f(var6).method_5720().field_1351 + 0.42F + (float)s8.f(var6).method_18798().field_1351;
         var10000 = s8.f(var6);
      }

      r = (float)var10000.method_5720().field_1350;
   }

   @Flow
   private final void T(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void W(Render3DEvent var1) {
      long var2 = b ^ 75839165145176L;
      long var10001 = var2 ^ 98614900372787L;
      int var4 = (int)((var2 ^ 98614900372787L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 127885576205617L;
      long var9 = var2 ^ 57512669850224L;
      class_4184 var10000 = s8.H((short)var4, (short)var5, var6).field_1773.method_19418();
      Intrinsics.checkNotNullExpressionValue(var10000, true.v<invokedynamic>(14456, 7711584019995519709L ^ var2));
      class_4184 var11 = var10000;
      float var12 = gk.E.i(t, A, gk.E.h(var9));
      float var13 = gk.E.i(O, d, gk.E.h(var9));
      float var14 = gk.E.i(C, y, gk.E.h(var9));
      var1.getStack().method_22903();
      var1.getStack().method_22904((double)var12 - var11.method_71156().field_1352, (double)var13 - var11.method_71156().field_1351, (double)var14 - var11.method_71156().field_1350);
      this.L(var1.getStack(), var7, 0.0F, 0.0F, 0.0F);
      var1.getStack().method_22909();
   }

   public final void L(@NotNull class_4587 matrices, long a, float x, float y, float z) {
      var2 ^= b;
      long var10001 = var2 ^ 91382059762912L;
      int var7 = (int)((var2 ^ 91382059762912L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var2 ^ 120423777448856L;
      long var12 = var2 ^ 134228861650784L;
      long var14 = var2 ^ 6949187605574L;
      k9[] var10000 = -3155309375870174010L.A<invokedynamic>(-3155309375870174010L, var2);
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(16463, 2162350626427568239L ^ var2));
      k9[] var16 = var10000;
      Matrix4f var31 = var1.method_23760().method_23761();
      Intrinsics.checkNotNullExpressionValue(var31, true.v<invokedynamic>(11666, 3807995448307674545L ^ var2));
      Matrix4f var17 = var31;
      VertexFormat var10002 = class_290.field_1576;
      Intrinsics.checkNotNullExpressionValue(var10002, true.v<invokedynamic>(7027, 2935332405819398993L ^ var2));
      ib var18 = new ib(var10002, true.t<invokedynamic>(22959, 5710651573202281695L ^ var2), false, 4, var12, (DefaultConstructorMarker)null);
      float var19 = 0.12F;
      float var20 = 0.5F;
      float var21 = 0.2F;
      int var22 = true.t<invokedynamic>(20585, 4216285094217903376L ^ var2);
      int var23 = 0;

      float var24;
      float var25;
      float var26;
      float var27;
      float var28;
      float var29;
      float var32;
      ib var33;
      while(true) {
         if (var23 < var22) {
            var24 = (float)(6.283185307179586D * (double)var23 / (double)var22);
            var25 = (float)(6.283185307179586D * (double)(var23 + 1) / (double)var22);
            var26 = var4 + (float)Math.cos((double)var24) * var19;
            var27 = var6 + (float)Math.sin((double)var24) * var19;
            var28 = var4 + (float)Math.cos((double)var25) * var19;
            var32 = var6 + (float)Math.sin((double)var25) * var19;
            if (var16 == null) {
               break;
            }

            var29 = var32;
            Color var30 = Color.DARK_GRAY;
            var33 = var18.A(var17, var7, var26, (char)var8, var5, var9, var27);
            Intrinsics.checkNotNull(var30);
            var33.N(var30, var10);
            var18.A(var17, var7, var26, (char)var8, var5 + var20, var9, var27).N(var30, var10);
            var18.A(var17, var7, var28, (char)var8, var5 + var20, var9, var29).N(var30, var10);
            var18.A(var17, var7, var28, (char)var8, var5, var9, var29).N(var30, var10);
            ++var23;
            if (var16 != null) {
               continue;
            }

            (new int[4]).A<invokedynamic>(new int[4], -3150905912566278146L, var2);
         }

         var32 = var5 + var20 / (float)2 - var21 / (float)2;
         break;
      }

      float var35 = var32;
      int var36 = 0;

      Color var34;
      while(true) {
         if (var36 < var22) {
            var25 = (float)(6.283185307179586D * (double)var36 / (double)var22);
            var26 = (float)(6.283185307179586D * (double)(var36 + 1) / (double)var22);
            var27 = var4 + (float)Math.cos((double)var25) * (var19 + 0.01F);
            var28 = var6 + (float)Math.sin((double)var25) * (var19 + 0.01F);
            var29 = var4 + (float)Math.cos((double)var26) * (var19 + 0.01F);
            var32 = var6 + (float)Math.sin((double)var26) * (var19 + 0.01F);
            if (var16 == null) {
               break;
            }

            float var37 = var32;
            var33 = var18.A(var17, var7, var27, (char)var8, var35, var9, var28);
            var34 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(var34, true.v<invokedynamic>(31456, 5482960822491888325L ^ var2));
            var33.N(var34, var10);
            var33 = var18.A(var17, var7, var27, (char)var8, var35 + var21, var9, var28);
            var34 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(var34, true.v<invokedynamic>(3872, 5875787651639463684L ^ var2));
            var33.N(var34, var10);
            var33 = var18.A(var17, var7, var29, (char)var8, var35 + var21, var9, var37);
            var34 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(var34, true.v<invokedynamic>(3872, 5875787651639463684L ^ var2));
            var33.N(var34, var10);
            var33 = var18.A(var17, var7, var29, (char)var8, var35, var9, var37);
            var34 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(var34, true.v<invokedynamic>(3872, 5875787651639463684L ^ var2));
            var33.N(var34, var10);
            ++var36;
            if (var16 != null) {
               continue;
            }
         }

         var32 = 0.06F;
         break;
      }

      var24 = var32;
      var25 = 0.03F;
      var33 = var18.A(var17, var7, var4 - var25, (char)var8, var5 + var20 + var24, var9, var6 - var25);
      var34 = Color.BLACK;
      Intrinsics.checkNotNullExpressionValue(var34, true.v<invokedynamic>(31509, 7473857432605997874L ^ var2));
      var33.N(var34, var10);
      var33 = var18.A(var17, var7, var4 - var25, (char)var8, var5 + var20, var9, var6 - var25);
      var34 = Color.BLACK;
      Intrinsics.checkNotNullExpressionValue(var34, true.v<invokedynamic>(3894, 8539607163227066135L ^ var2));
      var33.N(var34, var10);
      var33 = var18.A(var17, var7, var4 + var25, (char)var8, var5 + var20, var9, var6 + var25);
      var34 = Color.BLACK;
      Intrinsics.checkNotNullExpressionValue(var34, true.v<invokedynamic>(3894, 8539607163227066135L ^ var2));
      var33.N(var34, var10);
      var33 = var18.A(var17, var7, var4 + var25, (char)var8, var5 + var20 + var24, var9, var6 + var25);
      var34 = Color.BLACK;
      Intrinsics.checkNotNullExpressionValue(var34, true.v<invokedynamic>(3894, 8539607163227066135L ^ var2));
      var33.N(var34, var10);
      ib.j(var18, v2.S.b(), (class_276)null, var14, (GpuBufferSlice)null, var1.method_23760().method_23761(), (Matrix3x2f)null, (Map)null, true.t<invokedynamic>(7262, 504252410050814244L ^ var2), (Object)null);
   }

   static {
      long var20 = b ^ 68263001890758L;
      long var22 = var20 ^ 87561458379504L;
      g = new HashMap(13);
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
      String var15 = "Ù)\bæ\u0003«Bñx[u\u009cü?4+0ß¶åå\u000eeÉ)O\u0001ÜñÁEÂ\u0014\u0090\u0097*\u0086î\u0081õ\u0010ö\u0088{jTÃ°é\u008b\u0006KïÂK´Wü\u009e)\"°Ï\u001a2\u0010ã£é?\u0099Õ\u0000O\u0097¥\u0084¯ã7ÿ\\\u0010\u0096\u0007Z\u007fL\u0085u)bèÈf\f:Â5 ®ô¸â\u008aÉó\u0007ÆäF  \u0006\u001ft\u0003¡]È+Ú\u008a´¥ÿD2ì\u0018g\u0019 \u0081\u009eÂEä\u0098ÈD´®û\u0017?Ñ¬\u0084ç\u0017l\\å9+öPÃåÔÍütÙ\u0010e\u001bflh.e{*\u0019v\u0097>æBß";
      int var17 = "Ù)\bæ\u0003«Bñx[u\u009cü?4+0ß¶åå\u000eeÉ)O\u0001ÜñÁEÂ\u0014\u0090\u0097*\u0086î\u0081õ\u0010ö\u0088{jTÃ°é\u008b\u0006KïÂK´Wü\u009e)\"°Ï\u001a2\u0010ã£é?\u0099Õ\u0000O\u0097¥\u0084¯ã7ÿ\\\u0010\u0096\u0007Z\u007fL\u0085u)bèÈf\f:Â5 ®ô¸â\u008aÉó\u0007ÆäF  \u0006\u001ft\u0003¡]È+Ú\u008a´¥ÿD2ì\u0018g\u0019 \u0081\u009eÂEä\u0098ÈD´®û\u0017?Ñ¬\u0084ç\u0017l\\å9+öPÃåÔÍütÙ\u0010e\u001bflh.e{*\u0019v\u0097>æBß".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var30;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  f = new String[9];
                  l = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[12];
                  int var3 = 0;
                  String var4 = "\u0091\u008bú§\u0089ÒC¨à\u008f\u0087xÿBÌó\u000f«\u0002Á0\u00ad&©Rº\u0097zn\u0084,\u009a\u0082ÓpH Æ¹\u001eÎ\u009a:a¾\u0012\u008a=\u001bÕl1\u00ad\u001b¹N\u00032\"ð¸fËM.ã®\u008a¸íz\u0084X6Þ\u0017&-Lñ";
                  int var5 = "\u0091\u008bú§\u0089ÒC¨à\u008f\u0087xÿBÌó\u000f«\u0002Á0\u00ad&©Rº\u0097zn\u0084,\u009a\u0082ÓpH Æ¹\u001eÎ\u009a:a¾\u0012\u008a=\u001bÕl1\u00ad\u001b¹N\u00032\"ð¸fËM.ã®\u008a¸íz\u0084X6Þ\u0017&-Lñ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var27[var28] = var35;
                           if (var2 >= var5) {
                              i = var6;
                              k = new Integer[12];
                              Q = new ll(var22);
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "aÿ\u0012É\u0080s1\u0087çî4N±\u0000Án";
                           var5 = "aÿ\u0012É\u0080s1\u0087çî4N±\u0000Án".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var30;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "ÍC(®í\u008a9\u0084«M'üQûb\u007f\u0006\u0016\u000e\u0087ßÑ5Ã+Ï\u008bÛö±µi à¢ñ¢þZIÔÐû÷\u001c\u001bãóåØ¼<»úÞB\u0002À»Nß\u001fø\t\u000e";
               var17 = "ÍC(®í\u008a9\u0084«M'üQûb\u007f\u0006\u0016\u000e\u0087ßÑ5Ã+Ï\u008bÛö±µi à¢ñ¢þZIÔÐû÷\u001c\u001bãóåØ¼<»úÞB\u0002À»Nß\u001fø\t\u000e".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5454;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ll", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ll" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26650;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ll", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ll" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
