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
import net.minecraft.class_1657;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class ns extends nm {
   @NotNull
   public static final ns t;
   private static final long c = j0.a(-3634293957448502321L, 957292341484704515L, MethodHandles.lookup().lookupClass()).a(48802712538245L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;

   private ns(long var1, byte var3) {
      long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ c;
      long var6 = var4 ^ 56940764810313L;
      super(true.a<invokedynamic>(8898, 2197751690559449853L ^ var4), var6);
   }

   public void k(@NotNull class_332 context, long a) {
      long var4 = var2 ^ 58527580722751L;
      long var6 = var2 ^ 117498091504248L;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(19524, 2063343216919827370L ^ var2));
      this.G(var1, var4, vi.h(vi.o, (class_1657)null, 1, var6, (Object)null) + true.a<invokedynamic>(3779, 7080782458462671148L ^ var2));
   }

   static {
      long var9 = c ^ 50316464657571L;
      long var10001 = var9 ^ 32938870645958L;
      long var11 = (var9 ^ 32938870645958L) >>> 8;
      int var13 = (int)(var10001 << 56 >>> 56);
      i = new HashMap(13);
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
      String var4 = "\u008aÃ$ÜY\u001d-XóÁ³Ð§\u0088èl\u0010±\u000bb\u001aîå-\"ô\u0014gsD<ü\u009a ôÐ\u0081\u007f\n²ð·*®S´0<\u0014ù5\\*Uoý\u007fÏ)ÚdÊù\u0017\u0005+";
      int var6 = "\u008aÃ$ÜY\u001d-XóÁ³Ð§\u0088èl\u0010±\u000bb\u001aîå-\"ô\u0014gsD<ü\u009a ôÐ\u0081\u007f\n²ð·*®S´0<\u0014ù5\\*Uoý\u007fÏ)ÚdÊù\u0017\u0005+".length();
      char var3 = 16;
      int var2 = -1;

      while(true) {
         ++var2;
         byte[] var8 = var0.doFinal(var4.substring(var2, var2 + var3).getBytes("ISO-8859-1"));
         String var16 = b(var8).intern();
         boolean var14 = true;
         var7[var5++] = var16;
         if ((var2 += var3) >= var6) {
            d = var7;
            e = new String[3];
            t = new ns(var11, (byte)var13);
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30808;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ns", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/ns" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
