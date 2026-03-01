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
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class tl extends k9 {
   @NotNull
   public static final tl g;
   @NotNull
   private static final n v;
   private static int K;
   private static int O;
   private static final long b = j0.a(6240126292990674952L, 8985696861610363760L, MethodHandles.lookup().lookupClass()).a(102538960173034L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] i;
   private static final Map k;

   private tl(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 75503647537404L;
      super(var3, true.y<invokedynamic>(8586, 7281191642866767951L ^ var1), pa.b(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   public final int Y() {
      return K;
   }

   public final void d(int <set-?>) {
      K = var1;
   }

   public final int i() {
      return O;
   }

   public final void t(int <set-?>) {
      O = var1;
   }

   @Flow
   private final void V(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean V(int param1, int param2, char param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private final boolean q(int param1, class_1799 param2, int param3, class_1799 param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 28018074110818L;
      long var10001 = var20 ^ 51804197328607L;
      int var22 = (int)((var20 ^ 51804197328607L) >>> 48);
      int var23 = (int)(var10001 << 16 >>> 32);
      int var24 = (int)(var10001 << 48 >>> 48);
      long var25 = var20 ^ 12160382200034L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[4];
      int var16 = 0;
      String var15 = "\u0087Ê\u00017O\u0010L/+ºKþâ¹é·\u0080u¡¦ÓyI\u0018{û\\û\u008aÜÒ³ÊÂ°Ê)AQ×\u0018Á\u0094Õ\u0098\u007fB\u0090ä\u0001ÕÅrfÁÄNö·¥Q\r²SL";
      int var17 = "\u0087Ê\u00017O\u0010L/+ºKþâ¹é·\u0080u¡¦ÓyI\u0018{û\\û\u008aÜÒ³ÊÂ°Ê)AQ×\u0018Á\u0094Õ\u0098\u007fB\u0090ä\u0001ÕÅrfÁÄNö·¥Q\r²SL".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var27 = var15.substring(var13, var13 + var14);
         byte var29 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var34 = b(var19).intern();
            switch(var29) {
            case 0:
               var18[var16++] = var34;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[4];
                  k = new HashMap(13);
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
                  String var4 = "ºs ú\u0017ÉUm\u009b\u0082\u00ad¾P\u000f!¾Ay,5\t\u0095-ã¬g\\\u001e1-\u0003\u001d\u0097<\u009ft\u009aM\u0099[Õ\u009dÌ8Ç77×ï+¦J?M\u0081½ ì÷÷l!µ\u0012úò:õî\u000bë\u0091<\u0018y±Ü´\u0087ý\u001c¯\u0086MW!Ö9";
                  int var5 = "ºs ú\u0017ÉUm\u009b\u0082\u00ad¾P\u000f!¾Ay,5\t\u0095-ã¬g\\\u001e1-\u0003\u001d\u0097<\u009ft\u009aM\u0099[Õ\u009dÌ8Ç77×ï+¦J?M\u0081½ ì÷÷l!µ\u0012úò:õî\u000bë\u0091<\u0018y±Ü´\u0087ý\u001c¯\u0086MW!Ö9".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var33 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                     long[] var30 = var6;
                     var33 = var3++;
                     long var36 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var37 = -1;

                     while(true) {
                        long var8 = var36;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var39 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var37) {
                        case 0:
                           var30[var33] = var39;
                           if (var2 >= var5) {
                              f = var6;
                              i = new Integer[13];
                              g = new tl(var25);
                              v = new n((char)var22, var23, (char)var24);
                              return;
                           }
                           break;
                        default:
                           var30[var33] = var39;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "@ÎTeE:\u008e\u0011\u008cé³¤¾LéÝ";
                           var5 = "@ÎTeE:\u008e\u0011\u008cé³¤¾LéÝ".length();
                           var2 = 0;
                        }

                        var33 = var2;
                        var2 += 8;
                        var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                        var30 = var6;
                        var33 = var3++;
                        var36 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var37 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var34;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "Ü ¥â1ðEö\u007fêw\u0083ÃgÈ@R\u0000\u008axKf\u009ep i¾\u009aþ#\u009d\u0099\u00036b\u000bÑ|\u000eª«{VB\u001côá\u000b·kö¤<#4*2";
               var17 = "Ü ¥â1ðEö\u007fêw\u0083ÃgÈ@R\u0000\u008axKf\u009ep i¾\u009aþ#\u009d\u0099\u00036b\u000bÑ|\u000eª«{VB\u001côá\u000b·kö¤<#4*2".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var27 = var15.substring(var13, var13 + var14);
            var29 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23108;
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
            throw new RuntimeException("su/catlean/tl", var10);
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
         throw new RuntimeException("su/catlean/tl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1916;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/tl", var14);
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
         throw new RuntimeException("su/catlean/tl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
