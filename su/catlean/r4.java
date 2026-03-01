package su.catlean;

import java.awt.Color;
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
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_742;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;

public final class r4 extends nm {
   @NotNull
   public static final r4 B;
   private static final long c = j0.a(6971865196291739211L, 1968847121863035196L, MethodHandles.lookup().lookupClass()).a(101157216307756L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;
   private static final long[] j;
   private static final Integer[] m;
   private static final Map n;

   private r4(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 134504493300920L;
      super(true.m<invokedynamic>(25078, 7852271247634225729L ^ var1), var3);
   }

   public void k(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   public void O(@NotNull class_332 context, long a) {
      long var4 = var2 ^ 92054398390760L;
      long var6 = var2 ^ 103115379732612L;
      long var8 = var2 ^ 75233139921450L;
      long var10 = var2 ^ 34044142049017L;
      Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(21196, 1728502932451164622L ^ var2));
      g3.R(var8).J(var1, false.m<invokedynamic>(0, 8069003441733391110L ^ var2), this.Q(var6) + 33.0F, this.b(var4) + 0.5F, true.j<invokedynamic>(27263, 8023387103945436594L ^ var2), var10);
   }

   private final void x(class_332 var1, float var2, long var3) {
      var3 ^= c;
      long var5 = var3 ^ 135601250692084L;
      long var7 = var3 ^ 31414046134333L;
      long var9 = var3 ^ 49317890649538L;
      var1.method_51448().pushMatrix();
      gk var10000 = gk.E;
      Matrix3x2fStack var10001 = var1.method_51448();
      Intrinsics.checkNotNullExpressionValue(var10001, true.m<invokedynamic>(18175, 995341488017780717L ^ var3));
      Matrix3x2f var11 = (Matrix3x2f)var10001;
      class_746 var10002 = s8.f(var7);
      Intrinsics.checkNotNull(var10002, true.m<invokedynamic>(4189, 6860910420448508229L ^ var3));
      class_2960 var12 = ((class_742)var10002).method_52814().comp_1626().comp_3627();
      Intrinsics.checkNotNullExpressionValue(var12, true.m<invokedynamic>(20699, 310182362520664516L ^ var3));
      float var10003 = var2 + 3.0F;
      float var10004 = this.b(var5) + 1.0F;
      Color var10007 = Color.WHITE;
      Intrinsics.checkNotNullExpressionValue(var10007, true.m<invokedynamic>(4507, 3798893176139577482L ^ var3));
      gk.M(var10000, var11, var12, var10003, var10004, 24.0F, 24.0F, var10007, (Color)null, (Color)null, (Color)null, 0.125F, 0.125F, 0.25F, var9, 0.25F, false, true.j<invokedynamic>(22653, 1501462829415441835L ^ var3), (Object)null);
      var10000 = gk.E;
      var10001 = var1.method_51448();
      Intrinsics.checkNotNullExpressionValue(var10001, true.m<invokedynamic>(24306, 7454366650046789605L ^ var3));
      var11 = (Matrix3x2f)var10001;
      var10002 = s8.f(var7);
      Intrinsics.checkNotNull(var10002, true.m<invokedynamic>(13229, 4833345462352829105L ^ var3));
      var12 = ((class_742)var10002).method_52814().comp_1626().comp_3627();
      Intrinsics.checkNotNullExpressionValue(var12, true.m<invokedynamic>(25399, 1349646889466366508L ^ var3));
      var10003 = var2 + 1.0F;
      var10004 = this.b(var5) - 1.0F;
      var10007 = Color.WHITE;
      Intrinsics.checkNotNullExpressionValue(var10007, true.m<invokedynamic>(4650, 1501405599638420281L ^ var3));
      gk.M(var10000, var11, var12, var10003, var10004, 28.0F, 28.0F, var10007, (Color)null, (Color)null, (Color)null, 0.625F, 0.125F, 0.75F, var9, 0.25F, false, true.j<invokedynamic>(20646, 1036226062058827123L ^ var3), (Object)null);
      var1.method_51448().popMatrix();
   }

   static {
      long var20 = c ^ 30774632896755L;
      long var22 = var20 ^ 108121894951015L;
      i = new HashMap(13);
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
      String var15 = "½D´Ä£¿9\u0088ò\u0082h:ã0ÞòQµ\u0014\u001bZ%¥PGwµ\u001aß\u0096Xñ*èý{Ac8/\u0010Ì\u0084¤°ß³é¢\u0019DÃ¡»ñç\u0007\u0010wFV¢\u0090vvÑÝ\u0018g\u0016WÊTÈ\u0088\u0087\u0095/Í\u0005«æZx\u0099ÇWÇHëL®DÕë\u0002\u0015%Ô\n(\u0016TÜÂã\u00adªuÓÜ\u009f\u0093<$\u0085ÖG\u0013+êº%ªïE¿\u0019\b\u0001$\u001c\u001aßy¼ÜÙ!*ìÞÙ,\u001b\ríS\u0000'a_2É\u009eF»\u0095o!\u0088r¸Es\u0018m\u0090\u0082¤cYIK\u0018<4Ý\u001a¢\u0095©¨à ù#ámü\u001aÜ\u0007ËÏô\f!åY^µ¦\u0012ò¦\u0097ÕøtÁ(\u0090\u0093\u00ad\u0005µ5\u009f@~\u001e¤¼\u0095Ü0©lbô¼Ñ_¨kJò»HYIçh·z\u0092àõf\u0092\u0000\u0010½éÔ\u009e\u0019îÆÈ[?\u007f\b#GÉª\u0010? P6\u0093r\u0091\u0099sK?*\u001ehôû\u0080\u0091\t\u0093÷Z¸\u0088@\u0014{qÝé:Ñ¯\u008e\u0090|ß?|\u00020k\u0010Æ\u008bk£¤â+»\u0087W_\u009c`ÃO×ýi\u008b\u00041ù\u008cüþâå=á\u0015\u0007\u009dmÙ\u0018±¼üA¬x?\u0010ÈÎ`î·Pd¬ÁnÁ\u009cÍ,\u001az\u0097½%S0éòÅ8\u001d\u0019¦\u0092_SÅ\u0007\u009b-\u0001\u0007\u0096s²0½âK\u0096xÝTÇ\u0003Z\u0082H\u008d\u001erNKÜ\u0018 ò>ü]·FÖZÉF\u009e!m.Ëhç£kø\u0081\u0099\u0003 vT\u0096\u0093\u0082qK\u00ad\u00ad\u008f\u0080\u0002\u0085\u0093rn%Î ¾\u009f×\u0012]}¾Âp±9\u008e( å×®u2Î\u0011[ò`Ëàô5\u008f\u0015\u008bÛËÉ.p¶XK \u0094\u0083\t¤7±(Ã»å_öã\u009dÂ\u0092(/·\u001a\u0016\u000exÝ\u009e[ð\u000fiëæM\u0018RbÏ¥¢(>õþ&³âç¾\u0010<\u0003y\u0088¾\u0016\u0094\u00966¾QH×\u0083\u0000ú";
      int var17 = "½D´Ä£¿9\u0088ò\u0082h:ã0ÞòQµ\u0014\u001bZ%¥PGwµ\u001aß\u0096Xñ*èý{Ac8/\u0010Ì\u0084¤°ß³é¢\u0019DÃ¡»ñç\u0007\u0010wFV¢\u0090vvÑÝ\u0018g\u0016WÊTÈ\u0088\u0087\u0095/Í\u0005«æZx\u0099ÇWÇHëL®DÕë\u0002\u0015%Ô\n(\u0016TÜÂã\u00adªuÓÜ\u009f\u0093<$\u0085ÖG\u0013+êº%ªïE¿\u0019\b\u0001$\u001c\u001aßy¼ÜÙ!*ìÞÙ,\u001b\ríS\u0000'a_2É\u009eF»\u0095o!\u0088r¸Es\u0018m\u0090\u0082¤cYIK\u0018<4Ý\u001a¢\u0095©¨à ù#ámü\u001aÜ\u0007ËÏô\f!åY^µ¦\u0012ò¦\u0097ÕøtÁ(\u0090\u0093\u00ad\u0005µ5\u009f@~\u001e¤¼\u0095Ü0©lbô¼Ñ_¨kJò»HYIçh·z\u0092àõf\u0092\u0000\u0010½éÔ\u009e\u0019îÆÈ[?\u007f\b#GÉª\u0010? P6\u0093r\u0091\u0099sK?*\u001ehôû\u0080\u0091\t\u0093÷Z¸\u0088@\u0014{qÝé:Ñ¯\u008e\u0090|ß?|\u00020k\u0010Æ\u008bk£¤â+»\u0087W_\u009c`ÃO×ýi\u008b\u00041ù\u008cüþâå=á\u0015\u0007\u009dmÙ\u0018±¼üA¬x?\u0010ÈÎ`î·Pd¬ÁnÁ\u009cÍ,\u001az\u0097½%S0éòÅ8\u001d\u0019¦\u0092_SÅ\u0007\u009b-\u0001\u0007\u0096s²0½âK\u0096xÝTÇ\u0003Z\u0082H\u008d\u001erNKÜ\u0018 ò>ü]·FÖZÉF\u009e!m.Ëhç£kø\u0081\u0099\u0003 vT\u0096\u0093\u0082qK\u00ad\u00ad\u008f\u0080\u0002\u0085\u0093rn%Î ¾\u009f×\u0012]}¾Âp±9\u008e( å×®u2Î\u0011[ò`Ëàô5\u008f\u0015\u008bÛËÉ.p¶XK \u0094\u0083\t¤7±(Ã»å_öã\u009dÂ\u0092(/·\u001a\u0016\u000exÝ\u009e[ð\u000fiëæM\u0018RbÏ¥¢(>õþ&³âç¾\u0010<\u0003y\u0088¾\u0016\u0094\u00966¾QH×\u0083\u0000ú".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var30;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[15];
                  n = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "Ædiî\u0098Ò\u0090ËT¦\u007fëló\u0085Ù4³¶7Æë¹É";
                  int var5 = "Ædiî\u0098Ò\u0090ËT¦\u007fëló\u0085Ù4³¶7Æë¹É".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var27[var28] = var35;
                           if (var2 >= var5) {
                              j = var6;
                              m = new Integer[5];
                              B = new r4(var22);
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "S{ðH\u0086~vñÆ|\u0096Õ\n§\u000fª";
                           var5 = "S{ðH\u0086~vñÆ|\u0096Õ\n§\u000fª".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var30;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = ",\u0013çÄ4YJ®\u0086\u0014Ù_tÉ\t~$8\u0089\u001c\\ÕAF\u0010Ém\u0090\u0015t~r\u001b\u0012BTx_\tl\u0086";
               var17 = ",\u0013çÄ4YJ®\u0086\u0014Ù_tÉ\t~$8\u0089\u001c\\ÕAF\u0010Ém\u0090\u0015t~r\u001b\u0012BTx_\tl\u0086".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31528;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/r4", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/r4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28642;
      if (m[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/r4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/r4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
