package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import org.jetbrains.annotations.NotNull;

public final class q {
   @NotNull
   private static final Json P;
   private static k9[] f;
   private static final long a = j0.a(4130921231730030015L, 3200769689821801794L, MethodHandles.lookup().lookupClass()).a(203990203028320L);
   private static final String b;

   @NotNull
   public static final Json K() {
      return P;
   }

   /** @deprecated */
   public static void f() {
   }

   private static final Unit d(JsonBuilder var0) {
      long var1 = a ^ 67980738373205L;
      Intrinsics.checkNotNullParameter(var0, b);
      var0.setIgnoreUnknownKeys(true);
      var0.setExplicitNulls(false);
      var0.setNamingStrategy(JsonNamingStrategy.Builtins.getSnakeCase());
      return Unit.INSTANCE;
   }

   static {
      long var3 = a ^ 100136351504081L;
      if (-297712124983673759L.A<invokedynamic>(-297712124983673759L, var3) != null) {
         (new k9[3]).A<invokedynamic>(new k9[3], -336403444310555176L, var3);
      }

      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal("G},|×Yýn\u001eNyc³V;X".getBytes("ISO-8859-1"));
      String var5 = a(var2).intern();
      boolean var10001 = true;
      b = var5;
      P = JsonKt.Json$default((Json)null, q::d, 1, (Object)null);
   }

   public static void S(k9[] var0) {
      f = var0;
   }

   public static k9[] w() {
      return f;
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
