package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_1011.class_1012;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4d;
import org.lwjgl.system.MemoryUtil;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.render.FlipFrameEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.RenderScreenEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.NativeImageAccessor;

public final class gk {
   @NotNull
   public static final gk E;
   @NotNull
   private static final CopyOnWriteArrayList x;
   private static boolean t;
   @NotNull
   private static final Matrix4f i;
   @NotNull
   private static final Matrix4f q;
   @NotNull
   private static int[] e;
   private static int Y;
   private static float h;
   private static String w;
   private static final long a = j0.a(4893023795200179134L, 8197502459434758080L, MethodHandles.lookup().lookupClass()).a(126201755858227L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map j;

   private gk() {
   }

   public final boolean e() {
      return t;
   }

   public final void V(boolean <set-?>) {
      t = var1;
   }

   @NotNull
   public final Matrix4f n() {
      return i;
   }

   @NotNull
   public final Matrix4f a() {
      return q;
   }

   @NotNull
   public final int[] c() {
      return e;
   }

   public final void t(char a, int a, @NotNull int[] <set-?>, short a) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(8351, 7499856144869596384L ^ var5));
      e = var3;
   }

   public final float p() {
      return h;
   }

   public final void m(float <set-?>) {
      h = var1;
   }

   @Flow
   private final void G(TickEvent var1) {
      long var2 = a ^ 35392208050770L;
      long var10001 = var2 ^ 111518341895404L;
      int var4 = (int)((var2 ^ 111518341895404L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 96650431058187L;
      String var10000 = -1815001081608927913L.A<invokedynamic>(-1815001081608927913L, var2);
      int var10 = s8.H((short)var4, (short)var5, var6).method_22683().method_4495();
      String var9 = var10000;
      if (var10 != Y) {
         Iterable var11 = (Iterable)g3.o();
         boolean var12 = false;
         Iterator var13 = var11.iterator();

         while(var13.hasNext()) {
            Object var14 = var13.next();
            fc var15 = (fc)var14;
            boolean var16 = false;

            try {
               var15.close();
               var15.i(var7);
               if (var9 != null || var9 != null) {
                  break;
               }
            } catch (IllegalArgumentException var17) {
               throw var17.A<invokedynamic>(var17, -1778528499656159413L, var2);
            }
         }

         Y = var10;
      }

   }

   @Flow(
      priority = 20
   )
   private final void N(Render2DEvent var1) {
      long var2 = a ^ 18854563820552L;
      long var4 = var2 ^ 95333555854019L;
      xj.Y.A(var4);
      String var10000 = -3993035680377132275L.A<invokedynamic>(-3993035680377132275L, var2);
      Iterable var7 = (Iterable)x;
      String var6 = var10000;
      boolean var8 = false;
      Iterator var9 = var7.iterator();

      while(true) {
         if (var9.hasNext()) {
            Object var10 = var9.next();
            Function0 var11 = (Function0)var10;
            boolean var12 = false;

            try {
               var11.invoke();
               if (var6 != null) {
                  break;
               }

               if (var6 == null) {
                  continue;
               }
            } catch (IllegalArgumentException var13) {
               throw var13.A<invokedynamic>(var13, -3959978172941917935L, var2);
            }
         }

         x.clear();
         break;
      }

   }

   @Flow(
      priority = -20
   )
   private final void r(RenderScreenEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void m(RenderScreenEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void m(FlipFrameEvent var1) {
      xn.e.b().method_71100();
      bo.t.C().method_71100();
      bb.K.G().method_71100();
      bq.t.Q().method_71100();
      ri.w.K().method_71100();
      qj.X.v().method_71100();
      _p.i.V().method_71100();
      mb.S.K().method_71100();
      p9.P.O().method_71100();
   }

   public final void O(long a, @NotNull ib polygon, float x, float y, float w, float h, @NotNull Color[] colors) {
      // $FF: Couldn't be decompiled
   }

   public final void r(@NotNull Matrix3x2fStack matrices, short a, float x, float y, int a, float w, int a, float h, @NotNull Color[] colors) {
      // $FF: Couldn't be decompiled
   }

   public final void s(@Nullable Matrix3x2fStack matrices, float x, float y, long a, float width, float height, @NotNull Color c) {
      var4 ^= a;
      long var9 = var4 ^ 51068145735907L;
      long var11 = var4 ^ 49232812218142L;
      long var13 = var4 ^ 91986610773292L;
      long var15 = var4 ^ 76577539784509L;
      Intrinsics.checkNotNullParameter(var8, "c");
      VertexFormat var10000 = class_290.field_1576;
      Intrinsics.checkNotNullExpressionValue(var10000, true.v<invokedynamic>(10021, 6805422486372398704L ^ var4));
      VertexFormat var17 = var10000;
      ib.j(ib.P(ib.P(ib.P(ib.P(ib.P(ib.P(ib.P(ib.P(new ib(var13, var17, 4, true), var2, var3, 0.0F, var11, 4, (Object)null).N(var8, var9), var2, var3 + var7, 0.0F, var11, 4, (Object)null).N(var8, var9), var2, var3 + var7, 0.0F, var11, 4, (Object)null).N(var8, var9), var2 + var6, var3 + var7, 0.0F, var11, 4, (Object)null).N(var8, var9), var2 + var6, var3 + var7, 0.0F, var11, 4, (Object)null).N(var8, var9), var2 + var6, var3, 0.0F, var11, 4, (Object)null).N(var8, var9), var2 + var6, var3, 0.0F, var11, 4, (Object)null).N(var8, var9), var2, var3, 0.0F, var11, 4, (Object)null).N(var8, var9), v2.S.d(), (class_276)null, var15, (GpuBufferSlice)null, (Matrix4f)null, new Matrix3x2f((Matrix3x2fc)var1), (Map)null, true.u<invokedynamic>(13242, 7656122955817797671L ^ var4), (Object)null);
   }

   public final void h(@NotNull class_332 context, long a, @NotNull kn r1) {
      var2 ^= a;
      long var5 = var2 ^ 92435914474426L;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(21731, 1438961560502800845L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.v<invokedynamic>(23802, 8472766657734220254L ^ var2));
      Vector2f var7 = new Vector2f();
      Vector2f var8 = new Vector2f();
      var1.method_51448().transformPosition(var4.J(), var4.V(), var7);
      var1.method_51448().transformPosition(var4.x(), var4.o(), var8);
      var1.method_44379((int)var7.x, (int)var7.y, (int)var8.x, (int)var8.y);
      hi.Y.V(new kn(var7.x, var7.y, var8.x, var8.y), var5);
   }

   public final void a(long a, @NotNull class_332 context) {
      var1 ^= a;
      long var4 = var1 ^ 108292923237479L;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(24412, 8058425192116153992L ^ var1));
      var3.method_44380();
      hi.Y.N(var4);
   }

   private final void l(long var1, ib var3, float var4, float var5, float var6, float var7, Color var8) {
      var1 ^= a;
      long var9 = var1 ^ 114892410922500L;
      long var11 = var1 ^ 30541735201055L;
      var3.s(var4, var9, var5, 0.0F).N(var8, var11);
      var3.s(var4, var9, var7, 0.0F).N(var8, var11);
      var3.s(var6, var9, var7, 0.0F).N(var8, var11);
      var3.s(var6, var9, var5, 0.0F).N(var8, var11);
   }

   public final void f(@NotNull Matrix3x2f matrices, @NotNull class_2960 id, float x, float y, float width, float height, @NotNull Color color1, @NotNull Color color2, @NotNull Color color3, long a, @NotNull Color color4, float uStart, float vStart, float uEnd, float vEnd, boolean altBlend) {
      var10 ^= a;
      long var18 = var10 ^ 64672562145191L;
      long var20 = var10 ^ 49766036919135L;
      long var10001 = var10 ^ 57912957236111L;
      int var22 = (int)((var10 ^ 57912957236111L) >>> 48);
      int var23 = (int)(var10001 << 16 >>> 48);
      int var24 = (int)(var10001 << 32 >>> 32);
      long var25 = var10 ^ 62006777407578L;
      var10001 = var10 ^ 7827152642562L;
      int var27 = (int)((var10 ^ 7827152642562L) >>> 32);
      int var28 = (int)(var10001 << 32 >>> 48);
      int var29 = (int)(var10001 << 48 >>> 48);
      long var30 = var10 ^ 89087867748473L;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(2184, 8263976377893643946L ^ var10));
      Intrinsics.checkNotNullParameter(var2, true.v<invokedynamic>(20824, 4531274602111450956L ^ var10));
      Intrinsics.checkNotNullParameter(var7, true.v<invokedynamic>(20206, 5474676408802320619L ^ var10));
      Intrinsics.checkNotNullParameter(var8, true.v<invokedynamic>(13818, 5513478448642841569L ^ var10));
      Intrinsics.checkNotNullParameter(var9, true.v<invokedynamic>(16195, 2285269648093303150L ^ var10));
      Intrinsics.checkNotNullParameter(var12, true.v<invokedynamic>(15257, 2290447982726108600L ^ var10));
      GpuTextureView var10000 = s8.H((short)var22, (short)var23, var24).method_1531().method_4619(var2).method_71659();
      Intrinsics.checkNotNullExpressionValue(var10000, true.v<invokedynamic>(13250, 5316056058764221911L ^ var10));
      GpuTextureView var32 = var10000;
      VertexFormat var10002 = class_290.field_1575;
      Intrinsics.checkNotNullExpressionValue(var10002, true.v<invokedynamic>(24312, 131102057555898622L ^ var10));
      ib var33 = new ib(var10002, 0, false, true.u<invokedynamic>(4033, 2164161024184584968L ^ var10), var20, (DefaultConstructorMarker)null);

      ib var35;
      RenderPipeline var36;
      label17: {
         try {
            ib.P(var33, var3 + (float)0, var4 + var6, 0.0F, var25, 4, (Object)null).k(var27, var13, var16, (short)var28, (char)var29).N(var7, var18);
            ib.P(var33, var3 + var5, var4 + var6, 0.0F, var25, 4, (Object)null).k(var27, var15, var16, (short)var28, (char)var29).N(var8, var18);
            ib.P(var33, var3 + var5, var4 + (float)0, 0.0F, var25, 4, (Object)null).k(var27, var15, var14, (short)var28, (char)var29).N(var9, var18);
            ib.P(var33, var3 + (float)0, var4 + (float)0, 0.0F, var25, 4, (Object)null).k(var27, var13, var14, (short)var28, (char)var29).N(var12, var18);
            var35 = var33;
            if (var17) {
               var36 = v2.S.t();
               break label17;
            }
         } catch (IllegalArgumentException var34) {
            throw var34.A<invokedynamic>(var34, 14130956207122472L, var10);
         }

         var36 = v2.S.W();
      }

      class_276 var37 = s8.H((short)var22, (short)var23, var24).method_1522();
      Intrinsics.checkNotNullExpressionValue(var37, true.v<invokedynamic>(10023, 6806972507901643046L ^ var10));
      ib.j(var35, var36, var37, var30, (GpuBufferSlice)null, (Matrix4f)null, var1, MapsKt.mapOf(TuplesKt.to(true.v<invokedynamic>(13795, 4242812516331215852L ^ var10), var32)), true.u<invokedynamic>(32432, 8958286212696930918L ^ var10), (Object)null);
   }

   public static void M(gk param0, Matrix3x2f param1, class_2960 param2, float param3, float param4, float param5, float param6, Color param7, Color param8, Color param9, Color param10, float param11, float param12, float param13, long param14, float param16, boolean param17, int param18, Object param19) {
      // $FF: Couldn't be decompiled
   }

   public final void O(@NotNull ib polygon, float x, float y, float width, float height, @NotNull Color color1, @NotNull Color color2, @NotNull Color color3, @NotNull Color color4, int a, float uStart, float vStart, int a, float uEnd, char a, float vEnd) {
      long var17 = ((long)var10 << 32 | (long)var13 << 48 >>> 32 | (long)var15 << 48 >>> 48) ^ a;
      long var19 = var17 ^ 119007988921175L;
      long var21 = var17 ^ 121532105931946L;
      long var10001 = var17 ^ 90104443401970L;
      int var23 = (int)((var17 ^ 90104443401970L) >>> 32);
      int var24 = (int)(var10001 << 32 >>> 48);
      int var25 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(6302, 8736393074309472839L ^ var17));
      Intrinsics.checkNotNullParameter(var6, true.v<invokedynamic>(25928, 177937399263190939L ^ var17));
      Intrinsics.checkNotNullParameter(var7, true.v<invokedynamic>(26483, 7584970867426876813L ^ var17));
      Intrinsics.checkNotNullParameter(var8, true.v<invokedynamic>(31515, 8847569972453261820L ^ var17));
      Intrinsics.checkNotNullParameter(var9, true.v<invokedynamic>(18614, 1003253640719102573L ^ var17));
      ib.P(var1, var2 + (float)0, var3 + var5, 0.0F, var21, 4, (Object)null).k(var23, var11, var16, (short)var24, (char)var25).N(var6, var19);
      ib.P(var1, var2 + var4, var3 + var5, 0.0F, var21, 4, (Object)null).k(var23, var14, var16, (short)var24, (char)var25).N(var7, var19);
      ib.P(var1, var2 + var4, var3 + (float)0, 0.0F, var21, 4, (Object)null).k(var23, var14, var12, (short)var24, (char)var25).N(var8, var19);
      ib.P(var1, var2 + (float)0, var3 + (float)0, 0.0F, var21, 4, (Object)null).k(var23, var11, var12, (short)var24, (char)var25).N(var9, var19);
   }

   public static void w(gk param0, ib param1, float param2, float param3, float param4, float param5, Color param6, Color param7, Color param8, Color param9, long param10, float param12, float param13, float param14, float param15, int param16, Object param17) {
      // $FF: Couldn't be decompiled
   }

   public final void S(@NotNull Matrix4f matrices, @NotNull class_2960 id, float x, float y, float width, float height, @NotNull Color color1, @NotNull Color color2, long a, @NotNull Color color3, @NotNull Color color4, boolean altBlend, float uStart, float vStart, float uEnd, float vEnd) {
      var9 ^= a;
      long var18 = var9 ^ 73927255642296L;
      long var20 = var9 ^ 93107511878720L;
      long var10001 = var9 ^ 84965994153104L;
      int var22 = (int)((var9 ^ 84965994153104L) >>> 48);
      int var23 = (int)(var10001 << 16 >>> 48);
      int var24 = (int)(var10001 << 32 >>> 32);
      long var25 = var9 ^ 72053800099653L;
      var10001 = var9 ^ 139582687352093L;
      int var27 = (int)((var9 ^ 139582687352093L) >>> 32);
      int var28 = (int)(var10001 << 32 >>> 48);
      int var29 = (int)(var10001 << 48 >>> 48);
      long var30 = var9 ^ 44990393628518L;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(27231, 2363502128561402717L ^ var9));
      Intrinsics.checkNotNullParameter(var2, true.v<invokedynamic>(6691, 2142765948088566536L ^ var9));
      Intrinsics.checkNotNullParameter(var7, true.v<invokedynamic>(25928, 177898915503193204L ^ var9));
      Intrinsics.checkNotNullParameter(var8, true.v<invokedynamic>(26483, 7584930185275915874L ^ var9));
      Intrinsics.checkNotNullParameter(var11, true.v<invokedynamic>(31515, 8847546881917919763L ^ var9));
      Intrinsics.checkNotNullParameter(var12, true.v<invokedynamic>(18614, 1003294322361471362L ^ var9));
      float var32 = var6 / 2.0F;
      float var33 = var5 / 2.0F;
      GpuTextureView var10000 = s8.H((short)var22, (short)var23, var24).method_1531().method_4619(var2).method_71659();
      Intrinsics.checkNotNullExpressionValue(var10000, true.v<invokedynamic>(32397, 8702950299823581060L ^ var9));
      GpuTextureView var34 = var10000;
      VertexFormat var10002 = class_290.field_1575;
      Intrinsics.checkNotNullExpressionValue(var10002, true.v<invokedynamic>(10293, 5778391040193786126L ^ var9));
      ib var35 = new ib(var10002, 0, false, true.u<invokedynamic>(19197, 1647944955189295420L ^ var9), var20, (DefaultConstructorMarker)null);

      ib var37;
      RenderPipeline var38;
      label17: {
         try {
            ib.P(var35, var3 - var32, var4 + var32, 0.0F, var25, 4, (Object)null).k(var27, var14, var17, (short)var28, (char)var29).N(var7, var18);
            ib.P(var35, var3 + var33, var4 + var32, 0.0F, var25, 4, (Object)null).k(var27, var16, var17, (short)var28, (char)var29).N(var8, var18);
            ib.P(var35, var3 + var33, var4 - var32, 0.0F, var25, 4, (Object)null).k(var27, var16, var15, (short)var28, (char)var29).N(var11, var18);
            ib.P(var35, var3 - var33, var4 - var32, 0.0F, var25, 4, (Object)null).k(var27, var14, var15, (short)var28, (char)var29).N(var12, var18);
            var37 = var35;
            if (var13) {
               var38 = v2.S.t();
               break label17;
            }
         } catch (IllegalArgumentException var36) {
            throw var36.A<invokedynamic>(var36, 3975919717345386295L, var9);
         }

         var38 = v2.S.W();
      }

      class_276 var39 = s8.H((short)var22, (short)var23, var24).method_1522();
      Intrinsics.checkNotNullExpressionValue(var39, true.v<invokedynamic>(18194, 1749313936326893099L ^ var9));
      ib.j(var37, var38, var39, var30, (GpuBufferSlice)null, var1, (Matrix3x2f)(new Matrix3x2fStack()), MapsKt.mapOf(TuplesKt.to(true.v<invokedynamic>(9330, 4307171166812732768L ^ var9), var34)), 4, (Object)null);
   }

   public static void q(gk param0, Matrix4f param1, class_2960 param2, float param3, float param4, float param5, float param6, Color param7, Color param8, Color param9, Color param10, boolean param11, float param12, long param13, float param15, float param16, float param17, int param18, Object param19) {
      // $FF: Couldn't be decompiled
   }

   public final void o(@NotNull Matrix3x2fStack matrices, float x, float y, float x1, long a, float y1, @NotNull Color color, @NotNull Color color2) {
      var5 ^= a;
      long var10 = var5 ^ 81354926546078L;
      long var12 = var5 ^ 103831448545382L;
      long var14 = var5 ^ 82777870979939L;
      long var16 = var5 ^ 37565006527296L;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(27231, 2363495251575357307L ^ var5));
      Intrinsics.checkNotNullParameter(var8, true.v<invokedynamic>(29524, 2694743119518705258L ^ var5));
      Intrinsics.checkNotNullParameter(var9, true.v<invokedynamic>(26483, 7584940353001796164L ^ var5));
      VertexFormat var10002 = class_290.field_1576;
      Intrinsics.checkNotNullExpressionValue(var10002, true.v<invokedynamic>(17978, 527262126632637215L ^ var5));
      ib.j(ib.P(ib.P(new ib(var10002, 0, true, 2, var12, (DefaultConstructorMarker)null), var2, var3, 0.0F, var14, 4, (Object)null).N(var8, var10), var4, var7, 0.0F, var14, 4, (Object)null).N(var9, var10), v2.S.d(), (class_276)null, var16, (GpuBufferSlice)null, (Matrix4f)null, new Matrix3x2f((Matrix3x2fc)var1), (Map)null, true.u<invokedynamic>(23152, 81997924590314901L ^ var5), (Object)null);
   }

   public static void M(int var0, gk var1, int var2, Matrix3x2fStack var3, float var4, byte var5, float var6, float var7, float var8, Color var9, Color var10, int var11, Object var12) {
      long var13 = ((long)var0 << 32 | (long)var2 << 40 >>> 32 | (long)var5 << 56 >>> 56) ^ a;
      long var15 = var13 ^ 70436308542124L;
      if ((var11 & true.u<invokedynamic>(13401, 2732960504228713825L ^ var13)) != 0) {
         var10 = var9;
      }

      var1.o(var3, var4, var6, var7, var15, var8, var9, var10);
   }

   private final int c(int var1, int var2, float var3) {
      return MathKt.roundToInt((float)var1 + (float)(var2 - var1) * var3);
   }

   public final double u(double oldValue, double newValue, float interpolationValue) {
      return var1 + (var3 - var1) * (double)var5;
   }

   public final double s(double oldValue, double newValue, double interpolationValue) {
      return var1 + (var3 - var1) * var5;
   }

   public final float i(float oldValue, float newValue, float interpolationValue) {
      return var1 + (var2 - var1) * var3;
   }

   @NotNull
   public final class_243 P(@NotNull class_243 pos, long a) {
      // $FF: Couldn't be decompiled
   }

   public final void K(@NotNull class_4587 matrices, @NotNull class_1799 stack, long a) {
      // $FF: Couldn't be decompiled
   }

   public final void c(@NotNull class_2960 i, @NotNull BufferedImage bi, long a) {
      var3 ^= a;
      long var10001 = var3 ^ 131962544964267L;
      int var5 = (int)((var3 ^ 131962544964267L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      long var8 = var3 ^ 18889691279539L;
      var10001 = var3 ^ 31422771442651L;
      int var10 = (int)((var3 ^ 31422771442651L) >>> 48);
      int var11 = (int)(var10001 << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);

      try {
         Intrinsics.checkNotNullParameter(var1, "i");
         Intrinsics.checkNotNullParameter(var2, true.v<invokedynamic>(19127, 256435067563873721L ^ var3));
         if (RenderSystem.isOnRenderThread()) {
            s8.H((short)var5, (short)var6, var7).method_1531().method_4616(var1, (class_1044)this.s(var8, var2));
            return;
         }
      } catch (IllegalArgumentException var13) {
         throw var13.A<invokedynamic>(var13, -5686224813796075252L, var3);
      }

      this.q((short)var10, gk::M, (char)var11, var12);
   }

   public final boolean q(short a, @NotNull Function0 function, char a, int a) {
      long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var2, true.v<invokedynamic>(5042, 6347311788611797793L ^ var5));
      return x.add(var2);
   }

   @NotNull
   public final class_1043 s(long a, @NotNull BufferedImage bi) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(27311, 9078448256989755731L ^ var1));
      int var4 = var3.getWidth();
      int var5 = var3.getHeight();
      class_1011 var6 = new class_1011(class_1012.field_4997, var4, var5, false);
      long var7 = ((NativeImageAccessor)var6).getPixels();
      IntBuffer var9 = MemoryUtil.memIntBuffer(var7, var6.method_4307() * var6.method_4323());
      Object var10 = null;
      WritableRaster var11 = var3.getRaster();
      ColorModel var12 = var3.getColorModel();
      int var13 = var11.getNumBands();
      int var14 = var11.getDataBuffer().getDataType();

      Object var10000;
      label63: {
         label62: {
            label61: {
               label60: {
                  label59: {
                     try {
                        switch(var14) {
                        case 0:
                           var10000 = new byte[var13];
                           break label63;
                        case 1:
                           break label61;
                        case 2:
                        default:
                           break label62;
                        case 3:
                           break label60;
                        case 4:
                           break label59;
                        case 5:
                        }
                     } catch (IllegalArgumentException var22) {
                        throw var22.A<invokedynamic>(var22, -161426378882083368L, var1);
                     }

                     var10000 = new double[var13];
                     break label63;
                  }

                  var10000 = new float[var13];
                  break label63;
               }

               var10000 = new int[var13];
               break label63;
            }

            var10000 = new short[var13];
            break label63;
         }

         String var10004 = true.v<invokedynamic>(23683, 3026649033744469859L ^ var1);
         throw new IllegalArgumentException(var10004 + var14);
      }

      var10 = var10000;
      int var15 = 0;

      while(var15 < var5) {
         int var16 = 0;

         while(true) {
            if (var16 < var4) {
               var11.getDataElements(var16, var15, var10);
               int var17 = var12.getAlpha(var10);
               int var18 = var12.getRed(var10);
               int var19 = var12.getGreen(var10);
               int var20 = var12.getBlue(var10);
               int var21 = var17 << true.u<invokedynamic>(4777, 4766050074437315483L ^ var1) | var20 << true.u<invokedynamic>(13192, 5288652439639804603L ^ var1) | var19 << true.u<invokedynamic>(5753, 4775232562238648133L ^ var1) | var18;
               var9.put(var21);
               ++var16;
               if (var1 < 0L) {
                  break;
               }

               if (var1 >= 0L) {
                  continue;
               }
            }

            ++var15;
            break;
         }

         if (var1 <= 0L) {
            break;
         }
      }

      Supplier var23 = gk::y;
      class_1043 var24 = new class_1043(var23, var6);
      var24.method_4524();
      return var24;
   }

   @Nullable
   public final Vector4d x(int a, char a, @NotNull class_1297 ent, float offset, char a) {
      long var6 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      long var8 = var6 ^ 42502558844771L;
      long var10 = var6 ^ 25512603765368L;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(16517, 4730001203668846638L ^ var6));
      return this.F(this.u(var3.field_6014, var3.method_23317(), this.h(var10)), this.u(var3.field_6036, var3.method_23318(), this.h(var10)) + (double)var3.method_18381(var3.method_18376()) + (double)var4, var8, this.u(var3.field_5969, var3.method_23321(), this.h(var10)));
   }

   public static Vector4d e(gk var0, class_1297 var1, long var2, float var4, int var5, Object var6) {
      var2 ^= a;
      long var10001 = var2 ^ 129785601970781L;
      int var7 = (int)((var2 ^ 129785601970781L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      if ((var5 & 2) != 0) {
         var4 = 0.4F;
      }

      return var0.x(var7, (char)var8, var1, var4, (char)var9);
   }

   @Nullable
   public final Vector4d j(int a, short a, short a, @NotNull class_243 pos) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 49560417198702L;
      Intrinsics.checkNotNullParameter(var4, true.v<invokedynamic>(1450, 3162973665896572928L ^ var5));
      return this.F(var4.field_1352, var4.field_1351, var7, var4.field_1350);
   }

   @Nullable
   public final Vector4d F(double x, double y, long a, double z) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final Color e(long a, @NotNull Color $this$withAlpha, float alpha) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(18219, 7163066270816192442L ^ var1));
      return new Color(var3.getRed(), var3.getGreen(), var3.getBlue(), (int)(255.0F * Math.clamp(var4, 0.0F, 1.0F)));
   }

   @NotNull
   public final Color c(long a, @NotNull Color $this$mix, @NotNull Color end, float value) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(18219, 7163113450322803043L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.v<invokedynamic>(25746, 3787863323701353152L ^ var1));
      float var6 = Math.clamp(var5, 0.0F, 1.0F);
      return new Color(this.c(var3.getRed(), var4.getRed(), var6), this.c(var3.getGreen(), var4.getGreen(), var6), this.c(var3.getBlue(), var4.getBlue(), var6), this.c(var3.getAlpha(), var4.getAlpha(), var6));
   }

   public final float H(@NotNull Color $this$glRed, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(18823, 2583803798006835850L ^ var2));
      return (float)var1.getRed() / 255.0F;
   }

   public final float L(long a, @NotNull Color $this$glGreen) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(18219, 7163115471819914884L ^ var1));
      return (float)var3.getGreen() / 255.0F;
   }

   public final float M(long a, @NotNull Color $this$glBlue) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(18219, 7162989142454513302L ^ var1));
      return (float)var3.getBlue() / 255.0F;
   }

   public final float D(long a, @NotNull Color $this$glAlpha) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(18219, 7163115526307402262L ^ var1));
      return (float)var3.getAlpha() / 255.0F;
   }

   public final float h(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 136239935873828L;
      int var3 = (int)((var1 ^ 136239935873828L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return s8.H((short)var3, (short)var4, var5).method_61966().method_60637(true);
   }

   public final float j(long a, float oldValue, float newValue) {
      var1 ^= a;
      long var5 = var1 ^ 117058765073718L;
      return this.i(var3, var4, this.h(var5));
   }

   public final double w(double oldValue, long a, double newValue) {
      var3 ^= a;
      long var7 = var3 ^ 60153610898446L;
      return this.u(var1, var5, this.h(var7));
   }

   @NotNull
   public final class_243[] a(long a, @NotNull class_1297 ent) {
      var1 ^= a;
      long var4 = var1 ^ 19843778301694L;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(27423, 5408022625511311338L ^ var1));
      class_238 var6 = q1.A.N(var3, var4);
      class_243[] var7 = new class_243[true.u<invokedynamic>(4455, 3304964827732744009L ^ var1)];
      var7[0] = new class_243(var6.field_1323, var6.field_1322, var6.field_1321);
      var7[1] = new class_243(var6.field_1323, var6.field_1325, var6.field_1321);
      var7[2] = new class_243(var6.field_1320, var6.field_1322, var6.field_1321);
      var7[3] = new class_243(var6.field_1320, var6.field_1325, var6.field_1321);
      var7[4] = new class_243(var6.field_1323, var6.field_1322, var6.field_1324);
      var7[5] = new class_243(var6.field_1323, var6.field_1325, var6.field_1324);
      var7[true.u<invokedynamic>(19197, 1647934712603266258L ^ var1)] = new class_243(var6.field_1320, var6.field_1322, var6.field_1324);
      var7[true.u<invokedynamic>(16532, 4601436140664768163L ^ var1)] = new class_243(var6.field_1320, var6.field_1325, var6.field_1324);
      return var7;
   }

   public final void y(@NotNull ib polygon, float posX, float posY, float endPosX, float endPosY, long a, @NotNull Color color) {
      var6 ^= a;
      long var9 = var6 ^ 138562460078462L;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(6302, 8736412486335542550L ^ var6));
      Intrinsics.checkNotNullParameter(var8, true.v<invokedynamic>(6696, 4718446766571992970L ^ var6));
      Color var11 = Color.BLACK;
      float var10003 = var2 - 1.0F;
      float var10005 = var2 + 0.5F;
      float var10006 = var5 + 0.5F;
      Intrinsics.checkNotNull(var11);
      this.l(var9, var1, var10003, var3, var10005, var10006, var11);
      this.l(var9, var1, var2 - 1.0F, var3 - 0.5F, var4 + 0.5F, var3 + 1.0F, var11);
      this.l(var9, var1, var4 - 1.0F, var3, var4 + 0.5F, var5 + 0.5F, var11);
      this.l(var9, var1, var2 - 1.0F, var5 - 1.0F, var4 + 0.5F, var5 + 0.5F, var11);
      this.l(var9, var1, var2 - 0.5F, var3, var2, var5, var8);
      this.l(var9, var1, var2, var5 - 0.5F, var4, var5, var8);
      this.l(var9, var1, var2 - 0.5F, var3, var4, var3 + 0.5F, var8);
      this.l(var9, var1, var4 - 0.5F, var3, var4, var5, var8);
   }

   @NotNull
   public final Color y(int speed, int index, float saturation, float brightness, long a) {
      var5 ^= a;
      int var7 = (int)((s8.Z() / (long)var1 + (long)var2) % (long)true.u<invokedynamic>(13400, 6882631990181592092L ^ var5));
      float var8 = (float)var7 / 360.0F;
      Color var9 = new Color(Color.HSBtoRGB(var8, var3, var4));
      return new Color(var9.getRed(), var9.getGreen(), var9.getBlue(), true.u<invokedynamic>(1406, 4980649910218313005L ^ var5));
   }

   @NotNull
   public final Color Y(int speed, long a, int index) {
      // $FF: Couldn't be decompiled
   }

   private final boolean w(long var1) {
      var1 ^= a;
      String var10000 = RenderSystem.getDevice().getVendor();
      Intrinsics.checkNotNullExpressionValue(var10000, true.v<invokedynamic>(28132, 7249180428826712249L ^ var1));
      return StringsKt.contains$default((CharSequence)var10000, (CharSequence)true.v<invokedynamic>(30210, 4362907758783628130L ^ var1), false, 2, (Object)null);
   }

   private static final Unit M(class_2960 var0, BufferedImage var1) {
      long var2 = a ^ 84040755129252L;
      long var10001 = var2 ^ 10117928035610L;
      int var4 = (int)((var2 ^ 10117928035610L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 105661401323266L;
      s8.H((short)var4, (short)var5, var6).method_1531().method_4616(var0, (class_1044)E.s(var7, var1));
      return Unit.INSTANCE;
   }

   private static final String y(BufferedImage var0) {
      long var1 = a ^ 52656619065L;
      int var10000 = var0.hashCode();
      String var10002 = true.v<invokedynamic>(11638, 7660780741080219734L ^ var1);
      return var10002 + var10000;
   }

   static {
      long var20 = a ^ 86887104658184L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, -4120465509378871761L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[51];
      int var16 = 0;
      String var15 = "H¹\u001e¼¥×\u0004\u0004\u0013Ú\u0018HQ|²\u0013\u0010àÞ\u0011\bw\u009epÊ\u0099ÞµÜ\u00076~\u000b\u0010a·ÔMX¤k\u0090\u008dZ%áª\u0019G¤(¶\n:ïõÎ\u0090Ø\u0092®¶\u001f'ïÎ³\u0085¦â\u0083qç-?a,\u0089!\\\u0000c©l\u0002éuJa\u0007¤8=}«ÙÌ^Æ±\bÆ²Ý\u001bû\u0087\u001cT\u009dJð]]0c\u0001\u0080áók¬\u008e®Z\u001euàb\u000eÙ¢ðd\u0014Ùë©h¼oJPÃ\u008a\u008eW\u0014 wm\u000böñµÎrø\u0080\u009aC\u0087ëÊ\u009e·GðËÂ\u008acN\u00adª×\u0088%\\î&\u0010Ó#\u0085\u0014\u001aÜ³\u008d\u007f×« \u0085\u0090¾\u0085\u0010\u0010X\u009b;ç {¹QZ (F\u0013\u0019å üGÔ*x\u008fÄlúãX¡u\u008d{\u0082=\u009d\u0006ÆWs\u0002!Ý«×³Æô³T\u0010Ø¦/\u0080Ã\u007ft¯ó½\u0017i>\u0014ëÌ larès8¨Øµ&ÔÛ·ÄGT¼s¸ÆõWÕÅT¦þê\u00071 `\u0010y}\u000b×ãëô\u0099³éÔn\u008fÙ.\u0018\u0010\u008b\u0000X§>Qdò\u000f_²ù\u0083\u0018G'\u0010\u0083S\u00adX'Reï\u0086\u0081,(F2\u001fÕ #äÇ?pÃ 4ÁÙfj\u0096%3â¡¸Ë¿yhtW¾ùÄt¬8yT\u0010z\u0082\u0003_Õ¨¾¦\u0013n\r\u0010è¡i\t(\u008f4è¬©Ù\u007f^¶øø3Ì¿V¸î\u0096\u008c60¨\u0002¤]\u0018¬gD+ õÚöYQW\u001a9Ý\u0010\u000bÛ¤&\u0018\u009céØndHÇ?\tê¸\u0010\u008fó\u00ad\u008cAP\rµVàDm²\u007få$(@ÐÄç?\u0016ê\u0081ÐÊC\u001b¦èòËBëCc£Fl\u0007)`\u0019\u009cÓ\\\u001f\u009aY^\u0083Áø\fó&\u0018/õ_-´Ê\u0019\u0015¸íÍfw(vu±ôÊ½\u008f\u009b_\b0\u0085Ïñ\u001b¨BJ\u0085L2\u0091å$;\u0081Ó,a\u0096#\u009f´SÅÉ\u001bQÍâ|\u0017ç0ÐË-Ñ\u0093\u00845w{ÞYÿ(M\u000f\u0010\u009fµ¡7÷w]4äçÉ%\u00819Ï\"\u0010\u001a{ñO1Ò\u008d¯%Ä\u008a\u001b\u0087û÷«\u0018\u00931/F{<30ÚÙ\u001c;òèX\b¦\u0097*\u007fêÐïö E\u0091bK\u0090\u008e¸pk®x\u0081\u0002<\u009b\u008b\u00ad\u0087`bH\u0083@L&ë\u0084\u0010\u0019\u009bÂ.\u0010W\u009awv¨Á\u0000î¡\u0097¸b\u0089ãÏ\u000e\u0010ÖýØi\u0095VÒg¢\u008e®\u000f\u0090øm\u008b\u0010V\u0018\u008bi4¾¤»À´\u0004éU½\u0014\u0016\u0010×îY\u0098Ø\u0094Fêæ¢*³laZ\u0012\u0010ã}$V]ðýëU\u0097\tqfþQS\u0010{¾·çÅ2áo2\u0098«\u000fø\u0000\u0017Ú\u0010¶¹µÙXh5d÷\u0096Ùÿ@\u0094\u0086í0\u0090-\u0082wêÍÏ\u00ad?wo\u001e$ñkíÇyçó\u008fJT\u0086\u0015JM\u001d¦êó8\\¬Øûn\u009aão\u009c?\u008a´,u ó\u0010,_ÃýWº\u001bj\u0014óøf\u0094¬R:0'#7:\u009d5\u0006äÖ9\u008au¨ê\u0094\u0016p\u0084\u0006e\u0080üÒHX\t\fjfm{n\u0084ùÀ$\nu\u0095Äòiý¡3\u008c2,\u0010ÀþÔ^-!\u0094l5ñ\u0098qÜâ$¶\u0010±TÒ\u0007\u0007\u0002\u0014\u009dôokN_ÒU\u008b\u0010\u0089CÅ\u0094\u0085d)Bý* R\u0093Ã*à \u001dÚLÍÒÆ\u0085_ÒÿuøjëÙÅ§ý\u0085§\u001arã\rOïàÖ\u008d½gÿ\u0010?\u0082\u0099\u0092\u0088't\u0000\u001ebKE\u0089\u0012\u00adÊ\u0010}fo²D\u009e\u0098;ËazßÕÐ\b\u009a\u0010\u007f!Ê\u009c}W\u0086ÛþÃ'Ô\u0012\u00831½\u0010}\u0088Io\u0084Õ)ø{\u008b\u0005³¨\u0093Û}\u0010+KÍÙ\u00161#XÒ\u0010\u0095nÝ>0\t\u0018~W/-¯w:GlAý\u0015Ó£\u0094-Å\u0091\u00ad\u0084Ë¦¢ÿ\u0010TÈsl\u008eÀ4ñ\nÞ3a\u001asÚp\u0010]\u001c\u0099ùjmÇYÇ\nßõ! Ìú\u0010xMÆN£Þ?|~9&\u0097òù>À";
      int var17 = "H¹\u001e¼¥×\u0004\u0004\u0013Ú\u0018HQ|²\u0013\u0010àÞ\u0011\bw\u009epÊ\u0099ÞµÜ\u00076~\u000b\u0010a·ÔMX¤k\u0090\u008dZ%áª\u0019G¤(¶\n:ïõÎ\u0090Ø\u0092®¶\u001f'ïÎ³\u0085¦â\u0083qç-?a,\u0089!\\\u0000c©l\u0002éuJa\u0007¤8=}«ÙÌ^Æ±\bÆ²Ý\u001bû\u0087\u001cT\u009dJð]]0c\u0001\u0080áók¬\u008e®Z\u001euàb\u000eÙ¢ðd\u0014Ùë©h¼oJPÃ\u008a\u008eW\u0014 wm\u000böñµÎrø\u0080\u009aC\u0087ëÊ\u009e·GðËÂ\u008acN\u00adª×\u0088%\\î&\u0010Ó#\u0085\u0014\u001aÜ³\u008d\u007f×« \u0085\u0090¾\u0085\u0010\u0010X\u009b;ç {¹QZ (F\u0013\u0019å üGÔ*x\u008fÄlúãX¡u\u008d{\u0082=\u009d\u0006ÆWs\u0002!Ý«×³Æô³T\u0010Ø¦/\u0080Ã\u007ft¯ó½\u0017i>\u0014ëÌ larès8¨Øµ&ÔÛ·ÄGT¼s¸ÆõWÕÅT¦þê\u00071 `\u0010y}\u000b×ãëô\u0099³éÔn\u008fÙ.\u0018\u0010\u008b\u0000X§>Qdò\u000f_²ù\u0083\u0018G'\u0010\u0083S\u00adX'Reï\u0086\u0081,(F2\u001fÕ #äÇ?pÃ 4ÁÙfj\u0096%3â¡¸Ë¿yhtW¾ùÄt¬8yT\u0010z\u0082\u0003_Õ¨¾¦\u0013n\r\u0010è¡i\t(\u008f4è¬©Ù\u007f^¶øø3Ì¿V¸î\u0096\u008c60¨\u0002¤]\u0018¬gD+ õÚöYQW\u001a9Ý\u0010\u000bÛ¤&\u0018\u009céØndHÇ?\tê¸\u0010\u008fó\u00ad\u008cAP\rµVàDm²\u007få$(@ÐÄç?\u0016ê\u0081ÐÊC\u001b¦èòËBëCc£Fl\u0007)`\u0019\u009cÓ\\\u001f\u009aY^\u0083Áø\fó&\u0018/õ_-´Ê\u0019\u0015¸íÍfw(vu±ôÊ½\u008f\u009b_\b0\u0085Ïñ\u001b¨BJ\u0085L2\u0091å$;\u0081Ó,a\u0096#\u009f´SÅÉ\u001bQÍâ|\u0017ç0ÐË-Ñ\u0093\u00845w{ÞYÿ(M\u000f\u0010\u009fµ¡7÷w]4äçÉ%\u00819Ï\"\u0010\u001a{ñO1Ò\u008d¯%Ä\u008a\u001b\u0087û÷«\u0018\u00931/F{<30ÚÙ\u001c;òèX\b¦\u0097*\u007fêÐïö E\u0091bK\u0090\u008e¸pk®x\u0081\u0002<\u009b\u008b\u00ad\u0087`bH\u0083@L&ë\u0084\u0010\u0019\u009bÂ.\u0010W\u009awv¨Á\u0000î¡\u0097¸b\u0089ãÏ\u000e\u0010ÖýØi\u0095VÒg¢\u008e®\u000f\u0090øm\u008b\u0010V\u0018\u008bi4¾¤»À´\u0004éU½\u0014\u0016\u0010×îY\u0098Ø\u0094Fêæ¢*³laZ\u0012\u0010ã}$V]ðýëU\u0097\tqfþQS\u0010{¾·çÅ2áo2\u0098«\u000fø\u0000\u0017Ú\u0010¶¹µÙXh5d÷\u0096Ùÿ@\u0094\u0086í0\u0090-\u0082wêÍÏ\u00ad?wo\u001e$ñkíÇyçó\u008fJT\u0086\u0015JM\u001d¦êó8\\¬Øûn\u009aão\u009c?\u008a´,u ó\u0010,_ÃýWº\u001bj\u0014óøf\u0094¬R:0'#7:\u009d5\u0006äÖ9\u008au¨ê\u0094\u0016p\u0084\u0006e\u0080üÒHX\t\fjfm{n\u0084ùÀ$\nu\u0095Äòiý¡3\u008c2,\u0010ÀþÔ^-!\u0094l5ñ\u0098qÜâ$¶\u0010±TÒ\u0007\u0007\u0002\u0014\u009dôokN_ÒU\u008b\u0010\u0089CÅ\u0094\u0085d)Bý* R\u0093Ã*à \u001dÚLÍÒÆ\u0085_ÒÿuøjëÙÅ§ý\u0085§\u001arã\rOïàÖ\u008d½gÿ\u0010?\u0082\u0099\u0092\u0088't\u0000\u001ebKE\u0089\u0012\u00adÊ\u0010}fo²D\u009e\u0098;ËazßÕÐ\b\u009a\u0010\u007f!Ê\u009c}W\u0086ÛþÃ'Ô\u0012\u00831½\u0010}\u0088Io\u0084Õ)ø{\u008b\u0005³¨\u0093Û}\u0010+KÍÙ\u00161#XÒ\u0010\u0095nÝ>0\t\u0018~W/-¯w:GlAý\u0015Ó£\u0094-Å\u0091\u00ad\u0084Ë¦¢ÿ\u0010TÈsl\u008eÀ4ñ\nÞ3a\u001asÚp\u0010]\u001c\u0099ùjmÇYÇ\nßõ! Ìú\u0010xMÆN£Þ?|~9&\u0097òù>À".length();
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
                  c = new String[51];
                  j = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[34];
                  int var3 = 0;
                  String var4 = "²\u0016µ»Ìô\u0011\u0006Ò,)&{\u0081\u008cl®,\u0002z\u0002\u001d{`\u009cÀþÍ]OÞ\u0096ôæ\u008d¯»\u0013©\u009dSã-J¡H7\u0084Ó\u00992Â\u0081\u001cÈ=\u0015µ0\u0006S¡\u001d\u0091Ý¹ËjTã\f[\u001d\u001avgâO\u0014 Ô\u0014ä\f\u000eÇ\u0001\u0099Í´5ò\u009f\u0011y\u008d®÷ö5Lâcô´&g\u0088<Tu3õ.@\u0090\u000bÕm\u009aû\u0004eêX\u000fIX9\u0097JÈKj\u0011ea\rîò*]+ëñ\u001b=O êÎ÷¬bê\u0005\u0095gä\u008c\u0006Æuó\u00adÿ¢\u009b\u0093\u008fUê\rú\u0090\u007fèFiºi\u0010\u0090ù0@e!SC\u0090ð\u0080\u0099\u0099®ÙêZ6sëaÞ\tÓz\u00adW\u008bªe3\u0091Ý2}\u00151vßù\u009d!¤ ¬H\u0015o\u0097ª\u0094?î=³A\u0018èm\u009b÷[\u008f\u009bâöinMQ\u001e¬S¯";
                  int var5 = "²\u0016µ»Ìô\u0011\u0006Ò,)&{\u0081\u008cl®,\u0002z\u0002\u001d{`\u009cÀþÍ]OÞ\u0096ôæ\u008d¯»\u0013©\u009dSã-J¡H7\u0084Ó\u00992Â\u0081\u001cÈ=\u0015µ0\u0006S¡\u001d\u0091Ý¹ËjTã\f[\u001d\u001avgâO\u0014 Ô\u0014ä\f\u000eÇ\u0001\u0099Í´5ò\u009f\u0011y\u008d®÷ö5Lâcô´&g\u0088<Tu3õ.@\u0090\u000bÕm\u009aû\u0004eêX\u000fIX9\u0097JÈKj\u0011ea\rîò*]+ëñ\u001b=O êÎ÷¬bê\u0005\u0095gä\u008c\u0006Æuó\u00adÿ¢\u009b\u0093\u008fUê\rú\u0090\u007fèFiºi\u0010\u0090ù0@e!SC\u0090ð\u0080\u0099\u0099®ÙêZ6sëaÞ\tÓz\u00adW\u008bªe3\u0091Ý2}\u00151vßù\u009d!¤ ¬H\u0015o\u0097ª\u0094?î=³A\u0018èm\u009b÷[\u008f\u009bâöinMQ\u001e¬S¯".length();
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
                              f = var6;
                              g = new Integer[34];
                              E = new gk();
                              x = new CopyOnWriteArrayList();
                              i = new Matrix4f();
                              q = new Matrix4f();
                              e = new int[4];
                              Y = -1;
                              h = 1.0F;
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "`\tè\u008bõóªøGuë)»\u009f\u009d\u001a";
                           var5 = "`\tè\u008bõóªøGuë)»\u009f\u009d\u001a".length();
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

               var15 = "{G²\u0014|¹ÿ\u009bµ\u0012\ngèÜ\u0095W\u0018D:Å]öB)(j|~\u008eDî³?\u0004\u000b?×\u0092´D\u0085";
               var17 = "{G²\u0014|¹ÿ\u009bµ\u0012\ngèÜ\u0095W\u0018D:Å]öB)(j|~\u008eDî³?\u0004\u000b?×\u0092´D\u0085".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void I(String var0) {
      w = var0;
   }

   public static String T() {
      return w;
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28499;
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
            throw new RuntimeException("su/catlean/gk", var10);
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
         throw new RuntimeException("su/catlean/gk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1433;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/gk", var14);
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
         throw new RuntimeException("su/catlean/gk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
