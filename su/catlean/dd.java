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
import kotlin.reflect.KMutableProperty0;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class dd extends dx {
   private final float Y;
   @NotNull
   private String K;
   @NotNull
   private String r;
   @NotNull
   private KMutableProperty0 j;
   @NotNull
   private KMutableProperty0 a;
   private static final long b = j0.a(-4132430499161777027L, 2356852502496304642L, MethodHandles.lookup().lookupClass()).a(100144548754789L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public dd(float width, long a, @NotNull String first, @NotNull String second, @NotNull KMutableProperty0 ref, @NotNull KMutableProperty0 hoverRef) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var4, true.u<invokedynamic>(25128, 3596051377969001013L ^ var2));
      Intrinsics.checkNotNullParameter(var5, true.u<invokedynamic>(29629, 771273632344597423L ^ var2));
      Intrinsics.checkNotNullParameter(var6, true.u<invokedynamic>(20849, 7375971993681674594L ^ var2));
      Intrinsics.checkNotNullParameter(var7, true.u<invokedynamic>(31991, 4108996581145504992L ^ var2));
      super();
      this.Y = var1;
      this.K = var4;
      this.r = var5;
      this.j = var6;
      this.a = var7;
   }

   public void D(@NotNull class_332 context, long a, float x, float y, float mouseX, float mouseY) {
      // $FF: Couldn't be decompiled
   }

   public boolean y(float x, long a, float y, int button) {
      int[] var6 = -5824728991452674560L.A<invokedynamic>(-5824728991452674560L, var2);

      KMutableProperty0 var10000;
      boolean var10001;
      label22: {
         label21: {
            try {
               var10000 = this.j;
               var10001 = (Boolean)this.j.get();
               if (var6 == null) {
                  break label22;
               }

               if (!var10001) {
                  break label21;
               }
            } catch (NumberFormatException var7) {
               throw var7.A<invokedynamic>(var7, -5834813899385982532L, var2);
            }

            var10001 = false;
            break label22;
         }

         var10001 = true;
      }

      var10000.set(var10001);
      return false;
   }

   static {
      long var11 = b ^ 88325167145740L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[10];
      int var18 = 0;
      String var17 = "\u001b\u000b$æ\u0083\f¹ñ*=&óR[±V õ\u009féð\u0097ýÅ0\u0083B`m\u0081³bÄ\u0083l}½\u0006s*é\u0091¯úä¯\u0010-« Ìï\u0007\u009b«3£\u0001\u0089¢«m\bs¢_\u0094n×÷9j\u00939(\u0082^?Áy\u009d\r «;\u0016*ä2Cè Ö\u0081ÝÞd\f8.O\u0000\u0016s5¶\u008eËT:Gbúµ\u0080 >Ë\u0019]¯6¡ã\u0006³íi¸*ZÆ¢*f\u0082[\u009b×a\u009c\u0088-\u0005ÕK@A\u0010z\u0091fzÛ\u001dÏ×L>°=8`\u0082Z\u0010\u0005\u0081ZxÄ\u0006þA\u0083\u001b\u008a\u0013yv²\u008a\u0010âsÞå\u0004)(»ú\u009b¢\u0012R\u0014\u009c\u001a";
      int var19 = "\u001b\u000b$æ\u0083\f¹ñ*=&óR[±V õ\u009féð\u0097ýÅ0\u0083B`m\u0081³bÄ\u0083l}½\u0006s*é\u0091¯úä¯\u0010-« Ìï\u0007\u009b«3£\u0001\u0089¢«m\bs¢_\u0094n×÷9j\u00939(\u0082^?Áy\u009d\r «;\u0016*ä2Cè Ö\u0081ÝÞd\f8.O\u0000\u0016s5¶\u008eËT:Gbúµ\u0080 >Ë\u0019]¯6¡ã\u0006³íi¸*ZÆ¢*f\u0082[\u009b×a\u009c\u0088-\u0005ÕK@A\u0010z\u0091fzÛ\u001dÏ×L>°=8`\u0082Z\u0010\u0005\u0081ZxÄ\u0006þA\u0083\u001b\u008a\u0013yv²\u008a\u0010âsÞå\u0004)(»ú\u009b¢\u0012R\u0014\u009c\u001a".length();
      char var16 = 16;
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
                  c = var20;
                  d = new String[10];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "\\ÒBÇéÌ¸¾\u009eo\u0007!ÂFOô";
                  int var5 = "\\ÒBÇéÌ¸¾\u009eo\u0007!ÂFOô".length();
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

                  f = var6;
                  g = new Integer[2];
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

               var17 = "Ø\u001f\u001d#\u008a1]ÜP÷Ã\u0098¬Uc¬\u0010/ô5ÝÏ¸yÆ\u0003\r@\u0091¸³\u0000\u008b";
               var19 = "Ø\u001f\u001d#\u008a1]ÜP÷Ã\u0098¬Uc¬\u0010/ô5ÝÏ¸yÆ\u0003\r@\u0091¸³\u0000\u008b".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30937;
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
            throw new RuntimeException("su/catlean/dd", var10);
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
         throw new RuntimeException("su/catlean/dd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1075;
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
            throw new RuntimeException("su/catlean/dd", var14);
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
         throw new RuntimeException("su/catlean/dd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
