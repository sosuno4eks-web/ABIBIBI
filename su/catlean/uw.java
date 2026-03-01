package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum uw {
   public static final uw NORMAL;
   public static final uw SILENT;
   public static final uw INVENTORY_SILENT;
   public static final uw INVENTORY_NORMAL;
   public static final uw SILENT_FULL;
   public static final uw NORMAL_FULL;
   // $FF: synthetic field
   private static final EnumEntries d;
   private static String[] s;
   private static final long a = j0.a(4865041432376081202L, 7741459307655073281L, MethodHandles.lookup().lookupClass()).a(5575359674320L);
   private static final long b;

   @NotNull
   public static EnumEntries f() {
      return d;
   }

   // $FF: synthetic method
   private static final uw[] n(long var0) {
      long var10000 = a ^ var0;
      uw[] var2 = new uw[(int)b];
      var2[0] = NORMAL;
      var2[1] = SILENT;
      var2[2] = INVENTORY_SILENT;
      var2[3] = INVENTORY_NORMAL;
      var2[4] = SILENT_FULL;
      var2[5] = NORMAL_FULL;
      return var2;
   }

   static {
      long var14 = a ^ 66698174627042L;
      long var16 = var14 ^ 130549304581583L;
      if (1791135735485666920L.A<invokedynamic>(1791135735485666920L, var14) != null) {
         (new String[5]).A<invokedynamic>(new String[5], 1837011018618332062L, var14);
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
      String var10 = "áùÄ¨®\u001aM\u0001\b\u000f\u001auöÉÁ\u000b\u0017\u0018æ\bL:ñ\u0002Ì¿5ãb\u001b\u0098Pÿ\u008c\u0006Ê¦?|$\u0081@\u0010sNÛ-GÖSû×Í\u009b3!\u008f\u009b¯";
      int var12 = "áùÄ¨®\u001aM\u0001\b\u000f\u001auöÉÁ\u000b\u0017\u0018æ\bL:ñ\u0002Ì¿5ãb\u001b\u0098Pÿ\u008c\u0006Ê¦?|$\u0081@\u0010sNÛ-GÖSû×Í\u009b3!\u008f\u009b¯".length();
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
                  long var2 = -7568060402267717224L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var25 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var21 = true;
                  b = var25;
                  NORMAL = new uw(var5[1], 0);
                  SILENT = new uw(var5[0], 1);
                  INVENTORY_SILENT = new uw(var5[5], 2);
                  INVENTORY_NORMAL = new uw(var5[2], 3);
                  SILENT_FULL = new uw(var5[4], 4);
                  NORMAL_FULL = new uw(var5[3], 5);
                  d = EnumEntriesKt.enumEntries((Enum[])C);
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

               var10 = "lU#}ì1Z<\\\u0083#\u0019cÊéÿ\u0018æ\bL:ñ\u0002Ì¿ðS\u0006\u008déuã ?ôñ³!\u0014G\f";
               var12 = "lU#}ì1Z<\\\u0083#\u0019cÊéÿ\u0018æ\bL:ñ\u0002Ì¿ðS\u0006\u008déuã ?ôñ³!\u0014G\f".length();
               var9 = 16;
               var8 = -1;
            }

            ++var8;
            var18 = var10.substring(var8, var8 + var9);
            var10001 = 0;
         }
      }
   }

   public static void m(String[] var0) {
      s = var0;
   }

   public static String[] L() {
      return s;
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
