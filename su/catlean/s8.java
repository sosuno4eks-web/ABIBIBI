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
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class s8 {
   @NotNull
   private static final Logger W;
   private static int[] K;
   private static final long a = j0.a(7981372930679384280L, 5590247911577710940L, MethodHandles.lookup().lookupClass()).a(44336797310472L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   @NotNull
   public static final class_310 H(short var0, short var1, int var2) {
      long var3 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32) ^ a;
      class_310 var10000 = class_310.method_1551();
      Intrinsics.checkNotNullExpressionValue(var10000, true.y<invokedynamic>(9148, 3467127494791315626L ^ var3));
      return var10000;
   }

   @NotNull
   public static final class_746 f(long var0) {
      var0 ^= a;
      long var10001 = var0 ^ 30380897800899L;
      int var2 = (int)((var0 ^ 30380897800899L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 48);
      int var4 = (int)(var10001 << 32 >>> 32);
      class_746 var10000 = H((short)var2, (short)var3, var4).field_1724;
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   @NotNull
   public static final class_638 i(char var0, int var1, short var2) {
      long var3 = ((long)var0 << 48 | (long)var1 << 32 >>> 16 | (long)var2 << 48 >>> 48) ^ a;
      long var10001 = var3 ^ 136040003819382L;
      int var5 = (int)((var3 ^ 136040003819382L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      class_638 var10000 = H((short)var5, (short)var6, var7).field_1687;
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   @NotNull
   public static final class_636 r(long var0) {
      var0 ^= a;
      long var10001 = var0 ^ 128735172329315L;
      int var2 = (int)((var0 ^ 128735172329315L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 48);
      int var4 = (int)(var10001 << 32 >>> 32);
      class_636 var10000 = H((short)var2, (short)var3, var4).field_1761;
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   @NotNull
   public static final class_634 Y(long var0) {
      var0 ^= a;
      long var10001 = var0 ^ 135945003245364L;
      int var2 = (int)((var0 ^ 135945003245364L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 48);
      int var4 = (int)(var10001 << 32 >>> 32);
      class_634 var10000 = H((short)var2, (short)var3, var4).method_1562();
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   public static final long Z() {
      return System.currentTimeMillis();
   }

   @NotNull
   public static final Logger T() {
      return W;
   }

   static {
      long var9 = a ^ 134878907526761L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, -8322178505624848304L, var9);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = " <tò\u0089ô¿\u00891\u0015\u009cN¿è'\u0084 \u0087%\u008eÁ¢i\u0016AylÅ\u009bÝMyÓ6S\\Ï \u009düû\u0083\u0082º\"ÌÇnF(Q\u00adÀÙV¬\u0017@ÛÍÔ¨¬ý¯\u008cuï»æ\nï¦~\u0007Äü\u009cÆ±»\u001bË\u0081ç§\u0083¦þí";
      int var6 = " <tò\u0089ô¿\u00891\u0015\u009cN¿è'\u0084 \u0087%\u008eÁ¢i\u0016AylÅ\u009bÝMyÓ6S\\Ï \u009düû\u0083\u0082º\"ÌÇnF(Q\u00adÀÙV¬\u0017@ÛÍÔ¨¬ý¯\u008cuï»æ\nï¦~\u0007Äü\u009cÆ±»\u001bË\u0081ç§\u0083¦þí".length();
      char var3 = 16;
      int var2 = -1;

      while(true) {
         ++var2;
         byte[] var8 = var0.doFinal(var4.substring(var2, var2 + var3).getBytes("ISO-8859-1"));
         String var13 = a(var8).intern();
         boolean var10001 = true;
         var7[var5++] = var13;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[3];
            Logger var11 = LoggerFactory.getLogger(true.y<invokedynamic>(8751, 7276122459780996491L ^ var9));
            Intrinsics.checkNotNullExpressionValue(var11, true.y<invokedynamic>(14762, 5194823359069734415L ^ var9));
            W = var11;
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   public static void Y(int[] var0) {
      K = var0;
   }

   public static int[] Q() {
      return K;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29661;
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
            throw new RuntimeException("su/catlean/s8", var10);
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
         throw new RuntimeException("su/catlean/s8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
