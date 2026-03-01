package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import net.minecraft.class_1041;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hi {
   @NotNull
   public static final hi Y;
   @NotNull
   private static final ArrayDeque p;
   private static final long a = j0.a(7812038631318028034L, 2436341118347976855L, MethodHandles.lookup().lookupClass()).a(109392190526830L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private hi() {
   }

   public final void V(@NotNull kn scissor, long a) {
      var2 ^= a;
      long var10001 = var2 ^ 47496684424779L;
      int var4 = (int)((var2 ^ 47496684424779L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var1, true.q<invokedynamic>(1718, 3263587401860097475L ^ var2));
      class_1041 var10000 = s8.H((short)var4, (short)var5, var6).method_22683();
      Intrinsics.checkNotNullExpressionValue(var10000, true.q<invokedynamic>(6697, 6021383831786436957L ^ var2));
      class_1041 var7 = var10000;
      int var8 = var7.method_4495();
      int var9 = var7.method_4506();
      float var10 = (float)MathKt.roundToInt(var1.J() * (float)var8) - 1.0F;
      float var11 = (float)MathKt.roundToInt((float)var9 - var1.o() * (float)var8) - 1.0F;
      float var12 = (float)MathKt.roundToInt((var1.x() - var1.J()) * (float)var8) + 1.0F;
      float var13 = (float)MathKt.roundToInt((var1.o() - var1.V()) * (float)var8) + 1.0F;
      p.addLast(new kn(var10, var11, var12, var13));
   }

   @NotNull
   public final kn N(long var1) {
      var1 ^= a;
      Object var10000 = p.removeLast();
      Intrinsics.checkNotNullExpressionValue(var10000, true.q<invokedynamic>(10391, 4062024641383110865L ^ var1));
      return (kn)var10000;
   }

   @Nullable
   public final kn s() {
      return (kn)p.peekLast();
   }

   static {
      long var0 = a ^ 75743651838570L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "tµiéÂ»8 Ó(t¡\u008d\u0081æë\u0018D¹Ql\u0082 ,§\u001b¢Í¼\u0019[I£æ-¡ÛáÛÈ\t Ï5y!úbK\u0083$²Ø«©\u0082=ì\bQºp!êQ\u000fÊ¥á\u0094ª§|y";
      int var8 = "tµiéÂ»8 Ó(t¡\u008d\u0081æë\u0018D¹Ql\u0082 ,§\u001b¢Í¼\u0019[I£æ-¡ÛáÛÈ\t Ï5y!úbK\u0083$²Ø«©\u0082=ì\bQºp!êQ\u000fÊ¥á\u0094ª§|y".length();
      char var5 = 16;
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var12 = a(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var12;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            Y = new hi();
            p = new ArrayDeque();
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8167;
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
            throw new RuntimeException("su/catlean/hi", var10);
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
         throw new RuntimeException("su/catlean/hi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
