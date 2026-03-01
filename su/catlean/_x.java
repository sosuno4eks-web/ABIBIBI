package su.catlean;

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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.gofra.Flow;

public final class _x implements zh {
   @NotNull
   public static final _x e;
   @NotNull
   private static final List z;
   @NotNull
   private static final fs v;
   @NotNull
   private static final fs p;
   @NotNull
   private static final fs Q;
   @NotNull
   private static final fs g;
   @NotNull
   private static final fs T;
   @NotNull
   private static final fs n;
   private static boolean O;
   private static int J;
   private static final long a = j0.a(4444425970227211313L, 1939358673235508785L, MethodHandles.lookup().lookupClass()).a(154661751966990L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] f;
   private static final Integer[] h;
   private static final Map i;

   private _x() {
   }

   @NotNull
   public final fs j() {
      return v;
   }

   @NotNull
   public final fs s() {
      return p;
   }

   @NotNull
   public final fs x() {
      return Q;
   }

   @NotNull
   public final fs Q() {
      return g;
   }

   @NotNull
   public final fs e() {
      return T;
   }

   @NotNull
   public final fs d() {
      return n;
   }

   public final boolean T() {
      return O;
   }

   public final void v(boolean <set-?>) {
      O = var1;
   }

   public final void R(@NotNull String title, long a, @NotNull String content, int second, @NotNull v6 type, @Nullable class_1799 item) {
      // $FF: Couldn't be decompiled
   }

   public static void m(_x var0, int var1, String var2, int var3, String var4, int var5, v6 var6, class_1799 var7, int var8, Object var9, byte var10) {
      long var11 = ((long)var1 << 32 | (long)var3 << 40 >>> 32 | (long)var10 << 56 >>> 56) ^ a;
      long var13 = var11 ^ 6429478433623L;
      if ((var8 & true.a<invokedynamic>(2202, 5079079102044932160L ^ var11)) != 0) {
         var7 = null;
      }

      var0.R(var2, var13, var4, var5, var6, var7);
   }

   @Flow
   public final void i(@NotNull Render2DEvent e) {
      // $FF: Couldn't be decompiled
   }

   private final void y(a5 param1, long param2, class_332 param4, float param5) {
      // $FF: Couldn't be decompiled
   }

   private final float A(float var1, float var2) {
      return var1 + (var2 - var1) / 8.0F;
   }

   private static final void A(String param0, String param1, v6 param2, int param3, class_1799 param4) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean b(a5 var0) {
      long var1 = a ^ 108124325665749L;
      long var3 = var1 ^ 90724799422609L;
      Intrinsics.checkNotNullParameter(var0, true.g<invokedynamic>(28104, 1227465513640100149L ^ var1));
      return var0.s(var3);
   }

   private static final boolean L(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = a ^ 70653274847578L;
      long var22 = var20 ^ 12274141524989L;
      d = new HashMap(13);
      0.A<invokedynamic>(0, -4307378470715721953L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[13];
      int var16 = 0;
      String var15 = "L\u001eö\u0000jÂ\u000bD{\u000eR\u0082\u008d?\u0018\n\u0010vü&à^üUfÿ£\u000b\u0007\u0017\u0013©É\u0010æc-¶\u0010fpâ$\u009d3#\u0014Ç²¦\u0010ÇË\u0090{\u0018¥ñi\u0082;³Br·(?\u0010\u0012ó'\u009eá\u0011©pÛ\u008a\u001a=Ê\u001c\u0097Ñ \"ß\u0004õ1\u0001\u0088Éã\u0094ûn\u0090Å\u008a¦ë\u000bÜ\u0004h\u0005½\u0087LT«\u0017èË¼\u009c\u0010¨:sÝ3ç[\u0082ñ`eà\u0090µ\u0088\u0018 Ï²MMðÞ\u000f¯\u000b\u0094pêðãÒµ>và¡XE\u0010\u009aë¬òï\u001b\u009bQ;\u0010þNú\u001a2·Å¢b\u0093í\u0099ÿGâq\u0010Ã%ë¨Û=U\bë\u0087\u0085¹\u008fZ>ö\u0010ç\u001e\u008cia\nØùS à}{wv:";
      int var17 = "L\u001eö\u0000jÂ\u000bD{\u000eR\u0082\u008d?\u0018\n\u0010vü&à^üUfÿ£\u000b\u0007\u0017\u0013©É\u0010æc-¶\u0010fpâ$\u009d3#\u0014Ç²¦\u0010ÇË\u0090{\u0018¥ñi\u0082;³Br·(?\u0010\u0012ó'\u009eá\u0011©pÛ\u008a\u001a=Ê\u001c\u0097Ñ \"ß\u0004õ1\u0001\u0088Éã\u0094ûn\u0090Å\u008a¦ë\u000bÜ\u0004h\u0005½\u0087LT«\u0017èË¼\u009c\u0010¨:sÝ3ç[\u0082ñ`eà\u0090µ\u0088\u0018 Ï²MMðÞ\u000f¯\u000b\u0094pêðãÒµ>và¡XE\u0010\u009aë¬òï\u001b\u009bQ;\u0010þNú\u001a2·Å¢b\u0093í\u0099ÿGâq\u0010Ã%ë¨Û=U\bë\u0087\u0085¹\u008fZ>ö\u0010ç\u001e\u008cia\nØùS à}{wv:".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var30;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[13];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[12];
                  int var3 = 0;
                  String var4 = "ÝÐ\u0088\u0099('¥\\\u0089Üw\u0016VeæE·é«>4\u0095/Ñ8\u001eó\u0082»_ç6×@)¤uk\"\u008f¨\u009d(\u0001ÚÔ+ûbg\u00947¯>ô\r`8\u0014£à\u0017l+³Pú\u007fd¨]\u0006yÖp\u001eÀè\u0081\u009b";
                  int var5 = "ÝÐ\u0088\u0099('¥\\\u0089Üw\u0016VeæE·é«>4\u0095/Ñ8\u001eó\u0082»_ç6×@)¤uk\"\u008f¨\u009d(\u0001ÚÔ+ûbg\u00947¯>ô\r`8\u0014£à\u0017l+³Pú\u007fd¨]\u0006yÖp\u001eÀè\u0081\u009b".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var27[var28] = var35;
                           if (var2 >= var5) {
                              f = var6;
                              h = new Integer[12];
                              e = new _x();
                              z = (List)(new ArrayList());
                              v = new fs(true.g<invokedynamic>(12472, 3188713064012381889L ^ var20), var22, true.a<invokedynamic>(21229, 7063812185796291191L ^ var20), true.a<invokedynamic>(6372, 2718934932220567674L ^ var20));
                              p = new fs(true.g<invokedynamic>(25177, 330289220197592098L ^ var20), var22, true.a<invokedynamic>(6372, 2718934932220567674L ^ var20), true.a<invokedynamic>(6372, 2718934932220567674L ^ var20));
                              Q = new fs(true.g<invokedynamic>(24167, 315622809076862994L ^ var20), var22, true.a<invokedynamic>(6372, 2718934932220567674L ^ var20), true.a<invokedynamic>(6372, 2718934932220567674L ^ var20));
                              g = new fs(true.g<invokedynamic>(20840, 2477870456841445144L ^ var20), var22, true.a<invokedynamic>(6372, 2718934932220567674L ^ var20), true.a<invokedynamic>(6372, 2718934932220567674L ^ var20));
                              T = new fs(true.g<invokedynamic>(8947, 2964049677863709824L ^ var20), var22, true.a<invokedynamic>(6372, 2718934932220567674L ^ var20), true.a<invokedynamic>(6372, 2718934932220567674L ^ var20));
                              n = new fs(true.g<invokedynamic>(9859, 5995869894141110514L ^ var20), var22, true.a<invokedynamic>(6372, 2718934932220567674L ^ var20), true.a<invokedynamic>(6372, 2718934932220567674L ^ var20));
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "¹\u0003sIJ\u0012{\u0081+;µÁø·í%";
                           var5 = "¹\u0003sIJ\u0012{\u0081+;µÁø·í%".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var30;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "atv;\u001cð£g|i\u009b`\u0016t\u0098¥Ç\u0010ÜL 9ËÏ\u0010'\u009b\u008d3T±\u008bµ\u0088(¾\u0003fì\u009a\u0087";
               var17 = "atv;\u001cð£g|i\u009b`\u0016t\u0098¥Ç\u0010ÜL 9ËÏ\u0010'\u009b\u008d3T±\u008bµ\u0088(¾\u0003fì\u009a\u0087".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void k(int var0) {
      J = var0;
   }

   public static int C() {
      return J;
   }

   public static int U() {
      int var0 = C();

      try {
         return var0 == 0 ? 112 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2120;
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
            throw new RuntimeException("su/catlean/_x", var10);
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
         throw new RuntimeException("su/catlean/_x" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16038;
      if (h[var3] == null) {
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
            throw new RuntimeException("su/catlean/_x", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("su/catlean/_x" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
