package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum rs {
   @NotNull
   private final h5 w;
   public static final rs FIRE_WORK;
   public static final rs BOOST;
   public static final rs CONTROL;
   public static final rs INFINITE;
   public static final rs PACKET;
   public static final rs SILENT_FIRE_WORK;
   private static final rs[] e;
   private static final EnumEntries u;
   private static final long a = j0.a(8445553923671746570L, 2077407165095633813L, MethodHandles.lookup().lookupClass()).a(272306823736584L);
   private static final long b;

   private rs(h5 var3) {
      this.w = var3;
   }

   @NotNull
   public final h5 n() {
      return this.w;
   }

   @NotNull
   public static EnumEntries N() {
      return u;
   }

   private static final rs[] x(long var0) {
      long var10000 = a ^ var0;
      rs[] var2 = new rs[(int)b];
      var2[0] = FIRE_WORK;
      var2[1] = BOOST;
      var2[2] = CONTROL;
      var2[3] = INFINITE;
      var2[4] = PACKET;
      var2[5] = SILENT_FIRE_WORK;
      return var2;
   }

   static {
      long var14 = a ^ 80918552341951L;
      long var16 = var14 ^ 26815045408875L;
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
      String var10 = "cÐ/º\u001b\u008eKN\u009fz\u0002>\u0085º+\u0099\b\u0014Ã\u0006fºû¡\u0006\bó\u0084Hlß\u000fðK\b©Öù5\u009c}y[";
      int var12 = "cÐ/º\u001b\u008eKN\u009fz\u0002>\u0085º+\u0099\b\u0014Ã\u0006fºû¡\u0006\bó\u0084Hlß\u000fðK\b©Öù5\u009c}y[".length();
      char var9 = 16;
      int var8 = -1;

      label37:
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
                  long var2 = 5388022686546600842L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var25 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var21 = true;
                  b = var25;
                  FIRE_WORK = new rs(var5[0], 0, (h5)pi.A);
                  BOOST = new rs(var5[1], 1, (h5)vg.a);
                  CONTROL = new rs(var5[2], 2, (h5)pg.O);
                  INFINITE = new rs(var5[5], 3, (h5)rp.Z);
                  PACKET = new rs(var5[3], 4, (h5)p3.m);
                  SILENT_FIRE_WORK = new rs(var5[4], 5, (h5)e3.F);
                  e = x(var16);
                  u = EnumEntriesKt.enumEntries((Enum[])e);
                  return;
               }

               var9 = var10.charAt(var8);
               break;
            default:
               var5[var11++] = var23;
               if ((var8 += var9) < var12) {
                  var9 = var10.charAt(var8);
                  continue label37;
               }

               var10 = "4RU[6Ó¾:µrG\u00ad6\u0005\u0080\ràe·3Lr}y\u0010¾\f=njä\nÉ\u009aNePã\u0003y\u0003";
               var12 = "4RU[6Ó¾:µrG\u00ad6\u0005\u0080\ràe·3Lr}y\u0010¾\f=njä\nÉ\u009aNePã\u0003y\u0003".length();
               var9 = 24;
               var8 = -1;
            }

            ++var8;
            var18 = var10.substring(var8, var8 + var9);
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
