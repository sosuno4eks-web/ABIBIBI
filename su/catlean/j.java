package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;

enum j {
   @NotNull
   private final class_2960 s;
   @NotNull
   private final class_2960 m;
   public static final j CONTAINER;
   public static final j NORMAL;
   public static final j ABSORBING;
   private static final j[] L;
   private static final EnumEntries F;
   private static final long a = j0.a(2004556849356637553L, 1623717708319984697L, MethodHandles.lookup().lookupClass()).a(101143849888593L);

   private j(class_2960 var3, class_2960 var4) {
      this.s = var3;
      this.m = var4;
   }

   @NotNull
   public final class_2960 Z(boolean half, long a) {
      var2 ^= a;

      class_2960 var10000;
      try {
         if (var1) {
            var10000 = this.m;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, -9024812603402989482L, var2);
      }

      var10000 = this.s;
      return var10000;
   }

   @NotNull
   public static EnumEntries I() {
      return F;
   }

   private static final j[] M() {
      j[] var0 = new j[]{CONTAINER, NORMAL, ABSORBING};
      return var0;
   }

   static {
      long var9 = a ^ 92617725419434L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[11];
      int var6 = 0;
      String var5 = "?µ<T>\u001c\u0007úJzW\u009d\u007fn\u008d~tW\u0010-76 u\f\u008e\u001dÀ£k\u0080\u0001\u0010é]\u007fê¨¢ã\u0006\u009bË\u0012íX??\u0011\u0018é]\u007fê¨¢ã\u0006\t!\u0011\u000e\u001dÖ\u008cH£¢@jF&ÿ¼\u0018é]\u007fê¨¢ã\u0006\t!\u0011\u000e\u001dÖ\u008cH£¢@jF&ÿ¼ é]\u007fê¨¢ã\u0006Û\u008fAûðÏh\u0092ÄíD^ÿ\u0010\u0005c?c\u0002 Q}9E ?µ<T>\u001c\u0007úJzW\u009d\u007fn\u008d~tW\u0010-76 u\f\u008e\u001dÀ£k\u0080\u0001\u0010é]\u007fê¨¢ã\u0006\u001bp4¿³jÉW\u0010\u0014·º§ëB\n\u001b½Ç\u0000\u009c<Z&ý é]\u007fê¨¢ã\u0006Û\u008fAûðÏh\u0092Z8ø7\u0083ß£\u001fy]û¤É«t8";
      int var7 = "?µ<T>\u001c\u0007úJzW\u009d\u007fn\u008d~tW\u0010-76 u\f\u008e\u001dÀ£k\u0080\u0001\u0010é]\u007fê¨¢ã\u0006\u009bË\u0012íX??\u0011\u0018é]\u007fê¨¢ã\u0006\t!\u0011\u000e\u001dÖ\u008cH£¢@jF&ÿ¼\u0018é]\u007fê¨¢ã\u0006\t!\u0011\u000e\u001dÖ\u008cH£¢@jF&ÿ¼ é]\u007fê¨¢ã\u0006Û\u008fAûðÏh\u0092ÄíD^ÿ\u0010\u0005c?c\u0002 Q}9E ?µ<T>\u001c\u0007úJzW\u009d\u007fn\u008d~tW\u0010-76 u\f\u008e\u001dÀ£k\u0080\u0001\u0010é]\u007fê¨¢ã\u0006\u001bp4¿³jÉW\u0010\u0014·º§ëB\n\u001b½Ç\u0000\u009c<Z&ý é]\u007fê¨¢ã\u0006Û\u008fAûðÏh\u0092Z8ø7\u0083ß£\u001fy]û¤É«t8".length();
      char var4 = ' ';
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
                  var15 = var0[7];
                  class_2960 var10004 = class_2960.method_60656(var0[3]);
                  Intrinsics.checkNotNullExpressionValue(var10004, var0[5]);
                  class_2960 var10005 = class_2960.method_60656(var0[2]);
                  Intrinsics.checkNotNullExpressionValue(var10005, var0[0]);
                  CONTAINER = new j(var15, 0, var10004, var10005);
                  var15 = var0[9];
                  var10004 = class_2960.method_60656(var0[6]);
                  Intrinsics.checkNotNullExpressionValue(var10004, var0[0]);
                  var10005 = class_2960.method_60656(var0[1]);
                  Intrinsics.checkNotNullExpressionValue(var10005, var0[0]);
                  NORMAL = new j(var15, 1, var10004, var10005);
                  var15 = var0[10];
                  var10004 = class_2960.method_60656(var0[4]);
                  Intrinsics.checkNotNullExpressionValue(var10004, var0[0]);
                  var10005 = class_2960.method_60656(var0[8]);
                  Intrinsics.checkNotNullExpressionValue(var10005, var0[0]);
                  ABSORBING = new j(var15, 2, var10004, var10005);
                  L = M();
                  F = EnumEntriesKt.enumEntries((Enum[])L);
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

               var5 = "1\u008a\u009d\u0093\u009aw\u0011Ø\u0010%\u001f±£P\u0012¦Ý\u008fR-ýú{C\u0081";
               var7 = "1\u008a\u009d\u0093\u009aw\u0011Ø\u0010%\u001f±£P\u0012¦Ý\u008fR-ýú{C\u0081".length();
               var4 = '\b';
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
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
