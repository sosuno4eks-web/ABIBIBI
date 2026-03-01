package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1113;
import net.minecraft.class_1144;
import net.minecraft.class_2378;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_5819;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class g6 {
   @NotNull
   private final String J;
   private final float U;
   @NotNull
   private final class_3414 z;
   private static int[] H;
   private static final long a = j0.a(1900013488683415826L, 4195209014737179696L, MethodHandles.lookup().lookupClass()).a(5518647073885L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long e;

   public g6(@NotNull String name, long a, float volume) {
      var2 ^= a;
      long var5 = var2 ^ 27115812669167L;
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(28224, 574925925594245137L ^ var2));
      super();
      this.J = var1;
      this.U = var4;
      String var10000 = this.J;
      String var10002 = true.h<invokedynamic>(11833, 8195851544936245353L ^ var2);
      class_2960 var7 = hp.O(var5, var10002 + var10000);
      class_3414 var10001 = class_3414.method_47908(var7);
      Intrinsics.checkNotNullExpressionValue(var10001, true.h<invokedynamic>(16293, 4125048434441648627L ^ var2));
      this.z = var10001;
      class_2378.method_10230(class_7923.field_41172, var7, this.z);
   }

   @NotNull
   public final String u() {
      return this.J;
   }

   public final float v() {
      return this.U;
   }

   public final void S(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 80066099722554L;
      int var3 = (int)((var1 ^ 80066099722554L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      s8.H((short)var3, (short)var4, var5).method_40000(g6::W);
   }

   public final void G(@NotNull class_243 vec, long a) {
      var2 ^= a;
      long var4 = var2 ^ 65552110240370L;
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(3404, 1998441916719781237L ^ var2));
      this.A(var1.field_1352, var1.field_1351, var4, var1.field_1350);
   }

   public final void A(double x, double y, long a, double z) {
      var5 ^= a;
      long var10001 = var5 ^ 21695205110435L;
      int var9 = (int)((var5 ^ 21695205110435L) >>> 48);
      int var10 = (int)(var10001 << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      s8.H((short)var9, (short)var10, var11).method_40000(g6::U);
   }

   @NotNull
   public final String z() {
      return this.J;
   }

   public final float h() {
      return this.U;
   }

   @NotNull
   public final g6 L(@NotNull String name, float volume, long a) {
      var3 ^= a;
      long var5 = var3 ^ 62907830765109L;
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(26964, 796128621672695472L ^ var3));
      return new g6(var1, var5, var2);
   }

   public static g6 l(g6 var0, byte var1, int var2, String var3, float var4, int var5, int var6, Object var7) {
      long var8 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var6 << 40 >>> 40) ^ a;
      long var10 = var8 ^ 40024550209612L;
      int[] var12 = 908885598304235453L.A<invokedynamic>(908885598304235453L, var8);

      int var10000;
      label39: {
         label38: {
            try {
               var10000 = var5 & 1;
               if (var12 == null) {
                  break label39;
               }

               if (var10000 == 0) {
                  break label38;
               }
            } catch (NumberFormatException var14) {
               throw var14.A<invokedynamic>(var14, 930669148393227316L, var8);
            }

            var3 = var0.J;
         }

         var10000 = var5 & 2;
      }

      if (var10000 != 0) {
         var4 = var0.U;
      }

      try {
         g6 var15 = var0.L(var3, var4, var10);
         int[] var10001 = 886625404405549351L.A<invokedynamic>(886625404405549351L, var8);
         if (var2 >= 0) {
            if (var10001 != null) {
               return var15;
            }

            var10001 = new int[1];
         }

         var10001.A<invokedynamic>(var10001, 869289622637575601L, var8);
         return var15;
      } catch (NumberFormatException var13) {
         throw var13.A<invokedynamic>(var13, 930669148393227316L, var8);
      }
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 32435515708663L;
      String var10000 = this.J;
      float var10001 = this.U;
      String var10003 = true.h<invokedynamic>(26996, 9090938500916717495L ^ var1);
      return var10003 + var10000 + true.h<invokedynamic>(31238, 7135714932307866820L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 79003817251904L;
      int var4 = this.J.hashCode();
      int[] var10000 = -4989366208893298206L.A<invokedynamic>(-4989366208893298206L, var1);
      var4 = var4 * (int)e + Float.hashCode(this.U);
      int[] var3 = var10000;

      try {
         if (var3 == null) {
            (new int[3]).A<invokedynamic>(new int[3], -4978261990954927790L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -4992994640130772373L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   private static final void W(g6 var0) {
      long var1 = a ^ 88000982007881L;
      long var10001 = var1 ^ 113196948167957L;
      int var3 = (int)((var1 ^ 113196948167957L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      class_1144 var10000 = s8.H((short)var3, (short)var4, var5).method_1483();
      class_3414 var6 = var0.z;
      class_3419 var7 = class_3419.field_15246;
      class_5819 var8 = class_1113.method_43221();
      var10000.method_4873((class_1113)(new rd(var6, var7, var8)));
   }

   private static final void U(double var0, double var2, double var4, g6 var6) {
      long var7 = a ^ 80814840871046L;
      long var10001 = var7 ^ 68116423807164L;
      int var9 = (int)((var7 ^ 68116423807164L) >>> 48);
      int var10 = (int)(var10001 << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      s8.i((char)var9, var10, (short)var11).method_8486(var0, var2, var4, var6.z, class_3419.field_15248, var6.U, 1.0F, true);
   }

   public static void z(int[] var0) {
      H = var0;
   }

   public static int[] C() {
      return H;
   }

   static {
      long var14 = a ^ 86412641263787L;
      int[] var10000 = new int[4];
      d = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 5682362998792505040L, var14);
      Cipher var5;
      Cipher var16 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var16.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[7];
      int var10 = 0;
      String var9 = "\u0085ì\u008e¦\u008a\u0095hÇïS#=¶\u0015»Í;*û¾\u009b±bÇ]Ï[\u0083;Õ«Ð \u0010ùÝg\u009b±\r:¿j4\u0003CmmÇò\u0096\u000bB×|\u009dª,ë\u0091Â|\u0003¬_ ¾`-\u008e0z\"\u0084Ç\u0011\u0010<ªûé\u0082\u001d\u000e\u0006¨½Øò\u0086o|ñ%fH©\u0007\u0010\u0086\u0095%»\u001c\u0096Æ79ÄßÖgåAm8ÇÁkè\u0085kl\u008dåYe\u001fö]¿\u009dT\bQð'Á\u0015¸².\u0089îCPø\u000f\u0082GwWê§ú\u009a\u0090\u0081âÆÙ{Ry\u00103,²üs\u0013æ";
      int var11 = "\u0085ì\u008e¦\u008a\u0095hÇïS#=¶\u0015»Í;*û¾\u009b±bÇ]Ï[\u0083;Õ«Ð \u0010ùÝg\u009b±\r:¿j4\u0003CmmÇò\u0096\u000bB×|\u009dª,ë\u0091Â|\u0003¬_ ¾`-\u008e0z\"\u0084Ç\u0011\u0010<ªûé\u0082\u001d\u000e\u0006¨½Øò\u0086o|ñ%fH©\u0007\u0010\u0086\u0095%»\u001c\u0096Æ79ÄßÖgåAm8ÇÁkè\u0085kl\u008dåYe\u001fö]¿\u009dT\bQð'Á\u0015¸².\u0089îCPø\u000f\u0082GwWê§ú\u009a\u0090\u0081âÆÙ{Ry\u00103,²üs\u0013æ".length();
      char var8 = ' ';
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var17 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var17.getBytes("ISO-8859-1"));
            String var22 = a(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var22;
               if ((var7 += var8) >= var11) {
                  b = var12;
                  c = new String[7];
                  Cipher var0;
                  var16 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var16.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 3643739952938527221L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var24 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var20 = true;
                  e = var24;
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var22;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "rÃ\u0017;(ÝÉx\u008aÎ\u0001Ê¤eÿ}\u0010Ð8Êwü\u0085rÏ\u00866\u0005T\u0006gý\u0002";
               var11 = "rÃ\u0017;(ÝÉx\u008aÎ\u0001Ê¤eÿ}\u0010Ð8Êwü\u0085rÏ\u00866\u0005T\u0006gý\u0002".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var17 = var9.substring(var7, var7 + var8);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13745;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/g6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/g6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
