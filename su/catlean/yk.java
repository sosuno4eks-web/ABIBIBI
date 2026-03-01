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
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

public final class yk extends k9 {
   @NotNull
   public static final yk g;
   // $FF: synthetic field
   static final KProperty[] K;
   @NotNull
   private static final zo A;
   @NotNull
   private static final zo e;
   @NotNull
   private static final iv t;
   private static final long b = j0.a(8128890982306787498L, 7956395909833091946L, MethodHandles.lookup().lookupClass()).a(128770362798371L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f;
   private static final long[] i;
   private static final Integer[] k;
   private static final Map l;

   private yk(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 19679685882943L;
      super(var3, true.b<invokedynamic>(3340, 1953118323852217491L ^ var1), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean t(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 130891134880946L;
      int var3 = (int)((var1 ^ 130891134880946L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)A.k((short)var3, this, K[0], (short)var4, var5);
   }

   private final void G(long var1, boolean var3) {
      var1 ^= b;
      long var10001 = var1 ^ 106845199280656L;
      int var4 = (int)((var1 ^ 106845199280656L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      A.P(this, var4, K[0], (short)var5, var3, (short)var6);
   }

   private final boolean w(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 43493758348547L;
      int var3 = (int)((var1 ^ 43493758348547L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)e.k((short)var3, this, K[1], (short)var4, var5);
   }

   private final void h(long var1, boolean var3) {
      var1 ^= b;
      long var10001 = var1 ^ 12585969425006L;
      int var4 = (int)((var1 ^ 12585969425006L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      e.P(this, var4, K[1], (short)var5, var3, (short)var6);
   }

   @Flow
   public final void o(@NotNull ReceivePacket event) {
      // $FF: Couldn't be decompiled
   }

   private final String P(int param1, String param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 53736642375298L;
      long var22 = var20 ^ 131830428352961L;
      long var24 = var20 ^ 40987774382761L;
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
      String var15 = "6C1\u000bhÉì}a\u009cAÐª\u008fBÀ\u0090\u0087jr\u009dW\u0011à\u0089\u0006ÿå¶*'Ó0\u001bûå^gØr¹\u0000Ôßî\u000eÎà~Wª\u0012`èµ¤\u008e\u0013â\u008eô]-Q\fh\u0082 \u0090¸)\"Í \n?ûçc)\u001b \u0001\u0016\r{\u0084\u0081ãÙÒ#óë|B´YBG²à\u0018:Ímìøÿ\u00016¡ÌØ ,K2CoP\u000e!ÃTé/(AÇ8¶\u008fA\u00119_gø«p\u0091>¡PþQ \u000f\u009bC¨OèÜM\u0001-ë¨\u0001\u0010xêú¹\u0081\u0090Ü\u0012\u00171¯(\u0006ÿ\u0017¦?\u0094\u0010P\u0095ý\u0088óÊ¢Þ\u0093Àjé¿\u008aÿFH9ßÿ¥çã\u008f\u000eyÈºÝD\u0014GØ\u0083®Cz\"u\u009c¢8H\u0097Ð2\u0005\u0094¢ÇþºBÔ\r\u009d\u0004C\u007fó¯JØ?#¸m\u0003\u0089\u0014\u001fá}j\u008dè\u008ci\u009a\u0016\\Ð½\u007fR3¨`V\u0018=Í\\\u009e\\µ\u0097DÏ\u0019\u0099p<)\u0004s\u0003¤Öh\u0011!Ýþ ìd±©ô¸çº\u0000ç\u001c=\u0097\u0012\u0013RlÈE©\u0097\u0012Û\u008fÄø\n\u0098\u009cl\u008cH\u0010[a ð\u0099\u0017h©<\u0080¾K\u0004syù\u0018ùÄS\u0098\u000e\u00ad\u0012ú\u0017ó\u009d\u009b\u0090fï\u009c9ÐL·OnI\u008e\u0018t\"PÕ¨nÇ.\u009bC\u0088H\u0086\u0013^RñHè¼\u0086×EÜ";
      int var17 = "6C1\u000bhÉì}a\u009cAÐª\u008fBÀ\u0090\u0087jr\u009dW\u0011à\u0089\u0006ÿå¶*'Ó0\u001bûå^gØr¹\u0000Ôßî\u000eÎà~Wª\u0012`èµ¤\u008e\u0013â\u008eô]-Q\fh\u0082 \u0090¸)\"Í \n?ûçc)\u001b \u0001\u0016\r{\u0084\u0081ãÙÒ#óë|B´YBG²à\u0018:Ímìøÿ\u00016¡ÌØ ,K2CoP\u000e!ÃTé/(AÇ8¶\u008fA\u00119_gø«p\u0091>¡PþQ \u000f\u009bC¨OèÜM\u0001-ë¨\u0001\u0010xêú¹\u0081\u0090Ü\u0012\u00171¯(\u0006ÿ\u0017¦?\u0094\u0010P\u0095ý\u0088óÊ¢Þ\u0093Àjé¿\u008aÿFH9ßÿ¥çã\u008f\u000eyÈºÝD\u0014GØ\u0083®Cz\"u\u009c¢8H\u0097Ð2\u0005\u0094¢ÇþºBÔ\r\u009d\u0004C\u007fó¯JØ?#¸m\u0003\u0089\u0014\u001fá}j\u008dè\u008ci\u009a\u0016\\Ð½\u007fR3¨`V\u0018=Í\\\u009e\\µ\u0097DÏ\u0019\u0099p<)\u0004s\u0003¤Öh\u0011!Ýþ ìd±©ô¸çº\u0000ç\u001c=\u0097\u0012\u0013RlÈE©\u0097\u0012Û\u008fÄø\n\u0098\u009cl\u008cH\u0010[a ð\u0099\u0017h©<\u0080¾K\u0004syù\u0018ùÄS\u0098\u000e\u00ad\u0012ú\u0017ó\u009d\u009b\u0090fï\u009c9ÐL·OnI\u008e\u0018t\"PÕ¨nÇ.\u009bC\u0088H\u0086\u0013^RñHè¼\u0086×EÜ".length();
      char var14 = ' ';
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var27 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var32;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[14];
                  l = new HashMap(13);
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
                  String var4 = "mÿ\u0016\u009d\u001býTÍK\u0012e¡ôV\u0017½\b.\u009fd½9¯\u008b";
                  int var5 = "mÿ\u0016\u009d\u001býTÍK\u0012e¡ôV\u0017½\b.\u009fd½9¯\u008b".length();
                  int var2 = 0;

                  do {
                     int var30 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                     var30 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var34 = true;
                     var6[var30] = var10004;
                  } while(var2 < var5);

                  i = var6;
                  k = new Integer[3];
                  KProperty[] var26 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yk.class, true.b<invokedynamic>(9063, 3721634269849280444L ^ var20), true.b<invokedynamic>(17379, 5468311792878042928L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yk.class, true.b<invokedynamic>(9706, 1750692823746206005L ^ var20), true.b<invokedynamic>(14134, 8527756806688066528L ^ var20), 0)))};
                  K = var26;
                  g = new yk(var22);
                  A = qi.R((il)g, true.b<invokedynamic>(17841, 7125530946663594351L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(18919, 8351199681764373132L ^ var20), var24, (Object)null);
                  e = qi.R((il)g, true.b<invokedynamic>(28707, 3948862132960660723L ^ var20), true, (pj)null, (Function0)null, true.w<invokedynamic>(9721, 7461663759480315539L ^ var20), var24, (Object)null);
                  t = new iv();
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var32;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = " |××»\u008e\u009b\u0004Âöd\b´òÔ¯8hóüæîÃßJ<^\u008fsüby¾;X\u0087¬D\u000e¿Sé®&\u0083Ëî\u0004:\u008aÉÂ\u00919,O<ù¼^\r\u001dã\u008e2-\u0096VÈ¸WÞÞ";
               var17 = " |××»\u008e\u009b\u0004Âöd\b´òÔ¯8hóüæîÃßJ<^\u008fsüby¾;X\u0087¬D\u000e¿Sé®&\u0083Ëî\u0004:\u008aÉÂ\u00919,O<ù¼^\r\u001dã\u008e2-\u0096VÈ¸WÞÞ".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11998;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/yk", var10);
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
         throw new RuntimeException("su/catlean/yk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10594;
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
            throw new RuntimeException("su/catlean/yk", var14);
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
         throw new RuntimeException("su/catlean/yk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
