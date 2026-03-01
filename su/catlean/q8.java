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
import net.minecraft.class_241;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class q8 implements class_11281 {
   @NotNull
   private final class_241 E;
   @NotNull
   private final class_241 x;
   @NotNull
   private final Color I;
   private final float a;
   private final float W;
   private final float A;
   private static final long b = j0.a(8726670178109413995L, 4328617317175295430L, MethodHandles.lookup().lookupClass()).a(274668313063459L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public q8(@NotNull class_241 uViewOffset, long a, @NotNull class_241 uHalfTexelSize, @NotNull Color uColor, float uBorder, float alphaX, float alphaY) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(5557, 5320966679801550799L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.f<invokedynamic>(14755, 4024216369899502559L ^ var2));
      Intrinsics.checkNotNullParameter(var5, true.f<invokedynamic>(10209, 4193555716701250965L ^ var2));
      super();
      this.E = var1;
      this.x = var4;
      this.I = var5;
      this.a = var6;
      this.W = var7;
      this.A = var8;
   }

   @NotNull
   public final class_241 j() {
      return this.E;
   }

   @NotNull
   public final class_241 S() {
      return this.x;
   }

   @NotNull
   public final Color z() {
      return this.I;
   }

   public final float m() {
      return this.a;
   }

   public final float g() {
      return this.W;
   }

   public final float r() {
      return this.A;
   }

   public void method_71104(@NotNull ByteBuffer buffer) {
      long var2 = b ^ 102072564309396L;
      long var4 = var2 ^ 136417206782948L;
      long var6 = var2 ^ 16630390110052L;
      long var8 = var2 ^ 6180849992015L;
      long var10 = var2 ^ 16695615020022L;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(31777, 537191094696233699L ^ var2));
      Std140Builder.intoBuffer(var1).putVec2(this.E.field_1343, this.E.field_1342).putVec4(gk.E.H(this.I, var8), gk.E.L(var10, this.I), gk.E.M(var4, this.I), gk.E.D(var6, this.I)).putFloat(this.a).putVec2(this.x.field_1343, this.x.field_1342).putFloat(this.W).putFloat(this.A);
   }

   @NotNull
   public final class_241 b() {
      return this.E;
   }

   @NotNull
   public final class_241 D() {
      return this.x;
   }

   @NotNull
   public final Color B() {
      return this.I;
   }

   public final float p() {
      return this.a;
   }

   public final float c() {
      return this.W;
   }

   public final float O() {
      return this.A;
   }

   @NotNull
   public final q8 W(@NotNull class_241 uViewOffset, @NotNull class_241 uHalfTexelSize, @NotNull Color uColor, short a, float uBorder, int a, float alphaX, short a, float alphaY) {
      long var10 = ((long)var4 << 48 | (long)var6 << 32 >>> 16 | (long)var8 << 48 >>> 48) ^ b;
      long var12 = var10 ^ 31239831225218L;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(20576, 1860794126611873116L ^ var10));
      Intrinsics.checkNotNullParameter(var2, true.f<invokedynamic>(13549, 8532779000613083608L ^ var10));
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(6163, 3483733052798678304L ^ var10));
      return new q8(var1, var12, var2, var3, var5, var7, var9);
   }

   public static q8 W(q8 param0, class_241 param1, class_241 param2, Color param3, float param4, long param5, float param7, float param8, int param9, Object param10) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 2758018052484L;
      float var3 = this.A;
      float var4 = this.W;
      float var5 = this.a;
      Color var6 = this.I;
      class_241 var7 = this.x;
      class_241 var8 = this.E;
      String var10000 = 2195.f<invokedynamic>(2195, 4120182069522616911L ^ var1);
      return var10000 + var8 + true.f<invokedynamic>(17952, 6149693221369388277L ^ var1) + var7 + true.f<invokedynamic>(14593, 6702885379690587095L ^ var1) + var6 + true.f<invokedynamic>(30830, 5706861974023185076L ^ var1) + var5 + true.f<invokedynamic>(11974, 7043002282652333080L ^ var1) + var4 + true.f<invokedynamic>(1361, 4292088142279532425L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = b ^ 72742911120966L;
      int var3 = this.E.hashCode();
      var3 = var3 * true.w<invokedynamic>(19267, 2864858143645289475L ^ var1) + this.x.hashCode();
      var3 = var3 * true.w<invokedynamic>(13423, 5591053146093597481L ^ var1) + this.I.hashCode();
      var3 = var3 * true.w<invokedynamic>(13423, 5591053146093597481L ^ var1) + Float.hashCode(this.a);
      var3 = var3 * true.w<invokedynamic>(13423, 5591053146093597481L ^ var1) + Float.hashCode(this.W);
      var3 = var3 * true.w<invokedynamic>(13423, 5591053146093597481L ^ var1) + Float.hashCode(this.A);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = b ^ 57547434960654L;
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
      String var17 = "#ç\u0090oU\u009a¨õµú¹^¸ ^\u0092È¤¹É\u0019Ì\u0015\u0084 H\u000fÛ\u00178ãËêJ:1,«²\u0086í¬\u0007\u0097î mËù\u000b!ü{\u0085\u0002Òw8\"À¤ê\u0094Üãù\u0017´QúC\u008f>ÂÈ\"uRKeÛ\u0013\u007fX\u009a\u0088\\\u0095À1ªz\u008aAÄZ\u0012ÏªJ¿{{2O\u0016ë;ò1\u008aâ`U Ybl5Ä½{C·|Öª\u0001%\u001dWÝ\u0090)\u0083\u009d\u0017\u0099$Ù\u0006\u0093ÖA/ýè )åÖÆmíÉ¢¥Õ\u00921sg\u0095¼\\\u009eÜÆÞ¿DÞàî\u008d<9äx\u008c\u0010·Ü\u0000ìá\u0086HÊ\nÛ\u0018ë¢\u001aµ\u008f J|híÁþe\u000eþ`#\u0017w\u008c\u009a\\Ã\u0014\u009e$vèÅq\u0088:ç\nÑ\u008c\u001a§\u0018õýg£\u0082k^´\u0095¦¥ù\u0007Þ\u0096°¢ÈÅè\u0087z\u0085Ò I\u0019ÀpðTüd¾«)Ð é\u0002\u0005Z\u00074\u009f§6M2\u0089¡ À×\f\u0007&\u0010Åñ-3\u0013Ê\u001e¸b\u000f9õ¢Ï©\u0084 \u0013\u0092\u008cîÎ\u0093º*\u0013/\u0089Óq3äõ6Õ\u000f-\u001b\u007fJs\u0098½È±í\u009c\"=";
      int var19 = "#ç\u0090oU\u009a¨õµú¹^¸ ^\u0092È¤¹É\u0019Ì\u0015\u0084 H\u000fÛ\u00178ãËêJ:1,«²\u0086í¬\u0007\u0097î mËù\u000b!ü{\u0085\u0002Òw8\"À¤ê\u0094Üãù\u0017´QúC\u008f>ÂÈ\"uRKeÛ\u0013\u007fX\u009a\u0088\\\u0095À1ªz\u008aAÄZ\u0012ÏªJ¿{{2O\u0016ë;ò1\u008aâ`U Ybl5Ä½{C·|Öª\u0001%\u001dWÝ\u0090)\u0083\u009d\u0017\u0099$Ù\u0006\u0093ÖA/ýè )åÖÆmíÉ¢¥Õ\u00921sg\u0095¼\\\u009eÜÆÞ¿DÞàî\u008d<9äx\u008c\u0010·Ü\u0000ìá\u0086HÊ\nÛ\u0018ë¢\u001aµ\u008f J|híÁþe\u000eþ`#\u0017w\u008c\u009a\\Ã\u0014\u009e$vèÅq\u0088:ç\nÑ\u008c\u001a§\u0018õýg£\u0082k^´\u0095¦¥ù\u0007Þ\u0096°¢ÈÅè\u0087z\u0085Ò I\u0019ÀpðTüd¾«)Ð é\u0002\u0005Z\u00074\u009f§6M2\u0089¡ À×\f\u0007&\u0010Åñ-3\u0013Ê\u001e¸b\u000f9õ¢Ï©\u0084 \u0013\u0092\u008cîÎ\u0093º*\u0013/\u0089Óq3äõ6Õ\u000f-\u001b\u007fJs\u0098½È±í\u009c\"=".length();
      char var16 = 24;
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
                  c = var20;
                  d = new String[13];
                  h = new HashMap(13);
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
                  String var4 = "Z_i\u0080D\u009c\u0004\u008a\u001d\u0090\u0098/*ÌWÓuÎz2\u0015àXü";
                  int var5 = "Z_i\u0080D\u009c\u0004\u008a\u001d\u0090\u0098/*ÌWÓuÎz2\u0015àXü".length();
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

                           var4 = "\tLB\u0015&7`ïÌ\u000bT8\u0000O<e";
                           var5 = "\tLB\u0015&7`ïÌ\u000bT8\u0000O<e".length();
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

               var17 = "\u00013?i\"\u0081mæB\u008doVcz×\u0000.\u0019n\u0082TGP\u007fPtS\u0003¡ü ;ø\u0080q\u0015¨wO5\u0010Ìybr\u009c\u0098}0\u0098\u0091*-¥NZ.";
               var19 = "\u00013?i\"\u0081mæB\u008doVcz×\u0000.\u0019n\u0082TGP\u007fPtS\u0003¡ü ;ø\u0080q\u0015¨wO5\u0010Ìybr\u009c\u0098}0\u0098\u0091*-¥NZ.".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1939;
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
            throw new RuntimeException("su/catlean/q8", var10);
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
         throw new RuntimeException("su/catlean/q8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32203;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/q8", var14);
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
         throw new RuntimeException("su/catlean/q8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
