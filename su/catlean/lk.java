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
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class lk extends k9 {
   @NotNull
   public static final lk b;
   static final KProperty[] i;
   @NotNull
   private static final zr v;
   @NotNull
   private static final zr y;
   @NotNull
   private static final zr N;
   @NotNull
   private static final zv g;
   @NotNull
   private static final z0 L;
   @NotNull
   private static final z0 A;
   @NotNull
   private static final zc M;
   @NotNull
   private static final ArrayList U;
   @NotNull
   private static final ArrayList f;
   private static int[] x;
   private static final long c = j0.a(-1946330761185355368L, 7019465874679985852L, MethodHandles.lookup().lookupClass()).a(28465156872011L);
   private static final String[] d;
   private static final String[] e;
   private static final Map k;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;

   private lk(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 88501611691981L;
      super(var3, true.a<invokedynamic>(29961, 5312683642000588446L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final rq m(int var1, short var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
      long var10001 = var4 ^ 86336744998732L;
      int var6 = (int)((var4 ^ 86336744998732L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (rq)v.k((short)var6, this, i[0], (short)var7, var8);
   }

   private final s3 b(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 89968504126582L;
      int var3 = (int)((var1 ^ 89968504126582L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (s3)y.k((short)var3, this, i[1], (short)var4, var5);
   }

   private final a2 C(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 100312122138097L;
      int var3 = (int)((var1 ^ 100312122138097L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (a2)N.k((short)var3, this, i[2], (short)var4, var5);
   }

   private final Color I(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 127825029553631L;
      int var3 = (int)((var1 ^ 127825029553631L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)g.k((short)var3, this, i[3], (short)var4, var5);
   }

   private final int d(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 2381175981791L;
      int var3 = (int)((var1 ^ 2381175981791L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)L.k((short)var3, this, i[4], (short)var4, var5)).intValue();
   }

   private final int G(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 135997412574677L;
      int var3 = (int)((var1 ^ 135997412574677L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)A.k((short)var3, this, i[5], (short)var4, var5)).intValue();
   }

   private final float w(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 46821460156677L;
      int var3 = (int)((var1 ^ 46821460156677L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)M.k((short)var3, this, i[true.d<invokedynamic>(30067, 2189629350832045679L ^ var1)], (short)var4, var5)).floatValue();
   }

   @Flow
   private final void U(PlayerUpdateEvent var1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void N(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean U(b0 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private final void o(b0 param1, class_4587 param2, Quaternionfc param3, ib param4, long param5) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean Y() {
      long var0 = c ^ 93132076607282L;
      long var2 = var0 ^ 61122784504217L;

      boolean var10000;
      try {
         if (b.b(var2) == s3.CUSTOM) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, 2907627932080749432L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean o(b0 var0) {
      long var1 = c ^ 132867623966856L;
      long var3 = var1 ^ 15675056152490L;
      Intrinsics.checkNotNullParameter(var0, true.a<invokedynamic>(31705, 8502631631985197716L ^ var1));
      return b.U(var0, var3);
   }

   private static final boolean z(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean m(sd param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean T(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   public static final a2 v(long a, lk $this) {
      var0 ^= c;
      long var3 = var0 ^ 43190252003037L;
      return var2.C(var3);
   }

   public static final int X(long a, lk $this) {
      var0 ^= c;
      long var3 = var0 ^ 82947942740094L;
      return var2.G(var3);
   }

   public static final s3 H(lk $this, long a) {
      var1 ^= c;
      long var3 = var1 ^ 26348255649970L;
      return var0.b(var3);
   }

   public static final Color j(long a, lk $this) {
      var0 ^= c;
      long var3 = var0 ^ 49260937515262L;
      return var2.I(var3);
   }

   static {
      long var20 = c ^ 64409554850297L;
      long var22 = var20 ^ 57477999423864L;
      long var24 = var20 ^ 66206107989320L;
      long var26 = var20 ^ 36338635683917L;
      long var28 = var20 ^ 78330267648937L;
      long var30 = var20 ^ 41176246289052L;
      k = new HashMap(13);
      null.A<invokedynamic>((Object)null, -2393493400338170868L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[35];
      int var16 = 0;
      String var15 = "¶iïÑ(\u0089\u0018}@~hÔ\u0081U\u0086{\u009f÷Ã#Ò\u008ab$/4Â\u009fÁ\u0080\u008a\t ÄPó[ÉïÙ\u0087\u0004\u0096\u0081\u009f\u0019ë\f³e,º\u000fë\u0004ìÖ\rÂ0$ÍÂë\u0085 o¬\u008f\t²ÇÓÃL\u00199wÀÍ\u0082þAÎ\u001b\u008f j\u001cûø\u0004ª¦\t't=\u0010g¢»è.õ:Üî\u0004ÿ«®\u009dî£\u0010¥f'\u00035¯U\u0097Á!¥\u0017\u0011\u001bh-\u0010b\\¢\u0010\u008b*-Ì¬\u0014ú\u0013¼ÚL\u009e\u0010ÓbL@r¦6{N\u001d3(T\u009d¢j\u0018Í;,\u0003uý-ik\u0095|µë^<÷\u0003B\u0091\u009fH¸\fj ã\u000fàJë³.G\u0018 9r$?O\u0014ñå\u0099öÖ>Xéä\u0087Ì¾\u0086Q\n>\u0010sä\u000b´-\u001eö³\u0085TÂl&~t\u00068ØÆ\u0081æ0TZ>e¿\u008cqw%¼³pà½K¦$Úñ\u0098\u0089ñÑÌþ¡U\u0018è5\u001f:ÛÔ\u0097.\"FL:ÛÅ\u0089!\u009fh\u009câWÛÖ(T_ùg\u008cÑZiÞ\u0016ù\u0087\u001a?Tá¸ÑQw\u0086ZÅh\u0017\u0002á\u0007½ F¶\u0093åÉ*öH\u0099X\u0010ç@\u001f\u007f¬\u0097E\u0097À½avúô;\"( ?}ý4sµV«}=\u0016³\u0098º{¾ïVvß'éD\u0016[%¦1.J:oäk§\\ºE] \u0082?\u008di1½\u0082to\u0093\u000b\u0014+±d\u008d\u000b¶E¼Uðm ±B\u0003¥PfÛæ\u0010ûG»\u0011\u0001Bï(\u008eÔõ\u0096\u0007]9;\u0010ÁS×¾\u001f¬wåfRÙ`²ªòö\u0010\u00945a,*:j\\\u009d\u0000â43K\u001a\u001e ýQßÏenI\u008a6Sû|\u0083b\u0080;º\u008f\u0086_³q\u0087Õ¼\fh¼\u0099bëý\u0018]¿\u009f°[ó·\u0097\u001c4p\u001f»QEÉ¸ú2\u0098ÃR`\u0004\u0018÷\u0007\r,\u009eT\u0098\u0082\u009b\u008c8d\u001d|\u001dx\u00963qF¾\u009fp\u0015(òÄ\u009e§Êä\u0004\fÈ\u000fó\u0007¤\u0085\u0092¡·ßºâm!\u0090\u0088ãÅ%$Ï\u0016è\u0095\u009dà\u000eè\"(Ë< \u001fÊ¦(\u0005\u009b!¥\u0000Wu\u0002ë\u008a\u0098è6Åæ\u001c8]>\u000ePvÝ¾.ÝòD8^üú`ÒQ¾ÕÉ¬ü¿Lü«\u0092§ lþ\b!'â/oæF\u001fÀÀp´ÿ¡#\u0087úà\u008a2}hî b¥Âµ<A(\u0093ý\u0010d\u0090\u0016\u0091hÈ\u001bÅ¸8\u0091'þ=iÞ#\u0088EoÒ\u001cé\u0091$ºMU\u009bÒ|feÌØJÀ)c·É>4Q·ìÝ\u00833Ø¢È£Aoc7¡À\tñønB¶ÜÅÏê~ðÇguÒ×)üJÙî\u0012FÒ\u0003Z&8\u00923«\u009ef\u0004cg\u0002Ó[É\u008c\u0086IÐ\u0018÷¾ÇÒ\u0005\u008a3+\u000bgQÛòòr\u0081¨x\u0092\u009f2r\u000bu\n\u009a¯@\u0004\"\\Ð\u001b\u009c\u0086Ô`\u0092\u0000Ôª8&d3\u008e.\bÎ¼éNn²\u007f85Ý½\u0084¬\u008a½ÍúW9Ñ(vgo\tAt\u0084\u0014¦\u0093È*Ûr\r43â-%\u000b\u009e!õÊbã-D U\u000304d\u0002A-Z×©\bcxÅzôk»Í\u000e(çÓÖ¶>eRÙ\u007f\u0087\u0010ÇÃ\u001b\u00154G\u0090'ô.àþ\u001eX~¹\u0010ñ\u008d\u0012p8\u0007.Ê½\u0010p,U\u009fì\u0098(ô3;Î\u0091q?GZáê.ÇaÇãq\u0081\u0088\u008fÀ©A\u0014Ôf\u0093½.U\u0094k\u0088k\u000eô\u0080§\u0017¼\u0010LPvÕ\u008f\u009bÙ =ÐF9¢ù±§\u0010°h¾ß'Ðó\u00942\u0005\u0004(O\u0097\u001aÛ\u0010Q3\u0080aBm.å¾?NlÚt\u008bå";
      int var17 = "¶iïÑ(\u0089\u0018}@~hÔ\u0081U\u0086{\u009f÷Ã#Ò\u008ab$/4Â\u009fÁ\u0080\u008a\t ÄPó[ÉïÙ\u0087\u0004\u0096\u0081\u009f\u0019ë\f³e,º\u000fë\u0004ìÖ\rÂ0$ÍÂë\u0085 o¬\u008f\t²ÇÓÃL\u00199wÀÍ\u0082þAÎ\u001b\u008f j\u001cûø\u0004ª¦\t't=\u0010g¢»è.õ:Üî\u0004ÿ«®\u009dî£\u0010¥f'\u00035¯U\u0097Á!¥\u0017\u0011\u001bh-\u0010b\\¢\u0010\u008b*-Ì¬\u0014ú\u0013¼ÚL\u009e\u0010ÓbL@r¦6{N\u001d3(T\u009d¢j\u0018Í;,\u0003uý-ik\u0095|µë^<÷\u0003B\u0091\u009fH¸\fj ã\u000fàJë³.G\u0018 9r$?O\u0014ñå\u0099öÖ>Xéä\u0087Ì¾\u0086Q\n>\u0010sä\u000b´-\u001eö³\u0085TÂl&~t\u00068ØÆ\u0081æ0TZ>e¿\u008cqw%¼³pà½K¦$Úñ\u0098\u0089ñÑÌþ¡U\u0018è5\u001f:ÛÔ\u0097.\"FL:ÛÅ\u0089!\u009fh\u009câWÛÖ(T_ùg\u008cÑZiÞ\u0016ù\u0087\u001a?Tá¸ÑQw\u0086ZÅh\u0017\u0002á\u0007½ F¶\u0093åÉ*öH\u0099X\u0010ç@\u001f\u007f¬\u0097E\u0097À½avúô;\"( ?}ý4sµV«}=\u0016³\u0098º{¾ïVvß'éD\u0016[%¦1.J:oäk§\\ºE] \u0082?\u008di1½\u0082to\u0093\u000b\u0014+±d\u008d\u000b¶E¼Uðm ±B\u0003¥PfÛæ\u0010ûG»\u0011\u0001Bï(\u008eÔõ\u0096\u0007]9;\u0010ÁS×¾\u001f¬wåfRÙ`²ªòö\u0010\u00945a,*:j\\\u009d\u0000â43K\u001a\u001e ýQßÏenI\u008a6Sû|\u0083b\u0080;º\u008f\u0086_³q\u0087Õ¼\fh¼\u0099bëý\u0018]¿\u009f°[ó·\u0097\u001c4p\u001f»QEÉ¸ú2\u0098ÃR`\u0004\u0018÷\u0007\r,\u009eT\u0098\u0082\u009b\u008c8d\u001d|\u001dx\u00963qF¾\u009fp\u0015(òÄ\u009e§Êä\u0004\fÈ\u000fó\u0007¤\u0085\u0092¡·ßºâm!\u0090\u0088ãÅ%$Ï\u0016è\u0095\u009dà\u000eè\"(Ë< \u001fÊ¦(\u0005\u009b!¥\u0000Wu\u0002ë\u008a\u0098è6Åæ\u001c8]>\u000ePvÝ¾.ÝòD8^üú`ÒQ¾ÕÉ¬ü¿Lü«\u0092§ lþ\b!'â/oæF\u001fÀÀp´ÿ¡#\u0087úà\u008a2}hî b¥Âµ<A(\u0093ý\u0010d\u0090\u0016\u0091hÈ\u001bÅ¸8\u0091'þ=iÞ#\u0088EoÒ\u001cé\u0091$ºMU\u009bÒ|feÌØJÀ)c·É>4Q·ìÝ\u00833Ø¢È£Aoc7¡À\tñønB¶ÜÅÏê~ðÇguÒ×)üJÙî\u0012FÒ\u0003Z&8\u00923«\u009ef\u0004cg\u0002Ó[É\u008c\u0086IÐ\u0018÷¾ÇÒ\u0005\u008a3+\u000bgQÛòòr\u0081¨x\u0092\u009f2r\u000bu\n\u009a¯@\u0004\"\\Ð\u001b\u009c\u0086Ô`\u0092\u0000Ôª8&d3\u008e.\bÎ¼éNn²\u007f85Ý½\u0084¬\u008a½ÍúW9Ñ(vgo\tAt\u0084\u0014¦\u0093È*Ûr\r43â-%\u000b\u009e!õÊbã-D U\u000304d\u0002A-Z×©\bcxÅzôk»Í\u000e(çÓÖ¶>eRÙ\u007f\u0087\u0010ÇÃ\u001b\u00154G\u0090'ô.àþ\u001eX~¹\u0010ñ\u008d\u0012p8\u0007.Ê½\u0010p,U\u009fì\u0098(ô3;Î\u0091q?GZáê.ÇaÇãq\u0081\u0088\u008fÀ©A\u0014Ôf\u0093½.U\u0094k\u0088k\u000eô\u0080§\u0017¼\u0010LPvÕ\u008f\u009bÙ =ÐF9¢ù±§\u0010°h¾ß'Ðó\u00942\u0005\u0004(O\u0097\u001aÛ\u0010Q3\u0080aBm.å¾?NlÚt\u008bå".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var33 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var33.getBytes("ISO-8859-1"));
            String var40 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var40;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[35];
                  n = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[18];
                  int var3 = 0;
                  String var4 = "»'AÒë=Þ!\u00157wÌ+?vÕ5:,Ô$\f²Â\u009aí[äR>ÌGÖþ\u001b¥¡½à?qIJ\u0013ÆáTþ\u0091FÂÛêêÕcÆïoø+ÁvËvê\u000e\u0097$\u001fbnô0\nÙ¾º³CöëNBË»¢_GU\u0007æÚ4µ\u009a\u009fåû¬£Ã7ÿ\u0096\u0013Fâ`\u0016\u008c\u0094ôRæ×\u0095\"ï¢\u0007Rm}Ü .\u0018";
                  int var5 = "»'AÒë=Þ!\u00157wÌ+?vÕ5:,Ô$\f²Â\u009aí[äR>ÌGÖþ\u001b¥¡½à?qIJ\u0013ÆáTþ\u0091FÂÛêêÕcÆïoø+ÁvËvê\u000e\u0097$\u001fbnô0\nÙ¾º³CöëNBË»¢_GU\u0007æÚ4µ\u009a\u009fåû¬£Ã7ÿ\u0096\u0013Fâ`\u0016\u008c\u0094ôRæ×\u0095\"ï¢\u0007Rm}Ü .\u0018".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var38 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                     long[] var36 = var6;
                     var38 = var3++;
                     long var42 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var43 = -1;

                     while(true) {
                        long var8 = var42;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var45 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var43) {
                        case 0:
                           var36[var38] = var45;
                           if (var2 >= var5) {
                              l = var6;
                              m = new Integer[18];
                              KProperty[] var32 = new KProperty[true.d<invokedynamic>(27427, 8185252359444393214L ^ var20)];
                              var32[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lk.class, true.a<invokedynamic>(7469, 2960735937704717588L ^ var20), true.a<invokedynamic>(17370, 2112426056252240892L ^ var20), 0)));
                              var32[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lk.class, true.a<invokedynamic>(11051, 597361661646166838L ^ var20), true.a<invokedynamic>(4369, 8213593451704672566L ^ var20), 0)));
                              var32[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lk.class, true.a<invokedynamic>(29855, 7352670911854838972L ^ var20), true.a<invokedynamic>(4610, 7648052292199375402L ^ var20), 0)));
                              var32[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lk.class, true.a<invokedynamic>(17098, 5082890820901679850L ^ var20), true.a<invokedynamic>(21799, 5544367543676740882L ^ var20), 0)));
                              var32[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lk.class, true.a<invokedynamic>(28002, 1893005854358576509L ^ var20), true.a<invokedynamic>(29393, 4995497265281204975L ^ var20), 0)));
                              var32[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lk.class, true.a<invokedynamic>(7507, 7197658135364332910L ^ var20), true.a<invokedynamic>(7204, 3937537571688967176L ^ var20), 0)));
                              var32[true.d<invokedynamic>(10100, 1304435303384588459L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lk.class, true.a<invokedynamic>(19274, 5280367596170984299L ^ var20), true.a<invokedynamic>(12364, 2495309789479288937L ^ var20), 0)));
                              i = var32;
                              b = new lk(var24);
                              v = qi.M((il)b, true.a<invokedynamic>(20368, 8657105015396646847L ^ var20), (Enum)rq.SNOW_FLAKE, (pj)null, (Function0)null, true.d<invokedynamic>(10670, 6136712033065021053L ^ var20), (Object)null, var26);
                              y = qi.M((il)b, true.a<invokedynamic>(27836, 2873990818023447701L ^ var20), (Enum)s3.SYNC, (pj)null, (Function0)null, true.d<invokedynamic>(13562, 6617738369284616998L ^ var20), (Object)null, var26);
                              N = qi.M((il)b, true.a<invokedynamic>(30904, 7836817374655219868L ^ var20), (Enum)a2.FLY, (pj)null, (Function0)null, true.d<invokedynamic>(13562, 6617738369284616998L ^ var20), (Object)null, var26);
                              il var37 = (il)b;
                              String var35 = 6838.a<invokedynamic>(6838, 6239832295746824845L ^ var20);
                              Color var46 = Color.WHITE;
                              Intrinsics.checkNotNullExpressionValue(var46, true.a<invokedynamic>(9074, 1961181110668907332L ^ var20));
                              g = qi.F(var37, var35, var46, (pj)null, lk::Y, 4, var30, (Object)null);
                              L = qi.o((il)b, true.a<invokedynamic>(7162, 4899344802998053834L ^ var20), true.d<invokedynamic>(20973, 9207039712201496108L ^ var20), new IntRange(1, true.d<invokedynamic>(20140, 7180823303336184178L ^ var20)), var22, (pj)null, (Function0)null, true.d<invokedynamic>(79, 8070394860347557782L ^ var20), (Object)null);
                              A = qi.o((il)b, true.a<invokedynamic>(20583, 1568280532924440669L ^ var20), true.d<invokedynamic>(30417, 4784735887112925457L ^ var20), new IntRange(5, true.d<invokedynamic>(20973, 7770605853805270585L ^ var20)), var22, (pj)null, (Function0)null, true.d<invokedynamic>(15206, 8912135693891550385L ^ var20), (Object)null);
                              M = qi.g((il)b, true.a<invokedynamic>(31227, 3836064373262846421L ^ var20), 1.0F, RangesKt.rangeTo(0.1F, 1.5F), (pj)null, (Function0)null, true.d<invokedynamic>(15206, 8912135693891550385L ^ var20), var28, (Object)null);
                              U = new ArrayList();
                              f = new ArrayList();
                              return;
                           }
                           break;
                        default:
                           var36[var38] = var45;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u000b\u0098@À\u008b\u000b\u0018Æ\u001c1\n\u0003½\u009bÈ«";
                           var5 = "\u000b\u0098@À\u008b\u000b\u0018Æ\u001c1\n\u0003½\u009bÈ«".length();
                           var2 = 0;
                        }

                        var38 = var2;
                        var2 += 8;
                        var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                        var36 = var6;
                        var38 = var3++;
                        var42 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var43 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var40;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "R\u0005R±úöc\bcÂàX²#z]±\b}÷Y\u0086\u0019æ\u0084D\u009d>-7öÍ\u0010\u009a4Ìn\u008c+\u0010b}\u0096¸\u0088\"\u001e\u009d5";
               var17 = "R\u0005R±úöc\bcÂàX²#z]±\b}÷Y\u0086\u0019æ\u0084D\u009d>-7öÍ\u0010\u009a4Ìn\u008c+\u0010b}\u0096¸\u0088\"\u001e\u009d5".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var33 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void u(int[] var0) {
      x = var0;
   }

   public static int[] s() {
      return x;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12065;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])k.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/lk", var10);
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
         throw new RuntimeException("su/catlean/lk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22735;
      if (m[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = l[var3];
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
            throw new RuntimeException("su/catlean/lk", var14);
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
         throw new RuntimeException("su/catlean/lk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
