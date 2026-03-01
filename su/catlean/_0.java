package su.catlean;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;

public final class _0 {
   @NotNull
   public static final _0 P;
   @NotNull
   private static final ConcurrentHashMap e;
   @NotNull
   private static final ConcurrentHashMap q;
   @NotNull
   private static final class_2960 n;
   private static int R;
   private static final long a = j0.a(5510980684998063454L, 4905631597437325377L, MethodHandles.lookup().lookupClass()).a(171107702391506L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   private _0() {
   }

   @NotNull
   public final class_2960 y(int a, int a, @NotNull String url, int a) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      String var10000 = 1555302386392167949L.A<invokedynamic>(1555302386392167949L, var5);
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(6079, 487171300195948711L ^ var5));
      String var7 = var10000;

      Object var12;
      label22: {
         Object var10001;
         label21: {
            try {
               var12 = (class_2960)e.get(var3);
               var10001 = var12;
               if (var7 != null) {
                  break label21;
               }

               if (var12 != null) {
                  break label22;
               }
            } catch (NumberFormatException var11) {
               throw var11.A<invokedynamic>(var11, 1460616319952788643L, var5);
            }

            var12 = q.computeIfAbsent(var3, _0::c);
            var10001 = var12;
         }

         Intrinsics.checkNotNullExpressionValue(var10001, true.i<invokedynamic>(8173, 7066179907918024952L ^ var5));
         CompletableFuture var8 = (CompletableFuture)var12;
         return n;
      }

      Object var9 = var12;
      boolean var10 = false;
      return (class_2960)var9;
   }

   @NotNull
   public final BufferedImage A(char a, int a, @NotNull BufferedImage image, int a) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(26039, 2774777547931847526L ^ var5));
      int var7 = var3.getWidth();
      int var8 = var3.getHeight();
      int var9 = Math.min(var7, var8);
      int var10 = (var7 - var9) / 2;
      int var11 = (var8 - var9) / 2;
      BufferedImage var10000 = var3.getSubimage(var10, var11, var9, var9);
      Intrinsics.checkNotNullExpressionValue(var10000, true.i<invokedynamic>(30582, 8338907543421852064L ^ var5));
      return var10000;
   }

   @NotNull
   public final class_1011 D(@NotNull class_1011 image, long a) {
      // $FF: Couldn't be decompiled
   }

   private static final String L(int var0) {
      long var1 = a ^ 58669180408394L;
      String var10002 = true.i<invokedynamic>(19792, 7142429384131405689L ^ var1);
      return var10002 + var0;
   }

   private static final void z(class_2960 var0, class_1011 var1, String var2, CompletableFuture var3, int var4) {
      long var5 = a ^ 118269573195420L;
      long var10001 = var5 ^ 32360916137554L;
      int var7 = (int)((var5 ^ 32360916137554L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      s8.H((short)var7, (short)var8, var9).method_1531().method_4616(var0, (class_1044)(new class_1043(_0::L, var1)));
      ((Map)e).put(var2, var0);
      var3.complete(var0);
      q.remove(var2);
   }

   private static final void M(String var0, CompletableFuture var1) {
      long var2 = a ^ 110975069663065L;
      long var10001 = var2 ^ 19860978925463L;
      int var4 = (int)((var2 ^ 19860978925463L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 89841708611650L;

      try {
         int var10000 = (int)(Random.Default.nextFloat() * (float)true.t<invokedynamic>(4915, 3570853741261568669L ^ var2));
         String var10002 = true.i<invokedynamic>(16295, 6456142013197805718L ^ var2);
         class_2960 var9 = hp.O(var7, var10002 + var10000);
         InputStream var10 = URI.create(var0).toURL().openStream();
         class_1011 var14 = class_1011.method_4309(var10);
         Intrinsics.checkNotNullExpressionValue(var14, true.i<invokedynamic>(20759, 2840135814598362656L ^ var2));
         class_1011 var11 = var14;
         _0 var15 = P;
         ++R;
         int var12 = R;
         s8.H((short)var4, (short)var5, var6).execute(_0::z);
      } catch (Exception var13) {
         var1.complete(n);
         q.remove(var0);
      }

   }

   private static final CompletableFuture W(String var0, String var1) {
      long var2 = a ^ 62532515291008L;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(31007, 7655607350935248637L ^ var2));
      CompletableFuture var4 = new CompletableFuture();
      boolean var6 = false;
      (new Thread(_0::M)).start();
      return var4;
   }

   private static final CompletableFuture c(Function1 var0, Object var1) {
      return (CompletableFuture)var0.invoke(var1);
   }

   static {
      long var20 = a ^ 42977312418302L;
      long var22 = var20 ^ 109108670934011L;
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[11];
      int var16 = 0;
      String var15 = "-pà²\u0007\u0080²Ñ¬Õ\u000fIoe:6\u0010\u0097\t\u000bÚª\u008eÅA\t\u009d6\u00876;\u0005Ä ²ÜÃ\u0012×þ}jgº\u0018Q \\\u0089ª·\u0081Ö\u00ad\u0093\"\u0017\u001aÈë\u0006C\f\u0006Ë\u0015\u0010\u0097]5Ý\u0090\u0016®\u0014Å=a\u0006\u008cêX\n\u0018¨u\u00ad\u009cú\u0002\u0083ä\u0003\u0002g\u0006Ë¼\rt\u0086\u0018ýéÿ\u000e \u009308¯0¬\u0016<:º\fZö\\\u001bOçû\u0011|U«·ÈZ²\u001fþòAáéçÓ\u0099\u00164L«½Oêøc\t@m*á\u0010(\u008e8Â{V\u008aW\fÇ`xü-\u008e2a\u000b\u0004Q\u009eÞBüBÇVNìbuÊÚ£Ð\u007f\u001a\u0091Ìyè0\u009ez\u0003P\u008e\u0088\u007fÏ£\u009eÞÒË\u0089®J\"¡®\u0080íÇÒÓ±§\u0094\u001d¬cs£ñUÏã\u0096k!vf¹\u0080åÎÿõ\u0019\u0010Î\u0001qDÜ¶q\u0097¹È\u0018W\u0014% ¥";
      int var17 = "-pà²\u0007\u0080²Ñ¬Õ\u000fIoe:6\u0010\u0097\t\u000bÚª\u008eÅA\t\u009d6\u00876;\u0005Ä ²ÜÃ\u0012×þ}jgº\u0018Q \\\u0089ª·\u0081Ö\u00ad\u0093\"\u0017\u001aÈë\u0006C\f\u0006Ë\u0015\u0010\u0097]5Ý\u0090\u0016®\u0014Å=a\u0006\u008cêX\n\u0018¨u\u00ad\u009cú\u0002\u0083ä\u0003\u0002g\u0006Ë¼\rt\u0086\u0018ýéÿ\u000e \u009308¯0¬\u0016<:º\fZö\\\u001bOçû\u0011|U«·ÈZ²\u001fþòAáéçÓ\u0099\u00164L«½Oêøc\t@m*á\u0010(\u008e8Â{V\u008aW\fÇ`xü-\u008e2a\u000b\u0004Q\u009eÞBüBÇVNìbuÊÚ£Ð\u007f\u001a\u0091Ìyè0\u009ez\u0003P\u008e\u0088\u007fÏ£\u009eÞÒË\u0089®J\"¡®\u0080íÇÒÓ±§\u0094\u001d¬cs£ñUÏã\u0096k!vf¹\u0080åÎÿõ\u0019\u0010Î\u0001qDÜ¶q\u0097¹È\u0018W\u0014% ¥".length();
      char var14 = 16;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[11];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "X\u00009lT@Û\u0097ú©ÅÊXväö·Z¹$\u0019Ö´ß";
                  int var5 = "X\u00009lT@Û\u0097ú©ÅÊXväö·Z¹$\u0019Ö´ß".length();
                  int var2 = 0;

                  do {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     var27 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var31 = true;
                     var6[var27] = var10004;
                  } while(var2 < var5);

                  f = var6;
                  g = new Integer[3];
                  P = new _0();
                  e = new ConcurrentHashMap();
                  q = new ConcurrentHashMap();
                  n = hp.o(var22, true.i<invokedynamic>(9745, 3379604307997521797L ^ var20), true.i<invokedynamic>(16298, 9163741763874188859L ^ var20));
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "\u009f\u0095Ñ\u007f.ør>Il·\u0089¡\u0085ËM\u0089Ô\u001cÝ\u00adÔoý$i\u0010tØe=µ\u0094\\ã7\u008e$ªJ\u0010V\b\u0090yð@\u0090ÎW¿Èsc\u0081,&";
               var17 = "\u009f\u0095Ñ\u007f.ør>Il·\u0089¡\u0085ËM\u0089Ô\u001cÝ\u00adÔoý$i\u0010tØe=µ\u0094\\ã7\u008e$ªJ\u0010V\b\u0090yð@\u0090ÎW¿Èsc\u0081,&".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23165;
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
            throw new RuntimeException("su/catlean/_0", var10);
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
         throw new RuntimeException("su/catlean/_0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9441;
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
            throw new RuntimeException("su/catlean/_0", var14);
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
         throw new RuntimeException("su/catlean/_0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
