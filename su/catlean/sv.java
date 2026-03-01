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
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class sv {
   @NotNull
   private final class_2338 Z;
   @NotNull
   private final class_2350 w;
   private static final long a = j0.a(7820463566611897270L, 738127835331458880L, MethodHandles.lookup().lookupClass()).a(153494540212643L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public sv(@NotNull class_2338 position, long a, @NotNull class_2350 facing, short a) {
      long var6 = (var2 << 16 | (long)var5 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(26831, 3052845770695385286L ^ var6));
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(26259, 8020071074658102940L ^ var6));
      super();
      this.Z = var1;
      this.w = var4;
   }

   @NotNull
   public final class_2338 i() {
      return this.Z;
   }

   @NotNull
   public final class_2350 O() {
      return this.w;
   }

   @NotNull
   public final class_2338 r() {
      return this.Z;
   }

   @NotNull
   public final class_2350 X() {
      return this.w;
   }

   @NotNull
   public final sv r(char a, long a, @NotNull class_2338 position, @NotNull class_2350 facing) {
      long var6 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
      long var10001 = var6 ^ 27276199526598L;
      long var8 = (var6 ^ 27276199526598L) >>> 16;
      int var10 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(5602, 9080417623481919819L ^ var6));
      Intrinsics.checkNotNullParameter(var5, true.i<invokedynamic>(31284, 2779267845768529564L ^ var6));
      return new sv(var4, var8, var5, (short)var10);
   }

   public static sv h(sv var0, class_2338 var1, class_2350 var2, long var3, int var5, Object var6) {
      var3 ^= a;
      long var10001 = var3 ^ 438854166352L;
      int var7 = (int)((var3 ^ 438854166352L) >>> 48);
      long var8 = var10001 << 16 >>> 16;
      int var10 = 5915984670691352893L.A<invokedynamic>(5915984670691352893L, var3);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var5 & 1;
               if (var10 != 0) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var11) {
               throw var11.A<invokedynamic>(var11, 5938786440524952045L, var3);
            }

            var1 = var0.Z;
         }

         var10000 = var5 & 2;
      }

      if (var10000 != 0) {
         var2 = var0.w;
      }

      return var0.r((char)var7, var8, var1, var2);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 60588704090921L;
      class_2338 var10000 = this.Z;
      class_2350 var10001 = this.w;
      String var10003 = true.i<invokedynamic>(1154, 2869199085315557157L ^ var1);
      return var10003 + var10000 + true.i<invokedynamic>(19355, 2040418187368515642L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 35951066023984L;
      int var3 = this.Z.hashCode();
      var3 = var3 * (int)e + this.w.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 66495247866208L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "\\:áÿÓIÞ\u0093¯ìbP\u0005Û\u0012\u001e \u001eÓì\u0014\u0090?$ þ\u008cs0BÍ\u0019\u008e`mp×\u0088t%\u0012â\u009dL«\u0012ÃîÛ\u0018%\u009e«IÝ¨4ý\u00106)\u0093y¥¹\"Ø\u0010\u0015húû\u008e»\u0018à\u0019\u0086Ø\u0016Û2Ô^RÏ!\u0016\u0092îêHÚ\u0083ÖÐh\u009a´";
      int var13 = "\\:áÿÓIÞ\u0093¯ìbP\u0005Û\u0012\u001e \u001eÓì\u0014\u0090?$ þ\u008cs0BÍ\u0019\u008e`mp×\u0088t%\u0012â\u009dL«\u0012ÃîÛ\u0018%\u009e«IÝ¨4ý\u00106)\u0093y¥¹\"Ø\u0010\u0015húû\u008e»\u0018à\u0019\u0086Ø\u0016Û2Ô^RÏ!\u0016\u0092îêHÚ\u0083ÖÐh\u009a´".length();
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
                  b = var14;
                  c = new String[6];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -8085420419360737L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
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

               var11 = "ºÂ¹\u008b\u000bã2UÃ\u008f*W\u00adþá.Ü=\u0099ö¼Ý\u0010Ú\u001a¡dºEc5\u009a\u001b+N÷\u00ad^r\u0089òXÊ\u0013<iÔg\u00107Ê\u008a\u009dß\"\u008d9nÓÒ\u0002·Î ²";
               var13 = "ºÂ¹\u008b\u000bã2UÃ\u008f*W\u00adþá.Ü=\u0099ö¼Ý\u0010Ú\u001a¡dºEc5\u009a\u001b+N÷\u00ad^r\u0089òXÊ\u0013<iÔg\u00107Ê\u008a\u009dß\"\u008d9nÓÒ\u0002·Î ²".length();
               var10 = '0';
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15598;
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
            throw new RuntimeException("su/catlean/sv", var10);
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
         throw new RuntimeException("su/catlean/sv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
