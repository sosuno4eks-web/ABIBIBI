package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class c_ {
   @NotNull
   private final ih v;
   private int Y;
   private int m;
   private int N;
   private int S;
   private int F;
   private float B;
   private float U;
   @NotNull
   private gq o;
   @NotNull
   private gq n;
   private int K;
   @NotNull
   private final ArrayList a;
   @NotNull
   private final ArrayList P;
   @NotNull
   private final aa p;
   @NotNull
   private final aa t;
   @NotNull
   private final aa e;
   @Nullable
   private ba f;
   private boolean s;
   private static final long b = j0.a(8036601263314764753L, 7402667807065427725L, MethodHandles.lookup().lookupClass()).a(129138785683084L);
   private static final String[] c;
   private static final String[] d;
   private static final Map g = new HashMap(13);
   private static final long[] h;
   private static final Integer[] i;
   private static final Map j;
   private static final long[] k;
   private static final Long[] l;
   private static final Map q;

   public c_(@NotNull ih category, int offset, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final ih T() {
      return this.v;
   }

   public final int P() {
      return this.Y;
   }

   public final void F(int <set-?>) {
      this.Y = var1;
   }

   public final int j() {
      return this.m;
   }

   public final void h(int <set-?>) {
      this.m = var1;
   }

   public final int c() {
      return this.N;
   }

   public final void t(int <set-?>) {
      this.N = var1;
   }

   public final int q() {
      return this.S;
   }

   public final void M(int <set-?>) {
      this.S = var1;
   }

   public final int u() {
      return this.F;
   }

   public final void L(int <set-?>) {
      this.F = var1;
   }

   public final float B() {
      return this.B;
   }

   public final void q(float <set-?>) {
      this.B = var1;
   }

   public final float b() {
      return this.U;
   }

   public final void v(float <set-?>) {
      this.U = var1;
   }

   @NotNull
   public final gq D() {
      return this.o;
   }

   public final void k(char a, @NotNull gq <set-?>, int a, short a) {
      long var5 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      Intrinsics.checkNotNullParameter(var2, true.c<invokedynamic>(15806, 5998489260172809233L ^ var5));
      this.o = var2;
   }

   @NotNull
   public final ArrayList F() {
      return this.a;
   }

   @NotNull
   public final ArrayList m() {
      return this.P;
   }

   @Nullable
   public final ba a() {
      return this.f;
   }

   public final void D(@Nullable ba <set-?>) {
      this.f = var1;
   }

   public final boolean W() {
      return this.s;
   }

   public final void a(boolean <set-?>) {
      this.s = var1;
   }

   public final void T(char a, int a, @NotNull class_332 context, int mouseX, int mouseY, int a) {
      // $FF: Couldn't be decompiled
   }

   private final void a(long param1, int param3, int param4, class_332 param5) {
      // $FF: Couldn't be decompiled
   }

   private final void v(long param1, int param3, int param4, class_332 param5, boolean param6) {
      // $FF: Couldn't be decompiled
   }

   public final void I(char a, short a, int a, @NotNull gq selector) {
      // $FF: Couldn't be decompiled
   }

   public final void M(double mouseX, double mouseY, long a, int button) {
      // $FF: Couldn't be decompiled
   }

   public final void x(long a, double mouseX, double mouseY, int button) {
      // $FF: Couldn't be decompiled
   }

   public final void O(int key, char a, int a, short a) {
      // $FF: Couldn't be decompiled
   }

   public final void W(char char, long a) {
      // $FF: Couldn't be decompiled
   }

   public final boolean W(char a, double mouseX, double mouseY, double verticalAmount, double horizontalAmmount, long a) {
      // $FF: Couldn't be decompiled
   }

   public final void j(double verticalAmount, double horizontalAmmount) {
      this.F += (int)(var1 * (double)10.0F);
      this.S += (int)(var3 * (double)10.0F);
   }

   private final float f(float var1, float var2, float var3, long var4) {
      var4 ^= b;

      float var10000;
      label17: {
         try {
            if (au.a.z() > 5) {
               var10000 = 1.0F / (float)au.a.z();
               break label17;
            }
         } catch (NumberFormatException var7) {
            throw var7.A<invokedynamic>(var7, 1191491911005278559L, var4);
         }

         var10000 = 0.016F;
      }

      float var6 = Math.clamp(var10000 * var3, 0.0F, 1.0F);
      return (1.0F - var6) * var1 + var6 * var2;
   }

   public final void L(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final float Z(long param1, float param3) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var22 = b ^ 19948560704482L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[10];
      int var29 = 0;
      String var28 = "*O`DS\u0087\u0006pëó\u0017\u008az¯o\u0005$\fy\u000f\u0002µÍ\u0013 ,ã\u009dEÆ×1<\\\nÝþ\u009f^°/ \u0012\u00809%û\u0002A¨\u008aY¯À\u0011Û\t\u0010ö¢ëò+e¿\u0085\u0016\u0080\u001d5)sm\u0096 `m(Ï\b\u0017É¸\u0098\u0082G\u00176XãI!s`º+Ð×á!\u001e\u0085¤\u0091\u001a\u0086\r ëã\u0089(\u0085wãÛPa\u000b6Ò\u0002¢ÌrÊR\u009b\u009bÑ\u001f;®[\u0094\u0089é\u0001×ð\u0010\u000f\u001d\u009f\u009f\u008e\u0086|zÃi\u0083qûÈzd §S,wÅåg\u00893\u0092,ÈbÌ=\u0016uGÚpÞc\u0097\u001d\u008e\u007f\u009aú«HÉæ ?\u0098©S\u000b\u001e¾\u0010\u0003¡ïØá0\u000fxM\u0010àÒkoþ\u0002\u000f\u008aC«y\u001djA";
      int var30 = "*O`DS\u0087\u0006pëó\u0017\u008az¯o\u0005$\fy\u000f\u0002µÍ\u0013 ,ã\u009dEÆ×1<\\\nÝþ\u009f^°/ \u0012\u00809%û\u0002A¨\u008aY¯À\u0011Û\t\u0010ö¢ëò+e¿\u0085\u0016\u0080\u001d5)sm\u0096 `m(Ï\b\u0017É¸\u0098\u0082G\u00176XãI!s`º+Ð×á!\u001e\u0085¤\u0091\u001a\u0086\r ëã\u0089(\u0085wãÛPa\u000b6Ò\u0002¢ÌrÊR\u009b\u009bÑ\u001f;®[\u0094\u0089é\u0001×ð\u0010\u000f\u001d\u009f\u009f\u008e\u0086|zÃi\u0083qûÈzd §S,wÅåg\u00893\u0092,ÈbÌ=\u0016uGÚpÞc\u0097\u001d\u008e\u007f\u009aú«HÉæ ?\u0098©S\u000b\u001e¾\u0010\u0003¡ïØá0\u000fxM\u0010àÒkoþ\u0002\u000f\u008aC«y\u001djA".length();
      char var27 = 24;
      int var26 = -1;

      label72:
      while(true) {
         ++var26;
         String var33 = var28.substring(var26, var26 + var27);
         byte var10001 = -1;

         while(true) {
            byte[] var32 = var24.doFinal(var33.getBytes("ISO-8859-1"));
            String var39 = a(var32).intern();
            switch(var10001) {
            case 0:
               var31[var29++] = var39;
               if ((var26 += var27) >= var30) {
                  c = var31;
                  d = new String[10];
                  j = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[15];
                  int var14 = 0;
                  String var15 = "\u0007È£\u0098\u0088¿\u0016MîÐd¡<ÝÉ¬\u0082¶¯%Z¶¿\u0081x¤\"¬Z/i\u0099\n¿¼£\u0092\u0085~\u0087°BM\u001e\u0007ÆaNfü\u008aôÚðTk\u0088þ\\.ë~3\u0082:\nFRkj\u0098\u00133÷OÖ\f¸\u00957lOÙ¾Î]\u009cKÂ&d0\u008f¯\u0091\u0087ÛUêHàÕyÄ";
                  int var16 = "\u0007È£\u0098\u0088¿\u0016MîÐd¡<ÝÉ¬\u0082¶¯%Z¶¿\u0081x¤\"¬Z/i\u0099\n¿¼£\u0092\u0085~\u0087°BM\u001e\u0007ÆaNfü\u008aôÚðTk\u0088þ\\.ë~3\u0082:\nFRkj\u0098\u00133÷OÖ\f¸\u00957lOÙ¾Î]\u009cKÂ&d0\u008f¯\u0091\u0087ÛUêHàÕyÄ".length();
                  int var13 = 0;

                  label54:
                  while(true) {
                     int var37 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var37, var13).getBytes("ISO-8859-1");
                     long[] var36 = var17;
                     var37 = var14++;
                     long var41 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var19 = var41;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var44 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var42) {
                        case 0:
                           var36[var37] = var44;
                           if (var13 >= var16) {
                              h = var17;
                              i = new Integer[15];
                              q = new HashMap(13);
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var6 = new long[3];
                              int var3 = 0;
                              String var4 = "`®×\u0080\\o\u0081\u008cÀ¿\n\u0004X\u0085FKÕ«aIí[\u0013[";
                              int var5 = "`®×\u0080\\o\u0081\u008cÀ¿\n\u0004X\u0085FKÕ«aIí[\u0013[".length();
                              int var2 = 0;

                              do {
                                 var37 = var2;
                                 var2 += 8;
                                 byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                 var37 = var3++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var45 = true;
                                 var6[var37] = var44;
                              } while(var2 < var5);

                              k = var6;
                              l = new Long[3];
                              return;
                           }
                           break;
                        default:
                           var36[var37] = var44;
                           if (var13 < var16) {
                              continue label54;
                           }

                           var15 = "Q\u008fÍÄ\u0081Î\"[W°VJ\u000be\u008b\u000e";
                           var16 = "Q\u008fÍÄ\u0081Î\"[W°VJ\u000be\u008b\u000e".length();
                           var13 = 0;
                        }

                        var37 = var13;
                        var13 += 8;
                        var18 = var15.substring(var37, var13).getBytes("ISO-8859-1");
                        var36 = var17;
                        var37 = var14++;
                        var41 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var42 = 0;
                     }
                  }
               }

               var27 = var28.charAt(var26);
               break;
            default:
               var31[var29++] = var39;
               if ((var26 += var27) < var30) {
                  var27 = var28.charAt(var26);
                  continue label72;
               }

               var28 = "Næ\u0096N±Ò\u009ccæÛhÍ\u001c\u009a*ð§\u009cpí\u0012\u009eÉÊÓH\u0091üùÙ \u0087 \u009a½\u009e&\u001f¨Yâ^±\u000ff\u0017$\b(\u008da\u000e\bcBSÁV0\"\u009c¦þm\u0091";
               var30 = "Næ\u0096N±Ò\u009ccæÛhÍ\u001c\u009a*ð§\u009cpí\u0012\u009eÉÊÓH\u0091üùÙ \u0087 \u009a½\u009e&\u001f¨Yâ^±\u000ff\u0017$\b(\u008da\u000e\bcBSÁV0\"\u009c¦þm\u0091".length();
               var27 = ' ';
               var26 = -1;
            }

            ++var26;
            var33 = var28.substring(var26, var26 + var27);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2285;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/c_", var10);
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
         throw new RuntimeException("su/catlean/c_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27281;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = h[var3];
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
            throw new RuntimeException("su/catlean/c_", var14);
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
         throw new RuntimeException("su/catlean/c_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10313;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = k[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/c_", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         l[var3] = var15;
      }

      return l[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/c_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
