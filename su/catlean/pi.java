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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2404;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import net.minecraft.class_2848.class_2849;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;

public final class pi implements h5 {
   @NotNull
   public static final pi A;
   private static boolean g;
   private static boolean C;
   private static float a;
   @Nullable
   private static class_1799 E;
   @Nullable
   private static class_1799 K;
   @NotNull
   private static class_1792 Z;
   @NotNull
   private static class_1792 s;
   private static int W;
   private static int k;
   private static long n;
   private static final long b = j0.a(1660974929693295565L, 6286623096623891022L, MethodHandles.lookup().lookupClass()).a(218250030366437L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] h;
   private static final Map i;

   private pi() {
   }

   public final boolean T() {
      return g;
   }

   public final void g(boolean <set-?>) {
      g = var1;
   }

   public final boolean G() {
      return C;
   }

   public final void T(boolean <set-?>) {
      C = var1;
   }

   public final float B() {
      return a;
   }

   public final void m(float <set-?>) {
      a = var1;
   }

   @Nullable
   public final class_1799 n() {
      return E;
   }

   public final void A(@Nullable class_1799 <set-?>) {
      E = var1;
   }

   @Nullable
   public final class_1799 x() {
      return K;
   }

   public final void h(@Nullable class_1799 <set-?>) {
      K = var1;
   }

   @NotNull
   public final class_1792 A() {
      return Z;
   }

   public final void d(@NotNull class_1792 <set-?>, long a) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(20738, 2525581606187923043L ^ var2));
      Z = var1;
   }

   @NotNull
   public final class_1792 f() {
      return s;
   }

   public final void H(long a, @NotNull class_1792 <set-?>) {
      var1 ^= b;
      Intrinsics.checkNotNullParameter(var3, true.b<invokedynamic>(23144, 3325910014478273395L ^ var1));
      s = var3;
   }

   public final int w() {
      return W;
   }

   public final void E(int <set-?>) {
      W = var1;
   }

   public final int t() {
      return k;
   }

   public final void a(int <set-?>) {
      k = var1;
   }

   public final long V() {
      return n;
   }

   public final void w(long <set-?>) {
      n = var1;
   }

   public void m(char a, @NotNull PreSyncEvent e, long a) {
      // $FF: Couldn't be decompiled
   }

   public void i(long a, @NotNull PreElytraEvent e) {
      // $FF: Couldn't be decompiled
   }

   public void p(@NotNull AfterElytraEvent e, long a) {
      long var4 = var2 ^ 107026128700072L;

      try {
         Intrinsics.checkNotNullParameter(var1, "e");
         if (i4.v.e() < 4) {
            s8.f(var4).method_36457(o4.k.Na());
         }

      } catch (NoWhenBranchMatchedException var6) {
         throw var6.A<invokedynamic>(var6, 141200812141670306L, var2);
      }
   }

   public void T(@NotNull MoveEvent e, long a) {
      // $FF: Couldn't be decompiled
   }

   public void y(long a, @NotNull AfterSendPacket event) {
      // $FF: Couldn't be decompiled
   }

   private final void a(boolean param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   public void D(long a, @NotNull ReceivePacket e) {
      // $FF: Couldn't be decompiled
   }

   public void n(int a, @NotNull PlayerUpdateEvent e, char a, int a) {
      // $FF: Couldn't be decompiled
   }

   public void l(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void y(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void B(long a, @NotNull FireWorkVelocityEvent e) {
      Intrinsics.checkNotNullParameter(var3, "e");
   }

   public void o(@NotNull SetPoseEvent e) {
      Intrinsics.checkNotNullParameter(var1, "e");
   }

   public void n(@NotNull ReceivePacket e, long a) {
      Intrinsics.checkNotNullParameter(var1, "e");
   }

   private final int t(boolean var1, long var2) {
      var2 ^= b;
      long var4 = var2 ^ 113747927630438L;
      long var10001 = var2 ^ 31807981970429L;
      int var6 = (int)((var2 ^ 31807981970429L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      dk var10000;
      class_1792 var10003;
      class_1792[] var9;
      int var10;
      if (var1) {
         var10000 = dk.I;
         var9 = new class_1792[1];
         var10003 = class_1802.field_8639;
         Intrinsics.checkNotNullExpressionValue(var10003, true.b<invokedynamic>(12229, 1749955780060144060L ^ var2));
         var9[0] = var10003;
         var10 = var10000.b(var9, var4).I();
      } else {
         var10000 = dk.I;
         var9 = new class_1792[1];
         var10003 = class_1802.field_8639;
         Intrinsics.checkNotNullExpressionValue(var10003, true.b<invokedynamic>(7883, 6606556020930203833L ^ var2));
         var9[0] = var10003;
         var10 = var10000.Q(var6, (short)var7, var9, var8).I();
      }

      return var10;
   }

   private final void d(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 31949578511916L;
      int var3 = (int)((var1 ^ 31949578511916L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 88452345263113L;
      o4.k.G((char)var3, var4, nf.s.G(true.b<invokedynamic>(26221, 7400190031103494503L ^ var1), var6, new Object[0]), (char)var5);
      g = false;
   }

   private final void h(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 134833436860571L;
      int var3 = (int)((var1 ^ 134833436860571L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 61426198835902L;
      o4.k.G((char)var3, var4, nf.s.G(true.b<invokedynamic>(26124, 448014475828367284L ^ var1), var6, new Object[0]), (char)var5);
      g = false;
   }

   private final void V(int var1, int var2, byte var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ b;
      long var10001 = var5 ^ 26174710278721L;
      int var7 = (int)((var5 ^ 26174710278721L) >>> 32);
      long var8 = var10001 << 32 >>> 32;
      long var10 = var5 ^ 47288698456678L;
      ff.G(var4, 0, var7, (class_1713)null, false, true.u<invokedynamic>(15480, 929505967575043258L ^ var5), var8, (Object)null);
      ff.G(o4.k.s(var10) - 1 + true.u<invokedynamic>(16179, 1023620412479967218L ^ var5), 0, var7, (class_1713)null, false, true.u<invokedynamic>(15480, 929505967575043258L ^ var5), var8, (Object)null);
      ff.G(var4, 0, var7, (class_1713)null, true, true.u<invokedynamic>(26077, 8798512150676821271L ^ var5), var8, (Object)null);
   }

   private final void Y(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void F(long var1) {
      var1 ^= b;
      W = -1;
      class_1792 var10000 = class_1802.field_8162;
      Intrinsics.checkNotNullExpressionValue(var10000, true.b<invokedynamic>(25542, 198164770381836292L ^ var1));
      Z = var10000;
      E = null;
   }

   private final int X(class_1799 param1, long param2, class_1792 param4) {
      // $FF: Couldn't be decompiled
   }

   private final int L(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean e(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean j(int param1, int param2, char param3) {
      // $FF: Couldn't be decompiled
   }

   private final void H(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void E(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final int D(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean a(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean C(int var1, short var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 53616911876824L;
      int var6 = (int)((var4 ^ 53616911876824L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var4 ^ 88890697959277L;
      return s8.i((char)var6, var7, (short)var8).method_8320(class_2338.method_49637(s8.f(var9).method_23317(), s8.f(var9).method_23318() - 0.1D, s8.f(var9).method_23321())).method_26204() instanceof class_2404;
   }

   private static final void p() {
      long var0 = b ^ 108746250585358L;
      long var2 = var0 ^ 38905465700907L;
      long var4 = var0 ^ 111198818208726L;
      long var6 = var0 ^ 120844373600840L;
      long var8 = var0 ^ 139548350173852L;
      long var10 = var0 ^ 23878711517205L;
      h4.G((class_2596)(new class_2848((class_1297)s8.f(var4), class_2849.field_12982)), var6);
      A.Y(var2);
      pi var10000 = A;
      k = -1;
      var10000 = A;
      class_1792 var12 = class_1802.field_8162;
      Intrinsics.checkNotNullExpressionValue(var12, true.b<invokedynamic>(9159, 7494154228984274126L ^ var0));
      s = var12;
      var10000 = A;
      K = null;
      A.E(var8);
      A.F(var10);
   }

   static {
      long var20 = b ^ 136526380322967L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[17];
      int var16 = 0;
      String var15 = "¸Æ.#ßy\u009d5ìºÊW\u0090¿^\u009d\u0010\u0098\u0080÷\u000e]8OÙþ\u0012ò£\u000fì¹<8b4¤U«\u008cÇü\u001f¶r®¯D{\u0087ZhvÈ^\u0017Æ=\u0002$mL\u009bÙü¿OùC\\\u0006Bitâ@²\u001e2\u0097ß\u001d\u0007\u0099ì¸ÑÐ?68\u008a\u0097Á©¡ÝO\u0000Ñ0Iû+$\n\t{P\u0084ð\u0010SB\" z«è\u0005¶k8Ø,Q\u000f\u009dv\u0005ç\u0084h\u009f%Ù\u0018\u0080Å\u0002\u0088¼\u007fµj¢w\u0090\u0082\u0082ÙÑ\u0087ñeÅcÿØß=\u0090;\n®¦fÔZCm\u009b\u00811Çv\u000baU]Ä\u0082S_]ù\u008fj\u00027É,gmÀÓ\u0089_\u0081©\u008aåÝïÏ4ÍÀ\u008a\u008e\u0014Un\u0000ªórJ·?ç\u000b<ìô\u008a>|Ú\u0007ÞY=\u000bSÈá\u0097ë¤\u0004Ö\tÍ\u001eÝqßwì8²\u0000qÒ\u001cï$¤iU8\u0086wç\u0003Ø\u009dè\u0083\u001d»2\u0006ß4\fÉ^Â\u0088ÉîjÏcWñ\u009fE\u0081\u0004\u0018OÐ\u009fª,úp·<`[8°UÙ\u009c¨`Ni9x\tZ0[vq\u008f²ëôM®E\u009b¨\u0001A(\u007fºÂº\u0090\u0098¤mÌÞtÇ\u001eAV¼¤Ø;\u0098Å`øà^ì7ôq>ë1Å0\u0087Îþ\u0001\u0013{â·\u0019\u001a\b^\u0005e\u0083ÂÈ¯îÍ¨\u0081JuÒkpIn¶¬\u000b4/ª\u009d¢ºò ¹\u0096ÈÊ{â\u001ak\u0088Z=\u0002\u0084åÌ&Î\u0006cOIýùÀädÔFØ\u0080XDr8<Õ#û\"Á}ÅÑ£«+5,ÙnþiÿÊFåÃé7}å\u009c¢êÞeó\u0005\u001b{\u0088c#[µ\u0018\u0014¯©\u0001.î\u0005³2\u0002`Îèo\u0087Úo\u0096>\u001f&\u0083= Ç\u009a\u0095FÂ!\u007f`\u0094\u0004·\b'ÁIÕS\fz\u0012\u0091¡Á(\u0016\u001eQ¿ö¥Æ¼}\u001f²b\u0097\u0016_[\u001am\u000f\u0019_\u0010ñü\u0095r WÇMrÈ»¯\u0011Q\u008bÉ Û÷¿\u0085]âgÿ.lÊ\u001dÉertYî\u00837ðìdú\u0013¼×\u00adëU®b0\u0081ýØÉh\u009a\u0000°¿\u0090°_:K«ª<Ý:ÍÑ,\\Â\u0016ë\u0099AÁ7Cä¿\u0004µôÛ9$ôC)\u0080ûÙn\u0018n\u0010:ô\u0091DWg6ö\u00026\u0019aü\u0015/Ì\u0010=\u0002ÍN6õ\u0094kN\u0013V<\u001cÿåö\u0018Úf´ÞKú\u007f\u0086\u0002\u0087¢Q\u0018å;g]\u0085+sM]tW";
      int var17 = "¸Æ.#ßy\u009d5ìºÊW\u0090¿^\u009d\u0010\u0098\u0080÷\u000e]8OÙþ\u0012ò£\u000fì¹<8b4¤U«\u008cÇü\u001f¶r®¯D{\u0087ZhvÈ^\u0017Æ=\u0002$mL\u009bÙü¿OùC\\\u0006Bitâ@²\u001e2\u0097ß\u001d\u0007\u0099ì¸ÑÐ?68\u008a\u0097Á©¡ÝO\u0000Ñ0Iû+$\n\t{P\u0084ð\u0010SB\" z«è\u0005¶k8Ø,Q\u000f\u009dv\u0005ç\u0084h\u009f%Ù\u0018\u0080Å\u0002\u0088¼\u007fµj¢w\u0090\u0082\u0082ÙÑ\u0087ñeÅcÿØß=\u0090;\n®¦fÔZCm\u009b\u00811Çv\u000baU]Ä\u0082S_]ù\u008fj\u00027É,gmÀÓ\u0089_\u0081©\u008aåÝïÏ4ÍÀ\u008a\u008e\u0014Un\u0000ªórJ·?ç\u000b<ìô\u008a>|Ú\u0007ÞY=\u000bSÈá\u0097ë¤\u0004Ö\tÍ\u001eÝqßwì8²\u0000qÒ\u001cï$¤iU8\u0086wç\u0003Ø\u009dè\u0083\u001d»2\u0006ß4\fÉ^Â\u0088ÉîjÏcWñ\u009fE\u0081\u0004\u0018OÐ\u009fª,úp·<`[8°UÙ\u009c¨`Ni9x\tZ0[vq\u008f²ëôM®E\u009b¨\u0001A(\u007fºÂº\u0090\u0098¤mÌÞtÇ\u001eAV¼¤Ø;\u0098Å`øà^ì7ôq>ë1Å0\u0087Îþ\u0001\u0013{â·\u0019\u001a\b^\u0005e\u0083ÂÈ¯îÍ¨\u0081JuÒkpIn¶¬\u000b4/ª\u009d¢ºò ¹\u0096ÈÊ{â\u001ak\u0088Z=\u0002\u0084åÌ&Î\u0006cOIýùÀädÔFØ\u0080XDr8<Õ#û\"Á}ÅÑ£«+5,ÙnþiÿÊFåÃé7}å\u009c¢êÞeó\u0005\u001b{\u0088c#[µ\u0018\u0014¯©\u0001.î\u0005³2\u0002`Îèo\u0087Úo\u0096>\u001f&\u0083= Ç\u009a\u0095FÂ!\u007f`\u0094\u0004·\b'ÁIÕS\fz\u0012\u0091¡Á(\u0016\u001eQ¿ö¥Æ¼}\u001f²b\u0097\u0016_[\u001am\u000f\u0019_\u0010ñü\u0095r WÇMrÈ»¯\u0011Q\u008bÉ Û÷¿\u0085]âgÿ.lÊ\u001dÉertYî\u00837ðìdú\u0013¼×\u00adëU®b0\u0081ýØÉh\u009a\u0000°¿\u0090°_:K«ª<Ý:ÍÑ,\\Â\u0016ë\u0099AÁ7Cä¿\u0004µôÛ9$ôC)\u0080ûÙn\u0018n\u0010:ô\u0091DWg6ö\u00026\u0019aü\u0015/Ì\u0010=\u0002ÍN6õ\u0094kN\u0013V<\u001cÿåö\u0018Úf´ÞKú\u007f\u0086\u0002\u0087¢Q\u0018å;g]\u0085+sM]tW".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[17];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[12];
                  int var3 = 0;
                  String var4 = "\u0010æ\"\u009dl\u0081;\u0093\u0003\u00813Z\u0096ZÏì-X½Êì5»),yJ\u0012\u009d\u0088äTÞ*H\u000e/°à\u0086wcÇ®\u0007jËýxMx\\ÄÉ°\u001a~G\u0014ICÑ¤\u0090g^\u0094«\u0086\u0004_Õ\u0083Ìá§T¨Ö\u0001";
                  int var5 = "\u0010æ\"\u009dl\u0081;\u0093\u0003\u00813Z\u0096ZÏì-X½Êì5»),yJ\u0012\u009d\u0088äTÞ*H\u000e/°à\u0086wcÇ®\u0007jËýxMx\\ÄÉ°\u001a~G\u0014ICÑ¤\u0090g^\u0094«\u0086\u0004_Õ\u0083Ìá§T¨Ö\u0001".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var27 = var3++;
                     long var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var32 = -1;

                     while(true) {
                        long var8 = var31;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var34 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var32) {
                        case 0:
                           var25[var27] = var34;
                           if (var2 >= var5) {
                              f = var6;
                              h = new Integer[12];
                              A = new pi();
                              class_1792 var26 = class_1802.field_8162;
                              Intrinsics.checkNotNullExpressionValue(var26, true.b<invokedynamic>(25542, 198291053959891290L ^ var20));
                              Z = var26;
                              var26 = class_1802.field_8162;
                              Intrinsics.checkNotNullExpressionValue(var26, true.b<invokedynamic>(25542, 198291053959891290L ^ var20));
                              s = var26;
                              W = -1;
                              k = -1;
                              return;
                           }
                           break;
                        default:
                           var25[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "¼ü\u009edlá,þ5\u0010F\t\u0087ð\nÃ";
                           var5 = "¼ü\u009edlá,þ5\u0010F\t\u0087ð\nÃ".length();
                           var2 = 0;
                        }

                        var27 = var2;
                        var2 += 8;
                        var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var27 = var3++;
                        var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var32 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "I\u0091 \u0002\u0005]ùÜ¸\u000eÛ\u001b4ìîgmÕ§ü\u0098[\u009c\u0099(\u0005\u0013Ê\u008c5Ë,\u0093ÓQ\u0080iÎwE\u008f\u0003U<¨LíïÍFg«¼|\u0002¿ævU0\u0083\u0090l\u009f\u0094";
               var17 = "I\u0091 \u0002\u0005]ùÜ¸\u000eÛ\u001b4ìîgmÕ§ü\u0098[\u009c\u0099(\u0005\u0013Ê\u008c5Ë,\u0093ÓQ\u0080iÎwE\u008f\u0003U<¨LíïÍFg«¼|\u0002¿ævU0\u0083\u0090l\u009f\u0094".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30420;
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
            throw new RuntimeException("su/catlean/pi", var10);
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
         throw new RuntimeException("su/catlean/pi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4794;
      if (h[var3] == null) {
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
            throw new RuntimeException("su/catlean/pi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("su/catlean/pi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
