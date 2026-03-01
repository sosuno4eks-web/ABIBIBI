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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_238;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;

public final class vt {
   @NotNull
   public static final vt E;
   @NotNull
   private static final class_2960 y;
   @NotNull
   private static final List q;
   private static final long a = j0.a(5128063652209992183L, 4120882613750378602L, MethodHandles.lookup().lookupClass()).a(167744029551080L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private vt() {
   }

   public final void G(@NotNull class_4587 m, long a, @NotNull class_238 box) {
      // $FF: Couldn't be decompiled
   }

   public final void p(int var1, int var2) {
      long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
      long var5 = var3 ^ 34436526792265L;
      q.add(new s5(0, 1, var5, (DefaultConstructorMarker)null));
   }

   public final void u() {
      q.removeIf(vt::Y);
   }

   private static final boolean K(s5 var0) {
      long var1 = a ^ 17333359529590L;
      String var10000 = 2905261751688547273L.A<invokedynamic>(2905261751688547273L, var1);
      Intrinsics.checkNotNullParameter(var0, true.o<invokedynamic>(822, 1402615996044356878L ^ var1));
      String var3 = var10000;
      int var4 = var0.K();

      int var6;
      label32: {
         try {
            var0.A(var4 + -1);
            var6 = var4;
            if (var3 != null) {
               return (boolean)var6;
            }

            if (var4 < 0) {
               break label32;
            }
         } catch (NumberFormatException var5) {
            throw var5.A<invokedynamic>(var5, 2999292825455080091L, var1);
         }

         var6 = 0;
         return (boolean)var6;
      }

      var6 = 1;
      return (boolean)var6;
   }

   private static final boolean Y(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = a ^ 114044649109282L;
      long var22 = var20 ^ 138331863462381L;
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[8];
      int var16 = 0;
      String var15 = "¥àûû\u009b\u008dÔÞ\u001d.2~\fÀ'`{$\u0094\u0098C\u0015l:\u0010âUh\u0019l\u0010ð\u00adP1så\u009a.¯\u0017(mù¡\u0013(¹ÀøöÀáõÊKG´QÝM_Q{\b;\u0019xn·\u0081k¨\u008eùÖHée\u0096[\f\u0010<aQÈ|ý[[Ù\u009bÈ§0;\u0014Ï8Ó\u0001\u0004\u0000M\u0013$H=ÎÓW\u0004|\u0000\u008e-Ûr®\u0007l\u0013â\u0082\u0000XÁ ½\u0015\u000eû,S\u00ad£{M\u0012\u0083bË\u001bL·\u0007ËS$èå\u001a\u0017$ñ\u0018b\u0010j[Õ\u0004ÈöÝ\u0094¡\u0016T[IÊÅ\u0004)4.\u0095\u0011ñ";
      int var17 = "¥àûû\u009b\u008dÔÞ\u001d.2~\fÀ'`{$\u0094\u0098C\u0015l:\u0010âUh\u0019l\u0010ð\u00adP1så\u009a.¯\u0017(mù¡\u0013(¹ÀøöÀáõÊKG´QÝM_Q{\b;\u0019xn·\u0081k¨\u008eùÖHée\u0096[\f\u0010<aQÈ|ý[[Ù\u009bÈ§0;\u0014Ï8Ó\u0001\u0004\u0000M\u0013$H=ÎÓW\u0004|\u0000\u008e-Ûr®\u0007l\u0013â\u0082\u0000XÁ ½\u0015\u000eû,S\u00ad£{M\u0012\u0083bË\u001bL·\u0007ËS$èå\u001a\u0017$ñ\u0018b\u0010j[Õ\u0004ÈöÝ\u0094¡\u0016T[IÊÅ\u0004)4.\u0095\u0011ñ".length();
      char var14 = 24;
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
                  c = new String[8];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "ZiO\u00825\buúôëWº³Ùcô";
                  int var5 = "ZiO\u00825\buúôëWº³Ùcô".length();
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
                              e = var6;
                              f = new Integer[4];
                              E = new vt();
                              y = hp.o(var22, true.o<invokedynamic>(14726, 5223108878742433512L ^ var20), true.o<invokedynamic>(14107, 3370656085210570864L ^ var20));
                              q = (List)(new ArrayList());
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "D\u000bÁ^\u000f\u0088÷ìsã\u0094\u008636\u0094É";
                           var5 = "D\u000bÁ^\u000f\u0088÷ìsã\u0094\u008636\u0094É".length();
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

               var15 = "'\u008aÓôû\u009b\fT\u0089<EØú\u0013ê\u0011\u0018\u009e\\Y\u0019¡¨\bàº\u0003\u0002\u001e/E\"\u0093A\u00adÓ\u0012µdþ¿";
               var17 = "'\u008aÓôû\u009b\fT\u0089<EØú\u0013ê\u0011\u0018\u009e\\Y\u0019¡¨\bàº\u0003\u0002\u001e/E\"\u0093A\u00adÓ\u0012µdþ¿".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1680;
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
            throw new RuntimeException("su/catlean/vt", var10);
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
         throw new RuntimeException("su/catlean/vt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8650;
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
            throw new RuntimeException("su/catlean/vt", var14);
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
         throw new RuntimeException("su/catlean/vt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
