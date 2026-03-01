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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class e5 {
   private final float C;
   private final float t;
   private final boolean S;
   private final boolean V;
   private final boolean Q;
   private final boolean D;
   private final boolean w;
   private final boolean T;
   private final boolean b;
   private final boolean B;
   private static boolean R;
   private static final long a = j0.a(3625896299889374017L, 111167478409407990L, MethodHandles.lookup().lookupClass()).a(131847218772200L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public e5(float yaw, float pitch, boolean forward, boolean back, boolean left, boolean right, boolean sneak, boolean jump, boolean use, boolean attack) {
      this.C = var1;
      this.t = var2;
      this.S = var3;
      this.V = var4;
      this.Q = var5;
      this.D = var6;
      this.w = var7;
      this.T = var8;
      this.b = var9;
      this.B = var10;
   }

   public final float T() {
      return this.C;
   }

   public final float n() {
      return this.t;
   }

   public final boolean e() {
      return this.S;
   }

   public final boolean l() {
      return this.V;
   }

   public final boolean z() {
      return this.Q;
   }

   public final boolean E() {
      return this.D;
   }

   public final boolean M() {
      return this.w;
   }

   public final boolean H() {
      return this.T;
   }

   public final boolean S() {
      return this.b;
   }

   public final boolean K() {
      return this.B;
   }

   public final float a() {
      return this.C;
   }

   public final float F() {
      return this.t;
   }

   public final boolean s() {
      return this.S;
   }

   public final boolean C() {
      return this.V;
   }

   public final boolean m() {
      return this.Q;
   }

   public final boolean q() {
      return this.D;
   }

   public final boolean P() {
      return this.w;
   }

   public final boolean Z() {
      return this.T;
   }

   public final boolean G() {
      return this.b;
   }

   public final boolean Y() {
      return this.B;
   }

   @NotNull
   public final e5 m(float yaw, float pitch, boolean forward, boolean back, boolean left, boolean right, boolean sneak, boolean jump, boolean use, boolean attack) {
      return new e5(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public static e5 U(e5 param0, float param1, float param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8, long param9, boolean param11, boolean param12, int param13, Object param14) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 93810010587098L;
      boolean var3 = this.B;
      boolean var4 = this.b;
      boolean var5 = this.T;
      boolean var6 = this.w;
      boolean var7 = this.D;
      boolean var8 = this.Q;
      boolean var9 = this.V;
      boolean var10 = this.S;
      float var11 = this.t;
      float var12 = this.C;
      String var10000 = 7860.e<invokedynamic>(7860, 2856256358306842928L ^ var1);
      return var10000 + var12 + true.e<invokedynamic>(26651, 4079001979567439769L ^ var1) + var11 + true.e<invokedynamic>(5648, 8700590437962547605L ^ var1) + var10 + true.e<invokedynamic>(30777, 5341759241808637873L ^ var1) + var9 + true.e<invokedynamic>(28791, 9158826498461165566L ^ var1) + var8 + true.e<invokedynamic>(22887, 4537706264220782305L ^ var1) + var7 + true.e<invokedynamic>(20421, 8327061937847359554L ^ var1) + var6 + true.e<invokedynamic>(21586, 4649625769527690193L ^ var1) + var5 + true.e<invokedynamic>(4392, 8847375043405809320L ^ var1) + var4 + true.e<invokedynamic>(25243, 3634633602110125338L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 8264431989674L;
      int var4 = Float.hashCode(this.C);
      boolean var10000 = 3823671461958606232L.A<invokedynamic>(3823671461958606232L, var1);
      var4 = var4 * true.t<invokedynamic>(8019, 269862575944343319L ^ var1) + Float.hashCode(this.t);
      var4 = var4 * true.t<invokedynamic>(17990, 2297371072986924549L ^ var1) + Boolean.hashCode(this.S);
      var4 = var4 * true.t<invokedynamic>(17990, 2297371072986924549L ^ var1) + Boolean.hashCode(this.V);
      var4 = var4 * true.t<invokedynamic>(17990, 2297371072986924549L ^ var1) + Boolean.hashCode(this.Q);
      var4 = var4 * true.t<invokedynamic>(17990, 2297371072986924549L ^ var1) + Boolean.hashCode(this.D);
      boolean var3 = var10000;
      var4 = var4 * true.t<invokedynamic>(17990, 2297371072986924549L ^ var1) + Boolean.hashCode(this.w);
      var4 = var4 * true.t<invokedynamic>(17990, 2297371072986924549L ^ var1) + Boolean.hashCode(this.T);
      var4 = var4 * true.t<invokedynamic>(17990, 2297371072986924549L ^ var1) + Boolean.hashCode(this.b);
      var4 = var4 * true.t<invokedynamic>(17990, 2297371072986924549L ^ var1) + Boolean.hashCode(this.B);

      try {
         if (var3) {
            (new int[2]).A<invokedynamic>(new int[2], 3862571220344370721L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 3860673692798500882L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public static void G(boolean var0) {
      R = var0;
   }

   public static boolean v() {
      return R;
   }

   public static boolean I() {
      boolean var0 = v();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var20 = a ^ 25369985820272L;
      e = new HashMap(13);
      false.A<invokedynamic>(false, 6924344349554157692L, var20);
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
      String var15 = "Ë\u0088^ê±\u0080{Ê«ÄG¨y´õ\u0084 î\u0016\u0017ª$C¥¸\u000fÈà]OV<+\u0097\u009e¤]}2\u001f»SKòöÿ\u0082\u009b\u000b\u0018<ÛÚ`\u0006»£\u001døx\n\u0086a_\t§à \u0006¼*\u0099OT\u0010\u0088\u0080 gç\nD zO\u0098\u0001ÛLüè(T¥õ\u0007ÄäÇ\u00160Xñå\u0092\u0010É\u0082'#ý3\u001d\b9øß^/n7¦·»\u0099\u008dhB\u008c\u001b\u008bÃ ýÎf\u009e3°B9¾\u009a´\u0019\u0083+|\u0086Õ9+\u0086\u008câL\u0006\u0016´Ê]\u0012\u00884ó\u0018S>¶m\u0016ar\u008eI\u0097\u0088TòTÄv·y^Í8`+s\u0018Þ\u000e77«T\u000bÂ\u0011«\u0018ä\u007f$\u0080)O\t)è\u0005({;";
      int var17 = "Ë\u0088^ê±\u0080{Ê«ÄG¨y´õ\u0084 î\u0016\u0017ª$C¥¸\u000fÈà]OV<+\u0097\u009e¤]}2\u001f»SKòöÿ\u0082\u009b\u000b\u0018<ÛÚ`\u0006»£\u001døx\n\u0086a_\t§à \u0006¼*\u0099OT\u0010\u0088\u0080 gç\nD zO\u0098\u0001ÛLüè(T¥õ\u0007ÄäÇ\u00160Xñå\u0092\u0010É\u0082'#ý3\u001d\b9øß^/n7¦·»\u0099\u008dhB\u008c\u001b\u008bÃ ýÎf\u009e3°B9¾\u009a´\u0019\u0083+|\u0086Õ9+\u0086\u008câL\u0006\u0016´Ê]\u0012\u00884ó\u0018S>¶m\u0016ar\u008eI\u0097\u0088TòTÄv·y^Í8`+s\u0018Þ\u000e77«T\u000bÂ\u0011«\u0018ä\u007f$\u0080)O\t)è\u0005({;".length();
      char var14 = 16;
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
                  c = var18;
                  d = new String[10];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[9];
                  int var3 = 0;
                  String var4 = "Ié>ìBþÙ~û\u00849Ô¼\u0018\tÇ#\u00ad62²\u0012º! (D\u0084¢0<¯ß}l\u000b\u009f\u0087GÏ\u0098\u009e®ê#È¼\rÂ\u0005SµjÆÙÒ";
                  int var5 = "Ié>ìBþÙ~û\u00849Ô¼\u0018\tÇ#\u00ad62²\u0012º! (D\u0084¢0<¯ß}l\u000b\u009f\u0087GÏ\u0098\u009e®ê#È¼\rÂ\u0005SµjÆÙÒ".length();
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
                              g = new Integer[9];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "t=»a:\u0002\u0000S@\u001e\u0099·Ê¶ì\u0003";
                           var5 = "t=»a:\u0002\u0000S@\u001e\u0099·Ê¶ì\u0003".length();
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

               var15 = "\u0099Ú¡;¯\r\u001aí\u0003i\u0086¼ÇÀ¶Y\u00172Sb\u001fµl'\u0010Áò\u0090=\u000bÔ6Áìôä²!øíã";
               var17 = "\u0099Ú¡;¯\r\u001aí\u0003i\u0086¼ÇÀ¶Y\u00172Sb\u001fµl'\u0010Áò\u0090=\u000bÔ6Áìôä²!øíã".length();
               var14 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12102;
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
            throw new RuntimeException("su/catlean/e5", var10);
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
         throw new RuntimeException("su/catlean/e5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13554;
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
            throw new RuntimeException("su/catlean/e5", var14);
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
         throw new RuntimeException("su/catlean/e5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
