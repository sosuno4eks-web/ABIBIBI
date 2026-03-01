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
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class bs {
   @NotNull
   private final class_1304 i;
   private final int A;
   private int X;
   private int F;
   private int s;
   private static final long a = j0.a(6864541045398594749L, 7338763029862836199L, MethodHandles.lookup().lookupClass()).a(85272714605095L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public bs(@NotNull class_1304 equipmentSlot, int armorSlot, int prevProt, int newSlot, int newProtection, int a, int a) {
      long var8 = ((long)var6 << 32 | (long)var7 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(15855, 2414424827213016170L ^ var8));
      super();
      this.i = var1;
      this.A = var2;
      this.X = var3;
      this.F = var4;
      this.s = var5;
   }

   @NotNull
   public final class_1304 f() {
      return this.i;
   }

   public final int F() {
      return this.A;
   }

   public final int r() {
      return this.X;
   }

   public final void x(int <set-?>) {
      this.X = var1;
   }

   public final int t() {
      return this.F;
   }

   public final void j(int <set-?>) {
      this.F = var1;
   }

   public final int R() {
      return this.s;
   }

   public final void l(int <set-?>) {
      this.s = var1;
   }

   public final void O(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 22825430285186L;
      long var10001 = var1 ^ 128579188835190L;
      int var5 = (int)((var1 ^ 128579188835190L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      to var10 = to.J;
      class_1799 var10002 = s8.f(var3).method_31548().method_5438(this.A);
      Intrinsics.checkNotNullExpressionValue(var10002, true.t<invokedynamic>(19402, 1812557240212415546L ^ var1));
      class_1799 var8 = var10002;
      to var9 = var10;
      this.X = to.N(var5, (char)var6, var9, (short)var7, var8);
      this.F = -1;
      this.s = -1;
   }

   @NotNull
   public final class_1304 Z() {
      return this.i;
   }

   public final int g() {
      return this.A;
   }

   public final int m() {
      return this.X;
   }

   public final int W() {
      return this.F;
   }

   public final int G() {
      return this.s;
   }

   @NotNull
   public final bs d(@NotNull class_1304 equipmentSlot, long a, int armorSlot, int prevProt, int newSlot, int newProtection) {
      var2 ^= a;
      long var10001 = var2 ^ 87942950777604L;
      int var8 = (int)((var2 ^ 87942950777604L) >>> 32);
      int var9 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(29373, 8863067223326116105L ^ var2));
      return new bs(var1, var4, var5, var6, var7, var8, var9);
   }

   public static bs a(bs param0, long param1, class_1304 param3, int param4, int param5, int param6, int param7, int param8, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 95639947157125L;
      int var3 = this.s;
      int var4 = this.F;
      int var5 = this.X;
      int var6 = this.A;
      class_1304 var7 = this.i;
      String var10000 = 27223.t<invokedynamic>(27223, 4267227656309881755L ^ var1);
      return var10000 + var7 + true.t<invokedynamic>(11022, 8964228474949827267L ^ var1) + var6 + true.t<invokedynamic>(26074, 6117950641602180116L ^ var1) + var5 + true.t<invokedynamic>(14640, 5230760739615828223L ^ var1) + var4 + true.t<invokedynamic>(7890, 5432987053061754650L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 71962016872589L;
      int var4 = this.i.hashCode();
      var4 = var4 * true.y<invokedynamic>(10627, 2400345950716117011L ^ var1) + Integer.hashCode(this.A);
      String[] var10000 = -2245618179583947440L.A<invokedynamic>(-2245618179583947440L, var1);
      var4 = var4 * true.y<invokedynamic>(15126, 5638957464419029637L ^ var1) + Integer.hashCode(this.X);
      var4 = var4 * true.y<invokedynamic>(15126, 5638957464419029637L ^ var1) + Integer.hashCode(this.F);
      var4 = var4 * true.y<invokedynamic>(15126, 5638957464419029637L ^ var1) + Integer.hashCode(this.s);
      String[] var3 = var10000;

      try {
         if (var3 != null) {
            (new int[5]).A<invokedynamic>(new int[5], -2263694674679028946L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -2281620335070193814L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 22728409369157L;
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
      String var17 = "\u001eÊ\u000fûZa>ît\u0019<\u008aµ\u0003\u0098\r²ü\nòcMËs\u0018¤¯8\\Ð©§pKó¤Õ\fzfñ\u001d`Væ\r\u0095ìç(McðÀ\u0018¹*\"f,\u0017fN\u009c*Q×ª\u008cª\u0004î«Le_\u007ffz¯\u0005«\u0017\u009e\u009bûBOQM\u0018%ãª§»\u008dAã!o\bà\u0003\u00170(\u0088¯à_Ð\u0081\u009c\u0000 \u001f!\u0093Iroå@k âÞ\u0000 î\u0093j\\\" O\u001e+»æ\u009du3Âc~¸ @ùëS\u0000E:§éD\u000b\u0080\u0081\u0084\"(°NRË^\tÄ\u0010\u008dÓ\t\u00190\u001e\u0080e";
      int var19 = "\u001eÊ\u000fûZa>ît\u0019<\u008aµ\u0003\u0098\r²ü\nòcMËs\u0018¤¯8\\Ð©§pKó¤Õ\fzfñ\u001d`Væ\r\u0095ìç(McðÀ\u0018¹*\"f,\u0017fN\u009c*Q×ª\u008cª\u0004î«Le_\u007ffz¯\u0005«\u0017\u009e\u009bûBOQM\u0018%ãª§»\u008dAã!o\bà\u0003\u00170(\u0088¯à_Ð\u0081\u009c\u0000 \u001f!\u0093Iroå@k âÞ\u0000 î\u0093j\\\" O\u001e+»æ\u009du3Âc~¸ @ùëS\u0000E:§éD\u000b\u0080\u0081\u0084\"(°NRË^\tÄ\u0010\u008dÓ\t\u00190\u001e\u0080e".length();
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
                  String var4 = "±$B1\u0019x\u008bæ\u009a\u001c+J³$Hÿ";
                  int var5 = "±$B1\u0019x\u008bæ\u009a\u001c+J³$Hÿ".length();
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

                           var4 = "c/8áØæ\u0018è\rá\u0082\u008a\u0013¥å\b";
                           var5 = "c/8áØæ\u0018è\rá\u0082\u008a\u0013¥å\b".length();
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

               var17 = "1\u0097;)M\u007fÁIÍ\u008aK`5\u008cv\u0007µ\u008aºd7iQjM3½Íw\u009f\u008bA^\u001ehc~T\b\u0080öU:ÅÉ\u0015Û!\u0018T1\u0096\u0091\u008c»\u001eß\u0007,\\`\u0010\u0083¼ýqo³G\u0089ÊC\u008d";
               var19 = "1\u0097;)M\u007fÁIÍ\u008aK`5\u008cv\u0007µ\u008aºd7iQjM3½Íw\u009f\u008bA^\u001ehc~T\b\u0080öU:ÅÉ\u0015Û!\u0018T1\u0096\u0091\u008c»\u001eß\u0007,\\`\u0010\u0083¼ýqo³G\u0089ÊC\u008d".length();
               var16 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22139;
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
            throw new RuntimeException("su/catlean/bs", var10);
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
         throw new RuntimeException("su/catlean/bs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2089;
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
            throw new RuntimeException("su/catlean/bs", var14);
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
         throw new RuntimeException("su/catlean/bs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
