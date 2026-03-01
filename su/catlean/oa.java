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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class oa extends k9 {
   @NotNull
   public static final oa N;
   static final KProperty[] z;
   @NotNull
   private static final z0 O;
   @NotNull
   private static final zo c;
   @NotNull
   private static final z7 Y;
   @NotNull
   private static n U;
   private static final long b = j0.a(36539132280339425L, 7278453603403588133L, MethodHandles.lookup().lookupClass()).a(14979313445721L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private oa(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 67880977700829L;
      super(var3, true.b<invokedynamic>(14391, 5799329127244962549L ^ var1), pa.w(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final int W(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 39157503744536L;
      int var3 = (int)((var1 ^ 39157503744536L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)O.k((short)var3, this, z[0], (short)var4, var5)).intValue();
   }

   private final boolean G(int var1, int var2) {
      long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ b;
      long var10001 = var3 ^ 31566175622679L;
      int var5 = (int)((var3 ^ 31566175622679L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      return (Boolean)c.k((short)var5, this, z[1], (short)var6, var7);
   }

   private final n_ m(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 113961890031400L;
      int var3 = (int)((var1 ^ 113961890031400L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (n_)Y.k((short)var3, this, z[2], (short)var4, var5);
   }

   @Flow
   private final void X(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void e(char param1, int[] param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit V() {
      return Unit.INSTANCE;
   }

   private static final void o(Function0 var0) {
      var0.invoke();
   }

   private static final void B(Function0 param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit d(int param0, Function0 param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 97393177305109L;
      long var22 = var20 ^ 57137831324852L;
      long var24 = var20 ^ 74731059780953L;
      long var10001 = var20 ^ 31099882182914L;
      int var26 = (int)((var20 ^ 31099882182914L) >>> 32);
      int var27 = (int)(var10001 << 32 >>> 48);
      int var28 = (int)(var10001 << 48 >>> 48);
      var10001 = var20 ^ 117075646866827L;
      int var29 = (int)((var20 ^ 117075646866827L) >>> 32);
      int var30 = (int)(var10001 << 32 >>> 48);
      int var31 = (int)(var10001 << 48 >>> 48);
      var10001 = var20 ^ 134097381179995L;
      int var32 = (int)((var20 ^ 134097381179995L) >>> 48);
      int var33 = (int)(var10001 << 16 >>> 32);
      int var34 = (int)(var10001 << 48 >>> 48);
      long var35 = var20 ^ 110566609130399L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[14];
      int var16 = 0;
      String var15 = "\u0085äU\u009fÀ\f\u000e\u008d\u001c¾f,GÆÚÁ¢¾èpõKs\u0012yÈ\u0011!\u001e\u008br\u0010 \nK,Xèçgþ\u0090X\u0097>µ*\u0081\u009a «\u008f¿ô\b`m\u001fo\u009aû\u0080HO¾\u0018æ¥÷+G³Dü\u0082\u0016{\u009b6mtï¹¤Põ<ýÔ\u0086\u0010Èu×S\u008b \u008dÍòå.\u0093\n-c\r \u008a\u00836D|ñÖ¶dÇN\u009d9+_JÕÔïó\u0083ò\nhã°³÷Éßz{\u0088ùÆjY\u0084r¡à\u0017Õmý!õ{ú<´ühÑ\u0007\\A\u0087åR\u00938þ\u0011Ñu\u007fZÔw¯Q\u0003ß\u008ec£ñ\u001d\u0002Ñ!HÈ~)B0ãä6\u009fäJYAÜ\t¡\u00913p\u0099\u0017ÓºSíYh\u0007¢ITb£\u008e¾BÁõ>£säÈ#<2ÿín\u0000¢&Õ=\u0018y\u0099J³O4\u008e¡\t\u0088ç¬gf¨ÏW}9C´g{\u00174\u00902ù\u00113ùx×Þ\u0013\u000f7Ñ\b0ö³\u001f\u007füª\u001d9r{!Sîll0K\u009fvf\u0019M\u0016Ã²¾æ¦m\u0000dd\u0095[FâÑ\u0084þsG¸\u008cì2\u0014É'Ý@A-!\u001f°\u001bRu¹äèI¢\u0090¶1×}{$ðp6.|\u0018\u000e\u001db7²\u0010X\u001fí\u001f.ÂâTÀ]\u0080\u0096@eÈñ|OõÐõk\u008e\u008a\u007f\u008d5\u007f#\u0011\u0018\u0001ýÁ\u008f\rG@Úw:è]0m<\u0092m\u000f\u000f\u0018Ò\u0001òc >\u008cÛÍý\u0085\u0097®1»\u001el°¢Ó\u0016\r\u0001z`\u0015¾³\b\u0085\u001aüüÂÜçà ×&\u0085\u0017\u001bÜbðM\u0092µZ2\u0016NG(4~\u00adêó2\u0096¨Äæ³ÔÅäý(·\u008eOs0Ü\u0011È»©ÏD\u0099Õf\rÈÑJmð\u008a\u001c[sàyÅ\u008d>\\\u0012\u0014Bèw&[(9(k1\u009b\u0084D1\u0093ä¥}¦TÝ©XE\u0097\u0002E!l(ØÐy2fÙ\u0094#v\u0089\u0019°\u001bïâ\u008fË\u0082";
      int var17 = "\u0085äU\u009fÀ\f\u000e\u008d\u001c¾f,GÆÚÁ¢¾èpõKs\u0012yÈ\u0011!\u001e\u008br\u0010 \nK,Xèçgþ\u0090X\u0097>µ*\u0081\u009a «\u008f¿ô\b`m\u001fo\u009aû\u0080HO¾\u0018æ¥÷+G³Dü\u0082\u0016{\u009b6mtï¹¤Põ<ýÔ\u0086\u0010Èu×S\u008b \u008dÍòå.\u0093\n-c\r \u008a\u00836D|ñÖ¶dÇN\u009d9+_JÕÔïó\u0083ò\nhã°³÷Éßz{\u0088ùÆjY\u0084r¡à\u0017Õmý!õ{ú<´ühÑ\u0007\\A\u0087åR\u00938þ\u0011Ñu\u007fZÔw¯Q\u0003ß\u008ec£ñ\u001d\u0002Ñ!HÈ~)B0ãä6\u009fäJYAÜ\t¡\u00913p\u0099\u0017ÓºSíYh\u0007¢ITb£\u008e¾BÁõ>£säÈ#<2ÿín\u0000¢&Õ=\u0018y\u0099J³O4\u008e¡\t\u0088ç¬gf¨ÏW}9C´g{\u00174\u00902ù\u00113ùx×Þ\u0013\u000f7Ñ\b0ö³\u001f\u007füª\u001d9r{!Sîll0K\u009fvf\u0019M\u0016Ã²¾æ¦m\u0000dd\u0095[FâÑ\u0084þsG¸\u008cì2\u0014É'Ý@A-!\u001f°\u001bRu¹äèI¢\u0090¶1×}{$ðp6.|\u0018\u000e\u001db7²\u0010X\u001fí\u001f.ÂâTÀ]\u0080\u0096@eÈñ|OõÐõk\u008e\u008a\u007f\u008d5\u007f#\u0011\u0018\u0001ýÁ\u008f\rG@Úw:è]0m<\u0092m\u000f\u000f\u0018Ò\u0001òc >\u008cÛÍý\u0085\u0097®1»\u001el°¢Ó\u0016\r\u0001z`\u0015¾³\b\u0085\u001aüüÂÜçà ×&\u0085\u0017\u001bÜbðM\u0092µZ2\u0016NG(4~\u00adêó2\u0096¨Äæ³ÔÅäý(·\u008eOs0Ü\u0011È»©ÏD\u0099Õf\rÈÑJmð\u008a\u001c[sàyÅ\u008d>\\\u0012\u0014Bèw&[(9(k1\u009b\u0084D1\u0093ä¥}¦TÝ©XE\u0097\u0002E!l(ØÐy2fÙ\u0094#v\u0089\u0019°\u001bïâ\u008fË\u0082".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var45 = var15.substring(var13, var13 + var14);
         byte var49 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var45.getBytes("ISO-8859-1"));
            String var52 = b(var19).intern();
            switch(var49) {
            case 0:
               var18[var16++] = var52;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[14];
                  k = new HashMap(13);
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
                  String var4 = "\u0085¸N\u0011\u0090N\u0017\u0098\u00127cÓsbóÊ\u001dr\u0017\u0099ü§ñP\u0014´;j³Ðï¼¹\u0015ünÇ\u009d\u008c·";
                  int var5 = "\u0085¸N\u0011\u0090N\u0017\u0098\u00127cÓsbóÊ\u001dr\u0017\u0099ü§ñP\u0014´;j³Ðï¼¹\u0015ünÇ\u009d\u008c·".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var54 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var54, var2).getBytes("ISO-8859-1");
                     long[] var47 = var6;
                     var54 = var3++;
                     long var55 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var56 = -1;

                     while(true) {
                        long var8 = var55;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var58 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var56) {
                        case 0:
                           var47[var54] = var58;
                           if (var2 >= var5) {
                              g = var6;
                              i = new Integer[7];
                              KProperty[] var44 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oa.class, true.b<invokedynamic>(10669, 6743716104661972218L ^ var20), true.b<invokedynamic>(6452, 3478864510201168992L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oa.class, true.b<invokedynamic>(19380, 9064315660908877549L ^ var20), true.b<invokedynamic>(11519, 5271628815478370730L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oa.class, true.b<invokedynamic>(31428, 9079099526978103198L ^ var20), true.b<invokedynamic>(23431, 8498640954502072021L ^ var20), 0)))};
                              z = var44;
                              N = new oa(var22);
                              O = qi.o((il)N, true.b<invokedynamic>(16462, 768120804527824147L ^ var20), 1, new IntRange(0, 5), var24, (pj)null, (Function0)null, true.g<invokedynamic>(4512, 1334423561083651017L ^ var20), (Object)null);
                              c = qi.R((il)N, true.b<invokedynamic>(12360, 7382834021084081430L ^ var20), false, (pj)null, (Function0)null, true.g<invokedynamic>(7256, 4422529482301574706L ^ var20), var35, (Object)null);
                              il var48 = (il)N;
                              String var51 = 20967.b<invokedynamic>(20967, 8315010831960984760L ^ var20);
                              n_ var59 = new n_(0, var29, (char)var30, false, (char)var31, false, true.g<invokedynamic>(21460, 7377012848869065151L ^ var20), (DefaultConstructorMarker)null);
                              int var10005 = 735.g<invokedynamic>(735, 2107512589614158002L ^ var20);
                              Object var37 = null;
                              int var38 = var10005;
                              Object var39 = null;
                              Object var40 = null;
                              n_ var41 = var59;
                              String var42 = var51;
                              il var43 = var48;
                              Y = qi.b(var26, var43, var42, (char)var27, var41, (pj)var40, (Function0)var39, var38, var37, (short)var28);
                              U = new n((char)var32, var33, (char)var34);
                              return;
                           }
                           break;
                        default:
                           var47[var54] = var58;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "^ø\u0097²ÑÎ¹Ùu\u008aeX\u001d\nß\u009a";
                           var5 = "^ø\u0097²ÑÎ¹Ùu\u008aeX\u001d\nß\u009a".length();
                           var2 = 0;
                        }

                        var54 = var2;
                        var2 += 8;
                        var7 = var4.substring(var54, var2).getBytes("ISO-8859-1");
                        var47 = var6;
                        var54 = var3++;
                        var55 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var56 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var52;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "«t\u0019i¸È«\u0080ÍEøð0P\tÛk \r\u0013ó\u00adï/K\\Á|â¦S\r \u001f\u00823ã\u009f\u0007\u0006$\u0019&w\u001a\u0000d,}h#£5\u009d²¬\u0018\u008c\u0016ÌÔ\u0096ØÎÏ\u0005n°â\"\u00928Òÿe¯\u008eñK}¿";
               var17 = "«t\u0019i¸È«\u0080ÍEøð0P\tÛk \r\u0013ó\u00adï/K\\Á|â¦S\r \u001f\u00823ã\u009f\u0007\u0006$\u0019&w\u001a\u0000d,}h#£5\u009d²¬\u0018\u008c\u0016ÌÔ\u0096ØÎÏ\u0005n°â\"\u00928Òÿe¯\u008eñK}¿".length();
               var14 = '8';
               var13 = -1;
            }

            ++var13;
            var45 = var15.substring(var13, var13 + var14);
            var49 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11873;
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
            throw new RuntimeException("su/catlean/oa", var10);
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
         throw new RuntimeException("su/catlean/oa" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8528;
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
            throw new RuntimeException("su/catlean/oa", var14);
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
         throw new RuntimeException("su/catlean/oa" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
