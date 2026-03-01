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
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.CollisionEvent;
import su.catlean.gofra.Flow;

public final class k3 extends k9 {
   @NotNull
   public static final k3 C;
   // $FF: synthetic field
   static final KProperty[] l;
   @NotNull
   private static final zo w;
   @NotNull
   private static final zo s;
   @NotNull
   private static final zo Q;
   @NotNull
   private static final zo T;
   @NotNull
   private static final zo r;
   @NotNull
   private static final zo X;
   @NotNull
   private static final zo c;
   @NotNull
   private static final zo n;
   @NotNull
   private static final zo N;
   @NotNull
   private static final zo q;
   private static final long b = j0.a(1046908473528795894L, 2916096695319085248L, MethodHandles.lookup().lookupClass()).a(248288375506491L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private k3(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 122115676446514L;
      super(var3, true.v<invokedynamic>(16114, 252586727738034252L ^ var1), pa.E(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 127504003785038L;
      int var3 = (int)((var1 ^ 127504003785038L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)w.k((short)var3, this, l[0], (short)var4, var5);
   }

   private final boolean j(int var1, char var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 63480041063289L;
      int var6 = (int)((var4 ^ 63480041063289L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)s.k((short)var6, this, l[1], (short)var7, var8);
   }

   private final boolean p(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 122367837720L;
      int var3 = (int)((var1 ^ 122367837720L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)Q.k((short)var3, this, l[2], (short)var4, var5);
   }

   private final boolean h(int var1, short var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 71719260594247L;
      int var6 = (int)((var4 ^ 71719260594247L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)T.k((short)var6, this, l[3], (short)var7, var8);
   }

   private final boolean U(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 61405395172924L;
      int var3 = (int)((var1 ^ 61405395172924L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)r.k((short)var3, this, l[4], (short)var4, var5);
   }

   private final boolean I(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 128468056457975L;
      int var3 = (int)((var1 ^ 128468056457975L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)X.k((short)var3, this, l[5], (short)var4, var5);
   }

   private final boolean H(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 68184474016416L;
      int var3 = (int)((var1 ^ 68184474016416L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)c.k((short)var3, this, l[true.w<invokedynamic>(18639, 6510630329340527328L ^ var1)], (short)var4, var5);
   }

   private final boolean L(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 91239554318503L;
      int var3 = (int)((var1 ^ 91239554318503L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)n.k((short)var3, this, l[true.w<invokedynamic>(11303, 8147588993201421316L ^ var1)], (short)var4, var5);
   }

   private final boolean r(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 89972209535074L;
      int var6 = (int)((var4 ^ 89972209535074L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)N.k((short)var6, this, l[true.w<invokedynamic>(929, 3339073792269671245L ^ var4)], (short)var7, var8);
   }

   private final boolean P(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 43433381457L;
      int var3 = (int)((var1 ^ 43433381457L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)q.k((short)var3, this, l[true.w<invokedynamic>(28729, 3284111406135521002L ^ var1)], (short)var4, var5);
   }

   @Flow
   private final void o(CollisionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 126811500580106L;
      long var22 = var20 ^ 73744890726610L;
      long var24 = var20 ^ 82027298228548L;
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
      String var15 = "\u008cËü¡Î\u000bÛ\u0087*>\u0000`\u001f°-a¿\u0005{ár¥Xt\u0089û!\u001dÜ\u0097\u0000sMµ\u009d\u000b\u0086«M^(î\u0017ËCOü\u0091_\u0098ª\tZ( Hº|ê\u0006\u000e§´h²[É*\u0089F\u008bÇêåû¨Ý\u0092\u009b\u001f_(Õ;´|\u0010\u0085y\u009aø¬\t\u008bi%\u009b»¹\u0019Ä´\u0003\u0011àtøÕ\u008d~C·\u0003\u0017!%(Møi\u0090Å 1|±\u0014\r\f\u0014\u0087ô8ö\u0013ÛØ\u0087Ì\f\u009fïNLi5ä\u008ccFP\u0082A\u009f\r ï\u0002k\nm\u00ad9Ñ \u0097Ú±\u0084¬\u0086\u0016;Ýr¿È\u000b\u0000{¾Ödh¥\u00981ö\u0010Øí\u001eÕ$RÏ\u0000\u0010\u0095Ï#sYúç Ëß:ÃL&\t¿g\r\u0094ÆÕ;ÀÞHv\u008cT\u0083è\u009a1#}\u0003útótÇ\u0010¡\u0015\u008a°\"J±O'\u0084\u0080O\u008c\u0018Ô\u0007\u0010!\u001d\f\u001a%é\fr\u0084\u0013yfÙ\u0089Òv É^@Bb\u0085cÃòNBÞa²i@;Ü\r\u008b)bGÁl\u0085\u0082\u0088\u001de²½ d°H\u009foËTu\u000ewN_\u0012ü¦¹BÝØÅÞ+\u0084Ó?úcÈ¡\u0016u\u0099\u0018N9Å@\u0088¤é(\u008fR\u008e;W\u0099\\:Ïú|¹Õr£\u0017\u0018í¢sî9-ìÑ$\u000fw\u008aa\u000b\u001f\"\u0004}æ\u001b@¶ÞQ\u0018\u009cA]\u00159Ú\u001fÔ\u0086£@À\u0083\u0018R\u000es®àýÕË`\u008a ¶ lß=\u00ad9¿¿´ö·:¬ëyp¹©¶\u001e\u0006w.\u0092iÿûq*/P\u0018Ô\u00ad¹\r¹]\u0083-.d¹Õ´K\u0013îj¦(E«\u0096\u0017;\u0010itÇKc±ÅÎ4ÍïÖÏ0êc\u0010CjÚ+í\u0089¥ª\u0089ù}\u0096Î\u0094.\u0099\u0010\u009cs\u000e6\u001a\u0017é\u0002Ðõ_ã\n \u0005ñ\u0018¡s\u000eÛpzÆ8'{æ\u0098»¾ju4Ê\u0003\u001aï½ß\u008b\u0018\u009d\u0013 \u0092ÕÎDøçc\nÑ\u009fÅº[\u008aõÚÙÿ\u000e\u008a, \u0090_¼Õ\u0082~Ûá 7r[\u009f÷ÎÆ\u0007B\u0087¥tu(\u0080ÆìO7î¸\u0082#(XQ±J\u0090wñÖØÞ\u008e5²Ù\u00ad\u000b¾©>ÎÔGß\u00881Â\u008aP\u0080ÄáE`Dð\u0005Àê÷w Ì\u0011!4Ùõm\u001co|Pf-×ü¬\u0003|E\u008aêùKfF¾D;}çs= \u008eDÍ\u0006\u0094<×\u0006\\Ï|ö~\u0011Y\u0002ae\u0005¶\u0098£¶\u000f&ÔÚò\u008e@´\u0092\u0018x×çÓGT_\u0003nyxÃÃ0º\u000bÁ\u001c\t_\u0092ÿ\u0095\u001e\u0010IòéYA\u0086Þ3ÍU\\J¼\b¬\u0089 ]131V¹Î³\u0099\\\u009bôÃe;G\u001f\u009dï\u0088õ-ò?\u000b\u0000ñ\u009fé¤D¾\u0018YþyNæ£\u0086NwË:\u008e8@TµL¾®V\rºÕY\u0010Ötöix<®\u0096Ñ+\u0086-Â\u009cÛ\\";
      int var17 = "\u008cËü¡Î\u000bÛ\u0087*>\u0000`\u001f°-a¿\u0005{ár¥Xt\u0089û!\u001dÜ\u0097\u0000sMµ\u009d\u000b\u0086«M^(î\u0017ËCOü\u0091_\u0098ª\tZ( Hº|ê\u0006\u000e§´h²[É*\u0089F\u008bÇêåû¨Ý\u0092\u009b\u001f_(Õ;´|\u0010\u0085y\u009aø¬\t\u008bi%\u009b»¹\u0019Ä´\u0003\u0011àtøÕ\u008d~C·\u0003\u0017!%(Møi\u0090Å 1|±\u0014\r\f\u0014\u0087ô8ö\u0013ÛØ\u0087Ì\f\u009fïNLi5ä\u008ccFP\u0082A\u009f\r ï\u0002k\nm\u00ad9Ñ \u0097Ú±\u0084¬\u0086\u0016;Ýr¿È\u000b\u0000{¾Ödh¥\u00981ö\u0010Øí\u001eÕ$RÏ\u0000\u0010\u0095Ï#sYúç Ëß:ÃL&\t¿g\r\u0094ÆÕ;ÀÞHv\u008cT\u0083è\u009a1#}\u0003útótÇ\u0010¡\u0015\u008a°\"J±O'\u0084\u0080O\u008c\u0018Ô\u0007\u0010!\u001d\f\u001a%é\fr\u0084\u0013yfÙ\u0089Òv É^@Bb\u0085cÃòNBÞa²i@;Ü\r\u008b)bGÁl\u0085\u0082\u0088\u001de²½ d°H\u009foËTu\u000ewN_\u0012ü¦¹BÝØÅÞ+\u0084Ó?úcÈ¡\u0016u\u0099\u0018N9Å@\u0088¤é(\u008fR\u008e;W\u0099\\:Ïú|¹Õr£\u0017\u0018í¢sî9-ìÑ$\u000fw\u008aa\u000b\u001f\"\u0004}æ\u001b@¶ÞQ\u0018\u009cA]\u00159Ú\u001fÔ\u0086£@À\u0083\u0018R\u000es®àýÕË`\u008a ¶ lß=\u00ad9¿¿´ö·:¬ëyp¹©¶\u001e\u0006w.\u0092iÿûq*/P\u0018Ô\u00ad¹\r¹]\u0083-.d¹Õ´K\u0013îj¦(E«\u0096\u0017;\u0010itÇKc±ÅÎ4ÍïÖÏ0êc\u0010CjÚ+í\u0089¥ª\u0089ù}\u0096Î\u0094.\u0099\u0010\u009cs\u000e6\u001a\u0017é\u0002Ðõ_ã\n \u0005ñ\u0018¡s\u000eÛpzÆ8'{æ\u0098»¾ju4Ê\u0003\u001aï½ß\u008b\u0018\u009d\u0013 \u0092ÕÎDøçc\nÑ\u009fÅº[\u008aõÚÙÿ\u000e\u008a, \u0090_¼Õ\u0082~Ûá 7r[\u009f÷ÎÆ\u0007B\u0087¥tu(\u0080ÆìO7î¸\u0082#(XQ±J\u0090wñÖØÞ\u008e5²Ù\u00ad\u000b¾©>ÎÔGß\u00881Â\u008aP\u0080ÄáE`Dð\u0005Àê÷w Ì\u0011!4Ùõm\u001co|Pf-×ü¬\u0003|E\u008aêùKfF¾D;}çs= \u008eDÍ\u0006\u0094<×\u0006\\Ï|ö~\u0011Y\u0002ae\u0005¶\u0098£¶\u000f&ÔÚò\u008e@´\u0092\u0018x×çÓGT_\u0003nyxÃÃ0º\u000bÁ\u001c\t_\u0092ÿ\u0095\u001e\u0010IòéYA\u0086Þ3ÍU\\J¼\b¬\u0089 ]131V¹Î³\u0099\\\u009bôÃe;G\u001f\u009dï\u0088õ-ò?\u000b\u0000ñ\u009fé¤D¾\u0018YþyNæ£\u0086NwË:\u008e8@TµL¾®V\rºÕY\u0010Ötöix<®\u0096Ñ+\u0086-Â\u009cÛ\\".length();
      char var14 = '(';
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
                  e = new String[32];
                  k = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[11];
                  int var3 = 0;
                  String var4 = "\b¾ù\u0006dáÎÕ*M0;cEß¸|Ñ,Ï\u0085\u009cÅ\u00adî@·\u00976\u001eû1\f\u0018x\u001fí\u001c\\§¬ÿ\u0084Ø\u0010D\u0002°0É\u009fÀâAâ\"÷\u001bXÂ\u001fÊ.z\u0010*è\u009e§\u007f\u0003a";
                  int var5 = "\b¾ù\u0006dáÎÕ*M0;cEß¸|Ñ,Ï\u0085\u009cÅ\u00adî@·\u00976\u001eû1\f\u0018x\u001fí\u001c\\§¬ÿ\u0084Ø\u0010D\u0002°0É\u009fÀâAâ\"÷\u001bXÂ\u001fÊ.z\u0010*è\u009e§\u007f\u0003a".length();
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
                              g = var6;
                              i = new Integer[11];
                              KProperty[] var26 = new KProperty[true.w<invokedynamic>(9732, 5487517850674097194L ^ var20)];
                              var26[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k3.class, true.v<invokedynamic>(9652, 5170956309173763892L ^ var20), true.v<invokedynamic>(23366, 3977632347879670231L ^ var20), 0)));
                              var26[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k3.class, true.v<invokedynamic>(22149, 3043303056776793112L ^ var20), true.v<invokedynamic>(8426, 3174435796476525174L ^ var20), 0)));
                              var26[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k3.class, true.v<invokedynamic>(5474, 8587598040342155240L ^ var20), true.v<invokedynamic>(6946, 3000222304317817257L ^ var20), 0)));
                              var26[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k3.class, true.v<invokedynamic>(16663, 7953823151985597343L ^ var20), true.v<invokedynamic>(3695, 5984858226327803121L ^ var20), 0)));
                              var26[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k3.class, true.v<invokedynamic>(20736, 4671888555358194580L ^ var20), true.v<invokedynamic>(9232, 1625334131767312002L ^ var20), 0)));
                              var26[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k3.class, true.v<invokedynamic>(6210, 2394123293800710861L ^ var20), true.v<invokedynamic>(19767, 1713357925140436921L ^ var20), 0)));
                              var26[true.w<invokedynamic>(3510, 1471443425582008223L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k3.class, true.v<invokedynamic>(14207, 5901899747159404022L ^ var20), true.v<invokedynamic>(9679, 3634573246521802572L ^ var20), 0)));
                              var26[true.w<invokedynamic>(31855, 1662022021668058688L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k3.class, true.v<invokedynamic>(21455, 3296276033926990158L ^ var20), true.v<invokedynamic>(11659, 4532780571330705169L ^ var20), 0)));
                              var26[true.w<invokedynamic>(27277, 5345675742556233889L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k3.class, true.v<invokedynamic>(11643, 7953682750608537596L ^ var20), true.v<invokedynamic>(10268, 7046362950202552976L ^ var20), 0)));
                              var26[true.w<invokedynamic>(31120, 7643241840669242296L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k3.class, true.v<invokedynamic>(30611, 5526481315018353925L ^ var20), true.v<invokedynamic>(16025, 1788908153250276352L ^ var20), 0)));
                              l = var26;
                              C = new k3(var24);
                              w = qi.R((il)C, true.v<invokedynamic>(18493, 8139845389314724537L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(199, 7423214774706555620L ^ var20), var22, (Object)null);
                              s = qi.R((il)C, true.v<invokedynamic>(2575, 1933077842863411352L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(1224, 228521695662034658L ^ var20), var22, (Object)null);
                              Q = qi.R((il)C, true.v<invokedynamic>(26207, 4855098152547433664L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(1224, 228521695662034658L ^ var20), var22, (Object)null);
                              T = qi.R((il)C, true.v<invokedynamic>(3729, 4942800758357218305L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(1224, 228521695662034658L ^ var20), var22, (Object)null);
                              r = qi.R((il)C, true.v<invokedynamic>(613, 888432366784764136L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(1224, 228521695662034658L ^ var20), var22, (Object)null);
                              X = qi.R((il)C, true.v<invokedynamic>(24867, 1128807870945278904L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(1224, 228521695662034658L ^ var20), var22, (Object)null);
                              c = qi.R((il)C, true.v<invokedynamic>(31056, 915459863091749846L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(1224, 228521695662034658L ^ var20), var22, (Object)null);
                              n = qi.R((il)C, true.v<invokedynamic>(4168, 5554754071339748059L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(1224, 228521695662034658L ^ var20), var22, (Object)null);
                              N = qi.R((il)C, true.v<invokedynamic>(5048, 5179998080435276093L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(1224, 228521695662034658L ^ var20), var22, (Object)null);
                              q = qi.R((il)C, true.v<invokedynamic>(32241, 6023417504453470052L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(1224, 228521695662034658L ^ var20), var22, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var38;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "©\u0093iêÑÆ\u00968×\u0005z\u0005¥ÂºÍ";
                           var5 = "©\u0093iêÑÆ\u00968×\u0005z\u0005¥ÂºÍ".length();
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

               var15 = "6Ò·£ÕÙå¼\u009az\u0002|ü¯\u0099¡\u00101\u001bG¬ànj\u0082R|\u0094É\u0099ôwê";
               var17 = "6Ò·£ÕÙå¼\u009az\u0002|ü¯\u0099¡\u00101\u001bG¬ànj\u0082R|\u0094É\u0099ôwê".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var27 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29418;
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
            throw new RuntimeException("su/catlean/k3", var10);
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
         throw new RuntimeException("su/catlean/k3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25179;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/k3", var14);
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
         throw new RuntimeException("su/catlean/k3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
