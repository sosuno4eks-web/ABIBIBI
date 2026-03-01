package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class k0 extends kc {
   @NotNull
   public static final k0 y;
   private static final long m = j0.a(8192806986927244186L, 4110599850334928759L, MethodHandles.lookup().lookupClass()).a(268093231715236L);
   private static final String B;

   private k0(long var1) {
      var1 ^= m;
      long var10001 = var1 ^ 66407447888898L;
      int var3 = (int)((var1 ^ 66407447888898L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      super((char)var3, B, var4, pa.N(), var5);
   }

   @Flow
   private final void v(PlayerUpdateEvent var1) {
      long var2 = m ^ 126963445066540L;
      long var4 = var2 ^ 47470708767431L;
      long var6 = var2 ^ 77710275020106L;
      this.W(var6, (class_1657)s8.f(var4));
   }

   static {
      long var3 = m ^ 137165034289400L;
      long var5 = var3 ^ 21146558512616L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal("ôþÔ4\u0095Ð~1\u008bî©A*qRU".getBytes("ISO-8859-1"));
      String var7 = d(var2).intern();
      boolean var10001 = true;
      B = var7;
      y = new k0(var5);
   }

   private static String d(byte[] var0) {
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
