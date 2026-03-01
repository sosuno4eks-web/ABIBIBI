package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_124;

public final class f0 implements Runnable {
   final int l;
   final String P;
   private static final long a = j0.a(8541387083303561464L, 8010364104486648201L, MethodHandles.lookup().lookupClass()).a(162520564358164L);
   private static final String b;

   public f0(int var1, String var2) {
      this.l = var1;
      this.P = var2;
   }

   public final void run() {
      long var1 = a ^ 96390869908908L;
      long var3 = var1 ^ 75508097642969L;
      long var10001 = var1 ^ 39347449333463L;
      int var5 = (int)((var1 ^ 39347449333463L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var1 ^ 42658518185557L;
      5907853675835039265L.A<invokedynamic>(5907853675835039265L, var1);
      Thread.sleep((long)this.l);
      boolean var11 = false;

      try {
         k9 var10000 = (k9)t8.c;
         class_124 var15 = class_124.field_1068;
         t8 var10002 = t8.c;
         String var10004 = this.P;
         String var10005 = t8.R(t8.c, var8).name().toLowerCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var10005, b);
         ha.F(var10000, var5, var6, var15 + t8.T(var10002, var3, var10004, var10005), false, 2, (Object)null, var7);
      } catch (Exception var14) {
         var14.printStackTrace();
      }

      try {
         if (5903317122333627526L.A<invokedynamic>(5903317122333627526L, var1) == null) {
            (new String[4]).A<invokedynamic>(new String[4], 5877676831237237777L, var1);
         }

      } catch (Exception var13) {
         throw var13.A<invokedynamic>(var13, 5820108011469641516L, var1);
      }
   }

   static {
      long var0 = a ^ 109392517196050L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0080´T3p+\u0084Ê>Eãªp\u0012/=Úóó\u0089\u0084âô\u0082".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      boolean var10001 = true;
      b = var5;
   }

   private static Exception a(Exception var0) {
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
}
