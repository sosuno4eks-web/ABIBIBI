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
import net.minecraft.class_238;
import org.jetbrains.annotations.NotNull;

public final class f5 {
   @NotNull
   private final class_238 G;
   @NotNull
   private final Color U;
   @NotNull
   private final Color D;
   private static final long a = j0.a(7769282159897848815L, 1773322440255374102L, MethodHandles.lookup().lookupClass()).a(105727609111966L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public f5(@NotNull class_238 box, @NotNull Color color, @NotNull Color color2, long a) {
      var4 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.u<invokedynamic>(28138, 4184815796283614691L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.u<invokedynamic>(20406, 2395860126487578558L ^ var4));
      Intrinsics.checkNotNullParameter(var3, true.u<invokedynamic>(12667, 5626119768727124336L ^ var4));
      super();
      this.G = var1;
      this.U = var2;
      this.D = var3;
   }

   // $FF: synthetic method
   public f5(class_238 var1, byte var2, int var3, Color var4, Color var5, int var6, DefaultConstructorMarker var7, int var8) {
      long var9 = ((long)var2 << 56 | (long)var3 << 32 >>> 8 | (long)var8 << 40 >>> 40) ^ a;
      long var11 = var9 ^ 29727396755985L;
      if ((var6 & 4) != 0) {
         var5 = var4;
      }

      this(var1, var4, var5, var11);
   }

   @NotNull
   public final class_238 j() {
      return this.G;
   }

   @NotNull
   public final Color J() {
      return this.U;
   }

   @NotNull
   public final Color H() {
      return this.D;
   }

   static {
      long var0 = a ^ 29820141001508L;
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
      String var6 = "q¢Üï*VÅVIU\u0086pàzåO\u0010»5| ñÏ»Ot\u0017\u0086\u0089Vá´n\u0010\u001cÓ\u001f¨\u008b\u0016ÅH\u009f¬\u0018\u009d´--á";
      int var8 = "q¢Üï*VÅVIU\u0086pàzåO\u0010»5| ñÏ»Ot\u0017\u0086\u0089Vá´n\u0010\u001cÓ\u001f¨\u008b\u0016ÅH\u009f¬\u0018\u009d´--á".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28974;
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
            throw new RuntimeException("su/catlean/f5", var10);
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
         throw new RuntimeException("su/catlean/f5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
