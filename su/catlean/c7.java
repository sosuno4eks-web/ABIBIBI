package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class c7 {
   private static String G;
   private static final long a = j0.a(1118582169030817990L, 2042255758570816829L, MethodHandles.lookup().lookupClass()).a(15434107614122L);
   private static final String b;

   private c7() {
   }

   @NotNull
   public final qq Q(byte a, long a, @NotNull class_243 vector) {
      long var5 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
      long var7 = var5 ^ 16728312794604L;
      Intrinsics.checkNotNullParameter(var4, b);
      return x7.Z.I(var7, var4);
   }

   public c7(DefaultConstructorMarker $constructor_marker) {
      this();
   }

   public static void W(String var0) {
      G = var0;
   }

   public static String R() {
      return G;
   }

   static {
      long var3 = a ^ 47896312362674L;
      if (5756756460607241771L.A<invokedynamic>(5756756460607241771L, var3) != null) {
         "PVE4h".A<invokedynamic>("PVE4h", 5713646737717212225L, var3);
      }

      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal("d\u009f©Ù?ó\u0014²".getBytes("ISO-8859-1"));
      String var5 = a(var2).intern();
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
