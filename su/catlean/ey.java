package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import org.jetbrains.annotations.NotNull;

public enum ey {
   @NotNull
   private final class_1792 L;
   @NotNull
   private final class_1792 j;
   @NotNull
   private final class_1792 K;
   public static final ey SPEED;
   public static final ey STRENGTH;
   public static final ey FIRE_RESISTANCE;
   public static final ey INVISIBILITY;
   // $FF: synthetic field
   private static final EnumEntries J;
   private static int Z;

   private ey(class_1792 var3, class_1792 var4, class_1792 var5) {
      this.L = var3;
      this.j = var4;
      this.K = var5;
   }

   @NotNull
   public final class_1792 I() {
      return this.L;
   }

   @NotNull
   public final class_1792 A() {
      return this.j;
   }

   @NotNull
   public final class_1792 t() {
      return this.K;
   }

   @NotNull
   public static EnumEntries K() {
      return J;
   }

   // $FF: synthetic method
   private static final ey[] d() {
      ey[] var0 = new ey[]{SPEED, STRENGTH, FIRE_RESISTANCE, INVISIBILITY};
      return var0;
   }

   static {
      long var9 = j0.a(6304504975579483250L, 6893174840701925317L, MethodHandles.lookup().lookupClass()).a(70704142464756L) ^ 135169435596548L;
      if (3449541433061351998L.A<invokedynamic>(3449541433061351998L, var9) == 0) {
         33.A<invokedynamic>(33, 3447987334211768646L, var9);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[15];
      int var6 = 0;
      String var5 = "|\u009e\tZ\u0093ô]oá´;\u0085ûpÝY\b\u0019Õ\u0097´Ý&\u0004\u000e\u0010\u008bÄ¡\u001b9qºdZ\u0092÷\u0003\u0010C^<\u0010È\f\nå^~Fh\u001bçÊMè\u0096ÂÁ\u0010\u0095ü7\u0004\u0011o\u0001Þ! \u0085D\u0098ëßÆ\u0010\u001b\u009aµñòÛ/«\u008b\u0092]5é\u0015HV\u0010=R½q\u007f\u001eóÞìâÞómEÿP\b\u0019Õ\u0097´Ý&\u0004\u000e\u0010È\f\nå^~Fh\u001bçÊMè\u0096ÂÁ\u0010Î}årÊ(?ìH\u0085ÀÍ\u0095\u0018öÏ\u0010è\u000e×Q\bÃux=\u001a®=P}z\u0084\bµÌ×\u0003\u0080þÔ@\u0010\u0095ü7\u0004\u0011o\u0001Þ! \u0085D\u0098ëßÆ";
      int var7 = "|\u009e\tZ\u0093ô]oá´;\u0085ûpÝY\b\u0019Õ\u0097´Ý&\u0004\u000e\u0010\u008bÄ¡\u001b9qºdZ\u0092÷\u0003\u0010C^<\u0010È\f\nå^~Fh\u001bçÊMè\u0096ÂÁ\u0010\u0095ü7\u0004\u0011o\u0001Þ! \u0085D\u0098ëßÆ\u0010\u001b\u009aµñòÛ/«\u008b\u0092]5é\u0015HV\u0010=R½q\u007f\u001eóÞìâÞómEÿP\b\u0019Õ\u0097´Ý&\u0004\u000e\u0010È\f\nå^~Fh\u001bçÊMè\u0096ÂÁ\u0010Î}årÊ(?ìH\u0085ÀÍ\u0095\u0018öÏ\u0010è\u000e×Q\bÃux=\u001a®=P}z\u0084\bµÌ×\u0003\u0080þÔ@\u0010\u0095ü7\u0004\u0011o\u0001Þ! \u0085D\u0098ëßÆ".length();
      char var4 = 16;
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
                  var15 = var0[11];
                  class_1792 var10004 = class_1802.field_8479;
                  Intrinsics.checkNotNullExpressionValue(var10004, var0[14]);
                  class_1792 var10005 = class_1802.field_8162;
                  Intrinsics.checkNotNullExpressionValue(var10005, var0[1]);
                  class_1792 var10006 = class_1802.field_8601;
                  Intrinsics.checkNotNullExpressionValue(var10006, var0[4]);
                  SPEED = new ey(var15, 0, var10004, var10005, var10006);
                  var15 = var0[6];
                  var10004 = class_1802.field_8183;
                  Intrinsics.checkNotNullExpressionValue(var10004, var0[10]);
                  var10005 = class_1802.field_8162;
                  Intrinsics.checkNotNullExpressionValue(var10005, var0[7]);
                  var10006 = class_1802.field_8601;
                  Intrinsics.checkNotNullExpressionValue(var10006, var0[12]);
                  STRENGTH = new ey(var15, 1, var10004, var10005, var10006);
                  var15 = var0[2];
                  var10004 = class_1802.field_8135;
                  Intrinsics.checkNotNullExpressionValue(var10004, var0[0]);
                  var10005 = class_1802.field_8162;
                  Intrinsics.checkNotNullExpressionValue(var10005, var0[7]);
                  var10006 = class_1802.field_8725;
                  Intrinsics.checkNotNullExpressionValue(var10006, var0[3]);
                  FIRE_RESISTANCE = new ey(var15, 2, var10004, var10005, var10006);
                  var15 = var0[9];
                  var10004 = class_1802.field_8071;
                  Intrinsics.checkNotNullExpressionValue(var10004, var0[5]);
                  var10005 = class_1802.field_8711;
                  Intrinsics.checkNotNullExpressionValue(var10005, var0[13]);
                  var10006 = class_1802.field_8725;
                  Intrinsics.checkNotNullExpressionValue(var10006, var0[8]);
                  INVISIBILITY = new ey(var15, 3, var10004, var10005, var10006);
                  J = EnumEntriesKt.enumEntries((Enum[])i);
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

               var5 = "6+{\u0080¶?\u009fdà\u009dnDð²\u000fLd`&àI\u009bã(\bArÒ¼\u008fZ\u0090w";
               var7 = "6+{\u0080¶?\u009fdà\u009dnDð²\u000fLd`&àI\u009bã(\bArÒ¼\u008fZ\u0090w".length();
               var4 = 24;
               var3 = -1;
            }

            ++var3;
            var11 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
   }

   public static void z(int var0) {
      Z = var0;
   }

   public static int b() {
      return Z;
   }

   public static int L() {
      int var0 = b();

      try {
         return var0 == 0 ? 117 : 0;
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
