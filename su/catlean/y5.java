package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2846.class_2847;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.AttackBlockEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.world.BlockStateEvent;
import su.catlean.gofra.Flow;

public final class y5 extends k9 {
   @NotNull
   public static final y5 l;
   static final KProperty[] V;
   @NotNull
   private static final zr A;
   @NotNull
   private static final zr S;
   @NotNull
   private static final zq s;
   @NotNull
   private static final z0 v;
   @NotNull
   private static final zc O;
   @NotNull
   private static final z0 i;
   @NotNull
   private static final zo o;
   @NotNull
   private static final zo r;
   @NotNull
   private static final zo J;
   @NotNull
   private static final zo c;
   @Nullable
   private static class_2248 t;
   @Nullable
   private static f1 C;
   @NotNull
   private static final iv L;
   private static boolean d;
   private static k9[] K;
   private static final long b = j0.a(8539502702736051525L, 1288828185414798435L, MethodHandles.lookup().lookupClass()).a(258194077297790L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g;
   private static final long[] k;
   private static final Integer[] m;
   private static final Map n;

   private y5(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 33034151777632L;
      super(var3, true.x<invokedynamic>(1493, 2682306265362862199L ^ var1), pa.m(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final xy L(byte var1, long var2) {
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ b;
      long var10001 = var4 ^ 77710803016445L;
      int var6 = (int)((var4 ^ 77710803016445L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (xy)A.k((short)var6, this, V[0], (short)var7, var8);
   }

   private final cr W(short var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
      long var10001 = var4 ^ 90305577674896L;
      int var6 = (int)((var4 ^ 90305577674896L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (cr)S.k((short)var6, this, V[1], (short)var7, var8);
   }

   private final kq S(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 56430213977948L;
      int var3 = (int)((var1 ^ 56430213977948L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (kq)s.k((short)var3, this, V[2], (short)var4, var5);
   }

   private final void N(kq var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 55052248020375L;
      int var4 = (int)((var2 ^ 55052248020375L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      s.P(this, var4, V[2], (short)var5, var1, (short)var6);
   }

   private final int A(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 92440107742596L;
      int var3 = (int)((var1 ^ 92440107742596L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)v.k((short)var3, this, V[3], (short)var4, var5)).intValue();
   }

   private final float K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 50527747515550L;
      int var3 = (int)((var1 ^ 50527747515550L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)O.k((short)var3, this, V[4], (short)var4, var5)).floatValue();
   }

   private final int s(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 53280489169222L;
      int var3 = (int)((var1 ^ 53280489169222L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)i.k((short)var3, this, V[5], (short)var4, var5)).intValue();
   }

   private final boolean P(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 61524556362691L;
      int var3 = (int)((var1 ^ 61524556362691L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)o.k((short)var3, this, V[true.l<invokedynamic>(20718, 852081462830147573L ^ var1)], (short)var4, var5);
   }

   private final boolean U(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 130038929289350L;
      int var6 = (int)((var4 ^ 130038929289350L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)r.k((short)var6, this, V[true.l<invokedynamic>(12197, 938289616787479541L ^ var4)], (short)var7, var8);
   }

   private final boolean I(short var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 131004982985955L;
      int var6 = (int)((var4 ^ 131004982985955L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)J.k((short)var6, this, V[true.l<invokedynamic>(20998, 4755414459231801905L ^ var4)], (short)var7, var8);
   }

   private final boolean m(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 26056490306860L;
      int var3 = (int)((var1 ^ 26056490306860L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)c.k((short)var3, this, V[true.l<invokedynamic>(24340, 467937108956305127L ^ var1)], (short)var4, var5);
   }

   @Flow
   public final void C(@NotNull AttackBlockEvent e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void A(@NotNull BlockStateEvent e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void r(@Nullable PlayerUpdateEvent e) {
      // $FF: Couldn't be decompiled
   }

   public final synchronized void d(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void l(@NotNull Render3DEvent event) {
      // $FF: Couldn't be decompiled
   }

   private final f1 e(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean y(long var1, class_2338 var3) {
      var1 ^= b;
      long var10001 = var1 ^ 122802688000667L;
      int var4 = (int)((var1 ^ 122802688000667L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      int[] var10000 = -4261457404502313345L.A<invokedynamic>(-4261457404502313345L, var1);
      Iterator var8 = h0.O.iterator();
      int[] var7 = var10000;

      label26:
      while(var8.hasNext()) {
         class_2350 var9 = (class_2350)var8.next();
         char var10 = (char)var4;

         label24:
         while(true) {
            var10 = Intrinsics.areEqual((Object)s8.i(var10, var5, (short)var6).method_8320(var3.method_10093(var9)).method_26204(), (Object)class_2246.field_10164);

            do {
               if (var10 == 0) {
                  continue label26;
               }

               var10 = 1;
               if (var1 <= 0L) {
                  continue label24;
               }
            } while(var7 != null);

            return true;
         }
      }

      return false;
   }

   private final void Y(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean p(class_2248 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit C() {
      return Unit.INSTANCE;
   }

   private static final class_2596 G(class_2338 var0, int var1) {
      return (class_2596)(new class_2846(class_2847.field_12968, var0, class_2350.field_11036, var1));
   }

   private static final class_2596 E(class_2338 var0, int var1) {
      return (class_2596)(new class_2846(class_2847.field_12973, var0, class_2350.field_11036, var1));
   }

   public static final cr o(long a, y5 $this) {
      var0 ^= b;
      long var10001 = var0 ^ 137836311186747L;
      int var3 = (int)((var0 ^ 137836311186747L) >>> 48);
      long var4 = var10001 << 16 >>> 16;
      return var2.W((short)var3, var4);
   }

   static {
      long var20 = b ^ 82295452548495L;
      long var22 = var20 ^ 33984863645182L;
      long var24 = var20 ^ 2250895913875L;
      long var26 = var20 ^ 12793289761995L;
      long var28 = var20 ^ 120481277681455L;
      long var30 = var20 ^ 63292022858552L;
      long var10001 = var20 ^ 42906800519155L;
      int var32 = (int)((var20 ^ 42906800519155L) >>> 56);
      int var33 = (int)(var10001 << 8 >>> 32);
      int var34 = (int)(var10001 << 40 >>> 40);
      var10001 = var20 ^ 108419114602506L;
      int var35 = (int)((var20 ^ 108419114602506L) >>> 32);
      int var36 = (int)(var10001 << 32 >>> 48);
      int var37 = (int)(var10001 << 48 >>> 48);
      k9[] var10000 = new k9[1];
      g = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -9056746562020050688L, var20);
      Cipher var11;
      Cipher var39 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var39.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[46];
      int var16 = 0;
      String var15 = "Ð0\u0091'´òëRgÈ\u009e£)k\u0088&\u0015)·Xá=ªi8_u\u0013K\u001e(;±É\u0004Âð\u001eÇ\u0003ÐGM\u0013\u008ay\u0012k¡º\u0087Jõ|]xé¬\u008aP3\u0013J\u0005\u0015Q*!\u008a\u009d\u0016 X /t\u0083³\u0090éð\u0010\u0011É\u0098¼§\u0093\u0005äJ\u0088ÚÒûçñó\u0010òs¨\u0012C\u001eþ\u0019¼ýØ\u00935\u0013^| \u0082ß¥OïÕýf\u008aË?¾B#\"\u000båb¬b©ÞéÃªî\u001f,LïºÙ\u0018Þÿk«M'\u000e.æu\b+Ù\u0001\nZ\u0084`Z×±þ½\u0018(s·\u008dT\u008c\u001doQêj\u000f?rú\u0086Ôk\u0092ë¿Û¾úDc3a·\u0016¹\u0091á\u008f\u0091ØîeÂØ£\u0010W,Vÿí\u0006ß\u0092\u0005\u00181'FÕG\n(ín\u008eÈíå\u0094róï\u001f8À 5DD\u000e\u001bMåx\u0092ZÁÇ\u000eÁB\nS\u00939kLgyy\u0012+ 4Ú\u009dÃòFÚd\u0013\u001dV\u0015½íÉ\u0001\u001dkCÍl\u0002k\u000fÏ§ì6Ò\u00865\u001d\u0010#¦\u009e½S\u009d~¡\\`Ö\u0010\u000bÂ^ù\u0010*.bÓ#\u009e¶\u009b?É×\u0017\n¬\u0002¶ \u0089\f{M\u00891HåG\u001f=LYëÏÄ«\u0083°C±\u008f¥W³¼l\u0090Û_\u009eñ \u0094ÇËK\u009dh+mjÅëÌ\u001a\u008f¼oýå©`(µ\u0081±\u0088«\u00957 \u008f}\f\u0018(ÞËZ\u0092__YoØ±í³Ñ§A\u001aÕ\u0088ªe£³³(~\u0010\u0003¼\u0082[\u0096×\u00ad%§7Áo\u0099\u009c?jV·Î¬ÞòüÖ¿¿áÚ\u0082õÜ8¡Sr¥\rÐ\u0010\u009e.:ü\u008e»(~\u000293è \u0094ª-\u0010\u008fÃ*/Ç¢_!Oy\u0093ÿ\u008akN1(\u0000W\u001fµõ\u0005U~BY/¤~\r@*Cò£dòÛ\u0082G¾Ä\u0099`z\u00ad¢é\u008b\u001c\u000er\u001c´ü| üRj6ç\u0082ª\u001dÖÿ\u009a\u00936ÚA×DCqPG\u0019ª½\u0010É¹±\u001a\u008eNÊ\u0010_\u008f·?ÅûbHÈüÅL´7\u0001ë\u0018\u00adÚ\u0083ûü{ÅK/¯l\u001d\u0084\u0014\rä~¬\"*ýhU\u00ad\u0018]s0\u009eÿi \u0017\u009d«/\u001a¹\u0094×ã>\\\u008e\u0097Ç9öc\u0018KÃ¼_\u0013éDÝmÍ\u0096à\u0098zN\u0089R\u008e\u008bÇçÞ?F\u0010¼\u001b³m´¼jIyÊY.\u00adVmU ®aÉ\u000b\u001e©\u00890ÐEy!!]Ò\u000f[´ÈO\u0082¢HPºÅJ\u008fy mà(s+L\u0097R? ÆÔ|¸³ö·ë\u001c*\u0010µ:\u009aK\u009eJÄü\u0085F\u009c°\u008d¿ô|I\u0001\u0080\niN\u0018\n¾\u0086¬\u0018 ó,\u009e#\u0082Q\u001cÚÀý¨ýã\u00ad\u001b\u0099º\"\u0018¾¤XÌ\u0082\u0092\u0014sÔÞ\u009aZ\u0011ä\u008f\\L9\bJ5\\ªî\u0010óºãÜ\u008e^W\rD2¶c\u009c\u009c\u0018ò\u0018\u0088\u0001@\u000f¢\u0091ääÏ;x6\u0080ÇàT¸¯ÏÉ] \u0007: \u0097S1 yªÀ\u0097ÿù\u001e]àÅµ\n¿JÐò\u008aç;\u008cS\u0090JígÈ\u000fõ\u0018¦\u009có^ß\u0006X¹\u0007\u000e\"If\u0000+ö|\u0000\u000064kQ\u001a\u0018\u009aVr\u008dêK\u0007ÍÂ) ¿/¸Ö\u0000â\u008c;&ãdù\u007f\u0018¢\u0005ë\u0015\u001b\u0084t`\fÀþ\u00ad\u0013\u0000\n\u0082\u0019\u008c\u0013fn+\u0091\u009a\u0010û\u00100ewØU\u0018vszCqþÇG8/H9wg¥CÔ<ëc~\u0081þ\u0095\u008d\u009fªõmYä\u0012ø^S.Û«4ÕfÝ¢²\r¤)·£1¹ï·\u0016\u0018\u0089ç\"åg\u0083\u0080\u0003y¨\u0010zWRÄö I¨9kø·\u007f`Äñ\u0010ê\u009c<ú£1@]\u0018\u0084\"6£\u0018ø× Çõä\u0003aé@\u000e\u008dkð³\u008bs¯#AÓ\u008bà\u00ad$\u008b\u009b( \u0089üDò\u0016þ\u0018Ð´a×Åâ\u00ad¯\u009e\u0098ë\u008a\u0017µ\u009cä97\u009d\u0010\u0015û\u008e¨\u0018\u0083\u001b¿¢KRÌ\u001b\u0014ìñ\u0016\u0000-\\+Ì\u0004·C\u001c\u0014`å8?3\u009eÁ\u008dbI|<7=_\u008c~uÚ¯ð]\u0012yø\u0092jª \u008bá¯/\u009d\u0004mMxrÔ[\u0003k4\u001aÄD0i\u001bTÄ\u0090¨t\u001d0m« CkGH¨\u0018nµªF\u0019c\"Ñ\u0085tV!´Cf_\u0000\u001f\u0082b\u0097\u009d\u0094Ø^æ";
      int var17 = "Ð0\u0091'´òëRgÈ\u009e£)k\u0088&\u0015)·Xá=ªi8_u\u0013K\u001e(;±É\u0004Âð\u001eÇ\u0003ÐGM\u0013\u008ay\u0012k¡º\u0087Jõ|]xé¬\u008aP3\u0013J\u0005\u0015Q*!\u008a\u009d\u0016 X /t\u0083³\u0090éð\u0010\u0011É\u0098¼§\u0093\u0005äJ\u0088ÚÒûçñó\u0010òs¨\u0012C\u001eþ\u0019¼ýØ\u00935\u0013^| \u0082ß¥OïÕýf\u008aË?¾B#\"\u000båb¬b©ÞéÃªî\u001f,LïºÙ\u0018Þÿk«M'\u000e.æu\b+Ù\u0001\nZ\u0084`Z×±þ½\u0018(s·\u008dT\u008c\u001doQêj\u000f?rú\u0086Ôk\u0092ë¿Û¾úDc3a·\u0016¹\u0091á\u008f\u0091ØîeÂØ£\u0010W,Vÿí\u0006ß\u0092\u0005\u00181'FÕG\n(ín\u008eÈíå\u0094róï\u001f8À 5DD\u000e\u001bMåx\u0092ZÁÇ\u000eÁB\nS\u00939kLgyy\u0012+ 4Ú\u009dÃòFÚd\u0013\u001dV\u0015½íÉ\u0001\u001dkCÍl\u0002k\u000fÏ§ì6Ò\u00865\u001d\u0010#¦\u009e½S\u009d~¡\\`Ö\u0010\u000bÂ^ù\u0010*.bÓ#\u009e¶\u009b?É×\u0017\n¬\u0002¶ \u0089\f{M\u00891HåG\u001f=LYëÏÄ«\u0083°C±\u008f¥W³¼l\u0090Û_\u009eñ \u0094ÇËK\u009dh+mjÅëÌ\u001a\u008f¼oýå©`(µ\u0081±\u0088«\u00957 \u008f}\f\u0018(ÞËZ\u0092__YoØ±í³Ñ§A\u001aÕ\u0088ªe£³³(~\u0010\u0003¼\u0082[\u0096×\u00ad%§7Áo\u0099\u009c?jV·Î¬ÞòüÖ¿¿áÚ\u0082õÜ8¡Sr¥\rÐ\u0010\u009e.:ü\u008e»(~\u000293è \u0094ª-\u0010\u008fÃ*/Ç¢_!Oy\u0093ÿ\u008akN1(\u0000W\u001fµõ\u0005U~BY/¤~\r@*Cò£dòÛ\u0082G¾Ä\u0099`z\u00ad¢é\u008b\u001c\u000er\u001c´ü| üRj6ç\u0082ª\u001dÖÿ\u009a\u00936ÚA×DCqPG\u0019ª½\u0010É¹±\u001a\u008eNÊ\u0010_\u008f·?ÅûbHÈüÅL´7\u0001ë\u0018\u00adÚ\u0083ûü{ÅK/¯l\u001d\u0084\u0014\rä~¬\"*ýhU\u00ad\u0018]s0\u009eÿi \u0017\u009d«/\u001a¹\u0094×ã>\\\u008e\u0097Ç9öc\u0018KÃ¼_\u0013éDÝmÍ\u0096à\u0098zN\u0089R\u008e\u008bÇçÞ?F\u0010¼\u001b³m´¼jIyÊY.\u00adVmU ®aÉ\u000b\u001e©\u00890ÐEy!!]Ò\u000f[´ÈO\u0082¢HPºÅJ\u008fy mà(s+L\u0097R? ÆÔ|¸³ö·ë\u001c*\u0010µ:\u009aK\u009eJÄü\u0085F\u009c°\u008d¿ô|I\u0001\u0080\niN\u0018\n¾\u0086¬\u0018 ó,\u009e#\u0082Q\u001cÚÀý¨ýã\u00ad\u001b\u0099º\"\u0018¾¤XÌ\u0082\u0092\u0014sÔÞ\u009aZ\u0011ä\u008f\\L9\bJ5\\ªî\u0010óºãÜ\u008e^W\rD2¶c\u009c\u009c\u0018ò\u0018\u0088\u0001@\u000f¢\u0091ääÏ;x6\u0080ÇàT¸¯ÏÉ] \u0007: \u0097S1 yªÀ\u0097ÿù\u001e]àÅµ\n¿JÐò\u008aç;\u008cS\u0090JígÈ\u000fõ\u0018¦\u009có^ß\u0006X¹\u0007\u000e\"If\u0000+ö|\u0000\u000064kQ\u001a\u0018\u009aVr\u008dêK\u0007ÍÂ) ¿/¸Ö\u0000â\u008c;&ãdù\u007f\u0018¢\u0005ë\u0015\u001b\u0084t`\fÀþ\u00ad\u0013\u0000\n\u0082\u0019\u008c\u0013fn+\u0091\u009a\u0010û\u00100ewØU\u0018vszCqþÇG8/H9wg¥CÔ<ëc~\u0081þ\u0095\u008d\u009fªõmYä\u0012ø^S.Û«4ÕfÝ¢²\r¤)·£1¹ï·\u0016\u0018\u0089ç\"åg\u0083\u0080\u0003y¨\u0010zWRÄö I¨9kø·\u007f`Äñ\u0010ê\u009c<ú£1@]\u0018\u0084\"6£\u0018ø× Çõä\u0003aé@\u000e\u008dkð³\u008bs¯#AÓ\u008bà\u00ad$\u008b\u009b( \u0089üDò\u0016þ\u0018Ð´a×Åâ\u00ad¯\u009e\u0098ë\u008a\u0017µ\u009cä97\u009d\u0010\u0015û\u008e¨\u0018\u0083\u001b¿¢KRÌ\u001b\u0014ìñ\u0016\u0000-\\+Ì\u0004·C\u001c\u0014`å8?3\u009eÁ\u008dbI|<7=_\u008c~uÚ¯ð]\u0012yø\u0092jª \u008bá¯/\u009d\u0004mMxrÔ[\u0003k4\u001aÄD0i\u001bTÄ\u0090¨t\u001d0m« CkGH¨\u0018nµªF\u0019c\"Ñ\u0085tV!´Cf_\u0000\u001f\u0082b\u0097\u009d\u0094Ø^æ".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var40 = var15.substring(var13, var13 + var14);
         byte var42 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var40.getBytes("ISO-8859-1"));
            String var46 = b(var19).intern();
            switch(var42) {
            case 0:
               var18[var16++] = var46;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  f = new String[46];
                  n = new HashMap(13);
                  Cipher var0;
                  var39 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var39.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[17];
                  int var3 = 0;
                  String var4 = "Ö±ã´\u001cBÎðK\u0085áHÝOPÔ-p2kê%*í\u00adÃ,Ô\u0081\u000bºË/ß&|&S\r©¸:G2D£è\u009f\u0080\u0094\u0082µOUE9¨8¸äKdg\u0002LF\u0002\u0011÷Ú\u001eåw\u008afªÛøú\u0090\u0091êd\u0099\u009eD;ÔÍ©\u009fçF\u009c\u001b\u0006:\u0082¾Ò]öC_Á!H\u00ad/\u009f\u008f\u0013Ù\u0096ëÚÛF!º";
                  int var5 = "Ö±ã´\u001cBÎðK\u0085áHÝOPÔ-p2kê%*í\u00adÃ,Ô\u0081\u000bºË/ß&|&S\r©¸:G2D£è\u009f\u0080\u0094\u0082µOUE9¨8¸äKdg\u0002LF\u0002\u0011÷Ú\u001eåw\u008afªÛøú\u0090\u0091êd\u0099\u009eD;ÔÍ©\u009fçF\u009c\u001b\u0006:\u0082¾Ò]öC_Á!H\u00ad/\u009f\u008f\u0013Ù\u0096ëÚÛF!º".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var47 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
                     long[] var43 = var6;
                     var47 = var3++;
                     long var49 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var50 = -1;

                     while(true) {
                        long var8 = var49;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var52 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var50) {
                        case 0:
                           var43[var47] = var52;
                           if (var2 >= var5) {
                              k = var6;
                              m = new Integer[17];
                              KProperty[] var38 = new KProperty[true.l<invokedynamic>(7739, 2171230014305708963L ^ var20)];
                              var38[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y5.class, true.x<invokedynamic>(15729, 6208568547727369562L ^ var20), true.x<invokedynamic>(17830, 8016000866811256198L ^ var20), 0)));
                              var38[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y5.class, true.x<invokedynamic>(6880, 5652108668730589922L ^ var20), true.x<invokedynamic>(30606, 4647302765140782987L ^ var20), 0)));
                              var38[2] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(y5.class, true.x<invokedynamic>(5253, 1299854817435438263L ^ var20), true.x<invokedynamic>(13364, 3991453157312130111L ^ var20), 0)));
                              var38[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y5.class, true.x<invokedynamic>(13906, 8371402998381112931L ^ var20), true.x<invokedynamic>(22735, 6064963461424775410L ^ var20), 0)));
                              var38[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y5.class, true.x<invokedynamic>(28804, 7535196890327263412L ^ var20), true.x<invokedynamic>(6034, 448279946272067501L ^ var20), 0)));
                              var38[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y5.class, true.x<invokedynamic>(27752, 3657933587633255520L ^ var20), true.x<invokedynamic>(7049, 8071279494058558381L ^ var20), 0)));
                              var38[true.l<invokedynamic>(20455, 4353389950567840370L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y5.class, true.x<invokedynamic>(14762, 6072904516322091412L ^ var20), true.x<invokedynamic>(31675, 3641284772541244291L ^ var20), 0)));
                              var38[true.l<invokedynamic>(16971, 8771990877586061268L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y5.class, true.x<invokedynamic>(6710, 2311737721283854876L ^ var20), true.x<invokedynamic>(27156, 9210353748686320184L ^ var20), 0)));
                              var38[true.l<invokedynamic>(29845, 213632579672948993L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y5.class, true.x<invokedynamic>(935, 1964728345316219791L ^ var20), true.x<invokedynamic>(15087, 8364688080374948558L ^ var20), 0)));
                              var38[true.l<invokedynamic>(17944, 2833882958406480797L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y5.class, true.x<invokedynamic>(862, 8617189948493388638L ^ var20), true.x<invokedynamic>(5123, 6779162250276981762L ^ var20), 0)));
                              V = var38;
                              l = new y5(var24);
                              A = qi.M((il)l, true.x<invokedynamic>(19364, 1920150723483538321L ^ var20), (Enum)xy.Select, (pj)null, (Function0)null, true.l<invokedynamic>(16547, 2539881049055851829L ^ var20), (Object)null, var26);
                              S = qi.M((il)l, true.x<invokedynamic>(15636, 2813055803370530093L ^ var20), (Enum)cr.FOV, (pj)null, (Function0)null, true.l<invokedynamic>(16547, 2539881049055851829L ^ var20), (Object)null, var26);
                              s = qi.K((il)l, var35, true.x<invokedynamic>(22407, 7663770273743179651L ^ var20), new kq((List)null, (byte)var32, 1, var33, (DefaultConstructorMarker)null, var34), (pj)null, (short)var36, (Function0)null, (char)var37, true.l<invokedynamic>(16547, 2539881049055851829L ^ var20), (Object)null);
                              v = qi.o((il)l, true.x<invokedynamic>(8912, 5141868577008515827L ^ var20), true.l<invokedynamic>(21416, 88898042290923066L ^ var20), new IntRange(0, true.l<invokedynamic>(26432, 881145910312653527L ^ var20)), var22, (pj)null, (Function0)null, true.l<invokedynamic>(15699, 7259588217051941066L ^ var20), (Object)null);
                              O = qi.g((il)l, true.x<invokedynamic>(18534, 843917544199950433L ^ var20), 4.2F, RangesKt.rangeTo(3.0F, 7.0F), (pj)null, (Function0)null, true.l<invokedynamic>(16784, 6270834566394016779L ^ var20), var28, (Object)null);
                              i = qi.o((il)l, true.x<invokedynamic>(17170, 4368905501946813217L ^ var20), true.l<invokedynamic>(19015, 5255281818144669657L ^ var20), new IntRange(5, true.l<invokedynamic>(23413, 2512145264020483817L ^ var20)), var22, (pj)null, (Function0)null, true.l<invokedynamic>(16784, 6270834566394016779L ^ var20), (Object)null);
                              o = qi.R((il)l, true.x<invokedynamic>(21595, 2729142428347141238L ^ var20), false, (pj)null, (Function0)null, true.l<invokedynamic>(16547, 2539881049055851829L ^ var20), var30, (Object)null);
                              r = qi.R((il)l, true.x<invokedynamic>(32055, 3832278543494358293L ^ var20), false, (pj)null, (Function0)null, true.l<invokedynamic>(16547, 2539881049055851829L ^ var20), var30, (Object)null);
                              J = qi.R((il)l, true.x<invokedynamic>(5263, 230313367054372024L ^ var20), false, (pj)null, (Function0)null, true.l<invokedynamic>(16547, 2539881049055851829L ^ var20), var30, (Object)null);
                              c = qi.R((il)l, true.x<invokedynamic>(6419, 2726189271114924325L ^ var20), false, (pj)null, (Function0)null, true.l<invokedynamic>(16547, 2539881049055851829L ^ var20), var30, (Object)null);
                              L = new iv();
                              return;
                           }
                           break;
                        default:
                           var43[var47] = var52;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0002\\ØÃ¦°·\u0010´\u008ey\u0086â)\u001f\u0095";
                           var5 = "\u0002\\ØÃ¦°·\u0010´\u008ey\u0086â)\u001f\u0095".length();
                           var2 = 0;
                        }

                        var47 = var2;
                        var2 += 8;
                        var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
                        var43 = var6;
                        var47 = var3++;
                        var49 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var50 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var46;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u009d\u0003(uð\u0007\u0007:oMý\u009dñÚU\u0084\u0095P\u0095áÈ´£¹ ãA\rµtx+h>ñEÔ=Kú¹aÜXÔü9C\u0010D\u0018C¥\u001fDÁ8";
               var17 = "\u009d\u0003(uð\u0007\u0007:oMý\u009dñÚU\u0084\u0095P\u0095áÈ´£¹ ãA\rµtx+h>ñEÔ=Kú¹aÜXÔü9C\u0010D\u0018C¥\u001fDÁ8".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var40 = var15.substring(var13, var13 + var14);
            var42 = 0;
         }
      }
   }

   public static void f(k9[] var0) {
      K = var0;
   }

   public static k9[] h() {
      return K;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23481;
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
            throw new RuntimeException("su/catlean/y5", var10);
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
         throw new RuntimeException("su/catlean/y5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13837;
      if (m[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = k[var3];
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
            throw new RuntimeException("su/catlean/y5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
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
         throw new RuntimeException("su/catlean/y5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
