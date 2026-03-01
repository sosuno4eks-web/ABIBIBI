package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum l8 {
   public static final l8 Silent;
   public static final l8 Normal;
   public static final l8 Alternative;
   private static final l8[] T;
   private static final EnumEntries u;

   @NotNull
   public static EnumEntries A() {
      return u;
   }

   private static final l8[] x() {
      l8[] var0 = new l8[]{Silent, Normal, Alternative};
      return var0;
   }

   static {
      long var9 = j0.a(1871464906684588479L, 4764870345755612061L, MethodHandles.lookup().lookupClass()).a(120063449155114L) ^ 58435595810840L;
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
      String var5 = "\u0089hýÃye\u009e#\bø\u0004R~Ç\u0080#Ò\u0010ÃOÍO\u001a9¹\u0000\u0085\u0082k«\u0086\u007f¸Ø";
      int var7 = "\u0089hýÃye\u009e#\bø\u0004R~Ç\u0080#Ò\u0010ÃOÍO\u001a9¹\u0000\u0085\u0082k«\u0086\u007f¸Ø".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            Silent = new l8(var0[1], 0);
            Normal = new l8(var0[0], 1);
            Alternative = new l8(var0[2], 2);
            T = x();
            u = EnumEntriesKt.enumEntries((Enum[])T);
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
