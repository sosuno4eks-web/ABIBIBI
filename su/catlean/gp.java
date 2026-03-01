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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1792;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class gp {
   @NotNull
   private final class_1792 h;
   private final int w;
   @NotNull
   private final aa W;
   private boolean g;
   private static final long a = j0.a(2160705723998091016L, 1228279308299526095L, MethodHandles.lookup().lookupClass()).a(119461053642718L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map i;
   private static final long j;

   public gp(@NotNull class_1792 instance, int endTick, int a, int a, short a, @NotNull aa animation, boolean removing) {
      long var8 = ((long)var3 << 32 | (long)var4 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(26446, 8274865973686125313L ^ var8));
      Intrinsics.checkNotNullParameter(var6, true.o<invokedynamic>(4256, 3148330865097553134L ^ var8));
      super();
      this.h = var1;
      this.w = var2;
      this.W = var6;
      this.g = var7;
   }

   // $FF: synthetic method
   public gp(class_1792 var1, int var2, long var3, aa var5, boolean var6, int var7, DefaultConstructorMarker var8) {
      var3 ^= a;
      long var10001 = var3 ^ 89809172231036L;
      int var9 = (int)((var3 ^ 89809172231036L) >>> 32);
      int var10 = (int)(var10001 << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      var10001 = var3 ^ 21236908328848L;
      int var12 = (int)((var3 ^ 21236908328848L) >>> 48);
      int var13 = (int)(var10001 << 16 >>> 48);
      int var14 = (int)(var10001 << 32 >>> 32);
      if ((var7 & 4) != 0) {
         var5 = new aa(sa.OUT_QUINT, j, (short)var12, (short)var13, var14);
      }

      if ((var7 & true.n<invokedynamic>(12505, 7127654223915370065L ^ var3)) != 0) {
         var6 = false;
      }

      this(var1, var2, var9, var10, (short)var11, var5, var6);
   }

   @NotNull
   public final class_1792 P() {
      return this.h;
   }

   public final int i() {
      return this.w;
   }

   @NotNull
   public final aa a() {
      return this.W;
   }

   public final boolean S() {
      return this.g;
   }

   public final void d(boolean <set-?>) {
      this.g = var1;
   }

   @NotNull
   public final class_1792 G() {
      return this.h;
   }

   public final int x() {
      return this.w;
   }

   @NotNull
   public final aa q() {
      return this.W;
   }

   public final boolean s() {
      return this.g;
   }

   @NotNull
   public final gp S(@NotNull class_1792 instance, int endTick, @NotNull aa animation, long a, short a, boolean removing) {
      long var8 = (var4 << 16 | (long)var6 << 48 >>> 48) ^ a;
      long var10001 = var8 ^ 57890480261384L;
      int var10 = (int)((var8 ^ 57890480261384L) >>> 32);
      int var11 = (int)(var10001 << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(15247, 7283724423547804251L ^ var8));
      Intrinsics.checkNotNullParameter(var3, true.o<invokedynamic>(7624, 4940212011552472091L ^ var8));
      return new gp(var1, var2, var10, var11, (short)var12, var3, var7);
   }

   // $FF: synthetic method
   public static gp v(gp param0, long param1, class_1792 param3, int param4, aa param5, boolean param6, int param7, Object param8) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 119213155920041L;
      boolean var3 = this.g;
      aa var4 = this.W;
      int var5 = this.w;
      class_1792 var6 = this.h;
      String var10000 = 17453.o<invokedynamic>(17453, 7523273422105317510L ^ var1);
      return var10000 + var6 + true.o<invokedynamic>(28150, 1951701429461662047L ^ var1) + var5 + true.o<invokedynamic>(1479, 1976588804550349161L ^ var1) + var4 + true.o<invokedynamic>(6607, 2249772153651678565L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 105823964722715L;
      int var3 = this.h.hashCode();
      var3 = var3 * true.n<invokedynamic>(20018, 1007863843980060931L ^ var1) + Integer.hashCode(this.w);
      var3 = var3 * true.n<invokedynamic>(29126, 7520679837762754293L ^ var1) + this.W.hashCode();
      var3 = var3 * true.n<invokedynamic>(29126, 7520679837762754293L ^ var1) + Boolean.hashCode(this.g);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = a ^ 33679181708387L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[8];
      int var23 = 0;
      String var22 = "\n!÷qUååÁtR±©[]ø¹\u0007Ïqä°l6\u0091#)?\u0003\u008bôï\u001a\u0018)§~çßÉÒê¢&ÌN\t}ÿþÄ\u0095³×ûó¡ý\u0018ï!«n\u0001\u000f \u0019\u0004ÐøË`\u0000D£îa\u0081\u0016C\u0019$\u008e\u0018Ë¨/\u001cPÐÄ¬ßW\n/n¸<\u001a-;J\u001cÕ&\t\u009a \u0086_\u0081(nÛ0¨\u009fî$IñÒ\u00adA\u0005\u008c<õ\u009f\u000fn´\u009d¤\u0006ö\u001bÒx\u009c\u0018ü\"¢×C4ð´»\u001cM«N\u0002:\u0012?\u0086\u008a3:VV¾";
      int var24 = "\n!÷qUååÁtR±©[]ø¹\u0007Ïqä°l6\u0091#)?\u0003\u008bôï\u001a\u0018)§~çßÉÒê¢&ÌN\t}ÿþÄ\u0095³×ûó¡ý\u0018ï!«n\u0001\u000f \u0019\u0004ÐøË`\u0000D£îa\u0081\u0016C\u0019$\u008e\u0018Ë¨/\u001cPÐÄ¬ßW\n/n¸<\u001a-;J\u001cÕ&\t\u009a \u0086_\u0081(nÛ0¨\u009fî$IñÒ\u00adA\u0005\u008c<õ\u009f\u000fn´\u009d¤\u0006ö\u001bÒx\u009c\u0018ü\"¢×C4ð´»\u001cM«N\u0002:\u0012?\u0086\u008a3:VV¾".length();
      char var21 = ' ';
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = a(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var33;
               if ((var20 += var21) >= var24) {
                  b = var25;
                  c = new String[8];
                  i = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[4];
                  int var8 = 0;
                  String var9 = "\u0097x'5F3öª$r2-¾A\u008a]";
                  int var10 = "\u0097x'5F3öª$r2-¾A\u008a]".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var31 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                     long[] var30 = var11;
                     var31 = var8++;
                     long var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var37 = -1;

                     while(true) {
                        long var13 = var36;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var39 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var37) {
                        case 0:
                           var30[var31] = var39;
                           if (var7 >= var10) {
                              e = var11;
                              f = new Integer[4];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = -246743422145483606L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              j = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "ëä\u008aP\u0005N\u0004Cà¤AÖE\u008b¥Ü";
                           var10 = "ëä\u008aP\u0005N\u0004Cà¤AÖE\u008b¥Ü".length();
                           var7 = 0;
                        }

                        var31 = var7;
                        var7 += 8;
                        var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                        var30 = var11;
                        var31 = var8++;
                        var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var37 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var33;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "ú§Ò\t\u0015\u0017\u001f¿Ò÷\u007f7A\u0005_\u0095Þ\u009cÝ\u00908t!\u009e(\u0082¨½QÏè6\u000f\u0097½\u009eÃ]â²\\wmýSäz\u0099ÛÑlj+_²\u0082 %\nbÉÆë\u009eÇ åÄW7*Q§\u0007âH \u0000@4ßW@Á\u001a\u00907Àù";
               var24 = "ú§Ò\t\u0015\u0017\u001f¿Ò÷\u007f7A\u0005_\u0095Þ\u009cÝ\u00908t!\u009e(\u0082¨½QÏè6\u000f\u0097½\u009eÃ]â²\\wmýSäz\u0099ÛÑlj+_²\u0082 %\nbÉÆë\u009eÇ åÄW7*Q§\u0007âH \u0000@4ßW@Á\u001a\u00907Àù".length();
               var21 = '8';
               var20 = -1;
            }

            ++var20;
            var27 = var22.substring(var20, var20 + var21);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12435;
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
            throw new RuntimeException("su/catlean/gp", var10);
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
         throw new RuntimeException("su/catlean/gp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23997;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
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
            throw new RuntimeException("su/catlean/gp", var14);
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
         throw new RuntimeException("su/catlean/gp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
