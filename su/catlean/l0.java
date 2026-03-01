package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
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
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class l0 extends k9 {
   @NotNull
   public static final l0 T;
   static final KProperty[] i;
   @NotNull
   private static final zr b;
   @NotNull
   private static final z0 n;
   @NotNull
   private static final zc K;
   @NotNull
   private static final zc k;
   @NotNull
   private static final CopyOnWriteArrayList y;
   private static final long c = j0.a(6215173300477205865L, 4195898619756284899L, MethodHandles.lookup().lookupClass()).a(198008315995094L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] l;
   private static final Map m;

   private l0(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 49422893192414L;
      super(var3, true.t<invokedynamic>(200, 3094023767560448026L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final b9 p(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 56910907533081L;
      int var3 = (int)((var1 ^ 56910907533081L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (b9)b.k((short)var3, this, i[0], (short)var4, var5);
   }

   private final int A(char var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ c;
      long var10001 = var4 ^ 129838523771024L;
      int var6 = (int)((var4 ^ 129838523771024L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)n.k((short)var6, this, i[1], (short)var7, var8)).intValue();
   }

   private final float u(int var1, int var2) {
      long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ c;
      long var10001 = var3 ^ 82746166561539L;
      int var5 = (int)((var3 ^ 82746166561539L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      return ((Number)K.k((short)var5, this, i[2], (short)var6, var7)).floatValue();
   }

   private final float T(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 13030186798032L;
      int var3 = (int)((var1 ^ 13030186798032L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)k.k((short)var3, this, i[3], (short)var4, var5)).floatValue();
   }

   @Flow
   private final void X(PlayerUpdateEvent var1) {
      y.removeIf(l0::t);
   }

   @Flow
   private final void c(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void C(@NotNull ReceivePacket event) {
      // $FF: Couldn't be decompiled
   }

   private final void J(class_4587 var1, long var2, sy var4) {
      var2 ^= c;
      long var5 = var2 ^ 35252900466415L;
      long var7 = var2 ^ 39398296699979L;
      long var10001 = var2 ^ 64037001323675L;
      int var9 = (int)((var2 ^ 64037001323675L) >>> 48);
      int var10 = (int)(var10001 << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      long var12 = var2 ^ 110052903192023L;
      long var14 = var2 ^ 43704516506282L;
      long var16 = var2 ^ 110540638889115L;
      var10001 = var2 ^ 55993115830828L;
      long var18 = (var2 ^ 55993115830828L) >>> 16;
      int var20 = (int)(var10001 << 48 >>> 48);
      long var21 = var2 ^ 105073375909741L;
      GpuTextureView var10000 = s8.H((short)var9, (short)var10, var11).method_1531().method_4619(var4.l()).method_71659();
      Intrinsics.checkNotNullExpressionValue(var10000, true.t<invokedynamic>(21926, 334646260254745749L ^ var2));
      GpuTextureView var23 = var10000;
      VertexFormat var10002 = class_290.field_1575;
      Intrinsics.checkNotNullExpressionValue(var10002, true.t<invokedynamic>(19253, 800029478991510039L ^ var2));
      ib var24 = new ib(var10002, true.y<invokedynamic>(5193, 7263889161711909991L ^ var2), false, 4, var7, (DefaultConstructorMarker)null);
      qv var25 = new qv(var18, (short)var20, var24, gk.E.e(var12, z8.I.O(), var4.h(var16)));
      var1.method_22903();
      class_243 var26 = var4.y(var14);
      class_4184 var34 = s8.H((short)var9, (short)var10, var11).method_1561().field_4686;
      Intrinsics.checkNotNull(var34);
      class_243 var35 = var34.method_71156();
      Intrinsics.checkNotNullExpressionValue(var35, true.t<invokedynamic>(3700, 9207443165343612765L ^ var2));
      class_243 var27 = var35;
      double var28 = var26.field_1352 - var27.method_10216();
      double var30 = var26.field_1351 - var27.method_10214();
      double var32 = var26.field_1350 - var27.method_10215();
      var1.method_46416((float)var28, (float)var30, (float)var32);
      var1.method_22905(var4.H().field_53453, var4.H().field_53453, var4.H().field_53453);
      lw.l.f(var4.H(), var1, var4.H().field_53446, var5);
      var1.method_22905(-1.0F, -1.0F, 1.0F);
      var1.method_22905(0.9375F, 0.9375F, 0.9375F);
      var1.method_46416(0.0F, -1.501F, 0.0F);
      var4.i().method_62110(var4.H());
      var4.i().method_62100(var1, (class_4588)var25, true.y<invokedynamic>(6156, 8007386175389036585L ^ var2), 0, z8.I.O().getRGB());
      ib.j(var24, v2.S.U(), (class_276)null, var21, (GpuBufferSlice)null, (new class_4587()).method_23760().method_23761(), (Matrix3x2f)null, MapsKt.mapOf(TuplesKt.to(true.t<invokedynamic>(21031, 6751606853459026704L ^ var2), var23)), true.y<invokedynamic>(32716, 1809115068731103201L ^ var2), (Object)null);
      var1.method_22909();
   }

   private static final boolean O(sy var0) {
      long var1 = c ^ 55288444499657L;
      long var10001 = var1 ^ 83533405327127L;
      int var3 = (int)((var1 ^ 83533405327127L) >>> 32);
      int var4 = (int)(var10001 << 32 >>> 32);
      long var5 = var1 ^ 43314482534057L;
      long var7 = var1 ^ 12511886249924L;
      return var0.W(T.T(var7), T.u(var3, var4), var5);
   }

   private static final boolean t(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = c ^ 64915765113322L;
      long var22 = var20 ^ 32295060666069L;
      long var24 = var20 ^ 71635238370888L;
      long var26 = var20 ^ 8887819976672L;
      long var28 = var20 ^ 121102171227140L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[24];
      int var16 = 0;
      String var15 = "&9hÆ[k\u0004\u001e¨\u008c\u0088Ý\u009fS?\u008dÅ&>[(8bÁ:¿t^\u0082!¦ÐpÌõÅõÕ°Û||è ÐÅo¤\u0010\r+9`åu%í\u0089¯È*åµüË\u0018ÆÛÊ¥izÎ¦fju_\u0087P\u0084un¨úËôiÍ}8'8\u000fj1A>0\u0003¾nQle,BC}<\u0095ò*ºM.\u0014#~eW×R\u0011\u009d\u00ad:PÀé\u0098þ\u0000¡9):â\u0082/\u0000\u008b\u0082)\u0005S\u0010\u0018ó\u0017e(\u009e\u0012\u008c\u0096`g tÿ'8/KS}Ü(Ìbó gK\rÄ¬G-÷s\u0081½3ûCð5i\u009d\u0099\u0095S>\u0010\b\u009e}\u0000\u001bCË\u0017µ\u0010\u0005\u008c\"\u001c\u0085\u0007#dí~\u0081Hm\u009a\u0090S\u0010§J¿\u0088c}\u001a\u0093ª3WD«\u00829o\u0010Th\u0097©\u0013ï\u0084Ân\u009eÝ×¿®=æĀ\u0018wß3«¯¤n_Ly \u0081\u0006ö8\u009cÐ½Ã/Vk·¬#\u0082\u001f×Ë\u001a¤ ö\u0001ß¾K\u001b\u0092âAy,\u0083è@²9 µ\u0084\u0092A\u000e\u0002_e\u001d\u0087\u008awÓ«\u0099\u008bÆá÷($JÚ#ûx·\u0084bLj4\fî\u0016=Ó\u0007ÒT¨£oz\u009f\u0018\u0091È\u009fb?\u009c¡cÿ6\u009eAeó´Á²ø6#ö}\u009dz\u0096'B£½ee ;\u00875Öm4Ä\u0006í4eË-.»rIøÆHêæÕL\u0092\u0091\u0097]\u0084Ââ\u0012\u0016è\u0097º\u0091×\u00872!_Ñ®\u0013\u009fë¼dÓgQT¾\u0094nJ\u0002Í=£Þ3\u0099DÝÏÀ\u000b=d\u001foú°±QYñê`Êú\u009d·\u0006\u009al¡%\u009f^\u0012\u0088\u008c\u009eà\u008b\u0007\u009a\u0099ÜÖ9Ô\u0081\u008dVG\u001a\u0097Ö\u0097±ôå!ÍF'\u0093\u0089ØD\u0097\u0085\u001aè(\u0084mÞ]9\u0086\u000fãäKcjUß\u009c!*,ã¥üIÐÓ³\u0091\u0001Ñ\u000f\u0097<ØÔ©ï¼Þe¹z \u0096¦EÝÎ\u0018*púQ;7\u001cçW)Àh~±T\u0012ÓrX;\u0082ñô#Ý\u008e\u0010Oû´\u0097ïÿ^?\u0081µå\u0084\u0014\u001aÝm\u0010.\f\u008aóÖ\u0018úRã\n\n)F\u0093ýx\u0018H\u008dbÚE_d¶Å%S\u008003\b^ÏKöØZ6ë\u0090 \u0004ä3xuÿIQ1Y]\u001c\u001dJO\n¯o\rPÈ8Ã¡\u0090õ\rÓd#t \u0018\u0015\"ù\u0091\u009ez±\u008f\u0000$¹õÀ°êP%\\òÇMlý\u008a0á51©\u000fñ\u00805\u001fEÅ¶¾\u00adMf\u0087öÿP\u0093«\u001cÊ\u0005\u0092pàú\u0085m&Kib\u0084¸¬á¬é\u0096§Ûã\u008c4©  ck>Ý:|=\nÖ¦ÏyÜ[S\n·¼Ô¸\u001b\u0089û³\u0011øÈ`¸Oïê²\u008d|Àu(²Pé\u0098Ï\u0099>ÃéÙM\u000b2 \u008ep¤\u0096ü\u008b*¬¥Ó\u000b\u0010\u000fW¹³\u0006\u0005Uã{O\u0088Z\u0080\u008fy¤Ó½ÎWz®ÂÑbTËIj\u009c\u0085¹M3ã\u0001¿¦\u0090wÏ\u0006\u009aï\t\u009a»\u0013õDÔÏÃÂ7\u008c\u0019PÊÛ1¨ÐþF\u008d´\u0004ôJ\n¿p-\u000e\u0007Oê\u001fç®êÏÑüê²\u0084y\u0005Gn×4¹\u0010%\t®\u0091#ÜÞûW)\u0098^ý2\u0092\u0001 \b<\nð¦ \f#\u0092\u0086ë\u0098\u0084¿Í$çÈ}\u0099\u0080æ~ú\"\u0085\u0004U\u009a\u0007\u0098\u0014\u0018#!uG\u009a\r2.Îâ\u008aY@÷f;NJE(\u0081jHL";
      int var17 = "&9hÆ[k\u0004\u001e¨\u008c\u0088Ý\u009fS?\u008dÅ&>[(8bÁ:¿t^\u0082!¦ÐpÌõÅõÕ°Û||è ÐÅo¤\u0010\r+9`åu%í\u0089¯È*åµüË\u0018ÆÛÊ¥izÎ¦fju_\u0087P\u0084un¨úËôiÍ}8'8\u000fj1A>0\u0003¾nQle,BC}<\u0095ò*ºM.\u0014#~eW×R\u0011\u009d\u00ad:PÀé\u0098þ\u0000¡9):â\u0082/\u0000\u008b\u0082)\u0005S\u0010\u0018ó\u0017e(\u009e\u0012\u008c\u0096`g tÿ'8/KS}Ü(Ìbó gK\rÄ¬G-÷s\u0081½3ûCð5i\u009d\u0099\u0095S>\u0010\b\u009e}\u0000\u001bCË\u0017µ\u0010\u0005\u008c\"\u001c\u0085\u0007#dí~\u0081Hm\u009a\u0090S\u0010§J¿\u0088c}\u001a\u0093ª3WD«\u00829o\u0010Th\u0097©\u0013ï\u0084Ân\u009eÝ×¿®=æĀ\u0018wß3«¯¤n_Ly \u0081\u0006ö8\u009cÐ½Ã/Vk·¬#\u0082\u001f×Ë\u001a¤ ö\u0001ß¾K\u001b\u0092âAy,\u0083è@²9 µ\u0084\u0092A\u000e\u0002_e\u001d\u0087\u008awÓ«\u0099\u008bÆá÷($JÚ#ûx·\u0084bLj4\fî\u0016=Ó\u0007ÒT¨£oz\u009f\u0018\u0091È\u009fb?\u009c¡cÿ6\u009eAeó´Á²ø6#ö}\u009dz\u0096'B£½ee ;\u00875Öm4Ä\u0006í4eË-.»rIøÆHêæÕL\u0092\u0091\u0097]\u0084Ââ\u0012\u0016è\u0097º\u0091×\u00872!_Ñ®\u0013\u009fë¼dÓgQT¾\u0094nJ\u0002Í=£Þ3\u0099DÝÏÀ\u000b=d\u001foú°±QYñê`Êú\u009d·\u0006\u009al¡%\u009f^\u0012\u0088\u008c\u009eà\u008b\u0007\u009a\u0099ÜÖ9Ô\u0081\u008dVG\u001a\u0097Ö\u0097±ôå!ÍF'\u0093\u0089ØD\u0097\u0085\u001aè(\u0084mÞ]9\u0086\u000fãäKcjUß\u009c!*,ã¥üIÐÓ³\u0091\u0001Ñ\u000f\u0097<ØÔ©ï¼Þe¹z \u0096¦EÝÎ\u0018*púQ;7\u001cçW)Àh~±T\u0012ÓrX;\u0082ñô#Ý\u008e\u0010Oû´\u0097ïÿ^?\u0081µå\u0084\u0014\u001aÝm\u0010.\f\u008aóÖ\u0018úRã\n\n)F\u0093ýx\u0018H\u008dbÚE_d¶Å%S\u008003\b^ÏKöØZ6ë\u0090 \u0004ä3xuÿIQ1Y]\u001c\u001dJO\n¯o\rPÈ8Ã¡\u0090õ\rÓd#t \u0018\u0015\"ù\u0091\u009ez±\u008f\u0000$¹õÀ°êP%\\òÇMlý\u008a0á51©\u000fñ\u00805\u001fEÅ¶¾\u00adMf\u0087öÿP\u0093«\u001cÊ\u0005\u0092pàú\u0085m&Kib\u0084¸¬á¬é\u0096§Ûã\u008c4©  ck>Ý:|=\nÖ¦ÏyÜ[S\n·¼Ô¸\u001b\u0089û³\u0011øÈ`¸Oïê²\u008d|Àu(²Pé\u0098Ï\u0099>ÃéÙM\u000b2 \u008ep¤\u0096ü\u008b*¬¥Ó\u000b\u0010\u000fW¹³\u0006\u0005Uã{O\u0088Z\u0080\u008fy¤Ó½ÎWz®ÂÑbTËIj\u009c\u0085¹M3ã\u0001¿¦\u0090wÏ\u0006\u009aï\t\u009a»\u0013õDÔÏÃÂ7\u008c\u0019PÊÛ1¨ÐþF\u008d´\u0004ôJ\n¿p-\u000e\u0007Oê\u001fç®êÏÑüê²\u0084y\u0005Gn×4¹\u0010%\t®\u0091#ÜÞûW)\u0098^ý2\u0092\u0001 \b<\nð¦ \f#\u0092\u0086ë\u0098\u0084¿Í$çÈ}\u0099\u0080æ~ú\"\u0085\u0004U\u009a\u0007\u0098\u0014\u0018#!uG\u009a\r2.Îâ\u008aY@÷f;NJE(\u0081jHL".length();
      char var14 = '0';
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
                  d = var18;
                  e = new String[24];
                  m = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[14];
                  int var3 = 0;
                  String var4 = "ÓÚ\u0007B\u009fû&u\u0099Î\u0090\u0094\u00195£â®\u001d?\u008b\u000fH÷ÈÐZ4P@\u0019å9{y8âp§\u009b¿eOI \u0087³îÁ&û\u00982\u0012 \u0085\r·ál*qÜZ.Å?¿#Eÿ\u0089ë£ýà\u0012\u0003Íßf\u008f RÊ`\u0092\u0011wMÿ\u008fË\f-w\u0003";
                  int var5 = "ÓÚ\u0007B\u009fû&u\u0099Î\u0090\u0094\u00195£â®\u001d?\u008b\u000fH÷ÈÐZ4P@\u0019å9{y8âp§\u009b¿eOI \u0087³îÁ&û\u00982\u0012 \u0085\r·ál*qÜZ.Å?¿#Eÿ\u0089ë£ýà\u0012\u0003Íßf\u008f RÊ`\u0092\u0011wMÿ\u008fË\f-w\u0003".length();
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
                              g = var6;
                              l = new Integer[14];
                              KProperty[] var30 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l0.class, true.t<invokedynamic>(22183, 65394487841515893L ^ var20), true.t<invokedynamic>(21101, 720993412780780989L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l0.class, true.t<invokedynamic>(7663, 8296094571173782074L ^ var20), true.t<invokedynamic>(585, 2128268678605061518L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l0.class, true.t<invokedynamic>(15022, 199183911490028910L ^ var20), true.t<invokedynamic>(26418, 211578719933782262L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l0.class, true.t<invokedynamic>(12872, 1547531664083357078L ^ var20), true.t<invokedynamic>(31767, 2878253916029764554L ^ var20), 0)))};
                              i = var30;
                              T = new l0(var24);
                              b = qi.M((il)T, true.t<invokedynamic>(21352, 4095205928948329651L ^ var20), (Enum)b9.DEFAULT, (pj)null, (Function0)null, true.y<invokedynamic>(15228, 9160024039420009890L ^ var20), (Object)null, var26);
                              n = qi.o((il)T, true.t<invokedynamic>(16209, 4217102018964783245L ^ var20), true.y<invokedynamic>(15500, 1432019836460440153L ^ var20), new IntRange(0, true.y<invokedynamic>(4293, 9070185259881117207L ^ var20)), var22, (pj)null, (Function0)null, true.y<invokedynamic>(4009, 561571202244061552L ^ var20), (Object)null);
                              K = qi.g((il)T, true.t<invokedynamic>(28536, 8704565071419953324L ^ var20), 0.1F, RangesKt.rangeTo(-1.0F, 1.0F), (pj)null, (Function0)null, true.y<invokedynamic>(11207, 4898216983462743324L ^ var20), var28, (Object)null);
                              k = qi.g((il)T, true.t<invokedynamic>(23812, 3915519478470337217L ^ var20), 5.0F, RangesKt.rangeTo(1.0F, 20.0F), (pj)null, (Function0)null, true.y<invokedynamic>(11207, 4898216983462743324L ^ var20), var28, (Object)null);
                              y = new CopyOnWriteArrayList();
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u009e{ñ\f\u0098Î\u009dÙöZ¯Ã÷,\u0090±";
                           var5 = "\u009e{ñ\f\u0098Î\u009dÙöZ¯Ã÷,\u0090±".length();
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

               var15 = "V\\\u0018×Êx£º¥\u009b\u009a\u0001øQöIRÌ'¥}u#\u009f¶Gõ\u0017_$\u0006Õ\u0018Ïµ:\u008f\f_YÚ\r\u0015X\u0096\u008b9 ø}ïr8,ê¨÷";
               var17 = "V\\\u0018×Êx£º¥\u009b\u009a\u0001øQöIRÌ'¥}u#\u009f¶Gõ\u0017_$\u0006Õ\u0018Ïµ:\u008f\f_YÚ\r\u0015X\u0096\u008b9 ø}ïr8,ê¨÷".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26464;
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
            throw new RuntimeException("su/catlean/l0", var10);
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
         throw new RuntimeException("su/catlean/l0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32364;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/l0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
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
         throw new RuntimeException("su/catlean/l0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
