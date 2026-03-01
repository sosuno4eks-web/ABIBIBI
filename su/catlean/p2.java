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
import net.minecraft.class_2596;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class p2 {
   @NotNull
   private final class_2596 f;
   private final long C;
   private static final long a = j0.a(8408952959208404977L, 7519633350705520079L, MethodHandles.lookup().lookupClass()).a(106104738830357L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public p2(long a, @NotNull class_2596 packet, long timestamp) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.o<invokedynamic>(15498, 668133203515295790L ^ var1));
      super();
      this.f = var3;
      this.C = var4;
   }

   @NotNull
   public final class_2596 o() {
      return this.f;
   }

   public final long N() {
      return this.C;
   }

   @NotNull
   public final class_2596 J() {
      return this.f;
   }

   public final long i() {
      return this.C;
   }

   @NotNull
   public final p2 Z(long a, @NotNull class_2596 packet, long timestamp) {
      var1 ^= a;
      long var6 = var1 ^ 84139998079334L;
      Intrinsics.checkNotNullParameter(var3, true.o<invokedynamic>(16069, 9090842784106128336L ^ var1));
      return new p2(var6, var3, var4);
   }

   public static p2 l(long var0, p2 var2, class_2596 var3, long var4, int var6, Object var7) {
      var0 ^= a;
      long var8 = var0 ^ 126873209521927L;
      String var10 = -3925821946646264568L.A<invokedynamic>(-3925821946646264568L, var0);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var6 & 1;
               if (var10 == null) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var11) {
               throw var11.A<invokedynamic>(var11, -3968809458744623356L, var0);
            }

            var3 = var2.f;
         }

         var10000 = var6 & 2;
      }

      if (var10000 != 0) {
         var4 = var2.C;
      }

      return var2.Z(var8, var3, var4);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 43397166722449L;
      long var3 = this.C;
      class_2596 var5 = this.f;
      String var10000 = 15956.o<invokedynamic>(15956, 1820303764408254631L ^ var1);
      return var10000 + var5 + true.o<invokedynamic>(1614, 5524519158095345852L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 3434346067653L;
      int var3 = this.f.hashCode();
      var3 = var3 * (int)e + Long.hashCode(this.C);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 39317132160523L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = "ãøÛªÝâþá\u008bª\u0083\u000f\u000bsD\u0003êGË\t)Úú¼k\u001bfés¿\u0097\u009fÀNÁFû¿\u001dÀ ÑÒ<#\u000eñ!:\u0091îOÕ\u0006\u000f|ØJn$\u0080·Â\u0095 6\u0080\u0010¢e\u009dàr";
      int var13 = "ãøÛªÝâþá\u008bª\u0083\u000f\u000bsD\u0003êGË\t)Úú¼k\u001bfés¿\u0097\u009fÀNÁFû¿\u001dÀ ÑÒ<#\u000eñ!:\u0091îOÕ\u0006\u000f|ØJn$\u0080·Â\u0095 6\u0080\u0010¢e\u009dàr".length();
      char var10 = '(';
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  b = var14;
                  c = new String[4];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -7780573561468605796L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "fM\u0082[\u000e\u0081\u009fa\u009erCr\u0097\u00052Ù\u0010\"ÿ\u009c\u0006\u000f\u007fÁÎ·SA\u0080ª|æÐ";
               var13 = "fM\u0082[\u000e\u0081\u009fa\u009erCr\u0097\u00052Ù\u0010\"ÿ\u009c\u0006\u000f\u007fÁÎ·SA\u0080ª|æÐ".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5044;
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
            throw new RuntimeException("su/catlean/p2", var10);
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
         throw new RuntimeException("su/catlean/p2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
