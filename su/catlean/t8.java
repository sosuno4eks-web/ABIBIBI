package su.catlean;

import java.io.UnsupportedEncodingException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.MalformedURLException;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class t8 extends k9 {
   @NotNull
   public static final t8 c;
   static final KProperty[] n;
   @NotNull
   private static final zr V;
   @NotNull
   private static final zr t;
   @NotNull
   private static final List e;
   @Nullable
   private static String k;
   private static final long b = j0.a(-1800829659229653142L, 1348343046220266534L, MethodHandles.lookup().lookupClass()).a(76178101155754L);
   private static final String[] d;
   private static final String[] f;
   private static final Map g;
   private static final long[] i;
   private static final Integer[] l;
   private static final Map m;

   private t8(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 42685820905561L;
      super(var3, true.q<invokedynamic>(2370, 6211352587218395893L ^ var1), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final p8 x(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 67155956240762L;
      int var3 = (int)((var1 ^ 67155956240762L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (p8)V.k((short)var3, this, n[0], (short)var4, var5);
   }

   private final p8 G(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 118615914488716L;
      int var3 = (int)((var1 ^ 118615914488716L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (p8)t.k((short)var3, this, n[1], (short)var4, var5);
   }

   @Flow
   private final void F(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void p(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   private final String T(long param1, String param3, String param4) throws UnsupportedEncodingException, MalformedURLException {
      // $FF: Couldn't be decompiled
   }

   public static final String T(t8 $this, long a, String text, String to) {
      var1 ^= b;
      long var5 = var1 ^ 122064621261875L;
      return var0.T(var5, var3, var4);
   }

   public static final p8 R(t8 $this, long a) {
      var1 ^= b;
      long var3 = var1 ^ 29170663982537L;
      return var0.x(var3);
   }

   public static final p8 n(t8 $this, char a, int a, short a) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 123392903801749L;
      return var0.G(var6);
   }

   public static final void k(String <set-?>) {
      k = var0;
   }

   static {
      long var20 = b ^ 81610890755262L;
      long var22 = var20 ^ 63998185246619L;
      long var24 = var20 ^ 74311704415166L;
      g = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[23];
      int var16 = 0;
      String var15 = "ÁÛ³\u0091Ý*\u008c\u0083\nPÒ9'n\u0087Áþ\u009fy<\u009b-ã\u008bÐRõ\u0084V\u0015\u0012Ê\u0010Âctñt íÉ^\u009a¤\u0085æ\u0099<_\u0080\u001bGÍÍ\u0094AòÑC\u0005ÖÜ6I \u00991\u009d;\u0092¤¥ÞíÅ\u0087\u008cìÕ\u0089II\u001bFyQ\u001c®v\u0000^ÄVö\u008a´\u0093\u0086ã\u008c-j+ÀynÅ¬)$¦[µ\u008cÚG\u0097Ã\u0097¯Êz\u0004\u0014\u00adñ\u009a¯\u009a}\u008fÉ/ñ9¥\u009d\u0005tK\u0010#EôØþEÖ_e\u0000\u0010\u008e\u0000³\u008foé`õ\u001dò¯Ð8³ËZÎ£êw3\u009f\u001dî}\u0016\u0010DÊã¥O\u001f\u0091.ÓÍ\u0098¾ÄÐ«!\u0098\u0088©VP-B\u000eû¸¿\"\u0093\u0085Õm3oUrKì\u0086\u008e¿\u0011\"\u0083¸jßJÄÛ¥º\u001dÝ`ÊQFUP8ZÏ\u000eLýa\u0089vÔXï{ö\u009fº½ÜÓ\fo\"R`å¹·©ñºÔ®0Qø\u0010C.:\u0015¿È  ÉÛ\u0002û\u008bC\tÿs\tZê/Ó*ÐqaKü\u009dØ³16ÿêa@\u0002Va¼;íj¿<Z'\u009b¬&ãÎ{~âyÞ8J\u0019\u0010ñt\"Þù»c¤\u0095LÍ(\u0081«F0o\u0019ÑyØÀ\u0099úË)ï\u0012V÷Xê\u0098\u0096¿ÔØ^ Tù\u0001ù\u0000\u0089wS©\u000eÏÐÊ \u0013åP;Ò!\u008bå¦&\\ß\u008eò\u008bFÔ\u0090Eu¢U >Åö\u0081|¶×[\u0001\u0018Õæò]\n\t7\u000fSP0\u0016CÜ8ÆÌC>\u0017\u0019*Âi(by\u008ePÎñ|\u0018³KÁ²Uz\u0019!¿\u0012\u0095ç1X\u0003[w\u009e/\u0014²ÂL<Å\u0089Ñw\u0005\u0015~Y(_`E\u0096½±ÓH\"\u0094ç#\u001b¶\u009f6\u001aö?Á\\#Ë\u0004\u009a \u000fø\u0091ø\u0000ðU\u0018\u0007ä~\u0085\u008b (&>ú1ß\u0083Ûù9la\u0014©uØÊÇ\u0016\u0017\u0086(Jäì2¼ÐÈ¢¨ª\u008fg\u0083ÿ©í>\u00953 V\u0011tÌÚ·\u001e\u0012ìÊT\u009d#û ÌSGVT\u008eªßø\u0002_Ú%F>q$ yU¼Ûï¤å\u0085Chwâbõ#\u0006§K\u0002Þ«gØK¼\u0092ç=ûÙ\u009f·(\u008d\r\u0081Áõ\"Ï\u008eézí\tã'0h±\u0091üA\u0099\u0081\u001e³\u001b\u0019a;\u0005¡´ût¶¥¼X¬\u0010\u009c@Nåöíx\u009er`\u0006Ì\u00adR®:\u009eñéëiéÏðJ¬\u0082*h\t\u0000\u0082eÀÙYMUµÈ\u0088P\u0011ðï5\u0012Yç\u008fÅª¨eÎOz\u0096HmNØUùaê8¤=jéá»Ý\u009cM¤\u0086ë(\u000bÐ\u0016pgÌ0;Te0 ¿4`:]¿\u0019g+ÜÛþÂè±\u0091ON\u0015ê®ô\u0099\u0088\u009cÚY\u0017ÉÊ\u008c\u0090[\u0094à:½X\u0094Â«c\u0014ÙUµ\r1ì0GBN\u007f¯|\r\u0091h\u009e ³\u008fÛÁ&K\t\u001fk¡Çx\u009eur\u0098ªü@ñ\u0094\u009ct\u0016\u007fÛG\u0083Y\u00009MØ\u0018®\u0015b¾\u0084¸Mã¦Ú\u0099Q¿ç\u0010\u0011</\u0002¶@\u0012ôÞÂ7)M\u0005\u0084 ¨ç\u0018i&ÖÎ+\u0096±°Ä(T[÷\u009d H\u0089:\u0087ï¡éx\b¾M¼:\u0013DÃ£Ì¾\u000f°\u0084`_{~\u0082P;ùTI\u0018qY\u009e÷ÐL#\u0086ò}Úë\u0012Á\u009d¥Q3|ÁØ\u008c²¬\u0010æTÃ\u0098|\nÓÄ££O'²<¹4¨ÂsbÃ\u008f\u009cÿ,qWÖuÕ¾WýÀÐª\u008d\u0012c½IÐØ?í\u0097\u009c2À[N\b\u0095\u001e©26ï\u0093\u000fì\u0094?ñ'ð¶\u00118dÇ-\u000e\u0089\u0081¤§{&\u00946ò\u0000Ý\t\u0094¼Q3\u0014z·z+E\u0086ÍõÝ3¸ÄM\u0018 \u0090ðµÀÒ\u008b,AãñG\u001e\u009c\u0083C¶Ç\u00ad|³\"\u008604\u001e\u008b\u001e\f\u0016ë\u009d¹\u0091\u0005\u0094ªÙþ6\u0091È>\u00ad\u001fßgMöpcß|ð\u0085Ë¬ '÷á\u009f|\u0094e\u0004Ùaä\u0013½\u0098´,¢\u000fpíß\r\u008f ÷M3a\u0088¥E`Wd\u0013:ùRèqmBÒ$ã\\..\u0092ÛÑµuÈ\u0014â";
      int var17 = "ÁÛ³\u0091Ý*\u008c\u0083\nPÒ9'n\u0087Áþ\u009fy<\u009b-ã\u008bÐRõ\u0084V\u0015\u0012Ê\u0010Âctñt íÉ^\u009a¤\u0085æ\u0099<_\u0080\u001bGÍÍ\u0094AòÑC\u0005ÖÜ6I \u00991\u009d;\u0092¤¥ÞíÅ\u0087\u008cìÕ\u0089II\u001bFyQ\u001c®v\u0000^ÄVö\u008a´\u0093\u0086ã\u008c-j+ÀynÅ¬)$¦[µ\u008cÚG\u0097Ã\u0097¯Êz\u0004\u0014\u00adñ\u009a¯\u009a}\u008fÉ/ñ9¥\u009d\u0005tK\u0010#EôØþEÖ_e\u0000\u0010\u008e\u0000³\u008foé`õ\u001dò¯Ð8³ËZÎ£êw3\u009f\u001dî}\u0016\u0010DÊã¥O\u001f\u0091.ÓÍ\u0098¾ÄÐ«!\u0098\u0088©VP-B\u000eû¸¿\"\u0093\u0085Õm3oUrKì\u0086\u008e¿\u0011\"\u0083¸jßJÄÛ¥º\u001dÝ`ÊQFUP8ZÏ\u000eLýa\u0089vÔXï{ö\u009fº½ÜÓ\fo\"R`å¹·©ñºÔ®0Qø\u0010C.:\u0015¿È  ÉÛ\u0002û\u008bC\tÿs\tZê/Ó*ÐqaKü\u009dØ³16ÿêa@\u0002Va¼;íj¿<Z'\u009b¬&ãÎ{~âyÞ8J\u0019\u0010ñt\"Þù»c¤\u0095LÍ(\u0081«F0o\u0019ÑyØÀ\u0099úË)ï\u0012V÷Xê\u0098\u0096¿ÔØ^ Tù\u0001ù\u0000\u0089wS©\u000eÏÐÊ \u0013åP;Ò!\u008bå¦&\\ß\u008eò\u008bFÔ\u0090Eu¢U >Åö\u0081|¶×[\u0001\u0018Õæò]\n\t7\u000fSP0\u0016CÜ8ÆÌC>\u0017\u0019*Âi(by\u008ePÎñ|\u0018³KÁ²Uz\u0019!¿\u0012\u0095ç1X\u0003[w\u009e/\u0014²ÂL<Å\u0089Ñw\u0005\u0015~Y(_`E\u0096½±ÓH\"\u0094ç#\u001b¶\u009f6\u001aö?Á\\#Ë\u0004\u009a \u000fø\u0091ø\u0000ðU\u0018\u0007ä~\u0085\u008b (&>ú1ß\u0083Ûù9la\u0014©uØÊÇ\u0016\u0017\u0086(Jäì2¼ÐÈ¢¨ª\u008fg\u0083ÿ©í>\u00953 V\u0011tÌÚ·\u001e\u0012ìÊT\u009d#û ÌSGVT\u008eªßø\u0002_Ú%F>q$ yU¼Ûï¤å\u0085Chwâbõ#\u0006§K\u0002Þ«gØK¼\u0092ç=ûÙ\u009f·(\u008d\r\u0081Áõ\"Ï\u008eézí\tã'0h±\u0091üA\u0099\u0081\u001e³\u001b\u0019a;\u0005¡´ût¶¥¼X¬\u0010\u009c@Nåöíx\u009er`\u0006Ì\u00adR®:\u009eñéëiéÏðJ¬\u0082*h\t\u0000\u0082eÀÙYMUµÈ\u0088P\u0011ðï5\u0012Yç\u008fÅª¨eÎOz\u0096HmNØUùaê8¤=jéá»Ý\u009cM¤\u0086ë(\u000bÐ\u0016pgÌ0;Te0 ¿4`:]¿\u0019g+ÜÛþÂè±\u0091ON\u0015ê®ô\u0099\u0088\u009cÚY\u0017ÉÊ\u008c\u0090[\u0094à:½X\u0094Â«c\u0014ÙUµ\r1ì0GBN\u007f¯|\r\u0091h\u009e ³\u008fÛÁ&K\t\u001fk¡Çx\u009eur\u0098ªü@ñ\u0094\u009ct\u0016\u007fÛG\u0083Y\u00009MØ\u0018®\u0015b¾\u0084¸Mã¦Ú\u0099Q¿ç\u0010\u0011</\u0002¶@\u0012ôÞÂ7)M\u0005\u0084 ¨ç\u0018i&ÖÎ+\u0096±°Ä(T[÷\u009d H\u0089:\u0087ï¡éx\b¾M¼:\u0013DÃ£Ì¾\u000f°\u0084`_{~\u0082P;ùTI\u0018qY\u009e÷ÐL#\u0086ò}Úë\u0012Á\u009d¥Q3|ÁØ\u008c²¬\u0010æTÃ\u0098|\nÓÄ££O'²<¹4¨ÂsbÃ\u008f\u009cÿ,qWÖuÕ¾WýÀÐª\u008d\u0012c½IÐØ?í\u0097\u009c2À[N\b\u0095\u001e©26ï\u0093\u000fì\u0094?ñ'ð¶\u00118dÇ-\u000e\u0089\u0081¤§{&\u00946ò\u0000Ý\t\u0094¼Q3\u0014z·z+E\u0086ÍõÝ3¸ÄM\u0018 \u0090ðµÀÒ\u008b,AãñG\u001e\u009c\u0083C¶Ç\u00ad|³\"\u008604\u001e\u008b\u001e\f\u0016ë\u009d¹\u0091\u0005\u0094ªÙþ6\u0091È>\u00ad\u001fßgMöpcß|ð\u0085Ë¬ '÷á\u009f|\u0094e\u0004Ùaä\u0013½\u0098´,¢\u000fpíß\r\u008f ÷M3a\u0088¥E`Wd\u0013:ùRèqmBÒ$ã\\..\u0092ÛÑµuÈ\u0014â".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var27 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var33;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  f = new String[23];
                  m = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = " KD\u0003\u001d´\u0083\\ÇSEÆjÇ\u008e¨";
                  int var5 = " KD\u0003\u001d´\u0083\\ÇSEÆjÇ\u008e¨".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var31 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                     long[] var30 = var6;
                     var31 = var3++;
                     long var35 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var36 = -1;

                     while(true) {
                        long var8 = var35;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var38 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var36) {
                        case 0:
                           var30[var31] = var38;
                           if (var2 >= var5) {
                              i = var6;
                              l = new Integer[4];
                              KProperty[] var26 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t8.class, true.q<invokedynamic>(11091, 603965836238741283L ^ var20), true.q<invokedynamic>(17816, 3483350285241594363L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t8.class, true.q<invokedynamic>(92, 6733644852533228585L ^ var20), true.q<invokedynamic>(32462, 6821335045095656114L ^ var20), 0)))};
                              n = var26;
                              c = new t8(var22);
                              V = qi.M((il)c, true.q<invokedynamic>(27787, 435000752336279807L ^ var20), (Enum)p8.RU, (pj)null, (Function0)null, true.b<invokedynamic>(24569, 3203198699998027291L ^ var20), (Object)null, var24);
                              t = qi.M((il)c, true.q<invokedynamic>(16452, 4018920034311320631L ^ var20), (Enum)p8.UK, (pj)null, (Function0)null, true.b<invokedynamic>(19050, 5250656267568712585L ^ var20), (Object)null, var24);
                              String[] var39 = new String[]{true.q<invokedynamic>(9754, 7034612270930154111L ^ var20), true.q<invokedynamic>(14725, 2560668036066397694L ^ var20), true.q<invokedynamic>(31715, 5372635042042744729L ^ var20), true.q<invokedynamic>(26523, 8224372384443175906L ^ var20)};
                              e = CollectionsKt.listOf(var39);
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var38;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "þKìáë¸²Ì}Ð\u0011¥EÏÅ5";
                           var5 = "þKìáë¸²Ì}Ð\u0011¥EÏÅ5".length();
                           var2 = 0;
                        }

                        var31 = var2;
                        var2 += 8;
                        var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                        var30 = var6;
                        var31 = var3++;
                        var35 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var36 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var33;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0092¢\n\u0018\u001eÇ°r-\u009aè/ÓI3\u008f´\u00ad)Qµw)AWÛÖ³\u009b«cò ^à³¦Åaìäìr]\u008dÕsÅûIU\u000e.{í\u008c,\u000f\u0098\u0017áa¤z\r";
               var17 = "\u0092¢\n\u0018\u001eÇ°r-\u009aè/ÓI3\u008f´\u00ad)Qµw)AWÛÖ³\u009b«cò ^à³¦Åaìäìr]\u008dÕsÅûIU\u000e.{í\u008c,\u000f\u0098\u0017áa¤z\r".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var27 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6302;
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
            throw new RuntimeException("su/catlean/t8", var10);
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
         throw new RuntimeException("su/catlean/t8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11535;
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
            throw new RuntimeException("su/catlean/t8", var14);
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
         throw new RuntimeException("su/catlean/t8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
