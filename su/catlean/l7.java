package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
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
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.gofra.Flow;

public final class l7 extends k9 {
   @NotNull
   public static final l7 C;
   static final KProperty[] y;
   @NotNull
   private static final zo S;
   @NotNull
   private static final zv v;
   @NotNull
   private static final z0 f;
   @NotNull
   private static final zo O;
   @NotNull
   private static final zv R;
   @NotNull
   private static final class_2960 k;
   @Nullable
   private static class_243 u;
   @Nullable
   private static class_243 c;
   @NotNull
   private static final List W;
   private static final long b = j0.a(-7399269438432897607L, 1528771481755868569L, MethodHandles.lookup().lookupClass()).a(215118079668659L);
   private static final String[] d;
   private static final String[] e;
   private static final Map g;
   private static final long[] i;
   private static final Integer[] l;
   private static final Map m;

   private l7(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 55726524563796L;
      super(var3, true.n<invokedynamic>(9067, 8313594119903139477L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean t(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 10268866598082L;
      int var6 = (int)((var4 ^ 10268866598082L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)S.k((short)var6, this, y[0], (short)var7, var8);
   }

   private final Color i(long var1, short var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 72899721536777L;
      int var6 = (int)((var4 ^ 72899721536777L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Color)v.k((short)var6, this, y[1], (short)var7, var8);
   }

   private final int P(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 101231569900753L;
      int var3 = (int)((var1 ^ 101231569900753L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)f.k((short)var3, this, y[2], (short)var4, var5)).intValue();
   }

   private final boolean I(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 76671862933279L;
      int var3 = (int)((var1 ^ 76671862933279L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)O.k((short)var3, this, y[3], (short)var4, var5);
   }

   private final Color e(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 44100983945897L;
      int var3 = (int)((var1 ^ 44100983945897L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)R.k((short)var3, this, y[4], (short)var4, var5);
   }

   @Flow
   private final void Z(Render2DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final void p(int a, byte a, @NotNull class_4587 matrices, float x, float y, float size, @NotNull Color color, int a) {
      long var9 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var8 << 40 >>> 40) ^ b;
      long var11 = var9 ^ 76735812753251L;
      Intrinsics.checkNotNullParameter(var3, true.n<invokedynamic>(8877, 328380510608707645L ^ var9));
      Intrinsics.checkNotNullParameter(var7, true.n<invokedynamic>(24291, 8595667553639640167L ^ var9));
      Matrix4f var10000 = var3.method_23760().method_23761();
      Intrinsics.checkNotNullExpressionValue(var10000, true.n<invokedynamic>(20609, 6597029342526579229L ^ var9));
      Matrix4f var14 = var10000;
      -7193914943817693181L.A<invokedynamic>(-7193914943817693181L, var9);
      gk.E.S(var14, _h.o(), var4, var5, var6, var6, var7, var7, var11, var7, var7, true, q7.HALO.Z(), q7.HALO.q(), q7.HALO.n(), q7.HALO.k());

      try {
         if (-7162212295885219344L.A<invokedynamic>(-7162212295885219344L, var9) == null) {
            (new k9[2]).A<invokedynamic>(new k9[2], -7151890319257950333L, var9);
         }

      } catch (NumberFormatException var15) {
         throw var15.A<invokedynamic>(var15, -7167928086898439347L, var9);
      }
   }

   public final void P(float threshold, float power, long a) {
      var3 ^= b;
      long var5 = var3 ^ 70310439649848L;
      long var7 = var3 ^ 21005847455427L;
      long var9 = var3 ^ 86733137030200L;
      long var11 = var3 ^ 4982195049019L;
      long var10001 = var3 ^ 32302016688875L;
      int var13 = (int)((var3 ^ 32302016688875L) >>> 48);
      int var14 = (int)(var10001 << 16 >>> 48);
      int var15 = (int)(var10001 << 32 >>> 32);
      long var16 = var3 ^ 32110447557259L;
      long var18 = var3 ^ 19439507761470L;
      var10001 = var3 ^ 51494135243622L;
      int var20 = (int)((var3 ^ 51494135243622L) >>> 32);
      int var21 = (int)(var10001 << 32 >>> 48);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var23 = var3 ^ 132823704043805L;
      long var25 = var3 ^ 110746934013984L;
      long var27 = var3 ^ 123827168243112L;
      long var29 = var3 ^ 120985215101593L;
      k9[] var10000 = -9127363214244424324L.A<invokedynamic>(-9127363214244424324L, var3);
      float var32 = s8.f(var5).method_6032() + s8.f(var5).method_6067();
      k9[] var31 = var10000;

      int var44;
      label72: {
         label71: {
            try {
               float var48;
               var44 = (var48 = var32 - var1) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
               if (var31 != null) {
                  break label72;
               }

               if (var44 <= 0) {
                  break label71;
               }
            } catch (NumberFormatException var43) {
               throw var43.A<invokedynamic>(var43, -9081116556339014094L, var3);
            }

            var44 = 0;
            break label72;
         }

         var44 = 1;
      }

      int var33 = var44;

      float var45;
      label62: {
         try {
            if (var33 != 0) {
               var45 = var32 / var1;
               break label62;
            }
         } catch (NumberFormatException var42) {
            throw var42.A<invokedynamic>(var42, -9081116556339014094L, var3);
         }

         var45 = 1.0F;
      }

      float var34 = Math.abs(var45 - 1.0F) * var2;

      label54: {
         float var46;
         label53: {
            label52: {
               try {
                  var45 = var32;
                  if (var3 <= 0L) {
                     break label54;
                  }

                  var46 = 4.0F;
                  if (var31 != null) {
                     break label53;
                  }

                  if (!(var32 <= 4.0F)) {
                     break label52;
                  }
               } catch (NumberFormatException var41) {
                  throw var41.A<invokedynamic>(var41, -9081116556339014094L, var3);
               }

               var34 += Math.abs(0.2F * (float)Math.sin((double)((float)Math.toRadians((double)s8.f(var5).field_6012 * 16.0D + (double)gk.E.h(var27)))));
            }

            var45 = var34;
            var46 = 0.0F;
         }

         var45 = RangesKt.coerceIn(var45, var46, 1.0F);
      }

      var34 = var45;
      Color var35 = new Color((int)((1.0F - gk.E.H(this.e(var9), var25)) * var34 * (float)true.b<invokedynamic>(21731, 3319619818406959034L ^ var3)), (int)((1.0F - gk.E.L(var29, this.e(var9))) * var34 * (float)true.b<invokedynamic>(31228, 4143990826332715681L ^ var3)), (int)((1.0F - gk.E.M(var16, this.e(var9))) * var34 * (float)true.b<invokedynamic>(31228, 4143990826332715681L ^ var3)), true.b<invokedynamic>(31228, 4143990826332715681L ^ var3));
      float var36 = (float)s8.H((short)var13, (short)var14, var15).method_22683().method_4486();
      float var37 = (float)s8.H((short)var13, (short)var14, var15).method_22683().method_4502();
      GpuTextureView var47 = s8.H((short)var13, (short)var14, var15).method_1531().method_4619(k).method_71659();
      Intrinsics.checkNotNullExpressionValue(var47, true.n<invokedynamic>(19062, 3729145538704614807L ^ var3));
      GpuTextureView var38 = var47;
      VertexFormat var10002 = class_290.field_1575;
      Intrinsics.checkNotNullExpressionValue(var10002, true.n<invokedynamic>(368, 5311605361562644100L ^ var3));
      ib var39 = new ib(var10002, 0, false, true.b<invokedynamic>(12556, 843787555756847699L ^ var3), var11, (DefaultConstructorMarker)null);

      try {
         ib.P(var39, 0.0F, var37, 0.0F, var18, 4, (Object)null).k(var20, 0.0F, 1.0F, (short)var21, (char)var22).N(var35, var7);
         ib.P(var39, var36, var37, 0.0F, var18, 4, (Object)null).k(var20, 1.0F, 1.0F, (short)var21, (char)var22).N(var35, var7);
         ib.P(var39, var36, 0.0F, 0.0F, var18, 4, (Object)null).k(var20, 1.0F, 0.0F, (short)var21, (char)var22).N(var35, var7);
         ib.P(var39, 0.0F, 0.0F, 0.0F, var18, 4, (Object)null).k(var20, 0.0F, 0.0F, (short)var21, (char)var22).N(var35, var7);
         ib.j(var39, v2.S.v(), (class_276)null, var23, (GpuBufferSlice)null, (Matrix4f)null, (Matrix3x2f)null, MapsKt.mapOf(TuplesKt.to(true.n<invokedynamic>(29921, 1578417947335105284L ^ var3), var38)), true.b<invokedynamic>(14295, 8611082125898265740L ^ var3), (Object)null);
         if (var3 >= 0L && var31 != null) {
            (new int[1]).A<invokedynamic>(new int[1], -9142653208032296283L, var3);
         }

      } catch (NumberFormatException var40) {
         throw var40.A<invokedynamic>(var40, -9081116556339014094L, var3);
      }
   }

   @Flow
   private final void K(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean C() {
      long var0 = b ^ 13982592751883L;
      long var10001 = var0 ^ 60547603824404L;
      int var2 = (int)((var0 ^ 60547603824404L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 48);
      int var4 = (int)(var10001 << 32 >>> 32);
      return C.t((char)var2, (short)var3, var4);
   }

   private static final boolean w() {
      long var0 = b ^ 39460227253635L;
      long var10001 = var0 ^ 26685869630364L;
      int var2 = (int)((var0 ^ 26685869630364L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 48);
      int var4 = (int)(var10001 << 32 >>> 32);
      return C.t((char)var2, (short)var3, var4);
   }

   private static final boolean M() {
      long var0 = b ^ 34301905404524L;
      long var2 = var0 ^ 114869620864942L;
      return C.I(var2);
   }

   private static final boolean z(uc var0) {
      long var1 = b ^ 113545980423686L;
      Intrinsics.checkNotNullParameter(var0, true.n<invokedynamic>(24969, 903913641469445157L ^ var1));
      return var0.H().X();
   }

   private static final boolean J(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = b ^ 41603925227185L;
      long var22 = var20 ^ 96114478267561L;
      long var24 = var20 ^ 123224765903471L;
      long var26 = var20 ^ 72189081791641L;
      long var28 = var20 ^ 77377348685645L;
      g = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[27];
      int var16 = 0;
      String var15 = "Üh\u0087T\\eHaæhÉý\u0015ø,ä\u0089JR\u000bº+\u001c ÀäÔz~à\u0099ä\u0004\u000e\u000b÷rî,Å\u0010\u0006ñç\u008fd&\u0098¹\u00035&,\u0015Ëù[\u0018\u0002k¨Ò\u000eÔ\u0099É¶\u0089ÒJ\u0016O²\u001d9úË\u0080\u000f\u001ePa \u0083Xn\rªúÓe#ÈH\u008aÓýåm\u00002\u000fà\u0082ÍB§\u0004mç<\u0003º+\u009e\u0018²F¶\u0095Èé\u0094\u008b'AI\u009c2\u0095ì\u0016\u0011Sï/õeS_ ×\u000bÒe]Üè\u009fì\u008aöØ½Úpä\u009f\u0006\b\u0017S\u001aº)F:ûl@êÅ\t\u0018]?\u0080ëùºQÑ\u0015w\u0000Îsþ-*´\u0003×é\f\u009e\u00129\u0010Ô\u0004èã\u0086n1\u0017Ýn¸Cz\u0012ÜÎ\u0010\u0083Õ±\u001a\u008fôÁ6\u0095\u0000ä\u0019\u001dîqÁ8¬î\u0018\u009dg\u0019ýÚ{¥Û!8Ø\n\u0093¹êã\u0017I]\u009c(\u0007\u0088;ZCñðQ\n\u0003µd\u0096õÙ[7P'4\u0000\u007fI,IrÒX4\u0006°5 ¨ß\u0095\u0094)ñÝ\u0088zÑK 7ßËÐpçèCÔîÚ%\u0007OLá\u0084LJ\u007f\u0010Hÿ¦\u008e\u0082\u0018yØÈ\u0086J+Òö\u0016\u001f ×\u009d+\u0017µ\u008f^ÛË-ûªôÐÖ8h÷\u009aç|\u0094\u000e\u0006v\u0006\u0010¶\u0087O\bç8 Åú`\u0004\u001d\u000fc:´{*ÍS.\u0099þ½\u000e»\u001aÔ-ß\nÜ0¸\f×#xáI\u0018w è\u0005·1`\u008dkâY\u007fW¯-·#oO£\u009e\u0018¦èü¼Â\u008fÏ\u000e\u001dD\u008d\u008e9þWP\u0010±%\u0097$ò-\u0010\u0018Ç\u0094áÄ¤0O\u000föÜfBW¿Ã\u007fù\u0080Q²û\u008eÔâ@g§Á\u0092Òë¬OÆx4J\u001b\u008c\u008bCªâ`jØüFjï\u0015l¾\u008a\u0086(³OMaï!½kÂrE\u0016D±,\u0083)\r\u001b\u0014e;\u0003#P\u0089\u00830\u0012\u008f\u000f\u009e1 ¹¦\\09k\u0090ìcÔó\u001b\f/iwS%)bôt\u001fú\u0090¢\u00802\u0089/¶Ä8Âµ\u0016\u0003ÝoHfÊD{/\u0015 ¬\u0002\u009a½°ýP\tm\u0011ºö\u0080\u000ew\u009efÙs¥Å\u0082\u0099$Aó\u0082-\u0091:UÎ©]\u0083i\u00adúì\u00adøz\u0010îi\u0011\bô1li\u008a\u00002\u0095ØÜçt\u0010±¤\u00ad08\u0099-\u009ec7Yùj\u0001Wc(ûê-LqÿvI\u0007øåË*&çY·\u0091\u009fêÿS\u0019@÷»_T\u008céEw>\u000frÕ§s]\r\u0018`\u0004\u0098\u0091Z!\t\u0081L|¢>F\u0019\u0003Æ\u009cé`îsðô:\u0018-£îÁÐ]\u0091ÅÏÁ\u0090©ü\u001cL8Oã5\u0091§èôy\u0010¤\u0088é\u0080ëê¬R0Sb\u0085P¦Ó\u0014";
      int var17 = "Üh\u0087T\\eHaæhÉý\u0015ø,ä\u0089JR\u000bº+\u001c ÀäÔz~à\u0099ä\u0004\u000e\u000b÷rî,Å\u0010\u0006ñç\u008fd&\u0098¹\u00035&,\u0015Ëù[\u0018\u0002k¨Ò\u000eÔ\u0099É¶\u0089ÒJ\u0016O²\u001d9úË\u0080\u000f\u001ePa \u0083Xn\rªúÓe#ÈH\u008aÓýåm\u00002\u000fà\u0082ÍB§\u0004mç<\u0003º+\u009e\u0018²F¶\u0095Èé\u0094\u008b'AI\u009c2\u0095ì\u0016\u0011Sï/õeS_ ×\u000bÒe]Üè\u009fì\u008aöØ½Úpä\u009f\u0006\b\u0017S\u001aº)F:ûl@êÅ\t\u0018]?\u0080ëùºQÑ\u0015w\u0000Îsþ-*´\u0003×é\f\u009e\u00129\u0010Ô\u0004èã\u0086n1\u0017Ýn¸Cz\u0012ÜÎ\u0010\u0083Õ±\u001a\u008fôÁ6\u0095\u0000ä\u0019\u001dîqÁ8¬î\u0018\u009dg\u0019ýÚ{¥Û!8Ø\n\u0093¹êã\u0017I]\u009c(\u0007\u0088;ZCñðQ\n\u0003µd\u0096õÙ[7P'4\u0000\u007fI,IrÒX4\u0006°5 ¨ß\u0095\u0094)ñÝ\u0088zÑK 7ßËÐpçèCÔîÚ%\u0007OLá\u0084LJ\u007f\u0010Hÿ¦\u008e\u0082\u0018yØÈ\u0086J+Òö\u0016\u001f ×\u009d+\u0017µ\u008f^ÛË-ûªôÐÖ8h÷\u009aç|\u0094\u000e\u0006v\u0006\u0010¶\u0087O\bç8 Åú`\u0004\u001d\u000fc:´{*ÍS.\u0099þ½\u000e»\u001aÔ-ß\nÜ0¸\f×#xáI\u0018w è\u0005·1`\u008dkâY\u007fW¯-·#oO£\u009e\u0018¦èü¼Â\u008fÏ\u000e\u001dD\u008d\u008e9þWP\u0010±%\u0097$ò-\u0010\u0018Ç\u0094áÄ¤0O\u000föÜfBW¿Ã\u007fù\u0080Q²û\u008eÔâ@g§Á\u0092Òë¬OÆx4J\u001b\u008c\u008bCªâ`jØüFjï\u0015l¾\u008a\u0086(³OMaï!½kÂrE\u0016D±,\u0083)\r\u001b\u0014e;\u0003#P\u0089\u00830\u0012\u008f\u000f\u009e1 ¹¦\\09k\u0090ìcÔó\u001b\f/iwS%)bôt\u001fú\u0090¢\u00802\u0089/¶Ä8Âµ\u0016\u0003ÝoHfÊD{/\u0015 ¬\u0002\u009a½°ýP\tm\u0011ºö\u0080\u000ew\u009efÙs¥Å\u0082\u0099$Aó\u0082-\u0091:UÎ©]\u0083i\u00adúì\u00adøz\u0010îi\u0011\bô1li\u008a\u00002\u0095ØÜçt\u0010±¤\u00ad08\u0099-\u009ec7Yùj\u0001Wc(ûê-LqÿvI\u0007øåË*&çY·\u0091\u009fêÿS\u0019@÷»_T\u008céEw>\u000frÕ§s]\r\u0018`\u0004\u0098\u0091Z!\t\u0081L|¢>F\u0019\u0003Æ\u009cé`îsðô:\u0018-£îÁÐ]\u0091ÅÏÁ\u0090©ü\u001cL8Oã5\u0091§èôy\u0010¤\u0088é\u0080ëê¬R0Sb\u0085P¦Ó\u0014".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var31 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var39 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var39;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[27];
                  m = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[10];
                  int var3 = 0;
                  String var4 = "Ê\u001f¡Ã)Ä®\u008ebÑWÂ<9Cþ\u0083>²£v2$\u0016n\u008bÛ¿¡ðG¡,Yt\u0000ê>Ë§\u0018\u000bðÖ&3Ba½ñÚ³áÿÆ)±ÛÇÏ-×¨\u009c";
                  int var5 = "Ê\u001f¡Ã)Ä®\u008ebÑWÂ<9Cþ\u0083>²£v2$\u0016n\u008bÛ¿¡ðG¡,Yt\u0000ê>Ë§\u0018\u000bðÖ&3Ba½ñÚ³áÿÆ)±ÛÇÏ-×¨\u009c".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var36 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                     long[] var34 = var6;
                     var36 = var3++;
                     long var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var8 = var41;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var42) {
                        case 0:
                           var34[var36] = var44;
                           if (var2 >= var5) {
                              i = var6;
                              l = new Integer[10];
                              KProperty[] var30 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l7.class, true.n<invokedynamic>(20478, 7831055362865083114L ^ var20), true.n<invokedynamic>(32559, 6502725130149888565L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l7.class, true.n<invokedynamic>(30080, 1753888317314500755L ^ var20), true.n<invokedynamic>(17073, 951935342941880253L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l7.class, true.n<invokedynamic>(15181, 7486174317840483922L ^ var20), true.n<invokedynamic>(11242, 784097803443099375L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l7.class, true.n<invokedynamic>(29944, 7505048200227719664L ^ var20), true.n<invokedynamic>(14723, 4322747971295790217L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l7.class, true.n<invokedynamic>(24475, 5603445785524576909L ^ var20), true.n<invokedynamic>(21587, 1895542865166051677L ^ var20), 0)))};
                              y = var30;
                              C = new l7(var26);
                              S = qi.R((il)C, true.n<invokedynamic>(2813, 8684899643659909113L ^ var20), true, (pj)null, (Function0)null, true.b<invokedynamic>(17950, 2011746793210468283L ^ var20), var24, (Object)null);
                              il var35 = (il)C;
                              String var33 = 26940.n<invokedynamic>(26940, 372309131973301297L ^ var20);
                              Color var45 = Color.RED;
                              Intrinsics.checkNotNullExpressionValue(var45, true.n<invokedynamic>(25945, 2453157297051670596L ^ var20));
                              v = qi.F(var35, var33, var45, (pj)null, l7::C, 4, var28, (Object)null);
                              f = qi.o((il)C, true.n<invokedynamic>(31009, 6288742120948925482L ^ var20), true.b<invokedynamic>(31065, 7586360063592425720L ^ var20), new IntRange(true.b<invokedynamic>(26807, 2223929500704897310L ^ var20), true.b<invokedynamic>(19184, 3645272334527683415L ^ var20)), var22, (pj)null, l7::w, true.b<invokedynamic>(3950, 7350356876033302214L ^ var20), (Object)null);
                              O = qi.R((il)C, true.n<invokedynamic>(17765, 4117422448394942570L ^ var20), true, (pj)null, (Function0)null, true.b<invokedynamic>(19284, 6210160316300417783L ^ var20), var24, (Object)null);
                              var35 = (il)C;
                              var33 = 23428.n<invokedynamic>(23428, 5586823233366009492L ^ var20);
                              var45 = Color.RED;
                              Intrinsics.checkNotNullExpressionValue(var45, true.n<invokedynamic>(30345, 4594870514842110878L ^ var20));
                              R = qi.F(var35, var33, var45, (pj)null, l7::M, 4, var28, (Object)null);
                              class_2960 var38 = class_2960.method_60656(true.n<invokedynamic>(2595, 4370707118299772722L ^ var20));
                              Intrinsics.checkNotNullExpressionValue(var38, true.n<invokedynamic>(17266, 2073572341272559207L ^ var20));
                              k = var38;
                              W = (List)(new ArrayList());
                              return;
                           }
                           break;
                        default:
                           var34[var36] = var44;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "ÝÁ]¢\u0000jî©Ô\u0018ë\u0094±Õ\u008f\u0016";
                           var5 = "ÝÁ]¢\u0000jî©Ô\u0018ë\u0094±Õ\u008f\u0016".length();
                           var2 = 0;
                        }

                        var36 = var2;
                        var2 += 8;
                        var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                        var34 = var6;
                        var36 = var3++;
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

               var15 = " \u001cå\u0001EpLq¶GïÂÕ:ê³i\u009fÏ#ÓlégÃ\u0019¬¤'\u000b9\u000f\u0097&\f\u001e@´\u001b_\u0010õñ\u0083Åås·¯üd\u008a»GÙ=Ø";
               var17 = " \u001cå\u0001EpLq¶GïÂÕ:ê³i\u009fÏ#ÓlégÃ\u0019¬¤'\u000b9\u000f\u0097&\f\u001e@´\u001b_\u0010õñ\u0083Åås·¯üd\u008a»GÙ=Ø".length();
               var14 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28627;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/l7", var10);
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
         throw new RuntimeException("su/catlean/l7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 879;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
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
            throw new RuntimeException("su/catlean/l7", var14);
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
         throw new RuntimeException("su/catlean/l7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
