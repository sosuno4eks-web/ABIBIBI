package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_3532;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ek {
   @NotNull
   public static final ek k;
   @NotNull
   private static final Set G;
   private static final long a = j0.a(1269064735213104929L, 4692659957260635870L, MethodHandles.lookup().lookupClass()).a(236574847562039L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private ek() {
   }

   @NotNull
   public final Set z() {
      return G;
   }

   @Nullable
   public final class_1297 s(long a, @Nullable class_1297 currentTraget) {
      // $FF: Couldn't be decompiled
   }

   private final class_1297 u(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean N(class_1297 param1, int param2, int param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   private final boolean y(class_1297 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private final boolean r(class_1297 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private final boolean q(class_1297 var1, long var2) {
      var2 ^= a;
      long var4 = var2 ^ 27007709809853L;
      long var6 = var2 ^ 60460972374480L;
      long var10001 = var2 ^ 72621945563474L;
      int var8 = (int)((var2 ^ 72621945563474L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      long var11 = var2 ^ 23614438773756L;
      int[] var13 = 3755996961533480221L.A<invokedynamic>(3755996961533480221L, var2);

      int var10000;
      label32: {
         try {
            float var15;
            var10000 = (var15 = i4.v.y(od.B.hI((char)var8, (short)var9, var10).k().V(var6, var1), var4) - this.T(var11)) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
            if (var13 == null) {
               return (boolean)var10000;
            }

            if (var10000 <= 0) {
               break label32;
            }
         } catch (NoWhenBranchMatchedException var14) {
            throw var14.A<invokedynamic>(var14, 3814103667067431481L, var2);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   private final float d(class_1309 var1, long var2) {
      var2 ^= a;
      long var4 = var2 ^ 114457041627250L;
      return (float)Math.abs(class_3532.method_15338(Math.toDegrees(Math.atan2(var1.method_23321() - s8.f(var4).method_23321(), var1.method_23317() - s8.f(var4).method_23317())) - 90.0D) - (double)class_3532.method_15393(s8.f(var4).method_36454()));
   }

   private final float T(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void j(long a, @NotNull Function0 action) {
      // $FF: Couldn't be decompiled
   }

   private final void u(class_1657 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private final void e(class_1657 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private final boolean a(long param1, class_1657 param3) {
      // $FF: Couldn't be decompiled
   }

   public final boolean b(long a, @NotNull class_1657 player) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 24965156453704L;
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[7];
      int var16 = 0;
      String var15 = "\u0015Mâ\u001d\u0095¯¿0y\u009e\u0015N\u001a{>Ü \u0099\u0082î\u0080Â\u000fKÑ^¡ÀÕ\bî@Ü\u0002ú\u008fÙ&\u0099¬\b³\u0085LÏ;8³«\u0010W\u0089D#ËÏ\"\u0089\u0094Á¼ãðEGì \b\u0091Ý úGì½ø¹\u0014®`*\u00884\u000e([\u000bÑ¤ëA§\nGÁ\u0085ÁÚlx\u0003¸¢\u001dìVÚCêA\u001eM\u008fÊ=\\»!r\u0087Ï\u001dJçÙbêo:57L\u0082ÛãÐ\u0092×F¦\u0004Ò~S\u0096\u0088âD)_ì`FÜà]^Å×NZÓPM\u001c\u008f\u0014\u001b\u0003 £\u008f} \f\u001d\rOÊ(\fÑß\u0098)\u001fFlÖ\u008fôÞð:Ã¿sÆëlÜ8.a7\u000e\u0088Ü×øÝ£Õ\u008b\nÝ´\u0080\u001f\u008c";
      int var17 = "\u0015Mâ\u001d\u0095¯¿0y\u009e\u0015N\u001a{>Ü \u0099\u0082î\u0080Â\u000fKÑ^¡ÀÕ\bî@Ü\u0002ú\u008fÙ&\u0099¬\b³\u0085LÏ;8³«\u0010W\u0089D#ËÏ\"\u0089\u0094Á¼ãðEGì \b\u0091Ý úGì½ø¹\u0014®`*\u00884\u000e([\u000bÑ¤ëA§\nGÁ\u0085ÁÚlx\u0003¸¢\u001dìVÚCêA\u001eM\u008fÊ=\\»!r\u0087Ï\u001dJçÙbêo:57L\u0082ÛãÐ\u0092×F¦\u0004Ò~S\u0096\u0088âD)_ì`FÜà]^Å×NZÓPM\u001c\u008f\u0014\u001b\u0003 £\u008f} \f\u001d\rOÊ(\fÑß\u0098)\u001fFlÖ\u008fôÞð:Ã¿sÆëlÜ8.a7\u000e\u0088Ü×øÝ£Õ\u008b\nÝ´\u0080\u001f\u008c".length();
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
                  c = new String[7];
                  g = new HashMap(13);
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
                  String var4 = "\u0090êß³ÔL«g\u0086ë*\u009f-ÜúRFÿ~0>â_³";
                  int var5 = "\u0090êß³ÔL«g\u0086ë*\u009f-ÜúRFÿ~0>â_³".length();
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
                              e = var6;
                              f = new Integer[5];
                              k = new ek();
                              class_1792[] var22 = new class_1792[true.b<invokedynamic>(21839, 8634575326630249127L ^ var20)];
                              var22[0] = class_1802.field_8370;
                              var22[1] = class_1802.field_8570;
                              var22[2] = class_1802.field_8577;
                              var22[3] = class_1802.field_8267;
                              var22[4] = class_1802.field_8660;
                              var22[5] = class_1802.field_8396;
                              var22[true.b<invokedynamic>(18447, 6837925437823950821L ^ var20)] = class_1802.field_8523;
                              var22[true.b<invokedynamic>(6824, 4944158832431746371L ^ var20)] = class_1802.field_8743;
                              G = SetsKt.setOf(var22);
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "Ýý°ð=\u008d\u007fhetÅ@¢\u0001Us";
                           var5 = "Ýý°ð=\u008d\u007fhetÅ@¢\u0001Us".length();
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

               var15 = "\u0093o\u0080Ú½\u0080£\u0005R)\u0083\u0087/sHì\u0019]û\u0081ø\u0003\u0002¹Z\u0093Q.\u000bvt³\u0099\u008bøèÉÉ÷Ï\u0010O\u0007±qQF\u008aq\u008fîõp&\u001d½JÚ9h\u0086\u0088\u001e\u001e$©\u001f\u008eTÅUé\u000b@\n\u0016uí\u0005\u008dô\u009f\u0085¡]Z\u008a|\\Ùw¹ï\u0001ûô_q\u008fíU©\u0018GMa\u0007£Pì\u009dÌ(©ÝxS}\u0016¡D$ã\u0011IÊ\u0097\u0095\u009eÝê\\±øp«\u000fy$Ã\u0018\u001a\u0094mnu\u000f·V\n>&º";
               var17 = "\u0093o\u0080Ú½\u0080£\u0005R)\u0083\u0087/sHì\u0019]û\u0081ø\u0003\u0002¹Z\u0093Q.\u000bvt³\u0099\u008bøèÉÉ÷Ï\u0010O\u0007±qQF\u008aq\u008fîõp&\u001d½JÚ9h\u0086\u0088\u001e\u001e$©\u001f\u008eTÅUé\u000b@\n\u0016uí\u0005\u008dô\u009f\u0085¡]Z\u008a|\\Ùw¹ï\u0001ûô_q\u008fíU©\u0018GMa\u0007£Pì\u009dÌ(©ÝxS}\u0016¡D$ã\u0011IÊ\u0097\u0095\u009eÝê\\±øp«\u000fy$Ã\u0018\u001a\u0094mnu\u000f·V\n>&º".length();
               var14 = 'p';
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4475;
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
            throw new RuntimeException("su/catlean/ek", var10);
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
         throw new RuntimeException("su/catlean/ek" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23887;
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
            throw new RuntimeException("su/catlean/ek", var14);
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
         throw new RuntimeException("su/catlean/ek" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
