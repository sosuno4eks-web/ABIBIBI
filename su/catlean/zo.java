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
import org.jetbrains.annotations.Nullable;

public final class zo extends zf {
   private static int[] k;
   private static final long b = j0.a(-6600926470989844075L, 115325372408868662L, MethodHandles.lookup().lookupClass()).a(266493009824117L);
   private static final String[] d;
   private static final String[] h;
   private static final Map i;
   private static final long j;

   public zo(short a, @NotNull String id, boolean defaultValue, int a, int a, @Nullable pj group, @NotNull Function0 visible) {
      long var8 = ((long)var1 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ b;
      long var10 = var8 ^ 14922502347970L;
      Intrinsics.checkNotNullParameter(var2, true.l<invokedynamic>(26642, 2854827540542351336L ^ var8));
      Intrinsics.checkNotNullParameter(var7, true.l<invokedynamic>(8110, 1745971039904665686L ^ var8));
      super(var2, var3, (Object)null, var10, var6, var7, 4, (DefaultConstructorMarker)null);
   }

   // $FF: synthetic method
   public zo(String var1, boolean var2, pj var3, Function0 var4, int var5, long var6, DefaultConstructorMarker var8) {
      var6 ^= b;
      long var10001 = var6 ^ 98341490447344L;
      int var9 = (int)((var6 ^ 98341490447344L) >>> 48);
      int var10 = (int)(var10001 << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      if ((var5 & 4) != 0) {
         var3 = null;
      }

      if ((var5 & (int)j) != 0) {
         var4 = zo::L;
      }

      this((short)var9, var1, var2, var10, var11, var3, var4);
   }

   public void n(long a, @NotNull String setting) {
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(858, 5979610117195661132L ^ var1));
      this.v(Boolean.parseBoolean(var3));
   }

   @NotNull
   public String toString() {
      return String.valueOf((Boolean)this.B());
   }

   private static final boolean L() {
      return true;
   }

   public static void F(int[] var0) {
      k = var0;
   }

   public static int[] b() {
      return k;
   }

   static {
      long var14 = b ^ 56446726261395L;
      int[] var10000 = new int[5];
      i = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -8873500896153873862L, var14);
      Cipher var5;
      Cipher var16 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var16.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[3];
      int var10 = 0;
      String var9 = "uáNs\u008eVõp\u007f\u0087%Ç\u0014T\\D\u0010GCFûb&eMK\u007f\u0005LoVß,\u0010W[¢M§²y\u0011\u0080ôÚÜQ;ß8";
      int var11 = "uáNs\u008eVõp\u007f\u0087%Ç\u0014T\\D\u0010GCFûb&eMK\u007f\u0005LoVß,\u0010W[¢M§²y\u0011\u0080ôÚÜQ;ß8".length();
      char var8 = 16;
      int var7 = -1;

      while(true) {
         ++var7;
         byte[] var13 = var5.doFinal(var9.substring(var7, var7 + var8).getBytes("ISO-8859-1"));
         String var18 = b(var13).intern();
         boolean var10001 = true;
         var12[var10++] = var18;
         if ((var7 += var8) >= var11) {
            d = var12;
            h = new String[3];
            Cipher var0;
            var16 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
            }

            var16.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -5995859469064211250L;
            byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
            long var20 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
            var10001 = true;
            j = var20;
            return;
         }

         var8 = var9.charAt(var7);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16504;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/zo", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("su/catlean/zo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
