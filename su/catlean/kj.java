package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.network.AfterReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.world.WorldUpdateEvent;
import su.catlean.gofra.Flow;

public final class kj extends kr {
   @NotNull
   public static final kj W;
   static final KProperty[] P;
   @NotNull
   private static final zo A;
   @NotNull
   private static final zo z;
   @NotNull
   private static final z0 y;
   @NotNull
   private static final zq s;
   @NotNull
   private static final zr k;
   @NotNull
   private static final zo V;
   private static boolean c;
   @NotNull
   private static iv Q;
   @NotNull
   private static iv B;
   private static final long e = j0.a(-2770228041260933932L, 6612744940097739897L, MethodHandles.lookup().lookupClass()).a(113350818842362L);
   private static final String[] m;
   private static final String[] q;
   private static final Map C;
   private static final long[] K;
   private static final Integer[] ob;
   private static final Map pb;

   private kj(long var1) {
      var1 ^= e;
      long var3 = var1 ^ 56158761666937L;
      super(true.k<invokedynamic>(22361, 4330534762807807057L ^ var1), pa.N(), var3, true.i<invokedynamic>(24966, 8981027650696157745L ^ var1), false);
   }

   private final boolean T(char var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ e;
      long var10001 = var4 ^ 27223985149359L;
      int var6 = (int)((var4 ^ 27223985149359L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)A.k((short)var6, this, P[0], (short)var7, var8);
   }

   private final boolean m(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ e;
      long var10001 = var4 ^ 26901887694765L;
      int var6 = (int)((var4 ^ 26901887694765L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)z.k((short)var6, this, P[1], (short)var7, var8);
   }

   private final int i(char var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ e;
      long var10001 = var4 ^ 6301404681065L;
      int var6 = (int)((var4 ^ 6301404681065L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)y.k((short)var6, this, P[2], (short)var7, var8)).intValue();
   }

   private final kq b(long var1) {
      var1 ^= e;
      long var10001 = var1 ^ 9515759381503L;
      int var3 = (int)((var1 ^ 9515759381503L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (kq)s.k((short)var3, this, P[3], (short)var4, var5);
   }

   private final void e(long var1, kq var3) {
      var1 ^= e;
      long var10001 = var1 ^ 79724606846145L;
      int var4 = (int)((var1 ^ 79724606846145L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      s.P(this, var4, P[3], (short)var5, var3, (short)var6);
   }

   private final bu y(int var1, short var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ e;
      long var10001 = var4 ^ 3172204670741L;
      int var6 = (int)((var4 ^ 3172204670741L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (bu)k.k((short)var6, this, P[4], (short)var7, var8);
   }

   private final void T(bu var1, byte var2, long var3) {
      long var5 = ((long)var2 << 56 | var3 << 8 >>> 8) ^ e;
      long var10001 = var5 ^ 65877315363557L;
      int var7 = (int)((var5 ^ 65877315363557L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      k.P(this, var7, P[4], (short)var8, var1, (short)var9);
   }

   private final boolean t(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ e;
      long var10001 = var4 ^ 96583241109918L;
      int var6 = (int)((var4 ^ 96583241109918L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)V.k((short)var6, this, P[5], (short)var7, var8);
   }

   private final void c(boolean var1, long var2) {
      var2 ^= e;
      long var10001 = var2 ^ 3727677039294L;
      int var4 = (int)((var2 ^ 3727677039294L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      V.P(this, var4, P[5], (short)var5, var1, (short)var6);
   }

   public void n(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void j(TickEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void L(WorldUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = 10
   )
   private final void Q(AfterReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void E(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final List C(class_2338 param1, List param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   protected List W(long var1) {
      long var3 = var1 ^ 126271134534286L;
      return this.b(var3).G();
   }

   private static final boolean I() {
      long var0 = e ^ 2155856032620L;
      long var10001 = var0 ^ 47769889486364L;
      int var2 = (int)((var0 ^ 47769889486364L) >>> 32);
      long var3 = var10001 << 32 >>> 32;
      return W.m(var2, var3);
   }

   private static final boolean J() {
      long var0 = e ^ 24717257775700L;
      long var10001 = var0 ^ 42229532559260L;
      int var2 = (int)((var0 ^ 42229532559260L) >>> 32);
      int var3 = (int)(var10001 << 32 >>> 48);
      int var4 = (int)(var10001 << 48 >>> 48);

      boolean var10000;
      try {
         if (W.y(var2, (short)var3, (short)var4) != bu.OFF) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 6940294492686112949L, var0);
      }

      var10000 = false;
      return var10000;
   }

   static {
      long var20 = e ^ 31370173273086L;
      long var22 = var20 ^ 128472862754542L;
      long var10001 = var20 ^ 61339023790434L;
      int var24 = (int)((var20 ^ 61339023790434L) >>> 48);
      int var25 = (int)(var10001 << 16 >>> 32);
      int var26 = (int)(var10001 << 48 >>> 48);
      long var27 = var20 ^ 77817112154465L;
      long var29 = var20 ^ 107281699917787L;
      long var31 = var20 ^ 91949049219112L;
      var10001 = var20 ^ 9533052205850L;
      int var33 = (int)((var20 ^ 9533052205850L) >>> 32);
      int var34 = (int)(var10001 << 32 >>> 48);
      int var35 = (int)(var10001 << 48 >>> 48);
      C = new HashMap(13);
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
      String var15 = "W#\r\u0082ÝPË4h½Õ/ \u009b?d\u0018míÏ'Lo£\u009b¿@uE=n\u009cú\u0089`ït\u000b\u0094\u0001B N\u008c¡\u001f.Þü\\ýÕxÔ1â\u0096Zo\u008cR#Ëól\u0084p\u0094\u0093\u0013b\u0018¶ê({¢\u0015S$}ÈÚwD¤¨;«ôÇÿ¨\u008c\u001f\r\u001f4+mÇç[\u0084\u0085\u0010\u009a\u001d£Hz\u0006ÿ\u008f\u0099\u0018Î«÷\u00179\u0005 z\u0005HJRô¼,\u0095\u008e\u0098\u007fä\u0098\u0011{\u008e(hµñ\u0095K\u0084U\u0098ÌÜùh\u0091»çqíE_\u0080¯\u001cJ\rá\u0087\u000bD<\u000bÛMb>ö3ó9Õ\u001c\u0018\tó¼\u0096³7ä\b·ÎRª\u0012T\u0089;Í*|Ö±\u0018\u0089\u001b\u0010ZÌ16>\\(0x@bÛ\u0082}FK ª\u001aÿ\u0093\t®\n\u0017gúF\u009båaB>ØiÖòÙqÔà½ë\u0014&\u0003\u0011\u0015\\ Àå\u0090ðe_¹æ\u008eE\u001eJ+\u0005ªï\u0017\nê\u0013Ê8Uê»\u0002\u0085I(\u0014°c@ë\u009dÍgb&¿Âµ\u009cgÁX\u0006I\u0084W\t#ðÅ&DbðA+$\u000bË¬<ÌÈ\u0097\u000fSÙ\u009b.\u008f\u007fG}T£\u009dÃWøro?B=Ù\u0083°þî \u000b_o ^r|_Û.6Ëì¨\u007f\u0016¦ÃÎj\u0000 \u008f&_BGA+\n\u0095×ú$\u0011å Ä~§ùE¸h®U\u009dUI+µlBñíHý\\Ð%Jði³·=Ú.b\u0010g\u009bE\u00004·\u0093Æ=\u0092Ý\u0097\u009bð\u007fl \u0004¯\u0087S\u0006ëXd¨3\u009e¥\u008c\n¼í^\"!p¦ý\u001f\u0083\u001dÈ\u009f\u001f\u0093½Ïs g~\u001f\u009bÒ°¶î\u007f}Ú½6¥ÉoêÆÜÿ\u001e\u000e\u008c\u0010lÌ+¯æ3\u009e\u0004\u0018ÆjïA¥PBHØ\u008dEýdJ,\u0015ý8'\u0018áZM\u0016\u0018Ø¼î6ò'îM\u00010\u0003¯#¯\u00901¾l¡XÖHÈo8)çÓF®vÓAm\u0011^¯EÎÍ±\u0000\u009bPB\u008crSïÙP|HVJéxÐ Ð;Ç\u00adÃ\u000e¢¤¸ËÞ±\u0007\u0080j@IZ(L\u0084Í\u0010@ªeÇÂFÔ\u0082N= \u0005»eéË\u0018rÖÔ\u00adi÷d6k\u0005ª\u001d8ÕHl³\u0013É:xÀ\u008fð\u0018\"\u009fÿFbW+7p¨cºN\u009brÛ\u0084,]%\u008a]\u008f%\u0010ÖåVý,ÝÞ/é±\u0096\u0017Íã5\u0003(ö´öéÌûÏüÊÿ±\u0095g\u0094\u001b+ùÆ-ÅÑ2©ÔÜÛi7ß\u0092k¬~\u0015ÒA'¤ðt \u0003s\u008dYðº¨Ã\u0017ºåu\bøÎí±¥Òsí÷»]ÏòÎÅ;\u0018®\u0088";
      int var17 = "W#\r\u0082ÝPË4h½Õ/ \u009b?d\u0018míÏ'Lo£\u009b¿@uE=n\u009cú\u0089`ït\u000b\u0094\u0001B N\u008c¡\u001f.Þü\\ýÕxÔ1â\u0096Zo\u008cR#Ëól\u0084p\u0094\u0093\u0013b\u0018¶ê({¢\u0015S$}ÈÚwD¤¨;«ôÇÿ¨\u008c\u001f\r\u001f4+mÇç[\u0084\u0085\u0010\u009a\u001d£Hz\u0006ÿ\u008f\u0099\u0018Î«÷\u00179\u0005 z\u0005HJRô¼,\u0095\u008e\u0098\u007fä\u0098\u0011{\u008e(hµñ\u0095K\u0084U\u0098ÌÜùh\u0091»çqíE_\u0080¯\u001cJ\rá\u0087\u000bD<\u000bÛMb>ö3ó9Õ\u001c\u0018\tó¼\u0096³7ä\b·ÎRª\u0012T\u0089;Í*|Ö±\u0018\u0089\u001b\u0010ZÌ16>\\(0x@bÛ\u0082}FK ª\u001aÿ\u0093\t®\n\u0017gúF\u009båaB>ØiÖòÙqÔà½ë\u0014&\u0003\u0011\u0015\\ Àå\u0090ðe_¹æ\u008eE\u001eJ+\u0005ªï\u0017\nê\u0013Ê8Uê»\u0002\u0085I(\u0014°c@ë\u009dÍgb&¿Âµ\u009cgÁX\u0006I\u0084W\t#ðÅ&DbðA+$\u000bË¬<ÌÈ\u0097\u000fSÙ\u009b.\u008f\u007fG}T£\u009dÃWøro?B=Ù\u0083°þî \u000b_o ^r|_Û.6Ëì¨\u007f\u0016¦ÃÎj\u0000 \u008f&_BGA+\n\u0095×ú$\u0011å Ä~§ùE¸h®U\u009dUI+µlBñíHý\\Ð%Jði³·=Ú.b\u0010g\u009bE\u00004·\u0093Æ=\u0092Ý\u0097\u009bð\u007fl \u0004¯\u0087S\u0006ëXd¨3\u009e¥\u008c\n¼í^\"!p¦ý\u001f\u0083\u001dÈ\u009f\u001f\u0093½Ïs g~\u001f\u009bÒ°¶î\u007f}Ú½6¥ÉoêÆÜÿ\u001e\u000e\u008c\u0010lÌ+¯æ3\u009e\u0004\u0018ÆjïA¥PBHØ\u008dEýdJ,\u0015ý8'\u0018áZM\u0016\u0018Ø¼î6ò'îM\u00010\u0003¯#¯\u00901¾l¡XÖHÈo8)çÓF®vÓAm\u0011^¯EÎÍ±\u0000\u009bPB\u008crSïÙP|HVJéxÐ Ð;Ç\u00adÃ\u000e¢¤¸ËÞ±\u0007\u0080j@IZ(L\u0084Í\u0010@ªeÇÂFÔ\u0082N= \u0005»eéË\u0018rÖÔ\u00adi÷d6k\u0005ª\u001d8ÕHl³\u0013É:xÀ\u008fð\u0018\"\u009fÿFbW+7p¨cºN\u009brÛ\u0084,]%\u008a]\u008f%\u0010ÖåVý,ÝÞ/é±\u0096\u0017Íã5\u0003(ö´öéÌûÏüÊÿ±\u0095g\u0094\u001b+ùÆ-ÅÑ2©ÔÜÛi7ß\u0092k¬~\u0015ÒA'¤ðt \u0003s\u008dYðº¨Ã\u0017ºåu\bøÎí±¥Òsí÷»]ÏòÎÅ;\u0018®\u0088".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var38 = var15.substring(var13, var13 + var14);
         byte var41 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var38.getBytes("ISO-8859-1"));
            String var45 = c(var19).intern();
            switch(var41) {
            case 0:
               var18[var16++] = var45;
               if ((var13 += var14) >= var17) {
                  m = var18;
                  q = new String[27];
                  pb = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[11];
                  int var3 = 0;
                  String var4 = "\u0087ÿ\u000eWZ\u008egí\u0081\u000fírì\u00964r2ç0¶;\u0013\u008bxæµ$Yàyë,µGÍ\u0088OÃÖÈ\u008c\u001c\u0090å\u0013ûØ\u0007G¡á\u0091Vz´î\u001dÙIs½z\u0017È@¾\u0002¦Y©\u0004\u0092";
                  int var5 = "\u0087ÿ\u000eWZ\u008egí\u0081\u000fírì\u00964r2ç0¶;\u0013\u008bxæµ$Yàyë,µGÍ\u0088OÃÖÈ\u008c\u001c\u0090å\u0013ûØ\u0007G¡á\u0091Vz´î\u001dÙIs½z\u0017È@¾\u0002¦Y©\u0004\u0092".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var46 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
                     long[] var40 = var6;
                     var46 = var3++;
                     long var48 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var49 = -1;

                     while(true) {
                        long var8 = var48;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var51 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var49) {
                        case 0:
                           var40[var46] = var51;
                           if (var2 >= var5) {
                              K = var6;
                              ob = new Integer[11];
                              KProperty[] var36 = new KProperty[true.i<invokedynamic>(14348, 5530878957799860648L ^ var20)];
                              var36[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kj.class, true.k<invokedynamic>(22603, 9122544392468293973L ^ var20), true.k<invokedynamic>(28690, 6071036770153546008L ^ var20), 0)));
                              var36[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kj.class, true.k<invokedynamic>(13360, 6221425984940016956L ^ var20), true.k<invokedynamic>(15079, 6940069769950989288L ^ var20), 0)));
                              var36[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kj.class, true.k<invokedynamic>(20936, 9152029719382221010L ^ var20), true.k<invokedynamic>(27808, 4929278564173110716L ^ var20), 0)));
                              var36[3] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kj.class, true.k<invokedynamic>(6681, 3422297513889016584L ^ var20), true.k<invokedynamic>(9187, 5075696477180826338L ^ var20), 0)));
                              var36[4] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kj.class, true.k<invokedynamic>(4123, 5614231492318503184L ^ var20), true.k<invokedynamic>(9974, 8206080404709218287L ^ var20), 0)));
                              var36[5] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kj.class, true.k<invokedynamic>(21662, 5146432253463717278L ^ var20), true.k<invokedynamic>(30038, 4000573961469117528L ^ var20), 0)));
                              P = var36;
                              W = new kj(var27);
                              A = qi.R((il)W, true.k<invokedynamic>(11711, 4364268141197991096L ^ var20), true, (pj)null, (Function0)null, true.i<invokedynamic>(16625, 3890785768537624919L ^ var20), var31, (Object)null);
                              z = qi.R((il)W, true.k<invokedynamic>(3780, 170329507700981721L ^ var20), true, (pj)null, (Function0)null, true.i<invokedynamic>(25980, 6942634491509585119L ^ var20), var31, (Object)null);
                              y = qi.o((il)W, true.k<invokedynamic>(141, 3404177295082467720L ^ var20), 0, new IntRange(0, true.i<invokedynamic>(4264, 290911908871028998L ^ var20)), var22, (pj)null, kj::I, true.i<invokedynamic>(21890, 6115515781207065637L ^ var20), (Object)null);
                              il var42 = (il)W;
                              var45 = 31399.k<invokedynamic>(31399, 8765523835359677345L ^ var20);
                              class_2248[] var37 = new class_2248[3];
                              class_2248 var10007 = class_2246.field_10540;
                              Intrinsics.checkNotNullExpressionValue(var10007, true.k<invokedynamic>(13418, 5413140792602494312L ^ var20));
                              var37[0] = var10007;
                              var10007 = class_2246.field_10443;
                              Intrinsics.checkNotNullExpressionValue(var10007, true.k<invokedynamic>(31202, 7411755209448573177L ^ var20));
                              var37[1] = var10007;
                              var10007 = class_2246.field_22108;
                              Intrinsics.checkNotNullExpressionValue(var10007, true.k<invokedynamic>(19620, 8766639796660469159L ^ var20));
                              var37[2] = var10007;
                              s = qi.K(var42, var33, var45, new kq((short)var24, var25, CollectionsKt.mutableListOf(var37), (char)var26), (pj)null, (short)var34, (Function0)null, (char)var35, true.i<invokedynamic>(25980, 6942634491509585119L ^ var20), (Object)null);
                              k = qi.M((il)W, true.k<invokedynamic>(25032, 4308717742673875152L ^ var20), (Enum)bu.OFF, (pj)null, (Function0)null, true.i<invokedynamic>(25980, 6942634491509585119L ^ var20), (Object)null, var29);
                              V = qi.R((il)W, true.k<invokedynamic>(2946, 7229297178035894927L ^ var20), false, (pj)null, kj::J, 4, var31, (Object)null);
                              Q = new iv();
                              B = new iv();
                              return;
                           }
                           break;
                        default:
                           var40[var46] = var51;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u001393\u0082\u000b`ðÅ\u001d\"\u001c>úÓü/";
                           var5 = "\u001393\u0082\u000b`ðÅ\u001d\"\u001c>úÓü/".length();
                           var2 = 0;
                        }

                        var46 = var2;
                        var2 += 8;
                        var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
                        var40 = var6;
                        var46 = var3++;
                        var48 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var49 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var45;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "þÒ¶\u0094àTi\u0086°øO\u00ad«\u0083\u0014\u001fU\u0011ÈI^øzGé/\u0093ü¨ªQ&\u0018\u0085\u000f\u0014fùH¼Y\u0081zh!~oÙ\u0000TÅ±\u009daõgî";
               var17 = "þÒ¶\u0094àTi\u0086°øO\u00ad«\u0083\u0014\u001fU\u0011ÈI^øzGé/\u0093ü¨ªQ&\u0018\u0085\u000f\u0014fùH¼Y\u0081zh!~oÙ\u0000TÅ±\u009daõgî".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var38 = var15.substring(var13, var13 + var14);
            var41 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6531;
      if (q[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])C.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               C.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/kj", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = m[var5].getBytes("ISO-8859-1");
         q[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return q[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/kj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31023;
      if (ob[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = K[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])pb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               pb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/kj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ob[var3] = var15;
      }

      return ob[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/kj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
