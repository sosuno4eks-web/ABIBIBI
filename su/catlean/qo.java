package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.Grouping;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1542;
import net.minecraft.class_2561;

public final class qo implements Grouping {
   final Iterable m;
   private static final long a = j0.a(5001100833797801531L, 8145217209906093130L, MethodHandles.lookup().lookupClass()).a(222774972032212L);
   private static final String b;

   public qo(Iterable $receiver) {
      this.m = var1;
   }

   public Iterator sourceIterator() {
      return this.m.iterator();
   }

   public Object keyOf(Object element) {
      long var2 = a ^ 93866719118079L;
      long var4 = var2 ^ 63806400442890L;
      class_1542 var6 = (class_1542)var1;
      boolean var7 = false;
      class_2561 var10000 = var6.method_6983().method_7964();
      Intrinsics.checkNotNullExpressionValue(var10000, b);
      return vz.V(var4, var10000);
   }

   static {
      long var0 = a ^ 58169803012303L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¡bì¡@\u009b\u0096u\u0085 Ì=\"\u008cZ´¡ü2\u008d\u0096~¼¦".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      boolean var10001 = true;
      b = var5;
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
