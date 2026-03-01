package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class yb extends k9 {
   @NotNull
   public static final yb O;
   static final KProperty[] l;
   @NotNull
   private static final zr M;
   @NotNull
   private static final zv w;
   private static final ThreadLocalRandom N;
   @NotNull
   private static final List k;
   private static final long b = j0.a(539349358416902369L, 1472193888109723932L, MethodHandles.lookup().lookupClass()).a(237955776584519L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private yb(long var1, short var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 116691134036673L;
      super(var6, true.a<invokedynamic>(2164, 5459466997037701434L ^ var4), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final s3 U(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 6757286395336L;
      int var3 = (int)((var1 ^ 6757286395336L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (s3)M.k((short)var3, this, l[0], (short)var4, var5);
   }

   private final Color Y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 24479621637302L;
      int var3 = (int)((var1 ^ 24479621637302L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)w.k((short)var3, this, l[1], (short)var4, var5);
   }

   @Flow
   private final void w(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void f(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean G() {
      long var0 = b ^ 132226540570962L;
      long var2 = var0 ^ 84211481069127L;

      boolean var10000;
      try {
         if (O.U(var2) == s3.CUSTOM) {
            var10000 = true;
            return var10000;
         }
      } catch (NoWhenBranchMatchedException var4) {
         throw var4.A<invokedynamic>(var4, 2748885955829819543L, var0);
      }

      var10000 = false;
      return var10000;
   }

   static {
      long var20 = b ^ 50128222639286L;
      long var22 = var20 ^ 9277042990526L;
      long var24 = var20 ^ 13264237504367L;
      long var10001 = var20 ^ 19145076765963L;
      long var26 = (var20 ^ 19145076765963L) >>> 16;
      int var28 = (int)(var10001 << 48 >>> 48);
      e = new HashMap(13);
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
      String var15 = "(y#\u0097¶By\u0091ACnÌi5¥1<ps\u0016Z ÎíÏRU\u0099@7IyW«n]:PT®{ã:i\u008e\u009f\\$\u0010ô\u0095]£¤Ã\u000b÷þçJZUÁÏÅ(}\u000e¥¯±Ô\u0083È\u0016Z&\u0087\u00979îX\u0081@\u008c\u0087\u008d¢\u0080¶ÍL]Ë\u000föù\u0081\u009e©#·\u008dN`¨\u0018\u008c¡ó{8\u008b\u008cÉ\u001e#èjq¢m!\u009aéòYñ\b \u0005 \u00016\u009c¥Ó|4\u0013q\u0016ô+üæ4NÐ\u0017\u0094£îm}×ÐË\u0017ÖÞHþ\u0095\u0018\u008e£{U\u0002À\u00adþ-\u009fÁ\u0019¦\u009c\u0019\rl*ægáº}Õ\u0090'dY.o\u0006m\u009c\u008f[Ø\u0099\n\u0018ø²Ld](ðKLQ¦Í\u0098yÐM4\u001e¤~5»òé\u0017û¹\u000eeQ\rî´#\u0006\u009d*íV\u0089GHÍ\u0018¸nqa\u007fÁ+fêÞ\u0007K\u001f6}\u0099h \u009a\u001fF[\u0080\u0084¢~Ü-P.ñ$êeÀæyB|ª½(\u0097W\u001fÃ\u001f\u008e\u0084ë©ò}ÕJh0×Å»Ù\u0084\u0093Ò«ð\u00872Á\u001d:M\rgã+á¹ÏL\u000bï\u008b\u00195g\u0010åZóá³Á\u0011\u0005v\"9\u0088[¤\u0090\u0018(]\u001f§ù~ö\u0084s\u0086whÍf\u0000\u0084% ²ZçJQÅÍã°Áp°ò Õ\u0086¥\u0005\u008a¶Ð´\u0094\u0010sÂ\u0018ê\u001e\u0092®\u0013LÞÊÌ«êNÂ0Á¢0Ë\u0094Ai\u0000Úí\u0089¡ì%\u008bÙªù\u009b¸}Ò_\u0001\u0099¯¾þÍhwï9làÏ\u0014\u0082Vø_ºNÞz\u001aÎ\u0097(Ä2ö+üàæðû\u001e\u0003\u0096á\u0014!ÃL\u008c\u0082\u0014V\u001b;\u0085+MÌ6Ê\u0084ø8M\t\u009f½]\u008cú\u0016";
      int var17 = "(y#\u0097¶By\u0091ACnÌi5¥1<ps\u0016Z ÎíÏRU\u0099@7IyW«n]:PT®{ã:i\u008e\u009f\\$\u0010ô\u0095]£¤Ã\u000b÷þçJZUÁÏÅ(}\u000e¥¯±Ô\u0083È\u0016Z&\u0087\u00979îX\u0081@\u008c\u0087\u008d¢\u0080¶ÍL]Ë\u000föù\u0081\u009e©#·\u008dN`¨\u0018\u008c¡ó{8\u008b\u008cÉ\u001e#èjq¢m!\u009aéòYñ\b \u0005 \u00016\u009c¥Ó|4\u0013q\u0016ô+üæ4NÐ\u0017\u0094£îm}×ÐË\u0017ÖÞHþ\u0095\u0018\u008e£{U\u0002À\u00adþ-\u009fÁ\u0019¦\u009c\u0019\rl*ægáº}Õ\u0090'dY.o\u0006m\u009c\u008f[Ø\u0099\n\u0018ø²Ld](ðKLQ¦Í\u0098yÐM4\u001e¤~5»òé\u0017û¹\u000eeQ\rî´#\u0006\u009d*íV\u0089GHÍ\u0018¸nqa\u007fÁ+fêÞ\u0007K\u001f6}\u0099h \u009a\u001fF[\u0080\u0084¢~Ü-P.ñ$êeÀæyB|ª½(\u0097W\u001fÃ\u001f\u008e\u0084ë©ò}ÕJh0×Å»Ù\u0084\u0093Ò«ð\u00872Á\u001d:M\rgã+á¹ÏL\u000bï\u008b\u00195g\u0010åZóá³Á\u0011\u0005v\"9\u0088[¤\u0090\u0018(]\u001f§ù~ö\u0084s\u0086whÍf\u0000\u0084% ²ZçJQÅÍã°Áp°ò Õ\u0086¥\u0005\u008a¶Ð´\u0094\u0010sÂ\u0018ê\u001e\u0092®\u0013LÞÊÌ«êNÂ0Á¢0Ë\u0094Ai\u0000Úí\u0089¡ì%\u008bÙªù\u009b¸}Ò_\u0001\u0099¯¾þÍhwï9làÏ\u0014\u0082Vø_ºNÞz\u001aÎ\u0097(Ä2ö+üàæðû\u001e\u0003\u0096á\u0014!ÃL\u008c\u0082\u0014V\u001b;\u0085+MÌ6Ê\u0084ø8M\t\u009f½]\u008cú\u0016".length();
      char var14 = '0';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var30 = var15.substring(var13, var13 + var14);
         byte var32 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
            String var38 = b(var19).intern();
            switch(var32) {
            case 0:
               var18[var16++] = var38;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[14];
                  i = new HashMap(13);
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
                  String var4 = "z\u0089,\u0014\u0006Ê3¯¾QÌk\u000eñ'4(©áðQ\u0015£ù-êj\u0092Z`mÁ\u009d_u©ÅIÊ\u0086\u00045» ¶9ë\u0095";
                  int var5 = "z\u0089,\u0014\u0006Ê3¯¾QÌk\u000eñ'4(©áðQ\u0015£ù-êj\u0092Z`mÁ\u009d_u©ÅIÊ\u0086\u00045» ¶9ë\u0095".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var37 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                     long[] var33 = var6;
                     var37 = var3++;
                     long var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var41 = -1;

                     while(true) {
                        long var8 = var40;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var43 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var41) {
                        case 0:
                           var33[var37] = var43;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[8];
                              KProperty[] var29 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yb.class, true.a<invokedynamic>(7382, 4989789167619528397L ^ var20), true.a<invokedynamic>(20345, 8663972556875040101L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yb.class, true.a<invokedynamic>(7715, 5409569424842478640L ^ var20), true.a<invokedynamic>(12542, 2114917687122164462L ^ var20), 0)))};
                              l = var29;
                              O = new yb(var26, (short)var28);
                              M = qi.M((il)O, true.a<invokedynamic>(13806, 9034395017954426865L ^ var20), (Enum)s3.CUSTOM, (pj)null, (Function0)null, true.m<invokedynamic>(17704, 5735100557771089105L ^ var20), (Object)null, var22);
                              il var35 = (il)O;
                              String var34 = 1438.a<invokedynamic>(1438, 7093765773773459331L ^ var20);
                              Color var44 = Color.ORANGE;
                              Intrinsics.checkNotNullExpressionValue(var44, true.a<invokedynamic>(29386, 6522143238224001244L ^ var20));
                              w = qi.F(var35, var34, var44, (pj)null, yb::G, 4, var24, (Object)null);
                              N = ThreadLocalRandom.current();
                              k = (List)(new ArrayList());
                              return;
                           }
                           break;
                        default:
                           var33[var37] = var43;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "1c«¯>KQ\rA\u001eIS^\u0005ç=";
                           var5 = "1c«¯>KQ\rA\u001eIS^\u0005ç=".length();
                           var2 = 0;
                        }

                        var37 = var2;
                        var2 += 8;
                        var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                        var33 = var6;
                        var37 = var3++;
                        var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var41 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var38;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0085aþ¿!\u0083\u00adz²\u0015E ÊM¢N ð3QP=\u000b\u0082\u0086\u0084«\u001a¡ð\u009cç¬m/°FíI\u008f*\u0094\u001fÿ\u0012ì\u001etÿ";
               var17 = "\u0085aþ¿!\u0083\u00adz²\u0015E ÊM¢N ð3QP=\u000b\u0082\u0086\u0084«\u001a¡ð\u009cç¬m/°FíI\u008f*\u0094\u001fÿ\u0012ì\u001etÿ".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var30 = var15.substring(var13, var13 + var14);
            var32 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12535;
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
            throw new RuntimeException("su/catlean/yb", var10);
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
         throw new RuntimeException("su/catlean/yb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6933;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/yb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/yb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
