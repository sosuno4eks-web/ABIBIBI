package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import net.minecraft.class_10185;
import net.minecraft.class_1297;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_3532;
import net.minecraft.class_744;
import net.minecraft.class_746;
import net.minecraft.class_2828.class_2830;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.EventPlayerTravel;
import su.catlean.api.event.events.player.EventPostPlayerTravel;
import su.catlean.api.event.events.player.FixVelocityEvent;
import su.catlean.api.event.events.player.JumpEvent;
import su.catlean.api.event.events.player.KeyboardInputEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PostInteractItemEvent;
import su.catlean.api.event.events.player.PostSyncEvent;
import su.catlean.api.event.events.player.PreInteractItemEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.render.LookRenderEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.world.FireWorkVectorEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.ClientInputAccessor;

public final class x7 implements zh {
   @NotNull
   public static final x7 Z;
   @NotNull
   private static ArrayList E;
   @NotNull
   private static ArrayList o;
   @NotNull
   private static qq D;
   @Nullable
   private static qq u;
   @Nullable
   private static qq b;
   @Nullable
   private static qq q;
   @Nullable
   private static qq j;
   @Nullable
   private static rx Q;
   @Nullable
   private static rx h;
   private static float p;
   private static float k;
   private static float s;
   private static int[] J;
   private static final long a = j0.a(1955880277496908315L, 6865525216097480555L, MethodHandles.lookup().lookupClass()).a(98020518491579L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private x7() {
   }

   @Nullable
   public final qq n() {
      return b;
   }

   public final void P(@Nullable qq <set-?>) {
      b = var1;
   }

   @Nullable
   public final qq M() {
      return q;
   }

   public final void d(@Nullable qq <set-?>) {
      q = var1;
   }

   public final void l(long a, @NotNull rx sequence) {
      var1 ^= a;
      long var4 = var1 ^ 23522302682959L;
      Intrinsics.checkNotNullParameter(var3, true.c<invokedynamic>(14303, 3426206465141112287L ^ var1));
      k6.Y.m(var4);
      E.add(var3);
   }

   public final void o(@NotNull rx sequence, long a) {
      var2 ^= a;
      long var4 = var2 ^ 114251679241268L;
      Intrinsics.checkNotNullParameter(var1, true.c<invokedynamic>(7573, 986585147075503336L ^ var2));
      k6.Y.m(var4);
      o.add(var1);
   }

   public final void j(long a, @NotNull qq rotation, int priority) {
      var1 ^= a;
      long var5 = var1 ^ 70945199606411L;
      long var7 = var1 ^ 20809767065971L;
      Intrinsics.checkNotNullParameter(var3, true.c<invokedynamic>(21103, 5368437499114514000L ^ var1));
      k6.Y.m(var7);
      E.add(new rx(var5, var3, var4, x7::U));
   }

   public static void W(x7 var0, qq var1, long var2, int var4, int var5, Object var6) {
      var2 ^= a;
      long var7 = var2 ^ 30021467912073L;
      int var9 = 5634204383597886740L.A<invokedynamic>(5634204383597886740L, var2);

      label21: {
         int var10000;
         label20: {
            try {
               var10000 = var5 & 2;
               if (var9 != 0) {
                  break label20;
               }

               if (var10000 == 0) {
                  break label21;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, 5621759614124665757L, var2);
            }

            var10000 = 21814.y<invokedynamic>(21814, 6637809883824850062L ^ var2);
         }

         var4 = var10000;
      }

      var0.j(var7, var1, var4);
   }

   @NotNull
   public final qq b(boolean clientSide, long a) {
      // $FF: Couldn't be decompiled
   }

   public static qq x(x7 var0, boolean var1, int var2, long var3, Object var5) {
      var3 ^= a;
      long var6 = var3 ^ 110190577011708L;
      int var8 = 2733031315875337929L.A<invokedynamic>(2733031315875337929L, var3);

      int var10000;
      label20: {
         try {
            var10000 = var2 & 1;
            if (var8 != 0) {
               break label20;
            }

            if (var10000 == 0) {
               return var0.b((boolean)var1, var6);
            }
         } catch (NumberFormatException var9) {
            throw var9.A<invokedynamic>(var9, 2727380494768521280L, var3);
         }

         var10000 = 0;
      }

      var1 = var10000;
      return var0.b((boolean)var1, var6);
   }

   @Flow(
      priority = 20
   )
   private final void b(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = -20
   )
   private final void H(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = 20
   )
   private final void C(PreSyncEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = -20
   )
   private final void Y(PostSyncEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void v(LookRenderEvent var1) {
      long var2 = a ^ 61712314741106L;
      long var4 = var2 ^ 16877587046844L;
      int var6 = -5341117023614643026L.A<invokedynamic>(-5341117023614643026L, var2);

      qq var10000;
      label26: {
         try {
            var10000 = b;
            if (var6 == 0) {
               break label26;
            }

            if (var10000 == null) {
               return;
            }
         } catch (NumberFormatException var8) {
            throw var8.A<invokedynamic>(var8, -5388921385561272145L, var2);
         }

         var10000 = q;
      }

      try {
         if (var10000 != null) {
            p = var1.getBodyYaw();
            gk var10001 = gk.E;
            qq var10002 = q;
            Intrinsics.checkNotNull(var10002);
            float var9 = var10002.M();
            qq var10003 = b;
            Intrinsics.checkNotNull(var10003);
            var1.setBodyYaw(class_3532.method_15393(var10001.i(var9, var10003.M(), q1.A.s(var4))));
            var1.setYaw(0.0F);
            var10001 = gk.E;
            var10002 = q;
            Intrinsics.checkNotNull(var10002);
            var9 = var10002.C();
            var10003 = b;
            Intrinsics.checkNotNull(var10003);
            var1.setPitch(class_3532.method_15393(var10001.i(var9, var10003.C(), q1.A.s(var4))));
         }
      } catch (NumberFormatException var7) {
         throw var7.A<invokedynamic>(var7, -5388921385561272145L, var2);
      }

   }

   @Flow
   private final void L(JumpEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void p(FixVelocityEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void W(KeyboardInputEvent var1) {
      long var2 = a ^ 131474217206314L;
      long var4 = var2 ^ 82638125270331L;
      long var6 = var2 ^ 106604223200349L;
      if (this.V(var6)) {
         float var8 = s8.f(var4).field_3913.method_3128().field_1342;
         float var9 = s8.f(var4).field_3913.method_3128().field_1343;
         float var10 = s8.f(var4).method_36454();
         qq var10001 = u;
         Intrinsics.checkNotNull(var10001);
         float var11 = (var10 - var10001.M()) * 0.017453292F;
         float var12 = (float)Math.cos((double)var11);
         float var13 = (float)Math.sin((double)var11);
         float var14 = (float)MathKt.roundToInt(var8 * var12 + var9 * var13);
         float var15 = (float)MathKt.roundToInt(var9 * var12 - var8 * var13);

         class_744 var10000;
         class_10185 var17;
         class_10185 var10002;
         boolean var10003;
         label39: {
            try {
               var10000 = s8.f(var4).field_3913;
               Intrinsics.checkNotNull(var10000, true.c<invokedynamic>(512, 6022562750089514182L ^ var2));
               ((ClientInputAccessor)var10000).setMoveVector(new class_241(var15, var14));
               var10000 = s8.f(var4).field_3913;
               var17 = new class_10185;
               var10002 = var17;
               if (var14 > 0.0F) {
                  var10003 = true;
                  break label39;
               }
            } catch (NumberFormatException var16) {
               throw var16.A<invokedynamic>(var16, 463584057746777079L, var2);
            }

            var10003 = false;
         }

         var10002.<init>(var10003, var14 < 0.0F, var15 > 0.0F, var15 < 0.0F, s8.f(var4).field_3913.field_54155.comp_3163(), s8.f(var4).field_3913.field_54155.comp_3164(), ip.f.n() ? false : s8.f(var4).field_3913.field_54155.comp_3165());
         var10000.field_54155 = var17;
      }

   }

   @Flow
   private final void T(PreInteractItemEvent var1) {
      long var2 = a ^ 101941164186405L;
      long var4 = var2 ^ 105607020977204L;
      long var6 = var2 ^ 50788413468996L;
      k = s8.f(var4).method_36454();
      s = s8.f(var4).method_36455();
      qq var8 = this.b(true, var6);
      s8.f(var4).method_36456(var8.M());
      s8.f(var4).method_36457(var8.C());
   }

   @Flow
   private final void u(PostInteractItemEvent var1) {
      long var2 = a ^ 135187223849262L;
      long var4 = var2 ^ 77275864051263L;
      s8.f(var4).method_36456(k);
      s8.f(var4).method_36457(s);
   }

   private final boolean V(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean N(int param1, char param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void F(EventPlayerTravel param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void d(EventPostPlayerTravel param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void D(FireWorkVectorEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void B(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final float C(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void I(long a, float yaw, float pitch) {
      var1 ^= a;
      long var5 = var1 ^ 36646202193381L;
      class_746 var7 = s8.f(var5);
      boolean var8 = false;
      var7.field_3944.method_52787((class_2596)(new class_2830(var7.method_23317(), var7.method_23318(), var7.method_23321(), var3, var4, var7.method_24828(), var7.field_5976)));
   }

   @NotNull
   public final qq I(long a, @NotNull class_243 to) {
      var1 ^= a;
      long var4 = var1 ^ 89303865794828L;
      long var6 = var1 ^ 50720400435197L;
      long var8 = var1 ^ 115132440849950L;
      long var10 = var1 ^ 98519851891910L;
      long var12 = var1 ^ 125003695759579L;
      Intrinsics.checkNotNullParameter(var3, true.c<invokedynamic>(17091, 1971677871878711349L ^ var1));
      double var14 = class_3532.method_15338(Math.toDegrees(Math.atan2(var3.field_1350 - s8.f(var4).method_23321(), var3.field_1352 - s8.f(var4).method_23317())) - (double)true.y<invokedynamic>(13060, 35932569351425760L ^ var1) - (double)i4.v.V(var10));
      double var16 = -Math.toDegrees(Math.atan2(var3.field_1351 - (k6.Y.W(var8, (class_1297)s8.f(var4)).field_1351 + (double)s8.f(var4).method_18381(s8.f(var4).method_18376())), Math.hypot(var3.field_1352 - s8.f(var4).method_23317(), var3.field_1350 - s8.f(var4).method_23321()))) - (double)i4.v.C(var12);
      double var18 = (double)i4.v.V(var10) + var14;
      double var20 = (double)i4.v.C(var12) + var16;
      return new qq((float)var18, (float)var20, var6, false, (bc)null, true.y<invokedynamic>(4179, 6029994966115036597L ^ var1), (DefaultConstructorMarker)null);
   }

   private final class_243 R(float param1, long param2, class_243 param4, float param5) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit U() {
      return Unit.INSTANCE;
   }

   private static final boolean H(rx param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean s(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = a ^ 113329540832312L;
      long var22 = var20 ^ 40342415891928L;
      int[] var10000 = new int[1];
      e = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -7444075511158315187L, var20);
      Cipher var11;
      Cipher var24 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var24.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[8];
      int var16 = 0;
      String var15 = "\u001b#J«¢\u009e\u0001IQ\u0017HµÌ\u009b4Î\u0012¨bG¬ö[Ã\u0010Ë\u0083(\u0000?:\u0096?7a.~\u0001ë}Â\u0088\u0086t\"¹·3^\u0005\u001eß\u0000\u0089\u00815\u0019æüÌºð©\u0007µ\u009d\u0086\u0081\u0091¿Oó<-³\u0010ÍU£\u001a9\u0017CQ¢ÿ&EF\u008d\u001e\u009ex\u0004@\b\u0015¼Î\u0080ft¯\u009aCÄØ£¯ÉÍÏ\u0098#*ÿreïO\f´\u0081\u0082ê5\u0089£t\u007fRhKÆ\u0099rþâñ\u001e\u0087ß;áÞÍS0\u00934 «vÓÂ\fó\u00947\u001f\u000b|[u\bÚºMD³Èÿ\u0005pT'ß@\u0018GÇ\u0011`\u0013 :\u0098 \u0014Ó¥M½«ì\u0084\u0087x\u0005PÙ~Ø Gmv\u0082«èÝ%\u008e\u009eÍxµ(\u0090m¬aÏ?\u008aAÌH\u00ad«çî4¯î \u0010§®ëÍ<ÒÓQûú\u000eAÐY\u009a\u000b";
      int var17 = "\u001b#J«¢\u009e\u0001IQ\u0017HµÌ\u009b4Î\u0012¨bG¬ö[Ã\u0010Ë\u0083(\u0000?:\u0096?7a.~\u0001ë}Â\u0088\u0086t\"¹·3^\u0005\u001eß\u0000\u0089\u00815\u0019æüÌºð©\u0007µ\u009d\u0086\u0081\u0091¿Oó<-³\u0010ÍU£\u001a9\u0017CQ¢ÿ&EF\u008d\u001e\u009ex\u0004@\b\u0015¼Î\u0080ft¯\u009aCÄØ£¯ÉÍÏ\u0098#*ÿreïO\f´\u0081\u0082ê5\u0089£t\u007fRhKÆ\u0099rþâñ\u001e\u0087ß;áÞÍS0\u00934 «vÓÂ\fó\u00947\u001f\u000b|[u\bÚºMD³Èÿ\u0005pT'ß@\u0018GÇ\u0011`\u0013 :\u0098 \u0014Ó¥M½«ì\u0084\u0087x\u0005PÙ~Ø Gmv\u0082«èÝ%\u008e\u009eÍxµ(\u0090m¬aÏ?\u008aAÌH\u00ad«çî4¯î \u0010§®ëÍ<ÒÓQûú\u000eAÐY\u009a\u000b".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var25 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var31 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var31;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[8];
                  i = new HashMap(13);
                  Cipher var0;
                  var24 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var24.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "À\u009eÃ\u0005P\u0007ïaøYî»E*{^";
                  int var5 = "À\u009eÃ\u0005P\u0007ïaøYî»E*{^".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var29 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                     long[] var28 = var6;
                     var29 = var3++;
                     long var33 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var34 = -1;

                     while(true) {
                        long var8 = var33;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var36 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var34) {
                        case 0:
                           var28[var29] = var36;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[4];
                              Z = new x7();
                              E = new ArrayList();
                              o = new ArrayList();
                              D = new qq(0.0F, 0.0F, var22, false, (bc)null, true.y<invokedynamic>(4179, 6029988847125993360L ^ var20), (DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var28[var29] = var36;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0095\u008e\u001f8C¿v\u0092ð\u0006 Ô\u0017º\u001dÒ";
                           var5 = "\u0095\u008e\u001f8C¿v\u0092ð\u0006 Ô\u0017º\u001dÒ".length();
                           var2 = 0;
                        }

                        var29 = var2;
                        var2 += 8;
                        var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                        var28 = var6;
                        var29 = var3++;
                        var33 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var34 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var31;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = ":\u0010g:Úô\u001bÒ*\u0015ER\tb\u009eÁÓæXóJ[ûGzüB\u000b\u0097ÌT|\u0010^\u001arÆ!=É\u001b©þÕ¶¤7\u008aÆ";
               var17 = ":\u0010g:Úô\u001bÒ*\u0015ER\tb\u009eÁÓæXóJ[ûGzüB\u000b\u0097ÌT|\u0010^\u001arÆ!=É\u001b©þÕ¶¤7\u008aÆ".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var25 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void H(int[] var0) {
      J = var0;
   }

   public static int[] i() {
      return J;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18933;
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
            throw new RuntimeException("su/catlean/x7", var10);
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
         throw new RuntimeException("su/catlean/x7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7904;
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
            throw new RuntimeException("su/catlean/x7", var14);
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
         throw new RuntimeException("su/catlean/x7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
