package su.catlean;

import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.Color;
import java.awt.Font;
import java.io.Closeable;
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
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;

public final class fc implements Closeable {
   @NotNull
   private Font d;
   @NotNull
   private Font T;
   private final float z;
   @NotNull
   private final Object2ObjectOpenHashMap y;
   @NotNull
   private final Object2ObjectOpenHashMap o;
   @NotNull
   private final ObjectArrayList V;
   @NotNull
   private final Char2ObjectArrayMap X;
   private int W;
   private float b;
   private static k9[] g;
   private static final long a = j0.a(7698060638023551586L, 5026271428635412109L, MethodHandles.lookup().lookupClass()).a(15889993763302L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;
   private static final long[] h;
   private static final Integer[] i;
   private static final Map j;

   public fc(@NotNull Font font, @NotNull Font fallBack, long a, float size) {
      var3 ^= a;
      long var6 = var3 ^ 39970920642236L;
      Intrinsics.checkNotNullParameter(var1, true.x<invokedynamic>(11677, 1090051873341674970L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.x<invokedynamic>(10593, 5058294610382491939L ^ var3));
      super();
      this.d = var1;
      this.T = var2;
      this.z = var5;
      this.y = new Object2ObjectOpenHashMap();
      this.o = new Object2ObjectOpenHashMap();
      this.V = new ObjectArrayList();
      this.X = new Char2ObjectArrayMap();
      this.i(var6);
   }

   public final float Z() {
      return this.b;
   }

   public final void j(float <set-?>) {
      this.b = var1;
   }

   public final void i(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 57282006561516L;
      int var3 = (int)((var1 ^ 57282006561516L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      this.W = s8.H((short)var3, (short)var4, var5).method_22683().method_4495();
      Font var6 = this.d.deriveFont(this.z * (float)this.W);
      Intrinsics.checkNotNullExpressionValue(var6, true.x<invokedynamic>(27371, 7589490498284262160L ^ var1));
      this.d = var6;
      var6 = this.T.deriveFont(this.z * (float)this.W);
      Intrinsics.checkNotNullExpressionValue(var6, true.x<invokedynamic>(17508, 6419431329443593630L ^ var1));
      this.T = var6;
   }

   public final void o(long a, @NotNull class_332 context, @NotNull String s, float x, float y, @NotNull Color color) {
      var1 ^= a;
      long var8 = var1 ^ 121714424146529L;
      Intrinsics.checkNotNullParameter(var3, true.x<invokedynamic>(12802, 9220444673028861955L ^ var1));
      Intrinsics.checkNotNullParameter(var4, "s");
      Intrinsics.checkNotNullParameter(var7, true.x<invokedynamic>(4492, 3362285419991943L ^ var1));
      Matrix3x2fStack var10001 = var3.method_51448();
      Intrinsics.checkNotNullExpressionValue(var10001, true.x<invokedynamic>(16220, 3167096399403105618L ^ var1));
      U(this, var10001, var4, var5, var6, var8, var7, false, 0, true.z<invokedynamic>(3295, 4526580766947955971L ^ var1), (Object)null);
   }

   public final void F(long a, @NotNull Matrix3x2fStack m, @NotNull String s, float x, float y, @NotNull Color color, boolean gradient, int offset) {
      var1 ^= a;
      long var10001 = var1 ^ 60665836647804L;
      int var10 = (int)((var1 ^ 60665836647804L) >>> 48);
      int var11 = (int)(var10001 << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var3, "m");
      Intrinsics.checkNotNullParameter(var4, "s");
      Intrinsics.checkNotNullParameter(var7, true.x<invokedynamic>(24943, 7486768610686878607L ^ var1));
      float var10008 = (float)this.W;
      float var13 = this.b;
      Font var28 = this.T;
      Font var27 = this.d;
      ObjectArrayList var26 = this.V;
      Char2ObjectArrayMap var25 = this.X;
      float var24 = var10008;
      vl var16 = vl.n;
      boolean var15 = false;
      this.b += 0.1F;
      Unit var29 = Unit.INSTANCE;
      var16.G(var3, var4, var5, (short)var10, (short)var11, var6, var7, var8, var9, var24, var25, var12, var26, var27, var28, var13, this.o);
   }

   // $FF: synthetic method
   public static void X(fc var0, Matrix3x2fStack var1, String var2, float var3, float var4, Color var5, boolean var6, int var7, int var8, long var9, Object var11) {
      var9 ^= a;
      long var12 = var9 ^ 21802279217529L;
      k9[] var14 = 4924994080925844195L.A<invokedynamic>(4924994080925844195L, var9);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var8 & true.z<invokedynamic>(17613, 1896103280112395144L ^ var9);
               if (var14 == null) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NumberFormatException var16) {
               throw var16.A<invokedynamic>(var16, 4967706954162070143L, var9);
            }

            var6 = false;
         }

         var10000 = var8 & true.z<invokedynamic>(27703, 8497370278358633335L ^ var9);
      }

      label28: {
         label27: {
            try {
               if (var14 == null) {
                  break label27;
               }

               if (var10000 == 0) {
                  break label28;
               }
            } catch (NumberFormatException var15) {
               throw var15.A<invokedynamic>(var15, 4967706954162070143L, var9);
            }

            var10000 = 0;
         }

         var7 = var10000;
      }

      var0.F(var12, var1, var2, var3, var4, var5, var6, var7);
   }

   public final void E(@NotNull Matrix3x2fStack m, int a, @NotNull String s, int a, float x, char a, float y, @NotNull Color color, boolean gradient, int offset) {
      long var11 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ a;
      long var13 = var11 ^ 52965431134760L;
      Intrinsics.checkNotNullParameter(var1, "m");
      Intrinsics.checkNotNullParameter(var3, "s");
      Intrinsics.checkNotNullParameter(var8, true.x<invokedynamic>(24943, 7486747458107621283L ^ var11));
      vl.n.S(var1, var13, var3, var5, var7, var8, var9, var10, (float)this.W, this.X, this.V, this.d, this.T, this.y);
   }

   // $FF: synthetic method
   public static void U(fc var0, Matrix3x2fStack var1, String var2, float var3, float var4, long var5, Color var7, boolean var8, int var9, int var10, Object var11) {
      var5 ^= a;
      long var10001 = var5 ^ 104388119738016L;
      int var12 = (int)((var5 ^ 104388119738016L) >>> 32);
      int var13 = (int)(var10001 << 32 >>> 48);
      int var14 = (int)(var10001 << 48 >>> 48);
      k9[] var15 = 2858739467197735190L.A<invokedynamic>(2858739467197735190L, var5);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var10 & true.z<invokedynamic>(5873, 335338741796229696L ^ var5);
               if (var15 == null) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NumberFormatException var17) {
               throw var17.A<invokedynamic>(var17, 2811802270282809738L, var5);
            }

            var8 = false;
         }

         var10000 = var10 & true.z<invokedynamic>(10464, 4295563436027997268L ^ var5);
      }

      label28: {
         label27: {
            try {
               if (var15 == null) {
                  break label27;
               }

               if (var10000 == 0) {
                  break label28;
               }
            } catch (NumberFormatException var16) {
               throw var16.A<invokedynamic>(var16, 2811802270282809738L, var5);
            }

            var10000 = 0;
         }

         var9 = var10000;
      }

      var0.E(var1, var12, var2, var13, var3, (char)var14, var4, var7, var8, var9);
   }

   public final void q(@NotNull Matrix3x2fStack m, long a, @NotNull String s, float x, float y, @NotNull Color color) {
      var2 ^= a;
      long var8 = var2 ^ 23606226746288L;
      long var10 = var2 ^ 100275758575681L;
      long var12 = var2 ^ 108296071482579L;
      Intrinsics.checkNotNullParameter(var1, "m");
      Intrinsics.checkNotNullParameter(var4, "s");
      Intrinsics.checkNotNullParameter(var7, true.x<invokedynamic>(24943, 7486805209914836432L ^ var2));
      U(this, var1, var4, var5 - this.e(var10, var4) / 2.0F, var6 - vl.n.A(var8, var4, this.X, this.V, this.d, this.T, (float)this.W) / 2.0F, var12, var7, false, 0, true.z<invokedynamic>(17793, 6561113854117444334L ^ var2), (Object)null);
   }

   public final void R(@NotNull class_332 context, @NotNull String s, float x, float y, long a, @NotNull Color color) {
      var5 ^= a;
      long var8 = var5 ^ 105025201071965L;
      long var10 = var5 ^ 19576762346668L;
      long var12 = var5 ^ 44547162771518L;
      Intrinsics.checkNotNullParameter(var1, true.x<invokedynamic>(16953, 2219062670053325420L ^ var5));
      Intrinsics.checkNotNullParameter(var2, "s");
      Intrinsics.checkNotNullParameter(var7, true.x<invokedynamic>(24943, 7486727878139943229L ^ var5));
      Matrix3x2fStack var10001 = var1.method_51448();
      Intrinsics.checkNotNullExpressionValue(var10001, true.x<invokedynamic>(5311, 7053509230359145711L ^ var5));
      U(this, var10001, var2, var3 - this.e(var10, var2) / 2.0F, var4 - vl.n.A(var8, var2, this.X, this.V, this.d, this.T, (float)this.W) / 2.0F, var12, var7, false, 0, true.z<invokedynamic>(17793, 6561050542726931971L ^ var5), (Object)null);
   }

   public final void d(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 22758554399198L;
      vl.n.f(var3, this.o);
      this.b = 0.0F;
   }

   public final float e(long a, @NotNull String s) {
      var1 ^= a;
      long var4 = var1 ^ 94127948563648L;
      Intrinsics.checkNotNullParameter(var3, "s");
      return vl.n.Z(var3, this.X, var4, this.V, this.d, this.T, (float)this.W);
   }

   public void close() {
      fc var1 = this;

      Result.Companion var10000;
      Object var2;
      try {
         var10000 = Result.Companion;
         fc var5 = (fc)var1;
         boolean var3 = false;
         var5.V.removeIf(fc::r);
         var5.X.clear();
         var2 = Result.constructor-impl(Unit.INSTANCE);
      } catch (Throwable var4) {
         var10000 = Result.Companion;
         var2 = Result.constructor-impl(ResultKt.createFailure(var4));
      }

   }

   public final void J(@NotNull class_332 context, @NotNull String s, float x, float y, int offset, long a) {
      var6 ^= a;
      long var10001 = var6 ^ 7155796023775L;
      int var8 = (int)((var6 ^ 7155796023775L) >>> 32);
      int var9 = (int)(var10001 << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.x<invokedynamic>(16953, 2219086998469276198L ^ var6));
      Intrinsics.checkNotNullParameter(var2, "s");
      Matrix3x2fStack var11 = var1.method_51448();
      Intrinsics.checkNotNullExpressionValue(var11, true.x<invokedynamic>(5311, 7053603650204574885L ^ var6));
      char var10006 = (char)var10;
      Color var10008 = Color.WHITE;
      Intrinsics.checkNotNullExpressionValue(var10008, true.x<invokedynamic>(11313, 2497875787702377516L ^ var6));
      this.E(var11, var8, var2, var9, var3, var10006, var4, var10008, true, var5);
   }

   public final void x(@NotNull class_332 context, @NotNull String s, float x, float y, int i, long a) {
      var6 ^= a;
      long var8 = var6 ^ 102686519418320L;
      long var10 = var6 ^ 66364354186813L;
      Intrinsics.checkNotNullParameter(var1, true.x<invokedynamic>(16953, 2219145517822102288L ^ var6));
      Intrinsics.checkNotNullParameter(var2, "s");
      this.J(var1, var2, var3 - this.e(var8, var2) / 2.0F, var4, var5, var10);
   }

   private static final boolean m(a var0) {
      long var1 = a ^ 64986297655711L;
      long var3 = var1 ^ 2753075164377L;
      var0.H(var3);
      return true;
   }

   private static final boolean r(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   public static void p(k9[] var0) {
      g = var0;
   }

   public static k9[] L() {
      return g;
   }

   static {
      long var20 = a ^ 49259574886490L;
      k9[] var10000 = new k9[3];
      f = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 8564954262675691242L, var20);
      Cipher var11;
      Cipher var22 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[11];
      int var16 = 0;
      String var15 = "\u0018È<â\u009bKD~L\"|J«Í\u0016$\u0010+M?nXu÷\u009d¯\u009dÁÜ\u0089\u001e\u008d\u008c\u0010Ü´Û6Ëdl¦\u0014@lL¶ì,Ø\u0010Äÿô\u000fç\u001d\u0004\u0083·I\u0007öÅK%g \u009aU}üU¶½þ\\N\u009b¹½*Si\u0096\u0003=ÆdÇ^\u0016P\u009dm\u0081ß\u0017-g Ø\u0007\u008c¯ÅtSâÁzvÿ`\u008d¥\u0085J\f\u001f#yÎ\u009b\u007fÀ\u0088\u008fØãëéÏ\u0010h¯l×Bñ3\u0087Nq¡4\u0007º\u0018ý\u0018\\Ñ\u0001LAÇ\u0098ÿ\u0017²Àr\u0090W\u00ad:~a\u009bËÙ\u0019\u001fT \u001e(·«\u0096$\u0083i\u0089Vß\u0099\u001b\u008f:ê¡ÝMH\u0019!\u008d*Dw¦w\u0006ÿ\tê";
      int var17 = "\u0018È<â\u009bKD~L\"|J«Í\u0016$\u0010+M?nXu÷\u009d¯\u009dÁÜ\u0089\u001e\u008d\u008c\u0010Ü´Û6Ëdl¦\u0014@lL¶ì,Ø\u0010Äÿô\u000fç\u001d\u0004\u0083·I\u0007öÅK%g \u009aU}üU¶½þ\\N\u009b¹½*Si\u0096\u0003=ÆdÇ^\u0016P\u009dm\u0081ß\u0017-g Ø\u0007\u008c¯ÅtSâÁzvÿ`\u008d¥\u0085J\f\u001f#yÎ\u009b\u007fÀ\u0088\u008fØãëéÏ\u0010h¯l×Bñ3\u0087Nq¡4\u0007º\u0018ý\u0018\\Ñ\u0001LAÇ\u0098ÿ\u0017²Àr\u0090W\u00ad:~a\u009bËÙ\u0019\u001fT \u001e(·«\u0096$\u0083i\u0089Vß\u0099\u001b\u008f:ê¡ÝMH\u0019!\u008d*Dw¦w\u0006ÿ\tê".length();
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
                  c = var18;
                  e = new String[11];
                  j = new HashMap(13);
                  Cipher var0;
                  var22 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[6];
                  int var3 = 0;
                  String var4 = "=Í»zÇ©Ù\u009eJ¸ôt½eG0\u0096b\u0090\u00835&;dH^´í{;ÚË";
                  int var5 = "=Í»zÇ©Ù\u009eJ¸ôt½eG0\u0096b\u0090\u00835&;dH^´í{;ÚË".length();
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
                              h = var6;
                              i = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "À\u008fnx\u001ax\u0001Ò»aô¿Êñèð";
                           var5 = "À\u008fnx\u001ax\u0001Ò»aô¿Êñèð".length();
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

               var15 = "þåÁnLò¦ëÕôBâîÁènU£Ø%ÞÊ\té§Á=\u0004~\u0012à\u0007\u0010Xü °\u001c¢¼·ðCª½Ü\tÚ[";
               var17 = "þåÁnLò¦ëÕôBâîÁènU£Ø%ÞÊ\té§Á=\u0004~\u0012à\u0007\u0010Xü °\u001c¢¼·ðCª½Ü\tÚ[".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14791;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/fc", var10);
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
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/fc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25107;
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
            throw new RuntimeException("su/catlean/fc", var14);
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
         throw new RuntimeException("su/catlean/fc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
