package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;

public final class ny extends nm {
   @NotNull
   public static final ny U;
   private static final long c = j0.a(2311129710594460228L, 6975951609418204984L, MethodHandles.lookup().lookupClass()).a(87079543681160L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;
   private static final long[] j;
   private static final Integer[] m;
   private static final Map n;

   private ny(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 128903836115767L;
      super(true.r<invokedynamic>(28831, 2253952040684806092L ^ var1), var3);
   }

   public void k(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   public void O(@NotNull class_332 context, long a) {
      long var4 = var2 ^ 92054398390760L;
      long var6 = var2 ^ 103115379732612L;
      long var8 = var2 ^ 57720381647393L;
      long var10 = var2 ^ 80023539268542L;
      long var12 = var2 ^ 128044530845305L;
      long var14 = var2 ^ 95742636523377L;
      long var16 = var2 ^ 120005632475335L;
      Intrinsics.checkNotNullParameter(var1, true.r<invokedynamic>(19859, 7609259437784045047L ^ var2));
      String[] var10000 = 2937851112072059261L.A<invokedynamic>(2937851112072059261L, var2);
      int var19 = 2;
      Iterator var20 = xl.w(var16, s8.f(var8)).iterator();
      String[] var18 = var10000;

      while(var20.hasNext()) {
         class_1799 var21 = (class_1799)var20.next();
         Color var22 = z8.I.Z(var12, var19);
         Color var23 = z8.I.Z(var12, var19 * 2);
         Color var24 = gk.E.e(var10, var22, 0.4F);
         Color var25 = gk.E.e(var10, var23, 0.4F);
         float var27 = this.Q(var6) + (float)var19;
         float var10001 = this.b(var4) + 15.0F;
         Matrix3x2fStack var10010 = var1.method_51448();
         Intrinsics.checkNotNullExpressionValue(var10010, true.r<invokedynamic>(28416, 4448581903681632101L ^ var2));
         bt.m(var27, var10001, 16.0F, 4.0F, 1.5F, var14, var24, var24, var25, var25, var10010, 1.0F, var23);
         float var26 = class_3532.method_15363(16.0F - (float)var21.method_7919() * 16.0F / (float)var21.method_7936() + 2.0F, 0.0F, 16.0F);
         var27 = this.Q(var6) + (float)var19;
         var10001 = this.b(var4) + 15.0F;
         var10010 = var1.method_51448();
         Intrinsics.checkNotNullExpressionValue(var10010, true.r<invokedynamic>(28416, 4448581903681632101L ^ var2));
         bt.m(var27, var10001, var26, 4.0F, 1.5F, var14, var22, var22, var23, var23, var10010, 1.0F, var23);
         var19 += 20;
         if (var18 != null) {
            break;
         }
      }

   }

   static {
      long var20 = c ^ 57365939577015L;
      long var22 = var20 ^ 73597948215212L;
      i = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "\u0097°©\t0\u000f8F\u0082\u008f\u0098á\u008c¼\u001fÁ\u0014{ûª\"\u001d\u0090Ðj'E=NÝ\u0090ó\u0010¾6ÌÈ£R;¡ï  Ûàõ ¡\u0018\u000bÔürßY)z_Bª\u0001j\u008ehÛAp\u009b\u009e\u0090S|\u009f";
      int var17 = "\u0097°©\t0\u000f8F\u0082\u008f\u0098á\u008c¼\u001fÁ\u0014{ûª\"\u001d\u0090Ðj'E=NÝ\u0090ó\u0010¾6ÌÈ£R;¡ï  Ûàõ ¡\u0018\u000bÔürßY)z_Bª\u0001j\u008ehÛAp\u009b\u009e\u0090S|\u009f".length();
      char var14 = ' ';
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var29 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[5];
                  n = new HashMap(13);
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
                  String var4 = "\tÑ\u008eÙ\u0098Û\u0085Ú\u0085wXþç\u0012¶J«\u0081#ôx\bÄ}";
                  int var5 = "\tÑ\u008eÙ\u0098Û\u0085Ú\u0085wXþç\u0012¶J«\u0081#ôx\bÄ}".length();
                  int var2 = 0;

                  do {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     var27 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var31 = true;
                     var6[var27] = var10004;
                  } while(var2 < var5);

                  j = var6;
                  m = new Integer[3];
                  U = new ny(var22);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "m5Üã\u0011[xNM{\u008c\u0013ñ¥ñ' l\u009a;\u0018³°¢©WËËXÏ³\u009aý÷\u009f \u001dVÁ@\u009av\u008føÇêµ\u0005m";
               var17 = "m5Üã\u0011[xNM{\u008c\u0013ñ¥ñ' l\u009a;\u0018³°¢©WËËXÏ³\u009aý÷\u009f \u001dVÁ@\u009av\u008føÇêµ\u0005m".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28748;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ny", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/ny" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11478;
      if (m[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
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
            throw new RuntimeException("su/catlean/ny", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ny" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
