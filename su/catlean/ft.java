package su.catlean;

import java.awt.Color;
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
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;

public final class ft {
   @NotNull
   private q7 T;
   @NotNull
   private class_243 Y;
   private float E;
   private float x;
   private int e;
   @NotNull
   private class_243 O;
   @NotNull
   private Color a;
   private float H;
   private float s;
   private boolean N;
   private final int t;
   @NotNull
   private class_243 n;
   private float b;
   private float f;
   private int i;
   private static String[] D;
   private static final long c = j0.a(3609208642962002715L, 3004121521464646846L, MethodHandles.lookup().lookupClass()).a(114909331145602L);
   private static final String[] d;
   private static final String[] g;
   private static final Map h;
   private static final long[] j;
   private static final Integer[] k;
   private static final Map l;

   public ft(@NotNull q7 tex, @NotNull class_243 pos, float rotationSpeed, float scale, int lifetime, @NotNull class_243 velocity, @NotNull Color color, long a, float gravity, float drag, boolean useAgeFactor) {
      var8 ^= c;
      long var13 = var8 ^ 137843831753773L;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(4880, 5887924939156146063L ^ var8));
      Intrinsics.checkNotNullParameter(var2, true.e<invokedynamic>(6948, 7652892876061560741L ^ var8));
      Intrinsics.checkNotNullParameter(var6, true.e<invokedynamic>(21529, 2825317340543844510L ^ var8));
      Intrinsics.checkNotNullParameter(var7, true.e<invokedynamic>(12004, 5124209115183053409L ^ var8));
      super();
      this.T = var1;
      this.Y = var2;
      this.E = var3;
      this.x = var4;
      this.e = var5;
      this.O = var6;
      this.a = var7;
      this.H = var10;
      this.s = var11;
      this.N = var12;
      this.t = this.e;
      this.n = this.Y;
      this.i = gw.l((ClosedRange)(new IntRange(0, 3)), false, 2, (Object)null, var13);
   }

   public ft(q7 var1, class_243 var2, float var3, float var4, long var5, int var7, class_243 var8, Color var9, float var10, float var11, boolean var12, int var13, DefaultConstructorMarker var14) {
      var5 ^= c;
      long var15 = var5 ^ 37360930744582L;
      if ((var13 & true.x<invokedynamic>(23105, 2747252271143087507L ^ var5)) != 0) {
         Color var10000 = Color.BLACK;
         Intrinsics.checkNotNullExpressionValue(var10000, true.e<invokedynamic>(17256, 92433484479731670L ^ var5));
         var9 = var10000;
      }

      if ((var13 & true.x<invokedynamic>(6184, 4711669774073933816L ^ var5)) != 0) {
         var10 = 0.03F;
      }

      if ((var13 & true.x<invokedynamic>(25062, 5479008117054821943L ^ var5)) != 0) {
         var11 = 0.99F;
      }

      if ((var13 & true.x<invokedynamic>(12121, 3428918331487066250L ^ var5)) != 0) {
         var12 = true;
      }

      this(var1, var2, var3, var4, var7, var8, var9, var15, var10, var11, var12);
   }

   @NotNull
   public final q7 l() {
      return this.T;
   }

   public final void b(@NotNull q7 <set-?>, long a) {
      var2 ^= c;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(9984, 1442455264032791852L ^ var2));
      this.T = var1;
   }

   @NotNull
   public final class_243 H() {
      return this.Y;
   }

   public final void g(long a, @NotNull class_243 <set-?>) {
      var1 ^= c;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(31224, 8717642874559457498L ^ var1));
      this.Y = var3;
   }

   public final float T() {
      return this.x;
   }

   public final void b(float <set-?>) {
      this.x = var1;
   }

   @NotNull
   public final class_243 M() {
      return this.O;
   }

   public final void t(long a, @NotNull class_243 <set-?>) {
      var1 ^= c;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(31224, 8717660247759571774L ^ var1));
      this.O = var3;
   }

   @NotNull
   public final Color D() {
      return this.a;
   }

   public final void W(long a, @NotNull Color <set-?>) {
      var1 ^= c;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(31224, 8717573000724800079L ^ var1));
      this.a = var3;
   }

   public final boolean a(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(@NotNull class_4587 matrices, @NotNull Quaternionfc base, @NotNull ib polygon, long a) {
      // $FF: Couldn't be decompiled
   }

   public static void J(String[] var0) {
      D = var0;
   }

   public static String[] k() {
      return D;
   }

   static {
      long var20 = c ^ 22207177162173L;
      String[] var10000 = new String[3];
      h = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 1580126305544821358L, var20);
      Cipher var11;
      Cipher var22 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[17];
      int var16 = 0;
      String var15 = "]\u0016îÓ\u0087q\u0081ÅÂ´ÁUt\u009cá|î\u0005áü\u0005J\u0098&\u0010ÙÁ×N¸\bv§\u0081\u0015=õ\u0091\u0098\u0086f\u0018\u0019ù\u0084ø¤´Ô zeìö\u001b\\÷\u0002ÿê\u008eõB\u001e\u0018:\u0010\u0090\u001d$\u0013¹\u0092t\u009eÓ\u0000\u000fÀã¯>\u008c\u0010'\u0019ÊVjéÌ\u001d\u0096\u00182t\t~(Ö\u0018\u001fÑos\u0015\u009b\u008dQ æ¦ÄíS²\u009eûc\u0012atÄ\u0019ý\u0010Ü®èÒq\u0004Ø:~^YÖ\u008d,¹ô0\u0081a^\t]\u0002Pø\u009dÊR=\u0012\u009e-£\u009fæè\u000eæV\u0000\u0003ÎvÁ9í\u0085\u00adü\u0084\u0017®YÅÔ\u000eíOM_ùo´ç! \u0092ùáÕÑ\u008cc\u0006\u0081èÔMB\u0018\u0007\u007f\n\u009b÷Ú: üMºªUÓ\u0013©\u009d§\u0018êT9aCS÷+2ÑÀüüÐÇ¿\u0087§DÏÊÓµ\u000b\u0010¢&\u009a\u0014@\u0092û*b\u001a$¹\u009d|z}0ä\u0015\u008b\b÷ÝE\u0093\u0007ë\u000bË\u009aå[ÑeæêëÎÙ\u001f¾ýDL4\u0003\u000fÄiÛü\u0094Ä8Ø\u00892X'\u00862i0\u0094G jÿ\baÌd}½ {\u0002\u0010]\u000eÂ\u0002\u001b\u009d\u0093\u0018âM«B\u0012ÔUoàg*ò\u0010å\u0084Ä\u0016Ô\u0004-Nm»MÚªGä\n\u00108^é§ \u0096\u0010+\u0095`Å;\\fèâ";
      int var17 = "]\u0016îÓ\u0087q\u0081ÅÂ´ÁUt\u009cá|î\u0005áü\u0005J\u0098&\u0010ÙÁ×N¸\bv§\u0081\u0015=õ\u0091\u0098\u0086f\u0018\u0019ù\u0084ø¤´Ô zeìö\u001b\\÷\u0002ÿê\u008eõB\u001e\u0018:\u0010\u0090\u001d$\u0013¹\u0092t\u009eÓ\u0000\u000fÀã¯>\u008c\u0010'\u0019ÊVjéÌ\u001d\u0096\u00182t\t~(Ö\u0018\u001fÑos\u0015\u009b\u008dQ æ¦ÄíS²\u009eûc\u0012atÄ\u0019ý\u0010Ü®èÒq\u0004Ø:~^YÖ\u008d,¹ô0\u0081a^\t]\u0002Pø\u009dÊR=\u0012\u009e-£\u009fæè\u000eæV\u0000\u0003ÎvÁ9í\u0085\u00adü\u0084\u0017®YÅÔ\u000eíOM_ùo´ç! \u0092ùáÕÑ\u008cc\u0006\u0081èÔMB\u0018\u0007\u007f\n\u009b÷Ú: üMºªUÓ\u0013©\u009d§\u0018êT9aCS÷+2ÑÀüüÐÇ¿\u0087§DÏÊÓµ\u000b\u0010¢&\u009a\u0014@\u0092û*b\u001a$¹\u009d|z}0ä\u0015\u008b\b÷ÝE\u0093\u0007ë\u000bË\u009aå[ÑeæêëÎÙ\u001f¾ýDL4\u0003\u000fÄiÛü\u0094Ä8Ø\u00892X'\u00862i0\u0094G jÿ\baÌd}½ {\u0002\u0010]\u000eÂ\u0002\u001b\u009d\u0093\u0018âM«B\u0012ÔUoàg*ò\u0010å\u0084Ä\u0016Ô\u0004-Nm»MÚªGä\n\u00108^é§ \u0096\u0010+\u0095`Å;\\fèâ".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var23 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var23.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  g = new String[17];
                  l = new HashMap(13);
                  Cipher var0;
                  var22 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "\u0087+\u009fÙmH©´¼\u0004¤FÕ\u0016D\u0016";
                  int var5 = "\u0087+\u009fÙmH©´¼\u0004¤FÕ\u0016D\u0016".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     long[] var26 = var6;
                     var27 = var3++;
                     long var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var32 = -1;

                     while(true) {
                        long var8 = var31;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var34 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var32) {
                        case 0:
                           var26[var27] = var34;
                           if (var2 >= var5) {
                              j = var6;
                              k = new Integer[4];
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "d\u0007\u009b\u0005ëÉzü]\u0096S\u000bi:\u009aÈ";
                           var5 = "d\u0007\u009b\u0005ëÉzü]\u0096S\u000bi:\u009aÈ".length();
                           var2 = 0;
                        }

                        var27 = var2;
                        var2 += 8;
                        var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        var26 = var6;
                        var27 = var3++;
                        var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var32 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "B*à[vu\u0016\u008dä\u0015ïómp$¯Ï;s !NÜ-\u0082\fä\u0098¾Ã3¨\u0010àÂÐcw¹Öö¯ßÈrÏzÛ\u0018";
               var17 = "B*à[vu\u0016\u008dä\u0015ïómp$¯Ï;s !NÜ-\u0082\fä\u0098¾Ã3¨\u0010àÂÐcw¹Öö¯ßÈrÏzÛ\u0018".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7250;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ft", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("su/catlean/ft" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32562;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ft", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("su/catlean/ft" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
