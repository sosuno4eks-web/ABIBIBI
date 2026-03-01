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
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ck {
   private long m;
   private int H;
   @NotNull
   private class_243 d;
   private boolean O;
   private double l;
   private static final long a = j0.a(8049851982262400327L, 5933345897234397510L, MethodHandles.lookup().lookupClass()).a(161306420508015L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final long i;

   public ck(long time, int attempts, @NotNull class_243 pos, long a, boolean place) {
      var5 ^= a;
      long var8 = var5 ^ 37455060235570L;
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(7987, 9213668574319413354L ^ var5));
      super();
      this.m = var1;
      this.H = var3;
      this.d = var4;
      this.O = var7;
      this.l = s8.f(var8).method_5707(this.d);
   }

   public final long w() {
      return this.m;
   }

   public final void R(long <set-?>) {
      this.m = var1;
   }

   @NotNull
   public final class_243 b() {
      return this.d;
   }

   public final void O(long a, @NotNull class_243 <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(13109, 3123894772722533651L ^ var1));
      this.d = var3;
   }

   public final boolean x() {
      return this.O;
   }

   public final void d(boolean <set-?>) {
      this.O = var1;
   }

   public final double f() {
      return this.l;
   }

   public final void h(double <set-?>) {
      this.l = var1;
   }

   public final boolean N(short param1, char param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final void d(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean r(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final long H() {
      return this.m;
   }

   private final int m() {
      return this.H;
   }

   @NotNull
   public final class_243 k() {
      return this.d;
   }

   public final boolean X() {
      return this.O;
   }

   @NotNull
   public final ck i(long time, int attempts, @NotNull class_243 pos, boolean place, int a, int a, char a) {
      long var9 = ((long)var6 << 32 | (long)var7 << 48 >>> 32 | (long)var8 << 48 >>> 48) ^ a;
      long var11 = var9 ^ 81686574250997L;
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(20181, 564797150409545264L ^ var9));
      return new ck(var1, var3, var4, var11, var5);
   }

   // $FF: synthetic method
   public static ck Q(ck param0, long param1, int param3, class_243 param4, boolean param5, int param6, long param7, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 82825549844152L;
      boolean var3 = this.O;
      class_243 var4 = this.d;
      int var5 = this.H;
      long var6 = this.m;
      String var10000 = 3384.i<invokedynamic>(3384, 8723321947681904554L ^ var1);
      return var10000 + var6 + true.i<invokedynamic>(20470, 1717501097259767146L ^ var1) + var5 + true.i<invokedynamic>(23587, 4878132096851183282L ^ var1) + var4 + true.i<invokedynamic>(26258, 6297462503531625487L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 84191528852139L;
      int var3 = Long.hashCode(this.m);
      var3 = var3 * true.q<invokedynamic>(23718, 8750780506775317728L ^ var1) + Integer.hashCode(this.H);
      var3 = var3 * true.q<invokedynamic>(10002, 6806933527980873558L ^ var1) + this.d.hashCode();
      var3 = var3 * true.q<invokedynamic>(10002, 6806933527980873558L ^ var1) + Boolean.hashCode(this.O);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = a ^ 42806941390587L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[11];
      int var23 = 0;
      String var22 = "\u001a´©d\u0085hEægÕ½\u009ajéÂ\u00838à¡ð\u0096®Z{g\u0001\u0018Ú\u000f»\u001cû®óRí\u001dË|ìr\u000bvègDyô\u008e\u0003¶\u0007i^\u0086ñÎ\u009d\u0005æËP±î>z\u0086Òá\u000f\b§ô\u0010HÍø¾?W\u001eß9\u008e6¾\u009b\nCw(2¡ÒØw÷\u00111¡\u0089\u0080ñu\u0082ý]SÁ\u0002\u008c\f\u0014]+Ú|AöÿC\u0099pò©!0d½<\u0082\u0010\u0097R°æå`<áe\u0090\u0014Øx¬Ê?\u0010¤\u00ad\r\u0092X§\u0015s\u0098\u0096\u0016&\u0017¨\u008e* \u0081\u0088\u008a~½\u009f²\u008a/8¯\u0091s¦_¹E\u001fv+tw\u0000\u0019\t¶¼î?ùGì\u0010ò,Ù\u0098\r\u001aâD1\u0099\f\u001bÃPYY\u0018æ/V\u00adY¹ø»v\u009b\u009e`3¸ Ü\u0011ò\u008f\u000e>å¦$";
      int var24 = "\u001a´©d\u0085hEægÕ½\u009ajéÂ\u00838à¡ð\u0096®Z{g\u0001\u0018Ú\u000f»\u001cû®óRí\u001dË|ìr\u000bvègDyô\u008e\u0003¶\u0007i^\u0086ñÎ\u009d\u0005æËP±î>z\u0086Òá\u000f\b§ô\u0010HÍø¾?W\u001eß9\u008e6¾\u009b\nCw(2¡ÒØw÷\u00111¡\u0089\u0080ñu\u0082ý]SÁ\u0002\u008c\f\u0014]+Ú|AöÿC\u0099pò©!0d½<\u0082\u0010\u0097R°æå`<áe\u0090\u0014Øx¬Ê?\u0010¤\u00ad\r\u0092X§\u0015s\u0098\u0096\u0016&\u0017¨\u008e* \u0081\u0088\u008a~½\u009f²\u008a/8¯\u0091s¦_¹E\u001fv+tw\u0000\u0019\t¶¼î?ùGì\u0010ò,Ù\u0098\r\u001aâD1\u0099\f\u001bÃPYY\u0018æ/V\u00adY¹ø»v\u009b\u009e`3¸ Ü\u0011ò\u008f\u000e>å¦$".length();
      char var21 = 16;
      int var20 = -1;

      label56:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = a(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var32;
               if ((var20 += var21) >= var24) {
                  b = var25;
                  c = new String[11];
                  h = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[3];
                  int var8 = 0;
                  String var9 = "\u0093ëvP¹\f\u0099Ù»_bq\u001aRo\u0089+\u0012\u000eÄâ\u009et\u0099";
                  int var10 = "\u0093ëvP¹\f\u0099Ù»_bq\u001aRo\u0089+\u0012\u000eÄâ\u009et\u0099".length();
                  int var7 = 0;

                  do {
                     int var30 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var30, var7).getBytes("ISO-8859-1");
                     var30 = var8++;
                     long var13 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                     long var10004 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                     boolean var35 = true;
                     var11[var30] = var10004;
                  } while(var7 < var10);

                  f = var11;
                  g = new Integer[3];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 6877198376778231137L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var33 = true;
                  i = var36;
                  return;
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var32;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label56;
               }

               var22 = ",N¿q´±'U:=\u001bA9\u0016\u008e\u0097Sq¥RXF¦¾(\u0007ùÆ¿.2ä\u0010Tü\u0082e¤Gòå\u00ady\u0012ÒÝæe>";
               var24 = ",N¿q´±'U:=\u001bA9\u0016\u008e\u0097Sq¥RXF¦¾(\u0007ùÆ¿.2ä\u0010Tü\u0082e¤Gòå\u00ady\u0012ÒÝæe>".length();
               var21 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24673;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ck", var10);
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
         throw new RuntimeException("su/catlean/ck" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7840;
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
            throw new RuntimeException("su/catlean/ck", var14);
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
         throw new RuntimeException("su/catlean/ck" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
