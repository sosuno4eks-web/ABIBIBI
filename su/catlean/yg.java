package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
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
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class yg extends k9 {
   @NotNull
   public static final yg f;
   static final KProperty[] b;
   @NotNull
   private static final zr B;
   @NotNull
   private static final z0 O;
   @NotNull
   private static final z0 o;
   @NotNull
   private static final zo U;
   @NotNull
   private static final zr t;
   @NotNull
   private static final zr W;
   @NotNull
   private static final zr T;
   @NotNull
   private static final zc i;
   @NotNull
   private static final zc d;
   @NotNull
   private static final zo v;
   @NotNull
   private static final zr I;
   @NotNull
   private static final List w;
   private static int X;
   @NotNull
   private static iv z;
   private static final long c = j0.a(-5646519663513853277L, 6252347236113844930L, MethodHandles.lookup().lookupClass()).a(69317829261047L);
   private static final String[] e;
   private static final String[] g;
   private static final Map k;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;

   private yg(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 78259700034659L;
      super(var3, true.p<invokedynamic>(14506, 6659288026120821001L ^ var1), pa.m(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final ds K(char var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ c;
      long var10001 = var4 ^ 133593706217180L;
      int var6 = (int)((var4 ^ 133593706217180L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (ds)B.k((short)var6, this, b[0], (short)var7, var8);
   }

   private final void m(long var1, ds var3) {
      var1 ^= c;
      long var10001 = var1 ^ 94177348142364L;
      int var4 = (int)((var1 ^ 94177348142364L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      B.P(this, var4, b[0], (short)var5, var3, (short)var6);
   }

   private final int H(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 132931249021331L;
      int var3 = (int)((var1 ^ 132931249021331L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)O.k((short)var3, this, b[1], (short)var4, var5)).intValue();
   }

   private final void w(int var1, long var2) {
      var2 ^= c;
      long var10001 = var2 ^ 43843503527982L;
      int var4 = (int)((var2 ^ 43843503527982L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      O.P(this, var4, b[1], (short)var5, var1, (short)var6);
   }

   private final int P(int var1, char var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
      long var10001 = var4 ^ 2561989161336L;
      int var6 = (int)((var4 ^ 2561989161336L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)o.k((short)var6, this, b[2], (short)var7, var8)).intValue();
   }

   private final void d(int var1, long var2) {
      var2 ^= c;
      long var10001 = var2 ^ 56628881540353L;
      int var4 = (int)((var2 ^ 56628881540353L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      o.P(this, var4, b[2], (short)var5, var1, (short)var6);
   }

   private final boolean p(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 16437212909644L;
      int var3 = (int)((var1 ^ 16437212909644L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)U.k((short)var3, this, b[3], (short)var4, var5);
   }

   private final void h(long var1, boolean var3) {
      var1 ^= c;
      long var10001 = var1 ^ 69024037510973L;
      int var4 = (int)((var1 ^ 69024037510973L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      U.P(this, var4, b[3], (short)var5, var3, (short)var6);
   }

   private final m7 W(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 4788329200031L;
      int var3 = (int)((var1 ^ 4788329200031L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (m7)t.k((short)var3, this, b[4], (short)var4, var5);
   }

   private final void V(long var1, m7 var3) {
      var1 ^= c;
      long var10001 = var1 ^ 70919257115366L;
      int var4 = (int)((var1 ^ 70919257115366L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      t.P(this, var4, b[4], (short)var5, var3, (short)var6);
   }

   private final st G(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ c;
      long var10001 = var4 ^ 118051144425767L;
      int var6 = (int)((var4 ^ 118051144425767L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (st)W.k((short)var6, this, b[5], (short)var7, var8);
   }

   private final void R(st var1, long var2) {
      var2 ^= c;
      long var10001 = var2 ^ 109248758285308L;
      int var4 = (int)((var2 ^ 109248758285308L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      W.P(this, var4, b[5], (short)var5, var1, (short)var6);
   }

   private final gt r(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 128986467473567L;
      int var3 = (int)((var1 ^ 128986467473567L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (gt)T.k((short)var3, this, b[true.a<invokedynamic>(14458, 2747263838960645389L ^ var1)], (short)var4, var5);
   }

   private final void u(gt var1, long var2) {
      var2 ^= c;
      long var10001 = var2 ^ 83018546866609L;
      int var4 = (int)((var2 ^ 83018546866609L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      T.P(this, var4, b[true.a<invokedynamic>(29396, 2158735488126254748L ^ var2)], (short)var5, var1, (short)var6);
   }

   private final float b(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 16404963985221L;
      int var3 = (int)((var1 ^ 16404963985221L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)i.k((short)var3, this, b[true.a<invokedynamic>(6768, 692004473893538012L ^ var1)], (short)var4, var5)).floatValue();
   }

   private final void U(float var1, long var2) {
      var2 ^= c;
      long var10001 = var2 ^ 133736968622698L;
      int var4 = (int)((var2 ^ 133736968622698L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      i.P(this, var4, b[true.a<invokedynamic>(18512, 2025824405979447262L ^ var2)], (short)var5, var1, (short)var6);
   }

   private final float k(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 44716866844154L;
      int var3 = (int)((var1 ^ 44716866844154L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)d.k((short)var3, this, b[true.a<invokedynamic>(1854, 4648967215956846382L ^ var1)], (short)var4, var5)).floatValue();
   }

   private final void V(int var1, float var2, byte var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var3 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ c;
      long var10001 = var5 ^ 53449299418611L;
      int var7 = (int)((var5 ^ 53449299418611L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      d.P(this, var7, b[true.a<invokedynamic>(4080, 3616569345540667388L ^ var5)], (short)var8, var2, (short)var9);
   }

   private final boolean Q(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 8044386881240L;
      int var3 = (int)((var1 ^ 8044386881240L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)v.k((short)var3, this, b[true.a<invokedynamic>(11656, 2229670322288162484L ^ var1)], (short)var4, var5);
   }

   private final void S(char var1, char var2, boolean var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ c;
      long var10001 = var5 ^ 82894544463794L;
      int var7 = (int)((var5 ^ 82894544463794L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      v.P(this, var7, b[true.a<invokedynamic>(11656, 2229606189937471428L ^ var5)], (short)var8, var3, (short)var9);
   }

   private final nr T(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 87143983432055L;
      int var3 = (int)((var1 ^ 87143983432055L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (nr)I.k((short)var3, this, b[true.a<invokedynamic>(9145, 1164995698471024419L ^ var1)], (short)var4, var5);
   }

   private final void W(nr var1, long var2) {
      var2 ^= c;
      long var10001 = var2 ^ 22538241100266L;
      int var4 = (int)((var2 ^ 22538241100266L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      I.P(this, var4, b[true.a<invokedynamic>(9145, 1164941626019614628L ^ var2)], (short)var5, var1, (short)var6);
   }

   @Flow
   private final void D(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void E(byte param1, long param2, class_2338 param4) {
      // $FF: Couldn't be decompiled
   }

   private final void e(class_2338 param1, rx param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean s() {
      long var0 = c ^ 12612586670400L;
      long var10001 = var0 ^ 70403119531329L;
      int var2 = (int)((var0 ^ 70403119531329L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 32);
      int var4 = (int)(var10001 << 48 >>> 48);

      boolean var10000;
      try {
         if (f.K((char)var2, var3, (char)var4) == ds.Instant) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -2814498774169137530L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean w() {
      long var0 = c ^ 102356083225139L;
      long var10001 = var0 ^ 24632604950066L;
      int var2 = (int)((var0 ^ 24632604950066L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 32);
      int var4 = (int)(var10001 << 48 >>> 48);

      boolean var10000;
      try {
         if (f.K((char)var2, var3, (char)var4) == ds.Instant) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 7170770924653049333L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final Unit J() {
      return Unit.INSTANCE;
   }

   static {
      long var20 = c ^ 36576902445969L;
      long var22 = var20 ^ 53561745935502L;
      long var24 = var20 ^ 103749957682438L;
      long var26 = var20 ^ 82558794320947L;
      long var28 = var20 ^ 49646183659479L;
      long var30 = var20 ^ 133198988970944L;
      k = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[35];
      int var16 = 0;
      String var15 = "®\u0013\u0004Ö¸bÊJÕ6me¨Ä\u0019ø\u0010»f$¬|.e¤ÝCÿÜ\u0083\u0011°f(» ¢Êá\u0018\u0097ì?b\u0001Å¼\u0095p\u0006¹+\u0093S%ÊX\u0001Á\u0098Ô\u0005\u0092'ðV\u0016i\u000e×\u0080\n!ª Â$+èm#/Ùµ\u009dµdFC\"ïòÂúëÖ\u0095O\\ÂÛ1\u0096\u0094j.C\u0010¢EÂþgJ2G@/UÉB Ö\u0011(4Ã\u0099ò¬]¬x\b§O@õ\b;)\u000e\u0087Pêä±¾ìFïÔ\u0001fýR\u0081®\u0014\u0099á ¿VØ\u0018\u0089P¨Å·ÝÁßð\u0004}u¶=Ï!>Èè-\u0004½G\u000b(h\u0089Ì\u0004óó\u001dt\u0011â\u0099í)'ù¡«Ë\u0004V\u009dYáæÍnwÇ!Ä0\u000f6t\u0097tÎÿ~\u001f8ïd\nñ´ÆÃÂÂ½\u008d\næ\u0018ø\u000b\u001a\tìÄ\u0007éNa´\u0012\u008a¢½nJýn\u001ft(\u0002b7Í\u0092Äüx¿G¡\u0095\u007f\u0014\u001aZ\u009e¤ïv 'ÅLúWÃè\u0096C®£ÒIGÀ'\u0097Û¿ \u0094b{Î\u00968yb¿\u0094âì\u0010àzÊ;È\u0005Ð0\u001bKpÔ[ó®,\u0010%I6 Ä\u009fp±)ÆÃ4Î\fñÖ ð!\u0084\u008d\b$\u0001Î\u000bÆ\u0000L\u000bü\u0085\u0082\u0082\u001fN\u0080,¹¡ì\u0015®Y\u009fé0¹¦\u0018Ï&\u0000N$)U`!ÝË0\u0093Ä\u0010ñî\u0015²uô!UË\u0018J¹C«\u0013T\u001b\u0019ç\u0081ÀL¯\u0004\u009f\u001c\u008eÓ\u0099¶´Ryn\u0010\u000b~\u001a\u0013\u008aøV¶lÓ<V>å\u0016¡ K\"\u0086\u0095\u001b\u0082g\u008aõwÁûyÅ@ù¸\u0081\táÌ¢Â,\u0098\u008fe:z\u001a\u0091Ë(¤[\u001cº\u008e\u0081\u00880Cuï\u001a0NGÏ\u0000ürÊµ5oZ\u0004ÄfwV\u0092\u007fÑu}T\u0006Î\u001dX¤0\u0085§ÉÄ\u009f'½^µ¾35\nlÚ\u0005ÿùöHþ\"J-\u0005U¶¥±«\u0013\u009d6¸ç;/\f\u0014(~S\u0016\rÿ<o0\u0010\u000b§m\u0002\u00ad}à}±dö\u000eÊé3¹\u0018ÌÅ\u009a}g\u0091l²\u001fíàDË\u0090Ä°øvMÂ'ò\u008d\u0012\u0018p\u001cCULÁ¬R\u009aQ¥Q\u0004T#0Å\u0005®CtCØw\u0018E6ß\u0014A\u0007\u0002*\u008fö\u0016±©\u001d\u0015~µ¨\u007fÐÀ)û\u00178\u00ad%ê¹\u0082Õ'jT®w\u0011\u0015+dwsÊ=ÕUTsYÓ¹-PÈ\u000b\t \u0011¾òAl\u0005&;\u008c;^óA:Çp\u0015â\u0011¨\u0082\u0081¼Â8ùF\u008cæ\u009b\u008dÍ\u007fí÷\u0002Bÿ\u0090ÙUyÐ\u0012\u00895Z~\u001b\u0011[l\u000fT\u0018\\\u000e¾xé~\u000f»q\u009bkØ¼û\u0091\u000e§V·\u0080D\"¬Àg\u0095\u0018µCª\u000bRa©\u008c\u0097çï*\u0087\u0089\u0011\u001a;s%ÙY¡ãk\u0010â\nqd\u001e\rj\u0002ýß\u000f\u0015t1\f\u009f\u0010\u001c\u000bè(k\u0083\b±Û\u0082{ºÔ\u007f\u008dd\u0010\u0086²æ\u0097È\u0001úEß³Ì\u008bb©Å9\u0010î6[\u009fê¹eHÔ7\u0006>s(\u0007® \u0016Q\u00ad\u0097ÃF\u0088nàLPûÝ[³<\u0010\u0083 »óÎ6÷3ÊÝüæ\u009eÏ>0ª«Æf\u000eF\r\bd±Yß\u009e\u0080ýz7\u0081\u007f5r\u0092¼Ö^ \u00050a³\u000eIu\u001b÷«Ï«]3wr0\u0091@J\u001b1 À©©^)Í\u008e\u0000Im~\u001ej\u0089?µU±=\r·\u0094gP\u0081E\u0012a2ÞæÝ";
      int var17 = "®\u0013\u0004Ö¸bÊJÕ6me¨Ä\u0019ø\u0010»f$¬|.e¤ÝCÿÜ\u0083\u0011°f(» ¢Êá\u0018\u0097ì?b\u0001Å¼\u0095p\u0006¹+\u0093S%ÊX\u0001Á\u0098Ô\u0005\u0092'ðV\u0016i\u000e×\u0080\n!ª Â$+èm#/Ùµ\u009dµdFC\"ïòÂúëÖ\u0095O\\ÂÛ1\u0096\u0094j.C\u0010¢EÂþgJ2G@/UÉB Ö\u0011(4Ã\u0099ò¬]¬x\b§O@õ\b;)\u000e\u0087Pêä±¾ìFïÔ\u0001fýR\u0081®\u0014\u0099á ¿VØ\u0018\u0089P¨Å·ÝÁßð\u0004}u¶=Ï!>Èè-\u0004½G\u000b(h\u0089Ì\u0004óó\u001dt\u0011â\u0099í)'ù¡«Ë\u0004V\u009dYáæÍnwÇ!Ä0\u000f6t\u0097tÎÿ~\u001f8ïd\nñ´ÆÃÂÂ½\u008d\næ\u0018ø\u000b\u001a\tìÄ\u0007éNa´\u0012\u008a¢½nJýn\u001ft(\u0002b7Í\u0092Äüx¿G¡\u0095\u007f\u0014\u001aZ\u009e¤ïv 'ÅLúWÃè\u0096C®£ÒIGÀ'\u0097Û¿ \u0094b{Î\u00968yb¿\u0094âì\u0010àzÊ;È\u0005Ð0\u001bKpÔ[ó®,\u0010%I6 Ä\u009fp±)ÆÃ4Î\fñÖ ð!\u0084\u008d\b$\u0001Î\u000bÆ\u0000L\u000bü\u0085\u0082\u0082\u001fN\u0080,¹¡ì\u0015®Y\u009fé0¹¦\u0018Ï&\u0000N$)U`!ÝË0\u0093Ä\u0010ñî\u0015²uô!UË\u0018J¹C«\u0013T\u001b\u0019ç\u0081ÀL¯\u0004\u009f\u001c\u008eÓ\u0099¶´Ryn\u0010\u000b~\u001a\u0013\u008aøV¶lÓ<V>å\u0016¡ K\"\u0086\u0095\u001b\u0082g\u008aõwÁûyÅ@ù¸\u0081\táÌ¢Â,\u0098\u008fe:z\u001a\u0091Ë(¤[\u001cº\u008e\u0081\u00880Cuï\u001a0NGÏ\u0000ürÊµ5oZ\u0004ÄfwV\u0092\u007fÑu}T\u0006Î\u001dX¤0\u0085§ÉÄ\u009f'½^µ¾35\nlÚ\u0005ÿùöHþ\"J-\u0005U¶¥±«\u0013\u009d6¸ç;/\f\u0014(~S\u0016\rÿ<o0\u0010\u000b§m\u0002\u00ad}à}±dö\u000eÊé3¹\u0018ÌÅ\u009a}g\u0091l²\u001fíàDË\u0090Ä°øvMÂ'ò\u008d\u0012\u0018p\u001cCULÁ¬R\u009aQ¥Q\u0004T#0Å\u0005®CtCØw\u0018E6ß\u0014A\u0007\u0002*\u008fö\u0016±©\u001d\u0015~µ¨\u007fÐÀ)û\u00178\u00ad%ê¹\u0082Õ'jT®w\u0011\u0015+dwsÊ=ÕUTsYÓ¹-PÈ\u000b\t \u0011¾òAl\u0005&;\u008c;^óA:Çp\u0015â\u0011¨\u0082\u0081¼Â8ùF\u008cæ\u009b\u008dÍ\u007fí÷\u0002Bÿ\u0090ÙUyÐ\u0012\u00895Z~\u001b\u0011[l\u000fT\u0018\\\u000e¾xé~\u000f»q\u009bkØ¼û\u0091\u000e§V·\u0080D\"¬Àg\u0095\u0018µCª\u000bRa©\u008c\u0097çï*\u0087\u0089\u0011\u001a;s%ÙY¡ãk\u0010â\nqd\u001e\rj\u0002ýß\u000f\u0015t1\f\u009f\u0010\u001c\u000bè(k\u0083\b±Û\u0082{ºÔ\u007f\u008dd\u0010\u0086²æ\u0097È\u0001úEß³Ì\u008bb©Å9\u0010î6[\u009fê¹eHÔ7\u0006>s(\u0007® \u0016Q\u00ad\u0097ÃF\u0088nàLPûÝ[³<\u0010\u0083 »óÎ6÷3ÊÝüæ\u009eÏ>0ª«Æf\u000eF\r\bd±Yß\u009e\u0080ýz7\u0081\u007f5r\u0092¼Ö^ \u00050a³\u000eIu\u001b÷«Ï«]3wr0\u0091@J\u001b1 À©©^)Í\u008e\u0000Im~\u001ej\u0089?µU±=\r·\u0094gP\u0081E\u0012a2ÞæÝ".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var33 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var33.getBytes("ISO-8859-1"));
            String var39 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var39;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  g = new String[35];
                  n = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[18];
                  int var3 = 0;
                  String var4 = "}\u0089ð\u0080¯\u009a&\u0019j\u009c\u0098[9B\u008d1ÏX±-°ïÙ/{¥\u001f \u0012x\u0080ë<sdxbñ|\u0096¯òº\u000b\u001f¨æÊv©\u00ad\u0006ÊÀì±\u0092\u0016¹ðý\u008aÞwx(\u00adµ\u001fDÀ½O\u0003\u0080Y\u0088ò¥Ë\u0097\u001c\u000bÀ\u0005\u0001\u0085ç\u000e°§\rÓ«\u0003Õ:KR2Ù¶\u009e¦àæ\u0091\u008bS\u001e\u001bûkçò?/*ÃB×U\u008b\u0095¼\t{B";
                  int var5 = "}\u0089ð\u0080¯\u009a&\u0019j\u009c\u0098[9B\u008d1ÏX±-°ïÙ/{¥\u001f \u0012x\u0080ë<sdxbñ|\u0096¯òº\u000b\u001f¨æÊv©\u00ad\u0006ÊÀì±\u0092\u0016¹ðý\u008aÞwx(\u00adµ\u001fDÀ½O\u0003\u0080Y\u0088ò¥Ë\u0097\u001c\u000bÀ\u0005\u0001\u0085ç\u000e°§\rÓ«\u0003Õ:KR2Ù¶\u009e¦àæ\u0091\u008bS\u001e\u001bûkçò?/*ÃB×U\u008b\u0095¼\t{B".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var37 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                     long[] var36 = var6;
                     var37 = var3++;
                     long var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var8 = var41;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var42) {
                        case 0:
                           var36[var37] = var44;
                           if (var2 >= var5) {
                              l = var6;
                              m = new Integer[18];
                              KProperty[] var32 = new KProperty[true.a<invokedynamic>(30700, 4546841953490369454L ^ var20)];
                              var32[0] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yg.class, true.p<invokedynamic>(24665, 3631894082445811079L ^ var20), true.p<invokedynamic>(2565, 1951095117111556043L ^ var20), 0)));
                              var32[1] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yg.class, true.p<invokedynamic>(19454, 4947879785298605631L ^ var20), true.p<invokedynamic>(12076, 3453228089123001087L ^ var20), 0)));
                              var32[2] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yg.class, true.p<invokedynamic>(27735, 3354172703204348312L ^ var20), true.p<invokedynamic>(11846, 3772925763058684806L ^ var20), 0)));
                              var32[3] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yg.class, true.p<invokedynamic>(8431, 5318745066220608820L ^ var20), true.p<invokedynamic>(2694, 5828153192813950798L ^ var20), 0)));
                              var32[4] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yg.class, true.p<invokedynamic>(13434, 1444737674749299081L ^ var20), true.p<invokedynamic>(29112, 8721244809326660734L ^ var20), 0)));
                              var32[5] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yg.class, true.p<invokedynamic>(21492, 5418490776525581872L ^ var20), true.p<invokedynamic>(15999, 7462113580966232998L ^ var20), 0)));
                              var32[true.a<invokedynamic>(29396, 2158661973116550794L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yg.class, true.p<invokedynamic>(6060, 5319166590393379446L ^ var20), true.p<invokedynamic>(1649, 6304110034433964984L ^ var20), 0)));
                              var32[true.a<invokedynamic>(18512, 2025875937568900115L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yg.class, true.p<invokedynamic>(26514, 439985492312398425L ^ var20), true.p<invokedynamic>(2905, 3031887559150237326L ^ var20), 0)));
                              var32[true.a<invokedynamic>(4080, 3616562475143594920L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yg.class, true.p<invokedynamic>(10565, 3222877235873928372L ^ var20), true.p<invokedynamic>(24707, 7328023279646023003L ^ var20), 0)));
                              var32[true.a<invokedynamic>(14434, 5314816559611524152L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yg.class, true.p<invokedynamic>(8692, 3437436381311491134L ^ var20), true.p<invokedynamic>(30257, 5268356596089719788L ^ var20), 0)));
                              var32[true.a<invokedynamic>(2737, 5963195117312706282L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yg.class, true.p<invokedynamic>(6792, 4190122434898913113L ^ var20), true.p<invokedynamic>(510, 97503322524875837L ^ var20), 0)));
                              b = var32;
                              f = new yg(var22);
                              B = qi.M((il)f, true.p<invokedynamic>(24170, 3199324821111645119L ^ var20), (Enum)ds.Vanilla, (pj)null, (Function0)null, true.a<invokedynamic>(13770, 9034756141614512539L ^ var20), (Object)null, var26);
                              O = qi.o((il)f, true.p<invokedynamic>(17275, 7243818861551107759L ^ var20), true.a<invokedynamic>(29396, 2158661973116550794L ^ var20), new IntRange(2, true.a<invokedynamic>(29396, 2158661973116550794L ^ var20)), var24, (pj)null, yg::s, true.a<invokedynamic>(4080, 3616562475143594920L ^ var20), (Object)null);
                              o = qi.o((il)f, true.p<invokedynamic>(12873, 563427453063319455L ^ var20), 0, new IntRange(0, true.a<invokedynamic>(9145, 1164934905081704425L ^ var20)), var24, (pj)null, yg::w, true.a<invokedynamic>(4080, 3616562475143594920L ^ var20), (Object)null);
                              U = qi.R((il)f, true.p<invokedynamic>(11920, 8811922401307939680L ^ var20), true, (pj)null, (Function0)null, true.a<invokedynamic>(23358, 8404632938485995368L ^ var20), var30, (Object)null);
                              t = qi.M((il)f, true.p<invokedynamic>(11756, 3766626454032338985L ^ var20), (Enum)m7.Normal, (pj)null, (Function0)null, true.a<invokedynamic>(23358, 8404632938485995368L ^ var20), (Object)null, var26);
                              W = qi.M((il)f, true.p<invokedynamic>(19236, 9198047619345364707L ^ var20), (Enum)st.Strict, (pj)null, (Function0)null, true.a<invokedynamic>(23358, 8404632938485995368L ^ var20), (Object)null, var26);
                              T = qi.M((il)f, true.p<invokedynamic>(8066, 355023787352547919L ^ var20), (Enum)gt.Silent, (pj)null, (Function0)null, true.a<invokedynamic>(23358, 8404632938485995368L ^ var20), (Object)null, var26);
                              i = qi.g((il)f, true.p<invokedynamic>(17200, 7638835851014225660L ^ var20), 4.0F, RangesKt.rangeTo(2.0F, 10.0F), (pj)null, (Function0)null, true.a<invokedynamic>(22080, 634946470304287L ^ var20), var28, (Object)null);
                              d = qi.g((il)f, true.p<invokedynamic>(12794, 8375173504212585509L ^ var20), 4.0F, RangesKt.rangeTo(2.0F, 10.0F), (pj)null, (Function0)null, true.a<invokedynamic>(18213, 1378013742587202422L ^ var20), var28, (Object)null);
                              v = qi.R((il)f, true.p<invokedynamic>(8702, 519059019040382012L ^ var20), true, (pj)null, (Function0)null, true.a<invokedynamic>(23358, 8404632938485995368L ^ var20), var30, (Object)null);
                              I = qi.M((il)f, true.p<invokedynamic>(23040, 5566297208745535440L ^ var20), (Enum)nr.LYING, (pj)null, (Function0)null, true.a<invokedynamic>(23358, 8404632938485995368L ^ var20), (Object)null, var26);
                              w = (List)(new ArrayList());
                              z = new iv();
                              return;
                           }
                           break;
                        default:
                           var36[var37] = var44;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "ÖL1\u000b\u0087\u0013=,(-\u008e:o¸iù";
                           var5 = "ÖL1\u000b\u0087\u0013=,(-\u008e:o¸iù".length();
                           var2 = 0;
                        }

                        var37 = var2;
                        var2 += 8;
                        var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                        var36 = var6;
                        var37 = var3++;
                        var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var42 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var39;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u008e\u0087\u0098\u008b\u000e\u009e\u001elïàb\tñ\u0094Ð\u0005\u00184\u00934Xµ\r\u0010Zî4\u0005z\u0004\u0093»þÖ×wZoIÐ\u001f";
               var17 = "\u008e\u0087\u0098\u008b\u000e\u009e\u001elïàb\tñ\u0094Ð\u0005\u00184\u00934Xµ\r\u0010Zî4\u0005z\u0004\u0093»þÖ×wZoIÐ\u001f".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var33 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22193;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])k.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/yg", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("su/catlean/yg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10035;
      if (m[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = l[var3];
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
            throw new RuntimeException("su/catlean/yg", var14);
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
         throw new RuntimeException("su/catlean/yg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
