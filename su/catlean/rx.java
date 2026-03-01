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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class rx {
   @NotNull
   private final qq T;
   private final int Z;
   @NotNull
   private Function0 d;
   private static String D;
   private static final long c = j0.a(2924395165591200069L, 1138364257928044596L, MethodHandles.lookup().lookupClass()).a(147416728622204L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g;
   private static final long k;

   public rx(long a, @NotNull qq rotation, int priority, @NotNull Function0 action) {
      var1 ^= c;
      Intrinsics.checkNotNullParameter(var3, true.a<invokedynamic>(13447, 7433095002731183828L ^ var1));
      Intrinsics.checkNotNullParameter(var5, true.a<invokedynamic>(14811, 8579336529842828171L ^ var1));
      super();
      this.T = var3;
      this.Z = var4;
      this.d = var5;
   }

   // $FF: synthetic method
   public rx(char var1, qq var2, int var3, char var4, int var5, Function0 var6, int var7, DefaultConstructorMarker var8) {
      long var9 = ((long)var1 << 48 | (long)var4 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ c;
      long var11 = var9 ^ 22727669927840L;
      if ((var7 & 2) != 0) {
         var3 = (int)k;
      }

      this(var11, var2, var3, var6);
   }

   @NotNull
   public final qq B() {
      return this.T;
   }

   public final int W() {
      return this.Z;
   }

   @NotNull
   public final Function0 D() {
      return this.d;
   }

   public final void L(long a, @NotNull Function0 <set-?>) {
      var1 ^= c;
      Intrinsics.checkNotNullParameter(var3, true.a<invokedynamic>(18305, 6722641581265601411L ^ var1));
      this.d = var3;
   }

   public static void l(String var0) {
      D = var0;
   }

   public static String A() {
      return D;
   }

   static {
      long var14 = c ^ 101784767134692L;
      g = new HashMap(13);
      "y8vK8".A<invokedynamic>("y8vK8", 6042517779552856913L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[3];
      int var10 = 0;
      String var9 = "³öÆ\"#'x\u001b\u007f,ùlü¡å\u001c\u0010\u0016·\u009f\u001dâ÷Ð^\u009cÛ\u0016ÇÈë.\u0001\u0018%\u0086Øí\u008a(ë\u00010>o¤Nd©úg /\u0007\u008cÇ\f<";
      int var11 = "³öÆ\"#'x\u001b\u007f,ùlü¡å\u001c\u0010\u0016·\u009f\u001dâ÷Ð^\u009cÛ\u0016ÇÈë.\u0001\u0018%\u0086Øí\u008a(ë\u00010>o¤Nd©úg /\u0007\u008cÇ\f<".length();
      char var8 = 16;
      int var7 = -1;

      while(true) {
         ++var7;
         byte[] var13 = var5.doFinal(var9.substring(var7, var7 + var8).getBytes("ISO-8859-1"));
         String var17 = a(var13).intern();
         boolean var10001 = true;
         var12[var10++] = var17;
         if ((var7 += var8) >= var11) {
            e = var12;
            f = new String[3];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = 7687507448006516191L;
            byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
            long var19 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
            var10001 = true;
            k = var19;
            return;
         }

         var8 = var9.charAt(var7);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21695;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/rx", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("su/catlean/rx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
