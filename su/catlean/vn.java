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
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class vn {
   @NotNull
   public static final cl V;
   private final long D;
   @Nullable
   private final Long z;
   private static final long a = j0.a(5714161875496290289L, 4907280833528573922L, MethodHandles.lookup().lookupClass()).a(197960747277027L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public vn(long start, @Nullable Long end) {
      this.D = var1;
      this.z = var3;
   }

   public vn(int var1, int var2, long var3, char var5, Long var6, int var7, DefaultConstructorMarker var8) {
      long var9 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      if ((var7 & 2) != 0) {
         var6 = null;
      }

      this(var3, var6);
   }

   public final long j() {
      return this.D;
   }

   @Nullable
   public final Long T() {
      return this.z;
   }

   public final long w() {
      return this.D;
   }

   @Nullable
   public final Long s() {
      return this.z;
   }

   @NotNull
   public final vn c(long start, @Nullable Long end) {
      return new vn(var1, var3);
   }

   public static vn W(vn var0, long var1, Long var3, int var4, long var5, Object var7) {
      var5 ^= a;
      boolean var8 = -8406661913734057591L.A<invokedynamic>(-8406661913734057591L, var5);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var4 & 1;
               if (!var8) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var9) {
               throw var9.A<invokedynamic>(var9, -8413908153509848415L, var5);
            }

            var1 = var0.D;
         }

         var10000 = var4 & 2;
      }

      if (var10000 != 0) {
         var3 = var0.z;
      }

      return var0.c(var1, var3);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 36540086833736L;
      Long var3 = this.z;
      long var4 = this.D;
      String var10000 = 21365.b<invokedynamic>(21365, 2863915398949848234L ^ var1);
      return var10000 + var4 + true.b<invokedynamic>(10581, 1285557997661666955L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void x(vn self, CompositeEncoder output, long a, SerialDescriptor serialDesc) {
      var2 ^= a;
      boolean var10000 = 9208731265749386519L.A<invokedynamic>(9208731265749386519L, var2);
      var1.encodeLongElement(var4, 0, var0.D);
      boolean var5 = var10000;

      label44: {
         label39: {
            try {
               var10000 = var1.shouldEncodeElementDefault(var4, 1);
               if (!var5) {
                  break label44;
               }

               if (!var10000) {
                  break label39;
               }
            } catch (NumberFormatException var8) {
               throw var8.A<invokedynamic>(var8, 9197967616874753599L, var2);
            }

            var10000 = true;
            break label44;
         }

         try {
            if (var0.z != null) {
               var10000 = true;
               break label44;
            }
         } catch (NumberFormatException var7) {
            throw var7.A<invokedynamic>(var7, 9197967616874753599L, var2);
         }

         var10000 = false;
      }

      try {
         if (var10000) {
            var1.encodeNullableSerializableElement(var4, 1, (SerializationStrategy)LongSerializer.INSTANCE, var0.z);
         }

      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, 9197967616874753599L, var2);
      }
   }

   public vn(long a, int seen0, long start, Long end, SerializationConstructorMarker serializationConstructorMarker) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 92009133796127L;
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
      String var11 = ")È\u0007~?\u0082\u001d\u0013©\u00026\"T;´{86Ï&äÿ,Ý\u0081\nMÈ\u0080BJ>J\u001e³5ß9\u008dfo\u001d\u00829óB\u0095§o\f\tY\u0094|÷© K\u001e\u001fzä¶$ý\u0092±\u0081\u0003-\u009e\u0089C";
      int var13 = ")È\u0007~?\u0082\u001d\u0013©\u00026\"T;´{86Ï&äÿ,Ý\u0081\nMÈ\u0080BJ>J\u001e³5ß9\u008dfo\u001d\u00829óB\u0095§o\f\tY\u0094|÷© K\u001e\u001fzä¶$ý\u0092±\u0081\u0003-\u009e\u0089C".length();
      char var10 = 16;
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
            long var2 = -5680782162207028770L;
            byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
            long var19 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
            var10001 = true;
            e = var19;
            V = new cl((DefaultConstructorMarker)null);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23477;
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
            throw new RuntimeException("su/catlean/vn", var10);
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
         throw new RuntimeException("su/catlean/vn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
