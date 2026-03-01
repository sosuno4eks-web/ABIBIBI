package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;

public enum v6 {
   @NotNull
   private final class_124 g;
   public static final v6 SUCCESS;
   public static final v6 INFO;
   public static final v6 WARNING;
   public static final v6 ERROR;
   public static final v6 ENABLED;
   public static final v6 DISABLED;
   // $FF: synthetic field
   private static final EnumEntries A;
   private static int i;
   private static final long a = j0.a(3858910262089958645L, 6683260640718988098L, MethodHandles.lookup().lookupClass()).a(206891777331164L);
   private static final long b;

   private v6(class_124 var3) {
      this.g = var3;
   }

   @NotNull
   public final class_124 F() {
      return this.g;
   }

   @NotNull
   public static EnumEntries e() {
      return A;
   }

   // $FF: synthetic method
   private static final v6[] p(char var0, int var1, char var2) {
      long var3 = ((long)var0 << 48 | (long)var1 << 32 >>> 16 | (long)var2 << 48 >>> 48) ^ a;
      v6[] var5 = new v6[(int)b];
      var5[0] = SUCCESS;
      var5[1] = INFO;
      var5[2] = WARNING;
      var5[3] = ERROR;
      var5[4] = ENABLED;
      var5[5] = DISABLED;
      return var5;
   }

   static {
      long var14 = a ^ 124229291982584L;
      long var10001 = var14 ^ 139707540665709L;
      int var16 = (int)((var14 ^ 139707540665709L) >>> 48);
      int var17 = (int)(var10001 << 16 >>> 32);
      int var18 = (int)(var10001 << 48 >>> 48);
      if (1249485334200634695L.A<invokedynamic>(1249485334200634695L, var14) != 0) {
         11.A<invokedynamic>(11, 1292245019366684872L, var14);
      }

      Cipher var6;
      Cipher var10000 = var6 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var7 = 1; var7 < 8; ++var7) {
         var10003[var7] = (byte)((int)(var14 << var7 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var5 = new String[6];
      int var11 = 0;
      String var10 = "ðMqÏZH\u0084ø\u0010`¥-¼\u0095eW%â`Ö#M\u0093Õÿ\bßi\u00ad\u0014v,\u0095¦\b\u009cèÃ>,â7&";
      int var12 = "ðMqÏZH\u0084ø\u0010`¥-¼\u0095eW%â`Ö#M\u0093Õÿ\bßi\u00ad\u0014v,\u0095¦\b\u009cèÃ>,â7&".length();
      char var9 = '\b';
      int var8 = -1;

      label41:
      while(true) {
         ++var8;
         String var19 = var10.substring(var8, var8 + var9);
         byte var21 = -1;

         while(true) {
            byte[] var13 = var6.doFinal(var19.getBytes("ISO-8859-1"));
            String var25 = a(var13).intern();
            switch(var21) {
            case 0:
               var5[var11++] = var25;
               if ((var8 += var9) >= var12) {
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -8833650859363985085L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var27 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var24 = true;
                  b = var27;
                  SUCCESS = new v6(var5[0], 0, class_124.field_1060);
                  INFO = new v6(var5[5], 1, class_124.field_1075);
                  WARNING = new v6(var5[2], 2, class_124.field_1065);
                  ERROR = new v6(var5[4], 3, class_124.field_1061);
                  ENABLED = new v6(var5[3], 4, class_124.field_1077);
                  DISABLED = new v6(var5[1], 5, class_124.field_1079);
                  A = EnumEntriesKt.enumEntries((Enum[])I);
                  return;
               }

               var9 = var10.charAt(var8);
               break;
            default:
               var5[var11++] = var25;
               if ((var8 += var9) < var12) {
                  var9 = var10.charAt(var8);
                  continue label41;
               }

               var10 = "ì\u00ad¬Þ\u009e\u0090±º\b·ä\u0092Mì\u001a]ï";
               var12 = "ì\u00ad¬Þ\u009e\u0090±º\b·ä\u0092Mì\u001a]ï".length();
               var9 = '\b';
               var8 = -1;
            }

            ++var8;
            var19 = var10.substring(var8, var8 + var9);
            var21 = 0;
         }
      }
   }

   public static void c(int var0) {
      i = var0;
   }

   public static int w() {
      return i;
   }

   public static int A() {
      int var0 = w();

      try {
         return var0 == 0 ? 72 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
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
