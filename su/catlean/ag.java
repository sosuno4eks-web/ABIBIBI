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
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class ag extends az {
   private static final long a = j0.a(4658815135254039112L, 6486122536477160414L, MethodHandles.lookup().lookupClass()).a(227406009039685L);
   private static final String[] k;
   private static final String[] m;
   private static final Map n = new HashMap(13);

   public ag(char a, @NotNull zf setting, int a, char a) {
      long var5 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 68061020698679L;
      Intrinsics.checkNotNullParameter(var2, true.l<invokedynamic>(8547, 8780723826144166364L ^ var5));
      super(var2, var7);
   }

   public void R(int a, byte a, int mouseX, int a) {
      long var5 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var4 << 40 >>> 40;
      long var7 = var5 ^ 26150689598378L;
      int[] var9 = 6446319517039025272L.A<invokedynamic>(6446319517039025272L, var5);

      int var10000;
      label20: {
         try {
            var10000 = this.q();
            if (var9 != null) {
               break label20;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (NumberFormatException var11) {
            throw var11.A<invokedynamic>(var11, 6431976638642391815L, var5);
         }

         var10000 = var3;
      }

      float var10 = Math.clamp(((float)var10000 - this.i()) / (this.L() - 7.0F), 0.0F, 1.0F);
      this.t().v(MathKt.roundToInt((float)this.U(var7).getFirst() + (float)(this.U(var7).getLast() - this.U(var7).getFirst()) * var10));
   }

   public float D(long var1) {
      long var3 = var1 ^ 83220454080347L;
      return Math.clamp(((float)((Number)this.t().B()).intValue() - (float)this.U(var3).getFirst()) / (float)(this.U(var3).getLast() - this.U(var3).getFirst()), 0.0F, 1.0F);
   }

   @NotNull
   public Integer u(long a, @NotNull String value) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(29640, 5121558317297755903L ^ var1));
      return Integer.parseInt(var3);
   }

   @NotNull
   public Integer m(long a, int current, int step) {
      var1 ^= a;
      long var5 = var1 ^ 106867612826372L;
      return RangesKt.coerceIn(var3 + var4, this.U(var5).getFirst(), this.U(var5).getLast());
   }

   public void e() {
      this.s(false);
   }

   public Number z(String value, int a, byte a, int a) {
      long var5 = (long)var2 << 32 | (long)var3 << 56 >>> 32 | (long)var4 << 40 >>> 40;
      long var7 = var5 ^ 122909270831169L;
      return (Number)this.u(var7, var1);
   }

   public Number T(long a, Number current, int step) {
      long var5 = var1 ^ 117326203833228L;
      return (Number)this.m(var5, var3.intValue(), var4);
   }

   static {
      long var0 = a ^ 27566406187272L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "-\u0010øøFª\u001a«,D\u009dùhW^\u0082\u0010\u008a\u0094ù\u0082/µU\u00ad\u0004¸íWô{ÿ\u008b";
      int var8 = "-\u0010øøFª\u001a«,D\u009dùhW^\u0082\u0010\u008a\u0094ù\u0082/µU\u00ad\u0004¸íWô{ÿ\u008b".length();
      char var5 = 16;
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var12 = c(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var12;
         if ((var4 += var5) >= var8) {
            k = var9;
            m = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25067;
      if (m[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])n.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ag", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = k[var5].getBytes("ISO-8859-1");
         m[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return m[var5];
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
         throw new RuntimeException("su/catlean/ag" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
