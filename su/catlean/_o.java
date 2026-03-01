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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class _o {
   @NotNull
   public static final _o w;
   @NotNull
   private static List j;
   @NotNull
   private static List B;
   @NotNull
   private static List p;
   @NotNull
   private static List y;
   @NotNull
   private static List l;
   @NotNull
   private static List G;
   @NotNull
   private static List N;
   @Nullable
   private static class_6364 J;
   @Nullable
   private static class_6364 m;
   private static boolean C;
   private static boolean d;
   private static final long a = j0.a(-6358606474712525254L, 8678260442136536097L, MethodHandles.lookup().lookupClass()).a(232914652916959L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   private _o() {
   }

   @NotNull
   public final List m() {
      return j;
   }

   public final void x(long a, @NotNull List <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.j<invokedynamic>(6167, 1160246453321141276L ^ var1));
      j = var3;
   }

   @NotNull
   public final List J() {
      return B;
   }

   public final void l(long a, @NotNull List <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.j<invokedynamic>(6167, 1160272008367870019L ^ var1));
      B = var3;
   }

   @NotNull
   public final List k() {
      return p;
   }

   public final void E(long a, @NotNull List <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.j<invokedynamic>(1043, 5567392945819217674L ^ var1));
      p = var3;
   }

   @NotNull
   public final List p() {
      return y;
   }

   public final void V(long a, @NotNull List <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.j<invokedynamic>(6167, 1160360360784220359L ^ var1));
      y = var3;
   }

   @NotNull
   public final List t() {
      return l;
   }

   public final void b(long a, @NotNull List <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.j<invokedynamic>(6167, 1160298597455682744L ^ var1));
      l = var3;
   }

   @NotNull
   public final List B() {
      return G;
   }

   public final void q(short a, char a, int a, @NotNull List <set-?>) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var4, true.j<invokedynamic>(6167, 1160346039212387316L ^ var5));
      G = var4;
   }

   @NotNull
   public final List M() {
      return N;
   }

   public final void N(long a, @NotNull List <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.j<invokedynamic>(6167, 1160249557050859195L ^ var1));
      N = var3;
   }

   @Flow(
      priority = -10
   )
   private final void B(Render3DEvent var1) {
      long var2 = a ^ 108866575174238L;
      long var4 = var2 ^ 37182604063133L;
      long var10001 = var2 ^ 67715366996148L;
      int var6 = (int)((var2 ^ 67715366996148L) >>> 48);
      long var7 = var10001 << 16 >>> 16;
      long var9 = var2 ^ 126965160124119L;
      var10001 = var2 ^ 45475339453928L;
      int var11 = (int)((var2 ^ 45475339453928L) >>> 48);
      int var12 = (int)(var10001 << 16 >>> 32);
      int var13 = (int)(var10001 << 48 >>> 48);
      long var14 = var2 ^ 72483064239478L;
      e9.A.g(var4, var1.getStack());
      this.f((short)var11, var1.getStack(), var12, var13);
      this.L(var1.getStack(), var9);
      this.W(var1.getStack(), var14);
      this.B(var1.getStack(), (short)var6, var7);
      j.clear();
      B.clear();
      p.clear();
      y.clear();
      l.clear();
      G.clear();
      N.clear();
   }

   private final void B(class_4587 param1, short param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   private final void f(short param1, class_4587 param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private final void W(class_4587 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private final void L(class_4587 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void e(Render2DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void A(long param1, ib param3, class_243 param4, class_243 param5, Color param6, Color param7, boolean param8) {
      // $FF: Couldn't be decompiled
   }

   static void n(_o var0, ib var1, class_243 var2, class_243 var3, Color var4, long var5, Color var7, boolean var8, int var9, Object var10) {
      var5 ^= a;
      long var11 = var5 ^ 105955648738780L;
      int[] var13 = 6724177023709368250L.A<invokedynamic>(6724177023709368250L, var5);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var9 & true.m<invokedynamic>(31327, 1610655777467475090L ^ var5);
               if (var13 != null) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NoWhenBranchMatchedException var15) {
               throw var15.A<invokedynamic>(var15, 6737662476286741320L, var5);
            }

            var7 = var4;
         }

         var10000 = var9 & true.m<invokedynamic>(28160, 2318618609331155148L ^ var5);
      }

      label28: {
         label27: {
            try {
               if (var13 != null) {
                  break label27;
               }

               if (var10000 == 0) {
                  break label28;
               }
            } catch (NoWhenBranchMatchedException var14) {
               throw var14.A<invokedynamic>(var14, 6737662476286741320L, var5);
            }

            var10000 = 0;
         }

         var8 = var10000;
      }

      var0.A(var11, var1, var2, var3, var4, var7, (boolean)var8);
   }

   private final void t(class_238 var1, ib var2, Color var3, Color var4, long var5) {
      var5 ^= a;
      long var7 = var5 ^ 32201662126955L;
      long var9 = var5 ^ 121981310727280L;
      long var10001 = var5 ^ 106149388509272L;
      int var11 = (int)((var5 ^ 106149388509272L) >>> 48);
      int var12 = (int)(var10001 << 16 >>> 48);
      int var13 = (int)(var10001 << 32 >>> 32);
      class_4184 var10000 = s8.H((short)var11, (short)var12, var13).method_1561().field_4686;
      Intrinsics.checkNotNull(var10000);
      class_243 var21 = var10000.method_71156();
      Intrinsics.checkNotNullExpressionValue(var21, true.j<invokedynamic>(28138, 1932096424882374860L ^ var5));
      class_243 var14 = var21;
      float var15 = (float)(var1.field_1323 - var14.method_10216());
      float var16 = (float)(var1.field_1322 - var14.method_10214());
      float var17 = (float)(var1.field_1321 - var14.method_10215());
      float var18 = (float)(var1.field_1320 - var14.method_10216());
      float var19 = (float)(var1.field_1325 - var14.method_10214());
      float var20 = (float)(var1.field_1324 - var14.method_10215());
      var2.s(var15, var7, var16, var17).N(var3, var9);
      var2.s(var15, var7, var16, var20).N(var3, var9);
      var2.s(var15, var7, var16, var20).N(var3, var9);
      var2.s(var18, var7, var16, var20).N(var3, var9);
      var2.s(var18, var7, var16, var20).N(var3, var9);
      var2.s(var18, var7, var16, var17).N(var3, var9);
      var2.s(var18, var7, var16, var17).N(var3, var9);
      var2.s(var15, var7, var16, var17).N(var3, var9);
      var2.s(var15, var7, var19, var17).N(var4, var9);
      var2.s(var15, var7, var19, var20).N(var4, var9);
      var2.s(var15, var7, var19, var20).N(var4, var9);
      var2.s(var18, var7, var19, var20).N(var4, var9);
      var2.s(var18, var7, var19, var20).N(var4, var9);
      var2.s(var18, var7, var19, var17).N(var4, var9);
      var2.s(var18, var7, var19, var17).N(var4, var9);
      var2.s(var15, var7, var19, var17).N(var4, var9);
      var2.s(var15, var7, var16, var17).N(var3, var9);
      var2.s(var15, var7, var19, var17).N(var4, var9);
      var2.s(var18, var7, var16, var17).N(var3, var9);
      var2.s(var18, var7, var19, var17).N(var4, var9);
      var2.s(var18, var7, var16, var20).N(var3, var9);
      var2.s(var18, var7, var19, var20).N(var4, var9);
      var2.s(var15, var7, var16, var20).N(var3, var9);
      var2.s(var15, var7, var19, var20).N(var4, var9);
   }

   private final void A(class_238 param1, ib param2, Color param3, class_2350 param4, long param5) {
      // $FF: Couldn't be decompiled
   }

   private final void y(class_238 param1, long param2, ib param4, Color param5, class_2350 param6) {
      // $FF: Couldn't be decompiled
   }

   public final void b(@NotNull ib polygon, @NotNull class_238 box, @NotNull Color c, long a, @NotNull Color c1) {
      var4 ^= a;
      long var7 = var4 ^ 126303499527129L;
      long var9 = var4 ^ 1538255293634L;
      long var10001 = var4 ^ 16613185198314L;
      int var11 = (int)((var4 ^ 16613185198314L) >>> 48);
      int var12 = (int)(var10001 << 16 >>> 48);
      int var13 = (int)(var10001 << 32 >>> 32);

      try {
         Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(694, 4380566129454227236L ^ var4));
         Intrinsics.checkNotNullParameter(var2, true.j<invokedynamic>(2875, 4615074069857212066L ^ var4));
         Intrinsics.checkNotNullParameter(var3, "c");
         Intrinsics.checkNotNullParameter(var6, true.j<invokedynamic>(24746, 7864103467080645949L ^ var4));
         if (!q1.A.p().method_23093(var2)) {
            return;
         }
      } catch (NoWhenBranchMatchedException var21) {
         throw var21.A<invokedynamic>(var21, -1466276246320087698L, var4);
      }

      class_4184 var10000 = s8.H((short)var11, (short)var12, var13).method_1561().field_4686;
      Intrinsics.checkNotNull(var10000);
      class_243 var22 = var10000.method_71156();
      Intrinsics.checkNotNullExpressionValue(var22, true.j<invokedynamic>(28138, 1932115574976049278L ^ var4));
      class_243 var14 = var22;
      float var15 = (float)(var2.field_1323 - var14.method_10216());
      float var16 = (float)(var2.field_1322 - var14.method_10214());
      float var17 = (float)(var2.field_1321 - var14.method_10215());
      float var18 = (float)(var2.field_1320 - var14.method_10216());
      float var19 = (float)(var2.field_1325 - var14.method_10214());
      float var20 = (float)(var2.field_1324 - var14.method_10215());
      var1.s(var15, var7, var16, var17).N(var3, var9);
      var1.s(var15, var7, var19, var17).N(var6, var9);
      var1.s(var18, var7, var19, var17).N(var6, var9);
      var1.s(var18, var7, var16, var17).N(var3, var9);
      var1.s(var18, var7, var16, var17).N(var3, var9);
      var1.s(var18, var7, var19, var17).N(var6, var9);
      var1.s(var18, var7, var19, var20).N(var6, var9);
      var1.s(var18, var7, var16, var20).N(var3, var9);
      var1.s(var15, var7, var16, var20).N(var3, var9);
      var1.s(var18, var7, var16, var20).N(var3, var9);
      var1.s(var18, var7, var19, var20).N(var6, var9);
      var1.s(var15, var7, var19, var20).N(var6, var9);
      var1.s(var15, var7, var16, var17).N(var3, var9);
      var1.s(var15, var7, var16, var20).N(var3, var9);
      var1.s(var15, var7, var19, var20).N(var6, var9);
      var1.s(var15, var7, var19, var17).N(var6, var9);
      var1.s(var15, var7, var19, var17).N(var6, var9);
      var1.s(var15, var7, var19, var20).N(var6, var9);
      var1.s(var18, var7, var19, var20).N(var6, var9);
      var1.s(var18, var7, var19, var17).N(var6, var9);
      var1.s(var15, var7, var16, var17).N(var3, var9);
      var1.s(var15, var7, var16, var20).N(var3, var9);
      var1.s(var18, var7, var16, var20).N(var3, var9);
      var1.s(var18, var7, var16, var17).N(var3, var9);
   }

   private final void v(char param1, int param2, char param3) {
      // $FF: Couldn't be decompiled
   }

   private final void F(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 90500724571411L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[13];
      int var18 = 0;
      String var17 = "\u009a P¯\u0099]ëlÙd\u0094ÕwÙ_\u001eòvgàzZÄ\tãÙÒ¤A\u0003\u0006I\u0018+îÐ\u0088À\u0006Á \u0084åS\u00ad¡¶³køµ-õË@+÷0ø\u007f\u000b¥è¿8ÒÅ§¼\u0003qÇ\u0011Ö\u0086y\u0086~s\u0091>ñÿ|\u0096¿\u0005Aª¹`\u0017£w\u0011k\u0091\u001fÊ\u001d~\u008c\u0091\u00951\u0096 ÕCO\u0004\u0080úíxÚ0¹ÙxdÑ\u0084ähF\\Ã±ÜE×Y^ÇJþÊ\u001f\u0018(»ÄøS^%\u007fðG»&\u001f\u0007ú\u009b-Lt¬^Â\u0084k0ün\u009d\u000b\u0089Dzo»þó\u009d¾Àyú\u0084ÿ?é ¿b³Ô\niÿÄü\u000fµìôgó8¨\u0000e°U,ë\u009bï«\u0081\u0010Jnf\u007f\u0097¤\u0099´\u0014-\u0016ü\u0004ËUû\u0010I+\u007fô\u0095ÃD#ÂcÐ\u008cÂ$Öµ\u0010\u000b\u0010\u0094JTð\u0086\u009aÏÃ#\tÔ\u0087¡\u00ad\u0010\u0095M\u0081Cp\u001e\u008cCÂ\u0017Ìg]&\u007fG\u0018K\u009f=\u009c³\u0085æÑ7ÿ\u007f³@?e\u009d\u0083tù\u0093Íw\u009c¡";
      int var19 = "\u009a P¯\u0099]ëlÙd\u0094ÕwÙ_\u001eòvgàzZÄ\tãÙÒ¤A\u0003\u0006I\u0018+îÐ\u0088À\u0006Á \u0084åS\u00ad¡¶³køµ-õË@+÷0ø\u007f\u000b¥è¿8ÒÅ§¼\u0003qÇ\u0011Ö\u0086y\u0086~s\u0091>ñÿ|\u0096¿\u0005Aª¹`\u0017£w\u0011k\u0091\u001fÊ\u001d~\u008c\u0091\u00951\u0096 ÕCO\u0004\u0080úíxÚ0¹ÙxdÑ\u0084ähF\\Ã±ÜE×Y^ÇJþÊ\u001f\u0018(»ÄøS^%\u007fðG»&\u001f\u0007ú\u009b-Lt¬^Â\u0084k0ün\u009d\u000b\u0089Dzo»þó\u009d¾Àyú\u0084ÿ?é ¿b³Ô\niÿÄü\u000fµìôgó8¨\u0000e°U,ë\u009bï«\u0081\u0010Jnf\u007f\u0097¤\u0099´\u0014-\u0016ü\u0004ËUû\u0010I+\u007fô\u0095ÃD#ÂcÐ\u008cÂ$Öµ\u0010\u000b\u0010\u0094JTð\u0086\u009aÏÃ#\tÔ\u0087¡\u00ad\u0010\u0095M\u0081Cp\u001e\u008cCÂ\u0017Ìg]&\u007fG\u0018K\u009f=\u009c³\u0085æÑ7ÿ\u007f³@?e\u009d\u0083tù\u0093Íw\u009c¡".length();
      char var16 = ' ';
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[13];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[19];
                  int var3 = 0;
                  String var4 = "ï[\u0083\u0003Cì ë pdó\u0083\u0083h\u00856,\n\u0084\u0019Ð\u0000µÞó\u0096&\u007fR\u0088i@ÀÍ\\\rØZåRÎòê\u00906\u0091öuµ\u0081ºÉpÞ3/\u000f}Ä\u0094ÖÎ\u0000NNÍ\u008f ,\u0004z¡ý\u0090G,!v!\u000béÛËcP\"âG×úÙ\u008csªçr\\ã©HÓTN^¯=\u001d0\r·Òî`©À²\u000bî¹\u0002|íµ7Soµ\u001d<.\u0091\u001b\u0019\"2";
                  int var5 = "ï[\u0083\u0003Cì ë pdó\u0083\u0083h\u00856,\n\u0084\u0019Ð\u0000µÞó\u0096&\u007fR\u0088i@ÀÍ\\\rØZåRÎòê\u00906\u0091öuµ\u0081ºÉpÞ3/\u000f}Ä\u0094ÖÎ\u0000NNÍ\u008f ,\u0004z¡ý\u0090G,!v!\u000béÛËcP\"âG×úÙ\u008csªçr\\ã©HÓTN^¯=\u001d0\r·Òî`©À²\u000bî¹\u0002|íµ7Soµ\u001d<.\u0091\u001b\u0019\"2".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var26 = var3++;
                     long var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var31 = -1;

                     while(true) {
                        long var8 = var30;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var31) {
                        case 0:
                           var25[var26] = var33;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[19];
                              w = new _o();
                              j = (List)(new ArrayList());
                              B = (List)(new ArrayList());
                              p = (List)(new ArrayList());
                              y = (List)(new ArrayList());
                              l = (List)(new ArrayList());
                              G = (List)(new ArrayList());
                              N = (List)(new ArrayList());
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "~¢:·îõA\u0011\u001b*®\u0084T=Ám";
                           var5 = "~¢:·îõA\u0011\u001b*®\u0084T=Ám".length();
                           var2 = 0;
                        }

                        var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var26 = var3++;
                        var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var31 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "õÁW\u0007XGNqê\u001aÖo&÷I\u0098\nèÁ|;aàë\n9\u0087QA\u0017\u0006Ó\u00108¨-Lßf\u0099»\u0089®Ë\u001e-äÅý";
               var19 = "õÁW\u0007XGNqê\u001aÖo&÷I\u0098\nèÁ|;aàë\n9\u0087QA\u0017\u0006Ó\u00108¨-Lßf\u0099»\u0089®Ë\u001e-äÅý".length();
               var16 = ' ';
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
            var10001 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30637;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/_o", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("su/catlean/_o" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 725;
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
            throw new RuntimeException("su/catlean/_o", var14);
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
         throw new RuntimeException("su/catlean/_o" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
