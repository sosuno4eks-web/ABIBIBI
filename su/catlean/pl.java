package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class pl {
   @NotNull
   private final List U;
   private static final long a = j0.a(7486788720000270763L, 157762055899316703L, MethodHandles.lookup().lookupClass()).a(239673501231612L);
   private static final String b;

   public pl(@NotNull List suggestions, long a) {
      long var10000 = a ^ var2;
      Intrinsics.checkNotNullParameter(var1, b);
      super();
      this.U = var1;
   }

   @Nullable
   public final String c(@NotNull String s, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, "s");
      int[] var10000 = -681885053757284445L.A<invokedynamic>(-681885053757284445L, var2);
      Iterable var5 = (Iterable)this.U;
      boolean var6 = false;
      Iterator var7 = var5.iterator();
      int[] var4 = var10000;

      Object var11;
      label27:
      while(var7.hasNext()) {
         var11 = var7.next();

         label25:
         while(true) {
            Object var8 = var11;
            var11 = var8;

            do {
               String var9 = (String)var11;
               boolean var10 = false;
               if (!StringsKt.startsWith$default(var9, var1, false, 2, (Object)null)) {
                  continue label27;
               }

               var11 = var8;
               if (var2 < 0L) {
                  continue label25;
               }
            } while(var4 == null);

            return (String)var11;
         }
      }

      var11 = null;
      return (String)var11;
   }

   static {
      long var0 = a ^ 19906636950635L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¨\u0014Uºp¶¨°[´»\u008aMìF>".getBytes("ISO-8859-1"));
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
