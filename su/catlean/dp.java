package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class dp {
   private float g;
   private float z;
   private float I;
   private final float i;
   private float p;
   private float t;
   private boolean d;
   private final float R;
   private final int A;
   private int V;
   private static int L;
   private static final long a = j0.a(7407509555095551507L, 2349680222401216285L, MethodHandles.lookup().lookupClass()).a(219263045388248L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] h;
   private static final Map j;

   public dp(float yaw, float prevYaw, float pitch, float radius, float alpha, float prevAlpha, boolean fadeIn, float spinSpeed, int lifeTime, int age) {
      this.g = var1;
      this.z = var2;
      this.I = var3;
      this.i = var4;
      this.p = var5;
      this.t = var6;
      this.d = var7;
      this.R = var8;
      this.A = var9;
      this.V = var10;
   }

   public dp(float var1, float var2, float var3, float var4, float var5, float var6, long var7, boolean var9, float var10, int var11, int var12, int var13, DefaultConstructorMarker var14) {
      var7 ^= a;
      if ((var13 & 2) != 0) {
         var2 = var1;
      }

      if ((var13 & true.c<invokedynamic>(19447, 4200524492614515325L ^ var7)) != 0) {
         var5 = 0.0F;
      }

      if ((var13 & true.c<invokedynamic>(8365, 5807899673832247587L ^ var7)) != 0) {
         var6 = 0.0F;
      }

      if ((var13 & true.c<invokedynamic>(6471, 3708865982308640962L ^ var7)) != 0) {
         var9 = true;
      }

      if ((var13 & true.c<invokedynamic>(12243, 4558998481121697370L ^ var7)) != 0) {
         var10 = 1.5F + ThreadLocalRandom.current().nextFloat() * 1.0F;
      }

      if ((var13 & true.c<invokedynamic>(2435, 6313116233702144007L ^ var7)) != 0) {
         var11 = ThreadLocalRandom.current().nextInt(true.c<invokedynamic>(10820, 4151768109128702917L ^ var7), true.c<invokedynamic>(15668, 369398205150121138L ^ var7));
      }

      if ((var13 & true.c<invokedynamic>(2515, 3078926376643491932L ^ var7)) != 0) {
         var12 = 0;
      }

      this(var1, var2, var3, var4, var5, var6, var9, var10, var11, var12);
   }

   public final float G() {
      return this.g;
   }

   public final void x(float <set-?>) {
      this.g = var1;
   }

   public final float B() {
      return this.z;
   }

   public final void I(float <set-?>) {
      this.z = var1;
   }

   public final float y() {
      return this.I;
   }

   public final void Q(float <set-?>) {
      this.I = var1;
   }

   public final float X() {
      return this.i;
   }

   public final float M() {
      return this.p;
   }

   public final void c(float <set-?>) {
      this.p = var1;
   }

   public final float S() {
      return this.t;
   }

   public final void s(float <set-?>) {
      this.t = var1;
   }

   public final boolean D() {
      return this.d;
   }

   public final void V(boolean <set-?>) {
      this.d = var1;
   }

   public final float j() {
      return this.R;
   }

   public final int s() {
      return this.A;
   }

   public final int p() {
      return this.V;
   }

   public final void C(int <set-?>) {
      this.V = var1;
   }

   public final float N() {
      return this.g;
   }

   public final float R() {
      return this.z;
   }

   public final float Z() {
      return this.I;
   }

   public final float E() {
      return this.i;
   }

   public final float O() {
      return this.p;
   }

   public final float v() {
      return this.t;
   }

   public final boolean m() {
      return this.d;
   }

   public final float F() {
      return this.R;
   }

   public final int b() {
      return this.A;
   }

   public final int i() {
      return this.V;
   }

   @NotNull
   public final dp f(float yaw, float prevYaw, float pitch, float radius, float alpha, float prevAlpha, boolean fadeIn, float spinSpeed, int lifeTime, int age) {
      return new dp(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public static dp R(dp param0, float param1, float param2, float param3, float param4, float param5, long param6, float param8, boolean param9, float param10, int param11, int param12, int param13, Object param14) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 10264268748225L;
      int var3 = this.V;
      int var4 = this.A;
      float var5 = this.R;
      boolean var6 = this.d;
      float var7 = this.t;
      float var8 = this.p;
      float var9 = this.i;
      float var10 = this.I;
      float var11 = this.z;
      float var12 = this.g;
      String var10000 = 16572.c<invokedynamic>(16572, 1705419678520235668L ^ var1);
      return var10000 + var12 + true.c<invokedynamic>(5396, 2818487291644871481L ^ var1) + var11 + true.c<invokedynamic>(5111, 2322723588532700638L ^ var1) + var10 + true.c<invokedynamic>(6033, 5630062604295242167L ^ var1) + var9 + true.c<invokedynamic>(10638, 7000467015850704809L ^ var1) + var8 + true.c<invokedynamic>(3366, 6414292919250328330L ^ var1) + var7 + true.c<invokedynamic>(1785, 4102564362423046358L ^ var1) + var6 + true.c<invokedynamic>(12555, 7804531704031586080L ^ var1) + var5 + true.c<invokedynamic>(21520, 6750300750148944446L ^ var1) + var4 + true.c<invokedynamic>(29122, 7833365632622356456L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 38518809593095L;
      int var4 = Float.hashCode(this.g);
      var4 = var4 * true.c<invokedynamic>(21508, 4879017975584853974L ^ var1) + Float.hashCode(this.z);
      var4 = var4 * true.c<invokedynamic>(3792, 4371292740419278089L ^ var1) + Float.hashCode(this.I);
      var4 = var4 * true.c<invokedynamic>(3792, 4371292740419278089L ^ var1) + Float.hashCode(this.i);
      int var10000 = -2446196090910888322L.A<invokedynamic>(-2446196090910888322L, var1);
      var4 = var4 * true.c<invokedynamic>(3792, 4371292740419278089L ^ var1) + Float.hashCode(this.p);
      var4 = var4 * true.c<invokedynamic>(3792, 4371292740419278089L ^ var1) + Float.hashCode(this.t);
      var4 = var4 * true.c<invokedynamic>(3792, 4371292740419278089L ^ var1) + Boolean.hashCode(this.d);
      var4 = var4 * true.c<invokedynamic>(3792, 4371292740419278089L ^ var1) + Float.hashCode(this.R);
      int var3 = var10000;
      var4 = var4 * true.c<invokedynamic>(3792, 4371292740419278089L ^ var1) + Integer.hashCode(this.A);
      var4 = var4 * true.c<invokedynamic>(3792, 4371292740419278089L ^ var1) + Integer.hashCode(this.V);

      try {
         if (var3 == 0) {
            (new int[1]).A<invokedynamic>(new int[1], -2409479741887013580L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -2416249964580663004L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public static void t(int var0) {
      L = var0;
   }

   public static int n() {
      return L;
   }

   public static int K() {
      int var0 = n();

      try {
         return var0 == 0 ? 114 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var20 = a ^ 48128459640297L;
      e = new HashMap(13);
      0.A<invokedynamic>(0, -2984614160477999502L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[10];
      int var16 = 0;
      String var15 = "FÕ\u0006ß\u009díìÝ.*\u0014½\u008a vä\u0003³Õj\u0011ëÕá\u0018Û¤* :¸ËÁ\u0084¤\u0086RÔ\u0080(\u009büc8Tw&D« \u0019 -K\u0085zt|-gø$N5F\u009e¨4Ý2õA]6Û±@\u0088þãk\u0014\u0018;¯ÎX\u001bUÇ±ææ+.F|cÀT¡sRÓò\u008cO\u0010Ù{Â\u0018NÕ\t-\u009f[os\u000f9N³ ª£lï\u0081j>xEïwiLÆ\u0084L=ø\u009262\u0004t\u0080\u008f;C\u0092¨¹¼\u0091 ×õ`\u009a\u0093|õ\u001cù{(BsAü\u0093$§§\u0095\u0095\râ\u0003\u0092w±\u0083Þø¼ñ ½\u001aí'¾hÉÝú\u001c\u008f«Ý\u000f\u0097\u0017 ¯+Ô\u0017fÍd\u0086\u0096soÇÖçä";
      int var17 = "FÕ\u0006ß\u009díìÝ.*\u0014½\u008a vä\u0003³Õj\u0011ëÕá\u0018Û¤* :¸ËÁ\u0084¤\u0086RÔ\u0080(\u009büc8Tw&D« \u0019 -K\u0085zt|-gø$N5F\u009e¨4Ý2õA]6Û±@\u0088þãk\u0014\u0018;¯ÎX\u001bUÇ±ææ+.F|cÀT¡sRÓò\u008cO\u0010Ù{Â\u0018NÕ\t-\u009f[os\u000f9N³ ª£lï\u0081j>xEïwiLÆ\u0084L=ø\u009262\u0004t\u0080\u008f;C\u0092¨¹¼\u0091 ×õ`\u009a\u0093|õ\u001cù{(BsAü\u0093$§§\u0095\u0095\râ\u0003\u0092w±\u0083Þø¼ñ ½\u001aí'¾hÉÝú\u001c\u008f«Ý\u000f\u0097\u0017 ¯+Ô\u0017fÍd\u0086\u0096soÇÖçä".length();
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
                  c = new String[10];
                  j = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[17];
                  int var3 = 0;
                  String var4 = "x\u0081\u0083\u0004òF²`\u007fÌn\u0096¼ê~\u008e\u001eêbÍN§O\u0096rkÚü\u008bHi¾\u0084]FªIH\u009aCDÔ\u000fÓÈ\u000fû ®\\2\u00adL_\u0094²9\u009c[\u0095Lë\u0007åÊPz\"l\u0019×:\u009dðã'ï¶ü\u0017PÉhþ\u0014Þ\u0000\u0003\u0013\u008frRµPé\u001azë'S\u0096f\u0007¢W\u0086ÿ\u0012\u001e\u000b\b\u0012\u0098Î|&æ6C|";
                  int var5 = "x\u0081\u0083\u0004òF²`\u007fÌn\u0096¼ê~\u008e\u001eêbÍN§O\u0096rkÚü\u008bHi¾\u0084]FªIH\u009aCDÔ\u000fÓÈ\u000fû ®\\2\u00adL_\u0094²9\u009c[\u0095Lë\u0007åÊPz\"l\u0019×:\u009dðã'ï¶ü\u0017PÉhþ\u0014Þ\u0000\u0003\u0013\u008frRµPé\u001azë'S\u0096f\u0007¢W\u0086ÿ\u0012\u001e\u000b\b\u0012\u0098Î|&æ6C|".length();
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
                              f = var6;
                              h = new Integer[17];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = " \u0005~\u008då$Þ)ðï\u0011\u0006Ã÷¼q";
                           var5 = " \u0005~\u008då$Þ)ðï\u0011\u0006Ã÷¼q".length();
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

               var15 = "ß.\u0097¼èõO£HÃ/P.æn#j\u008fCÇ~C?MúùùÊÏÝ®- \u009bo\u0087}zð\u0001\u0099÷²\u0099ôY\u0080\bÇºw\u001cK\".22\u0012\"Âp¡Åë\u008f";
               var17 = "ß.\u0097¼èõO£HÃ/P.æn#j\u008fCÇ~C?MúùùÊÏÝ®- \u009bo\u0087}zð\u0001\u0099÷²\u0099ôY\u0080\bÇºw\u001cK\".22\u0012\"Âp¡Åë\u008f".length();
               var14 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31051;
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
            throw new RuntimeException("su/catlean/dp", var10);
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
         throw new RuntimeException("su/catlean/dp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1144;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/dp", var14);
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
         throw new RuntimeException("su/catlean/dp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
