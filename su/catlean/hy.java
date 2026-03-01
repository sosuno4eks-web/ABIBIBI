package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum hy {
   public static final hy Cancel;
   public static final hy Custom;
   public static final hy OldGrim;
   public static final hy GrimNew;
   private static final hy[] Z;
   private static final EnumEntries a;
   private static boolean q;

   @NotNull
   public static EnumEntries f() {
      return a;
   }

   private static final hy[] u() {
      hy[] var0 = new hy[]{Cancel, Custom, OldGrim, GrimNew};
      return var0;
   }

   static {
      long var9 = j0.a(502613990486979705L, 4103751817210018031L, MethodHandles.lookup().lookupClass()).a(250821416026436L) ^ 13498891314460L;
      if (-8168754020846793751L.A<invokedynamic>(-8168754020846793751L, var9)) {
         true.A<invokedynamic>(true, -8154242948582621358L, var9);
      }

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
      String var5 = "@«ÅÆÐA\u009b\t\bõ\\\u0098XH\u00071V";
      int var7 = "@«ÅÆÐA\u009b\t\bõ\\\u0098XH\u00071V".length();
      char var4 = '\b';
      int var3 = -1;

      label32:
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
                  Cancel = new hy(var0[0], 0);
                  Custom = new hy(var0[1], 1);
                  OldGrim = new hy(var0[3], 2);
                  GrimNew = new hy(var0[2], 3);
                  Z = u();
                  a = EnumEntriesKt.enumEntries((Enum[])Z);
                  return;
               }

               var4 = var5.charAt(var3);
               break;
            default:
               var0[var6++] = var15;
               if ((var3 += var4) < var7) {
                  var4 = var5.charAt(var3);
                  continue label32;
               }

               var5 = "åTü;e\u0003X\u0085\bÛ\u0011\u0099\u0011kK\u0005\u0017";
               var7 = "åTü;e\u0003X\u0085\bÛ\u0011\u0099\u0011kK\u0005\u0017".length();
               var4 = '\b';
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void V(boolean var0) {
      q = var0;
   }

   public static boolean W() {
      return q;
   }

   public static boolean j() {
      boolean var0 = W();

      try {
         return !var0;
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
