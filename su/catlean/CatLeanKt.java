package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.jetbrains.annotations.NotNull;

public final class CatLeanKt {
   @NotNull
   public static final String f;
   @NotNull
   private static final ModContainer c;

   @NotNull
   public static final ModContainer I() {
      return c;
   }

   static {
      long var9 = j0.a(5072311737292457092L, 1171462091312301061L, MethodHandles.lookup().lookupClass()).a(30394075994441L) ^ 952017289974L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[3];
      int var6 = 0;
      String var5 = "¡ðÖþõ\n3\u0091\b¡ðÖþõ\n3\u0091\u0018òÀý0ºÜ\u0091\u001a\u0088SF*¿cÓ\u00ad\u0011\bÒ·01´\u000e";
      int var7 = "¡ðÖþõ\n3\u0091\b¡ðÖþõ\n3\u0091\u0018òÀý0ºÜ\u0091\u001a\u0088SF*¿cÓ\u00ad\u0011\bÒ·01´\u000e".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var13 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var13;
         if ((var3 += var4) >= var7) {
            f = var0[1];
            Object var11 = FabricLoader.getInstance().getModContainer(var0[0]).orElseThrow();
            Intrinsics.checkNotNullExpressionValue(var11, var0[2]);
            c = (ModContainer)var11;
            return;
         }

         var4 = var5.charAt(var3);
      }
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
