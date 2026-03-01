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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class r1 {
   @NotNull
   public static final qb F;
   private float M;
   private float d;
   private static final long a = j0.a(3921316878174956564L, 5534785889120516017L, MethodHandles.lookup().lookupClass()).a(260416950455199L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);
   private static final long f;

   public r1(float x, float y) {
      this.M = var1;
      this.d = var2;
   }

   public r1(float var1, float var2, int var3, long var4, DefaultConstructorMarker var6) {
      long var10000 = a ^ var4;
      if ((var3 & 1) != 0) {
         var1 = 0.5F;
      }

      if ((var3 & 2) != 0) {
         var2 = 0.5F;
      }

      this(var1, var2);
   }

   public final float q() {
      return this.M;
   }

   public final void g(float <set-?>) {
      this.M = var1;
   }

   public final float s() {
      return this.d;
   }

   public final void j(float <set-?>) {
      this.d = var1;
   }

   public final float c() {
      return this.M;
   }

   public final float C() {
      return this.d;
   }

   @NotNull
   public final r1 N(float x, float y) {
      return new r1(var1, var2);
   }

   public static r1 M(r1 var0, float var1, int var2, float var3, int var4, int var5, Object var6) {
      long var7 = ((long)var2 << 32 | (long)var5 << 32 >>> 32) ^ a;
      k9[] var9 = 9131744553482972780L.A<invokedynamic>(9131744553482972780L, var7);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var4 & 1;
               if (var9 == null) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, 9134735741350248469L, var7);
            }

            var1 = var0.M;
         }

         var10000 = var4 & 2;
      }

      if (var10000 != 0) {
         var3 = var0.d;
      }

      return var0.N(var1, var3);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 109929620243992L;
      float var10000 = this.M;
      float var10001 = this.d;
      String var10003 = true.b<invokedynamic>(27438, 9080353209177382772L ^ var1);
      return var10003 + var10000 + true.b<invokedynamic>(28136, 6003176914020047283L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 46561687559845L;
      int var3 = Float.hashCode(this.M);
      var3 = var3 * (int)f + Float.hashCode(this.d);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void d(long a, r1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
      // $FF: Couldn't be decompiled
   }

   public r1(int seen0, float x, float y, long a, SerializationConstructorMarker serializationConstructorMarker) {
      // $FF: Couldn't be decompiled
   }

   public r1(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 25068463905694L;
      this(0.0F, 0.0F, 3, var3, (DefaultConstructorMarker)null);
   }

   static {
      long var5 = a ^ 3173970002369L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[2];
      int var12 = 0;
      String var11 = "E¿ Í/vk©{h$\u0093g1Nêäé\u0002>B\u0010k\u008de\u0080#\u0095÷J\u0097P\u0011î2\u0085G\u0096Ê\r\u0010²\u0014a\u007f\u000e\"s\u0015\u008a2\u0004\u008a\u0095\u0094©\u0089";
      int var13 = "E¿ Í/vk©{h$\u0093g1Nêäé\u0002>B\u0010k\u008de\u0080#\u0095÷J\u0097P\u0011î2\u0085G\u0096Ê\r\u0010²\u0014a\u007f\u000e\"s\u0015\u008a2\u0004\u008a\u0095\u0094©\u0089".length();
      char var10 = '(';
      int var9 = -1;

      while(true) {
         ++var9;
         byte[] var15 = var7.doFinal(var11.substring(var9, var9 + var10).getBytes("ISO-8859-1"));
         String var17 = a(var15).intern();
         boolean var10001 = true;
         var14[var12++] = var17;
         if ((var9 += var10) >= var13) {
            b = var14;
            c = new String[2];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -3204032996618022289L;
            byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
            long var19 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
            var10001 = true;
            f = var19;
            F = new qb((DefaultConstructorMarker)null);
            return;
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11789;
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
            throw new RuntimeException("su/catlean/r1", var10);
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
         throw new RuntimeException("su/catlean/r1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
