package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.LightMapUpdateEvent;
import su.catlean.gofra.Flow;

public final class lv extends k9 {
   @NotNull
   public static final lv n;
   private static final long b = j0.a(-5828952556046188621L, 1872545987419638672L, MethodHandles.lookup().lookupClass()).a(168859973428670L);
   private static final String c;

   private lv(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 5756911930742L;
      super(var3, c, pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @Flow
   private final void x(LightMapUpdateEvent var1) {
      var1.cancel();
   }

   static {
      long var3 = b ^ 25963060863741L;
      long var5 = var3 ^ 75313152980215L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal("%)|OLdHÃ(L\u0002\u0002Wo¼µ".getBytes("ISO-8859-1"));
      String var7 = b(var2).intern();
      boolean var10001 = true;
      c = var7;
      n = new lv(var5);
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
}
