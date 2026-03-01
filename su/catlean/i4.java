package su.catlean;

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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_746;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.StopUsingItemEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.KeyMappingAccessor;
import su.catlean.mixins.accessors.LocalPlayerAccessor;

public final class i4 {
   @NotNull
   public static final i4 v;
   private static int h;
   private static float l;
   private static float X;
   private static boolean K;
   private static boolean y;
   private static long t;
   private static long W;
   private static long A;
   private static double Q;
   private static boolean b;
   private static int m;
   private static final long a = j0.a(5027626251710897574L, 2399695268485356754L, MethodHandles.lookup().lookupClass()).a(112116914750143L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;
   private static final long[] j;
   private static final Long[] k;
   private static final Map n;

   private i4() {
   }

   public final int e() {
      return h;
   }

   public final void Z(int <set-?>) {
      h = var1;
   }

   public final float h() {
      return l;
   }

   public final void l(float <set-?>) {
      l = var1;
   }

   public final float b() {
      return X;
   }

   public final void W(float <set-?>) {
      X = var1;
   }

   public final boolean P() {
      return K;
   }

   public final void o(boolean <set-?>) {
      K = var1;
   }

   public final boolean Z() {
      return y;
   }

   public final void W(boolean <set-?>) {
      y = var1;
   }

   public final long L() {
      return t;
   }

   public final void T(long <set-?>) {
      t = var1;
   }

   public final long f() {
      return W;
   }

   public final void F(long <set-?>) {
      W = var1;
   }

   public final long J() {
      return A;
   }

   public final void w(long <set-?>) {
      A = var1;
   }

   public final double s() {
      return Q;
   }

   public final void n(double <set-?>) {
      Q = var1;
   }

   public final boolean u() {
      return b;
   }

   public final void u(boolean <set-?>) {
      b = var1;
   }

   public final float V(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 38812638687752L;
      class_746 var10000 = s8.f(var3);
      Intrinsics.checkNotNull(var10000, true.t<invokedynamic>(28462, 5653109387134653661L ^ var1));
      return ((LocalPlayerAccessor)var10000).getLastYaw();
   }

   public final float C(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 12532809821717L;
      class_746 var10000 = s8.f(var3);
      Intrinsics.checkNotNull(var10000, true.t<invokedynamic>(12198, 6702219825748953183L ^ var1));
      return ((LocalPlayerAccessor)var10000).getLastPitch();
   }

   @NotNull
   public final class_243 a(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void Y(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void R(StopUsingItemEvent var1) {
      long var2 = a ^ 126522126430283L;
      long var4 = var2 ^ 45238229835139L;

      try {
         if (Intrinsics.areEqual((Object)s8.f(var4).method_6030().method_7909(), (Object)class_1802.field_8233)) {
            A = s8.Z();
         }

      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, -7003144544812315510L, var2);
      }
   }

   @Flow
   private final void p(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void s(TickEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void T(MoveEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final long l() {
      return System.currentTimeMillis() - t;
   }

   public final boolean Y(int param1, short param2, short param3) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final double[] U(float d, boolean moveFix, float forward, long a, float sideways, float yaw) {
      // $FF: Couldn't be decompiled
   }

   public static double[] H(i4 param0, float param1, boolean param2, float param3, float param4, float param5, int param6, long param7, Object param9) {
      // $FF: Couldn't be decompiled
   }

   public final void m(long a, @NotNull MoveEvent event, double d) {
      // $FF: Couldn't be decompiled
   }

   public final float W(char param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final double[] R(char a, short a, int a, double d) {
      long var6 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var10001 = var6 ^ 75796359213958L;
      int var8 = (int)((var6 ^ 75796359213958L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      class_746 var10000 = s8.H((short)var8, (short)var9, var10).field_1724;
      Intrinsics.checkNotNull(var10000);
      float var11 = var10000.method_36454();
      double var12 = var4 * Math.cos(Math.toRadians((double)(var11 + 90.0F)));
      double var14 = var4 * Math.sin(Math.toRadians((double)(var11 + 90.0F)));
      double[] var16 = new double[]{var12, var14};
      return var16;
   }

   @Nullable
   public final class_1297 f(float yaw, float pitch, float distance, long a, boolean ignoreWalls, boolean onlyLiving) {
      // $FF: Couldn't be decompiled
   }

   public static class_1297 Y(i4 var0, float var1, float var2, long var3, float var5, boolean var6, boolean var7, int var8, Object var9) {
      var3 ^= a;
      long var10 = var3 ^ 101650729201457L;
      int var12 = -4420624748726029950L.A<invokedynamic>(-4420624748726029950L, var3);

      int var10000;
      label20: {
         try {
            var10000 = var8 & true.j<invokedynamic>(17192, 8616948777572560467L ^ var3);
            if (var12 != 0) {
               break label20;
            }

            if (var10000 == 0) {
               return var0.f(var1, var2, var5, var10, var6, (boolean)var7);
            }
         } catch (NumberFormatException var13) {
            throw var13.A<invokedynamic>(var13, -4428249283961351986L, var3);
         }

         var10000 = 1;
      }

      var7 = var10000;
      return var0.f(var1, var2, var5, var10, var6, (boolean)var7);
   }

   @NotNull
   public final class_239 Q(float yaw, float pitch, double x, double y, long a, double z) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final class_243 b(float yaw, float pitch) {
      return new class_243((double)((float)Math.sin((double)(-var2 * 0.017453292F)) * (float)Math.cos((double)(var1 * 0.017453292F))), -((double)((float)Math.sin((double)(var1 * 0.017453292F)))), (double)((float)Math.cos((double)(-var2 * 0.017453292F)) * (float)Math.cos((double)(var1 * 0.017453292F))));
   }

   @NotNull
   public final class_239 u(float dst, float yaw, float pitch, long a, int a) {
      long var7 = (var4 << 32 | (long)var6 << 32 >>> 32) ^ a;
      long var10001 = var7 ^ 128723819054024L;
      int var9 = (int)((var7 ^ 128723819054024L) >>> 48);
      int var10 = (int)(var10001 << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var7 ^ 23128583898749L;
      class_243 var10000 = s8.f(var12).method_5836(1.0F);
      Intrinsics.checkNotNullExpressionValue(var10000, true.t<invokedynamic>(24117, 7770040064269636011L ^ var7));
      class_243 var14 = var10000;
      class_243 var15 = this.b(var3, var2);
      var10000 = var14.method_1031(var15.field_1352 * (double)var1, var15.field_1351 * (double)var1, var15.field_1350 * (double)var1);
      Intrinsics.checkNotNullExpressionValue(var10000, true.t<invokedynamic>(5124, 6342238339139410817L ^ var7));
      class_243 var16 = var10000;
      class_3965 var17 = s8.i((char)var9, var10, (short)var11).method_17742(new class_3959(var14, var16, class_3960.field_17559, class_242.field_1348, (class_1297)s8.f(var12)));
      Intrinsics.checkNotNullExpressionValue(var17, true.t<invokedynamic>(24326, 5539232594789421203L ^ var7));
      return (class_239)var17;
   }

   private final class_239 W(float var1, long var2, float var4, float var5, float var6, float var7, float var8) {
      var2 ^= a;
      long var10001 = var2 ^ 138532998708779L;
      int var9 = (int)((var2 ^ 138532998708779L) >>> 48);
      int var10 = (int)(var10001 << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var2 ^ 32871140572062L;
      class_243 var14 = new class_243((double)var6, (double)var7, (double)var8);
      class_243 var15 = this.b(var5, var4);
      class_243 var10000 = var14.method_1031(var15.field_1352 * (double)var1, var15.field_1351 * (double)var1, var15.field_1350 * (double)var1);
      Intrinsics.checkNotNullExpressionValue(var10000, true.t<invokedynamic>(1056, 6878204420201395777L ^ var2));
      class_243 var16 = var10000;
      class_3965 var17 = s8.i((char)var9, var10, (short)var11).method_17742(new class_3959(var14, var16, class_3960.field_17559, class_242.field_1348, (class_1297)s8.f(var12)));
      Intrinsics.checkNotNullExpressionValue(var17, true.t<invokedynamic>(24326, 5539223436349369712L ^ var2));
      return (class_239)var17;
   }

   public final double O(short param1, char param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final double i(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final float Y(long a, @NotNull class_1799 stack) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.t<invokedynamic>(552, 3531009752222392647L ^ var1));
      return (float)(var3.method_7936() - var3.method_7919()) / (float)var3.method_7936() * 100.0F;
   }

   public final float y(@NotNull class_243 targetPos, long a) {
      var2 ^= a;
      long var4 = var2 ^ 32769938561354L;
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(22438, 936343296938805782L ^ var2));
      return (float)Math.sqrt((double)this.z(var1, var4));
   }

   public final float z(@NotNull class_243 targetPos, long a) {
      // $FF: Couldn't be decompiled
   }

   public final boolean N(@NotNull class_243 pos, int fov, long a) {
      var3 ^= a;
      long var10001 = var3 ^ 128689085506578L;
      int var5 = (int)((var3 ^ 128689085506578L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      int var10000 = 1702589434951607428L.A<invokedynamic>(1702589434951607428L, var3);
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(26209, 1526981379399252826L ^ var3));
      double var9 = var1.method_10216() - s8.H((short)var5, (short)var6, var7).field_1773.method_19418().method_71156().field_1352;
      double var11 = var1.method_10215() - s8.H((short)var5, (short)var6, var7).field_1773.method_19418().method_71156().field_1350;
      int var8 = var10000;
      float var13 = class_3532.method_15393((float)class_3532.method_15338(Math.toDegrees(Math.atan2(var11, var9)) - 90.0D) - class_3532.method_15393(s8.H((short)var5, (short)var6, var7).field_1773.method_19418().method_19330()));

      label32: {
         try {
            double var15;
            var10000 = (var15 = Math.abs((double)var13) - (double)var2) == 0.0D ? 0 : (var15 < 0.0D ? -1 : 1);
            if (var8 != 0) {
               return (boolean)var10000;
            }

            if (var10000 <= 0) {
               break label32;
            }
         } catch (NumberFormatException var14) {
            throw var14.A<invokedynamic>(var14, 1697201306443630024L, var3);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   public final boolean S(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final class_243 A(float yaw, long a, float pitch, float distance) {
      // $FF: Couldn't be decompiled
   }

   public final float Z(char a, double x, double z, int a, int a) {
      // $FF: Couldn't be decompiled
   }

   public final float w(double x, long a, double z) {
      var3 ^= a;
      long var10001 = var3 ^ 124541283015225L;
      int var7 = (int)((var3 ^ 124541283015225L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      return (float)Math.sqrt((double)this.Z((char)var7, var1, var5, var8, var9));
   }

   public final void x(long param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final class_239 t(int a, double blockInteractionRange, double entityInteractionRange, float yaw, long a, float pitch) {
      // $FF: Couldn't be decompiled
   }

   private final class_239 f(class_239 param1, long param2, class_243 param4, double param5) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final class_239 Y(long a, double l, float yaw, float pitch) {
      var1 ^= a;
      long var10001 = var1 ^ 21384055267008L;
      int var7 = (int)((var1 ^ 21384055267008L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var1 ^ 126895068928885L;
      class_243 var10000 = this.b(var6, var5).method_1021(var3);
      Intrinsics.checkNotNullExpressionValue(var10000, true.t<invokedynamic>(1466, 7057596994894387001L ^ var1));
      class_243 var12 = var10000;
      class_3965 var13 = s8.i((char)var7, var8, (short)var9).method_17742(new class_3959(s8.f(var10).method_33571(), s8.f(var10).method_33571().method_1019(var12), class_3960.field_17559, class_242.field_1348, (class_1297)s8.f(var10)));
      Intrinsics.checkNotNullExpressionValue(var13, true.t<invokedynamic>(26266, 5315783161994785807L ^ var1));
      return (class_239)var13;
   }

   public final void q(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var10001 = var4 ^ 107927579363456L;
      int var6 = (int)((var4 ^ 107927579363456L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      s8.H((short)var6, (short)var7, var8).field_1690.field_1894.method_23481(false);
      s8.H((short)var6, (short)var7, var8).field_1690.field_1881.method_23481(false);
      s8.H((short)var6, (short)var7, var8).field_1690.field_1913.method_23481(false);
      s8.H((short)var6, (short)var7, var8).field_1690.field_1849.method_23481(false);
      s8.H((short)var6, (short)var7, var8).field_1690.field_1903.method_23481(false);
      s8.H((short)var6, (short)var7, var8).field_1690.field_1832.method_23481(false);
   }

   public final void B(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 4356844726804L;
      long var10001 = var1 ^ 134991348201573L;
      int var5 = (int)((var1 ^ 134991348201573L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      class_304 var10000 = s8.H((short)var5, (short)var6, var7).field_1690.field_1894;
      class_304 var8 = s8.H((short)var5, (short)var6, var7).field_1690.field_1894;
      Intrinsics.checkNotNull(var8, true.t<invokedynamic>(8400, 4234217613563076994L ^ var1));
      var10000.method_23481(_j.O(((KeyMappingAccessor)var8).getKey().method_1444(), var3));
      var10000 = s8.H((short)var5, (short)var6, var7).field_1690.field_1881;
      var8 = s8.H((short)var5, (short)var6, var7).field_1690.field_1881;
      Intrinsics.checkNotNull(var8, true.t<invokedynamic>(29534, 3694139723041042966L ^ var1));
      var10000.method_23481(_j.O(((KeyMappingAccessor)var8).getKey().method_1444(), var3));
      var10000 = s8.H((short)var5, (short)var6, var7).field_1690.field_1913;
      var8 = s8.H((short)var5, (short)var6, var7).field_1690.field_1913;
      Intrinsics.checkNotNull(var8, true.t<invokedynamic>(29534, 3694139723041042966L ^ var1));
      var10000.method_23481(_j.O(((KeyMappingAccessor)var8).getKey().method_1444(), var3));
      var10000 = s8.H((short)var5, (short)var6, var7).field_1690.field_1849;
      var8 = s8.H((short)var5, (short)var6, var7).field_1690.field_1849;
      Intrinsics.checkNotNull(var8, true.t<invokedynamic>(29534, 3694139723041042966L ^ var1));
      var10000.method_23481(_j.O(((KeyMappingAccessor)var8).getKey().method_1444(), var3));
      var10000 = s8.H((short)var5, (short)var6, var7).field_1690.field_1903;
      var8 = s8.H((short)var5, (short)var6, var7).field_1690.field_1903;
      Intrinsics.checkNotNull(var8, true.t<invokedynamic>(29534, 3694139723041042966L ^ var1));
      var10000.method_23481(_j.O(((KeyMappingAccessor)var8).getKey().method_1444(), var3));
      var10000 = s8.H((short)var5, (short)var6, var7).field_1690.field_1832;
      var8 = s8.H((short)var5, (short)var6, var7).field_1690.field_1832;
      Intrinsics.checkNotNull(var8, true.t<invokedynamic>(29534, 3694139723041042966L ^ var1));
      var10000.method_23481(_j.O(((KeyMappingAccessor)var8).getKey().method_1444(), var3));
   }

   private static final boolean G(boolean param0, class_1297 param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean o(class_1297 param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean C(class_1297 var0) {
      long var1 = a ^ 36955027869997L;
      int var10000 = 9188746358086945952L.A<invokedynamic>(9188746358086945952L, var1);
      Intrinsics.checkNotNullParameter(var0, true.t<invokedynamic>(11947, 5054674213633579951L ^ var1));
      int var3 = var10000;

      boolean var5;
      label32: {
         try {
            var5 = var0.method_7325();
            if (var3 != 0) {
               return var5;
            }

            if (!var5) {
               break label32;
            }
         } catch (NumberFormatException var4) {
            throw var4.A<invokedynamic>(var4, 9199032880218942956L, var1);
         }

         var5 = false;
         return var5;
      }

      var5 = true;
      return var5;
   }

   static {
      long var31 = a ^ 123482638376477L;
      e = new HashMap(13);
      37.A<invokedynamic>(37, -5697400976872881941L, var31);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[25];
      int var27 = 0;
      String var26 = "U\u008f\u0014\u0092\u0097\u0015Î¨\u0000/\u0017\u0086ô1\u0001\u008c(|ÞíÎ-³\u0093^ÿÌÄ=k\u0092s\u0095*\u008dzÕIo&p\u0087A´YÓ\u0098³ä\rHq½ÛC·\u0017\u0088f5\u001b,j\u001cLù\u0002QüÓ#ìç\u000e\u0080?8Ô3\u0010\u008cl\u0099Lt\u000f}{\u0096\u007fÜ\u0086æ\u008axÚÿÓÍÐÍ[ÔYñ\u0082ëÐPì+8.mN¦¹ÅÚÎ²ð\r>KÄc4nD\u00990h\u0013ìÂli\u008eZpByAAÅÎ7Ý¿\u009eíºÑ®Ö3ú{\u001e\u0089Á'\u009a¾§<& 'ºàÊ\u0087\u0084Sp$\u001a\u009b\u009d&â/\u0007\u0095öïè\u0090ß·R\u0085\u0018´;\u001f\u0014\u001f?ëüüöMom·\t\u0088!.2\bntEÒ\u0010à1\u0001\u0090¥\u0095.\u0005b\u009e\u0090BJ\r¡ý\u0010}\u0006ÇÜ{ÓÊ\u001f\u0086cùÚ\u0087Ý\u009e\u0013 ÝÃR\"Åyt{\u008f¯=\u0091ýÆ2Ã\u0007Êñ÷!å\u001dã5Å¹½¯q²Ò \u0014Æ¶¸\u0092ôSa|\u0006sy.v\u009aêõû²p\u0099Ì\u0091Îá\u0083²Ú¯Ê[\u001c òÈ¢Û,Nù\u0089\u001cÜ&\t\u0092J\u001e÷ý\u0082\u0081àýøþÎ¨\u000b~r\u0019\u008e$Æ Ð\u009c;½îM@Ï\u0003@\u0006p¸gP7¤2e£\u0006(qÛiR0\u00adÝ[\u0010\u0083\u0090û¹r:EÑ\u0084*=¸y7ÛÒm7kt\u009fv±Â\u0000qJ÷e%ßë8ò±h~'é\u00054T·\u0089A¿qµ\u0080ä¬$Þ\u0000þ)Ë7gì»õ£\u0097©\u0099{\u0093O\u0091ù\u0013\"É¦\u0017\bÐSÑ\u0086sÁª'Q7>\u008emò0\b>.\u0004T\u0000¦(T»¢AsE2\u008cÔð2\u009aØú\u0007p\u001a\u0018n\u008f\"(¿C\u001b%\u0018ãô@{7Ï\u00057HÚ\u0099\u009f±Dó\u0082Ò`á D\u009efiöçFEøDxÂGm6î\u00adN1á\u0012+°6ÈKf7\u0096\u001fËF\u0018h\u009aÈ¸8º\u008e\u001a=\u001fÆLVhér3oÔ\u000e\\¦\u0017Ö(t.\u0080\r^|Ø\u0007Ô´í,´¶l8ÃZc\u0019FJó\u0089\u008e\\\u0088\u0012üÅu@\u0006*¡\u001a\u0014Àë\u0011\u0018¢\u0015¥Ø+s Y}µ\u0010¿\u0081s\u0086Z:üÑö?\u000fÒÉ\u0010_{<Gb\u001cKQ\u0007Âgt\u0097\u0000\r°\u0080\u0091I\u0086è-ËV_JôN¤\u0015\u0085¹ÔàÅi«ùn{\u0011\u000eñJ¸Æ6<¯KÝà\u000e\u009fgK=ø\fàfÑÔ-ó?cÃyùÏì¢\u0099l:~èò1\u0003\u008b·Æ¨ñ&q\u0015\u009d\u0012\u0012ë\u007fOî\u0019ê¨\r\u001e\u0085ÄzÑUþ?3:d+\u0017\u0015Ê\u009e¼ñ:®\u0084O0AJì;\u00adÁ5\u0017Ï=\u0002¶%¥ðW]|A7i¢\u00181Ö³Ç\u001c%¦#Û×¥e_òõ\u0013]ë2Ì[\u0089Ü\u000b(\u000b\u0085À\u0007eP\u0007MD6¦zR\u0011Ù$A9\u0092è¦/\u000bð\u0007·#U9q¬Ë\u008do*pÊ\\\u0089¿(\u001a?\u0082\u0088\u008e\u008fõ·P|\u00ad,ªZ±,\u009d}ò\u0092\u0095á\u0099\u008d\u0086í\u0012\\\u0007_±\"\u008f\u008aV®¤Ñû\u001d\u0010,\u008f~p\u0090\u0006ûYÌ\u001aS®\u001eÃã0\u0098\u0013î\u000f\u0016\u0090¨\u008bÆÛÞp ³NY±j´Ú¯+\u009e\u001c\u0017ÞÅ¥\u008aÂzÕ\u0082A\u0012z(é^ÙÆ®Þß\u001eFjuYå\u000b.ý\u0084ÎX»^ý\u001bõ\"¡\u00824Q\u0087iª\u001d\u0018«F\u0091\u0086·+Ð\r¨õ½\u0007\u0002dÃ»¢%¬\bÍUT*Þ6\u001d\u0095£'ãlÎ·\u0016D\u0006ËÎd\u008aÙÉmÓÃ\u0006Ñ\u0013ô%\u008eO)n\u00adù\n=3]\u0093\u0090pô\u00985\u007f\u008c\u0011\u009b&¦8¾\u0082¶¿Ü$t\u0002\u0018ÉuÙîß: 4HHh\u001c$±6á\u0007«\u001c%#\u0092Y\u0098";
      int var28 = "U\u008f\u0014\u0092\u0097\u0015Î¨\u0000/\u0017\u0086ô1\u0001\u008c(|ÞíÎ-³\u0093^ÿÌÄ=k\u0092s\u0095*\u008dzÕIo&p\u0087A´YÓ\u0098³ä\rHq½ÛC·\u0017\u0088f5\u001b,j\u001cLù\u0002QüÓ#ìç\u000e\u0080?8Ô3\u0010\u008cl\u0099Lt\u000f}{\u0096\u007fÜ\u0086æ\u008axÚÿÓÍÐÍ[ÔYñ\u0082ëÐPì+8.mN¦¹ÅÚÎ²ð\r>KÄc4nD\u00990h\u0013ìÂli\u008eZpByAAÅÎ7Ý¿\u009eíºÑ®Ö3ú{\u001e\u0089Á'\u009a¾§<& 'ºàÊ\u0087\u0084Sp$\u001a\u009b\u009d&â/\u0007\u0095öïè\u0090ß·R\u0085\u0018´;\u001f\u0014\u001f?ëüüöMom·\t\u0088!.2\bntEÒ\u0010à1\u0001\u0090¥\u0095.\u0005b\u009e\u0090BJ\r¡ý\u0010}\u0006ÇÜ{ÓÊ\u001f\u0086cùÚ\u0087Ý\u009e\u0013 ÝÃR\"Åyt{\u008f¯=\u0091ýÆ2Ã\u0007Êñ÷!å\u001dã5Å¹½¯q²Ò \u0014Æ¶¸\u0092ôSa|\u0006sy.v\u009aêõû²p\u0099Ì\u0091Îá\u0083²Ú¯Ê[\u001c òÈ¢Û,Nù\u0089\u001cÜ&\t\u0092J\u001e÷ý\u0082\u0081àýøþÎ¨\u000b~r\u0019\u008e$Æ Ð\u009c;½îM@Ï\u0003@\u0006p¸gP7¤2e£\u0006(qÛiR0\u00adÝ[\u0010\u0083\u0090û¹r:EÑ\u0084*=¸y7ÛÒm7kt\u009fv±Â\u0000qJ÷e%ßë8ò±h~'é\u00054T·\u0089A¿qµ\u0080ä¬$Þ\u0000þ)Ë7gì»õ£\u0097©\u0099{\u0093O\u0091ù\u0013\"É¦\u0017\bÐSÑ\u0086sÁª'Q7>\u008emò0\b>.\u0004T\u0000¦(T»¢AsE2\u008cÔð2\u009aØú\u0007p\u001a\u0018n\u008f\"(¿C\u001b%\u0018ãô@{7Ï\u00057HÚ\u0099\u009f±Dó\u0082Ò`á D\u009efiöçFEøDxÂGm6î\u00adN1á\u0012+°6ÈKf7\u0096\u001fËF\u0018h\u009aÈ¸8º\u008e\u001a=\u001fÆLVhér3oÔ\u000e\\¦\u0017Ö(t.\u0080\r^|Ø\u0007Ô´í,´¶l8ÃZc\u0019FJó\u0089\u008e\\\u0088\u0012üÅu@\u0006*¡\u001a\u0014Àë\u0011\u0018¢\u0015¥Ø+s Y}µ\u0010¿\u0081s\u0086Z:üÑö?\u000fÒÉ\u0010_{<Gb\u001cKQ\u0007Âgt\u0097\u0000\r°\u0080\u0091I\u0086è-ËV_JôN¤\u0015\u0085¹ÔàÅi«ùn{\u0011\u000eñJ¸Æ6<¯KÝà\u000e\u009fgK=ø\fàfÑÔ-ó?cÃyùÏì¢\u0099l:~èò1\u0003\u008b·Æ¨ñ&q\u0015\u009d\u0012\u0012ë\u007fOî\u0019ê¨\r\u001e\u0085ÄzÑUþ?3:d+\u0017\u0015Ê\u009e¼ñ:®\u0084O0AJì;\u00adÁ5\u0017Ï=\u0002¶%¥ðW]|A7i¢\u00181Ö³Ç\u001c%¦#Û×¥e_òõ\u0013]ë2Ì[\u0089Ü\u000b(\u000b\u0085À\u0007eP\u0007MD6¦zR\u0011Ù$A9\u0092è¦/\u000bð\u0007·#U9q¬Ë\u008do*pÊ\\\u0089¿(\u001a?\u0082\u0088\u008e\u008fõ·P|\u00ad,ªZ±,\u009d}ò\u0092\u0095á\u0099\u008d\u0086í\u0012\\\u0007_±\"\u008f\u008aV®¤Ñû\u001d\u0010,\u008f~p\u0090\u0006ûYÌ\u001aS®\u001eÃã0\u0098\u0013î\u000f\u0016\u0090¨\u008bÆÛÞp ³NY±j´Ú¯+\u009e\u001c\u0017ÞÅ¥\u008aÂzÕ\u0082A\u0012z(é^ÙÆ®Þß\u001eFjuYå\u000b.ý\u0084ÎX»^ý\u001bõ\"¡\u00824Q\u0087iª\u001d\u0018«F\u0091\u0086·+Ð\r¨õ½\u0007\u0002dÃ»¢%¬\bÍUT*Þ6\u001d\u0095£'ãlÎ·\u0016D\u0006ËÎd\u008aÙÉmÓÃ\u0006Ñ\u0013ô%\u008eO)n\u00adù\n=3]\u0093\u0090pô\u00985\u007f\u008c\u0011\u009b&¦8¾\u0082¶¿Ü$t\u0002\u0018ÉuÙîß: 4HHh\u001c$±6á\u0007«\u001c%#\u0092Y\u0098".length();
      char var25 = 16;
      int var24 = -1;

      label72:
      while(true) {
         ++var24;
         String var33 = var26.substring(var24, var24 + var25);
         byte var10001 = -1;

         while(true) {
            byte[] var30 = var22.doFinal(var33.getBytes("ISO-8859-1"));
            String var39 = a(var30).intern();
            switch(var10001) {
            case 0:
               var29[var27++] = var39;
               if ((var24 += var25) >= var28) {
                  c = var29;
                  d = new String[25];
                  i = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[8];
                  int var14 = 0;
                  String var15 = "9Ó2ã¿´í®¤é\u001am\u0003í«¹^zªÄ%Ãö\u0092\u0013\u008aO1g;CMê×\u008cyë w\u0096Jùúáeý¾\u0006";
                  int var16 = "9Ó2ã¿´í®¤é\u001am\u0003í«¹^zªÄ%Ãö\u0092\u0013\u008aO1g;CMê×\u008cyë w\u0096Jùúáeý¾\u0006".length();
                  int var13 = 0;

                  label54:
                  while(true) {
                     int var37 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var37, var13).getBytes("ISO-8859-1");
                     long[] var36 = var17;
                     var37 = var14++;
                     long var41 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var19 = var41;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var44 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var42) {
                        case 0:
                           var36[var37] = var44;
                           if (var13 >= var16) {
                              f = var17;
                              g = new Integer[8];
                              n = new HashMap(13);
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var31 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var6 = new long[3];
                              int var3 = 0;
                              String var4 = "ÁÜ\n\u009e~\u0086ê\u0019L\u0084A¾\u0016\u008eË\u0006\"ýþ×;\u0002 e";
                              int var5 = "ÁÜ\n\u009e~\u0086ê\u0019L\u0084A¾\u0016\u008eË\u0006\"ýþ×;\u0002 e".length();
                              int var2 = 0;

                              do {
                                 var37 = var2;
                                 var2 += 8;
                                 byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                 var37 = var3++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var45 = true;
                                 var6[var37] = var44;
                              } while(var2 < var5);

                              j = var6;
                              k = new Long[3];
                              v = new i4();
                              t = true.k<invokedynamic>(21198, 8916925267918447085L ^ var31);
                              W = true.k<invokedynamic>(19346, 1135670871803558067L ^ var31);
                              A = true.k<invokedynamic>(19346, 1135670871803558067L ^ var31);
                              return;
                           }
                           break;
                        default:
                           var36[var37] = var44;
                           if (var13 < var16) {
                              continue label54;
                           }

                           var15 = "18\u007f\u0015¡b»ô¥;O\u0089ty\u0083\u009e";
                           var16 = "18\u007f\u0015¡b»ô¥;O\u0089ty\u0083\u009e".length();
                           var13 = 0;
                        }

                        var37 = var13;
                        var13 += 8;
                        var18 = var15.substring(var37, var13).getBytes("ISO-8859-1");
                        var36 = var17;
                        var37 = var14++;
                        var41 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var42 = 0;
                     }
                  }
               }

               var25 = var26.charAt(var24);
               break;
            default:
               var29[var27++] = var39;
               if ((var24 += var25) < var28) {
                  var25 = var26.charAt(var24);
                  continue label72;
               }

               var26 = "êH&\b\u0011¦XÉ\u0091'p\"æhïÃ\u0012!Ù\u001c&B\u0002~Ç\tn¢#£\u0089\u000b\u00920\f/ÔMfê\u009e£t|ù\t~\u0012X¦r\u0095\u000b\u009c@á \u0017÷Á\u009don[îß®ZÚR°d£NF6\u001fìXÙ'ñÙu\u0089\u0016ò:ª";
               var28 = "êH&\b\u0011¦XÉ\u0091'p\"æhïÃ\u0012!Ù\u001c&B\u0002~Ç\tn¢#£\u0089\u000b\u00920\f/ÔMfê\u009e£t|ù\t~\u0012X¦r\u0095\u000b\u009c@á \u0017÷Á\u009don[îß®ZÚR°d£NF6\u001fìXÙ'ñÙu\u0089\u0016ò:ª".length();
               var25 = '8';
               var24 = -1;
            }

            ++var24;
            var33 = var26.substring(var24, var24 + var25);
            var10001 = 0;
         }
      }
   }

   public static void v(int var0) {
      m = var0;
   }

   public static int D() {
      return m;
   }

   public static int H() {
      int var0 = D();

      try {
         return var0 == 0 ? 101 : 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3044;
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
            throw new RuntimeException("su/catlean/i4", var10);
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
         throw new RuntimeException("su/catlean/i4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28336;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/i4", var14);
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
         throw new RuntimeException("su/catlean/i4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 766;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/i4", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         k[var3] = var15;
      }

      return k[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/i4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
