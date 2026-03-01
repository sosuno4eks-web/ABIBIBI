package su.catlean;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.awt.Color;
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

public final class fb implements class_11281 {
   private final float V;
   private final float o;
   private final float O;
   private final float A;
   private final float F;
   @NotNull
   private final Color p;
   @NotNull
   private final Color Y;
   private final float s;
   private static final long a = j0.a(7604919343067571646L, 5343284666143962516L, MethodHandles.lookup().lookupClass()).a(217630895620095L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public fb(long a, float uSizeX, float uSizeY, float uRadius, float uAlpha, float uBorderWidth, @NotNull Color uColor, @NotNull Color uBorderColor, float uMix) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var8, true.a<invokedynamic>(16686, 8081519011641764667L ^ var1));
      Intrinsics.checkNotNullParameter(var9, true.a<invokedynamic>(790, 2492684225583999237L ^ var1));
      super();
      this.V = var3;
      this.o = var4;
      this.O = var5;
      this.A = var6;
      this.F = var7;
      this.p = var8;
      this.Y = var9;
      this.s = var10;
   }

   public final float N() {
      return this.V;
   }

   public final float D() {
      return this.o;
   }

   public final float R() {
      return this.O;
   }

   public final float G() {
      return this.A;
   }

   public final float b() {
      return this.F;
   }

   @NotNull
   public final Color y() {
      return this.p;
   }

   @NotNull
   public final Color r() {
      return this.Y;
   }

   public final float o() {
      return this.s;
   }

   public void method_71104(@NotNull ByteBuffer buffer) {
      long var2 = a ^ 49081526478938L;
      long var4 = var2 ^ 6331648856252L;
      long var6 = var2 ^ 130774119885884L;
      long var8 = var2 ^ 136679815305751L;
      long var10 = var2 ^ 130839345840302L;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(21013, 3308914829388137559L ^ var2));
      Std140Builder.intoBuffer(var1).putVec2(this.V, this.o).putFloat(this.O).putFloat(this.A).putVec4(gk.E.H(this.p, var8), gk.E.L(var10, this.p), gk.E.M(var4, this.p), gk.E.D(var6, this.p)).putFloat(this.F).putVec4(gk.E.H(this.Y, var8), gk.E.L(var10, this.Y), gk.E.M(var4, this.Y), gk.E.D(var6, this.Y)).putFloat(this.s);
   }

   public final float A() {
      return this.V;
   }

   public final float F() {
      return this.o;
   }

   public final float X() {
      return this.O;
   }

   public final float q() {
      return this.A;
   }

   public final float T() {
      return this.F;
   }

   @NotNull
   public final Color d() {
      return this.p;
   }

   @NotNull
   public final Color O() {
      return this.Y;
   }

   public final float m() {
      return this.s;
   }

   @NotNull
   public final fb P(float uSizeX, float uSizeY, float uRadius, float uAlpha, float uBorderWidth, @NotNull Color uColor, @NotNull Color uBorderColor, long a, float uMix) {
      var8 ^= a;
      long var11 = var8 ^ 100609543773212L;
      Intrinsics.checkNotNullParameter(var6, true.a<invokedynamic>(24441, 6354600953692121898L ^ var8));
      Intrinsics.checkNotNullParameter(var7, true.a<invokedynamic>(20185, 4514539890824182414L ^ var8));
      return new fb(var11, var1, var2, var3, var4, var5, var6, var7, var10);
   }

   public static fb X(fb param0, float param1, float param2, float param3, long param4, float param6, float param7, Color param8, Color param9, float param10, int param11, Object param12) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 50016644802471L;
      float var3 = this.s;
      Color var4 = this.Y;
      Color var5 = this.p;
      float var6 = this.F;
      float var7 = this.A;
      float var8 = this.O;
      float var9 = this.o;
      float var10 = this.V;
      String var10000 = 20699.a<invokedynamic>(20699, 4120095832604412258L ^ var1);
      return var10000 + var10 + true.a<invokedynamic>(2481, 1763404237798363149L ^ var1) + var9 + true.a<invokedynamic>(19402, 228123963443810937L ^ var1) + var8 + true.a<invokedynamic>(9502, 8853106836460797091L ^ var1) + var7 + true.a<invokedynamic>(26587, 3478658026398793317L ^ var1) + var6 + true.a<invokedynamic>(14784, 2326873437717618802L ^ var1) + var5 + true.a<invokedynamic>(9644, 6619860737015675929L ^ var1) + var4 + true.a<invokedynamic>(1870, 7998146570351009528L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 21434649262943L;
      int var3 = Float.hashCode(this.V);
      var3 = var3 * true.e<invokedynamic>(2502, 3174530425918960992L ^ var1) + Float.hashCode(this.o);
      var3 = var3 * true.e<invokedynamic>(7053, 69875590206301998L ^ var1) + Float.hashCode(this.O);
      var3 = var3 * true.e<invokedynamic>(7053, 69875590206301998L ^ var1) + Float.hashCode(this.A);
      var3 = var3 * true.e<invokedynamic>(7053, 69875590206301998L ^ var1) + Float.hashCode(this.F);
      var3 = var3 * true.e<invokedynamic>(7053, 69875590206301998L ^ var1) + this.p.hashCode();
      var3 = var3 * true.e<invokedynamic>(7053, 69875590206301998L ^ var1) + this.Y.hashCode();
      var3 = var3 * true.e<invokedynamic>(7053, 69875590206301998L ^ var1) + Float.hashCode(this.s);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 89510633023826L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[13];
      int var18 = 0;
      String var17 = "ÆÎkñjajlÒöß¬\u0080\u0010qÏ}\u0010ª'Ö%ZÚ\rê\u0006\u0001òÚeÊ\u0010º~¬¨çCÙ5\u0018%\u0081\u001cI÷\rC\u0018ù\u0085ùýÄ\u007fn:ÚÝu\u0015ÆL\u001df<U¦K74\u0011\u0090\u0010dJ¡\u001bU«Xé\u000b¬ÎR¬d\u009ao\u0010ØÑÂñz \u0010ËiV\u0095\u009ds\u0084$f ðR).Ç\u00ad¥©\u001b0S~Ã\u0087\u001fVí5,é·\u001e\u0019\u0018¤¿I[j\u0091-Ò ëùÖ|\u009a>Y,z\u001b8¡\u001c=m&\u0016[\u000fZ,\u009a\r\u0011JaçÓz?Ù¥ \u00ad\u0013¦|\u008b\"7\u001aÔ\u009a;«\"Ú^\u009eAÇH`!\u0081n\u0089\u007f\u0082äf»e\u008fd \u009eÀ\u000e\u000f2z\u0093øNÚ\u0083°µª\u0081P¸Dûz¤í£?8°:~1í\u0018\u0000\u0018cÌ^]+%Ôq\u00970k\u0005Û2\u0097E-[(ÇÙì\\:\u0010\u009f\u0082öÛÛm|\u001dqMM\u0006¥Ý\u0006§";
      int var19 = "ÆÎkñjajlÒöß¬\u0080\u0010qÏ}\u0010ª'Ö%ZÚ\rê\u0006\u0001òÚeÊ\u0010º~¬¨çCÙ5\u0018%\u0081\u001cI÷\rC\u0018ù\u0085ùýÄ\u007fn:ÚÝu\u0015ÆL\u001df<U¦K74\u0011\u0090\u0010dJ¡\u001bU«Xé\u000b¬ÎR¬d\u009ao\u0010ØÑÂñz \u0010ËiV\u0095\u009ds\u0084$f ðR).Ç\u00ad¥©\u001b0S~Ã\u0087\u001fVí5,é·\u001e\u0019\u0018¤¿I[j\u0091-Ò ëùÖ|\u009a>Y,z\u001b8¡\u001c=m&\u0016[\u000fZ,\u009a\r\u0011JaçÓz?Ù¥ \u00ad\u0013¦|\u008b\"7\u001aÔ\u009a;«\"Ú^\u009eAÇH`!\u0081n\u0089\u007f\u0082äf»e\u008fd \u009eÀ\u000e\u000f2z\u0093øNÚ\u0083°µª\u0081P¸Dûz¤í£?8°:~1í\u0018\u0000\u0018cÌ^]+%Ôq\u00970k\u0005Û2\u0097E-[(ÇÙì\\:\u0010\u009f\u0082öÛÛm|\u001dqMM\u0006¥Ý\u0006§".length();
      char var16 = ' ';
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
                  c = new String[13];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[7];
                  int var3 = 0;
                  String var4 = "0]\u007fÕ)MU0\"8×>æ\u0094\u0015÷Æâ©)R\n°e\u008fILò¡òç+å¾ýÙ??Dù";
                  int var5 = "0]\u007fÕ)MU0\"8×>æ\u0094\u0015÷Æâ©)R\n°e\u008fILò¡òç+å¾ýÙ??Dù".length();
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
                              e = var6;
                              f = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0092*ÙÆ\u0080w\u009cð*\u0006*\u0005\u0093\u009fKS";
                           var5 = "\u0092*ÙÆ\u0080w\u009cð*\u0006*\u0005\u0093\u009fKS".length();
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

               var17 = "Ïc0]\u008a\u009a¤Ì\u008c\u0080£þ\u0019\u0002ð¢\u0014û\u009d>KM_\u008b(Ük¨ÙÍ8û\u008eô\u0012\u001b¨3\u009eÅy\u000e\u0081},µëG÷#ÔU²ÒTÕÚº\u0019º\u0098é9Ws";
               var19 = "Ïc0]\u008a\u009a¤Ì\u008c\u0080£þ\u0019\u0002ð¢\u0014û\u009d>KM_\u008b(Ük¨ÙÍ8û\u008eô\u0012\u001b¨3\u009eÅy\u000e\u0081},µëG÷#ÔU²ÒTÕÚº\u0019º\u0098é9Ws".length();
               var16 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15437;
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
            throw new RuntimeException("su/catlean/fb", var10);
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
         throw new RuntimeException("su/catlean/fb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17826;
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
            throw new RuntimeException("su/catlean/fb", var14);
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
         throw new RuntimeException("su/catlean/fb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
