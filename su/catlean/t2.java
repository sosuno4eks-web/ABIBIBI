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
import su.catlean.api.event.events.render.StringDecomposerEvent;
import su.catlean.gofra.Flow;

public final class t2 extends k9 {
   @NotNull
   public static final t2 s;
   static final KProperty[] V;
   @NotNull
   private static final zl T;
   @NotNull
   private static final zr o;
   private static final long b = j0.a(8237964422573550845L, 155517584922449539L, MethodHandles.lookup().lookupClass()).a(127363705712826L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private t2(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 56170943524486L;
      super(var3, true.l<invokedynamic>(25497, 278165015931605508L ^ var1), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @NotNull
   public final String L(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 125633331482604L;
      int var3 = (int)((var1 ^ 125633331482604L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (String)T.k((short)var3, this, V[0], (short)var4, var5);
   }

   @NotNull
   public final vq j(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 49964897084512L;
      int var3 = (int)((var1 ^ 49964897084512L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (vq)o.k((short)var3, this, V[1], (short)var4, var5);
   }

   @Flow
   private final void m(StringDecomposerEvent var1) {
      long var2 = b ^ 80115140701835L;
      long var4 = var2 ^ 61063641471727L;
      var1.setString(this.H(var1.getString(), var4));
   }

   @NotNull
   public final String H(@NotNull String text, long a) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 44868417541408L;
      long var22 = var20 ^ 84693655183578L;
      long var24 = var20 ^ 34950924764997L;
      long var26 = var20 ^ 67422088592348L;
      e = new HashMap(13);
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
      String var15 = "0«\u0010\u0087Þß\u0090\u0095ºj §:1\u001c\"0[ú2v\u001c\u000e4\u008b\u0086x¼½¥\u0010lùÇÀ´\u009c\u0013Èìi\b¸YU\u0016\u0088\u0000t\u0003¶èKÍo)ñï9\u0099å4J\u0012¡\u0018OÏÂáB\u008e\u000fÖ[\t´\bØ ÂÈïð)Ó\u0000 \u0080Æ\u0010Ç\u008c\u009f×vV\u008bÎkÅ»[t\u0081\u0093Ã\u0010\u0013êåð\u0005\u0011×¿,\u0092Ö#Í|ÏI\u0018fI\u0018¸gÐ\u0099\u0087>àû`\u008b\u00ad\u009c\u0086©7a\f¸\u00957¸\u0010>e\u0003\u009bo58×\u0010çèÝò>þ\u0092\u0018\u0086²Ú0\u0091\u008dÖÏÀ\u0001ßÂ³æg\u0004âÓ\u0090[\u0007\u0098J7\u0010±\u0005,à\u0096÷Mþ\u0085Þ4wpD\u00173(õøH\u009fH\rÞ3\u0006\u0090\u0017=]Ìv²\u009c6gU=Vl´kÔN÷?\tèÙ£PLËö\u008a´j";
      int var17 = "0«\u0010\u0087Þß\u0090\u0095ºj §:1\u001c\"0[ú2v\u001c\u000e4\u008b\u0086x¼½¥\u0010lùÇÀ´\u009c\u0013Èìi\b¸YU\u0016\u0088\u0000t\u0003¶èKÍo)ñï9\u0099å4J\u0012¡\u0018OÏÂáB\u008e\u000fÖ[\t´\bØ ÂÈïð)Ó\u0000 \u0080Æ\u0010Ç\u008c\u009f×vV\u008bÎkÅ»[t\u0081\u0093Ã\u0010\u0013êåð\u0005\u0011×¿,\u0092Ö#Í|ÏI\u0018fI\u0018¸gÐ\u0099\u0087>àû`\u008b\u00ad\u009c\u0086©7a\f¸\u00957¸\u0010>e\u0003\u009bo58×\u0010çèÝò>þ\u0092\u0018\u0086²Ú0\u0091\u008dÖÏÀ\u0001ßÂ³æg\u0004âÓ\u0090[\u0007\u0098J7\u0010±\u0005,à\u0096÷Mþ\u0085Þ4wpD\u00173(õøH\u009fH\rÞ3\u0006\u0090\u0017=]Ìv²\u009c6gU=Vl´kÔN÷?\tèÙ£PLËö\u008a´j".length();
      char var14 = 16;
      int var13 = -1;

      label47:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var34 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var34;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[12];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[2];
                  int var4 = 0;
                  String var5 = "ú\u0011ÑØ\u009d}ÊÁ<\fQæ¸©A¡";
                  int var6 = "ú\u0011ÑØ\u009d}ÊÁ<\fQæ¸©A¡".length();
                  int var3 = 0;

                  do {
                     int var32 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var32, var3).getBytes("ISO-8859-1");
                     var32 = var4++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var36 = true;
                     var0[var32] = var10004;
                  } while(var3 < var6);

                  KProperty[] var28 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t2.class, true.l<invokedynamic>(15999, 7079999126082332315L ^ var20), true.l<invokedynamic>(25087, 1902354239258687772L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t2.class, true.l<invokedynamic>(27193, 2497556660455994067L ^ var20), true.l<invokedynamic>(27221, 8710536459424821948L ^ var20), 0)))};
                  V = var28;
                  s = new t2(var22);
                  T = qi.P((il)s, true.l<invokedynamic>(9981, 4930349362672811548L ^ var20), var24, true.l<invokedynamic>(4278, 7882661253644814422L ^ var20), (pj)null, (Function0)null, (int)var0[0], (Object)null);
                  o = qi.M((il)s, true.l<invokedynamic>(23955, 8908716064416187765L ^ var20), (Enum)vq.FRIENDS, (pj)null, (Function0)null, (int)var0[1], (Object)null, var26);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var34;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label47;
               }

               var15 = "\u00011óOÖ\u009b×MB·\u0015\u0006ÑuYðÒ+<hpÃØ¾8q]R¤À¬pT~\u0084\r¶õ¥\u009fË\u0095\u0002øÂ\u0083\u00053ë8`\u0013I2\u0086e\u0089S\u0099y\u0018Oü4¥uBJôÓz@r'÷y&\u009e¡¥K";
               var17 = "\u00011óOÖ\u009b×MB·\u0015\u0006ÑuYðÒ+<hpÃØ¾8q]R¤À¬pT~\u0084\r¶õ¥\u009fË\u0095\u0002øÂ\u0083\u00053ë8`\u0013I2\u0086e\u0089S\u0099y\u0018Oü4¥uBJôÓz@r'÷y&\u009e¡¥K".length();
               var14 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1133;
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
            throw new RuntimeException("su/catlean/t2", var10);
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
         throw new RuntimeException("su/catlean/t2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
