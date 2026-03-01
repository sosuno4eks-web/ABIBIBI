package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum cc {
   public static final cc Rubberband;
   public static final cc Items;
   public static final cc MatrixOffGround;
   public static final cc Vanilla;
   public static final cc GrimOld;
   public static final cc GRIM_NEW;
   private static final cc[] Q;
   private static final EnumEntries o;
   private static boolean p;
   private static final long a = j0.a(7022220869722268073L, 8981351363138920635L, MethodHandles.lookup().lookupClass()).a(214234810591065L);
   private static final long b;

   @NotNull
   public static EnumEntries E() {
      return o;
   }

   private static final cc[] k(long var0) {
      long var10000 = a ^ var0;
      cc[] var2 = new cc[(int)b];
      var2[0] = Rubberband;
      var2[1] = Items;
      var2[2] = MatrixOffGround;
      var2[3] = Vanilla;
      var2[4] = GrimOld;
      var2[5] = GRIM_NEW;
      return var2;
   }

   static {
      long var14 = a ^ 53684456689347L;
      long var16 = var14 ^ 72574790117186L;
      if (!4792763421167225680L.A<invokedynamic>(4792763421167225680L, var14)) {
         true.A<invokedynamic>(true, 4781921693296401391L, var14);
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
      String var10 = "t\u0094*rÂé\u009eõ\u0010\u0016ÝkÆýó\u009fjsÖÎÆÃÞå\u0006\b\u009aB\"x\u0084C:µ\b1|b:Y\u0002V¨";
      int var12 = "t\u0094*rÂé\u009eõ\u0010\u0016ÝkÆýó\u009fjsÖÎÆÃÞå\u0006\b\u009aB\"x\u0084C:µ\b1|b:Y\u0002V¨".length();
      char var9 = '\b';
      int var8 = -1;

      label41:
      while(true) {
         ++var8;
         String var18 = var10.substring(var8, var8 + var9);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var6.doFinal(var18.getBytes("ISO-8859-1"));
            String var23 = a(var13).intern();
            switch(var10001) {
            case 0:
               var5[var11++] = var23;
               if ((var8 += var9) >= var12) {
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 6993431865716420088L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var25 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var21 = true;
                  b = var25;
                  Rubberband = new cc(var5[4], 0);
                  Items = new cc(var5[0], 1);
                  MatrixOffGround = new cc(var5[5], 2);
                  Vanilla = new cc(var5[2], 3);
                  GrimOld = new cc(var5[3], 4);
                  GRIM_NEW = new cc(var5[1], 5);
                  Q = k(var16);
                  o = EnumEntriesKt.enumEntries((Enum[])Q);
                  return;
               }

               var9 = var10.charAt(var8);
               break;
            default:
               var5[var11++] = var23;
               if ((var8 += var9) < var12) {
                  var9 = var10.charAt(var8);
                  continue label41;
               }

               var10 = "B\u00adM\u0080\u001a\u0090\u0006¾2YÏ¶ÓóË5\u0010ÚäSµrÛoSGY\u009c\u009f;û)Ï";
               var12 = "B\u00adM\u0080\u001a\u0090\u0006¾2YÏ¶ÓóË5\u0010ÚäSµrÛoSGY\u009c\u009f;û)Ï".length();
               var9 = 16;
               var8 = -1;
            }

            ++var8;
            var18 = var10.substring(var8, var8 + var9);
            var10001 = 0;
         }
      }
   }

   public static void l(boolean var0) {
      p = var0;
   }

   public static boolean B() {
      return p;
   }

   public static boolean h() {
      boolean var0 = B();

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
