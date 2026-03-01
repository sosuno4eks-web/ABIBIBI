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
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class qt {
   @NotNull
   private Object D;
   @Nullable
   private String X;
   @Nullable
   private String r;
   @Nullable
   private Pair o;
   @Nullable
   private Pair q;
   @Nullable
   private Pair w;
   @Nullable
   private Pair z;
   private static final long a = j0.a(6265714268811740916L, 46210460357064888L, MethodHandles.lookup().lookupClass()).a(63336425263824L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public qt(@NotNull Object draftId, @Nullable String details, @Nullable String state, long a, @Nullable Pair largeImage, @Nullable Pair smallImage, @Nullable Pair button1, @Nullable Pair button2) {
      var4 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.y<invokedynamic>(5369, 1914342585054312962L ^ var4));
      super();
      this.D = var1;
      this.X = var2;
      this.r = var3;
      this.o = var6;
      this.q = var7;
      this.w = var8;
      this.z = var9;
   }

   // $FF: synthetic method
   public qt(Object var1, String var2, String var3, Pair var4, Pair var5, Pair var6, Pair var7, long var8, int var10, DefaultConstructorMarker var11) {
      var8 ^= a;
      long var12 = var8 ^ 59688807759071L;
      String var14 = -6664373539802965475L.A<invokedynamic>(-6664373539802965475L, var8);
      if ((var10 & 1) != 0) {
         var1 = 0;
      }

      if ((var10 & 2) != 0) {
         var2 = null;
      }

      if ((var10 & 4) != 0) {
         var3 = null;
      }

      if ((var10 & true.c<invokedynamic>(30064, 5256094438229281162L ^ var8)) != 0) {
         var4 = null;
      }

      if ((var10 & true.c<invokedynamic>(3019, 5185345918044534582L ^ var8)) != 0) {
         var5 = null;
      }

      if ((var10 & true.c<invokedynamic>(5331, 1422379008751527978L ^ var8)) != 0) {
         var6 = null;
      }

      if ((var10 & true.c<invokedynamic>(28751, 5983007308205690036L ^ var8)) != 0) {
         var7 = null;
      }

      this(var1, var2, var3, var12, var4, var5, var6, var7);
      if (var14 == null) {
         (new int[5]).A<invokedynamic>(new int[5], -6747041012126096922L, var8);
      }

   }

   @NotNull
   public final Object b() {
      return this.D;
   }

   public final void m(@NotNull Object <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.y<invokedynamic>(21985, 6944996480419032699L ^ var2));
      this.D = var1;
   }

   @Nullable
   public final String M() {
      return this.X;
   }

   public final void p(@Nullable String <set-?>) {
      this.X = var1;
   }

   @Nullable
   public final String x() {
      return this.r;
   }

   public final void y(@Nullable String <set-?>) {
      this.r = var1;
   }

   @Nullable
   public final Pair Q() {
      return this.o;
   }

   public final void G(@Nullable Pair <set-?>) {
      this.o = var1;
   }

   @Nullable
   public final Pair l() {
      return this.q;
   }

   public final void n(@Nullable Pair <set-?>) {
      this.q = var1;
   }

   @Nullable
   public final Pair O() {
      return this.w;
   }

   public final void z(@Nullable Pair <set-?>) {
      this.w = var1;
   }

   @Nullable
   public final Pair q() {
      return this.z;
   }

   public final void O(@Nullable Pair <set-?>) {
      this.z = var1;
   }

   public qt(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 110623848176597L;
      this((Object)null, (String)null, (String)null, (Pair)null, (Pair)null, (Pair)null, (Pair)null, var3, true.c<invokedynamic>(30473, 3379296386642636240L ^ var1), (DefaultConstructorMarker)null);
   }

   static {
      long var11 = a ^ 54664849332556L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[2];
      int var18 = 0;
      String var17 = "¬¥v\u008e1åÀ§\u0084\u0090X:G\u000f¶\u0000\u0010\u009c²õ\u007f3È\nZB\u000b`Ü\u0012\u0095\r*";
      int var19 = "¬¥v\u008e1åÀ§\u0084\u0090X:G\u000f¶\u0000\u0010\u009c²õ\u007f3È\nZB\u000b`Ü\u0012\u0095\r*".length();
      char var16 = 16;
      int var15 = -1;

      while(true) {
         ++var15;
         byte[] var21 = var13.doFinal(var17.substring(var15, var15 + var16).getBytes("ISO-8859-1"));
         String var25 = a(var21).intern();
         boolean var10001 = true;
         var20[var18++] = var25;
         if ((var15 += var16) >= var19) {
            b = var20;
            c = new String[2];
            g = new HashMap(13);
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
            String var4 = "\u0016(\u001eÑÄX\u0096g-H-\u0085coµ\u0015\u0002,E\t0;Hô";
            int var5 = "\u0016(\u001eÑÄX\u0096g-H-\u0085coµ\u0015\u0002,E\t0;Hô".length();
            int var2 = 0;

            label32:
            while(true) {
               int var24 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
               long[] var22 = var6;
               var24 = var3++;
               long var27 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte var28 = -1;

               while(true) {
                  long var8 = var27;
                  byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                  long var31 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                  switch(var28) {
                  case 0:
                     var22[var24] = var31;
                     if (var2 >= var5) {
                        e = var6;
                        f = new Integer[5];
                        return;
                     }
                     break;
                  default:
                     var22[var24] = var31;
                     if (var2 < var5) {
                        continue label32;
                     }

                     var4 = "fú\u0084\u0007t\u008aï\u0097ÜuÈ\u0006ä\u0011\u0011\u008c";
                     var5 = "fú\u0084\u0007t\u008aï\u0097ÜuÈ\u0006ä\u0011\u0011\u008c".length();
                     var2 = 0;
                  }

                  var24 = var2;
                  var2 += 8;
                  var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                  var22 = var6;
                  var24 = var3++;
                  var27 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                  var28 = 0;
               }
            }
         }

         var16 = var17.charAt(var15);
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3232;
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
            throw new RuntimeException("su/catlean/qt", var10);
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
         throw new RuntimeException("su/catlean/qt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24456;
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
            throw new RuntimeException("su/catlean/qt", var14);
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
         throw new RuntimeException("su/catlean/qt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
