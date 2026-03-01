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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class ne extends nm {
   @NotNull
   public static final ne G;
   // $FF: synthetic field
   static final KProperty[] V;
   @NotNull
   private static final zo e;
   @NotNull
   private static final zo R;
   @NotNull
   private static final zo x;
   @NotNull
   private static final zo K;
   @NotNull
   private static final zo m;
   @NotNull
   private static final zo P;
   @NotNull
   private static final zo U;
   private static final long c = j0.a(-8015084623545069465L, 8566016613829449310L, MethodHandles.lookup().lookupClass()).a(260045310368316L);
   private static final String[] d;
   private static final String[] i;
   private static final Map j;
   private static final long[] n;
   private static final Integer[] p;
   private static final Map t;

   private ne(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 69872676044066L;
      super(true.n<invokedynamic>(22433, 7335305313583732558L ^ var1), var3);
   }

   private final boolean Z(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 7232541017261L;
      int var3 = (int)((var1 ^ 7232541017261L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)e.k((short)var3, this, V[0], (short)var4, var5);
   }

   private final boolean y(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 74338431132207L;
      int var3 = (int)((var1 ^ 74338431132207L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)R.k((short)var3, this, V[1], (short)var4, var5);
   }

   private final boolean s(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 96533219861262L;
      int var3 = (int)((var1 ^ 96533219861262L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)x.k((short)var3, this, V[2], (short)var4, var5);
   }

   private final boolean P(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 84843807426840L;
      int var3 = (int)((var1 ^ 84843807426840L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)K.k((short)var3, this, V[3], (short)var4, var5);
   }

   private final boolean r(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 10171365179914L;
      int var3 = (int)((var1 ^ 10171365179914L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)m.k((short)var3, this, V[4], (short)var4, var5);
   }

   private final boolean g(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 113481800653808L;
      int var3 = (int)((var1 ^ 113481800653808L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)P.k((short)var3, this, V[5], (short)var4, var5);
   }

   private final boolean L(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 11629737165803L;
      int var3 = (int)((var1 ^ 11629737165803L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)U.k((short)var3, this, V[true.q<invokedynamic>(9176, 5698950822954213793L ^ var1)], (short)var4, var5);
   }

   public void k(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   public void O(@NotNull class_332 context, long a) {
      long var4 = var2 ^ 140622033104381L;
      long var6 = var2 ^ 71290737577983L;
      Intrinsics.checkNotNullParameter(var1, true.n<invokedynamic>(20467, 747860904232920611L ^ var2));
      g3.D(var4).d(var6);
   }

   static {
      long var20 = c ^ 43190158082947L;
      long var22 = var20 ^ 2972068026116L;
      long var24 = var20 ^ 29914089636493L;
      j = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[34];
      int var16 = 0;
      String var15 = "4]Õ\u0093ø\u0098æC\u0087EïkÅ\u008ae°R³X³*\u0015@Z\u008dn\u0094\u008fÁ\u007fÌ\u0015\u0010P\u000eÌø¨òæ\u009cä\u0018\u008e8ÆóIæ\u0018\u0083\u001b¦¸\u007fù\u0091À\u000f\u0096\u0097\u009d¥h\u00149±å¯ªç\u009dA9\u0018LÊSFè©ªèÃ;\u0007\t¯¥¹b\u0083×öcóp|ç è©w{âi\u0016Bb\tüÈ\u008dúò\u009aÉÿa÷\u001e¶$ç\u0015ã$b\u008a\u008e\u001e\u0092(`;îcà\"i\u0014ìÞl6a\u0005\u0092a©ß÷ÐÂRG»\u008c\böì\u001d3G©âT\u0098&µx\u0095K pñÛ\u0089ÏLaæ½Ë¦Ã)I\u0011\u00106½ú§z\u0095\u0093È¬\u0099õ®uhÏË\u0018yêwñmÿ\u0096\u008bù\r5vÖã\u0085Ó£Ýå\u0084\u000bÑl\u0094 \u008aÙbÃ¬\u0005\u000faößiY\fô6\u0013|ÆÈ\f3l\u0091\u0011\u0093Å*|d³Î~\u0010\u0097~w\u0018¬¼¤¤³\u0084¸e\u0015Z\u008eó(»W\u009f¬-O\u001eî±\u000b¬¸Î¹6b`hä\u0096òë õ{E([ô\f°Ð\u0084\u0082þ\u000f\u0098\u0007m\u001c\u0010\u0007ÎMF\tE\u009f¡\u008c°H\u0018\u0080Ù\u001cõ \u001b\f£\u001b-ÆÜ'¥\u0093yÖ\u000bCH\u000b\u0012\u000e\u0017\u0007ý\u001bo\u0018õ\u008d3÷¨ÝNÖ\u0010ÄU\u0090\u001f¡\u009b\u0006Ä\u001dm\u0082\u008f-Üù8\u0010\u0091ðPàõ½M È\u0080\u0017]õbxÂ è\u0090\u0082WwÏ[¹F¨\u0006ðÞx]Þlå Vblìt\u0015CÀà\u0095z0á @\u0080è]Çêyv°.ÑY¼\u0080\u0086ðØr²p\r*e=\u0091â\u0006ð_\u009aeó\u0010÷[C]+\u001bà¼_&\u0091<Öf¼\t0\u0010q[E¼©Ú1\u0017m\u0088GÇçf¶ª\u0013H´ &ä¨>n\u0014w(T`ç\u0086Ô@\u0086ÞRx\u0082öª`m`\u009b\u0011í\u0018ÿ\u0090lú*d\u0087\u009cö\u0015´o\u0018¢{\u0007çñY\u000f\u0091\u0085ãU(Ï³Ñ\u00826 \u0098.×t\u0007e\u0005IµÔ»Îe\u0096Ê\u0001%©4¼Dã¬×û³7R\u0016\u001c\u0019ÏPì\u0010\u0090q\u0016Òî\"½\u001c$\u0015\tëË\u0004éz\u0010RÕ?:\u00ad\r\u0088n\u0012¤%NB\u0089_O \u0017ÿÑ|@þ\u0094t¥+Ór\u0084JI:\b´êB[¶À0`Ä×.JÅÌ3\u00187\u0089Sá\u00034AYpÁy\rhÝ|l1ê#ð\t\u0085[\u000b $w(Ù<(\u0095bü\u001däÇ¹\u0005\u0013ºä\bÒæÎð]yR8\"e\\`\u009eb\u0010øA@C÷6\\õ¦¨øDb\"\u0003Ó \u0018)À9\u0084\u001cÍgmÚ@\u00834\u0019V\u0004Ç.i\u008c)i&zw\u008a\u0097#¼ÈùÍ \u00901\\e¬ª¸\u0096¦dÿì¾D\t\f\u001b7Â\u001d³,7åòZÔ\u0003Á÷m\r Øë¶\u009c·þä\u0015¸X\u0095L\b0Uæ¬+1]×S÷/à\u0093<åd\u001e¾ã\u0010çÊ6e\u0083Òº$9ú\u001f¶G\"\\J H)ß~ø¼ÿXä\u009bÏv\u000f\u0087\u009d\u000b\u0018\u0018~\u00067L\\bÒ·\u001e\\2't\u0015";
      int var17 = "4]Õ\u0093ø\u0098æC\u0087EïkÅ\u008ae°R³X³*\u0015@Z\u008dn\u0094\u008fÁ\u007fÌ\u0015\u0010P\u000eÌø¨òæ\u009cä\u0018\u008e8ÆóIæ\u0018\u0083\u001b¦¸\u007fù\u0091À\u000f\u0096\u0097\u009d¥h\u00149±å¯ªç\u009dA9\u0018LÊSFè©ªèÃ;\u0007\t¯¥¹b\u0083×öcóp|ç è©w{âi\u0016Bb\tüÈ\u008dúò\u009aÉÿa÷\u001e¶$ç\u0015ã$b\u008a\u008e\u001e\u0092(`;îcà\"i\u0014ìÞl6a\u0005\u0092a©ß÷ÐÂRG»\u008c\böì\u001d3G©âT\u0098&µx\u0095K pñÛ\u0089ÏLaæ½Ë¦Ã)I\u0011\u00106½ú§z\u0095\u0093È¬\u0099õ®uhÏË\u0018yêwñmÿ\u0096\u008bù\r5vÖã\u0085Ó£Ýå\u0084\u000bÑl\u0094 \u008aÙbÃ¬\u0005\u000faößiY\fô6\u0013|ÆÈ\f3l\u0091\u0011\u0093Å*|d³Î~\u0010\u0097~w\u0018¬¼¤¤³\u0084¸e\u0015Z\u008eó(»W\u009f¬-O\u001eî±\u000b¬¸Î¹6b`hä\u0096òë õ{E([ô\f°Ð\u0084\u0082þ\u000f\u0098\u0007m\u001c\u0010\u0007ÎMF\tE\u009f¡\u008c°H\u0018\u0080Ù\u001cõ \u001b\f£\u001b-ÆÜ'¥\u0093yÖ\u000bCH\u000b\u0012\u000e\u0017\u0007ý\u001bo\u0018õ\u008d3÷¨ÝNÖ\u0010ÄU\u0090\u001f¡\u009b\u0006Ä\u001dm\u0082\u008f-Üù8\u0010\u0091ðPàõ½M È\u0080\u0017]õbxÂ è\u0090\u0082WwÏ[¹F¨\u0006ðÞx]Þlå Vblìt\u0015CÀà\u0095z0á @\u0080è]Çêyv°.ÑY¼\u0080\u0086ðØr²p\r*e=\u0091â\u0006ð_\u009aeó\u0010÷[C]+\u001bà¼_&\u0091<Öf¼\t0\u0010q[E¼©Ú1\u0017m\u0088GÇçf¶ª\u0013H´ &ä¨>n\u0014w(T`ç\u0086Ô@\u0086ÞRx\u0082öª`m`\u009b\u0011í\u0018ÿ\u0090lú*d\u0087\u009cö\u0015´o\u0018¢{\u0007çñY\u000f\u0091\u0085ãU(Ï³Ñ\u00826 \u0098.×t\u0007e\u0005IµÔ»Îe\u0096Ê\u0001%©4¼Dã¬×û³7R\u0016\u001c\u0019ÏPì\u0010\u0090q\u0016Òî\"½\u001c$\u0015\tëË\u0004éz\u0010RÕ?:\u00ad\r\u0088n\u0012¤%NB\u0089_O \u0017ÿÑ|@þ\u0094t¥+Ór\u0084JI:\b´êB[¶À0`Ä×.JÅÌ3\u00187\u0089Sá\u00034AYpÁy\rhÝ|l1ê#ð\t\u0085[\u000b $w(Ù<(\u0095bü\u001däÇ¹\u0005\u0013ºä\bÒæÎð]yR8\"e\\`\u009eb\u0010øA@C÷6\\õ¦¨øDb\"\u0003Ó \u0018)À9\u0084\u001cÍgmÚ@\u00834\u0019V\u0004Ç.i\u008c)i&zw\u008a\u0097#¼ÈùÍ \u00901\\e¬ª¸\u0096¦dÿì¾D\t\f\u001b7Â\u001d³,7åòZÔ\u0003Á÷m\r Øë¶\u009c·þä\u0015¸X\u0095L\b0Uæ¬+1]×S÷/à\u0093<åd\u001e¾ã\u0010çÊ6e\u0083Òº$9ú\u001f¶G\"\\J H)ß~ø¼ÿXä\u009bÏv\u000f\u0087\u009d\u000b\u0018\u0018~\u00067L\\bÒ·\u001e\\2't\u0015".length();
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
                  i = new String[34];
                  t = new HashMap(13);
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
                  String var4 = "6hC×Aü¹´÷@tëo¹7õù\u009aF»\u009a\u0014\u0084i\u008c~ïe¼[uý´vÁ\r\u008bp3Ý\u0086\u000f)\u0097©Oà\u001e";
                  int var5 = "6hC×Aü¹´÷@tëo¹7õù\u009aF»\u009a\u0014\u0084i\u008c~ïe¼[uý´vÁ\r\u008bp3Ý\u0086\u000f)\u0097©Oà\u001e".length();
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
                              n = var6;
                              p = new Integer[8];
                              KProperty[] var26 = new KProperty[true.q<invokedynamic>(14397, 6165228223591890133L ^ var20)];
                              var26[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ne.class, true.n<invokedynamic>(13687, 309147373360497464L ^ var20), true.n<invokedynamic>(19802, 8414406096084122383L ^ var20), 0)));
                              var26[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ne.class, true.n<invokedynamic>(30140, 667153600659096545L ^ var20), true.n<invokedynamic>(31424, 3977156705465961617L ^ var20), 0)));
                              var26[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ne.class, true.n<invokedynamic>(30645, 1203498835453542910L ^ var20), true.n<invokedynamic>(24039, 8508593578987400111L ^ var20), 0)));
                              var26[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ne.class, true.n<invokedynamic>(31976, 2607485139644091033L ^ var20), true.n<invokedynamic>(29890, 5372485561229247112L ^ var20), 0)));
                              var26[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ne.class, true.n<invokedynamic>(21205, 2109909659226416276L ^ var20), true.n<invokedynamic>(22265, 2084681945397993639L ^ var20), 0)));
                              var26[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ne.class, true.n<invokedynamic>(13049, 5490625819920319625L ^ var20), true.n<invokedynamic>(8156, 8892736681483561358L ^ var20), 0)));
                              var26[true.q<invokedynamic>(23256, 313213254406069812L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ne.class, true.n<invokedynamic>(27424, 3304552086875807096L ^ var20), true.n<invokedynamic>(546, 7937548144598643820L ^ var20), 0)));
                              V = var26;
                              G = new ne(var24);
                              e = qi.R((il)G, true.n<invokedynamic>(22073, 2200034502365519993L ^ var20), true, (pj)null, (Function0)null, true.q<invokedynamic>(16267, 405549886698470246L ^ var20), var22, (Object)null);
                              R = qi.R((il)G, true.n<invokedynamic>(4328, 5872021454373185188L ^ var20), true, (pj)null, (Function0)null, true.q<invokedynamic>(32314, 4656836810512005844L ^ var20), var22, (Object)null);
                              x = qi.R((il)G, true.n<invokedynamic>(22625, 3368325449031396923L ^ var20), true, (pj)null, (Function0)null, true.q<invokedynamic>(32314, 4656836810512005844L ^ var20), var22, (Object)null);
                              K = qi.R((il)G, true.n<invokedynamic>(22744, 3047014664332357274L ^ var20), false, (pj)null, (Function0)null, true.q<invokedynamic>(32314, 4656836810512005844L ^ var20), var22, (Object)null);
                              m = qi.R((il)G, true.n<invokedynamic>(22856, 6249311899680255761L ^ var20), true, (pj)null, (Function0)null, true.q<invokedynamic>(32314, 4656836810512005844L ^ var20), var22, (Object)null);
                              P = qi.R((il)G, true.n<invokedynamic>(25633, 963270563552399997L ^ var20), true, (pj)null, (Function0)null, true.q<invokedynamic>(32314, 4656836810512005844L ^ var20), var22, (Object)null);
                              U = qi.R((il)G, true.n<invokedynamic>(3580, 663497019030764475L ^ var20), false, (pj)null, (Function0)null, true.q<invokedynamic>(32314, 4656836810512005844L ^ var20), var22, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var38;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "TP\u0087AÄ²PÄo\u0088°M4'Îû";
                           var5 = "TP\u0087AÄ²PÄo\u0088°M4'Îû".length();
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

               var15 = "ÿ\u0002bû\u009fä\t³u\u008dïÕSÃêíqàÅ\u0096\u00828 à\u0010\u0012z\u008b5\u0003vo\u0090[AÎ\u0013\u0011õS\u0087";
               var17 = "ÿ\u0002bû\u009fä\t³u\u008dïÕSÃêíqàÅ\u0096\u00828 à\u0010\u0012z\u008b5\u0003vo\u0090[AÎ\u0013\u0011õS\u0087".length();
               var14 = 24;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16885;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ne", var10);
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
         i[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/ne" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13133;
      if (p[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = n[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])t.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               t.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ne", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ne" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
