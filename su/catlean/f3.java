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
import net.minecraft.class_1792;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class f3 {
   @NotNull
   private final class_1792 X;
   private final int E;
   private final int s;
   private final int b;
   private static final long a = j0.a(4655106173839431148L, 4137051805625269161L, MethodHandles.lookup().lookupClass()).a(238674723233797L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public f3(@NotNull class_1792 item, int price, int lowestPrice, long a, int id) {
      var4 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(11208, 3049877623278387711L ^ var4));
      super();
      this.X = var1;
      this.E = var2;
      this.s = var3;
      this.b = var6;
   }

   @NotNull
   public final class_1792 K() {
      return this.X;
   }

   public final int U() {
      return this.E;
   }

   public final int t() {
      return this.s;
   }

   public final int m() {
      return this.b;
   }

   @NotNull
   public final class_1792 s() {
      return this.X;
   }

   public final int l() {
      return this.E;
   }

   public final int d() {
      return this.s;
   }

   public final int o() {
      return this.b;
   }

   @NotNull
   public final f3 u(@NotNull class_1792 item, int price, int lowestPrice, long a, int id) {
      var4 ^= a;
      long var7 = var4 ^ 117715174071775L;
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(12547, 941706694902694133L ^ var4));
      return new f3(var1, var2, var3, var7, var6);
   }

   public static f3 a(f3 param0, class_1792 param1, int param2, int param3, int param4, int param5, Object param6, long param7) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 20947037347306L;
      int var3 = this.b;
      int var4 = this.s;
      int var5 = this.E;
      class_1792 var6 = this.X;
      String var10000 = 3788.h<invokedynamic>(3788, 419223818766965435L ^ var1);
      return var10000 + var6 + true.h<invokedynamic>(19429, 7732391100423085968L ^ var1) + var5 + true.h<invokedynamic>(5864, 6229632255073862300L ^ var1) + var4 + true.h<invokedynamic>(18350, 6791976683306226648L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 21628680884451L;
      String[] var10000 = 6291706502786171497L.A<invokedynamic>(6291706502786171497L, var1);
      int var4 = this.X.hashCode();
      var4 = var4 * true.t<invokedynamic>(11427, 306425166691818172L ^ var1) + Integer.hashCode(this.E);
      var4 = var4 * true.t<invokedynamic>(19744, 6933447767109647166L ^ var1) + Integer.hashCode(this.s);
      String[] var3 = var10000;
      var4 = var4 * true.t<invokedynamic>(19744, 6933447767109647166L ^ var1) + Integer.hashCode(this.b);

      try {
         if (var3 != null) {
            (new int[1]).A<invokedynamic>(new int[1], 6327744545607488619L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 6279583520543808498L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 43088129038119L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[6];
      int var18 = 0;
      String var17 = "«\u008b\u0016ªÕ\r{Ì÷×\u0094@ãmòG Æ{j\u0007so8!\u0098÷\u0088\u000bT\u0005Uûí)%§£uÏ³¯\u0019§_\u0080²\u0001È Û\u008fß@ÓÎ\u0002Öã\u0095-ï\u0017ë\u0084I\u009cü\\\u0007» \u0085\u00adæúþ\u0097\u0002ý\"4\u0018YK¶9øÊ¬\u001b$Õ)¢^nÃ&QpfÉ×á\u0082·";
      int var19 = "«\u008b\u0016ªÕ\r{Ì÷×\u0094@ãmòG Æ{j\u0007so8!\u0098÷\u0088\u000bT\u0005Uûí)%§£uÏ³¯\u0019§_\u0080²\u0001È Û\u008fß@ÓÎ\u0002Öã\u0095-ï\u0017ë\u0084I\u009cü\\\u0007» \u0085\u00adæúþ\u0097\u0002ý\"4\u0018YK¶9øÊ¬\u001b$Õ)¢^nÃ&QpfÉ×á\u0082·".length();
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
                  d = new String[6];
                  h = new HashMap(13);
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
                  String var4 = "D-´Üs5\u0003¸åp\u0018iÐa?\r+Xñ1\t\u0089@Ë";
                  int var5 = "D-´Üs5\u0003¸åp\u0018iÐa?\r+Xñ1\t\u0089@Ë".length();
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
                  g = new Integer[3];
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

               var17 = "ß¸Aä&ÕkY¢\u001aÏ\u0001\nª\u0001À\u0010\u009dÖ°ØP£üo`Y\u0092J9\b\u00015";
               var19 = "ß¸Aä&ÕkY¢\u001aÏ\u0001\nª\u0001À\u0010\u009dÖ°ØP£üo`Y\u0092J9\b\u00015".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3971;
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
            throw new RuntimeException("su/catlean/f3", var10);
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
         throw new RuntimeException("su/catlean/f3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8419;
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
            throw new RuntimeException("su/catlean/f3", var14);
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
         throw new RuntimeException("su/catlean/f3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
