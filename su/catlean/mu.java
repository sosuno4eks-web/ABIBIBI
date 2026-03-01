package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2824;
import org.jetbrains.annotations.NotNull;
import su.catlean.mixins.accessors.ServerboundInteractPacketAccessor;

public final class mu {
   private static String T;
   private static final long a = j0.a(5601482934118496245L, 4780875776206273987L, MethodHandles.lookup().lookupClass()).a(208006211433270L);
   private static final String b;

   public static final void Q(long a, @NotNull class_2824 $this$setEntityId, int id) {
      var0 ^= a;
      String var10000 = -5553864572019685728L.A<invokedynamic>(-5553864572019685728L, var0);
      Intrinsics.checkNotNullParameter(var2, b);
      String var4 = var10000;

      try {
         ((ServerboundInteractPacketAccessor)var2).setEntityId(var3);
         if (var4 == null) {
            (new int[2]).A<invokedynamic>(new int[2], -5617508637495692879L, var0);
         }

      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -5572063830374325212L, var0);
      }
   }

   public static void r(String var0) {
      T = var0;
   }

   public static String z() {
      return T;
   }

   static {
      long var3 = a ^ 100809890410621L;
      if (-1334297638336947913L.A<invokedynamic>(-1334297638336947913L, var3) == null) {
         "q1jEc".A<invokedynamic>("q1jEc", -1318173381523601112L, var3);
      }

      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal("§\u0002`hâúÎ\u0018".getBytes("ISO-8859-1"));
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
