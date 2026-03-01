package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

enum eh {
   public static final eh NONE;
   public static final eh WHITE_LIST;
   public static final eh BLACK_LIST;
   private static final eh[] N;
   private static final EnumEntries D;

   @NotNull
   public static EnumEntries e() {
      return D;
   }

   private static final eh[] y() {
      eh[] var0 = new eh[]{NONE, WHITE_LIST, BLACK_LIST};
      return var0;
   }

   static {
      long var9 = j0.a(8620412935850667500L, 3334286440777471774L, MethodHandles.lookup().lookupClass()).a(100170786216432L) ^ 119956464043960L;
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
      String var5 = "Ë°×\u0093õÞ¢\u0095±\u001e\u001at%#\u0093\\\b½1f>»Ý§}\u0010ý¡\u0081\u0089\u0087Õì\u0015äÐÔkU@ßX";
      int var7 = "Ë°×\u0093õÞ¢\u0095±\u001e\u001at%#\u0093\\\b½1f>»Ý§}\u0010ý¡\u0081\u0089\u0087Õì\u0015äÐÔkU@ßX".length();
      char var4 = 16;
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var12;
         if ((var3 += var4) >= var7) {
            NONE = new eh(var0[1], 0);
            WHITE_LIST = new eh(var0[0], 1);
            BLACK_LIST = new eh(var0[2], 2);
            N = y();
            D = EnumEntriesKt.enumEntries((Enum[])N);
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
