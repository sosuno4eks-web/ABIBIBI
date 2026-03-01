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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class cw extends c6 {
   @NotNull
   public static final cw B;
   private static final long a = j0.a(1026881225270153558L, 7350671289281207522L, MethodHandles.lookup().lookupClass()).a(49591951358482L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long e;

   private cw(int var1, int var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 49311697371467L;
      super(var6);
   }

   @NotNull
   public qq J(@NotNull class_1297 target, @NotNull qq currentRotation, long a, boolean attackTick) {
      long var6 = var3 ^ 95428472334638L;
      long var8 = var3 ^ 45987329486815L;
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(15531, 471196686457413600L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.t<invokedynamic>(22573, 4106857206244014948L ^ var3));
      return new qq(s8.f(var6).method_36454(), s8.f(var6).method_36455(), var8, false, (bc)null, (int)e, (DefaultConstructorMarker)null);
   }

   @NotNull
   public class_243 V(long a, @NotNull class_1297 target) {
      Intrinsics.checkNotNullParameter(var3, true.t<invokedynamic>(6823, 2816615647426747960L ^ var1));
      class_243 var10000 = var3.method_33571();
      Intrinsics.checkNotNullExpressionValue(var10000, true.t<invokedynamic>(30525, 7635752947937932192L ^ var1));
      return var10000;
   }

   public boolean r() {
      return false;
   }

   public boolean w() {
      return false;
   }

   static {
      long var14 = a ^ 116856772947004L;
      long var10001 = var14 ^ 72438349699689L;
      int var16 = (int)((var14 ^ 72438349699689L) >>> 32);
      int var17 = (int)(var10001 << 32 >>> 48);
      int var18 = (int)(var10001 << 48 >>> 48);
      d = new HashMap(13);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[4];
      int var10 = 0;
      String var9 = "©ÆçY¢\bç\u0086¬\\á\u008b£\u0010¤<Zïx\u008aUÀy×À_Kò%ö\u0016\u0013#]A\"ÉÉ\u0014à\u0010]\u0017\u0019\u001fv\u001e\u0086\u009dk¿\u007f\u0091G\t»\u0092";
      int var11 = "©ÆçY¢\bç\u0086¬\\á\u008b£\u0010¤<Zïx\u008aUÀy×À_Kò%ö\u0016\u0013#]A\"ÉÉ\u0014à\u0010]\u0017\u0019\u001fv\u001e\u0086\u009dk¿\u007f\u0091G\t»\u0092".length();
      char var8 = '(';
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var19 = var9.substring(var7, var7 + var8);
         byte var21 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var19.getBytes("ISO-8859-1"));
            String var25 = b(var13).intern();
            switch(var21) {
            case 0:
               var12[var10++] = var25;
               if ((var7 += var8) >= var11) {
                  b = var12;
                  c = new String[4];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -5163655321860327797L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var27 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var24 = true;
                  e = var27;
                  B = new cw(var16, var17, (char)var18);
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var25;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "NRÍ;¤-v\bj\u0099£rW§\u001d< P\u008bñ\u0019_ªÙ+ß\u0011|ñiRÒ\u009cKîÍ¶\u000b\u0007\fKÁ\n\u000f\u009b[ÇÈ\u0082";
               var11 = "NRÍ;¤-v\bj\u0099£rW§\u001d< P\u008bñ\u0019_ªÙ+ß\u0011|ñiRÒ\u009cKîÍ¶\u000b\u0007\fKÁ\n\u000f\u009b[ÇÈ\u0082".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var19 = var9.substring(var7, var7 + var8);
            var21 = 0;
         }
      }
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18542;
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
            throw new RuntimeException("su/catlean/cw", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/cw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
