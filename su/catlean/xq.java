package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum xq {
   public static final xq INVENTORY;
   public static final xq ALWAYS;
   public static final xq NOT_IN_INVENTORY;
   public static final xq OFF;
   private static final xq[] v;
   private static final EnumEntries l;

   @NotNull
   public static EnumEntries X() {
      return l;
   }

   private static final xq[] S() {
      xq[] var0 = new xq[]{INVENTORY, ALWAYS, NOT_IN_INVENTORY, OFF};
      return var0;
   }

   static {
      long var9 = j0.a(6693477444195867271L, 4417739545745407600L, MethodHandles.lookup().lookupClass()).a(174218159380391L) ^ 22552387796165L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[4];
      int var6 = 0;
      String var5 = "\u001d\u007f\u0002¢=¬Ô}\u0010\u0093÷òGÀ2&\u001bÓæÛ¹¿k¯\u0095";
      int var7 = "\u001d\u007f\u0002¢=¬Ô}\u0010\u0093÷òGÀ2&\u001bÓæÛ¹¿k¯\u0095".length();
      char var4 = '\b';
      int var3 = -1;

      label28:
      while(true) {
         ++var3;
         String var11 = var5.substring(var3, var3 + var4);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var1.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var8).intern();
            switch(var10001) {
            case 0:
               var0[var6++] = var15;
               if ((var3 += var4) >= var7) {
                  INVENTORY = new xq(var0[1], 0);
                  ALWAYS = new xq(var0[2], 1);
                  NOT_IN_INVENTORY = new xq(var0[3], 2);
                  OFF = new xq(var0[0], 3);
                  v = S();
                  l = EnumEntriesKt.enumEntries((Enum[])v);
                  return;
               }

               var4 = var5.charAt(var3);
               break;
            default:
               var0[var6++] = var15;
               if ((var3 += var4) < var7) {
                  var4 = var5.charAt(var3);
                  continue label28;
               }

               var5 = ";\u00169TÏ\u0080\u0097\u008c\u0018It\u0088\u0095Ñ\u0087%-ûM0\u00109/\u0092mt®[\u0007Áîx%";
               var7 = ";\u00169TÏ\u0080\u0097\u008c\u0018It\u0088\u0095Ñ\u0087%-ûM0\u00109/\u0092mt®[\u0007Áîx%".length();
               var4 = '\b';
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
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
