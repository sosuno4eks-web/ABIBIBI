package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;

public final class vz {
   private static boolean w;
   private static final long a = j0.a(5064871821721335656L, 42944053152713357L, MethodHandles.lookup().lookupClass()).a(127400884347515L);
   private static final String b;

   @NotNull
   public static final String V(long a, @NotNull class_2561 $this$toLegacy) {
      var0 ^= a;
      long var3 = var0 ^ 22105419484233L;
      Intrinsics.checkNotNullParameter(var2, b);
      return i1.N.i(var2, var3);
   }

   public static void H(boolean var0) {
      w = var0;
   }

   public static boolean z() {
      return w;
   }

   public static boolean i() {
      boolean var0 = z();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var3 = a ^ 63247345131054L;
      if (9022994426808594957L.A<invokedynamic>(9022994426808594957L, var3)) {
         true.A<invokedynamic>(true, 9008580924677608506L, var3);
      }

      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal(" \u001f\u0001à¸Ð\u0088Ô".getBytes("ISO-8859-1"));
      String var5 = a(var2).intern();
      boolean var10001 = true;
      b = var5;
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
}
