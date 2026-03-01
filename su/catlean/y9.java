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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class y9 extends k9 {
   @NotNull
   public static final y9 W;
   static final KProperty[] R;
   @NotNull
   private static final z0 J;
   @NotNull
   private static final z0 d;
   @NotNull
   private static final zo P;
   @NotNull
   private static final z0 L;
   @NotNull
   private static final zk U;
   @NotNull
   private static final zo X;
   @NotNull
   private static final zo l;
   @NotNull
   private static final zo i;
   @NotNull
   private static final zo x;
   @NotNull
   private static final iv M;
   private static boolean m;
   private static final long b = j0.a(7561386438464491122L, 6976881431748854919L, MethodHandles.lookup().lookupClass()).a(250084407642337L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] k;
   private static final Map n;

   private y9(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 48024579665956L;
      super(var3, true.t<invokedynamic>(358, 1849006236593408426L ^ var1), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final int s(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 86112584527746L;
      int var3 = (int)((var1 ^ 86112584527746L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)J.k((short)var3, this, R[0], (short)var4, var5)).intValue();
   }

   private final int x(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 81028645095475L;
      int var3 = (int)((var1 ^ 81028645095475L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)d.k((short)var3, this, R[1], (short)var4, var5)).intValue();
   }

   private final boolean M(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 90619479696071L;
      int var3 = (int)((var1 ^ 90619479696071L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)P.k((short)var3, this, R[2], (short)var4, var5);
   }

   private final int H(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 22520534359659L;
      int var3 = (int)((var1 ^ 22520534359659L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)L.k((short)var3, this, R[3], (short)var4, var5)).intValue();
   }

   private final pj y(int var1, short var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 80149254684388L;
      int var6 = (int)((var4 ^ 80149254684388L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (pj)U.k((short)var6, this, R[4], (short)var7, var8);
   }

   private final boolean U(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 39341125430091L;
      int var3 = (int)((var1 ^ 39341125430091L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)X.k((short)var3, this, R[5], (short)var4, var5);
   }

   private final boolean k(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 57445081151543L;
      int var3 = (int)((var1 ^ 57445081151543L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)l.k((short)var3, this, R[true.y<invokedynamic>(5485, 3929270303507912206L ^ var1)], (short)var4, var5);
   }

   private final boolean d(byte var1, int var2, int var3) {
      long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ b;
      long var10001 = var4 ^ 95138644529313L;
      int var6 = (int)((var4 ^ 95138644529313L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)i.k((short)var6, this, R[true.y<invokedynamic>(21187, 6268548461759838512L ^ var4)], (short)var7, var8);
   }

   private final boolean w(long var1, int var3) {
      long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 84413083726549L;
      int var6 = (int)((var4 ^ 84413083726549L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)x.k((short)var6, this, R[true.y<invokedynamic>(28798, 2862752741483756017L ^ var4)], (short)var7, var8);
   }

   @NotNull
   public final iv C() {
      return M;
   }

   public final boolean b() {
      return m;
   }

   public final void Z(boolean <set-?>) {
      m = var1;
   }

   public void a(long var1) {
      m = false;
   }

   @Flow(
      priority = -10
   )
   private final void k(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final float d(class_1799 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit x(s1 var0) {
      long var1 = b ^ 49402020078574L;
      long var3 = var1 ^ 11429320986456L;
      long var10001 = var1 ^ 67743301813195L;
      int var5 = (int)((var1 ^ 67743301813195L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      dk.I.G(var5, (char)var6, var0.I(), W.H(var3), (char)var7);
      return Unit.INSTANCE;
   }

   static {
      long var20 = b ^ 4764328252686L;
      long var22 = var20 ^ 119578758111858L;
      long var24 = var20 ^ 105448375531377L;
      long var26 = var20 ^ 133210425671254L;
      long var28 = var20 ^ 83260027038900L;
      long var10001 = var20 ^ 138814802336055L;
      int var30 = (int)((var20 ^ 138814802336055L) >>> 32);
      int var31 = (int)(var10001 << 32 >>> 48);
      int var32 = (int)(var10001 << 48 >>> 48);
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[32];
      int var16 = 0;
      String var15 = "6\u0085+íkÆI Sù½F\u00042ëÁ(zç4Ãª_\u0082¾\u0014\u0094Ð?ò4Æt\n&\u0001×®>ôâ\u0010¿I{]ëáO\u0086\u0018ÜÄ°\u000f\u0017«(m\u000fa=ªû.z÷(\b\u000eô\u0005ÿòiã\u0010\u0082#4\u000e\u0016(¸ 3vµW¿Bo\u0097àÚb×© ®Lþ¦BGP\u009aÀ§MCÈ¿æÙ\u007fO@õÞ!\"\u0001ÒBÖÔú\u0095\u0016\u009d\u0010Êby+àÄP\u0086bÔ*\u0087\u0088\u008cÉú8ò7\u0083ô¿U\u0003\u0091V\u001c\u0001\u000eN\u0080ñF\u0083\u000b\u0017\u0000Kâïf?\u0013¼Þ´\nÀ\u009c0\u0095ý\u0095\u0083\u0014a¿\u0088G\u009b\u0082\u0002R]Æ£~ô\u0094Q\u0006\u009by0ãâ\u0004\u0000\u0003Õo\u0013Â\u008f\u000f*\ty»t´\u0088\u0088Çî¹k³\u0013æ£\u001c}ék\u00ad*øðu\u008eQ;YªOÏ¤]e<\u0084\u0018¯¢j\u0001äÈ\u008cû\u0091\u0096Ì¡@y|xÖ'íh8:8¤\u0018\f\b\u0095õÏÐÒö\u0013ö-Á©×µC¯zÓ<>=W\u0084 IÙÿ·ÉÆºV\u0086\u0085\u0014êàj\u000b¡~\u0006ºàÐ\u0090¢u>7¡Ó^\\ù/\u0018«ÅM\u00186\n©tÓÝö\u0086ï\u009dÌÿÚüRhßÆß\u0095 Ví\u0016\"Ãb\u001fJÅå\f ö\u0093\u009e\u0001Æ\u0090\u0001j?g^S£IÉ \u008dQ\f' í#??AF[èêc\u001cT+çu2Eª\u008cp×¶ò\u00036W\u0017É\u0097M^Â ·\u0094Cè11(^\u0089\u0086nS\u0014³ñ#lub²\u0012lËMO¹]\u0098\u008aª\u001eV(j©%\u0004\u000eJ¾>y\u0001@ ®\u008cÛÀh·\u001dÌæ\u0096Ì\u0085'Õàñ^(\u0082 Ú\u008atÒxK\u001d\u0090 TV\u0097UºhÏ\u0013J dá\u009d_\u0090NJ<îK\u009dé-ÃåÆ,fÜMQÛ(\u0081\u0004=:°\u0017(ªw\u0096\u0005\u0093°º¸\u000b*hK¦ïº\u0016\u008aÔhÑÓÁ\u009b\u001d\u001e\u0019\u0094±oMN\u0092ó 0ÂcúÚTº¸Ð\u0005º`\u001bçyh\u0002`BC È<Tx\u001f\u009aS\u0012vN\u0082\u0010\u001dTÄ6rè\u0098©ç_PDM\u0089\u008dÛ \u009b\u0014\u009e\u008a\u009eëzµ\u008b¥J\u0092ÛõxýöO\u0013Ï¢N.+'<µ¨zBÅ\u0006\u0018P\fEQ\u0018]\u009f÷Ï\u0096¼Ùk\u0000ä\u001f¼´Y\u0012\u0080ÉÒ¸\u0018Ö¶\u001bõ1@í}O\"0\tè\u009bÊ\u001b¿þ]½È\u007fm\u0006(K\u0006?íÔ\u000b\u0080ºHcv¨x\u008c~\u001a\u008b±y\u001cÒ\u0001-\u001b\u008d\u009c=&\u0099\"Ø¨a¶\u0097°-U½E\u0018\u000e\u0099þn¶«ÁÅa<ðT\u000eéa:E\r\u001bóg¸\u0000\u008c\u0018±·rf@\u0003ì¼¼\u0091Û\u0010¹&NÑ\u0001pTQm\u0082\u001c\u0014\u0018)S\u009d\u0018÷\u0007Q ËÔìzü²â¥\u009eºÝä0Zªj(rpH\u0006rb\u0006¾X\u0007ï¯NcäÔl-mzI¶P¿Þ£Øõjv)\u0082ËèÔ_\u009cÚã< \u0080ñ\u009bQëÈ\u009dY´\u001eÁc\u009a\u009aû®sJ\u0010\u0003ÐK\u0010É'ÿ\u0013$\u0017\u0097\u0090Ö\u0010\u0089Ä\u001b\u009cPdÖ\u0088!VÉ^ä@i  ?\u0091%5¨æÔ\u0087&Ä\u0019ò´ÿ§ Ó:\u0015?N\u008cU®\u0098®Ù>< \u0006Å";
      int var17 = "6\u0085+íkÆI Sù½F\u00042ëÁ(zç4Ãª_\u0082¾\u0014\u0094Ð?ò4Æt\n&\u0001×®>ôâ\u0010¿I{]ëáO\u0086\u0018ÜÄ°\u000f\u0017«(m\u000fa=ªû.z÷(\b\u000eô\u0005ÿòiã\u0010\u0082#4\u000e\u0016(¸ 3vµW¿Bo\u0097àÚb×© ®Lþ¦BGP\u009aÀ§MCÈ¿æÙ\u007fO@õÞ!\"\u0001ÒBÖÔú\u0095\u0016\u009d\u0010Êby+àÄP\u0086bÔ*\u0087\u0088\u008cÉú8ò7\u0083ô¿U\u0003\u0091V\u001c\u0001\u000eN\u0080ñF\u0083\u000b\u0017\u0000Kâïf?\u0013¼Þ´\nÀ\u009c0\u0095ý\u0095\u0083\u0014a¿\u0088G\u009b\u0082\u0002R]Æ£~ô\u0094Q\u0006\u009by0ãâ\u0004\u0000\u0003Õo\u0013Â\u008f\u000f*\ty»t´\u0088\u0088Çî¹k³\u0013æ£\u001c}ék\u00ad*øðu\u008eQ;YªOÏ¤]e<\u0084\u0018¯¢j\u0001äÈ\u008cû\u0091\u0096Ì¡@y|xÖ'íh8:8¤\u0018\f\b\u0095õÏÐÒö\u0013ö-Á©×µC¯zÓ<>=W\u0084 IÙÿ·ÉÆºV\u0086\u0085\u0014êàj\u000b¡~\u0006ºàÐ\u0090¢u>7¡Ó^\\ù/\u0018«ÅM\u00186\n©tÓÝö\u0086ï\u009dÌÿÚüRhßÆß\u0095 Ví\u0016\"Ãb\u001fJÅå\f ö\u0093\u009e\u0001Æ\u0090\u0001j?g^S£IÉ \u008dQ\f' í#??AF[èêc\u001cT+çu2Eª\u008cp×¶ò\u00036W\u0017É\u0097M^Â ·\u0094Cè11(^\u0089\u0086nS\u0014³ñ#lub²\u0012lËMO¹]\u0098\u008aª\u001eV(j©%\u0004\u000eJ¾>y\u0001@ ®\u008cÛÀh·\u001dÌæ\u0096Ì\u0085'Õàñ^(\u0082 Ú\u008atÒxK\u001d\u0090 TV\u0097UºhÏ\u0013J dá\u009d_\u0090NJ<îK\u009dé-ÃåÆ,fÜMQÛ(\u0081\u0004=:°\u0017(ªw\u0096\u0005\u0093°º¸\u000b*hK¦ïº\u0016\u008aÔhÑÓÁ\u009b\u001d\u001e\u0019\u0094±oMN\u0092ó 0ÂcúÚTº¸Ð\u0005º`\u001bçyh\u0002`BC È<Tx\u001f\u009aS\u0012vN\u0082\u0010\u001dTÄ6rè\u0098©ç_PDM\u0089\u008dÛ \u009b\u0014\u009e\u008a\u009eëzµ\u008b¥J\u0092ÛõxýöO\u0013Ï¢N.+'<µ¨zBÅ\u0006\u0018P\fEQ\u0018]\u009f÷Ï\u0096¼Ùk\u0000ä\u001f¼´Y\u0012\u0080ÉÒ¸\u0018Ö¶\u001bõ1@í}O\"0\tè\u009bÊ\u001b¿þ]½È\u007fm\u0006(K\u0006?íÔ\u000b\u0080ºHcv¨x\u008c~\u001a\u008b±y\u001cÒ\u0001-\u001b\u008d\u009c=&\u0099\"Ø¨a¶\u0097°-U½E\u0018\u000e\u0099þn¶«ÁÅa<ðT\u000eéa:E\r\u001bóg¸\u0000\u008c\u0018±·rf@\u0003ì¼¼\u0091Û\u0010¹&NÑ\u0001pTQm\u0082\u001c\u0014\u0018)S\u009d\u0018÷\u0007Q ËÔìzü²â¥\u009eºÝä0Zªj(rpH\u0006rb\u0006¾X\u0007ï¯NcäÔl-mzI¶P¿Þ£Øõjv)\u0082ËèÔ_\u009cÚã< \u0080ñ\u009bQëÈ\u009dY´\u001eÁc\u009a\u009aû®sJ\u0010\u0003ÐK\u0010É'ÿ\u0013$\u0017\u0097\u0090Ö\u0010\u0089Ä\u001b\u009cPdÖ\u0088!VÉ^ä@i  ?\u0091%5¨æÔ\u0087&Ä\u0019ò´ÿ§ Ó:\u0015?N\u008cU®\u0098®Ù>< \u0006Å".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var34 = var15.substring(var13, var13 + var14);
         byte var36 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var34.getBytes("ISO-8859-1"));
            String var41 = b(var19).intern();
            switch(var36) {
            case 0:
               var18[var16++] = var41;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  e = new String[32];
                  n = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[17];
                  int var3 = 0;
                  String var4 = "Q;\u007fßvâ¤â¬æ\u001e\u0018Vg¡¤²:\u0002)\u0092\u00adJäQ\u001cz~^¢ v\u009a\tà9a·\u008bÂ³Æ-ë³:(ÆQ\u000b\u009e¯b¡Qµ\u008bª»¦têüãP\u0003 $\u0083E\u0094 'ýñJw\u0081WÔbê|N]´(¨Ó?\u0087ñÔÛ\u0015vÝ\u001e\u0096ï{î·[Øø\u0017uÒ§Ý\u0015]ôB7ç&T¶";
                  int var5 = "Q;\u007fßvâ¤â¬æ\u001e\u0018Vg¡¤²:\u0002)\u0092\u00adJäQ\u001cz~^¢ v\u009a\tà9a·\u008bÂ³Æ-ë³:(ÆQ\u000b\u009e¯b¡Qµ\u008bª»¦têüãP\u0003 $\u0083E\u0094 'ýñJw\u0081WÔbê|N]´(¨Ó?\u0087ñÔÛ\u0015vÝ\u001e\u0096ï{î·[Øø\u0017uÒ§Ý\u0015]ôB7ç&T¶".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var40 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                     long[] var37 = var6;
                     var40 = var3++;
                     long var43 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var44 = -1;

                     while(true) {
                        long var8 = var43;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var46 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var44) {
                        case 0:
                           var37[var40] = var46;
                           if (var2 >= var5) {
                              g = var6;
                              k = new Integer[17];
                              KProperty[] var33 = new KProperty[true.y<invokedynamic>(28674, 6493759108363335041L ^ var20)];
                              var33[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y9.class, true.t<invokedynamic>(15904, 3107552746870886827L ^ var20), true.t<invokedynamic>(32007, 8097588682034713236L ^ var20), 0)));
                              var33[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y9.class, true.t<invokedynamic>(21760, 4638166577053481604L ^ var20), true.t<invokedynamic>(16950, 3077159579188407727L ^ var20), 0)));
                              var33[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y9.class, true.t<invokedynamic>(27356, 8379059844012082500L ^ var20), true.t<invokedynamic>(30661, 4253586855789107280L ^ var20), 0)));
                              var33[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y9.class, true.t<invokedynamic>(9238, 1314437840885664648L ^ var20), true.t<invokedynamic>(28783, 6580605884428263397L ^ var20), 0)));
                              var33[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y9.class, true.t<invokedynamic>(14196, 452135829379471598L ^ var20), true.t<invokedynamic>(27786, 345078457350685455L ^ var20), 0)));
                              var33[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y9.class, true.t<invokedynamic>(25602, 8807706285346229149L ^ var20), true.t<invokedynamic>(29885, 3601060270287133487L ^ var20), 0)));
                              var33[true.y<invokedynamic>(5294, 173178225251471665L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y9.class, true.t<invokedynamic>(19614, 903138382818026257L ^ var20), true.t<invokedynamic>(16017, 1464860164495364362L ^ var20), 0)));
                              var33[true.y<invokedynamic>(12384, 3516667741537727986L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y9.class, true.t<invokedynamic>(17061, 5594506857826725177L ^ var20), true.t<invokedynamic>(9502, 5591951337869560466L ^ var20), 0)));
                              var33[true.y<invokedynamic>(27221, 8397424352357003212L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y9.class, true.t<invokedynamic>(30414, 5477288771945044295L ^ var20), true.t<invokedynamic>(3045, 2050535079605527652L ^ var20), 0)));
                              R = var33;
                              W = new y9(var26);
                              J = qi.o((il)W, true.t<invokedynamic>(10877, 2253036858261587435L ^ var20), true.y<invokedynamic>(28978, 5050872990481134759L ^ var20), new IntRange(0, true.y<invokedynamic>(1872, 1566045777689395912L ^ var20)), var22, (pj)null, (Function0)null, true.y<invokedynamic>(7578, 3795466917609560070L ^ var20), (Object)null);
                              d = qi.o((il)W, true.t<invokedynamic>(3463, 1248565986421432847L ^ var20), true.y<invokedynamic>(13009, 8202368490923652929L ^ var20), new IntRange(0, true.y<invokedynamic>(11102, 4458317144641203912L ^ var20)), var22, (pj)null, (Function0)null, true.y<invokedynamic>(2839, 3034592555040067203L ^ var20), (Object)null);
                              P = qi.R((il)W, true.t<invokedynamic>(30300, 8815900685663640030L ^ var20), true, (pj)null, (Function0)null, true.y<invokedynamic>(960, 5188707249887233623L ^ var20), var28, (Object)null);
                              L = qi.o((il)W, true.t<invokedynamic>(24158, 6810064820343910858L ^ var20), 1, new IntRange(1, true.y<invokedynamic>(28478, 4071205448585226916L ^ var20)), var22, (pj)null, (Function0)null, true.y<invokedynamic>(2839, 3034592555040067203L ^ var20), (Object)null);
                              U = qi.G((il)W, true.t<invokedynamic>(9178, 367169220813704281L ^ var20), r6.BOOLS, (Function0)null, var24, 4, (Object)null);
                              X = qi.R((il)W, true.t<invokedynamic>(14082, 4472921504702748819L ^ var20), true, W.y(var30, (short)var31, var32), (Function0)null, true.y<invokedynamic>(28798, 2862864531091109357L ^ var20), var28, (Object)null);
                              l = qi.R((il)W, true.t<invokedynamic>(14264, 6209717970182690853L ^ var20), false, W.y(var30, (short)var31, var32), (Function0)null, true.y<invokedynamic>(28798, 2862864531091109357L ^ var20), var28, (Object)null);
                              i = qi.R((il)W, true.t<invokedynamic>(15977, 652045295318356478L ^ var20), false, W.y(var30, (short)var31, var32), (Function0)null, true.y<invokedynamic>(28798, 2862864531091109357L ^ var20), var28, (Object)null);
                              x = qi.R((il)W, true.t<invokedynamic>(6180, 2400097038417262506L ^ var20), false, W.y(var30, (short)var31, var32), (Function0)null, true.y<invokedynamic>(28798, 2862864531091109357L ^ var20), var28, (Object)null);
                              M = new iv();
                              return;
                           }
                           break;
                        default:
                           var37[var40] = var46;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u000b\u0084\u001b\u0089q]6\u0006¦Ç¦U\u0087\u008e'\u0097";
                           var5 = "\u000b\u0084\u001b\u0089q]6\u0006¦Ç¦U\u0087\u008e'\u0097".length();
                           var2 = 0;
                        }

                        var40 = var2;
                        var2 += 8;
                        var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                        var37 = var6;
                        var40 = var3++;
                        var43 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var44 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var41;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u009cLH«\u0019\u00030Âpç\u009cn%!Ùa\u009di¦\u0096\u0099\u0083<8 æ\u0004N.Æ\u008aìyÉ¥Ô\u000b¾\u009a\r½\u0018ò¨ÑuE|´Õ9-ç¹\u001cAå";
               var17 = "\u009cLH«\u0019\u00030Âpç\u009cn%!Ùa\u009di¦\u0096\u0099\u0083<8 æ\u0004N.Æ\u008aìyÉ¥Ô\u000b¾\u009a\r½\u0018ò¨ÑuE|´Õ9-ç¹\u001cAå".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var34 = var15.substring(var13, var13 + var14);
            var36 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9111;
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
            throw new RuntimeException("su/catlean/y9", var10);
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
         throw new RuntimeException("su/catlean/y9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2439;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/y9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("su/catlean/y9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
