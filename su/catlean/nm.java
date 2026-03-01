package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;
import org.lwjgl.glfw.GLFW;
import su.catlean.api.event.events.client.InputEvent;

public abstract class nm implements il, da {
   static final KProperty[] z;
   @NotNull
   private final String J;
   @NotNull
   private final List N;
   @NotNull
   private final List a;
   @NotNull
   private final fs v;
   @NotNull
   private final zo r;
   @NotNull
   private final zy A;
   @NotNull
   private fs g;
   private boolean Q;
   private float w;
   private float l;
   private float k;
   private float s;
   private boolean C;
   private float M;
   private float y;
   @NotNull
   private final String L;
   private static int[] h;
   private static final long b = j0.a(161467168188734870L, 5476529601250160755L, MethodHandles.lookup().lookupClass()).a(40472675681152L);
   private static final String[] f;
   private static final String[] o;
   private static final Map q;
   private static final long[] H;
   private static final Integer[] O;
   private static final Map Y;

   public nm(@NotNull String id, long a) {
      var2 ^= b;
      long var4 = var2 ^ 16160693012573L;
      long var6 = var2 ^ 112913325153593L;
      long var8 = var2 ^ 32955662699099L;
      Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(11805, 5061080403823373576L ^ var2));
      super();
      this.J = var1;
      this.N = (List)(new ArrayList());
      this.a = (List)(new ArrayList());
      this.v = new fs(true.m<invokedynamic>(21676, 4117671417399269306L ^ var2), var4, true.m<invokedynamic>(15291, 5093143487325787482L ^ var2), true.m<invokedynamic>(32594, 4043334535794135481L ^ var2));
      this.r = qi.R((il)this, true.m<invokedynamic>(18411, 3171151488330319103L ^ var2), false, (pj)null, (Function0)null, true.m<invokedynamic>(32594, 4043334535794135481L ^ var2), var6, (Object)null);
      this.A = qi.K((il)this, true.m<invokedynamic>(32528, 1655804613106826270L ^ var2), new r1(0.5F, 0.5F), (pj)null, (Function0)null, true.m<invokedynamic>(32594, 4043334535794135481L ^ var2), (Object)null, var8);
      this.g = new fs(this.J, var4, true.m<invokedynamic>(11225, 2680173922613282102L ^ var2), true.m<invokedynamic>(25767, 493409909638269520L ^ var2));
      StringBuilder var10 = new StringBuilder();
      StringBuilder var11 = var10;
      boolean var12 = false;
      CharSequence var10000 = (CharSequence)this.J;
      String[] var13 = new String[]{"-"};
      Iterable var27 = (Iterable)StringsKt.split$default(var10000, var13, false, 0, true.m<invokedynamic>(20814, 1626653730431385504L ^ var2), (Object)null);
      boolean var14 = false;
      Iterator var15 = var27.iterator();

      while(true) {
         if (var15.hasNext()) {
            Object var16 = var15.next();
            String var17 = (String)var16;
            boolean var18 = false;
            if (var2 <= 0L) {
               break;
            }

            StringBuilder var28 = var11;
            String var19 = var17;

            int var10001;
            label35: {
               try {
                  var10001 = ((CharSequence)var19).length();
                  if (var2 <= 0L) {
                     break label35;
                  }

                  if (var10001 > 0) {
                     var10001 = 1;
                     break label35;
                  }
               } catch (UnsupportedOperationException var26) {
                  throw var26.A<invokedynamic>(var26, 8961702393779500408L, var2);
               }

               var10001 = 0;
            }

            String var31;
            if (var10001 != 0) {
               StringBuilder var30 = new StringBuilder();
               char var20 = var17.charAt(0);
               StringBuilder var21 = var30;
               boolean var23 = false;
               String var29 = String.valueOf(var20);
               Intrinsics.checkNotNull(var29, true.m<invokedynamic>(31714, 5415113404243212533L ^ var2));
               var29 = var29.toUpperCase(Locale.ROOT);
               Intrinsics.checkNotNullExpressionValue(var29, true.m<invokedynamic>(17125, 7177752804047765986L ^ var2));
               CharSequence var24 = (CharSequence)var29;
               var28 = var11;
               var30 = var21.append(var24);
               byte var32 = 1;
               String var10002 = var17.substring(var32);
               Intrinsics.checkNotNullExpressionValue(var10002, true.m<invokedynamic>(23725, 103422792992448432L ^ var2));
               var31 = var30.append(var10002).toString();
            } else {
               var31 = var17;
            }

            var28.append(var31);
            var11.append((char)true.m<invokedynamic>(16860, 8309479295892631338L ^ var2));
            StringsKt.trim((CharSequence)var11);
            if (var2 >= 0L) {
               continue;
            }
         }

         this.L = var10.toString();
         break;
      }

   }

   @NotNull
   public final String h() {
      return this.J;
   }

   @NotNull
   public List B() {
      return this.N;
   }

   @NotNull
   public List F() {
      return this.a;
   }

   public final boolean O(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 138091014338718L;
      int var3 = (int)((var1 ^ 138091014338718L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)this.r.k((short)var3, this, z[0], (short)var4, var5);
   }

   public final void r(long a, boolean <set-?>) {
      var1 ^= b;
      long var10001 = var1 ^ 87321589983477L;
      int var4 = (int)((var1 ^ 87321589983477L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      this.r.P(this, var4, z[0], (short)var5, var3, (short)var6);
   }

   @NotNull
   public final r1 f(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 90187183087901L;
      int var3 = (int)((var1 ^ 90187183087901L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (r1)this.A.k((short)var3, this, z[1], (short)var4, var5);
   }

   public final void g(int a, char a, @NotNull r1 <set-?>, int a) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 132468112188026L;
      int var7 = (int)((var5 ^ 132468112188026L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.m<invokedynamic>(30219, 4100474419056650303L ^ var5));
      this.A.P(this, var7, z[1], (short)var8, var3, (short)var9);
   }

   @NotNull
   public final fs t() {
      return this.g;
   }

   public final float n() {
      return this.M;
   }

   public final void B(float <set-?>) {
      this.M = var1;
   }

   public final float A() {
      return this.y;
   }

   public final void y(float <set-?>) {
      this.y = var1;
   }

   @NotNull
   public final String W() {
      return this.L;
   }

   public void o(short param1, char param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void N(long var1) {
      long var3 = var1 ^ 122528511764025L;
      this.r(var3, true);
   }

   public void l(int var1, int var2, byte var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56;
      long var6 = var4 ^ 7154985483467L;
      this.r(var6, false);
   }

   public abstract void k(@NotNull class_332 var1, long var2);

   public void O(@NotNull class_332 context, long a) {
      Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(10496, 608738866775326625L ^ var2));
   }

   public void Y(long var1, char var3) {
   }

   public final void T(long a, @NotNull class_332 context) {
      // $FF: Couldn't be decompiled
   }

   public final void G(@NotNull class_332 context, long a, @NotNull String text) {
      var2 ^= b;
      long var10001 = var2 ^ 91708233363191L;
      int var5 = (int)((var2 ^ 91708233363191L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 40);
      int var7 = (int)(var10001 << 56 >>> 56);
      long var8 = var2 ^ 65023478106623L;
      long var10 = var2 ^ 58626495719571L;
      long var12 = var2 ^ 25648778910979L;
      var10001 = var2 ^ 24676263578853L;
      long var14 = (var2 ^ 24676263578853L) >>> 16;
      int var16 = (int)(var10001 << 48 >>> 48);
      long var17 = var2 ^ 25836353975786L;
      long var19 = var2 ^ 25812867815056L;
      long var21 = var2 ^ 118680928890348L;
      Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(26510, 8105341250248206642L ^ var2));
      -1011058945856337689L.A<invokedynamic>(-1011058945856337689L, var2);
      Intrinsics.checkNotNullParameter(var4, true.m<invokedynamic>(10102, 1572223523732761037L ^ var2));
      float var24 = g3.D(var17).e(var12, var4);

      try {
         Matrix3x2fStack var26 = var1.method_51448();
         Intrinsics.checkNotNullExpressionValue(var26, true.m<invokedynamic>(31500, 8856425529880999349L ^ var2));
         x(this, var26, this.Q(var10), var19, this.b(var8), var24 + 19.0F, 13.0F, 0.0F, false, true.m<invokedynamic>(1790, 3314114361410512307L ^ var2), (Object)null);
         var26 = var1.method_51448();
         Intrinsics.checkNotNullExpressionValue(var26, true.m<invokedynamic>(31500, 8856425529880999349L ^ var2));
         l(this, var26, this.Q(var10) + (float)true.m<invokedynamic>(29296, 7634633170333077816L ^ var2), this.b(var8) + 3.0F, var21, 0.0F, true.m<invokedynamic>(29495, 5180011959827566704L ^ var2), (Object)null);
         fs var27 = this.g;
         Matrix3x2fStack var10002 = var1.method_51448();
         Intrinsics.checkNotNullExpressionValue(var10002, true.m<invokedynamic>(31500, 8856425529880999349L ^ var2));
         d(this, var27, var10002, this.Q(var10) + 2.0F, this.b(var8), 10.0F, 10.0F, 0.0F, true.m<invokedynamic>(16307, 4407505909871926512L ^ var2), var14, (Object)null, (short)var16);
         this.Y(var1, var4, var5, var6, this.Q(var10) + 16.0F, this.b(var8) + 1.0F, z8.I.M(), (byte)var7);
         this.y = var24 + 20.0F;
         this.M = 13.0F;
         if (-1014482884669803391L.A<invokedynamic>(-1014482884669803391L, var2) == null) {
            (new int[1]).A<invokedynamic>(new int[1], -1039512948220085553L, var2);
         }

      } catch (UnsupportedOperationException var25) {
         throw var25.A<invokedynamic>(var25, -1010116161105151779L, var2);
      }
   }

   public final void G(@NotNull class_332 context, @NotNull String header, int a, int a, float factor, boolean right) {
      long var7 = ((long)var3 << 32 | (long)var4 << 32 >>> 32) ^ b;
      long var10001 = var7 ^ 139271066469787L;
      int var9 = (int)((var7 ^ 139271066469787L) >>> 32);
      int var10 = (int)(var10001 << 32 >>> 40);
      int var11 = (int)(var10001 << 56 >>> 56);
      long var12 = var7 ^ 25158233186963L;
      long var14 = var7 ^ 27010607760383L;
      long var16 = var7 ^ 64395460146799L;
      var10001 = var7 ^ 65642353993609L;
      long var18 = (var7 ^ 65642353993609L) >>> 16;
      int var20 = (int)(var10001 << 48 >>> 48);
      long var21 = var7 ^ 64585846398598L;
      long var23 = var7 ^ 64565841559036L;
      long var25 = var7 ^ 77182177527424L;
      Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(26510, 8105310749104046686L ^ var7));
      Intrinsics.checkNotNullParameter(var2, true.m<invokedynamic>(445, 8113666702555112555L ^ var7));
      int[] var10000 = 1917358047015822219L.A<invokedynamic>(1917358047015822219L, var7);
      float var28 = g3.D(var21).e(var16, var2);
      int[] var27 = var10000;
      float var29 = var28 + 24.0F;

      float var33;
      float var34;
      label33: {
         try {
            var33 = this.Q(var14);
            if (var6) {
               var34 = this.y - var29;
               break label33;
            }
         } catch (UnsupportedOperationException var32) {
            throw var32.A<invokedynamic>(var32, 1916129319989531569L, var7);
         }

         var34 = 0.0F;
      }

      float var30 = var33 + var34;

      try {
         var1.method_51448().pushMatrix();
         var1.method_51448().translate(var30 + var29 / 2.0F, this.b(var12) + 8.0F);
         var1.method_51448().scale(((Number)RangesKt.coerceIn((Comparable)var5, RangesKt.rangeTo(0.0F, 2.0F))).floatValue(), ((Number)RangesKt.coerceIn((Comparable)var5, RangesKt.rangeTo(0.0F, 2.0F))).floatValue());
         var1.method_51448().translate(-(var30 + var29 / 2.0F), -(this.b(var12) + 8.0F));
         Matrix3x2fStack var35 = var1.method_51448();
         Intrinsics.checkNotNullExpressionValue(var35, true.m<invokedynamic>(31500, 8856458248377343705L ^ var7));
         x(this, var35, var30, var23, this.b(var12), var29, 16.0F, 0.0F, false, true.m<invokedynamic>(1790, 3314144310709522143L ^ var7), (Object)null);
         fs var36 = this.g;
         Matrix3x2fStack var10002 = var1.method_51448();
         Intrinsics.checkNotNullExpressionValue(var10002, true.m<invokedynamic>(31500, 8856458248377343705L ^ var7));
         d(this, var36, var10002, var30 + 2.0F, this.b(var12) + 1.5F, 10.0F, 10.0F, 0.0F, true.m<invokedynamic>(7540, 5066744581751412049L ^ var7), var18, (Object)null, (short)var20);
         var35 = var1.method_51448();
         Intrinsics.checkNotNullExpressionValue(var35, true.m<invokedynamic>(31500, 8856458248377343705L ^ var7));
         l(this, var35, var30 + (float)true.m<invokedynamic>(11016, 5435874246281700134L ^ var7), this.b(var12) + 4.0F, var25, 0.0F, true.m<invokedynamic>(1317, 2687137269869513996L ^ var7), (Object)null);
         this.Y(var1, var2, var9, var10, var30 + 18.0F, this.b(var12) + 2.0F, z8.I.M(), (byte)var11);
         var1.method_51448().popMatrix();
         var10000 = var27;
         if (var4 < 0) {
            if (var27 != null) {
               return;
            }

            var10000 = new int[5];
         }

         var10000.A<invokedynamic>(var10000, 1908553780585290183L, var7);
      } catch (UnsupportedOperationException var31) {
         throw var31.A<invokedynamic>(var31, 1916129319989531569L, var7);
      }
   }

   public void i(long a, int key, @NotNull InputEvent.Action action) {
      // $FF: Couldn't be decompiled
   }

   protected final void C(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final float Q(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 67028238641043L;
      int var3 = (int)((var1 ^ 67028238641043L) >>> 56);
      long var4 = var10001 << 8 >>> 8;
      long var6 = var1 ^ 132602719521647L;
      return this.f(var6).q() * (float)this.d((byte)var3, var4);
   }

   public final float b(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 74143686599046L;
      long var5 = var1 ^ 130741083924995L;
      return this.f(var5).s() * (float)this.S(var3);
   }

   protected final float a() {
      return gz.M.b();
   }

   protected final float c() {
      return gz.M.X();
   }

   protected final boolean M(long param1) {
      // $FF: Couldn't be decompiled
   }

   protected final void j(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 61556238760059L;
      int var3 = (int)((var1 ^ 61556238760059L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);

      int var10000;
      label17: {
         try {
            if (gz.M.q() != null) {
               var10000 = 28259.m<invokedynamic>(28259, 5748596479922026412L ^ var1);
               break label17;
            }
         } catch (UnsupportedOperationException var7) {
            throw var7.A<invokedynamic>(var7, -3790604545356332477L, var1);
         }

         var10000 = 9705.m<invokedynamic>(9705, 7404848953908493366L ^ var1);
      }

      int var6 = var10000;
      GLFW.glfwSetCursor(s8.H((short)var3, (short)var4, var5).method_22683().method_4490(), GLFW.glfwCreateStandardCursor(var6));
   }

   protected final void Z(float w, float h) {
      this.y = var1;
      this.M = var2;
   }

   protected final int S(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 6847814183580L;
      int var3 = (int)((var1 ^ 6847814183580L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return s8.H((short)var3, (short)var4, var5).method_22683().method_4502();
   }

   protected final int d(byte var1, long var2) {
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ b;
      long var10001 = var4 ^ 131751509462501L;
      int var6 = (int)((var4 ^ 131751509462501L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return s8.H((short)var6, (short)var7, var8).method_22683().method_4486();
   }

   protected final boolean G(long a, float n1, float n2) {
      var1 ^= b;
      int[] var5 = 8803612466907644732L.A<invokedynamic>(8803612466907644732L, var1);

      int var10000;
      label32: {
         try {
            float var7;
            var10000 = (var7 = Math.abs(var3 - var4) - 2.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
            if (var5 == null) {
               return (boolean)var10000;
            }

            if (var10000 < 0) {
               break label32;
            }
         } catch (UnsupportedOperationException var6) {
            throw var6.A<invokedynamic>(var6, 8800052844348158726L, var1);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   protected final void r(@NotNull Matrix3x2fStack m, float x, long a, float y, float w, float h, float a, boolean batch) {
      // $FF: Couldn't be decompiled
   }

   public static void x(nm param0, Matrix3x2fStack param1, float param2, long param3, float param5, float param6, float param7, float param8, boolean param9, int param10, Object param11) {
      // $FF: Couldn't be decompiled
   }

   protected final void k(@NotNull Matrix3x2fStack m, float x, float y, float a) {
      Intrinsics.checkNotNullParameter(var1, "m");
      Matrix3x2f var5 = new Matrix3x2f((Matrix3x2fc)var1);
      gz.M.c().add(new x5(var5, var2, var3, 0.5F, 8.5F, var4));
   }

   public static void l(nm var0, Matrix3x2fStack var1, float var2, float var3, long var4, float var6, int var7, Object var8) {
      var4 ^= b;

      try {
         if (var8 != null) {
            throw new UnsupportedOperationException(true.m<invokedynamic>(12593, 2547295917665457109L ^ var4));
         }
      } catch (UnsupportedOperationException var9) {
         throw var9.A<invokedynamic>(var9, -2476388352262400892L, var4);
      }

      if ((var7 & true.m<invokedynamic>(29495, 5180080962670836777L ^ var4)) != 0) {
         var6 = 1.0F;
      }

      var0.k(var1, var2, var3, var6);
   }

   protected final void c(@NotNull fs image, @NotNull Matrix3x2fStack m, char a, float x, int a, float y, float w, float h, char a, float a) {
      long var11 = ((long)var3 << 48 | (long)var5 << 32 >>> 16 | (long)var9 << 48 >>> 48) ^ b;
      long var13 = var11 ^ 124157451578521L;
      Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(32702, 633362704431948469L ^ var11));
      Intrinsics.checkNotNullParameter(var2, "m");
      Matrix3x2f var15 = new Matrix3x2f((Matrix3x2fc)var2);
      gz.M.h().add(new dm(var1, var15, var4, var6, var7, var8, var10, var13));
   }

   public static void d(nm var0, fs var1, Matrix3x2fStack var2, float var3, float var4, float var5, float var6, float var7, int var8, long var9, Object var11, short var12) {
      long var13 = (var9 << 16 | (long)var12 << 48 >>> 48) ^ b;
      long var10001 = var13 ^ 104536677457735L;
      int var15 = (int)((var13 ^ 104536677457735L) >>> 48);
      int var16 = (int)(var10001 << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);

      try {
         if (var11 != null) {
            throw new UnsupportedOperationException(true.m<invokedynamic>(26260, 7966386634539935099L ^ var13));
         }
      } catch (UnsupportedOperationException var18) {
         throw var18.A<invokedynamic>(var18, -4851673758877125235L, var13);
      }

      if ((var8 & true.m<invokedynamic>(16307, 4407519465204388256L ^ var13)) != 0) {
         var7 = 1.0F;
      }

      var0.c(var1, var2, (char)var15, var3, var16, var4, var5, var6, (char)var17, var7);
   }

   protected final void Y(@NotNull class_332 context, @NotNull String s, int a, int a, float x, float y, @NotNull Color color, byte a) {
      long var9 = ((long)var3 << 32 | (long)var4 << 40 >>> 32 | (long)var8 << 56 >>> 56) ^ b;
      long var11 = var9 ^ 8500806479142L;
      long var13 = var9 ^ 121743105252008L;
      Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(26510, 8105227168803767920L ^ var9));
      Intrinsics.checkNotNullParameter(var2, "s");
      Intrinsics.checkNotNullParameter(var7, true.m<invokedynamic>(17348, 3859948935100785187L ^ var9));
      fc var10000 = g3.D(var13);
      Matrix3x2fStack var10001 = var1.method_51448();
      Intrinsics.checkNotNullExpressionValue(var10001, true.m<invokedynamic>(17347, 8132633966051353120L ^ var9));
      fc.X(var10000, var10001, var2, var5, var6, var7, false, 0, true.m<invokedynamic>(5859, 8399474596307360494L ^ var9), var11, (Object)null);
   }

   static {
      long var20 = b ^ 19442547082965L;
      int[] var10000 = new int[2];
      q = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 5102295008549834131L, var20);
      Cipher var11;
      Cipher var23 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var23.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[28];
      int var16 = 0;
      String var15 = "r·\u0082\u0084@\u00907VÔè´³u°\u0000¡\u0010Å\u0016àeW¬\u0086ª\n\u008eè o÷Ï¹\u0010\u008er>È5¢[ú\u009e&ëº\u0003\u0094;õXálv¯\u009e\u0092\u001b\u0016\u0007y³l.\tàI\räÜïW#é¢À\u001câ=:\u009dÉFV] ÇÙ~Ãu°JvÒ÷ù\u00ad\u00960\u000e£°\u009fÈ*Ä\u0003Õã}Ö%\u0089;PÈÿu\u008f\u0004ÖfÓù¯ÁÀD\t¢q Ao¢z6¥\u0010À\u000f\u0017ã\u001100ÃÚÅÄrP.ï) q_Îd~ªR±øà ¶\u0016^DDÛÓ-×\u0090× ä¹\u0088ú;\u00030¬\u001b\u0090ÒoU\u0088\u0006<\u0084\u0006\u009aN|Ï/}ûã£óî5\u0097ÚeÍ\u0011ç(\u0098\u00016O3\u0013\u0083Þ¤\u0004Ýä\u0004\u0088ç\u00adIc\u001b¼\fQî¨\u00946,òèP¸dëå\u0005þ/;\u0002h\u001a¬C&Ë\u0015RÎ\u00135#\u001f\u000bÎDa\u0012\u0000ÎEjµ&F\u0001ù_^ \u0098DÓÿ¯K\u008d\u0018¦BnO\u0010°-\u0012\u0000\u00adÞ¹Æ\u0014qÚ(\u0016LÀº\u0092\u0082\u0088$øÏ<b2\u0088Ç\u0084\u008f\u0082Ï\u000f¾\u0087\u008c\u0010Æ èÓÁ¦üìâ2y\u001f\u001dmiP ðb\u001e¯ À\u008f\u0083<\u0007½PL\u0098jÜM².\u0000ª\t\u0082eØ\u008b=\u0098/\tx\u0098\u0018$·\u0005\u009e\u0010Ç\u0003aX*¶¢VEKÝ+·\u008b{\u0019\u0086É\u0095\u0010\u000e©9t\u0013r\u0088\u0090h÷=´ÑtGr\u0010È¼¢¸TìÜ]cOm¥lió\b\u0088é\u00162ÈÛ:Íf¾Æ¡ÕÑ\u00803\"`G\u009dò\u0095å¹\u00166\u008cüÆ¥\u008bc\u00184e¾Ñé ²\u0086\u0094óXý1\t:ZSb3x¬<«1ÕTê»×¾8±ëXÅ\u00168Hgò´4UÓÖÛ}Ø³ \u0092|ê%\u0091ÄH´¯É×\u0093\u0092R+üÝ[®Á\u0012.bÜb¤àõ*G\u0001\"\u0099Ý\u007fö7ö/\u008f\u0010·6\u0016ùW\u0001Ñ\u001a\u009e1<ÙL\u0010^\u0086å,+«\u0091»ÌV\u0017Y\u008e.Ç\u001exÕÅG\u0018-í¾\u0006ÈÂü ôÍ\f\u0094M¾N`Â\u0015¾\u0017àð3\u009eE¤¥;\u0081ìài¿ð,\u0017an}ÇA ãbSQ¡\u0086¯ë[|\u008bæ\u008aÊnÇA\t¹\u001avaý\u0096Îêæ\u009bÀ^½\u009bYì¾ÃQ\u009a©ä\u0011IL\u001f\u0007¥\u0080\u0098óÛ\"\bué¼£\u0097'\u008dGýÿ)¥;¼\u0006¾ÅØ?\u000e!Å\u0010=ã\u0085OÏìóQ]\u0012Î¼\u001c\u0095\u0010Ä ]\u0085ë'\u000e9Õæäý>Qx\u0016¦\u0096\u008f|ï±\u0083Nð\u009c\u001d¢\"Äsûo#\u0088°cTßº\n\u0088°´%\u0011\u0096\u0019\tè\u0097\u001dt\u007fQæ\u0086l\\×÷ôét\u001d/ý%Aá\u001c{5è\u0014»2[\u0097½¬\u0083\r3&´Ñíû¾1U\u0093½ÎØQé\u009c[f¤ÖsCYã\u0013^¢ú;ù]Ã\u008b¬Ú\u001d5_Âq\u0096´\u001c0F¤\u0012ü7_W\u009f!~O\u008e^ÀlI!\u0094|µ\u009f$Üó\u0004p{\u001e\u000b\u0089ßCèN\u0081»±\u0005\u0092\u0090F Õ@\u0010ä\u0004\u0013\u00802$?$p\u009e\u0001\n\u0019p¿u(Êò\u008e\u0088]wà1ä¼å\u008e\u0085\u0091+µñ¤ýM¬ê^08HÐ]È©l\u0002&\u000eIò\u0089tá\u008f\u0010÷'3\u0015±¼/»Ì\u009bJf+F\u000e=\u0010\u0016\u0004S×Ûæ|K:¶ªJD]c\u0088(WPÈgáZmoÞÒ\u0098\u001aÆXéUDní\u0089×\bçdj\u0085^*\u0095\u000312~¸\u0098äwþÆ\u0006\u0010\u0004\rh/¶°(\u0098-ëäZ[u2\u0088\u0010pö>Ô\u0015\u00913\u0093Èù#ñRÌª(\u0010>4\u008e\u0083©AÂÆ\u008d!Sa\u001bxÉæ";
      int var17 = "r·\u0082\u0084@\u00907VÔè´³u°\u0000¡\u0010Å\u0016àeW¬\u0086ª\n\u008eè o÷Ï¹\u0010\u008er>È5¢[ú\u009e&ëº\u0003\u0094;õXálv¯\u009e\u0092\u001b\u0016\u0007y³l.\tàI\räÜïW#é¢À\u001câ=:\u009dÉFV] ÇÙ~Ãu°JvÒ÷ù\u00ad\u00960\u000e£°\u009fÈ*Ä\u0003Õã}Ö%\u0089;PÈÿu\u008f\u0004ÖfÓù¯ÁÀD\t¢q Ao¢z6¥\u0010À\u000f\u0017ã\u001100ÃÚÅÄrP.ï) q_Îd~ªR±øà ¶\u0016^DDÛÓ-×\u0090× ä¹\u0088ú;\u00030¬\u001b\u0090ÒoU\u0088\u0006<\u0084\u0006\u009aN|Ï/}ûã£óî5\u0097ÚeÍ\u0011ç(\u0098\u00016O3\u0013\u0083Þ¤\u0004Ýä\u0004\u0088ç\u00adIc\u001b¼\fQî¨\u00946,òèP¸dëå\u0005þ/;\u0002h\u001a¬C&Ë\u0015RÎ\u00135#\u001f\u000bÎDa\u0012\u0000ÎEjµ&F\u0001ù_^ \u0098DÓÿ¯K\u008d\u0018¦BnO\u0010°-\u0012\u0000\u00adÞ¹Æ\u0014qÚ(\u0016LÀº\u0092\u0082\u0088$øÏ<b2\u0088Ç\u0084\u008f\u0082Ï\u000f¾\u0087\u008c\u0010Æ èÓÁ¦üìâ2y\u001f\u001dmiP ðb\u001e¯ À\u008f\u0083<\u0007½PL\u0098jÜM².\u0000ª\t\u0082eØ\u008b=\u0098/\tx\u0098\u0018$·\u0005\u009e\u0010Ç\u0003aX*¶¢VEKÝ+·\u008b{\u0019\u0086É\u0095\u0010\u000e©9t\u0013r\u0088\u0090h÷=´ÑtGr\u0010È¼¢¸TìÜ]cOm¥lió\b\u0088é\u00162ÈÛ:Íf¾Æ¡ÕÑ\u00803\"`G\u009dò\u0095å¹\u00166\u008cüÆ¥\u008bc\u00184e¾Ñé ²\u0086\u0094óXý1\t:ZSb3x¬<«1ÕTê»×¾8±ëXÅ\u00168Hgò´4UÓÖÛ}Ø³ \u0092|ê%\u0091ÄH´¯É×\u0093\u0092R+üÝ[®Á\u0012.bÜb¤àõ*G\u0001\"\u0099Ý\u007fö7ö/\u008f\u0010·6\u0016ùW\u0001Ñ\u001a\u009e1<ÙL\u0010^\u0086å,+«\u0091»ÌV\u0017Y\u008e.Ç\u001exÕÅG\u0018-í¾\u0006ÈÂü ôÍ\f\u0094M¾N`Â\u0015¾\u0017àð3\u009eE¤¥;\u0081ìài¿ð,\u0017an}ÇA ãbSQ¡\u0086¯ë[|\u008bæ\u008aÊnÇA\t¹\u001avaý\u0096Îêæ\u009bÀ^½\u009bYì¾ÃQ\u009a©ä\u0011IL\u001f\u0007¥\u0080\u0098óÛ\"\bué¼£\u0097'\u008dGýÿ)¥;¼\u0006¾ÅØ?\u000e!Å\u0010=ã\u0085OÏìóQ]\u0012Î¼\u001c\u0095\u0010Ä ]\u0085ë'\u000e9Õæäý>Qx\u0016¦\u0096\u008f|ï±\u0083Nð\u009c\u001d¢\"Äsûo#\u0088°cTßº\n\u0088°´%\u0011\u0096\u0019\tè\u0097\u001dt\u007fQæ\u0086l\\×÷ôét\u001d/ý%Aá\u001c{5è\u0014»2[\u0097½¬\u0083\r3&´Ñíû¾1U\u0093½ÎØQé\u009c[f¤ÖsCYã\u0013^¢ú;ù]Ã\u008b¬Ú\u001d5_Âq\u0096´\u001c0F¤\u0012ü7_W\u009f!~O\u008e^ÀlI!\u0094|µ\u009f$Üó\u0004p{\u001e\u000b\u0089ßCèN\u0081»±\u0005\u0092\u0090F Õ@\u0010ä\u0004\u0013\u00802$?$p\u009e\u0001\n\u0019p¿u(Êò\u008e\u0088]wà1ä¼å\u008e\u0085\u0091+µñ¤ýM¬ê^08HÐ]È©l\u0002&\u000eIò\u0089tá\u008f\u0010÷'3\u0015±¼/»Ì\u009bJf+F\u000e=\u0010\u0016\u0004S×Ûæ|K:¶ªJD]c\u0088(WPÈgáZmoÞÒ\u0098\u001aÆXéUDní\u0089×\bçdj\u0085^*\u0095\u000312~¸\u0098äwþÆ\u0006\u0010\u0004\rh/¶°(\u0098-ëäZ[u2\u0088\u0010pö>Ô\u0015\u00913\u0093Èù#ñRÌª(\u0010>4\u008e\u0083©AÂÆ\u008d!Sa\u001bxÉæ".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var30;
               if ((var13 += var14) >= var17) {
                  f = var18;
                  o = new String[28];
                  Y = new HashMap(13);
                  Cipher var0;
                  var23 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var23.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[20];
                  int var3 = 0;
                  String var4 = "^÷ç+l\u000bj\u0006\u0086t\r:·N\u008a\u0085\u0080\u009a\u008d ø\\\u001eönT»ÕU3\u009e¥)\u0089t´mÍ\u0093â\u0088]xóI.\u001a-ù/ô=ÃH{×\u0005r ½^û\u008b\nÎ\u009a¹¨\u007f$º(è\u00061Äý\u0005g; ì9¢\nç»Ãº\u008dmq\"\u0091\u0010à\u0017BÝLÜ0ºñÿÀÁÖ\u008bëO®ÀGCfO\u0083#\u0083µ\u0089=_\u007f\u000f\u001aê\u0004Cfº|ÀO6\u009c¨æ\u001d\u000bÜØ\u0014";
                  int var5 = "^÷ç+l\u000bj\u0006\u0086t\r:·N\u008a\u0085\u0080\u009a\u008d ø\\\u001eönT»ÕU3\u009e¥)\u0089t´mÍ\u0093â\u0088]xóI.\u001a-ù/ô=ÃH{×\u0005r ½^û\u008b\nÎ\u009a¹¨\u007f$º(è\u00061Äý\u0005g; ì9¢\nç»Ãº\u008dmq\"\u0091\u0010à\u0017BÝLÜ0ºñÿÀÁÖ\u008bëO®ÀGCfO\u0083#\u0083µ\u0089=_\u007f\u000f\u001aê\u0004Cfº|ÀO6\u009c¨æ\u001d\u000bÜØ\u0014".length();
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
                              H = var6;
                              O = new Integer[20];
                              KProperty[] var22 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(nm.class, true.m<invokedynamic>(24640, 940907805719746978L ^ var20), true.m<invokedynamic>(18345, 4413394447926787679L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(nm.class, true.m<invokedynamic>(32607, 6734597554077222567L ^ var20), true.m<invokedynamic>(26937, 6696649015442264258L ^ var20), 0)))};
                              z = var22;
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "³¼\u0006\u008c\u001dJ+MOk\u000b,á\u0096z¥";
                           var5 = "³¼\u0006\u008c\u001dJ+MOk\u000b,á\u0096z¥".length();
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

               var15 = "\u0088 ®\u0090»VL·5\\¶\u0094à¶\u009aW\u0086ÃCÃùªs¹\u0003'üïýR÷Ò\u0018\u0096#\u0092Ì\u0082ÊTÞ\u00ad¦FIj\bô-\u000b\u009a\u008eV\u0096±ÃÍ";
               var17 = "\u0088 ®\u0090»VL·5\\¶\u0094à¶\u009aW\u0086ÃCÃùªs¹\u0003'üïýR÷Ò\u0018\u0096#\u0092Ì\u0082ÊTÞ\u00ad¦FIj\bô-\u000b\u009a\u008eV\u0096±ÃÍ".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void Y(int[] var0) {
      h = var0;
   }

   public static int[] m() {
      return h;
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32397;
      if (o[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])q.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/nm", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         o[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return o[var5];
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
         throw new RuntimeException("su/catlean/nm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4990;
      if (O[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = H[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])Y.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               Y.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/nm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         O[var3] = var15;
      }

      return O[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
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
         throw new RuntimeException("su/catlean/nm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
