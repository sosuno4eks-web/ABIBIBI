package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class c5 extends c6 {
   @NotNull
   public static final c5 T;
   private static final long a = j0.a(-7421022792535212228L, 7002926659383244380L, MethodHandles.lookup().lookupClass()).a(148614853202341L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private c5(short var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 62305410818964L;
      super(var6);
   }

   @NotNull
   public qq J(@NotNull class_1297 target, @NotNull qq currentRotation, long a, boolean attackTick) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public class_243 V(long a, @NotNull class_1297 target) {
      long var4 = var1 ^ 50570605743865L;
      Intrinsics.checkNotNullParameter(var3, true.c<invokedynamic>(975, 4949348263450553266L ^ var1));
      class_238 var10000 = var3.method_5829();
      Intrinsics.checkNotNullExpressionValue(var10000, true.c<invokedynamic>(7683, 3175068770429580927L ^ var1));
      class_238 var6 = var10000;
      return new class_243(RangesKt.coerceIn(s8.f(var4).method_33571().field_1352, var6.field_1323, var6.field_1320), RangesKt.coerceIn(s8.f(var4).method_33571().field_1351, var6.field_1322, var6.field_1325), RangesKt.coerceIn(s8.f(var4).method_33571().field_1350, var6.field_1321, var6.field_1324));
   }

   static {
      long var20 = a ^ 137533562536276L;
      long var10001 = var20 ^ 73408819533278L;
      int var22 = (int)((var20 ^ 73408819533278L) >>> 48);
      int var23 = (int)(var10001 << 16 >>> 48);
      int var24 = (int)(var10001 << 32 >>> 32);
      d = new HashMap(13);
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
      String var15 = "ÈÐ\f\u0004øYRê\u001e¶q\u0001µ,î¹Y;\\k¾¥§ï\u0010/\u0001Í\f\u0096·|?Aõ n\u000ex¥p";
      int var17 = "ÈÐ\f\u0004øYRê\u001e¶q\u0001µ,î¹Y;\\k¾¥§ï\u0010/\u0001Í\f\u0096·|?Aõ n\u000ex¥p".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var25 = var15.substring(var13, var13 + var14);
         byte var27 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var32 = b(var19).intern();
            switch(var27) {
            case 0:
               var18[var16++] = var32;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[4];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "]²\u0082çó+\u0082»Nû¥!a$C÷¸6\u0088\u0005M\u0018\u0088¾";
                  int var5 = "]²\u0082çó+\u0082»Nû¥!a$C÷¸6\u0088\u0005M\u0018\u0088¾".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var31 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                     long[] var28 = var6;
                     var31 = var3++;
                     long var34 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var35 = -1;

                     while(true) {
                        long var8 = var34;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var37 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var35) {
                        case 0:
                           var28[var31] = var37;
                           if (var2 >= var5) {
                              e = var6;
                              f = new Integer[5];
                              T = new c5((short)var22, (short)var23, var24);
                              return;
                           }
                           break;
                        default:
                           var28[var31] = var37;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "¬\u008e.ºi\u0001\u0006U\u0098%§´cm\u008b0";
                           var5 = "¬\u008e.ºi\u0001\u0006U\u0098%§´cm\u008b0".length();
                           var2 = 0;
                        }

                        var31 = var2;
                        var2 += 8;
                        var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                        var28 = var6;
                        var31 = var3++;
                        var34 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var35 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var32;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\r*Ú.§!#°'æªÐ\u0014f1?(â\u0003å½Æ\u0005Sº=\u0014²d=¶+\u0096Ïÿ¾Â\u0093*ËËjÚF.üK\u008b¯\u0096®)s\u0086ìîÿ";
               var17 = "\r*Ú.§!#°'æªÐ\u0014f1?(â\u0003å½Æ\u0005Sº=\u0014²d=¶+\u0096Ïÿ¾Â\u0093*ËËjÚF.üK\u008b¯\u0096®)s\u0086ìîÿ".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var25 = var15.substring(var13, var13 + var14);
            var27 = 0;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25740;
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
            throw new RuntimeException("su/catlean/c5", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/c5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20762;
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
            throw new RuntimeException("su/catlean/c5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
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
         throw new RuntimeException("su/catlean/c5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
