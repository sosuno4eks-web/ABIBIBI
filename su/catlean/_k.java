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
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class _k {
   @NotNull
   public static final mz K;
   @NotNull
   private String X;
   private int b;
   private int h;
   private int f;
   @NotNull
   private String x;
   private int L;
   private boolean Q;
   private static String[] k;
   private static final long a = j0.a(6792633032386557663L, 2720397844223109479L, MethodHandles.lookup().lookupClass()).a(93070148635437L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map j;

   public _k(@NotNull String id, int x, int y, int z, @NotNull String server, int dimension, boolean visible, long a) {
      var8 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(27724, 935821073287313492L ^ var8));
      Intrinsics.checkNotNullParameter(var5, true.b<invokedynamic>(29661, 5578911231916926918L ^ var8));
      super();
      this.X = var1;
      this.b = var2;
      this.h = var3;
      this.f = var4;
      this.x = var5;
      this.L = var6;
      this.Q = var7;
   }

   public _k(String var1, int var2, int var3, int var4, String var5, int var6, char var7, int var8, boolean var9, int var10, char var11, DefaultConstructorMarker var12) {
      long var13 = ((long)var7 << 48 | (long)var8 << 32 >>> 16 | (long)var11 << 48 >>> 48) ^ a;
      long var15 = var13 ^ 100847339801571L;
      if ((var10 & true.p<invokedynamic>(7256, 9075821634247501868L ^ var13)) != 0) {
         var5 = true.b<invokedynamic>(30922, 7936155350696937811L ^ var13);
      }

      if ((var10 & true.p<invokedynamic>(13635, 6345636103650869562L ^ var13)) != 0) {
         var6 = 0;
      }

      if ((var10 & true.p<invokedynamic>(10850, 8806458176741580308L ^ var13)) != 0) {
         var9 = true;
      }

      this(var1, var2, var3, var4, var5, var6, var9, var15);
   }

   @NotNull
   public final String s() {
      return this.X;
   }

   public final void A(long a, @NotNull String <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.b<invokedynamic>(25013, 4492399766168706366L ^ var1));
      this.X = var3;
   }

   public final int Z() {
      return this.b;
   }

   public final void U(int <set-?>) {
      this.b = var1;
   }

   public final int N() {
      return this.h;
   }

   public final void L(int <set-?>) {
      this.h = var1;
   }

   public final int m() {
      return this.f;
   }

   public final void S(int <set-?>) {
      this.f = var1;
   }

   @NotNull
   public final String w() {
      return this.x;
   }

   public final void q(@NotNull String <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(6805, 6985280315797948874L ^ var2));
      this.x = var1;
   }

   public final int V() {
      return this.L;
   }

   public final void c(int <set-?>) {
      this.L = var1;
   }

   public final boolean C() {
      return this.Q;
   }

   public final void D(boolean <set-?>) {
      this.Q = var1;
   }

   @NotNull
   public final String M() {
      return this.X;
   }

   public final int g() {
      return this.b;
   }

   public final int P() {
      return this.h;
   }

   public final int x() {
      return this.f;
   }

   @NotNull
   public final String d() {
      return this.x;
   }

   public final int R() {
      return this.L;
   }

   public final boolean t() {
      return this.Q;
   }

   @NotNull
   public final _k Z(@NotNull String id, int x, int y, int z, @NotNull String server, int dimension, long a, boolean visible) {
      var7 ^= a;
      long var10 = var7 ^ 139891801888090L;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(22252, 603562951604828612L ^ var7));
      Intrinsics.checkNotNullParameter(var5, true.b<invokedynamic>(20357, 7704568114039120032L ^ var7));
      return new _k(var1, var2, var3, var4, var5, var6, var9, var10);
   }

   public static _k z(_k param0, String param1, int param2, long param3, int param5, int param6, String param7, int param8, boolean param9, int param10, Object param11) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 132033008454505L;
      boolean var3 = this.Q;
      int var4 = this.L;
      String var5 = this.x;
      int var6 = this.f;
      int var7 = this.h;
      int var8 = this.b;
      String var9 = this.X;
      String var10000 = 30482.b<invokedynamic>(30482, 1953232396228650732L ^ var1);
      return var10000 + var9 + true.b<invokedynamic>(1614, 5501831387377047474L ^ var1) + var8 + true.b<invokedynamic>(18832, 5821344675494549611L ^ var1) + var7 + true.b<invokedynamic>(17915, 8251280123437569039L ^ var1) + var6 + true.b<invokedynamic>(27326, 6697763851697158982L ^ var1) + var5 + true.b<invokedynamic>(29518, 8383729835659616957L ^ var1) + var4 + true.b<invokedynamic>(12028, 8825110308720590597L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 83456507639771L;
      int var4 = this.X.hashCode();
      var4 = var4 * true.p<invokedynamic>(24266, 5514283617846064737L ^ var1) + Integer.hashCode(this.b);
      6405597826966685867L.A<invokedynamic>(6405597826966685867L, var1);
      var4 = var4 * true.p<invokedynamic>(24131, 3928442612198405871L ^ var1) + Integer.hashCode(this.h);
      var4 = var4 * true.p<invokedynamic>(24131, 3928442612198405871L ^ var1) + Integer.hashCode(this.f);
      var4 = var4 * true.p<invokedynamic>(24131, 3928442612198405871L ^ var1) + this.x.hashCode();
      var4 = var4 * true.p<invokedynamic>(24131, 3928442612198405871L ^ var1) + Integer.hashCode(this.L);
      var4 = var4 * true.p<invokedynamic>(24131, 3928442612198405871L ^ var1) + Boolean.hashCode(this.Q);

      try {
         if (6371046854789782784L.A<invokedynamic>(6371046854789782784L, var1) == null) {
            (new String[5]).A<invokedynamic>(new String[5], 6362868408056277145L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 6364335139177530363L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void Y(_k self, long a, CompositeEncoder output, SerialDescriptor serialDesc) {
      // $FF: Couldn't be decompiled
   }

   public _k(int seen0, String id, int x, int y, long a, int z, String server, int dimension, boolean visible, SerializationConstructorMarker serializationConstructorMarker) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 101529877113483L;
      e = new HashMap(13);
      null.A<invokedynamic>((Object)null, -4243124590164806199L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[15];
      int var16 = 0;
      String var15 = "MªO§fÅ5¹yÿÑÏí_\u0018*åTÙX\u009aõ\u000f5\u0010D¾[\u000eçè\u0082«Ë\u009aNéO\u001b¥B\u0010dà;®dd¬8õ¦®\u0090Fg^\u0015\u0010*\u009b¿\u0083^f$Ø\u008a\\\f\u0094±\u009bÏÀ\u0010Ú:sæ|Ç\u009fú¾búgO\u0093\u0003n\u0010\u008dþRàñÌz\u001d-\u009a)¢µ`Tk &:È»:§Qifµë\u000fÖïØéÀÒ\u0011öº¦\n\u0082<)ÉÍ\u000e\u007fK\r\u0018Êb\u0091¬\u009bWÂÂè¥ÜM/¡\u000b\u008eõ\u008a\u0097ÒQ¶p.\u0010m.2Q-ãq\u0084ü\u0013\rx~\u0014â÷\u0010Yñ]_¸ñh$\u0007DCy\u009aH±q\u0010£þºU0\u009c\u009b»è¸ÔE+\u0092Ø\u0016\u0010î¼Pe3.æCí`&\u008fy\u0085ÔG \u0001é\u008e/XD\u008cL\u009dh¦Ià}\\Év¬\u0089»\u0002©\u0099g0t\u009c\u0000\u0098×Ùð";
      int var17 = "MªO§fÅ5¹yÿÑÏí_\u0018*åTÙX\u009aõ\u000f5\u0010D¾[\u000eçè\u0082«Ë\u009aNéO\u001b¥B\u0010dà;®dd¬8õ¦®\u0090Fg^\u0015\u0010*\u009b¿\u0083^f$Ø\u008a\\\f\u0094±\u009bÏÀ\u0010Ú:sæ|Ç\u009fú¾búgO\u0093\u0003n\u0010\u008dþRàñÌz\u001d-\u009a)¢µ`Tk &:È»:§Qifµë\u000fÖïØéÀÒ\u0011öº¦\n\u0082<)ÉÍ\u000e\u007fK\r\u0018Êb\u0091¬\u009bWÂÂè¥ÜM/¡\u000b\u008eõ\u008a\u0097ÒQ¶p.\u0010m.2Q-ãq\u0084ü\u0013\rx~\u0014â÷\u0010Yñ]_¸ñh$\u0007DCy\u009aH±q\u0010£þºU0\u009c\u009b»è¸ÔE+\u0092Ø\u0016\u0010î¼Pe3.æCí`&\u008fy\u0085ÔG \u0001é\u008e/XD\u008cL\u009dh¦Ià}\\Év¬\u0089»\u0002©\u0099g0t\u009c\u0000\u0098×Ùð".length();
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
                  c = var18;
                  d = new String[15];
                  j = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[13];
                  int var3 = 0;
                  String var4 = "¶WË\u008d\u0097¹ÙÔ?ÕûÚ¹\u0088¬Y\u0010 Ü2P\u008c¿ì\u0007\u0091ï\u0093\u009ab\t\u001bn\u0099pý7¦ì/\u000e×\u009d\u0082\u008f®,\u0010ÕéÐ÷ÀÎd}¹\u001d\u0007Ô¢\u0098Ò|$RL\u0018Z²f·¨\u0093\u007f¤\u0083\u0098\u0012Æ)5Sïõ\u009fÞ\\";
                  int var5 = "¶WË\u008d\u0097¹ÙÔ?ÕûÚ¹\u0088¬Y\u0010 Ü2P\u008c¿ì\u0007\u0091ï\u0093\u009ab\t\u001bn\u0099pý7¦ì/\u000e×\u009d\u0082\u008f®,\u0010ÕéÐ÷ÀÎd}¹\u001d\u0007Ô¢\u0098Ò|$RL\u0018Z²f·¨\u0093\u007f¤\u0083\u0098\u0012Æ)5Sïõ\u009fÞ\\".length();
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
                              i = new Integer[13];
                              K = new mz((DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u007f.qe[ì\u001a\u0085¹H1ù\u0087Ü\rz";
                           var5 = "\u007f.qe[ì\u001a\u0085¹H1ù\u0087Ü\rz".length();
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

               var15 = "^UÝÀkhK\u0091¢åÜÌ}ø/Èï}\rµèH@\u001aiË\u0089\u0080h\u009a>\u0001 C\"pÓ¨ñ7 jÅ®Gë\u0019ÆÄìÁ\u001e\u0086\u0089ÁÆÙ\u0092RÓ¾(è\u001aë";
               var17 = "^UÝÀkhK\u0091¢åÜÌ}ø/Èï}\rµèH@\u001aiË\u0089\u0080h\u009a>\u0001 C\"pÓ¨ñ7 jÅ®Gë\u0019ÆÄìÁ\u001e\u0086\u0089ÁÆÙ\u0092RÓ¾(è\u001aë".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void D(String[] var0) {
      k = var0;
   }

   public static String[] W() {
      return k;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29937;
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
            throw new RuntimeException("su/catlean/_k", var10);
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
         throw new RuntimeException("su/catlean/_k" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28948;
      if (i[var3] == null) {
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
            throw new RuntimeException("su/catlean/_k", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("su/catlean/_k" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
