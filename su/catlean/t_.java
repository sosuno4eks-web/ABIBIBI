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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.player.ClickSlotEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class t_ extends k9 {
   @NotNull
   public static final t_ e;
   static final KProperty[] w;
   @NotNull
   private static final z0 l;
   private static boolean g;
   private static boolean J;
   @NotNull
   private static final iv m;
   private static final long b = j0.a(-1524403288518761587L, 7402650069056159367L, MethodHandles.lookup().lookupClass()).a(189876543577317L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f;
   private static final long[] i;
   private static final Integer[] k;
   private static final Map n;

   private t_(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 28178059846312L;
      super(var3, true.w<invokedynamic>(9709, 6128729514515834344L ^ var1), pa.b(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   public final int s(byte param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   public final void R(int a, byte a, int <set-?>, int a) {
      long var5 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ b;
      long var10001 = var5 ^ 87266402168214L;
      int var7 = (int)((var5 ^ 87266402168214L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      boolean var10 = -5896223541753393345L.A<invokedynamic>(-5896223541753393345L, var5);

      try {
         l.P(this, var7, w[0], (short)var8, var3, (short)var9);
         if (var10) {
            (new int[5]).A<invokedynamic>(new int[5], -5873260485841883706L, var5);
         }

      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, -5860013693077793663L, var5);
      }
   }

   @Flow
   private final void P(ClickSlotEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void i(InputEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void t(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 133456317445172L;
      long var22 = var20 ^ 27999504958731L;
      long var24 = var20 ^ 59509579222496L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[7];
      int var16 = 0;
      String var15 = "pÙº÷÷¤5T|%-\u0098ò\t\u0096\u008b\u009bJV&yw#p°ÿÊjXbã¡g+U{¼\u009eª·Å\u001e²\tÆ\u0098\u008d694m\u008d\u009edçG\u0007[1Nb;n\u0085-p:lp\u001aßÀTT!R\u0096\u001a\u001eÙÂC\u000b\u001a\u0013Å\u0086lz\u0099X\u007f7«ÂoÇk\u0005:R\u001f×ö\u0080¥\u0088U-§ç\u008fE{Ñ\u000eûù}E:+\u009eÖ\u001dëÖâ¨Dï\"Hü%Z\u0080\u001eK\u0083\u001e¼\u008aL*ìï\u0080*\u008cDu\u001b}8\u008b\u0014\u000eò}·GÏ|÷-¢|HG1pÒ\u008fÚ 5ó¬ìÁ\u0087<\u00861âh\u0019\u000f¼\u0097O\fé\u008cìZ¦\u0016växèó\u001f\u008a]dj\u0007ÝMhÏ\u0083ÂE\u0013s!»Mðõ7FBC\tß=4¨\u0004Ô\u0088\u0001¾\u00ad8¿¤ãUÏa\u0083¡ï¬\u008c\u009fD$¯¨\u0019\u00ad\u008c¥\bÔ+z±\u0010Í'¶r\u0095\u0087YÖX;2Ra_e\u000f \u0094¼TEæOÙ÷(5gium¯:½Ô¾¸<\u0089Nµ<vôxZK\u0006| çÆþ\u000e\nÑ,.9(k{Þ¤µ\u000eþ÷y\u0010P5îJb\u0095\u001c ´\f¼l";
      int var17 = "pÙº÷÷¤5T|%-\u0098ò\t\u0096\u008b\u009bJV&yw#p°ÿÊjXbã¡g+U{¼\u009eª·Å\u001e²\tÆ\u0098\u008d694m\u008d\u009edçG\u0007[1Nb;n\u0085-p:lp\u001aßÀTT!R\u0096\u001a\u001eÙÂC\u000b\u001a\u0013Å\u0086lz\u0099X\u007f7«ÂoÇk\u0005:R\u001f×ö\u0080¥\u0088U-§ç\u008fE{Ñ\u000eûù}E:+\u009eÖ\u001dëÖâ¨Dï\"Hü%Z\u0080\u001eK\u0083\u001e¼\u008aL*ìï\u0080*\u008cDu\u001b}8\u008b\u0014\u000eò}·GÏ|÷-¢|HG1pÒ\u008fÚ 5ó¬ìÁ\u0087<\u00861âh\u0019\u000f¼\u0097O\fé\u008cìZ¦\u0016växèó\u001f\u008a]dj\u0007ÝMhÏ\u0083ÂE\u0013s!»Mðõ7FBC\tß=4¨\u0004Ô\u0088\u0001¾\u00ad8¿¤ãUÏa\u0083¡ï¬\u008c\u009fD$¯¨\u0019\u00ad\u008c¥\bÔ+z±\u0010Í'¶r\u0095\u0087YÖX;2Ra_e\u000f \u0094¼TEæOÙ÷(5gium¯:½Ô¾¸<\u0089Nµ<vôxZK\u0006| çÆþ\u000e\nÑ,.9(k{Þ¤µ\u000eþ÷y\u0010P5îJb\u0095\u001c ´\f¼l".length();
      char var14 = 136;
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
                  c = var18;
                  d = new String[7];
                  n = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[13];
                  int var3 = 0;
                  String var4 = "½7s$;\u0017\u009d\u0087\tÝx\u000b\r¤\u0017\u0098¸/¯ìÔî»\u0095®CÞ[m\u0096ã\u0006Ï \rj\u0084MDv¯\tÈ²%ÀE`E\u0090!«Ç\u0000Ð\u008e'wðfÝ4b{P\u001bÝ§<\u0007°öW\u0010Ì³\\]\u009cQ\u0014R/:\u0002\u00994÷";
                  int var5 = "½7s$;\u0017\u009d\u0087\tÝx\u000b\r¤\u0017\u0098¸/¯ìÔî»\u0095®CÞ[m\u0096ã\u0006Ï \rj\u0084MDv¯\tÈ²%ÀE`E\u0090!«Ç\u0000Ð\u008e'wðfÝ4b{P\u001bÝ§<\u0007°öW\u0010Ì³\\]\u009cQ\u0014R/:\u0002\u00994÷".length();
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
                              i = var6;
                              k = new Integer[13];
                              KProperty[] var26 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(t_.class, true.w<invokedynamic>(16683, 8396651352512566165L ^ var20), true.w<invokedynamic>(22201, 4055903704200119300L ^ var20), 0)))};
                              w = var26;
                              e = new t_(var24);
                              l = qi.o((il)e, true.w<invokedynamic>(5566, 1908946507450402564L ^ var20), true.a<invokedynamic>(17547, 3109978074992839099L ^ var20), new IntRange(0, true.a<invokedynamic>(31308, 2794227105221818237L ^ var20)), var22, (pj)null, (Function0)null, true.a<invokedynamic>(8698, 5196711110236662977L ^ var20), (Object)null);
                              m = new iv();
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var38;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "V{NØ +Ö\r°(u{÷\u0001o\u0092";
                           var5 = "V{NØ +Ö\r°(u{÷\u0001o\u0092".length();
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

               var15 = "\u0016\u0012ÛSá\u009d¡»³¨ø\u00ad{Mç(\u0000\b×S\u0017\u008bG\u0082}Uäm4h\u008bë\u0010\u0018û>Å\f\u009ao¦Ç\u0013ã\u0094G\u0091Q%";
               var17 = "\u0016\u0012ÛSá\u009d¡»³¨ø\u00ad{Mç(\u0000\b×S\u0017\u008bG\u0082}Uäm4h\u008bë\u0010\u0018û>Å\f\u009ao¦Ç\u0013ã\u0094G\u0091Q%".length();
               var14 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31189;
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
            throw new RuntimeException("su/catlean/t_", var10);
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
         throw new RuntimeException("su/catlean/t_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26198;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
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
            throw new RuntimeException("su/catlean/t_", var14);
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
         throw new RuntimeException("su/catlean/t_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
