package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class sd {
   private final float B;
   private final float P;
   private final float E;
   private int W;
   @NotNull
   private final Color V;
   private static final long a = j0.a(3726936612726200999L, 5336478650066047231L, MethodHandles.lookup().lookupClass()).a(67530481333655L);
   private static final String b;

   public sd(int a, int a, float posX, float posY, float posZ, char a, int age, @NotNull Color color) {
      long var9 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var8, b);
      super();
      this.B = var3;
      3452373024598624406L.A<invokedynamic>(3452373024598624406L, var9);
      this.P = var4;

      try {
         this.E = var5;
         this.W = var7;
         this.V = var8;
         if (3454442768078023322L.A<invokedynamic>(3454442768078023322L, var9) == null) {
            (new String[1]).A<invokedynamic>(new String[1], 3391804542877551036L, var9);
         }

      } catch (NumberFormatException var12) {
         throw var12.A<invokedynamic>(var12, 3440191127101561996L, var9);
      }
   }

   public final float Q() {
      return this.B;
   }

   public final float i() {
      return this.P;
   }

   public final float d() {
      return this.E;
   }

   public final int f() {
      return this.W;
   }

   public final void S(int <set-?>) {
      this.W = var1;
   }

   @NotNull
   public final Color P() {
      return this.V;
   }

   static {
      long var0 = a ^ 63326519404891L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("r\u0098wê\u001a\u001dþY".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
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
