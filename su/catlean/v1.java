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
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class v1 {
   @NotNull
   public static final io D;
   @NotNull
   private String w;
   @NotNull
   private String d;
   private int E;
   @NotNull
   private String l;
   @NotNull
   private String n;
   private boolean Y;
   private int M;
   private static int[] F;
   private static final long a = j0.a(276225773842245443L, 6894243968784811520L, MethodHandles.lookup().lookupClass()).a(41365033291655L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public v1(@NotNull String id, long a, @NotNull String ip, int port, @NotNull String user, @NotNull String password, boolean socks4, int ping) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(24006, 679860377152628678L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.v<invokedynamic>(13613, 2207260570020302635L ^ var2));
      Intrinsics.checkNotNullParameter(var6, true.v<invokedynamic>(14717, 5956901161121858420L ^ var2));
      Intrinsics.checkNotNullParameter(var7, true.v<invokedynamic>(23873, 4928762261835622213L ^ var2));
      super();
      this.w = var1;
      this.d = var4;
      this.E = var5;
      this.l = var6;
      this.n = var7;
      this.Y = var8;
      this.M = var9;
   }

   public v1(String var1, String var2, int var3, String var4, String var5, boolean var6, long var7, int var9, int var10, DefaultConstructorMarker var11) {
      var7 ^= a;
      long var12 = var7 ^ 139231307629303L;
      if ((var10 & true.n<invokedynamic>(4829, 2078741625124325934L ^ var7)) != 0) {
         var9 = -1;
      }

      this(var1, var12, var2, var3, var4, var5, var6, var9);
   }

   @NotNull
   public final String a() {
      return this.w;
   }

   public final void c(long a, @NotNull String <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(32369, 2623738013595684101L ^ var1));
      this.w = var3;
   }

   @NotNull
   public final String W() {
      return this.d;
   }

   public final void s(int a, char a, @NotNull String <set-?>, char a) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(20404, 2991886127536079527L ^ var5));
      this.d = var3;
   }

   public final int b() {
      return this.E;
   }

   public final void s(int <set-?>) {
      this.E = var1;
   }

   @NotNull
   public final String R() {
      return this.l;
   }

   public final void A(long a, @NotNull String <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(32369, 2623768641329049885L ^ var1));
      this.l = var3;
   }

   @NotNull
   public final String M() {
      return this.n;
   }

   public final void F(long a, @NotNull String <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(32369, 2623694428944511203L ^ var1));
      this.n = var3;
   }

   public final boolean k() {
      return this.Y;
   }

   public final void V(boolean <set-?>) {
      this.Y = var1;
   }

   public final int S() {
      return this.M;
   }

   public final void j(int <set-?>) {
      this.M = var1;
   }

   /** @deprecated */
   @Transient
   public static void H() {
   }

   @NotNull
   public final String C() {
      return this.w;
   }

   @NotNull
   public final String z() {
      return this.d;
   }

   public final int e() {
      return this.E;
   }

   @NotNull
   public final String p() {
      return this.l;
   }

   @NotNull
   public final String n() {
      return this.n;
   }

   public final boolean F() {
      return this.Y;
   }

   public final int P() {
      return this.M;
   }

   @NotNull
   public final v1 P(long a, @NotNull String id, @NotNull String ip, int port, @NotNull String user, @NotNull String password, boolean socks4, int ping) {
      var1 ^= a;
      long var10 = var1 ^ 117715004298269L;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(1871, 2180829319364836724L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.v<invokedynamic>(5041, 5089489332639558017L ^ var1));
      Intrinsics.checkNotNullParameter(var6, true.v<invokedynamic>(428, 2920217869876099995L ^ var1));
      Intrinsics.checkNotNullParameter(var7, true.v<invokedynamic>(4580, 995908589025618897L ^ var1));
      return new v1(var3, var10, var4, var5, var6, var7, var8, var9);
   }

   public static v1 K(v1 param0, int param1, String param2, char param3, String param4, int param5, String param6, String param7, boolean param8, int param9, int param10, int param11, Object param12) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 20662742983315L;
      int var3 = this.M;
      boolean var4 = this.Y;
      String var5 = this.n;
      String var6 = this.l;
      int var7 = this.E;
      String var8 = this.d;
      String var9 = this.w;
      String var10000 = 24031.v<invokedynamic>(24031, 6553979935265886718L ^ var1);
      return var10000 + var9 + true.v<invokedynamic>(5305, 2712323340996696210L ^ var1) + var8 + true.v<invokedynamic>(13889, 4022546980174002803L ^ var1) + var7 + true.v<invokedynamic>(11643, 6262469302415286621L ^ var1) + var6 + true.v<invokedynamic>(25286, 5087026271600226027L ^ var1) + var5 + true.v<invokedynamic>(32609, 5859921456914805577L ^ var1) + var4 + true.v<invokedynamic>(15470, 2827422641068830794L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 41132076197275L;
      int var4 = this.w.hashCode();
      8115136602433700161L.A<invokedynamic>(8115136602433700161L, var1);
      var4 = var4 * true.n<invokedynamic>(15815, 8636422009965003459L ^ var1) + this.d.hashCode();
      var4 = var4 * true.n<invokedynamic>(4723, 3447968416392670587L ^ var1) + Integer.hashCode(this.E);
      var4 = var4 * true.n<invokedynamic>(4723, 3447968416392670587L ^ var1) + this.l.hashCode();
      var4 = var4 * true.n<invokedynamic>(4723, 3447968416392670587L ^ var1) + this.n.hashCode();
      var4 = var4 * true.n<invokedynamic>(4723, 3447968416392670587L ^ var1) + Boolean.hashCode(this.Y);
      var4 = var4 * true.n<invokedynamic>(4723, 3447968416392670587L ^ var1) + Integer.hashCode(this.M);

      try {
         if (8100189761528100099L.A<invokedynamic>(8100189761528100099L, var1) == null) {
            (new int[5]).A<invokedynamic>(new int[5], 8093655035460468343L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 8081287743659067901L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void e(v1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
      var1.encodeStringElement(var2, 0, var0.w);
      var1.encodeStringElement(var2, 1, var0.d);
      var1.encodeIntElement(var2, 2, var0.E);
      var1.encodeStringElement(var2, 3, var0.l);
      var1.encodeStringElement(var2, 4, var0.n);
      var1.encodeBooleanElement(var2, 5, var0.Y);
   }

   public v1(int seen0, String id, String ip, int port, String user, long a, String password, boolean socks4, SerializationConstructorMarker serializationConstructorMarker) {
      var6 ^= a;
      if (true.n<invokedynamic>(32489, 8883966250680259039L ^ var6) != (true.n<invokedynamic>(24226, 666929903774871955L ^ var6) & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, true.n<invokedynamic>(24226, 666929903774871955L ^ var6), x0.q.getDescriptor());
      }

      super();
      this.w = var2;
      this.d = var3;
      this.E = var4;
      this.l = var5;
      this.n = var8;
      this.Y = var9;
      this.M = -1;
   }

   static {
      long var20 = a ^ 98284539536367L;
      int[] var10000 = new int[3];
      e = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -709866336297764861L, var20);
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
      String var15 = "×\u000b\"\u009cª\u0014°Ó:nµX\u0095\u0001Ý-\u0010Î\u0005y\u0087:\u0094\u009aôÏá1¥@_[b\u0010\u0012ý\u009eÆ¥\u000eóü[ªû3\u0090ÓKU\u0018¦\u000b\u009f\u0011§¦Õvª¦^Rò5\u0006bÄy/û\u001dÇ°?\u0010k\u00843ég\u0082ØXG\u0003¶Õë\u0094\n] \u0099a\u000bÍ IÖ½\u009c\u0088\u0084[\u0086iÂ¡\u0096\u0080\u0000\u0097!&\u008b\u0002ô\\K²ò\u008eË\u0001\u00105ëX9ëÑ\u0094¹òUFFÁ?sK\u0010\u0012:IÛprÖ \u0084\u008cë3½\u0098Ò\u0082\u0010Óæ\t#O½\u0083\u0014_\u001bÓâK*Ñú\u0010É\u0014,\u0088@\u0099\u0085Jáºeô\u009f\u0010-1\u0018Æù\u00adS\u0007\u0098\u0013H\u0013\u0082èy/`á»\u0087\u0011=èÍÁ\b\u0092\u0010]@9Ùm`÷\u008eØ\\KÀÏLÍV\u0018Øß\u009b©\u0001\u009cJÅ\u0085ò·\u0091\"Þk0\"ðàG\u0013\t¾Z\u0010vô\u0000 õàJÄ7Ýë\u0005Ë+e©\u0010l\u008d\u008du\u00810s[\bÅrVê$\u008f!";
      int var17 = "×\u000b\"\u009cª\u0014°Ó:nµX\u0095\u0001Ý-\u0010Î\u0005y\u0087:\u0094\u009aôÏá1¥@_[b\u0010\u0012ý\u009eÆ¥\u000eóü[ªû3\u0090ÓKU\u0018¦\u000b\u009f\u0011§¦Õvª¦^Rò5\u0006bÄy/û\u001dÇ°?\u0010k\u00843ég\u0082ØXG\u0003¶Õë\u0094\n] \u0099a\u000bÍ IÖ½\u009c\u0088\u0084[\u0086iÂ¡\u0096\u0080\u0000\u0097!&\u008b\u0002ô\\K²ò\u008eË\u0001\u00105ëX9ëÑ\u0094¹òUFFÁ?sK\u0010\u0012:IÛprÖ \u0084\u008cë3½\u0098Ò\u0082\u0010Óæ\t#O½\u0083\u0014_\u001bÓâK*Ñú\u0010É\u0014,\u0088@\u0099\u0085Jáºeô\u009f\u0010-1\u0018Æù\u00adS\u0007\u0098\u0013H\u0013\u0082èy/`á»\u0087\u0011=èÍÁ\b\u0092\u0010]@9Ùm`÷\u008eØ\\KÀÏLÍV\u0018Øß\u009b©\u0001\u009cJÅ\u0085ò·\u0091\"Þk0\"ðàG\u0013\t¾Z\u0010vô\u0000 õàJÄ7Ýë\u0005Ë+e©\u0010l\u008d\u008du\u00810s[\bÅrVê$\u008f!".length();
      char var14 = 16;
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
                  b = var18;
                  c = new String[17];
                  h = new HashMap(13);
                  Cipher var0;
                  var22 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[9];
                  int var3 = 0;
                  String var4 = "\u0097TÍ£\\ Ü$q¶e3,\u0086Ç\u0010²\u0097\u0018,X·?L#uog\u008bYì|\u0081\u009e>\u0012*`¯LµE`}\u001f6|rÄ×\u0013ãì¿wÕ";
                  int var5 = "\u0097TÍ£\\ Ü$q¶e3,\u0086Ç\u0010²\u0097\u0018,X·?L#uog\u008bYì|\u0081\u009e>\u0012*`¯LµE`}\u001f6|rÄ×\u0013ãì¿wÕ".length();
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
                              f = var6;
                              g = new Integer[9];
                              D = new io((DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "X¦n¸\u0093¦íH\u0090Llß¬J\u009f{";
                           var5 = "X¦n¸\u0093¦íH\u0090Llß¬J\u009f{".length();
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

               var15 = "¶\u0017\u009bGuºXH¨êù®\u001fÚ¸R{ä\rÿ°%\r\u0082\u008djÍä\u0010ës}\u0010Î\u009b\u000f9\u0090¤@1ß¢\"±\u009c\u0013sþ";
               var17 = "¶\u0017\u009bGuºXH¨êù®\u001fÚ¸R{ä\rÿ°%\r\u0082\u008djÍä\u0010ës}\u0010Î\u009b\u000f9\u0090¤@1ß¢\"±\u009c\u0013sþ".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void C(int[] var0) {
      F = var0;
   }

   public static int[] l() {
      return F;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31380;
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
            throw new RuntimeException("su/catlean/v1", var10);
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
         throw new RuntimeException("su/catlean/v1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3774;
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
            throw new RuntimeException("su/catlean/v1", var14);
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
         throw new RuntimeException("su/catlean/v1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
