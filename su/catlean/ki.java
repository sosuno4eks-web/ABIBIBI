package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.EventPlayerTravel;
import su.catlean.api.event.events.player.EventPostPlayerTravel;
import su.catlean.api.event.events.player.FallFlyingEvent;
import su.catlean.api.event.events.player.JumpEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.player.ShouldStopSprintingEvent;
import su.catlean.gofra.Flow;

public final class ki extends k9 {
   @NotNull
   public static final ki N;
   static final KProperty[] I;
   @NotNull
   private static final zo o;
   @NotNull
   private static final zo c;
   @NotNull
   private static final zr C;
   @NotNull
   private static final zo A;
   @NotNull
   private static final zo x;
   @NotNull
   private static final zc s;
   @NotNull
   private static final zo Q;
   private static float l;
   private static float y;
   private static float V;
   private static float b;
   private static float P;
   private static boolean X;
   private static boolean K;
   private static boolean u;
   private static boolean e;
   private static int f;
   @NotNull
   private static final Queue R;
   @NotNull
   private static final Queue n;
   @NotNull
   private static final LinkedList d;
   @NotNull
   private static final LinkedList m;
   private static boolean Y;
   private static double k;
   private static final long g = j0.a(5041038046816220744L, 643401103599078007L, MethodHandles.lookup().lookupClass()).a(113611936630876L);
   private static final String[] i;
   private static final String[] q;
   private static final Map r;
   private static final long[] t;
   private static final Integer[] v;
   private static final Map w;

   private ki(long var1) {
      var1 ^= g;
      long var3 = var1 ^ 130582915463394L;
      super(var3, true.w<invokedynamic>(30335, 3392783551035403719L ^ var1), pa.E(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean L(int var1, char var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ g;
      long var10001 = var4 ^ 127955906199241L;
      int var6 = (int)((var4 ^ 127955906199241L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)o.k((short)var6, this, I[0], (short)var7, var8);
   }

   private final void P(long var1, boolean var3) {
      var1 ^= g;
      long var10001 = var1 ^ 68406279489399L;
      int var4 = (int)((var1 ^ 68406279489399L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      o.P(this, var4, I[0], (short)var5, var3, (short)var6);
   }

   private final boolean t(long var1) {
      var1 ^= g;
      long var10001 = var1 ^ 13711002911394L;
      int var3 = (int)((var1 ^ 13711002911394L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)c.k((short)var3, this, I[1], (short)var4, var5);
   }

   private final void t(boolean var1, long var2) {
      var2 ^= g;
      long var10001 = var2 ^ 117659524467458L;
      int var4 = (int)((var2 ^ 117659524467458L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      c.P(this, var4, I[1], (short)var5, var1, (short)var6);
   }

   private final xe M(long var1) {
      var1 ^= g;
      long var10001 = var1 ^ 121553020620969L;
      int var3 = (int)((var1 ^ 121553020620969L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (xe)C.k((short)var3, this, I[2], (short)var4, var5);
   }

   private final void m(long var1, xe var3) {
      var1 ^= g;
      long var10001 = var1 ^ 129721027109208L;
      int var4 = (int)((var1 ^ 129721027109208L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      C.P(this, var4, I[2], (short)var5, var3, (short)var6);
   }

   private final boolean I(long var1) {
      var1 ^= g;
      long var10001 = var1 ^ 63614643817751L;
      int var3 = (int)((var1 ^ 63614643817751L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)A.k((short)var3, this, I[3], (short)var4, var5);
   }

   private final void i(boolean var1, long var2) {
      var2 ^= g;
      long var10001 = var2 ^ 46339281367297L;
      int var4 = (int)((var2 ^ 46339281367297L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      A.P(this, var4, I[3], (short)var5, var1, (short)var6);
   }

   private final boolean S(long var1) {
      var1 ^= g;
      long var10001 = var1 ^ 65307955329192L;
      int var3 = (int)((var1 ^ 65307955329192L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)x.k((short)var3, this, I[4], (short)var4, var5);
   }

   private final void h(boolean var1, long var2) {
      var2 ^= g;
      long var10001 = var2 ^ 10198183101028L;
      int var4 = (int)((var2 ^ 10198183101028L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      x.P(this, var4, I[4], (short)var5, var1, (short)var6);
   }

   private final float h(int var1, char var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ g;
      long var10001 = var4 ^ 20764295300328L;
      int var6 = (int)((var4 ^ 20764295300328L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)s.k((short)var6, this, I[5], (short)var7, var8)).floatValue();
   }

   private final void z(float var1, long var2) {
      var2 ^= g;
      long var10001 = var2 ^ 78269577568304L;
      int var4 = (int)((var2 ^ 78269577568304L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      s.P(this, var4, I[5], (short)var5, var1, (short)var6);
   }

   private final boolean m(long var1) {
      var1 ^= g;
      long var10001 = var1 ^ 115443931893553L;
      int var3 = (int)((var1 ^ 115443931893553L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)Q.k((short)var3, this, I[true.b<invokedynamic>(26643, 8132734675105667207L ^ var1)], (short)var4, var5);
   }

   private final void z(int var1, boolean var2, long var3) {
      long var5 = ((long)var1 << 32 | var3 << 32 >>> 32) ^ g;
      long var10001 = var5 ^ 69944327417438L;
      int var7 = (int)((var5 ^ 69944327417438L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      Q.P(this, var7, I[true.b<invokedynamic>(6774, 7394704352385039251L ^ var5)], (short)var8, var2, (short)var9);
   }

   public void n(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = -10
   )
   private final void y(PreElytraEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = -10
   )
   private final void I(AfterElytraEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void k(@NotNull EventPlayerTravel e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void h(@NotNull EventPostPlayerTravel e) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = -10
   )
   private final void c(JumpEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void A(FallFlyingEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void b(ShouldStopSprintingEvent var1) {
      long var2 = g ^ 77333618182430L;
      long var4 = var2 ^ 130756553553110L;

      try {
         if (this.Q(var4)) {
            var1.cancel();
         }

      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, -5518423925346502974L, var2);
      }
   }

   @Flow
   private final void M(SetPoseEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void O(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void Z(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void G(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   private final double Y(double var1) {
      return var1 - Math.floor(var1);
   }

   public void a(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean W(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean Q(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean O(int a, long a, @NotNull class_1799 s) {
      // $FF: Couldn't be decompiled
   }

   private final boolean T(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void A(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void x(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void r(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void V(long param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean U() {
      long var0 = g ^ 120982675112298L;
      long var10001 = var0 ^ 44634814074238L;
      int var2 = (int)((var0 ^ 44634814074238L) >>> 32);
      int var3 = (int)(var10001 << 32 >>> 48);
      int var4 = (int)(var10001 << 48 >>> 48);
      return N.L(var2, (char)var3, (short)var4);
   }

   private static final boolean J() {
      long var0 = g ^ 71687170373606L;
      long var10001 = var0 ^ 8396043467762L;
      int var2 = (int)((var0 ^ 8396043467762L) >>> 32);
      int var3 = (int)(var10001 << 32 >>> 48);
      int var4 = (int)(var10001 << 48 >>> 48);
      return N.L(var2, (char)var3, (short)var4);
   }

   private static final boolean C() {
      long var0 = g ^ 132514392923651L;
      long var10001 = var0 ^ 68261160047127L;
      int var2 = (int)((var0 ^ 68261160047127L) >>> 32);
      int var3 = (int)(var10001 << 32 >>> 48);
      int var4 = (int)(var10001 << 48 >>> 48);
      k9[] var5 = -6552149994837124656L.A<invokedynamic>(-6552149994837124656L, var0);

      boolean var10000;
      label32: {
         try {
            var10000 = N.L(var2, (char)var3, (short)var4);
            if (var5 == null) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (NumberFormatException var6) {
            throw var6.A<invokedynamic>(var6, -6595626669284630049L, var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   private static final boolean b() {
      // $FF: Couldn't be decompiled
   }

   private static final boolean G() {
      long var0 = g ^ 137371044499907L;
      long var10001 = var0 ^ 64184312946135L;
      int var2 = (int)((var0 ^ 64184312946135L) >>> 32);
      int var3 = (int)(var10001 << 32 >>> 48);
      int var4 = (int)(var10001 << 48 >>> 48);
      k9[] var5 = -6137823283653257712L.A<invokedynamic>(-6137823283653257712L, var0);

      boolean var10000;
      label32: {
         try {
            var10000 = N.L(var2, (char)var3, (short)var4);
            if (var5 == null) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (NumberFormatException var6) {
            throw var6.A<invokedynamic>(var6, -6073205217897452001L, var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   static {
      long var20 = g ^ 37292402508208L;
      long var22 = var20 ^ 2159498404398L;
      long var24 = var20 ^ 85947568102666L;
      long var26 = var20 ^ 44092855412462L;
      long var28 = var20 ^ 136450099370745L;
      r = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[38];
      int var16 = 0;
      String var15 = "ük,àhwû\n\u001fò\u0013bîpTÅ\u0013ë÷í\u0012Ý\u0092b\u0085Øt\u0088±T±Þ×Ïä\u001cNøÎE x¶÷(t\u0093|Åýgì\u001e^w\r\u008e¼æñM\u0096y¦u\f6\u0014g>\u0084=\u0094\u0018qê§ÜQ®5\u0015ÛÛ´\u00ad\u0004²PËþ>!\u007fÿAG\u0080(ÓÁËZzìaî\u00038DO\u001fõT\u000eMf¹\u008fCI\u0088\u00981Ø\u0019\u009fbÜ]~cðBeT\u001d]x\u0010è¾\u001e\":a¦g¦Ø=ÂÌX#d\u0018\u0089GFë¡´\u0091Ö(üQ\u0012£°Z\tÇ\u0094ª\u000bh±#ñ(Èe\u0004\u001e3Ý*\u0088_'ü\u008eè(\u000bI\u0006£\u00046]\téÌ¢°S©5MgZU.`\\\u009aðÖZ V>@\u0012¼\u0015\u0011)\u0083\u000fÕ\u0012/\b*+Mtä\u0084\u0012*õiRôgµ@\u009aæ\u008c¨,}Qü\u0085Yuh\u0005¶Ê»\u0092õ-.Éô·\u0006\u0012Á\u0092vî\u001e¤Az¤\u008b\u0011¦{QgÙÿ4HÏxThVQ\u0005\u000b\u009ea¥Ù\u008brô[z\u00946\u0095g\u0015x2@:\u009bÄ\u0095Ð2ÊúI\u0084ArL®½fÂ\u0002\u0091û9\u0005\u0094°&\u0085ò±hòzIî\u00924°-é;\u007fè\u0096÷xw\u009eþo\u001fO\u0000ç¼$¼\baA÷;/ÒõHº½$ \u009f\u0081é\u009bF \u0003Fïñ»\u0016\u0088\u001b²G²\u0016³\u008a\u0007ãc´]O\u0080\u008f½\u008b»ï3èE\u0010à\"\u0082*µU\u009cÃ\n\u0015\u0014A§p=á\u0088Ó\u0000l\u0006\u008f¯å\u008ePC[0AsñOn\u0099>ÜP/\u001f\u00956I\u008a\u008aêÑKYvª\u0016½\u0093ÉÓÉãÖ£\u009b\u0010/\\åp¾\u001aVM\u0014ló®| (ZT`\u008fµÂn\u0016¾d¥Bó\u0091Y9HÅ\u000b[²íïª³\u00837\u0095\fåd·\u00806WÒè\u001aÇ\u001e\u009bP?_âÉIó2Y¡±.\u0085T\u0081z4\u009a\u0085Iå²w\u000b²\u008c)ÉíQ¿\u0099á!\u0000\u0088/îF.Ì\tÿ\u0003©x²\u0006GÂTQ¼m×8íüì?\u009a~}BxóÑ°Lì6\u000f©/Ó\u001e\t\u0000.¥¦FÍ;\u0092ó\u0083éÁF\u0080cµÏÙêÖobb\u009bÄí½7¤c\u009b±¶;)\u0092ô°\u008btf\u0004]Ý\u007füò e\u0001?LÛA\u0019»Ó|u\u0085N¥3¦g\u0086éB\u0084l\u009e²ÜÙÜjM%¡s\u009f\u0001\u0004[\u0090ß9\u0004\\Ýÿ\nlw\u0012\u0018åPúÞª Y\u0011ÓXb\u009e^\u009d9B\b`d·²â«æ\u0010\u000bÕ/\u0017C©\u00adEpDL\u00ad=}ú,(_Á\u0010CQ*æ\"ì®ïçè¹/\\ô¯À\u0011\u0086'\u0088\u0012'Ò\u0095ÅÐo¾\u008e´åcPV \u0096Ú\u00189?\u0092Þ\u0004\u0001¾ý\u0090îd·æb<ã4ü8 ýgr\u0099\u0088k÷××~$!\\\u009a\u0097ß\u0001Æñ9=Ï\u0012JÑ.¾\u001f[ç/ô\u001d$\u0083\u0090þ\u0096ê\u0013C¢xÅJÀ\u0080{\bãÖ ØÏü\u0081{é J\u001d\u0098Å\u000f±ð\u008dÚRÛ@{\"\u007fÉ-\u0006&ã\u009fú\u0099õo\u007f\tf\u0010?\u00102-¾A¤K®Ô\u0019\bJY¶\u0095àÐ¡:@½\u009a/3'Ìý\u0082ì\u0019GÚ\u0001°¾eú¯*öÇ/*\u0006êMÁûÄ\u0099À\u009d \u0010ûBÏ\u0083ÁÐkk\u000f/\u001b¶\u0002\u0081åÀdQÇüMÃîæg\u0085\r£\u008c0j(LØúÜ\u009cÞÆ\u0015\u00ad8\u0013È\u001f\u0082XR\u000b>\u0002\u001f\u0019Ç\u0083ùaøfØ³\\\u0094âQ\rIÖª\u0086ó£0ÛªM\u0086µãæOj\u0093\u0019Z|«\u0001\u001cêE\u0017Íx\u009d\u0018°µ\u008d'\u0012Åz\u0016\u0083µ³cÐ\u0086.\u0098\u0005*7³\u001eÓë(l\u0018}û\u0005jÈ\u0016û\u000e\u001fQèâë\u0016{î¿FÆ§I[6\u0094\u0018\u0014CýU?|:h~\u001188P\u008d\u0085a¨f\u0014Y¿§as(cU\u008a*\u0087\t®mBËæóW\u001a[\u001e\u009a=otûø^Ý\t¶Z\u008eïï\u0007í\u0083=û*Þ!\u0088~ \u0080\u0090ÿ\\m\u0085ô´Aä+ÉIæÅêè\nq8\u0006\u0089N5+¶æ_ FP\u009a( ¾\u0090¾ü\u0089¶\u0014v\u0011ü\u000e÷\u0017ÆcñÐi°ÿºÁ®4\u009b´4Î\bs»\u0019få¥\u0087á\u001d{\u0088\u009c\u008clËÿ\u0088Yá\u0012Q\u0015\u008b\bîÂ\u0082^\u0012g:´à\u0082R\u009eqöü\u000fÕÓÁ\u0012þ[ù&2Ð\u0000ãc±\u0096½¡\u0098a\u0080¬N*Ù¬Ý\u000fb\u0081v¸³R]«L\u0082×\u0080\u0087cúZ,d\t\u0090ÂðÄJDnþ\u0002\nÏG\u0016tz1\u0007©,+\u0085Ñ \r9:L\u0094#ÈN·i¿\u001f¹tM×\u008ep¡\u008cà\u009e¡\u0012Àhg*\u0094$b6zHV\fFf\u0010B\u0083d)9=è\u0003wU\u001c^ànO\u008d Ü N4!/ÇºÙKj\"\u0087\u0086¦\u00ad\u0019Jj¦\täÃ\f/\u0091®A£9\u008b\u0087©e\u0080\u0011U=\bº\n÷ô¶,\u0013¤?\u0018¥\u0019\u0001ì\u0002Á;ïÎ\u0085°À\u001cjI¡\u0088N¥7Ø\u0018ÉÕW=¼æÍGX\u0098\tO\u008a+2¼ w\u008b=à\u00ad\u0094&mí¯\\\u0088BH²\u0007¶0cå F|:0I2¹ì¡\rÃ\u0010\u0010÷\u00ad¯Qv+ø{½H³«ª\u008dûTG\u0092ÇMÚy:ºsEdÆ@ÕÉå8\u0011\u0013èeÀ\u0018!°Á\u0001\u008f\u000e\u009còmý\u009bÔòaÜùç\u008f\b¿\u008b\u008b\u0005\u008d(m(¢I/\u0007õ?®\u0094Î\"\u001b\u008ey2R1]»\u0001\u0002\u0097Wj/C\u0013Ùª\u0084q·&÷þHÅ\u0004ð(\u001f\u0003©MY\u008av\u008bõRJ7x\u008c7\n!\u000f\u009eL\n+uÞÂÿÄn\f\u008dKðAõu ?9\tÝ(ØTæí\u0012ËäâFÚ>õÜ\u0090\u0016ì\u0092\u0098\u0011ð\u0085¸T\u0017+\u0007Ï\u001b\u0082´úBù«\u0082\u0094]þÈ\u0095\u0018Û\u0016\u0096\u0092ö\u008bW\u0094O\u0003X\u0007vË\u00867Y\u0011ë4Ú@°3 \u0012\u009a±\u009e³\u00adEç\u0010\u0002\u0000(yyNÓ¯\u0016º\u0014Gw\u008edò\u0084\u0002B\u0014Ï²\u0084¨ð\u001c\u000f²\\,\u000bS\u0093\u009f\u0094í£8MMVh©O\u008dÜÁEù\"³®åÉ×·\u0099jþµÓ\u0016\r:-\u000f/\u0012\u009c\u001ft\u0087àò\u0010Æ[ôó\u000eYk\u00ad\u0014^Ú\u0017aáj\u001eÍµ>pñé\u0095D³jL¼þ\u001d\u0004Ø\u009f5\u008e¤t×d\u0005wß¨I÷Iÿ\r\u0015E\u000e\u001cV\u001aÏ\t`$Î\u0007Qç1:év4½P\u00150~¸m|;616«Lå\u001b$vÓý\u0019\u001d\u007f\u001dÇÛ\u0010Dê\u000e-ðõÌ:YÇ\u0013éÐ\u008df!y%\u001c\u0017ø\u0098Î\u0010æ\u0000ðà\u0090ÁðPí$N.O¡Á\u001c";
      int var17 = "ük,àhwû\n\u001fò\u0013bîpTÅ\u0013ë÷í\u0012Ý\u0092b\u0085Øt\u0088±T±Þ×Ïä\u001cNøÎE x¶÷(t\u0093|Åýgì\u001e^w\r\u008e¼æñM\u0096y¦u\f6\u0014g>\u0084=\u0094\u0018qê§ÜQ®5\u0015ÛÛ´\u00ad\u0004²PËþ>!\u007fÿAG\u0080(ÓÁËZzìaî\u00038DO\u001fõT\u000eMf¹\u008fCI\u0088\u00981Ø\u0019\u009fbÜ]~cðBeT\u001d]x\u0010è¾\u001e\":a¦g¦Ø=ÂÌX#d\u0018\u0089GFë¡´\u0091Ö(üQ\u0012£°Z\tÇ\u0094ª\u000bh±#ñ(Èe\u0004\u001e3Ý*\u0088_'ü\u008eè(\u000bI\u0006£\u00046]\téÌ¢°S©5MgZU.`\\\u009aðÖZ V>@\u0012¼\u0015\u0011)\u0083\u000fÕ\u0012/\b*+Mtä\u0084\u0012*õiRôgµ@\u009aæ\u008c¨,}Qü\u0085Yuh\u0005¶Ê»\u0092õ-.Éô·\u0006\u0012Á\u0092vî\u001e¤Az¤\u008b\u0011¦{QgÙÿ4HÏxThVQ\u0005\u000b\u009ea¥Ù\u008brô[z\u00946\u0095g\u0015x2@:\u009bÄ\u0095Ð2ÊúI\u0084ArL®½fÂ\u0002\u0091û9\u0005\u0094°&\u0085ò±hòzIî\u00924°-é;\u007fè\u0096÷xw\u009eþo\u001fO\u0000ç¼$¼\baA÷;/ÒõHº½$ \u009f\u0081é\u009bF \u0003Fïñ»\u0016\u0088\u001b²G²\u0016³\u008a\u0007ãc´]O\u0080\u008f½\u008b»ï3èE\u0010à\"\u0082*µU\u009cÃ\n\u0015\u0014A§p=á\u0088Ó\u0000l\u0006\u008f¯å\u008ePC[0AsñOn\u0099>ÜP/\u001f\u00956I\u008a\u008aêÑKYvª\u0016½\u0093ÉÓÉãÖ£\u009b\u0010/\\åp¾\u001aVM\u0014ló®| (ZT`\u008fµÂn\u0016¾d¥Bó\u0091Y9HÅ\u000b[²íïª³\u00837\u0095\fåd·\u00806WÒè\u001aÇ\u001e\u009bP?_âÉIó2Y¡±.\u0085T\u0081z4\u009a\u0085Iå²w\u000b²\u008c)ÉíQ¿\u0099á!\u0000\u0088/îF.Ì\tÿ\u0003©x²\u0006GÂTQ¼m×8íüì?\u009a~}BxóÑ°Lì6\u000f©/Ó\u001e\t\u0000.¥¦FÍ;\u0092ó\u0083éÁF\u0080cµÏÙêÖobb\u009bÄí½7¤c\u009b±¶;)\u0092ô°\u008btf\u0004]Ý\u007füò e\u0001?LÛA\u0019»Ó|u\u0085N¥3¦g\u0086éB\u0084l\u009e²ÜÙÜjM%¡s\u009f\u0001\u0004[\u0090ß9\u0004\\Ýÿ\nlw\u0012\u0018åPúÞª Y\u0011ÓXb\u009e^\u009d9B\b`d·²â«æ\u0010\u000bÕ/\u0017C©\u00adEpDL\u00ad=}ú,(_Á\u0010CQ*æ\"ì®ïçè¹/\\ô¯À\u0011\u0086'\u0088\u0012'Ò\u0095ÅÐo¾\u008e´åcPV \u0096Ú\u00189?\u0092Þ\u0004\u0001¾ý\u0090îd·æb<ã4ü8 ýgr\u0099\u0088k÷××~$!\\\u009a\u0097ß\u0001Æñ9=Ï\u0012JÑ.¾\u001f[ç/ô\u001d$\u0083\u0090þ\u0096ê\u0013C¢xÅJÀ\u0080{\bãÖ ØÏü\u0081{é J\u001d\u0098Å\u000f±ð\u008dÚRÛ@{\"\u007fÉ-\u0006&ã\u009fú\u0099õo\u007f\tf\u0010?\u00102-¾A¤K®Ô\u0019\bJY¶\u0095àÐ¡:@½\u009a/3'Ìý\u0082ì\u0019GÚ\u0001°¾eú¯*öÇ/*\u0006êMÁûÄ\u0099À\u009d \u0010ûBÏ\u0083ÁÐkk\u000f/\u001b¶\u0002\u0081åÀdQÇüMÃîæg\u0085\r£\u008c0j(LØúÜ\u009cÞÆ\u0015\u00ad8\u0013È\u001f\u0082XR\u000b>\u0002\u001f\u0019Ç\u0083ùaøfØ³\\\u0094âQ\rIÖª\u0086ó£0ÛªM\u0086µãæOj\u0093\u0019Z|«\u0001\u001cêE\u0017Íx\u009d\u0018°µ\u008d'\u0012Åz\u0016\u0083µ³cÐ\u0086.\u0098\u0005*7³\u001eÓë(l\u0018}û\u0005jÈ\u0016û\u000e\u001fQèâë\u0016{î¿FÆ§I[6\u0094\u0018\u0014CýU?|:h~\u001188P\u008d\u0085a¨f\u0014Y¿§as(cU\u008a*\u0087\t®mBËæóW\u001a[\u001e\u009a=otûø^Ý\t¶Z\u008eïï\u0007í\u0083=û*Þ!\u0088~ \u0080\u0090ÿ\\m\u0085ô´Aä+ÉIæÅêè\nq8\u0006\u0089N5+¶æ_ FP\u009a( ¾\u0090¾ü\u0089¶\u0014v\u0011ü\u000e÷\u0017ÆcñÐi°ÿºÁ®4\u009b´4Î\bs»\u0019få¥\u0087á\u001d{\u0088\u009c\u008clËÿ\u0088Yá\u0012Q\u0015\u008b\bîÂ\u0082^\u0012g:´à\u0082R\u009eqöü\u000fÕÓÁ\u0012þ[ù&2Ð\u0000ãc±\u0096½¡\u0098a\u0080¬N*Ù¬Ý\u000fb\u0081v¸³R]«L\u0082×\u0080\u0087cúZ,d\t\u0090ÂðÄJDnþ\u0002\nÏG\u0016tz1\u0007©,+\u0085Ñ \r9:L\u0094#ÈN·i¿\u001f¹tM×\u008ep¡\u008cà\u009e¡\u0012Àhg*\u0094$b6zHV\fFf\u0010B\u0083d)9=è\u0003wU\u001c^ànO\u008d Ü N4!/ÇºÙKj\"\u0087\u0086¦\u00ad\u0019Jj¦\täÃ\f/\u0091®A£9\u008b\u0087©e\u0080\u0011U=\bº\n÷ô¶,\u0013¤?\u0018¥\u0019\u0001ì\u0002Á;ïÎ\u0085°À\u001cjI¡\u0088N¥7Ø\u0018ÉÕW=¼æÍGX\u0098\tO\u008a+2¼ w\u008b=à\u00ad\u0094&mí¯\\\u0088BH²\u0007¶0cå F|:0I2¹ì¡\rÃ\u0010\u0010÷\u00ad¯Qv+ø{½H³«ª\u008dûTG\u0092ÇMÚy:ºsEdÆ@ÕÉå8\u0011\u0013èeÀ\u0018!°Á\u0001\u008f\u000e\u009còmý\u009bÔòaÜùç\u008f\b¿\u008b\u008b\u0005\u008d(m(¢I/\u0007õ?®\u0094Î\"\u001b\u008ey2R1]»\u0001\u0002\u0097Wj/C\u0013Ùª\u0084q·&÷þHÅ\u0004ð(\u001f\u0003©MY\u008av\u008bõRJ7x\u008c7\n!\u000f\u009eL\n+uÞÂÿÄn\f\u008dKðAõu ?9\tÝ(ØTæí\u0012ËäâFÚ>õÜ\u0090\u0016ì\u0092\u0098\u0011ð\u0085¸T\u0017+\u0007Ï\u001b\u0082´úBù«\u0082\u0094]þÈ\u0095\u0018Û\u0016\u0096\u0092ö\u008bW\u0094O\u0003X\u0007vË\u00867Y\u0011ë4Ú@°3 \u0012\u009a±\u009e³\u00adEç\u0010\u0002\u0000(yyNÓ¯\u0016º\u0014Gw\u008edò\u0084\u0002B\u0014Ï²\u0084¨ð\u001c\u000f²\\,\u000bS\u0093\u009f\u0094í£8MMVh©O\u008dÜÁEù\"³®åÉ×·\u0099jþµÓ\u0016\r:-\u000f/\u0012\u009c\u001ft\u0087àò\u0010Æ[ôó\u000eYk\u00ad\u0014^Ú\u0017aáj\u001eÍµ>pñé\u0095D³jL¼þ\u001d\u0004Ø\u009f5\u008e¤t×d\u0005wß¨I÷Iÿ\r\u0015E\u000e\u001cV\u001aÏ\t`$Î\u0007Qç1:év4½P\u00150~¸m|;616«Lå\u001b$vÓý\u0019\u001d\u007f\u001dÇÛ\u0010Dê\u000e-ðõÌ:YÇ\u0013éÐ\u008df!y%\u001c\u0017ø\u0098Î\u0010æ\u0000ðà\u0090ÁðPí$N.O¡Á\u001c".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var31 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var37 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var37;
               if ((var13 += var14) >= var17) {
                  i = var18;
                  q = new String[38];
                  w = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[13];
                  int var3 = 0;
                  String var4 = "\"z\u0086û¢ì¶`+VßÐ\u0014±S@Çzº²\u0014ý¿'|Z\u001cþ*Û\u0098æ°\u0014\u0091àN\u0003¸¡©þ\nÕÄºÕ(êeâô¾øU4éóW¡O¸\u0080áãj¼ó)R\u0098ÁûM\t\u00931~\u0084\u0001Þ¡¹sc§Äj";
                  int var5 = "\"z\u0086û¢ì¶`+VßÐ\u0014±S@Çzº²\u0014ý¿'|Z\u001cþ*Û\u0098æ°\u0014\u0091àN\u0003¸¡©þ\nÕÄºÕ(êeâô¾øU4éóW¡O¸\u0080áãj¼ó)R\u0098ÁûM\t\u00931~\u0084\u0001Þ¡¹sc§Äj".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var35 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                     long[] var34 = var6;
                     var35 = var3++;
                     long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var40 = -1;

                     while(true) {
                        long var8 = var39;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var42 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var40) {
                        case 0:
                           var34[var35] = var42;
                           if (var2 >= var5) {
                              t = var6;
                              v = new Integer[13];
                              KProperty[] var30 = new KProperty[true.b<invokedynamic>(8656, 46429431252539132L ^ var20)];
                              var30[0] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ki.class, true.w<invokedynamic>(23193, 3482740077872027898L ^ var20), true.w<invokedynamic>(21665, 8484319032199616202L ^ var20), 0)));
                              var30[1] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ki.class, true.w<invokedynamic>(22052, 7811203113838482527L ^ var20), true.w<invokedynamic>(21655, 4052591055980304125L ^ var20), 0)));
                              var30[2] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ki.class, true.w<invokedynamic>(31013, 5929413626589494091L ^ var20), true.w<invokedynamic>(19827, 2441500710857608970L ^ var20), 0)));
                              var30[3] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ki.class, true.w<invokedynamic>(6210, 4898487054837471796L ^ var20), true.w<invokedynamic>(29219, 1017704625204179031L ^ var20), 0)));
                              var30[4] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ki.class, true.w<invokedynamic>(18109, 2640456823485695168L ^ var20), true.w<invokedynamic>(16110, 670406231764171931L ^ var20), 0)));
                              var30[5] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ki.class, true.w<invokedynamic>(24944, 4210663124145316630L ^ var20), true.w<invokedynamic>(1567, 6451815486182802541L ^ var20), 0)));
                              var30[true.b<invokedynamic>(26643, 8132708104534171442L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ki.class, true.w<invokedynamic>(2089, 9037430109538011716L ^ var20), true.w<invokedynamic>(14700, 1912510372531731235L ^ var20), 0)));
                              I = var30;
                              N = new ki(var22);
                              o = qi.R((il)N, true.w<invokedynamic>(10736, 6098443375707679616L ^ var20), true, (pj)null, (Function0)null, true.b<invokedynamic>(17176, 2795225166759965756L ^ var20), var28, (Object)null);
                              c = qi.R((il)N, true.w<invokedynamic>(24214, 5420190691564854504L ^ var20), true, (pj)null, (Function0)null, true.b<invokedynamic>(17176, 2795225166759965756L ^ var20), var28, (Object)null);
                              C = qi.M((il)N, true.w<invokedynamic>(19109, 719634886001297602L ^ var20), (Enum)xe.SEMI, (pj)null, ki::U, 4, (Object)null, var24);
                              A = qi.R((il)N, true.w<invokedynamic>(1076, 4084371694299432574L ^ var20), true, (pj)null, ki::J, 4, var28, (Object)null);
                              x = qi.R((il)N, true.w<invokedynamic>(3765, 7240344739322580189L ^ var20), true, (pj)null, ki::C, 4, var28, (Object)null);
                              s = qi.g((il)N, true.w<invokedynamic>(1649, 5128942350128890936L ^ var20), 87.0F, RangesKt.rangeTo(0.0F, 90.0F), (pj)null, ki::b, true.b<invokedynamic>(8155, 3347417645835610357L ^ var20), var26, (Object)null);
                              Q = qi.R((il)N, true.w<invokedynamic>(22262, 9167766920368854200L ^ var20), true, (pj)null, ki::G, 4, var28, (Object)null);
                              R = (Queue)(new LinkedList());
                              n = (Queue)(new LinkedList());
                              d = new LinkedList();
                              m = new LinkedList();
                              Y = true;
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u001cÑqÑY¦6ò[*î¬\u008eG±A";
                           var5 = "\u001cÑqÑY¦6ò[*î¬\u008eG±A".length();
                           var2 = 0;
                        }

                        var35 = var2;
                        var2 += 8;
                        var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                        var34 = var6;
                        var35 = var3++;
                        var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var40 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var37;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "×ï\u000fÉ]\u0089~>HÊFÃ\u0093:RÔ&5\u0087¬\b·\u0094ºÙä¿æÏ\u0001Ëo(\u009c\u0083c¶¾\u008f¡\u001d\u0096^ù;Ep\u00027»!îNùÊ\u000e\u0096uÔ\u008eao\u0097\u0017}vÂm@Ânÿh";
               var17 = "×ï\u000fÉ]\u0089~>HÊFÃ\u0093:RÔ&5\u0087¬\b·\u0094ºÙä¿æÏ\u0001Ëo(\u009c\u0083c¶¾\u008f¡\u001d\u0096^ù;Ep\u00027»!îNùÊ\u000e\u0096uÔ\u008eao\u0097\u0017}vÂm@Ânÿh".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var31 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14387;
      if (q[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])r.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ki", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = i[var5].getBytes("ISO-8859-1");
         q[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return q[var5];
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
         throw new RuntimeException("su/catlean/ki" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3454;
      if (v[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = t[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])w.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               w.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ki", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         v[var3] = var15;
      }

      return v[var3];
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
         throw new RuntimeException("su/catlean/ki" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
