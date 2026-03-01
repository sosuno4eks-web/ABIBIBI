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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.CloseSoundManagerEvent;
import su.catlean.api.event.events.client.PostTickEvent;
import su.catlean.gofra.Flow;

public final class bw implements zh {
   @NotNull
   public static final bw x;
   private static boolean r;
   @NotNull
   private static final g6 L;
   @NotNull
   private static final g6 z;
   @NotNull
   private static final g6 I;
   @NotNull
   private static final g6 A;
   @NotNull
   private static final g6 V;
   @NotNull
   private static final g6 d;
   @NotNull
   private static final g6 J;
   @NotNull
   private static final g6 S;
   @NotNull
   private static final g6 M;
   @NotNull
   private static final g6 h;
   @NotNull
   private static final g6 Q;
   @NotNull
   private static final g6 n;
   @NotNull
   private static final g6 y;
   @NotNull
   private static final g6 Y;
   @NotNull
   private static final g6 b;
   @NotNull
   private static final g6 F;
   @NotNull
   private static final g6 P;
   @NotNull
   private static final g6 t;
   @NotNull
   private static final g6 D;
   @NotNull
   private static final g6 Z;
   @NotNull
   private static final g6 j;
   @NotNull
   private static final g6 m;
   @NotNull
   private static final g6 B;
   @NotNull
   private static final iv X;
   private static int[] E;
   private static final long a = j0.a(376084154386661732L, 3585729396890838227L, MethodHandles.lookup().lookupClass()).a(217115078254889L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;
   private static final long g;
   private static final long i;

   private bw() {
   }

   @NotNull
   public final g6 S() {
      return A;
   }

   @NotNull
   public final g6 b() {
      return V;
   }

   @NotNull
   public final g6 G() {
      return d;
   }

   @NotNull
   public final g6 H() {
      return J;
   }

   @NotNull
   public final g6 a() {
      return S;
   }

   @NotNull
   public final g6 d() {
      return M;
   }

   @NotNull
   public final g6 t() {
      return h;
   }

   @NotNull
   public final g6 k() {
      return Q;
   }

   @NotNull
   public final g6 O() {
      return n;
   }

   @NotNull
   public final g6 K() {
      return y;
   }

   @NotNull
   public final g6 A() {
      return Y;
   }

   @NotNull
   public final g6 J() {
      return b;
   }

   @NotNull
   public final g6 m() {
      return F;
   }

   @NotNull
   public final g6 C() {
      return P;
   }

   @NotNull
   public final g6 V() {
      return t;
   }

   @NotNull
   public final g6 f() {
      return D;
   }

   @NotNull
   public final g6 W() {
      return m;
   }

   @NotNull
   public final g6 z() {
      return B;
   }

   public final void E(long a, boolean crystal) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void S(PostTickEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void L(CloseSoundManagerEvent var1) {
      long var2 = a ^ 59503508271176L;
      long var4 = var2 ^ 42632082579962L;
      z.S(var4);
      Thread.sleep(i);
   }

   static {
      long var19 = a ^ 72487869281943L;
      long var21 = var19 ^ 73565211762469L;
      int[] var10000 = new int[2];
      f = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 4812496728404177768L, var19);
      Cipher var10;
      Cipher var23 = var10 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var19 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var11 = 1; var11 < 8; ++var11) {
         var10003[var11] = (byte)((int)(var19 << var11 * 8 >>> 56));
      }

      var23.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var17 = new String[25];
      int var15 = 0;
      String var14 = "\u0000&È\u0014®Án\u008fEµ\u0005ü\u001cP±D\u0010\u000ba\u0014BîK¿\u001f\u0086#z*\u001cp\u0004\u0096\u0018?\u0003\u001a\u008a\u0012ÔUO\u0002jâð¥ø®õ)\\S¬\u001aÒBq\u0010ü\u0091ÉpPÑvØk\u001f {H\u0093\u000e\u0005 ÕÐB°Ù\u0017\u008dhnÂ\u009c[É.i\u0097é\u008e]{\u009c6\u000e²\b«M E$\u008a\u008b\u0018Â\\hB$_\u0083x¯\u000fW%r-\u0098D`¶Í0\u009fþ\u001fF  Íðâpâ[\u0096£\n%6\u0091+c\u000eI\u001díû;b\u0018õÆ~\fö\fC±¦ 'rr9\u001aö?\u0090Mu\u009b¨è\u0097ÕM1Â\u0015×¬c\\ÜÛÕÚ\u0006\u0001\u009aðO\u0018d]xK\u0092?\u0093\u000eP\u009e¨ðb\u00065{?ÏíÜîÃÛá\u0088q\u009dâfú#Ð\u0019Í|ÚÔ\u0092hî|ðÍ\u0082ª<B\u001cÍµ?®\u001eAh©Þ\u0000æuTECYLe\u009e+\u0083<8\u0083}¦\u0002ò\u009a\u001aMóhBjFØÈ\u001cF\u0004A\"aT\u00adSîùîðÙ\u009eò«óäÑÉi\u008f\"\u0089ªá\u0002Í§\u008f£IÕÜÃROµ\u0087s¹\u000fÏ\u001eÃc\u0012\u009bÚ\u0094Wps\u008cVËn\u0097\u0005\u0010ã\u0019\u0014±\u0089@x\u0019\u0002Ñ\u0084íh#\u0010\u0091Úô?-èÊþð\u009cëúÀð\u0019w Ø\u0003\bøÐÀ0óW~?t\u0088\u0099õþ¬¥døZ\u0007ÏcÅ\u001bI\u001bRxe»\u0090ë·\nz¥û\u001fz\"\u0093]\u0007ÃXà0\f\u0080g9rn\u008e½\u0014³~\u0015÷ïË9Uåéo²ÙùvÌ/\u000etÖË\u0006§c¾\u009d8£\\ö±SqïeÒß>q'º\u0012,xÇÁ»ZÉsÕ\u0006fã\u0083&\u009d½ÿ@Ã?\u0010r\u0081Ù F\u009cÝ½\u0089¾åSU¡Ï%¢ÀúÅ04pÐ\u0094±M~\u0015\u0080\u0015v¦í\fð\u00adC\u0017]ø\u0096Ì,\u0081çÝ¸«}e>q\u0001¹A\u00184üJ\u0080Ï.CZÅ´·q\u0095\u00ad\"K¶=\u0006~\u00120Î+ Wðõ\u0001(ÆÝL\u0088\u001d.Ì\u009aÁ\u0099\u0091Ø\u007f2~´\u0086R\u0091!`º±Ú\u0015EÒ\u0018«\u008aºrg\u001cµ_\u0007(\"¼ÅB¤·\u0011}´ðs\u0092M; \u0010r^Ä¯N\u0019\nF!ÉÛR\u008a±×\u00122\u0093F\u008er\u008a¹\u0015Âýu\u0013ê\u0097³ äGÒ°iDÜûH¡È\u001eh\u0099(±Î²òí43\u0091ýµ°:³Ñ´6\u0012 !~\u0098?\u001d\u0099Çå\u008e)D;\u0004/{\u0013\u0015\u0011ùìrB©^E3ç7\u0013·g¡\u00188ÿÐÛø;_l(ÿ\u0095Ø?N\u0015®\u0010ó\u008c\u0092lQÃþ\u0010!\u0013\u009d\u0085\u0012Ï£ vÄqáö\u009a\u0015ó\u0018a\u009e´óòK±!Z\u0091\u0092ß9%\u000bGZ;\u008c\u0098¥ôa$\u0018¥H±#´a\u001f+?²ð\u001fÀkýû\u001f·]él/ûj";
      int var16 = "\u0000&È\u0014®Án\u008fEµ\u0005ü\u001cP±D\u0010\u000ba\u0014BîK¿\u001f\u0086#z*\u001cp\u0004\u0096\u0018?\u0003\u001a\u008a\u0012ÔUO\u0002jâð¥ø®õ)\\S¬\u001aÒBq\u0010ü\u0091ÉpPÑvØk\u001f {H\u0093\u000e\u0005 ÕÐB°Ù\u0017\u008dhnÂ\u009c[É.i\u0097é\u008e]{\u009c6\u000e²\b«M E$\u008a\u008b\u0018Â\\hB$_\u0083x¯\u000fW%r-\u0098D`¶Í0\u009fþ\u001fF  Íðâpâ[\u0096£\n%6\u0091+c\u000eI\u001díû;b\u0018õÆ~\fö\fC±¦ 'rr9\u001aö?\u0090Mu\u009b¨è\u0097ÕM1Â\u0015×¬c\\ÜÛÕÚ\u0006\u0001\u009aðO\u0018d]xK\u0092?\u0093\u000eP\u009e¨ðb\u00065{?ÏíÜîÃÛá\u0088q\u009dâfú#Ð\u0019Í|ÚÔ\u0092hî|ðÍ\u0082ª<B\u001cÍµ?®\u001eAh©Þ\u0000æuTECYLe\u009e+\u0083<8\u0083}¦\u0002ò\u009a\u001aMóhBjFØÈ\u001cF\u0004A\"aT\u00adSîùîðÙ\u009eò«óäÑÉi\u008f\"\u0089ªá\u0002Í§\u008f£IÕÜÃROµ\u0087s¹\u000fÏ\u001eÃc\u0012\u009bÚ\u0094Wps\u008cVËn\u0097\u0005\u0010ã\u0019\u0014±\u0089@x\u0019\u0002Ñ\u0084íh#\u0010\u0091Úô?-èÊþð\u009cëúÀð\u0019w Ø\u0003\bøÐÀ0óW~?t\u0088\u0099õþ¬¥døZ\u0007ÏcÅ\u001bI\u001bRxe»\u0090ë·\nz¥û\u001fz\"\u0093]\u0007ÃXà0\f\u0080g9rn\u008e½\u0014³~\u0015÷ïË9Uåéo²ÙùvÌ/\u000etÖË\u0006§c¾\u009d8£\\ö±SqïeÒß>q'º\u0012,xÇÁ»ZÉsÕ\u0006fã\u0083&\u009d½ÿ@Ã?\u0010r\u0081Ù F\u009cÝ½\u0089¾åSU¡Ï%¢ÀúÅ04pÐ\u0094±M~\u0015\u0080\u0015v¦í\fð\u00adC\u0017]ø\u0096Ì,\u0081çÝ¸«}e>q\u0001¹A\u00184üJ\u0080Ï.CZÅ´·q\u0095\u00ad\"K¶=\u0006~\u00120Î+ Wðõ\u0001(ÆÝL\u0088\u001d.Ì\u009aÁ\u0099\u0091Ø\u007f2~´\u0086R\u0091!`º±Ú\u0015EÒ\u0018«\u008aºrg\u001cµ_\u0007(\"¼ÅB¤·\u0011}´ðs\u0092M; \u0010r^Ä¯N\u0019\nF!ÉÛR\u008a±×\u00122\u0093F\u008er\u008a¹\u0015Âýu\u0013ê\u0097³ äGÒ°iDÜûH¡È\u001eh\u0099(±Î²òí43\u0091ýµ°:³Ñ´6\u0012 !~\u0098?\u001d\u0099Çå\u008e)D;\u0004/{\u0013\u0015\u0011ùìrB©^E3ç7\u0013·g¡\u00188ÿÐÛø;_l(ÿ\u0095Ø?N\u0015®\u0010ó\u008c\u0092lQÃþ\u0010!\u0013\u009d\u0085\u0012Ï£ vÄqáö\u009a\u0015ó\u0018a\u009e´óòK±!Z\u0091\u0092ß9%\u000bGZ;\u008c\u0098¥ôa$\u0018¥H±#´a\u001f+?²ð\u001fÀkýû\u001f·]él/ûj".length();
      char var13 = 16;
      int var12 = -1;

      label49:
      while(true) {
         ++var12;
         String var24 = var14.substring(var12, var12 + var13);
         byte var10001 = -1;

         while(true) {
            byte[] var18 = var10.doFinal(var24.getBytes("ISO-8859-1"));
            String var29 = a(var18).intern();
            switch(var10001) {
            case 0:
               var17[var15++] = var29;
               if ((var12 += var13) >= var16) {
                  c = var17;
                  e = new String[25];
                  Cipher var5;
                  var23 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var19 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var19 << var6 * 8 >>> 56));
                  }

                  var23.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var7 = -5374845833647338726L;
                  byte[] var9 = var5.doFinal(new byte[]{(byte)((int)(var7 >>> 56)), (byte)((int)(var7 >>> 48)), (byte)((int)(var7 >>> 40)), (byte)((int)(var7 >>> 32)), (byte)((int)(var7 >>> 24)), (byte)((int)(var7 >>> 16)), (byte)((int)(var7 >>> 8)), (byte)((int)var7)});
                  long var31 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
                  boolean var27 = true;
                  g = var31;
                  Cipher var0;
                  var23 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var19 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var19 << var1 * 8 >>> 56));
                  }

                  var23.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -271310042880258005L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  var31 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  var27 = true;
                  i = var31;
                  x = new bw();
                  L = new g6(true.c<invokedynamic>(16899, 6911201239246647175L ^ var19), var21, 1.0F);
                  z = new g6(true.c<invokedynamic>(24391, 6960370868346958534L ^ var19), var21, 1.0F);
                  I = new g6(true.c<invokedynamic>(4852, 7150780794303872884L ^ var19), var21, 1.0F);
                  A = new g6(true.c<invokedynamic>(2348, 8035743963459806384L ^ var19), var21, 1.0F);
                  V = new g6(true.c<invokedynamic>(9500, 3369583722993109151L ^ var19), var21, 1.0F);
                  d = new g6(true.c<invokedynamic>(492, 6201126628483525758L ^ var19), var21, 1.0F);
                  J = new g6(true.c<invokedynamic>(27613, 2150157798894765644L ^ var19), var21, 0.7F);
                  S = new g6(true.c<invokedynamic>(7059, 7334729944135988761L ^ var19), var21, 0.7F);
                  M = new g6(true.c<invokedynamic>(30245, 625067867368987573L ^ var19), var21, 0.7F);
                  h = new g6(true.c<invokedynamic>(29134, 1761489365234162763L ^ var19), var21, 0.7F);
                  Q = new g6(true.c<invokedynamic>(27401, 2208094907665155723L ^ var19), var21, 1.0F);
                  n = new g6(true.c<invokedynamic>(13975, 6824836608912349968L ^ var19), var21, 1.0F);
                  y = new g6(true.c<invokedynamic>(16915, 202756081746882432L ^ var19), var21, 1.0F);
                  Y = new g6(true.c<invokedynamic>(19601, 7181805940766482711L ^ var19), var21, 1.0F);
                  b = new g6(true.c<invokedynamic>(27385, 6652569036388566902L ^ var19), var21, 1.0F);
                  F = new g6(true.c<invokedynamic>(2505, 3463109496322188383L ^ var19), var21, 1.0F);
                  P = new g6(true.c<invokedynamic>(13143, 54034027140505310L ^ var19), var21, 1.0F);
                  t = new g6(true.c<invokedynamic>(17732, 4902187566265051343L ^ var19), var21, 1.0F);
                  D = new g6(true.c<invokedynamic>(7117, 12314059412600410L ^ var19), var21, 1.0F);
                  Z = new g6(true.c<invokedynamic>(31759, 4959779306611609985L ^ var19), var21, 1.0F);
                  j = new g6(true.c<invokedynamic>(25914, 8303906012327413935L ^ var19), var21, 1.0F);
                  m = new g6(true.c<invokedynamic>(7910, 3426507072584151922L ^ var19), var21, 1.0F);
                  B = new g6(true.c<invokedynamic>(20615, 5487962598193052939L ^ var19), var21, 1.0F);
                  X = new iv();
                  return;
               }

               var13 = var14.charAt(var12);
               break;
            default:
               var17[var15++] = var29;
               if ((var12 += var13) < var16) {
                  var13 = var14.charAt(var12);
                  continue label49;
               }

               var14 = "èJ\u00829ÑLFu°MË\u008a!!×°a\u0088\u009e¢\u0098\u0083×ÔR\bÑ\u0007¼V³8 >ô ÅÝÓ\u0096ñ¶{Þ\u008c\u0094fd\u0005¹\u008ec\u0010.\u0018W\u0019Yµº\u0016\u009c\u000báZ";
               var16 = "èJ\u00829ÑLFu°MË\u008a!!×°a\u0088\u009e¢\u0098\u0083×ÔR\bÑ\u0007¼V³8 >ô ÅÝÓ\u0096ñ¶{Þ\u008c\u0094fd\u0005¹\u008ec\u0010.\u0018W\u0019Yµº\u0016\u009c\u000báZ".length();
               var13 = ' ';
               var12 = -1;
            }

            ++var12;
            var24 = var14.substring(var12, var12 + var13);
            var10001 = 0;
         }
      }
   }

   public static void h(int[] var0) {
      E = var0;
   }

   public static int[] i() {
      return E;
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11975;
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
            throw new RuntimeException("su/catlean/bw", var10);
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
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/bw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
