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

public final class fm implements class_11281 {
   private final float z;
   private final float d;
   @NotNull
   private final Color f;
   private final float t;
   private static final long a = j0.a(7448802433471271911L, 4875203523872551959L, MethodHandles.lookup().lookupClass()).a(4277480229231L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public fm(float halfTexelSizeX, float halfTexelSizeY, @NotNull Color color, long a, float lineWidth) {
      var4 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(8077, 9209415826990003144L ^ var4));
      super();
      this.z = var1;
      this.d = var2;
      this.f = var3;
      this.t = var6;
   }

   public final float m() {
      return this.z;
   }

   public final float C() {
      return this.d;
   }

   @NotNull
   public final Color R() {
      return this.f;
   }

   public final float k() {
      return this.t;
   }

   public void method_71104(@NotNull ByteBuffer buffer) {
      long var2 = a ^ 50471249006319L;
      long var4 = var2 ^ 87684244546876L;
      long var6 = var2 ^ 66578962438588L;
      long var8 = var2 ^ 59590931066775L;
      long var10 = var2 ^ 66532519097646L;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(10171, 5500997263917716294L ^ var2));
      Std140Builder.intoBuffer(var1).putVec2(this.z, this.d).putVec4(gk.E.H(this.f, var8), gk.E.L(var10, this.f), gk.E.M(var4, this.f), gk.E.D(var6, this.f)).putFloat(this.t);
   }

   public final float o() {
      return this.z;
   }

   public final float h() {
      return this.d;
   }

   @NotNull
   public final Color K() {
      return this.f;
   }

   public final float c() {
      return this.t;
   }

   @NotNull
   public final fm O(float halfTexelSizeX, float halfTexelSizeY, @NotNull Color color, long a, float lineWidth) {
      var4 ^= a;
      long var7 = var4 ^ 56787481796322L;
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(5811, 3324069522685916536L ^ var4));
      return new fm(var1, var2, var3, var7, var6);
   }

   public static fm j(fm param0, float param1, float param2, Color param3, float param4, int param5, Object param6, long param7) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 47253349598172L;
      float var3 = this.t;
      Color var4 = this.f;
      float var5 = this.d;
      float var6 = this.z;
      String var10000 = 1250.f<invokedynamic>(1250, 1886017634250226991L ^ var1);
      return var10000 + var6 + true.f<invokedynamic>(1554, 4949104056170905562L ^ var1) + var5 + true.f<invokedynamic>(30523, 5307688919673409271L ^ var1) + var4 + true.f<invokedynamic>(2737, 3866145914767700858L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 119139348599168L;
      int var3 = Float.hashCode(this.z);
      var3 = var3 * true.b<invokedynamic>(16616, 7490847771483806442L ^ var1) + Float.hashCode(this.d);
      var3 = var3 * true.b<invokedynamic>(26566, 4079035030203841990L ^ var1) + this.f.hashCode();
      var3 = var3 * true.b<invokedynamic>(26566, 4079035030203841990L ^ var1) + Float.hashCode(this.t);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 87213236539458L;
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
      String var17 = "ð\u0013YèÃ£?Óv\u009d\u009b\u001eáð\u0090{\u0090ò\u0013~_È-o\u008a¼359ÊPºpØ:¨ã±=]\u0014YÃ\u00035ïÛ\u0014\u0098}èut\u0089\u0018³ ZO\u000f¿³&\u0081\u0082\u00840\r¢²\u0017íGñ¨»b\u0087ýÞÞ²º@9)ÌÒ±\u0010\u0002*LÔÐ¤Ì*O59¡(\u008al\u0004\u0010zpB%T\u0089â\u0013IÍ\u008fd Î\u001cÂ\u0010\u0098ÏÄD±÷¿\u0010fÈ,](¡\u0012°";
      int var19 = "ð\u0013YèÃ£?Óv\u009d\u009b\u001eáð\u0090{\u0090ò\u0013~_È-o\u008a¼359ÊPºpØ:¨ã±=]\u0014YÃ\u00035ïÛ\u0014\u0098}èut\u0089\u0018³ ZO\u000f¿³&\u0081\u0082\u00840\r¢²\u0017íGñ¨»b\u0087ýÞÞ²º@9)ÌÒ±\u0010\u0002*LÔÐ¤Ì*O59¡(\u008al\u0004\u0010zpB%T\u0089â\u0013IÍ\u008fd Î\u001cÂ\u0010\u0098ÏÄD±÷¿\u0010fÈ,](¡\u0012°".length();
      char var16 = '8';
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
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "ú\u007f[ñ\u001aéè\u009eª\u001eiA\u0006\u0013\u009ftÀeÁçeCt¨";
                  int var5 = "ú\u007f[ñ\u001aéè\u009eª\u001eiA\u0006\u0013\u009ftÀeÁçeCt¨".length();
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

                  g = var6;
                  h = new Integer[3];
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

               var17 = "\b\u0087Ûw\u0010ã\u008f2\u0017fz\u0088ÓÈc`ô¶\u0098¡\u0011\u0015§\u008f\u009b2\u0080±Õ\u00180\u0017c\r\u000bp;AßM \u000füâ¿Ö\u008aÚü,\u0092öCaãRÉ\u0085«\u008ffÇ\t»ÆyÌ\u009aj\u0006ö\u007fª";
               var19 = "\b\u0087Ûw\u0010ã\u008f2\u0017fz\u0088ÓÈc`ô¶\u0098¡\u0011\u0015§\u008f\u009b2\u0080±Õ\u00180\u0017c\r\u000bp;AßM \u000füâ¿Ö\u008aÚü,\u0092öCaãRÉ\u0085«\u008ffÇ\t»ÆyÌ\u009aj\u0006ö\u007fª".length();
               var16 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27515;
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
            throw new RuntimeException("su/catlean/fm", var10);
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
         throw new RuntimeException("su/catlean/fm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6888;
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
            throw new RuntimeException("su/catlean/fm", var14);
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
         throw new RuntimeException("su/catlean/fm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
