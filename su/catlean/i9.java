package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class i9 {
   private final int i;
   private final int e;
   @NotNull
   private final List f;
   private boolean K;
   private static String[] v;
   private static final long a = j0.a(393086863770650136L, 6145353923624714618L, MethodHandles.lookup().lookupClass()).a(234564745669073L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map j;

   public i9(int x, int z, int a, @NotNull List list, char a, boolean recalc, char a) {
      long var8 = ((long)var3 << 32 | (long)var5 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var4, true.m<invokedynamic>(20073, 1230687305217144942L ^ var8));
      super();
      this.i = var1;
      this.e = var2;
      this.f = var4;
      this.K = var6;
   }

   // $FF: synthetic method
   public i9(int var1, int var2, List var3, boolean var4, int var5, DefaultConstructorMarker var6, long var7) {
      var7 ^= a;
      long var10001 = var7 ^ 5835701279626L;
      int var9 = (int)((var7 ^ 5835701279626L) >>> 32);
      int var10 = (int)(var10001 << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      if ((var5 & true.s<invokedynamic>(11174, 1536669380772134893L ^ var7)) != 0) {
         var4 = false;
      }

      this(var1, var2, var9, var3, (char)var10, var4, (char)var11);
   }

   public final int u() {
      return this.i;
   }

   public final int a() {
      return this.e;
   }

   @NotNull
   public final List c() {
      return this.f;
   }

   public final boolean W() {
      return this.K;
   }

   public final void S(boolean <set-?>) {
      this.K = var1;
   }

   public final int R() {
      return this.i;
   }

   public final int F() {
      return this.e;
   }

   @NotNull
   public final List s() {
      return this.f;
   }

   public final boolean q() {
      return this.K;
   }

   @NotNull
   public final i9 O(int x, int z, long a, @NotNull List list, boolean recalc) {
      var3 ^= a;
      long var10001 = var3 ^ 116677555406836L;
      int var7 = (int)((var3 ^ 116677555406836L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var5, true.m<invokedynamic>(26560, 7425678588545320270L ^ var3));
      return new i9(var1, var2, var7, var5, (char)var8, var6, (char)var9);
   }

   // $FF: synthetic method
   public static i9 T(i9 param0, int param1, int param2, long param3, List param5, boolean param6, int param7, Object param8) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 77768644060838L;
      boolean var3 = this.K;
      List var4 = this.f;
      int var5 = this.e;
      int var6 = this.i;
      String var10000 = 32321.m<invokedynamic>(32321, 4588466687812780555L ^ var1);
      return var10000 + var6 + true.m<invokedynamic>(25, 8209822196264385617L ^ var1) + var5 + true.m<invokedynamic>(5310, 7444975797444978928L ^ var1) + var4 + true.m<invokedynamic>(23352, 7482288899441190775L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 46383157122753L;
      int var3 = Integer.hashCode(this.i);
      var3 = var3 * true.s<invokedynamic>(23130, 7961238688239910095L ^ var1) + Integer.hashCode(this.e);
      var3 = var3 * true.s<invokedynamic>(19955, 8739877847684705127L ^ var1) + this.f.hashCode();
      var3 = var3 * true.s<invokedynamic>(19955, 8739877847684705127L ^ var1) + Boolean.hashCode(this.K);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public static void u(String[] var0) {
      v = var0;
   }

   public static String[] X() {
      return v;
   }

   static {
      long var20 = a ^ 43488820075443L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, 5315961528682545187L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[6];
      int var16 = 0;
      String var15 = "\u0093ÕÁëÍ\u009dÔ÷\u0087-¬\u009dç\u0014<YÎ)\u00020\u0007RW¨\u0010É\u001a\u0083\u0007#?Þý~\u0017\u009fÇ§Ø\u0087\u0003\u0010ZA\u009e\u008fÕ*/\u008fï^ø\u0098\u0088áêi\u0010½\u001d¹ö¾¥\u001fî\u0089\u008a8\u0090'èÛ$";
      int var17 = "\u0093ÕÁëÍ\u009dÔ÷\u0087-¬\u009dç\u0014<YÎ)\u00020\u0007RW¨\u0010É\u001a\u0083\u0007#?Þý~\u0017\u009fÇ§Ø\u0087\u0003\u0010ZA\u009e\u008fÕ*/\u008fï^ø\u0098\u0088áêi\u0010½\u001d¹ö¾¥\u001fî\u0089\u008a8\u0090'èÛ$".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var28;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[6];
                  j = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "\u000fVj\u001f\rÍå´;{\u0094#\u001dýÞ\u0081";
                  int var5 = "\u000fVj\u001f\rÍå´;{\u0094#\u001dýÞ\u0081".length();
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
                              g = var6;
                              h = new Integer[4];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "GÆ}\u008eùT,t\u001e`Ñ}\u0090iÒA";
                           var5 = "GÆ}\u008eùT,t\u001e`Ñ}\u0090iÒA".length();
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

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var28;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u001b\u0006ªXw\u0084HÞ\n2\u0092\u0099\u009d\u001a\u0082L \u0083§yi\u001aò¿Ì1r:³\u0018\u00124d\u0082A-[¼.Î)ñpva ,Çi";
               var17 = "\u001b\u0006ªXw\u0084HÞ\n2\u0092\u0099\u009d\u001a\u0082L \u0083§yi\u001aò¿Ì1r:³\u0018\u00124d\u0082A-[¼.Î)ñpva ,Çi".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2451;
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
            throw new RuntimeException("su/catlean/i9", var10);
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
         throw new RuntimeException("su/catlean/i9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25385;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/i9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("su/catlean/i9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
