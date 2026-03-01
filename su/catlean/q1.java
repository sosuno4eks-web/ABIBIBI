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
import kotlin.ranges.RangesKt;
import net.minecraft.class_10017;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4604;
import net.minecraft.class_583;
import net.minecraft.class_591;
import net.minecraft.class_742;
import net.minecraft.class_897;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix4f;
import org.joml.Vector4d;
import su.catlean.api.event.events.render.FrustrumEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class q1 {
   @NotNull
   public static final q1 A;
   @NotNull
   private static Matrix4f z;
   @NotNull
   private static class_4604 M;
   private static float p;
   private static float J;
   private static float V;
   private static boolean X;
   private static final long a = j0.a(1486191046769940545L, 7433240505766573681L, MethodHandles.lookup().lookupClass()).a(167125735362214L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private q1() {
   }

   @NotNull
   public final Matrix4f V() {
      return z;
   }

   public final void y(long a, @NotNull Matrix4f <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(21126, 2022274064302471319L ^ var1));
      z = var3;
   }

   @NotNull
   public final class_4604 p() {
      return M;
   }

   public final void R(@NotNull class_4604 <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(32427, 6797189128609473103L ^ var2));
      M = var1;
   }

   public final float r() {
      return p;
   }

   public final void T(float <set-?>) {
      p = var1;
   }

   public final float h() {
      return J;
   }

   public final void J(float <set-?>) {
      J = var1;
   }

   public final float f() {
      return V;
   }

   public final void u(float <set-?>) {
      V = var1;
   }

   @Flow
   private final void G(FrustrumEvent var1) {
      M = var1.getFrustrum();
   }

   @Flow(
      priority = 20
   )
   private final void U(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final void L(@NotNull String text, @NotNull class_243 pos, @NotNull Color color, int a, float offX, long a, float offY, boolean shadow, @NotNull fc font) {
      long var11 = ((long)var4 << 32 | var6 << 32 >>> 32) ^ a;
      long var10001 = var11 ^ 138185726609410L;
      int var13 = (int)((var11 ^ 138185726609410L) >>> 32);
      int var14 = (int)(var10001 << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      var10001 = var11 ^ 29437111436371L;
      int var16 = (int)((var11 ^ 29437111436371L) >>> 48);
      int var17 = (int)(var10001 << 16 >>> 48);
      int var18 = (int)(var10001 << 32 >>> 32);
      long var19 = var11 ^ 75796141499679L;
      long var21 = var11 ^ 50854542400767L;
      long var23 = var11 ^ 2034327681938L;
      long var25 = var11 ^ 116150849597619L;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(22282, 3262359346094893496L ^ var11));
      Intrinsics.checkNotNullParameter(var2, true.e<invokedynamic>(28003, 6672440706839860178L ^ var11));
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(24625, 745775896744517309L ^ var11));
      Intrinsics.checkNotNullParameter(var10, true.e<invokedynamic>(11885, 5561459162532581611L ^ var11));
      Vector4d var27 = gk.E.j(var13, (short)var14, (short)var15, var2);
      if (var27 != null) {
         Matrix3x2fStack var28 = new Matrix3x2fStack(true.g<invokedynamic>(4100, 3420622409374171771L ^ var11));

         try {
            var28.translate((float)var27.x, (float)var27.y);
            lw var10002 = lw.l;
            class_1297 var10003 = s8.H((short)var16, (short)var17, var18).method_1560();
            Intrinsics.checkNotNull(var10003);
            var28.scale(1.0F - ((Number)RangesKt.coerceIn((Comparable)(float)var10002.W(var23, var10003).method_1022(var2), RangesKt.rangeTo(1.0F, 10.0F))).floatValue() / 10.0F);
            if (var4 > 0 && var9) {
               float var10004 = var5 + 1.0F;
               float var10005 = var8 + 1.0F;
               gk var10006 = gk.E;
               Color var10007 = Color.BLACK;
               Intrinsics.checkNotNullExpressionValue(var10007, true.e<invokedynamic>(20172, 1044933899415220339L ^ var11));
               var10.q(var28, var21, var1, var10004, var10005, var10006.e(var19, var10007, gk.E.D(var25, var3)));
            }
         } catch (NumberFormatException var29) {
            throw var29.A<invokedynamic>(var29, 8583941481147760717L, var11);
         }

         var10.q(var28, var21, var1, var5, var8, var3);
      }

   }

   public static void Q(q1 param0, String param1, class_243 param2, int param3, Color param4, float param5, char param6, float param7, short param8, boolean param9, fc param10, int param11, Object param12) {
      // $FF: Couldn't be decompiled
   }

   public final float s(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 78202142181964L;
      int var3 = (int)((var1 ^ 78202142181964L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return s8.H((short)var3, (short)var4, var5).method_61966().method_60637(true);
   }

   public final boolean N(@NotNull class_238 box, @NotNull Color color, @NotNull Color color2, long a) {
      var4 ^= a;
      long var6 = var4 ^ 139270985065558L;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(2797, 4931039884276546166L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.e<invokedynamic>(24625, 745818285003296931L ^ var4));
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(31124, 6617442807584672031L ^ var4));
      return _o.w.J().add(new f5(var1, var2, var3, var6));
   }

   public static boolean I(q1 var0, long var1, class_238 var3, Color var4, Color var5, int var6, Object var7) {
      var1 ^= a;
      long var8 = var1 ^ 39772303544290L;
      String var10 = 1931143836510255444L.A<invokedynamic>(1931143836510255444L, var1);

      int var10000;
      label20: {
         try {
            var10000 = var6 & 4;
            if (var10 != null) {
               return (boolean)var10000;
            }

            if (var10000 == 0) {
               break label20;
            }
         } catch (NumberFormatException var11) {
            throw var11.A<invokedynamic>(var11, 1989511119552179441L, var1);
         }

         var5 = var4;
      }

      var10000 = var0.N(var3, var4, var5, var8);
      return (boolean)var10000;
   }

   public final boolean Z(@NotNull class_238 box, long a, @NotNull Color color, @NotNull Color color2) {
      var2 ^= a;
      long var6 = var2 ^ 109555678314140L;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(2797, 4931036624961691836L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.e<invokedynamic>(24625, 745821613160827497L ^ var2));
      Intrinsics.checkNotNullParameter(var5, true.e<invokedynamic>(31124, 6617472464900461525L ^ var2));
      return _o.w.m().add(new f5(var1, var4, var5, var6));
   }

   public static boolean Y(q1 var0, class_238 var1, Color var2, Color var3, int var4, Object var5, long var6) {
      var6 ^= a;
      long var8 = var6 ^ 61109738137216L;
      String var10 = -1628962042746303748L.A<invokedynamic>(-1628962042746303748L, var6);

      int var10000;
      label20: {
         try {
            var10000 = var4 & 4;
            if (var10 != null) {
               return (boolean)var10000;
            }

            if (var10000 == 0) {
               break label20;
            }
         } catch (NumberFormatException var11) {
            throw var11.A<invokedynamic>(var11, -1714702247981801639L, var6);
         }

         var3 = var2;
      }

      var10000 = var0.Z(var1, var8, var2, var3);
      return (boolean)var10000;
   }

   public final boolean K(long a, @NotNull class_238 box, @NotNull Color color, @NotNull Color color2) {
      var1 ^= a;
      long var6 = var1 ^ 43748415955185L;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(27727, 6468263578472945743L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.e<invokedynamic>(17620, 1580542238765625594L ^ var1));
      Intrinsics.checkNotNullParameter(var5, true.e<invokedynamic>(8646, 1387601429278053862L ^ var1));
      return _o.w.k().add(new f5(var3, var4, var5, var6));
   }

   public static boolean B(q1 var0, class_238 var1, Color var2, Color var3, int var4, Object var5, long var6) {
      var6 ^= a;
      long var8 = var6 ^ 21819665909794L;
      String var10 = -7373620188373812685L.A<invokedynamic>(-7373620188373812685L, var6);

      int var10000;
      label20: {
         try {
            var10000 = var4 & 4;
            if (var10 != null) {
               return (boolean)var10000;
            }

            if (var10000 == 0) {
               break label20;
            }
         } catch (NumberFormatException var11) {
            throw var11.A<invokedynamic>(var11, -7423261196701372522L, var6);
         }

         var3 = var2;
      }

      var10000 = var0.K(var8, var1, var2, var3);
      return (boolean)var10000;
   }

   public final boolean A(long a, @NotNull class_238 box, @NotNull class_2350 side, @NotNull Color color) {
      var1 ^= a;
      long var6 = var1 ^ 82231333115446L;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(2797, 4931095269317746259L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.e<invokedynamic>(30565, 6512359152396133327L ^ var1));
      Intrinsics.checkNotNullParameter(var5, true.e<invokedynamic>(24625, 745902520748078214L ^ var1));
      return _o.w.p().add(new _4(var3, var5, var4, var6));
   }

   public final boolean y(long a, @NotNull class_238 box, @NotNull class_2350 side, @NotNull Color color) {
      var1 ^= a;
      long var6 = var1 ^ 77127185008283L;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(2797, 4931100644889743102L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.e<invokedynamic>(7469, 7344943291389696289L ^ var1));
      Intrinsics.checkNotNullParameter(var5, true.e<invokedynamic>(24625, 745898279049405483L ^ var1));
      return _o.w.t().add(new _4(var3, var5, var4, var6));
   }

   public final boolean I(@NotNull class_243 start, @NotNull class_243 end, @NotNull Color startColor, @NotNull Color endColor, boolean ignoreFrustrum, long a) {
      var6 ^= a;
      long var8 = var6 ^ 134873819290144L;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(22910, 6025027008333081062L ^ var6));
      Intrinsics.checkNotNullParameter(var2, true.e<invokedynamic>(32433, 7545488385478610436L ^ var6));
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(25464, 5354454867621532652L ^ var6));
      Intrinsics.checkNotNullParameter(var4, true.e<invokedynamic>(26146, 4199690635728311955L ^ var6));
      return _o.w.B().add(new v4(var1, var2, var3, var4, var8, var5));
   }

   public static boolean P(q1 var0, short var1, int var2, class_243 var3, class_243 var4, Color var5, Color var6, boolean var7, short var8, int var9, Object var10) {
      long var11 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var8 << 48 >>> 48) ^ a;
      long var13 = var11 ^ 74464198611550L;
      String var15 = -8697061944900164395L.A<invokedynamic>(-8697061944900164395L, var11);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var9 & true.g<invokedynamic>(4100, 3420488593899057990L ^ var11);
               if (var15 != null) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NumberFormatException var17) {
               throw var17.A<invokedynamic>(var17, -8782809849943527056L, var11);
            }

            var6 = var5;
         }

         var10000 = var9 & true.g<invokedynamic>(27949, 5766037888448269928L ^ var11);
      }

      label27: {
         try {
            if (var15 != null) {
               return (boolean)var10000;
            }

            if (var10000 == 0) {
               break label27;
            }
         } catch (NumberFormatException var16) {
            throw var16.A<invokedynamic>(var16, -8782809849943527056L, var11);
         }

         var7 = false;
      }

      var10000 = var0.I(var3, var4, var5, var6, var7, var13);
      return (boolean)var10000;
   }

   public final boolean b(@NotNull class_243 start, @NotNull class_243 end, @NotNull Color startColor, long a, @NotNull Color endColor) {
      var4 ^= a;
      long var10001 = var4 ^ 12259176970073L;
      int var7 = (int)((var4 ^ 12259176970073L) >>> 48);
      long var8 = var10001 << 16 >>> 16;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(20199, 5920543321099563595L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.e<invokedynamic>(31159, 5233413980333917451L ^ var4));
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(11478, 1002876901399760992L ^ var4));
      Intrinsics.checkNotNullParameter(var6, true.e<invokedynamic>(23830, 8405006195975053707L ^ var4));
      return _o.w.M().add(new v4(var1, (char)var7, var2, var3, var8, var6, false, true.g<invokedynamic>(27949, 5766110635148443005L ^ var4), (DefaultConstructorMarker)null));
   }

   public static boolean u(q1 var0, long var1, class_243 var3, class_243 var4, Color var5, Color var6, int var7, Object var8) {
      var1 ^= a;
      long var9 = var1 ^ 4613355700712L;
      String var11 = 6408901249083882344L.A<invokedynamic>(6408901249083882344L, var1);

      int var10000;
      label20: {
         try {
            var10000 = var7 & true.g<invokedynamic>(4100, 3420534251408010491L ^ var1);
            if (var11 != null) {
               return (boolean)var10000;
            }

            if (var10000 == 0) {
               break label20;
            }
         } catch (NumberFormatException var12) {
            throw var12.A<invokedynamic>(var12, 6458189894686322381L, var1);
         }

         var6 = var5;
      }

      var10000 = var0.b(var3, var4, var5, var9, var6);
      return (boolean)var10000;
   }

   @NotNull
   public final class_238 X(@NotNull class_238 from, long a, @NotNull class_238 to, float delta) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(4091, 381291747575324462L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.e<invokedynamic>(27121, 4826721711001712944L ^ var2));
      return new class_238(gk.E.u(var1.field_1323, var4.field_1323, var5), gk.E.u(var1.field_1322, var4.field_1322, var5), gk.E.u(var1.field_1321, var4.field_1321, var5), gk.E.u(var1.field_1320, var4.field_1320, var5), gk.E.u(var1.field_1325, var4.field_1325, var5), gk.E.u(var1.field_1324, var4.field_1324, var5));
   }

   public static class_238 c(q1 var0, class_238 var1, class_238 var2, float var3, long var4, int var6, Object var7) {
      var4 ^= a;
      long var8 = var4 ^ 81185314640737L;
      long var10 = var4 ^ 91526841447203L;
      if ((var6 & 4) != 0) {
         var3 = var0.s(var8);
      }

      return var0.X(var1, var10, var2, var3);
   }

   @NotNull
   public final class_243 J(@NotNull class_243 from, @NotNull class_243 to, float delta, long a) {
      var4 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(19037, 2061061465420845300L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.e<invokedynamic>(12942, 7841458523470473268L ^ var4));
      return new class_243(gk.E.s(var1.field_1352, var2.field_1352, (double)var3), gk.E.s(var1.field_1351, var2.field_1351, (double)var3), gk.E.s(var1.field_1350, var2.field_1350, (double)var3));
   }

   public static class_243 Z(q1 var0, class_243 var1, long var2, class_243 var4, float var5, int var6, Object var7) {
      var2 ^= a;
      long var8 = var2 ^ 92201756253459L;
      long var10 = var2 ^ 74018568943398L;
      if ((var6 & 4) != 0) {
         var5 = var0.s(var8);
      }

      return var0.J(var1, var4, var5, var10);
   }

   private final class_238 x(class_1297 var1, long var2) {
      var2 ^= a;
      long var4 = var2 ^ 13334198838712L;
      double var6 = gk.E.w(var1.field_6014, var4, var1.method_23317());
      double var8 = gk.E.w(var1.field_6036, var4, var1.method_23318());
      double var10 = gk.E.w(var1.field_5969, var4, var1.method_23321());
      class_238 var12 = var1.method_5829();
      boolean var13 = false;
      return new class_238(var12.field_1323 - var1.method_23317() + var6 - 0.05D, var12.field_1322 - var1.method_23318() + var8, var12.field_1321 - var1.method_23321() + var10 - 0.05D, var12.field_1320 - var1.method_23317() + var6 + 0.05D, var12.field_1325 - var1.method_23318() + var8 + 0.15D, var12.field_1324 - var1.method_23321() + var10 + 0.05D);
   }

   public final void c(@NotNull class_2960 texture, @NotNull class_243 pos, float yaw, int a, float pitch, float roll, float scale, @NotNull Color color, boolean altBlend, @Nullable ib polygon, short a, float uStart, char a, float vStart, float uEnd, float vEnd, boolean altRtotate) {
      // $FF: Couldn't be decompiled
   }

   public static void b(q1 param0, class_2960 param1, class_243 param2, float param3, float param4, float param5, float param6, Color param7, boolean param8, ib param9, float param10, long param11, float param13, float param14, float param15, boolean param16, int param17, Object param18) {
      // $FF: Couldn't be decompiled
   }

   public final void m(@NotNull class_4587 stack, @NotNull class_243 pos, @NotNull class_1657 entity, float alpha, boolean depthTest, long a) {
      var6 ^= a;
      long var8 = var6 ^ 21146644439015L;
      long var10 = var6 ^ 35569828156063L;
      long var12 = var6 ^ 18559692182851L;
      long var10001 = var6 ^ 9937011979667L;
      int var14 = (int)((var6 ^ 9937011979667L) >>> 48);
      int var15 = (int)(var10001 << 16 >>> 48);
      int var16 = (int)(var10001 << 32 >>> 32);
      long var17 = var6 ^ 95811368473823L;
      var10001 = var6 ^ 2029563001636L;
      long var19 = (var6 ^ 2029563001636L) >>> 16;
      int var21 = (int)(var10001 << 48 >>> 48);
      long var22 = var6 ^ 119452429043301L;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(1345, 6612810837899807292L ^ var6));
      String var10000 = -4057534062159059928L.A<invokedynamic>(-4057534062159059928L, var6);
      Intrinsics.checkNotNullParameter(var2, true.e<invokedynamic>(613, 7039122326072888605L ^ var6));
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(13006, 3171413098154212740L ^ var6));
      String var24 = var10000;
      GpuTextureView var41 = s8.H((short)var14, (short)var15, var16).method_1531().method_4619(((class_742)var3).method_52814().comp_1626().comp_3627()).method_71659();
      Intrinsics.checkNotNullExpressionValue(var41, true.e<invokedynamic>(21696, 6311235207880465334L ^ var6));
      GpuTextureView var25 = var41;

      int var42;
      label58: {
         label57: {
            try {
               float var51;
               var42 = (var51 = var4 - 1.0F) == 0.0F ? 0 : (var51 < 0.0F ? -1 : 1);
               if (var24 != null) {
                  break label58;
               }

               if (var42 == 0) {
                  break label57;
               }
            } catch (NumberFormatException var40) {
               throw var40.A<invokedynamic>(var40, -4116190552069885555L, var6);
            }

            var42 = 0;
            break label58;
         }

         var42 = 1;
      }

      Color var44;
      label49: {
         try {
            if (var42 != 0) {
               var44 = new Color(0.8F, 0.8F, 0.8F, var4);
               break label49;
            }
         } catch (NumberFormatException var39) {
            throw var39.A<invokedynamic>(var39, -4116190552069885555L, var6);
         }

         var44 = gk.E.e(var17, z8.I.O(), var4);
      }

      Color var26 = var44;
      VertexFormat var10002 = class_290.field_1575;
      Intrinsics.checkNotNullExpressionValue(var10002, true.e<invokedynamic>(29335, 1144302943087132104L ^ var6));
      ib var27 = new ib(var10002, true.g<invokedynamic>(24305, 1046563921462295879L ^ var6), false, 4, var12, (DefaultConstructorMarker)null);
      qv var28 = new qv(var19, (short)var21, var27, var26);
      class_897 var46 = s8.H((short)var14, (short)var15, var16).method_1561().method_3953((class_1297)var3);
      Intrinsics.checkNotNull(var46, true.e<invokedynamic>(23691, 7144262531294188535L ^ var6));
      class_583 var47 = ((class_1007)var46).method_4038();
      Intrinsics.checkNotNullExpressionValue(var47, true.e<invokedynamic>(21568, 7725847505352743691L ^ var6));
      class_591 var29 = (class_591)var47;
      class_10017 var48 = s8.H((short)var14, (short)var15, var16).method_1561().method_3953((class_1297)var3).method_62425((class_1297)var3, this.s(var10));
      Intrinsics.checkNotNull(var48, true.e<invokedynamic>(18870, 4330765132639258350L ^ var6));
      class_10055 var30 = (class_10055)var48;
      var1.method_22903();
      double var49 = var2.field_1352;
      class_4184 var43 = s8.H((short)var14, (short)var15, var16).method_1561().field_4686;
      Intrinsics.checkNotNull(var43);
      double var31 = var49 - var43.method_71156().method_10216();
      var49 = var2.field_1351;
      var43 = s8.H((short)var14, (short)var15, var16).method_1561().field_4686;
      Intrinsics.checkNotNull(var43);
      double var33 = var49 - var43.method_71156().method_10214();
      var49 = var2.field_1350;
      var43 = s8.H((short)var14, (short)var15, var16).method_1561().field_4686;
      Intrinsics.checkNotNull(var43);
      double var35 = var49 - var43.method_71156().method_10215();

      RenderPipeline var45;
      ib var50;
      label41: {
         try {
            var1.method_46416((float)var31, (float)var33, (float)var35);
            var1.method_22905(var30.field_53453, var30.field_53453, var30.field_53453);
            lw.l.f(var30, var1, var30.field_53446, var8);
            var1.method_22905(-1.0F, -1.0F, 1.0F);
            var1.method_22905(0.9375F, 0.9375F, 0.9375F);
            var1.method_46416(0.0F, -1.501F, 0.0F);
            var29.method_62110(var30);
            var29.method_62100(var1, (class_4588)var28, true.g<invokedynamic>(1611, 8197206129168000504L ^ var6), 0, var26.getRGB());
            var50 = var27;
            if (var5) {
               var45 = v2.S.s();
               break label41;
            }
         } catch (NumberFormatException var38) {
            throw var38.A<invokedynamic>(var38, -4116190552069885555L, var6);
         }

         var45 = v2.S.U();
      }

      try {
         ib.j(var50, var45, (class_276)null, var22, (GpuBufferSlice)null, (new class_4587()).method_23760().method_23761(), (Matrix3x2f)null, MapsKt.mapOf(TuplesKt.to(true.e<invokedynamic>(6841, 4766249343057401293L ^ var6), var25)), true.g<invokedynamic>(16738, 8587757834227868375L ^ var6), (Object)null);
         var1.method_22909();
         if (var6 > 0L && var24 != null) {
            (new int[1]).A<invokedynamic>(new int[1], -4150399995565242915L, var6);
         }

      } catch (NumberFormatException var37) {
         throw var37.A<invokedynamic>(var37, -4116190552069885555L, var6);
      }
   }

   public static void R(q1 var0, class_4587 var1, class_243 var2, class_1657 var3, float var4, boolean var5, long var6, int var8, Object var9) {
      var6 ^= a;
      long var10 = var6 ^ 123138104745487L;
      String var12 = -5404389967859984537L.A<invokedynamic>(-5404389967859984537L, var6);

      label21: {
         int var10000;
         label20: {
            try {
               var10000 = var8 & true.g<invokedynamic>(27949, 5766154676098186714L ^ var6);
               if (var12 != null) {
                  break label20;
               }

               if (var10000 == 0) {
                  break label21;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, -5354961162436001086L, var6);
            }

            var10000 = 0;
         }

         var5 = var10000;
      }

      var0.m(var1, var2, var3, var4, (boolean)var5, var10);
   }

   @NotNull
   public final class_238 N(@NotNull class_1297 $this$interpolatedBox, long a) {
      var2 ^= a;
      long var4 = var2 ^ 18554430797074L;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(29933, 6041942392131902693L ^ var2));
      return this.x(var1, var4);
   }

   @NotNull
   public final class_243 D(long a, @NotNull class_1657 entity, float factor) {
      var1 ^= a;
      long var10001 = var1 ^ 51990998226532L;
      int var5 = (int)((var1 ^ 51990998226532L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(4215, 5417071759362309319L ^ var1));
      class_4184 var10000 = s8.H((short)var5, (short)var6, var7).method_1561().field_4686;
      Intrinsics.checkNotNull(var10000);
      class_243 var15 = var10000.method_71156();
      Intrinsics.checkNotNullExpressionValue(var15, true.e<invokedynamic>(6917, 6762569317216434109L ^ var1));
      class_243 var8 = var15;
      double var9 = var3.field_6014 + (var3.method_23317() - var3.field_6014) * (double)var4 - var8.field_1352;
      double var11 = var3.field_6036 + (var3.method_23318() - var3.field_6036) * (double)var4 - var8.field_1351;
      double var13 = var3.field_5969 + (var3.method_23321() - var3.field_5969) * (double)var4 - var8.field_1350;
      return new class_243(var9, var11, var13);
   }

   public static class_243 r(int var0, q1 var1, class_1657 var2, float var3, char var4, int var5, int var6, Object var7) {
      long var8 = ((long)var0 << 32 | (long)var4 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ a;
      long var10 = var8 ^ 15264519600457L;
      long var12 = var8 ^ 111827230418273L;
      if ((var5 & 2) != 0) {
         var3 = var1.s(var10);
      }

      return var1.D(var12, var2, var3);
   }

   static {
      long var20 = a ^ 19268760142935L;
      d = new HashMap(13);
      false.A<invokedynamic>(false, 2944997703661569010L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[47];
      int var16 = 0;
      String var15 = "\bVk\u0013¦¯\u008fop\u009dÞ³m·ðº\u0010/\u001e\"}³\fÑ\u0094¬A÷øY\u0015i/\u0010\u0097\u0004À\u0090B\u0088\u0016ùþ[UóÀyÃÄ\u0010 iùã:=\u001cÎH\u0016\u0014\u0011;T\u0096L\u0010\tNíÃN¤\u001dh³\u0083³\u0013\u0083H\u009cé\u0010ÿ!.\u008cù\u009a\u0017W×C\u0091yA¥Hs\u0010Ï½;W³ÐÎ+²\u0088\u0015&\u008a\u0000Z^ \"¹(?ºQ|d\u0017\u008c7W\u009c®\u0089ÄÆB~íë0>\u0013Øè»Ë¥Ä2Q(^\u0004\u0017!Ô\u0010Æø\\O,%kÍ\u0096UbBÙÓ]\u0005õ\u0016\u0096DkÏì£¿\u009fÃ\u000bm3EÜQJ\u0010\u009fþ²\u0091*0Ñîô¥\f\nÛ\u0012|±(¬[\u0015³HJ »\b®¬^þÚ{°Ub\u001d\u0095Û\u001eôÈbêª\u0010>\u007f\u008d-³h¯Dõ\u0086\u00980 <JªÌ\u0080`u\u0088ú\u0011\u0091½\u0091}T ¢Ñã\u008cÄ+é¦Ä¶\u008fx\u0010ùx$\u0010\"K\u0098ôk(³M#§»_®\u0016W\u001e¨<\u009d\u008fm\u00ad\u0086¼\u0015<g\u00adí\u0081\u0001\u0084\u0016\u000e\u009a|óÐ\u001fh¹¶ÇÂ\u0010z3ïöY×Ö«½Q\u0012n\u000e\u000bÎ*jCtÌ\u0000ÿ¸ ~:\u0019Ó&Ñì\f\bL%ìæm\u009dÇ%«\u0016\b.P\u0082c(ñw\u00948\"\u0004Né«bú ·¯Rx\u0087¥ç-».à\u000bm|ê\u0010\u0001=Y±\u009bÊ\u001e#ÙA\u0016°¡/aËM.qgïÏô?Q1¾5tRy+´B38h¨Ñ¦.Ùîpþ\r]õi\u0087½í\u00ad5\u0015 ÙùïºfõU\u00107\u0082\u0085õñÎ9\u007f\u0081\u001e\u0004ÓT\u0011>;\u0010å«\u001e\u001b\u0098Y\u009dÆ\u000bnã\u0003\u0092IÏA\u0010Â/!ÐÛXUY|ÇÄÖMS\u0086_\u0010õ\u009cDe\u007f¼)\u0005dë\u0006bác»Ô\u0010G\u000eW%hc\u0080\u0087\u0003\u001f\u0099·Å\u000b\t÷\u00108;ÍtÜö\u0006uþ\b\u0088ñ\u0083}_\u0012(?Hª\u0012_!ù/Ø¼\u0007'OHøÐãÔ\u009f\u009ad¶¦\u000ed×\u00198ú\u0018\u008c\u0081{\r{÷¿'²\u0010\u0018í\u0095\u0003\u001cdY\fÊéYÌ¹ë\bº ø\u0086\u0002½C\t\u008eË\u0010Bä¸ø\u0093ëÝH\u0002k`í)¦3& \u0016%»\u0095â\u0001\u001d-\u0084e\u0014b±ö\u0095¼\t·\"ø¹B\u001b¡\u0017K\u009a;Ù\u001d*y(¼Ï\u008cEn\u0018e\u001d\u008f\u009f¦HÜÖª(dúú(äª¸l¡À/HÕ[VÎ¨\fãC\u0093¾7ö\u0010ÔÏTä@\u0005:Æ\u0096Òhô\u0016NL% ~\u001bß7\u0093,'k\u0016'V\u008c·ÛÃÊÁ+:Äþ.ëêí\u0004§\u0014«\u008c\u009cs\u0010Cë9\u008bxÝ\u001c\u0089ÿÊþÛ\u0094+m\u001a\u0018Fx©\u008a1íOM¦ÍÓÔª_\u0095À\t½Äè°ÀÕx\u0010\u0004X q<´Ã\u00ad\u008fCuñ\u0090KL¶ óæ\u0002W@\u0080Ü¿\u0086ì)b\u00ad4\u008d\u0003Ê\u0098µ,\"ÞM¬\u0088áY\u0092\u0018`\u0003\u008c\u0010\u0017\\ñJ>\u0016§\u0094¡-9¡À\u0013\u000f  '/ÔjJÆT¥,\u008f&å\u0088ë\u0095ÿuÚ\u0001cô6\u001d:ØFr½#ÒLó\u0018¯ðúy\u000e\u009c\u0094\u0005bwRw\u001a|¦Ñ`®\u00adm'Î\u008cÀ\u0018n]}\u0093ñõÝÓ»\u0095¼L6N«\u009e\u001d\u0084à5Éx°G(\u0087:MaI\u0081x»«ø´\u0082;Í\u0005\u0003mïh\u0012ß@H\u009a|\u0096OÓó\b\u007f\u000e÷a\u001e¯O\u009dö%\u0010\u001dW\u0007Ò\u0017\u00ad\u009da\u009c\u009d\u0014 \u0090ïö-(ÚÆ£-$\u009eô~[1A½H2È\u00138ö\u0099\u0018Ôp°ìX\u0000ù6~ª£ð\u008d@ÇÄ&5\bq\u0010×Á\bÏü\u007fL\u0097\u0015Ü\u0090üÊøj\u008a\u0010Xj\\ï)?\t°7y[\u008c/·ùÜ\u0010³Ò\u0099Î\u008aÞ\b*\u0097Òb\u0012ÓÑ\u0081\u0088Đ\u008dp\u000b¡òa\u0013s\\Ä%\b\u001dê$-6)&0ÃÃèä±EÆ¸ª\u0095ïDï@.\t?ùùï$þ·3éÊÎIä+Ó\u0084Ý\u009fñ5SQë'\"\u000e¥¿\u0003þ£¯b\u009cZF\u0087\u009e0dL\u008aKÞF\u009fpÀ-C\u0011û¸ë\u0001\u0088=oì\\\u0017¶[à©\u0092þº\u0086\u009c\nL\u0096µC\u008a?\u0095ðúë)ËÇiíÑÌ\u0012W\u0089eGá5\u0082\u009d=\u0000@í\u008e£ñ)ø`\u0010ÄhÚÅõÜµè\u000f\u008cÔx\u0094êPèª\u0082\u0080\u009aõp¡A±ãýô\u008cëa¡Í¨ `K_l\u0084%UõgõWÄ¼ï²(_vRéÃ\u0098\u0099É¾\u0089\u009dÎ_k\u0017UÔlÞºÁ\u0083¡_M7í½Ç<\u0093·p \u0090·>\u0005\u0007N½2íoÜÒHö\u008e\r\u0081¨\u009fc\u009e©¬ù\u0086¶SÝBì\u00adå3\u0091ø\u008b.\u0081jµ\b\u00adé\u0010;\u0006°D/¼\u001d!] :]½Z\u0015R0\u008f.ß,÷±á-\\0ôÃ\u008fOÍ\u00ad\u00ad\u0097Tûn\u0000\u0013?\u0099ç\u0014d-Ê¬\u008eé,\u0098l\u0094·úÂ\u000f1.À\u0015¤r\\\u00104\u0087ÍË\u0004÷u)ÉdÛ\u0002Öo+¿";
      int var17 = "\bVk\u0013¦¯\u008fop\u009dÞ³m·ðº\u0010/\u001e\"}³\fÑ\u0094¬A÷øY\u0015i/\u0010\u0097\u0004À\u0090B\u0088\u0016ùþ[UóÀyÃÄ\u0010 iùã:=\u001cÎH\u0016\u0014\u0011;T\u0096L\u0010\tNíÃN¤\u001dh³\u0083³\u0013\u0083H\u009cé\u0010ÿ!.\u008cù\u009a\u0017W×C\u0091yA¥Hs\u0010Ï½;W³ÐÎ+²\u0088\u0015&\u008a\u0000Z^ \"¹(?ºQ|d\u0017\u008c7W\u009c®\u0089ÄÆB~íë0>\u0013Øè»Ë¥Ä2Q(^\u0004\u0017!Ô\u0010Æø\\O,%kÍ\u0096UbBÙÓ]\u0005õ\u0016\u0096DkÏì£¿\u009fÃ\u000bm3EÜQJ\u0010\u009fþ²\u0091*0Ñîô¥\f\nÛ\u0012|±(¬[\u0015³HJ »\b®¬^þÚ{°Ub\u001d\u0095Û\u001eôÈbêª\u0010>\u007f\u008d-³h¯Dõ\u0086\u00980 <JªÌ\u0080`u\u0088ú\u0011\u0091½\u0091}T ¢Ñã\u008cÄ+é¦Ä¶\u008fx\u0010ùx$\u0010\"K\u0098ôk(³M#§»_®\u0016W\u001e¨<\u009d\u008fm\u00ad\u0086¼\u0015<g\u00adí\u0081\u0001\u0084\u0016\u000e\u009a|óÐ\u001fh¹¶ÇÂ\u0010z3ïöY×Ö«½Q\u0012n\u000e\u000bÎ*jCtÌ\u0000ÿ¸ ~:\u0019Ó&Ñì\f\bL%ìæm\u009dÇ%«\u0016\b.P\u0082c(ñw\u00948\"\u0004Né«bú ·¯Rx\u0087¥ç-».à\u000bm|ê\u0010\u0001=Y±\u009bÊ\u001e#ÙA\u0016°¡/aËM.qgïÏô?Q1¾5tRy+´B38h¨Ñ¦.Ùîpþ\r]õi\u0087½í\u00ad5\u0015 ÙùïºfõU\u00107\u0082\u0085õñÎ9\u007f\u0081\u001e\u0004ÓT\u0011>;\u0010å«\u001e\u001b\u0098Y\u009dÆ\u000bnã\u0003\u0092IÏA\u0010Â/!ÐÛXUY|ÇÄÖMS\u0086_\u0010õ\u009cDe\u007f¼)\u0005dë\u0006bác»Ô\u0010G\u000eW%hc\u0080\u0087\u0003\u001f\u0099·Å\u000b\t÷\u00108;ÍtÜö\u0006uþ\b\u0088ñ\u0083}_\u0012(?Hª\u0012_!ù/Ø¼\u0007'OHøÐãÔ\u009f\u009ad¶¦\u000ed×\u00198ú\u0018\u008c\u0081{\r{÷¿'²\u0010\u0018í\u0095\u0003\u001cdY\fÊéYÌ¹ë\bº ø\u0086\u0002½C\t\u008eË\u0010Bä¸ø\u0093ëÝH\u0002k`í)¦3& \u0016%»\u0095â\u0001\u001d-\u0084e\u0014b±ö\u0095¼\t·\"ø¹B\u001b¡\u0017K\u009a;Ù\u001d*y(¼Ï\u008cEn\u0018e\u001d\u008f\u009f¦HÜÖª(dúú(äª¸l¡À/HÕ[VÎ¨\fãC\u0093¾7ö\u0010ÔÏTä@\u0005:Æ\u0096Òhô\u0016NL% ~\u001bß7\u0093,'k\u0016'V\u008c·ÛÃÊÁ+:Äþ.ëêí\u0004§\u0014«\u008c\u009cs\u0010Cë9\u008bxÝ\u001c\u0089ÿÊþÛ\u0094+m\u001a\u0018Fx©\u008a1íOM¦ÍÓÔª_\u0095À\t½Äè°ÀÕx\u0010\u0004X q<´Ã\u00ad\u008fCuñ\u0090KL¶ óæ\u0002W@\u0080Ü¿\u0086ì)b\u00ad4\u008d\u0003Ê\u0098µ,\"ÞM¬\u0088áY\u0092\u0018`\u0003\u008c\u0010\u0017\\ñJ>\u0016§\u0094¡-9¡À\u0013\u000f  '/ÔjJÆT¥,\u008f&å\u0088ë\u0095ÿuÚ\u0001cô6\u001d:ØFr½#ÒLó\u0018¯ðúy\u000e\u009c\u0094\u0005bwRw\u001a|¦Ñ`®\u00adm'Î\u008cÀ\u0018n]}\u0093ñõÝÓ»\u0095¼L6N«\u009e\u001d\u0084à5Éx°G(\u0087:MaI\u0081x»«ø´\u0082;Í\u0005\u0003mïh\u0012ß@H\u009a|\u0096OÓó\b\u007f\u000e÷a\u001e¯O\u009dö%\u0010\u001dW\u0007Ò\u0017\u00ad\u009da\u009c\u009d\u0014 \u0090ïö-(ÚÆ£-$\u009eô~[1A½H2È\u00138ö\u0099\u0018Ôp°ìX\u0000ù6~ª£ð\u008d@ÇÄ&5\bq\u0010×Á\bÏü\u007fL\u0097\u0015Ü\u0090üÊøj\u008a\u0010Xj\\ï)?\t°7y[\u008c/·ùÜ\u0010³Ò\u0099Î\u008aÞ\b*\u0097Òb\u0012ÓÑ\u0081\u0088Đ\u008dp\u000b¡òa\u0013s\\Ä%\b\u001dê$-6)&0ÃÃèä±EÆ¸ª\u0095ïDï@.\t?ùùï$þ·3éÊÎIä+Ó\u0084Ý\u009fñ5SQë'\"\u000e¥¿\u0003þ£¯b\u009cZF\u0087\u009e0dL\u008aKÞF\u009fpÀ-C\u0011û¸ë\u0001\u0088=oì\\\u0017¶[à©\u0092þº\u0086\u009c\nL\u0096µC\u008a?\u0095ðúë)ËÇiíÑÌ\u0012W\u0089eGá5\u0082\u009d=\u0000@í\u008e£ñ)ø`\u0010ÄhÚÅõÜµè\u000f\u008cÔx\u0094êPèª\u0082\u0080\u009aõp¡A±ãýô\u008cëa¡Í¨ `K_l\u0084%UõgõWÄ¼ï²(_vRéÃ\u0098\u0099É¾\u0089\u009dÎ_k\u0017UÔlÞºÁ\u0083¡_M7í½Ç<\u0093·p \u0090·>\u0005\u0007N½2íoÜÒHö\u008e\r\u0081¨\u009fc\u009e©¬ù\u0086¶SÝBì\u00adå3\u0091ø\u008b.\u0081jµ\b\u00adé\u0010;\u0006°D/¼\u001d!] :]½Z\u0015R0\u008f.ß,÷±á-\\0ôÃ\u008fOÍ\u00ad\u00ad\u0097Tûn\u0000\u0013?\u0099ç\u0014d-Ê¬\u008eé,\u0098l\u0094·úÂ\u000f1.À\u0015¤r\\\u00104\u0087ÍË\u0004÷u)ÉdÛ\u0002Öo+¿".length();
      char var14 = 16;
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
                  c = new String[47];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[21];
                  int var3 = 0;
                  String var4 = "\u0089îÀÔY\u008d×·ô¼QÀ]]F|K;×\u0016øøâ\u0019\u008dH\u007fÚÌ3\u000bqã\u009fÕ\f\u009c\u0088\u0012äÓ%\u0004\u009c\u008b\u0097yKm\u0001H6\u007f\u0011Á}²,J\fS`crúM¬\u0097ï÷¥\f\u0098K#:îòïD¡ß*âeoÆT³nðµT\bQq\u0014ó\u000b\u001c\u008br*£j«9½ïÃD¸¬õ\u0095Q\u0006öý¬c+¬\u009a\\\t\n5Å\bÉ\u001fÁ0?\u008a,Í\u0090âvB-_\u001bø\u009c\u0012:Ûû\u0017";
                  int var5 = "\u0089îÀÔY\u008d×·ô¼QÀ]]F|K;×\u0016øøâ\u0019\u008dH\u007fÚÌ3\u000bqã\u009fÕ\f\u009c\u0088\u0012äÓ%\u0004\u009c\u008b\u0097yKm\u0001H6\u007f\u0011Á}²,J\fS`crúM¬\u0097ï÷¥\f\u0098K#:îòïD¡ß*âeoÆT³nðµT\bQq\u0014ó\u000b\u001c\u008br*£j«9½ïÃD¸¬õ\u0095Q\u0006öý¬c+¬\u009a\\\t\n5Å\bÉ\u001fÁ0?\u008a,Í\u0090âvB-_\u001bø\u009c\u0012:Ûû\u0017".length();
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
                              f = new Integer[21];
                              A = new q1();
                              z = new Matrix4f();
                              M = new class_4604(new Matrix4f(), new Matrix4f());
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0014\u0013l'S\u0015\u001eÊÊ9\u0001µÛ\u0011ô~";
                           var5 = "\u0014\u0013l'S\u0015\u001eÊÊ9\u0001µÛ\u0011ô~".length();
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

               var15 = "FåYÆEÄ?wòWn\ttWï<\u00109\u0086TÕZ\"(Z$ì\u0091#½\u0011^ ";
               var17 = "FåYÆEÄ?wòWn\ttWï<\u00109\u0086TÕZ\"(Z$ì\u0091#½\u0011^ ".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void s(boolean var0) {
      X = var0;
   }

   public static boolean v() {
      return X;
   }

   public static boolean P() {
      boolean var0 = v();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18463;
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
            throw new RuntimeException("su/catlean/q1", var10);
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
         throw new RuntimeException("su/catlean/q1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25854;
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
            throw new RuntimeException("su/catlean/q1", var14);
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
         throw new RuntimeException("su/catlean/q1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
