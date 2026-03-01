package su.catlean;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_276;
import net.minecraft.class_290;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class lr extends k9 {
   @NotNull
   public static final lr A;
   static final KProperty[] m;
   @NotNull
   private static final zo V;
   @NotNull
   private static final zo R;
   @NotNull
   private static final zr s;
   @NotNull
   private static final zc w;
   @NotNull
   private static final z0 W;
   @NotNull
   private static final z0 c;
   @NotNull
   private static final zc B;
   @NotNull
   private static final zc r;
   @NotNull
   private static final zc J;
   @NotNull
   private static final List T;
   private static final long b = j0.a(-6013385386798028267L, 6263370531500656749L, MethodHandles.lookup().lookupClass()).a(123734059862626L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private lr(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 20926892271724L;
      super(var3, true.c<invokedynamic>(5047, 6804602975039150083L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean S(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 134328131083765L;
      int var3 = (int)((var1 ^ 134328131083765L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)V.k((short)var3, this, m[0], (short)var4, var5);
   }

   private final void O(int var1, boolean var2, int var3, short var4) {
      long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 25881415244945L;
      int var7 = (int)((var5 ^ 25881415244945L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      V.P(this, var7, m[0], (short)var8, var2, (short)var9);
   }

   private final boolean d(long var1, byte var3) {
      long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ b;
      long var10001 = var4 ^ 80294352208858L;
      int var6 = (int)((var4 ^ 80294352208858L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)R.k((short)var6, this, m[1], (short)var7, var8);
   }

   private final void s(boolean var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 15373397314447L;
      int var4 = (int)((var2 ^ 15373397314447L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      R.P(this, var4, m[1], (short)var5, var1, (short)var6);
   }

   private final rq f(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 28184244934950L;
      int var3 = (int)((var1 ^ 28184244934950L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (rq)s.k((short)var3, this, m[2], (short)var4, var5);
   }

   private final void k(rq var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 26862845344039L;
      int var4 = (int)((var2 ^ 26862845344039L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      s.P(this, var4, m[2], (short)var5, var1, (short)var6);
   }

   private final float i(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 62947122108515L;
      int var3 = (int)((var1 ^ 62947122108515L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)w.k((short)var3, this, m[3], (short)var4, var5)).floatValue();
   }

   private final void f(long var1, float var3) {
      var1 ^= b;
      long var10001 = var1 ^ 26839491968847L;
      int var4 = (int)((var1 ^ 26839491968847L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      w.P(this, var4, m[3], (short)var5, var3, (short)var6);
   }

   private final int p(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 27695764306778L;
      int var3 = (int)((var1 ^ 27695764306778L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)W.k((short)var3, this, m[4], (short)var4, var5)).intValue();
   }

   private final void H(long var1, int var3) {
      var1 ^= b;
      long var10001 = var1 ^ 68760583117843L;
      int var4 = (int)((var1 ^ 68760583117843L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      W.P(this, var4, m[4], (short)var5, var3, (short)var6);
   }

   private final int t(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 16321036923366L;
      int var3 = (int)((var1 ^ 16321036923366L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)c.k((short)var3, this, m[5], (short)var4, var5)).intValue();
   }

   private final void F(char var1, int var2, short var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ b;
      long var10001 = var5 ^ 78783398293109L;
      int var7 = (int)((var5 ^ 78783398293109L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      c.P(this, var7, m[5], (short)var8, var2, (short)var9);
   }

   private final float G(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 91059896630372L;
      int var3 = (int)((var1 ^ 91059896630372L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)B.k((short)var3, this, m[true.n<invokedynamic>(24910, 3769718001713979245L ^ var1)], (short)var4, var5)).floatValue();
   }

   private final void W(long var1, float var3) {
      var1 ^= b;
      long var10001 = var1 ^ 57795464431371L;
      int var4 = (int)((var1 ^ 57795464431371L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      B.P(this, var4, m[true.n<invokedynamic>(28534, 5862737587134044712L ^ var1)], (short)var5, var3, (short)var6);
   }

   private final float P(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 111934684051055L;
      int var3 = (int)((var1 ^ 111934684051055L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)r.k((short)var3, this, m[true.n<invokedynamic>(22529, 7358205962234768418L ^ var1)], (short)var4, var5)).floatValue();
   }

   private final void J(long var1, float var3) {
      var1 ^= b;
      long var10001 = var1 ^ 129024477648423L;
      int var4 = (int)((var1 ^ 129024477648423L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      r.P(this, var4, m[true.n<invokedynamic>(10296, 3682195189273234501L ^ var1)], (short)var5, var3, (short)var6);
   }

   private final float L(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 15292586115839L;
      int var3 = (int)((var1 ^ 15292586115839L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)J.k((short)var3, this, m[true.n<invokedynamic>(12137, 7412028525387329495L ^ var1)], (short)var4, var5)).floatValue();
   }

   private final void Y(int var1, char var2, short var3, float var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 16013703541823L;
      int var7 = (int)((var5 ^ 16013703541823L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      J.P(this, var7, m[true.n<invokedynamic>(22005, 3896891929464099730L ^ var5)], (short)var8, var4, (short)var9);
   }

   @Flow
   private final void u(SendPacket var1) {
      long var2 = b ^ 105865940984065L;
      long var10001 = var2 ^ 3951757577154L;
      int var4 = (int)((var2 ^ 3951757577154L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      s8.H((short)var4, (short)var5, var6).method_40000(lr::E);
   }

   @Flow
   private final void E(Render3DEvent var1) {
      long var2 = b ^ 74727267012295L;
      long var4 = var2 ^ 97725730580858L;
      long var6 = var2 ^ 63560838022356L;
      long var8 = var2 ^ 138592024610120L;
      long var10001 = var2 ^ 35347830514692L;
      int var10 = (int)((var2 ^ 35347830514692L) >>> 48);
      int var11 = (int)(var10001 << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      long var13 = var2 ^ 73388743866511L;
      long var15 = var2 ^ 76465541076978L;
      k9[] var10000 = -2916947463395706502L.A<invokedynamic>(-2916947463395706502L, var2);
      ArrayList var34 = Lists.newArrayList((Iterable)T);
      Intrinsics.checkNotNullExpressionValue(var34, true.c<invokedynamic>(20589, 1078725779625491982L ^ var2));
      ArrayList var18 = var34;
      VertexFormat var10003 = class_290.field_1575;
      Intrinsics.checkNotNullExpressionValue(var10003, true.c<invokedynamic>(30463, 2566083319436253338L ^ var2));
      ib var19 = new ib(var10003, var18.size() * 2, false, 4, var6, (DefaultConstructorMarker)null);
      k9[] var17 = var10000;
      Iterable var20 = (Iterable)var18;
      boolean var21 = false;
      Iterator var22 = var20.iterator();

      while(var22.hasNext()) {
         Object var23 = var22.next();
         d9 var24 = (d9)var23;
         boolean var25 = false;
         int var26 = RangesKt.coerceIn((int)((float)var24.U().D() / 40.0F), 0, true.n<invokedynamic>(22005, 3896968226948690871L ^ var2));
         float var27 = (q7.SMOKE.n() - q7.SMOKE.Z()) / 3.0F;
         float var28 = (q7.SMOKE.k() - q7.SMOKE.q()) / 3.0F;
         float var29 = q7.SMOKE.Z() + (float)(var26 % 3) * var27;
         float var30 = q7.SMOKE.q() + (float)(var26 / 3) * var28;
         float var31 = (float)var24.U().D() / 450.0F;

         try {
            q1.b(q1.A, _h.o(), var24.h(), var24.V(), var24.E(), 0.0F, 1.0F + var31, gk.E.e(var8, z8.I.Z(var13, true.n<invokedynamic>(14519, 3359439091644915442L ^ var2)), 1.0F), false, var19, var29, var4, var30, var29 + var27, var30 + var28, true, true.n<invokedynamic>(1614, 246791926147833860L ^ var2), (Object)null);
            if (var17 != null && var17 != null) {
               continue;
            }
            break;
         } catch (NumberFormatException var32) {
            throw var32.A<invokedynamic>(var32, -2899398623656035746L, var2);
         }
      }

      GpuTextureView var33 = s8.H((short)var10, (short)var11, var12).method_1531().method_4619(_h.o()).method_71659();
      Intrinsics.checkNotNullExpressionValue(var33, true.c<invokedynamic>(29723, 176090810183391856L ^ var2));
      GpuTextureView var36 = var33;
      RenderPipeline var35 = v2.S.t();
      class_276 var10002 = s8.H((short)var10, (short)var11, var12).method_1522();
      Intrinsics.checkNotNullExpressionValue(var10002, true.c<invokedynamic>(31529, 3994731477270697294L ^ var2));
      ib.j(var19, var35, var10002, var15, (GpuBufferSlice)null, var1.getStack().method_23760().method_23761(), (Matrix3x2f)null, MapsKt.mapOf(TuplesKt.to(true.c<invokedynamic>(17778, 1309277182890486533L ^ var2), var36)), true.n<invokedynamic>(7598, 8575004561704090595L ^ var2), (Object)null);
      T.removeIf(lr::B);
   }

   private static final boolean H() {
      long var0 = b ^ 72607563155903L;
      long var10001 = var0 ^ 63769885751480L;
      long var2 = (var0 ^ 63769885751480L) >>> 8;
      int var4 = (int)(var10001 << 56 >>> 56);
      return A.d(var2, (byte)var4);
   }

   private static final boolean R() {
      long var0 = b ^ 12062416338576L;
      long var10001 = var0 ^ 124306309500823L;
      long var2 = (var0 ^ 124306309500823L) >>> 8;
      int var4 = (int)(var10001 << 56 >>> 56);
      return A.d(var2, (byte)var4);
   }

   private static final boolean W() {
      long var0 = b ^ 108468455083399L;
      long var10001 = var0 ^ 27831771708544L;
      long var2 = (var0 ^ 27831771708544L) >>> 8;
      int var4 = (int)(var10001 << 56 >>> 56);
      return A.d(var2, (byte)var4);
   }

   private static final boolean A() {
      long var0 = b ^ 133031938516046L;
      long var10001 = var0 ^ 3346720216393L;
      long var2 = (var0 ^ 3346720216393L) >>> 8;
      int var4 = (int)(var10001 << 56 >>> 56);
      return A.d(var2, (byte)var4);
   }

   private static final boolean V() {
      long var0 = b ^ 130623972533239L;
      long var10001 = var0 ^ 14549505463024L;
      long var2 = (var0 ^ 14549505463024L) >>> 8;
      int var4 = (int)(var10001 << 56 >>> 56);
      return A.d(var2, (byte)var4);
   }

   private static final boolean M() {
      long var0 = b ^ 77880750638391L;
      long var10001 = var0 ^ 67224142066736L;
      long var2 = (var0 ^ 67224142066736L) >>> 8;
      int var4 = (int)(var10001 << 56 >>> 56);
      return A.d(var2, (byte)var4);
   }

   private static final boolean J() {
      long var0 = b ^ 122025747573063L;
      long var10001 = var0 ^ 23147797010496L;
      long var2 = (var0 ^ 23147797010496L) >>> 8;
      int var4 = (int)(var10001 << 56 >>> 56);
      return A.d(var2, (byte)var4);
   }

   private static final void E(SendPacket param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean i(d9 var0) {
      long var1 = b ^ 102653139434715L;
      long var3 = var1 ^ 126352688403241L;
      Intrinsics.checkNotNullParameter(var0, true.c<invokedynamic>(22488, 4901897780552076212L ^ var1));
      return var0.U().C(true.n<invokedynamic>(27686, 8172824010790680700L ^ var1), var3);
   }

   private static final boolean B(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = b ^ 136178623467211L;
      long var22 = var20 ^ 39412355315895L;
      long var24 = var20 ^ 60002768548226L;
      long var26 = var20 ^ 88662805809766L;
      long var28 = var20 ^ 5087426754161L;
      long var30 = var20 ^ 68226856762843L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[34];
      int var16 = 0;
      String var15 = "ÿ\u001d\u008dåéå:&3\u009a\nI\u008aÏ\u0011G¥UÖGls\u0096\\\u001c\u009f\u0095Ü4Ô|\u009f\u0010\u008biL *ÿ·Òb\u001e»YÆ¹Ô© \u0013\f\u0098\u0013ÀqK¼}F\u0088Þï\u009dÊ\u0093\u001f7xöly\u0094Í1\u0082\u0013\u0012y\u009dtæ üuÊ\u0084n»\u00ad\u001ch¸A¶Ò\"\u0011ô\u0088Û\u008cªtÞüj#%\u007fR\u0007u\u0017\u0096\u0018\u001aw²jgìg\"\u001eh\u0082©û\u0085ãÏ\u0016]©ØÇ½j_\u0010K\u008bí Î\u008d\u00ad%Ó\u000b2µß¢\u001aJ\u0010\u009a9&®ÍÀ\u000eÜ\u0099ÿ\u001c]!°UÀ\u0018.¡pN\u0091\u0015M¸\u0090öx\u008f3ÖÔåtÝe»\u0080^\u008d\u008c\u0010à\u0018\u0019\b¾ô$(µ\u0085{\tM\b»â Úähîk\u007f±z8fïfz}°Õ ö¨¢ ÙZ\u0090±_*i>G®\u0016\u0010Ñoa\u0088Hfæ'6ìã\u009b-«0^(>\u009a\u009c\u001bC\u0089Ú$\u0081ªFÓ\u0004ÂìÌ\u0087pÈÆk¾·\u009e6/xaU@í#ØQ\u0018eñFe¹\u0018ÚN¡\u0086\u001f&jï¡\u0092\"ýz\u0005·æ\u009cõ\u0086<KDÇu 7$·\u000eûèª\u001a\u0016ÜôÜÓC\u001c\u001e\u00199ô\u001a¤Lòcq¤Z%~Þ1%\u0018¢H\u000f\u0014nâK½DJ(\u0090\u0095x.\u001a]Rcµý\"æó ÁÔBÈXå5söµÏL¿k|k&¤Ú\u0010Õ5(5é \rG3y{±\u0010þ\u008cr\u0090~\u00960\u0094\u0085¯\u009eKÀK¹\u001a(ÆÖð\u008c*sÏ©èþ\u0002cfä\u0099(_dX\u0097?\\\r\u0014\u0007Zíi\u0014\u001dnA\u001b¤!B1Õõy\u0010\u0010\u0016»P\u001dó\u0086\u000f'V/1$4'\u0083(Õ\\÷Ã=3ûfw\u001f\u0086Ì0ã\u0016[Ú\u0083\u0080±¥\u001b@¦L&¨cÿ{\u001e\u007f\u0016Þ7\u0015¶5¹Ù\u0018ó\u0082Î#=ÇG\u008a¹\u0080¬1\u008b\u0091y\u009a\u0011{\u001dÁ=FÚ7\u0010O-\u0007¹g\u0018Rj<ËU\u0002Pî,à h¦^\u0084Þ$ëËò[Ø»ùþÊ1\u0088{Í%;Û\u00ad\nBÙá\u008fIyKI \u0094þ\u000fl\u008b\u000e\u0016lö\u0092nÒb\u0085\u0007o\u0090lø¡\u0013a\u00140\u000b«÷\rÏÜ\u0080Ü T\u008de±X´\u0097pC\u0088z¾Rsÿ³G\u000fs\u0080sZ¼ô\u0089±yd>\u001aÅ³\u0010A\u001eÄì(\u000bï\u0003Ã\u001a-°B¡\u0092ü\u0010D[¼«ö¦¾\u0093*]`îMi%÷(øçoó\u00ad¹\u0096\u001b`ôÊý\u00adr;?8±f²<]Xm·)KLEþéÜ\u009aM48\b0½\u00930?ë÷.}en¤+à\u000ejã9Ü)7asÒ\u0094\u0011@H\u0018\u0097º\u001ePú\u00855Zóu{ì\"³8¯£\u0003\u008dÌyü\u0016(o¿¯¬ð9QÝ<Vz\u001ePO\u008c\u0001ô¨\u0087ý\u0015£ÚLÎ}ëH4F´êaI\rZ1r\u001b~ Hhà_\n\u0012íkX\u0096ßþ@\b\u0096\u0000ÃKiÕù/ÈW¼ù'â\u000f9\u0094Ê8\u0013\u001d¼Þù·\u0095 Å£aáDY®Ý¥{Ùl\\³\u008eL\u0002\u0004\u008dDWòtë\u001e0\u0012¶ ñ\u00071³\u0095\u001dR\u0096~Åp1Ä\t\u009c\u0087Ñz*";
      int var17 = "ÿ\u001d\u008dåéå:&3\u009a\nI\u008aÏ\u0011G¥UÖGls\u0096\\\u001c\u009f\u0095Ü4Ô|\u009f\u0010\u008biL *ÿ·Òb\u001e»YÆ¹Ô© \u0013\f\u0098\u0013ÀqK¼}F\u0088Þï\u009dÊ\u0093\u001f7xöly\u0094Í1\u0082\u0013\u0012y\u009dtæ üuÊ\u0084n»\u00ad\u001ch¸A¶Ò\"\u0011ô\u0088Û\u008cªtÞüj#%\u007fR\u0007u\u0017\u0096\u0018\u001aw²jgìg\"\u001eh\u0082©û\u0085ãÏ\u0016]©ØÇ½j_\u0010K\u008bí Î\u008d\u00ad%Ó\u000b2µß¢\u001aJ\u0010\u009a9&®ÍÀ\u000eÜ\u0099ÿ\u001c]!°UÀ\u0018.¡pN\u0091\u0015M¸\u0090öx\u008f3ÖÔåtÝe»\u0080^\u008d\u008c\u0010à\u0018\u0019\b¾ô$(µ\u0085{\tM\b»â Úähîk\u007f±z8fïfz}°Õ ö¨¢ ÙZ\u0090±_*i>G®\u0016\u0010Ñoa\u0088Hfæ'6ìã\u009b-«0^(>\u009a\u009c\u001bC\u0089Ú$\u0081ªFÓ\u0004ÂìÌ\u0087pÈÆk¾·\u009e6/xaU@í#ØQ\u0018eñFe¹\u0018ÚN¡\u0086\u001f&jï¡\u0092\"ýz\u0005·æ\u009cõ\u0086<KDÇu 7$·\u000eûèª\u001a\u0016ÜôÜÓC\u001c\u001e\u00199ô\u001a¤Lòcq¤Z%~Þ1%\u0018¢H\u000f\u0014nâK½DJ(\u0090\u0095x.\u001a]Rcµý\"æó ÁÔBÈXå5söµÏL¿k|k&¤Ú\u0010Õ5(5é \rG3y{±\u0010þ\u008cr\u0090~\u00960\u0094\u0085¯\u009eKÀK¹\u001a(ÆÖð\u008c*sÏ©èþ\u0002cfä\u0099(_dX\u0097?\\\r\u0014\u0007Zíi\u0014\u001dnA\u001b¤!B1Õõy\u0010\u0010\u0016»P\u001dó\u0086\u000f'V/1$4'\u0083(Õ\\÷Ã=3ûfw\u001f\u0086Ì0ã\u0016[Ú\u0083\u0080±¥\u001b@¦L&¨cÿ{\u001e\u007f\u0016Þ7\u0015¶5¹Ù\u0018ó\u0082Î#=ÇG\u008a¹\u0080¬1\u008b\u0091y\u009a\u0011{\u001dÁ=FÚ7\u0010O-\u0007¹g\u0018Rj<ËU\u0002Pî,à h¦^\u0084Þ$ëËò[Ø»ùþÊ1\u0088{Í%;Û\u00ad\nBÙá\u008fIyKI \u0094þ\u000fl\u008b\u000e\u0016lö\u0092nÒb\u0085\u0007o\u0090lø¡\u0013a\u00140\u000b«÷\rÏÜ\u0080Ü T\u008de±X´\u0097pC\u0088z¾Rsÿ³G\u000fs\u0080sZ¼ô\u0089±yd>\u001aÅ³\u0010A\u001eÄì(\u000bï\u0003Ã\u001a-°B¡\u0092ü\u0010D[¼«ö¦¾\u0093*]`îMi%÷(øçoó\u00ad¹\u0096\u001b`ôÊý\u00adr;?8±f²<]Xm·)KLEþéÜ\u009aM48\b0½\u00930?ë÷.}en¤+à\u000ejã9Ü)7asÒ\u0094\u0011@H\u0018\u0097º\u001ePú\u00855Zóu{ì\"³8¯£\u0003\u008dÌyü\u0016(o¿¯¬ð9QÝ<Vz\u001ePO\u008c\u0001ô¨\u0087ý\u0015£ÚLÎ}ëH4F´êaI\rZ1r\u001b~ Hhà_\n\u0012íkX\u0096ßþ@\b\u0096\u0000ÃKiÕù/ÈW¼ù'â\u000f9\u0094Ê8\u0013\u001d¼Þù·\u0095 Å£aáDY®Ý¥{Ùl\\³\u008eL\u0002\u0004\u008dDWòtë\u001e0\u0012¶ ñ\u00071³\u0095\u001dR\u0096~Åp1Ä\t\u009c\u0087Ñz*".length();
      char var14 = ' ';
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
                  d = var18;
                  e = new String[34];
                  k = new HashMap(13);
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
                  String var4 = "²¼ÊÖ©Z·@Cm}±ô-\u000fÉ,ô±6&ÎâÆ¹mäÔ·\u000fñû\u0006\u0089áF\u0015g\u0005\u0093\u009fQý°\u008c\u008e¢´øÝ&\u0017Í\u0087@\u0011fM5O\u000fC\u0083\u0005±\u0099¶\u00adæå\u0094Ð\u008d¤C¡g·f.T#K¦>ÐòÁâÜgNR@\u000f³¬\u007fN?î\u008a5,_t\u009bÌ¶\u0006\u0087\u009e¿£\u000brÿd\t\u0000óñp&\u008dêØ\u009a";
                  int var5 = "²¼ÊÖ©Z·@Cm}±ô-\u000fÉ,ô±6&ÎâÆ¹mäÔ·\u000fñû\u0006\u0089áF\u0015g\u0005\u0093\u009fQý°\u008c\u008e¢´øÝ&\u0017Í\u0087@\u0011fM5O\u000fC\u0083\u0005±\u0099¶\u00adæå\u0094Ð\u008d¤C¡g·f.T#K¦>ÐòÁâÜgNR@\u000f³¬\u007fN?î\u008a5,_t\u009bÌ¶\u0006\u0087\u009e¿£\u000brÿd\t\u0000óñp&\u008dêØ\u009a".length();
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
                              g = var6;
                              i = new Integer[18];
                              KProperty[] var32 = new KProperty[true.n<invokedynamic>(24896, 1518706859475322629L ^ var20)];
                              var32[0] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lr.class, true.c<invokedynamic>(14285, 6658977044403296683L ^ var20), true.c<invokedynamic>(17172, 5209788276256861543L ^ var20), 0)));
                              var32[1] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lr.class, true.c<invokedynamic>(12537, 7029735794854829705L ^ var20), true.c<invokedynamic>(2449, 1860773999242749928L ^ var20), 0)));
                              var32[2] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lr.class, true.c<invokedynamic>(32355, 3602498687075274782L ^ var20), true.c<invokedynamic>(32164, 3437727517900198860L ^ var20), 0)));
                              var32[3] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lr.class, true.c<invokedynamic>(12842, 6378423294823275595L ^ var20), true.c<invokedynamic>(23838, 8519892004550341478L ^ var20), 0)));
                              var32[4] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lr.class, true.c<invokedynamic>(7722, 2844611015812624510L ^ var20), true.c<invokedynamic>(10491, 5173420990488184494L ^ var20), 0)));
                              var32[5] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lr.class, true.c<invokedynamic>(19999, 7987300553321472113L ^ var20), true.c<invokedynamic>(215, 3540894860230995636L ^ var20), 0)));
                              var32[true.n<invokedynamic>(24910, 3769673335783737093L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lr.class, true.c<invokedynamic>(5590, 4509106412511509412L ^ var20), true.c<invokedynamic>(21902, 4509944001659436024L ^ var20), 0)));
                              var32[true.n<invokedynamic>(10296, 3682202334629957236L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lr.class, true.c<invokedynamic>(32021, 3793763845914743650L ^ var20), true.c<invokedynamic>(7176, 2822931920680956535L ^ var20), 0)));
                              var32[true.n<invokedynamic>(22005, 3897012088258458555L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lr.class, true.c<invokedynamic>(18727, 8854063107204835147L ^ var20), true.c<invokedynamic>(23431, 63572511178257917L ^ var20), 0)));
                              m = var32;
                              A = new lr(var30);
                              V = qi.R((il)A, true.c<invokedynamic>(12832, 5577139358357986372L ^ var20), true, (pj)null, (Function0)null, true.n<invokedynamic>(27321, 578278585030266107L ^ var20), var28, (Object)null);
                              R = qi.R((il)A, true.c<invokedynamic>(20929, 7624999306096869291L ^ var20), true, (pj)null, (Function0)null, true.n<invokedynamic>(18236, 4134640884229923195L ^ var20), var28, (Object)null);
                              s = qi.M((il)A, true.c<invokedynamic>(10420, 8153323704704042708L ^ var20), (Enum)rq.HEART, (pj)null, lr::H, 4, (Object)null, var24);
                              w = qi.g((il)A, true.c<invokedynamic>(3290, 3561540447810953899L ^ var20), 0.2F, RangesKt.rangeTo(0.01F, 0.5F), (pj)null, lr::R, true.n<invokedynamic>(22005, 3897012088258458555L ^ var20), var26, (Object)null);
                              W = qi.o((il)A, true.c<invokedynamic>(19768, 3320978226976023386L ^ var20), true.n<invokedynamic>(11215, 5714100251242302855L ^ var20), new IntRange(5, true.n<invokedynamic>(9410, 8766416036051157654L ^ var20)), var22, (pj)null, lr::W, true.n<invokedynamic>(22005, 3897012088258458555L ^ var20), (Object)null);
                              c = qi.o((il)A, true.c<invokedynamic>(30627, 8675852485304113629L ^ var20), true.n<invokedynamic>(25457, 2117907641725109540L ^ var20), new IntRange(5, true.n<invokedynamic>(22799, 6632553760752172864L ^ var20)), var22, (pj)null, lr::A, true.n<invokedynamic>(22005, 3897012088258458555L ^ var20), (Object)null);
                              B = qi.g((il)A, true.c<invokedynamic>(11775, 4329817098230301586L ^ var20), 0.03F, RangesKt.rangeTo(-0.15F, 0.15F), (pj)null, lr::V, true.n<invokedynamic>(22005, 3897012088258458555L ^ var20), var26, (Object)null);
                              r = qi.g((il)A, true.c<invokedynamic>(20437, 5033559174371598768L ^ var20), 0.25F, RangesKt.rangeTo(0.01F, 2.0F), (pj)null, lr::M, true.n<invokedynamic>(22005, 3897012088258458555L ^ var20), var26, (Object)null);
                              J = qi.g((il)A, true.c<invokedynamic>(24009, 778112888050348989L ^ var20), 0.5F, RangesKt.rangeTo(0.01F, 2.0F), (pj)null, lr::J, true.n<invokedynamic>(22005, 3897012088258458555L ^ var20), var26, (Object)null);
                              T = (List)(new ArrayList());
                              return;
                           }
                           break;
                        default:
                           var36[var37] = var44;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "3\u008f¡²9?TeûÌï\u000eD1×O";
                           var5 = "3\u008f¡²9?TeûÌï\u000eD1×O".length();
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

               var15 = "Z{){\u009d÷4\u009e\rDUY^K\u0007\u0011ú\u0014]\u009b, ¥kzaÑªß`0\u009a\u0018É\u0087îÝ|\u008f\u0093(ò= ã|+è\u0010'¥Ê÷\u0094@¤U";
               var17 = "Z{){\u009d÷4\u009e\rDUY^K\u0007\u0011ú\u0014]\u009b, ¥kzaÑªß`0\u009a\u0018É\u0087îÝ|\u008f\u0093(ò= ã|+è\u0010'¥Ê÷\u0094@¤U".length();
               var14 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14501;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/lr", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/lr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12437;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/lr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("su/catlean/lr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
