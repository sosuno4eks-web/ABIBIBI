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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class s1 {
   @NotNull
   public static final po O;
   private final int X;
   private final boolean q;
   @NotNull
   private final class_1799 Z;
   @NotNull
   private static final s1 x;
   private static int[] Q;
   private static final long a = j0.a(8620662290239713275L, 2199365212479563356L, MethodHandles.lookup().lookupClass()).a(240776438231437L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public s1(int slot, boolean found, long a, @NotNull class_1799 stack) {
      var3 ^= a;
      Intrinsics.checkNotNullParameter(var5, true.z<invokedynamic>(9897, 5838624400535409157L ^ var3));
      super();
      this.X = var1;
      this.q = var2;
      this.Z = var5;
   }

   public final int I() {
      return this.X;
   }

   public final boolean y() {
      return this.q;
   }

   @NotNull
   public final class_1799 f() {
      return this.Z;
   }

   public final boolean V(short param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private final boolean B(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void t(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(@NotNull Function1 action, long a) {
      // $FF: Couldn't be decompiled
   }

   public final int w() {
      return this.X;
   }

   public final boolean l() {
      return this.q;
   }

   @NotNull
   public final class_1799 L() {
      return this.Z;
   }

   @NotNull
   public final s1 Y(int slot, char a, int a, short a, boolean found, @NotNull class_1799 stack) {
      long var7 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 104869750820214L;
      Intrinsics.checkNotNullParameter(var6, true.z<invokedynamic>(23596, 5096896235555718405L ^ var7));
      return new s1(var1, var5, var9, var6);
   }

   public static s1 U(short var0, s1 var1, int var2, int var3, boolean var4, class_1799 var5, char var6, int var7, Object var8) {
      long var9 = ((long)var0 << 48 | (long)var3 << 32 >>> 16 | (long)var6 << 48 >>> 48) ^ a;
      long var10001 = var9 ^ 73794909934442L;
      int var11 = (int)((var9 ^ 73794909934442L) >>> 48);
      int var12 = (int)(var10001 << 16 >>> 32);
      int var13 = (int)(var10001 << 48 >>> 48);
      int var14 = -7970298129802517945L.A<invokedynamic>(-7970298129802517945L, var9);

      int var10000;
      label41: {
         label40: {
            try {
               var10000 = var7 & 1;
               if (var14 != 0) {
                  break label41;
               }

               if (var10000 == 0) {
                  break label40;
               }
            } catch (NumberFormatException var16) {
               throw var16.A<invokedynamic>(var16, -7956793845576711133L, var9);
            }

            var2 = var1.X;
         }

         var10000 = var7 & 2;
      }

      label32: {
         label31: {
            try {
               if (var14 != 0) {
                  break label32;
               }

               if (var10000 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var15) {
               throw var15.A<invokedynamic>(var15, -7956793845576711133L, var9);
            }

            var4 = var1.q;
         }

         var10000 = var7 & 4;
      }

      if (var10000 != 0) {
         var5 = var1.Z;
      }

      return var1.Y(var2, (char)var11, var12, (short)var13, var4, var5);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 138102300626841L;
      class_1799 var3 = this.Z;
      boolean var4 = this.q;
      int var5 = this.X;
      String var10000 = 45.z<invokedynamic>(45, 3588379452584498685L ^ var1);
      return var10000 + var5 + true.z<invokedynamic>(19778, 3377065943899494551L ^ var1) + var4 + true.z<invokedynamic>(12130, 1057725043773881014L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 78397146818956L;
      int var3 = Integer.hashCode(this.X);
      var3 = var3 * true.i<invokedynamic>(16480, 3377919774707503690L ^ var1) + Boolean.hashCode(this.q);
      var3 = var3 * true.i<invokedynamic>(19606, 1340493980829834943L ^ var1) + this.Z.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public static final s1 A() {
      return x;
   }

   static {
      long var20 = a ^ 21319867980160L;
      long var22 = var20 ^ 45459486119828L;
      int[] var10000 = new int[2];
      d = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -5161278128202974544L, var20);
      Cipher var11;
      Cipher var24 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var24.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[7];
      int var16 = 0;
      String var15 = "£þ©¢6§Í\u0018\u009en÷j04\u009cyVq\u0096Ã-\u000fÄñËj%\u0010í¡-½·y9J>¶\ta\u009fç×äínV\u0010\u0010I\tð\u008cUø:ÖùWxÄI\u009c\u0083F\u0010\u008a\u0004\u008fËÕ·È\u001a·Â\u0018e\u0088.dÎ\u0010=\u0003µ|QP¤\u0096Ï·M\u0000ÃF\u0086p\u0018\u0002^\u0083\\¹t\u0092\n\u0005³Ï\u0080ä\u001eÙ¹Ê´\f<MÙi\u009e";
      int var17 = "£þ©¢6§Í\u0018\u009en÷j04\u009cyVq\u0096Ã-\u000fÄñËj%\u0010í¡-½·y9J>¶\ta\u009fç×äínV\u0010\u0010I\tð\u008cUø:ÖùWxÄI\u009c\u0083F\u0010\u008a\u0004\u008fËÕ·È\u001a·Â\u0018e\u0088.dÎ\u0010=\u0003µ|QP¤\u0096Ï·M\u0000ÃF\u0086p\u0018\u0002^\u0083\\¹t\u0092\n\u0005³Ï\u0080ä\u001eÙ¹Ê´\f<MÙi\u009e".length();
      char var14 = '0';
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var25 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var30 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var30;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[7];
                  g = new HashMap(13);
                  Cipher var0;
                  var24 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var24.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "«S\u009cÆ:67\u001eÿ®¨8rt\u008d\u0006\u000b.ÚDY l\u0085";
                  int var5 = "«S\u009cÆ:67\u001eÿ®¨8rt\u008d\u0006\u000b.ÚDY l\u0085".length();
                  int var2 = 0;

                  do {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     var28 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var32 = true;
                     var6[var28] = var10004;
                  } while(var2 < var5);

                  e = var6;
                  f = new Integer[3];
                  O = new po((DefaultConstructorMarker)null);
                  class_1799 var33 = class_1799.field_8037;
                  Intrinsics.checkNotNullExpressionValue(var33, true.z<invokedynamic>(17075, 6929592441186369916L ^ var20));
                  x = new s1(-1, false, var22, var33);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var30;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "\u0080G&«þvð5\u008dR\u0089\n§à:\u0012\u0091Àà$ªÜt\u009cË`gbiöÂ\n\u0010À\u0017æ\u0004±7}@ðy\u009a$,e°¤";
               var17 = "\u0080G&«þvð5\u008dR\u0089\n§à:\u0012\u0091Àà$ªÜt\u009cË`gbiöÂ\n\u0010À\u0017æ\u0004±7}@ðy\u009a$,e°¤".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var25 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void g(int[] var0) {
      Q = var0;
   }

   public static int[] C() {
      return Q;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15033;
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
            throw new RuntimeException("su/catlean/s1", var10);
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
         throw new RuntimeException("su/catlean/s1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6999;
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
            throw new RuntimeException("su/catlean/s1", var14);
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
         throw new RuntimeException("su/catlean/s1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
