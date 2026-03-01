package su.catlean;

import java.io.File;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

public final class t6 extends k9 {
   @NotNull
   public static final t6 C;
   static final KProperty[] y;
   @NotNull
   private static final File I;
   @NotNull
   private static final File n;
   @NotNull
   private static final zm R;
   @NotNull
   private static final zn k;
   @NotNull
   private static final zn e;
   @NotNull
   private static final zr d;
   @NotNull
   private static final zl J;
   @NotNull
   private static final iv q;
   private static long T;
   private static long P;
   @NotNull
   private static List g;
   @NotNull
   private static List Y;
   private static final long b = j0.a(6107136696232476581L, 3901828995008321721L, MethodHandles.lookup().lookupClass()).a(91964694382271L);
   private static final String[] c;
   private static final String[] f;
   private static final Map i;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map o;

   private t6(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 90827165083931L;
      super(var3, true.c<invokedynamic>(22377, 3501611882305023803L ^ var1), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final g0 f(byte var1, long var2) {
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ b;
      long var10001 = var4 ^ 106835053198239L;
      int var6 = (int)((var4 ^ 106835053198239L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (g0)R.k((short)var6, this, y[0], (short)var7, var8);
   }

   private final void Z(long var1, g0 var3) {
      var1 ^= b;
      long var10001 = var1 ^ 106491716079524L;
      int var4 = (int)((var1 ^ 106491716079524L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      R.P(this, var4, y[0], (short)var5, var3, (short)var6);
   }

   private final zu K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 12099607899841L;
      int var3 = (int)((var1 ^ 12099607899841L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (zu)k.k((short)var3, this, y[1], (short)var4, var5);
   }

   private final void x(long var1, zu var3) {
      var1 ^= b;
      long var10001 = var1 ^ 132147624335090L;
      int var4 = (int)((var1 ^ 132147624335090L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      k.P(this, var4, y[1], (short)var5, var3, (short)var6);
   }

   private final zu A(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 55930384516884L;
      int var3 = (int)((var1 ^ 55930384516884L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (zu)e.k((short)var3, this, y[2], (short)var4, var5);
   }

   private final void K(zu var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 23036269219691L;
      int var4 = (int)((var2 ^ 23036269219691L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      e.P(this, var4, y[2], (short)var5, var1, (short)var6);
   }

   private final up i(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 41028417209528L;
      int var3 = (int)((var1 ^ 41028417209528L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (up)d.k((short)var3, this, y[3], (short)var4, var5);
   }

   private final void B(up var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 105968666628537L;
      int var4 = (int)((var2 ^ 105968666628537L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      d.P(this, var4, y[3], (short)var5, var1, (short)var6);
   }

   private final String J(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 55938768940211L;
      int var3 = (int)((var1 ^ 55938768940211L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (String)J.k((short)var3, this, y[4], (short)var4, var5);
   }

   private final void T(String var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 68390402493990L;
      int var4 = (int)((var2 ^ 68390402493990L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      J.P(this, var4, y[4], (short)var5, var1, (short)var6);
   }

   public void n(long var1) {
      long var3 = var1 ^ 136820427682848L;
      int[] var10000 = -6736904475681974452L.A<invokedynamic>(-6736904475681974452L, var1);
      Y = this.W(var3, I);
      g = this.W(var3, n);
      int[] var5 = var10000;

      try {
         if (var5 == null) {
            (new int[1]).A<invokedynamic>(new int[1], -6722001632793894643L, var1);
         }

      } catch (NoWhenBranchMatchedException var6) {
         throw var6.A<invokedynamic>(var6, -6715773649004327565L, var1);
      }
   }

   @Flow
   private final void a(TickEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void A(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   private final void O(long param1, String param3, List param4) {
      // $FF: Couldn't be decompiled
   }

   private final List W(long param1, File param3) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit u() {
      // $FF: Couldn't be decompiled
   }

   private static final Unit G() {
      // $FF: Couldn't be decompiled
   }

   private static final boolean H() {
      long var0 = b ^ 87901236738662L;
      long var2 = var0 ^ 97111776463875L;

      boolean var10000;
      try {
         if (C.i(var2) == up.WHISPERS) {
            var10000 = true;
            return var10000;
         }
      } catch (NoWhenBranchMatchedException var4) {
         throw var4.A<invokedynamic>(var4, -3144435795257361437L, var0);
      }

      var10000 = false;
      return var10000;
   }

   static {
      long var20 = b ^ 109301611192476L;
      long var22 = var20 ^ 30824300119017L;
      long var24 = var20 ^ 113439537320699L;
      long var26 = var20 ^ 2356124346531L;
      long var28 = var20 ^ 35995502449722L;
      long var30 = var20 ^ 92362696210785L;
      long var10001 = var20 ^ 103626966228814L;
      int var32 = (int)((var20 ^ 103626966228814L) >>> 56);
      int var33 = (int)(var10001 << 8 >>> 32);
      int var34 = (int)(var10001 << 40 >>> 40);
      i = new HashMap(13);
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
      String var15 = "ùå\u000bÆ\u000bõNõl\b\u0096Ê§y\bÉ\nT!Ñ\u0094ðåß\u008b¨:Î¥8_\u0002<Ö\u0014äß´ú\f\u009aQ#ÒéÛý\u008fpô;ÆyW´ô\u0010\u0003§.a¸Ñ\u008b÷56\u0011\u0084e¤Ë\u0005H\u008e¶ã.Íb=é¯ÉR\u001a\u0093î^\u0011\u0094ÈM«I!íFï=îé!8®[h*W\b¶Ò\u009a\u0011cõ\u0096Åð\u009fò#\u001c\u0004åSÇö²\u0000f\u0098B\u0081\"ùÜ{SÐ\u008cº' 0k\u0010raÿÙä±æÏ§àãÎ@HÆ8 \"\bkmÀX§\u0087©\u0088³-0\u009c4Ø!©N\u0090\u0086÷ «\u007f\u0005ü)Ik{4 ÒFº-ú\u0099*\u0093½¿ô|æÙ\u0083H\u000em¦î,Ã½¼ \u008aS/Ïñ@\u0001 f¹®Ó]¦\u0085äÁ\u009ePG\u0002/Îå¤\u000e©å\u0012Éi<£\u0016\u00adbâ¤j´\u0010ß5\u0016V\u0097KCa¬_\u0090¿nîË¸\u0010¥Ù\u008fÆ\u0081¶\u00adþwá×\u0095¶|MÃ8MóÜn\bfvM´f\u001a`Â¹vå6zõ-O¾¿w\u0012#\u0090\u008a÷ß K®j\u009a}/ÔKË¾'fÀØÛÖ\u0011e«Û_Ïy«= ÷\u009a\u0088{\u00adË®\u0018b:¬5è\u009c\u0017\u0001í\u008f\u009eJ\u0096Ý*Ä4p¼S\u0014Ò\u00846\u0010àØÆ¸«×ÙÎ\u0001\u0098Ù:\u008b$ý` Úà\u0011Í\u0015t\u008e\u001aÿ$ÿ\u000e\u0000ÌS\u0099µö\u009bdÞ]òË¹l\u000fà`¶@¹ \u000fiäªw\u0003\u0091Æ&@\u0087q)Ê\u008c¾\n5Ö©å3±[ó\u000bçãÓ3iâ(h\u0091\u0001\u0002:Ë\u009b£¤W?\u0010\u0019\u0005\u0097B·\u001fÞQ÷ùä¶\u0011ÀWÕGgÄªf{WëW¡cä\u0010÷æ\u0017uöv7ì²-)>¥Jÿ\u0007 \u000fN\u009c\u000f\u009c6UßtS\u0095\"Ëz#\u0093º¶öÏb\u0094ýÂ^åMÿ¯sS\u00060\u0099Foù\u008aE\u0018g\u009fÕlmÐùf¹\u009d«Ê£h\u0085Ó5<ä5à¨ÉÌ+\u0087\u000f~ÂÝþmüÓP\u0087SÜþñ\u0019 #w-\u009d\u0088¦&Ç\u009fÂ«\u0081Q`1Ì¿\u008f\u009aÙ\n:\u001en\f¦\u0007[\u008b©_\b\u0010N16\u0083F²±pàè\u0086f\u0019·`¹@a\u009aIº\u0091¨Â¶Cù\u0087-À_eYëÊ\u001asÂV\u0001ßðË?{)\u0013±4tr\u008bý\u0087gu#%\u0018g5\\ vs\u009f\u001bñ\rÉ.\u000e\u0004©íÇJDª2\u0010 È\u001bBRßñ\u00989¢h¨\u0093Q¨b6\u0001\u008fÐ\u0005<ö)³Yº\u000e\u0099\u00962\\\u009a";
      int var17 = "ùå\u000bÆ\u000bõNõl\b\u0096Ê§y\bÉ\nT!Ñ\u0094ðåß\u008b¨:Î¥8_\u0002<Ö\u0014äß´ú\f\u009aQ#ÒéÛý\u008fpô;ÆyW´ô\u0010\u0003§.a¸Ñ\u008b÷56\u0011\u0084e¤Ë\u0005H\u008e¶ã.Íb=é¯ÉR\u001a\u0093î^\u0011\u0094ÈM«I!íFï=îé!8®[h*W\b¶Ò\u009a\u0011cõ\u0096Åð\u009fò#\u001c\u0004åSÇö²\u0000f\u0098B\u0081\"ùÜ{SÐ\u008cº' 0k\u0010raÿÙä±æÏ§àãÎ@HÆ8 \"\bkmÀX§\u0087©\u0088³-0\u009c4Ø!©N\u0090\u0086÷ «\u007f\u0005ü)Ik{4 ÒFº-ú\u0099*\u0093½¿ô|æÙ\u0083H\u000em¦î,Ã½¼ \u008aS/Ïñ@\u0001 f¹®Ó]¦\u0085äÁ\u009ePG\u0002/Îå¤\u000e©å\u0012Éi<£\u0016\u00adbâ¤j´\u0010ß5\u0016V\u0097KCa¬_\u0090¿nîË¸\u0010¥Ù\u008fÆ\u0081¶\u00adþwá×\u0095¶|MÃ8MóÜn\bfvM´f\u001a`Â¹vå6zõ-O¾¿w\u0012#\u0090\u008a÷ß K®j\u009a}/ÔKË¾'fÀØÛÖ\u0011e«Û_Ïy«= ÷\u009a\u0088{\u00adË®\u0018b:¬5è\u009c\u0017\u0001í\u008f\u009eJ\u0096Ý*Ä4p¼S\u0014Ò\u00846\u0010àØÆ¸«×ÙÎ\u0001\u0098Ù:\u008b$ý` Úà\u0011Í\u0015t\u008e\u001aÿ$ÿ\u000e\u0000ÌS\u0099µö\u009bdÞ]òË¹l\u000fà`¶@¹ \u000fiäªw\u0003\u0091Æ&@\u0087q)Ê\u008c¾\n5Ö©å3±[ó\u000bçãÓ3iâ(h\u0091\u0001\u0002:Ë\u009b£¤W?\u0010\u0019\u0005\u0097B·\u001fÞQ÷ùä¶\u0011ÀWÕGgÄªf{WëW¡cä\u0010÷æ\u0017uöv7ì²-)>¥Jÿ\u0007 \u000fN\u009c\u000f\u009c6UßtS\u0095\"Ëz#\u0093º¶öÏb\u0094ýÂ^åMÿ¯sS\u00060\u0099Foù\u008aE\u0018g\u009fÕlmÐùf¹\u009d«Ê£h\u0085Ó5<ä5à¨ÉÌ+\u0087\u000f~ÂÝþmüÓP\u0087SÜþñ\u0019 #w-\u009d\u0088¦&Ç\u009fÂ«\u0081Q`1Ì¿\u008f\u009aÙ\n:\u001en\f¦\u0007[\u008b©_\b\u0010N16\u0083F²±pàè\u0086f\u0019·`¹@a\u009aIº\u0091¨Â¶Cù\u0087-À_eYëÊ\u001asÂV\u0001ßðË?{)\u0013±4tr\u008bý\u0087gu#%\u0018g5\\ vs\u009f\u001bñ\rÉ.\u000e\u0004©íÇJDª2\u0010 È\u001bBRßñ\u00989¢h¨\u0093Q¨b6\u0001\u008fÐ\u0005<ö)³Yº\u000e\u0099\u00962\\\u009a".length();
      char var14 = '8';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var41 = var15.substring(var13, var13 + var14);
         byte var43 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var41.getBytes("ISO-8859-1"));
            String var49 = b(var19).intern();
            switch(var43) {
            case 0:
               var18[var16++] = var49;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  f = new String[24];
                  o = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[7];
                  int var3 = 0;
                  String var4 = "%1Há\"5\u000fbJ5¦»2}\u0000\u0084k\u0002ç\u0081\u009bÅ\u0087Tqu\u0083\u0092\u0084+\u0011I%d7I8\\ñÝ";
                  int var5 = "%1Há\"5\u000fbJ5¦»2}\u0000\u0084k\u0002ç\u0081\u009bÅ\u0087Tqu\u0083\u0092\u0084+\u0011I%d7I8\\ñÝ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var48 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
                     long[] var44 = var6;
                     var48 = var3++;
                     long var51 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var52 = -1;

                     while(true) {
                        long var8 = var51;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var54 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var52) {
                        case 0:
                           var44[var48] = var54;
                           if (var2 >= var5) {
                              l = var6;
                              m = new Integer[7];
                              KProperty[] var40 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(t6.class, true.c<invokedynamic>(11885, 2755884846099278768L ^ var20), true.c<invokedynamic>(24177, 7523462975193373628L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(t6.class, true.c<invokedynamic>(19121, 3547873106858594169L ^ var20), true.c<invokedynamic>(6824, 8494361506739822444L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(t6.class, true.c<invokedynamic>(14636, 2194488407029333221L ^ var20), true.c<invokedynamic>(26605, 7113264370967437876L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(t6.class, true.c<invokedynamic>(9530, 3786898849510793464L ^ var20), true.c<invokedynamic>(27940, 7427664119889619192L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(t6.class, true.c<invokedynamic>(11162, 6569690710014733905L ^ var20), true.c<invokedynamic>(374, 1198680944978461881L ^ var20), 0)))};
                              y = var40;
                              C = new t6(var24);
                              I = new File(kf.e(), true.c<invokedynamic>(24769, 944985105640776990L ^ var20));
                              n = new File(kf.e(), true.c<invokedynamic>(17670, 7368728707433971909L ^ var20));
                              il var46 = (il)C;
                              String var45 = 19706.c<invokedynamic>(19706, 5764868533495089469L ^ var20);
                              g0 var55 = new g0(var22, true.c<invokedynamic>(31239, 504359495455997916L ^ var20));
                              int var10005 = 8331.p<invokedynamic>(8331, 7401643966153587940L ^ var20);
                              Object var35 = null;
                              int var36 = var10005;
                              Object var37 = null;
                              Object var38 = null;
                              g0 var39 = var55;
                              R = qi.v(var46, var45, var30, var39, (pj)var38, (Function0)var37, var36, var35);
                              k = qi.w((il)C, true.c<invokedynamic>(17, 2224126046391731665L ^ var20), (byte)var32, t6::u, (pj)null, var33, (Function0)null, true.p<invokedynamic>(3608, 6763287683587953270L ^ var20), var34, (Object)null);
                              e = qi.w((il)C, true.c<invokedynamic>(10129, 5139314462463435337L ^ var20), (byte)var32, t6::G, (pj)null, var33, (Function0)null, true.p<invokedynamic>(3608, 6763287683587953270L ^ var20), var34, (Object)null);
                              d = qi.M((il)C, true.c<invokedynamic>(10025, 7892018223130485487L ^ var20), (Enum)up.GLOBAL, (pj)null, (Function0)null, true.p<invokedynamic>(3608, 6763287683587953270L ^ var20), (Object)null, var26);
                              J = qi.P((il)C, true.c<invokedynamic>(23971, 6802069480508774521L ^ var20), var28, true.c<invokedynamic>(24883, 2434413886380434669L ^ var20), (pj)null, t6::H, 4, (Object)null);
                              q = new iv();
                              g = CollectionsKt.emptyList();
                              Y = CollectionsKt.emptyList();
                              return;
                           }
                           break;
                        default:
                           var44[var48] = var54;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "úÃ®|\u0017¨¸Ð7\u0002\u008bÚW\u00ad=9";
                           var5 = "úÃ®|\u0017¨¸Ð7\u0002\u008bÚW\u00ad=9".length();
                           var2 = 0;
                        }

                        var48 = var2;
                        var2 += 8;
                        var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
                        var44 = var6;
                        var48 = var3++;
                        var51 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var52 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var49;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "Y®h\u0018è²Õ\u009dW\u0090±Õ'\f¯8è50\u0005\u007f²×±ò\u0006QeûMä½å\\@?BÀö\u008ep~î\u008e\u000bl5Å?\u001a%ñj\u0005\u00ad\u0018×ó\b>²\u0095f\u0090J,Ç\u0013î¤Y\u001b\u0005\u009fð»#Y\u001bõ\u0010\u0088×u{BäÈÛ\u009a'è£Ø)À¼";
               var17 = "Y®h\u0018è²Õ\u009dW\u0090±Õ'\f¯8è50\u0005\u007f²×±ò\u0006QeûMä½å\\@?BÀö\u008ep~î\u008e\u000bl5Å?\u001a%ñj\u0005\u00ad\u0018×ó\b>²\u0095f\u0090J,Ç\u0013î¤Y\u001b\u0005\u009fð»#Y\u001bõ\u0010\u0088×u{BäÈÛ\u009a'è£Ø)À¼".length();
               var14 = 'P';
               var13 = -1;
            }

            ++var13;
            var41 = var15.substring(var13, var13 + var14);
            var43 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2621;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/t6", var10);
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
         throw new RuntimeException("su/catlean/t6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21407;
      if (m[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = l[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/t6", var14);
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
         throw new RuntimeException("su/catlean/t6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
