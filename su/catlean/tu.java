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
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.gofra.Flow;

public final class tu extends k9 {
   @NotNull
   public static final tu q;
   static final KProperty[] m;
   @NotNull
   private static final zr u;
   @NotNull
   private static final z0 K;
   @NotNull
   private static final z0 B;
   @NotNull
   private static final iv N;
   private static final long b = j0.a(8498432821793512267L, 7425511676373019663L, MethodHandles.lookup().lookupClass()).a(25077542588097L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private tu(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 20071504402198L;
      super(var3, true.p<invokedynamic>(26755, 1730035624904148706L ^ var1), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final i8 I(byte var1, long var2) {
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ b;
      long var10001 = var4 ^ 83741422898492L;
      int var6 = (int)((var4 ^ 83741422898492L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (i8)u.k((short)var6, this, m[0], (short)var7, var8);
   }

   private final int v(int var1, int var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 90938266391801L;
      int var6 = (int)((var4 ^ 90938266391801L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)K.k((short)var6, this, m[1], (short)var7, var8)).intValue();
   }

   private final int M(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 59348213558305L;
      int var6 = (int)((var4 ^ 59348213558305L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)B.k((short)var6, this, m[2], (short)var7, var8)).intValue();
   }

   @Flow
   public final void K(@NotNull Render2DEvent event) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 32139156972377L;
      long var22 = var20 ^ 12340670852942L;
      long var24 = var20 ^ 98561209675571L;
      long var26 = var20 ^ 33480705123963L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[11];
      int var16 = 0;
      String var15 = "p\u008f\u0097\u001cDR\u0007`\u0000æ»É\u001d\u0080Ok\u0010|,\u009b&c\u0086H\u001fßËÏØòÁ¿$ U-\u0089\u0089\u0017½ì\u0019\u0013Ûêð\u0016\u0016\u0018Î\u0095R\u0002@Õ\n¦:g¦d\u001d-;\u0007\u009a\u0010Â[º\u0007©© Ã@\u0080÷F\u0087N-\r\u0010 +aÍÐþ2Ù9\u001eD2Ò\u0098\tR\u0018\u009dÅd(Åì\u0082\u0006}\u0095vð\u0092}\u0010ðÖ£ÜkÐÑ\u0086j ^@\u0000å\u0097ªÛPÚ\u0084Í'õGMUÝQ\u000bù,\u0011\u0082¡Ì[~\u0004hS\u0014\b0\u0085\u0011\u0097#jÎ£*\u008b°ööw*ØÍæSC\u007f*\"_`\u001e\u0092Ç\u0084¿Q<Ó/\\C)´nîÌ\u009f¡V\u0081\u0097\u0013Í\u0093\u0010Põ¤$t¤}_àEw\u000e\u0087A\u0095ê";
      int var17 = "p\u008f\u0097\u001cDR\u0007`\u0000æ»É\u001d\u0080Ok\u0010|,\u009b&c\u0086H\u001fßËÏØòÁ¿$ U-\u0089\u0089\u0017½ì\u0019\u0013Ûêð\u0016\u0016\u0018Î\u0095R\u0002@Õ\n¦:g¦d\u001d-;\u0007\u009a\u0010Â[º\u0007©© Ã@\u0080÷F\u0087N-\r\u0010 +aÍÐþ2Ù9\u001eD2Ò\u0098\tR\u0018\u009dÅd(Åì\u0082\u0006}\u0095vð\u0092}\u0010ðÖ£ÜkÐÑ\u0086j ^@\u0000å\u0097ªÛPÚ\u0084Í'õGMUÝQ\u000bù,\u0011\u0082¡Ì[~\u0004hS\u0014\b0\u0085\u0011\u0097#jÎ£*\u008b°ööw*ØÍæSC\u007f*\"_`\u001e\u0092Ç\u0084¿Q<Ó/\\C)´nîÌ\u009f¡V\u0081\u0097\u0013Í\u0093\u0010Põ¤$t¤}_àEw\u000e\u0087A\u0095ê".length();
      char var14 = 16;
      int var13 = -1;

      label55:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var35 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var35;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[11];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[7];
                  int var4 = 0;
                  String var5 = "Ý\u0091\u008d\u008dê\u0091\u0096*\u0017~ì¶\u0096\u0084e\u0085\u0089Y§ù_\u0090;\u0015\u0003ßÝyÁ3YðU®ÒË\u0080çY|";
                  int var6 = "Ý\u0091\u008d\u008dê\u0091\u0096*\u0017~ì¶\u0096\u0084e\u0085\u0089Y§ù_\u0090;\u0015\u0003ßÝyÁ3YðU®ÒË\u0080çY|".length();
                  int var3 = 0;

                  label37:
                  while(true) {
                     int var33 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var33, var3).getBytes("ISO-8859-1");
                     long[] var32 = var0;
                     var33 = var4++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var32[var33] = var40;
                           if (var3 >= var6) {
                              KProperty[] var28 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tu.class, true.p<invokedynamic>(17846, 6323642791209821841L ^ var20), true.p<invokedynamic>(24465, 991482536398781616L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tu.class, true.p<invokedynamic>(28086, 2123144646150311572L ^ var20), true.p<invokedynamic>(28366, 1304694882316537313L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tu.class, true.p<invokedynamic>(26407, 2263005743798928387L ^ var20), true.p<invokedynamic>(24509, 7550676992147782813L ^ var20), 0)))};
                              m = var28;
                              q = new tu(var24);
                              u = qi.M((il)q, true.p<invokedynamic>(28793, 7740104475357926239L ^ var20), (Enum)i8.LEFT, (pj)null, (Function0)null, (int)var0[4], (Object)null, var26);
                              K = qi.o((il)q, true.p<invokedynamic>(25694, 8425403211634788208L ^ var20), (int)var0[6], new IntRange(0, (int)var0[5]), var22, (pj)null, (Function0)null, (int)var0[1], (Object)null);
                              B = qi.o((il)q, true.p<invokedynamic>(32091, 6060753917506346615L ^ var20), (int)var0[0], new IntRange(0, (int)var0[2]), var22, (pj)null, (Function0)null, (int)var0[3], (Object)null);
                              N = new iv();
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var3 < var6) {
                              continue label37;
                           }

                           var5 = "øH'm¸WÑ\u0096\u001a{tM\b5\u009d»";
                           var6 = "øH'm¸WÑ\u0096\u001a{tM\b5\u009d»".length();
                           var3 = 0;
                        }

                        var33 = var3;
                        var3 += 8;
                        var7 = var5.substring(var33, var3).getBytes("ISO-8859-1");
                        var32 = var0;
                        var33 = var4++;
                        var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var38 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var35;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label55;
               }

               var15 = "\u0019k^x´¿ÖÂ!ûî1ÿ¶\u008b4\u001fMù|R\u0089¼\u0002C=¨\u0093Ü3\u009a^ >R\u0013¦»\u009c\u009eM\u0090;¥ô»\u0092{\u0014-\n\u0092i\u00066\u00adW.·S\u0080]àøá";
               var17 = "\u0019k^x´¿ÖÂ!ûî1ÿ¶\u008b4\u001fMù|R\u0089¼\u0002C=¨\u0093Ü3\u009a^ >R\u0013¦»\u009c\u009eM\u0090;¥ô»\u0092{\u0014-\n\u0092i\u00066\u00adW.·S\u0080]àøá".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var29 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25102;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/tu", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/tu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
