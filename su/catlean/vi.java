package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import net.minecraft.class_2818;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class vi implements zh {
   @NotNull
   public static final vi o;
   @NotNull
   private static final ArrayDeque O;
   private static long v;
   private static float J;
   private static int V;
   @NotNull
   private static List D;
   private static long x;
   private static long U;
   private static k9[] Z;
   private static final long a = j0.a(3863533360501735101L, 3679372668237079523L, MethodHandles.lookup().lookupClass()).a(151599645041310L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private vi() {
   }

   @NotNull
   public final List G() {
      return D;
   }

   public final void O(@NotNull List <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(572, 6513839186099638691L ^ var2));
      D = var1;
   }

   public final long C() {
      return x;
   }

   public final float V() {
      return (new BigDecimal((double)J)).setScale(2, RoundingMode.HALF_UP).floatValue();
   }

   public final float e(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 102611133938461L;
      return (new BigDecimal(20.0D * (double)this.N(var3))).setScale(2, RoundingMode.HALF_UP).floatValue();
   }

   public final float N(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = 10
   )
   private final void B(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void M(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   public final int X(@NotNull class_1657 pl, long a) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static int h(vi var0, class_1657 var1, int var2, long var3, Object var5) {
      var3 ^= a;
      long var6 = var3 ^ 29191071780545L;
      long var8 = var3 ^ 9906474422778L;
      k9[] var10 = -3730846568354435604L.A<invokedynamic>(-3730846568354435604L, var3);

      int var10000;
      label20: {
         try {
            var10000 = var2 & 1;
            if (var10 == null) {
               return var10000;
            }

            if (var10000 == 0) {
               break label20;
            }
         } catch (NumberFormatException var11) {
            throw var11.A<invokedynamic>(var11, -3662327664506373948L, var3);
         }

         var1 = (class_1657)s8.f(var6);
      }

      var10000 = var0.X(var1, var8);
      return var10000;
   }

   public final boolean X(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final List W(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 30053323095514L;
      k9[] var10000 = -6525985317590416198L.A<invokedynamic>(-6525985317590416198L, var1);
      List var6 = (List)(new ArrayList());
      k9[] var5 = var10000;
      Iterator var7 = this.U(var3).iterator();

      label34:
      while(true) {
         List var10;
         if (var7.hasNext()) {
            class_2818 var8 = (class_2818)var7.next();

            do {
               try {
                  if (var1 >= 0L) {
                     var10 = var6;
                     if (var5 == null) {
                        return var10;
                     }

                     var6.addAll(var8.method_12214().values());
                  }

                  if (var5 != null) {
                     continue label34;
                  }
               } catch (NumberFormatException var9) {
                  throw var9.A<invokedynamic>(var9, -6594791189866180206L, var1);
               }
            } while(var1 < 0L);
         }

         var10 = var6;
         return var10;
      }
   }

   @NotNull
   public final List U(long param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final List j(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean h(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final long v() {
      return U - x;
   }

   static {
      long var20 = a ^ 76755815350739L;
      k9[] var10000 = new k9[1];
      d = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 7600383171444913547L, var20);
      Cipher var11;
      Cipher var22 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "íM\u001bÕ-²,\u0080ý\u008dã7ùÇ!\u009b(Ø@õu`À²\u001513 Ek\u0019W$÷X<)çrPù°\u0083\u0017iÖð»ë\u008ej\u0019À>\u009dªØ *¡Ï\u000eR¼VÝ\u0082¸±ÐT4ÖXÕìûÿ:wÂÆSI:\u007fUåêÒ";
      int var17 = "íM\u001bÕ-²,\u0080ý\u008dã7ùÇ!\u009b(Ø@õu`À²\u001513 Ek\u0019W$÷X<)çrPù°\u0083\u0017iÖð»ë\u008ej\u0019À>\u009dªØ *¡Ï\u000eR¼VÝ\u0082¸±ÐT4ÖXÕìûÿ:wÂÆSI:\u007fUåêÒ".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var23 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var23.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[5];
                  g = new HashMap(13);
                  Cipher var0;
                  var22 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "ëÀ\u009bÁ\u0082#*þ|ücOD®-\u0016";
                  int var5 = "ëÀ\u009bÁ\u0082#*þ|ücOD®-\u0016".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     long[] var26 = var6;
                     var27 = var3++;
                     long var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var32 = -1;

                     while(true) {
                        long var8 = var31;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var34 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var32) {
                        case 0:
                           var26[var27] = var34;
                           if (var2 >= var5) {
                              e = var6;
                              f = new Integer[4];
                              o = new vi();
                              O = new ArrayDeque(true.e<invokedynamic>(23541, 1173274985126109874L ^ var20));
                              v = 1L;
                              D = (List)(new ArrayList());
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "¨P.8²q¦è\u009a\u008d¥H\u0088§ÚB";
                           var5 = "¨P.8²q¦è\u009a\u008d¥H\u0088§ÚB".length();
                           var2 = 0;
                        }

                        var27 = var2;
                        var2 += 8;
                        var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        var26 = var6;
                        var27 = var3++;
                        var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var32 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "Ñ`¶Ã¹ýÿ\u0084\u0095Âû´2\u0002ÎÏvð\u009c\u0082¸pÓ\u00872³\u001f²r\u0087®\u0011\u0010\u008a&°d»\u0084ñ+ÂhÌêÐ¯·Ü";
               var17 = "Ñ`¶Ã¹ýÿ\u0084\u0095Âû´2\u0002ÎÏvð\u009c\u0082¸pÓ\u00872³\u001f²r\u0087®\u0011\u0010\u008a&°d»\u0084ñ+ÂhÌêÐ¯·Ü".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void U(k9[] var0) {
      Z = var0;
   }

   public static k9[] S() {
      return Z;
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23722;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/vi", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/vi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4496;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/vi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/vi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
