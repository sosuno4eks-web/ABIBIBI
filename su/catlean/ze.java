package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;

public final class ze implements class_11281 {
   @NotNull
   private final Matrix4f i;
   @Nullable
   private final Matrix4f I;
   private static final long a = j0.a(7067516637807624763L, 4745707637345657229L, MethodHandles.lookup().lookupClass()).a(249674065957934L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public ze(int a, int a, @NotNull Matrix4f projection, int a, @Nullable Matrix4f view) {
      long var6 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var3, true.g<invokedynamic>(13974, 8705743464930922116L ^ var6));
      super();
      this.i = var3;
      this.I = var5;
   }

   @NotNull
   public final Matrix4f Z() {
      return this.i;
   }

   @Nullable
   public final Matrix4f b() {
      return this.I;
   }

   public void method_71104(@NotNull ByteBuffer buffer) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final Matrix4f C() {
      return this.i;
   }

   @Nullable
   public final Matrix4f u() {
      return this.I;
   }

   @NotNull
   public final ze N(long a, @NotNull Matrix4f projection, @Nullable Matrix4f view) {
      var1 ^= a;
      long var10001 = var1 ^ 37192845506032L;
      int var5 = (int)((var1 ^ 37192845506032L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.g<invokedynamic>(9195, 6876300166828633070L ^ var1));
      return new ze(var5, var6, var3, var7, var4);
   }

   public static ze j(ze var0, Matrix4f var1, Matrix4f var2, int var3, Object var4, long var5) {
      var5 ^= a;
      long var7 = var5 ^ 80766234506020L;
      k9[] var9 = -4099433907597694687L.A<invokedynamic>(-4099433907597694687L, var5);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var3 & 1;
               if (var9 == null) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, -4069790212899605873L, var5);
            }

            var1 = var0.i;
         }

         var10000 = var3 & 2;
      }

      if (var10000 != 0) {
         var2 = var0.I;
      }

      return var0.N(var7, var1, var2);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 102304660151426L;
      Matrix4f var10000 = this.i;
      Matrix4f var10001 = this.I;
      String var10003 = true.g<invokedynamic>(15575, 7744463299669695988L ^ var1);
      return var10003 + var10000 + true.g<invokedynamic>(9101, 4169597814714925741L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 51459561070933L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[5];
      int var12 = 0;
      String var11 = "E\u0011\u0090ñAo\u009f¯)Y!l¿\u001a\u0013Ï É\u0089fÕ\u008aTÅ\u00813\u0005\u0018eoø 7cgG\u0088\u0094\u0003ÀK\u00161\u009eg¿\u0084g\u0084\u0018ðá2±¦T\u0000Y\u0099®:\t°¥Æ\u0088o¢¥S\u009b\u0084\u0099 ";
      int var13 = "E\u0011\u0090ñAo\u009f¯)Y!l¿\u001a\u0013Ï É\u0089fÕ\u008aTÅ\u00813\u0005\u0018eoø 7cgG\u0088\u0094\u0003ÀK\u00161\u009eg¿\u0084g\u0084\u0018ðá2±¦T\u0000Y\u0099®:\t°¥Æ\u0088o¢¥S\u009b\u0084\u0099 ".length();
      char var10 = 16;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  b = var14;
                  c = new String[5];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -8820811504499301953L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "\u0080\u008e7ÿÕ{ø¿opÝI }\u009d·©!\nY%\u0017\u001d\u0015·'ùì\u0099Ps#¥\u0011Ø$\u008d?¶3\u0010A°û\u0001ÿ§¼rg¹*â\u0099M\u0096\u0098";
               var13 = "\u0080\u008e7ÿÕ{ø¿opÝI }\u009d·©!\nY%\u0017\u001d\u0015·'ùì\u0099Ps#¥\u0011Ø$\u008d?¶3\u0010A°û\u0001ÿ§¼rg¹*â\u0099M\u0096\u0098".length();
               var10 = '(';
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14406;
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
            throw new RuntimeException("su/catlean/ze", var10);
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
         throw new RuntimeException("su/catlean/ze" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
