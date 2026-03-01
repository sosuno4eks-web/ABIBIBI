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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;

public final class v7 {
   @NotNull
   private final Matrix3x2f h;
   private final float d;
   private final float o;
   private final float O;
   private final float M;
   private final float l;
   private static final long a = j0.a(6403790249378450880L, 3977210182538835034L, MethodHandles.lookup().lookupClass()).a(271644532495144L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   public v7(@NotNull Matrix3x2f m, float x, float y, float w, float h, float a) {
      Intrinsics.checkNotNullParameter(var1, "m");
      super();
      this.h = var1;
      this.d = var2;
      this.o = var3;
      this.O = var4;
      this.M = var5;
      this.l = var6;
   }

   @NotNull
   public final Matrix3x2f v() {
      return this.h;
   }

   public final float u() {
      return this.d;
   }

   public final float z() {
      return this.o;
   }

   public final float J() {
      return this.O;
   }

   public final float c() {
      return this.M;
   }

   public final float j() {
      return this.l;
   }

   @NotNull
   public final Matrix3x2f I() {
      return this.h;
   }

   public final float a() {
      return this.d;
   }

   public final float i() {
      return this.o;
   }

   public final float q() {
      return this.O;
   }

   public final float F() {
      return this.M;
   }

   public final float N() {
      return this.l;
   }

   @NotNull
   public final v7 h(@NotNull Matrix3x2f m, float x, float y, float w, float h, float a) {
      Intrinsics.checkNotNullParameter(var1, "m");
      return new v7(var1, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic method
   public static v7 o(v7 param0, Matrix3x2f param1, float param2, float param3, float param4, long param5, float param7, float param8, int param9, Object param10) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 129355554109391L;
      float var3 = this.l;
      float var4 = this.M;
      float var5 = this.O;
      float var6 = this.o;
      float var7 = this.d;
      Matrix3x2f var8 = this.h;
      String var10000 = 4704.t<invokedynamic>(4704, 2431404875737558286L ^ var1);
      return var10000 + var8 + true.t<invokedynamic>(14589, 3066969592818190231L ^ var1) + var7 + true.t<invokedynamic>(12523, 2830341123501379462L ^ var1) + var6 + true.t<invokedynamic>(15975, 5652009335917953291L ^ var1) + var5 + true.t<invokedynamic>(16485, 8568724985526796042L ^ var1) + var4 + true.t<invokedynamic>(11152, 4318157276311213307L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 140675647370230L;
      int var4 = this.h.hashCode();
      int[] var10000 = 2781822467444847728L.A<invokedynamic>(2781822467444847728L, var1);
      var4 = var4 * true.l<invokedynamic>(14431, 2435665129248139661L ^ var1) + Float.hashCode(this.d);
      var4 = var4 * true.l<invokedynamic>(10028, 5131700787841644282L ^ var1) + Float.hashCode(this.o);
      int[] var3 = var10000;
      var4 = var4 * true.l<invokedynamic>(10028, 5131700787841644282L ^ var1) + Float.hashCode(this.O);
      var4 = var4 * true.l<invokedynamic>(10028, 5131700787841644282L ^ var1) + Float.hashCode(this.M);
      var4 = var4 * true.l<invokedynamic>(10028, 5131700787841644282L ^ var1) + Float.hashCode(this.l);

      try {
         if (var3 != null) {
            (new int[2]).A<invokedynamic>(new int[2], 2806729212942476616L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 2801770329916879624L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 101330646579555L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[6];
      int var18 = 0;
      String var17 = "k@4_K£\u0013´&ô\u001b\u0081ªV¹\u0099( ëU®\u0014\u00ad¿ÀÀñyî\u009d\u0099%a\u008apo\u009a¨Pêl}\u0017_\u0019¼\u0006/Û\u0019o\u009a³S\u0083~p\u0010³\u009aA\u0093q2x\u00975h¿\u0095¶·ÌU\u0010ÙÀü¢\u001eßv\u0014Æ®\u0088Zb0\u0017©";
      int var19 = "k@4_K£\u0013´&ô\u001b\u0081ªV¹\u0099( ëU®\u0014\u00ad¿ÀÀñyî\u009d\u0099%a\u008apo\u009a¨Pêl}\u0017_\u0019¼\u0006/Û\u0019o\u009a³S\u0083~p\u0010³\u009aA\u0093q2x\u00975h¿\u0095¶·ÌU\u0010ÙÀü¢\u001eßv\u0014Æ®\u0088Zb0\u0017©".length();
      char var16 = 16;
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[6];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "÷UñK·õ\nÅààøSó\u0096¡\u0012\u0086T÷ª,M\u0007\u0017";
                  int var5 = "÷UñK·õ\nÅààøSó\u0096¡\u0012\u0086T÷ª,M\u0007\u0017".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var26 = var3++;
                     long var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var31 = -1;

                     while(true) {
                        long var8 = var30;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var31) {
                        case 0:
                           var25[var26] = var33;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "!ô\u001aºHF¶\u0016²)Ug9\u0091 G";
                           var5 = "!ô\u001aºHF¶\u0016²)Ug9\u0091 G".length();
                           var2 = 0;
                        }

                        var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var26 = var3++;
                        var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var31 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "+Õëòùy\u0094P\u0006Ë\u0092\u001bAÂ½½\u0010Â\u0007qmÂ\u009fÑò`\u0096\u007f\u0004ó\u0015´\u0080";
               var19 = "+Õëòùy\u0094P\u0006Ë\u0092\u001bAÂ½½\u0010Â\u0007qmÂ\u009fÑò`\u0096\u007f\u0004ó\u0015´\u0080".length();
               var16 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7305;
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
            throw new RuntimeException("su/catlean/v7", var10);
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
         throw new RuntimeException("su/catlean/v7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13837;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/v7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/v7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
