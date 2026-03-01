package su.catlean;

import java.awt.Color;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_636;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.InteractionManagerAccessor;

public final class l3 extends k9 {
   @NotNull
   public static final l3 o;
   static final KProperty[] B;
   @NotNull
   private static final zo g;
   @NotNull
   private static final zr I;
   @NotNull
   private static final zv w;
   @NotNull
   private static final zv z;
   @NotNull
   private static final zv M;
   private static float k;
   private static float O;
   @NotNull
   private static final CopyOnWriteArrayList d;
   private static final long b = j0.a(5943248804556705186L, 5461376701648549313L, MethodHandles.lookup().lookupClass()).a(76150045179686L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;
   private static final long[] i;
   private static final Integer[] l;
   private static final Map m;

   private l3(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 78259283564120L;
      super(var3, true.x<invokedynamic>(18569, 6049560444143694973L ^ var1), pa.W(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean u(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 118519759590501L;
      int var3 = (int)((var1 ^ 118519759590501L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)g.k((short)var3, this, B[0], (short)var4, var5);
   }

   private final i2 v(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 133001438948482L;
      int var3 = (int)((var1 ^ 133001438948482L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (i2)I.k((short)var3, this, B[1], (short)var4, var5);
   }

   private final Color m(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 139627239678721L;
      int var3 = (int)((var1 ^ 139627239678721L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)w.k((short)var3, this, B[2], (short)var4, var5);
   }

   private final Color A(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 8608627322233L;
      int var3 = (int)((var1 ^ 8608627322233L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)z.k((short)var3, this, B[3], (short)var4, var5);
   }

   private final Color C(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 19931824055734L;
      int var3 = (int)((var1 ^ 19931824055734L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)M.k((short)var3, this, B[4], (short)var4, var5);
   }

   @Flow
   private final void z(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void h(PlayerUpdateEvent var1) {
      long var2 = b ^ 26193108999521L;
      long var4 = var2 ^ 94286880583639L;
      d.removeIf(l3::p);
      O = k;
      class_636 var10000 = s8.r(var4);
      Intrinsics.checkNotNull(var10000, true.x<invokedynamic>(10837, 4838222180720630752L ^ var2));
      k = ((InteractionManagerAccessor)var10000).getCurBlockDamageMP();
   }

   @Flow
   public final void L(@NotNull Render3DEvent e) {
      // $FF: Couldn't be decompiled
   }

   private final void D(class_2338 var1, float var2, long var3) {
      var3 ^= b;
      long var5 = var3 ^ 140418331859370L;
      long var7 = var3 ^ 84451960764454L;
      long var9 = var3 ^ 59265636562526L;
      long var11 = var3 ^ 88909481420659L;
      long var10001 = var3 ^ 20829092746014L;
      int var13 = (int)((var3 ^ 20829092746014L) >>> 32);
      int var14 = (int)(var10001 << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      long var16 = var3 ^ 22348759593016L;
      long var18 = var3 ^ 128046316585207L;
      long var20 = var3 ^ 35262693408401L;
      long var22 = var3 ^ 4557168839124L;
      class_238 var24 = this.n(var1, var22, var2);
      q1.Y(q1.A, var24, gk.E.c(var5, this.m(var7), this.A(var9), var2), (Color)null, 4, (Object)null, var16);
      q1.B(q1.A, var24, gk.E.e(var11, gk.E.c(var5, this.m(var7), this.A(var9), var2), 1.0F), (Color)null, 4, (Object)null, var18);
      q1 var10000 = q1.A;
      String var25 = (int)(var2 * (float)true.b<invokedynamic>(8953, 781810549594709688L ^ var3)) + "%";
      class_243 var10002 = var24.method_1005();
      Intrinsics.checkNotNullExpressionValue(var10002, true.x<invokedynamic>(26730, 2993074505570807115L ^ var3));
      q1.Q(var10000, var25, var10002, var13, this.C(var20), 0.0F, (char)var14, 0.0F, (short)var15, false, (fc)null, true.b<invokedynamic>(15954, 1040223764733968916L ^ var3), (Object)null);
   }

   private final class_238 n(class_2338 var1, long var2, float var4) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean K(zp var0) {
      long var1 = b ^ 46740910243558L;
      long var3 = var1 ^ 12249083809936L;
      return var0.w(var3);
   }

   private static final boolean p(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = b ^ 97551201718961L;
      long var22 = var20 ^ 132031036319998L;
      long var24 = var20 ^ 81527722684173L;
      long var26 = var20 ^ 80583929290645L;
      long var28 = var20 ^ 136801015878191L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[21];
      int var16 = 0;
      String var15 = "+ðný_Í\u0082 f\fsquñL\u007fÄ¡\u0005\u009d¯*tD\u00061\u000b§ÉeåExs\r|f2þ\u008b\u0010*ÓÐ\u0094à\u0010\u0007\u0080OZ\u0090¹©\u008a\u008fÂV\u0017\\\t&¼\u0099|pê\u0006\u0096y\u00034\u0088G\u009còÿ|Ã®·M+X\u008f\u0010\u0088 \u001bY\u0016_\u0081âuKãK\rGõ¯Ð·j\u001fL\u00182\u0016Ñ~¹ú¥u-:\u0019\u0016Äe\u0090\u007f\u0017¿\u007fúødB\u0085ÐþÈ×^ø\u008cdï*\u0086F±L\u0095%úKP )mß£P¸í\u009cKîwNð±%!øH\n\u0004\u001eï\u0013Èì\u0010\u0080bï¶|Ý$×ú\u000bü5ÔhV\u00888Ó¶P\bÄÏ\u0012þôÏW\u0080kV@F\u0093B»Îç\u0081\"-Þû7¢å\u009f\u008a5i\u0098\u0087\u001e°\u009a\u0080î\flËfâ\u0090\u0014½\u000f¹\u0095á \rê\u0080\u0018É²¤Æ\u008d\u0014\n>\u007fUdï\u001a`äÚ-F\u0012\u0017x\u008bC\u0083\u00103ÌKV\u0000\u0007ØþôµÚ\u0091\u000fü\u008b?\u0018óÅ§wÄ\u0004x\u0088\u0095Û\\\u0083Ó\u0016Ì\u0017/\u0093&×Î]\u0099\u0010\u0018\u009c\u008c\u000e\u0002Q\u0014±\u008d\u0081\u0013\u009b¾îB®Wªk½ÌºÐMU\u0010\u0017¶>\u000e:¦\u008d3[ºÔÙq\u0090ãs\u0098ÒL\u008d\u008f¡ð\u0014\u0081î\u000f\u009cG¸\u009dQ¤à\"\u007fÖ\u0083ß»\u0081½@A\t/nô\u009fj¬n\u009cË³J\u0090ÃS<_5\u00979\u0096&Üÿáè\u0014 \u0019ÛÛ2\u0090\u0089ç\u0087ñ=\u0097VM\u0096p+\u0011³\u009a\u0091õ\u0080ýàay\u0094E\u0082³O\u0082©\u009fQ<|Y\u001f\båÛ$/\u0019&l\u0095o\u0000Ý\u0005?ÂÕÎ\u0016ÇõÝ»'\fzLß\u009fg¦9 \u0005¸ë¡\u0011´w\u0011\u0003P½tq©<\u0006\u0016\u008d~\u00072º~\u001a\u0002x(4V7Þã8\u0019û\fjó\u001d!\u001bf» \u0013pgãu\u008by\u009a\u008eÖ&K\u0080É2F\b\u0083\u0004Z¦Lü\u0018\u0017;ã\u0015U\u008b\u0000W:I\u0082ø?2Ñö\u001eÕÝð*RªÞ\u0010Y´ýL\u008c\u008dPª,\u008aì\u008b\u000e>\u008cÔ\u0018\u0082\bBêÀ\u0088ÊE60\u0093ª<\u001ap\u001fø\u008b?}óÔ²[0¡Ú»0î\u0092\u001a¸M\u0084la\u000f\t§,\u0003Crûzw,á'Ìzap8Ú¸Ó$Oÿc\f¹Ú\u0090Æ¯]|q\u001f\u0093\u0010t`@Öb\u0003Zß\u008aß\u009c\u0082[\u0082ª\u00008æd+®q\u0012ö;^\u0090H\u0082ü\u0018II\u0002.ân¹ã%ñ\\×ß>DC\t\u001eÔ¬\u009f\u0014÷¸óF:\u000e\u0019øÄ¥¡éY\u0006ÀG´É\u0012\t \u0012\u001e\u001føÆ\tûÚ\u009d\u0015\u0017^\u000fç\u009fp¼F\u009cÎ\u0090ä¥Êa\u0088\u001d!^§ùº\u0018\u009cE\u0005\u0096\u0093Íä\u0015¯ûf\u0082dUÔã{þ\bêíf\u0011\u0003";
      int var17 = "+ðný_Í\u0082 f\fsquñL\u007fÄ¡\u0005\u009d¯*tD\u00061\u000b§ÉeåExs\r|f2þ\u008b\u0010*ÓÐ\u0094à\u0010\u0007\u0080OZ\u0090¹©\u008a\u008fÂV\u0017\\\t&¼\u0099|pê\u0006\u0096y\u00034\u0088G\u009còÿ|Ã®·M+X\u008f\u0010\u0088 \u001bY\u0016_\u0081âuKãK\rGõ¯Ð·j\u001fL\u00182\u0016Ñ~¹ú¥u-:\u0019\u0016Äe\u0090\u007f\u0017¿\u007fúødB\u0085ÐþÈ×^ø\u008cdï*\u0086F±L\u0095%úKP )mß£P¸í\u009cKîwNð±%!øH\n\u0004\u001eï\u0013Èì\u0010\u0080bï¶|Ý$×ú\u000bü5ÔhV\u00888Ó¶P\bÄÏ\u0012þôÏW\u0080kV@F\u0093B»Îç\u0081\"-Þû7¢å\u009f\u008a5i\u0098\u0087\u001e°\u009a\u0080î\flËfâ\u0090\u0014½\u000f¹\u0095á \rê\u0080\u0018É²¤Æ\u008d\u0014\n>\u007fUdï\u001a`äÚ-F\u0012\u0017x\u008bC\u0083\u00103ÌKV\u0000\u0007ØþôµÚ\u0091\u000fü\u008b?\u0018óÅ§wÄ\u0004x\u0088\u0095Û\\\u0083Ó\u0016Ì\u0017/\u0093&×Î]\u0099\u0010\u0018\u009c\u008c\u000e\u0002Q\u0014±\u008d\u0081\u0013\u009b¾îB®Wªk½ÌºÐMU\u0010\u0017¶>\u000e:¦\u008d3[ºÔÙq\u0090ãs\u0098ÒL\u008d\u008f¡ð\u0014\u0081î\u000f\u009cG¸\u009dQ¤à\"\u007fÖ\u0083ß»\u0081½@A\t/nô\u009fj¬n\u009cË³J\u0090ÃS<_5\u00979\u0096&Üÿáè\u0014 \u0019ÛÛ2\u0090\u0089ç\u0087ñ=\u0097VM\u0096p+\u0011³\u009a\u0091õ\u0080ýàay\u0094E\u0082³O\u0082©\u009fQ<|Y\u001f\båÛ$/\u0019&l\u0095o\u0000Ý\u0005?ÂÕÎ\u0016ÇõÝ»'\fzLß\u009fg¦9 \u0005¸ë¡\u0011´w\u0011\u0003P½tq©<\u0006\u0016\u008d~\u00072º~\u001a\u0002x(4V7Þã8\u0019û\fjó\u001d!\u001bf» \u0013pgãu\u008by\u009a\u008eÖ&K\u0080É2F\b\u0083\u0004Z¦Lü\u0018\u0017;ã\u0015U\u008b\u0000W:I\u0082ø?2Ñö\u001eÕÝð*RªÞ\u0010Y´ýL\u008c\u008dPª,\u008aì\u008b\u000e>\u008cÔ\u0018\u0082\bBêÀ\u0088ÊE60\u0093ª<\u001ap\u001fø\u008b?}óÔ²[0¡Ú»0î\u0092\u001a¸M\u0084la\u000f\t§,\u0003Crûzw,á'Ìzap8Ú¸Ó$Oÿc\f¹Ú\u0090Æ¯]|q\u001f\u0093\u0010t`@Öb\u0003Zß\u008aß\u009c\u0082[\u0082ª\u00008æd+®q\u0012ö;^\u0090H\u0082ü\u0018II\u0002.ân¹ã%ñ\\×ß>DC\t\u001eÔ¬\u009f\u0014÷¸óF:\u000e\u0019øÄ¥¡éY\u0006ÀG´É\u0012\t \u0012\u001e\u001føÆ\tûÚ\u009d\u0015\u0017^\u000fç\u009fp¼F\u009cÎ\u0090ä¥Êa\u0088\u001d!^§ùº\u0018\u009cE\u0005\u0096\u0093Íä\u0015¯ûf\u0082dUÔã{þ\bêíf\u0011\u0003".length();
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
                  c = var18;
                  e = new String[21];
                  m = new HashMap(13);
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
                  String var4 = "·$\u008c\u0007,þåûpØà9Ql<¶!ÄZL\\þhÃd\u0019,\u008fË\u0083W\u0087\u0016¨ë°\r\u0091>\u000b4ÃøÚ\u00adÔ\u001bQ";
                  int var5 = "·$\u008c\u0007,þåûpØà9Ql<¶!ÄZL\\þhÃd\u0019,\u008fË\u0083W\u0087\u0016¨ë°\r\u0091>\u000b4ÃøÚ\u00adÔ\u001bQ".length();
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
                              i = var6;
                              l = new Integer[8];
                              KProperty[] var30 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l3.class, true.x<invokedynamic>(30501, 6357881892778625357L ^ var20), true.x<invokedynamic>(30699, 3116584480494045580L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l3.class, true.x<invokedynamic>(7858, 6933835110277226716L ^ var20), true.x<invokedynamic>(28163, 4336356267614392417L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l3.class, true.x<invokedynamic>(18490, 3127235712457635397L ^ var20), true.x<invokedynamic>(11583, 4188614267773096771L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l3.class, true.x<invokedynamic>(26425, 1419578278431545665L ^ var20), true.x<invokedynamic>(12868, 8092780893117451304L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l3.class, true.x<invokedynamic>(28313, 6658596676134785264L ^ var20), true.x<invokedynamic>(18897, 7248690747206596542L ^ var20), 0)))};
                              B = var30;
                              o = new l3(var26);
                              g = qi.R((il)o, true.x<invokedynamic>(20619, 2223547706729524981L ^ var20), true, (pj)null, (Function0)null, true.b<invokedynamic>(6825, 667139391425240482L ^ var20), var24, (Object)null);
                              I = qi.M((il)o, true.x<invokedynamic>(31763, 9156608797314957943L ^ var20), (Enum)i2.SHRINK, (pj)null, (Function0)null, true.b<invokedynamic>(19487, 25090887994837777L ^ var20), (Object)null, var22);
                              w = qi.F((il)o, true.x<invokedynamic>(16480, 5400269251466788352L ^ var20), new Color(true.b<invokedynamic>(22526, 327271231521919222L ^ var20), true.b<invokedynamic>(4760, 7400297692956054929L ^ var20), true.b<invokedynamic>(4760, 7400297692956054929L ^ var20), true.b<invokedynamic>(17875, 6037821806326514396L ^ var20)), (pj)null, (Function0)null, true.b<invokedynamic>(19487, 25090887994837777L ^ var20), var28, (Object)null);
                              z = qi.F((il)o, true.x<invokedynamic>(29793, 3781753591138503178L ^ var20), new Color(true.b<invokedynamic>(4760, 7400297692956054929L ^ var20), true.b<invokedynamic>(4760, 7400297692956054929L ^ var20), true.b<invokedynamic>(4760, 7400297692956054929L ^ var20), true.b<invokedynamic>(17875, 6037821806326514396L ^ var20)), (pj)null, (Function0)null, true.b<invokedynamic>(19487, 25090887994837777L ^ var20), var28, (Object)null);
                              M = qi.F((il)o, true.x<invokedynamic>(29250, 6723030772274449441L ^ var20), new Color(true.b<invokedynamic>(4760, 7400297692956054929L ^ var20), true.b<invokedynamic>(4760, 7400297692956054929L ^ var20), true.b<invokedynamic>(4760, 7400297692956054929L ^ var20), true.b<invokedynamic>(4760, 7400297692956054929L ^ var20)), (pj)null, (Function0)null, true.b<invokedynamic>(19487, 25090887994837777L ^ var20), var28, (Object)null);
                              d = new CopyOnWriteArrayList();
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "V\u000böffl¿*3D\u0012Jûzx²";
                           var5 = "V\u000böffl¿*3D\u0012Jûzx²".length();
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

               var15 = "\r½àÜál(M\u008d\u0083åé\u0015vÔW \u0099ïG\u009b.ÍÁÚ\u0019Ç\u008b\u0098\u000fÚÀü2P·\u008bRPè8×F.ë\u0005ÈT×";
               var17 = "\r½àÜál(M\u008d\u0083åé\u0015vÔW \u0099ïG\u009b.ÍÁÚ\u0019Ç\u008b\u0098\u000fÚÀü2P·\u008bRPè8×F.ë\u0005ÈT×".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var31 = var15.substring(var13, var13 + var14);
            var10001 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12737;
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
            throw new RuntimeException("su/catlean/l3", var10);
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
         throw new RuntimeException("su/catlean/l3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18593;
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
            throw new RuntimeException("su/catlean/l3", var14);
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
         throw new RuntimeException("su/catlean/l3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
