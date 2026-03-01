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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class _3 {
   @NotNull
   private final String R;
   @NotNull
   private final String Z;
   @NotNull
   private final String T;
   @NotNull
   private final aa x;
   private boolean F;
   private static String[] r;
   private static final long a = j0.a(61134621552503393L, 4385469781156184167L, MethodHandles.lookup().lookupClass()).a(84037052594131L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long h;

   public _3(@NotNull String name, @NotNull String bind, @NotNull String extra, @NotNull aa animation, boolean removing, long a) {
      var6 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.r<invokedynamic>(4825, 8652786055242123082L ^ var6));
      Intrinsics.checkNotNullParameter(var2, true.r<invokedynamic>(5293, 4948820000172671281L ^ var6));
      Intrinsics.checkNotNullParameter(var3, true.r<invokedynamic>(4776, 7070821572294903607L ^ var6));
      Intrinsics.checkNotNullParameter(var4, true.r<invokedynamic>(17932, 6295714519074067358L ^ var6));
      super();
      this.R = var1;
      this.Z = var2;
      this.T = var3;
      this.x = var4;
      this.F = var5;
   }

   // $FF: synthetic method
   public _3(String var1, short var2, int var3, String var4, String var5, aa var6, short var7, boolean var8, int var9, DefaultConstructorMarker var10) {
      long var11 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var7 << 48 >>> 48) ^ a;
      long var13 = var11 ^ 6161222802193L;
      long var10001 = var11 ^ 84520175009713L;
      int var15 = (int)((var11 ^ 84520175009713L) >>> 48);
      int var16 = (int)(var10001 << 16 >>> 48);
      int var17 = (int)(var10001 << 32 >>> 32);
      if ((var9 & 4) != 0) {
         var5 = "";
      }

      if ((var9 & true.k<invokedynamic>(6517, 7443217905596515239L ^ var11)) != 0) {
         var6 = new aa(sa.OUT_QUINT, h, (short)var15, (short)var16, var17);
      }

      if ((var9 & true.k<invokedynamic>(8881, 7459852101027756129L ^ var11)) != 0) {
         var8 = false;
      }

      this(var1, var4, var5, var6, var8, var13);
   }

   @NotNull
   public final String E() {
      return this.R;
   }

   @NotNull
   public final String Z() {
      return this.Z;
   }

   @NotNull
   public final String Y() {
      return this.T;
   }

   @NotNull
   public final aa t() {
      return this.x;
   }

   public final boolean i() {
      return this.F;
   }

   public final void t(boolean <set-?>) {
      this.F = var1;
   }

   @NotNull
   public final String v() {
      return this.R;
   }

   @NotNull
   public final String F() {
      return this.Z;
   }

   @NotNull
   public final String R() {
      return this.T;
   }

   @NotNull
   public final aa a() {
      return this.x;
   }

   public final boolean O() {
      return this.F;
   }

   @NotNull
   public final _3 z(char a, char a, @NotNull String name, @NotNull String bind, @NotNull String extra, @NotNull aa animation, boolean removing, int a) {
      long var9 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var8 << 32 >>> 32) ^ a;
      long var11 = var9 ^ 69134101404139L;
      Intrinsics.checkNotNullParameter(var3, true.r<invokedynamic>(4197, 4053075943070708266L ^ var9));
      Intrinsics.checkNotNullParameter(var4, true.r<invokedynamic>(5209, 2513200542508955156L ^ var9));
      Intrinsics.checkNotNullParameter(var5, true.r<invokedynamic>(8234, 5313467722982785644L ^ var9));
      Intrinsics.checkNotNullParameter(var6, true.r<invokedynamic>(10525, 4864120411511360339L ^ var9));
      return new _3(var3, var4, var5, var6, var7, var11);
   }

   // $FF: synthetic method
   public static _3 k(long param0, _3 param2, String param3, String param4, String param5, aa param6, boolean param7, int param8, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 29607182407270L;
      boolean var3 = this.F;
      aa var4 = this.x;
      String var5 = this.T;
      String var6 = this.Z;
      String var7 = this.R;
      String var10000 = 4051.r<invokedynamic>(4051, 5483409756547957805L ^ var1);
      return var10000 + var7 + true.r<invokedynamic>(4174, 25719995565890494L ^ var1) + var6 + true.r<invokedynamic>(7669, 3557738826721187328L ^ var1) + var5 + true.r<invokedynamic>(24489, 938931176567641170L ^ var1) + var4 + true.r<invokedynamic>(18182, 6544363940346629371L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 4762409429951L;
      int var3 = this.R.hashCode();
      var3 = var3 * true.k<invokedynamic>(5883, 3881760123680496315L ^ var1) + this.Z.hashCode();
      var3 = var3 * true.k<invokedynamic>(24995, 598402459789454818L ^ var1) + this.T.hashCode();
      var3 = var3 * true.k<invokedynamic>(24995, 598402459789454818L ^ var1) + this.x.hashCode();
      var3 = var3 * true.k<invokedynamic>(24995, 598402459789454818L ^ var1) + Boolean.hashCode(this.F);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public static void F(String[] var0) {
      r = var0;
   }

   public static String[] N() {
      return r;
   }

   static {
      long var25 = a ^ 121216092469773L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, -7663285040260854247L, var25);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[13];
      int var21 = 0;
      String var20 = "Q/æ°à\bó\u007f/\u000e\u000b+AF\u0015`\bC-\u0014\u0005ÀãX\u0010q\u0016y()`\u0007\u0080Ú+ïì_L3\u001b \u0005v\u0091@òý>\u0018W¾mdüjw<`?vä÷QÀo¸\u009f\u0092½zá7ã\u0010;¼Uû\u000b\u0085øûþc\u007f?¦Ó3ê f¶`å\f\u009c°djcø¯\u0088ËÉ\u000eç\u0083\u001fRÊóp©\u0016\rúsNá\u001ea\u0010\u001dÌu!\u0015Bö7èk\u0004Ð®ÂÕj\u0010¿<\u008al¤\";\u008b.¼q\u00adk\u007f\u008a. ñªy¾]LVÌWÇ^×÷Æ¶QFöZ\u001dLÚÜ\u0088a\u0092\u0012\u0092¡\u0017B\u0004\u0010<F\u001dÖEý\u009f@U;Y\u0099ý\u009a§u\u0010I\u008duö\u008e¥µþå³\u009fÜ\u0092\u001b\u0000\u009f\u0010öð`æ\u0090H\u0014C7Åºê\"é]\u001e";
      int var22 = "Q/æ°à\bó\u007f/\u000e\u000b+AF\u0015`\bC-\u0014\u0005ÀãX\u0010q\u0016y()`\u0007\u0080Ú+ïì_L3\u001b \u0005v\u0091@òý>\u0018W¾mdüjw<`?vä÷QÀo¸\u009f\u0092½zá7ã\u0010;¼Uû\u000b\u0085øûþc\u007f?¦Ó3ê f¶`å\f\u009c°djcø¯\u0088ËÉ\u000eç\u0083\u001fRÊóp©\u0016\rúsNá\u001ea\u0010\u001dÌu!\u0015Bö7èk\u0004Ð®ÂÕj\u0010¿<\u008al¤\";\u008b.¼q\u00adk\u007f\u008a. ñªy¾]LVÌWÇ^×÷Æ¶QFöZ\u001dLÚÜ\u0088a\u0092\u0012\u0092¡\u0017B\u0004\u0010<F\u001dÖEý\u009f@U;Y\u0099ý\u009a§u\u0010I\u008duö\u008e¥µþå³\u009fÜ\u0092\u001b\u0000\u009f\u0010öð`æ\u0090H\u0014C7Åºê\"é]\u001e".length();
      char var19 = 24;
      int var18 = -1;

      label64:
      while(true) {
         ++var18;
         String var27 = var20.substring(var18, var18 + var19);
         byte var10001 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = a(var24).intern();
            switch(var10001) {
            case 0:
               var23[var21++] = var33;
               if ((var18 += var19) >= var22) {
                  b = var23;
                  c = new String[13];
                  g = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[6];
                  int var8 = 0;
                  String var9 = "&\u008a%- ý\u0092_\u0019f*t\u009f\u0083Äß]±jt\u0000\u0093ú§¹\u008c\u000bÝânY\u008c";
                  int var10 = "&\u008a%- ý\u0092_\u0019f*t\u009f\u0083Äß]±jt\u0000\u0093ú§¹\u008c\u000bÝânY\u008c".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var31 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                     long[] var30 = var11;
                     var31 = var8++;
                     long var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var37 = -1;

                     while(true) {
                        long var13 = var36;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var39 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var37) {
                        case 0:
                           var30[var31] = var39;
                           if (var7 >= var10) {
                              e = var11;
                              f = new Integer[6];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 3169363208463322393L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              h = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "%Ú£óþ]\u001cÑÖ)/|¥B«\u008e";
                           var10 = "%Ú£óþ]\u001cÑÖ)/|¥B«\u008e".length();
                           var7 = 0;
                        }

                        var31 = var7;
                        var7 += 8;
                        var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                        var30 = var11;
                        var31 = var8++;
                        var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var37 = 0;
                     }
                  }
               }

               var19 = var20.charAt(var18);
               break;
            default:
               var23[var21++] = var33;
               if ((var18 += var19) < var22) {
                  var19 = var20.charAt(var18);
                  continue label64;
               }

               var20 = "§´\u008fHË\u0089ks3\u009fïØjå\u0007Â\\\u009cò×ì¤ð°\u0018LÛ\u0014Gq¤ç&Úðµ#ÎmÁwfî><Ô½õ\u008e";
               var22 = "§´\u008fHË\u0089ks3\u009fïØjå\u0007Â\\\u009cò×ì¤ð°\u0018LÛ\u0014Gq¤ç&Úðµ#ÎmÁwfî><Ô½õ\u008e".length();
               var19 = 24;
               var18 = -1;
            }

            ++var18;
            var27 = var20.substring(var18, var18 + var19);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13219;
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
            throw new RuntimeException("su/catlean/_3", var10);
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
         throw new RuntimeException("su/catlean/_3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2503;
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
            throw new RuntimeException("su/catlean/_3", var14);
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
         throw new RuntimeException("su/catlean/_3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
