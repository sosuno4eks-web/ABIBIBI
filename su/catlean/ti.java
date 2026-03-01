package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1735;
import net.minecraft.class_1739;
import net.minecraft.class_1792;
import net.minecraft.class_1842;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2589;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class ti extends k9 {
   @NotNull
   public static final ti C;
   static final KProperty[] u;
   @NotNull
   private static final zr d;
   @NotNull
   private static final z0 O;
   @NotNull
   private static final zo N;
   @NotNull
   private static final zr W;
   @NotNull
   private static final zo i;
   @NotNull
   private static final iv n;
   @NotNull
   private static final Map X;
   @Nullable
   private static class_2338 c;
   private static final long b = j0.a(-7363723881037015170L, 835311527520165229L, MethodHandles.lookup().lookupClass()).a(206376256755792L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g;
   private static final long[] k;
   private static final Integer[] l;
   private static final Map m;

   private ti(int var1, int var2) {
      long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ b;
      long var5 = var3 ^ 93398682613622L;
      super(var5, true.y<invokedynamic>(11065, 5296318587798674453L ^ var3), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final ey W(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 109837998549716L;
      int var3 = (int)((var1 ^ 109837998549716L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (ey)d.k((short)var3, this, u[0], (short)var4, var5);
   }

   private final int m(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 6276806537003L;
      int var3 = (int)((var1 ^ 6276806537003L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)O.k((short)var3, this, u[1], (short)var4, var5)).intValue();
   }

   private final boolean J(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 45748101562795L;
      int var3 = (int)((var1 ^ 45748101562795L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)N.k((short)var3, this, u[2], (short)var4, var5);
   }

   private final sb C(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 31729456669397L;
      int var3 = (int)((var1 ^ 31729456669397L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (sb)W.k((short)var3, this, u[3], (short)var4, var5);
   }

   private final boolean G(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 95378998430004L;
      int var3 = (int)((var1 ^ 95378998430004L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)i.k((short)var3, this, u[4], (short)var4, var5);
   }

   @Flow
   private final void K(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void H(byte param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private final boolean i(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean a(long param1, class_1842 param3) {
      // $FF: Couldn't be decompiled
   }

   private final int I(int param1, int param2, class_1842 param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private final void a(long param1, class_1792 param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private final boolean h(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 39927251770337L;
      return ((class_1735)s8.f(var3).field_7512.field_7761.get(4)).method_7677().method_7909() instanceof class_1739;
   }

   private final int j(class_1792 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit v(class_3965 var0, class_2586 var1) {
      long var2 = b ^ 83730410294452L;
      long var4 = var2 ^ 6661761873306L;
      long var6 = var2 ^ 115156316805178L;
      s8.r(var4).method_2896(s8.f(var6), class_1268.field_5808, var0);
      ti var10000 = C;
      c = ((class_2589)var1).method_11016();
      return Unit.INSTANCE;
   }

   static {
      long var20 = b ^ 112178243901106L;
      long var22 = var20 ^ 100995137056336L;
      long var24 = var20 ^ 86384132024165L;
      long var26 = var20 ^ 137035871887510L;
      long var10001 = var20 ^ 110136704285368L;
      int var28 = (int)((var20 ^ 110136704285368L) >>> 32);
      int var29 = (int)(var10001 << 32 >>> 32);
      g = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[28];
      int var16 = 0;
      String var15 = "£³¬ðV\u0081Û\u0003j\nª´V\f*YHEX³úD\u0019Ñu\u000e\u0082(\u0093Ä\u0080Ä\u0018\fë±c(o\u0003å\u0087Ë\u0014{\u009a\u0004 :õd\u0095\u001e/\u008dðé\u0018\u0089¦ì±¢\u009c\u001e\u001ed^`\\%\u009cÂ\u000bA\nðd\u0093W r \u009d|Ôqzrè\u000bBìNµ2yª+Û\u001b_\u001a¿r÷'Xa\u000fO¸;=²\u0010\u001c3é\u0080o£p\u0004r\u0013½![{ó\u008c Ðb\u0092=<ç|Ðÿ\u0091í\u0017$s\u001f/ðtW\u001f\b÷Ú\u0093\u0099¹2=ÿ Úe\u0088¬\u0084À\u009aÝ|\u009a\u0006\u0088Rë\u0011{\u0099}¯,\u0015åÌå¤R¨À^`å[\u0017¦ú\u0011mÌ\u0089\u000e+ý:Â\u0098&\u0019Ð>¥\u009cãÚ\u00924Íwi¨»Ãn^âÆÉ%\u000fã\u009f¾òHu¼=\u0017\u0001\u0005K#ÖI±YÓ³\u0086A\u0080Ì\u0085wá½¯\u0013>¹îÆ2\"ìè7ü\u0083ÚµÕ\u0019\u00adx\u0098¾\\IyÌî\u008c?o7ZÚÈÆ\u0088qV5\f]\u008bP\r:(Á\bê\\µºÛ\u001bss¬_\u008c\u0088 »ÓÚ\u0004\u0006ahÓÎW%M«D©\u0093\u0013\u0006¦y¾ %XÂ\u0018ºsÑ°_Ná\u0080Pßè¾¨¼S`#Ó¹\u0006ÍÌè=8ý/<õFç¥äÅ¢\u0096Ö\u0000¶\u001c\u009eU;ö\u000fú%K!9\u0012\u0019(Ïe\u0019\u0002çr\u0082\u0086\u0095S\u0092ãH\u00912\u0081þI\u007f\u0092\u008f¶kÜÆ¨¿9\u0018Fr(ÆVG{a¡lQ®å\u008drþ`¤\u008dñ±ÀÝÊ\u0010}÷Âµ\u008axmi¡\u00ad¡ô\u008bï¦n\u0010°\u009eaÝA¯ûy\u008e\u0091ívù|\f\n@»EÝ?¤jC*ñx»3Gmc&}\u0017%ÅeeaoÞ\u0082\u0083Í»Ðæ\u0017#aJT&6\u0019\u009cÇ·Pcw:ã\u009eI ô.NÌ\rnl?i¨j\u0097!¬\u0018\u008d¯|ûÕ(iÇ!6[X¯Nìhw\u00938ü¬oº\u0089 \u008câ\u0011\u009d|¼\u0087eóÄ\u0092\u009dck8v\u008c»\u0018qk\u0089%é@÷r¯I%ub\u0010²\u0085/ì|]5]°\t¹\u0092»Å¤m\u0010\u0091eHuÅë\u0099°EÊ&bR\u009b\rú\u0018n&[ |²Æ$\u000bÇµn¤tï%^öÎó¨Ë\u0096Ù ú\u0096ª!\b×\u009e\u0019*ü%\u0010\u0088\u0017ÿ\u0095B3\u009af\tÞ\u0000\r®;¾U\u008d\u0002Yw\u0010Z\u0012×l\u009e\u00adÄ)±'\u008d>AþÝd(\u0090*ÁAJ9ýI37²V@\u0098Z\u00921\u0090\u008a\u001bÚ.ÆÀØ«ïwêdÔ&\u000e²u\u0011ÓûÒÓ \u0014ùÏÍä\u0014\u0098\u0010ÇútWì\u000f¼\u0099\fà\u0018\u0016«I$\b\u0013õ³~\u0091|k1\u0018.Þù\u0082 ª_\u0005+ÜÍÄõ\u0082R\u0084¹ÓM.V®\u0004Á(ª\u00846ÉÌ5®u0Ç^2ùï\u0018Ín\u00ad\u0014öó\u0093í!GX\u0005õ\u0083WF=\fs\u0012S\u0096*cd ¬5\u0090kdä\u008fhP\u0014ff%¢\u0091\u001br;\u0088vm\u008a0ì×\u0085éåh®ý\u009f";
      int var17 = "£³¬ðV\u0081Û\u0003j\nª´V\f*YHEX³úD\u0019Ñu\u000e\u0082(\u0093Ä\u0080Ä\u0018\fë±c(o\u0003å\u0087Ë\u0014{\u009a\u0004 :õd\u0095\u001e/\u008dðé\u0018\u0089¦ì±¢\u009c\u001e\u001ed^`\\%\u009cÂ\u000bA\nðd\u0093W r \u009d|Ôqzrè\u000bBìNµ2yª+Û\u001b_\u001a¿r÷'Xa\u000fO¸;=²\u0010\u001c3é\u0080o£p\u0004r\u0013½![{ó\u008c Ðb\u0092=<ç|Ðÿ\u0091í\u0017$s\u001f/ðtW\u001f\b÷Ú\u0093\u0099¹2=ÿ Úe\u0088¬\u0084À\u009aÝ|\u009a\u0006\u0088Rë\u0011{\u0099}¯,\u0015åÌå¤R¨À^`å[\u0017¦ú\u0011mÌ\u0089\u000e+ý:Â\u0098&\u0019Ð>¥\u009cãÚ\u00924Íwi¨»Ãn^âÆÉ%\u000fã\u009f¾òHu¼=\u0017\u0001\u0005K#ÖI±YÓ³\u0086A\u0080Ì\u0085wá½¯\u0013>¹îÆ2\"ìè7ü\u0083ÚµÕ\u0019\u00adx\u0098¾\\IyÌî\u008c?o7ZÚÈÆ\u0088qV5\f]\u008bP\r:(Á\bê\\µºÛ\u001bss¬_\u008c\u0088 »ÓÚ\u0004\u0006ahÓÎW%M«D©\u0093\u0013\u0006¦y¾ %XÂ\u0018ºsÑ°_Ná\u0080Pßè¾¨¼S`#Ó¹\u0006ÍÌè=8ý/<õFç¥äÅ¢\u0096Ö\u0000¶\u001c\u009eU;ö\u000fú%K!9\u0012\u0019(Ïe\u0019\u0002çr\u0082\u0086\u0095S\u0092ãH\u00912\u0081þI\u007f\u0092\u008f¶kÜÆ¨¿9\u0018Fr(ÆVG{a¡lQ®å\u008drþ`¤\u008dñ±ÀÝÊ\u0010}÷Âµ\u008axmi¡\u00ad¡ô\u008bï¦n\u0010°\u009eaÝA¯ûy\u008e\u0091ívù|\f\n@»EÝ?¤jC*ñx»3Gmc&}\u0017%ÅeeaoÞ\u0082\u0083Í»Ðæ\u0017#aJT&6\u0019\u009cÇ·Pcw:ã\u009eI ô.NÌ\rnl?i¨j\u0097!¬\u0018\u008d¯|ûÕ(iÇ!6[X¯Nìhw\u00938ü¬oº\u0089 \u008câ\u0011\u009d|¼\u0087eóÄ\u0092\u009dck8v\u008c»\u0018qk\u0089%é@÷r¯I%ub\u0010²\u0085/ì|]5]°\t¹\u0092»Å¤m\u0010\u0091eHuÅë\u0099°EÊ&bR\u009b\rú\u0018n&[ |²Æ$\u000bÇµn¤tï%^öÎó¨Ë\u0096Ù ú\u0096ª!\b×\u009e\u0019*ü%\u0010\u0088\u0017ÿ\u0095B3\u009af\tÞ\u0000\r®;¾U\u008d\u0002Yw\u0010Z\u0012×l\u009e\u00adÄ)±'\u008d>AþÝd(\u0090*ÁAJ9ýI37²V@\u0098Z\u00921\u0090\u008a\u001bÚ.ÆÀØ«ïwêdÔ&\u000e²u\u0011ÓûÒÓ \u0014ùÏÍä\u0014\u0098\u0010ÇútWì\u000f¼\u0099\fà\u0018\u0016«I$\b\u0013õ³~\u0091|k1\u0018.Þù\u0082 ª_\u0005+ÜÍÄõ\u0082R\u0084¹ÓM.V®\u0004Á(ª\u00846ÉÌ5®u0Ç^2ùï\u0018Ín\u00ad\u0014öó\u0093í!GX\u0005õ\u0083WF=\fs\u0012S\u0096*cd ¬5\u0090kdä\u008fhP\u0014ff%¢\u0091\u001br;\u0088vm\u008a0ì×\u0085éåh®ý\u009f".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var31 = var15.substring(var13, var13 + var14);
         byte var33 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var38 = b(var19).intern();
            switch(var33) {
            case 0:
               var18[var16++] = var38;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  f = new String[28];
                  m = new HashMap(13);
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
                  String var4 = "À4È\u0011\u0093e-å\u0013lZj»^\u0019ZxPóÃ\u00adgÉ¨\ft¬L\b \u0002\u0012HSb/\\f§l\u009d-\u008b¾ëu\u008cÄüs\u000bJÚî\u0092\u008c\u007ff\u0084\u0088µ:\u008dÄ!\taÜ*,\u0017±Õ\u00047;ÀFáA";
                  int var5 = "À4È\u0011\u0093e-å\u0013lZj»^\u0019ZxPóÃ\u00adgÉ¨\ft¬L\b \u0002\u0012HSb/\\f§l\u009d-\u008b¾ëu\u008cÄüs\u000bJÚî\u0092\u008c\u007ff\u0084\u0088µ:\u008dÄ!\taÜ*,\u0017±Õ\u00047;ÀFáA".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var37 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                     long[] var34 = var6;
                     var37 = var3++;
                     long var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var41 = -1;

                     while(true) {
                        long var8 = var40;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var43 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var41) {
                        case 0:
                           var34[var37] = var43;
                           if (var2 >= var5) {
                              k = var6;
                              l = new Integer[12];
                              KProperty[] var30 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ti.class, true.y<invokedynamic>(500, 654469751693728501L ^ var20), true.y<invokedynamic>(19176, 4869377378019348964L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ti.class, true.y<invokedynamic>(8527, 2546966598541671003L ^ var20), true.y<invokedynamic>(7856, 663345284496344500L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ti.class, true.y<invokedynamic>(13584, 1914958065262456322L ^ var20), true.y<invokedynamic>(3152, 5906892162534659922L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ti.class, true.y<invokedynamic>(10275, 7005373176991970084L ^ var20), true.y<invokedynamic>(26584, 6283974423138548944L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ti.class, true.y<invokedynamic>(10017, 6611898995120340015L ^ var20), true.y<invokedynamic>(5813, 4343671981089082805L ^ var20), 0)))};
                              u = var30;
                              C = new ti(var28, var29);
                              d = qi.M((il)C, true.y<invokedynamic>(29915, 4242468155517579218L ^ var20), (Enum)ey.STRENGTH, (pj)null, (Function0)null, true.f<invokedynamic>(6801, 3660013394274572609L ^ var20), (Object)null, var24);
                              O = qi.o((il)C, true.y<invokedynamic>(19677, 203000301749278668L ^ var20), true.f<invokedynamic>(3769, 4451247766461271403L ^ var20), new IntRange(0, true.f<invokedynamic>(3101, 9067446669687902158L ^ var20)), var22, (pj)null, (Function0)null, true.f<invokedynamic>(2894, 8857468895322720411L ^ var20), (Object)null);
                              N = qi.R((il)C, true.y<invokedynamic>(12786, 2815742035734915813L ^ var20), true, (pj)null, (Function0)null, true.f<invokedynamic>(31851, 607108864893403063L ^ var20), var26, (Object)null);
                              W = qi.M((il)C, true.y<invokedynamic>(19898, 56735646282847909L ^ var20), (Enum)sb.TAKE, (pj)null, (Function0)null, true.f<invokedynamic>(31851, 607108864893403063L ^ var20), (Object)null, var24);
                              i = qi.R((il)C, true.y<invokedynamic>(3686, 2105908568410838387L ^ var20), true, (pj)null, (Function0)null, true.f<invokedynamic>(31851, 607108864893403063L ^ var20), var26, (Object)null);
                              n = new iv();
                              X = (Map)(new LinkedHashMap());
                              return;
                           }
                           break;
                        default:
                           var34[var37] = var43;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "ç\u0080§\u0095\u0087¬û¾\u009a\u0012BÆ'å\u001c½";
                           var5 = "ç\u0080§\u0095\u0087¬û¾\u009a\u0012BÆ'å\u001c½".length();
                           var2 = 0;
                        }

                        var37 = var2;
                        var2 += 8;
                        var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                        var34 = var6;
                        var37 = var3++;
                        var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var41 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var38;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0010!0Ú:ª¨\u0003X\u0090ï\u009e\u008c\u001d\u0089ð;Ý7\u00ad\u0012\u0088¹\u0015ª·\u0000L\u0090²#\u0093 \u008b?\u0011?\u0000(Oéé\u000b%7Ý\u001d%\u0002\u008c ¾\u001dWGô\tÙ\u00117é£ï\u0096\u0004";
               var17 = "\u0010!0Ú:ª¨\u0003X\u0090ï\u009e\u008c\u001d\u0089ð;Ý7\u00ad\u0012\u0088¹\u0015ª·\u0000L\u0090²#\u0093 \u008b?\u0011?\u0000(Oéé\u000b%7Ý\u001d%\u0002\u008c ¾\u001dWGô\tÙ\u00117é£ï\u0096\u0004".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var31 = var15.substring(var13, var13 + var14);
            var33 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23347;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ti", var10);
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
         throw new RuntimeException("su/catlean/ti" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17377;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = k[var3];
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
            throw new RuntimeException("su/catlean/ti", var14);
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
         throw new RuntimeException("su/catlean/ti" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
