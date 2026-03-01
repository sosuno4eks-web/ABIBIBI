package su.catlean;

import java.awt.Color;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class v4 {
   @NotNull
   private final class_243 O;
   @NotNull
   private final class_243 z;
   @NotNull
   private final Color a;
   @NotNull
   private final Color R;
   private final boolean Z;
   private static final long b = j0.a(6486390720279403181L, 572086267155791475L, MethodHandles.lookup().lookupClass()).a(105295636332530L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long f;

   public v4(@NotNull class_243 start, @NotNull class_243 end, @NotNull Color startColor, @NotNull Color endColor, long a, boolean ignoreFrustrum) {
      var5 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(19602, 6584542243336257330L ^ var5));
      Intrinsics.checkNotNullParameter(var2, true.v<invokedynamic>(30312, 3575107398627509706L ^ var5));
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(6096, 4150779512614265969L ^ var5));
      Intrinsics.checkNotNullParameter(var4, true.v<invokedynamic>(28013, 3225892160435412686L ^ var5));
      super();
      this.O = var1;
      this.z = var2;
      this.a = var3;
      this.R = var4;
      this.Z = var7;
   }

   // $FF: synthetic method
   public v4(class_243 var1, char var2, class_243 var3, Color var4, long var5, Color var7, boolean var8, int var9, DefaultConstructorMarker var10) {
      long var11 = ((long)var2 << 48 | var5 << 16 >>> 16) ^ b;
      long var13 = var11 ^ 119609314664175L;
      if ((var9 & (int)f) != 0) {
         var8 = false;
      }

      this(var1, var3, var4, var7, var13, var8);
   }

   @NotNull
   public final class_243 j() {
      return this.O;
   }

   @NotNull
   public final class_243 D() {
      return this.z;
   }

   @NotNull
   public final Color T() {
      return this.a;
   }

   @NotNull
   public final Color E() {
      return this.R;
   }

   public final boolean k() {
      return this.Z;
   }

   static {
      long var5 = b ^ 94218011081779L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = "°IXÔâ\u0018#¨Xú¤\u0011Ôc®Ò \u009c{½](\u008f\u0082Ã¸þ\u0017/u\u001cÔ\u009at\u001akÍaYá÷ú1\u0096Öè\u001dT\u0007";
      int var13 = "°IXÔâ\u0018#¨Xú¤\u0011Ôc®Ò \u009c{½](\u008f\u0082Ã¸þ\u0017/u\u001cÔ\u009at\u001akÍaYá÷ú1\u0096Öè\u001dT\u0007".length();
      char var10 = 16;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  c = var14;
                  d = new String[4];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -8827292019377997308L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  f = var23;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = ">AË\"5\u009em\"¦ÉÕR:\u009fuv\u0018m\u0005ª\fê\u0012Ù\u0013\u0091®Óë2¦eh¦>QëÐ\u0086X\\";
               var13 = ">AË\"5\u009em\"¦ÉÕR:\u009fuv\u0018m\u0005ª\fê\u0012Ù\u0013\u0091®Óë2¦eh¦>QëÐ\u0086X\\".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28342;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/v4", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/v4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
