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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum p8 {
   public static final p8 AM;
   public static final p8 AR;
   public static final p8 EU;
   public static final p8 BN;
   public static final p8 BG;
   public static final p8 CA;
   public static final p8 CHR;
   public static final p8 HR;
   public static final p8 CS;
   public static final p8 DA;
   public static final p8 NL;
   public static final p8 EN;
   public static final p8 ET;
   public static final p8 FIL;
   public static final p8 FI;
   public static final p8 FR;
   public static final p8 DE;
   public static final p8 EL;
   public static final p8 GU;
   public static final p8 IW;
   public static final p8 HI;
   public static final p8 HU;
   public static final p8 IS;
   public static final p8 ID;
   public static final p8 IT;
   public static final p8 JA;
   public static final p8 KN;
   public static final p8 KO;
   public static final p8 LV;
   public static final p8 LT;
   public static final p8 MS;
   public static final p8 ML;
   public static final p8 MR;
   public static final p8 NO;
   public static final p8 PL;
   public static final p8 RO;
   public static final p8 RU;
   public static final p8 SR;
   public static final p8 SK;
   public static final p8 SL;
   public static final p8 ES;
   public static final p8 SW;
   public static final p8 SV;
   public static final p8 TA;
   public static final p8 TE;
   public static final p8 TH;
   public static final p8 TR;
   public static final p8 UR;
   public static final p8 UK;
   public static final p8 VI;
   public static final p8 CY;
   public static final p8 CN;
   private static final p8[] T;
   private static final EnumEntries c;
   private static String[] D;
   private static final long a = j0.a(2881826833239424316L, 1818273639825636197L, MethodHandles.lookup().lookupClass()).a(47030179791386L);
   private static final long[] b;
   private static final Integer[] d;
   private static final Map e;

   @NotNull
   public static EnumEntries i() {
      return c;
   }

   private static final p8[] v(long var0) {
      var0 ^= a;
      p8[] var2 = new p8[true.b<invokedynamic>(4086, 6063372278371227424L ^ var0)];
      var2[0] = AM;
      var2[1] = AR;
      var2[2] = EU;
      var2[3] = BN;
      var2[4] = BG;
      var2[5] = CA;
      var2[true.b<invokedynamic>(11563, 4839428079724639743L ^ var0)] = CHR;
      var2[true.b<invokedynamic>(23853, 6852944532082443652L ^ var0)] = HR;
      var2[true.b<invokedynamic>(11193, 8135669572646941449L ^ var0)] = CS;
      var2[true.b<invokedynamic>(1424, 4769648514888899875L ^ var0)] = DA;
      var2[true.b<invokedynamic>(26589, 797459762429427507L ^ var0)] = NL;
      var2[true.b<invokedynamic>(3232, 5360360802397000808L ^ var0)] = EN;
      var2[true.b<invokedynamic>(3986, 3646920862454028136L ^ var0)] = ET;
      var2[true.b<invokedynamic>(20771, 7404300731217103324L ^ var0)] = FIL;
      var2[true.b<invokedynamic>(8466, 2879113328746052081L ^ var0)] = FI;
      var2[true.b<invokedynamic>(27924, 2784203626350605811L ^ var0)] = FR;
      var2[true.b<invokedynamic>(10767, 883683289817199341L ^ var0)] = DE;
      var2[true.b<invokedynamic>(10900, 1260280918498620024L ^ var0)] = EL;
      var2[true.b<invokedynamic>(11712, 8610940488702244124L ^ var0)] = GU;
      var2[true.b<invokedynamic>(23949, 4869563000580490570L ^ var0)] = IW;
      var2[true.b<invokedynamic>(6588, 4688482616032690451L ^ var0)] = HI;
      var2[true.b<invokedynamic>(10955, 823817723703767598L ^ var0)] = HU;
      var2[true.b<invokedynamic>(12633, 1605308885241604507L ^ var0)] = IS;
      var2[true.b<invokedynamic>(29114, 4503565344707438939L ^ var0)] = ID;
      var2[true.b<invokedynamic>(22460, 7303965413066657626L ^ var0)] = IT;
      var2[true.b<invokedynamic>(26614, 9185183267321970489L ^ var0)] = JA;
      var2[true.b<invokedynamic>(1649, 2306541354354581163L ^ var0)] = KN;
      var2[true.b<invokedynamic>(10891, 4962000422427898418L ^ var0)] = KO;
      var2[true.b<invokedynamic>(25246, 8547336311518952062L ^ var0)] = LV;
      var2[true.b<invokedynamic>(6114, 7986267143269945097L ^ var0)] = LT;
      var2[true.b<invokedynamic>(579, 6913849739178646247L ^ var0)] = MS;
      var2[true.b<invokedynamic>(21557, 3311723891972033766L ^ var0)] = ML;
      var2[true.b<invokedynamic>(24840, 686442762200283616L ^ var0)] = MR;
      var2[true.b<invokedynamic>(5866, 897965828098035238L ^ var0)] = NO;
      var2[true.b<invokedynamic>(26747, 7826523839906836642L ^ var0)] = PL;
      var2[true.b<invokedynamic>(695, 7698967052138224201L ^ var0)] = RO;
      var2[true.b<invokedynamic>(4516, 4458892182801811739L ^ var0)] = RU;
      var2[true.b<invokedynamic>(6131, 3507140059160383260L ^ var0)] = SR;
      var2[true.b<invokedynamic>(23392, 4792985643862246327L ^ var0)] = SK;
      var2[true.b<invokedynamic>(20756, 1852503264237570474L ^ var0)] = SL;
      var2[true.b<invokedynamic>(31887, 6165787052736275570L ^ var0)] = ES;
      var2[true.b<invokedynamic>(13523, 6376933101774875690L ^ var0)] = SW;
      var2[true.b<invokedynamic>(30419, 8493358286761356829L ^ var0)] = SV;
      var2[true.b<invokedynamic>(21152, 3322782210601732620L ^ var0)] = TA;
      var2[true.b<invokedynamic>(621, 6776923117482154712L ^ var0)] = TE;
      var2[true.b<invokedynamic>(16551, 3429757571231832142L ^ var0)] = TH;
      var2[true.b<invokedynamic>(29151, 6811345557629462837L ^ var0)] = TR;
      var2[true.b<invokedynamic>(24772, 4273233308244408369L ^ var0)] = UR;
      var2[true.b<invokedynamic>(29805, 603625476588203176L ^ var0)] = UK;
      var2[true.b<invokedynamic>(18591, 4793389056403525721L ^ var0)] = VI;
      var2[true.b<invokedynamic>(23985, 8584438164834108789L ^ var0)] = CY;
      var2[true.b<invokedynamic>(20951, 6651510086473566511L ^ var0)] = CN;
      return var2;
   }

   static {
      long var20 = a ^ 40781950849950L;
      long var22 = var20 ^ 5168648819044L;
      if (1149790761498263593L.A<invokedynamic>(1149790761498263593L, var20) == null) {
         (new String[3]).A<invokedynamic>(new String[3], 1124135092607988249L, var20);
      }

      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[52];
      int var17 = 0;
      String var16 = "ðÀ\u0014'ÖòÙE\b\u0004Õ¿ò\u0017t\u0002²\bA\u0087\u0012ào&M\u0081\bF\u0095¤í6Ï\u0004P\bøqÕy±\u0082¤ö\bc¥Óm\r\u009f\u009d8\bË¿ª=\u0018® \u009b\b<\u0080<\u0096ÈG\u001d>\bæ\u0098ñÙaÚÈ\u0011\b'\u0018«¤Ò\u0010È>\bÈ\u0080/§Á×æø\b\u0006»¸\u0010\rY\u001fÊ\bù\u000bRüM}¢\u0092\biúîÐó\u0017\\½\b\u008b¿Ù\u009b\r\u0012\u008c\f\b!t°_KÂ£Å\b\u001b³p¾W?$\u0015\bC[y-à0\fo\bÌ#§áãÞ|§\b«\u001cÐòíOáì\b\u0002ü¼<ù$ïÝ\bÐÏ\u0002XÊ}\u009bC\b_ZS±\u001d\"(7\b\u0016³é÷´ò\u0083(\bÛ\u009fð±tEÌ\u0004\bÖz\u0019Q\u0090?ª\u0082\bdó¶/a\u0089l\u009f\bêÏ,pº|\u0003\u000f\b\u008dlµ Ñä\u0094\u0096\bMÿ2 \n05â\bu\u007f+\f\u0093U¦z\b~)á·^Î\u0015#\b~\ry\u0002\u0004H|\u0095\b%\u0018¬ø'ï]Ä\b+\u000b\u001dãz\u0092u2\b\u009f \u0015bÆì\b\u008e\b\u0095³oU¶¨ Ü\b2\u009aS\u0097}\u009d\u009aÕ\b\u0083ì¾pþ\n\u0092Ó\bÈ:@\u009d\u008a\u0089\u0007j\b\u0006\u0088\u0000\u00143\rëë\bK\u008dÕA\u0007\u008e\u0011]\bfI\u0098ÿ\"9Ü\u0097\bèHâÆü¹|\n\b\nÔmí\u0016\u009c\u0012ü\b\u009f\u0096P?Hj&È\b¿\u009eßé\u000eÀ·\u008c\b\u0094ûA\u0005Â\u0007\u0092ñ\bÅÞòjµö\u0013ô\b¢a\u0019Häµm%";
      int var18 = "ðÀ\u0014'ÖòÙE\b\u0004Õ¿ò\u0017t\u0002²\bA\u0087\u0012ào&M\u0081\bF\u0095¤í6Ï\u0004P\bøqÕy±\u0082¤ö\bc¥Óm\r\u009f\u009d8\bË¿ª=\u0018® \u009b\b<\u0080<\u0096ÈG\u001d>\bæ\u0098ñÙaÚÈ\u0011\b'\u0018«¤Ò\u0010È>\bÈ\u0080/§Á×æø\b\u0006»¸\u0010\rY\u001fÊ\bù\u000bRüM}¢\u0092\biúîÐó\u0017\\½\b\u008b¿Ù\u009b\r\u0012\u008c\f\b!t°_KÂ£Å\b\u001b³p¾W?$\u0015\bC[y-à0\fo\bÌ#§áãÞ|§\b«\u001cÐòíOáì\b\u0002ü¼<ù$ïÝ\bÐÏ\u0002XÊ}\u009bC\b_ZS±\u001d\"(7\b\u0016³é÷´ò\u0083(\bÛ\u009fð±tEÌ\u0004\bÖz\u0019Q\u0090?ª\u0082\bdó¶/a\u0089l\u009f\bêÏ,pº|\u0003\u000f\b\u008dlµ Ñä\u0094\u0096\bMÿ2 \n05â\bu\u007f+\f\u0093U¦z\b~)á·^Î\u0015#\b~\ry\u0002\u0004H|\u0095\b%\u0018¬ø'ï]Ä\b+\u000b\u001dãz\u0092u2\b\u009f \u0015bÆì\b\u008e\b\u0095³oU¶¨ Ü\b2\u009aS\u0097}\u009d\u009aÕ\b\u0083ì¾pþ\n\u0092Ó\bÈ:@\u009d\u008a\u0089\u0007j\b\u0006\u0088\u0000\u00143\rëë\bK\u008dÕA\u0007\u008e\u0011]\bfI\u0098ÿ\"9Ü\u0097\bèHâÆü¹|\n\b\nÔmí\u0016\u009c\u0012ü\b\u009f\u0096P?Hj&È\b¿\u009eßé\u000eÀ·\u008c\b\u0094ûA\u0005Â\u0007\u0092ñ\bÅÞòjµö\u0013ô\b¢a\u0019Häµm%".length();
      char var15 = '\b';
      int var14 = -1;

      label58:
      while(true) {
         ++var14;
         String var24 = var16.substring(var14, var14 + var15);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = a(var19).intern();
            switch(var10001) {
            case 0:
               var11[var17++] = var30;
               if ((var14 += var15) >= var18) {
                  e = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[93];
                  int var3 = 0;
                  String var4 = "ïö\u001c=\u0090JZTYGäÏß\u000e\u0083 áþæ\u0087õ\u0090\u001elÃ¤¬0Ï\u0016Öf\u0019\u001a.ÅM\u009fð\u001aÎW\n\u0086ì<¥òÓA¼\rcÓ6È í\u0088\u0007~0ß\u0087ê\u0001 \u0086i²\u008f&eùÖÜXq;*\u0002¢\u0004<oí\u0095rK\u0080o\u007fÕ§ë\u0089ÚÕSÃ5\u0082Ä³|BíÞ\u0016RÑP;Gô\u0006\u0015z\u007f¯þ·\u001fÔ{Ú8¸S¢{\u001b»úã/Ñÿ\nÍ$\u0003%\u001dÈ\u009e;ï\u0004ÝpE\u001b2\u0095\u0097\u0098¦æ{Ö\b\u0005}ØíC{6ñoìi\fÐïu¹\\ÞäÐV:È\u000eFV:(ÉE¹\"\u0093h½\u0092|\u0083ý5B[ò\u0002>ænß²\u0099·8fÊèfA3HXù\\\u0098EÖ´JE ÀÐvë\u0083Ë\u0081¢Hls/s§mà\u0084`}\u008d¡_~ù\u0012¶\u008a\u000f:GL\u0005(Ç\u0081¬O\u000e\u0080\"=Ñ¦/ÕN\u001d*I4\u0098a\u008d\u0006P3ha\u009b\u0089ÙdwÀâþ\u008cN$\u008b\u0088D¸\u0080±\u001c\u0013|\u0089'ïÙyd\bôcT\u001e¼²pË\u0010\u0016\u009f/Qüö\u001còìFUñ\u0018r¾é\u008e\u0004\u0096l!\u0001\u0088´«(g»ä4Ë[Þ×;ãÊ±OIéä²Ï\u0086à.Ú\bhR/y±jÏ×\u007fÛb\u0001\u0093\u001e:Hm\u009a©8GØBx\u0014^\u0017ii\u0099ÇR_°P¸99cá\u0005ö9\f;Z#lDM\u0088U\u007fêËÝÒ3zÐ>%t\u0091>À\u0086ñ\u0088óÊÛ\u000båÐ¢ÿ\r*ë\u0005ÜF¿V-ñ+¾\u0094´\u0085Yf$öÕPB5Ù¸²&YÂ°\u0016j¿8ë\rãR\u0093\u0001¡ô\u0002b\u0017à\u00947\u001f\"Þ±\u0084ÉïD\u0015¤\n/upè7¡\u000bj\u001eª?\u00978&u\u0000\u0098bõ\u0085_Ú\u009e\u0092\u0000\u000bÚ\u0016\u0095ê'x¡\n´\u008dõÃ9\u0089¿oC·\u00adÑA\u0002T1á5<íNpJ[V¡\b\t\u0096«ÖrºÔª¿\u001a\u0086\u009f_\u001bg.GZùå2¡@v\b$á%ÐÆÚ²®\u009f&ù¼¥OÔÞz;\u0007ê¼o#\u001d}\u0001¸»6Dð7±\u008c°ÐF\u009a\u00935Ü2®\u008d\u0087¿\fs)¾\u0006ú9ëÁ\u0082g×\u0081äÊ\u0003Å(è\u0013\u0010³\u008cÂ¤\u009e\u0017\u00038Òü/F¹\u0006\u0081J\u0098g\fUEjiðÖ_$ZáÍ[É\u009e'§Îd]TTg\u0088ùÑ[5\u0007*¸\u001c\u0089\u0007ô¿\u009dsÛe\t=òU\u0095èÔ";
                  int var5 = "ïö\u001c=\u0090JZTYGäÏß\u000e\u0083 áþæ\u0087õ\u0090\u001elÃ¤¬0Ï\u0016Öf\u0019\u001a.ÅM\u009fð\u001aÎW\n\u0086ì<¥òÓA¼\rcÓ6È í\u0088\u0007~0ß\u0087ê\u0001 \u0086i²\u008f&eùÖÜXq;*\u0002¢\u0004<oí\u0095rK\u0080o\u007fÕ§ë\u0089ÚÕSÃ5\u0082Ä³|BíÞ\u0016RÑP;Gô\u0006\u0015z\u007f¯þ·\u001fÔ{Ú8¸S¢{\u001b»úã/Ñÿ\nÍ$\u0003%\u001dÈ\u009e;ï\u0004ÝpE\u001b2\u0095\u0097\u0098¦æ{Ö\b\u0005}ØíC{6ñoìi\fÐïu¹\\ÞäÐV:È\u000eFV:(ÉE¹\"\u0093h½\u0092|\u0083ý5B[ò\u0002>ænß²\u0099·8fÊèfA3HXù\\\u0098EÖ´JE ÀÐvë\u0083Ë\u0081¢Hls/s§mà\u0084`}\u008d¡_~ù\u0012¶\u008a\u000f:GL\u0005(Ç\u0081¬O\u000e\u0080\"=Ñ¦/ÕN\u001d*I4\u0098a\u008d\u0006P3ha\u009b\u0089ÙdwÀâþ\u008cN$\u008b\u0088D¸\u0080±\u001c\u0013|\u0089'ïÙyd\bôcT\u001e¼²pË\u0010\u0016\u009f/Qüö\u001còìFUñ\u0018r¾é\u008e\u0004\u0096l!\u0001\u0088´«(g»ä4Ë[Þ×;ãÊ±OIéä²Ï\u0086à.Ú\bhR/y±jÏ×\u007fÛb\u0001\u0093\u001e:Hm\u009a©8GØBx\u0014^\u0017ii\u0099ÇR_°P¸99cá\u0005ö9\f;Z#lDM\u0088U\u007fêËÝÒ3zÐ>%t\u0091>À\u0086ñ\u0088óÊÛ\u000båÐ¢ÿ\r*ë\u0005ÜF¿V-ñ+¾\u0094´\u0085Yf$öÕPB5Ù¸²&YÂ°\u0016j¿8ë\rãR\u0093\u0001¡ô\u0002b\u0017à\u00947\u001f\"Þ±\u0084ÉïD\u0015¤\n/upè7¡\u000bj\u001eª?\u00978&u\u0000\u0098bõ\u0085_Ú\u009e\u0092\u0000\u000bÚ\u0016\u0095ê'x¡\n´\u008dõÃ9\u0089¿oC·\u00adÑA\u0002T1á5<íNpJ[V¡\b\t\u0096«ÖrºÔª¿\u001a\u0086\u009f_\u001bg.GZùå2¡@v\b$á%ÐÆÚ²®\u009f&ù¼¥OÔÞz;\u0007ê¼o#\u001d}\u0001¸»6Dð7±\u008c°ÐF\u009a\u00935Ü2®\u008d\u0087¿\fs)¾\u0006ú9ëÁ\u0082g×\u0081äÊ\u0003Å(è\u0013\u0010³\u008cÂ¤\u009e\u0017\u00038Òü/F¹\u0006\u0081J\u0098g\fUEjiðÖ_$ZáÍ[É\u009e'§Îd]TTg\u0088ùÑ[5\u0007*¸\u001c\u0089\u0007ô¿\u009dsÛe\t=òU\u0095èÔ".length();
                  int var2 = 0;

                  label40:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var27[var28] = var35;
                           if (var2 >= var5) {
                              b = var6;
                              d = new Integer[93];
                              AM = new p8(var11[19], 0);
                              AR = new p8(var11[21], 1);
                              EU = new p8(var11[50], 2);
                              BN = new p8(var11[45], 3);
                              BG = new p8(var11[18], 4);
                              CA = new p8(var11[9], 5);
                              CHR = new p8(var11[28], true.b<invokedynamic>(17746, 142771190165819681L ^ var20));
                              HR = new p8(var11[20], true.b<invokedynamic>(28059, 2849130252433979839L ^ var20));
                              CS = new p8(var11[17], true.b<invokedynamic>(24037, 617578613534181879L ^ var20));
                              DA = new p8(var11[30], true.b<invokedynamic>(21747, 4904986475601313993L ^ var20));
                              NL = new p8(var11[46], true.b<invokedynamic>(25027, 6433597132201489882L ^ var20));
                              EN = new p8(var11[5], true.b<invokedynamic>(29735, 1339141197936779313L ^ var20));
                              ET = new p8(var11[2], true.b<invokedynamic>(23317, 9142523213076516730L ^ var20));
                              FIL = new p8(var11[35], true.b<invokedynamic>(7505, 3978154076617574767L ^ var20));
                              FI = new p8(var11[13], true.b<invokedynamic>(5047, 1812238815587895220L ^ var20));
                              FR = new p8(var11[47], true.b<invokedynamic>(22217, 5581148612786340534L ^ var20));
                              DE = new p8(var11[42], true.b<invokedynamic>(15937, 7864404273889651263L ^ var20));
                              EL = new p8(var11[10], true.b<invokedynamic>(22257, 1054943985762583178L ^ var20));
                              GU = new p8(var11[7], true.b<invokedynamic>(9101, 8375416088870926311L ^ var20));
                              IW = new p8(var11[12], true.b<invokedynamic>(21032, 5190326265707709981L ^ var20));
                              HI = new p8(var11[31], true.b<invokedynamic>(28157, 9091872431744154105L ^ var20));
                              HU = new p8(var11[27], true.b<invokedynamic>(25656, 4424990748560257034L ^ var20));
                              IS = new p8(var11[24], true.b<invokedynamic>(18318, 3119890994326426517L ^ var20));
                              ID = new p8(var11[36], true.b<invokedynamic>(3522, 2653891809801116080L ^ var20));
                              IT = new p8(var11[38], true.b<invokedynamic>(25483, 4786858286597240752L ^ var20));
                              JA = new p8(var11[33], true.b<invokedynamic>(7603, 7428093750180841926L ^ var20));
                              KN = new p8(var11[0], true.b<invokedynamic>(7251, 3462066415172716619L ^ var20));
                              KO = new p8(var11[37], true.b<invokedynamic>(32451, 6479648099811945162L ^ var20));
                              LV = new p8(var11[51], true.b<invokedynamic>(15423, 3259585769550587911L ^ var20));
                              LT = new p8(var11[3], true.b<invokedynamic>(1169, 4608553256883851497L ^ var20));
                              MS = new p8(var11[34], true.b<invokedynamic>(29557, 6130042040647673625L ^ var20));
                              ML = new p8(var11[11], true.b<invokedynamic>(26006, 8474157191762833908L ^ var20));
                              MR = new p8(var11[26], true.b<invokedynamic>(4135, 1818206542655423574L ^ var20));
                              NO = new p8(var11[39], true.b<invokedynamic>(9317, 6913519741288296562L ^ var20));
                              PL = new p8(var11[1], true.b<invokedynamic>(16054, 368652916351871650L ^ var20));
                              RO = new p8(var11[48], true.b<invokedynamic>(14312, 9133286842912711563L ^ var20));
                              RU = new p8(var11[23], true.b<invokedynamic>(18976, 7069175283079863868L ^ var20));
                              SR = new p8(var11[8], true.b<invokedynamic>(32429, 3305734147907513040L ^ var20));
                              SK = new p8(var11[6], true.b<invokedynamic>(10651, 4443052162572828042L ^ var20));
                              SL = new p8(var11[25], true.b<invokedynamic>(26100, 4772317489731039705L ^ var20));
                              ES = new p8(var11[49], true.b<invokedynamic>(9221, 1306435322474934277L ^ var20));
                              SW = new p8(var11[43], true.b<invokedynamic>(16314, 5621646326405606366L ^ var20));
                              SV = new p8(var11[41], true.b<invokedynamic>(26732, 7431033529358023780L ^ var20));
                              TA = new p8(var11[15], true.b<invokedynamic>(32622, 6559749184390949732L ^ var20));
                              TE = new p8(var11[32], true.b<invokedynamic>(25201, 7212473438990956104L ^ var20));
                              TH = new p8(var11[4], true.b<invokedynamic>(14852, 3339409644199358053L ^ var20));
                              TR = new p8(var11[16], true.b<invokedynamic>(13936, 1893856169927451159L ^ var20));
                              UR = new p8(var11[44], true.b<invokedynamic>(8258, 3028702981435700268L ^ var20));
                              UK = new p8(var11[14], true.b<invokedynamic>(13351, 5932119485407764504L ^ var20));
                              VI = new p8(var11[40], true.b<invokedynamic>(20194, 177414253846158047L ^ var20));
                              CY = new p8(var11[29], true.b<invokedynamic>(22293, 886427799531570017L ^ var20));
                              CN = new p8(var11[22], true.b<invokedynamic>(28052, 1804576213733112214L ^ var20));
                              T = v(var22);
                              c = EnumEntriesKt.enumEntries((Enum[])T);
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label40;
                           }

                           var4 = "¿J«râ\u0082Æn(å\bÔ6BE®";
                           var5 = "¿J«râ\u0082Æn(å\bÔ6BE®".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var15 = var16.charAt(var14);
               break;
            default:
               var11[var17++] = var30;
               if ((var14 += var15) < var18) {
                  var15 = var16.charAt(var14);
                  continue label58;
               }

               var16 = "Q\u00834iÖÁÙM\bü÷y%\u0099öUó";
               var18 = "Q\u00834iÖÁÙM\bü÷y%\u0099öUó".length();
               var15 = '\b';
               var14 = -1;
            }

            ++var14;
            var24 = var16.substring(var14, var14 + var15);
            var10001 = 0;
         }
      }
   }

   public static void S(String[] var0) {
      D = var0;
   }

   public static String[] E() {
      return D;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6661;
      if (d[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = b[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/p8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/p8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
