package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_259;
import net.minecraft.class_2596;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2885;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_7202;
import net.minecraft.class_7204;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class ml implements zh {
   @NotNull
   public static final ml j;
   @NotNull
   private static final Map b;
   @NotNull
   private static final Map G;
   @NotNull
   private static class_243 L;
   private static int w;
   private static final long a = j0.a(1437760316326242514L, 3072095498347289466L, MethodHandles.lookup().lookupClass()).a(78190940494321L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   private ml() {
   }

   @NotNull
   public final Map w() {
      return G;
   }

   @Flow(
      priority = 10
   )
   public final void A(@NotNull PlayerUpdateEvent e) {
      // $FF: Couldn't be decompiled
   }

   public final boolean G(long a, @NotNull class_243 vec) {
      var1 ^= a;
      long var10001 = var1 ^ 137911899297597L;
      int var4 = (int)((var1 ^ 137911899297597L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);

      boolean var10000;
      try {
         Intrinsics.checkNotNullParameter(var3, true.b<invokedynamic>(11067, 3334425590432785311L ^ var1));
         if (ab.S(ab.O, var4, L, var3, false, (List)null, false, (short)var5, true.u<invokedynamic>(809, 2096471440562422835L ^ var1), var6, (Object)null) == null) {
            var10000 = true;
            return var10000;
         }
      } catch (NoSuchElementException var7) {
         throw var7.A<invokedynamic>(var7, 8771490370231214305L, var1);
      }

      var10000 = false;
      return var10000;
   }

   @NotNull
   public final class_243 d(long a, @NotNull class_1297 entity) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final rx p(@NotNull class_2338 bp, int slot, @NotNull st interact, @NotNull m7 mode, @NotNull v0 ignore, float range, long a, float wallRange, int priority, @NotNull gt switch, @NotNull List calcGhost, boolean grim) {
      // $FF: Couldn't be decompiled
   }

   public static rx o(ml var0, class_2338 var1, int var2, st var3, int var4, m7 var5, v0 var6, float var7, float var8, int var9, gt var10, List var11, boolean var12, int var13, byte var14, int var15, Object var16) {
      long var17 = ((long)var4 << 32 | (long)var14 << 56 >>> 32 | (long)var15 << 40 >>> 40) ^ a;
      long var19 = var17 ^ 65936665447937L;
      int var21 = -5068633190836729204L.A<invokedynamic>(-5068633190836729204L, var17);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var13 & true.u<invokedynamic>(27785, 447620253637651324L ^ var17);
               if (var21 != 0) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NoSuchElementException var23) {
               throw var23.A<invokedynamic>(var23, -5092283618680315889L, var17);
            }

            var11 = (List)(new ArrayList());
         }

         var10000 = var13 & true.u<invokedynamic>(20654, 4738435050384103262L ^ var17);
      }

      label27: {
         try {
            if (var21 != 0) {
               break label27;
            }

            if (var10000 == 0) {
               return var0.p(var1, var2, var3, var5, var6, var7, var19, var8, var9, var10, var11, (boolean)var12);
            }
         } catch (NoSuchElementException var22) {
            throw var22.A<invokedynamic>(var22, -5092283618680315889L, var17);
         }

         var10000 = 0;
      }

      var12 = var10000;
      return var0.p(var1, var2, var3, var5, var6, var7, var19, var8, var9, var10, var11, (boolean)var12);
   }

   public final boolean T(int a, @NotNull class_2338 bp, @NotNull st interact, @NotNull v0 ignore, float range, int a, float wallRange) {
      long var8 = ((long)var1 << 32 | (long)var6 << 32 >>> 32) ^ a;
      long var10001 = var8 ^ 14999757559465L;
      int var10 = (int)((var8 ^ 14999757559465L) >>> 56);
      int var11 = (int)(var10001 << 8 >>> 32);
      int var12 = (int)(var10001 << 40 >>> 40);
      Intrinsics.checkNotNullParameter(var2, true.b<invokedynamic>(2057, 3772846364330227558L ^ var8));
      Intrinsics.checkNotNullParameter(var3, true.b<invokedynamic>(28018, 2490007422401450529L ^ var8));
      int var10000 = 5671907129366347154L.A<invokedynamic>(5671907129366347154L, var8);
      Intrinsics.checkNotNullParameter(var4, true.b<invokedynamic>(19130, 7542134132154381783L ^ var8));
      int var13 = var10000;

      boolean var16;
      label48: {
         try {
            var16 = G.containsKey(var2);
            if (var13 != 0) {
               return var16;
            }

            if (!var16) {
               break label48;
            }
         } catch (NoSuchElementException var15) {
            throw var15.A<invokedynamic>(var15, 5641500203040773905L, var8);
         }

         var16 = false;
         return var16;
      }

      try {
         if (e(this, (byte)var10, var2, -1, var3, var4, var5, var7, var11, var12, (List)null, true.u<invokedynamic>(16877, 1575040387538186498L ^ var8), (Object)null) != null) {
            var16 = true;
            return var16;
         }
      } catch (NoSuchElementException var14) {
         throw var14.A<invokedynamic>(var14, 5641500203040773905L, var8);
      }

      var16 = false;
      return var16;
   }

   public final void L(long a, @NotNull class_7204 packetCreator) {
      var1 ^= a;
      long var10001 = var1 ^ 47681013516772L;
      int var4 = (int)((var1 ^ 47681013516772L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var1 ^ 82765284035665L;
      Intrinsics.checkNotNullParameter(var3, true.b<invokedynamic>(26855, 5022704889772185111L ^ var1));
      AutoCloseable var9 = (AutoCloseable)s8.i((char)var4, var5, (short)var6).method_41925().method_41937();
      Throwable var10 = null;

      try {
         class_7202 var11 = (class_7202)var9;
         boolean var12 = false;
         s8.f(var7).field_3944.method_52787(var3.predict(var11.method_41942()));
         Unit var17 = Unit.INSTANCE;
      } catch (Throwable var15) {
         var10 = var15;
         throw var15;
      } finally {
         AutoCloseableKt.closeFinally(var9, var10);
      }

   }

   @Nullable
   public final class_3965 l(@NotNull class_2338 bp, int slot, @NotNull st interact, @NotNull v0 ignore, long a, float range, float wallRange, @NotNull List calcGhost) {
      // $FF: Couldn't be decompiled
   }

   public static class_3965 e(ml var0, byte var1, class_2338 var2, int var3, st var4, v0 var5, float var6, float var7, int var8, int var9, List var10, int var11, Object var12) {
      long var13 = ((long)var1 << 56 | (long)var8 << 32 >>> 8 | (long)var9 << 40 >>> 40) ^ a;
      long var15 = var13 ^ 63727481965713L;
      if ((var11 & true.u<invokedynamic>(18341, 8835599434805607782L ^ var13)) != 0) {
         var10 = (List)(new ArrayList());
      }

      return var0.l(var2, var3, var4, var5, var15, var6, var7, var10);
   }

   @NotNull
   public final List D(@NotNull class_2338 bp, long a, @NotNull List calcGhost) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final sv i(long a, @NotNull class_2338 blockPos) {
      // $FF: Couldn't be decompiled
   }

   public final float P(long a, @NotNull class_243 vec) {
      var1 ^= a;
      long var4 = var1 ^ 66485831161003L;
      Intrinsics.checkNotNullParameter(var3, true.b<invokedynamic>(13923, 7183654498804486260L ^ var1));
      return (float)var3.method_1025(s8.f(var4).method_33571());
   }

   public final float k(@NotNull class_243 vec, long a) {
      var2 ^= a;
      long var4 = var2 ^ 88153402933490L;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(11067, 3334359422853388618L ^ var2));
      double var6 = var1.field_1352 - s8.f(var4).method_23317();
      double var8 = var1.field_1350 - s8.f(var4).method_23321();
      return (float)(var6 * var6 + var8 * var8);
   }

   @NotNull
   public final cx d(@NotNull class_2338 bp, long a) {
      var2 ^= a;
      long var4 = var2 ^ 68173729573437L;
      long var6 = var2 ^ 4271922277208L;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(2057, 3772828149295059084L ^ var2));
      class_243 var10000 = var1.method_46558();
      Intrinsics.checkNotNullExpressionValue(var10000, true.b<invokedynamic>(22481, 7783301437970698049L ^ var2));
      class_243 var8 = var10000;
      return new cx(this.d(var6, (class_1297)s8.f(var4)).field_1352 - var8.method_1031(0.5D, 0.0D, 0.0D).field_1352, this.d(var6, (class_1297)s8.f(var4)).field_1352 - var8.method_1031(-0.5D, 0.0D, 0.0D).field_1352, this.d(var6, (class_1297)s8.f(var4)).field_1350 - var8.method_1031(0.0D, 0.0D, 0.5D).field_1350, this.d(var6, (class_1297)s8.f(var4)).field_1350 - var8.method_1031(0.0D, 0.0D, -0.5D).field_1350, this.d(var6, (class_1297)s8.f(var4)).field_1351 - var8.method_1031(0.0D, 0.5D, 0.0D).field_1351, this.d(var6, (class_1297)s8.f(var4)).field_1351 - var8.method_1031(0.0D, -0.5D, 0.0D).field_1351);
   }

   public final boolean Q(long a, @NotNull class_2338 bp) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final List k(long a, @NotNull class_2338 bp) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final fy C(long a, @NotNull class_2338 bp, @NotNull st interact) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final class_243 j(@NotNull class_2350 dir, @NotNull class_2338 bp, float wallRange, float range, long a, boolean random) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final class_238 m(@NotNull class_2350 dir, long a) {
      // $FF: Couldn't be decompiled
   }

   public final boolean J(@NotNull class_243 point, @NotNull class_2338 bp, float wallRange, int a, int a, float range, byte a) {
      // $FF: Couldn't be decompiled
   }

   public final boolean n(long a, @NotNull class_2248 b) {
      // $FF: Couldn't be decompiled
   }

   public final boolean M(@NotNull class_243 pos, int fov, long a) {
      var3 ^= a;
      long var5 = var3 ^ 29625069821408L;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(24231, 3774772668193255908L ^ var3));
      int var10000 = 6801442826722459437L.A<invokedynamic>(6801442826722459437L, var3);
      double var8 = var1.method_10216() - s8.f(var5).method_23317();
      double var10 = var1.method_10215() - s8.f(var5).method_23321();
      float var12 = class_3532.method_15393((float)class_3532.method_15338(Math.toDegrees(Math.atan2(var10, var8)) - 90.0D) - class_3532.method_15393(s8.f(var5).method_36454()));
      int var7 = var10000;

      label32: {
         try {
            double var14;
            var10000 = (var14 = Math.abs((double)var12) - (double)var2) == 0.0D ? 0 : (var14 < 0.0D ? -1 : 1);
            if (var7 == 0) {
               return (boolean)var10000;
            }

            if (var10000 <= 0) {
               break label32;
            }
         } catch (NoSuchElementException var13) {
            throw var13.A<invokedynamic>(var13, 6808763735615932198L, var3);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   @NotNull
   public final class_3965 Z(@NotNull class_3959 context, @NotNull class_2338 block, long a, @NotNull class_2680 state) {
      var3 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(9442, 3960861072915889424L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.b<invokedynamic>(703, 5843731422381824870L ^ var3));
      Intrinsics.checkNotNullParameter(var5, true.b<invokedynamic>(9092, 4940081173746711108L ^ var3));
      Object var10000 = class_1922.method_17744(var1.method_17750(), var1.method_17747(), var1, ml::S, ml::s);
      Intrinsics.checkNotNullExpressionValue(var10000, true.b<invokedynamic>(18750, 4774119258016911571L ^ var3));
      return (class_3965)var10000;
   }

   public static class_3965 m(ml var0, long var1, class_3959 var3, class_2338 var4, class_2680 var5, int var6, Object var7) {
      var1 ^= a;
      long var8 = var1 ^ 93169440431852L;
      if ((var6 & 4) != 0) {
         class_2680 var10000 = class_2246.field_10540.method_9564();
         Intrinsics.checkNotNullExpressionValue(var10000, true.b<invokedynamic>(16012, 5768080642406704390L ^ var1));
         var5 = var10000;
      }

      return var0.Z(var3, var4, var8, var5);
   }

   public final boolean G(@NotNull class_1297 entity, long a, @NotNull qq rotation, float distance, boolean rayTrace) {
      // $FF: Couldn't be decompiled
   }

   private final class_239 z(class_239 var1, long var2, class_243 var4, float var5) {
      var2 ^= a;
      int var6 = -1265623108121784543L.A<invokedynamic>(-1265623108121784543L, var2);

      label28: {
         class_239 var10000;
         try {
            var10000 = var1;
            if (var6 == 0) {
               return var10000;
            }

            if (!var1.method_17784().method_24802((class_2374)var4, (double)var5)) {
               break label28;
            }
         } catch (NoSuchElementException var8) {
            throw var8.A<invokedynamic>(var8, -1265062065367107798L, var2);
         }

         var10000 = var1;
         return var10000;
      }

      class_243 var9 = var1.method_17784();
      Intrinsics.checkNotNullExpressionValue(var9, true.b<invokedynamic>(15431, 5544355986239447847L ^ var2));
      class_243 var7 = var9;
      class_3965 var10 = class_3965.method_17778(var7, class_2350.method_10142(var7.field_1352 - var4.field_1352, var7.field_1351 - var4.field_1351, var7.field_1350 - var4.field_1350), class_2338.method_49638((class_2374)var7));
      Intrinsics.checkNotNullExpressionValue(var10, true.b<invokedynamic>(8371, 5054047824248930301L ^ var2));
      return (class_239)var10;
   }

   @NotNull
   public final List e(long param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final qq U(char a, int a, int a, @NotNull class_2350 direction) {
      // $FF: Couldn't be decompiled
   }

   private static final class_2596 x(class_3965 var0, int var1) {
      return (class_2596)(new class_2885(class_1268.field_5808, var0, var1));
   }

   private static final Unit G(int param0, gt param1, class_3965 param2, m7 param3, class_2338 param4) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean l(sv param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean m(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean f(ArrayList param0, sv param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean i(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final class_3965 S(class_2338 var0, class_2680 var1, class_3959 var2, class_2338 var3) {
      long var4 = a ^ 53649158382427L;
      long var10001 = var4 ^ 5054903744614L;
      int var6 = (int)((var4 ^ 5054903744614L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);

      class_2680 var10000;
      label59: {
         try {
            Intrinsics.checkNotNullParameter(var2, true.b<invokedynamic>(14553, 9004758395123414950L ^ var4));
            Intrinsics.checkNotNullParameter(var3, true.b<invokedynamic>(9173, 407083095167937697L ^ var4));
            if (!var3.equals(var0)) {
               var10000 = class_2246.field_10124.method_9564();
               break label59;
            }
         } catch (NoSuchElementException var23) {
            throw var23.A<invokedynamic>(var23, -4733589999255492843L, var4);
         }

         var10000 = var1;
      }

      class_2680 var10 = var10000;
      Intrinsics.checkNotNull(var10);
      class_2680 var9 = var10;
      class_243 var25 = var2.method_17750();
      Intrinsics.checkNotNullExpressionValue(var25, true.b<invokedynamic>(12155, 2884757184653402126L ^ var4));
      class_243 var24 = var25;
      var25 = var2.method_17747();
      Intrinsics.checkNotNullExpressionValue(var25, true.b<invokedynamic>(26731, 4563157632523167535L ^ var4));
      class_243 var11 = var25;
      class_265 var26 = var2.method_17748(var9, (class_1922)s8.i((char)var6, var7, (short)var8), var3);
      Intrinsics.checkNotNullExpressionValue(var26, true.b<invokedynamic>(24422, 6533690131057168396L ^ var4));
      class_265 var12 = var26;
      class_3965 var13 = s8.i((char)var6, var7, (short)var8).method_17745(var24, var11, var3, var12, var9);
      var26 = class_259.method_1073();
      Intrinsics.checkNotNullExpressionValue(var26, true.b<invokedynamic>(12995, 1506981550549450155L ^ var4));
      class_265 var14 = var26;
      class_3965 var15 = var14.method_1092(var24, var11, var3);

      double var27;
      label51: {
         try {
            if (var13 == null) {
               var27 = Double.MAX_VALUE;
               break label51;
            }
         } catch (NoSuchElementException var22) {
            throw var22.A<invokedynamic>(var22, -4733589999255492843L, var4);
         }

         var27 = var2.method_17750().method_1025(var13.method_17784());
      }

      double var16 = var27;

      label43: {
         try {
            if (var15 == null) {
               var27 = Double.MAX_VALUE;
               break label43;
            }
         } catch (NoSuchElementException var21) {
            throw var21.A<invokedynamic>(var21, -4733589999255492843L, var4);
         }

         var27 = var2.method_17750().method_1025(var15.method_17784());
      }

      double var18 = var27;

      class_3965 var28;
      try {
         if (var16 <= var18) {
            var28 = var13;
            return var28;
         }
      } catch (NoSuchElementException var20) {
         throw var20.A<invokedynamic>(var20, -4733589999255492843L, var4);
      }

      var28 = var15;
      return var28;
   }

   private static final class_3965 s(class_3959 var0) {
      long var1 = a ^ 125015543174008L;
      Intrinsics.checkNotNullParameter(var0, true.b<invokedynamic>(19138, 8880440684018447785L ^ var1));
      class_243 var10000 = var0.method_17750().method_1020(var0.method_17747());
      Intrinsics.checkNotNullExpressionValue(var10000, true.b<invokedynamic>(31266, 83664774051071357L ^ var1));
      class_243 var3 = var10000;
      return class_3965.method_17778(var0.method_17747(), class_2350.method_10142(var3.field_1352, var3.field_1351, var3.field_1350), class_2338.method_49638((class_2374)var0.method_17747()));
   }

   private static final boolean F(class_1297 param0, class_1297 param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 115828015758144L;
      e = new HashMap(13);
      0.A<invokedynamic>(0, 7412109589114759090L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[56];
      int var16 = 0;
      String var15 = "Ës¾5¼\u0090CpáP\u007f\u0012\u009f\\Ä7ÜÜÓ\u008b]Åb%\u009d;\u0017áº·;©(þcåe\u0017«%÷eÀ\u0007\u009aöjBYC\u0003\u0088Viª\u0099Ø¿·l?Õ¹ÎW\u0016\u0010\u0015\u009b0:\u0016p\u0010oS\u009bÏ<\u0087MÅ\b«|b\u0095±\u0006W d\t\u0004M\u0086tMíF\u000bn\"CÈIp\u009dP\u0090\u008b\u000e)\u008b\u0086flwÏtVÍT\u0010E@Ñè Oq\u0095I\u007f_»3\u0095x-\u0010*L¹-µ\n«&Î%çTîÈÌ\u00830wèÔD4¥×X³À9\u0086;Ä#\u0081¥©Ã\u0091w\u0081Ç§ÅAÌ\u00048\u0016\u0095Ó÷mµ\u001fÖTû\u009aB×aË¤®¥\u0004\u0018/õ\bU\u0099Ï,ÎäÄ ÷Û¤*lG\u0011GC\u008e\u0019G¶ \u0019öG\u0083¦2bï\b!\u007fÏË§dä>Päõ©\u0086¼\u0096ÂE\u0006\u0092\u0088¼\u008aZ\u0018\u0080®£âüs©ávé\u0094l\u0085ô\u0085\u0089B93tu&7Þ\u0010Ôj0^§Ë ã\u0019s\u0000£×l»÷\u0010\u000bqÄ4Ó\u0016\u0013}¢O\u001aæ\u008a\u009a\u0007¸\u0018¦Êu\u0013úôÅGÊ¼\u009a9Mð;\u0004í\u0082Î=\u001aï:Õ\u0010\fCÅÒÔÞ×$AJLOB\u0016`«\u0010ëh\u0090s¿^¾\u001f-'Å)\u0080}\\þ &+¦´\u0001<T\u00102\u001bås~\u0097ÈG`®GÄ¬Î[9\u0092\u001eËä=\rë8 ×\u0082<x³6\u0012\u0093q\u001b&5O\u0095t\byi\u009d\u0019ë\u0013Ü\u008bHU°\u0018ª/÷H\u0010ny¾\f^%\u0097\u0004\tíÏIT!KÅ(c\u0012K\u008b.ÝfU\u009b\u0002ß\rÒ\u0085â\u001c+Ý\u0086ÈíÐò\u0013\u0091\u0015\u009e$\u0082<öñ¤¥ÓT\u008atË~ ÖÚïR\u009cµ;¦VØ37æ\u008e×¹êBëÆWÒõÌÞÇí¤\u0005.1\u0001(G\u000e½«6¶à\u009f7\u0010\u008a\u0019/Áýõ\u0099\u0016\u0010,\u0082w&Ì\u0005Fk\u000e®W\u0088i£Çü_\u0002 !\u0092\u0018Û\n\u0000ÂfZÈM½\u0007¦Dëû\u0089«\u009bë³Ì\u0089Ã\u009e&\u0010\u008fÕ\u0007Ö¹0\u000bb>\u0081$FH\u0082<6\u0010/ý\u008c\u008c±\u001eÀ\u001c\u0098µ\u0095¡Äb'O \u0087\u0018ñ÷Y\u0086¼ÅG¼\u000f+\u0084V\bý\u0005¤Å -pæo´~i¢\u008bIÑ¹\u0010ÿß(}]\u0081ãE0\u00ad/\u0085Wø°R\u0018Ô Ç´\u0002rÇá\u009cÉS\u0012Äh\u0003\u0081ÊS_Âã\u009e^\u0092 í\u0098´XÔ\u0015À\u0083wr\u00954`ó\u0090\f¥\u0085Å\u008f\u0080Ií©\u0081Ð¿\\\u001d\u0091\u0092' áÏÛT3ª´ç\u00ad°9!\u001d\u0084\u0083ÑíØ«´@-\\\u0098\u008dl\u009dÌ\u0011\u0095hâ(píÕ7±\u0013\u0085¿íí#CÏuâ\u009div\"å\u0015&+ãßÈÞï¡C\u001fàJ\u0006oã×M\"\u0095(Z\b\u0092\u0001Éñ0^&ª\u008a\"Ñú0ìõ\u001d\u00adÆ.\u008c\u008b\u001fö©ñ\u0012äFÓì\u0000û\u0092\u008e¨W W\u0018\u0001õ_\u001f*\u009d.\u0002î.³ \f)\u0013c-p¢ýÌLp\u008a \tDê\u0000§¾utq<|G\u0087VÿÖ°Q\u008b]|\u0005}\u009b\u0003Â\u0086Å~\u008d\u0093ë \u007fRúQ\u008a\u001a\u001eý\u009d\u009c\r¦\u0005\u0016\u001b#6uZÅ\u0093c\u0001\u0091\u009bÛ\u000f#\u008a\u001f\u0099Ê ÷Ý¢Ë\b÷¾vc§ãvOïøéE\u008fË¾ä¾\u009f\u00951\r8Uä\u0088Æ@0\u009f\u0083fï\u0096t\u000e\u0000ïA\u0084K0\u0006ñ\"\u009c\u008bñ\u0013Ù/@Dx?µM\u0017\u0091\u008a\u000eEþ\u008c\u0083«Ú\u0087Å\u009bÝ\u0005Ñ\t:\u0085y \u001e(\u0080/æ¡Ë7\u0001n0^\u0088[Ôï¥t\u0085{-.üÂêï\u000ezdLïm\u0010®OuíxU\u0011\u008bS\u0007[©\u008bßÛ\u0015(\u009fþ\u001f÷ü-\u008cu\\d\u0015\u001eã\u0094\u0089\u009fSo&\u009c\f\u0087*k\u0082G)ó8Û)\u0011ß/\b-[¹'$ ®È³*.ªx8}PØÙ(F[d\rð÷}è¥\u00109¥³o3\u0091Nh¨ \u0001\\&<»¯ÛÐ\u009b`ÄÉ¨\u0017\u008e®Ty·ìÁÎ»mÞq\u0091Ó´U\u008b\r\u0010J\u008e#¯À\u008f,Äc¥¿EÝ®¾?\u0018ó}J´\u008cä\u0004Gó\u001axÚ\u008e,mú±²³\u008bö\u0082<Ã\u0018\u0084SY\u0091\b?XÁ \u0088ý\u008a§m3\u0098Û`\r+±\u0092v\u0018 \u0094\u000b+)Ñi¼öBUó\u0011$Ðá¥J\u0091\u000bÒTa\u0081G\u009f¾\u0088\u0007\u0086\u0080\u0004\u008d ïDü\u00ad¨Ñß÷_&Bw£CÀ<.Kág.²ÐåßëË\u001cª\u0095\u0006±\u0010ß#[\u0081:°\u0014O\u008f\u0005Sðzï©A\u00184Ã'\u0013Î.a\u0098Ê£õ\u008eWÊ(.Ë¥\u000fî»\u0085&\u000f\u0010óm¼AÀ¬\u0001\u0007\u0092Àþ\nàéµ!\u0010)ý\u0002\u0005JXOYsÍ->\u008fI¿%\u0010\\WûâE7MU\u0005^ù¤Ð\u0099Oê\u0010ÃE\r\u0005QÝ\u009a\u0081A~u;¼Ç\u0012ê(`¥ÀImÿ14ñ\u0016¼Z\u0007\u009dC\u008a\u0012Ø;\f\u009fW\u0091U|%æD\u009d÷|\u0006²JëN\u008c\u001bÄ=\u0010n´,ñZq!iç 6Gª'µþ";
      int var17 = "Ës¾5¼\u0090CpáP\u007f\u0012\u009f\\Ä7ÜÜÓ\u008b]Åb%\u009d;\u0017áº·;©(þcåe\u0017«%÷eÀ\u0007\u009aöjBYC\u0003\u0088Viª\u0099Ø¿·l?Õ¹ÎW\u0016\u0010\u0015\u009b0:\u0016p\u0010oS\u009bÏ<\u0087MÅ\b«|b\u0095±\u0006W d\t\u0004M\u0086tMíF\u000bn\"CÈIp\u009dP\u0090\u008b\u000e)\u008b\u0086flwÏtVÍT\u0010E@Ñè Oq\u0095I\u007f_»3\u0095x-\u0010*L¹-µ\n«&Î%çTîÈÌ\u00830wèÔD4¥×X³À9\u0086;Ä#\u0081¥©Ã\u0091w\u0081Ç§ÅAÌ\u00048\u0016\u0095Ó÷mµ\u001fÖTû\u009aB×aË¤®¥\u0004\u0018/õ\bU\u0099Ï,ÎäÄ ÷Û¤*lG\u0011GC\u008e\u0019G¶ \u0019öG\u0083¦2bï\b!\u007fÏË§dä>Päõ©\u0086¼\u0096ÂE\u0006\u0092\u0088¼\u008aZ\u0018\u0080®£âüs©ávé\u0094l\u0085ô\u0085\u0089B93tu&7Þ\u0010Ôj0^§Ë ã\u0019s\u0000£×l»÷\u0010\u000bqÄ4Ó\u0016\u0013}¢O\u001aæ\u008a\u009a\u0007¸\u0018¦Êu\u0013úôÅGÊ¼\u009a9Mð;\u0004í\u0082Î=\u001aï:Õ\u0010\fCÅÒÔÞ×$AJLOB\u0016`«\u0010ëh\u0090s¿^¾\u001f-'Å)\u0080}\\þ &+¦´\u0001<T\u00102\u001bås~\u0097ÈG`®GÄ¬Î[9\u0092\u001eËä=\rë8 ×\u0082<x³6\u0012\u0093q\u001b&5O\u0095t\byi\u009d\u0019ë\u0013Ü\u008bHU°\u0018ª/÷H\u0010ny¾\f^%\u0097\u0004\tíÏIT!KÅ(c\u0012K\u008b.ÝfU\u009b\u0002ß\rÒ\u0085â\u001c+Ý\u0086ÈíÐò\u0013\u0091\u0015\u009e$\u0082<öñ¤¥ÓT\u008atË~ ÖÚïR\u009cµ;¦VØ37æ\u008e×¹êBëÆWÒõÌÞÇí¤\u0005.1\u0001(G\u000e½«6¶à\u009f7\u0010\u008a\u0019/Áýõ\u0099\u0016\u0010,\u0082w&Ì\u0005Fk\u000e®W\u0088i£Çü_\u0002 !\u0092\u0018Û\n\u0000ÂfZÈM½\u0007¦Dëû\u0089«\u009bë³Ì\u0089Ã\u009e&\u0010\u008fÕ\u0007Ö¹0\u000bb>\u0081$FH\u0082<6\u0010/ý\u008c\u008c±\u001eÀ\u001c\u0098µ\u0095¡Äb'O \u0087\u0018ñ÷Y\u0086¼ÅG¼\u000f+\u0084V\bý\u0005¤Å -pæo´~i¢\u008bIÑ¹\u0010ÿß(}]\u0081ãE0\u00ad/\u0085Wø°R\u0018Ô Ç´\u0002rÇá\u009cÉS\u0012Äh\u0003\u0081ÊS_Âã\u009e^\u0092 í\u0098´XÔ\u0015À\u0083wr\u00954`ó\u0090\f¥\u0085Å\u008f\u0080Ií©\u0081Ð¿\\\u001d\u0091\u0092' áÏÛT3ª´ç\u00ad°9!\u001d\u0084\u0083ÑíØ«´@-\\\u0098\u008dl\u009dÌ\u0011\u0095hâ(píÕ7±\u0013\u0085¿íí#CÏuâ\u009div\"å\u0015&+ãßÈÞï¡C\u001fàJ\u0006oã×M\"\u0095(Z\b\u0092\u0001Éñ0^&ª\u008a\"Ñú0ìõ\u001d\u00adÆ.\u008c\u008b\u001fö©ñ\u0012äFÓì\u0000û\u0092\u008e¨W W\u0018\u0001õ_\u001f*\u009d.\u0002î.³ \f)\u0013c-p¢ýÌLp\u008a \tDê\u0000§¾utq<|G\u0087VÿÖ°Q\u008b]|\u0005}\u009b\u0003Â\u0086Å~\u008d\u0093ë \u007fRúQ\u008a\u001a\u001eý\u009d\u009c\r¦\u0005\u0016\u001b#6uZÅ\u0093c\u0001\u0091\u009bÛ\u000f#\u008a\u001f\u0099Ê ÷Ý¢Ë\b÷¾vc§ãvOïøéE\u008fË¾ä¾\u009f\u00951\r8Uä\u0088Æ@0\u009f\u0083fï\u0096t\u000e\u0000ïA\u0084K0\u0006ñ\"\u009c\u008bñ\u0013Ù/@Dx?µM\u0017\u0091\u008a\u000eEþ\u008c\u0083«Ú\u0087Å\u009bÝ\u0005Ñ\t:\u0085y \u001e(\u0080/æ¡Ë7\u0001n0^\u0088[Ôï¥t\u0085{-.üÂêï\u000ezdLïm\u0010®OuíxU\u0011\u008bS\u0007[©\u008bßÛ\u0015(\u009fþ\u001f÷ü-\u008cu\\d\u0015\u001eã\u0094\u0089\u009fSo&\u009c\f\u0087*k\u0082G)ó8Û)\u0011ß/\b-[¹'$ ®È³*.ªx8}PØÙ(F[d\rð÷}è¥\u00109¥³o3\u0091Nh¨ \u0001\\&<»¯ÛÐ\u009b`ÄÉ¨\u0017\u008e®Ty·ìÁÎ»mÞq\u0091Ó´U\u008b\r\u0010J\u008e#¯À\u008f,Äc¥¿EÝ®¾?\u0018ó}J´\u008cä\u0004Gó\u001axÚ\u008e,mú±²³\u008bö\u0082<Ã\u0018\u0084SY\u0091\b?XÁ \u0088ý\u008a§m3\u0098Û`\r+±\u0092v\u0018 \u0094\u000b+)Ñi¼öBUó\u0011$Ðá¥J\u0091\u000bÒTa\u0081G\u009f¾\u0088\u0007\u0086\u0080\u0004\u008d ïDü\u00ad¨Ñß÷_&Bw£CÀ<.Kág.²ÐåßëË\u001cª\u0095\u0006±\u0010ß#[\u0081:°\u0014O\u008f\u0005Sðzï©A\u00184Ã'\u0013Î.a\u0098Ê£õ\u008eWÊ(.Ë¥\u000fî»\u0085&\u000f\u0010óm¼AÀ¬\u0001\u0007\u0092Àþ\nàéµ!\u0010)ý\u0002\u0005JXOYsÍ->\u008fI¿%\u0010\\WûâE7MU\u0005^ù¤Ð\u0099Oê\u0010ÃE\r\u0005QÝ\u009a\u0081A~u;¼Ç\u0012ê(`¥ÀImÿ14ñ\u0016¼Z\u0007\u009dC\u008a\u0012Ø;\f\u009fW\u0091U|%æD\u009d÷|\u0006²JëN\u008c\u001bÄ=\u0010n´,ñZq!iç 6Gª'µþ".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var23 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var23.getBytes("ISO-8859-1"));
            String var30 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var30;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[56];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[9];
                  int var3 = 0;
                  String var4 = "'¾ó\u0097x?ËÐ$\u0081\u009b¿ \u0089\u0091û\u001f¦bä\u00ad\u0085¡õ\u0092ÇB\u001a»d&FÈjErßS\n3t ËØ=\u0091\u0014Ððw:Ä}\u0093\u0096 ";
                  int var5 = "'¾ó\u0097x?ËÐ$\u0081\u009b¿ \u0089\u0091û\u001f¦bä\u00ad\u0085¡õ\u0092ÇB\u001a»d&FÈjErßS\n3t ËØ=\u0091\u0014Ððw:Ä}\u0093\u0096 ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var26 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var26[var28] = var35;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[9];
                              j = new ml();
                              Pair[] var22 = new Pair[true.u<invokedynamic>(11653, 2123674490159740278L ^ var20)];
                              var22[0] = TuplesKt.to(class_2350.field_11036, new class_2338(0, -1, 0));
                              var22[1] = TuplesKt.to(class_2350.field_11033, new class_2338(0, 1, 0));
                              var22[2] = TuplesKt.to(class_2350.field_11034, new class_2338(-1, 0, 0));
                              var22[3] = TuplesKt.to(class_2350.field_11039, new class_2338(1, 0, 0));
                              var22[4] = TuplesKt.to(class_2350.field_11043, new class_2338(0, 0, 1));
                              var22[5] = TuplesKt.to(class_2350.field_11035, new class_2338(0, 0, -1));
                              b = MapsKt.mapOf(var22);
                              G = (Map)(new LinkedHashMap());
                              class_243 var27 = class_243.field_1353;
                              Intrinsics.checkNotNullExpressionValue(var27, true.b<invokedynamic>(25666, 9106163607754126096L ^ var20));
                              L = var27;
                              return;
                           }
                           break;
                        default:
                           var26[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u001b\u00006¥Ø0Ï]¨kß\u001e>ftR";
                           var5 = "\u001b\u00006¥Ø0Ï]¨kß\u001e>ftR".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var26 = var6;
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

               var15 = "\u0002Ê\u0094nÑ\u008b\u0019\b\u0080Ýsî=p¾4iý¶\"\u001f`§Ü\u0010CY\u0083bVdw¹¹\u008bó1\u0013¹ÜN";
               var17 = "\u0002Ê\u0094nÑ\u008b\u0019\b\u0080Ýsî=p¾4iý¶\"\u001f`§Ü\u0010CY\u0083bVdw¹¹\u008bó1\u0013¹ÜN".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void v(int var0) {
      w = var0;
   }

   public static int U() {
      return w;
   }

   public static int t() {
      int var0 = U();

      try {
         return var0 == 0 ? 24 : 0;
      } catch (NoSuchElementException var1) {
         throw a(var1);
      }
   }

   private static NoSuchElementException a(NoSuchElementException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12423;
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
            throw new RuntimeException("su/catlean/ml", var10);
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
         throw new RuntimeException("su/catlean/ml" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32564;
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
            throw new RuntimeException("su/catlean/ml", var14);
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
         throw new RuntimeException("su/catlean/ml" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
