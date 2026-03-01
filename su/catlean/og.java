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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class og extends k9 {
   @NotNull
   public static final og V;
   static final KProperty[] L;
   @NotNull
   private static final z0 q;
   @NotNull
   private static final zr J;
   @NotNull
   private static final zo r;
   @NotNull
   private static final zo M;
   @NotNull
   private static final zo P;
   @NotNull
   private static final zo X;
   @NotNull
   private static final z0 x;
   private static int T;
   private static final long b = j0.a(-1409433291916452297L, 5649164407051074506L, MethodHandles.lookup().lookupClass()).a(94961937142448L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private og(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 105186190841372L;
      super(var3, true.v<invokedynamic>(24101, 6669382605228711834L ^ var1), pa.Q(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final int L(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 117285625700351L;
      int var3 = (int)((var1 ^ 117285625700351L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)q.k((short)var3, this, L[0], (short)var4, var5)).intValue();
   }

   private final gv i(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 54969841631779L;
      int var3 = (int)((var1 ^ 54969841631779L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (gv)J.k((short)var3, this, L[1], (short)var4, var5);
   }

   private final boolean k(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 48056482961550L;
      int var3 = (int)((var1 ^ 48056482961550L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)r.k((short)var3, this, L[2], (short)var4, var5);
   }

   private final boolean V(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 7584806150873L;
      int var3 = (int)((var1 ^ 7584806150873L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)M.k((short)var3, this, L[3], (short)var4, var5);
   }

   private final boolean d(short var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
      long var10001 = var4 ^ 115542871258696L;
      int var6 = (int)((var4 ^ 115542871258696L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)P.k((short)var6, this, L[4], (short)var7, var8);
   }

   private final boolean r(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 1128526870864L;
      int var3 = (int)((var1 ^ 1128526870864L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)X.k((short)var3, this, L[5], (short)var4, var5);
   }

   private final int v(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 106086493486760L;
      int var3 = (int)((var1 ^ 106086493486760L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)x.k((short)var3, this, L[true.q<invokedynamic>(12284, 4206278142996748274L ^ var1)], (short)var4, var5)).intValue();
   }

   @Flow
   private final void m(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void X(AfterSendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean m() {
      long var0 = b ^ 19090151899538L;
      long var2 = var0 ^ 8907444939713L;
      return V.k(var2);
   }

   private static final boolean S() {
      long var0 = b ^ 16462792148236L;
      long var2 = var0 ^ 67138503528065L;
      return V.r(var2);
   }

   private static final boolean S(class_1799 var0) {
      long var1 = b ^ 15167486253321L;
      Intrinsics.checkNotNullParameter(var0, true.v<invokedynamic>(14900, 7263125675073510179L ^ var1));
      return Intrinsics.areEqual((Object)var0.method_7909(), (Object)class_1802.field_49814);
   }

   private static final boolean v(class_1799 param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean p(class_1799 param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean o(class_1799 param0) {
      // $FF: Couldn't be decompiled
   }

   private static final void P(s1 var0, class_1297 var1) {
      long var2 = b ^ 130072534265551L;
      long var4 = var2 ^ 85739751716284L;
      long var6 = var2 ^ 38818784335900L;
      long var10001 = var2 ^ 133824665116346L;
      int var8 = (int)((var2 ^ 133824665116346L) >>> 56);
      int var9 = (int)(var10001 << 8 >>> 32);
      int var10 = (int)(var10001 << 40 >>> 40);
      dk.I.W((byte)var8, var0.I(), var9, var10);
      s8.r(var4).method_2918((class_1657)s8.f(var6), var1);
      s8.f(var6).method_6104(class_1268.field_5808);
   }

   private static final void q(int var0) {
      long var1 = b ^ 2049276806837L;
      long var10001 = var1 ^ 15562931041984L;
      int var3 = (int)((var1 ^ 15562931041984L) >>> 56);
      int var4 = (int)(var10001 << 8 >>> 32);
      int var5 = (int)(var10001 << 40 >>> 40);
      dk.I.W((byte)var3, var0, var4, var5);
   }

   static {
      long var20 = b ^ 58719237495969L;
      long var22 = var20 ^ 133203822249502L;
      long var24 = var20 ^ 119228061863723L;
      long var26 = var20 ^ 103753721153752L;
      long var28 = var20 ^ 66050604372417L;
      e = new HashMap(13);
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
      String var15 = "!J\u0090²\u008fÎwÂ\u0013èaÚ¿\u0002j_ Ç-\\\u0093\u0089¯¦\u008f\u000e8rÕïÖâ\u000e\u0088n·CØøFBâ\u0016J\u001cñ#\u0096%\u0010(\u0087>Iz(\u0007ûOÝ\n·\u00ad;ñV ¹\nÇ%\u0004\"\u008cá$#tå\u000b\f§ÉB\u0086øÿ\u0015á#,ÃU×·Þa¾ö8n\u008a\u009dn1ü\u0088è,¿&¥A\u009c;\u0016Ò\u0010\u0098\u001fÛ(øK¢\u001aÈDÿ\u0015\u0013Cõ'ú\u000b(\u0013Ü±\u0093\fØËD# f\u008cîÆdÅËÜ4\u0010\u0011>7{¦\u001b÷x\b\u0094W\u0096p\u0083¼m\u0018÷_3ê\f\u0002FÍÙ²^£¥ãU\u0011\n7@\u00030QOÎ\u0010CK\u0000É_¼ \u008b\u001fã\u001f¢ø\u0015«\u0096\u0010\u0091\u0080\u0012tlk;\u0091G=\u001bdÌ\b÷³0 \u001fh\u008cò5'9\u0003^aê(¢uÝë\u0089\tòxÙú\r[\u0090\u001cÅß\u0085< AO£û+òV!¡\u0090ôÄ\u0094\u000fÖ¢\u0018\u001dkøÂ\u001f½Ü&GpÛ\u001eÈ÷v/P\u008e¿¸>^rË \u008fæûfÍf\u0095ÊTEv?MìePÃ-\u0086¥\u0098FcpÉ°ýÛ#¾¶$ &'ÈØ\u008fú5\u008e ÷\u0088\u008dq\u008fc¿-n\u0002*>\u0013£\u0010üaxiÈ¥[6\u0010B\u0019,)\u008e\u0014\u0016c\u001c¬7¢\u009ceÅP\u0010\u0013\u009c\u001e\u009f\u0018Ë\u0019\u008eâ¨z±o7ù\u0001\u0018£[§aâe.öjTYk\tZ\u0005ßôa\u009c\u0005(Da\u008c\u0010çÓõ®\u0013\u009b\u0007l\u007f\u000fÎzKy\u008bs\u0010¨Ïò\"]á\u001fd`-Ít\u009fà}S(\u000b\u009f\u0082w>©ô\u008fw\u00998ä\u009biUî@\u0005\u009eºãµ\"\u0084¢BvP1ü+\u0084\u0082ó\u009a\"\u0086Y\u0012ê\u0018\u0086\u008f°\u008f\u0086Á¤\ní\u001e\u0080m¤TÝù(à#\u0000\u001aù¡$0HB\u0013âPp&Óòa\u0092\u0007À%¹\u0097\u0004ë\u0087Ì´wÍ6:\u0015ãN`BÂ\u0088iË)ÎÙ\u0096\u001c½Ä¬\u0016D{a°Þ\u0018WG?+%/Ê9¼Ô\u0015K'F\u009b'u\u0006íH\u009fN¤Ü\u00187P\u0089¢ýx/V\u008aeéd\u000fÇ4ÿû\u0090#q\u009b\u0005\u0085\u0080\u0010åU·Ç[Àî\u00967¹ì´\n6+É éG\u0012\u009aKM©\u0019\u0012r<\u0098¥ã}0âRé(\fè#\u000eJK7ÀD\u007fF¡";
      int var17 = "!J\u0090²\u008fÎwÂ\u0013èaÚ¿\u0002j_ Ç-\\\u0093\u0089¯¦\u008f\u000e8rÕïÖâ\u000e\u0088n·CØøFBâ\u0016J\u001cñ#\u0096%\u0010(\u0087>Iz(\u0007ûOÝ\n·\u00ad;ñV ¹\nÇ%\u0004\"\u008cá$#tå\u000b\f§ÉB\u0086øÿ\u0015á#,ÃU×·Þa¾ö8n\u008a\u009dn1ü\u0088è,¿&¥A\u009c;\u0016Ò\u0010\u0098\u001fÛ(øK¢\u001aÈDÿ\u0015\u0013Cõ'ú\u000b(\u0013Ü±\u0093\fØËD# f\u008cîÆdÅËÜ4\u0010\u0011>7{¦\u001b÷x\b\u0094W\u0096p\u0083¼m\u0018÷_3ê\f\u0002FÍÙ²^£¥ãU\u0011\n7@\u00030QOÎ\u0010CK\u0000É_¼ \u008b\u001fã\u001f¢ø\u0015«\u0096\u0010\u0091\u0080\u0012tlk;\u0091G=\u001bdÌ\b÷³0 \u001fh\u008cò5'9\u0003^aê(¢uÝë\u0089\tòxÙú\r[\u0090\u001cÅß\u0085< AO£û+òV!¡\u0090ôÄ\u0094\u000fÖ¢\u0018\u001dkøÂ\u001f½Ü&GpÛ\u001eÈ÷v/P\u008e¿¸>^rË \u008fæûfÍf\u0095ÊTEv?MìePÃ-\u0086¥\u0098FcpÉ°ýÛ#¾¶$ &'ÈØ\u008fú5\u008e ÷\u0088\u008dq\u008fc¿-n\u0002*>\u0013£\u0010üaxiÈ¥[6\u0010B\u0019,)\u008e\u0014\u0016c\u001c¬7¢\u009ceÅP\u0010\u0013\u009c\u001e\u009f\u0018Ë\u0019\u008eâ¨z±o7ù\u0001\u0018£[§aâe.öjTYk\tZ\u0005ßôa\u009c\u0005(Da\u008c\u0010çÓõ®\u0013\u009b\u0007l\u007f\u000fÎzKy\u008bs\u0010¨Ïò\"]á\u001fd`-Ít\u009fà}S(\u000b\u009f\u0082w>©ô\u008fw\u00998ä\u009biUî@\u0005\u009eºãµ\"\u0084¢BvP1ü+\u0084\u0082ó\u009a\"\u0086Y\u0012ê\u0018\u0086\u008f°\u008f\u0086Á¤\ní\u001e\u0080m¤TÝù(à#\u0000\u001aù¡$0HB\u0013âPp&Óòa\u0092\u0007À%¹\u0097\u0004ë\u0087Ì´wÍ6:\u0015ãN`BÂ\u0088iË)ÎÙ\u0096\u001c½Ä¬\u0016D{a°Þ\u0018WG?+%/Ê9¼Ô\u0015K'F\u009b'u\u0006íH\u009fN¤Ü\u00187P\u0089¢ýx/V\u008aeéd\u000fÇ4ÿû\u0090#q\u009b\u0005\u0085\u0080\u0010åU·Ç[Àî\u00967¹ì´\n6+É éG\u0012\u009aKM©\u0019\u0012r<\u0098¥ã}0âRé(\fè#\u000eJK7ÀD\u007fF¡".length();
      char var14 = 16;
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
                  c = var18;
                  d = new String[27];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[8];
                  int var3 = 0;
                  String var4 = "qÿI´F?R-\u0010aÈ½à¦A£\u0018Õªä!»ç8\u0095\u0019wá\u001e\u001e2ÖççY»u\u0095\tú·È@\u0001æª¯è";
                  int var5 = "qÿI´F?R-\u0010aÈ½à¦A£\u0018Õªä!»ç8\u0095\u0019wá\u001e\u001e2ÖççY»u\u0095\tú·È@\u0001æª¯è".length();
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
                              f = var6;
                              g = new Integer[8];
                              KProperty[] var30 = new KProperty[true.q<invokedynamic>(20903, 8078955600359476647L ^ var20)];
                              var30[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(og.class, true.v<invokedynamic>(27788, 5928785250596014140L ^ var20), true.v<invokedynamic>(21907, 693013498996420910L ^ var20), 0)));
                              var30[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(og.class, true.v<invokedynamic>(13601, 5612114431555277187L ^ var20), true.v<invokedynamic>(32116, 3118900791565408706L ^ var20), 0)));
                              var30[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(og.class, true.v<invokedynamic>(16409, 3848820802025677987L ^ var20), true.v<invokedynamic>(17923, 6098104280136540841L ^ var20), 0)));
                              var30[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(og.class, true.v<invokedynamic>(22174, 8076574402530505254L ^ var20), true.v<invokedynamic>(17195, 1501878882778113923L ^ var20), 0)));
                              var30[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(og.class, true.v<invokedynamic>(17481, 2939898110864711927L ^ var20), true.v<invokedynamic>(26391, 9004993742303970212L ^ var20), 0)));
                              var30[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(og.class, true.v<invokedynamic>(12534, 8756569262889178199L ^ var20), true.v<invokedynamic>(19199, 6102036428304379487L ^ var20), 0)));
                              var30[true.q<invokedynamic>(14644, 6081981816639366454L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(og.class, true.v<invokedynamic>(11190, 8132620963613773583L ^ var20), true.v<invokedynamic>(25991, 6996708584932950316L ^ var20), 0)));
                              L = var30;
                              V = new og(var28);
                              q = qi.o((il)V, true.v<invokedynamic>(7551, 3742792866952853965L ^ var20), 0, new IntRange(0, 5), var22, (pj)null, (Function0)null, true.q<invokedynamic>(31206, 8116648703448507872L ^ var20), (Object)null);
                              J = qi.M((il)V, true.v<invokedynamic>(15579, 3361321243962251372L ^ var20), (Enum)gv.ANY, (pj)null, (Function0)null, true.q<invokedynamic>(9479, 6550606761914906880L ^ var20), (Object)null, var24);
                              r = qi.R((il)V, true.v<invokedynamic>(18831, 1173381080157023532L ^ var20), true, (pj)null, (Function0)null, true.q<invokedynamic>(10013, 3441535981074725656L ^ var20), var26, (Object)null);
                              M = qi.R((il)V, true.v<invokedynamic>(26640, 5230178904843340982L ^ var20), true, (pj)null, og::m, 4, var26, (Object)null);
                              P = qi.R((il)V, true.v<invokedynamic>(2135, 2657722241930276070L ^ var20), true, (pj)null, (Function0)null, true.q<invokedynamic>(10013, 3441535981074725656L ^ var20), var26, (Object)null);
                              X = qi.R((il)V, true.v<invokedynamic>(1333, 4883334263426392449L ^ var20), true, (pj)null, (Function0)null, true.q<invokedynamic>(10013, 3441535981074725656L ^ var20), var26, (Object)null);
                              x = qi.o((il)V, true.v<invokedynamic>(19294, 1298137555870609381L ^ var20), 4, new IntRange(1, true.q<invokedynamic>(24833, 7206238824132934912L ^ var20)), var22, (pj)null, og::S, true.q<invokedynamic>(10309, 7629006688168981569L ^ var20), (Object)null);
                              T = -1;
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "½FY\u000b©&MyT\fÇý\u0012Þ%J";
                           var5 = "½FY\u000b©&MyT\fÇý\u0012Þ%J".length();
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

               var15 = "½Ç±\u009bÏûtríhtEÃVrwÐ¤\u0016î\u0094\u0089¨\u009a\"\u0096\\eþíWAx\u0091>\u0082-Qëd(².ÿó±2>\u0081t\u0012\u0099ZÛÄ\u000b\u0080ú\u009d×ØêvL,SË\u0004WÚ\u0002\u001a\u0096'Ï¤ëoZ4h";
               var17 = "½Ç±\u009bÏûtríhtEÃVrwÐ¤\u0016î\u0094\u0089¨\u009a\"\u0096\\eþíWAx\u0091>\u0082-Qëd(².ÿó±2>\u0081t\u0012\u0099ZÛÄ\u000b\u0080ú\u009d×ØêvL,SË\u0004WÚ\u0002\u001a\u0096'Ï¤ëoZ4h".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3274;
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
            throw new RuntimeException("su/catlean/og", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/og" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13432;
      if (g[var3] == null) {
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
            throw new RuntimeException("su/catlean/og", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/og" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
