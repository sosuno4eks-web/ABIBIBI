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
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class d9 {
   @NotNull
   private final class_243 S;
   private final float a;
   private final float T;
   @NotNull
   private final iv G;
   private static k9[] N;
   private static final long b = j0.a(3225021187756381284L, 6498970005098131683L, MethodHandles.lookup().lookupClass()).a(198691869054527L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   public d9(@NotNull class_243 vec, float yaw, float pitch, @NotNull iv life, long a) {
      var5 ^= b;
      k9[] var10000 = 7215570173640100572L.A<invokedynamic>(7215570173640100572L, var5);
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(11549, 8572143944966066591L ^ var5));
      Intrinsics.checkNotNullParameter(var4, true.v<invokedynamic>(28405, 7185960645304816246L ^ var5));
      super();
      this.S = var1;
      this.a = var2;
      this.T = var3;
      k9[] var7 = var10000;

      try {
         this.G = var4;
         if (var7 == null) {
            (new int[4]).A<invokedynamic>(new int[4], 7230469233163347948L, var5);
         }

      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, 7317873513202551388L, var5);
      }
   }

   @NotNull
   public final class_243 h() {
      return this.S;
   }

   public final float V() {
      return this.a;
   }

   public final float E() {
      return this.T;
   }

   @NotNull
   public final iv U() {
      return this.G;
   }

   public static void q(k9[] var0) {
      N = var0;
   }

   public static k9[] C() {
      return N;
   }

   static {
      long var9 = b ^ 139039199837120L;
      k9[] var10000 = new k9[2];
      e = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 8416077453619438845L, var9);
      Cipher var0;
      Cipher var11 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var11.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "\u009fç\u000fe¢Þi).*\u0018p÷×6\u001e\u0010\u001eLY\u0089&\u0010Q\u009dº\u009aîªtÏjå";
      int var6 = "\u009fç\u000fe¢Þi).*\u0018p÷×6\u001e\u0010\u001eLY\u0089&\u0010Q\u009dº\u009aîªtÏjå".length();
      char var3 = 16;
      int var2 = -1;

      while(true) {
         ++var2;
         byte[] var8 = var0.doFinal(var4.substring(var2, var2 + var3).getBytes("ISO-8859-1"));
         String var13 = a(var8).intern();
         boolean var10001 = true;
         var7[var5++] = var13;
         if ((var2 += var3) >= var6) {
            c = var7;
            d = new String[2];
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6648;
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
            throw new RuntimeException("su/catlean/d9", var10);
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
         throw new RuntimeException("su/catlean/d9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
