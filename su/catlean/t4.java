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
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class t4 extends k9 {
   @NotNull
   public static final t4 S;
   // $FF: synthetic field
   static final KProperty[] l;
   @NotNull
   private static final zc d;
   @NotNull
   private static final z0 i;
   @NotNull
   private static final zo u;
   @NotNull
   private static final zo O;
   @NotNull
   private static final zo m;
   @NotNull
   private static final zo K;
   private static int M;
   private static final long b = j0.a(-6309051452474913694L, 6060142204606696300L, MethodHandles.lookup().lookupClass()).a(144961670839468L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] k;
   private static final Map n;

   private t4(long var1, byte var3) {
      long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ b;
      long var6 = var4 ^ 101023741297881L;
      super(var6, true.s<invokedynamic>(11066, 7214623381819301488L ^ var4), pa.w(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final float v(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 131221930832125L;
      int var3 = (int)((var1 ^ 131221930832125L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)d.k((short)var3, this, l[0], (short)var4, var5)).floatValue();
   }

   private final int A(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 99237824980533L;
      int var3 = (int)((var1 ^ 99237824980533L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)i.k((short)var3, this, l[1], (short)var4, var5)).intValue();
   }

   private final boolean e(char var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 61861573998289L;
      int var6 = (int)((var4 ^ 61861573998289L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)u.k((short)var6, this, l[2], (short)var7, var8);
   }

   private final boolean j(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 105308670566373L;
      int var3 = (int)((var1 ^ 105308670566373L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)O.k((short)var3, this, l[3], (short)var4, var5);
   }

   private final boolean W(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 67883118132260L;
      int var6 = (int)((var4 ^ 67883118132260L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)m.k((short)var6, this, l[4], (short)var7, var8);
   }

   private final boolean Y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 55151545968595L;
      int var3 = (int)((var1 ^ 55151545968595L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)K.k((short)var3, this, l[5], (short)var4, var5);
   }

   @Flow
   private final void Q(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 34288933882734L;
      long var22 = var20 ^ 118725388979606L;
      long var10001 = var20 ^ 19865423353035L;
      long var24 = (var20 ^ 19865423353035L) >>> 8;
      int var26 = (int)(var10001 << 56 >>> 56);
      long var27 = var20 ^ 26946169306951L;
      long var29 = var20 ^ 84121457083216L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[19];
      int var16 = 0;
      String var15 = "ÅD\u0094ÀÑ\u00ad·\u0095Á\u009b$\rËo¤¥#\u0017øþ##a\u0084\u007fËÁ\u0081géó\u000507\u001f\u001a`\u0082&Ûy^äÛ\u0014W§M¥©}w)!\u0014´Ýð¯·n\u0087¡XR\u001b?WGÓ\u008c\u0016\u0094\u000b¨\u0083¨Ì©³\u009b(A]\u001fí*ñCr\u0083.D7éÃÄ\"\u0099 bvðpq\u009fJfÁª\u0019ÿ=Ð³ü¹\u0015ÈÔ¬ø wÿXùÐSÂ\u0003#\u0088\u0090ñ\u0010\u009c\u0092©»~\u001e\u0092ÇÖ(Kê¨Æ#im3\u001f µ 5ék\u008cK°ØP\u0000\u001c\u0099\u009b\tÅ\u0099÷\u0002\u0097ni*\u0007ò\u0016óA\u0093nÄ\u0083\u0010\u0096«ßdrw\u0083?-Õª7ÈLkx(\u0013\u0093\u008e\u0090\u0001Zì;ãV\u0096\bqYe\f\u0017Èè|úù§\u0019Ç\u0084ÿ8Â~c<\u0097Ø¬Ú}*\u0002«\u0018\u001eÒ\u001e¬\u0085¬ë|ø\n\u000e¨´\u0005\u0081\u0093\r1eï\u001f60« é\u0086\u0081¾}9·Jè\u0086$HÆÀFô\u009bñy\u009d ;ý\u0005 \u001ck½oW\u0002 (ÿ\u001ba\u008f\"i\u0010\u0094\u0017æ!qYw\u0095È\u001a^b¤ñD\u0083\u008bê\u001b\u0006ò©\u001a¥\u001eN4ãÕ6\u001e\u0096? \u0011\u000f5Ë@\u0018îðJ\u00ad<S7\"\u0094ätëtæ¸çgåà\u0096q\u0085x\b?D Ç\u0018ù´äT\u0092DÅß\u0007\u0092·\u0090\u0003\u0082ßÔ\u0014-\u0006W^\u008a\u0015S¸\bîL\u0004Ì(\u000fkpeê&Ï¦S\u0019¸\u0007ÓüS@\u0080L\u0013æÓÚrÂý \t×\u00ad#\u009d\u001cl2ìÛV\u0013;K \u0003\u0083ôÆ$\u0081W.ùêZ¸^\u009c\u009d\u0006r\u0094½9%ÔkSöÎ{\u0094\u00ad\u001a\u0086\u008f8ºHm·VhKW\u0090\u008f:8j\u0094þÎ\u0005\u0093\u008b(á\u0019Y\u0013¥½O[º9\fX\u0096Ü6 â\u0085w°\u0082èò\u0096\u009cv0\u0004\u0089\u0016\\\u00841éfë(pG\u001aÏú6NÎ¥¦íD\u008c2æF^MhË2µzBØ3\u008aÇkIù\u008e#¿\u008bæ\u008c\u008b¨c â\u0097å\u001añk\u008dY\u0080\f\u007f\u0010\u0014\u0080\u008d\u0088TAÐ\u008c\u001ct\u0014¬j'2ÁwÇ¸o";
      int var17 = "ÅD\u0094ÀÑ\u00ad·\u0095Á\u009b$\rËo¤¥#\u0017øþ##a\u0084\u007fËÁ\u0081géó\u000507\u001f\u001a`\u0082&Ûy^äÛ\u0014W§M¥©}w)!\u0014´Ýð¯·n\u0087¡XR\u001b?WGÓ\u008c\u0016\u0094\u000b¨\u0083¨Ì©³\u009b(A]\u001fí*ñCr\u0083.D7éÃÄ\"\u0099 bvðpq\u009fJfÁª\u0019ÿ=Ð³ü¹\u0015ÈÔ¬ø wÿXùÐSÂ\u0003#\u0088\u0090ñ\u0010\u009c\u0092©»~\u001e\u0092ÇÖ(Kê¨Æ#im3\u001f µ 5ék\u008cK°ØP\u0000\u001c\u0099\u009b\tÅ\u0099÷\u0002\u0097ni*\u0007ò\u0016óA\u0093nÄ\u0083\u0010\u0096«ßdrw\u0083?-Õª7ÈLkx(\u0013\u0093\u008e\u0090\u0001Zì;ãV\u0096\bqYe\f\u0017Èè|úù§\u0019Ç\u0084ÿ8Â~c<\u0097Ø¬Ú}*\u0002«\u0018\u001eÒ\u001e¬\u0085¬ë|ø\n\u000e¨´\u0005\u0081\u0093\r1eï\u001f60« é\u0086\u0081¾}9·Jè\u0086$HÆÀFô\u009bñy\u009d ;ý\u0005 \u001ck½oW\u0002 (ÿ\u001ba\u008f\"i\u0010\u0094\u0017æ!qYw\u0095È\u001a^b¤ñD\u0083\u008bê\u001b\u0006ò©\u001a¥\u001eN4ãÕ6\u001e\u0096? \u0011\u000f5Ë@\u0018îðJ\u00ad<S7\"\u0094ätëtæ¸çgåà\u0096q\u0085x\b?D Ç\u0018ù´äT\u0092DÅß\u0007\u0092·\u0090\u0003\u0082ßÔ\u0014-\u0006W^\u008a\u0015S¸\bîL\u0004Ì(\u000fkpeê&Ï¦S\u0019¸\u0007ÓüS@\u0080L\u0013æÓÚrÂý \t×\u00ad#\u009d\u001cl2ìÛV\u0013;K \u0003\u0083ôÆ$\u0081W.ùêZ¸^\u009c\u009d\u0006r\u0094½9%ÔkSöÎ{\u0094\u00ad\u001a\u0086\u008f8ºHm·VhKW\u0090\u008f:8j\u0094þÎ\u0005\u0093\u008b(á\u0019Y\u0013¥½O[º9\fX\u0096Ü6 â\u0085w°\u0082èò\u0096\u009cv0\u0004\u0089\u0016\\\u00841éfë(pG\u001aÏú6NÎ¥¦íD\u008c2æF^MhË2µzBØ3\u008aÇkIù\u008e#¿\u008bæ\u008c\u008b¨c â\u0097å\u001añk\u008dY\u0080\f\u007f\u0010\u0014\u0080\u008d\u0088TAÐ\u008c\u001ct\u0014¬j'2ÁwÇ¸o".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var32 = var15.substring(var13, var13 + var14);
         byte var34 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
            String var39 = b(var19).intern();
            switch(var34) {
            case 0:
               var18[var16++] = var39;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  e = new String[19];
                  n = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[7];
                  int var3 = 0;
                  String var4 = "*NdU¤&y<\u0098\u001a\u0001\u0090Pò^\u0012À\u0019éE\u0018¦\u0098ó\u0080ã\u0011Ë±h%gÌ\u0095sT\u0098l::";
                  int var5 = "*NdU¤&y<\u0098\u001a\u0001\u0090Pò^\u0012À\u0019éE\u0018¦\u0098ó\u0080ã\u0011Ë±h%gÌ\u0095sT\u0098l::".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var38 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                     long[] var35 = var6;
                     var38 = var3++;
                     long var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var8 = var41;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var42) {
                        case 0:
                           var35[var38] = var44;
                           if (var2 >= var5) {
                              g = var6;
                              k = new Integer[7];
                              KProperty[] var31 = new KProperty[true.g<invokedynamic>(18341, 1321011134582508345L ^ var20)];
                              var31[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t4.class, true.s<invokedynamic>(5409, 2638040870452698168L ^ var20), true.s<invokedynamic>(27231, 3420614676204118855L ^ var20), 0)));
                              var31[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t4.class, true.s<invokedynamic>(5312, 1688723711147613649L ^ var20), true.s<invokedynamic>(32281, 8877541048911623950L ^ var20), 0)));
                              var31[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t4.class, true.s<invokedynamic>(19835, 1308280319873795168L ^ var20), true.s<invokedynamic>(13205, 6700953231255583361L ^ var20), 0)));
                              var31[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t4.class, true.s<invokedynamic>(2268, 7466009682636177857L ^ var20), true.s<invokedynamic>(1149, 3400398907441319285L ^ var20), 0)));
                              var31[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t4.class, true.s<invokedynamic>(30366, 8606510747393228684L ^ var20), true.s<invokedynamic>(8425, 5401133616917883388L ^ var20), 0)));
                              var31[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t4.class, true.s<invokedynamic>(23424, 2179983345769435806L ^ var20), true.s<invokedynamic>(21349, 8740871268209121910L ^ var20), 0)));
                              l = var31;
                              S = new t4(var24, (byte)var26);
                              d = qi.g((il)S, true.s<invokedynamic>(14312, 9108251409904582371L ^ var20), 3.0F, RangesKt.rangeTo(1.0F, 7.0F), (pj)null, (Function0)null, true.g<invokedynamic>(23018, 5343628186645353843L ^ var20), var27, (Object)null);
                              i = qi.o((il)S, true.s<invokedynamic>(32317, 591689994320377639L ^ var20), 1, new IntRange(0, true.g<invokedynamic>(26425, 3947072260067584929L ^ var20)), var22, (pj)null, (Function0)null, true.g<invokedynamic>(13734, 9145692662784145724L ^ var20), (Object)null);
                              u = qi.R((il)S, true.s<invokedynamic>(5487, 324912196253097075L ^ var20), false, (pj)null, (Function0)null, true.g<invokedynamic>(8306, 6923678235685170409L ^ var20), var29, (Object)null);
                              O = qi.R((il)S, true.s<invokedynamic>(5459, 4022135147924560985L ^ var20), false, (pj)null, (Function0)null, true.g<invokedynamic>(31237, 8129013313824913050L ^ var20), var29, (Object)null);
                              m = qi.R((il)S, true.s<invokedynamic>(13564, 6375310821581929964L ^ var20), false, (pj)null, (Function0)null, true.g<invokedynamic>(31237, 8129013313824913050L ^ var20), var29, (Object)null);
                              K = qi.R((il)S, true.s<invokedynamic>(694, 3469428522451209120L ^ var20), false, (pj)null, (Function0)null, true.g<invokedynamic>(31237, 8129013313824913050L ^ var20), var29, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var35[var38] = var44;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = " £Mv\u000bÃ#}%?n9æ¿è¾";
                           var5 = " £Mv\u000bÃ#}%?n9æ¿è¾".length();
                           var2 = 0;
                        }

                        var38 = var2;
                        var2 += 8;
                        var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                        var35 = var6;
                        var38 = var3++;
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

               var15 = "\u009d>pSf}P\b³Oo\u0001Æ¨\u0012_ `\u0086\u0089ìý\\Än£\f&\u0082³\u008aMGB\u0015\u001a}ÇK=rþ\u0088\u009dKhTV\u00ad";
               var17 = "\u009d>pSf}P\b³Oo\u0001Æ¨\u0012_ `\u0086\u0089ìý\\Än£\f&\u0082³\u008aMGB\u0015\u001a}ÇK=rþ\u0088\u009dKhTV\u00ad".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var32 = var15.substring(var13, var13 + var14);
            var34 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27370;
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
            throw new RuntimeException("su/catlean/t4", var10);
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
         throw new RuntimeException("su/catlean/t4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28522;
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
            throw new RuntimeException("su/catlean/t4", var14);
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
         throw new RuntimeException("su/catlean/t4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
