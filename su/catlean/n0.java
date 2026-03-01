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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class n0 {
   @NotNull
   private final class_2338 S;
   private final float d;
   private static final long a = j0.a(7159831975796390681L, 2738721351465930234L, MethodHandles.lookup().lookupClass()).a(103026715257155L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);
   private static final long f;

   public n0(@NotNull class_2338 blockPos, long a, float damage) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(25625, 6085056945969079407L ^ var2));
      super();
      this.S = var1;
      this.d = var4;
   }

   @NotNull
   public final class_2338 h() {
      return this.S;
   }

   public final float E() {
      return this.d;
   }

   @NotNull
   public final class_2338 k() {
      return this.S;
   }

   public final float l() {
      return this.d;
   }

   @NotNull
   public final n0 h(@NotNull class_2338 blockPos, long a, short a, float damage) {
      long var6 = (var2 << 16 | (long)var4 << 48 >>> 48) ^ a;
      long var8 = var6 ^ 27387614248030L;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(1843, 6513466864616918607L ^ var6));
      return new n0(var1, var8, var5);
   }

   public static n0 J(n0 var0, class_2338 var1, float var2, int var3, Object var4, long var5) {
      var5 ^= a;
      long var10001 = var5 ^ 40533079711248L;
      long var7 = (var5 ^ 40533079711248L) >>> 16;
      int var9 = (int)(var10001 << 48 >>> 48);
      boolean var10 = -1300809654799867049L.A<invokedynamic>(-1300809654799867049L, var5);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var3 & 1;
               if (!var10) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var11) {
               throw var11.A<invokedynamic>(var11, -1362917573712697953L, var5);
            }

            var1 = var0.S;
         }

         var10000 = var3 & 2;
      }

      if (var10000 != 0) {
         var2 = var0.d;
      }

      return var0.h(var1, var7, (short)var9, var2);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 101970701551048L;
      class_2338 var10000 = this.S;
      float var10001 = this.d;
      String var10003 = true.f<invokedynamic>(11216, 29666195088790845L ^ var1);
      return var10003 + var10000 + true.f<invokedynamic>(18902, 4459008379568305977L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 137069947309300L;
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
      String var11 = "\u008e\u009d÷þ[Ú¼\u0017\u008b\u000bB§\u009fàz\u001aq¥ûu\u001a\u008d«N\u0002tÂ¢!i(\u0089\"ÄK\u0099íØm\u0089 ©÷»S±wE\u0088\u0017ÁngÊMSo\u0016ÚË\u0098êy¬~°ØC7-\u008b\b'";
      int var13 = "\u008e\u009d÷þ[Ú¼\u0017\u008b\u000bB§\u009fàz\u001aq¥ûu\u001a\u008d«N\u0002tÂ¢!i(\u0089\"ÄK\u0099íØm\u0089 ©÷»S±wE\u0088\u0017ÁngÊMSo\u0016ÚË\u0098êy¬~°ØC7-\u008b\b'".length();
      char var10 = '(';
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
                  c = new String[4];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -2080505345176759341L;
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

               var11 = "Ê\u007f\u000fï\u0002°âL\u0083áxv°\u0092Ì\u0003\u0080¤\u009e\u0088·f·ß¨³jÏUsÓ=\u0018ª¡Æ¿bí8Ü£¨ÔÉ\u0082?\u009as®âàk5\u0003fq";
               var13 = "Ê\u007f\u000fï\u0002°âL\u0083áxv°\u0092Ì\u0003\u0080¤\u009e\u0088·f·ß¨³jÏUsÓ=\u0018ª¡Æ¿bí8Ü£¨ÔÉ\u0082?\u009as®âàk5\u0003fq".length();
               var10 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20083;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/n0", var10);
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
         throw new RuntimeException("su/catlean/n0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
