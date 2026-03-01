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
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1914;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class tz extends k9 {
   @NotNull
   public static final tz k;
   static final KProperty[] V;
   @NotNull
   private static final zo y;
   @NotNull
   private static final z_ Y;
   @NotNull
   private static final zo w;
   @NotNull
   private static final z_ T;
   @NotNull
   private static final z0 c;
   @NotNull
   private static final z0 R;
   private static int q;
   private static int I;
   private static int W;
   @NotNull
   private static final Map K;
   private static final long b = j0.a(5412938429262333305L, 6816762364405065733L, MethodHandles.lookup().lookupClass()).a(102120876393407L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map l;

   private tz(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 95646818561525L;
      super(var3, true.l<invokedynamic>(22337, 6091221601768885461L ^ var1), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean S(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 72934138653808L;
      int var3 = (int)((var1 ^ 72934138653808L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)y.k((short)var3, this, V[0], (short)var4, var5);
   }

   private final uj b(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 62572741800927L;
      int var3 = (int)((var1 ^ 62572741800927L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (uj)Y.k((short)var3, this, V[1], (short)var4, var5);
   }

   private final void g(uj var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 107238121715883L;
      int var4 = (int)((var2 ^ 107238121715883L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Y.P(this, var4, V[1], (short)var5, var1, (short)var6);
   }

   private final boolean h(byte var1, long var2) {
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ b;
      long var10001 = var4 ^ 26555629232174L;
      int var6 = (int)((var4 ^ 26555629232174L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)w.k((short)var6, this, V[2], (short)var7, var8);
   }

   private final uj x(int var1, char var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 42174893015731L;
      int var6 = (int)((var4 ^ 42174893015731L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (uj)T.k((short)var6, this, V[3], (short)var7, var8);
   }

   private final void V(uj var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 30762509369958L;
      int var4 = (int)((var2 ^ 30762509369958L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      T.P(this, var4, V[3], (short)var5, var1, (short)var6);
   }

   private final int L(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 133194532142496L;
      int var3 = (int)((var1 ^ 133194532142496L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)c.k((short)var3, this, V[4], (short)var4, var5)).intValue();
   }

   private final void M(char var1, int var2, long var3) {
      long var5 = ((long)var1 << 48 | var3 << 16 >>> 16) ^ b;
      long var10001 = var5 ^ 84969118813528L;
      int var7 = (int)((var5 ^ 84969118813528L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      c.P(this, var7, V[4], (short)var8, var2, (short)var9);
   }

   private final int i(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 99977482185842L;
      int var3 = (int)((var1 ^ 99977482185842L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)R.k((short)var3, this, V[5], (short)var4, var5)).intValue();
   }

   private final void d(int var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 3603920930587L;
      int var4 = (int)((var2 ^ 3603920930587L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      R.P(this, var4, V[5], (short)var5, var1, (short)var6);
   }

   @Flow
   private final void Q(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean k(int param1, class_1914 param2, short param3, char param4) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean o(Entry param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean T(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Unit X(class_1297 var0) {
      long var1 = b ^ 40483697354036L;
      long var3 = var1 ^ 122055212575305L;
      long var5 = var1 ^ 66838779045927L;
      long var7 = var1 ^ 90705297327495L;
      s8.r(var5).method_2905((class_1657)s8.f(var7), var0, class_1268.field_5808);
      tz var10000 = k;
      W = var0.method_5628();
      var10000 = k;
      q = k.L(var3);
      return Unit.INSTANCE;
   }

   static {
      long var20 = b ^ 92935489452352L;
      long var22 = var20 ^ 65325288093087L;
      long var24 = var20 ^ 99749532723259L;
      long var26 = var20 ^ 117159070696594L;
      long var28 = var20 ^ 30860944669529L;
      long var30 = var20 ^ 93063628066761L;
      f = new HashMap(13);
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
      String var15 = "\u008b!õâ\u000b\u0097©0vÃ©\u0094\u009fÝ\"ñçá\u0093cK¨O\u0084E<\u0080î)\u001aÖg\u0018µ2\u000eÄª5¼\u0080\u0000\u0010ùÚÔmå\u008eËyÑ@LQ º\u0018Cð5\u0090\u0085å\u0014ó&³¦Þ¬&Nú6]¿&\u0093\u0090\t÷8~V£Åb¾È\u008b\u0089³fÈà\u0006\u0003ùv=5\u001cá\u000f16\u0004\u009d\u0082\u009a1qóá\u0083ü4,5Ù\u000e\u001d\u001frT]\u0088p*È4|®XK*KQ\u0018\u0089@¸\u0080\u0006\u0089*¶E\u008dÌû5=\u001b\u0006\u0089Á\fçaõL.\u0018ÿ×ï\u008dA\u009fâ~ê¸§V©õ\u0090^ \u0093\u0080\u001dê \u0018ú8Zâ]4@éâ)\u007f6Õd\u0014!çi:à\u001b®Ìó|7\u008cJ\u0086m\u0001\u0082\u008a\u0091\u00ad\u0093&O\u0006dÁLË¿ìîÞ*NHüæãK(Hpw0ãJr\u0018s{Ï¼*íâ\u001a\u0011\u000b;ÀOd^\u0004á\t\u0006ý_ª\u008c:ßÉ!\u0093Se»«f7\fW¦\u0089N-·Y2Æ \u0018\u0083x`³\u009e\u009d\r\u001dY\u009aEªó\u0016\u0094M¸3ÔCtgoO\u001eÐ\u000eD5CH\u0010ØG0Rä\u0086Ò(^màm_\u0013×Ð ¡¤B\u0099Ud\u0093f+\u0018t\u0003LÆ^{\tHÿ\rq\u008e\u000e®$\u0085Äÿ\u009a*ÝÙ  c&hô¢d[ÌBt,2¼çñ\u0082uS¦\u0012g¦ÕØG\bßW\u008cY·\u0010þ\u001eº«,Í9.\u0097¢gÁFª\u001b,8¸\u00815i\u0011¬IÔü(\u009ec¨mä\u0095ä³AS1Þ¬PÐ\u008aî.0\u008a·\u0085ÆÊ\u0094Ne`ó:¥øRxv\u008bqfç¢æ«\u008dè¹\u0099 ¸'|\u009eNÓW\u0082X\u0080S\u0093îxÙ<õ\u0001[Ù\u009b¥×à~RÅ\u0014\u0010áÔ\u001b\u0010¾\u00adè}ò\u0006_B\u0019j´ósê+Ë\u0010~?Üaå\u0099\u0085Kÿ\u008añ\u0018 êP\u0013\u0018ÏF\u009ecåmÓ¸\u007fË\u0018á4õ~ê\u0017I)?Ä\u009e\u0095#\u0018ßÈ\u0012ë<Î\u0088Õ\u0087´P\u0010Ë©Q\u0001³\u0001¬AH\u0004\u008f¾(\u000eÕ|\u0086úq]R\u0001\u0089\u0090\u0081»\u0005¸+à}ËûJ÷\r\u0088\u009dÄ:ÕÚ©ãá²JoöòµR\u0001\u0018É¨h!\u0091ö¸³\u00867\u008aöA»v\u001cT\u0000ÀÀ\u0006a¡é\u0018¼á2`^h`Êòâ+\u0081\u0083½Ä+\u0086Ö$\u0002\u0006Ý\u000e©\u0018«\u007fà¼4Ð\u0003*÷f ö~²Á5D\u0087É\u009bÑY\u0010*\u0018ÃìâíwÀ\f\u0003ÞïVôÓ\tWÙºê¿¢q2íÉ\u0098Ið\u009aòK¦JX}\u00105çÍIRûJç¸\u001bùñÓrT\u0094U\nKºOmÀ\u0005@fÒÄ,È«ê\u009a:\u0004a\u0086È,\u008d\u0000¯ë¶ûdØ<\u0088sú\u0014)d$ü®\u008dë\u009cÿ]\u0011 \u0085\u0013\u0083\u008bLFïÔû¼g;\\¢ÆbÎ8=óZ\u000f\u008a÷\u009c$\u008cqæb\fRoFpâªq\u0097+Æ\u0011TÓ1>3ñeJ\u008eo\u001f¼\u0084,Ï\u0011Aé\t\f«S\u0093\u008b[Ô´&\u001dÐ¼MÐg\u008fu\u0010\u009e\u00adQ\u0013+\rçÄ\u009fç\u0088Ð¨É\u0092ì";
      int var17 = "\u008b!õâ\u000b\u0097©0vÃ©\u0094\u009fÝ\"ñçá\u0093cK¨O\u0084E<\u0080î)\u001aÖg\u0018µ2\u000eÄª5¼\u0080\u0000\u0010ùÚÔmå\u008eËyÑ@LQ º\u0018Cð5\u0090\u0085å\u0014ó&³¦Þ¬&Nú6]¿&\u0093\u0090\t÷8~V£Åb¾È\u008b\u0089³fÈà\u0006\u0003ùv=5\u001cá\u000f16\u0004\u009d\u0082\u009a1qóá\u0083ü4,5Ù\u000e\u001d\u001frT]\u0088p*È4|®XK*KQ\u0018\u0089@¸\u0080\u0006\u0089*¶E\u008dÌû5=\u001b\u0006\u0089Á\fçaõL.\u0018ÿ×ï\u008dA\u009fâ~ê¸§V©õ\u0090^ \u0093\u0080\u001dê \u0018ú8Zâ]4@éâ)\u007f6Õd\u0014!çi:à\u001b®Ìó|7\u008cJ\u0086m\u0001\u0082\u008a\u0091\u00ad\u0093&O\u0006dÁLË¿ìîÞ*NHüæãK(Hpw0ãJr\u0018s{Ï¼*íâ\u001a\u0011\u000b;ÀOd^\u0004á\t\u0006ý_ª\u008c:ßÉ!\u0093Se»«f7\fW¦\u0089N-·Y2Æ \u0018\u0083x`³\u009e\u009d\r\u001dY\u009aEªó\u0016\u0094M¸3ÔCtgoO\u001eÐ\u000eD5CH\u0010ØG0Rä\u0086Ò(^màm_\u0013×Ð ¡¤B\u0099Ud\u0093f+\u0018t\u0003LÆ^{\tHÿ\rq\u008e\u000e®$\u0085Äÿ\u009a*ÝÙ  c&hô¢d[ÌBt,2¼çñ\u0082uS¦\u0012g¦ÕØG\bßW\u008cY·\u0010þ\u001eº«,Í9.\u0097¢gÁFª\u001b,8¸\u00815i\u0011¬IÔü(\u009ec¨mä\u0095ä³AS1Þ¬PÐ\u008aî.0\u008a·\u0085ÆÊ\u0094Ne`ó:¥øRxv\u008bqfç¢æ«\u008dè¹\u0099 ¸'|\u009eNÓW\u0082X\u0080S\u0093îxÙ<õ\u0001[Ù\u009b¥×à~RÅ\u0014\u0010áÔ\u001b\u0010¾\u00adè}ò\u0006_B\u0019j´ósê+Ë\u0010~?Üaå\u0099\u0085Kÿ\u008añ\u0018 êP\u0013\u0018ÏF\u009ecåmÓ¸\u007fË\u0018á4õ~ê\u0017I)?Ä\u009e\u0095#\u0018ßÈ\u0012ë<Î\u0088Õ\u0087´P\u0010Ë©Q\u0001³\u0001¬AH\u0004\u008f¾(\u000eÕ|\u0086úq]R\u0001\u0089\u0090\u0081»\u0005¸+à}ËûJ÷\r\u0088\u009dÄ:ÕÚ©ãá²JoöòµR\u0001\u0018É¨h!\u0091ö¸³\u00867\u008aöA»v\u001cT\u0000ÀÀ\u0006a¡é\u0018¼á2`^h`Êòâ+\u0081\u0083½Ä+\u0086Ö$\u0002\u0006Ý\u000e©\u0018«\u007fà¼4Ð\u0003*÷f ö~²Á5D\u0087É\u009bÑY\u0010*\u0018ÃìâíwÀ\f\u0003ÞïVôÓ\tWÙºê¿¢q2íÉ\u0098Ið\u009aòK¦JX}\u00105çÍIRûJç¸\u001bùñÓrT\u0094U\nKºOmÀ\u0005@fÒÄ,È«ê\u009a:\u0004a\u0086È,\u008d\u0000¯ë¶ûdØ<\u0088sú\u0014)d$ü®\u008dë\u009cÿ]\u0011 \u0085\u0013\u0083\u008bLFïÔû¼g;\\¢ÆbÎ8=óZ\u000f\u008a÷\u009c$\u008cqæb\fRoFpâªq\u0097+Æ\u0011TÓ1>3ñeJ\u008eo\u001f¼\u0084,Ï\u0011Aé\t\f«S\u0093\u008b[Ô´&\u001dÐ¼MÐg\u008fu\u0010\u009e\u00adQ\u0013+\rçÄ\u009fç\u0088Ð¨É\u0092ì".length();
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
                  e = new String[28];
                  l = new HashMap(13);
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
                  String var4 = "´±üË\tõn;t¶¹Ú>\u0012\u0082\u000fiÕ#Ö½r/\u008bN»l\u0080Ôµa\"+\u0004tPf)HRè:Þ3GÎB\u0012(5í¾)\u0013\u0089\u0097ã\u0098\u000foé\u0095&[";
                  int var5 = "´±üË\tõn;t¶¹Ú>\u0012\u0082\u000fiÕ#Ö½r/\u008bN»l\u0080Ôµa\"+\u0004tPf)HRè:Þ3GÎB\u0012(5í¾)\u0013\u0089\u0097ã\u0098\u000foé\u0095&[".length();
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
                              i = new Integer[10];
                              KProperty[] var32 = new KProperty[true.w<invokedynamic>(26767, 679959487893251654L ^ var20)];
                              var32[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tz.class, true.l<invokedynamic>(16303, 3434381848945527111L ^ var20), true.l<invokedynamic>(13405, 8899258450025120439L ^ var20), 0)));
                              var32[1] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(tz.class, true.l<invokedynamic>(29615, 5936216357913281858L ^ var20), true.l<invokedynamic>(9401, 4758444479919428187L ^ var20), 0)));
                              var32[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tz.class, true.l<invokedynamic>(13699, 7086007383607378807L ^ var20), true.l<invokedynamic>(27019, 8015913892965637998L ^ var20), 0)));
                              var32[3] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(tz.class, true.l<invokedynamic>(10660, 4437625261742464843L ^ var20), true.l<invokedynamic>(2011, 3320273137998737714L ^ var20), 0)));
                              var32[4] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(tz.class, true.l<invokedynamic>(1751, 2450433333656596514L ^ var20), true.l<invokedynamic>(17446, 3641853830282506949L ^ var20), 0)));
                              var32[5] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(tz.class, true.l<invokedynamic>(3537, 306674216698329917L ^ var20), true.l<invokedynamic>(10347, 35996260086128284L ^ var20), 0)));
                              V = var32;
                              k = new tz(var30);
                              y = qi.R((il)k, true.l<invokedynamic>(30034, 2775956722014503865L ^ var20), true, (pj)null, (Function0)null, true.w<invokedynamic>(22873, 1791585114155915153L ^ var20), var28, (Object)null);
                              Y = qi.M((il)k, true.l<invokedynamic>(26607, 7779196720075329817L ^ var20), new uj(var24, (List)null, 1, (DefaultConstructorMarker)null), (pj)null, (Function0)null, var26, true.w<invokedynamic>(20969, 4315668530861678381L ^ var20), (Object)null);
                              w = qi.R((il)k, true.l<invokedynamic>(26393, 2058294106475680228L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(20969, 4315668530861678381L ^ var20), var28, (Object)null);
                              T = qi.M((il)k, true.l<invokedynamic>(29473, 1674193521141040594L ^ var20), new uj(var24, (List)null, 1, (DefaultConstructorMarker)null), (pj)null, (Function0)null, var26, true.w<invokedynamic>(20969, 4315668530861678381L ^ var20), (Object)null);
                              c = qi.o((il)k, true.l<invokedynamic>(22543, 238911577324580605L ^ var20), true.w<invokedynamic>(20969, 4315668530861678381L ^ var20), new IntRange(0, true.w<invokedynamic>(18012, 4356207692289837203L ^ var20)), var22, (pj)null, (Function0)null, true.w<invokedynamic>(15103, 7529734983095088186L ^ var20), (Object)null);
                              R = qi.o((il)k, true.l<invokedynamic>(22100, 8480791196406800555L ^ var20), 3, new IntRange(0, true.w<invokedynamic>(17887, 318241970181409557L ^ var20)), var22, (pj)null, (Function0)null, true.w<invokedynamic>(9133, 6320726281834622305L ^ var20), (Object)null);
                              K = (Map)(new LinkedHashMap());
                              return;
                           }
                           break;
                        default:
                           var36[var37] = var44;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "I*\u0084»uëQ2\u009e[ëQÀò¸´";
                           var5 = "I*\u0084»uëQ2\u009e[ëQÀò¸´".length();
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

               var15 = ":±Ö\u008e\u009fë\u009fh¾\u00038Ç¢\u0086t*\u0098\r\u0088½ú!Ñ\" \"Ù\u0094A\u008d7·\u0017[\u0090å\u0085XÓ8\u000böG@Ó\u008aÊ»\u00801\u00824rZu±I";
               var17 = ":±Ö\u008e\u009fë\u009fh¾\u00038Ç¢\u0086t*\u0098\r\u0088½ú!Ñ\" \"Ù\u0094A\u008d7·\u0017[\u0090å\u0085XÓ8\u000böG@Ó\u008aÊ»\u00801\u00824rZu±I".length();
               var14 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27933;
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
            throw new RuntimeException("su/catlean/tz", var10);
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
         throw new RuntimeException("su/catlean/tz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5428;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/tz", var14);
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
         throw new RuntimeException("su/catlean/tz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
