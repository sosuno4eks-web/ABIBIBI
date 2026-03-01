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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1792;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class ow extends k9 {
   @NotNull
   public static final ow N;
   static final KProperty[] S;
   @NotNull
   private static final zo U;
   @NotNull
   private static final zr n;
   @NotNull
   private static final z0 s;
   @NotNull
   private static final zo d;
   @NotNull
   private static final zo g;
   private static final long b = j0.a(3829942328441003905L, 3403134353403018515L, MethodHandles.lookup().lookupClass()).a(239986754921028L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;
   private static final long[] i;
   private static final Integer[] k;
   private static final Map l;

   private ow(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 10806845563923L;
      super(var3, true.a<invokedynamic>(28388, 5307745389183186499L ^ var1), pa.Q(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean H(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 16591754598156L;
      int var3 = (int)((var1 ^ 16591754598156L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)U.k((short)var3, this, S[0], (short)var4, var5);
   }

   private final void F(boolean var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 122485124691089L;
      int var4 = (int)((var2 ^ 122485124691089L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      U.P(this, var4, S[0], (short)var5, var1, (short)var6);
   }

   private final b d(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 26368130993119L;
      int var3 = (int)((var1 ^ 26368130993119L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (b)n.k((short)var3, this, S[1], (short)var4, var5);
   }

   private final void z(byte var1, b var2, int var3, int var4) {
      long var5 = ((long)var1 << 56 | (long)var3 << 32 >>> 8 | (long)var4 << 40 >>> 40) ^ b;
      long var10001 = var5 ^ 23977830523978L;
      int var7 = (int)((var5 ^ 23977830523978L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      n.P(this, var7, S[1], (short)var8, var2, (short)var9);
   }

   private final int R(long var1, byte var3) {
      long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ b;
      long var10001 = var4 ^ 126062188991075L;
      int var6 = (int)((var4 ^ 126062188991075L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)s.k((short)var6, this, S[2], (short)var7, var8)).intValue();
   }

   private final void F(int var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 112070825161704L;
      int var4 = (int)((var2 ^ 112070825161704L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      s.P(this, var4, S[2], (short)var5, var1, (short)var6);
   }

   private final boolean w(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 87722106413346L;
      int var3 = (int)((var1 ^ 87722106413346L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)d.k((short)var3, this, S[3], (short)var4, var5);
   }

   private final void D(boolean var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 82914605226224L;
      int var4 = (int)((var2 ^ 82914605226224L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      d.P(this, var4, S[3], (short)var5, var1, (short)var6);
   }

   private final boolean e(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 74086033802183L;
      int var3 = (int)((var1 ^ 74086033802183L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)g.k((short)var3, this, S[4], (short)var4, var5);
   }

   private final void z(boolean var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 35151441713757L;
      int var4 = (int)((var2 ^ 35151441713757L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      g.P(this, var4, S[4], (short)var5, var1, (short)var6);
   }

   @Flow
   private final void u(SendPacket var1) {
      System.out.println(var1.getPacket().getClass().getSimpleName());
   }

   @Flow
   private final void h(ReceivePacket var1) {
      System.out.println(var1.getPacket().getClass().getSimpleName());
   }

   @Flow
   private final void v(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final void j(@NotNull class_1792 item, float yaw, long a) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean V() {
      long var0 = b ^ 123812332342208L;
      long var2 = var0 ^ 94077705302722L;

      boolean var10000;
      try {
         if (N.d(var2) == su.catlean.b.CUSTOM) {
            var10000 = true;
            return var10000;
         }
      } catch (NoWhenBranchMatchedException var4) {
         throw var4.A<invokedynamic>(var4, 3790210213473091839L, var0);
      }

      var10000 = false;
      return var10000;
   }

   static {
      long var20 = b ^ 90936434578466L;
      long var22 = var20 ^ 134217829631772L;
      long var24 = var20 ^ 122424197287465L;
      long var26 = var20 ^ 15115262798669L;
      long var28 = var20 ^ 102713660361178L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[22];
      int var16 = 0;
      String var15 = ":.Õ\u001eú\u000fw`*\f\u008d· \u0016ï+ô*ï`D\u000eq\u0089zd³Ãû\u0089(µ -L\næ\"§X\u0080aTI\u0084ø¸¡%\b#\u0017\u001f¶\u008f\u0018\u001dÅBd\u0001eFÞ[\u0018Ò\u0086\u0080%¨T\u001cÊDÅä\"ôByÌ²\u009a>\u0004\u0083\u008fúÀ ![ÑÚÜ¦\u009c:\u0096ç>E\u008fdË-\ni\u0089V\u009d`/AÈÑÏ¥\u0081ùÚô \u0082\u0091Þå!i^bRóüöá\"êéÈà´\u0019vb\u0013¤rþD\u0093Û\u0094up\u0010ÀJ&ò{ö¬Èª\u008b¢oÜ«ïß\u00184\u0087$÷\u008a,°\u0016Q\\ë\u0019À?*\u007fÒjë?\u008b\u001a\u0012\u0093\u0010¶\u009dßDv¬ªN\u001d\u0082#\rK\"Ôê(\u009b+A¹çV\u000b\u0000\u0091\"\u0010y¥Å\u009b\u0098ja-py]sî<,îÑq%¬QoÔ§î\u009c\u0082.Ñ\u0010rª<\u0082zç;¦\u008b'tç\u0013ò¥E A÷,\u0085\u0087Û×:»\u008dèõ\u0015\u0082\u001e¸ô¹bE\u0005ù'eQµxýÚx¤\u0088 ]Î\u0097ÇK'1w^!\u0000÷»\u0016m\u0088^\u0000$?Ñ¬o\u0087!A\u008e\u0088\u001d§Æô 8÷\u0005\u0083Ê\u0091Ër\u009b¥\u008dÌK\u009a¢\bD\u008a·£qG!;ß\u0016÷VÆmn´\u0010ý\u0087»\u001cY¥\u000f}\u008dË\u0017\u0086-ØãM09¼|S\u009aýy°=¨\tbM2Ò-Î¡Å:\u001f\f~\u0000\u000b¯\u008f{\u001a½°Ý¶-fº/õ±\u000f\u009e¿þ\u000b36ì©\u00181ñÚû°X\u001b^\u0013ä÷.øõbEU\u008d¿Îú!¹\u0005(\u0086\u008f\bàBÚI\u001fA\u0094\u0006Ðï\u0019â¡\u00144\u0085\u0003ß\n¡ù\u0099«¼\\Ãè\u0088jD;Ûdl\"BÆ(äÃÑ)re©^êm\u0010\u0004\u0084\u0088\u001f9¾\u00adV\u009a\u008fúÄ6Ö\b~\\tÇ³\u008a\nkE\u0003EKÍK\u00105P{L¦íØ\u0006\u00828â\u0084A\u0082¢¡ \u0019^\u0007§RL\u0098fæbkT3Âo\u0082ÐeÕ\u0097ÝZØ©ýÝúY\u0082\u0090wË";
      int var17 = ":.Õ\u001eú\u000fw`*\f\u008d· \u0016ï+ô*ï`D\u000eq\u0089zd³Ãû\u0089(µ -L\næ\"§X\u0080aTI\u0084ø¸¡%\b#\u0017\u001f¶\u008f\u0018\u001dÅBd\u0001eFÞ[\u0018Ò\u0086\u0080%¨T\u001cÊDÅä\"ôByÌ²\u009a>\u0004\u0083\u008fúÀ ![ÑÚÜ¦\u009c:\u0096ç>E\u008fdË-\ni\u0089V\u009d`/AÈÑÏ¥\u0081ùÚô \u0082\u0091Þå!i^bRóüöá\"êéÈà´\u0019vb\u0013¤rþD\u0093Û\u0094up\u0010ÀJ&ò{ö¬Èª\u008b¢oÜ«ïß\u00184\u0087$÷\u008a,°\u0016Q\\ë\u0019À?*\u007fÒjë?\u008b\u001a\u0012\u0093\u0010¶\u009dßDv¬ªN\u001d\u0082#\rK\"Ôê(\u009b+A¹çV\u000b\u0000\u0091\"\u0010y¥Å\u009b\u0098ja-py]sî<,îÑq%¬QoÔ§î\u009c\u0082.Ñ\u0010rª<\u0082zç;¦\u008b'tç\u0013ò¥E A÷,\u0085\u0087Û×:»\u008dèõ\u0015\u0082\u001e¸ô¹bE\u0005ù'eQµxýÚx¤\u0088 ]Î\u0097ÇK'1w^!\u0000÷»\u0016m\u0088^\u0000$?Ñ¬o\u0087!A\u008e\u0088\u001d§Æô 8÷\u0005\u0083Ê\u0091Ër\u009b¥\u008dÌK\u009a¢\bD\u008a·£qG!;ß\u0016÷VÆmn´\u0010ý\u0087»\u001cY¥\u000f}\u008dË\u0017\u0086-ØãM09¼|S\u009aýy°=¨\tbM2Ò-Î¡Å:\u001f\f~\u0000\u000b¯\u008f{\u001a½°Ý¶-fº/õ±\u000f\u009e¿þ\u000b36ì©\u00181ñÚû°X\u001b^\u0013ä÷.øõbEU\u008d¿Îú!¹\u0005(\u0086\u008f\bàBÚI\u001fA\u0094\u0006Ðï\u0019â¡\u00144\u0085\u0003ß\n¡ù\u0099«¼\\Ãè\u0088jD;Ûdl\"BÆ(äÃÑ)re©^êm\u0010\u0004\u0084\u0088\u001f9¾\u00adV\u009a\u008fúÄ6Ö\b~\\tÇ³\u008a\nkE\u0003EKÍK\u00105P{L¦íØ\u0006\u00828â\u0084A\u0082¢¡ \u0019^\u0007§RL\u0098fæbkT3Âo\u0082ÐeÕ\u0097ÝZØ©ýÝúY\u0082\u0090wË".length();
      char var14 = ' ';
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
                  e = new String[22];
                  l = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[6];
                  int var3 = 0;
                  String var4 = "\u0084ÏZU¯ú×9ZN}Æ+|\u0084b\u000beC\u0088Ë\u008ca\"é\u000fJ!ò~fê";
                  int var5 = "\u0084ÏZU¯ú×9ZN}Æ+|\u0084b\u000beC\u0088Ë\u008ca\"é\u000fJ!ò~fê".length();
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
                              k = new Integer[6];
                              KProperty[] var30 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ow.class, true.a<invokedynamic>(4340, 8081301546447134286L ^ var20), true.a<invokedynamic>(17581, 6856834150557747740L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ow.class, true.a<invokedynamic>(25243, 8098079387951148077L ^ var20), true.a<invokedynamic>(24832, 2381223941603864486L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ow.class, true.a<invokedynamic>(31083, 3344362380481476572L ^ var20), true.a<invokedynamic>(19030, 739317198319748337L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ow.class, true.a<invokedynamic>(14982, 281343679791985721L ^ var20), true.a<invokedynamic>(25579, 1488580197643234633L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ow.class, true.a<invokedynamic>(3647, 7300400877730218127L ^ var20), true.a<invokedynamic>(3973, 7403714848630817062L ^ var20), 0)))};
                              S = var30;
                              N = new ow(var26);
                              U = qi.R((il)N, true.a<invokedynamic>(24606, 3223391115139493536L ^ var20), true, (pj)null, (Function0)null, true.d<invokedynamic>(11420, 1823187106552809237L ^ var20), var28, (Object)null);
                              n = qi.M((il)N, true.a<invokedynamic>(3714, 1199995939362881571L ^ var20), (Enum)su.catlean.b.SMART, (pj)null, (Function0)null, true.d<invokedynamic>(12671, 5089160652503522034L ^ var20), (Object)null, var24);
                              s = qi.o((il)N, true.a<invokedynamic>(12386, 7049422867045056218L ^ var20), 1, new IntRange(1, true.d<invokedynamic>(6057, 1413991184669260833L ^ var20)), var22, (pj)null, ow::V, true.d<invokedynamic>(12366, 7393028368022281156L ^ var20), (Object)null);
                              d = qi.R((il)N, true.a<invokedynamic>(21646, 6433160773115976238L ^ var20), true, (pj)null, (Function0)null, true.d<invokedynamic>(12671, 5089160652503522034L ^ var20), var28, (Object)null);
                              g = qi.R((il)N, true.a<invokedynamic>(1073, 6104272777451784845L ^ var20), true, (pj)null, (Function0)null, true.d<invokedynamic>(12671, 5089160652503522034L ^ var20), var28, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u000b\u0096\u0089\u0001\u001bd³RyUÝ\u0016÷\u0094ïÔ";
                           var5 = "\u000b\u0096\u0089\u0001\u001bd³RyUÝ\u0016÷\u0094ïÔ".length();
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

               var15 = "`u¢\u008dCúÍ\u000e×jï\u0001>\u0010Ï%\u0097¤!¼ö\u0084\u0004\f,\u008f\u0015ì&Ï\u0003¢²ºù\u009a\u0010^:ï0z\u0004\u0091åÔ`©\u009a1äU\u0091\u008f)6±\n\u0091x.)\u0090è9TJýª\rÒ¤Ïú\u009d\\íñ¿Põ-\u007fqç1\u0017\u001cò";
               var17 = "`u¢\u008dCúÍ\u000e×jï\u0001>\u0010Ï%\u0097¤!¼ö\u0084\u0004\f,\u008f\u0015ì&Ï\u0003¢²ºù\u009a\u0010^:ï0z\u0004\u0091åÔ`©\u009a1äU\u0091\u008f)6±\n\u0091x.)\u0090è9TJýª\rÒ¤Ïú\u009d\\íñ¿Põ-\u007fqç1\u0017\u001cò".length();
               var14 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10185;
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
            throw new RuntimeException("su/catlean/ow", var10);
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
         throw new RuntimeException("su/catlean/ow" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17138;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
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
            throw new RuntimeException("su/catlean/ow", var14);
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
         throw new RuntimeException("su/catlean/ow" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
