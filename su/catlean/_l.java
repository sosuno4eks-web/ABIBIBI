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

public final class _l implements class_11281 {
   private final float C;
   private final float v;
   private final float X;
   private final float T;
   @NotNull
   private final Color p;
   private static final long a = j0.a(2090896931754011959L, 409664111876201639L, MethodHandles.lookup().lookupClass()).a(154172559738462L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public _l(float uSizeX, float uSizeY, float radius, float uBorderWidth, long a, @NotNull Color uBorderColor) {
      var5 ^= a;
      Intrinsics.checkNotNullParameter(var7, true.x<invokedynamic>(4575, 5060414741509638031L ^ var5));
      super();
      this.C = var1;
      this.v = var2;
      this.X = var3;
      this.T = var4;
      this.p = var7;
   }

   public final float U() {
      return this.C;
   }

   public final float m() {
      return this.v;
   }

   public final float H() {
      return this.X;
   }

   public final float C() {
      return this.T;
   }

   @NotNull
   public final Color K() {
      return this.p;
   }

   public void method_71104(@NotNull ByteBuffer buffer) {
      long var2 = a ^ 135893802588623L;
      long var4 = var2 ^ 36683449380354L;
      long var6 = var2 ^ 90636906680962L;
      long var8 = var2 ^ 97650569421993L;
      long var10 = var2 ^ 90573829389840L;
      Intrinsics.checkNotNullParameter(var1, true.x<invokedynamic>(14723, 5275050199931999991L ^ var2));
      Std140Builder.intoBuffer(var1).putVec2(this.C, this.v).putFloat(this.X).putFloat(this.T).putVec4(gk.E.H(this.p, var8), gk.E.L(var10, this.p), gk.E.M(var4, this.p), gk.E.D(var6, this.p));
   }

   public final float j() {
      return this.C;
   }

   public final float e() {
      return this.v;
   }

   public final float a() {
      return this.X;
   }

   public final float b() {
      return this.T;
   }

   @NotNull
   public final Color E() {
      return this.p;
   }

   @NotNull
   public final _l C(char a, int a, float uSizeX, float uSizeY, float radius, float uBorderWidth, short a, @NotNull Color uBorderColor) {
      long var9 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var7 << 48 >>> 48) ^ a;
      long var11 = var9 ^ 111900259517022L;
      Intrinsics.checkNotNullParameter(var8, true.x<invokedynamic>(17486, 4767691067808652598L ^ var9));
      return new _l(var3, var4, var5, var6, var11, var8);
   }

   public static _l S(_l param0, float param1, long param2, float param4, float param5, float param6, Color param7, int param8, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 129428417745259L;
      Color var3 = this.p;
      float var4 = this.T;
      float var5 = this.X;
      float var6 = this.v;
      float var7 = this.C;
      String var10000 = 2798.x<invokedynamic>(2798, 7060485369907965241L ^ var1);
      return var10000 + var7 + true.x<invokedynamic>(14686, 7007398909730152076L ^ var1) + var6 + true.x<invokedynamic>(19575, 3089907581928582052L ^ var1) + var5 + true.x<invokedynamic>(7189, 3198902026417339332L ^ var1) + var4 + true.x<invokedynamic>(1779, 6574774865873723686L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 57320676523627L;
      int var3 = Float.hashCode(this.C);
      var3 = var3 * true.x<invokedynamic>(9883, 2860045777084333383L ^ var1) + Float.hashCode(this.v);
      var3 = var3 * true.x<invokedynamic>(10061, 6277021019130576016L ^ var1) + Float.hashCode(this.X);
      var3 = var3 * true.x<invokedynamic>(10061, 6277021019130576016L ^ var1) + Float.hashCode(this.T);
      var3 = var3 * true.x<invokedynamic>(10061, 6277021019130576016L ^ var1) + this.p.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 24936168457025L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[8];
      int var18 = 0;
      String var17 = "õ\fUxuÆÍ\u00153\u001dÍ\u0095>\u0092)MqKj,ÔÑ\u0005:¶ÀYd\u0085LoùX\u0012\u0000´®\u0088Vâ Ë\u0013Æ\u0001Þ½ç9ZG\u008cç¿o+ð²\u0012Å\u0000\u0080a¾\u0016\u008aÆ@]k¬ø\u0096\u0018'\u008d\"Õ¾\u0092´\u009eN\u0089*mpñ\u009d½Í\u0097æûôáJë \r\u008bM´Lçãü\u008cþy\u0001ÑKjÙ\u000b¿1ä|8\u0095\u0090ùs\u0018öbé§A \u008fÔFÆ\u008c\u008eÐK?\\\u0015÷ø\u008d\u0017NOÙèüá{[\u0006'ÑÓ®\u0090w\u009b\" q;â¿þ¨P3ac=@\u0013±\u008c9«b*g\u0002æË¸\u009f\u0088åúÚÙàå";
      int var19 = "õ\fUxuÆÍ\u00153\u001dÍ\u0095>\u0092)MqKj,ÔÑ\u0005:¶ÀYd\u0085LoùX\u0012\u0000´®\u0088Vâ Ë\u0013Æ\u0001Þ½ç9ZG\u008cç¿o+ð²\u0012Å\u0000\u0080a¾\u0016\u008aÆ@]k¬ø\u0096\u0018'\u008d\"Õ¾\u0092´\u009eN\u0089*mpñ\u009d½Í\u0097æûôáJë \r\u008bM´Lçãü\u008cþy\u0001ÑKjÙ\u000b¿1ä|8\u0095\u0090ùs\u0018öbé§A \u008fÔFÆ\u008c\u008eÐK?\\\u0015÷ø\u008d\u0017NOÙèüá{[\u0006'ÑÓ®\u0090w\u009b\" q;â¿þ¨P3ac=@\u0013±\u008c9«b*g\u0002æË¸\u009f\u0088åúÚÙàå".length();
      char var16 = '(';
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
                  c = new String[8];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "\u008b\u0006\u0092)\u0089àÄ[Â\u0000QY\u0084ò\u0017Á";
                  int var5 = "\u008b\u0006\u0092)\u0089àÄ[Â\u0000QY\u0084ò\u0017Á".length();
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
                              f = new Integer[4];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "Ü^\u0016ÐhI\u0002,\u0086(¯\u009bv\u008eñ(";
                           var5 = "Ü^\u0016ÐhI\u0002,\u0086(¯\u009bv\u008eñ(".length();
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

               var17 = "\u007fFÄ\u0004L \u0089.¯ØõÏè'\u0005ê\u0018|¨ÞÌ¬-)\u0010j)ì\u009diïqfÛ\u0085Ú:\u0097àâ\\";
               var19 = "\u007fFÄ\u0004L \u0089.¯ØõÏè'\u0005ê\u0018|¨ÞÌ¬-)\u0010j)ì\u009diïqfÛ\u0085Ú:\u0097àâ\\".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15304;
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
            throw new RuntimeException("su/catlean/_l", var10);
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
         throw new RuntimeException("su/catlean/_l" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10435;
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
            throw new RuntimeException("su/catlean/_l", var14);
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
         throw new RuntimeException("su/catlean/_l" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
