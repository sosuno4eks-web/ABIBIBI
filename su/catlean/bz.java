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
import net.minecraft.class_1792;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class bz {
   @NotNull
   private final class_243 T;
   private final long v;
   @NotNull
   private final class_1792 F;
   private static final long a = j0.a(7436817793176495824L, 1817821979582446142L, MethodHandles.lookup().lookupClass()).a(164063104679001L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public bz(long a, @NotNull class_243 pos, long expiresOn, @NotNull class_1792 item) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.m<invokedynamic>(21953, 6073419885245625850L ^ var1));
      Intrinsics.checkNotNullParameter(var6, true.m<invokedynamic>(32213, 6885728135853071849L ^ var1));
      super();
      this.T = var3;
      this.v = var4;
      this.F = var6;
   }

   @NotNull
   public final class_243 v() {
      return this.T;
   }

   public final long w() {
      return this.v;
   }

   @NotNull
   public final class_1792 i() {
      return this.F;
   }

   @NotNull
   public final class_243 x() {
      return this.T;
   }

   public final long G() {
      return this.v;
   }

   @NotNull
   public final class_1792 O() {
      return this.F;
   }

   @NotNull
   public final bz b(int a, @NotNull class_243 pos, byte a, int a, long expiresOn, @NotNull class_1792 item) {
      long var8 = ((long)var1 << 32 | (long)var3 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ a;
      long var10 = var8 ^ 119668354649560L;
      Intrinsics.checkNotNullParameter(var2, true.m<invokedynamic>(25369, 448588448393774884L ^ var8));
      Intrinsics.checkNotNullParameter(var7, true.m<invokedynamic>(8423, 4948517691397670105L ^ var8));
      return new bz(var10, var2, var5, var7);
   }

   public static bz D(long var0, bz var2, class_243 var3, long var4, class_1792 var6, int var7, Object var8) {
      var0 ^= a;
      long var10001 = var0 ^ 11350653746220L;
      int var9 = (int)((var0 ^ 11350653746220L) >>> 32);
      int var10 = (int)(var10001 << 32 >>> 56);
      int var11 = (int)(var10001 << 40 >>> 40);
      String[] var12 = -8932408326460206800L.A<invokedynamic>(-8932408326460206800L, var0);

      int var10000;
      label41: {
         label40: {
            try {
               var10000 = var7 & 1;
               if (var12 != null) {
                  break label41;
               }

               if (var10000 == 0) {
                  break label40;
               }
            } catch (NumberFormatException var14) {
               throw var14.A<invokedynamic>(var14, -8871438172025978882L, var0);
            }

            var3 = var2.T;
         }

         var10000 = var7 & 2;
      }

      label32: {
         label31: {
            try {
               if (var12 != null) {
                  break label32;
               }

               if (var10000 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, -8871438172025978882L, var0);
            }

            var4 = var2.v;
         }

         var10000 = var7 & 4;
      }

      if (var10000 != 0) {
         var6 = var2.F;
      }

      return var2.b(var9, var3, (byte)var10, var11, var4, var6);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 105235436255540L;
      class_1792 var3 = this.F;
      long var4 = this.v;
      class_243 var6 = this.T;
      String var10000 = 11011.m<invokedynamic>(11011, 6460262070674296711L ^ var1);
      return var10000 + var6 + true.m<invokedynamic>(30170, 4478217604895494493L ^ var1) + var4 + true.m<invokedynamic>(21824, 6697207295393395138L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 38658786657932L;
      int var3 = this.T.hashCode();
      var3 = var3 * true.c<invokedynamic>(6215, 6240510965742366011L ^ var1) + Long.hashCode(this.v);
      var3 = var3 * true.c<invokedynamic>(19349, 7561883703861722856L ^ var1) + this.F.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 67319098340445L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[7];
      int var18 = 0;
      String var17 = "¿ª\u0000Õ\u0017\u0014m\u0017¡Â\u0011\u0092µ\u0081¾\b\u0010Ë/4\u000eìdÔ(¾6Or;üUÐ\u0010þ¢Â\u008c¸î\u0089]9nv\u001eû\rò°\u0010\u008a\u009bÅ!\u001fã\fñ\u00932\u0006ÞÎ(ó\u001a\u0010>¢\u008eÖ½®ö}£Ê!\bY[¢V";
      int var19 = "¿ª\u0000Õ\u0017\u0014m\u0017¡Â\u0011\u0092µ\u0081¾\b\u0010Ë/4\u000eìdÔ(¾6Or;üUÐ\u0010þ¢Â\u008c¸î\u0089]9nv\u001eû\rò°\u0010\u008a\u009bÅ!\u001fã\fñ\u00932\u0006ÞÎ(ó\u001a\u0010>¢\u008eÖ½®ö}£Ê!\bY[¢V".length();
      char var16 = 16;
      int var15 = -1;

      label45:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var27;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[7];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "\u0080ÞÛ/3î\u0006\b\u0081Ùmåï©/:";
                  int var5 = "\u0080ÞÛ/3î\u0006\b\u0081Ùmåï©/:".length();
                  int var2 = 0;

                  do {
                     int var25 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
                     var25 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var29 = true;
                     var6[var25] = var10004;
                  } while(var2 < var5);

                  e = var6;
                  f = new Integer[2];
                  return;
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var27;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label45;
               }

               var17 = ",IÉÐ\u0000\n©¥K\u001e\u001c§\u001d(\"J÷¶\u009a\u000b2\u0013Eu¹sY\u0012Àñ4¦ «±=2¬ÿ´0¿³\n\\,WÙ\b\u0080sLA÷K\u0010\u001a¿èü\bv2&À";
               var19 = ",IÉÐ\u0000\n©¥K\u001e\u001c§\u001d(\"J÷¶\u009a\u000b2\u0013Eu¹sY\u0012Àñ4¦ «±=2¬ÿ´0¿³\n\\,WÙ\b\u0080sLA÷K\u0010\u001a¿èü\bv2&À".length();
               var16 = ' ';
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5230;
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
            throw new RuntimeException("su/catlean/bz", var10);
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
         throw new RuntimeException("su/catlean/bz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31272;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/bz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("su/catlean/bz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
