package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

enum ac {
   @NotNull
   private final Function0 V;
   @NotNull
   private final Function0 H;
   public static final ac FIREWORK;
   public static final ac FRIEND;
   public static final ac PEARL;
   public static final ac XP;
   public static final ac NONE;
   private static final ac[] R;
   private static final EnumEntries A;
   private static final long a = j0.a(4793449195636295975L, 7978763939779904397L, MethodHandles.lookup().lookupClass()).a(222132600987464L);

   private ac(Function0 var3, Function0 var4) {
      this.V = var3;
      this.H = var4;
   }

   ac(String var3, byte var4, int var5, Function0 var6, Function0 var7, int var8, DefaultConstructorMarker var9) {
      long var10 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var4 << 56 >>> 56) ^ a;
      if ((var8 & 2) != 0) {
         var7 = ac::z;
      }

      this(var6, var7);
   }

   @NotNull
   public final Function0 M() {
      return this.V;
   }

   @NotNull
   public final Function0 o() {
      return this.H;
   }

   @NotNull
   public static EnumEntries H() {
      return A;
   }

   private static final Unit z() {
      return Unit.INSTANCE;
   }

   private static final Unit g() {
      long var0 = a ^ 114615806800786L;
      long var10001 = var0 ^ 109681233079132L;
      int var2 = (int)((var0 ^ 109681233079132L) >>> 32);
      int var3 = (int)(var10001 << 32 >>> 48);
      int var4 = (int)(var10001 << 48 >>> 48);
      tm.s(var2, tm.g, var3, var4);
      return Unit.INSTANCE;
   }

   private static final Unit y() {
      long var0 = a ^ 22732429820802L;
      long var2 = var0 ^ 74132316829725L;
      tm.e(tm.g, var2);
      return Unit.INSTANCE;
   }

   private static final Unit h() {
      // $FF: Couldn't be decompiled
   }

   private static final Unit W() {
      // $FF: Couldn't be decompiled
   }

   private static final Unit n() {
      long var0 = a ^ 79837798061364L;
      long var2 = var0 ^ 693867137786L;
      tm.Y(var2, tm.g);
      return Unit.INSTANCE;
   }

   private static final Unit E() {
      return Unit.INSTANCE;
   }

   private static final ac[] c() {
      ac[] var0 = new ac[]{FIREWORK, FRIEND, PEARL, XP, NONE};
      return var0;
   }

   static {
      long var9 = a ^ 110111970866358L;
      long var10001 = var9 ^ 31916899997290L;
      int var11 = (int)((var9 ^ 31916899997290L) >>> 32);
      int var12 = (int)(var10001 << 32 >>> 40);
      int var13 = (int)(var10001 << 56 >>> 56);
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[5];
      int var6 = 0;
      String var5 = "Pôq\u0002\u0087:9\u0095\bñ\u0089U\u0086x|Ï\u000f\b»rù\u0019\u007f¦\u001dO";
      int var7 = "Pôq\u0002\u0087:9\u0095\bñ\u0089U\u0086x|Ï\u000f\b»rù\u0019\u007f¦\u001dO".length();
      char var4 = '\b';
      int var3 = -1;

      label28:
      while(true) {
         ++var3;
         String var14 = var5.substring(var3, var3 + var4);
         byte var16 = -1;

         while(true) {
            byte[] var8 = var1.doFinal(var14.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch(var16) {
            case 0:
               var0[var6++] = var19;
               if ((var3 += var4) >= var7) {
                  FIREWORK = new ac(var11, var12, var0[3], (byte)var13, 0, ac::g, (Function0)null, 2, (DefaultConstructorMarker)null);
                  FRIEND = new ac(var11, var12, var0[1], (byte)var13, 1, ac::y, (Function0)null, 2, (DefaultConstructorMarker)null);
                  PEARL = new ac(var0[0], 2, ac::h, ac::W);
                  XP = new ac(var11, var12, var0[4], (byte)var13, 3, ac::n, (Function0)null, 2, (DefaultConstructorMarker)null);
                  NONE = new ac(var11, var12, var0[2], (byte)var13, 4, ac::E, (Function0)null, 2, (DefaultConstructorMarker)null);
                  R = c();
                  A = EnumEntriesKt.enumEntries((Enum[])R);
                  return;
               }

               var4 = var5.charAt(var3);
               break;
            default:
               var0[var6++] = var19;
               if ((var3 += var4) < var7) {
                  var4 = var5.charAt(var3);
                  continue label28;
               }

               var5 = "f¡IYÅ\u0088\u0015V¨Ù\u0089\u0007æ¾6°\bMåÕ\u0000\u001d_º\u009d";
               var7 = "f¡IYÅ\u0088\u0015V¨Ù\u0089\u0007æ¾6°\bMåÕ\u0000\u001d_º\u009d".length();
               var4 = 16;
               var3 = -1;
            }

            ++var3;
            var14 = var5.substring(var3, var3 + var4);
            var16 = 0;
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
