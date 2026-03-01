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
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import org.jetbrains.annotations.NotNull;

public final class ff {
   private static String J;
   private static final long a = j0.a(8518295999099538099L, 1833779339367632587L, MethodHandles.lookup().lookupClass()).a(140347601469430L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long e;

   public static final void K(int id, int button, @NotNull class_1713 type, boolean closeAfter, int a, long a) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static void G(int param0, int param1, int param2, class_1713 param3, boolean param4, int param5, long param6, Object param8) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public static final class_1269 y(@NotNull class_1268 hand, long a, float y, float p) {
      var1 ^= a;
      long var5 = var1 ^ 97287260519981L;
      long var7 = var1 ^ 60265105380237L;
      Intrinsics.checkNotNullParameter(var0, true.n<invokedynamic>(30122, 8655121744248054147L ^ var1));
      class_1269 var10000 = s8.r(var5).method_2919((class_1657)s8.f(var7), var0);
      Intrinsics.checkNotNullExpressionValue(var10000, true.n<invokedynamic>(14794, 4054388406751882720L ^ var1));
      class_1269 var9 = var10000;
      return var9;
   }

   // $FF: synthetic method
   public static class_1269 f(class_1268 var0, float var1, float var2, char var3, int var4, long var5, Object var7) {
      long var8 = ((long)var3 << 48 | var5 << 16 >>> 16) ^ a;
      long var10 = var8 ^ 72189895741219L;
      String var12 = -6959987711681716032L.A<invokedynamic>(-6959987711681716032L, var8);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var4 & 2;
               if (var12 != null) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, -6957961272544511303L, var8);
            }

            var1 = -1337.0F;
         }

         var10000 = var4 & 4;
      }

      if (var10000 != 0) {
         var2 = -1337.0F;
      }

      return y(var0, var10, var1, var2);
   }

   public static void N(String var0) {
      J = var0;
   }

   public static String T() {
      return J;
   }

   static {
      long var14 = a ^ 98325124300175L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, -265481725463494758L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[3];
      int var10 = 0;
      String var9 = "ívêg\u0096·\u001d{Õ»Ù¦=\u0098á\u0017\u0018E\na¿\u0095,\ruÖAÙÎLv\u0000\u009eUî\u00983i\u008cþ=\u0010jà\u0010æ'\u0016Üg*¸Õ\u008c\u009a\u0000ÿú";
      int var11 = "ívêg\u0096·\u001d{Õ»Ù¦=\u0098á\u0017\u0018E\na¿\u0095,\ruÖAÙÎLv\u0000\u009eUî\u00983i\u008cþ=\u0010jà\u0010æ'\u0016Üg*¸Õ\u008c\u009a\u0000ÿú".length();
      char var8 = 16;
      int var7 = -1;

      while(true) {
         ++var7;
         byte[] var13 = var5.doFinal(var9.substring(var7, var7 + var8).getBytes("ISO-8859-1"));
         String var17 = a(var13).intern();
         boolean var10001 = true;
         var12[var10++] = var17;
         if ((var7 += var8) >= var11) {
            b = var12;
            c = new String[3];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = 6355440120219304533L;
            byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
            long var19 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
            var10001 = true;
            e = var19;
            return;
         }

         var8 = var9.charAt(var7);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1452;
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
            throw new RuntimeException("su/catlean/ff", var10);
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
         throw new RuntimeException("su/catlean/ff" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
