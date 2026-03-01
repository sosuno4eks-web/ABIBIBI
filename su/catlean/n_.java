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
public final class n_ {
   @NotNull
   public static final k4 H;
   private int T;
   private boolean a;
   private boolean f;
   private static k9[] M;
   private static final long b = j0.a(3389201596392877778L, 5758705154414117466L, MethodHandles.lookup().lookupClass()).a(183629263913776L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public n_(int key, boolean hold, boolean mouse) {
      this.T = var1;
      this.a = var2;
      this.f = var3;
   }

   public n_(int var1, int var2, char var3, boolean var4, char var5, boolean var6, int var7, DefaultConstructorMarker var8) {
      long var9 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ b;
      if ((var7 & 1) != 0) {
         var1 = -1;
      }

      if ((var7 & 2) != 0) {
         var4 = false;
      }

      if ((var7 & 4) != 0) {
         var6 = false;
      }

      this(var1, var4, var6);
   }

   public final int y() {
      return this.T;
   }

   public final void Z(int <set-?>) {
      this.T = var1;
   }

   public final boolean J() {
      return this.a;
   }

   public final void v(boolean <set-?>) {
      this.a = var1;
   }

   public final boolean K() {
      return this.f;
   }

   public final void Q(boolean <set-?>) {
      this.f = var1;
   }

   public final int j() {
      return this.T;
   }

   public final boolean v() {
      return this.a;
   }

   public final boolean V() {
      return this.f;
   }

   @NotNull
   public final n_ z(int key, boolean hold, boolean mouse) {
      return new n_(var1, var2, var3);
   }

   public static n_ b(int param0, n_ param1, int param2, boolean param3, char param4, boolean param5, int param6, Object param7, short param8) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 23190665179604L;
      boolean var3 = this.f;
      boolean var4 = this.a;
      int var5 = this.T;
      String var10000 = 17469.y<invokedynamic>(17469, 3041155070885777920L ^ var1);
      return var10000 + var5 + true.y<invokedynamic>(12439, 5050964567329351336L ^ var1) + var4 + true.y<invokedynamic>(7322, 4716496702611917478L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = b ^ 43980265776325L;
      int var3 = Integer.hashCode(this.T);
      var3 = var3 * true.d<invokedynamic>(29972, 811773345610703887L ^ var1) + Boolean.hashCode(this.a);
      var3 = var3 * true.d<invokedynamic>(12862, 6437868323447137063L ^ var1) + Boolean.hashCode(this.f);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void b(n_ self, CompositeEncoder output, long a, SerialDescriptor serialDesc) {
      // $FF: Couldn't be decompiled
   }

   public n_(int seen0, int key, boolean hold, boolean mouse, SerializationConstructorMarker serializationConstructorMarker, long a) {
      // $FF: Couldn't be decompiled
   }

   public n_(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 102860356525466L;
      int var3 = (int)((var1 ^ 102860356525466L) >>> 32);
      int var4 = (int)(var10001 << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      this(0, var3, (char)var4, false, (char)var5, false, true.d<invokedynamic>(14639, 2578270533561514900L ^ var1), (DefaultConstructorMarker)null);
   }

   static {
      long var20 = b ^ 125424535425698L;
      k9[] var10000 = new k9[3];
      e = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 7933569079542172583L, var20);
      Cipher var11;
      Cipher var22 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[3];
      int var16 = 0;
      String var15 = "z¤\u008b\u0091lj2É|}¼\u0089\t\u0005Ç\u0089õBó#\u009fÔ©¡\u0007©%\u009cÑ4\u001b\u009e\u00182Sµ\fÄ\u001b¼\u0094OZ\u009cÙ\u0097\u000b\u0081b®7\u0012\u001f\u0083\u0001cÜ\u0010ÄÏ\u0004\u0018ª |Òi\u008b0fqZEu";
      int var17 = "z¤\u008b\u0091lj2É|}¼\u0089\t\u0005Ç\u0089õBó#\u009fÔ©¡\u0007©%\u009cÑ4\u001b\u009e\u00182Sµ\fÄ\u001b¼\u0094OZ\u009cÙ\u0097\u000b\u0081b®7\u0012\u001f\u0083\u0001cÜ\u0010ÄÏ\u0004\u0018ª |Òi\u008b0fqZEu".length();
      char var14 = ' ';
      int var13 = -1;

      while(true) {
         ++var13;
         byte[] var19 = var11.doFinal(var15.substring(var13, var13 + var14).getBytes("ISO-8859-1"));
         String var25 = a(var19).intern();
         boolean var10001 = true;
         var18[var16++] = var25;
         if ((var13 += var14) >= var17) {
            c = var18;
            d = new String[3];
            i = new HashMap(13);
            Cipher var0;
            var22 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
            }

            var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = ",þ\u00ad\u0090\rérf¦v\u0091\u0002Ã\u0018EÇª.\u009f\u0084\u0082\u0019K\"";
            int var5 = ",þ\u00ad\u0090\rérf¦v\u0091\u0002Ã\u0018EÇª.\u009f\u0084\u0082\u0019K\"".length();
            int var2 = 0;

            do {
               int var24 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
               var24 = var3++;
               long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
               long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
               boolean var27 = true;
               var6[var24] = var10004;
            } while(var2 < var5);

            g = var6;
            h = new Integer[3];
            H = new k4((DefaultConstructorMarker)null);
            return;
         }

         var14 = var15.charAt(var13);
      }
   }

   public static void L(k9[] var0) {
      M = var0;
   }

   public static k9[] E() {
      return M;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7075;
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
            throw new RuntimeException("su/catlean/n_", var10);
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
         throw new RuntimeException("su/catlean/n_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2452;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/n_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/n_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
