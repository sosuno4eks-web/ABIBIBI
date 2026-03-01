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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class ky extends kr {
   @NotNull
   public static final ky P;
   static final KProperty[] k;
   @NotNull
   private static final zr Q;
   @NotNull
   private static final zo c;
   private static final long e = j0.a(4907393071767540002L, 3562186962950880990L, MethodHandles.lookup().lookupClass()).a(75222138314599L);
   private static final String[] m;
   private static final String[] q;
   private static final Map s;
   private static final long[] y;
   private static final Integer[] z;
   private static final Map A;

   private ky(long var1) {
      var1 ^= e;
      long var3 = var1 ^ 29794047913127L;
      super(true.s<invokedynamic>(10769, 4199766498536996889L ^ var1), var3, pa.Q(), 0, false, true.m<invokedynamic>(32762, 129435142485364632L ^ var1), (DefaultConstructorMarker)null);
   }

   private final p4 i(long var1) {
      var1 ^= e;
      long var10001 = var1 ^ 49611653817156L;
      int var3 = (int)((var1 ^ 49611653817156L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (p4)Q.k((short)var3, this, k[0], (short)var4, var5);
   }

   private final void m(long var1, p4 var3) {
      var1 ^= e;
      long var10001 = var1 ^ 104257628526783L;
      int var4 = (int)((var1 ^ 104257628526783L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Q.P(this, var4, k[0], (short)var5, var3, (short)var6);
   }

   private final boolean m(long var1) {
      var1 ^= e;
      long var10001 = var1 ^ 32598519147020L;
      int var3 = (int)((var1 ^ 32598519147020L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)c.k((short)var3, this, k[1], (short)var4, var5);
   }

   private final void W(long var1, boolean var3) {
      var1 ^= e;
      long var10001 = var1 ^ 115277876334952L;
      int var4 = (int)((var1 ^ 115277876334952L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      c.P(this, var4, k[1], (short)var5, var3, (short)var6);
   }

   @Flow
   private final void c(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void s(class_1657 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   protected List W(long var1) {
      return CollectionsKt.listOf(class_2246.field_16999);
   }

   @NotNull
   protected v0 c() {
      return v0.NONE;
   }

   static {
      long var20 = e ^ 134519300217903L;
      long var22 = var20 ^ 122386331710569L;
      long var24 = var20 ^ 11709150708948L;
      long var26 = var20 ^ 62211631547175L;
      s = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[12];
      int var16 = 0;
      String var15 = "\u009aÄË\u0089\u0099|?8x+\u0006\u0091¨\u0011|Ãçîøå¶\u000e¿e(!²`d\u0018û¼\u001fß(Y\u0007\u0006\u0006ÎDØn\u0003¼Ná-úÇÿçB/\u0010Ð-\u0003'¯¼l\u0015S> B÷lRzÍ«eÂq$#.*_VX¬p\u009dõoa¯W%í\u001fË[¸\t(¡U\u008då\u0005\u009eåh\u008fÇ\u00adè§±x¥°ò\u0085Ë\u0092\u0090õ`j\u0082;%Ó0²ï\u0092ó?\t:\u0003çm\u0018±ýµ}<¸\u000f,ð\r\u0097Î&Ë!Hn½Ãcìù¾\u009d\u0080Å+\u009e.\u0089Èñ\u001da¢\u008cnØj«wóÌÆA\u0082ÀD$øù¨_rGóYÄø ù/Õ,ª?\u0015\u00ad_ Ï\u0017£qCà\u00151Vµ\u0012È\u0011Û\u0004¢}\u0014\u000eN\u0092Ä9\u0019;¬Þ\u00049É £L\u008b\u000füºÏ\u0084Û\bÐÒ\u001f\u0012\u0081#%¼\u0002É¸\u0094êí^\u009eåcõ¨$/\u0019\u009a'§+¶Æ\u0016\u008fÇ=MÌÓj\t1Ä×\u001b v\u000f\u009f6\u0017\u0083èÓ\u0006N\u009dï~\u0098õ\u0015\u008ar,!`õpr\u0006;\u0013³*\u000e\u0016F a\r$¦U¼¿\n\u0018@@Û\u0083]\u001aàxÀûâ\u009f.ë\u009bxë\u001c§o\"\fM(\u0001\\\u0098\u0013¹ß\u0002EÆêeÿ\b\u0081²\bð\u0091\u0003©Ô\u0093\u001f¼³÷\u0094N]D¥hë/ùÔ\u0010¤2\u0014 §\u008a#kîiÿ\u001eÏ¬W\u001bÌy\u0080_\u0018_¦\u0087é|¦Á\u0001÷\u0007µ\u0010E°\u0082";
      int var17 = "\u009aÄË\u0089\u0099|?8x+\u0006\u0091¨\u0011|Ãçîøå¶\u000e¿e(!²`d\u0018û¼\u001fß(Y\u0007\u0006\u0006ÎDØn\u0003¼Ná-úÇÿçB/\u0010Ð-\u0003'¯¼l\u0015S> B÷lRzÍ«eÂq$#.*_VX¬p\u009dõoa¯W%í\u001fË[¸\t(¡U\u008då\u0005\u009eåh\u008fÇ\u00adè§±x¥°ò\u0085Ë\u0092\u0090õ`j\u0082;%Ó0²ï\u0092ó?\t:\u0003çm\u0018±ýµ}<¸\u000f,ð\r\u0097Î&Ë!Hn½Ãcìù¾\u009d\u0080Å+\u009e.\u0089Èñ\u001da¢\u008cnØj«wóÌÆA\u0082ÀD$øù¨_rGóYÄø ù/Õ,ª?\u0015\u00ad_ Ï\u0017£qCà\u00151Vµ\u0012È\u0011Û\u0004¢}\u0014\u000eN\u0092Ä9\u0019;¬Þ\u00049É £L\u008b\u000füºÏ\u0084Û\bÐÒ\u001f\u0012\u0081#%¼\u0002É¸\u0094êí^\u009eåcõ¨$/\u0019\u009a'§+¶Æ\u0016\u008fÇ=MÌÓj\t1Ä×\u001b v\u000f\u009f6\u0017\u0083èÓ\u0006N\u009dï~\u0098õ\u0015\u008ar,!`õpr\u0006;\u0013³*\u000e\u0016F a\r$¦U¼¿\n\u0018@@Û\u0083]\u001aàxÀûâ\u009f.ë\u009bxë\u001c§o\"\fM(\u0001\\\u0098\u0013¹ß\u0002EÆêeÿ\b\u0081²\bð\u0091\u0003©Ô\u0093\u001f¼³÷\u0094N]D¥hë/ùÔ\u0010¤2\u0014 §\u008a#kîiÿ\u001eÏ¬W\u001bÌy\u0080_\u0018_¦\u0087é|¦Á\u0001÷\u0007µ\u0010E°\u0082".length();
      char var14 = 24;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var34 = c(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var34;
               if ((var13 += var14) >= var17) {
                  m = var18;
                  q = new String[12];
                  A = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "ç.DLñéò\u0018bÝáNëpZÏZyÇ\u0098\u00011ê\u0006";
                  int var5 = "ç.DLñéò\u0018bÝáNëpZÏZyÇ\u0098\u00011ê\u0006".length();
                  int var2 = 0;

                  do {
                     int var32 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var32, var2).getBytes("ISO-8859-1");
                     var32 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var36 = true;
                     var6[var32] = var10004;
                  } while(var2 < var5);

                  y = var6;
                  z = new Integer[3];
                  KProperty[] var28 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ky.class, true.s<invokedynamic>(9182, 2527116242380063259L ^ var20), true.s<invokedynamic>(20727, 5423033149261115709L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ky.class, true.s<invokedynamic>(10652, 8453412265396111444L ^ var20), true.s<invokedynamic>(6424, 3246650900248049875L ^ var20), 0)))};
                  k = var28;
                  P = new ky(var22);
                  Q = qi.M((il)P, true.s<invokedynamic>(23693, 2504396009983147338L ^ var20), (Enum)p4.AUTO, (pj)null, (Function0)null, true.m<invokedynamic>(32762, 129402556666807385L ^ var20), (Object)null, var24);
                  c = qi.R((il)P, true.s<invokedynamic>(4484, 5161857008908382277L ^ var20), false, (pj)null, (Function0)null, true.m<invokedynamic>(32762, 129402556666807385L ^ var20), var26, (Object)null);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var34;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "\fÇ.\u0096P\u0018\u0001Ý\u0017vå~\u0010\u0088HUH%¡Amî©\u0012wN¡ÂMöM¨\u009e£\\¸7@Ø£8æf~Â$p Ã«'7Âæ#HUy´\t}ª4,ûl\u008d£\u008b\u0004«©F\u0084\u0090\u0014Ð2,\u000eË\u0084{÷Ý¶\u009bKX\u00adLb÷\u0000\u0081ù¦";
               var17 = "\fÇ.\u0096P\u0018\u0001Ý\u0017vå~\u0010\u0088HUH%¡Amî©\u0012wN¡ÂMöM¨\u009e£\\¸7@Ø£8æf~Â$p Ã«'7Âæ#HUy´\t}ª4,ûl\u008d£\u008b\u0004«©F\u0084\u0090\u0014Ð2,\u000eË\u0084{÷Ý¶\u009bKX\u00adLb÷\u0000\u0081ù¦".length();
               var14 = '(';
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

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 582;
      if (q[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])s.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               s.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ky", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = m[var5].getBytes("ISO-8859-1");
         q[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return q[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ky" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22564;
      if (z[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = y[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])A.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               A.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ky", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         z[var3] = var15;
      }

      return z[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ky" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
