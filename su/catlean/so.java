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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class so implements s6 {
   @NotNull
   public static final du z;
   @NotNull
   private String L;
   @NotNull
   private n_ M;
   private boolean V;
   @NotNull
   private String W;
   private boolean T;
   private static boolean Q;
   private static final long a = j0.a(1777402336840974232L, 6501475400465227743L, MethodHandles.lookup().lookupClass()).a(275071350352220L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public so(@NotNull String id, @NotNull n_ bind, long a, boolean enabled, @NotNull String item, boolean legit) {
      var3 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.r<invokedynamic>(20891, 548599419343690130L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.r<invokedynamic>(6549, 4843216559699300765L ^ var3));
      Intrinsics.checkNotNullParameter(var6, true.r<invokedynamic>(4214, 645706019147159664L ^ var3));
      super();
      this.L = var1;
      this.M = var2;
      this.V = var5;
      this.W = var6;
      this.T = var7;
   }

   @NotNull
   public String L() {
      return this.L;
   }

   public void T(@NotNull String <set-?>, long a) {
      Intrinsics.checkNotNullParameter(var1, true.r<invokedynamic>(25297, 2369946217951178225L ^ var2));
      this.L = var1;
   }

   @NotNull
   public n_ f() {
      return this.M;
   }

   public void d(long a, @NotNull n_ <set-?>) {
      Intrinsics.checkNotNullParameter(var3, true.r<invokedynamic>(24051, 3478534431674505213L ^ var1));
      this.M = var3;
   }

   public boolean X() {
      return this.V;
   }

   public void l(boolean <set-?>) {
      this.V = var1;
   }

   @NotNull
   public final String K() {
      return this.W;
   }

   public final void E(int a, byte a, @NotNull String <set-?>, int a) {
      long var5 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ a;
      Intrinsics.checkNotNullParameter(var3, true.r<invokedynamic>(24051, 3478483070279994330L ^ var5));
      this.W = var3;
   }

   public final boolean O() {
      return this.T;
   }

   public final void R(boolean <set-?>) {
      this.T = var1;
   }

   @NotNull
   public final String T() {
      return this.L;
   }

   @NotNull
   public final n_ u() {
      return this.M;
   }

   public final boolean Q() {
      return this.V;
   }

   @NotNull
   public final String W() {
      return this.W;
   }

   public final boolean B() {
      return this.T;
   }

   @NotNull
   public final so Q(@NotNull String id, short a, @NotNull n_ bind, boolean enabled, @NotNull String item, boolean legit, char a, int a) {
      long var9 = ((long)var2 << 48 | (long)var7 << 48 >>> 16 | (long)var8 << 32 >>> 32) ^ a;
      long var11 = var9 ^ 39077559434618L;
      Intrinsics.checkNotNullParameter(var1, true.r<invokedynamic>(22188, 3191854985538841852L ^ var9));
      Intrinsics.checkNotNullParameter(var3, true.r<invokedynamic>(3661, 6603549010546717717L ^ var9));
      Intrinsics.checkNotNullParameter(var5, true.r<invokedynamic>(11915, 3371872975517766872L ^ var9));
      return new so(var1, var3, var11, var4, var5, var6);
   }

   public static so W(so param0, String param1, char param2, n_ param3, short param4, boolean param5, int param6, String param7, boolean param8, int param9, Object param10) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 71905968619625L;
      boolean var3 = this.T;
      String var4 = this.W;
      boolean var5 = this.V;
      n_ var6 = this.M;
      String var7 = this.L;
      String var10000 = 743.r<invokedynamic>(743, 6359215168742550801L ^ var1);
      return var10000 + var7 + true.r<invokedynamic>(27741, 8872418472641397677L ^ var1) + var6 + true.r<invokedynamic>(6030, 1944915853013088368L ^ var1) + var5 + true.r<invokedynamic>(24150, 4473066549315088807L ^ var1) + var4 + true.r<invokedynamic>(9427, 1413952477022669614L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 33052124924183L;
      int var3 = this.L.hashCode();
      var3 = var3 * true.b<invokedynamic>(30276, 1781664506843413539L ^ var1) + this.M.hashCode();
      var3 = var3 * true.b<invokedynamic>(17750, 6719448484288237362L ^ var1) + Boolean.hashCode(this.V);
      var3 = var3 * true.b<invokedynamic>(17750, 6719448484288237362L ^ var1) + this.W.hashCode();
      var3 = var3 * true.b<invokedynamic>(17750, 6719448484288237362L ^ var1) + Boolean.hashCode(this.T);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void H(so self, CompositeEncoder output, SerialDescriptor serialDesc) {
      var1.encodeStringElement(var2, 0, var0.L());
      var1.encodeSerializableElement(var2, 1, (SerializationStrategy)x_.v, var0.f());
      var1.encodeBooleanElement(var2, 2, var0.X());
      var1.encodeStringElement(var2, 3, var0.W);
      var1.encodeBooleanElement(var2, 4, var0.T);
   }

   public so(int seen0, String id, n_ bind, long a, boolean enabled, String item, boolean legit, SerializationConstructorMarker serializationConstructorMarker) {
      var4 ^= a;
      if (true.b<invokedynamic>(17750, 6719499708327942660L ^ var4) != (true.b<invokedynamic>(17750, 6719499708327942660L ^ var4) & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, true.b<invokedynamic>(17750, 6719499708327942660L ^ var4), cb.r.getDescriptor());
      }

      super();
      this.L = var2;
      this.M = var3;
      this.V = var6;
      this.W = var7;
      this.T = var8;
   }

   static {
      long var20 = a ^ 108144433494868L;
      d = new HashMap(13);
      true.A<invokedynamic>(true, 8493417017587415079L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[13];
      int var16 = 0;
      String var15 = ">+\u008b[ \u0015yëE\u0012Â\u0005\f\u0087ÅïÃ\u0097\u001d\u0088\u0085\u0002\u0092§\"üÁM9\u0089\u000b³\u0010¢\u0007a\u001a\u008b°\u009c\u0095Ë\u0003mhEò¥\u0018\u0010\u0003§X\rñ\u0097µäÅÕ\u0094g~»Ó\u008e\u0010ÂNG¶\u0015ú\u00adæzÅÀg\u0080\u0091\u0091]\u0010sn(\u0019\u008c\u009cf\u00185\f\u009e\u0001Í!X%\u0010¤¿\bÎ\u009fI°\u0016Ù(b¬H8ÔL\u0010Ðµ¤\b\u008c\u008e\u0085Ð\u0016»vôù\u009eËì\u0010v.É\u0098¶\u00014u®Õ&Ç\u0098\u0099\u0015Å\u0018\u008f`\"yv°\u001d\u0084+÷\u0096+\u009f\u0083\u0013ÈÌ¦úâÀYb9\u00104h\r>\u0089\u0017q\u009aêøp\u0081\u0081\u009fe\u0081\u0010øÝ¥Ø¢DÃØeéBÐÐ\u0001KZ";
      int var17 = ">+\u008b[ \u0015yëE\u0012Â\u0005\f\u0087ÅïÃ\u0097\u001d\u0088\u0085\u0002\u0092§\"üÁM9\u0089\u000b³\u0010¢\u0007a\u001a\u008b°\u009c\u0095Ë\u0003mhEò¥\u0018\u0010\u0003§X\rñ\u0097µäÅÕ\u0094g~»Ó\u008e\u0010ÂNG¶\u0015ú\u00adæzÅÀg\u0080\u0091\u0091]\u0010sn(\u0019\u008c\u009cf\u00185\f\u009e\u0001Í!X%\u0010¤¿\bÎ\u009fI°\u0016Ù(b¬H8ÔL\u0010Ðµ¤\b\u008c\u008e\u0085Ð\u0016»vôù\u009eËì\u0010v.É\u0098¶\u00014u®Õ&Ç\u0098\u0099\u0015Å\u0018\u008f`\"yv°\u001d\u0084+÷\u0096+\u009f\u0083\u0013ÈÌ¦úâÀYb9\u00104h\r>\u0089\u0017q\u009aêøp\u0081\u0081\u009fe\u0081\u0010øÝ¥Ø¢DÃØeéBÐÐ\u0001KZ".length();
      char var14 = ' ';
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
                  c = new String[13];
                  g = new HashMap(13);
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
                  String var4 = ">â\u0088<Dg(\u0013Fj\u0002\u0014ÕÚ_e";
                  int var5 = ">â\u0088<Dg(\u0013Fj\u0002\u0014ÕÚ_e".length();
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
                              z = new du((DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "t¹BÆ\u0087©õñíèt*è¶\u0082p";
                           var5 = "t¹BÆ\u0087©õñíèt*è¶\u0082p".length();
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

               var15 = "Ö\r\bù\u0006fF¤Î\u0094Ëé\u0004ä\u001e\u0090_NÅ\u0088J?&1\u008fÁ\u0086+jw\u0097\u007f\u0010\u008c\u0095\u0095âäe\u009cþZkGÁ#x;<";
               var17 = "Ö\r\bù\u0006fF¤Î\u0094Ëé\u0004ä\u001e\u0090_NÅ\u0088J?&1\u008fÁ\u0086+jw\u0097\u007f\u0010\u008c\u0095\u0095âäe\u009cþZkGÁ#x;<".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void B(boolean var0) {
      Q = var0;
   }

   public static boolean P() {
      return Q;
   }

   public static boolean n() {
      boolean var0 = P();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24758;
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
            throw new RuntimeException("su/catlean/so", var10);
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
         throw new RuntimeException("su/catlean/so" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3161;
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
            throw new RuntimeException("su/catlean/so", var14);
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
         throw new RuntimeException("su/catlean/so" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
